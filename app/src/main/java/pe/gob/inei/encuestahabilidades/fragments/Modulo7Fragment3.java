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
import android.text.InputFilter;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.Toast;

import pe.gob.inei.encuestahabilidades.R;
import pe.gob.inei.encuestahabilidades.modelo.Data;
import pe.gob.inei.encuestahabilidades.modelo.SQLConstantes;
import pe.gob.inei.encuestahabilidades.pojos.Modulo7;

/**
 * A simple {@link Fragment} subclass.
 */
public class Modulo7Fragment3 extends Fragment {

    //Variables
    private CheckBox mod7_p8_ck1;
    private CheckBox mod7_p8_ck2;
    private CheckBox mod7_p8_ck3;
    private CheckBox mod7_p8_ck4;
    private CheckBox mod7_p8_ck5;
    private CheckBox mod7_p8_ck6;
    private CheckBox mod7_p8_ck7;
    private CheckBox mod7_p8_ck8;
    private CheckBox mod7_p8_ck9;
    private CheckBox mod7_p8_ck10;
    private CheckBox mod7_p8_ck11;
    private CheckBox mod7_p8_ck12;
    private CheckBox mod7_p8_ck13;
    private CheckBox mod7_p8_ck14;
    private CheckBox mod7_p8_ck15;
    private CheckBox mod7_p8_ck16;
    private CheckBox mod7_p8_ck17;
    private CheckBox mod7_p8_ck18;
    private CheckBox mod7_p8_ck19;
    private CheckBox mod7_p8_ck20;
    private EditText mod7_p8_edt19;

    private String idempresa;
    private Modulo7 modulo7;
    private Context context;
    private Data data;

    //mapeo de variables
    int C7_P8_1;int C7_P8_2;int C7_P8_3;int C7_P8_4; int C7_P8_5;int C7_P8_6; int C7_P8_7;int C7_P8_8;
    int C7_P8_9;int C7_P8_10;int C7_P8_11;int C7_P8_12; int C7_P8_13;int C7_P8_14; int C7_P8_15;int C7_P8_16;
    int C7_P8_17;int C7_P8_18;int C7_P8_19;int C7_P8_20; String C7_P8_19_0;

    public Modulo7Fragment3() {
        // Required empty public constructor
    }

    @SuppressLint("ValidFragment")
    public Modulo7Fragment3(String idempresa, Context context) {
        this.idempresa = idempresa;
        this.context = context;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_modulo7_fragment3, container, false);
        mod7_p8_ck1 = (CheckBox) rootView.findViewById(R.id.mod7_p8_ck1);
        mod7_p8_ck2 = (CheckBox) rootView.findViewById(R.id.mod7_p8_ck2);
        mod7_p8_ck3 = (CheckBox) rootView.findViewById(R.id.mod7_p8_ck3);
        mod7_p8_ck4 = (CheckBox) rootView.findViewById(R.id.mod7_p8_ck4);
        mod7_p8_ck5 = (CheckBox) rootView.findViewById(R.id.mod7_p8_ck5);
        mod7_p8_ck6 = (CheckBox) rootView.findViewById(R.id.mod7_p8_ck6);
        mod7_p8_ck7 = (CheckBox) rootView.findViewById(R.id.mod7_p8_ck7);
        mod7_p8_ck8 = (CheckBox) rootView.findViewById(R.id.mod7_p8_ck8);
        mod7_p8_ck9 = (CheckBox) rootView.findViewById(R.id.mod7_p8_ck9);
        mod7_p8_ck10 = (CheckBox) rootView.findViewById(R.id.mod7_p8_ck10);
        mod7_p8_ck11 = (CheckBox) rootView.findViewById(R.id.mod7_p8_ck11);
        mod7_p8_ck12 = (CheckBox) rootView.findViewById(R.id.mod7_p8_ck12);
        mod7_p8_ck13 = (CheckBox) rootView.findViewById(R.id.mod7_p8_ck13);
        mod7_p8_ck14 = (CheckBox) rootView.findViewById(R.id.mod7_p8_ck14);
        mod7_p8_ck15 = (CheckBox) rootView.findViewById(R.id.mod7_p8_ck15);
        mod7_p8_ck16 = (CheckBox) rootView.findViewById(R.id.mod7_p8_ck16);
        mod7_p8_ck17 = (CheckBox) rootView.findViewById(R.id.mod7_p8_ck17);
        mod7_p8_ck18 = (CheckBox) rootView.findViewById(R.id.mod7_p8_ck18);
        mod7_p8_ck19 = (CheckBox) rootView.findViewById(R.id.mod7_p8_ck19);
        mod7_p8_ck20 = (CheckBox) rootView.findViewById(R.id.mod7_p8_ck20);
        mod7_p8_edt19 = (EditText)rootView.findViewById(R.id.mod7_p8_edt19);

