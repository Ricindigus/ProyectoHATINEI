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
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import pe.gob.inei.encuestahabilidades.R;
import pe.gob.inei.encuestahabilidades.modelo.Data;
import pe.gob.inei.encuestahabilidades.modelo.SQLConstantes;
import pe.gob.inei.encuestahabilidades.pojos.Modulo7;

/**
 * A simple {@link Fragment} subclass.
 */
public class Modulo7Fragment5 extends Fragment {

    private RadioGroup mod7_p10_rgb;

    private RadioGroup mod7_p11_rgb;

    private CheckBox mod7_p12_ck1;
    private CheckBox mod7_p12_ck2;
    private CheckBox mod7_p12_ck3;
    private CheckBox mod7_p12_ck4;

    private CheckBox mod7_p13_ck1;
    private CheckBox mod7_p13_ck2;
    private CheckBox mod7_p13_ck3;
    private CheckBox mod7_p13_ck4;

    private RadioGroup mod7_p14_rgb;

    private String idempresa;
    private Modulo7 modulo7;
    private Context context;
    private Data data;

    //mapeo de variables
    int C7_P10;int C7_P11;int C7_P12_1;int C7_P12_2;int C7_P12_3;int C7_P12_4;int C7_P13_1;int C7_P13_2;
    int C7_P13_3;int C7_P13_4;;int C7_P14;

    @SuppressLint("ValidFragment")
    public Modulo7Fragment5(String idempresa, Context context) {
        this.idempresa = idempresa;
        this.context = context;
    }

