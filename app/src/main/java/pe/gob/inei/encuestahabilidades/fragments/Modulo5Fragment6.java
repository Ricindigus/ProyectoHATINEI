package pe.gob.inei.encuestahabilidades.fragments;


import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AlertDialog;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.InputFilter;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import pe.gob.inei.encuestahabilidades.NumericKeyBoardTransformationMethod;
import pe.gob.inei.encuestahabilidades.R;
import pe.gob.inei.encuestahabilidades.adapters.Mod5P10P11Adapter;
import pe.gob.inei.encuestahabilidades.modelo.Data;
import pe.gob.inei.encuestahabilidades.modelo.SQLConstantes;
import pe.gob.inei.encuestahabilidades.pojos.BaseDatos;
import pe.gob.inei.encuestahabilidades.pojos.ItemMod5P10P11;
import pe.gob.inei.encuestahabilidades.pojos.Modulo5;
import pe.gob.inei.encuestahabilidades.pojos.Modulo5Dinamico;
import pe.gob.inei.encuestahabilidades.pojos.OcupacionMod5P9;

/**
 * A simple {@link Fragment} subclass.
 */
public class Modulo5Fragment6 extends Fragment {

    private RecyclerView recycler;
    private LinearLayoutManager linearLayoutManager;
    private Mod5P10P11Adapter mod5P10P11Adapter;
    private String idempresa;
    private ArrayList<Modulo5Dinamico> modulo5Dinamicos;
    private Context context;
    private Data data;
    private ArrayList<ItemMod5P10P11> itemMod5P10P11s;


    public Modulo5Fragment6() {
        // Required empty public constructor
    }

