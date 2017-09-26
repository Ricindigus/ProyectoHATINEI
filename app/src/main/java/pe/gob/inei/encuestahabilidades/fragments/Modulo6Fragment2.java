package pe.gob.inei.encuestahabilidades.fragments;

import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AlertDialog;
import android.text.InputFilter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import pe.gob.inei.encuestahabilidades.R;
import pe.gob.inei.encuestahabilidades.modelo.Data;
import pe.gob.inei.encuestahabilidades.modelo.SQLConstantes;
import pe.gob.inei.encuestahabilidades.pojos.BaseDatos;
import pe.gob.inei.encuestahabilidades.pojos.Modulo2;
import pe.gob.inei.encuestahabilidades.pojos.Modulo5;
import pe.gob.inei.encuestahabilidades.pojos.Modulo6;

/**
 * A simple {@link Fragment} subclass.
 */
public class Modulo6Fragment2 extends Fragment {

    private LinearLayout mod6_p4_lyt;
    private LinearLayout mod6_p4_ly1;
    private LinearLayout mod6_p4_ly2;
    private LinearLayout mod6_p4_ly3;
    private LinearLayout mod6_p4_ly4;
    private LinearLayout mod6_p4_ly5;
    private LinearLayout mod6_p4_ly6;
    private LinearLayout mod6_p4_ly7;
    private LinearLayout mod6_p4_ly8;
    private LinearLayout mod6_p4_ly9;
    private LinearLayout mod6_p4_lytCheckboxs;

    private TextView mod6_p4_1_txtOcupacion;
    private TextView mod6_p4_2_txtOcupacion;
    private TextView mod6_p4_3_txtOcupacion;
    private TextView mod6_p4_4_txtOcupacion;
    private TextView mod6_p4_5_txtOcupacion;
    private TextView mod6_p4_6_txtOcupacion;
    private TextView mod6_p4_7_txtOcupacion;
    private TextView mod6_p4_8_txtOcupacion;
    private TextView mod6_p4_9_txtOcupacion;

    private EditText mod6_p4_1_edt;
    private EditText mod6_p4_2_edt;
    private EditText mod6_p4_3_edt;
    private EditText mod6_p4_4_edt;
    private EditText mod6_p4_5_edt;
    private EditText mod6_p4_6_edt;
    private EditText mod6_p4_7_edt;
    private EditText mod6_p4_8_edt;
    private EditText mod6_p4_9_edt;


    private CheckBox mod6_p4_1_ck1;
    private CheckBox mod6_p4_1_ck2;
    private CheckBox mod6_p4_1_ck3;
    private CheckBox mod6_p4_1_ck4;
    private CheckBox mod6_p4_1_ck5;
    private CheckBox mod6_p4_1_ck6;

    private CheckBox mod6_p4_2_ck1;
    private CheckBox mod6_p4_2_ck2;
    private CheckBox mod6_p4_2_ck3;
    private CheckBox mod6_p4_2_ck4;
    private CheckBox mod6_p4_2_ck5;
    private CheckBox mod6_p4_2_ck6;

    private CheckBox mod6_p4_3_ck1;
    private CheckBox mod6_p4_3_ck2;
    private CheckBox mod6_p4_3_ck3;
    private CheckBox mod6_p4_3_ck4;
    private CheckBox mod6_p4_3_ck5;
    private CheckBox mod6_p4_3_ck6;

    private CheckBox mod6_p4_4_ck1;
    private CheckBox mod6_p4_4_ck2;
    private CheckBox mod6_p4_4_ck3;
    private CheckBox mod6_p4_4_ck4;
    private CheckBox mod6_p4_4_ck5;
    private CheckBox mod6_p4_4_ck6;

    private CheckBox mod6_p4_5_ck1;
    private CheckBox mod6_p4_5_ck2;
    private CheckBox mod6_p4_5_ck3;
    private CheckBox mod6_p4_5_ck4;
    private CheckBox mod6_p4_5_ck5;
    private CheckBox mod6_p4_5_ck6;


    private CheckBox mod6_p4_6_ck1;
    private CheckBox mod6_p4_6_ck2;
    private CheckBox mod6_p4_6_ck3;
    private CheckBox mod6_p4_6_ck4;
    private CheckBox mod6_p4_6_ck5;
    private CheckBox mod6_p4_6_ck6;

    private CheckBox mod6_p4_7_ck1;
    private CheckBox mod6_p4_7_ck2;
    private CheckBox mod6_p4_7_ck3;
    private CheckBox mod6_p4_7_ck4;
    private CheckBox mod6_p4_7_ck5;
    private CheckBox mod6_p4_7_ck6;


    private CheckBox mod6_p4_8_ck1;
    private CheckBox mod6_p4_8_ck2;
    private CheckBox mod6_p4_8_ck3;
    private CheckBox mod6_p4_8_ck4;
    private CheckBox mod6_p4_8_ck5;
    private CheckBox mod6_p4_8_ck6;


    private CheckBox mod6_p4_9_ck1;
    private CheckBox mod6_p4_9_ck2;
    private CheckBox mod6_p4_9_ck3;
    private CheckBox mod6_p4_9_ck4;
    private CheckBox mod6_p4_9_ck5;
    private CheckBox mod6_p4_9_ck6;
    //CARGADO Y GUARDADO
    private String idempresa;
    private Modulo2 modulo2;
    private Modulo6 modulo6;
    private Modulo5 modulo5;
    private Context context;
    private Data data;
    String C2_p1;
    String C6_p3;
    String C6_p3_11;
    String C6_p3_22;
    String C6_p3_33;
    String C6_p3_44;
    String C6_p3_55;
    String C6_p3_66;
    String C6_p3_77;
    String C6_p3_88;
    String C6_p3_99;
    String C6_p3_1;
    String C6_p3_2;
    String C6_p3_3;
    String C6_p3_4;
    String C6_p3_5;
    String C6_p3_6;
    String C6_p3_7;
    String C6_p3_8;
    String C6_p3_9;

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

    int C6_P4_1_1;
    int C6_P4_1_2;
    int C6_P4_1_3;
    int C6_P4_1_4;
    int C6_P4_1_5;
    int C6_P4_1_6;
    String C6_P4_1_6_0;
    int C6_P4_2_1;
    int C6_P4_2_2;
    int C6_P4_2_3;
    int C6_P4_2_4;
    int C6_P4_2_5;
    int C6_P4_2_6;
    String C6_P4_2_6_0;
    int C6_P4_3_1;
    int C6_P4_3_2;
    int C6_P4_3_3;
    int C6_P4_3_4;
    int C6_P4_3_5;
    int C6_P4_3_6;
    String C6_P4_3_6_0;
    int C6_P4_4_1;
    int C6_P4_4_2;
    int C6_P4_4_3;
    int C6_P4_4_4;
    int C6_P4_4_5;
    int C6_P4_4_6;
    String C6_P4_4_6_0;
    int C6_P4_5_1;
    int C6_P4_5_2;
    int C6_P4_5_3;
    int C6_P4_5_4;
    int C6_P4_5_5;
    int C6_P4_5_6;
    String C6_P4_5_6_0;
    int C6_P4_6_1;
    int C6_P4_6_2;
    int C6_P4_6_3;
    int C6_P4_6_4;
    int C6_P4_6_5;
    int C6_P4_6_6;
    String C6_P4_6_6_0;
    int C6_P4_7_1;
    int C6_P4_7_2;
    int C6_P4_7_3;
    int C6_P4_7_4;
    int C6_P4_7_5;
    int C6_P4_7_6;
    String C6_P4_7_6_0;
    int C6_P4_8_1;
    int C6_P4_8_2;
    int C6_P4_8_3;
    int C6_P4_8_4;
    int C6_P4_8_5;
    int C6_P4_8_6;
    String C6_P4_8_6_0;
    int C6_P4_9_1;
    int C6_P4_9_2;
    int C6_P4_9_3;
    int C6_P4_9_4;
    int C6_P4_9_5;
    int C6_P4_9_6;
    String C6_P4_9_6_0;



    public Modulo6Fragment2() {

        // Required empty public constructor
    }

