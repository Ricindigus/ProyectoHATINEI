package pe.gob.inei.encuestahabilidades.fragments;


import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
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
import pe.gob.inei.encuestahabilidades.adapters.OcupacionMod5P9Adapter;
import pe.gob.inei.encuestahabilidades.modelo.Data;
import pe.gob.inei.encuestahabilidades.modelo.SQLConstantes;
import pe.gob.inei.encuestahabilidades.pojos.BaseDatos;
import pe.gob.inei.encuestahabilidades.pojos.ItemMod5P10P11;
import pe.gob.inei.encuestahabilidades.pojos.ItemMod5P12P16P18;
import pe.gob.inei.encuestahabilidades.pojos.ItemMod5P13P20;
import pe.gob.inei.encuestahabilidades.pojos.ItemMod5P14P15;
import pe.gob.inei.encuestahabilidades.pojos.ItemMod5P17;
import pe.gob.inei.encuestahabilidades.pojos.ItemMod5P19;
import pe.gob.inei.encuestahabilidades.pojos.ItemMod5P21;
import pe.gob.inei.encuestahabilidades.pojos.ItemMod5P22;
import pe.gob.inei.encuestahabilidades.pojos.ItemMod5P23;
import pe.gob.inei.encuestahabilidades.pojos.ItemMod5P24;
import pe.gob.inei.encuestahabilidades.pojos.ItemMod5P25P26;
import pe.gob.inei.encuestahabilidades.pojos.Modulo5;
import pe.gob.inei.encuestahabilidades.pojos.Modulo5Dinamico;
import pe.gob.inei.encuestahabilidades.pojos.OcupacionMod5P9;

/**
 * A simple {@link Fragment} subclass.
 */
public class Modulo5Fragment5 extends Fragment {


    private ArrayList<OcupacionMod5P9> ocupacionMod5P9s;
    private RecyclerView recyclerView;
    private FloatingActionButton fab;
    private TextView txtVacantes;
    private LinearLayoutManager linearLayoutManager;
    private OcupacionMod5P9Adapter ocupacionMod5P9Adapter;
    private int vacantesDisponibles;

    private String idempresa;
    private ArrayList<Modulo5Dinamico> modulo5Dinamicos;
    private Context context;
    private Data data;

    public Modulo5Fragment5() {
        // Required empty public constructor
    }

    @SuppressLint("ValidFragment")
    public Modulo5Fragment5(String idempresa, Context context) {
        this.idempresa = idempresa;
        this.context = context;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_modulo5_fragment5, container, false);
        recyclerView = (RecyclerView) rootView.findViewById(R.id.mod5_p9_recycler);
        fab = (FloatingActionButton) rootView.findViewById(R.id.mod5_p9_fab);
        txtVacantes = (TextView) rootView.findViewById(R.id.mod5_p9_txtVacantesAnteriores);
        return rootView;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        cargarDatos();
        linearLayoutManager = new LinearLayoutManager(getActivity().getApplicationContext());
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(linearLayoutManager);

        ocupacionMod5P9Adapter = new OcupacionMod5P9Adapter(ocupacionMod5P9s,getActivity().getApplicationContext(),getActivity());
        recyclerView.setAdapter(ocupacionMod5P9Adapter);

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder alert = new AlertDialog.Builder(getActivity());
                final View dialogView = getActivity().getLayoutInflater().inflate(R.layout.dialog_ocupacion, null);
                final LinearLayout lytDialog = (LinearLayout) dialogView.findViewById(R.id.dialog_lyt);
                final AutoCompleteTextView autOcupacion = (AutoCompleteTextView) dialogView.findViewById(R.id.dialog_auto);
                final TextView txtSelecccion = (TextView) dialogView.findViewById(R.id.dialog_txt);
                final EditText edtEspecifica = (EditText) dialogView.findViewById(R.id.dialog_edt1);
                final EditText edtCantidad = (EditText) dialogView.findViewById(R.id.dialog_edt2);

