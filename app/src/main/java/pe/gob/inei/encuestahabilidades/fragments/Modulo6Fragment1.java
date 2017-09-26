package pe.gob.inei.encuestahabilidades.fragments;


import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AlertDialog;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import pe.gob.inei.encuestahabilidades.NumericKeyBoardTransformationMethod;
import pe.gob.inei.encuestahabilidades.R;
import pe.gob.inei.encuestahabilidades.TablaFragmentos;
import pe.gob.inei.encuestahabilidades.modelo.Data;
import pe.gob.inei.encuestahabilidades.modelo.SQLConstantes;
import pe.gob.inei.encuestahabilidades.pojos.BaseDatos;
import pe.gob.inei.encuestahabilidades.pojos.Identificacion;
import pe.gob.inei.encuestahabilidades.pojos.Modulo2;
import pe.gob.inei.encuestahabilidades.pojos.Modulo5;
import pe.gob.inei.encuestahabilidades.pojos.Modulo6;

public class Modulo6Fragment1 extends Fragment {

   //CABEZERA
    private LinearLayout lytFragment6;
    private CheckBox ckMismoInformante6;
    private EditText edtNombYApellidos6;
    private EditText edtEspecifiqueCargo6;
    private LinearLayout lytFondoSpinner6;
    private Spinner spCargo6;

    //PREGUNTA 1
    private LinearLayout mod6_p1_lyt;
    private RadioGroup mod6_p1_rgb;
    private RadioButton mod6_p1_rb1;
    private RadioButton mod6_p1_rb2;
    private RadioButton mod6_p1_rb3;

    //PREGUNTA 2
    private LinearLayout mod6_p2_lyt;
    private LinearLayout mod6_p2_lyt1;
    private EditText mod6_p2_edt1;
    private EditText mod6_p2_edt2;
    private RadioGroup mod6_p2_rgb;
    private RadioButton mod6_p2_rb1;
    private RadioButton mod6_p2_rb2;

    //PREGUNTA 3
    private RadioGroup mod6_p3_rgb;
    private RadioButton mod6_p3_rb1;
    private RadioButton mod6_p3_rb2;

    private CheckBox mod6_p3_ck1;
    private CheckBox mod6_p3_ck2;
    private CheckBox mod6_p3_ck3;
    private CheckBox mod6_p3_ck4;
    private CheckBox mod6_p3_ck5;
    private CheckBox mod6_p3_ck6;
    private CheckBox mod6_p3_ck7;
    private CheckBox mod6_p3_ck8;
    private CheckBox mod6_p3_ck9;

    private EditText mod6_p3_edt1;
    private EditText mod6_p3_edt2;
    private EditText mod6_p3_edt3;
    private EditText mod6_p3_edt4;
    private EditText mod6_p3_edt5;
    private EditText mod6_p3_edt6;
    private EditText mod6_p3_edt7;
    private EditText mod6_p3_edt8;
    private EditText mod6_p3_edt9;
    private TextView mod6_p3_tv10;

//    private LinearLayout lytP1;
    private LinearLayout mod6_p3_ly1;
    private LinearLayout mod6_p3_ly2;
    private LinearLayout mod6_p3_ly3;
    private LinearLayout mod6_p3_ly4;
    private LinearLayout mod6_p3_ly5;
    private LinearLayout mod6_p3_ly6;
    private LinearLayout mod6_p3_ly7;
    private LinearLayout mod6_p3_ly8;
    private LinearLayout mod6_p3_ly9;

    private  TextView mod6_p3_tv1;
    private  TextView mod6_p3_tv2;
    private  TextView mod6_p3_tv3;
    private  TextView mod6_p3_tv4;
    private  TextView mod6_p3_tv5;
    private  TextView mod6_p3_tv6;
    private  TextView mod6_p3_tv7;
    private  TextView mod6_p3_tv8;
    private  TextView mod6_p3_tv9;


    //CARGADO Y GUARDADO
    private String idempresa;
    private Modulo6 modulo6;
    private Modulo5 modulo5;
    private Modulo2 modulo2;
    private Context context;
    private Data data;
    private TextView txtP1Total;

    private Identificacion identificacion;

    String informante;
    String cargo="0";
    String cargos="";
    String C2_p1;
    String C5_p1;
    String C5_t1;
    String C5_t2;
    String C5_t3;
    String C5_t4;
    String C5_t5;
    String C5_t6;
    String C5_t7;
    String C5_t8;
    String C5_t9;

    int C5_t11;
    int C5_t22;
    int C5_t33;
    int C5_t44;
    int C5_t55;
    int C5_t66;
    int C5_t77;
    int C5_t88;
    int C5_t99;
    //mapeo de variables
    int C6_P0_0;
    String C6_P0_1;
    int C6_P0_2;
    String C6_P0_3;
    int C6_P1;
    int C6_P2;
    int C6_P2_1;
    int C6_P2_2;
    int C6_P3;
    int C6_P3_1_1;
    int C6_P3_1_2;
    int C6_P3_1_3;
    int C6_P3_1_4;
    int C6_P3_1_5;
    int C6_P3_1_6;
    int C6_P3_1_7;
    int C6_P3_1_8;
    int C6_P3_1_9;
    String C6_P3_1_10;
    String C6_P3_2_1;
    String C6_P3_2_2;
    String C6_P3_2_3;
    String C6_P3_2_4;
    String C6_P3_2_5;
    String C6_P3_2_6;
    String C6_P3_2_7;
    String C6_P3_2_8;
    String C6_P3_2_9;
    int C6_P3_2_10;
//    int C6_P3_2_11;
//    int C6_P3_2_22;
//    int C6_P3_2_33;
//    int C6_P3_2_44;
//    int C6_P3_2_55;
//    int C6_P3_2_66;
//    int C6_P3_2_77;
//    int C6_P3_2_88;
//    int C6_P3_2_99;




    public Modulo6Fragment1() {

        // Required empty public constructor
    }

    @SuppressLint("ValidFragment")
    public Modulo6Fragment1(String idempresa, Context context) {
        this.idempresa = idempresa;
        this.context = context;
        data = new Data(context);
        data.open();
        identificacion = data.getIdentificacion(idempresa);

        if (!identificacion.getNOM_INFORMANTE().equals("") && !identificacion.getNOM_INFORMANTE().equals("0"))
        { informante= identificacion.getNOM_INFORMANTE();}

        if (!identificacion.getCARGO_INFORMANTE().equals("") && !identificacion.getCARGO_INFORMANTE().equals("0"))
        { cargo= identificacion.getCARGO_INFORMANTE();}

         cargos= identificacion.getCARGO_INFORMANTE_ESP();

//        if ((identificacion.getCARGO_INFORMANTE_ESP().equals("")) && (identificacion.getCARGO_INFORMANTE_ESP().equals("0")))
//        { cargos= identificacion2.getCARGO_INFORMANTE_ESP();}
//        else{cargos= identificacion2.getCARGO_INFORMANTE_ESP();}

        modulo2 = data.getModulo2(idempresa);
        C2_p1=modulo2.getC2_P1();

        modulo5 = data.getModulo5(idempresa);
        C5_p1=modulo5.getC5_P1();

//        C5_t1=modulo5.getC5_P1_2_1();
//        C5_t2=modulo5.getC5_P1_2_2();
//        C5_t3=modulo5.getC5_P1_2_3();
//        C5_t4=modulo5.getC5_P1_2_4();
//        C5_t5=modulo5.getC5_P1_2_5();
//        C5_t6=modulo5.getC5_P1_2_6();
//        C5_t7=modulo5.getC5_P1_2_7();
//        C5_t8=modulo5.getC5_P1_2_8();
//        C5_t9=modulo5.getC5_P1_2_9();

        if (!modulo5.getC5_P1_2_1().equals(""))
        {C5_t1= modulo5.getC5_P1_2_1();}
        if (!modulo5.getC5_P1_2_2().equals(""))
        {C5_t2= modulo5.getC5_P1_2_2();}
        if (!modulo5.getC5_P1_2_3().equals(""))
        {C5_t3= modulo5.getC5_P1_2_3();}
        if (!modulo5.getC5_P1_2_4().equals(""))
        {C5_t4= modulo5.getC5_P1_2_4();}
        if (!modulo5.getC5_P1_2_5().equals(""))
        {C5_t5= modulo5.getC5_P1_2_5();}
        if (!modulo5.getC5_P1_2_6().equals(""))
        {C5_t6= modulo5.getC5_P1_2_6();}
        if (!modulo5.getC5_P1_2_7().equals(""))
        {C5_t7= modulo5.getC5_P1_2_7();}
        if (!modulo5.getC5_P1_2_8().equals(""))
        {C5_t8= modulo5.getC5_P1_2_8();}
        if (!modulo5.getC5_P1_2_9().equals(""))
        {C5_t9= modulo5.getC5_P1_2_9();}

//        if (!modulo5.getC5_P1_2_1().equals(""))
//        {
//            C5_t11= Integer.parseInt(modulo5.getC5_P1_2_1());
//        }
//        if (!modulo5.getC5_P1_2_2().equals(""))
//        {C5_t22= Integer.parseInt(modulo5.getC5_P1_2_2());}
//        if (!modulo5.getC5_P1_2_3().equals(""))
//        {C5_t33= Integer.parseInt(modulo5.getC5_P1_2_3());}
//        if (!modulo5.getC5_P1_2_4().equals(""))
//        {C5_t44= Integer.parseInt(modulo5.getC5_P1_2_4());}
//        if (!modulo5.getC5_P1_2_5().equals(""))
//        {C5_t55= Integer.parseInt(modulo5.getC5_P1_2_5());}
//        if (!modulo5.getC5_P1_2_6().equals(""))
//        {C5_t66= Integer.parseInt(modulo5.getC5_P1_2_6());}
//        if (!modulo5.getC5_P1_2_7().equals(""))
//        {C5_t77= Integer.parseInt(modulo5.getC5_P1_2_7());}
//        if (!modulo5.getC5_P1_2_8().equals(""))
//        {C5_t88= Integer.parseInt(modulo5.getC5_P1_2_8());}
//        if (!modulo5.getC5_P1_2_9().equals(""))
//        {C5_t99= Integer.parseInt(modulo5.getC5_P1_2_9());}

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_modulo6_fragment1, container, false);
        //CABEZERA
        lytFragment6 = (LinearLayout) rootView.findViewById(R.id.mod6_layoutFragment1);
        ckMismoInformante6 = (CheckBox) rootView.findViewById(R.id.cab_ckMismoInformante);
        edtNombYApellidos6 = (EditText)rootView.findViewById(R.id.cab_edtApeYNom);
        spCargo6 = (Spinner) rootView.findViewById(R.id.cab_spCargo);
        edtEspecifiqueCargo6 = (EditText) rootView.findViewById(R.id.cab_edtEspecifiqueCargo);
        lytFondoSpinner6 = (LinearLayout) rootView.findViewById(R.id.cab_lytFondoSpinner);
        //PREGUNTA 1
        mod6_p1_lyt = (LinearLayout) rootView.findViewById(R.id.mod6_p1_lyt);
        mod6_p1_rgb = (RadioGroup) rootView.findViewById(R.id.mod6_p1_rgb);
        mod6_p1_rb1 = (RadioButton) rootView.findViewById(R.id.mod6_p1_rb1);
        mod6_p1_rb2 = (RadioButton) rootView.findViewById(R.id.mod6_p1_rb2);
        mod6_p1_rb3 = (RadioButton) rootView.findViewById(R.id.mod6_p1_rb3);
        //PREGUNTA 2
        mod6_p2_lyt = (LinearLayout) rootView.findViewById(R.id.mod6_p2_lyt);
        mod6_p2_lyt1 = (LinearLayout) rootView.findViewById(R.id.mod6_p2_lyt1);
        mod6_p2_rgb = (RadioGroup) rootView.findViewById(R.id.mod6_p2_rgb);
        mod6_p2_rb1 = (RadioButton) rootView.findViewById(R.id.mod6_p2_rb1);
        mod6_p2_rb2= (RadioButton) rootView.findViewById(R.id.mod6_p2_rb2);
        mod6_p2_edt1 = (EditText)rootView.findViewById(R.id.mod6_p2_edt1);
        mod6_p2_edt2 = (EditText)rootView.findViewById(R.id.mod6_p2_edt2);
        //PREGUNTA 3
        mod6_p3_rgb = (RadioGroup) rootView.findViewById(R.id.mod6_p3_rgb);
        mod6_p3_rb1 = (RadioButton) rootView.findViewById(R.id.mod6_p3_rb1);
       // mod6_p3_rb2= (RadioButton) rootView.findViewById(R.id.mod6_p3_rb2);
        mod6_p3_ck1 = (CheckBox) rootView.findViewById(R.id.mod6_p3_ck1);
        mod6_p3_ck2 = (CheckBox) rootView.findViewById(R.id.mod6_p3_ck2);
        mod6_p3_ck3 = (CheckBox) rootView.findViewById(R.id.mod6_p3_ck3);
        mod6_p3_ck4 = (CheckBox) rootView.findViewById(R.id.mod6_p3_ck4);
        mod6_p3_ck5 = (CheckBox) rootView.findViewById(R.id.mod6_p3_ck5);
        mod6_p3_ck6 = (CheckBox) rootView.findViewById(R.id.mod6_p3_ck6);
        mod6_p3_ck7 = (CheckBox) rootView.findViewById(R.id.mod6_p3_ck7);
        mod6_p3_ck8 = (CheckBox) rootView.findViewById(R.id.mod6_p3_ck8);
        mod6_p3_ck9 = (CheckBox) rootView.findViewById(R.id.mod6_p3_ck9);
        mod6_p3_edt1 = (EditText) rootView.findViewById(R.id.mod6_p3_edt1);
        mod6_p3_edt2 = (EditText) rootView.findViewById(R.id.mod6_p3_edt2);
        mod6_p3_edt3 = (EditText) rootView.findViewById(R.id.mod6_p3_edt3);
        mod6_p3_edt4 = (EditText) rootView.findViewById(R.id.mod6_p3_edt4);
        mod6_p3_edt5 = (EditText) rootView.findViewById(R.id.mod6_p3_edt5);
        mod6_p3_edt6 = (EditText) rootView.findViewById(R.id.mod6_p3_edt6);
        mod6_p3_edt7 = (EditText) rootView.findViewById(R.id.mod6_p3_edt7);
        mod6_p3_edt8 = (EditText) rootView.findViewById(R.id.mod6_p3_edt8);
        mod6_p3_edt9 = (EditText) rootView.findViewById(R.id.mod6_p3_edt9);
        mod6_p3_tv10 = (TextView) rootView.findViewById(R.id.mod6_p3_tv10);