    @SuppressLint("ValidFragment")
    public Modulo6Fragment2(String idempresa, Context context) {
        this.idempresa = idempresa;
        this.context = context;
        data = new Data(context);
        data.open();

        modulo6 = data.getModulo6(idempresa);
        C6_p3_11 = modulo6.getC6_P3_1_1();
        C6_p3_22 = modulo6.getC6_P3_1_2();
        C6_p3_33 = modulo6.getC6_P3_1_3();
        C6_p3_44 = modulo6.getC6_P3_1_4();
        C6_p3_55 = modulo6.getC6_P3_1_5();
        C6_p3_66 = modulo6.getC6_P3_1_6();
        C6_p3_77 = modulo6.getC6_P3_1_7();
        C6_p3_88 = modulo6.getC6_P3_1_8();
        C6_p3_99 = modulo6.getC6_P3_1_9();

        C6_p3_1 = modulo6.getC6_P3_2_1();
        C6_p3_2 = modulo6.getC6_P3_2_2();
        C6_p3_3 = modulo6.getC6_P3_2_3();
        C6_p3_4 = modulo6.getC6_P3_2_4();
        C6_p3_5 = modulo6.getC6_P3_2_5();
        C6_p3_6 = modulo6.getC6_P3_2_6();
        C6_p3_7 = modulo6.getC6_P3_2_7();
        C6_p3_8 = modulo6.getC6_P3_2_8();
        C6_p3_9 = modulo6.getC6_P3_2_9();

        modulo5 = data.getModulo5(idempresa);
        C5_t1=modulo5.getC5_P1_2_1();
        C5_t2=modulo5.getC5_P1_2_2();
        C5_t3=modulo5.getC5_P1_2_3();
        C5_t4=modulo5.getC5_P1_2_4();
        C5_t5=modulo5.getC5_P1_2_5();
        C5_t6=modulo5.getC5_P1_2_6();
        C5_t7=modulo5.getC5_P1_2_7();
        C5_t8=modulo5.getC5_P1_2_8();
        C5_t9=modulo5.getC5_P1_2_9();

        modulo2= data.getModulo2(idempresa);
        C2_p1= modulo2.getC2_P1();
        C6_p3= modulo6.getC6_P3();
        C5_p1=modulo5.getC5_P1();


//        if (!modulo6.getC6_P3_2_1().equals("") && !modulo6.getC6_P3_2_3().equals("-1"))
//        {C6_p3_1 = Integer.parseInt(modulo6.getC6_P3_2_1());}
//        if (!modulo6.getC6_P3_2_2().equals("") )
//        {C6_p3_2 = Integer.parseInt(modulo6.getC6_P3_2_2());}
//        if (!modulo6.getC6_P3_2_3().equals("") && !modulo6.getC6_P3_2_3().equals("0"))
//        {C6_p3_3 = Integer.parseInt(modulo6.getC6_P3_2_3());}
//        if (!modulo6.getC6_P3_2_4().equals("") && !modulo6.getC6_P3_2_4().equals("0"))
//        {C6_p3_4 = Integer.parseInt(modulo6.getC6_P3_2_4());}
//        if (!modulo6.getC6_P3_2_5().equals("") && !modulo6.getC6_P3_2_5().equals("0"))
//        {C6_p3_5 = Integer.parseInt(modulo6.getC6_P3_2_5());}
//        if (!modulo6.getC6_P3_2_6().equals("") && !modulo6.getC6_P3_2_6().equals("0"))
//        {C6_p3_6 = Integer.parseInt(modulo6.getC6_P3_2_6());}
//        if (!modulo6.getC6_P3_2_7().equals("") && !modulo6.getC6_P3_2_7().equals("0"))
//        {C6_p3_7 = Integer.parseInt(modulo6.getC6_P3_2_7());}
//        if (!modulo6.getC6_P3_2_8().equals("") && !modulo6.getC6_P3_2_8().equals("0"))
//        {C6_p3_8 = Integer.parseInt(modulo6.getC6_P3_2_8());}
//        if (!modulo6.getC6_P3_2_9().equals("") && !modulo6.getC6_P3_2_9().equals("0"))
//        {C6_p3_9 = Integer.parseInt(modulo6.getC6_P3_2_9());}

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_modulo6_fragment2, container, false);

        mod6_p4_lyt = (LinearLayout) rootView.findViewById(R.id.mod6_p4_lyt);
        mod6_p4_ly1 = (LinearLayout) rootView.findViewById(R.id.mod6_p4_ly1);
        mod6_p4_ly2 = (LinearLayout) rootView.findViewById(R.id.mod6_p4_ly2);
        mod6_p4_ly3 = (LinearLayout) rootView.findViewById(R.id.mod6_p4_ly3);
        mod6_p4_ly4 = (LinearLayout) rootView.findViewById(R.id.mod6_p4_ly4);
        mod6_p4_ly5 = (LinearLayout) rootView.findViewById(R.id.mod6_p4_ly5);
        mod6_p4_ly6 = (LinearLayout) rootView.findViewById(R.id.mod6_p4_ly6);
        mod6_p4_ly7 = (LinearLayout) rootView.findViewById(R.id.mod6_p4_ly7);
        mod6_p4_ly8 = (LinearLayout) rootView.findViewById(R.id.mod6_p4_ly8);
        mod6_p4_ly9 = (LinearLayout) rootView.findViewById(R.id.mod6_p4_ly9);

//        mod6_p4_lytCheckboxs = (LinearLayout) rootView.findViewById(R.id.mod6_p4_lytCheckboxs);
//
//        mod6_p4_1_txtOcupacion = (TextView) rootView.findViewById(R.id.mod6_p4_1_txtOcupacion);
//        mod6_p4_2_txtOcupacion = (TextView) rootView.findViewById(R.id.mod6_p4_2_txtOcupacion);
//        mod6_p4_3_txtOcupacion = (TextView) rootView.findViewById(R.id.mod6_p4_3_txtOcupacion);
//        mod6_p4_4_txtOcupacion = (TextView) rootView.findViewById(R.id.mod6_p4_4_txtOcupacion);
//        mod6_p4_5_txtOcupacion = (TextView) rootView.findViewById(R.id.mod6_p4_5_txtOcupacion);
//        mod6_p4_6_txtOcupacion = (TextView) rootView.findViewById(R.id.mod6_p4_6_txtOcupacion);
//        mod6_p4_7_txtOcupacion = (TextView) rootView.findViewById(R.id.mod6_p4_7_txtOcupacion);
//        mod6_p4_8_txtOcupacion = (TextView) rootView.findViewById(R.id.mod6_p4_8_txtOcupacion);
//        mod6_p4_9_txtOcupacion = (TextView) rootView.findViewById(R.id.mod6_p4_9_txtOcupacion);
//
        mod6_p4_1_edt = (EditText)rootView.findViewById(R.id.mod6_p4_1_edt);
        mod6_p4_2_edt = (EditText)rootView.findViewById(R.id.mod6_p4_2_edt);
        mod6_p4_3_edt = (EditText)rootView.findViewById(R.id.mod6_p4_3_edt);
        mod6_p4_4_edt = (EditText)rootView.findViewById(R.id.mod6_p4_4_edt);
        mod6_p4_5_edt = (EditText)rootView.findViewById(R.id.mod6_p4_5_edt);
        mod6_p4_6_edt = (EditText)rootView.findViewById(R.id.mod6_p4_6_edt);
        mod6_p4_7_edt = (EditText)rootView.findViewById(R.id.mod6_p4_7_edt);
        mod6_p4_8_edt = (EditText)rootView.findViewById(R.id.mod6_p4_8_edt);
        mod6_p4_9_edt = (EditText)rootView.findViewById(R.id.mod6_p4_9_edt);
//
//
        mod6_p4_1_ck1 = (CheckBox) rootView.findViewById(R.id.mod6_p4_1_ck1);
        mod6_p4_1_ck2 = (CheckBox) rootView.findViewById(R.id.mod6_p4_1_ck2);
        mod6_p4_1_ck3 = (CheckBox) rootView.findViewById(R.id.mod6_p4_1_ck3);
        mod6_p4_1_ck4 = (CheckBox) rootView.findViewById(R.id.mod6_p4_1_ck4);
        mod6_p4_1_ck5 = (CheckBox) rootView.findViewById(R.id.mod6_p4_1_ck5);
        mod6_p4_1_ck6 = (CheckBox) rootView.findViewById(R.id.mod6_p4_1_ck6);

        mod6_p4_2_ck1 = (CheckBox) rootView.findViewById(R.id.mod6_p4_2_ck1);
        mod6_p4_2_ck2 = (CheckBox) rootView.findViewById(R.id.mod6_p4_2_ck2);
        mod6_p4_2_ck3 = (CheckBox) rootView.findViewById(R.id.mod6_p4_2_ck3);
        mod6_p4_2_ck4 = (CheckBox) rootView.findViewById(R.id.mod6_p4_2_ck4);
        mod6_p4_2_ck5 = (CheckBox) rootView.findViewById(R.id.mod6_p4_2_ck5);
        mod6_p4_2_ck6 = (CheckBox) rootView.findViewById(R.id.mod6_p4_2_ck6);

        mod6_p4_3_ck1 = (CheckBox) rootView.findViewById(R.id.mod6_p4_3_ck1);
        mod6_p4_3_ck2 = (CheckBox) rootView.findViewById(R.id.mod6_p4_3_ck2);
        mod6_p4_3_ck3 = (CheckBox) rootView.findViewById(R.id.mod6_p4_3_ck3);
        mod6_p4_3_ck4 = (CheckBox) rootView.findViewById(R.id.mod6_p4_3_ck4);
        mod6_p4_3_ck5 = (CheckBox) rootView.findViewById(R.id.mod6_p4_3_ck5);
        mod6_p4_3_ck6 = (CheckBox) rootView.findViewById(R.id.mod6_p4_3_ck6);

