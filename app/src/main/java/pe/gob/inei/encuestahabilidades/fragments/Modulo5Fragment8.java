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
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import java.util.ArrayList;

import pe.gob.inei.encuestahabilidades.R;
import pe.gob.inei.encuestahabilidades.TablaFragmentos;
import pe.gob.inei.encuestahabilidades.adapters.Mod5P12P16P18Adapter;
import pe.gob.inei.encuestahabilidades.modelo.Data;
import pe.gob.inei.encuestahabilidades.modelo.SQLConstantes;
import pe.gob.inei.encuestahabilidades.pojos.BaseDatos;
import pe.gob.inei.encuestahabilidades.pojos.ItemMod5P10P11;
import pe.gob.inei.encuestahabilidades.pojos.ItemMod5P12P16P18;
import pe.gob.inei.encuestahabilidades.pojos.Modulo5Dinamico;

/**
 * A simple {@link Fragment} subclass.
 */
public class Modulo5Fragment8 extends Fragment {
    private RecyclerView recycler;
    private LinearLayoutManager linearLayoutManager;
    private Mod5P12P16P18Adapter mod5P12P16P18Adapter;
    private String idempresa;
    private ArrayList<Modulo5Dinamico> modulo5Dinamicos;
    private Context context;
    private Data data;
    private ArrayList<ItemMod5P12P16P18> itemMod5P12P16P18s;

    @SuppressLint("ValidFragment")
    public Modulo5Fragment8(String idempresa, Context context) {
        this.idempresa = idempresa;
        this.context = context;
    }

    public Modulo5Fragment8() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_modulo5_fragment8, container, false);
        recycler = (RecyclerView) rootView.findViewById(R.id.mod5_p12_recycler);
        return rootView;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        linearLayoutManager = new LinearLayoutManager(getActivity().getApplicationContext());
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        cargarDatos();
        mod5P12P16P18Adapter = new Mod5P12P16P18Adapter(itemMod5P12P16P18s, getActivity().getApplicationContext(), new Mod5P12P16P18Adapter.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId, int position, int idBD) {
                int childPos = group.indexOfChild(group.findViewById(checkedId));
                itemMod5P12P16P18s.get(position).setOpcionRg(childPos);
            }
        });
        recycler.setLayoutManager(linearLayoutManager);
        recycler.setAdapter(mod5P12P16P18Adapter);
    }

    public boolean validar(){
        //revisarcampos
        boolean correcto = true;
        int c = 0;
        while(correcto && c < itemMod5P12P16P18s.size()){
            if(itemMod5P12P16P18s.get(c).getOpcionRg() == 2) correcto = false;
            c++;
        }
        if(!correcto) mostrarMensaje("DEBE MARCAR PARA TODAS LAS OCUPACIONES");
        return correcto;
    }
    public void cargarDatos(){
        itemMod5P12P16P18s = new ArrayList<ItemMod5P12P16P18>();
        data = new Data(context);
        data.open();
        if(data.existeModulo5Dinamico(idempresa)){
            modulo5Dinamicos = data.getModulo5Dinamico(idempresa);
            for(Modulo5Dinamico modulo5Dinamico : modulo5Dinamicos){
                int checkear = 2;
                if(!modulo5Dinamico.getC5_P12().equals("")) checkear = Integer.parseInt(modulo5Dinamico.getC5_P12());
                ItemMod5P12P16P18 itemMod5P12P16P18 = new ItemMod5P12P16P18(
                        modulo5Dinamico.getIDOCUPACION(),
                        modulo5Dinamico.getC5_P9_2_1(),
                        checkear,1
                );
                itemMod5P12P16P18s.add(itemMod5P12P16P18);
            }
        }
        data.close();
    }
    public void guardarDatos() {
        data = new Data(context);
        data.open();
        int suma = 0;
        for (ItemMod5P12P16P18 itemMod5P12P16P18 : itemMod5P12P16P18s){
            suma = suma + itemMod5P12P16P18.getOpcionRg();
            ContentValues contentValues = new ContentValues(1);
            contentValues.put(SQLConstantes.MODULO5_P12,itemMod5P12P16P18.getOpcionRg()+"");
            data.actualizarModulo5Dinamico(itemMod5P12P16P18.getId(),contentValues);
        }



        ContentValues f = new ContentValues(1);
        if(suma == itemMod5P12P16P18s.size()){
            f.put(SQLConstantes.FRAGMENT_HABILITADO,"0");
        }else{
            f.put(SQLConstantes.FRAGMENT_HABILITADO,"1");
        }
        data.actualizarFragment(idempresa+ TablaFragmentos.FRAGMENT_M5F9,f);
        data.actualizarFragment(idempresa+ TablaFragmentos.FRAGMENT_M5F10,f);
        data.actualizarFragment(idempresa+ TablaFragmentos.FRAGMENT_M5F11,f);
        data.actualizarFragment(idempresa+ TablaFragmentos.FRAGMENT_M5F12,f);
        data.actualizarFragment(idempresa+ TablaFragmentos.FRAGMENT_M5F13,f);
        data.actualizarFragment(idempresa+ TablaFragmentos.FRAGMENT_M5F14,f);
        data.actualizarFragment(idempresa+ TablaFragmentos.FRAGMENT_M5F15,f);
        data.actualizarFragment(idempresa+ TablaFragmentos.FRAGMENT_M5F16,f);
        data.actualizarFragment(idempresa+ TablaFragmentos.FRAGMENT_M5F17,f);
        data.actualizarFragment(idempresa+ TablaFragmentos.FRAGMENT_M5F18,f);
        data.actualizarFragment(idempresa+ TablaFragmentos.FRAGMENT_M5F19,f);
        data.actualizarFragment(idempresa+ TablaFragmentos.FRAGMENT_M5F20,f);
        data.actualizarFragment(idempresa+ TablaFragmentos.FRAGMENT_M5F21,f);
        data.actualizarFragment(idempresa+ TablaFragmentos.FRAGMENT_M5F22,f);
        data.close();
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
