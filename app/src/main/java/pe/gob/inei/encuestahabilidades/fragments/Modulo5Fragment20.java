package pe.gob.inei.encuestahabilidades.fragments;


import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Color;
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
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;

import java.util.ArrayList;

import pe.gob.inei.encuestahabilidades.R;
import pe.gob.inei.encuestahabilidades.TablaFragmentos;
import pe.gob.inei.encuestahabilidades.adapters.Mod5P24Adapter;
import pe.gob.inei.encuestahabilidades.modelo.Data;
import pe.gob.inei.encuestahabilidades.modelo.SQLConstantes;
import pe.gob.inei.encuestahabilidades.pojos.BaseDatos;
import pe.gob.inei.encuestahabilidades.pojos.ItemMod5P23;
import pe.gob.inei.encuestahabilidades.pojos.ItemMod5P24;
import pe.gob.inei.encuestahabilidades.pojos.Modulo5Dinamico;

/**
 * A simple {@link Fragment} subclass.
 */
public class Modulo5Fragment20 extends Fragment {


    private RecyclerView recyclerView;
    private LinearLayoutManager linearLayoutManager;
    private Mod5P24Adapter mod5P24Adapter;
    private ArrayList<ItemMod5P24> arrayP24;
    private String idempresa;
    private ArrayList<Modulo5Dinamico> modulo5Dinamicos;
    private Context context;
    private Data data;

    public Modulo5Fragment20() {
        // Required empty public constructor
    }