        mod6_p3_ly1 = (LinearLayout) rootView.findViewById(R.id.mod6_p3_ly1);
        mod6_p3_ly2 = (LinearLayout) rootView.findViewById(R.id.mod6_p3_ly2);
        mod6_p3_ly3 = (LinearLayout) rootView.findViewById(R.id.mod6_p3_ly3);
        mod6_p3_ly4 = (LinearLayout) rootView.findViewById(R.id.mod6_p3_ly4);
        mod6_p3_ly5 = (LinearLayout) rootView.findViewById(R.id.mod6_p3_ly5);
        mod6_p3_ly6 = (LinearLayout) rootView.findViewById(R.id.mod6_p3_ly6);
        mod6_p3_ly7 = (LinearLayout) rootView.findViewById(R.id.mod6_p3_ly7);
        mod6_p3_ly8 = (LinearLayout) rootView.findViewById(R.id.mod6_p3_ly8);
        mod6_p3_ly9 = (LinearLayout) rootView.findViewById(R.id.mod6_p3_ly9);

        mod6_p3_tv1 = (TextView) rootView.findViewById(R.id.mod6_p3_tv1);
        mod6_p3_tv2 = (TextView) rootView.findViewById(R.id.mod6_p3_tv2);
        mod6_p3_tv3 = (TextView) rootView.findViewById(R.id.mod6_p3_tv3);
        mod6_p3_tv4 = (TextView) rootView.findViewById(R.id.mod6_p3_tv4);
        mod6_p3_tv5 = (TextView) rootView.findViewById(R.id.mod6_p3_tv5);
        mod6_p3_tv6 = (TextView) rootView.findViewById(R.id.mod6_p3_tv6);
        mod6_p3_tv7 = (TextView) rootView.findViewById(R.id.mod6_p3_tv7);
        mod6_p3_tv8 = (TextView) rootView.findViewById(R.id.mod6_p3_tv8);
        mod6_p3_tv9 = (TextView) rootView.findViewById(R.id.mod6_p3_tv9);


//        txtP3Total = (TextView) rootView.findViewById(R.id.mod6_p3_txtTotal);
//        Toast.makeText(getActivity().getApplicationContext(), C5_t1+"--", Toast.LENGTH_SHORT).show();

        //4.1.GERENTES

        if (C5_t1.equals("") || C5_t1.equals("0") || C5_t1.equals(0) ) {

            mod6_p3_ly1.setVisibility(View.GONE);
        }
            else
            {
                mod6_p3_ly1.setVisibility(View.VISIBLE);
            }

        //4.2.PROFESIONALES
        if (C5_t2.equals("") || C5_t2.equals("0") || C5_t2.equals(0) ) {

            mod6_p3_ly2.setVisibility(View.GONE);
        }
        else
        {
            mod6_p3_ly2.setVisibility(View.VISIBLE);
        }

        //4.3
        if (C5_t3.equals("") || C5_t3.equals("0") || C5_t3.equals(0) ) {

            mod6_p3_ly3.setVisibility(View.GONE);
        }
        else
        {
            mod6_p3_ly3.setVisibility(View.VISIBLE);
        }
        //4.4
        if (C5_t4.equals("") || C5_t4.equals("0") || C5_t4.equals(0) ) {

            mod6_p3_ly4.setVisibility(View.GONE);
        }
        else
        {
            mod6_p3_ly4.setVisibility(View.VISIBLE);
        }
        //4.3
        if (C5_t5.equals("") || C5_t5.equals("0") || C5_t5.equals(0) ) {

            mod6_p3_ly5.setVisibility(View.GONE);
        }
        else
        {
            mod6_p3_ly5.setVisibility(View.VISIBLE);
        }
        //4.6
        if (C5_t6.equals("") || C5_t6.equals("0") || C5_t6.equals(0) ) {

                mod6_p3_ly6.setVisibility(View.GONE);
            }
            else
            {
                mod6_p3_ly6.setVisibility(View.VISIBLE);
            }
        //4.7

            if (C5_t7.equals("") || C5_t7.equals("0") || C5_t7.equals(0) ) {

                mod6_p3_ly7.setVisibility(View.GONE);
            }
            else
            {
                mod6_p3_ly7.setVisibility(View.VISIBLE);
            }
        //4.8
           if (C5_t8.equals("") || C5_t8.equals("0") || C5_t8.equals(0) ) {

                mod6_p3_ly8.setVisibility(View.GONE);
            }
            else
            {
                mod6_p3_ly8.setVisibility(View.VISIBLE);
            }
        //4.9
        if (C5_t9.equals("") || C5_t9.equals("0") || C5_t9.equals(0) ) {

            mod6_p3_ly9.setVisibility(View.GONE);
        }
        else
        {
            mod6_p3_ly9.setVisibility(View.VISIBLE);
        }



        return rootView;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


        //Toast.makeText(getActivity().getApplicationContext(), "modulo6 fragment 1", Toast.LENGTH_SHORT).show();
        //final EditText[] editTexts = {mod6_p3_edt1,mod6_p3_edt2,mod6_p3_edt3,mod6_p3_edt4,mod6_p3_edt5,mod6_p3_edt6,mod6_p3_edt7,mod6_p3_edt8,mod6_p3_edt9};
        /*DATOS INTRODUCTORIOS MODULO 6*/
        EditText[] cajasDeTextoNumero = {
                mod6_p2_edt1,
                mod6_p2_edt2};


        LinearLayout[] linearlayout = {mod6_p1_lyt,
                mod6_p2_lyt,
                mod6_p2_lyt1};


        RadioGroup[] radios= { mod6_p1_rgb,
                mod6_p2_rgb};

        for (int i = 0; i < cajasDeTextoNumero.length; i++) {
            final EditText editText = cajasDeTextoNumero[i];
            editText.setTransformationMethod(new NumericKeyBoardTransformationMethod());
            editText.setOnFocusChangeListener(new View.OnFocusChangeListener() {
                @Override
                public void onFocusChange(View view, boolean conFocus) {
                    if(conFocus) {
                        editText.setBackgroundResource(R.drawable.caja_texto_enabled);
                    }else if(view.isEnabled()){
                        editText.setBackgroundResource(R.drawable.cajas_de_texto);
                    }
                }
            });
        }

        for (int i = 0; i < radios.length; i++) {
            final RadioGroup radio = radios[i];
            radio.setOnFocusChangeListener(new View.OnFocusChangeListener() {
                @Override
                public void onFocusChange(View view, boolean conFocus) {
                    if(conFocus) {
                        radio.setBackgroundColor(Color.CYAN);
                    }else if(view.isEnabled()){
                        radio.setBackgroundColor(Color.TRANSPARENT);
                    }

                }
            });
        }