    @SuppressLint("ValidFragment")
    public Modulo5Fragment6(String idempresa, Context context) {
        this.idempresa = idempresa;
        this.context = context;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_modulo5_fragment6, container, false);
        recycler = (RecyclerView) rootView.findViewById(R.id.mod5_p10_recycler);
        return rootView;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        linearLayoutManager = new LinearLayoutManager(getActivity().getApplicationContext());
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        cargarDatos();
        mod5P10P11Adapter = new Mod5P10P11Adapter(itemMod5P10P11s, getActivity().getApplicationContext(), new Mod5P10P11Adapter.OnItemClickListener() {
            @Override
            public void onItemClick(View view, final int position) {
                AlertDialog.Builder alert = new AlertDialog.Builder(getActivity());
                final View dialogView = getActivity().getLayoutInflater().inflate(R.layout.dialog_mod5_p10p11, null);
                final LinearLayout lytDialog = (LinearLayout) dialogView.findViewById(R.id.dialog_mod5p10p11_lyt);
                final EditText edt1 = (EditText) dialogView.findViewById(R.id.dialog_mod5p10p11_edt1);
                final EditText edt2 = (EditText) dialogView.findViewById(R.id.dialog_mod5p10p11_edt2);
                TextView txtNumeroVacantes = (TextView) dialogView.findViewById(R.id.dialog_mod5p10p11_txtNumeroVacantes);

                String[] ocupaciones = getResources().getStringArray(R.array.ocupaciones);
                ArrayAdapter adapter = new ArrayAdapter(getActivity().getApplicationContext(),R.layout.lista_item,R.id.item,ocupaciones);
                edt1.setTransformationMethod(new NumericKeyBoardTransformationMethod());
                edt2.setTransformationMethod(new NumericKeyBoardTransformationMethod());
                edt1.setFilters(new InputFilter[]{new InputFilter.LengthFilter(4)});
                edt2.setFilters(new InputFilter[]{new InputFilter.LengthFilter(4)});
                txtNumeroVacantes.setText(txtNumeroVacantes.getText().toString() + " " + itemMod5P10P11s.get(position).getCantidadRequerida());
                alert.setTitle("Agregar Datos");
                alert.setView(dialogView);
                alert.setPositiveButton("OK",null);
                alert.setNegativeButton("Cancelar",null);

                final AlertDialog alertDialog = alert.create();

                alertDialog.setOnShowListener(new DialogInterface.OnShowListener() {
                    @Override
                    public void onShow(DialogInterface dialogInterface) {
                        Button b = alertDialog.getButton(AlertDialog.BUTTON_POSITIVE);
                        b.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                // TODO Do something
                                if(!edt1.getText().toString().equals("") && !edt2.getText().toString().equals("")){
                                    int suma = Integer.parseInt(edt1.getText().toString()) + Integer.parseInt(edt2.getText().toString());
                                    if(suma == itemMod5P10P11s.get(position).getCantidadRequerida()){
                                        itemMod5P10P11s.get(position).setCampoNumero1(edt1.getText().toString());
                                        itemMod5P10P11s.get(position).setCampoNumero2(edt2.getText().toString());
                                        mod5P10P11Adapter.notifyDataSetChanged();
                                        alertDialog.dismiss();
                                    }else{Toast.makeText(getActivity().getApplicationContext(),
                                            "LA SUMATORIA DEL TIPO DE CONTRATO NO PUEDE SER DISTINTA AL TOTAL DE VACANTES DE LA OCUPACIÓN",
                                            Toast.LENGTH_SHORT).show();
                                    }
                                }else{
                                    Toast.makeText(getActivity().getApplicationContext(), "DEBE REGISTRAR NUMERO DE CONTRATO FIJO E INDFINIDO PARA LA OCUPACION", Toast.LENGTH_SHORT).show();
                                }
                            }
                        });
                    }
                });
                alertDialog.show();
            }
        });
        recycler.setLayoutManager(linearLayoutManager);
        recycler.setAdapter(mod5P10P11Adapter);

    }

    public void ocultarTeclado(View view){
        InputMethodManager mgr = (InputMethodManager) getActivity().getSystemService(Context.INPUT_METHOD_SERVICE);
        mgr.hideSoftInputFromWindow(view.getWindowToken(), 0);
    }
    public boolean validar(){
        //revisarcampos
        boolean correcto = false;
        String mensaje = "";
        boolean vItem = true, vSuma = true;
        int c = 0;
        while(vItem && c < itemMod5P10P11s.size()){
            if(itemMod5P10P11s.get(c).getCampoNumero1().equals("")){
                vItem = false;
                if(mensaje.equals("")) mensaje = itemMod5P10P11s.get(c).getOcupacion() + ": " + "DEBE REGISTRAR NUMERO DE CONTRATO FIJO E INDFINIDO PARA LA OCUPACION";
            }
            c++;
        }

//        c = 0;
//        while(vSuma && c < itemMod5P10P11s.size()){
//            int suma = 0;
//            suma = Integer.parseInt(itemMod5P10P11s.get(c).getCampoNumero1()) + Integer.parseInt(itemMod5P10P11s.get(c).getCampoNumero2());
//            if(itemMod5P10P11s.get(c).getCantidadRequerida() != suma){
//                vSuma = false;
//                if(mensaje.equals("")) mensaje = itemMod5P10P11s.get(c).getOcupacion()+": " + "LA SUMATORIA DEL TIPO DE CONTRATO NO PUEDE SER DISTINTA AL TOTAL DE VACANTES DE LA OCUPACIÓN";
//            }
//            c++;
//        }

        correcto = vItem && vSuma;

        if(!correcto) mostrarMensaje(mensaje);
        return correcto;
    }
    public void mostrarMensaje(String m){
        final AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setMessage(m);
        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {
                dialog.dismiss();
            }
        });
        final AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }
    public void cargarDatos(){
        itemMod5P10P11s = new ArrayList<ItemMod5P10P11>();
        data = new Data(context);
        data.open();
        if(data.existeModulo5Dinamico(idempresa)){
            modulo5Dinamicos = data.getModulo5Dinamico(idempresa);
            for(Modulo5Dinamico modulo5Dinamico : modulo5Dinamicos){
                ItemMod5P10P11 itemMod5P10P11 = new ItemMod5P10P11(
                        modulo5Dinamico.getIDOCUPACION(),
                        modulo5Dinamico.getC5_P9_2_1(),
                        Integer.parseInt(modulo5Dinamico.getC5_P9_3_1()),
                        modulo5Dinamico.getC5_P10_1_1(),
                        modulo5Dinamico.getC5_P10_2_1()
                );
                itemMod5P10P11s.add(itemMod5P10P11);
            }
        }
        data.close();
    }
    public void guardarDatos() {
        data = new Data(context);
        data.open();
        for (ItemMod5P10P11 itemMod5P10P11 : itemMod5P10P11s){
            ContentValues contentValues = new ContentValues(2);
            contentValues.put(SQLConstantes.MODULO5_P10_1_1,itemMod5P10P11.getCampoNumero1());
            contentValues.put(SQLConstantes.MODULO5_P10_2_1,itemMod5P10P11.getCampoNumero2());
            data.actualizarModulo5Dinamico(itemMod5P10P11.getId(),contentValues);
        }
        data.close();
    }
}
