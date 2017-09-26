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
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Toast;

import java.util.ArrayList;

import pe.gob.inei.encuestahabilidades.R;
import pe.gob.inei.encuestahabilidades.adapters.Mod5P14P15Adapter;
import pe.gob.inei.encuestahabilidades.modelo.Data;
import pe.gob.inei.encuestahabilidades.modelo.SQLConstantes;
import pe.gob.inei.encuestahabilidades.pojos.BaseDatos;
import pe.gob.inei.encuestahabilidades.pojos.ItemMod5P13P20;
import pe.gob.inei.encuestahabilidades.pojos.ItemMod5P14P15;
import pe.gob.inei.encuestahabilidades.pojos.Modulo5Dinamico;

/**
 * A simple {@link Fragment} subclass.
 */
public class Modulo5Fragment10 extends Fragment {
    private RecyclerView recyclerView;
    private LinearLayoutManager linearLayoutManager;
    private Mod5P14P15Adapter mod5P14P15Adapter;
    private ArrayList<ItemMod5P14P15> arrayP14;
    private String idempresa;
    private ArrayList<Modulo5Dinamico> modulo5Dinamicos;
    private Context context;
    private Data data;

    public Modulo5Fragment10() {
        // Required empty public constructor
    }

    @SuppressLint("ValidFragment")
    public Modulo5Fragment10(String idempresa, Context context) {
        this.idempresa = idempresa;
        this.context = context;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_modulo5_fragment10, container, false);
        recyclerView = (RecyclerView) rootView.findViewById(R.id.mod5_p14_recycler);
        return rootView;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        linearLayoutManager = new LinearLayoutManager(getActivity().getApplicationContext());
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        cargarDatos();
        mod5P14P15Adapter = new Mod5P14P15Adapter(arrayP14, getActivity().getApplicationContext(),
                new Mod5P14P15Adapter.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l, int pos, int idBD) {
                        arrayP14.get(pos).setSpOpcion(i);
                        mod5P14P15Adapter.notifyDataSetChanged();
                    }
                });
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(mod5P14P15Adapter);
    }
    private void cargarDatos() {
        arrayP14 = new ArrayList<ItemMod5P14P15>();
        data = new Data(context);
        data.open();
        if(data.existeModulo5Dinamico(idempresa)){
            modulo5Dinamicos = data.getModulo5Dinamico(idempresa);
            for(Modulo5Dinamico modulo5Dinamico : modulo5Dinamicos){
                if(modulo5Dinamico.getC5_P12().equals("0")){
                    int seleccion = 0;
                    if(!modulo5Dinamico.getC5_P14().equals("")) seleccion = Integer.parseInt(modulo5Dinamico.getC5_P14());
                    ItemMod5P14P15 itemMod5P14P15 = new ItemMod5P14P15(
                            modulo5Dinamico.getIDOCUPACION(),
                            modulo5Dinamico.getC5_P9_2_1(),
                            seleccion,1
                    );
                    arrayP14.add(itemMod5P14P15);
                }
            }
        }
        data.close();
    }
    public void guardarDatos() {
        data = new Data(context);
        data.open();
        for (ItemMod5P14P15 itemMod5P14P15 : arrayP14){
            ContentValues contentValues = new ContentValues(1);
            contentValues.put(SQLConstantes.MODULO5_P14,itemMod5P14P15.getSpOpcion()+"");
            data.actualizarModulo5Dinamico(itemMod5P14P15.getId(),contentValues);
        }
        data.close();
    }
    public boolean validar(){
        //revisarcampos
        boolean correcto = true;
        int c = 0;
        while(correcto && c < arrayP14.size()){
            if(arrayP14.get(c).getSpOpcion() == 0) correcto = false;
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
}