        ckMismoInformante6.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    edtNombYApellidos6.setBackgroundResource(R.drawable.fondo_edit_text_disabled);
                    lytFondoSpinner6.setBackgroundResource(R.drawable.fondo_spinner_disabled);
                    spCargo6.setEnabled(false);
                    edtNombYApellidos6.setText(informante);
                    spCargo6.setSelection(Integer.parseInt(cargo));
                    edtEspecifiqueCargo6.setText(cargos);
                    edtEspecifiqueCargo6.setEnabled(false);
                    edtEspecifiqueCargo6.setBackgroundResource(R.drawable.fondo_edit_text_disabled);
                    edtNombYApellidos6.setEnabled(false);
                    mod6_p1_lyt.requestFocus();
                }else{
                    edtNombYApellidos6.setText("");
                    spCargo6.setSelection(0);
                    edtNombYApellidos6.setBackgroundResource(R.drawable.fondo_edit_text);
                    edtNombYApellidos6.setEnabled(true);
                    lytFondoSpinner6.setBackgroundResource(R.drawable.fondo_spinner);
                    spCargo6.setEnabled(true);
                    edtEspecifiqueCargo6.setEnabled(true);
                    edtEspecifiqueCargo6.setBackgroundResource(R.drawable.fondo_edit_text);
                    edtNombYApellidos6.requestFocus();

                }
            }
        });
        edtNombYApellidos6.setFilters(new InputFilter[]{new InputFilter.AllCaps()});
        edtNombYApellidos6.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View view, int keyCode, KeyEvent keyEvent) {
                if ((keyEvent.getAction() == KeyEvent.ACTION_DOWN) &&
                        (keyCode == KeyEvent.KEYCODE_ENTER)) {
                    ocultarTeclado(edtNombYApellidos6);
                    lytFondoSpinner6.requestFocus();
                    return true;
                }
                return false;
            }
        });

        spCargo6.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int pos, long l) {
                edtEspecifiqueCargo6.setVisibility(View.GONE);
                switch (pos){
                    case 0:break;
                    case 1:break;
                    case 2:break;
                    case 3:break;
                    case 4:
                        edtEspecifiqueCargo6.setVisibility(View.VISIBLE);
                        edtEspecifiqueCargo6.requestFocus();
                        break;
                }
                if (pos >= 0 && pos <4){
                    edtEspecifiqueCargo6.setText("");
                    mod6_p1_lyt.requestFocus();
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {}
        });
        edtEspecifiqueCargo6.setFilters(new InputFilter[]{new InputFilter.AllCaps()});
        edtEspecifiqueCargo6.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View view, int keyCode, KeyEvent keyEvent) {
                if ((keyEvent.getAction() == KeyEvent.ACTION_DOWN) && (keyCode == KeyEvent.KEYCODE_ENTER)) {
                    ocultarTeclado(edtEspecifiqueCargo6);
                    mod6_p1_lyt.requestFocus();
                    return true;
                }
                return false;
            }
        });
        /*-------------------------------------------------------------------------------------*/

        //PREGUNTA 1
        mod6_p2_lyt.setVisibility(View.GONE);
        mod6_p1_rgb.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, @IdRes int i) {
                switch (i){
                    case R.id.mod6_p1_rb1:
                        mod6_p2_lyt.setVisibility(View.VISIBLE);

                        mod6_p2_rgb.requestFocus();
                        break;
                    case R.id.mod6_p1_rb2:
                        mod6_p2_lyt.setVisibility(View.GONE);
                        mod6_p3_rgb.requestFocus();
                        break;
                    case R.id.mod6_p1_rb3:
                        mod6_p2_lyt.setVisibility(View.GONE);
                        mod6_p3_rgb.requestFocus();
                        break;
                }
            }
        });
        //PREGUNTA 2
        mod6_p2_lyt1.setVisibility(View.GONE);
        //mod6_p2_edt2.setEnabled(false);
       // mod6_p2_edt2.setBackgroundResource(R.drawable.cajas_de_texto_disabled);


        mod6_p2_edt2.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {            }
            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {            }
            @Override
            public void afterTextChanged(Editable editable) {
                if (!editable.toString().equals("")) {
                    if (Integer.parseInt(mod6_p2_edt2.getText().toString()) >= 101 || Integer.parseInt(mod6_p2_edt2.getText().toString()) == 0) {
                        //Toast.makeText(context, "Debe registrar un porcentaje valido", Toast.LENGTH_SHORT).show();
                        mod6_p2_edt2.requestFocus();
                        mod6_p2_edt2.setText("");
                    }
                }
            }
        });

        mod6_p2_edt1.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) { }
            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) { }
            @Override
            public void afterTextChanged(Editable editable) {
                if(mod6_p2_edt1.getText().toString().equals("")){
//                    if(mod7_p6_edt1.getText().toString().equals("") || mod7_p6_edt1.getText().toString().equals("0")){

                    mod6_p2_edt2.setBackgroundResource(R.drawable.cajas_de_texto);
                    mod6_p2_edt2.setEnabled(true);
                }else{
                    mod6_p2_edt2.setBackgroundResource(R.drawable.cajas_de_texto_disabled);
                    mod6_p2_edt2.setEnabled(false);
                }
            }
        });

        mod6_p2_edt2.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) { }
            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) { }
            @Override
            public void afterTextChanged(Editable editable) {
                if(mod6_p2_edt2.getText().toString().equals("")){
//                    if(mod7_p6_edt2.getText().toString().equals("") || mod7_p6_edt2.getText().toString().equals("0")){

                    mod6_p2_edt1.setBackgroundResource(R.drawable.cajas_de_texto);
                    mod6_p2_edt1.setEnabled(true);
                }else{
                    mod6_p2_edt1.setBackgroundResource(R.drawable.cajas_de_texto_disabled);
                    mod6_p2_edt1.setEnabled(false);
                }
            }
        });





        mod6_p2_rgb.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, @IdRes int i) {
                switch (i){
                    case R.id.mod6_p2_rb1:
                        mod6_p2_lyt1.setVisibility(View.VISIBLE);
                        mod6_p2_edt2.setEnabled(true);
                        //mod6_p2_edt1.requestFocus();
                        break;
                    case R.id.mod6_p2_rb2:
                        mod6_p2_edt1.setText("");
                        mod6_p2_edt2.setText("");
                        //mod6_p2_edt2.setEnabled(false);
                        mod6_p2_edt2.setBackgroundResource(R.drawable.cajas_de_texto_disabled);
                        mod6_p2_edt1.setBackgroundResource(R.drawable.cajas_de_texto_disabled);
                        mod6_p2_lyt1.setVisibility(View.GONE);
                        mod6_p3_rgb.requestFocus();
                        break;
                }
            }
        });
        //PREGUNTA 3
        final CheckBox[] checkBoxes = {mod6_p3_ck1,mod6_p3_ck2,mod6_p3_ck3,mod6_p3_ck4,mod6_p3_ck5,mod6_p3_ck6,mod6_p3_ck7,mod6_p3_ck8,mod6_p3_ck9};
        final EditText[] editTexts = {mod6_p3_edt1,mod6_p3_edt2,mod6_p3_edt3,mod6_p3_edt4,mod6_p3_edt5,mod6_p3_edt6,mod6_p3_edt7,mod6_p3_edt8,mod6_p3_edt9};
        LinearLayout[] linearLayouts = {mod6_p3_ly1,mod6_p3_ly2,mod6_p3_ly3,mod6_p3_ly4,mod6_p3_ly5,mod6_p3_ly6,mod6_p3_ly7,mod6_p3_ly8,mod6_p3_ly9};
        final String[] totales={C5_t1,C5_t2,C5_t3,C5_t4,C5_t5,C5_t6,C5_t7,C5_t8,C5_t9};

        mod6_p3_rgb.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, @IdRes int i) {

                for (int j = 0; j < checkBoxes.length; j++) {
                    CheckBox checkBox = checkBoxes[j];
                    checkBox.setEnabled(true);
                }

//                if(C5_p1.equals("0")) {
//                    mod6_p3_tv1.setText("Total: " + C5_t1);
//                    mod6_p3_tv2.setText("Total: " + C5_t2);
//                    mod6_p3_tv3.setText("Total: " + C5_t3);
//                    mod6_p3_tv4.setText("Total: " + C5_t4);
//                    mod6_p3_tv5.setText("Total: " + C5_t5);
//                    mod6_p3_tv6.setText("Total: " + C5_t6);
//                    mod6_p3_tv7.setText("Total: " + C5_t7);
//                    mod6_p3_tv8.setText("Total: " + C5_t8);
//                    mod6_p3_tv9.setText("Total: " + C5_t9);
//
//                }else{
//                    if(!C2_p1.equals("")){
//                        if(!C5_t1.equals("") ){
//                            int numero= Integer.parseInt(C5_t1) * Integer.parseInt(C2_p1)/100;
//                            mod6_p3_tv1.setText("Total: " + numero);
//                        }
//                        if(!C5_t2.equals("") ){
//                            int numero= Integer.parseInt(C5_t2) * Integer.parseInt(C2_p1)/100;
//                            mod6_p3_tv2.setText("Total: " + numero);
//                        }
//                        if(!C5_t3.equals("") ){
//                            int numero= Integer.parseInt(C5_t3) * Integer.parseInt(C2_p1)/100;
//                            mod6_p3_tv3.setText("Total: " + numero);
//                        }
//                        if(!C5_t4.equals("") ){
//                            int numero= Integer.parseInt(C5_t4) * Integer.parseInt(C2_p1)/100;
//                            mod6_p3_tv4.setText("Total: " + numero);
//                        }
//                        if(!C5_t5.equals("") ){
//                            int numero= Integer.parseInt(C5_t5) * Integer.parseInt(C2_p1)/100;
//                            mod6_p3_tv5.setText("Total: " + numero);
//                        }
//                        if(!C5_t6.equals("") ){
//                            int numero= Integer.parseInt(C5_t6) * Integer.parseInt(C2_p1)/100;
//                            mod6_p3_tv6.setText("Total: " + numero);
//                        }
//                        if(!C5_t7.equals("") ){
//                            int numero= Integer.parseInt(C5_t7) * Integer.parseInt(C2_p1)/100;
//                            mod6_p3_tv7.setText("Total: " + numero);
//                        }
//                        if(!C5_t8.equals("") ){
//                            int numero= Integer.parseInt(C5_t8) * Integer.parseInt(C2_p1)/100;
//                            mod6_p3_tv8.setText("Total: " + numero);
//                        }
//                        if(!C5_t9.equals("") ){
//                            int numero= Integer.parseInt(C5_t9) * Integer.parseInt(C2_p1)/100;
//                            mod6_p3_tv9.setText("Total: " + numero);
//                        }
//                    }
//                }

                switch (i){
                    case R.id.mod6_p3_rb1:
                        mod6_p3_tv1.setText("Total: " + C5_t1);
                        mod6_p3_tv2.setText("Total: " + C5_t2);
                        mod6_p3_tv3.setText("Total: " + C5_t3);
                        mod6_p3_tv4.setText("Total: " + C5_t4);
                        mod6_p3_tv5.setText("Total: " + C5_t5);
                        mod6_p3_tv6.setText("Total: " + C5_t6);
                        mod6_p3_tv7.setText("Total: " + C5_t7);
                        mod6_p3_tv8.setText("Total: " + C5_t8);
                        mod6_p3_tv9.setText("Total: " + C5_t9);
                        for (int j = 0; j < editTexts.length; j++) {
                            EditText editText = editTexts[j];
                            editText.setText("");
                            editText.setHint("Ingrese número");
                            editText.setFilters(new InputFilter[]{new InputFilter.LengthFilter(5)});
                        }
                        break;
//                    case R.id.mod6_p3_rb2:
//
//                        for (int j = 0; j < editTexts.length; j++) {
//                            EditText editText = editTexts[j];
//                            editText.setText("");
//                            editText.setHint("Ingrese porcentaje");
//                            editText.setFilters(new InputFilter[]{new InputFilter.LengthFilter(3)});
//                        }
//                        break;
                }
                mod6_p3_tv10.setText("0");
            }
        });
        for (int i = 0; i < checkBoxes.length; i++) {
            final int posicion= i;
            CheckBox checkBox = checkBoxes[i];
            final EditText editText = editTexts[i];
            final LinearLayout linearLayout = linearLayouts[i];
            checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                    if(b){
                        editText.setText("");
                        editText.setEnabled(true);
                        editText.setBackgroundResource(R.drawable.fondo_edit_text);
                    }else{
                        editText.setText("");
                        editText.setBackgroundResource(R.drawable.fondo_edit_text_disabled);
                        editText.setEnabled(false);
                    }
                }
            });
            editText.setOnKeyListener(new View.OnKeyListener() {
                @Override
                public boolean onKey(View view, int keyCode, KeyEvent keyEvent) {
                    if ((keyEvent.getAction() == KeyEvent.ACTION_DOWN) &&
                            (keyCode == KeyEvent.KEYCODE_ENTER)) {
                        ocultarTeclado(editText);
                        linearLayout.requestFocus();
                        return true;
                    }
                    return false;
                }
            });
            editText.setTransformationMethod(new NumericKeyBoardTransformationMethod());
            editText.addTextChangedListener(new TextWatcher() {
                @Override
                public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                    if(!charSequence.toString().equals("")){
                        //mod6_p3_tv10.setText((Integer.parseInt(mod6_p3_tv10.getText().toString()) - Integer.parseInt(charSequence.toString()))+"");

                        if(mod6_p3_rgb.indexOfChild(mod6_p3_rgb.findViewById(mod6_p3_rgb.getCheckedRadioButtonId()))==0){
                            mod6_p3_tv10.setText((Integer.parseInt(mod6_p3_tv10.getText().toString()) - Integer.parseInt(charSequence.toString()))+"");
                        }else{
                            int porcentaje=Integer.parseInt(charSequence.toString());
                            int numero= Integer.parseInt(totales[posicion]) * Integer.parseInt(C2_p1)/100;
                            int subTotal = numero * porcentaje/100;
                            mod6_p3_tv10.setText((Integer.parseInt(mod6_p3_tv10.getText().toString()) - subTotal)+"");
                        }

//                        if(mod6_p3_rgb.indexOfChild(mod6_p3_rgb.findViewById(mod6_p3_rgb.getCheckedRadioButtonId()))==0){
//                            txtP1Total.setText((Integer.parseInt(txtP1Total.getText().toString()) - Integer.parseInt(charSequence.toString()))+"");
//                        }else{
//                            int porcentaje=Integer.parseInt(charSequence.toString());
//                            int subTotal = C2_P1*porcentaje/100;
//                            txtP1Total.setText((Integer.parseInt(txtP1Total.getText().toString()) - subTotal)+"");
//                        }
                    }
                }

                @Override
                public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                    //BaseDatos.C6_P3_1_1 = Integer.parseInt(mod6_p3_edt1.getText().toString());
                }

                @Override
                public void afterTextChanged(Editable editable) {
                    int despues = 0;
                    if(!editable.toString().equals("") ) despues = Integer.parseInt(editable.toString());
                   /*
                    if(!(Integer.parseInt(mod6_p3_tv10.getText().toString())== 0)){
                        mod6_p3_tv10.setText((Integer.parseInt(mod6_p3_tv10.getText().toString()) + despues) +"");
                    }else{
                        mod6_p3_tv10.setText(despues+"");
                    }
                    */

                    if(!(Integer.parseInt(mod6_p3_tv10.getText().toString())== 0)){
                        if(mod6_p3_rgb.indexOfChild(mod6_p3_rgb.findViewById(mod6_p3_rgb.getCheckedRadioButtonId()))==0){
                            mod6_p3_tv10.setText((Integer.parseInt(mod6_p3_tv10.getText().toString()) + despues) +"");
                        }else{
                            int numero= Integer.parseInt(totales[posicion]) * Integer.parseInt(C2_p1)/100;
                            int subTotal = numero*despues/100;
                            mod6_p3_tv10.setText((Integer.parseInt(mod6_p3_tv10.getText().toString()) + subTotal)+"");
                        }
                    }else{
                        if(mod6_p3_rgb.indexOfChild(mod6_p3_rgb.findViewById(mod6_p3_rgb.getCheckedRadioButtonId()))==0){
                            mod6_p3_tv10.setText(despues+"");
                        }else{
                            int numero= Integer.parseInt(totales[posicion]) * Integer.parseInt(C2_p1)/100;
                            int subTotal = numero *despues/100;
                            mod6_p3_tv10.setText((Integer.parseInt(mod6_p3_tv10.getText().toString()) + subTotal)+"");
                        }
                    }

//                    if (Integer.parseInt(editText.getText().toString()) > 101 || Integer.parseInt(editText.getText().toString()) == 0) {
//                        Toast.makeText(context, "INGRESAR UN NUMERO ENTRE 1 Y 100", Toast.LENGTH_SHORT).show();
//                        editText.requestFocus();
//                        editText.setText("");
//                    }
                }
            });

//            mod6_p2_edt1.addTextChangedListener(new TextWatcher() {
//                @Override
//                public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
//                    if(!charSequence.toString().equals("")){
//                       // mod6_p2_edt2.setEnabled(false);
//                    }
//                }
//
//                @Override
//                public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
//                    //BaseDatos.C6_P3_1_1 = Integer.parseInt(mod6_p3_edt1.getText().toString());
//                }
//
//                @Override
//                public void afterTextChanged(Editable editable) {
//                    if(!editable.toString().equals("")){
//                        mod6_p2_edt2.setEnabled(false);
//                        mod6_p2_edt2.setBackgroundResource(R.drawable.cajas_de_texto_disabled);
//                    }else{
//                        mod6_p2_edt2.setEnabled(true);
//                        mod6_p2_edt2.setBackgroundResource(R.drawable.cajas_de_texto);
//                    }
//
//                }
//            });
//            mod6_p2_edt2.addTextChangedListener(new TextWatcher() {
//                @Override
//                public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
//                    if(!charSequence.toString().equals("")){
//                        // mod6_p2_edt2.setEnabled(false);
//                    }
//                }
//
//                @Override
//                public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
//                    //BaseDatos.C6_P3_1_1 = Integer.parseInt(mod6_p3_edt1.getText().toString());
//                }
//
//                @Override
//                public void afterTextChanged(Editable editable) {
//                    if(!editable.toString().equals("")){
//                        mod6_p2_edt1.setEnabled(false);
//                        mod6_p2_edt1.setBackgroundResource(R.drawable.cajas_de_texto_disabled);
//                    }else{
//                        mod6_p2_edt1.setEnabled(true);
//                        mod6_p2_edt1.setBackgroundResource(R.drawable.cajas_de_texto);
//                    }
//
//                }
//            });

            ////////////////////////////////////
