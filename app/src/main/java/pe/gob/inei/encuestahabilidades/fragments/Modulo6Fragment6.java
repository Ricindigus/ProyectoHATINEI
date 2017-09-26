package pe.gob.inei.encuestahabilidades.fragments;


import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AlertDialog;
import android.text.InputFilter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import pe.gob.inei.encuestahabilidades.R;
import pe.gob.inei.encuestahabilidades.modelo.Data;
import pe.gob.inei.encuestahabilidades.modelo.SQLConstantes;
import pe.gob.inei.encuestahabilidades.pojos.Modulo6;

/**
 * A simple {@link Fragment} subclass.
 */
public class Modulo6Fragment6 extends Fragment {



    private LinearLayout mod6_p9_lyt;
    private LinearLayout mod6_p10_lyt;
    private LinearLayout mod6_p11_lyt;
    private LinearLayout mod6_p_obs_lyt;

    private CheckBox mod6_p10_ck1;
    private CheckBox mod6_p10_ck2;
    private CheckBox mod6_p10_ck3;
    private CheckBox mod6_p10_ck4;
    private EditText mod6_p10_edt1;

    private CheckBox mod6_p11_ck1;
    private CheckBox mod6_p11_ck2;
    private CheckBox mod6_p11_ck3;
    private CheckBox mod6_p11_ck4;
    private CheckBox mod6_p11_ck5;
    private CheckBox mod6_p11_ck6;
    private CheckBox mod6_p11_ck7;
    private CheckBox mod6_p11_ck8;
    private CheckBox mod6_p11_ck9;

    private RadioGroup mod6_p9_rg;

    private EditText edtObservaciones;
    //CARGADO Y GUARDADO
    private String idempresa;
    private Modulo6 modulo6;
    private Context context;
    private Data data;
    int C6_p3_1;
    int C6_p3_2;
    int C6_p3_3;
    int C6_p3_4;
    int C6_p3_5;
    int C6_p3_6;
    int C6_p3_7;
    int C6_p3_8;
    int C6_p3_9;


    int C6_P9;

    int C6_P10_1;
    int C6_P10_2;
    int C6_P10_3;
    int C6_P10_4;
    String C6_P10_4_0;

    int C6_P11_1;
    int C6_P11_2;
    int C6_P11_3;
    int C6_P11_4;
    int C6_P11_5;
    int C6_P11_6;
    int C6_P11_7;
    int C6_P11_8;
    int C6_P11_9;

    String OBS_MOD_VI;



    public Modulo6Fragment6() {
        // Required empty public constructor
    }
    @SuppressLint("ValidFragment")
    public Modulo6Fragment6(String idempresa, Context context) {
        this.idempresa = idempresa;
        this.context = context;
        data = new Data(context);
        data.open();
        modulo6 = data.getModulo6(idempresa);

        if (!modulo6.getC6_P3_2_1().equals("") && !modulo6.getC6_P3_2_1().equals("0"))
        {C6_p3_1 = Integer.parseInt(modulo6.getC6_P3_2_1());}
        if (!modulo6.getC6_P3_2_2().equals("") && !modulo6.getC6_P3_2_2().equals("0"))
        {C6_p3_2 = Integer.parseInt(modulo6.getC6_P3_2_2());}
        if (!modulo6.getC6_P3_2_3().equals("") && !modulo6.getC6_P3_2_3().equals("0"))
        {C6_p3_3 = Integer.parseInt(modulo6.getC6_P3_2_3());}
        if (!modulo6.getC6_P3_2_4().equals("") && !modulo6.getC6_P3_2_4().equals("0"))
        {C6_p3_4 = Integer.parseInt(modulo6.getC6_P3_2_4());}
        if (!modulo6.getC6_P3_2_5().equals("") && !modulo6.getC6_P3_2_5().equals("0"))
        {C6_p3_5 = Integer.parseInt(modulo6.getC6_P3_2_5());}
        if (!modulo6.getC6_P3_2_6().equals("") && !modulo6.getC6_P3_2_6().equals("0"))
        {C6_p3_6 = Integer.parseInt(modulo6.getC6_P3_2_6());}
        if (!modulo6.getC6_P3_2_7().equals("") && !modulo6.getC6_P3_2_7().equals("0"))
        {C6_p3_7 = Integer.parseInt(modulo6.getC6_P3_2_7());}
        if (!modulo6.getC6_P3_2_8().equals("") && !modulo6.getC6_P3_2_8().equals("0"))
        {C6_p3_8 = Integer.parseInt(modulo6.getC6_P3_2_8());}
        if (!modulo6.getC6_P3_2_9().equals("") && !modulo6.getC6_P3_2_9().equals("0"))
        {C6_p3_9 = Integer.parseInt(modulo6.getC6_P3_2_9());}




    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_modulo6_fragment6, container, false);