    @SuppressLint("ValidFragment")
    public Modulo5Fragment20(String idempresa, Context context) {
        this.idempresa = idempresa;
        this.context = context;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_modulo5_fragment20, container, false);
        recyclerView = (RecyclerView) rootView.findViewById(R.id.mod5_p24_recycler);
        return rootView;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        linearLayoutManager = new LinearLayoutManager(getActivity().getApplicationContext());
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        cargarDatos();
        mod5P24Adapter = new Mod5P24Adapter(arrayP24, getActivity().getApplicationContext(),
                new Mod5P24Adapter.OnItemClickListener() {
                    @Override
                    public void onItemClick(View view, final int position, final int idBD) {
                        AlertDialog.Builder alert = new AlertDialog.Builder(getActivity());
                        final View dialogView = getActivity().getLayoutInflater().inflate(R.layout.dialog_mod5_p24, null);
                        final LinearLayout lytDialog = (LinearLayout) dialogView.findViewById(R.id.dialog_mod5_p24_lyt);
                        final CheckBox ck1 = (CheckBox) dialogView.findViewById(R.id.dialog_mod5_p24_ck1);
                        final CheckBox ck2 = (CheckBox) dialogView.findViewById(R.id.dialog_mod5_p24_ck2);
                        final CheckBox ck3 = (CheckBox) dialogView.findViewById(R.id.dialog_mod5_p24_ck3);
                        final CheckBox ck4 = (CheckBox) dialogView.findViewById(R.id.dialog_mod5_p24_ck4);
                        final CheckBox ck5 = (CheckBox) dialogView.findViewById(R.id.dialog_mod5_p24_ck5);
                        final CheckBox ck6 = (CheckBox) dialogView.findViewById(R.id.dialog_mod5_p24_ck6);
                        final CheckBox ck7 = (CheckBox) dialogView.findViewById(R.id.dialog_mod5_p24_ck7);
                        final CheckBox ck8 = (CheckBox) dialogView.findViewById(R.id.dialog_mod5_p24_ck8);
                        final CheckBox ck9 = (CheckBox) dialogView.findViewById(R.id.dialog_mod5_p24_ck9);
                        final CheckBox ck10 = (CheckBox) dialogView.findViewById(R.id.dialog_mod5_p24_ck10);

                        alert.setTitle("MEDIDAS O ACCIONES");
                        alert.setView(dialogView);
                        alert.setPositiveButton("OK",null);
                        alert.setNegativeButton("Cancelar",null);
                        final AlertDialog alertDialog = alert.create();
                        alertDialog.setOnShowListener(new DialogInterface.OnShowListener() {
                            @Override
                            public void onShow(DialogInterface dialogInterface) {
                                final CheckBox[] checkBoxes = {ck1,ck2,ck3,ck4,ck5,ck6,ck7,ck8,ck9,ck10};
                                if(arrayP24.get(position).getCk1Opcion() == 1) ck1.setChecked(true);
                                if(arrayP24.get(position).getCk2Opcion() == 1) ck2.setChecked(true);
                                if(arrayP24.get(position).getCk3Opcion() == 1) ck3.setChecked(true);
                                if(arrayP24.get(position).getCk4Opcion() == 1) ck4.setChecked(true);
                                if(arrayP24.get(position).getCk5Opcion() == 1) ck5.setChecked(true);
                                if(arrayP24.get(position).getCk6Opcion() == 1) ck6.setChecked(true);
                                if(arrayP24.get(position).getCk7Opcion() == 1) ck7.setChecked(true);
                                if(arrayP24.get(position).getCk8Opcion() == 1) ck8.setChecked(true);
                                if(arrayP24.get(position).getCk9Opcion() == 1) ck9.setChecked(true);
                                if(arrayP24.get(position).getCk10Opcion() == 1) {
                                    ck10.setChecked(true);
                                    for (int i = 0; i <checkBoxes.length-1 ; i++) {
                                        checkBoxes[i].setChecked(false);
                                        checkBoxes[i].setTextColor(Color.LTGRAY);
                                        checkBoxes[i].setEnabled(false);
                                    }
                                }
                                ck10.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                    @Override
                                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                                        if (b){
                                            for (int i = 0; i <checkBoxes.length-1 ; i++) {
                                                checkBoxes[i].setChecked(false);
                                                checkBoxes[i].setTextColor(Color.LTGRAY);
                                                checkBoxes[i].setEnabled(false);
                                            }
                                        }else{
                                            for (int i = 0; i <checkBoxes.length-1 ; i++) {
                                                checkBoxes[i].setTextColor(Color.BLACK);
                                                checkBoxes[i].setEnabled(true);
                                            }
                                        }
                                    }
                                });
                                Button b = alertDialog.getButton(AlertDialog.BUTTON_POSITIVE);
                                b.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View view) {
                                        // TODO Do something
                                        int checkeado = 0;
                                        int i = 0;
                                        while(i < checkBoxes.length && checkeado != 1){
                                            if(checkBoxes[i].isChecked()) checkeado = 1;
                                            i++;
                                        }

                                        if(checkeado == 1){
                                            for (int j = 0; j < checkBoxes.length; j++) {
                                                int c;
                                                if(checkBoxes[j].isChecked()) c = 1;
                                                else c = 0;
                                                if(j == 0){arrayP24.get(position).setCk1Opcion(c);}
                                                if(j == 1){arrayP24.get(position).setCk2Opcion(c);}
                                                if(j == 2){arrayP24.get(position).setCk3Opcion(c);}
                                                if(j == 3){arrayP24.get(position).setCk4Opcion(c);}
                                                if(j == 4){arrayP24.get(position).setCk5Opcion(c);}
                                                if(j == 5){arrayP24.get(position).setCk6Opcion(c);}
                                                if(j == 6){arrayP24.get(position).setCk7Opcion(c);}
                                                if(j == 7){arrayP24.get(position).setCk8Opcion(c);}
                                                if(j == 8){arrayP24.get(position).setCk9Opcion(c);}
                                                if(j == 9){arrayP24.get(position).setCk10Opcion(c);}
                                            }
                                            arrayP24.get(position).setCheck(checkeado);
                                            mod5P24Adapter.notifyDataSetChanged();
                                            alertDialog.dismiss();
                                        }else{
                                            Toast.makeText(getActivity().getApplicationContext(), "DEBE MARCAR UNA OPCION", Toast.LENGTH_SHORT).show();
                                        }
                                    }
                                });
                            }
                        });
                        alertDialog.show();
                    }
                });
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(mod5P24Adapter);
    }

    private void cargarDatos() {
        arrayP24 = new ArrayList<ItemMod5P24>();
        data = new Data(context);
        data.open();
        if(data.existeModulo5Dinamico(idempresa)){
            modulo5Dinamicos = data.getModulo5Dinamico(idempresa);
            for(Modulo5Dinamico modulo5Dinamico : modulo5Dinamicos){
                if(modulo5Dinamico.getC5_P12().equals("0")) {
                    ItemMod5P24 itemMod5P24 = new ItemMod5P24(
                            modulo5Dinamico.getIDOCUPACION(),
                            modulo5Dinamico.getC5_P9_2_1(),
                            Integer.parseInt(modulo5Dinamico.getC5_P24_1()),
                            Integer.parseInt(modulo5Dinamico.getC5_P24_2()),
                            Integer.parseInt(modulo5Dinamico.getC5_P24_3()),
                            Integer.parseInt(modulo5Dinamico.getC5_P24_4()),
                            Integer.parseInt(modulo5Dinamico.getC5_P24_5()),
                            Integer.parseInt(modulo5Dinamico.getC5_P24_6()),
                            Integer.parseInt(modulo5Dinamico.getC5_P24_7()),
                            Integer.parseInt(modulo5Dinamico.getC5_P24_8()),
                            Integer.parseInt(modulo5Dinamico.getC5_P24_9()),
                            Integer.parseInt(modulo5Dinamico.getC5_P24_10()),
                            1,Integer.parseInt(modulo5Dinamico.getC5_P24_0())
                    );
                    arrayP24.add(itemMod5P24);
                }
            }
        }
        data.close();
    }
    public boolean validar(){
        //revisarcampos
        boolean correcto = true;
        int c = 0;
        while(correcto && c < arrayP24.size()){
            if(arrayP24.get(c).getCheck() == 0) correcto = false;
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
        int suma1 = 0;
        int suma2 = 0;
        data = new Data(context);
        data.open();
        for (ItemMod5P24 itemMod5P24 : arrayP24){
            suma1 = suma1 + itemMod5P24.getCk1Opcion();
            suma2 = suma2 + itemMod5P24.getCk2Opcion();
            ContentValues contentValues = new ContentValues(12);
            contentValues.put(SQLConstantes.MODULO5_P24_0,itemMod5P24.getCheck()+"");
            contentValues.put(SQLConstantes.MODULO5_P24_1,itemMod5P24.getCk1Opcion()+"");
            contentValues.put(SQLConstantes.MODULO5_P24_2,itemMod5P24.getCk2Opcion()+"");
            contentValues.put(SQLConstantes.MODULO5_P24_3,itemMod5P24.getCk3Opcion()+"");
            contentValues.put(SQLConstantes.MODULO5_P24_4,itemMod5P24.getCk4Opcion()+"");
            contentValues.put(SQLConstantes.MODULO5_P24_5,itemMod5P24.getCk5Opcion()+"");
            contentValues.put(SQLConstantes.MODULO5_P24_6,itemMod5P24.getCk6Opcion()+"");
            contentValues.put(SQLConstantes.MODULO5_P24_7,itemMod5P24.getCk7Opcion()+"");
            contentValues.put(SQLConstantes.MODULO5_P24_8,itemMod5P24.getCk8Opcion()+"");
            contentValues.put(SQLConstantes.MODULO5_P24_9,itemMod5P24.getCk9Opcion()+"");
            contentValues.put(SQLConstantes.MODULO5_P24_10,itemMod5P24.getCk10Opcion()+"");
            data.actualizarModulo5Dinamico(itemMod5P24.getId(),contentValues);
            if(itemMod5P24.getCk1Opcion() == 1){
                ContentValues content= new ContentValues(1);
                contentValues.put(SQLConstantes.MODULO5_P25,"");
                data.actualizarModulo5Dinamico(itemMod5P24.getId(),contentValues);
            }
            if(itemMod5P24.getCk2Opcion() == 1){
                ContentValues content= new ContentValues(1);
                contentValues.put(SQLConstantes.MODULO5_P26,"");
                data.actualizarModulo5Dinamico(itemMod5P24.getId(),contentValues);
            }
        }

        ContentValues f = new ContentValues(1);
        if(suma1 == arrayP24.size()){
            f.put(SQLConstantes.FRAGMENT_HABILITADO,"0");
        }else{
            f.put(SQLConstantes.FRAGMENT_HABILITADO,"1");
        }
        data.actualizarFragment(idempresa+ TablaFragmentos.FRAGMENT_M5F21,f);
        f = new ContentValues(1);
        if(suma2 == arrayP24.size()){
            f.put(SQLConstantes.FRAGMENT_HABILITADO,"0");
        }else{
            f.put(SQLConstantes.FRAGMENT_HABILITADO,"1");
        }
        data.actualizarFragment(idempresa+ TablaFragmentos.FRAGMENT_M5F22,f);
        data.close();
    }

}