//            mod6_p3_edt1.setOnKeyListener(new View.OnKeyListener() {
//                @Override
//                public boolean onKey(View view, int keyCode, KeyEvent keyEvent) {
//                    if ((keyEvent.getAction() == KeyEvent.ACTION_DOWN) && (keyCode == KeyEvent.KEYCODE_ENTER)) {
//                        BaseDatos.C6_P3_1_1 = Integer.parseInt(mod6_p3_edt1.getText().toString());
//                        return true;
//                    }
//                    return false;
//                }
//            });
//            mod6_p3_edt2.setOnKeyListener(new View.OnKeyListener() {
//                @Override
//                public boolean onKey(View view, int keyCode, KeyEvent keyEvent) {
//                    if ((keyEvent.getAction() == KeyEvent.ACTION_DOWN) && (keyCode == KeyEvent.KEYCODE_ENTER)) {
//                        BaseDatos.C6_P3_1_2 = Integer.parseInt(mod6_p3_edt2.getText().toString());
//                        return true;
//                    }
//                    return false;
//                }
//            });
//
//            mod6_p3_edt3.setOnKeyListener(new View.OnKeyListener() {
//                @Override
//                public boolean onKey(View view, int keyCode, KeyEvent keyEvent) {
//                    if ((keyEvent.getAction() == KeyEvent.ACTION_DOWN) && (keyCode == KeyEvent.KEYCODE_ENTER)) {
//                        BaseDatos.C6_P3_1_3 = Integer.parseInt(mod6_p3_edt3.getText().toString());
//                        return true;
//                    }
//                    return false;
//                }
//            });
//            mod6_p3_edt4.setOnKeyListener(new View.OnKeyListener() {
//                @Override
//                public boolean onKey(View view, int keyCode, KeyEvent keyEvent) {
//                    if ((keyEvent.getAction() == KeyEvent.ACTION_DOWN) && (keyCode == KeyEvent.KEYCODE_ENTER)) {
//                        BaseDatos.C6_P3_1_4= Integer.parseInt(mod6_p3_edt4.getText().toString());
//                        return true;
//                    }
//                    return false;
//                }
//            });
//            mod6_p3_edt5.setOnKeyListener(new View.OnKeyListener() {
//                @Override
//                public boolean onKey(View view, int keyCode, KeyEvent keyEvent) {
//                    if ((keyEvent.getAction() == KeyEvent.ACTION_DOWN) && (keyCode == KeyEvent.KEYCODE_ENTER)) {
//                        BaseDatos.C6_P3_1_5 = Integer.parseInt(mod6_p3_edt5.getText().toString());
//                        return true;
//                    }
//                    return false;
//                }
//            });
//            mod6_p3_edt6.setOnKeyListener(new View.OnKeyListener() {
//                @Override
//                public boolean onKey(View view, int keyCode, KeyEvent keyEvent) {
//                    if ((keyEvent.getAction() == KeyEvent.ACTION_DOWN) && (keyCode == KeyEvent.KEYCODE_ENTER)) {
//                        BaseDatos.C6_P3_1_6 = Integer.parseInt(mod6_p3_edt6.getText().toString());
//                        return true;
//                    }
//                    return false;
//                }
//            });
//            mod6_p3_edt7.setOnKeyListener(new View.OnKeyListener() {
//                @Override
//                public boolean onKey(View view, int keyCode, KeyEvent keyEvent) {
//                    if ((keyEvent.getAction() == KeyEvent.ACTION_DOWN) && (keyCode == KeyEvent.KEYCODE_ENTER)) {
//                        BaseDatos.C6_P3_1_7= Integer.parseInt(mod6_p3_edt7.getText().toString());
//                        return true;
//                    }
//                    return false;
//                }
//            });
//            mod6_p3_edt8.setOnKeyListener(new View.OnKeyListener() {
//                @Override
//                public boolean onKey(View view, int keyCode, KeyEvent keyEvent) {
//                    if ((keyEvent.getAction() == KeyEvent.ACTION_DOWN) && (keyCode == KeyEvent.KEYCODE_ENTER)) {
//                        BaseDatos.C6_P3_1_8 = Integer.parseInt(mod6_p3_edt8.getText().toString());
//                        return true;
//                    }
//                    return false;
//                }
//            });
//            mod6_p3_edt9.setOnKeyListener(new View.OnKeyListener() {
//                @Override
//                public boolean onKey(View view, int keyCode, KeyEvent keyEvent) {
//                    if ((keyEvent.getAction() == KeyEvent.ACTION_DOWN) && (keyCode == KeyEvent.KEYCODE_ENTER)) {
//                        BaseDatos.C6_P3_1_9 = Integer.parseInt(mod6_p3_edt9.getText().toString());
//                        return true;
//                    }
//                    return false;
//                }
//            });


        }
        cargarDatos();
        lytFragment6.requestFocus();
        /*-------------------------------------------------------------------------------------*/
    }


    public void ocultarTeclado(View view){
        InputMethodManager mgr = (InputMethodManager) getActivity().getSystemService(Context.INPUT_METHOD_SERVICE);
        mgr.hideSoftInputFromWindow(view.getWindowToken(), 0);
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
            //datos cabecera
            if (modulo6.getC6_P0_0().equals("1")) ckMismoInformante6.setChecked(true);
            if (modulo6.getC6_P0_0().equals("0")) ckMismoInformante6.setChecked(false);
            edtNombYApellidos6.setText(modulo6.getC6_P0_1());
            spCargo6.setSelection(Integer.parseInt(modulo6.getC6_P0_2()));
            edtEspecifiqueCargo6.setText(modulo6.getC6_P0_3());
            //pregunta 1
            if(!modulo6.getC6_P1().equals("") && (!modulo6.getC6_P1().equals("-1")))
            {int childPos1 = Integer.parseInt(modulo6.getC6_P1());
                ((RadioButton) mod6_p1_rgb.getChildAt(childPos1)).setChecked(true);}
            //pregunta 2
            if(!modulo6.getC6_P2().equals("") && (!modulo6.getC6_P2().equals("-1")))
            {int childPos2 = Integer.parseInt(modulo6.getC6_P2());
                ((RadioButton) mod6_p2_rgb.getChildAt(childPos2)).setChecked(true);
                mod6_p2_edt1.setText(modulo6.getC6_P2_1());
                mod6_p2_edt2.setText(modulo6.getC6_P2_2());
            }
            //pregunta 3
            if(!modulo6.getC6_P3().equals("") && (!modulo6.getC6_P3().equals("-1")))
            {int childPos3 = Integer.parseInt(modulo6.getC6_P3());
            ((RadioButton) mod6_p3_rgb.getChildAt(childPos3)).setChecked(true);}

            if (modulo6.getC6_P3_1_1().equals("1")) mod6_p3_ck1.setChecked(true);
            if (modulo6.getC6_P3_1_1().equals("0")) mod6_p3_ck1.setChecked(false);
            if (modulo6.getC6_P3_1_2().equals("1")) mod6_p3_ck2.setChecked(true);
            if (modulo6.getC6_P3_1_2().equals("0")) mod6_p3_ck2.setChecked(false);
            if (modulo6.getC6_P3_1_3().equals("1")) mod6_p3_ck3.setChecked(true);
            if (modulo6.getC6_P3_1_3().equals("0")) mod6_p3_ck3.setChecked(false);
            if (modulo6.getC6_P3_1_4().equals("1")) mod6_p3_ck4.setChecked(true);
            if (modulo6.getC6_P3_1_4().equals("0")) mod6_p3_ck4.setChecked(false);
            if (modulo6.getC6_P3_1_5().equals("1")) mod6_p3_ck5.setChecked(true);
            if (modulo6.getC6_P3_1_5().equals("0")) mod6_p3_ck5.setChecked(false);
            if (modulo6.getC6_P3_1_6().equals("1")) mod6_p3_ck6.setChecked(true);
            if (modulo6.getC6_P3_1_6().equals("0")) mod6_p3_ck6.setChecked(false);
            if (modulo6.getC6_P3_1_7().equals("1")) mod6_p3_ck7.setChecked(true);
            if (modulo6.getC6_P3_1_7().equals("0")) mod6_p3_ck7.setChecked(false);
            if (modulo6.getC6_P3_1_8().equals("1")) mod6_p3_ck8.setChecked(true);
            if (modulo6.getC6_P3_1_8().equals("0")) mod6_p3_ck8.setChecked(false);
            if (modulo6.getC6_P3_1_9().equals("1")) mod6_p3_ck9.setChecked(true);
            if (modulo6.getC6_P3_1_9().equals("0")) mod6_p3_ck9.setChecked(false);
            //mod6_p3_.setText(modulo6.getC6_P3_1_10());
            //Toast.makeText(context, modulo6.getC6_P3_2_1()+"", Toast.LENGTH_SHORT).show();
            mod6_p3_edt1.setText(modulo6.getC6_P3_2_1());
            mod6_p3_edt2.setText(modulo6.getC6_P3_2_2());
            mod6_p3_edt3.setText(modulo6.getC6_P3_2_3());
            mod6_p3_edt4.setText(modulo6.getC6_P3_2_4());
            mod6_p3_edt5.setText(modulo6.getC6_P3_2_5());
            mod6_p3_edt6.setText(modulo6.getC6_P3_2_6());
            mod6_p3_edt7.setText(modulo6.getC6_P3_2_7());
            mod6_p3_edt8.setText(modulo6.getC6_P3_2_8());
            mod6_p3_edt9.setText(modulo6.getC6_P3_2_9());


        }
        data.close();
    }

    public void llenarMapaVariables() {
        //preguntas cabecera
        if (ckMismoInformante6.isChecked()) C6_P0_0 = 1;
        else C6_P0_0 = 0;
        C6_P0_1 = edtNombYApellidos6.getText().toString();
        C6_P0_2 = spCargo6.getSelectedItemPosition();
        C6_P0_3 = edtEspecifiqueCargo6.getText().toString();
        //pregunta 1
        int childPosP1 = mod6_p1_rgb.indexOfChild(mod6_p1_rgb.findViewById(mod6_p1_rgb.getCheckedRadioButtonId()));
        C6_P1 = childPosP1;
        //pregunta 2
        int childPosP2 = mod6_p2_rgb.indexOfChild(mod6_p2_rgb.findViewById(mod6_p2_rgb.getCheckedRadioButtonId()));
        C6_P2 = childPosP2;
        if(!mod6_p2_edt1.getText().toString().equals("")){
        C6_P2_1 = Integer.parseInt(mod6_p2_edt1.getText().toString());}
        if(!mod6_p2_edt2.getText().toString().equals("")){
        C6_P2_2 = Integer.parseInt(mod6_p2_edt2.getText().toString());}
        //pregunta 3
        int childPosP3 = mod6_p3_rgb.indexOfChild(mod6_p3_rgb.findViewById(mod6_p3_rgb.getCheckedRadioButtonId()));
        C6_P3 = childPosP3;
        if (mod6_p3_ck1.isChecked()) C6_P3_1_1 = 1;
        else C6_P3_1_1 = 0;
        if (mod6_p3_ck2.isChecked()) C6_P3_1_2 = 1;
        else C6_P3_1_2 = 0;
        if (mod6_p3_ck3.isChecked()) C6_P3_1_3 = 1;
        else C6_P3_1_3 = 0;
        if (mod6_p3_ck4.isChecked()) C6_P3_1_4 = 1;
        else C6_P3_1_4 = 0;
        if (mod6_p3_ck5.isChecked()) C6_P3_1_5 = 1;
        else C6_P3_1_5 = 0;
        if (mod6_p3_ck6.isChecked()) C6_P3_1_6 = 1;
        else C6_P3_1_6 = 0;
        if (mod6_p3_ck7.isChecked()) C6_P3_1_7 = 1;
        else C6_P3_1_7 = 0;
        if (mod6_p3_ck8.isChecked()) C6_P3_1_8 = 1;
        else C6_P3_1_8 = 0;
        if (mod6_p3_ck9.isChecked()) C6_P3_1_9 = 1;
        else C6_P3_1_9 = 0;

        C6_P3_1_10 = mod6_p3_edt1.getText().toString();


        if(mod6_p3_edt1.getText().toString().equals("")){
            C6_P3_2_1 = "0";
        }
        if(mod6_p3_edt2.getText().toString().equals("")){
            C6_P3_2_2 = "0";
        }
        if(mod6_p3_edt3.getText().toString().equals("")){
            C6_P3_2_3 = "0";
        }
        if(mod6_p3_edt4.getText().toString().equals("")){
            C6_P3_2_4="0";
        }
        if(mod6_p3_edt5.getText().toString().equals("")){
            C6_P3_2_5 = "0";
        }
        if(mod6_p3_edt6.getText().toString().equals("")){
            C6_P3_2_6 = "0";
        }
        if(mod6_p3_edt7.getText().toString().equals("")){
            C6_P3_2_7 = "0";
        }
        if(mod6_p3_edt8.getText().toString().equals("")){
            C6_P3_2_8 = "0";
        }
        if(mod6_p3_edt9.getText().toString().equals("")){
            C6_P3_2_9 = "0";
        }

        if(!mod6_p3_edt1.getText().toString().equals("")){
        C6_P3_2_1 = mod6_p3_edt1.getText().toString();
    }
        if(!mod6_p3_edt2.getText().toString().equals("")){
        C6_P3_2_2 = mod6_p3_edt2.getText().toString();
    }
        if(!mod6_p3_edt3.getText().toString().equals("")){
        C6_P3_2_3 = mod6_p3_edt3.getText().toString();
    }
        if(!mod6_p3_edt4.getText().toString().equals("")){
        C6_P3_2_4 = mod6_p3_edt4.getText().toString();
    }
        if(!mod6_p3_edt5.getText().toString().equals("")){
        C6_P3_2_5 = mod6_p3_edt5.getText().toString();
    }
        if(!mod6_p3_edt6.getText().toString().equals("")){
        C6_P3_2_6 = mod6_p3_edt6.getText().toString();
    }
        if(!mod6_p3_edt7.getText().toString().equals("")){
        C6_P3_2_7 = mod6_p3_edt7.getText().toString();
    }
        if(!mod6_p3_edt8.getText().toString().equals("")){
        C6_P3_2_8 = mod6_p3_edt8.getText().toString();
    }
        if(!mod6_p3_edt9.getText().toString().equals("")){
        C6_P3_2_9 = mod6_p3_edt9.getText().toString();
     }



        //if(!mod6_p3_tv10.getText().toString().equals("")){
        //C6_P3_2_10 = Integer.parseInt(mod6_p3_tv10.getText().toString());}



    }

    public void guardarDatos() {
        data = new Data(context);
        data.open();
        if (data.existeModulo6(idempresa)) {
            ContentValues contentValues = new ContentValues(478);
            contentValues.put(SQLConstantes.MODULO6_P0_0, C6_P0_0 + "");
            contentValues.put(SQLConstantes.MODULO6_P0_1, C6_P0_1);
            contentValues.put(SQLConstantes.MODULO6_P0_2, C6_P0_2 + "");
            contentValues.put(SQLConstantes.MODULO6_P0_3, C6_P0_3);
            contentValues.put(SQLConstantes.MODULO6_P1, C6_P1 + "");
            contentValues.put(SQLConstantes.MODULO6_P2, C6_P2 + "");
            contentValues.put(SQLConstantes.MODULO6_P2_1, C6_P2_1+"");
            contentValues.put(SQLConstantes.MODULO6_P2_2, C6_P2_2+"");
            contentValues.put(SQLConstantes.MODULO6_P3, C6_P3 + "");
            contentValues.put(SQLConstantes.MODULO6_P3_1_1, C6_P3_1_1 + "");
            contentValues.put(SQLConstantes.MODULO6_P3_1_2, C6_P3_1_2 + "");
            contentValues.put(SQLConstantes.MODULO6_P3_1_3, C6_P3_1_3 + "");
            contentValues.put(SQLConstantes.MODULO6_P3_1_4, C6_P3_1_4 + "");
            contentValues.put(SQLConstantes.MODULO6_P3_1_5, C6_P3_1_5 + "");
            contentValues.put(SQLConstantes.MODULO6_P3_1_6, C6_P3_1_6 + "");
            contentValues.put(SQLConstantes.MODULO6_P3_1_7, C6_P3_1_7 + "");
            contentValues.put(SQLConstantes.MODULO6_P3_1_8, C6_P3_1_8 + "");
            contentValues.put(SQLConstantes.MODULO6_P3_1_9, C6_P3_1_9 + "");
            contentValues.put(SQLConstantes.MODULO6_P3_1_10, C6_P3_1_10);
            contentValues.put(SQLConstantes.MODULO6_P3_2_1, C6_P3_2_1);
            contentValues.put(SQLConstantes.MODULO6_P3_2_2, C6_P3_2_2);
            contentValues.put(SQLConstantes.MODULO6_P3_2_3, C6_P3_2_3);
            contentValues.put(SQLConstantes.MODULO6_P3_2_4, C6_P3_2_4);
            contentValues.put(SQLConstantes.MODULO6_P3_2_5, C6_P3_2_5);
            contentValues.put(SQLConstantes.MODULO6_P3_2_6, C6_P3_2_6);
            contentValues.put(SQLConstantes.MODULO6_P3_2_7, C6_P3_2_7);
            contentValues.put(SQLConstantes.MODULO6_P3_2_8, C6_P3_2_8);
            contentValues.put(SQLConstantes.MODULO6_P3_2_9, C6_P3_2_9);
            data.actualizarModulo6(idempresa, contentValues);
        } else {
            //si no existe el elemento, lo construye para insertarlo
            modulo6 = new Modulo6();
            //llena el objeto a insertar
            modulo6.setMODULO6_ID(idempresa);
            modulo6.setC6_P0_0(C6_P0_0 + "");
            modulo6.setC6_P0_1(C6_P0_1);
            modulo6.setC6_P0_2(C6_P0_2 + "");
            modulo6.setC6_P0_3(C6_P0_3);
            modulo6.setC6_P1(C6_P1 + "");
            modulo6.setC6_P2(C6_P2 + "");
            modulo6.setC6_P2_1(C6_P2_1+"");
            modulo6.setC6_P2_2(C6_P2_2+"");
            modulo6.setC6_P3(C6_P3 + "");
            modulo6.setC6_P3_1_1(C6_P3_1_1 + "");
            modulo6.setC6_P3_1_2(C6_P3_1_2 + "");
            modulo6.setC6_P3_1_3(C6_P3_1_3 + "");
            modulo6.setC6_P3_1_4(C6_P3_1_4 + "");
            modulo6.setC6_P3_1_5(C6_P3_1_5 + "");
            modulo6.setC6_P3_1_6(C6_P3_1_6 + "");
            modulo6.setC6_P3_1_7(C6_P3_1_7 + "");
            modulo6.setC6_P3_1_8(C6_P3_1_8 + "");
            modulo6.setC6_P3_1_9(C6_P3_1_9 + "");
            modulo6.setC6_P3_1_10(C6_P3_1_10);
            modulo6.setC6_P3_2_1(C6_P3_2_1);
            //Toast.makeText(context, C6_P3_2_1+"", Toast.LENGTH_SHORT).show();
            modulo6.setC6_P3_2_2(C6_P3_2_2);
            modulo6.setC6_P3_2_3(C6_P3_2_3);
            modulo6.setC6_P3_2_4(C6_P3_2_4);
            modulo6.setC6_P3_2_5(C6_P3_2_5);
            modulo6.setC6_P3_2_6(C6_P3_2_6);
            modulo6.setC6_P3_2_7(C6_P3_2_7);
            modulo6.setC6_P3_2_8(C6_P3_2_8);
            modulo6.setC6_P3_2_9(C6_P3_2_9);

            data.insertarModulo6(modulo6);
        }

        int suma = 0;
        if(!mod6_p3_edt1.getText().toString().equals("")){
            suma = suma + Integer.parseInt(mod6_p3_edt1.getText().toString());
        }
        if(!mod6_p3_edt2.getText().toString().equals("")){
            suma = suma + Integer.parseInt(mod6_p3_edt2.getText().toString());
        }
        if(!mod6_p3_edt3.getText().toString().equals("")){
            suma = suma + Integer.parseInt( mod6_p3_edt3.getText().toString());
        }
        if(!mod6_p3_edt4.getText().toString().equals("")){
            suma = suma + Integer.parseInt(mod6_p3_edt4.getText().toString());
        }
        if(!mod6_p3_edt5.getText().toString().equals("")){
            suma = suma + Integer.parseInt(mod6_p3_edt5.getText().toString());
        }
        if(!mod6_p3_edt6.getText().toString().equals("")){
            suma = suma + Integer.parseInt(mod6_p3_edt6.getText().toString());
        }
        if(!mod6_p3_edt7.getText().toString().equals("")){
            suma = suma + Integer.parseInt(mod6_p3_edt7.getText().toString());
        }
        if(!mod6_p3_edt8.getText().toString().equals("")){
            suma = suma + Integer.parseInt(mod6_p3_edt8.getText().toString());
        }
        if(!mod6_p3_edt9.getText().toString().equals("")){
            suma = suma + Integer.parseInt(mod6_p3_edt9.getText().toString());
        }

        Modulo2 modulo2 = data.getModulo2(idempresa);
        ContentValues f = new ContentValues(1);
        if(suma == Integer.parseInt(modulo2.getC2_P1())){
            f.put(SQLConstantes.FRAGMENT_HABILITADO,"0");
            ContentValues contentValues = new ContentValues(433);
            contentValues.put(SQLConstantes.MODULO6_P4_1_1,"");
            contentValues.put(SQLConstantes.MODULO6_P4_1_2, "");
            contentValues.put(SQLConstantes.MODULO6_P4_1_3, "");
            contentValues.put(SQLConstantes.MODULO6_P4_1_4, "");
            contentValues.put(SQLConstantes.MODULO6_P4_1_5, "");
            contentValues.put(SQLConstantes.MODULO6_P4_1_6,"");
            contentValues.put(SQLConstantes.MODULO6_P4_1_6_0,"");
            contentValues.put(SQLConstantes.MODULO6_P4_2_1,"");
            contentValues.put(SQLConstantes.MODULO6_P4_2_2,"");
            contentValues.put(SQLConstantes.MODULO6_P4_2_3,"");
            contentValues.put(SQLConstantes.MODULO6_P4_2_4,"");
            contentValues.put(SQLConstantes.MODULO6_P4_2_5,"");
            contentValues.put(SQLConstantes.MODULO6_P4_2_6,"");
            contentValues.put(SQLConstantes.MODULO6_P4_2_6_0,"");
            contentValues.put(SQLConstantes.MODULO6_P4_3_1, "");
            contentValues.put(SQLConstantes.MODULO6_P4_3_2, "");
            contentValues.put(SQLConstantes.MODULO6_P4_3_3,"");
            contentValues.put(SQLConstantes.MODULO6_P4_3_4,"");
            contentValues.put(SQLConstantes.MODULO6_P4_3_5,"");
            contentValues.put(SQLConstantes.MODULO6_P4_3_6,"");
            contentValues.put(SQLConstantes.MODULO6_P4_3_6_0,"");
            contentValues.put(SQLConstantes.MODULO6_P4_4_1,"");
            contentValues.put(SQLConstantes.MODULO6_P4_4_2,"");
            contentValues.put(SQLConstantes.MODULO6_P4_4_3,"");
            contentValues.put(SQLConstantes.MODULO6_P4_4_4, "");
            contentValues.put(SQLConstantes.MODULO6_P4_4_5,"");
            contentValues.put(SQLConstantes.MODULO6_P4_4_6, "");
            contentValues.put(SQLConstantes.MODULO6_P4_4_6_0,"");
            contentValues.put(SQLConstantes.MODULO6_P4_5_1,"");
            contentValues.put(SQLConstantes.MODULO6_P4_5_2,"");
            contentValues.put(SQLConstantes.MODULO6_P4_5_3,"");
            contentValues.put(SQLConstantes.MODULO6_P4_5_4,"");
            contentValues.put(SQLConstantes.MODULO6_P4_5_5, "");
            contentValues.put(SQLConstantes.MODULO6_P4_5_6, "");
            contentValues.put(SQLConstantes.MODULO6_P4_5_6_0,"");
            contentValues.put(SQLConstantes.MODULO6_P4_6_1,"");
            contentValues.put(SQLConstantes.MODULO6_P4_6_2, "");
            contentValues.put(SQLConstantes.MODULO6_P4_6_3,"");
            contentValues.put(SQLConstantes.MODULO6_P4_6_4,"");
            contentValues.put(SQLConstantes.MODULO6_P4_6_5,"");
            contentValues.put(SQLConstantes.MODULO6_P4_6_6,"");
            contentValues.put(SQLConstantes.MODULO6_P4_6_6_0,"");
            contentValues.put(SQLConstantes.MODULO6_P4_7_1,"");
            contentValues.put(SQLConstantes.MODULO6_P4_7_2,"");
            contentValues.put(SQLConstantes.MODULO6_P4_7_3, "");
            contentValues.put(SQLConstantes.MODULO6_P4_7_4, "");
            contentValues.put(SQLConstantes.MODULO6_P4_7_5, "");
            contentValues.put(SQLConstantes.MODULO6_P4_7_6, "");
            contentValues.put(SQLConstantes.MODULO6_P4_7_6_0,"");
            contentValues.put(SQLConstantes.MODULO6_P4_8_1,"");
            contentValues.put(SQLConstantes.MODULO6_P4_8_2,"");
            contentValues.put(SQLConstantes.MODULO6_P4_8_3, "");
            contentValues.put(SQLConstantes.MODULO6_P4_8_4,"");
            contentValues.put(SQLConstantes.MODULO6_P4_8_5, "");
            contentValues.put(SQLConstantes.MODULO6_P4_8_6, "");
            contentValues.put(SQLConstantes.MODULO6_P4_8_6_0,"");
            contentValues.put(SQLConstantes.MODULO6_P4_9_1,"");
            contentValues.put(SQLConstantes.MODULO6_P4_9_2,"");
            contentValues.put(SQLConstantes.MODULO6_P4_9_3, "");
            contentValues.put(SQLConstantes.MODULO6_P4_9_4, "");
            contentValues.put(SQLConstantes.MODULO6_P4_9_5, "");
            contentValues.put(SQLConstantes.MODULO6_P4_9_6, "");
            contentValues.put(SQLConstantes.MODULO6_P4_9_6_0,"");
            contentValues.put(SQLConstantes.MODULO6_P5_1_1,"");
            contentValues.put(SQLConstantes.MODULO6_P5_1_2, "");
            contentValues.put(SQLConstantes.MODULO6_P5_1_3, "");
            contentValues.put(SQLConstantes.MODULO6_P5_1_4, "");
            contentValues.put(SQLConstantes.MODULO6_P5_1_5, "");
            contentValues.put(SQLConstantes.MODULO6_P5_1_6,"");
            contentValues.put(SQLConstantes.MODULO6_P5_1_7,"");
            contentValues.put(SQLConstantes.MODULO6_P5_1_8,"");
            contentValues.put(SQLConstantes.MODULO6_P5_1_9,"");
            contentValues.put(SQLConstantes.MODULO6_P5_1_10,"");
            contentValues.put(SQLConstantes.MODULO6_P5_1_11,"");
            contentValues.put(SQLConstantes.MODULO6_P5_1_12,"");
            contentValues.put(SQLConstantes.MODULO6_P5_1_13,"");
            contentValues.put(SQLConstantes.MODULO6_P5_1_14,"");
            contentValues.put(SQLConstantes.MODULO6_P5_1_15,"");
            contentValues.put(SQLConstantes.MODULO6_P5_1_16,"");
            contentValues.put(SQLConstantes.MODULO6_P5_1_17,"");
            contentValues.put(SQLConstantes.MODULO6_P5_1_18,"");
            contentValues.put(SQLConstantes.MODULO6_P5_1_19,"");
            contentValues.put(SQLConstantes.MODULO6_P5_1_19_0,"");
            contentValues.put(SQLConstantes.MODULO6_P5_1_20,"");
            contentValues.put(SQLConstantes.MODULO6_P5_2_1,"");
            contentValues.put(SQLConstantes.MODULO6_P5_2_2,"");
            contentValues.put(SQLConstantes.MODULO6_P5_2_3,"");
            contentValues.put(SQLConstantes.MODULO6_P5_2_4,"");
            contentValues.put(SQLConstantes.MODULO6_P5_2_5,"");
            contentValues.put(SQLConstantes.MODULO6_P5_2_6,"");
            contentValues.put(SQLConstantes.MODULO6_P5_2_7,"");
            contentValues.put(SQLConstantes.MODULO6_P5_2_8,"");
            contentValues.put(SQLConstantes.MODULO6_P5_2_9,"");
            contentValues.put(SQLConstantes.MODULO6_P5_2_10,"");
            contentValues.put(SQLConstantes.MODULO6_P5_2_11,"");
            contentValues.put(SQLConstantes.MODULO6_P5_2_12,"");
            contentValues.put(SQLConstantes.MODULO6_P5_2_13,"");
            contentValues.put(SQLConstantes.MODULO6_P5_2_14,"");
            contentValues.put(SQLConstantes.MODULO6_P5_2_15,"");
            contentValues.put(SQLConstantes.MODULO6_P5_2_16,"");
            contentValues.put(SQLConstantes.MODULO6_P5_2_17,"");
            contentValues.put(SQLConstantes.MODULO6_P5_2_18,"");
            contentValues.put(SQLConstantes.MODULO6_P5_2_19,"");
            contentValues.put(SQLConstantes.MODULO6_P5_2_19_0,"");
            contentValues.put(SQLConstantes.MODULO6_P5_2_20,"");
            contentValues.put(SQLConstantes.MODULO6_P5_3_1,"");
            contentValues.put(SQLConstantes.MODULO6_P5_3_2,"");
            contentValues.put(SQLConstantes.MODULO6_P5_3_3,"");
            contentValues.put(SQLConstantes.MODULO6_P5_3_4,"");
            contentValues.put(SQLConstantes.MODULO6_P5_3_5,"");
            contentValues.put(SQLConstantes.MODULO6_P5_3_6,"");
            contentValues.put(SQLConstantes.MODULO6_P5_3_7,"");
            contentValues.put(SQLConstantes.MODULO6_P5_3_8,"");
            contentValues.put(SQLConstantes.MODULO6_P5_3_9,"");
            contentValues.put(SQLConstantes.MODULO6_P5_3_10,"");
            contentValues.put(SQLConstantes.MODULO6_P5_3_11,"");
            contentValues.put(SQLConstantes.MODULO6_P5_3_12,"");
            contentValues.put(SQLConstantes.MODULO6_P5_3_13,"");
            contentValues.put(SQLConstantes.MODULO6_P5_3_14,"");
            contentValues.put(SQLConstantes.MODULO6_P5_3_15,"");
            contentValues.put(SQLConstantes.MODULO6_P5_3_16,"");
            contentValues.put(SQLConstantes.MODULO6_P5_3_17,"");
            contentValues.put(SQLConstantes.MODULO6_P5_3_18,"");
            contentValues.put(SQLConstantes.MODULO6_P5_3_19,"");
            contentValues.put(SQLConstantes.MODULO6_P5_3_19_0,"");
            contentValues.put(SQLConstantes.MODULO6_P5_3_20,"");
            contentValues.put(SQLConstantes.MODULO6_P5_4_1,"");
            contentValues.put(SQLConstantes.MODULO6_P5_4_2,"");
            contentValues.put(SQLConstantes.MODULO6_P5_4_3,"");
            contentValues.put(SQLConstantes.MODULO6_P5_4_4,"");
            contentValues.put(SQLConstantes.MODULO6_P5_4_5,"");
            contentValues.put(SQLConstantes.MODULO6_P5_4_6,"");
            contentValues.put(SQLConstantes.MODULO6_P5_4_7,"");
            contentValues.put(SQLConstantes.MODULO6_P5_4_8,"");
            contentValues.put(SQLConstantes.MODULO6_P5_4_9,"");
            contentValues.put(SQLConstantes.MODULO6_P5_4_10,"");
            contentValues.put(SQLConstantes.MODULO6_P5_4_11,"");
            contentValues.put(SQLConstantes.MODULO6_P5_4_12,"");
            contentValues.put(SQLConstantes.MODULO6_P5_4_13,"");
            contentValues.put(SQLConstantes.MODULO6_P5_4_14,"");
            contentValues.put(SQLConstantes.MODULO6_P5_4_15,"");
            contentValues.put(SQLConstantes.MODULO6_P5_4_16,"");
            contentValues.put(SQLConstantes.MODULO6_P5_4_17,"");
            contentValues.put(SQLConstantes.MODULO6_P5_4_18,"");
            contentValues.put(SQLConstantes.MODULO6_P5_4_19,"");
            contentValues.put(SQLConstantes.MODULO6_P5_4_19_0,"");
            contentValues.put(SQLConstantes.MODULO6_P5_4_20,"");
            contentValues.put(SQLConstantes.MODULO6_P5_5_1,"");
            contentValues.put(SQLConstantes.MODULO6_P5_5_2,"");
            contentValues.put(SQLConstantes.MODULO6_P5_5_3,"");
            contentValues.put(SQLConstantes.MODULO6_P5_5_4,"");
            contentValues.put(SQLConstantes.MODULO6_P5_5_5,"");
            contentValues.put(SQLConstantes.MODULO6_P5_5_6,"");
            contentValues.put(SQLConstantes.MODULO6_P5_5_7,"");
            contentValues.put(SQLConstantes.MODULO6_P5_5_8,"");
            contentValues.put(SQLConstantes.MODULO6_P5_5_9,"");
            contentValues.put(SQLConstantes.MODULO6_P5_5_10,"");
            contentValues.put(SQLConstantes.MODULO6_P5_5_11,"");
            contentValues.put(SQLConstantes.MODULO6_P5_5_12,"");
            contentValues.put(SQLConstantes.MODULO6_P5_5_13,"");
            contentValues.put(SQLConstantes.MODULO6_P5_5_14,"");
            contentValues.put(SQLConstantes.MODULO6_P5_5_15,"");
            contentValues.put(SQLConstantes.MODULO6_P5_5_16,"");
            contentValues.put(SQLConstantes.MODULO6_P5_5_17,"");
            contentValues.put(SQLConstantes.MODULO6_P5_5_18,"");
            contentValues.put(SQLConstantes.MODULO6_P5_5_19,"");
            contentValues.put(SQLConstantes.MODULO6_P5_5_19_0,"");
            contentValues.put(SQLConstantes.MODULO6_P5_5_20,"");
            contentValues.put(SQLConstantes.MODULO6_P5_6_1,"");
            contentValues.put(SQLConstantes.MODULO6_P5_6_2,"");
            contentValues.put(SQLConstantes.MODULO6_P5_6_3,"");
            contentValues.put(SQLConstantes.MODULO6_P5_6_4,"");
            contentValues.put(SQLConstantes.MODULO6_P5_6_5,"");
            contentValues.put(SQLConstantes.MODULO6_P5_6_6,"");
            contentValues.put(SQLConstantes.MODULO6_P5_6_7,"");
            contentValues.put(SQLConstantes.MODULO6_P5_6_8,"");
            contentValues.put(SQLConstantes.MODULO6_P5_6_9,"");
            contentValues.put(SQLConstantes.MODULO6_P5_6_10,"");
            contentValues.put(SQLConstantes.MODULO6_P5_6_11,"");
            contentValues.put(SQLConstantes.MODULO6_P5_6_12,"");
            contentValues.put(SQLConstantes.MODULO6_P5_6_13,"");
            contentValues.put(SQLConstantes.MODULO6_P5_6_14,"");
            contentValues.put(SQLConstantes.MODULO6_P5_6_15,"");
            contentValues.put(SQLConstantes.MODULO6_P5_6_16,"");
            contentValues.put(SQLConstantes.MODULO6_P5_6_17,"");
            contentValues.put(SQLConstantes.MODULO6_P5_6_18,"");
            contentValues.put(SQLConstantes.MODULO6_P5_6_19,"");
            contentValues.put(SQLConstantes.MODULO6_P5_6_19_0,"");
            contentValues.put(SQLConstantes.MODULO6_P5_6_20,"");
            contentValues.put(SQLConstantes.MODULO6_P5_7_1,"");
            contentValues.put(SQLConstantes.MODULO6_P5_7_2,"");
            contentValues.put(SQLConstantes.MODULO6_P5_7_3,"");
            contentValues.put(SQLConstantes.MODULO6_P5_7_4,"");
            contentValues.put(SQLConstantes.MODULO6_P5_7_5,"");
            contentValues.put(SQLConstantes.MODULO6_P5_7_6,"");
            contentValues.put(SQLConstantes.MODULO6_P5_7_7,"");
            contentValues.put(SQLConstantes.MODULO6_P5_7_8,"");
            contentValues.put(SQLConstantes.MODULO6_P5_7_9,"");
            contentValues.put(SQLConstantes.MODULO6_P5_7_10,"");
            contentValues.put(SQLConstantes.MODULO6_P5_7_11,"");
            contentValues.put(SQLConstantes.MODULO6_P5_7_12,"");
            contentValues.put(SQLConstantes.MODULO6_P5_7_13,"");
            contentValues.put(SQLConstantes.MODULO6_P5_7_14,"");
            contentValues.put(SQLConstantes.MODULO6_P5_7_15,"");
            contentValues.put(SQLConstantes.MODULO6_P5_7_16,"");
            contentValues.put(SQLConstantes.MODULO6_P5_7_17,"");
            contentValues.put(SQLConstantes.MODULO6_P5_7_18,"");
            contentValues.put(SQLConstantes.MODULO6_P5_7_19,"");
            contentValues.put(SQLConstantes.MODULO6_P5_7_19_0,"");
            contentValues.put(SQLConstantes.MODULO6_P5_7_20,"");
            contentValues.put(SQLConstantes.MODULO6_P5_8_1,"");
            contentValues.put(SQLConstantes.MODULO6_P5_8_2,"");
            contentValues.put(SQLConstantes.MODULO6_P5_8_3,"");
            contentValues.put(SQLConstantes.MODULO6_P5_8_4,"");
            contentValues.put(SQLConstantes.MODULO6_P5_8_5,"");
            contentValues.put(SQLConstantes.MODULO6_P5_8_6,"");
            contentValues.put(SQLConstantes.MODULO6_P5_8_7,"");
            contentValues.put(SQLConstantes.MODULO6_P5_8_8,"");
            contentValues.put(SQLConstantes.MODULO6_P5_8_9,"");
            contentValues.put(SQLConstantes.MODULO6_P5_8_10,"");
            contentValues.put(SQLConstantes.MODULO6_P5_8_11,"");
            contentValues.put(SQLConstantes.MODULO6_P5_8_12,"");
            contentValues.put(SQLConstantes.MODULO6_P5_8_13,"");
            contentValues.put(SQLConstantes.MODULO6_P5_8_14,"");
            contentValues.put(SQLConstantes.MODULO6_P5_8_15,"");
            contentValues.put(SQLConstantes.MODULO6_P5_8_16,"");
            contentValues.put(SQLConstantes.MODULO6_P5_8_17,"");
            contentValues.put(SQLConstantes.MODULO6_P5_8_18,"");
            contentValues.put(SQLConstantes.MODULO6_P5_8_19,"");
            contentValues.put(SQLConstantes.MODULO6_P5_8_19_0,"");
            contentValues.put(SQLConstantes.MODULO6_P5_8_20,"");
            contentValues.put(SQLConstantes.MODULO6_P5_9_1,"");
            contentValues.put(SQLConstantes.MODULO6_P5_9_2,"");
            contentValues.put(SQLConstantes.MODULO6_P5_9_3,"");
            contentValues.put(SQLConstantes.MODULO6_P5_9_4,"");
            contentValues.put(SQLConstantes.MODULO6_P5_9_5,"");
            contentValues.put(SQLConstantes.MODULO6_P5_9_6,"");
            contentValues.put(SQLConstantes.MODULO6_P5_9_7,"");
            contentValues.put(SQLConstantes.MODULO6_P5_9_8,"");
            contentValues.put(SQLConstantes.MODULO6_P5_9_9,"");
            contentValues.put(SQLConstantes.MODULO6_P5_9_10,"");
            contentValues.put(SQLConstantes.MODULO6_P5_9_11,"");
            contentValues.put(SQLConstantes.MODULO6_P5_9_12,"");
            contentValues.put(SQLConstantes.MODULO6_P5_9_13,"");
            contentValues.put(SQLConstantes.MODULO6_P5_9_14,"");
            contentValues.put(SQLConstantes.MODULO6_P5_9_15,"");
            contentValues.put(SQLConstantes.MODULO6_P5_9_16,"");
            contentValues.put(SQLConstantes.MODULO6_P5_9_17,"");
            contentValues.put(SQLConstantes.MODULO6_P5_9_18,"");
            contentValues.put(SQLConstantes.MODULO6_P5_9_19,"");
            contentValues.put(SQLConstantes.MODULO6_P5_9_19_0,"");
            contentValues.put(SQLConstantes.MODULO6_P5_9_20,"");
            contentValues.put(SQLConstantes.MODULO6_P6_1_1,"");
            contentValues.put(SQLConstantes.MODULO6_P6_1_2,"");
            contentValues.put(SQLConstantes.MODULO6_P6_1_3,"");
            contentValues.put(SQLConstantes.MODULO6_P6_1_4,"");
            contentValues.put(SQLConstantes.MODULO6_P6_1_5,"");
            contentValues.put(SQLConstantes.MODULO6_P6_1_6,"");
            contentValues.put(SQLConstantes.MODULO6_P6_1_7,"");
            contentValues.put(SQLConstantes.MODULO6_P6_1_8,"");
            contentValues.put(SQLConstantes.MODULO6_P6_1_9,"");
            contentValues.put(SQLConstantes.MODULO6_P6_2_1,"");
            contentValues.put(SQLConstantes.MODULO6_P6_2_2,"");
            contentValues.put(SQLConstantes.MODULO6_P6_2_3,"");
            contentValues.put(SQLConstantes.MODULO6_P6_2_4,"");
            contentValues.put(SQLConstantes.MODULO6_P6_2_5,"");
            contentValues.put(SQLConstantes.MODULO6_P6_2_6,"");
            contentValues.put(SQLConstantes.MODULO6_P6_2_7,"");
            contentValues.put(SQLConstantes.MODULO6_P6_2_8,"");
            contentValues.put(SQLConstantes.MODULO6_P6_2_9,"");
            contentValues.put(SQLConstantes.MODULO6_P6_3_1,"");
            contentValues.put(SQLConstantes.MODULO6_P6_3_2,"");
            contentValues.put(SQLConstantes.MODULO6_P6_3_3,"");
            contentValues.put(SQLConstantes.MODULO6_P6_3_4,"");
            contentValues.put(SQLConstantes.MODULO6_P6_3_5,"");
            contentValues.put(SQLConstantes.MODULO6_P6_3_6,"");
            contentValues.put(SQLConstantes.MODULO6_P6_3_7,"");
            contentValues.put(SQLConstantes.MODULO6_P6_3_8,"");
            contentValues.put(SQLConstantes.MODULO6_P6_3_9,"");
            contentValues.put(SQLConstantes.MODULO6_P6_4_1,"");
            contentValues.put(SQLConstantes.MODULO6_P6_4_2,"");
            contentValues.put(SQLConstantes.MODULO6_P6_4_3,"");
            contentValues.put(SQLConstantes.MODULO6_P6_4_4,"");
            contentValues.put(SQLConstantes.MODULO6_P6_4_5,"");
            contentValues.put(SQLConstantes.MODULO6_P6_4_6,"");
            contentValues.put(SQLConstantes.MODULO6_P6_4_7,"");
            contentValues.put(SQLConstantes.MODULO6_P6_4_8,"");
            contentValues.put(SQLConstantes.MODULO6_P6_4_9,"");
            contentValues.put(SQLConstantes.MODULO6_P6_5_1,"");
            contentValues.put(SQLConstantes.MODULO6_P6_5_2,"");
            contentValues.put(SQLConstantes.MODULO6_P6_5_3,"");
            contentValues.put(SQLConstantes.MODULO6_P6_5_4,"");
            contentValues.put(SQLConstantes.MODULO6_P6_5_5,"");
            contentValues.put(SQLConstantes.MODULO6_P6_5_6,"");
            contentValues.put(SQLConstantes.MODULO6_P6_5_7,"");
            contentValues.put(SQLConstantes.MODULO6_P6_5_8,"");
            contentValues.put(SQLConstantes.MODULO6_P6_5_9,"");
            contentValues.put(SQLConstantes.MODULO6_P6_6_1,"");
            contentValues.put(SQLConstantes.MODULO6_P6_6_2,"");
            contentValues.put(SQLConstantes.MODULO6_P6_6_3,"");
            contentValues.put(SQLConstantes.MODULO6_P6_6_4,"");
            contentValues.put(SQLConstantes.MODULO6_P6_6_5,"");
            contentValues.put(SQLConstantes.MODULO6_P6_6_6,"");
            contentValues.put(SQLConstantes.MODULO6_P6_6_7,"");
            contentValues.put(SQLConstantes.MODULO6_P6_6_8,"");
            contentValues.put(SQLConstantes.MODULO6_P6_6_9,"");
            contentValues.put(SQLConstantes.MODULO6_P6_7_1,"");
            contentValues.put(SQLConstantes.MODULO6_P6_7_2,"");
            contentValues.put(SQLConstantes.MODULO6_P6_7_3,"");
            contentValues.put(SQLConstantes.MODULO6_P6_7_4,"");
            contentValues.put(SQLConstantes.MODULO6_P6_7_5,"");
            contentValues.put(SQLConstantes.MODULO6_P6_7_6,"");
            contentValues.put(SQLConstantes.MODULO6_P6_7_7,"");
            contentValues.put(SQLConstantes.MODULO6_P6_7_8,"");
            contentValues.put(SQLConstantes.MODULO6_P6_7_9,"");
            contentValues.put(SQLConstantes.MODULO6_P6_8_1,"");
            contentValues.put(SQLConstantes.MODULO6_P6_8_2,"");
            contentValues.put(SQLConstantes.MODULO6_P6_8_3,"");
            contentValues.put(SQLConstantes.MODULO6_P6_8_4,"");
            contentValues.put(SQLConstantes.MODULO6_P6_8_5,"");
            contentValues.put(SQLConstantes.MODULO6_P6_8_6,"");
            contentValues.put(SQLConstantes.MODULO6_P6_8_7,"");
            contentValues.put(SQLConstantes.MODULO6_P6_8_8,"");
            contentValues.put(SQLConstantes.MODULO6_P6_8_9,"");
            contentValues.put(SQLConstantes.MODULO6_P6_9_1,"");
            contentValues.put(SQLConstantes.MODULO6_P6_9_2,"");
            contentValues.put(SQLConstantes.MODULO6_P6_9_3,"");
            contentValues.put(SQLConstantes.MODULO6_P6_9_4,"");
            contentValues.put(SQLConstantes.MODULO6_P6_9_5,"");
            contentValues.put(SQLConstantes.MODULO6_P6_9_6,"");
            contentValues.put(SQLConstantes.MODULO6_P6_9_7,"");
            contentValues.put(SQLConstantes.MODULO6_P6_9_8,"");
            contentValues.put(SQLConstantes.MODULO6_P6_9_9,"");
            contentValues.put(SQLConstantes.MODULO6_P7_1_1,"");
            contentValues.put(SQLConstantes.MODULO6_P7_1_2,"");
            contentValues.put(SQLConstantes.MODULO6_P7_1_3,"");
            contentValues.put(SQLConstantes.MODULO6_P7_1_4,"");
            contentValues.put(SQLConstantes.MODULO6_P7_1_5,"");
            contentValues.put(SQLConstantes.MODULO6_P7_1_6,"");
            contentValues.put(SQLConstantes.MODULO6_P7_1_7,"");
            contentValues.put(SQLConstantes.MODULO6_P7_1_8,"");
            contentValues.put(SQLConstantes.MODULO6_P7_1_9,"");
            contentValues.put(SQLConstantes.MODULO6_P7_1_10,"");
            contentValues.put(SQLConstantes.MODULO6_P7_2_1,"");
            contentValues.put(SQLConstantes.MODULO6_P7_2_2,"");
            contentValues.put(SQLConstantes.MODULO6_P7_2_3,"");
            contentValues.put(SQLConstantes.MODULO6_P7_2_4,"");
            contentValues.put(SQLConstantes.MODULO6_P7_2_5,"");
            contentValues.put(SQLConstantes.MODULO6_P7_2_6,"");
            contentValues.put(SQLConstantes.MODULO6_P7_2_7,"");
            contentValues.put(SQLConstantes.MODULO6_P7_2_8,"");
            contentValues.put(SQLConstantes.MODULO6_P7_2_9,"");
            contentValues.put(SQLConstantes.MODULO6_P7_2_10,"");
            contentValues.put(SQLConstantes.MODULO6_P7_3_1,"");
            contentValues.put(SQLConstantes.MODULO6_P7_3_2,"");
            contentValues.put(SQLConstantes.MODULO6_P7_3_3,"");
            contentValues.put(SQLConstantes.MODULO6_P7_3_4,"");
            contentValues.put(SQLConstantes.MODULO6_P7_3_5,"");
            contentValues.put(SQLConstantes.MODULO6_P7_3_6,"");
            contentValues.put(SQLConstantes.MODULO6_P7_3_7,"");
            contentValues.put(SQLConstantes.MODULO6_P7_3_8,"");
            contentValues.put(SQLConstantes.MODULO6_P7_3_9,"");
            contentValues.put(SQLConstantes.MODULO6_P7_3_10,"");
            contentValues.put(SQLConstantes.MODULO6_P7_4_1,"");
            contentValues.put(SQLConstantes.MODULO6_P7_4_2,"");
            contentValues.put(SQLConstantes.MODULO6_P7_4_3,"");
            contentValues.put(SQLConstantes.MODULO6_P7_4_4,"");
            contentValues.put(SQLConstantes.MODULO6_P7_4_5,"");
            contentValues.put(SQLConstantes.MODULO6_P7_4_6,"");
            contentValues.put(SQLConstantes.MODULO6_P7_4_7,"");
            contentValues.put(SQLConstantes.MODULO6_P7_4_8,"");
            contentValues.put(SQLConstantes.MODULO6_P7_4_9,"");
            contentValues.put(SQLConstantes.MODULO6_P7_4_10,"");
            contentValues.put(SQLConstantes.MODULO6_P7_5_1,"");
            contentValues.put(SQLConstantes.MODULO6_P7_5_2,"");
            contentValues.put(SQLConstantes.MODULO6_P7_5_3,"");
            contentValues.put(SQLConstantes.MODULO6_P7_5_4,"");
            contentValues.put(SQLConstantes.MODULO6_P7_5_5,"");
            contentValues.put(SQLConstantes.MODULO6_P7_5_6,"");
            contentValues.put(SQLConstantes.MODULO6_P7_5_7,"");
            contentValues.put(SQLConstantes.MODULO6_P7_5_8,"");
            contentValues.put(SQLConstantes.MODULO6_P7_5_9,"");
            contentValues.put(SQLConstantes.MODULO6_P7_5_10,"");
            contentValues.put(SQLConstantes.MODULO6_P7_6_1,"");
            contentValues.put(SQLConstantes.MODULO6_P7_6_2,"");
            contentValues.put(SQLConstantes.MODULO6_P7_6_3,"");
            contentValues.put(SQLConstantes.MODULO6_P7_6_4,"");
            contentValues.put(SQLConstantes.MODULO6_P7_6_5,"");
            contentValues.put(SQLConstantes.MODULO6_P7_6_6,"");
            contentValues.put(SQLConstantes.MODULO6_P7_6_7,"");
            contentValues.put(SQLConstantes.MODULO6_P7_6_8,"");
            contentValues.put(SQLConstantes.MODULO6_P7_6_9,"");
            contentValues.put(SQLConstantes.MODULO6_P7_6_10,"");
            contentValues.put(SQLConstantes.MODULO6_P7_7_1,"");
            contentValues.put(SQLConstantes.MODULO6_P7_7_2,"");
            contentValues.put(SQLConstantes.MODULO6_P7_7_3,"");
            contentValues.put(SQLConstantes.MODULO6_P7_7_4,"");
            contentValues.put(SQLConstantes.MODULO6_P7_7_5,"");
            contentValues.put(SQLConstantes.MODULO6_P7_7_6,"");
            contentValues.put(SQLConstantes.MODULO6_P7_7_7,"");
            contentValues.put(SQLConstantes.MODULO6_P7_7_8,"");
            contentValues.put(SQLConstantes.MODULO6_P7_7_9,"");
            contentValues.put(SQLConstantes.MODULO6_P7_7_10,"");
            contentValues.put(SQLConstantes.MODULO6_P7_8_1,"");
            contentValues.put(SQLConstantes.MODULO6_P7_8_2,"");
            contentValues.put(SQLConstantes.MODULO6_P7_8_3,"");
            contentValues.put(SQLConstantes.MODULO6_P7_8_4,"");
            contentValues.put(SQLConstantes.MODULO6_P7_8_5,"");
            contentValues.put(SQLConstantes.MODULO6_P7_8_6,"");
            contentValues.put(SQLConstantes.MODULO6_P7_8_7,"");
            contentValues.put(SQLConstantes.MODULO6_P7_8_8,"");
            contentValues.put(SQLConstantes.MODULO6_P7_8_9,"");
            contentValues.put(SQLConstantes.MODULO6_P7_8_10,"");
            contentValues.put(SQLConstantes.MODULO6_P7_9_1,"");
            contentValues.put(SQLConstantes.MODULO6_P7_9_2,"");
            contentValues.put(SQLConstantes.MODULO6_P7_9_3,"");
            contentValues.put(SQLConstantes.MODULO6_P7_9_4,"");
            contentValues.put(SQLConstantes.MODULO6_P7_9_5,"");
            contentValues.put(SQLConstantes.MODULO6_P7_9_6,"");
            contentValues.put(SQLConstantes.MODULO6_P7_9_7,"");
            contentValues.put(SQLConstantes.MODULO6_P7_9_8,"");
            contentValues.put(SQLConstantes.MODULO6_P7_9_9,"");
            contentValues.put(SQLConstantes.MODULO6_P7_9_10,"");
            contentValues.put(SQLConstantes.MODULO6_P8_1,"");
            contentValues.put(SQLConstantes.MODULO6_P8_2,"");
            contentValues.put(SQLConstantes.MODULO6_P8_3,"");
            contentValues.put(SQLConstantes.MODULO6_P8_4,"");
            contentValues.put(SQLConstantes.MODULO6_P8_5,"");
            contentValues.put(SQLConstantes.MODULO6_P8_6,"");
            contentValues.put(SQLConstantes.MODULO6_P8_7,"");
            contentValues.put(SQLConstantes.MODULO6_P8_8,"");
            contentValues.put(SQLConstantes.MODULO6_P8_9,"");
            data.actualizarModulo6(idempresa,contentValues);
        }else{
            f.put(SQLConstantes.FRAGMENT_HABILITADO,"1");
        }
        data.actualizarFragment(idempresa + TablaFragmentos.FRAGMENT_M6F2,f);
        data.actualizarFragment(idempresa + TablaFragmentos.FRAGMENT_M6F3,f);
        data.actualizarFragment(idempresa + TablaFragmentos.FRAGMENT_M6F4,f);
        data.actualizarFragment(idempresa + TablaFragmentos.FRAGMENT_M6F5,f);
        data.close();
    }

    public boolean validar() {
        boolean valido = true;
        llenarMapaVariables();
        boolean vC6_P0_1 = false;
        boolean vC6_P0_2 = false;
        boolean vC6_P0_3 = false;
        boolean vC6_P1 = false;
        boolean vC6_P2 = false;
        boolean vC6_P2_1 = false;
        boolean vC6_P3 = false;
        boolean vC6_P3_1 = false;
        boolean vC6_P3_2 = false;
        boolean vC6_P3_3 = false;
        boolean vC6_P3_4 = false;
        boolean vC6_P3_5 = false;
        boolean vC6_P3_6 = false;
        boolean vC6_P3_7 = false;
        boolean vC6_P3_8 = false;
        boolean vC6_P3_9 = false;

        //ASIGANCION DE VALORES
        if(C5_t1.equals(""))
        {C5_t1="0";}
        if(C5_t2.equals(""))
        {C5_t2="0";}
        if(C5_t3.equals(""))
        {C5_t3="0";}
        if(C5_t4.equals(""))
        {C5_t4="0";}
        if(C5_t5.equals(""))
        {C5_t5="0";}
        if(C5_t6.equals(""))
        {C5_t6="0";}
        if(C5_t7.equals(""))
        {C5_t7="0";}
        if(C5_t8.equals(""))
        {C5_t8="0";}
        if(C5_t9.equals(""))
        {C5_t9="0";}

        int numero1= Integer.parseInt(C5_t1) * Integer.parseInt(C2_p1)/100;
        int numero2= Integer.parseInt(C5_t2) * Integer.parseInt(C2_p1)/100;
        int numero3= Integer.parseInt(C5_t3) * Integer.parseInt(C2_p1)/100;
        int numero4= Integer.parseInt(C5_t4) * Integer.parseInt(C2_p1)/100;
        int numero5= Integer.parseInt(C5_t5) * Integer.parseInt(C2_p1)/100;
        int numero6= Integer.parseInt(C5_t6) * Integer.parseInt(C2_p1)/100;
        int numero7= Integer.parseInt(C5_t7) * Integer.parseInt(C2_p1)/100;
        int numero8= Integer.parseInt(C5_t8) * Integer.parseInt(C2_p1)/100;
        int numero9= Integer.parseInt(C5_t9) * Integer.parseInt(C2_p1)/100;

        /////


        //cabecera
        if(C6_P0_1.trim().length()<=3)
        {mostrarMensaje("Ingrese 'Apellidos y nombres del informante'");
            valido=false;
        }else
        if(C6_P0_2 ==0)
        {mostrarMensaje("Seleccione el cargo del informante");
            valido=false;
        }else
        if(C6_P0_2 == 4 && C6_P0_3.trim().length() <= 3)
        {mostrarMensaje("Debe registrar información valida en Especifique");
            valido=false;
        }else
        if(C6_P1 == -1 )
        {mostrarMensaje("Pregunta 1: Marque una opción ");
            valido=false;
        }else
        if(C6_P1 == 0 && C6_P2 == -1 )
        {mostrarMensaje("Pregunta 2: Marque una opción ");
            valido=false;
        }else
        if(C6_P2 == 0 && C6_P2_1 == 0 && C6_P2_2== 0 ) {
            mostrarMensaje("Pregunta 2: Debe registrar número o porcentaje  de trabajadores");
            valido = false;
        }else
        if(C6_P3 == -1 )
        {mostrarMensaje("Pregunta 3: Debe seleccionar N° personas ocupadas ");
            valido=false;
        }else
          if(C6_P3 == 0)
          {
              if ((!C5_t1.equals("0") && C6_P3_1_1 == 0 && C6_P3_2_1=="0") || (!C5_t1.equals("0") && C6_P3_1_1 == 1 && C6_P3_2_1=="0")) {
                  mostrarMensaje("Pregunta 3.1: Debe Ingresar número");
                  valido = false;
              } else if (Integer.parseInt(C6_P3_2_1) > Integer.parseInt(C5_t1)) {
                  mostrarMensaje("Pregunta 3.1: El número de trabajadores de este gran grupo ocupacional en el capítulo 5 es menor");
                  valido = false;
              } else if ((!C5_t2.equals("0") && C6_P3_1_2 == 0 && C6_P3_2_2=="0") || (!C5_t2.equals("0") && C6_P3_1_2 == 1 && C6_P3_2_2=="0")) {
                  mostrarMensaje("Pregunta 3.2: Debe Ingresar número");
                  valido = false;
              } else if (Integer.parseInt(C6_P3_2_2) > Integer.parseInt(C5_t2)) {
                  mostrarMensaje("Pregunta 3.2: El número de trabajadores de este gran grupo ocupacional en el capítulo 5 es menor");
                  valido = false;
              } else if ((!C5_t3.equals("0") && C6_P3_1_3 == 0 && C6_P3_2_3=="0") || (!C5_t3.equals("0") && C6_P3_1_3 == 1 && C6_P3_2_3=="0")) {
                  mostrarMensaje("Pregunta 3.3: Debe Ingresar número");
                  valido = false;
              } else if (Integer.parseInt(C6_P3_2_3) > Integer.parseInt(C5_t3)) {
                  mostrarMensaje("Pregunta 3.3: El número de trabajadores de este gran grupo ocupacional en el capítulo 5 es menor");
                  valido = false;
              } else if ((!C5_t4.equals("0") && C6_P3_1_4 == 0 && C6_P3_2_4=="0") || (!C5_t4.equals("0") && C6_P3_1_4 == 1 && C6_P3_2_4=="0")) {
                  mostrarMensaje("Pregunta 3.4: Debe Ingresar número");
                  valido = false;
              } else if (Integer.parseInt(C6_P3_2_4) > Integer.parseInt(C5_t4)) {
                  mostrarMensaje("Pregunta 3.4: El número de trabajadores de este gran grupo ocupacional en el capítulo 5 es menor");
                  valido = false;
              } else if ((!C5_t5.equals("0") && C6_P3_1_5 == 0 && C6_P3_2_5=="0") || (!C5_t5.equals("0") && C6_P3_1_5 == 1 && C6_P3_2_5=="0")) {
                  mostrarMensaje("Pregunta 3.5: Debe Ingresar número");
                  valido = false;
              } else if (Integer.parseInt(C6_P3_2_5) > Integer.parseInt(C5_t5)) {
                  mostrarMensaje("Pregunta 3.5: El número de trabajadores de este gran grupo ocupacional en el capítulo 5 es menor");
                  valido = false;
              } else if ((!C5_t6.equals("0") && C6_P3_1_6 == 0 && C6_P3_2_6=="0") || (!C5_t6.equals("0") && C6_P3_1_6 == 1 && C6_P3_2_6=="0")) {
                  mostrarMensaje("Pregunta 3.6: Debe Ingresar número");
                  valido = false;
              } else if (Integer.parseInt(C6_P3_2_6) > Integer.parseInt(C5_t6)) {
                  mostrarMensaje("Pregunta 3.6: El número de trabajadores de este gran grupo ocupacional en el capítulo 5 es menor");
                  valido = false;
              } else if ((!C5_t7.equals("0") && C6_P3_1_7 == 0 && C6_P3_2_7=="0") || (!C5_t7.equals("0") && C6_P3_1_7 == 1 && C6_P3_2_7=="0")) {
                  mostrarMensaje("Pregunta 3.7: Debe Ingresar número");
                  valido = false;
              } else if (Integer.parseInt(C6_P3_2_7) > Integer.parseInt(C5_t7)) {
                  mostrarMensaje("Pregunta 3.7: El número de trabajadores de este gran grupo ocupacional en el capítulo 5 es menor");
                  valido = false;
              } else if ((!C5_t8.equals("0") && C6_P3_1_8 == 0 && C6_P3_2_8=="0") || (!C5_t8.equals("0") && C6_P3_1_8 == 1 && C6_P3_2_8=="0")) {
                  mostrarMensaje("Pregunta 3.8: Debe Ingresar número");
                  valido = false;
              } else if (Integer.parseInt(C6_P3_2_8) > Integer.parseInt(C5_t8)) {
                  mostrarMensaje("Pregunta 3.8: El número de trabajadores de este gran grupo ocupacional en el capítulo 5 es menor");
                  valido = false;
              } else if ((!C5_t9.equals("0") && C6_P3_1_9 == 0 && C6_P3_2_9=="0") || (!C5_t9.equals("0") && C6_P3_1_9 == 1 && C6_P3_2_9=="0")) {
                  mostrarMensaje("Pregunta 3.9: Debe Ingresar número");
                  valido = false;
              } else if (Integer.parseInt(C6_P3_2_9) > Integer.parseInt(C5_t9)) {
                  mostrarMensaje("Pregunta 3.9: El número de trabajadores de este gran grupo ocupacional en el capítulo 5 es menor");
                  valido = false;
              }
          }
//          else
//
//        if(C6_P3 == 1)
//        {
//            if ((!C5_t1.equals("0") && C6_P3_1_1 == 0 && C6_P3_2_1.equals("-1")) || (!C5_t1.equals("0") && C6_P3_1_1 == 1 && C6_P3_2_1.equals("-1"))) {
//                mostrarMensaje("Pregunta 3.1: Debe Ingresar porcentaje ", Toast.LENGTH_SHORT).show();
//                valido = false;
//            } else if (Integer.parseInt(C6_P3_2_1) > 100) {
//                Toast.makeText(context, "Pregunta 3.1: Solo puede Ingresar Numeros del 1 al 100 (Porcentaje)", Toast.LENGTH_SHORT).show();
//                valido = false;
//            } else if ((!C5_t2.equals("0") && C6_P3_1_2 == 0 && C6_P3_2_2.equals("-1")) || (!C5_t2.equals("0") && C6_P3_1_2 == 1 && C6_P3_2_2.equals("-1"))) {
//                Toast.makeText(context, "Pregunta 3.2: Debe Ingresar porcentaje ", Toast.LENGTH_SHORT).show();
//                valido = false;
//            } else if (Integer.parseInt(C6_P3_2_2) > 100) {
//                Toast.makeText(context, "Pregunta 3.2: Solo puede Ingresar Numeros del 1 al 100 (Porcentaje)", Toast.LENGTH_SHORT).show();
//                valido = false;
//            } else if ((!C5_t3.equals("0") && C6_P3_1_3 == 0 && C6_P3_2_3.equals("-1")) || (!C5_t3.equals("0") && C6_P3_1_3 == 1 && C6_P3_2_3.equals("-1"))) {
//                Toast.makeText(context, "Pregunta 3.3: Debe Ingresar porcentaje ", Toast.LENGTH_SHORT).show();
//                valido = false;
//            } else if (Integer.parseInt(C6_P3_2_3) > 100) {
//                Toast.makeText(context, "Pregunta 3.3: Solo puede Ingresar Numeros del 1 al 100 (Porcentaje)", Toast.LENGTH_SHORT).show();
//                valido = false;
//            } else if ((!C5_t4.equals("0") && C6_P3_1_4 == 0 && C6_P3_2_4.equals("-1")) || (!C5_t4.equals("0") && C6_P3_1_4 == 1 && C6_P3_2_4.equals("-1"))) {
//                Toast.makeText(context, "Pregunta 3.4: Debe Ingresar porcentaje ", Toast.LENGTH_SHORT).show();
//                valido = false;
//            } else if (Integer.parseInt(C6_P3_2_4) > 100) {
//                Toast.makeText(context, "Pregunta 3.4: Solo puede Ingresar Numeros del 1 al 100 (Porcentaje)", Toast.LENGTH_SHORT).show();
//                valido = false;
//            } else if ((!C5_t5.equals("0") && C6_P3_1_5 == 0 && C6_P3_2_5.equals("-1")) || (!C5_t5.equals("0") && C6_P3_1_5 == 1 && C6_P3_2_5.equals("-1"))) {
//                Toast.makeText(context, "Pregunta 3.5: Debe Ingresar porcentaje ", Toast.LENGTH_SHORT).show();
//                valido = false;
//            } else if (Integer.parseInt(C6_P3_2_5) > 100) {
//                Toast.makeText(context, "Pregunta 3.5: Solo puede Ingresar Numeros del 1 al 100 (Porcentaje)", Toast.LENGTH_SHORT).show();
//                valido = false;
//            } else if ((!C5_t6.equals("0") && C6_P3_1_6 == 0 && C6_P3_2_6.equals("-1")) || (!C5_t6.equals("0") && C6_P3_1_6 == 1 && C6_P3_2_6.equals("-1"))) {
//                Toast.makeText(context, "Pregunta 3.6: Debe Ingresar porcentaje ", Toast.LENGTH_SHORT).show();
//                valido = false;
//            } else if (Integer.parseInt(C6_P3_2_6) > 100) {
//                Toast.makeText(context, "Pregunta 3.6: Solo puede Ingresar Numeros del 1 al 100 (Porcentaje)", Toast.LENGTH_SHORT).show();
//                valido = false;
//            } else if ((!C5_t7.equals("0") && C6_P3_1_7 == 0 && C6_P3_2_7.equals("-1")) || (!C5_t7.equals("0") && C6_P3_1_7 == 1 && C6_P3_2_7.equals("-1"))) {
//                Toast.makeText(context, "Pregunta 3.7: Debe Ingresar porcentaje ", Toast.LENGTH_SHORT).show();
//                valido = false;
//            } else if (Integer.parseInt(C6_P3_2_7) > 100) {
//                Toast.makeText(context, "Pregunta 3.7: Solo puede Ingresar Numeros del 1 al 100 (Porcentaje)", Toast.LENGTH_SHORT).show();
//                valido = false;
//            } else if ((!C5_t8.equals("0") && C6_P3_1_8 == 0 && C6_P3_2_8.equals("-1")) || (!C5_t8.equals("0") && C6_P3_1_8 == 1 && C6_P3_2_8.equals("-1"))) {
//                Toast.makeText(context, "Pregunta 3.8: Debe Ingresar porcentaje ", Toast.LENGTH_SHORT).show();
//                valido = false;
//            } else if (Integer.parseInt(C6_P3_2_8) > 100) {
//                Toast.makeText(context, "Pregunta 3.8: Solo puede Ingresar Numeros del 1 al 100 (Porcentaje)", Toast.LENGTH_SHORT).show();
//                valido = false;
//            } else if ((!C5_t9.equals("0") && C6_P3_1_9 == 0 && C6_P3_2_9.equals("-1")) || (!C5_t9.equals("0") && C6_P3_1_9 == 1 && C6_P3_2_9.equals("-1"))) {
//                Toast.makeText(context, "Pregunta 3.9: Debe Ingresar porcentaje ", Toast.LENGTH_SHORT).show();
//                valido = false;
//            } else if (Integer.parseInt(C6_P3_2_9) > 100) {
//                Toast.makeText(context, "Pregunta 3.9: Solo puede Ingresar Numeros del 1 al 100 (Porcentaje)", Toast.LENGTH_SHORT).show();
//                valido = false;
//            }
//        }


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