        mod6_p9_lyt = (LinearLayout) rootView.findViewById(R.id.mod6_p9_lyt);
        mod6_p10_lyt = (LinearLayout) rootView.findViewById(R.id.mod6_p10_lyt);
        mod6_p11_lyt = (LinearLayout) rootView.findViewById(R.id.mod6_p11_lyt);
        mod6_p_obs_lyt = (LinearLayout) rootView.findViewById(R.id.mod6_p_obs_lyt);


        mod6_p10_ck1 = (CheckBox) rootView.findViewById(R.id.mod6_p10_ck1);
        mod6_p10_ck2 = (CheckBox) rootView.findViewById(R.id.mod6_p10_ck2);
        mod6_p10_ck3 = (CheckBox) rootView.findViewById(R.id.mod6_p10_ck3);
        mod6_p10_ck4 = (CheckBox) rootView.findViewById(R.id.mod6_p10_ck4);

        mod6_p10_edt1 = (EditText)rootView.findViewById(R.id.mod6_p10_edt1);


        mod6_p11_ck1 = (CheckBox) rootView.findViewById(R.id.mod6_p11_ck1);
        mod6_p11_ck2 = (CheckBox) rootView.findViewById(R.id.mod6_p11_ck2);
        mod6_p11_ck3 = (CheckBox) rootView.findViewById(R.id.mod6_p11_ck3);
        mod6_p11_ck4 = (CheckBox) rootView.findViewById(R.id.mod6_p11_ck4);
        mod6_p11_ck5 = (CheckBox) rootView.findViewById(R.id.mod6_p11_ck5);
        mod6_p11_ck6 = (CheckBox) rootView.findViewById(R.id.mod6_p11_ck6);
        mod6_p11_ck7 = (CheckBox) rootView.findViewById(R.id.mod6_p11_ck7);
        mod6_p11_ck8 = (CheckBox) rootView.findViewById(R.id.mod6_p11_ck8);
        mod6_p11_ck9 = (CheckBox) rootView.findViewById(R.id.mod6_p11_ck9);

        mod6_p9_rg = (RadioGroup) rootView.findViewById(R.id.mod6_p9_rg);
        edtObservaciones = (EditText)rootView.findViewById(R.id.edtObservaciones);



