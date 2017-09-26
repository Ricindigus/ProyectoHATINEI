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
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;

import java.util.ArrayList;

import pe.gob.inei.encuestahabilidades.R;
import pe.gob.inei.encuestahabilidades.adapters.Mod5P23Adapter;
import pe.gob.inei.encuestahabilidades.modelo.Data;
import pe.gob.inei.encuestahabilidades.modelo.SQLConstantes;
import pe.gob.inei.encuestahabilidades.pojos.BaseDatos;
import pe.gob.inei.encuestahabilidades.pojos.ItemMod5P21;
import pe.gob.inei.encuestahabilidades.pojos.ItemMod5P23;
import pe.gob.inei.encuestahabilidades.pojos.Modulo5Dinamico;

/**
 * A simple {@link Fragment} subclass.
 */
public class Modulo5Fragment19 extends Fragment {
    private RecyclerView recyclerView;
    private LinearLayoutManager linearLayoutManager;
    private Mod5P23Adapter mod5P23Adapter;
    private ArrayList<ItemMod5P23> arrayP23;
    private String idempresa;
    private ArrayList<Modulo5Dinamico> modulo5Dinamicos;
    private Context context;
    private Data data;

    public Modulo5Fragment19() {
        // Required empty public constructor
    }

    @SuppressLint("ValidFragment")
    public Modulo5Fragment19(String idempresa, Context context) {
        this.idempresa = idempresa;
        this.context = context;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_modulo5_fragment19, container, false);
        recyclerView = (RecyclerView) rootView.findViewById(R.id.mod5_p23_recycler);
        return rootView;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        linearLayoutManager = new LinearLayoutManager(getActivity().getApplicationContext());
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        cargarDatos();
        mod5P23Adapter = new Mod5P23Adapter(arrayP23, getActivity().getApplicationContext(),
                new Mod5P23Adapter.OnItemClickListener() {
                    @Override
                    public void onItemClick(View view, final int position, final int idBD) {
                        AlertDialog.Builder alert = new AlertDialog.Builder(getActivity());
                        final View dialogView = getActivity().getLayoutInflater().inflate(R.layout.dialog_mod5_p23, null);
                        final LinearLayout lytDialog = (LinearLayout) dialogView.findViewById(R.id.dialog_mod5_p23_lyt);
                        final CheckBox ck1 = (CheckBox) dialogView.findViewById(R.id.dialog_mod5_p23_ck1);
                        final CheckBox ck2 = (CheckBox) dialogView.findViewById(R.id.dialog_mod5_p23_ck2);
                        final CheckBox ck3 = (CheckBox) dialogView.findViewById(R.id.dialog_mod5_p23_ck3);
                        final CheckBox ck4 = (CheckBox) dialogView.findViewById(R.id.dialog_mod5_p23_ck4);
                        final CheckBox ck5 = (CheckBox) dialogView.findViewById(R.id.dialog_mod5_p23_ck5);
                        final CheckBox ck6 = (CheckBox) dialogView.findViewById(R.id.dialog_mod5_p23_ck6);
                        final CheckBox ck7 = (CheckBox) dialogView.findViewById(R.id.dialog_mod5_p23_ck7);
                        final CheckBox ck8 = (CheckBox) dialogView.findViewById(R.id.dialog_mod5_p23_ck8);
                        final CheckBox ck9 = (CheckBox) dialogView.findViewById(R.id.dialog_mod5_p23_ck9);
                        final EditText edtEspecifique = (EditText)dialogView.findViewById(R.id.dialog_mod5_p23_edtEspecifique);
                        edtEspecifique.setFilters(new InputFilter[]{new InputFilter.AllCaps()});
                        alert.setTitle("PROBLEMAS DE LA EMPRESA");
                        alert.setView(dialogView);
                        alert.setPositiveButton("OK",null);
                        alert.setNegativeButton("Cancelar",null);
                        final AlertDialog alertDialog = alert.create();
                        alertDialog.setOnShowListener(new DialogInterface.OnShowListener() {
                            @Override
                            public void onShow(DialogInterface dialogInterface) {
                                ocultarTeclado(lytDialog);
                                final CheckBox[] checkBoxes = {ck1,ck2,ck3,ck4,ck5,ck6,ck7,ck8,ck9};
                                if(arrayP23.get(position).getCk1Opcion() == 1) ck1.setChecked(true);
                                if(arrayP23.get(position).getCk2Opcion() == 1) ck2.setChecked(true);
                                if(arrayP23.get(position).getCk3Opcion() == 1) ck3.setChecked(true);
                                if(arrayP23.get(position).getCk4Opcion() == 1) ck4.setChecked(true);
                                if(arrayP23.get(position).getCk5Opcion() == 1) ck5.setChecked(true);
                                if(arrayP23.get(position).getCk6Opcion() == 1) ck6.setChecked(true);
                                if(arrayP23.get(position).getCk7Opcion() == 1) ck7.setChecked(true);
                                if(arrayP23.get(position).getCk8Opcion() == 1) ck8.setChecked(true);
                                if(arrayP23.get(position).getCk9Opcion() == 1) {
                                    ck9.setChecked(true);
                                    edtEspecifique.setEnabled(true);
                                    edtEspecifique.setBackgroundResource(R.drawable.fondo_edit_text);
                                    edtEspecifique.setText(arrayP23.get(position).getEspecifique());
                                    ocultarTeclado(edtEspecifique);
                                    lytDialog.requestFocus();
                                }
                                ck9.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
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
                                        if (ck9.isChecked() && edtEspecifique.getText().toString().equals("")){
                                            edtEspecifique.requestFocus();
                                            Toast.makeText(getActivity().getApplicationContext(), "DEBE ESPECIFICAR EL PROBLEMA", Toast.LENGTH_SHORT).show();
                                        }else{
                                            for (int j = 0; j < checkBoxes.length; j++) {
                                                int c;
                                                if(checkBoxes[j].isChecked()) c = 1;
                                                else c = 0;
                                                if(j == 0){arrayP23.get(position).setCk1Opcion(c);}
                                                if(j == 1){arrayP23.get(position).setCk2Opcion(c);}
                                                if(j == 2){arrayP23.get(position).setCk3Opcion(c);}
                                                if(j == 3){arrayP23.get(position).setCk4Opcion(c);}
                                                if(j == 4){arrayP23.get(position).setCk5Opcion(c);}
                                                if(j == 5){arrayP23.get(position).setCk6Opcion(c);}
                                                if(j == 6){arrayP23.get(position).setCk7Opcion(c);}
                                                if(j == 7){arrayP23.get(position).setCk8Opcion(c);}
                                                if(j == 8){arrayP23.get(position).setCk9Opcion(c);arrayP23.get(position).setEspecifique(edtEspecifique.getText().toString());}
                                            }
                                            arrayP23.get(position).setCheck(checkeado);
                                            mod5P23Adapter.notifyDataSetChanged();
                                            alertDialog.dismiss();
                                        }
                                    }
                                });
                            }
                        });
                        alertDialog.show();
                    }
                });
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(mod5P23Adapter);
    }

    private void cargarDatos() {
        arrayP23 = new ArrayList<ItemMod5P23>();
        data = new Data(context);
        data.open();
        if(data.existeModulo5Dinamico(idempresa)){
            modulo5Dinamicos = data.getModulo5Dinamico(idempresa);
            for(Modulo5Dinamico modulo5Dinamico : modulo5Dinamicos){
                if(modulo5Dinamico.getC5_P12().equals("0")) {
                    ItemMod5P23 itemMod5P23 = new ItemMod5P23(
                            modulo5Dinamico.getIDOCUPACION(),
                            modulo5Dinamico.getC5_P9_2_1(),
                            Integer.parseInt(modulo5Dinamico.getC5_P23_1()),
                            Integer.parseInt(modulo5Dinamico.getC5_P23_2()),
                            Integer.parseInt(modulo5Dinamico.getC5_P23_3()),
                            Integer.parseInt(modulo5Dinamico.getC5_P23_4()),
                            Integer.parseInt(modulo5Dinamico.getC5_P23_5()),
                            Integer.parseInt(modulo5Dinamico.getC5_P23_6()),
                            Integer.parseInt(modulo5Dinamico.getC5_P23_7()),
                            Integer.parseInt(modulo5Dinamico.getC5_P23_8()),
                            Integer.parseInt(modulo5Dinamico.getC5_P23_9()),
                            modulo5Dinamico.getC5_P23_9_0(),
                            1,Integer.parseInt(modulo5Dinamico.getC5_P23_0())
                    );
                    arrayP23.add(itemMod5P23);
                }
            }
        }
        data.close();
    }
    public boolean validar(){
        //revisarcampos
        boolean correcto = true;
        int c = 0;
        while(correcto && c < arrayP23.size()){
            if(arrayP23.get(c).getCheck() == 0) correcto = false;
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
        for (ItemMod5P23 itemMod5P23 : arrayP23){
            ContentValues contentValues = new ContentValues(12);
            contentValues.put(SQLConstantes.MODULO5_P23_0,itemMod5P23.getCheck()+"");
            contentValues.put(SQLConstantes.MODULO5_P23_1,itemMod5P23.getCk1Opcion()+"");
            contentValues.put(SQLConstantes.MODULO5_P23_2,itemMod5P23.getCk2Opcion()+"");
            contentValues.put(SQLConstantes.MODULO5_P23_3,itemMod5P23.getCk3Opcion()+"");
            contentValues.put(SQLConstantes.MODULO5_P23_4,itemMod5P23.getCk4Opcion()+"");
            contentValues.put(SQLConstantes.MODULO5_P23_5,itemMod5P23.getCk5Opcion()+"");
            contentValues.put(SQLConstantes.MODULO5_P23_6,itemMod5P23.getCk6Opcion()+"");
            contentValues.put(SQLConstantes.MODULO5_P23_7,itemMod5P23.getCk7Opcion()+"");
            contentValues.put(SQLConstantes.MODULO5_P23_8,itemMod5P23.getCk8Opcion()+"");
            contentValues.put(SQLConstantes.MODULO5_P23_9,itemMod5P23.getCk9Opcion()+"");
            contentValues.put(SQLConstantes.MODULO5_P23_9_0,itemMod5P23.getEspecifique());
            data.actualizarModulo5Dinamico(itemMod5P23.getId(),contentValues);
        }
        data.close();
    }

    public void ocultarTeclado(View view){
        InputMethodManager mgr = (InputMethodManager) getActivity().getSystemService(Context.INPUT_METHOD_SERVICE);
        mgr.hideSoftInputFromWindow(view.getWindowToken(), 0);
    }

}
