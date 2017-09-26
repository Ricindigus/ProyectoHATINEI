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
import android.widget.Toast;

import java.util.ArrayList;

import pe.gob.inei.encuestahabilidades.R;
import pe.gob.inei.encuestahabilidades.adapters.Mod5P25P26Adapter;
import pe.gob.inei.encuestahabilidades.modelo.Data;
import pe.gob.inei.encuestahabilidades.modelo.SQLConstantes;
import pe.gob.inei.encuestahabilidades.pojos.BaseDatos;
import pe.gob.inei.encuestahabilidades.pojos.ItemMod5P13P20;
import pe.gob.inei.encuestahabilidades.pojos.ItemMod5P24;
import pe.gob.inei.encuestahabilidades.pojos.ItemMod5P25P26;
import pe.gob.inei.encuestahabilidades.pojos.Modulo5Dinamico;

/**
 * A simple {@link Fragment} subclass.
 */
public class Modulo5Fragment21 extends Fragment {
    private RecyclerView recyclerView;
    private LinearLayoutManager linearLayoutManager;
    private Mod5P25P26Adapter mod5P25P26Adapter;
    private ArrayList<ItemMod5P25P26> arrayP25;
    private String idempresa;
    private ArrayList<Modulo5Dinamico> modulo5Dinamicos;
    private Context context;
    private Data data;

    public Modulo5Fragment21() {
        // Required empty public constructor
    }

    @SuppressLint("ValidFragment")
    public Modulo5Fragment21(String idempresa, Context context) {
        this.idempresa = idempresa;
        this.context = context;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_modulo5_fragment21, container, false);
        recyclerView = (RecyclerView) rootView.findViewById(R.id.mod5_p25_recycler);
        return rootView;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        linearLayoutManager = new LinearLayoutManager(getActivity().getApplicationContext());
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        cargarDatos();
        mod5P25P26Adapter = new Mod5P25P26Adapter(arrayP25, getActivity().getApplicationContext(),
                new Mod5P25P26Adapter.OnItemClickListener() {
                    @Override
                    public void onItemClick(View view, final int position, int posBD) {
                        AlertDialog.Builder alert = new AlertDialog.Builder(getActivity());
                        final View dialogView = getActivity().getLayoutInflater().inflate(R.layout.dialog_mod5_p25p26, null);
                        final LinearLayout lytDialog = (LinearLayout) dialogView.findViewById(R.id.dialog_mod5p25p26_lyt);
                        final EditText edt1 = (EditText) dialogView.findViewById(R.id.dialog_mod5p25p26_edt1);

                        String[] ocupaciones = getResources().getStringArray(R.array.ocupaciones);
                        ArrayAdapter adapter = new ArrayAdapter(getActivity().getApplicationContext(),R.layout.lista_item,R.id.item,ocupaciones);
                        edt1.setFilters(new InputFilter[]{new InputFilter.AllCaps()});
                        alert.setTitle("Agregar Datos");
                        alert.setView(dialogView);
                        alert.setPositiveButton("OK",null);
                        alert.setNegativeButton("Cancelar",null);

                        final AlertDialog alertDialog = alert.create();

                        alertDialog.setOnShowListener(new DialogInterface.OnShowListener() {
                            @Override
                            public void onShow(DialogInterface dialogInterface) {
                                edt1.setText(arrayP25.get(position).getMotivo());
                                Button b = alertDialog.getButton(AlertDialog.BUTTON_POSITIVE);
                                b.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View view) {
                                        // TODO Do something
                                        if(!edt1.getText().toString().equals("")){
                                            arrayP25.get(position).setMotivo(edt1.getText().toString());
                                            alertDialog.dismiss();
                                            mod5P25P26Adapter.notifyDataSetChanged();
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
        recyclerView.setAdapter(mod5P25P26Adapter);
    }

    private void cargarDatos() {
        arrayP25 = new ArrayList<ItemMod5P25P26>();
        data = new Data(context);
        data.open();
        if(data.existeModulo5Dinamico(idempresa)){
            modulo5Dinamicos = data.getModulo5Dinamico(idempresa);
            for(Modulo5Dinamico modulo5Dinamico : modulo5Dinamicos){
                if(modulo5Dinamico.getC5_P12().equals("0")) {
                    if(modulo5Dinamico.getC5_P24_1().equals("0")){
                        ItemMod5P25P26 itemMod5P25 = new ItemMod5P25P26(
                                modulo5Dinamico.getIDOCUPACION(),
                                modulo5Dinamico.getC5_P9_2_1(),
                                modulo5Dinamico.getC5_P25(),1);
                        arrayP25.add(itemMod5P25);
                    }
                }
            }
        }
        data.close();
    }
    public boolean validar(){
        //revisarcampos
        boolean correcto = true;
        int c = 0;
        while(correcto && c < arrayP25.size()){
            if(arrayP25.get(c).getMotivo().equals("")) correcto = false;
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
    public void guardarDatos() {
        data = new Data(context);
        data.open();
        for (ItemMod5P25P26 itemMod5P25P26 : arrayP25){
            ContentValues contentValues = new ContentValues(1);
            contentValues.put(SQLConstantes.MODULO5_P25,itemMod5P25P26.getMotivo());
            data.actualizarModulo5Dinamico(itemMod5P25P26.getId(),contentValues);
        }
        data.close();
    }
}
