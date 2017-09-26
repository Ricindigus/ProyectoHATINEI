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
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;

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
public class Modulo6Fragment5 extends Fragment {

    private LinearLayout mod6_p7_lytSp1;
    private LinearLayout mod6_p7_lytSp2;
    private LinearLayout mod6_p7_lytSp3;
    private LinearLayout mod6_p7_lytSp4;
    private LinearLayout mod6_p7_lytSp5;
    private LinearLayout mod6_p7_lytSp6;
    private LinearLayout mod6_p7_lytSp7;
    private LinearLayout mod6_p7_lytSp8;
    private LinearLayout mod6_p7_lytSp9;

    private CheckBox mod6_p7_1_ck1;
    private CheckBox mod6_p7_1_ck2;
    private CheckBox mod6_p7_1_ck3;
    private CheckBox mod6_p7_1_ck4;
    private CheckBox mod6_p7_1_ck5;
    private CheckBox mod6_p7_1_ck6;
    private CheckBox mod6_p7_1_ck7;
    private CheckBox mod6_p7_1_ck8;
    private CheckBox mod6_p7_1_ck9;
    private CheckBox mod6_p7_1_ck10;
    private EditText mod6_p7_edt1;


    private CheckBox mod6_p7_2_ck1;
    private CheckBox mod6_p7_2_ck2;
    private CheckBox mod6_p7_2_ck3;
    private CheckBox mod6_p7_2_ck4;
    private CheckBox mod6_p7_2_ck5;
    private CheckBox mod6_p7_2_ck6;
    private CheckBox mod6_p7_2_ck7;
    private CheckBox mod6_p7_2_ck8;
    private CheckBox mod6_p7_2_ck9;
    private CheckBox mod6_p7_2_ck10;
    private EditText mod6_p7_edt2;


    private CheckBox mod6_p7_3_ck1;
    private CheckBox mod6_p7_3_ck2;
    private CheckBox mod6_p7_3_ck3;
    private CheckBox mod6_p7_3_ck4;
    private CheckBox mod6_p7_3_ck5;
    private CheckBox mod6_p7_3_ck6;
    private CheckBox mod6_p7_3_ck7;
    private CheckBox mod6_p7_3_ck8;
    private CheckBox mod6_p7_3_ck9;
    private CheckBox mod6_p7_3_ck10;
    private EditText mod6_p7_edt3;

    private CheckBox mod6_p7_4_ck1;
    private CheckBox mod6_p7_4_ck2;
    private CheckBox mod6_p7_4_ck3;
    private CheckBox mod6_p7_4_ck4;
    private CheckBox mod6_p7_4_ck5;
    private CheckBox mod6_p7_4_ck6;
    private CheckBox mod6_p7_4_ck7;
    private CheckBox mod6_p7_4_ck8;
    private CheckBox mod6_p7_4_ck9;
    private CheckBox mod6_p7_4_ck10;
    private EditText mod6_p7_edt4;

    private CheckBox mod6_p7_5_ck1;
    private CheckBox mod6_p7_5_ck2;
    private CheckBox mod6_p7_5_ck3;
    private CheckBox mod6_p7_5_ck4;
    private CheckBox mod6_p7_5_ck5;
    private CheckBox mod6_p7_5_ck6;
    private CheckBox mod6_p7_5_ck7;
    private CheckBox mod6_p7_5_ck8;
    private CheckBox mod6_p7_5_ck9;
    private CheckBox mod6_p7_5_ck10;
    private EditText mod6_p7_edt5;

    private CheckBox mod6_p7_6_ck1;
    private CheckBox mod6_p7_6_ck2;
    private CheckBox mod6_p7_6_ck3;
    private CheckBox mod6_p7_6_ck4;
    private CheckBox mod6_p7_6_ck5;
    private CheckBox mod6_p7_6_ck6;
    private CheckBox mod6_p7_6_ck7;
    private CheckBox mod6_p7_6_ck8;
    private CheckBox mod6_p7_6_ck9;
    private CheckBox mod6_p7_6_ck10;
    private EditText mod6_p7_edt6;


    private CheckBox mod6_p7_7_ck1;
    private CheckBox mod6_p7_7_ck2;
    private CheckBox mod6_p7_7_ck3;
    private CheckBox mod6_p7_7_ck4;
    private CheckBox mod6_p7_7_ck5;
    private CheckBox mod6_p7_7_ck6;
    private CheckBox mod6_p7_7_ck7;
    private CheckBox mod6_p7_7_ck8;
    private CheckBox mod6_p7_7_ck9;
    private CheckBox mod6_p7_7_ck10;
    private EditText mod6_p7_edt7;

    private CheckBox mod6_p7_8_ck1;
    private CheckBox mod6_p7_8_ck2;
    private CheckBox mod6_p7_8_ck3;
    private CheckBox mod6_p7_8_ck4;
    private CheckBox mod6_p7_8_ck5;
    private CheckBox mod6_p7_8_ck6;
    private CheckBox mod6_p7_8_ck7;
    private CheckBox mod6_p7_8_ck8;
    private CheckBox mod6_p7_8_ck9;
    private CheckBox mod6_p7_8_ck10;
    private EditText mod6_p7_edt8;

    private CheckBox mod6_p7_9_ck1;
    private CheckBox mod6_p7_9_ck2;
    private CheckBox mod6_p7_9_ck3;
    private CheckBox mod6_p7_9_ck4;
    private CheckBox mod6_p7_9_ck5;
    private CheckBox mod6_p7_9_ck6;
    private CheckBox mod6_p7_9_ck7;
    private CheckBox mod6_p7_9_ck8;
    private CheckBox mod6_p7_9_ck9;
    private CheckBox mod6_p7_9_ck10;
    private EditText mod6_p7_edt9;

    private LinearLayout mod6_p7_ly1;
    private LinearLayout mod6_p7_ly2;
    private LinearLayout mod6_p7_ly3;
    private LinearLayout mod6_p7_ly4;
    private LinearLayout mod6_p7_ly5;
    private LinearLayout mod6_p7_ly6;
    private LinearLayout mod6_p7_ly7;
    private LinearLayout mod6_p7_ly8;
    private LinearLayout mod6_p7_ly9;

    private EditText mod6_p8_edt1;
    private EditText mod6_p8_edt2;
    private EditText mod6_p8_edt3;
    private EditText mod6_p8_edt4;
    private EditText mod6_p8_edt5;
    private EditText mod6_p8_edt6;
    private EditText mod6_p8_edt7;
    private EditText mod6_p8_edt8;
    private EditText mod6_p8_edt9;
    //CARGADO Y GUARDADO
    private String idempresa;
    private Modulo6 modulo6;
    private Modulo5 modulo5;
    private Context context;
    private Data data;

    private Modulo2 modulo2;
    String C2_p1;
    String C5_p1;
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

    String C5_t1;
    String C5_t2;
    String C5_t3;
    String C5_t4;
    String C5_t5;
    String C5_t6;
    String C5_t7;
    String C5_t8;
    String C5_t9;

    int C6_P7_1_1;
    int C6_P7_1_2;
    int C6_P7_1_3;
    int C6_P7_1_4;
    int C6_P7_1_5;
    int C6_P7_1_6;
    int C6_P7_1_7;
    int C6_P7_1_8;
    int C6_P7_1_9;
    int C6_P7_1_10;
    int C6_P7_2_1;
    int C6_P7_2_2;
    int C6_P7_2_3;
    int C6_P7_2_4;
    int C6_P7_2_5;
    int C6_P7_2_6;
    int C6_P7_2_7;
    int C6_P7_2_8;
    int C6_P7_2_9;
    int C6_P7_2_10;
    int C6_P7_3_1;
    int C6_P7_3_2;
    int C6_P7_3_3;
    int C6_P7_3_4;
    int C6_P7_3_5;
    int C6_P7_3_6;
    int C6_P7_3_7;
    int C6_P7_3_8;
    int C6_P7_3_9;
    int C6_P7_3_10;
    int C6_P7_4_1;
    int C6_P7_4_2;
    int C6_P7_4_3;
    int C6_P7_4_4;
    int C6_P7_4_5;
    int C6_P7_4_6;
    int C6_P7_4_7;
    int C6_P7_4_8;
    int C6_P7_4_9;
    int C6_P7_4_10;
    int C6_P7_5_1;
    int C6_P7_5_2;
    int C6_P7_5_3;
    int C6_P7_5_4;
    int C6_P7_5_5;
    int C6_P7_5_6;
    int C6_P7_5_7;
    int C6_P7_5_8;
    int C6_P7_5_9;
    int C6_P7_5_10;
    int C6_P7_6_1;
    int C6_P7_6_2;
    int C6_P7_6_3;
    int C6_P7_6_4;
    int C6_P7_6_5;
    int C6_P7_6_6;
    int C6_P7_6_7;
    int C6_P7_6_8;
    int C6_P7_6_9;
    int C6_P7_6_10;
    int C6_P7_7_1;
    int C6_P7_7_2;
    int C6_P7_7_3;
    int C6_P7_7_4;
    int C6_P7_7_5;
    int C6_P7_7_6;
    int C6_P7_7_7;
    int C6_P7_7_8;
    int C6_P7_7_9;
    int C6_P7_7_10;
    int C6_P7_8_1;
    int C6_P7_8_2;
    int C6_P7_8_3;
    int C6_P7_8_4;
    int C6_P7_8_5;
    int C6_P7_8_6;
    int C6_P7_8_7;
    int C6_P7_8_8;
    int C6_P7_8_9;
    int C6_P7_8_10;
    int C6_P7_9_1;
    int C6_P7_9_2;
    int C6_P7_9_3;
    int C6_P7_9_4;
    int C6_P7_9_5;
    int C6_P7_9_6;
    int C6_P7_9_7;
    int C6_P7_9_8;
    int C6_P7_9_9;
    int C6_P7_9_10;
    String C6_P8_1;
    String C6_P8_2;
    String C6_P8_3;
    String C6_P8_4;
    String C6_P8_5;
    String C6_P8_6;
    String C6_P8_7;
    String C6_P8_8;
    String C6_P8_9;

    public Modulo6Fragment5() {
        // Required empty public constructor
    }