        mod6_p4_4_ck1 = (CheckBox) rootView.findViewById(R.id.mod6_p4_4_ck1);
        mod6_p4_4_ck2 = (CheckBox) rootView.findViewById(R.id.mod6_p4_4_ck2);
        mod6_p4_4_ck3 = (CheckBox) rootView.findViewById(R.id.mod6_p4_4_ck3);
        mod6_p4_4_ck4 = (CheckBox) rootView.findViewById(R.id.mod6_p4_4_ck4);
        mod6_p4_4_ck5 = (CheckBox) rootView.findViewById(R.id.mod6_p4_4_ck5);
        mod6_p4_4_ck6 = (CheckBox) rootView.findViewById(R.id.mod6_p4_4_ck6);

        mod6_p4_5_ck1 = (CheckBox) rootView.findViewById(R.id.mod6_p4_5_ck1);
        mod6_p4_5_ck2 = (CheckBox) rootView.findViewById(R.id.mod6_p4_5_ck2);
        mod6_p4_5_ck3 = (CheckBox) rootView.findViewById(R.id.mod6_p4_5_ck3);
        mod6_p4_5_ck4 = (CheckBox) rootView.findViewById(R.id.mod6_p4_5_ck4);
        mod6_p4_5_ck5 = (CheckBox) rootView.findViewById(R.id.mod6_p4_5_ck5);
        mod6_p4_5_ck6 = (CheckBox) rootView.findViewById(R.id.mod6_p4_5_ck6);


        mod6_p4_6_ck1 = (CheckBox) rootView.findViewById(R.id.mod6_p4_6_ck1);
        mod6_p4_6_ck2 = (CheckBox) rootView.findViewById(R.id.mod6_p4_6_ck2);
        mod6_p4_6_ck3 = (CheckBox) rootView.findViewById(R.id.mod6_p4_6_ck3);
        mod6_p4_6_ck4 = (CheckBox) rootView.findViewById(R.id.mod6_p4_6_ck4);
        mod6_p4_6_ck5 = (CheckBox) rootView.findViewById(R.id.mod6_p4_6_ck5);
        mod6_p4_6_ck6 = (CheckBox) rootView.findViewById(R.id.mod6_p4_6_ck6);

        mod6_p4_7_ck1 = (CheckBox) rootView.findViewById(R.id.mod6_p4_7_ck1);
        mod6_p4_7_ck2 = (CheckBox) rootView.findViewById(R.id.mod6_p4_7_ck2);
        mod6_p4_7_ck3 = (CheckBox) rootView.findViewById(R.id.mod6_p4_7_ck3);
        mod6_p4_7_ck4 = (CheckBox) rootView.findViewById(R.id.mod6_p4_7_ck4);
        mod6_p4_7_ck5 = (CheckBox) rootView.findViewById(R.id.mod6_p4_7_ck5);
        mod6_p4_7_ck6 = (CheckBox) rootView.findViewById(R.id.mod6_p4_7_ck6);


        mod6_p4_8_ck1 = (CheckBox) rootView.findViewById(R.id.mod6_p4_8_ck1);
        mod6_p4_8_ck2 = (CheckBox) rootView.findViewById(R.id.mod6_p4_8_ck2);
        mod6_p4_8_ck3 = (CheckBox) rootView.findViewById(R.id.mod6_p4_8_ck3);
        mod6_p4_8_ck4 = (CheckBox) rootView.findViewById(R.id.mod6_p4_8_ck4);
        mod6_p4_8_ck5 = (CheckBox) rootView.findViewById(R.id.mod6_p4_8_ck5);
        mod6_p4_8_ck6 = (CheckBox) rootView.findViewById(R.id.mod6_p4_8_ck6);


        mod6_p4_9_ck1 = (CheckBox) rootView.findViewById(R.id.mod6_p4_9_ck1);
        mod6_p4_9_ck2 = (CheckBox) rootView.findViewById(R.id.mod6_p4_9_ck2);
        mod6_p4_9_ck3 = (CheckBox) rootView.findViewById(R.id.mod6_p4_9_ck3);
        mod6_p4_9_ck4 = (CheckBox) rootView.findViewById(R.id.mod6_p4_9_ck4);
        mod6_p4_9_ck5 = (CheckBox) rootView.findViewById(R.id.mod6_p4_9_ck5);
        mod6_p4_9_ck6 = (CheckBox) rootView.findViewById(R.id.mod6_p4_9_ck6);


       // Toast.makeText(getActivity().getApplicationContext(), C6_p3_1+"", Toast.LENGTH_SHORT).show();
        //MOSTRAR LAS OCUPACIONES  SELECCIONADAS
        //4.1.GERENTES
        validarPregunta(C6_p3_11,C5_t1,C6_p3_1,mod6_p4_ly1);

        //4.2.PROFESIONALES
        validarPregunta(C6_p3_22,C5_t2,C6_p3_2,mod6_p4_ly2);

        //4.3.TECNICOS
        validarPregunta(C6_p3_33,C5_t3,C6_p3_3,mod6_p4_ly3);

        //4.4.PERSONAL DE APOYO
        validarPregunta(C6_p3_44,C5_t4,C6_p3_4,mod6_p4_ly4);

        //4.5.PERSONAL DE SERVICIOS
        validarPregunta(C6_p3_55,C5_t5,C6_p3_5,mod6_p4_ly5);

        //4.6.TARBAJADORES CALIFICADOS
        validarPregunta(C6_p3_66,C5_t6,C6_p3_6,mod6_p4_ly6);

        //4.7.OFICIALES, OPERARIOS
        validarPregunta(C6_p3_77,C5_t7,C6_p3_7,mod6_p4_ly7);

        //4.8.OPERADORES DE INSTALACIONES
        validarPregunta(C6_p3_88,C5_t8,C6_p3_8,mod6_p4_ly8);

        //4.9.OCUPACIONES  ELEMENTALES
        validarPregunta(C6_p3_99,C5_t9,C6_p3_9,mod6_p4_ly9);

        return rootView;
    }

    @Override

    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

