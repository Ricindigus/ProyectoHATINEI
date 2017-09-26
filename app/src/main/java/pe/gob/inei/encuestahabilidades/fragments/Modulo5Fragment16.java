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
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import pe.gob.inei.encuestahabilidades.NumericKeyBoardTransformationMethod;
import pe.gob.inei.encuestahabilidades.R;
import pe.gob.inei.encuestahabilidades.adapters.Mod5P13P20Adapter;
import pe.gob.inei.encuestahabilidades.modelo.Data;
import pe.gob.inei.encuestahabilidades.modelo.SQLConstantes;
import pe.gob.inei.encuestahabilidades.pojos.BaseDatos;
import pe.gob.inei.encuestahabilidades.pojos.ItemMod5P13P20;
import pe.gob.inei.encuestahabilidades.pojos.Modulo5Dinamico;

/**
 * A simple {@link Fragment} subclass.
 */
public class Modulo5Fragment16 extends Fragment {

    private RecyclerView recyclerView;
    private LinearLayoutManager linearLayoutManager;
    private Mod5P13P20Adapter mod5P13P20Adapter;
    private ArrayList<ItemMod5P13P20> arrayP20;
    private String idempresa;
    private ArrayList<Modulo5Dinamico> modulo5Dinamicos;
    private Context context;
    private Data data;

    public Modulo5Fragment16() {
        // Required empty public constructor
    }

    @SuppressLint("ValidFragment")
    public Modulo5Fragment16(String idempresa, Context context) {
        this.idempresa = idempresa;
        this.context = context;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_modulo5_fragment16, container, false);
        recyclerView = (RecyclerView) rootView.findViewById(R.id.mod5_p20_recycler);
        return rootView;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        linearLayoutManager = new LinearLayoutManager(getActivity().getApplicationContext());
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        cargarDatos();
        mod5P13P20Adapter = new Mod5P13P20Adapter(arrayP20, getActivity().getApplicationContext(),
                new Mod5P13P20Adapter.OnItemClickListener() {
                    @Override
                    public void onItemClick(View view, final int position, final int posBD) {
                        AlertDialog.Builder alert = new AlertDialog.Builder(getActivity());
                        final View dialogView = getActivity().getLayoutInflater().inflate(R.layout.dialog_mod5_p13p20, null);
                        TextView textView = (TextView)dialogView.findViewById(R.id.dialog_mod5p13p20_txtNumeroVacantes);
                        final LinearLayout lytDialog = (LinearLayout) dialogView.findViewById(R.id.dialog_mod5p13p20_lyt);
                        final EditText edt1 = (EditText) dialogView.findViewById(R.id.dialog_mod5p13p20_edt1);

                        textView.setVisibility(View.GONE);
                        edt1.setTransformationMethod(new NumericKeyBoardTransformationMethod());
                        edt1.setFilters(new InputFilter[]{new InputFilter.LengthFilter(2)});
                        alert.setTitle("Años mínimos de experiencia");
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
                                        if(!edt1.getText().toString().equals("")){
                                            arrayP20.get(position).setCantidad(edt1.getText().toString());
                                            alertDialog.dismiss();
                                            mod5P13P20Adapter.notifyDataSetChanged();
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
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(mod5P13P20Adapter);
    }
    private void cargarDatos() {
        arrayP20 = new ArrayList<ItemMod5P13P20>();
        data = new Data(context);
        data.open();
        if(data.existeModulo5Dinamico(idempresa)){
            modulo5Dinamicos = data.getModulo5Dinamico(idempresa);
            for(Modulo5Dinamico modulo5Dinamico : modulo5Dinamicos){
                if(modulo5Dinamico.getC5_P12().equals("0")){
                    ItemMod5P13P20 itemMod5P13P20 = new ItemMod5P13P20(
                            modulo5Dinamico.getIDOCUPACION(),
                            modulo5Dinamico.getC5_P9_2_1(),
                            0,
                            modulo5Dinamico.getC5_P20(),1
                    );
                    arrayP20.add(itemMod5P13P20);
                }
            }
        }
        data.close();
    }
    public boolean validar(){
        //revisarcampos
        boolean correcto = true;
        int c = 0;
        while(correcto && c < arrayP20.size()){
            if(arrayP20.get(c).getCantidad().equals("")) correcto = false;
            c++;
        }
        if(!correcto) mostrarMensaje("DEBE LLENAR TODOS LOS DATOS");
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
        for (ItemMod5P13P20 itemMod5P13P20 : arrayP20){
            ContentValues contentValues = new ContentValues(1);
            contentValues.put(SQLConstantes.MODULO5_P20,itemMod5P13P20.getCantidad()+"");
            data.actualizarModulo5Dinamico(itemMod5P13P20.getId(),contentValues);
        }
        data.close();
    }
}