    @SuppressLint("ValidFragment")
    public Modulo6Fragment5(String idempresa, Context context) {
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

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView =  inflater.inflate(R.layout.fragment_modulo6_fragment5, container, false);

        mod6_p7_ly1 = (LinearLayout) rootView.findViewById(R.id.mod6_p7_ly1);
        mod6_p7_ly2 = (LinearLayout) rootView.findViewById(R.id.mod6_p7_ly2);
        mod6_p7_ly3 = (LinearLayout) rootView.findViewById(R.id.mod6_p7_ly3);
        mod6_p7_ly4 = (LinearLayout) rootView.findViewById(R.id.mod6_p7_ly4);
        mod6_p7_ly5 = (LinearLayout) rootView.findViewById(R.id.mod6_p7_ly5);
        mod6_p7_ly6 = (LinearLayout) rootView.findViewById(R.id.mod6_p7_ly6);
        mod6_p7_ly7 = (LinearLayout) rootView.findViewById(R.id.mod6_p7_ly7);
        mod6_p7_ly8 = (LinearLayout) rootView.findViewById(R.id.mod6_p7_ly8);
        mod6_p7_ly9 = (LinearLayout) rootView.findViewById(R.id.mod6_p7_ly9);

        mod6_p7_lytSp1 = (LinearLayout) rootView.findViewById(R.id.mod6_p7_lytSp1);
        mod6_p7_lytSp2 = (LinearLayout) rootView.findViewById(R.id.mod6_p7_lytSp2);
        mod6_p7_lytSp3 = (LinearLayout) rootView.findViewById(R.id.mod6_p7_lytSp3);
        mod6_p7_lytSp4 = (LinearLayout) rootView.findViewById(R.id.mod6_p7_lytSp4);
        mod6_p7_lytSp5 = (LinearLayout) rootView.findViewById(R.id.mod6_p7_lytSp5);
        mod6_p7_lytSp6 = (LinearLayout) rootView.findViewById(R.id.mod6_p7_lytSp6);
        mod6_p7_lytSp7 = (LinearLayout) rootView.findViewById(R.id.mod6_p7_lytSp7);
        mod6_p7_lytSp8 = (LinearLayout) rootView.findViewById(R.id.mod6_p7_lytSp8);
        mod6_p7_lytSp9 = (LinearLayout) rootView.findViewById(R.id.mod6_p7_lytSp9);


        mod6_p7_1_ck1 = (CheckBox) rootView.findViewById(R.id.mod6_p7_1_ck1);
        mod6_p7_1_ck2 = (CheckBox) rootView.findViewById(R.id.mod6_p7_1_ck2);
        mod6_p7_1_ck3 = (CheckBox) rootView.findViewById(R.id.mod6_p7_1_ck3);
        mod6_p7_1_ck4 = (CheckBox) rootView.findViewById(R.id.mod6_p7_1_ck4);
        mod6_p7_1_ck5 = (CheckBox) rootView.findViewById(R.id.mod6_p7_1_ck5);
        mod6_p7_1_ck6 = (CheckBox) rootView.findViewById(R.id.mod6_p7_1_ck6);
        mod6_p7_1_ck7 = (CheckBox) rootView.findViewById(R.id.mod6_p7_1_ck7);
        mod6_p7_1_ck8 = (CheckBox) rootView.findViewById(R.id.mod6_p7_1_ck8);
        mod6_p7_1_ck9 = (CheckBox) rootView.findViewById(R.id.mod6_p7_1_ck9);
        mod6_p7_1_ck10 = (CheckBox) rootView.findViewById(R.id.mod6_p7_1_ck10);
        mod6_p7_edt1 = (EditText)rootView.findViewById(R.id.mod6_p7_edt1);




        mod6_p7_2_ck1 = (CheckBox) rootView.findViewById(R.id.mod6_p7_2_ck1);
        mod6_p7_2_ck2 = (CheckBox) rootView.findViewById(R.id.mod6_p7_2_ck2);
        mod6_p7_2_ck3 = (CheckBox) rootView.findViewById(R.id.mod6_p7_2_ck3);
        mod6_p7_2_ck4 = (CheckBox) rootView.findViewById(R.id.mod6_p7_2_ck4);
        mod6_p7_2_ck5 = (CheckBox) rootView.findViewById(R.id.mod6_p7_2_ck5);
        mod6_p7_2_ck6 = (CheckBox) rootView.findViewById(R.id.mod6_p7_2_ck6);
        mod6_p7_2_ck7 = (CheckBox) rootView.findViewById(R.id.mod6_p7_2_ck7);
        mod6_p7_2_ck8 = (CheckBox) rootView.findViewById(R.id.mod6_p7_2_ck8);
        mod6_p7_2_ck9 = (CheckBox) rootView.findViewById(R.id.mod6_p7_2_ck9);
        mod6_p7_2_ck10 = (CheckBox) rootView.findViewById(R.id.mod6_p7_2_ck10);
        mod6_p7_edt2 = (EditText)rootView.findViewById(R.id.mod6_p7_edt2);

        mod6_p7_3_ck1 = (CheckBox) rootView.findViewById(R.id.mod6_p7_3_ck1);
        mod6_p7_3_ck2 = (CheckBox) rootView.findViewById(R.id.mod6_p7_3_ck2);
        mod6_p7_3_ck3 = (CheckBox) rootView.findViewById(R.id.mod6_p7_3_ck3);
        mod6_p7_3_ck4 = (CheckBox) rootView.findViewById(R.id.mod6_p7_3_ck4);
        mod6_p7_3_ck5 = (CheckBox) rootView.findViewById(R.id.mod6_p7_3_ck5);
        mod6_p7_3_ck6 = (CheckBox) rootView.findViewById(R.id.mod6_p7_3_ck6);
        mod6_p7_3_ck7 = (CheckBox) rootView.findViewById(R.id.mod6_p7_3_ck7);
        mod6_p7_3_ck8 = (CheckBox) rootView.findViewById(R.id.mod6_p7_3_ck8);
        mod6_p7_3_ck9 = (CheckBox) rootView.findViewById(R.id.mod6_p7_3_ck9);
        mod6_p7_3_ck10 = (CheckBox) rootView.findViewById(R.id.mod6_p7_3_ck10);
        mod6_p7_edt3 = (EditText)rootView.findViewById(R.id.mod6_p7_edt3);


        mod6_p7_4_ck1 = (CheckBox) rootView.findViewById(R.id.mod6_p7_4_ck1);
        mod6_p7_4_ck2 = (CheckBox) rootView.findViewById(R.id.mod6_p7_4_ck2);
        mod6_p7_4_ck3 = (CheckBox) rootView.findViewById(R.id.mod6_p7_4_ck3);
        mod6_p7_4_ck4 = (CheckBox) rootView.findViewById(R.id.mod6_p7_4_ck4);
        mod6_p7_4_ck5 = (CheckBox) rootView.findViewById(R.id.mod6_p7_4_ck5);
        mod6_p7_4_ck6 = (CheckBox) rootView.findViewById(R.id.mod6_p7_4_ck6);
        mod6_p7_4_ck7 = (CheckBox) rootView.findViewById(R.id.mod6_p7_4_ck7);
        mod6_p7_4_ck8 = (CheckBox) rootView.findViewById(R.id.mod6_p7_4_ck8);
        mod6_p7_4_ck9 = (CheckBox) rootView.findViewById(R.id.mod6_p7_4_ck9);
        mod6_p7_4_ck10 = (CheckBox) rootView.findViewById(R.id.mod6_p7_4_ck10);
        mod6_p7_edt4 = (EditText)rootView.findViewById(R.id.mod6_p7_edt4);

        mod6_p7_5_ck1 = (CheckBox) rootView.findViewById(R.id.mod6_p7_5_ck1);
        mod6_p7_5_ck2 = (CheckBox) rootView.findViewById(R.id.mod6_p7_5_ck2);
        mod6_p7_5_ck3 = (CheckBox) rootView.findViewById(R.id.mod6_p7_5_ck3);
        mod6_p7_5_ck4 = (CheckBox) rootView.findViewById(R.id.mod6_p7_5_ck4);
        mod6_p7_5_ck5 = (CheckBox) rootView.findViewById(R.id.mod6_p7_5_ck5);
        mod6_p7_5_ck6 = (CheckBox) rootView.findViewById(R.id.mod6_p7_5_ck6);
        mod6_p7_5_ck7 = (CheckBox) rootView.findViewById(R.id.mod6_p7_5_ck7);
        mod6_p7_5_ck8 = (CheckBox) rootView.findViewById(R.id.mod6_p7_5_ck8);
        mod6_p7_5_ck9 = (CheckBox) rootView.findViewById(R.id.mod6_p7_5_ck9);
        mod6_p7_5_ck10 = (CheckBox) rootView.findViewById(R.id.mod6_p7_5_ck10);
        mod6_p7_edt5   = (EditText)rootView.findViewById(R.id.mod6_p7_edt5);


        mod6_p7_6_ck1 = (CheckBox) rootView.findViewById(R.id.mod6_p7_6_ck1);
        mod6_p7_6_ck2 = (CheckBox) rootView.findViewById(R.id.mod6_p7_6_ck2);
        mod6_p7_6_ck3 = (CheckBox) rootView.findViewById(R.id.mod6_p7_6_ck3);
        mod6_p7_6_ck4 = (CheckBox) rootView.findViewById(R.id.mod6_p7_6_ck4);
        mod6_p7_6_ck5 = (CheckBox) rootView.findViewById(R.id.mod6_p7_6_ck5);
        mod6_p7_6_ck6 = (CheckBox) rootView.findViewById(R.id.mod6_p7_6_ck6);
        mod6_p7_6_ck7 = (CheckBox) rootView.findViewById(R.id.mod6_p7_6_ck7);
        mod6_p7_6_ck8 = (CheckBox) rootView.findViewById(R.id.mod6_p7_6_ck8);
        mod6_p7_6_ck9 = (CheckBox) rootView.findViewById(R.id.mod6_p7_6_ck9);
        mod6_p7_6_ck10 = (CheckBox) rootView.findViewById(R.id.mod6_p7_6_ck10);
        mod6_p7_edt6 = (EditText)rootView.findViewById(R.id.mod6_p7_edt6);

        mod6_p7_7_ck1 = (CheckBox) rootView.findViewById(R.id.mod6_p7_7_ck1);
        mod6_p7_7_ck2 = (CheckBox) rootView.findViewById(R.id.mod6_p7_7_ck2);
        mod6_p7_7_ck3 = (CheckBox) rootView.findViewById(R.id.mod6_p7_7_ck3);
        mod6_p7_7_ck4 = (CheckBox) rootView.findViewById(R.id.mod6_p7_7_ck4);
        mod6_p7_7_ck5 = (CheckBox) rootView.findViewById(R.id.mod6_p7_7_ck5);
        mod6_p7_7_ck6 = (CheckBox) rootView.findViewById(R.id.mod6_p7_7_ck6);
        mod6_p7_7_ck7 = (CheckBox) rootView.findViewById(R.id.mod6_p7_7_ck7);
        mod6_p7_7_ck8 = (CheckBox) rootView.findViewById(R.id.mod6_p7_7_ck8);
        mod6_p7_7_ck9 = (CheckBox) rootView.findViewById(R.id.mod6_p7_7_ck9);
        mod6_p7_7_ck10 = (CheckBox) rootView.findViewById(R.id.mod6_p7_7_ck10);
        mod6_p7_edt7 = (EditText)rootView.findViewById(R.id.mod6_p7_edt7);

        mod6_p7_8_ck1 = (CheckBox) rootView.findViewById(R.id.mod6_p7_8_ck1);
        mod6_p7_8_ck2 = (CheckBox) rootView.findViewById(R.id.mod6_p7_8_ck2);
        mod6_p7_8_ck3 = (CheckBox) rootView.findViewById(R.id.mod6_p7_8_ck3);
        mod6_p7_8_ck4 = (CheckBox) rootView.findViewById(R.id.mod6_p7_8_ck4);
        mod6_p7_8_ck5 = (CheckBox) rootView.findViewById(R.id.mod6_p7_8_ck5);
        mod6_p7_8_ck6 = (CheckBox) rootView.findViewById(R.id.mod6_p7_8_ck6);
        mod6_p7_8_ck7 = (CheckBox) rootView.findViewById(R.id.mod6_p7_8_ck7);
        mod6_p7_8_ck8 = (CheckBox) rootView.findViewById(R.id.mod6_p7_8_ck8);
        mod6_p7_8_ck9 = (CheckBox) rootView.findViewById(R.id.mod6_p7_8_ck9);
        mod6_p7_8_ck10 = (CheckBox) rootView.findViewById(R.id.mod6_p7_8_ck10);
        mod6_p7_edt8 = (EditText)rootView.findViewById(R.id.mod6_p7_edt8);

        mod6_p7_9_ck1 = (CheckBox) rootView.findViewById(R.id.mod6_p7_9_ck1);
        mod6_p7_9_ck2 = (CheckBox) rootView.findViewById(R.id.mod6_p7_9_ck2);
        mod6_p7_9_ck3 = (CheckBox) rootView.findViewById(R.id.mod6_p7_9_ck3);
        mod6_p7_9_ck4 = (CheckBox) rootView.findViewById(R.id.mod6_p7_9_ck4);
        mod6_p7_9_ck5 = (CheckBox) rootView.findViewById(R.id.mod6_p7_9_ck5);
        mod6_p7_9_ck6 = (CheckBox) rootView.findViewById(R.id.mod6_p7_9_ck6);
        mod6_p7_9_ck7 = (CheckBox) rootView.findViewById(R.id.mod6_p7_9_ck7);
        mod6_p7_9_ck8 = (CheckBox) rootView.findViewById(R.id.mod6_p7_9_ck8);
        mod6_p7_9_ck9 = (CheckBox) rootView.findViewById(R.id.mod6_p7_9_ck9);
        mod6_p7_9_ck10 = (CheckBox) rootView.findViewById(R.id.mod6_p7_9_ck10);
        mod6_p7_edt9 = (EditText)rootView.findViewById(R.id.mod6_p7_edt9);

        mod6_p8_edt1 = (EditText)rootView.findViewById(R.id.mod6_p8_edt1);
        mod6_p8_edt2 = (EditText)rootView.findViewById(R.id.mod6_p8_edt2);
        mod6_p8_edt3 = (EditText)rootView.findViewById(R.id.mod6_p8_edt3);
        mod6_p8_edt4 = (EditText)rootView.findViewById(R.id.mod6_p8_edt4);
        mod6_p8_edt5 = (EditText)rootView.findViewById(R.id.mod6_p8_edt5);
        mod6_p8_edt6 = (EditText)rootView.findViewById(R.id.mod6_p8_edt6);
        mod6_p8_edt7 = (EditText)rootView.findViewById(R.id.mod6_p8_edt7);
        mod6_p8_edt8 = (EditText)rootView.findViewById(R.id.mod6_p8_edt8);
        mod6_p8_edt9 = (EditText)rootView.findViewById(R.id.mod6_p8_edt9);




        //MOSTRAR LAS OCUPACIONES  SELECCIONADAS
        //4.1.GERENTES
        validarPregunta(C6_p3_11,C5_t1,C6_p3_1,mod6_p7_ly1);

        //4.2.PROFESIONALES
        validarPregunta(C6_p3_22,C5_t2,C6_p3_2,mod6_p7_ly2);

        //4.3.TECNICOS
        validarPregunta(C6_p3_33,C5_t3,C6_p3_3,mod6_p7_ly3);

        //4.4.PERSONAL DE APOYO
        validarPregunta(C6_p3_44,C5_t4,C6_p3_4,mod6_p7_ly4);

        //4.5.PERSONAL DE SERVICIOS
        validarPregunta(C6_p3_55,C5_t5,C6_p3_5,mod6_p7_ly5);

        //4.6.TARBAJADORES CALIFICADOS
        validarPregunta(C6_p3_66,C5_t6,C6_p3_6,mod6_p7_ly6);

        //4.7.OFICIALES, OPERARIOS
        validarPregunta(C6_p3_77,C5_t7,C6_p3_7,mod6_p7_ly7);

        //4.8.OPERADORES DE INSTALACIONES
        validarPregunta(C6_p3_88,C5_t8,C6_p3_8,mod6_p7_ly8);

        //4.9.OCUPACIONES  ELEMENTALES
        validarPregunta(C6_p3_99,C5_t9,C6_p3_9,mod6_p7_ly9);

        return rootView;
    }
        @Override
        public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
            super.onViewCreated(view, savedInstanceState);
            final CheckBox[] listacheck1 ={
                    mod6_p7_1_ck1, mod6_p7_1_ck2, mod6_p7_1_ck3, mod6_p7_1_ck4,
                    mod6_p7_1_ck5, mod6_p7_1_ck6, mod6_p7_1_ck7, mod6_p7_1_ck8, mod6_p7_1_ck9

            };