//        Toast.makeText(getActivity().getApplicationContext(), BaseDatos.C6_P3_1_1+"", Toast.LENGTH_SHORT).show();
//        if(BaseDatos.C6_P3_1_1>0) {
//            mod6_p4_ly1.setVisibility(View.VISIBLE);
//        }
//        else
//        {
//            mod6_p4_ly1.setVisibility(View.VISIBLE);
//        }
        //MAYUSCULAS
        mod6_p4_1_edt.setFilters(new InputFilter[]{new InputFilter.AllCaps()});
        mod6_p4_2_edt.setFilters(new InputFilter[]{new InputFilter.AllCaps()});
        mod6_p4_3_edt.setFilters(new InputFilter[]{new InputFilter.AllCaps()});
        mod6_p4_4_edt.setFilters(new InputFilter[]{new InputFilter.AllCaps()});
        mod6_p4_5_edt.setFilters(new InputFilter[]{new InputFilter.AllCaps()});
        mod6_p4_6_edt.setFilters(new InputFilter[]{new InputFilter.AllCaps()});
        mod6_p4_7_edt.setFilters(new InputFilter[]{new InputFilter.AllCaps()});
        mod6_p4_8_edt.setFilters(new InputFilter[]{new InputFilter.AllCaps()});
        mod6_p4_9_edt.setFilters(new InputFilter[]{new InputFilter.AllCaps()});

        //PREGUNTA 6-1

        mod6_p4_1_ck6.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

                if (b) {
                    mod6_p4_1_edt.setVisibility(View.VISIBLE);
                    mod6_p4_1_edt.requestFocus();
                    mod6_p4_1_edt.setBackgroundResource(R.drawable.caja_texto_enabled);

                } else {
                    mod6_p4_1_edt.setVisibility(View.GONE);
                    mod6_p4_1_edt.setText("");

                }
            }
        });



        //PREGUNTA 6-2
        mod6_p4_2_ck6.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

                if (b) {
                    mod6_p4_2_edt.setVisibility(View.VISIBLE);
                    mod6_p4_2_edt.requestFocus();
                    mod6_p4_2_edt.setBackgroundResource(R.drawable.caja_texto_enabled);

                } else {
                    mod6_p4_2_edt.setVisibility(View.GONE);
                    mod6_p4_2_edt.setText("");

                }
            }
        });


        //PREGUNTA 6-3
        mod6_p4_3_ck6.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

                if (b) {
                    mod6_p4_3_edt.setVisibility(View.VISIBLE);
                    mod6_p4_3_edt.requestFocus();
                    mod6_p4_3_edt.setBackgroundResource(R.drawable.caja_texto_enabled);

                } else {
                    mod6_p4_3_edt.setVisibility(View.GONE);
                    mod6_p4_3_edt.setText("");

                }
            }
        });


        //PREGUNTA 6-4
        mod6_p4_4_ck6.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

                if (b) {
                    mod6_p4_4_edt.setVisibility(View.VISIBLE);
                    mod6_p4_4_edt.requestFocus();
                    mod6_p4_4_edt.setBackgroundResource(R.drawable.caja_texto_enabled);

                } else {
                    mod6_p4_4_edt.setVisibility(View.GONE);
                    mod6_p4_4_edt.setText("");

                }
            }
        });


        //PREGUNTA 6-5
        mod6_p4_5_ck6.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

                if (b) {
                    mod6_p4_5_edt.setVisibility(View.VISIBLE);
                    mod6_p4_5_edt.requestFocus();
                    mod6_p4_5_edt.setBackgroundResource(R.drawable.caja_texto_enabled);

                } else {
                    mod6_p4_5_edt.setVisibility(View.GONE);
                    mod6_p4_5_edt.setText("");

                }
            }
        });



        //PREGUNTA 6-6
        mod6_p4_6_ck6.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

                if (b) {
                    mod6_p4_6_edt.setVisibility(View.VISIBLE);
                    mod6_p4_6_edt.requestFocus();
                    mod6_p4_6_edt.setBackgroundResource(R.drawable.caja_texto_enabled);

                } else {
                    mod6_p4_6_edt.setVisibility(View.GONE);
                    mod6_p4_6_edt.setText("");

                }
            }
        });


        //PREGUNTA 6-7
        mod6_p4_7_ck6.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

                if (b) {
                    mod6_p4_7_edt.setVisibility(View.VISIBLE);
                    mod6_p4_7_edt.requestFocus();
                    mod6_p4_7_edt.setBackgroundResource(R.drawable.caja_texto_enabled);

                } else {
                    mod6_p4_7_edt.setVisibility(View.GONE);
                    mod6_p4_7_edt.setText("");

                }
            }
        });



        //PREGUNTA 6-8
        mod6_p4_8_ck6.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

                if (b) {
                    mod6_p4_8_edt.setVisibility(View.VISIBLE);
                    mod6_p4_8_edt.requestFocus();
                    mod6_p4_8_edt.setBackgroundResource(R.drawable.caja_texto_enabled);

                } else {
                    mod6_p4_8_edt.setVisibility(View.GONE);
                    mod6_p4_8_edt.setText("");

                }
            }
        });


        //PREGUNTA 6-9
        mod6_p4_9_ck6.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

                if (b) {
                    mod6_p4_9_edt.setVisibility(View.VISIBLE);
                    mod6_p4_9_edt.requestFocus();
                    mod6_p4_9_edt.setBackgroundResource(R.drawable.caja_texto_enabled);

                } else {
                    mod6_p4_9_edt.setVisibility(View.GONE);
                    mod6_p4_9_edt.setText("");

                }
            }
        });

        cargarDatos();

    }

    public void validarPregunta(String check, String total, String competentes, LinearLayout layout){
        if(total!=null && competentes!=null && !total.equals("") && !competentes.equals("") ) {
            int competentesInt = Integer.parseInt(competentes);
            if(C5_p1.equals("0") && C6_p3.equals("0")){
                int totalInt = Integer.parseInt(total);
                if(totalInt>competentesInt && Integer.parseInt(check)==1){
                    layout.setVisibility(View.VISIBLE);
                }else{
                    layout.setVisibility(View.GONE);
                }
            }else if(C5_p1.equals("1") && C6_p3.equals("0")){
                int totalInt= Integer.parseInt(total) * Integer.parseInt(C2_p1)/100;
                if(totalInt>competentesInt && Integer.parseInt(check)==1){
                    layout.setVisibility(View.VISIBLE);
                }else{
                    layout.setVisibility(View.GONE);
                }
            }else if(C6_p3.equals("1") ){
                if( competentesInt < 100 && !total.equals("0") ){
                    layout.setVisibility(View.VISIBLE);
                }else{
                    layout.setVisibility(View.GONE);
                }
            }
        }else{
            layout.setVisibility(View.GONE);
        }
    }

    public void ocultarTeclado(View view){
        InputMethodManager mgr = (InputMethodManager) getActivity().getSystemService(Context.INPUT_METHOD_SERVICE);
        mgr.hideSoftInputFromWindow(view.getWindowToken(), 0);
    }
    public void mostrarTeclado(){
        InputMethodManager imm = (InputMethodManager) getActivity().getSystemService(getActivity().INPUT_METHOD_SERVICE);
        if (!imm.isAcceptingText()) {
            imm.toggleSoftInput(InputMethodManager.SHOW_FORCED, 0);
        }
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
            //pregunta 4.1
            if (modulo6.getC6_P4_1_1().equals("1")) mod6_p4_1_ck1.setChecked(true);if (modulo6.getC6_P4_1_1().equals("0")) mod6_p4_1_ck1.setChecked(false);
            if (modulo6.getC6_P4_1_2().equals("1")) mod6_p4_1_ck2.setChecked(true);if (modulo6.getC6_P4_1_2().equals("0")) mod6_p4_1_ck2.setChecked(false);
            if (modulo6.getC6_P4_1_3().equals("1")) mod6_p4_1_ck3.setChecked(true);if (modulo6.getC6_P4_1_3().equals("0")) mod6_p4_1_ck3.setChecked(false);
            if (modulo6.getC6_P4_1_4().equals("1")) mod6_p4_1_ck4.setChecked(true);if (modulo6.getC6_P4_1_4().equals("0")) mod6_p4_1_ck4.setChecked(false);
            if (modulo6.getC6_P4_1_5().equals("1")) mod6_p4_1_ck5.setChecked(true);if (modulo6.getC6_P4_1_5().equals("0")) mod6_p4_1_ck5.setChecked(false);
            if (modulo6.getC6_P4_1_6().equals("1")) mod6_p4_1_ck6.setChecked(true);if (modulo6.getC6_P4_1_6().equals("0")) mod6_p4_1_ck6.setChecked(false);
            mod6_p4_1_edt.setText(modulo6.getC6_P4_1_6_0());
            if (modulo6.getC6_P4_2_1().equals("1")) mod6_p4_2_ck1.setChecked(true);if (modulo6.getC6_P4_2_1().equals("0")) mod6_p4_2_ck1.setChecked(false);
            if (modulo6.getC6_P4_2_2().equals("1")) mod6_p4_2_ck2.setChecked(true);if (modulo6.getC6_P4_2_2().equals("0")) mod6_p4_2_ck2.setChecked(false);
            if (modulo6.getC6_P4_2_3().equals("1")) mod6_p4_2_ck3.setChecked(true);if (modulo6.getC6_P4_2_3().equals("0")) mod6_p4_2_ck3.setChecked(false);
            if (modulo6.getC6_P4_2_4().equals("1")) mod6_p4_2_ck4.setChecked(true);if (modulo6.getC6_P4_2_4().equals("0")) mod6_p4_2_ck4.setChecked(false);
            if (modulo6.getC6_P4_2_5().equals("1")) mod6_p4_2_ck5.setChecked(true);if (modulo6.getC6_P4_2_5().equals("0")) mod6_p4_2_ck5.setChecked(false);
            if (modulo6.getC6_P4_2_6().equals("1")) mod6_p4_2_ck6.setChecked(true);if (modulo6.getC6_P4_2_6().equals("0")) mod6_p4_2_ck6.setChecked(false);
            mod6_p4_2_edt.setText(modulo6.getC6_P4_2_6_0());
            if (modulo6.getC6_P4_3_1().equals("1")) mod6_p4_3_ck1.setChecked(true);if (modulo6.getC6_P4_3_1().equals("0")) mod6_p4_3_ck1.setChecked(false);
            if (modulo6.getC6_P4_3_2().equals("1")) mod6_p4_3_ck2.setChecked(true);if (modulo6.getC6_P4_3_2().equals("0")) mod6_p4_3_ck2.setChecked(false);
            if (modulo6.getC6_P4_3_3().equals("1")) mod6_p4_3_ck3.setChecked(true);if (modulo6.getC6_P4_3_3().equals("0")) mod6_p4_3_ck3.setChecked(false);
            if (modulo6.getC6_P4_3_4().equals("1")) mod6_p4_3_ck4.setChecked(true);if (modulo6.getC6_P4_3_4().equals("0")) mod6_p4_3_ck4.setChecked(false);
            if (modulo6.getC6_P4_3_5().equals("1")) mod6_p4_3_ck5.setChecked(true);if (modulo6.getC6_P4_3_5().equals("0")) mod6_p4_3_ck5.setChecked(false);
            if (modulo6.getC6_P4_3_6().equals("1")) mod6_p4_3_ck6.setChecked(true);if (modulo6.getC6_P4_3_6().equals("0")) mod6_p4_3_ck6.setChecked(false);
            mod6_p4_3_edt.setText(modulo6.getC6_P4_3_6_0());
            if (modulo6.getC6_P4_4_1().equals("1")) mod6_p4_4_ck1.setChecked(true);if (modulo6.getC6_P4_4_1().equals("0")) mod6_p4_4_ck1.setChecked(false);
            if (modulo6.getC6_P4_4_2().equals("1")) mod6_p4_4_ck2.setChecked(true);if (modulo6.getC6_P4_4_2().equals("0")) mod6_p4_4_ck2.setChecked(false);
            if (modulo6.getC6_P4_4_3().equals("1")) mod6_p4_4_ck3.setChecked(true);if (modulo6.getC6_P4_4_3().equals("0")) mod6_p4_4_ck3.setChecked(false);
            if (modulo6.getC6_P4_4_4().equals("1")) mod6_p4_4_ck4.setChecked(true);if (modulo6.getC6_P4_4_4().equals("0")) mod6_p4_4_ck4.setChecked(false);
            if (modulo6.getC6_P4_4_5().equals("1")) mod6_p4_4_ck5.setChecked(true);if (modulo6.getC6_P4_4_5().equals("0")) mod6_p4_4_ck5.setChecked(false);
            if (modulo6.getC6_P4_4_6().equals("1")) mod6_p4_4_ck6.setChecked(true);if (modulo6.getC6_P4_4_6().equals("0")) mod6_p4_4_ck6.setChecked(false);
            mod6_p4_4_edt.setText(modulo6.getC6_P4_4_6_0());
            if (modulo6.getC6_P4_5_1().equals("1")) mod6_p4_5_ck1.setChecked(true);if (modulo6.getC6_P4_5_1().equals("0")) mod6_p4_5_ck1.setChecked(false);
            if (modulo6.getC6_P4_5_2().equals("1")) mod6_p4_5_ck2.setChecked(true);if (modulo6.getC6_P4_5_2().equals("0")) mod6_p4_5_ck2.setChecked(false);
            if (modulo6.getC6_P4_5_3().equals("1")) mod6_p4_5_ck3.setChecked(true);if (modulo6.getC6_P4_5_3().equals("0")) mod6_p4_5_ck3.setChecked(false);
            if (modulo6.getC6_P4_5_4().equals("1")) mod6_p4_5_ck4.setChecked(true);if (modulo6.getC6_P4_5_4().equals("0")) mod6_p4_5_ck4.setChecked(false);
            if (modulo6.getC6_P4_5_5().equals("1")) mod6_p4_5_ck5.setChecked(true);if (modulo6.getC6_P4_5_5().equals("0")) mod6_p4_5_ck5.setChecked(false);
            if (modulo6.getC6_P4_5_6().equals("1")) mod6_p4_5_ck6.setChecked(true);if (modulo6.getC6_P4_5_6().equals("0")) mod6_p4_5_ck6.setChecked(false);
            mod6_p4_5_edt.setText(modulo6.getC6_P4_5_6_0());
            if (modulo6.getC6_P4_6_1().equals("1")) mod6_p4_6_ck1.setChecked(true);if (modulo6.getC6_P4_6_1().equals("0")) mod6_p4_6_ck1.setChecked(false);
            if (modulo6.getC6_P4_6_2().equals("1")) mod6_p4_6_ck2.setChecked(true);if (modulo6.getC6_P4_6_2().equals("0")) mod6_p4_6_ck2.setChecked(false);
            if (modulo6.getC6_P4_6_3().equals("1")) mod6_p4_6_ck3.setChecked(true);if (modulo6.getC6_P4_6_3().equals("0")) mod6_p4_6_ck3.setChecked(false);
            if (modulo6.getC6_P4_6_4().equals("1")) mod6_p4_6_ck4.setChecked(true);if (modulo6.getC6_P4_6_4().equals("0")) mod6_p4_6_ck4.setChecked(false);
            if (modulo6.getC6_P4_6_5().equals("1")) mod6_p4_6_ck5.setChecked(true);if (modulo6.getC6_P4_6_5().equals("0")) mod6_p4_6_ck5.setChecked(false);
            if (modulo6.getC6_P4_6_6().equals("1")) mod6_p4_6_ck6.setChecked(true);if (modulo6.getC6_P4_6_6().equals("0")) mod6_p4_6_ck6.setChecked(false);
            mod6_p4_6_edt.setText(modulo6.getC6_P4_6_6_0());
            if (modulo6.getC6_P4_7_1().equals("1")) mod6_p4_7_ck1.setChecked(true);if (modulo6.getC6_P4_7_1().equals("0")) mod6_p4_7_ck1.setChecked(false);
            if (modulo6.getC6_P4_7_2().equals("1")) mod6_p4_7_ck2.setChecked(true);if (modulo6.getC6_P4_7_2().equals("0")) mod6_p4_7_ck2.setChecked(false);
            if (modulo6.getC6_P4_7_3().equals("1")) mod6_p4_7_ck3.setChecked(true);if (modulo6.getC6_P4_7_3().equals("0")) mod6_p4_7_ck3.setChecked(false);
            if (modulo6.getC6_P4_7_4().equals("1")) mod6_p4_7_ck4.setChecked(true);if (modulo6.getC6_P4_7_4().equals("0")) mod6_p4_7_ck4.setChecked(false);
            if (modulo6.getC6_P4_7_5().equals("1")) mod6_p4_7_ck5.setChecked(true);if (modulo6.getC6_P4_7_5().equals("0")) mod6_p4_7_ck5.setChecked(false);
            if (modulo6.getC6_P4_7_6().equals("1")) mod6_p4_7_ck6.setChecked(true);if (modulo6.getC6_P4_7_6().equals("0")) mod6_p4_7_ck6.setChecked(false);
            mod6_p4_7_edt.setText(modulo6.getC6_P4_7_6_0());
            if (modulo6.getC6_P4_8_1().equals("1")) mod6_p4_8_ck1.setChecked(true);if (modulo6.getC6_P4_8_1().equals("0")) mod6_p4_8_ck1.setChecked(false);
            if (modulo6.getC6_P4_8_2().equals("1")) mod6_p4_8_ck2.setChecked(true);if (modulo6.getC6_P4_8_2().equals("0")) mod6_p4_8_ck2.setChecked(false);
            if (modulo6.getC6_P4_8_3().equals("1")) mod6_p4_8_ck3.setChecked(true);if (modulo6.getC6_P4_8_3().equals("0")) mod6_p4_8_ck3.setChecked(false);
            if (modulo6.getC6_P4_8_4().equals("1")) mod6_p4_8_ck4.setChecked(true);if (modulo6.getC6_P4_8_4().equals("0")) mod6_p4_8_ck4.setChecked(false);
            if (modulo6.getC6_P4_8_5().equals("1")) mod6_p4_8_ck5.setChecked(true);if (modulo6.getC6_P4_8_5().equals("0")) mod6_p4_8_ck5.setChecked(false);
            if (modulo6.getC6_P4_8_6().equals("1")) mod6_p4_8_ck6.setChecked(true);if (modulo6.getC6_P4_8_6().equals("0")) mod6_p4_8_ck6.setChecked(false);
            mod6_p4_8_edt.setText(modulo6.getC6_P4_8_6_0());
            if (modulo6.getC6_P4_9_1().equals("1")) mod6_p4_9_ck1.setChecked(true);if (modulo6.getC6_P4_9_1().equals("0")) mod6_p4_9_ck1.setChecked(false);
            if (modulo6.getC6_P4_9_2().equals("1")) mod6_p4_9_ck2.setChecked(true);if (modulo6.getC6_P4_9_2().equals("0")) mod6_p4_9_ck2.setChecked(false);
            if (modulo6.getC6_P4_9_3().equals("1")) mod6_p4_9_ck3.setChecked(true);if (modulo6.getC6_P4_9_3().equals("0")) mod6_p4_9_ck3.setChecked(false);
            if (modulo6.getC6_P4_9_4().equals("1")) mod6_p4_9_ck4.setChecked(true);if (modulo6.getC6_P4_9_4().equals("0")) mod6_p4_9_ck4.setChecked(false);
            if (modulo6.getC6_P4_9_5().equals("1")) mod6_p4_9_ck5.setChecked(true);if (modulo6.getC6_P4_9_5().equals("0")) mod6_p4_9_ck5.setChecked(false);
            if (modulo6.getC6_P4_9_6().equals("1")) mod6_p4_9_ck6.setChecked(true);if (modulo6.getC6_P4_9_6().equals("0")) mod6_p4_9_ck6.setChecked(false);
            mod6_p4_9_edt.setText(modulo6.getC6_P4_9_6_0());



       }
        data.close();
    }

    public void llenarMapaVariables() {
        //preguntas cabecera
        if (mod6_p4_1_ck1.isChecked()) C6_P4_1_1 = 1;else C6_P4_1_1= 0;
        if (mod6_p4_1_ck2.isChecked()) C6_P4_1_2 = 1;else C6_P4_1_2= 0;
        if (mod6_p4_1_ck3.isChecked()) C6_P4_1_3 = 1;else C6_P4_1_3= 0;
        if (mod6_p4_1_ck4.isChecked()) C6_P4_1_4 = 1;else C6_P4_1_4= 0;
        if (mod6_p4_1_ck5.isChecked()) C6_P4_1_5 = 1;else C6_P4_1_5= 0;
        if (mod6_p4_1_ck6.isChecked()) C6_P4_1_6 = 1;else C6_P4_1_6= 0;
        C6_P4_1_6_0 = mod6_p4_1_edt.getText().toString();
        if (mod6_p4_2_ck1.isChecked()) C6_P4_2_1 = 1;else C6_P4_2_1= 0;
        if (mod6_p4_2_ck2.isChecked()) C6_P4_2_2 = 1;else C6_P4_2_2= 0;
        if (mod6_p4_2_ck3.isChecked()) C6_P4_2_3 = 1;else C6_P4_2_3= 0;
        if (mod6_p4_2_ck4.isChecked()) C6_P4_2_4 = 1;else C6_P4_2_4= 0;
        if (mod6_p4_2_ck5.isChecked()) C6_P4_2_5 = 1;else C6_P4_2_5= 0;
        if (mod6_p4_2_ck6.isChecked()) C6_P4_2_6 = 1;else C6_P4_2_6= 0;
        C6_P4_2_6_0 = mod6_p4_2_edt.getText().toString();
        if (mod6_p4_3_ck1.isChecked()) C6_P4_3_1 = 1;else C6_P4_3_1= 0;
        if (mod6_p4_3_ck2.isChecked()) C6_P4_3_2 = 1;else C6_P4_3_2= 0;
        if (mod6_p4_3_ck3.isChecked()) C6_P4_3_3 = 1;else C6_P4_3_3= 0;
        if (mod6_p4_3_ck4.isChecked()) C6_P4_3_4 = 1;else C6_P4_3_4= 0;
        if (mod6_p4_3_ck5.isChecked()) C6_P4_3_5 = 1;else C6_P4_3_5= 0;
        if (mod6_p4_3_ck6.isChecked()) C6_P4_3_6 = 1;else C6_P4_3_6= 0;
        C6_P4_3_6_0 = mod6_p4_3_edt.getText().toString();
        if (mod6_p4_4_ck1.isChecked()) C6_P4_4_1 = 1;else C6_P4_4_1= 0;
        if (mod6_p4_4_ck2.isChecked()) C6_P4_4_2 = 1;else C6_P4_4_2= 0;
        if (mod6_p4_4_ck3.isChecked()) C6_P4_4_3 = 1;else C6_P4_4_3= 0;
        if (mod6_p4_4_ck4.isChecked()) C6_P4_4_4 = 1;else C6_P4_4_4= 0;
        if (mod6_p4_4_ck5.isChecked()) C6_P4_4_5 = 1;else C6_P4_4_5= 0;
        if (mod6_p4_4_ck6.isChecked()) C6_P4_4_6 = 1;else C6_P4_4_6= 0;
        C6_P4_4_6_0 = mod6_p4_4_edt.getText().toString();
        if (mod6_p4_5_ck1.isChecked()) C6_P4_5_1 = 1;else C6_P4_5_1= 0;
        if (mod6_p4_5_ck2.isChecked()) C6_P4_5_2 = 1;else C6_P4_5_2= 0;
        if (mod6_p4_5_ck3.isChecked()) C6_P4_5_3 = 1;else C6_P4_5_3= 0;
        if (mod6_p4_5_ck4.isChecked()) C6_P4_5_4 = 1;else C6_P4_5_4= 0;
        if (mod6_p4_5_ck5.isChecked()) C6_P4_5_5 = 1;else C6_P4_5_5= 0;
        if (mod6_p4_5_ck6.isChecked()) C6_P4_5_6 = 1;else C6_P4_5_6= 0;
        C6_P4_5_6_0 = mod6_p4_5_edt.getText().toString();
        if (mod6_p4_6_ck1.isChecked()) C6_P4_6_1 = 1;else C6_P4_6_1= 0;
        if (mod6_p4_6_ck2.isChecked()) C6_P4_6_2 = 1;else C6_P4_6_2= 0;
        if (mod6_p4_6_ck3.isChecked()) C6_P4_6_3 = 1;else C6_P4_6_3= 0;
        if (mod6_p4_6_ck4.isChecked()) C6_P4_6_4 = 1;else C6_P4_6_4= 0;
        if (mod6_p4_6_ck5.isChecked()) C6_P4_6_5 = 1;else C6_P4_6_5= 0;
        if (mod6_p4_6_ck6.isChecked()) C6_P4_6_6 = 1;else C6_P4_6_6= 0;
        C6_P4_6_6_0 = mod6_p4_6_edt.getText().toString();
        if (mod6_p4_7_ck1.isChecked()) C6_P4_7_1 = 1;else C6_P4_7_1= 0;
        if (mod6_p4_7_ck2.isChecked()) C6_P4_7_2 = 1;else C6_P4_7_2= 0;
        if (mod6_p4_7_ck3.isChecked()) C6_P4_7_3 = 1;else C6_P4_7_3= 0;
        if (mod6_p4_7_ck4.isChecked()) C6_P4_7_4 = 1;else C6_P4_7_4= 0;
        if (mod6_p4_7_ck5.isChecked()) C6_P4_7_5 = 1;else C6_P4_7_5= 0;
        if (mod6_p4_7_ck6.isChecked()) C6_P4_7_6 = 1;else C6_P4_7_6= 0;
        C6_P4_7_6_0 = mod6_p4_7_edt.getText().toString();
        if (mod6_p4_8_ck1.isChecked()) C6_P4_8_1 = 1;else C6_P4_8_1= 0;
        if (mod6_p4_8_ck2.isChecked()) C6_P4_8_2 = 1;else C6_P4_8_2= 0;
        if (mod6_p4_8_ck3.isChecked()) C6_P4_8_3 = 1;else C6_P4_8_3= 0;
        if (mod6_p4_8_ck4.isChecked()) C6_P4_8_4 = 1;else C6_P4_8_4= 0;
        if (mod6_p4_8_ck5.isChecked()) C6_P4_8_5 = 1;else C6_P4_8_5= 0;
        if (mod6_p4_8_ck6.isChecked()) C6_P4_8_6 = 1;else C6_P4_8_6= 0;
        C6_P4_8_6_0 = mod6_p4_8_edt.getText().toString();
        if (mod6_p4_9_ck1.isChecked()) C6_P4_9_1 = 1;else C6_P4_9_1= 0;
        if (mod6_p4_9_ck2.isChecked()) C6_P4_9_2 = 1;else C6_P4_9_2= 0;
        if (mod6_p4_9_ck3.isChecked()) C6_P4_9_3 = 1;else C6_P4_9_3= 0;
        if (mod6_p4_9_ck4.isChecked()) C6_P4_9_4 = 1;else C6_P4_9_4= 0;
        if (mod6_p4_9_ck5.isChecked()) C6_P4_9_5 = 1;else C6_P4_9_5= 0;
        if (mod6_p4_9_ck6.isChecked()) C6_P4_9_6 = 1;else C6_P4_9_6= 0;
        C6_P4_9_6_0 = mod6_p4_9_edt.getText().toString();

    }

    public void guardarDatos() {
        data = new Data(context);
        data.open();
        if (data.existeModulo6(idempresa)) {
            ContentValues contentValues = new ContentValues(478);
            contentValues.put(SQLConstantes.MODULO6_P4_1_1,C6_P4_1_1+ "");
            contentValues.put(SQLConstantes.MODULO6_P4_1_2,C6_P4_1_2+ "");
            contentValues.put(SQLConstantes.MODULO6_P4_1_3,C6_P4_1_3+ "");
            contentValues.put(SQLConstantes.MODULO6_P4_1_4,C6_P4_1_4+ "");
            contentValues.put(SQLConstantes.MODULO6_P4_1_5,C6_P4_1_5+ "");
            contentValues.put(SQLConstantes.MODULO6_P4_1_6,C6_P4_1_6+ "");
            contentValues.put(SQLConstantes.MODULO6_P4_1_6_0,C6_P4_1_6_0);
            contentValues.put(SQLConstantes.MODULO6_P4_2_1,C6_P4_2_1+ "");
            contentValues.put(SQLConstantes.MODULO6_P4_2_2,C6_P4_2_2+ "");
            contentValues.put(SQLConstantes.MODULO6_P4_2_3,C6_P4_2_3+ "");
            contentValues.put(SQLConstantes.MODULO6_P4_2_4,C6_P4_2_4+ "");
            contentValues.put(SQLConstantes.MODULO6_P4_2_5,C6_P4_2_5+ "");
            contentValues.put(SQLConstantes.MODULO6_P4_2_6,C6_P4_2_6+ "");
            contentValues.put(SQLConstantes.MODULO6_P4_2_6_0,C6_P4_2_6_0);
            contentValues.put(SQLConstantes.MODULO6_P4_3_1,C6_P4_3_1+ "");
            contentValues.put(SQLConstantes.MODULO6_P4_3_2,C6_P4_3_2+ "");
            contentValues.put(SQLConstantes.MODULO6_P4_3_3,C6_P4_3_3+ "");
            contentValues.put(SQLConstantes.MODULO6_P4_3_4,C6_P4_3_4+ "");
            contentValues.put(SQLConstantes.MODULO6_P4_3_5,C6_P4_3_5+ "");
            contentValues.put(SQLConstantes.MODULO6_P4_3_6,C6_P4_3_6+ "");
            contentValues.put(SQLConstantes.MODULO6_P4_3_6_0,C6_P4_3_6_0);
            contentValues.put(SQLConstantes.MODULO6_P4_4_1,C6_P4_4_1+ "");
            contentValues.put(SQLConstantes.MODULO6_P4_4_2,C6_P4_4_2+ "");
            contentValues.put(SQLConstantes.MODULO6_P4_4_3,C6_P4_4_3+ "");
            contentValues.put(SQLConstantes.MODULO6_P4_4_4,C6_P4_4_4+ "");
            contentValues.put(SQLConstantes.MODULO6_P4_4_5,C6_P4_4_5+ "");
            contentValues.put(SQLConstantes.MODULO6_P4_4_6,C6_P4_4_6+ "");
            contentValues.put(SQLConstantes.MODULO6_P4_4_6_0,C6_P4_4_6_0);
            contentValues.put(SQLConstantes.MODULO6_P4_5_1,C6_P4_5_1+ "");
            contentValues.put(SQLConstantes.MODULO6_P4_5_2,C6_P4_5_2+ "");
            contentValues.put(SQLConstantes.MODULO6_P4_5_3,C6_P4_5_3+ "");
            contentValues.put(SQLConstantes.MODULO6_P4_5_4,C6_P4_5_4+ "");
            contentValues.put(SQLConstantes.MODULO6_P4_5_5,C6_P4_5_5+ "");
            contentValues.put(SQLConstantes.MODULO6_P4_5_6,C6_P4_5_6+ "");
            contentValues.put(SQLConstantes.MODULO6_P4_5_6_0,C6_P4_5_6_0);
            contentValues.put(SQLConstantes.MODULO6_P4_6_1,C6_P4_6_1+ "");
            contentValues.put(SQLConstantes.MODULO6_P4_6_2,C6_P4_6_2+ "");
            contentValues.put(SQLConstantes.MODULO6_P4_6_3,C6_P4_6_3+ "");
            contentValues.put(SQLConstantes.MODULO6_P4_6_4,C6_P4_6_4+ "");
            contentValues.put(SQLConstantes.MODULO6_P4_6_5,C6_P4_6_5+ "");
            contentValues.put(SQLConstantes.MODULO6_P4_6_6,C6_P4_6_6+ "");
            contentValues.put(SQLConstantes.MODULO6_P4_6_6_0,C6_P4_6_6_0);
            contentValues.put(SQLConstantes.MODULO6_P4_7_1,C6_P4_7_1+ "");
            contentValues.put(SQLConstantes.MODULO6_P4_7_2,C6_P4_7_2+ "");
            contentValues.put(SQLConstantes.MODULO6_P4_7_3,C6_P4_7_3+ "");
            contentValues.put(SQLConstantes.MODULO6_P4_7_4,C6_P4_7_4+ "");
            contentValues.put(SQLConstantes.MODULO6_P4_7_5,C6_P4_7_5+ "");
            contentValues.put(SQLConstantes.MODULO6_P4_7_6,C6_P4_7_6+ "");
            contentValues.put(SQLConstantes.MODULO6_P4_7_6_0,C6_P4_7_6_0);
            contentValues.put(SQLConstantes.MODULO6_P4_8_1,C6_P4_8_1+ "");
            contentValues.put(SQLConstantes.MODULO6_P4_8_2,C6_P4_8_2+ "");
            contentValues.put(SQLConstantes.MODULO6_P4_8_3,C6_P4_8_3+ "");
            contentValues.put(SQLConstantes.MODULO6_P4_8_4,C6_P4_8_4+ "");
            contentValues.put(SQLConstantes.MODULO6_P4_8_5,C6_P4_8_5+ "");
            contentValues.put(SQLConstantes.MODULO6_P4_8_6,C6_P4_8_6+ "");
            contentValues.put(SQLConstantes.MODULO6_P4_8_6_0,C6_P4_8_6_0);
            contentValues.put(SQLConstantes.MODULO6_P4_9_1,C6_P4_9_1+ "");
            contentValues.put(SQLConstantes.MODULO6_P4_9_2,C6_P4_9_2+ "");
            contentValues.put(SQLConstantes.MODULO6_P4_9_3,C6_P4_9_3+ "");
            contentValues.put(SQLConstantes.MODULO6_P4_9_4,C6_P4_9_4+ "");
            contentValues.put(SQLConstantes.MODULO6_P4_9_5,C6_P4_9_5+ "");
            contentValues.put(SQLConstantes.MODULO6_P4_9_6,C6_P4_9_6+ "");
            contentValues.put(SQLConstantes.MODULO6_P4_9_6_0,C6_P4_9_6_0);
            data.actualizarModulo6(idempresa, contentValues);
        } else {
            //si no existe el elemento, lo construye para insertarlo
            modulo6 = new Modulo6();
            //llena el objeto a insertar
            modulo6.setMODULO6_ID(idempresa);
            modulo6.setC6_P4_1_1(C6_P4_1_1 + "");
            modulo6.setC6_P4_1_2(C6_P4_1_2 + "");
            modulo6.setC6_P4_1_3(C6_P4_1_3 + "");
            modulo6.setC6_P4_1_4(C6_P4_1_4 + "");
            modulo6.setC6_P4_1_5(C6_P4_1_5 + "");
            modulo6.setC6_P4_1_6(C6_P4_1_6 + "");
            modulo6.setC6_P4_1_6_0(C6_P4_1_6_0);
            modulo6.setC6_P4_2_1(C6_P4_2_1 + "");
            modulo6.setC6_P4_2_2(C6_P4_2_2 + "");
            modulo6.setC6_P4_2_3(C6_P4_2_3 + "");
            modulo6.setC6_P4_2_4(C6_P4_2_4 + "");
            modulo6.setC6_P4_2_5(C6_P4_2_5 + "");
            modulo6.setC6_P4_2_6(C6_P4_2_6 + "");
            modulo6.setC6_P4_2_6_0(C6_P4_2_6_0);
            modulo6.setC6_P4_3_1(C6_P4_3_1 + "");
            modulo6.setC6_P4_3_2(C6_P4_3_2 + "");
            modulo6.setC6_P4_3_3(C6_P4_3_3 + "");
            modulo6.setC6_P4_3_4(C6_P4_3_4 + "");
            modulo6.setC6_P4_3_5(C6_P4_3_5 + "");
            modulo6.setC6_P4_3_6(C6_P4_3_6 + "");
            modulo6.setC6_P4_3_6_0(C6_P4_3_6_0);
            modulo6.setC6_P4_4_1(C6_P4_4_1 + "");
            modulo6.setC6_P4_4_2(C6_P4_4_2 + "");
            modulo6.setC6_P4_4_3(C6_P4_4_3 + "");
            modulo6.setC6_P4_4_4(C6_P4_4_4 + "");
            modulo6.setC6_P4_4_5(C6_P4_4_5 + "");
            modulo6.setC6_P4_4_6(C6_P4_4_6 + "");
            modulo6.setC6_P4_4_6_0(C6_P4_4_6_0);
            modulo6.setC6_P4_5_1(C6_P4_5_1 + "");
            modulo6.setC6_P4_5_2(C6_P4_5_2 + "");
            modulo6.setC6_P4_5_3(C6_P4_5_3 + "");
            modulo6.setC6_P4_5_4(C6_P4_5_4 + "");
            modulo6.setC6_P4_5_5(C6_P4_5_5 + "");
            modulo6.setC6_P4_5_6(C6_P4_5_6 + "");
            modulo6.setC6_P4_5_6_0(C6_P4_5_6_0);
            modulo6.setC6_P4_6_1(C6_P4_6_1 + "");
            modulo6.setC6_P4_6_2(C6_P4_6_2 + "");
            modulo6.setC6_P4_6_3(C6_P4_6_3 + "");
            modulo6.setC6_P4_6_4(C6_P4_6_4 + "");
            modulo6.setC6_P4_6_5(C6_P4_6_5 + "");
            modulo6.setC6_P4_6_6(C6_P4_6_6 + "");
            modulo6.setC6_P4_6_6_0(C6_P4_6_6_0);
            modulo6.setC6_P4_7_1(C6_P4_7_1 + "");
            modulo6.setC6_P4_7_2(C6_P4_7_2 + "");
            modulo6.setC6_P4_7_3(C6_P4_7_3 + "");
            modulo6.setC6_P4_7_4(C6_P4_7_4 + "");
            modulo6.setC6_P4_7_5(C6_P4_7_5 + "");
            modulo6.setC6_P4_7_6(C6_P4_7_6 + "");
            modulo6.setC6_P4_7_6_0(C6_P4_7_6_0);
            modulo6.setC6_P4_8_1(C6_P4_8_1 + "");
            modulo6.setC6_P4_8_2(C6_P4_8_2 + "");
            modulo6.setC6_P4_8_3(C6_P4_8_3 + "");
            modulo6.setC6_P4_8_4(C6_P4_8_4 + "");
            modulo6.setC6_P4_8_5(C6_P4_8_5 + "");
            modulo6.setC6_P4_8_6(C6_P4_8_6 + "");
            modulo6.setC6_P4_8_6_0(C6_P4_8_6_0);
            modulo6.setC6_P4_9_1(C6_P4_9_1 + "");
            modulo6.setC6_P4_9_2(C6_P4_9_2 + "");
            modulo6.setC6_P4_9_3(C6_P4_9_3 + "");
            modulo6.setC6_P4_9_4(C6_P4_9_4 + "");
            modulo6.setC6_P4_9_5(C6_P4_9_5 + "");
            modulo6.setC6_P4_9_6(C6_P4_9_6 + "");
            data.insertarModulo6(modulo6);
        }
        data.close();
    }

    public boolean validar() {
       // boolean valido = false;
//        llenarMapaVariables();
//
//            //revisarcampos
//            boolean correcto = true;
//
//            return correcto;
        //revisarcampos
        boolean valido = true;
        llenarMapaVariables();

        boolean vC6_P4_1= true ;
        boolean vC6_P4_2= true ;
        boolean vC6_P4_3= true ;
        boolean vC6_P4_4= true ;
        boolean vC6_P4_5= true ;
        boolean vC6_P4_6= true ;
        boolean vC6_P4_7= true ;
        boolean vC6_P4_8= true ;
        boolean vC6_P4_9= true ;

        Integer[] valores1={ C6_P4_1_1,C6_P4_1_2,C6_P4_1_3,C6_P4_1_4,C6_P4_1_5,C6_P4_1_6};
        Integer[] valores2={ C6_P4_2_1,C6_P4_2_2,C6_P4_2_3,C6_P4_2_4,C6_P4_2_5,C6_P4_2_6};
        Integer[] valores3={ C6_P4_3_1,C6_P4_3_2,C6_P4_3_3,C6_P4_3_4,C6_P4_3_5,C6_P4_3_6};
        Integer[] valores4={ C6_P4_4_1,C6_P4_4_2,C6_P4_4_3,C6_P4_4_4,C6_P4_4_5,C6_P4_4_6};
        Integer[] valores5={ C6_P4_5_1,C6_P4_5_2,C6_P4_5_3,C6_P4_5_4,C6_P4_5_5,C6_P4_5_6};
        Integer[] valores6={ C6_P4_6_1,C6_P4_6_2,C6_P4_6_3,C6_P4_6_4,C6_P4_6_5,C6_P4_6_6};
        Integer[] valores7={ C6_P4_7_1,C6_P4_7_2,C6_P4_7_3,C6_P4_7_4,C6_P4_7_5,C6_P4_7_6};
        Integer[] valores8={ C6_P4_8_1,C6_P4_8_2,C6_P4_8_3,C6_P4_8_4,C6_P4_8_5,C6_P4_8_6};
        Integer[] valores9={ C6_P4_9_1,C6_P4_9_2,C6_P4_9_3,C6_P4_9_4,C6_P4_9_5,C6_P4_9_6};

        for (Integer valor1:valores1 ) {
            if(valor1==1)vC6_P4_1=false;
        }
        for (Integer valor2:valores2 ) {
            if(valor2==1)vC6_P4_2=false;
        }
        for (Integer valor3:valores3 ) {
            if(valor3==1)vC6_P4_3=false;
        }
        for (Integer valor4:valores4 ) {
            if(valor4==1)vC6_P4_4=false;
        }
        for (Integer valor5:valores5 ) {
            if(valor5==1)vC6_P4_5=false;
        }
        for (Integer valor6:valores6 ) {
            if(valor6==1)vC6_P4_6=false;
        }
        for (Integer valor7:valores7 ) {
            if(valor7==1)vC6_P4_7=false;
        }
        for (Integer valor8:valores8 ) {
            if(valor8==1)vC6_P4_8=false;
        }
        for (Integer valor9:valores9 ) {
            if(valor9==1)vC6_P4_9=false;
        }

         if(vC6_P4_1 && Integer.parseInt(C6_p3_1)>=0 && Integer.parseInt(C6_p3_1)<Integer.parseInt(C5_t1)){
            mostrarMensaje("Pregunta 4.1: Debe seleccionar una o más opciones");
            valido=false;
          }else if(C6_P4_1_6== 1 && C6_P4_1_6_0.trim().length()<3){
            mostrarMensaje("Pregunta 4.1: Debe registrar información válida en Especifique");
            valido=false;
          }else if(vC6_P4_2 && Integer.parseInt(C6_p3_2)>=0 && Integer.parseInt(C6_p3_2)<Integer.parseInt(C5_t2)){
             mostrarMensaje("Pregunta 4.2: Debe seleccionar una o más opciones");
             valido=false;
         }else if(C6_P4_2_6== 1 && C6_P4_2_6_0.trim().length()<3){
             mostrarMensaje("Pregunta 4.2: Debe registrar información válida en Especifique");
             valido=false;
         }else if(vC6_P4_3 && Integer.parseInt(C6_p3_3)>=0 && Integer.parseInt(C6_p3_3)<Integer.parseInt(C5_t3)){
             mostrarMensaje("Pregunta 4.3: Debe seleccionar una o más opciones");
             valido=false;
         }else if(C6_P4_3_6== 1 && C6_P4_3_6_0.trim().length()<3){
             mostrarMensaje("Pregunta 4.3: Debe registrar información válida en Especifique");
             valido=false;
         }else if(vC6_P4_4 && Integer.parseInt(C6_p3_4)>=0 && Integer.parseInt(C6_p3_4)<Integer.parseInt(C5_t4)){
             mostrarMensaje("Pregunta 4.4: Debe seleccionar una o más opciones");
             valido=false;
         }else if(C6_P4_4_6== 1 && C6_P4_4_6_0.trim().length()<3){
             mostrarMensaje("Pregunta 4.4: Debe registrar información válida en Especifique");
             valido=false;
         }else if(vC6_P4_5 && Integer.parseInt(C6_p3_5)>=0 && Integer.parseInt(C6_p3_5)<Integer.parseInt(C5_t5)){
             mostrarMensaje("Pregunta 4.5: Debe seleccionar una o más opciones");
             valido=false;
         }else if(C6_P4_5_6== 1 && C6_P4_5_6_0.trim().length()<3){
             mostrarMensaje("Pregunta 4.5: Debe registrar información válida en Especifique");
             valido=false;
         }else if(vC6_P4_6 && Integer.parseInt(C6_p3_6)>=0 && Integer.parseInt(C6_p3_6)<Integer.parseInt(C5_t6)){
             mostrarMensaje("Pregunta 4.6: Debe seleccionar una o más opciones");
             valido=false;
         }else if(C6_P4_6_6== 1 && C6_P4_6_6_0.trim().length()<3){
             mostrarMensaje("Pregunta 4.6: Debe registrar información válida en Especifique");
             valido=false;
         }else if(vC6_P4_7 && Integer.parseInt(C6_p3_7)>=0 && Integer.parseInt(C6_p3_7)<Integer.parseInt(C5_t7)){
             mostrarMensaje("Pregunta 4.7: Debe seleccionar una o más opciones");
             valido=false;
         }else if(C6_P4_7_6== 1 && C6_P4_7_6_0.trim().length()<3){
             mostrarMensaje("Pregunta 4.7: Debe registrar información válida en Especifique");
             valido=false;
         }else if(vC6_P4_8 && Integer.parseInt(C6_p3_8)>=0 && Integer.parseInt(C6_p3_8)<Integer.parseInt(C5_t8)){
             mostrarMensaje("Pregunta 4.8: Debe seleccionar una o más opciones");
             valido=false;
         }else if(C6_P4_8_6== 1 && C6_P4_8_6_0.trim().length()<3){
             mostrarMensaje("Pregunta 4.8: Debe registrar información válida en Especifique");
             valido=false;
         }else if(vC6_P4_9 && Integer.parseInt(C6_p3_9)>=0&& Integer.parseInt(C6_p3_9)<Integer.parseInt(C5_t9)){
             mostrarMensaje("Pregunta 4.9: Debe seleccionar una o más opciones");
             valido=false;
         }else if(C6_P4_9_6== 1 && C6_P4_9_6_0.trim().length()<3){
             mostrarMensaje("Pregunta 4.9: Debe registrar información válida en Especifique");
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