        return rootView;

    }





    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        final CheckBox[] listacheck1 ={
                mod6_p11_ck1, mod6_p11_ck2, mod6_p11_ck3,
                mod6_p11_ck4, mod6_p11_ck5, mod6_p11_ck6, mod6_p11_ck7, mod6_p11_ck8,

        };



        // PREGUNTA 10 - OTRO ESPECIFICQUE CHECK 4
        mod6_p10_edt1.setFilters(new InputFilter[]{new InputFilter.AllCaps()});
        mod6_p10_ck4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    mod6_p10_edt1.setVisibility(View.VISIBLE);
                    mod6_p10_edt1.requestFocus();
                    mod6_p10_edt1.setBackgroundResource(R.drawable.caja_texto_enabled);

                } else {
                    mod6_p10_edt1.setVisibility(View.GONE);

                }
            }
        });




        // PREGUNTA 11 - LISTA 1 --  ALTERNATIVA 9
        mod6_p11_ck9.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override

            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

                if (b) {
                    for (int i = 0; i < listacheck1.length; i++) {
                        final CheckBox checkBox = listacheck1[i];
                        checkBox.setEnabled(false);
                        checkBox.setChecked(false);

                    }

                }
                else {
                    for (int i = 0; i < listacheck1.length; i++) {
                        final CheckBox checkBox = listacheck1[i];
                        checkBox.setEnabled(true);


                    }
                }
            }
        });




        mod6_p9_rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, @IdRes int i) {
                switch (i){
                    case R.id.mod6_p9_rbsi:
                        mod6_p10_lyt.setVisibility(View.VISIBLE);
                        mod6_p11_lyt.setVisibility(View.VISIBLE);
                        mod6_p_obs_lyt.setVisibility(View.VISIBLE);
                        break;
                    case R.id.mod6_p9_rbno:

                        mod6_p10_ck1.setChecked(false);
                        mod6_p10_ck2.setChecked(false);
                        mod6_p10_ck3.setChecked(false);
                        mod6_p10_ck4.setChecked(false);
                        mod6_p10_edt1.setText("");
                        mod6_p10_lyt.setVisibility(View.GONE);

                        break;
                }

            }
        });
        cargarDatos();
        edtObservaciones.setFilters(new InputFilter[]{new InputFilter.AllCaps()});
    }
    //GUARDADO Y CARGADO
    public void cargarDatos() {
        data = new Data(context);
        data.open();
        //verifico si ya existe un objeto con datos llenados previamente
        if (data.existeModulo6(idempresa)) {
            //si existe traigo el objeto
            modulo6 = data.getModulo6(idempresa);
            //saco los datos del objeto para llenarlos en los elementos del fragment
            //pregunta 9
            if(!modulo6.getC6_P9().equals("") && (!modulo6.getC6_P9().equals("-1")))
            {int childPos1 = Integer.parseInt(modulo6.getC6_P9());
                ((RadioButton) mod6_p9_rg.getChildAt(childPos1)).setChecked(true);}
            //pregunta 10
            if (modulo6.getC6_P10_1().equals("1")) mod6_p10_ck1.setChecked(true);if (modulo6.getC6_P10_1().equals("0")) mod6_p10_ck1.setChecked(false);
            if (modulo6.getC6_P10_2().equals("1")) mod6_p10_ck2.setChecked(true);if (modulo6.getC6_P10_2().equals("0")) mod6_p10_ck2.setChecked(false);
            if (modulo6.getC6_P10_3().equals("1")) mod6_p10_ck3.setChecked(true);if (modulo6.getC6_P10_3().equals("0")) mod6_p10_ck3.setChecked(false);
            if (modulo6.getC6_P10_4().equals("1")) mod6_p10_ck4.setChecked(true);if (modulo6.getC6_P10_4().equals("0")) mod6_p10_ck4.setChecked(false);
            mod6_p10_edt1.setText(modulo6.getC6_P10_4_0());
            if (modulo6.getC6_P11_1().equals("1")) mod6_p11_ck1.setChecked(true);if (modulo6.getC6_P11_1().equals("0")) mod6_p11_ck1.setChecked(false);
            if (modulo6.getC6_P11_2().equals("1")) mod6_p11_ck2.setChecked(true);if (modulo6.getC6_P11_2().equals("0")) mod6_p11_ck2.setChecked(false);
            if (modulo6.getC6_P11_3().equals("1")) mod6_p11_ck3.setChecked(true);if (modulo6.getC6_P11_3().equals("0")) mod6_p11_ck3.setChecked(false);
            if (modulo6.getC6_P11_4().equals("1")) mod6_p11_ck4.setChecked(true);if (modulo6.getC6_P11_4().equals("0")) mod6_p11_ck4.setChecked(false);
            if (modulo6.getC6_P11_5().equals("1")) mod6_p11_ck5.setChecked(true);if (modulo6.getC6_P11_5().equals("0")) mod6_p11_ck5.setChecked(false);
            if (modulo6.getC6_P11_6().equals("1")) mod6_p11_ck6.setChecked(true);if (modulo6.getC6_P11_6().equals("0")) mod6_p11_ck6.setChecked(false);
            if (modulo6.getC6_P11_7().equals("1")) mod6_p11_ck7.setChecked(true);if (modulo6.getC6_P11_7().equals("0")) mod6_p11_ck7.setChecked(false);
            if (modulo6.getC6_P11_8().equals("1")) mod6_p11_ck8.setChecked(true);if (modulo6.getC6_P11_8().equals("0")) mod6_p11_ck8.setChecked(false);
            if (modulo6.getC6_P11_9().equals("1")) mod6_p11_ck9.setChecked(true);if (modulo6.getC6_P11_9().equals("0")) mod6_p11_ck9.setChecked(false);
            edtObservaciones.setText(modulo6.getOBS_MOD_VI());




        }
        data.close();
    }

    public void llenarMapaVariables() {
        //preguntas cabecera
        //pregunta 9
        int childPosP1 = mod6_p9_rg.indexOfChild(mod6_p9_rg.findViewById(mod6_p9_rg.getCheckedRadioButtonId()));
        C6_P9 = childPosP1;

        if (mod6_p10_ck1.isChecked()) C6_P10_1 = 1;else C6_P10_1= 0;
        if (mod6_p10_ck2.isChecked()) C6_P10_2 = 1;else C6_P10_2= 0;
        if (mod6_p10_ck3.isChecked()) C6_P10_3 = 1;else C6_P10_3= 0;
        if (mod6_p10_ck4.isChecked()) C6_P10_4 = 1;else C6_P10_4= 0;
        C6_P10_4_0 = mod6_p10_edt1.getText().toString();

        if (mod6_p11_ck1.isChecked()) C6_P11_1 = 1;else C6_P11_1= 0;
        if (mod6_p11_ck2.isChecked()) C6_P11_2 = 1;else C6_P11_2= 0;
        if (mod6_p11_ck3.isChecked()) C6_P11_3 = 1;else C6_P11_3= 0;
        if (mod6_p11_ck4.isChecked()) C6_P11_4 = 1;else C6_P11_4= 0;
        if (mod6_p11_ck5.isChecked()) C6_P11_5 = 1;else C6_P11_5= 0;
        if (mod6_p11_ck6.isChecked()) C6_P11_6 = 1;else C6_P11_6= 0;
        if (mod6_p11_ck7.isChecked()) C6_P11_7 = 1;else C6_P11_7= 0;
        if (mod6_p11_ck8.isChecked()) C6_P11_8 = 1;else C6_P11_8= 0;
        if (mod6_p11_ck9.isChecked()) C6_P11_9 = 1;else C6_P11_9= 0;

        OBS_MOD_VI = edtObservaciones.getText().toString();


    }

    public void guardarDatos() {
        data = new Data(context);
        data.open();
        if (data.existeModulo6(idempresa)) {
            ContentValues contentValues = new ContentValues(478);
            contentValues.put(SQLConstantes.MODULO6_P9, C6_P9 + "");
            contentValues.put(SQLConstantes.MODULO6_P10_1,C6_P10_1+"");
            contentValues.put(SQLConstantes.MODULO6_P10_2,C6_P10_2+"");
            contentValues.put(SQLConstantes.MODULO6_P10_3,C6_P10_3+"");
            contentValues.put(SQLConstantes.MODULO6_P10_4,C6_P10_4+"");
            contentValues.put(SQLConstantes.MODULO6_P10_4_0,C6_P10_4_0);


            contentValues.put(SQLConstantes.MODULO6_P11_1,C6_P11_1+"");
            contentValues.put(SQLConstantes.MODULO6_P11_2,C6_P11_2+"");
            contentValues.put(SQLConstantes.MODULO6_P11_3,C6_P11_3+"");
            contentValues.put(SQLConstantes.MODULO6_P11_4,C6_P11_4+"");
            contentValues.put(SQLConstantes.MODULO6_P11_5,C6_P11_5+"");
            contentValues.put(SQLConstantes.MODULO6_P11_6,C6_P11_6+"");
            contentValues.put(SQLConstantes.MODULO6_P11_7,C6_P11_7+"");
            contentValues.put(SQLConstantes.MODULO6_P11_8,C6_P11_8+"");
            contentValues.put(SQLConstantes.MODULO6_P11_9,C6_P11_9+"");

            contentValues.put(SQLConstantes.MODULO6_OBS_MOD_VI,OBS_MOD_VI);



            data.actualizarModulo6(idempresa, contentValues);
        } else {
            //si no existe el elemento, lo construye para insertarlo
            modulo6 = new Modulo6();
            //llena el objeto a insertar
            modulo6.setMODULO6_ID(idempresa);
            modulo6.setC6_P9(C6_P9 + "");

            modulo6.setC6_P10_1(C6_P10_1 + "");
            modulo6.setC6_P10_2(C6_P10_2 + "");
            modulo6.setC6_P10_3(C6_P10_3 + "");
            modulo6.setC6_P10_4(C6_P10_4 + "");
            modulo6.setC6_P10_4_0(C6_P10_4_0);


            modulo6.setC6_P11_1(C6_P11_1 + "");
            modulo6.setC6_P11_2(C6_P11_2 + "");
            modulo6.setC6_P11_3(C6_P11_3 + "");
            modulo6.setC6_P11_4(C6_P11_4 + "");
            modulo6.setC6_P11_5(C6_P11_5 + "");
            modulo6.setC6_P11_6(C6_P11_6 + "");
            modulo6.setC6_P11_7(C6_P11_7 + "");
            modulo6.setC6_P11_8(C6_P11_8 + "");
            modulo6.setC6_P11_9(C6_P11_9 + "");

            modulo6.setOBS_MOD_VI(OBS_MOD_VI);
            data.insertarModulo6(modulo6);
        }
        data.close();
    }

    public boolean validar(){
//        //revisarcampos
//        llenarMapaVariables();
//
//        boolean correcto = true;
//
//        return correcto;
        boolean valido = true;
        llenarMapaVariables();
        boolean vC6_P10= true ;
        boolean vC6_P11= true ;
        Integer[] valores1={ C6_P10_1,C6_P10_2,C6_P10_3,C6_P10_4};
        Integer[] valores2={ C6_P11_1,C6_P11_2,C6_P11_3,C6_P11_4,C6_P11_5,C6_P11_6,C6_P11_7,C6_P11_8,C6_P11_9};
        for (Integer valor1:valores1 ) {
            if(valor1==1)vC6_P10=false;
        }
        for (Integer valor2:valores2 ) {
            if(valor2==1)vC6_P11=false;
        }

        if(C6_P9 == -1 )
        {   mostrarMensaje("Pregunta 9: Marque una opción ");
            valido=false;
        }else if(C6_P9 == 0 && vC6_P10  )
        {   mostrarMensaje("Pregunta 10: Debe seleccionar una o más opciones");
            valido=false;
        }else if(C6_P10_4== 1 && C6_P10_4_0.trim().length()<3){
            mostrarMensaje( "Pregunta 10: Debe registrar información válida en Especifique");
            valido=false;
        }else if(vC6_P11)
        {   mostrarMensaje("Pregunta 11: Debe seleccionar una o más opciones");
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
