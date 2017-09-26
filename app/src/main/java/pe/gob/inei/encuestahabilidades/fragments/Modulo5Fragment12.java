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
import android.widget.RadioGroup;
import android.widget.Toast;

import java.util.ArrayList;

import pe.gob.inei.encuestahabilidades.R;
import pe.gob.inei.encuestahabilidades.adapters.Mod5P12P16P18Adapter;
import pe.gob.inei.encuestahabilidades.modelo.Data;
import pe.gob.inei.encuestahabilidades.modelo.SQLConstantes;
import pe.gob.inei.encuestahabilidades.pojos.BaseDatos;
import pe.gob.inei.encuestahabilidades.pojos.ItemMod5P12P16P18;
import pe.gob.inei.encuestahabilidades.pojos.Modulo5Dinamico;

/**
 * A simple {@link Fragment} subclass.
 */
public class Modulo5Fragment12 extends Fragment {

    private RecyclerView recyclerView;
    private LinearLayoutManager linearLayoutManager;
    private Mod5P12P16P18Adapter mod5P12P16P18Adapter;
    private String idempresa;
    private ArrayList<Modulo5Dinamico> modulo5Dinamicos;
    private Context context;
    private Data data;
    private ArrayList<ItemMod5P12P16P18> arrayP16;

    public Modulo5Fragment12() {
        // Required empty public constructor
    }

    @SuppressLint("ValidFragment")
    public Modulo5Fragment12(String idempresa, Context context) {
        this.idempresa = idempresa;
        this.context = context;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_modulo5_fragment12, container, false);
        recyclerView = (RecyclerView) rootView.findViewById(R.id.mod5_p16_recycler);
        return rootView;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        linearLayoutManager = new LinearLayoutManager(getActivity().getApplicationContext());
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        cargarDatos();
        mod5P12P16P18Adapter = new Mod5P12P16P18Adapter(arrayP16, getActivity().getApplicationContext(), new Mod5P12P16P18Adapter.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId, int position, int idBD) {
                int childPos = group.indexOfChild(group.findViewById(checkedId));
                arrayP16.get(position).setOpcionRg(childPos);
            }
        });
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(mod5P12P16P18Adapter);
    }

    public boolean validar(){
        //revisarcampos
        boolean correcto = true;
        int c = 0;
        while(correcto && c < arrayP16.size()){
            if(arrayP16.get(c).getOpcionRg() == 2) correcto = false;
            c++;
        }
        if(!correcto) mostrarMensaje("DEBE MARCAR PARA TODAS LAS OCUPACIONES");
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
        arrayP16 = new ArrayList<ItemMod5P12P16P18>();
        data = new Data(context);
        data.open();
        if(data.existeModulo5Dinamico(idempresa)){
            modulo5Dinamicos = data.getModulo5Dinamico(idempresa);
            for(Modulo5Dinamico modulo5Dinamico : modulo5Dinamicos){
                if(modulo5Dinamico.getC5_P12().equals("0")) {
                    int checkear = 2;
                    if(!modulo5Dinamico.getC5_P16().equals("")) checkear = Integer.parseInt(modulo5Dinamico.getC5_P16());
                    ItemMod5P12P16P18 itemMod5P12P16P18 = new ItemMod5P12P16P18(
                            modulo5Dinamico.getIDOCUPACION(),
                            modulo5Dinamico.getC5_P9_2_1(),
                            checkear,1
                    );
                    arrayP16.add(itemMod5P12P16P18);
                }
            }
        }
        data.close();
    }
    public void guardarDatos() {
        data = new Data(context);
        data.open();
        for (ItemMod5P12P16P18 itemMod5P12P16P18 : arrayP16){
            ContentValues contentValues = new ContentValues(1);
            contentValues.put(SQLConstantes.MODULO5_P16,itemMod5P12P16P18.getOpcionRg()+"");
            data.actualizarModulo5Dinamico(itemMod5P12P16P18.getId(),contentValues);
        }
        data.close();
    }
}
