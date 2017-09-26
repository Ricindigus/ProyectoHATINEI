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
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;

import java.util.ArrayList;

import pe.gob.inei.encuestahabilidades.R;
import pe.gob.inei.encuestahabilidades.adapters.Mod5P17Adapter;
import pe.gob.inei.encuestahabilidades.modelo.Data;
import pe.gob.inei.encuestahabilidades.modelo.SQLConstantes;
import pe.gob.inei.encuestahabilidades.pojos.BaseDatos;
import pe.gob.inei.encuestahabilidades.pojos.ItemMod5P12P16P18;
import pe.gob.inei.encuestahabilidades.pojos.ItemMod5P17;
import pe.gob.inei.encuestahabilidades.pojos.Modulo5Dinamico;

/**
 * A simple {@link Fragment} subclass.
 */
public class Modulo5Fragment13 extends Fragment {

    private RecyclerView recyclerView;
    private LinearLayoutManager linearLayoutManager;
    private Mod5P17Adapter mod5P17Adapter;
    private String idempresa;
    private ArrayList<Modulo5Dinamico> modulo5Dinamicos;
    private Context context;
    private Data data;
    private ArrayList<ItemMod5P17> arrayP17;

    public Modulo5Fragment13() {
        // Required empty public constructor
    }

    @SuppressLint("ValidFragment")
    public Modulo5Fragment13(String idempresa, Context context) {
        this.idempresa = idempresa;
        this.context = context;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_modulo5_fragment13, container, false);
        recyclerView = (RecyclerView) rootView.findViewById(R.id.mod5_p17_recycler);
        return rootView;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        linearLayoutManager = new LinearLayoutManager(getActivity().getApplicationContext());
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        cargarDatos();
        mod5P17Adapter = new Mod5P17Adapter(arrayP17, getActivity().getApplicationContext(),
                new Mod5P17Adapter.OnItemClickListener() {
                    @Override
                    public void onItemClick(View view, final int position, final int idBD) {
                        AlertDialog.Builder alert = new AlertDialog.Builder(getActivity());
                        final View dialogView = getActivity().getLayoutInflater().inflate(R.layout.dialog_mod5_p17, null);
                        final LinearLayout lytDialog = (LinearLayout) dialogView.findViewById(R.id.dialog_mod5_p17_lyt);
                        final CheckBox ck1 = (CheckBox) dialogView.findViewById(R.id.dialog_mod5_p17_ck1);
                        final CheckBox ck2 = (CheckBox) dialogView.findViewById(R.id.dialog_mod5_p17_ck2);
                        final CheckBox ck3 = (CheckBox) dialogView.findViewById(R.id.dialog_mod5_p17_ck3);
                        final CheckBox ck4 = (CheckBox) dialogView.findViewById(R.id.dialog_mod5_p17_ck4);
                        final CheckBox ck5 = (CheckBox) dialogView.findViewById(R.id.dialog_mod5_p17_ck5);
                        final CheckBox ck6 = (CheckBox) dialogView.findViewById(R.id.dialog_mod5_p17_ck6);
                        final CheckBox ck7 = (CheckBox) dialogView.findViewById(R.id.dialog_mod5_p17_ck7);
                        final CheckBox ck8 = (CheckBox) dialogView.findViewById(R.id.dialog_mod5_p17_ck8);
                        final CheckBox ck9 = (CheckBox) dialogView.findViewById(R.id.dialog_mod5_p17_ck9);
                        final CheckBox ck10 = (CheckBox) dialogView.findViewById(R.id.dialog_mod5_p17_ck10);
                        final CheckBox ck11 = (CheckBox) dialogView.findViewById(R.id.dialog_mod5_p17_ck11);
                        final CheckBox ck12 = (CheckBox) dialogView.findViewById(R.id.dialog_mod5_p17_ck12);
                        final CheckBox ck13 = (CheckBox) dialogView.findViewById(R.id.dialog_mod5_p17_ck13);
                        final CheckBox ck14 = (CheckBox) dialogView.findViewById(R.id.dialog_mod5_p17_ck14);
                        final CheckBox ck15 = (CheckBox) dialogView.findViewById(R.id.dialog_mod5_p17_ck15);
                        final CheckBox ck16 = (CheckBox) dialogView.findViewById(R.id.dialog_mod5_p17_ck16);
                        final CheckBox ck17 = (CheckBox) dialogView.findViewById(R.id.dialog_mod5_p17_ck17);
                        final CheckBox ck18 = (CheckBox) dialogView.findViewById(R.id.dialog_mod5_p17_ck18);
                        final CheckBox ck19 = (CheckBox) dialogView.findViewById(R.id.dialog_mod5_p17_ck19);
                        final CheckBox ck20 = (CheckBox) dialogView.findViewById(R.id.dialog_mod5_p17_ck20);
                        final EditText edtEspecifique = (EditText)dialogView.findViewById(R.id.dialog_mod5_p17_edtEspecifique);
                        edtEspecifique.setFilters(new InputFilter[]{new InputFilter.AllCaps()});

                        alert.setTitle("Habilidades o cualidades particulares");
                        alert.setView(dialogView);
                        alert.setPositiveButton("OK",null);
                        alert.setNegativeButton("Cancelar",null);
                        final AlertDialog alertDialog = alert.create();
                        alertDialog.setOnShowListener(new DialogInterface.OnShowListener() {
                            @Override
                            public void onShow(DialogInterface dialogInterface) {
                                final CheckBox[] checkBoxes = {ck1,ck2,ck3,ck4,ck5,ck6,ck7,ck8,ck9,ck10,ck11,ck12,ck13,ck14
                                        ,ck15,ck16,ck17,ck18,ck19,ck20};
                                if(arrayP17.get(position).getCk1Opcion() == 1) ck1.setChecked(true);
                                if(arrayP17.get(position).getCk2Opcion() == 1) ck2.setChecked(true);
                                if(arrayP17.get(position).getCk3Opcion() == 1) ck3.setChecked(true);
                                if(arrayP17.get(position).getCk4Opcion() == 1) ck4.setChecked(true);
                                if(arrayP17.get(position).getCk5Opcion() == 1) ck5.setChecked(true);
                                if(arrayP17.get(position).getCk6Opcion() == 1) ck6.setChecked(true);
                                if(arrayP17.get(position).getCk7Opcion() == 1) ck7.setChecked(true);
                                if(arrayP17.get(position).getCk8Opcion() == 1) ck8.setChecked(true);
                                if(arrayP17.get(position).getCk9Opcion() == 1) ck9.setChecked(true);
                                if(arrayP17.get(position).getCk10Opcion() == 1) ck10.setChecked(true);
                                if(arrayP17.get(position).getCk11Opcion() == 1) ck11.setChecked(true);
                                if(arrayP17.get(position).getCk12Opcion() == 1) ck12.setChecked(true);
                                if(arrayP17.get(position).getCk13Opcion() == 1) ck13.setChecked(true);
                                if(arrayP17.get(position).getCk14Opcion() == 1) ck14.setChecked(true);
                                if(arrayP17.get(position).getCk15Opcion() == 1) ck15.setChecked(true);
                                if(arrayP17.get(position).getCk16Opcion() == 1) ck16.setChecked(true);
                                if(arrayP17.get(position).getCk17Opcion() == 1) ck17.setChecked(true);
                                if(arrayP17.get(position).getCk18Opcion() == 1) ck18.setChecked(true);
                                if(arrayP17.get(position).getCk19Opcion() == 1){
                                    ck19.setChecked(true);
                                    edtEspecifique.setEnabled(true);
                                    edtEspecifique.setBackgroundResource(R.drawable.fondo_edit_text);
                                    edtEspecifique.setText(arrayP17.get(position).getEspecifique());
                                }
                                if(arrayP17.get(position).getCk20Opcion() == 1){
                                    ck20.setChecked(true);
                                    for (int i = 0; i <checkBoxes.length-1 ; i++) {
                                        checkBoxes[i].setChecked(false);
                                        checkBoxes[i].setTextColor(Color.LTGRAY);
                                        checkBoxes[i].setEnabled(false);
                                    }
                                }

                                ck19.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                    @Override
                                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                                        if(b){
                                            edtEspecifique.setEnabled(true);
                                            edtEspecifique.setBackgroundResource(R.drawable.fondo_edit_text);
                                            edtEspecifique.requestFocus();
                                        }else{
                                            edtEspecifique.setText("");
                                            edtEspecifique.setBackgroundResource(R.drawable.fondo_edit_text_disabled);
                                            ocultarTeclado(edtEspecifique);
                                            edtEspecifique.setEnabled(false);
                                        }
                                    }
                                });
                                ck20.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
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
                                            if (ck19.isChecked() && edtEspecifique.getText().toString().equals("")){
                                                edtEspecifique.requestFocus();
                                                Toast.makeText(getActivity().getApplicationContext(), "DEBE ESPECIFICAR LA CUALIDAD", Toast.LENGTH_SHORT).show();
                                            }else{
                                                for (int j = 0; j < checkBoxes.length; j++) {
                                                    int c;
                                                    if(checkBoxes[j].isChecked()) c = 1;
                                                    else c = 0;
                                                    if(j == 0){arrayP17.get(position).setCk1Opcion(c);}
                                                    if(j == 1){arrayP17.get(position).setCk2Opcion(c);}
                                                    if(j == 2){arrayP17.get(position).setCk3Opcion(c);}
                                                    if(j == 3){arrayP17.get(position).setCk4Opcion(c);}
                                                    if(j == 4){arrayP17.get(position).setCk5Opcion(c);}
                                                    if(j == 5){arrayP17.get(position).setCk6Opcion(c);}
                                                    if(j == 6){arrayP17.get(position).setCk7Opcion(c);}
                                                    if(j == 7){arrayP17.get(position).setCk8Opcion(c);}
                                                    if(j == 8){arrayP17.get(position).setCk9Opcion(c);}
                                                    if(j == 9){arrayP17.get(position).setCk10Opcion(c);}
                                                    if(j == 10){arrayP17.get(position).setCk11Opcion(c);}
                                                    if(j == 11){arrayP17.get(position).setCk12Opcion(c);}
                                                    if(j == 12){arrayP17.get(position).setCk13Opcion(c);}
                                                    if(j == 13){arrayP17.get(position).setCk14Opcion(c);}
                                                    if(j == 14){arrayP17.get(position).setCk15Opcion(c);}
                                                    if(j == 15){arrayP17.get(position).setCk16Opcion(c);}
                                                    if(j == 16){arrayP17.get(position).setCk17Opcion(c);}
                                                    if(j == 17){arrayP17.get(position).setCk18Opcion(c);}
                                                    if(j == 18){arrayP17.get(position).setCk19Opcion(c);arrayP17.get(position).setEspecifique(edtEspecifique.getText().toString());}
                                                    if(j == 19){arrayP17.get(position).setCk20Opcion(c);}
                                                }
                                                arrayP17.get(position).setCheck(checkeado);
                                                Log.e(position+":",checkeado+"");
                                                mod5P17Adapter.notifyDataSetChanged();
                                                alertDialog.dismiss();
                                            }
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
        recyclerView.setAdapter(mod5P17Adapter);
    }

    private void cargarDatos() {
        arrayP17 = new ArrayList<ItemMod5P17>();
        data = new Data(context);
        data.open();
        if(data.existeModulo5Dinamico(idempresa)){
            modulo5Dinamicos = data.getModulo5Dinamico(idempresa);
            for(Modulo5Dinamico modulo5Dinamico : modulo5Dinamicos){
                if(modulo5Dinamico.getC5_P12().equals("0")) {
                    ItemMod5P17 itemMod5P17 = new ItemMod5P17(
                            modulo5Dinamico.getIDOCUPACION(),
                            modulo5Dinamico.getC5_P9_2_1(),
                            Integer.parseInt(modulo5Dinamico.getC5_P17_1()),
                            Integer.parseInt(modulo5Dinamico.getC5_P17_2()),
                            Integer.parseInt(modulo5Dinamico.getC5_P17_3()),
                            Integer.parseInt(modulo5Dinamico.getC5_P17_4()),
                            Integer.parseInt(modulo5Dinamico.getC5_P17_5()),
                            Integer.parseInt(modulo5Dinamico.getC5_P17_6()),
                            Integer.parseInt(modulo5Dinamico.getC5_P17_7()),
                            Integer.parseInt(modulo5Dinamico.getC5_P17_8()),
                            Integer.parseInt(modulo5Dinamico.getC5_P17_9()),
                            Integer.parseInt(modulo5Dinamico.getC5_P17_10()),
                            Integer.parseInt(modulo5Dinamico.getC5_P17_11()),
                            Integer.parseInt(modulo5Dinamico.getC5_P17_12()),
                            Integer.parseInt(modulo5Dinamico.getC5_P17_13()),
                            Integer.parseInt(modulo5Dinamico.getC5_P17_14()),
                            Integer.parseInt(modulo5Dinamico.getC5_P17_15()),
                            Integer.parseInt(modulo5Dinamico.getC5_P17_16()),
                            Integer.parseInt(modulo5Dinamico.getC5_P17_17()),
                            Integer.parseInt(modulo5Dinamico.getC5_P17_18()),
                            Integer.parseInt(modulo5Dinamico.getC5_P17_19()),
                            Integer.parseInt(modulo5Dinamico.getC5_P17_20()),
                            modulo5Dinamico.getC5_P17_19_0(),
                            1,Integer.parseInt(modulo5Dinamico.getC5_P17_0())
                            );
                    arrayP17.add(itemMod5P17);
                }
            }
        }
        data.close();
    }
    public void ocultarTeclado(View view){
        InputMethodManager mgr = (InputMethodManager) getActivity().getSystemService(Context.INPUT_METHOD_SERVICE);
        mgr.hideSoftInputFromWindow(view.getWindowToken(), 0);
    }
    public boolean validar(){
        //revisarcampos
        boolean correcto = true;
        int c = 0;
        while(correcto && c < arrayP17.size()){
            if(arrayP17.get(c).getCheck() == 0) correcto = false;
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
        for (ItemMod5P17 itemMod5P17 : arrayP17){
            ContentValues contentValues = new ContentValues(22);
            contentValues.put(SQLConstantes.MODULO5_P17_0,itemMod5P17.getCheck()+"");
            contentValues.put(SQLConstantes.MODULO5_P17_1,itemMod5P17.getCk1Opcion()+"");
            contentValues.put(SQLConstantes.MODULO5_P17_2,itemMod5P17.getCk2Opcion()+"");
            contentValues.put(SQLConstantes.MODULO5_P17_3,itemMod5P17.getCk3Opcion()+"");
            contentValues.put(SQLConstantes.MODULO5_P17_4,itemMod5P17.getCk4Opcion()+"");
            contentValues.put(SQLConstantes.MODULO5_P17_5,itemMod5P17.getCk5Opcion()+"");
            contentValues.put(SQLConstantes.MODULO5_P17_6,itemMod5P17.getCk6Opcion()+"");
            contentValues.put(SQLConstantes.MODULO5_P17_7,itemMod5P17.getCk7Opcion()+"");
            contentValues.put(SQLConstantes.MODULO5_P17_8,itemMod5P17.getCk8Opcion()+"");
            contentValues.put(SQLConstantes.MODULO5_P17_9,itemMod5P17.getCk9Opcion()+"");
            contentValues.put(SQLConstantes.MODULO5_P17_10,itemMod5P17.getCk10Opcion()+"");
            contentValues.put(SQLConstantes.MODULO5_P17_11,itemMod5P17.getCk11Opcion()+"");
            contentValues.put(SQLConstantes.MODULO5_P17_12,itemMod5P17.getCk12Opcion()+"");
            contentValues.put(SQLConstantes.MODULO5_P17_13,itemMod5P17.getCk13Opcion()+"");
            contentValues.put(SQLConstantes.MODULO5_P17_14,itemMod5P17.getCk14Opcion()+"");
            contentValues.put(SQLConstantes.MODULO5_P17_15,itemMod5P17.getCk15Opcion()+"");
            contentValues.put(SQLConstantes.MODULO5_P17_16,itemMod5P17.getCk16Opcion()+"");
            contentValues.put(SQLConstantes.MODULO5_P17_17,itemMod5P17.getCk17Opcion()+"");
            contentValues.put(SQLConstantes.MODULO5_P17_18,itemMod5P17.getCk18Opcion()+"");
            contentValues.put(SQLConstantes.MODULO5_P17_19,itemMod5P17.getCk19Opcion()+"");
            contentValues.put(SQLConstantes.MODULO5_P17_19_0,itemMod5P17.getEspecifique());
            contentValues.put(SQLConstantes.MODULO5_P17_20,itemMod5P17.getCk20Opcion()+"");
            data.actualizarModulo5Dinamico(itemMod5P17.getId(),contentValues);
        }
        data.close();
    }
}