    public Modulo7Fragment5() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_modulo7_fragment5, container, false);

        mod7_p10_rgb = (RadioGroup) rootView.findViewById(R.id.mod7_p10_rgb);
        mod7_p11_rgb = (RadioGroup) rootView.findViewById(R.id.mod7_p11_rgb);

        mod7_p12_ck1 = (CheckBox) rootView.findViewById(R.id.mod7_p12_ck1);
        mod7_p12_ck2 = (CheckBox) rootView.findViewById(R.id.mod7_p12_ck2);
        mod7_p12_ck3 = (CheckBox) rootView.findViewById(R.id.mod7_p12_ck3);
        mod7_p12_ck4 = (CheckBox) rootView.findViewById(R.id.mod7_p12_ck4);

        mod7_p13_ck1 = (CheckBox) rootView.findViewById(R.id.mod7_p13_ck1);
        mod7_p13_ck2 = (CheckBox) rootView.findViewById(R.id.mod7_p13_ck2);
        mod7_p13_ck3 = (CheckBox) rootView.findViewById(R.id.mod7_p13_ck3);
        mod7_p13_ck4 = (CheckBox) rootView.findViewById(R.id.mod7_p13_ck4);

        mod7_p14_rgb = (RadioGroup) rootView.findViewById(R.id.mod7_p14_rgb);


        return rootView;
    }
    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        final CheckBox[] listacheck1 ={mod7_p12_ck1,mod7_p12_ck2,mod7_p12_ck3};
        final CheckBox[] listacheck ={mod7_p13_ck1,mod7_p13_ck2,mod7_p13_ck3};


        cargarDatos();

        //eliitas
        if(mod7_p13_ck4.isChecked()){
//        if((mod7_p13_ck1.isChecked() || mod7_p13_ck2.isChecked() || mod7_p13_ck3.isChecked()) && mod7_p13_ck4.isChecked()){
                for ( CheckBox c:listacheck ) {
                c.setChecked(false);c.setEnabled(false);c.setTextColor(Color.LTGRAY);
            }
        }

        alertaCheckLimpiar(mod7_p13_ck4,listacheck);

        if(mod7_p12_ck4.isChecked()){
            for ( CheckBox c:listacheck1 ) {
                c.setChecked(false);c.setEnabled(false);c.setTextColor(Color.LTGRAY);
            }
        }

        alertaCheckLimpiar(mod7_p12_ck4,listacheck1);

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

            //pregunta
            if(!modulo7.getC7_P10().equals("") && !modulo7.getC7_P10().equals("-1")){
                ((RadioButton)mod7_p10_rgb.getChildAt(Integer.parseInt(modulo7.getC7_P10()))).setChecked(true);
            }

            //pregunta
            if(!modulo7.getC7_P11().equals("") && !modulo7.getC7_P11().equals("-1")){
                ((RadioButton)mod7_p11_rgb.getChildAt(Integer.parseInt(modulo7.getC7_P11()))).setChecked(true);
            }

            if(modulo7.getC7_P12_1().equals("1")) mod7_p12_ck1.setChecked(true);
            if(modulo7.getC7_P12_1().equals("0")) mod7_p12_ck1.setChecked(false);

            if(modulo7.getC7_P12_2().equals("1")) mod7_p12_ck2.setChecked(true);
            if(modulo7.getC7_P12_2().equals("0")) mod7_p12_ck2.setChecked(false);

            if(modulo7.getC7_P12_3().equals("1")) mod7_p12_ck3.setChecked(true);
            if(modulo7.getC7_P12_3().equals("0")) mod7_p12_ck3.setChecked(false);

            if(modulo7.getC7_P12_4().equals("1")) mod7_p12_ck4.setChecked(true);
            if(modulo7.getC7_P12_4().equals("0")) mod7_p12_ck4.setChecked(false);

            if(modulo7.getC7_P13_1().equals("1")) mod7_p13_ck1.setChecked(true);
            if(modulo7.getC7_P13_1().equals("0")) mod7_p13_ck1.setChecked(false);

            if(modulo7.getC7_P13_2().equals("1")) mod7_p13_ck2.setChecked(true);
            if(modulo7.getC7_P13_2().equals("0")) mod7_p13_ck2.setChecked(false);

            if(modulo7.getC7_P13_3().equals("1")) mod7_p13_ck3.setChecked(true);
            if(modulo7.getC7_P13_3().equals("0")) mod7_p13_ck3.setChecked(false);

            if(modulo7.getC7_P13_4().equals("1")) mod7_p13_ck4.setChecked(true);
            if(modulo7.getC7_P13_4().equals("0")) mod7_p13_ck4.setChecked(false);


            //pregunta
            if(!modulo7.getC7_P14().equals("") && !modulo7.getC7_P14().equals("-1")){
                ((RadioButton)mod7_p14_rgb.getChildAt(Integer.parseInt(modulo7.getC7_P14()))).setChecked(true);
            }
        }
        data.close();
    }
    public void llenarMapaVariables(){
        //pregunta
        int childPosP10 = mod7_p10_rgb.indexOfChild(mod7_p10_rgb.findViewById(mod7_p10_rgb.getCheckedRadioButtonId()));
        C7_P10 = childPosP10;
        //pregunta
        int childPosP11 = mod7_p11_rgb.indexOfChild(mod7_p11_rgb.findViewById(mod7_p11_rgb.getCheckedRadioButtonId()));
        C7_P11 = childPosP11;

        if(mod7_p12_ck1.isChecked())C7_P12_1 = 1;
        else C7_P12_1 = 0;

        if(mod7_p12_ck2.isChecked())C7_P12_2 = 1;
        else C7_P12_2 = 0;

        if(mod7_p12_ck3.isChecked())C7_P12_3 = 1;
        else C7_P12_3 = 0;

        if(mod7_p12_ck4.isChecked())C7_P12_4 = 1;
        else C7_P12_4 = 0;


        if(mod7_p13_ck1.isChecked())C7_P13_1 = 1;
        else C7_P13_1 = 0;

        if(mod7_p13_ck2.isChecked())C7_P13_2 = 1;
        else C7_P13_2 = 0;

        if(mod7_p13_ck3.isChecked())C7_P13_3 = 1;
        else C7_P13_3 = 0;

        if(mod7_p13_ck4.isChecked())C7_P13_4 = 1;
        else C7_P13_4 = 0;

        //pregunta
        int childPosP14 = mod7_p14_rgb.indexOfChild(mod7_p14_rgb.findViewById(mod7_p14_rgb.getCheckedRadioButtonId()));
        C7_P14 = childPosP14;
    }

    public void guardarDatos(){
        data = new Data(context);
        data.open();
        if(data.existeModulo7(idempresa)){
            ContentValues contentValues = new ContentValues(11);
            contentValues.put(SQLConstantes.MODULO7_P10,C7_P10+"");
            contentValues.put(SQLConstantes.MODULO7_P11,C7_P11+"");
            contentValues.put(SQLConstantes.MODULO7_P12_1,C7_P12_1+"");
            contentValues.put(SQLConstantes.MODULO7_P12_2,C7_P12_2+"");
            contentValues.put(SQLConstantes.MODULO7_P12_3,C7_P12_3+"");
            contentValues.put(SQLConstantes.MODULO7_P12_4,C7_P12_4+"");
            contentValues.put(SQLConstantes.MODULO7_P13_1,C7_P13_1+"");
            contentValues.put(SQLConstantes.MODULO7_P13_2,C7_P13_2+"");
            contentValues.put(SQLConstantes.MODULO7_P13_3,C7_P13_3+"");
            contentValues.put(SQLConstantes.MODULO7_P13_4,C7_P13_4+"");
            contentValues.put(SQLConstantes.MODULO7_P14,C7_P14+"");
            data.actualizarModulo7(idempresa,contentValues);
        }else{
            //si no existe el elemento, lo construye para insertarlo
            modulo7 = new Modulo7();
            //llena el objeto a insertar
            modulo7.setMODULO7_ID(idempresa);
            modulo7.setC7_P10(C7_P10+"");
            modulo7.setC7_P11(C7_P11+"");
            modulo7.setC7_P12_1(C7_P12_1+"");
            modulo7.setC7_P12_2(C7_P12_2+"");
            modulo7.setC7_P12_3(C7_P12_3+"");
            modulo7.setC7_P12_3(C7_P12_4+"");
            modulo7.setC7_P13_1(C7_P13_1+"");
            modulo7.setC7_P13_2(C7_P13_2+"");
            modulo7.setC7_P13_3(C7_P13_3+"");
            modulo7.setC7_P13_4(C7_P13_4+"");
            modulo7.setC7_P14(C7_P14+"");
            data.insertarModulo7(modulo7);
        }
        data.close();
    }

    public boolean validar(){
        //revisarcampos

        boolean valido = true;
        llenarMapaVariables();

        boolean vC7_P12 = true;

        Integer[] validarCheck12 = {C7_P12_1,C7_P12_2,C7_P12_3,C7_P12_4};

        //p13
        Integer[] validarCheck13 = {C7_P13_1,C7_P13_2,C7_P13_3,C7_P13_4};

        for (Integer i: validarCheck12){
            if(i==1) vC7_P12=false;
        }

        if(C7_P10 ==-1) {
            mostrarMensaje("Pregunta 10: Debe seleccionar una opción");
            valido=false;
        }else if(C7_P11 ==-1) {
            mostrarMensaje("Pregunta 11: Debe seleccionar una opción");
            valido=false;
        }else if(vC7_P12){
            mostrarMensaje("Pregunta 12: No registra información");
            valido=false;
        }else if(C7_P13_1 == 0 && C7_P13_2 == 0 && C7_P13_3 == 0 && C7_P13_4 == 0){
            mostrarMensaje("Pregunta 13: No  registra razones para no organizar ni financiar la capacitación");
            valido=false;
        }else if(C7_P14 ==-1) {
            mostrarMensaje("Pregunta 14: Debe seleccionar una opción");
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
