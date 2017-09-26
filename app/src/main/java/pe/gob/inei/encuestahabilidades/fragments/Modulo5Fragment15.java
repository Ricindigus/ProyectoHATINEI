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
import pe.gob.inei.encuestahabilidades.adapters.Mod5P19Adapter;
import pe.gob.inei.encuestahabilidades.modelo.Data;
import pe.gob.inei.encuestahabilidades.modelo.SQLConstantes;
import pe.gob.inei.encuestahabilidades.pojos.BaseDatos;
import pe.gob.inei.encuestahabilidades.pojos.ItemMod5P14P15;
import pe.gob.inei.encuestahabilidades.pojos.ItemMod5P19;
import pe.gob.inei.encuestahabilidades.pojos.Modulo5Dinamico;

/**
 * A simple {@link Fragment} subclass.
 */
public class Modulo5Fragment15 extends Fragment {

    private RecyclerView recyclerView;
    private LinearLayoutManager linearLayoutManager;
    private Mod5P19Adapter mod5P19Adapter;
    private ArrayList<ItemMod5P19> arrayP19;
    private String idempresa;
    private ArrayList<Modulo5Dinamico> modulo5Dinamicos;
    private Context context;
    private Data data;

    public Modulo5Fragment15() {
        // Required empty public constructor
    }

    @SuppressLint("ValidFragment")
    public Modulo5Fragment15(String idempresa, Context context) {
        this.idempresa = idempresa;
        this.context = context;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_modulo5_fragment15, container, false);
        recyclerView = (RecyclerView) rootView.findViewById(R.id.mod5_p19_recycler);
        return rootView;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        linearLayoutManager = new LinearLayoutManager(getActivity().getApplicationContext());
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        cargarDatos();
        mod5P19Adapter = new Mod5P19Adapter(arrayP19, getActivity().getApplicationContext(),
                new Mod5P19Adapter.OnItemSelectedListener(){
                    @Override
                    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l, int pos, int idBD) {
                        arrayP19.get(pos).setSpOpcion(i);
                        mod5P19Adapter.notifyDataSetChanged();
                    }
                });
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(mod5P19Adapter);
    }

    private void cargarDatos() {
        arrayP19 = new ArrayList<ItemMod5P19>();
        data = new Data(context);
        data.open();
        if(data.existeModulo5Dinamico(idempresa)){
            modulo5Dinamicos = data.getModulo5Dinamico(idempresa);
            for(Modulo5Dinamico modulo5Dinamico : modulo5Dinamicos){
                if(modulo5Dinamico.getC5_P12().equals("0")){
                    int seleccion = 0;
                    if(!modulo5Dinamico.getC5_P19().equals("")) seleccion = Integer.parseInt(modulo5Dinamico.getC5_P19());
                    ItemMod5P19 itemMod5P19= new ItemMod5P19(
                            modulo5Dinamico.getIDOCUPACION(),
                            modulo5Dinamico.getC5_P9_2_1(),
                            seleccion,1
                    );
                    arrayP19.add(itemMod5P19);
                }
            }
        }
        data.close();
    }
    public void guardarDatos() {
        data = new Data(context);
        data.open();
        for (ItemMod5P19 itemMod5P19 : arrayP19){
            ContentValues contentValues = new ContentValues(1);
            contentValues.put(SQLConstantes.MODULO5_P19,itemMod5P19.getSpOpcion()+"");
            data.actualizarModulo5Dinamico(itemMod5P19.getId(),contentValues);
        }
        data.close();
    }
    public boolean validar(){
        //revisarcampos
        boolean correcto = true;
        int c = 0;
        while(correcto && c < arrayP19.size()){
            if(arrayP19.get(c).getSpOpcion() == 0) correcto = false;
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