            final CheckBox[] listacheck2 ={
                    mod6_p7_2_ck1, mod6_p7_2_ck2, mod6_p7_2_ck3, mod6_p7_2_ck4, mod6_p7_2_ck5,
                    mod6_p7_2_ck6, mod6_p7_2_ck7, mod6_p7_2_ck8, mod6_p7_2_ck9

            };


            final CheckBox[] listacheck3 ={
                    mod6_p7_3_ck1, mod6_p7_3_ck2, mod6_p7_3_ck3, mod6_p7_3_ck4,
                    mod6_p7_3_ck5, mod6_p7_3_ck6, mod6_p7_3_ck7, mod6_p7_3_ck8, mod6_p7_3_ck9

            };

            final CheckBox[] listacheck4 ={
                    mod6_p7_4_ck1, mod6_p7_4_ck2, mod6_p7_4_ck3, mod6_p7_4_ck4,
                    mod6_p7_4_ck5, mod6_p7_4_ck6, mod6_p7_4_ck7, mod6_p7_4_ck8, mod6_p7_4_ck9

            };

            final CheckBox[] listacheck5 ={
                    mod6_p7_5_ck1, mod6_p7_5_ck2, mod6_p7_5_ck3, mod6_p7_5_ck4, mod6_p7_5_ck5,
                    mod6_p7_5_ck6, mod6_p7_5_ck7, mod6_p7_5_ck8, mod6_p7_5_ck9

            };


            final CheckBox[] listacheck6 ={
                    mod6_p7_6_ck1, mod6_p7_6_ck2, mod6_p7_6_ck3, mod6_p7_6_ck4,
                    mod6_p7_6_ck5, mod6_p7_6_ck6, mod6_p7_6_ck7, mod6_p7_6_ck8, mod6_p7_6_ck9

            };


            final CheckBox[] listacheck7 ={
                    mod6_p7_7_ck1, mod6_p7_7_ck2, mod6_p7_7_ck3,
                    mod6_p7_7_ck4, mod6_p7_7_ck5, mod6_p7_7_ck6, mod6_p7_7_ck7, mod6_p7_7_ck8, mod6_p7_7_ck9

            };


            final CheckBox[] listacheck8 ={
                    mod6_p7_8_ck1, mod6_p7_8_ck2, mod6_p7_8_ck3, mod6_p7_8_ck4,
                    mod6_p7_8_ck5, mod6_p7_8_ck6, mod6_p7_8_ck7, mod6_p7_8_ck8, mod6_p7_8_ck9

            };


            final CheckBox[] listacheck9 ={
                    mod6_p7_9_ck1, mod6_p7_9_ck2, mod6_p7_9_ck3, mod6_p7_9_ck4,
                    mod6_p7_9_ck5, mod6_p7_9_ck6, mod6_p7_9_ck7, mod6_p7_9_ck8, mod6_p7_9_ck9

            };


            mod6_p8_edt1.setEnabled(false);
            mod6_p8_edt2.setEnabled(false);
            mod6_p8_edt3.setEnabled(false);
            mod6_p8_edt4.setEnabled(false);
            mod6_p8_edt5.setEnabled(false);
            mod6_p8_edt6.setEnabled(false);
            mod6_p8_edt7.setEnabled(false);
            mod6_p8_edt8.setEnabled(false);
            mod6_p8_edt9.setEnabled(false);
            mod6_p8_edt1.setBackgroundResource(R.drawable.fondo_edit_text_disabled);
            mod6_p8_edt2.setBackgroundResource(R.drawable.fondo_edit_text_disabled);
            mod6_p8_edt3.setBackgroundResource(R.drawable.fondo_edit_text_disabled);
            mod6_p8_edt4.setBackgroundResource(R.drawable.fondo_edit_text_disabled);
            mod6_p8_edt5.setBackgroundResource(R.drawable.fondo_edit_text_disabled);
            mod6_p8_edt6.setBackgroundResource(R.drawable.fondo_edit_text_disabled);
            mod6_p8_edt7.setBackgroundResource(R.drawable.fondo_edit_text_disabled);
            mod6_p8_edt8.setBackgroundResource(R.drawable.fondo_edit_text_disabled);
            mod6_p8_edt9.setBackgroundResource(R.drawable.fondo_edit_text_disabled);
            mod6_p8_edt1.setFilters(new InputFilter[]{new InputFilter.AllCaps()});
            mod6_p8_edt2.setFilters(new InputFilter[]{new InputFilter.AllCaps()});
            mod6_p8_edt3.setFilters(new InputFilter[]{new InputFilter.AllCaps()});
            mod6_p8_edt4.setFilters(new InputFilter[]{new InputFilter.AllCaps()});
            mod6_p8_edt5.setFilters(new InputFilter[]{new InputFilter.AllCaps()});
            mod6_p8_edt6.setFilters(new InputFilter[]{new InputFilter.AllCaps()});
            mod6_p8_edt7.setFilters(new InputFilter[]{new InputFilter.AllCaps()});
            mod6_p8_edt8.setFilters(new InputFilter[]{new InputFilter.AllCaps()});
            mod6_p8_edt9.setFilters(new InputFilter[]{new InputFilter.AllCaps()});






            // LISTA 1 --  ALTERNATIVA 10
            mod6_p7_1_ck10.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override

                public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