        return rootView;

    }
    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        final CheckBox[] listacheck1 ={
                mod7_p8_ck1,mod7_p8_ck2,mod7_p8_ck3,mod7_p8_ck4,
                mod7_p8_ck5,mod7_p8_ck6,mod7_p8_ck7,mod7_p8_ck8,
                mod7_p8_ck9,mod7_p8_ck10,mod7_p8_ck11,mod7_p8_ck12,
                mod7_p8_ck13,mod7_p8_ck14,mod7_p8_ck15,mod7_p8_ck16,
                mod7_p8_ck17,mod7_p8_ck18,mod7_p8_ck19
        };
        //PREGUNTA 8.19
        mod7_p8_edt19.setFilters(new InputFilter[]{new InputFilter.AllCaps()});
        mod7_p8_ck19.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    mod7_p8_edt19.setVisibility(View.VISIBLE);
                    mod7_p8_edt19.requestFocus();
                    mod7_p8_edt19.setBackgroundResource(R.drawable.caja_texto_enabled);

                } else {
                    mod7_p8_edt19.setVisibility(View.GONE);
                    mod7_p8_edt19.setText("");
                }
            }
        });

        //PREGUNTA 8.20
        cargarDatos();

        if(mod7_p8_ck20.isChecked()){
            for ( CheckBox c:listacheck1 ) {
                c.setChecked(false);c.setEnabled(false);c.setTextColor(Color.LTGRAY);
            }
        }

        alertaCheckLimpiar(mod7_p8_ck20,listacheck1);

    }

    public void alertaCheckLimpiar(final CheckBox check, final CheckBox[] listaCheck){
        check.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, final boolean b ) {
                if(b){
                    AlertDialog.Builder alert = new AlertDialog.Builder(getActivity());
                    final View dialogView = getActivity().getLayoutInflater().inflate(R.layout.dialog_alerta, null);
                    final LinearLayout lytDialog = (LinearLayout) dialogView.findViewById(R.id.dialog_visita_lyt);
                    alert.setTitle("ALERTA");
                    alert.setView(dialogView);
                    alert.setPositiveButton("OK",null);
                    alert.setNegativeButton("Cancelar",null);
                    final AlertDialog alertDialog = alert.create();
                    alertDialog.setOnShowListener(new DialogInterface.OnShowListener() {
                        @Override
                        public void onShow(DialogInterface dialogInterface) {
                            Button ok = alertDialog.getButton(AlertDialog.BUTTON_POSITIVE);
                            Button cancelar = alertDialog.getButton(AlertDialog.BUTTON_NEGATIVE);
                            ok.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    if(check.isChecked()){
                                        for (CheckBox c: listaCheck){
                                            if(c!=check){
                                                c.setChecked(false);c.setEnabled(false);c.setTextColor(Color.LTGRAY);
                                            }
                                        }
                                    }
                                    alertDialog.dismiss();
                                }

                            });
                            cancelar.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    if(check.isChecked()){
                                        check.setChecked(false);
                                        for (CheckBox c: listaCheck){
                                            if(c!=check) {
                                                c.setEnabled(true);
                                                c.setTextColor(Color.BLACK);
                                            }
                                        }
                                    }
                                    alertDialog.dismiss();
                                }
                            });
                        }
                    });
                    alertDialog.show();
                }else{
                    for (CheckBox c: listaCheck){
                        c.setEnabled(true);c.setTextColor(Color.BLACK);
                    }
                }
            }

        });


    }

    public void cargarDatos(){
        data = new Data(context);
        data.open();
        //verifico si ya existe un objeto con datos llenados previamente
        if(data.existeModulo7(idempresa)){
            //si existe traigo el objeto
            modulo7 = data.getModulo7(idempresa);
            //saco los datos del objeto para llenarlos en los elementos del fragment
            //datos cabecera
            if(modulo7.getC7_P8_1().equals("1")) mod7_p8_ck1.setChecked(true);
            if(modulo7.getC7_P8_1().equals("0")) mod7_p8_ck1.setChecked(false);
            if(modulo7.getC7_P8_2().equals("1")) mod7_p8_ck2.setChecked(true);
            if(modulo7.getC7_P8_2().equals("0")) mod7_p8_ck2.setChecked(false);
            if(modulo7.getC7_P8_3().equals("1")) mod7_p8_ck3.setChecked(true);
            if(modulo7.getC7_P8_3().equals("0")) mod7_p8_ck3.setChecked(false);
            if(modulo7.getC7_P8_4().equals("1")) mod7_p8_ck4.setChecked(true);
            if(modulo7.getC7_P8_4().equals("0")) mod7_p8_ck4.setChecked(false);
            if(modulo7.getC7_P8_5().equals("1")) mod7_p8_ck5.setChecked(true);
            if(modulo7.getC7_P8_5().equals("0")) mod7_p8_ck5.setChecked(false);
            if(modulo7.getC7_P8_6().equals("1")) mod7_p8_ck6.setChecked(true);
            if(modulo7.getC7_P8_6().equals("0")) mod7_p8_ck6.setChecked(false);
            if(modulo7.getC7_P8_7().equals("1")) mod7_p8_ck7.setChecked(true);
            if(modulo7.getC7_P8_7().equals("0")) mod7_p8_ck7.setChecked(false);
            if(modulo7.getC7_P8_8().equals("1")) mod7_p8_ck8.setChecked(true);
            if(modulo7.getC7_P8_8().equals("0")) mod7_p8_ck8.setChecked(false);
            if(modulo7.getC7_P8_9().equals("1")) mod7_p8_ck9.setChecked(true);
            if(modulo7.getC7_P8_9().equals("0")) mod7_p8_ck9.setChecked(false);
            if(modulo7.getC7_P8_10().equals("1")) mod7_p8_ck1.setChecked(true);
            if(modulo7.getC7_P8_10().equals("0")) mod7_p8_ck10.setChecked(false);
            if(modulo7.getC7_P8_11().equals("1")) mod7_p8_ck11.setChecked(true);
            if(modulo7.getC7_P8_11().equals("0")) mod7_p8_ck11.setChecked(false);
            if(modulo7.getC7_P8_12().equals("1")) mod7_p8_ck12.setChecked(true);
            if(modulo7.getC7_P8_12().equals("0")) mod7_p8_ck12.setChecked(false);
            if(modulo7.getC7_P8_13().equals("1")) mod7_p8_ck13.setChecked(true);
            if(modulo7.getC7_P8_13().equals("0")) mod7_p8_ck13.setChecked(false);
            if(modulo7.getC7_P8_14().equals("1")) mod7_p8_ck14.setChecked(true);
            if(modulo7.getC7_P8_14().equals("0")) mod7_p8_ck14.setChecked(false);
            if(modulo7.getC7_P8_15().equals("1")) mod7_p8_ck15.setChecked(true);
            if(modulo7.getC7_P8_15().equals("0")) mod7_p8_ck15.setChecked(false);
            if(modulo7.getC7_P8_16().equals("1")) mod7_p8_ck16.setChecked(true);
            if(modulo7.getC7_P8_16().equals("0")) mod7_p8_ck16.setChecked(false);
            if(modulo7.getC7_P8_17().equals("1")) mod7_p8_ck17.setChecked(true);
            if(modulo7.getC7_P8_17().equals("0")) mod7_p8_ck17.setChecked(false);
            if(modulo7.getC7_P8_18().equals("1")) mod7_p8_ck18.setChecked(true);
            if(modulo7.getC7_P8_18().equals("0")) mod7_p8_ck18.setChecked(false);
            if(modulo7.getC7_P8_19().equals("1")) mod7_p8_ck19.setChecked(true);
            if(modulo7.getC7_P8_19().equals("0")) mod7_p8_ck19.setChecked(false);
            if(modulo7.getC7_P8_20().equals("1")) mod7_p8_ck20.setChecked(true);
            if(modulo7.getC7_P8_20().equals("0")) mod7_p8_ck20.setChecked(false);
            mod7_p8_edt19.setText(modulo7.getC7_P8_19_0());

        }
        data.close();
    }

    public void llenarMapaVariables(){
        //preguntas cabecera
        if(mod7_p8_ck1.isChecked())C7_P8_1 = 1;
        else C7_P8_1 = 0;
        if(mod7_p8_ck2.isChecked())C7_P8_2 = 1;
        else C7_P8_2 = 0;
        if(mod7_p8_ck3.isChecked())C7_P8_3 = 1;
        else C7_P8_3 = 0;
        if(mod7_p8_ck4.isChecked())C7_P8_4 = 1;
        else C7_P8_4 = 0;
        if(mod7_p8_ck5.isChecked())C7_P8_5 = 1;
        else C7_P8_5 = 0;
        if(mod7_p8_ck6.isChecked())C7_P8_6 = 1;
        else C7_P8_6 = 0;
        if(mod7_p8_ck7.isChecked())C7_P8_7 = 1;
        else C7_P8_7 = 0;
        if(mod7_p8_ck8.isChecked())C7_P8_8 = 1;
        else C7_P8_8 = 0;
        if(mod7_p8_ck9.isChecked())C7_P8_9 = 1;
        else C7_P8_9 = 0;
        if(mod7_p8_ck10.isChecked())C7_P8_10 = 1;
        else C7_P8_10 = 0;
        if(mod7_p8_ck11.isChecked())C7_P8_11 = 1;
        else C7_P8_11 = 0;
        if(mod7_p8_ck12.isChecked())C7_P8_12 = 1;
        else C7_P8_12 = 0;
        if(mod7_p8_ck13.isChecked())C7_P8_13 = 1;
        else C7_P8_13 = 0;
        if(mod7_p8_ck14.isChecked())C7_P8_14 = 1;
        else C7_P8_14 = 0;
        if(mod7_p8_ck15.isChecked())C7_P8_15 = 1;
        else C7_P8_15 = 0;
        if(mod7_p8_ck16.isChecked())C7_P8_16 = 1;
        else C7_P8_16 = 0;
        if(mod7_p8_ck17.isChecked())C7_P8_17 = 1;
        else C7_P8_17 = 0;
        if(mod7_p8_ck18.isChecked())C7_P8_18 = 1;
        else C7_P8_18 = 0;
        if(mod7_p8_ck19.isChecked())C7_P8_19 = 1;
        else C7_P8_19 = 0;
        if(mod7_p8_ck20.isChecked())C7_P8_20 = 1;
        else C7_P8_20 = 0;

        C7_P8_19_0 = mod7_p8_edt19.getText().toString();

    }

    public void guardarDatos(){
        data = new Data(context);
        data.open();
        if(data.existeModulo7(idempresa)){
            ContentValues contentValues = new ContentValues(255);
            contentValues.put(SQLConstantes.MODULO7_P8_1,C7_P8_1+"");
            contentValues.put(SQLConstantes.MODULO7_P8_2,C7_P8_2+"");
            contentValues.put(SQLConstantes.MODULO7_P8_3,C7_P8_3+"");
            contentValues.put(SQLConstantes.MODULO7_P8_4,C7_P8_4+"");
            contentValues.put(SQLConstantes.MODULO7_P8_5,C7_P8_5+"");
            contentValues.put(SQLConstantes.MODULO7_P8_6,C7_P8_6+"");
            contentValues.put(SQLConstantes.MODULO7_P8_7,C7_P8_7+"");
            contentValues.put(SQLConstantes.MODULO7_P8_8,C7_P8_8+"");
            contentValues.put(SQLConstantes.MODULO7_P8_9,C7_P8_9+"");
            contentValues.put(SQLConstantes.MODULO7_P8_10,C7_P8_10+"");
            contentValues.put(SQLConstantes.MODULO7_P8_11,C7_P8_11+"");
            contentValues.put(SQLConstantes.MODULO7_P8_12,C7_P8_12+"");
            contentValues.put(SQLConstantes.MODULO7_P8_13,C7_P8_13+"");
            contentValues.put(SQLConstantes.MODULO7_P8_14,C7_P8_14+"");
            contentValues.put(SQLConstantes.MODULO7_P8_15,C7_P8_15+"");
            contentValues.put(SQLConstantes.MODULO7_P8_16,C7_P8_16+"");
            contentValues.put(SQLConstantes.MODULO7_P8_17,C7_P8_17+"");
            contentValues.put(SQLConstantes.MODULO7_P8_18,C7_P8_18+"");
            contentValues.put(SQLConstantes.MODULO7_P8_19,C7_P8_19+"");
            contentValues.put(SQLConstantes.MODULO7_P8_19_0,C7_P8_19_0);
            contentValues.put(SQLConstantes.MODULO7_P8_20,C7_P8_20+"");

            data.actualizarModulo7(idempresa,contentValues);
        }else{
            //si no existe el elemento, lo construye para insertarlo
            modulo7 = new Modulo7();
            //llena el objeto a insertar
            modulo7.setMODULO7_ID(idempresa);
            modulo7.setC7_P8_1(C7_P8_1+"");
            modulo7.setC7_P8_2(C7_P8_2+"");
            modulo7.setC7_P8_3(C7_P8_3+"");
            modulo7.setC7_P8_4(C7_P8_4+"");
            modulo7.setC7_P8_5(C7_P8_5+"");
            modulo7.setC7_P8_6(C7_P8_6+"");
            modulo7.setC7_P8_7(C7_P8_7+"");
            modulo7.setC7_P8_8(C7_P8_8+"");
            modulo7.setC7_P8_9(C7_P8_9+"");
            modulo7.setC7_P8_10(C7_P8_10+"");
            modulo7.setC7_P8_11(C7_P8_11+"");
            modulo7.setC7_P8_12(C7_P8_12+"");
            modulo7.setC7_P8_13(C7_P8_13+"");
            modulo7.setC7_P8_14(C7_P8_14+"");
            modulo7.setC7_P8_15(C7_P8_15+"");
            modulo7.setC7_P8_16(C7_P8_16+"");
            modulo7.setC7_P8_17(C7_P8_17+"");
            modulo7.setC7_P8_18(C7_P8_18+"");
            modulo7.setC7_P8_19(C7_P8_19+"");
            modulo7.setC7_P8_19_0(C7_P8_19_0);
            modulo7.setC7_P8_20(C7_P8_20+"");
            data.insertarModulo7(modulo7);
        }
        data.close();
    }




    public boolean validar(){
        //revisarcampos
        boolean valido = true;
        llenarMapaVariables();

        boolean vC7_P8= true ;

        Integer[] valores={ C7_P8_1, C7_P8_2, C7_P8_3, C7_P8_4,  C7_P8_5, C7_P8_6,  C7_P8_7, C7_P8_8,
                C7_P8_9, C7_P8_10, C7_P8_11, C7_P8_12,  C7_P8_13, C7_P8_14,  C7_P8_15, C7_P8_16,
                C7_P8_17, C7_P8_18, C7_P8_19, C7_P8_20};

        for (Integer valor:valores ) {
            if(valor==1)vC7_P8=false;
        }
        if(vC7_P8){
            mostrarMensaje("Pregunta 8: Debe seleccionar una o más opciones");
            valido=false;
        }else if(C7_P8_19 == 1 && C7_P8_19_0.trim().length()<3){
            mostrarMensaje("Debe registrar información válida en Especifique");
            valido=false;
        }

        return valido;
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