                final String[] ocupaciones = getResources().getStringArray(R.array.ocupaciones);
                ArrayAdapter adapter = new ArrayAdapter(getActivity().getApplicationContext(),R.layout.lista_item,R.id.item,ocupaciones);
                autOcupacion.setAdapter(adapter);
                autOcupacion.setOnKeyListener(new View.OnKeyListener() {
                    @Override
                    public boolean onKey(View view, int keyCode, KeyEvent keyEvent) {
                        if ((keyEvent.getAction() == KeyEvent.ACTION_DOWN) &&
                                (keyCode == KeyEvent.KEYCODE_ENTER)) {
                            ocultarTeclado(autOcupacion);
                            lytDialog.requestFocus();
                            return true;
                        }
                        return false;
                    }
                });
                autOcupacion.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                        txtSelecccion.setText(autOcupacion.getText().toString().toUpperCase());
                        ocultarTeclado(autOcupacion);
                        lytDialog.requestFocus();
                    }
                });

                txtSelecccion.setFilters(new InputFilter[]{new InputFilter.AllCaps()});
                edtEspecifica.setFilters(new InputFilter[]{new InputFilter.AllCaps()});
                edtCantidad.setTransformationMethod(new NumericKeyBoardTransformationMethod());
                edtEspecifica.setFilters(new InputFilter[]{new InputFilter.AllCaps(), new InputFilter.LengthFilter(300)});
                edtCantidad.setFilters(new InputFilter[]{new InputFilter.LengthFilter(4)});
                alert.setTitle("Agregar Ocupación");
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
                                if(!txtSelecccion.getText().toString().equals("") && !edtEspecifica.getText().toString().equals("")
                                        && !edtCantidad.getText().toString().equals("") && !edtCantidad.getText().toString().equals("0")){
                                    OcupacionMod5P9 ocupacionMod5P9 = new OcupacionMod5P9();
                                    ocupacionMod5P9s.add(new OcupacionMod5P9(
                                            String.valueOf(extraerCodigo(txtSelecccion.getText().toString())),
                                            txtSelecccion.getText().toString(),
                                            edtEspecifica.getText().toString(),
                                            Integer.parseInt(edtCantidad.getText().toString())));
                                    ocupacionMod5P9Adapter.notifyDataSetChanged();
                                    alertDialog.dismiss();
                                }else{
                                    Toast.makeText(getActivity().getApplicationContext(), "DEBE LLENAR TODOS LOS CAMPOS", Toast.LENGTH_SHORT).show();
                                }
                            }
                        });
                    }
                });
                alertDialog.show();
            }
        });
    }

    private void cargarDatos() {
        ocupacionMod5P9s = new ArrayList<OcupacionMod5P9>();
        data = new Data(context);
        data.open();
        Modulo5 modulo5 = data.getModulo5(idempresa);
        vacantesDisponibles = Integer.parseInt(modulo5.getC5_P8());
        txtVacantes.setText(txtVacantes.getText().toString() + " " + vacantesDisponibles);
        if(data.existeModulo5Dinamico(idempresa)){
            modulo5Dinamicos = data.getModulo5Dinamico(idempresa);
            for(Modulo5Dinamico modulo5Dinamico : modulo5Dinamicos){
                OcupacionMod5P9 ocupacionMod5P9 = new OcupacionMod5P9(
                        modulo5Dinamico.getIDOCUPACION(),
                        modulo5Dinamico.getC5_P9_1_0(),
                        modulo5Dinamico.getC5_P9_1_1(),
                        modulo5Dinamico.getC5_P9_2_1(),
                        Integer.parseInt(modulo5Dinamico.getC5_P9_3_1())
                );
                ocupacionMod5P9s.add(ocupacionMod5P9);
            }
        }
        data.close();
    }

    public void ocultarTeclado(View view){
        InputMethodManager mgr = (InputMethodManager) getActivity().getSystemService(Context.INPUT_METHOD_SERVICE);
        mgr.hideSoftInputFromWindow(view.getWindowToken(), 0);
    }
    public int extraerCodigo(String ocupacion){
        int codigo = 0;
        int indiceI = ocupacion.indexOf("[");
        int indiceF = ocupacion.indexOf("]");
        ocupacion = ocupacion.substring(indiceI + 1, indiceF);
        codigo = Integer.parseInt(ocupacion);
        return codigo;
    }
    public boolean validar(){
        //revisarcampos
        boolean correcto = true;
        int suma = 0;
        for(OcupacionMod5P9 ocupacionMod5P9 : ocupacionMod5P9s){
            suma = suma + ocupacionMod5P9.getCantidadRequerida();
        }
        if(suma != vacantesDisponibles) correcto = false;

        if(!correcto) mostrarMensaje("LA SUMATORIA DE VACANTES NO PUEDE SER DISTINTA A LAS REGISTRADAS EN EL MOD.V PREGUNTA 8");

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

    public void guardarDatos() {
        data = new Data(context);
        data.open();
        if(ocupacionMod5P9Adapter.getEliminados().size() > 0){
            for (Integer integer : ocupacionMod5P9Adapter.getEliminados()){
                data.deleteModulo5Dinamico(integer);
            }
        }

        if(ocupacionMod5P9Adapter.getEditados().size() > 0){
            for (Integer integer : ocupacionMod5P9Adapter.getEditados()){
                ContentValues contentValues = new ContentValues(4);
                contentValues.put(SQLConstantes.MODULO5_P10_1_1,"");
                contentValues.put(SQLConstantes.MODULO5_P10_2_1,"");
                contentValues.put(SQLConstantes.MODULO5_P11_1_1,"");
                contentValues.put(SQLConstantes.MODULO5_P11_2_1,"");
                contentValues.put(SQLConstantes.MODULO5_P13,"");
                data.actualizarModulo5Dinamico(integer,contentValues);
            }
        }


        for (OcupacionMod5P9 ocupacionMod5P9 : ocupacionMod5P9s){
            if(ocupacionMod5P9.getId() >= 1){
                ContentValues contentValues = new ContentValues(5);
                contentValues.put(SQLConstantes.MODULO5_P9_1_0,ocupacionMod5P9.getCodOcupacion());
                contentValues.put(SQLConstantes.MODULO5_P9_1_1,ocupacionMod5P9.getOcupacion());
                contentValues.put(SQLConstantes.MODULO5_P9_2_1,ocupacionMod5P9.getOcupacionEspecifica());
                contentValues.put(SQLConstantes.MODULO5_P9_3_1,ocupacionMod5P9.getCantidadRequerida()+"");
                data.actualizarModulo5Dinamico(ocupacionMod5P9.getId(),contentValues);
            }else{
                Modulo5Dinamico modulo5Dinamico = new Modulo5Dinamico();
                modulo5Dinamico.setIDEMPRESA(idempresa);
                modulo5Dinamico.setC5_P9_1_0(ocupacionMod5P9.getCodOcupacion());
                modulo5Dinamico.setC5_P9_1_1(ocupacionMod5P9.getOcupacion());
                modulo5Dinamico.setC5_P9_2_1(ocupacionMod5P9.getOcupacionEspecifica());
                modulo5Dinamico.setC5_P9_3_1(ocupacionMod5P9.getCantidadRequerida()+"");
                data.insertarModulo5Dinamico(modulo5Dinamico);
            }
        }
        data.close();
    }
}