                    if (b) {
                        for (int i = 0; i < listacheck1.length; i++) {
                            final CheckBox checkBox = listacheck1[i];
                            checkBox.setEnabled(false);
                            checkBox.setChecked(false);
                            mod6_p8_edt1.setEnabled(true);
                            mod6_p8_edt1.setBackgroundResource(R.drawable.fondo_edit_text);


                        }

                    }
                    else {
                        for (int i = 0; i < listacheck1.length; i++) {
                            final CheckBox checkBox = listacheck1[i];
                            checkBox.setEnabled(true);
                            mod6_p8_edt1.setEnabled(false);
                            mod6_p8_edt1.setBackgroundResource(R.drawable.fondo_edit_text_disabled);
                            mod6_p8_edt1.setText("");



                        }
                    }
                }
            });


            // LISTA 2 --  ALTERNATIVA 10
            mod6_p7_2_ck10.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override

                public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

                    if (b) {
                        for (int i = 0; i < listacheck2.length; i++) {
                            final CheckBox checkBox = listacheck2[i];
                            checkBox.setEnabled(false);
                            checkBox.setChecked(false);
                            mod6_p8_edt2.setEnabled(true);
                            mod6_p8_edt2.setBackgroundResource(R.drawable.fondo_edit_text);

                        }

                    }
                    else {
                        for (int i = 0; i < listacheck2.length; i++) {
                            final CheckBox checkBox = listacheck2[i];
                            checkBox.setEnabled(true);
                            mod6_p8_edt2.setEnabled(false);
                            mod6_p8_edt2.setBackgroundResource(R.drawable.fondo_edit_text_disabled);
                            mod6_p8_edt2.setText("");


                        }
                    }
                }
            });

            // LISTA 3 --  ALTERNATIVA 10
            mod6_p7_3_ck10.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override

                public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

                    if (b) {
                        for (int i = 0; i < listacheck3.length; i++) {
                            final CheckBox checkBox = listacheck3[i];
                            checkBox.setEnabled(false);
                            checkBox.setChecked(false);
                            mod6_p8_edt3.setEnabled(true);
                            mod6_p8_edt3.setBackgroundResource(R.drawable.fondo_edit_text);

                        }

                    }
                    else {
                        for (int i = 0; i < listacheck3.length; i++) {
                            final CheckBox checkBox = listacheck3[i];
                            checkBox.setEnabled(true);
                            mod6_p8_edt3.setEnabled(false);
                            mod6_p8_edt3.setBackgroundResource(R.drawable.fondo_edit_text_disabled);
                            mod6_p8_edt3.setText("");


                        }
                    }
                }
            });



            // LISTA 4 --  ALTERNATIVA 10
            mod6_p7_4_ck10.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override

                public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

                    if (b) {
                        for (int i = 0; i < listacheck4.length; i++) {
                            final CheckBox checkBox = listacheck4[i];
                            checkBox.setEnabled(false);
                            checkBox.setChecked(false);
                            mod6_p8_edt4.setEnabled(true);
                            mod6_p8_edt4.setBackgroundResource(R.drawable.fondo_edit_text);

                        }

                    }
                    else {
                        for (int i = 0; i < listacheck4.length; i++) {
                            final CheckBox checkBox = listacheck4[i];
                            checkBox.setEnabled(true);
                            mod6_p8_edt4.setEnabled(false);
                            mod6_p8_edt4.setBackgroundResource(R.drawable.fondo_edit_text_disabled);
                            mod6_p8_edt4.setText("");


                        }
                    }
                }
            });



            // LISTA 5 --  ALTERNATIVA 10
            mod6_p7_5_ck10.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override

                public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

                    if (b) {
                        for (int i = 0; i < listacheck5.length; i++) {
                            final CheckBox checkBox = listacheck5[i];
                            checkBox.setEnabled(false);
                            checkBox.setChecked(false);
                            mod6_p8_edt5.setEnabled(true);
                            mod6_p8_edt5.setBackgroundResource(R.drawable.fondo_edit_text);

                        }

                    }
                    else {
                        for (int i = 0; i < listacheck5.length; i++) {
                            final CheckBox checkBox = listacheck5[i];
                            checkBox.setEnabled(true);
                            mod6_p8_edt5.setEnabled(false);
                            mod6_p8_edt5.setBackgroundResource(R.drawable.fondo_edit_text_disabled);
                            mod6_p8_edt5.setText("");


                        }
                    }
                }
            });



            // LISTA 6 --  ALTERNATIVA 10
            mod6_p7_6_ck10.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override

                public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

                    if (b) {
                        for (int i = 0; i < listacheck6.length; i++) {
                            final CheckBox checkBox = listacheck6[i];
                            checkBox.setEnabled(false);
                            checkBox.setChecked(false);
                            mod6_p8_edt6.setEnabled(true);
                            mod6_p8_edt6.setBackgroundResource(R.drawable.fondo_edit_text);

                        }

                    }
                    else {
                        for (int i = 0; i < listacheck6.length; i++) {
                            final CheckBox checkBox = listacheck6[i];
                            checkBox.setEnabled(true);
                            mod6_p8_edt6.setEnabled(false);
                            mod6_p8_edt6.setBackgroundResource(R.drawable.fondo_edit_text_disabled);
                            mod6_p8_edt6.setText("");


                        }
                    }
                }
            });


            // LISTA 7 --  ALTERNATIVA 10
            mod6_p7_7_ck10.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override

                public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

                    if (b) {
                        for (int i = 0; i < listacheck7.length; i++) {
                            final CheckBox checkBox = listacheck7[i];
                            checkBox.setEnabled(false);
                            checkBox.setChecked(false);
                            mod6_p8_edt7.setEnabled(true);
                            mod6_p8_edt7.setBackgroundResource(R.drawable.fondo_edit_text);

                        }

                    }
                    else {
                        for (int i = 0; i < listacheck7.length; i++) {
                            final CheckBox checkBox = listacheck7[i];
                            checkBox.setEnabled(true);
                            mod6_p8_edt7.setEnabled(false);
                            mod6_p8_edt7.setBackgroundResource(R.drawable.fondo_edit_text_disabled);
                            mod6_p8_edt7.setText("");


                        }
                    }
                }
            });



            // LISTA 8 --  ALTERNATIVA 10
            mod6_p7_8_ck10.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override

                public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

                    if (b) {
                        for (int i = 0; i < listacheck8.length; i++) {
                            final CheckBox checkBox = listacheck8[i];
                            checkBox.setEnabled(false);
                            checkBox.setChecked(false);
                            mod6_p8_edt8.setEnabled(true);
                            mod6_p8_edt8.setBackgroundResource(R.drawable.fondo_edit_text);

                        }

                    }
                    else {
                        for (int i = 0; i < listacheck8.length; i++) {
                            final CheckBox checkBox = listacheck8[i];
                            checkBox.setEnabled(true);
                            mod6_p8_edt8.setEnabled(false);
                            mod6_p8_edt8.setBackgroundResource(R.drawable.fondo_edit_text_disabled);
                            mod6_p8_edt8.setText("");


                        }
                    }
                }
            });




            // LISTA 9 --  ALTERNATIVA 10
            mod6_p7_9_ck10.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override

                public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

                    if (b) {
                        for (int i = 0; i < listacheck9.length; i++) {
                            final CheckBox checkBox = listacheck9[i];
                            checkBox.setEnabled(false);
                            checkBox.setChecked(false);
                            mod6_p8_edt9.setEnabled(true);
                            mod6_p8_edt9.setBackgroundResource(R.drawable.fondo_edit_text);

                        }

                    }
                    else {
                        for (int i = 0; i < listacheck9.length; i++) {
                            final CheckBox checkBox = listacheck9[i];
                            checkBox.setEnabled(true);
                            mod6_p8_edt9.setEnabled(false);
                            mod6_p8_edt9.setBackgroundResource(R.drawable.fondo_edit_text_disabled);
                            mod6_p8_edt9.setText("");


                        }
                    }
                }
            });

            cargarDatos();
       }

    public void validarPregunta(String check,String total, String competentes, LinearLayout layout){
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
                if(competentesInt < 100 && !total.equals("0") ){
                    layout.setVisibility(View.VISIBLE);
                }else{
                    layout.setVisibility(View.GONE);
                }
            }
        }else{
            layout.setVisibility(View.GONE);
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
            //pregunta 5.1
            if (modulo6.getC6_P7_1_1().equals("1")) mod6_p7_1_ck1.setChecked(true);if (modulo6.getC6_P7_1_1().equals("0")) mod6_p7_1_ck1.setChecked(false);
            if (modulo6.getC6_P7_1_2().equals("1")) mod6_p7_1_ck2.setChecked(true);if (modulo6.getC6_P7_1_2().equals("0")) mod6_p7_1_ck2.setChecked(false);
            if (modulo6.getC6_P7_1_3().equals("1")) mod6_p7_1_ck3.setChecked(true);if (modulo6.getC6_P7_1_3().equals("0")) mod6_p7_1_ck3.setChecked(false);
            if (modulo6.getC6_P7_1_4().equals("1")) mod6_p7_1_ck4.setChecked(true);if (modulo6.getC6_P7_1_4().equals("0")) mod6_p7_1_ck4.setChecked(false);
            if (modulo6.getC6_P7_1_5().equals("1")) mod6_p7_1_ck5.setChecked(true);if (modulo6.getC6_P7_1_5().equals("0")) mod6_p7_1_ck5.setChecked(false);
            if (modulo6.getC6_P7_1_6().equals("1")) mod6_p7_1_ck6.setChecked(true);if (modulo6.getC6_P7_1_6().equals("0")) mod6_p7_1_ck6.setChecked(false);
            if (modulo6.getC6_P7_1_7().equals("1")) mod6_p7_1_ck7.setChecked(true);if (modulo6.getC6_P7_1_7().equals("0")) mod6_p7_1_ck7.setChecked(false);
            if (modulo6.getC6_P7_1_8().equals("1")) mod6_p7_1_ck8.setChecked(true);if (modulo6.getC6_P7_1_8().equals("0")) mod6_p7_1_ck8.setChecked(false);
            if (modulo6.getC6_P7_1_9().equals("1")) mod6_p7_1_ck9.setChecked(true);if (modulo6.getC6_P7_1_9().equals("0")) mod6_p7_1_ck9.setChecked(false);
            if (modulo6.getC6_P7_1_10().equals("1")) mod6_p7_1_ck10.setChecked(true);if (modulo6.getC6_P7_1_10().equals("0")) mod6_p7_1_ck10.setChecked(false);
            if (modulo6.getC6_P7_2_1().equals("1")) mod6_p7_2_ck1.setChecked(true);if (modulo6.getC6_P7_2_1().equals("0")) mod6_p7_2_ck1.setChecked(false);
            if (modulo6.getC6_P7_2_2().equals("1")) mod6_p7_2_ck2.setChecked(true);if (modulo6.getC6_P7_2_2().equals("0")) mod6_p7_2_ck2.setChecked(false);
            if (modulo6.getC6_P7_2_3().equals("1")) mod6_p7_2_ck3.setChecked(true);if (modulo6.getC6_P7_2_3().equals("0")) mod6_p7_2_ck3.setChecked(false);
            if (modulo6.getC6_P7_2_4().equals("1")) mod6_p7_2_ck4.setChecked(true);if (modulo6.getC6_P7_2_4().equals("0")) mod6_p7_2_ck4.setChecked(false);
            if (modulo6.getC6_P7_2_5().equals("1")) mod6_p7_2_ck5.setChecked(true);if (modulo6.getC6_P7_2_5().equals("0")) mod6_p7_2_ck5.setChecked(false);
            if (modulo6.getC6_P7_2_6().equals("1")) mod6_p7_2_ck6.setChecked(true);if (modulo6.getC6_P7_2_6().equals("0")) mod6_p7_2_ck6.setChecked(false);
            if (modulo6.getC6_P7_2_7().equals("1")) mod6_p7_2_ck7.setChecked(true);if (modulo6.getC6_P7_2_7().equals("0")) mod6_p7_2_ck7.setChecked(false);
            if (modulo6.getC6_P7_2_8().equals("1")) mod6_p7_2_ck8.setChecked(true);if (modulo6.getC6_P7_2_8().equals("0")) mod6_p7_2_ck8.setChecked(false);
            if (modulo6.getC6_P7_2_9().equals("1")) mod6_p7_2_ck9.setChecked(true);if (modulo6.getC6_P7_2_9().equals("0")) mod6_p7_2_ck9.setChecked(false);
            if (modulo6.getC6_P7_2_10().equals("1")) mod6_p7_2_ck10.setChecked(true);if (modulo6.getC6_P7_2_10().equals("0")) mod6_p7_2_ck10.setChecked(false);
            if (modulo6.getC6_P7_3_1().equals("1")) mod6_p7_3_ck1.setChecked(true);if (modulo6.getC6_P7_3_1().equals("0")) mod6_p7_3_ck1.setChecked(false);
            if (modulo6.getC6_P7_3_2().equals("1")) mod6_p7_3_ck2.setChecked(true);if (modulo6.getC6_P7_3_2().equals("0")) mod6_p7_3_ck2.setChecked(false);
            if (modulo6.getC6_P7_3_3().equals("1")) mod6_p7_3_ck3.setChecked(true);if (modulo6.getC6_P7_3_3().equals("0")) mod6_p7_3_ck3.setChecked(false);
            if (modulo6.getC6_P7_3_4().equals("1")) mod6_p7_3_ck4.setChecked(true);if (modulo6.getC6_P7_3_4().equals("0")) mod6_p7_3_ck4.setChecked(false);
            if (modulo6.getC6_P7_3_5().equals("1")) mod6_p7_3_ck5.setChecked(true);if (modulo6.getC6_P7_3_5().equals("0")) mod6_p7_3_ck5.setChecked(false);
            if (modulo6.getC6_P7_3_6().equals("1")) mod6_p7_3_ck6.setChecked(true);if (modulo6.getC6_P7_3_6().equals("0")) mod6_p7_3_ck6.setChecked(false);
            if (modulo6.getC6_P7_3_7().equals("1")) mod6_p7_3_ck7.setChecked(true);if (modulo6.getC6_P7_3_7().equals("0")) mod6_p7_3_ck7.setChecked(false);
            if (modulo6.getC6_P7_3_8().equals("1")) mod6_p7_3_ck8.setChecked(true);if (modulo6.getC6_P7_3_8().equals("0")) mod6_p7_3_ck8.setChecked(false);
            if (modulo6.getC6_P7_3_9().equals("1")) mod6_p7_3_ck9.setChecked(true);if (modulo6.getC6_P7_3_9().equals("0")) mod6_p7_3_ck9.setChecked(false);
            if (modulo6.getC6_P7_3_10().equals("1")) mod6_p7_3_ck10.setChecked(true);if (modulo6.getC6_P7_3_10().equals("0")) mod6_p7_3_ck10.setChecked(false);
            if (modulo6.getC6_P7_4_1().equals("1")) mod6_p7_4_ck1.setChecked(true);if (modulo6.getC6_P7_4_1().equals("0")) mod6_p7_4_ck1.setChecked(false);
            if (modulo6.getC6_P7_4_2().equals("1")) mod6_p7_4_ck2.setChecked(true);if (modulo6.getC6_P7_4_2().equals("0")) mod6_p7_3_ck2.setChecked(false);
            if (modulo6.getC6_P7_4_3().equals("1")) mod6_p7_4_ck3.setChecked(true);if (modulo6.getC6_P7_4_3().equals("0")) mod6_p7_4_ck3.setChecked(false);
            if (modulo6.getC6_P7_4_4().equals("1")) mod6_p7_4_ck4.setChecked(true);if (modulo6.getC6_P7_4_4().equals("0")) mod6_p7_4_ck4.setChecked(false);
            if (modulo6.getC6_P7_4_5().equals("1")) mod6_p7_4_ck5.setChecked(true);if (modulo6.getC6_P7_4_5().equals("0")) mod6_p7_4_ck5.setChecked(false);
            if (modulo6.getC6_P7_4_6().equals("1")) mod6_p7_4_ck6.setChecked(true);if (modulo6.getC6_P7_4_6().equals("0")) mod6_p7_4_ck6.setChecked(false);
            if (modulo6.getC6_P7_4_7().equals("1")) mod6_p7_4_ck7.setChecked(true);if (modulo6.getC6_P7_4_7().equals("0")) mod6_p7_4_ck7.setChecked(false);
            if (modulo6.getC6_P7_4_8().equals("1")) mod6_p7_4_ck8.setChecked(true);if (modulo6.getC6_P7_4_8().equals("0")) mod6_p7_4_ck8.setChecked(false);
            if (modulo6.getC6_P7_4_9().equals("1")) mod6_p7_4_ck9.setChecked(true);if (modulo6.getC6_P7_4_9().equals("0")) mod6_p7_4_ck9.setChecked(false);
            if (modulo6.getC6_P7_4_10().equals("1")) mod6_p7_4_ck10.setChecked(true);if (modulo6.getC6_P7_4_10().equals("0")) mod6_p7_4_ck10.setChecked(false);
            if (modulo6.getC6_P7_5_1().equals("1")) mod6_p7_5_ck1.setChecked(true);if (modulo6.getC6_P7_5_1().equals("0")) mod6_p7_5_ck1.setChecked(false);
            if (modulo6.getC6_P7_5_2().equals("1")) mod6_p7_5_ck2.setChecked(true);if (modulo6.getC6_P7_5_2().equals("0")) mod6_p7_5_ck2.setChecked(false);
            if (modulo6.getC6_P7_5_3().equals("1")) mod6_p7_5_ck3.setChecked(true);if (modulo6.getC6_P7_5_3().equals("0")) mod6_p7_5_ck3.setChecked(false);
            if (modulo6.getC6_P7_5_4().equals("1")) mod6_p7_5_ck4.setChecked(true);if (modulo6.getC6_P7_5_4().equals("0")) mod6_p7_5_ck4.setChecked(false);
            if (modulo6.getC6_P7_5_5().equals("1")) mod6_p7_5_ck5.setChecked(true);if (modulo6.getC6_P7_5_5().equals("0")) mod6_p7_5_ck5.setChecked(false);
            if (modulo6.getC6_P7_5_6().equals("1")) mod6_p7_5_ck6.setChecked(true);if (modulo6.getC6_P7_5_6().equals("0")) mod6_p7_5_ck6.setChecked(false);
            if (modulo6.getC6_P7_5_7().equals("1")) mod6_p7_5_ck7.setChecked(true);if (modulo6.getC6_P7_5_7().equals("0")) mod6_p7_5_ck7.setChecked(false);
            if (modulo6.getC6_P7_5_8().equals("1")) mod6_p7_5_ck8.setChecked(true);if (modulo6.getC6_P7_5_8().equals("0")) mod6_p7_5_ck8.setChecked(false);
            if (modulo6.getC6_P7_5_9().equals("1")) mod6_p7_5_ck9.setChecked(true);if (modulo6.getC6_P7_5_9().equals("0")) mod6_p7_5_ck9.setChecked(false);
            if (modulo6.getC6_P7_5_10().equals("1")) mod6_p7_5_ck10.setChecked(true);if (modulo6.getC6_P7_5_10().equals("0")) mod6_p7_5_ck10.setChecked(false);
            if (modulo6.getC6_P7_6_1().equals("1")) mod6_p7_6_ck1.setChecked(true);if (modulo6.getC6_P7_6_1().equals("0")) mod6_p7_6_ck1.setChecked(false);
            if (modulo6.getC6_P7_6_2().equals("1")) mod6_p7_6_ck2.setChecked(true);if (modulo6.getC6_P7_6_2().equals("0")) mod6_p7_6_ck2.setChecked(false);
            if (modulo6.getC6_P7_6_3().equals("1")) mod6_p7_6_ck3.setChecked(true);if (modulo6.getC6_P7_6_3().equals("0")) mod6_p7_6_ck3.setChecked(false);
            if (modulo6.getC6_P7_6_4().equals("1")) mod6_p7_6_ck4.setChecked(true);if (modulo6.getC6_P7_6_4().equals("0")) mod6_p7_6_ck4.setChecked(false);
            if (modulo6.getC6_P7_6_5().equals("1")) mod6_p7_6_ck5.setChecked(true);if (modulo6.getC6_P7_6_5().equals("0")) mod6_p7_6_ck5.setChecked(false);
            if (modulo6.getC6_P7_6_6().equals("1")) mod6_p7_6_ck6.setChecked(true);if (modulo6.getC6_P7_6_6().equals("0")) mod6_p7_6_ck6.setChecked(false);
            if (modulo6.getC6_P7_6_7().equals("1")) mod6_p7_6_ck7.setChecked(true);if (modulo6.getC6_P7_6_7().equals("0")) mod6_p7_6_ck7.setChecked(false);
            if (modulo6.getC6_P7_6_8().equals("1")) mod6_p7_6_ck8.setChecked(true);if (modulo6.getC6_P7_6_8().equals("0")) mod6_p7_6_ck8.setChecked(false);
            if (modulo6.getC6_P7_6_9().equals("1")) mod6_p7_6_ck9.setChecked(true);if (modulo6.getC6_P7_6_9().equals("0")) mod6_p7_6_ck9.setChecked(false);
            if (modulo6.getC6_P7_6_10().equals("1")) mod6_p7_6_ck10.setChecked(true);if (modulo6.getC6_P7_6_10().equals("0")) mod6_p7_6_ck10.setChecked(false);
            if (modulo6.getC6_P7_7_1().equals("1")) mod6_p7_7_ck1.setChecked(true);if (modulo6.getC6_P7_7_1().equals("0")) mod6_p7_7_ck1.setChecked(false);
            if (modulo6.getC6_P7_7_2().equals("1")) mod6_p7_7_ck2.setChecked(true);if (modulo6.getC6_P7_7_2().equals("0")) mod6_p7_7_ck2.setChecked(false);
            if (modulo6.getC6_P7_7_3().equals("1")) mod6_p7_7_ck3.setChecked(true);if (modulo6.getC6_P7_7_3().equals("0")) mod6_p7_7_ck3.setChecked(false);
            if (modulo6.getC6_P7_7_4().equals("1")) mod6_p7_7_ck4.setChecked(true);if (modulo6.getC6_P7_7_4().equals("0")) mod6_p7_7_ck4.setChecked(false);
            if (modulo6.getC6_P7_7_5().equals("1")) mod6_p7_7_ck5.setChecked(true);if (modulo6.getC6_P7_7_5().equals("0")) mod6_p7_7_ck5.setChecked(false);
            if (modulo6.getC6_P7_7_6().equals("1")) mod6_p7_7_ck6.setChecked(true);if (modulo6.getC6_P7_7_6().equals("0")) mod6_p7_7_ck6.setChecked(false);
            if (modulo6.getC6_P7_7_7().equals("1")) mod6_p7_7_ck7.setChecked(true);if (modulo6.getC6_P7_7_7().equals("0")) mod6_p7_7_ck7.setChecked(false);
            if (modulo6.getC6_P7_7_8().equals("1")) mod6_p7_7_ck8.setChecked(true);if (modulo6.getC6_P7_7_8().equals("0")) mod6_p7_7_ck8.setChecked(false);
            if (modulo6.getC6_P7_7_9().equals("1")) mod6_p7_7_ck9.setChecked(true);if (modulo6.getC6_P7_7_9().equals("0")) mod6_p7_7_ck9.setChecked(false);
            if (modulo6.getC6_P7_7_10().equals("1")) mod6_p7_7_ck10.setChecked(true);if (modulo6.getC6_P7_7_10().equals("0")) mod6_p7_7_ck10.setChecked(false);
            if (modulo6.getC6_P7_8_1().equals("1")) mod6_p7_8_ck1.setChecked(true);if (modulo6.getC6_P7_8_1().equals("0")) mod6_p7_8_ck1.setChecked(false);
            if (modulo6.getC6_P7_8_2().equals("1")) mod6_p7_8_ck2.setChecked(true);if (modulo6.getC6_P7_8_2().equals("0")) mod6_p7_8_ck2.setChecked(false);
            if (modulo6.getC6_P7_8_3().equals("1")) mod6_p7_8_ck3.setChecked(true);if (modulo6.getC6_P7_8_3().equals("0")) mod6_p7_8_ck3.setChecked(false);
            if (modulo6.getC6_P7_8_4().equals("1")) mod6_p7_8_ck4.setChecked(true);if (modulo6.getC6_P7_8_4().equals("0")) mod6_p7_8_ck4.setChecked(false);
            if (modulo6.getC6_P7_8_5().equals("1")) mod6_p7_8_ck5.setChecked(true);if (modulo6.getC6_P7_8_5().equals("0")) mod6_p7_8_ck5.setChecked(false);
            if (modulo6.getC6_P7_8_6().equals("1")) mod6_p7_8_ck6.setChecked(true);if (modulo6.getC6_P7_8_6().equals("0")) mod6_p7_8_ck6.setChecked(false);
            if (modulo6.getC6_P7_8_7().equals("1")) mod6_p7_8_ck7.setChecked(true);if (modulo6.getC6_P7_8_7().equals("0")) mod6_p7_8_ck7.setChecked(false);
            if (modulo6.getC6_P7_8_8().equals("1")) mod6_p7_8_ck8.setChecked(true);if (modulo6.getC6_P7_8_8().equals("0")) mod6_p7_8_ck8.setChecked(false);
            if (modulo6.getC6_P7_8_9().equals("1")) mod6_p7_8_ck9.setChecked(true);if (modulo6.getC6_P7_8_9().equals("0")) mod6_p7_8_ck9.setChecked(false);
            if (modulo6.getC6_P7_8_10().equals("1")) mod6_p7_8_ck10.setChecked(true);if (modulo6.getC6_P7_8_10().equals("0")) mod6_p7_8_ck10.setChecked(false);
            if (modulo6.getC6_P7_9_1().equals("1")) mod6_p7_9_ck1.setChecked(true);if (modulo6.getC6_P7_9_1().equals("0")) mod6_p7_9_ck1.setChecked(false);
            if (modulo6.getC6_P7_9_2().equals("1")) mod6_p7_9_ck2.setChecked(true);if (modulo6.getC6_P7_9_2().equals("0")) mod6_p7_9_ck2.setChecked(false);
            if (modulo6.getC6_P7_9_3().equals("1")) mod6_p7_9_ck3.setChecked(true);if (modulo6.getC6_P7_9_3().equals("0")) mod6_p7_9_ck3.setChecked(false);
            if (modulo6.getC6_P7_9_4().equals("1")) mod6_p7_9_ck4.setChecked(true);if (modulo6.getC6_P7_9_4().equals("0")) mod6_p7_9_ck4.setChecked(false);
            if (modulo6.getC6_P7_9_5().equals("1")) mod6_p7_9_ck5.setChecked(true);if (modulo6.getC6_P7_9_5().equals("0")) mod6_p7_9_ck5.setChecked(false);
            if (modulo6.getC6_P7_9_6().equals("1")) mod6_p7_9_ck6.setChecked(true);if (modulo6.getC6_P7_9_6().equals("0")) mod6_p7_9_ck6.setChecked(false);
            if (modulo6.getC6_P7_9_7().equals("1")) mod6_p7_9_ck7.setChecked(true);if (modulo6.getC6_P7_9_7().equals("0")) mod6_p7_9_ck7.setChecked(false);
            if (modulo6.getC6_P7_9_8().equals("1")) mod6_p7_9_ck8.setChecked(true);if (modulo6.getC6_P7_9_8().equals("0")) mod6_p7_9_ck8.setChecked(false);
            if (modulo6.getC6_P7_9_9().equals("1")) mod6_p7_9_ck9.setChecked(true);if (modulo6.getC6_P7_9_9().equals("0")) mod6_p7_9_ck9.setChecked(false);
            if (modulo6.getC6_P7_9_10().equals("1")) mod6_p7_9_ck10.setChecked(true);if (modulo6.getC6_P7_9_10().equals("0")) mod6_p7_9_ck10.setChecked(false);
            mod6_p8_edt1.setText(modulo6.getC6_P8_1());
            mod6_p8_edt2.setText(modulo6.getC6_P8_2());
            mod6_p8_edt3.setText(modulo6.getC6_P8_3());
            mod6_p8_edt4.setText(modulo6.getC6_P8_4());
            mod6_p8_edt5.setText(modulo6.getC6_P8_5());
            mod6_p8_edt6.setText(modulo6.getC6_P8_6());
            mod6_p8_edt7.setText(modulo6.getC6_P8_7());
            mod6_p8_edt8.setText(modulo6.getC6_P8_8());
            mod6_p8_edt9.setText(modulo6.getC6_P8_9());




        }
        data.close();
    }

    public void llenarMapaVariables() {
        //preguntas cabecera
        if (mod6_p7_1_ck1.isChecked()) C6_P7_1_1 = 1;else C6_P7_1_1= 0;
        if (mod6_p7_1_ck2.isChecked()) C6_P7_1_2 = 1;else C6_P7_1_2= 0;
        if (mod6_p7_1_ck3.isChecked()) C6_P7_1_3 = 1;else C6_P7_1_3= 0;
        if (mod6_p7_1_ck4.isChecked()) C6_P7_1_4 = 1;else C6_P7_1_4= 0;
        if (mod6_p7_1_ck5.isChecked()) C6_P7_1_5 = 1;else C6_P7_1_5= 0;
        if (mod6_p7_1_ck6.isChecked()) C6_P7_1_6 = 1;else C6_P7_1_6= 0;
        if (mod6_p7_1_ck7.isChecked()) C6_P7_1_7 = 1;else C6_P7_1_7= 0;
        if (mod6_p7_1_ck8.isChecked()) C6_P7_1_8 = 1;else C6_P7_1_8= 0;
        if (mod6_p7_1_ck9.isChecked()) C6_P7_1_9 = 1;else C6_P7_1_9= 0;
        if (mod6_p7_1_ck10.isChecked()) C6_P7_1_10 = 1;else C6_P7_1_10= 0;

        if (mod6_p7_2_ck1.isChecked()) C6_P7_2_1 = 1;else C6_P7_2_1= 0;
        if (mod6_p7_2_ck2.isChecked()) C6_P7_2_2 = 1;else C6_P7_2_2= 0;
        if (mod6_p7_2_ck3.isChecked()) C6_P7_2_3 = 1;else C6_P7_2_3= 0;
        if (mod6_p7_2_ck4.isChecked()) C6_P7_2_4 = 1;else C6_P7_2_4= 0;
        if (mod6_p7_2_ck5.isChecked()) C6_P7_2_5 = 1;else C6_P7_2_5= 0;
        if (mod6_p7_2_ck6.isChecked()) C6_P7_2_6 = 1;else C6_P7_2_6= 0;
        if (mod6_p7_2_ck7.isChecked()) C6_P7_2_7 = 1;else C6_P7_2_7= 0;
        if (mod6_p7_2_ck8.isChecked()) C6_P7_2_8 = 1;else C6_P7_2_8= 0;
        if (mod6_p7_2_ck9.isChecked()) C6_P7_2_9 = 1;else C6_P7_2_9= 0;
        if (mod6_p7_2_ck10.isChecked()) C6_P7_2_10 = 1;else C6_P7_2_10= 0;

        if (mod6_p7_3_ck1.isChecked()) C6_P7_3_1 = 1;else C6_P7_3_1= 0;
        if (mod6_p7_3_ck2.isChecked()) C6_P7_3_2 = 1;else C6_P7_3_2= 0;
        if (mod6_p7_3_ck3.isChecked()) C6_P7_3_3 = 1;else C6_P7_3_3= 0;
        if (mod6_p7_3_ck4.isChecked()) C6_P7_3_4 = 1;else C6_P7_3_4= 0;
        if (mod6_p7_3_ck5.isChecked()) C6_P7_3_5 = 1;else C6_P7_3_5= 0;
        if (mod6_p7_3_ck6.isChecked()) C6_P7_3_6 = 1;else C6_P7_3_6= 0;
        if (mod6_p7_3_ck7.isChecked()) C6_P7_3_7 = 1;else C6_P7_3_7= 0;
        if (mod6_p7_3_ck8.isChecked()) C6_P7_3_8 = 1;else C6_P7_3_8= 0;
        if (mod6_p7_3_ck9.isChecked()) C6_P7_3_9 = 1;else C6_P7_3_9= 0;
        if (mod6_p7_3_ck10.isChecked()) C6_P7_3_10 = 1;else C6_P7_3_10= 0;

        if (mod6_p7_4_ck1.isChecked()) C6_P7_4_1 = 1;else C6_P7_4_1= 0;
        if (mod6_p7_4_ck2.isChecked()) C6_P7_4_2 = 1;else C6_P7_4_2= 0;
        if (mod6_p7_4_ck3.isChecked()) C6_P7_4_3 = 1;else C6_P7_4_3= 0;
        if (mod6_p7_4_ck4.isChecked()) C6_P7_4_4 = 1;else C6_P7_4_4= 0;
        if (mod6_p7_4_ck5.isChecked()) C6_P7_4_5 = 1;else C6_P7_4_5= 0;
        if (mod6_p7_4_ck6.isChecked()) C6_P7_4_6 = 1;else C6_P7_4_6= 0;
        if (mod6_p7_4_ck7.isChecked()) C6_P7_4_7 = 1;else C6_P7_4_7= 0;
        if (mod6_p7_4_ck8.isChecked()) C6_P7_4_8 = 1;else C6_P7_4_8= 0;
        if (mod6_p7_4_ck9.isChecked()) C6_P7_4_9 = 1;else C6_P7_4_9= 0;
        if (mod6_p7_4_ck10.isChecked()) C6_P7_4_10 = 1;else C6_P7_4_10= 0;

        if (mod6_p7_5_ck1.isChecked()) C6_P7_5_1 = 1;else C6_P7_5_1= 0;
        if (mod6_p7_5_ck2.isChecked()) C6_P7_5_2 = 1;else C6_P7_5_2= 0;
        if (mod6_p7_5_ck3.isChecked()) C6_P7_5_3 = 1;else C6_P7_5_3= 0;
        if (mod6_p7_5_ck4.isChecked()) C6_P7_5_4 = 1;else C6_P7_5_4= 0;
        if (mod6_p7_5_ck5.isChecked()) C6_P7_5_5 = 1;else C6_P7_5_5= 0;
        if (mod6_p7_5_ck6.isChecked()) C6_P7_5_6 = 1;else C6_P7_5_6= 0;
        if (mod6_p7_5_ck7.isChecked()) C6_P7_5_7 = 1;else C6_P7_5_7= 0;
        if (mod6_p7_5_ck8.isChecked()) C6_P7_5_8 = 1;else C6_P7_5_8= 0;
        if (mod6_p7_5_ck9.isChecked()) C6_P7_5_9 = 1;else C6_P7_5_9= 0;
        if (mod6_p7_5_ck10.isChecked()) C6_P7_5_10 = 1;else C6_P7_5_10= 0;

        if (mod6_p7_6_ck1.isChecked()) C6_P7_6_1 = 1;else C6_P7_6_1= 0;
        if (mod6_p7_6_ck2.isChecked()) C6_P7_6_2 = 1;else C6_P7_6_2= 0;
        if (mod6_p7_6_ck3.isChecked()) C6_P7_6_3 = 1;else C6_P7_6_3= 0;
        if (mod6_p7_6_ck4.isChecked()) C6_P7_6_4 = 1;else C6_P7_6_4= 0;
        if (mod6_p7_6_ck5.isChecked()) C6_P7_6_5 = 1;else C6_P7_6_5= 0;
        if (mod6_p7_6_ck6.isChecked()) C6_P7_6_6 = 1;else C6_P7_6_6= 0;
        if (mod6_p7_6_ck7.isChecked()) C6_P7_6_7 = 1;else C6_P7_6_7= 0;
        if (mod6_p7_6_ck8.isChecked()) C6_P7_6_8 = 1;else C6_P7_6_8= 0;
        if (mod6_p7_6_ck9.isChecked()) C6_P7_6_9 = 1;else C6_P7_6_9= 0;
        if (mod6_p7_6_ck10.isChecked()) C6_P7_6_10 = 1;else C6_P7_6_10= 0;

        if (mod6_p7_7_ck1.isChecked()) C6_P7_7_1 = 1;else C6_P7_7_1= 0;
        if (mod6_p7_7_ck2.isChecked()) C6_P7_7_2 = 1;else C6_P7_7_2= 0;
        if (mod6_p7_7_ck3.isChecked()) C6_P7_7_3 = 1;else C6_P7_7_3= 0;
        if (mod6_p7_7_ck4.isChecked()) C6_P7_7_4 = 1;else C6_P7_7_4= 0;
        if (mod6_p7_7_ck5.isChecked()) C6_P7_7_5 = 1;else C6_P7_7_5= 0;
        if (mod6_p7_7_ck6.isChecked()) C6_P7_7_6 = 1;else C6_P7_7_6= 0;
        if (mod6_p7_7_ck7.isChecked()) C6_P7_7_7 = 1;else C6_P7_7_7= 0;
        if (mod6_p7_7_ck8.isChecked()) C6_P7_7_8 = 1;else C6_P7_7_8= 0;
        if (mod6_p7_7_ck9.isChecked()) C6_P7_7_9 = 1;else C6_P7_7_9= 0;
        if (mod6_p7_7_ck10.isChecked()) C6_P7_7_10 = 1;else C6_P7_7_10= 0;

        if (mod6_p7_8_ck1.isChecked()) C6_P7_8_1 = 1;else C6_P7_8_1= 0;
        if (mod6_p7_8_ck2.isChecked()) C6_P7_8_2 = 1;else C6_P7_8_2= 0;
        if (mod6_p7_8_ck3.isChecked()) C6_P7_8_3 = 1;else C6_P7_8_3= 0;
        if (mod6_p7_8_ck4.isChecked()) C6_P7_8_4 = 1;else C6_P7_8_4= 0;
        if (mod6_p7_8_ck5.isChecked()) C6_P7_8_5 = 1;else C6_P7_8_5= 0;
        if (mod6_p7_8_ck6.isChecked()) C6_P7_8_6 = 1;else C6_P7_8_6= 0;
        if (mod6_p7_8_ck7.isChecked()) C6_P7_8_7 = 1;else C6_P7_8_7= 0;
        if (mod6_p7_8_ck8.isChecked()) C6_P7_8_8 = 1;else C6_P7_8_8= 0;
        if (mod6_p7_8_ck9.isChecked()) C6_P7_8_9 = 1;else C6_P7_8_9= 0;
        if (mod6_p7_8_ck10.isChecked()) C6_P7_8_10 = 1;else C6_P7_8_10= 0;

        if (mod6_p7_9_ck1.isChecked()) C6_P7_9_1 = 1;else C6_P7_9_1= 0;
        if (mod6_p7_9_ck2.isChecked()) C6_P7_9_2 = 1;else C6_P7_9_2= 0;
        if (mod6_p7_9_ck3.isChecked()) C6_P7_9_3 = 1;else C6_P7_9_3= 0;
        if (mod6_p7_9_ck4.isChecked()) C6_P7_9_4 = 1;else C6_P7_9_4= 0;
        if (mod6_p7_9_ck5.isChecked()) C6_P7_9_5 = 1;else C6_P7_9_5= 0;
        if (mod6_p7_9_ck6.isChecked()) C6_P7_9_6 = 1;else C6_P7_9_6= 0;
        if (mod6_p7_9_ck7.isChecked()) C6_P7_9_7 = 1;else C6_P7_9_7= 0;
        if (mod6_p7_9_ck8.isChecked()) C6_P7_9_8 = 1;else C6_P7_9_8= 0;
        if (mod6_p7_9_ck9.isChecked()) C6_P7_9_9 = 1;else C6_P7_9_9= 0;
        if (mod6_p7_9_ck10.isChecked()) C6_P7_9_10 = 1;else C6_P7_9_10= 0;
        C6_P8_1 = mod6_p8_edt1.getText().toString();
        C6_P8_2 = mod6_p8_edt2.getText().toString();
        C6_P8_3 = mod6_p8_edt3.getText().toString();
        C6_P8_4 = mod6_p8_edt4.getText().toString();
        C6_P8_5 = mod6_p8_edt5.getText().toString();
        C6_P8_6 = mod6_p8_edt6.getText().toString();
        C6_P8_7 = mod6_p8_edt7.getText().toString();
        C6_P8_8 = mod6_p8_edt8.getText().toString();
        C6_P8_9 = mod6_p8_edt9.getText().toString();

    }

    public void guardarDatos() {
        data = new Data(context);
        data.open();
        if (data.existeModulo6(idempresa)) {
            ContentValues contentValues = new ContentValues(478);
            contentValues.put(SQLConstantes.MODULO6_P7_1_1,C6_P7_1_1+"");
            contentValues.put(SQLConstantes.MODULO6_P7_1_2,C6_P7_1_2+"");
            contentValues.put(SQLConstantes.MODULO6_P7_1_3,C6_P7_1_3+"");
            contentValues.put(SQLConstantes.MODULO6_P7_1_4,C6_P7_1_4+"");
            contentValues.put(SQLConstantes.MODULO6_P7_1_5,C6_P7_1_5+"");
            contentValues.put(SQLConstantes.MODULO6_P7_1_6,C6_P7_1_6+"");
            contentValues.put(SQLConstantes.MODULO6_P7_1_7,C6_P7_1_7+"");
            contentValues.put(SQLConstantes.MODULO6_P7_1_8,C6_P7_1_8+"");
            contentValues.put(SQLConstantes.MODULO6_P7_1_9,C6_P7_1_9+"");
            contentValues.put(SQLConstantes.MODULO6_P7_1_10,C6_P7_1_10+"");

            contentValues.put(SQLConstantes.MODULO6_P7_2_1,C6_P7_2_1+"");
            contentValues.put(SQLConstantes.MODULO6_P7_2_2,C6_P7_2_2+"");
            contentValues.put(SQLConstantes.MODULO6_P7_2_3,C6_P7_2_3+"");
            contentValues.put(SQLConstantes.MODULO6_P7_2_4,C6_P7_2_4+"");
            contentValues.put(SQLConstantes.MODULO6_P7_2_5,C6_P7_2_5+"");
            contentValues.put(SQLConstantes.MODULO6_P7_2_6,C6_P7_2_6+"");
            contentValues.put(SQLConstantes.MODULO6_P7_2_7,C6_P7_2_7+"");
            contentValues.put(SQLConstantes.MODULO6_P7_2_8,C6_P7_2_8+"");
            contentValues.put(SQLConstantes.MODULO6_P7_2_9,C6_P7_2_9+"");
            contentValues.put(SQLConstantes.MODULO6_P7_2_10,C6_P7_2_10+"");

            contentValues.put(SQLConstantes.MODULO6_P7_3_1,C6_P7_3_1+"");
            contentValues.put(SQLConstantes.MODULO6_P7_3_2,C6_P7_3_2+"");
            contentValues.put(SQLConstantes.MODULO6_P7_3_3,C6_P7_3_3+"");
            contentValues.put(SQLConstantes.MODULO6_P7_3_4,C6_P7_3_4+"");
            contentValues.put(SQLConstantes.MODULO6_P7_3_5,C6_P7_3_5+"");
            contentValues.put(SQLConstantes.MODULO6_P7_3_6,C6_P7_3_6+"");
            contentValues.put(SQLConstantes.MODULO6_P7_3_7,C6_P7_3_7+"");
            contentValues.put(SQLConstantes.MODULO6_P7_3_8,C6_P7_3_8+"");
            contentValues.put(SQLConstantes.MODULO6_P7_3_9,C6_P7_3_9+"");
            contentValues.put(SQLConstantes.MODULO6_P7_3_10,C6_P7_3_10+"");

            contentValues.put(SQLConstantes.MODULO6_P7_4_1,C6_P7_4_1+"");
            contentValues.put(SQLConstantes.MODULO6_P7_4_2,C6_P7_4_2+"");
            contentValues.put(SQLConstantes.MODULO6_P7_4_3,C6_P7_4_3+"");
            contentValues.put(SQLConstantes.MODULO6_P7_4_4,C6_P7_4_4+"");
            contentValues.put(SQLConstantes.MODULO6_P7_4_5,C6_P7_4_5+"");
            contentValues.put(SQLConstantes.MODULO6_P7_4_6,C6_P7_4_6+"");
            contentValues.put(SQLConstantes.MODULO6_P7_4_7,C6_P7_4_7+"");
            contentValues.put(SQLConstantes.MODULO6_P7_4_8,C6_P7_4_8+"");
            contentValues.put(SQLConstantes.MODULO6_P7_4_9,C6_P7_4_9+"");
            contentValues.put(SQLConstantes.MODULO6_P7_4_10,C6_P7_4_10+"");

            contentValues.put(SQLConstantes.MODULO6_P7_5_1,C6_P7_5_1+"");
            contentValues.put(SQLConstantes.MODULO6_P7_5_2,C6_P7_5_2+"");
            contentValues.put(SQLConstantes.MODULO6_P7_5_3,C6_P7_5_3+"");
            contentValues.put(SQLConstantes.MODULO6_P7_5_4,C6_P7_5_4+"");
            contentValues.put(SQLConstantes.MODULO6_P7_5_5,C6_P7_5_5+"");
            contentValues.put(SQLConstantes.MODULO6_P7_5_6,C6_P7_5_6+"");
            contentValues.put(SQLConstantes.MODULO6_P7_5_7,C6_P7_5_7+"");
            contentValues.put(SQLConstantes.MODULO6_P7_5_8,C6_P7_5_8+"");
            contentValues.put(SQLConstantes.MODULO6_P7_5_9,C6_P7_5_9+"");
            contentValues.put(SQLConstantes.MODULO6_P7_5_10,C6_P7_5_10+"");

            contentValues.put(SQLConstantes.MODULO6_P7_6_1,C6_P7_6_1+"");
            contentValues.put(SQLConstantes.MODULO6_P7_6_2,C6_P7_6_2+"");
            contentValues.put(SQLConstantes.MODULO6_P7_6_3,C6_P7_6_3+"");
            contentValues.put(SQLConstantes.MODULO6_P7_6_4,C6_P7_6_4+"");
            contentValues.put(SQLConstantes.MODULO6_P7_6_5,C6_P7_6_5+"");
            contentValues.put(SQLConstantes.MODULO6_P7_6_6,C6_P7_6_6+"");
            contentValues.put(SQLConstantes.MODULO6_P7_6_7,C6_P7_6_7+"");
            contentValues.put(SQLConstantes.MODULO6_P7_6_8,C6_P7_6_8+"");
            contentValues.put(SQLConstantes.MODULO6_P7_6_9,C6_P7_6_9+"");
            contentValues.put(SQLConstantes.MODULO6_P7_6_10,C6_P7_6_10+"");

            contentValues.put(SQLConstantes.MODULO6_P7_7_1,C6_P7_7_1+"");
            contentValues.put(SQLConstantes.MODULO6_P7_7_2,C6_P7_7_2+"");
            contentValues.put(SQLConstantes.MODULO6_P7_7_3,C6_P7_7_3+"");
            contentValues.put(SQLConstantes.MODULO6_P7_7_4,C6_P7_7_4+"");
            contentValues.put(SQLConstantes.MODULO6_P7_7_5,C6_P7_7_5+"");
            contentValues.put(SQLConstantes.MODULO6_P7_7_6,C6_P7_7_6+"");
            contentValues.put(SQLConstantes.MODULO6_P7_7_7,C6_P7_7_7+"");
            contentValues.put(SQLConstantes.MODULO6_P7_7_8,C6_P7_7_8+"");
            contentValues.put(SQLConstantes.MODULO6_P7_7_9,C6_P7_7_9+"");
            contentValues.put(SQLConstantes.MODULO6_P7_7_10,C6_P7_7_10+"");

            contentValues.put(SQLConstantes.MODULO6_P7_8_1,C6_P7_8_1+"");
            contentValues.put(SQLConstantes.MODULO6_P7_8_2,C6_P7_8_2+"");
            contentValues.put(SQLConstantes.MODULO6_P7_8_3,C6_P7_8_3+"");
            contentValues.put(SQLConstantes.MODULO6_P7_8_4,C6_P7_8_4+"");
            contentValues.put(SQLConstantes.MODULO6_P7_8_5,C6_P7_8_5+"");
            contentValues.put(SQLConstantes.MODULO6_P7_8_6,C6_P7_8_6+"");
            contentValues.put(SQLConstantes.MODULO6_P7_8_7,C6_P7_8_7+"");
            contentValues.put(SQLConstantes.MODULO6_P7_8_8,C6_P7_8_8+"");
            contentValues.put(SQLConstantes.MODULO6_P7_8_9,C6_P7_8_9+"");
            contentValues.put(SQLConstantes.MODULO6_P7_8_10,C6_P7_8_10+"");

            contentValues.put(SQLConstantes.MODULO6_P7_9_1,C6_P7_9_1+"");
            contentValues.put(SQLConstantes.MODULO6_P7_9_2,C6_P7_9_2+"");
            contentValues.put(SQLConstantes.MODULO6_P7_9_3,C6_P7_9_3+"");
            contentValues.put(SQLConstantes.MODULO6_P7_9_4,C6_P7_9_4+"");
            contentValues.put(SQLConstantes.MODULO6_P7_9_5,C6_P7_9_5+"");
            contentValues.put(SQLConstantes.MODULO6_P7_9_6,C6_P7_9_6+"");
            contentValues.put(SQLConstantes.MODULO6_P7_9_7,C6_P7_9_7+"");
            contentValues.put(SQLConstantes.MODULO6_P7_9_8,C6_P7_9_8+"");
            contentValues.put(SQLConstantes.MODULO6_P7_9_9,C6_P7_9_9+"");
            contentValues.put(SQLConstantes.MODULO6_P7_9_10,C6_P7_9_10+"");

            contentValues.put(SQLConstantes.MODULO6_P8_1,C6_P8_1);
            contentValues.put(SQLConstantes.MODULO6_P8_2,C6_P8_2);
            contentValues.put(SQLConstantes.MODULO6_P8_3,C6_P8_3);
            contentValues.put(SQLConstantes.MODULO6_P8_4,C6_P8_4);
            contentValues.put(SQLConstantes.MODULO6_P8_5,C6_P8_5);
            contentValues.put(SQLConstantes.MODULO6_P8_6,C6_P8_6);
            contentValues.put(SQLConstantes.MODULO6_P8_7,C6_P8_7);
            contentValues.put(SQLConstantes.MODULO6_P8_8,C6_P8_8);
            contentValues.put(SQLConstantes.MODULO6_P8_9,C6_P8_9);


            data.actualizarModulo6(idempresa, contentValues);
        } else {
            //si no existe el elemento, lo construye para insertarlo
            modulo6 = new Modulo6();
            //llena el objeto a insertar
            modulo6.setMODULO6_ID(idempresa);
            modulo6.setC6_P7_1_1(C6_P7_1_1 + "");
            modulo6.setC6_P7_1_2(C6_P7_1_2 + "");
            modulo6.setC6_P7_1_3(C6_P7_1_3 + "");
            modulo6.setC6_P7_1_4(C6_P7_1_4 + "");
            modulo6.setC6_P7_1_5(C6_P7_1_5 + "");
            modulo6.setC6_P7_1_6(C6_P7_1_6 + "");
            modulo6.setC6_P7_1_7(C6_P7_1_7 + "");
            modulo6.setC6_P7_1_8(C6_P7_1_8 + "");
            modulo6.setC6_P7_1_9(C6_P7_1_9 + "");
            modulo6.setC6_P7_1_10(C6_P7_1_10 + "");

            modulo6.setC6_P7_2_1(C6_P7_2_1 + "");
            modulo6.setC6_P7_2_2(C6_P7_2_2 + "");
            modulo6.setC6_P7_2_3(C6_P7_2_3 + "");
            modulo6.setC6_P7_2_4(C6_P7_2_4 + "");
            modulo6.setC6_P7_2_5(C6_P7_2_5 + "");
            modulo6.setC6_P7_2_6(C6_P7_2_6 + "");
            modulo6.setC6_P7_2_7(C6_P7_2_7 + "");
            modulo6.setC6_P7_2_8(C6_P7_2_8 + "");
            modulo6.setC6_P7_2_9(C6_P7_2_9 + "");
            modulo6.setC6_P7_2_10(C6_P7_2_10 + "");

            modulo6.setC6_P7_3_1(C6_P7_3_1 + "");
            modulo6.setC6_P7_3_2(C6_P7_3_2 + "");
            modulo6.setC6_P7_3_3(C6_P7_3_3 + "");
            modulo6.setC6_P7_3_4(C6_P7_3_4 + "");
            modulo6.setC6_P7_3_5(C6_P7_3_5 + "");
            modulo6.setC6_P7_3_6(C6_P7_3_6 + "");
            modulo6.setC6_P7_3_7(C6_P7_3_7 + "");
            modulo6.setC6_P7_3_8(C6_P7_3_8 + "");
            modulo6.setC6_P7_3_9(C6_P7_3_9 + "");
            modulo6.setC6_P7_3_10(C6_P7_3_10 + "");

            modulo6.setC6_P7_4_1(C6_P7_4_1 + "");
            modulo6.setC6_P7_4_2(C6_P7_4_2 + "");
            modulo6.setC6_P7_4_3(C6_P7_4_3 + "");
            modulo6.setC6_P7_4_4(C6_P7_4_4 + "");
            modulo6.setC6_P7_4_5(C6_P7_4_5 + "");
            modulo6.setC6_P7_4_6(C6_P7_4_6 + "");
            modulo6.setC6_P7_4_7(C6_P7_4_7 + "");
            modulo6.setC6_P7_4_8(C6_P7_4_8 + "");
            modulo6.setC6_P7_4_9(C6_P7_4_9 + "");
            modulo6.setC6_P7_4_10(C6_P7_4_10 + "");

            modulo6.setC6_P7_5_1(C6_P7_5_1 + "");
            modulo6.setC6_P7_5_2(C6_P7_5_2 + "");
            modulo6.setC6_P7_5_3(C6_P7_5_3 + "");
            modulo6.setC6_P7_5_4(C6_P7_5_4 + "");
            modulo6.setC6_P7_5_5(C6_P7_5_5 + "");
            modulo6.setC6_P7_5_6(C6_P7_5_6 + "");
            modulo6.setC6_P7_5_7(C6_P7_5_7 + "");
            modulo6.setC6_P7_5_8(C6_P7_5_8 + "");
            modulo6.setC6_P7_5_9(C6_P7_5_9 + "");
            modulo6.setC6_P7_5_10(C6_P7_5_10 + "");

            modulo6.setC6_P7_6_1(C6_P7_6_1 + "");
            modulo6.setC6_P7_6_2(C6_P7_6_2 + "");
            modulo6.setC6_P7_6_3(C6_P7_6_3 + "");
            modulo6.setC6_P7_6_4(C6_P7_6_4 + "");
            modulo6.setC6_P7_6_5(C6_P7_6_5 + "");
            modulo6.setC6_P7_6_6(C6_P7_6_6 + "");
            modulo6.setC6_P7_6_7(C6_P7_6_7 + "");
            modulo6.setC6_P7_6_8(C6_P7_6_8 + "");
            modulo6.setC6_P7_6_9(C6_P7_6_9 + "");
            modulo6.setC6_P7_6_10(C6_P7_6_10 + "");

            modulo6.setC6_P7_7_1(C6_P7_7_1 + "");
            modulo6.setC6_P7_7_2(C6_P7_7_2 + "");
            modulo6.setC6_P7_7_3(C6_P7_7_3 + "");
            modulo6.setC6_P7_7_4(C6_P7_7_4 + "");
            modulo6.setC6_P7_7_5(C6_P7_7_5 + "");
            modulo6.setC6_P7_7_6(C6_P7_7_6 + "");
            modulo6.setC6_P7_7_7(C6_P7_7_7 + "");
            modulo6.setC6_P7_7_8(C6_P7_7_8 + "");
            modulo6.setC6_P7_7_9(C6_P7_7_9 + "");
            modulo6.setC6_P7_7_10(C6_P7_7_10 + "");

            modulo6.setC6_P7_8_1(C6_P7_8_1 + "");
            modulo6.setC6_P7_8_2(C6_P7_8_2 + "");
            modulo6.setC6_P7_8_3(C6_P7_8_3 + "");
            modulo6.setC6_P7_8_4(C6_P7_8_4 + "");
            modulo6.setC6_P7_8_5(C6_P7_8_5 + "");
            modulo6.setC6_P7_8_6(C6_P7_8_6 + "");
            modulo6.setC6_P7_8_7(C6_P7_8_7 + "");
            modulo6.setC6_P7_8_8(C6_P7_8_8 + "");
            modulo6.setC6_P7_8_9(C6_P7_8_9 + "");
            modulo6.setC6_P7_8_10(C6_P7_8_10 + "");

            modulo6.setC6_P7_9_1(C6_P7_9_1 + "");
            modulo6.setC6_P7_9_2(C6_P7_9_2 + "");
            modulo6.setC6_P7_9_3(C6_P7_9_3 + "");
            modulo6.setC6_P7_9_4(C6_P7_9_4 + "");
            modulo6.setC6_P7_9_5(C6_P7_9_5 + "");
            modulo6.setC6_P7_9_6(C6_P7_9_6 + "");
            modulo6.setC6_P7_9_7(C6_P7_9_7 + "");
            modulo6.setC6_P7_9_8(C6_P7_9_8 + "");
            modulo6.setC6_P7_9_9(C6_P7_9_9 + "");
            modulo6.setC6_P7_9_10(C6_P7_9_10 + "");

            modulo6.setC6_P8_1(C6_P8_1);
            modulo6.setC6_P8_2(C6_P8_2);
            modulo6.setC6_P8_3(C6_P8_3);
            modulo6.setC6_P8_4(C6_P8_4);
            modulo6.setC6_P8_5(C6_P8_5);
            modulo6.setC6_P8_6(C6_P8_6);
            modulo6.setC6_P8_7(C6_P8_7);
            modulo6.setC6_P8_8(C6_P8_8);
            modulo6.setC6_P8_9(C6_P8_9);



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
        boolean vC6_P7_1= true ;
        boolean vC6_P7_2= true ;
        boolean vC6_P7_3= true ;
        boolean vC6_P7_4= true ;
        boolean vC6_P7_5= true ;
        boolean vC6_P7_6= true ;
        boolean vC6_P7_7= true ;
        boolean vC6_P7_8= true ;
        boolean vC6_P7_9= true ;

        Integer[] valores1={ C6_P7_1_1,C6_P7_1_2,C6_P7_1_3,C6_P7_1_4,C6_P7_1_5,C6_P7_1_6,C6_P7_1_7,C6_P7_1_8,C6_P7_1_9,C6_P7_1_10};
        Integer[] valores2={ C6_P7_2_1,C6_P7_2_2,C6_P7_2_3,C6_P7_2_4,C6_P7_2_5,C6_P7_2_6,C6_P7_2_7,C6_P7_2_8,C6_P7_2_9,C6_P7_2_10};
        Integer[] valores3={ C6_P7_3_1,C6_P7_3_2,C6_P7_3_3,C6_P7_3_4,C6_P7_3_5,C6_P7_3_6,C6_P7_3_7,C6_P7_3_8,C6_P7_3_9,C6_P7_3_10};
        Integer[] valores4={ C6_P7_4_1,C6_P7_4_2,C6_P7_4_3,C6_P7_4_4,C6_P7_4_5,C6_P7_4_6,C6_P7_4_7,C6_P7_4_8,C6_P7_4_9,C6_P7_4_10};
        Integer[] valores5={ C6_P7_5_1,C6_P7_5_2,C6_P7_5_3,C6_P7_5_4,C6_P7_5_5,C6_P7_5_6,C6_P7_5_7,C6_P7_5_8,C6_P7_5_9,C6_P7_5_10};
        Integer[] valores6={ C6_P7_6_1,C6_P7_6_2,C6_P7_6_3,C6_P7_6_4,C6_P7_6_5,C6_P7_6_6,C6_P7_6_7,C6_P7_6_8,C6_P7_6_9,C6_P7_6_10};
        Integer[] valores7={ C6_P7_7_1,C6_P7_7_2,C6_P7_7_3,C6_P7_7_4,C6_P7_7_5,C6_P7_7_6,C6_P7_7_7,C6_P7_7_8,C6_P7_7_9,C6_P7_7_10};
        Integer[] valores8={ C6_P7_8_1,C6_P7_8_2,C6_P7_8_3,C6_P7_8_4,C6_P7_8_5,C6_P7_8_6,C6_P7_8_7,C6_P7_8_8,C6_P7_8_9,C6_P7_8_10};
        Integer[] valores9={ C6_P7_9_1,C6_P7_9_2,C6_P7_9_3,C6_P7_9_4,C6_P7_9_5,C6_P7_9_6,C6_P7_9_7,C6_P7_9_8,C6_P7_9_9,C6_P7_9_10};

        for (Integer valor1:valores1 ) {
            if(valor1==1)vC6_P7_1=false;
        }
        for (Integer valor2:valores2 ) {
            if(valor2==1)vC6_P7_2=false;
        }
        for (Integer valor3:valores3 ) {
            if(valor3==1)vC6_P7_3=false;
        }
        for (Integer valor4:valores4 ) {
            if(valor4==1)vC6_P7_4=false;
        }
        for (Integer valor5:valores5 ) {
            if(valor5==1)vC6_P7_5=false;
        }
        for (Integer valor6:valores6 ) {
            if(valor6==1)vC6_P7_6=false;
        }
        for (Integer valor7:valores7 ) {
            if(valor7==1)vC6_P7_7=false;
        }
        for (Integer valor8:valores8 ) {
            if(valor8==1)vC6_P7_8=false;
        }
        for (Integer valor9:valores9 ) {
            if(valor9==1)vC6_P7_9=false;
        }
        if(vC6_P7_1 && Integer.parseInt(C6_p3_1)>=0 && Integer.parseInt(C6_p3_1)<Integer.parseInt(C5_t1)){
            mostrarMensaje("Pregunta 7.1: Debe seleccionar una o más opciones");
            valido=false;
        }else if(vC6_P7_2 && Integer.parseInt(C6_p3_2)>=0 && Integer.parseInt(C6_p3_2)<Integer.parseInt(C5_t2)){
            mostrarMensaje("Pregunta 7.2: Debe seleccionar una o más opciones");
            valido=false;
        }else if(vC6_P7_3 && Integer.parseInt(C6_p3_3)>=0 && Integer.parseInt(C6_p3_3)<Integer.parseInt(C5_t3)){
            mostrarMensaje("Pregunta 7.3: Debe seleccionar una o más opciones");
            valido=false;
        }else if(vC6_P7_4 && Integer.parseInt(C6_p3_4)>=0 && Integer.parseInt(C6_p3_4)<Integer.parseInt(C5_t4)){
            mostrarMensaje("Pregunta 7.4: Debe seleccionar una o más opciones");
            valido=false;
        }else if(vC6_P7_5 && Integer.parseInt(C6_p3_5)>=0 && Integer.parseInt(C6_p3_5)<Integer.parseInt(C5_t5)){
            mostrarMensaje("Pregunta 7.5: Debe seleccionar una o más opciones");
            valido=false;
        }else if(vC6_P7_6 && Integer.parseInt(C6_p3_6)>=0 && Integer.parseInt(C6_p3_6)<Integer.parseInt(C5_t6)){
            mostrarMensaje("Pregunta 7.6: Debe seleccionar una o más opciones");
            valido=false;
        }else if(vC6_P7_7 && Integer.parseInt(C6_p3_7)>=0 && Integer.parseInt(C6_p3_7)<Integer.parseInt(C5_t7)){
            mostrarMensaje("Pregunta 7.7: Debe seleccionar una o más opciones");
            valido=false;
        }else if(vC6_P7_8 && Integer.parseInt(C6_p3_8)>=0 && Integer.parseInt(C6_p3_8)<Integer.parseInt(C5_t8)){
            mostrarMensaje("Pregunta 7.8: Debe seleccionar una o más opciones");
            valido=false;
        }else if(vC6_P7_9 && Integer.parseInt(C6_p3_9)>=0 && Integer.parseInt(C6_p3_9)<Integer.parseInt(C5_t9)){
            mostrarMensaje("Pregunta 7.9: Debe seleccionar una o más opciones");
            valido=false;
        }else if(C6_P7_1_10== 1 && C6_P8_1.trim().length()<3){
            mostrarMensaje("Pregunta 8.1: Debe registrar información válida en Especifique");
            valido=false;
        }else if(C6_P7_2_10== 1 && C6_P8_2.trim().length()<3){
            mostrarMensaje("Pregunta 8.2: Debe registrar información válida en Especifique");
            valido=false;
        }else if(C6_P7_3_10== 1 && C6_P8_3.trim().length()<3){
            mostrarMensaje("Pregunta 8.3: Debe registrar información válida en Especifique");
            valido=false;
        }else if(C6_P7_4_10== 1 && C6_P8_4.trim().length()<3){
            mostrarMensaje("Pregunta 8.4: Debe registrar información válida en Especifique");
            valido=false;
        }else if(C6_P7_5_10== 1 && C6_P8_5.trim().length()<3){
            mostrarMensaje("Pregunta 8.5: Debe registrar información válida en Especifique");
            valido=false;
        }else if(C6_P7_6_10== 1 && C6_P8_6.trim().length()<3){
            mostrarMensaje("Pregunta 8.6: Debe registrar información válida en Especifique");
            valido=false;
        }else if(C6_P7_7_10== 1 && C6_P8_7.trim().length()<3){
            mostrarMensaje("Pregunta 8.7: Debe registrar información válida en Especifique");
            valido=false;
        }else if(C6_P7_8_10== 1 && C6_P8_8.trim().length()<3){
            mostrarMensaje("Pregunta 8.8: Debe registrar información válida en Especifique");
            valido=false;
        }else if(C6_P7_9_10== 1 && C6_P8_9.trim().length()<3){
            mostrarMensaje("Pregunta 8.9: Debe registrar información válida en Especifique");
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
