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
public class Modulo6Fragment3 extends Fragment {



    private CheckBox mod6_p5_1_ck1;
    private CheckBox mod6_p5_1_ck2;
    private CheckBox mod6_p5_1_ck3;
    private CheckBox mod6_p5_1_ck4;
    private CheckBox mod6_p5_1_ck5;
    private CheckBox mod6_p5_1_ck6;
    private CheckBox mod6_p5_1_ck7;
    private CheckBox mod6_p5_1_ck8;
    private CheckBox mod6_p5_1_ck9;
    private CheckBox mod6_p5_1_ck10;
    private CheckBox mod6_p5_1_ck11;
    private CheckBox mod6_p5_1_ck12;
    private CheckBox mod6_p5_1_ck13;
    private CheckBox mod6_p5_1_ck14;
    private CheckBox mod6_p5_1_ck15;
    private CheckBox mod6_p5_1_ck16;
    private CheckBox mod6_p5_1_ck17;
    private CheckBox mod6_p5_1_ck18;
    private CheckBox mod6_p5_1_ck19;
    private CheckBox mod6_p5_1_ck20;
    private EditText mod6_p5_1_edt19;


    private CheckBox mod6_p5_2_ck1;
    private CheckBox mod6_p5_2_ck2;
    private CheckBox mod6_p5_2_ck3;
    private CheckBox mod6_p5_2_ck4;
    private CheckBox mod6_p5_2_ck5;
    private CheckBox mod6_p5_2_ck6;
    private CheckBox mod6_p5_2_ck7;
    private CheckBox mod6_p5_2_ck8;
    private CheckBox mod6_p5_2_ck9;
    private CheckBox mod6_p5_2_ck10;
    private CheckBox mod6_p5_2_ck11;
    private CheckBox mod6_p5_2_ck12;
    private CheckBox mod6_p5_2_ck13;
    private CheckBox mod6_p5_2_ck14;
    private CheckBox mod6_p5_2_ck15;
    private CheckBox mod6_p5_2_ck16;
    private CheckBox mod6_p5_2_ck17;
    private CheckBox mod6_p5_2_ck18;
    private CheckBox mod6_p5_2_ck19;
    private CheckBox mod6_p5_2_ck20;
    private EditText mod6_p5_2_edt19;


    private CheckBox mod6_p5_3_ck1;
    private CheckBox mod6_p5_3_ck2;
    private CheckBox mod6_p5_3_ck3;
    private CheckBox mod6_p5_3_ck4;
    private CheckBox mod6_p5_3_ck5;
    private CheckBox mod6_p5_3_ck6;
    private CheckBox mod6_p5_3_ck7;
    private CheckBox mod6_p5_3_ck8;
    private CheckBox mod6_p5_3_ck9;
    private CheckBox mod6_p5_3_ck10;
    private CheckBox mod6_p5_3_ck11;
    private CheckBox mod6_p5_3_ck12;
    private CheckBox mod6_p5_3_ck13;
    private CheckBox mod6_p5_3_ck14;
    private CheckBox mod6_p5_3_ck15;
    private CheckBox mod6_p5_3_ck16;
    private CheckBox mod6_p5_3_ck17;
    private CheckBox mod6_p5_3_ck18;
    private CheckBox mod6_p5_3_ck19;
    private CheckBox mod6_p5_3_ck20;
    private EditText mod6_p5_3_edt19;


    private CheckBox mod6_p5_4_ck1;
    private CheckBox mod6_p5_4_ck2;
    private CheckBox mod6_p5_4_ck3;
    private CheckBox mod6_p5_4_ck4;
    private CheckBox mod6_p5_4_ck5;
    private CheckBox mod6_p5_4_ck6;
    private CheckBox mod6_p5_4_ck7;
    private CheckBox mod6_p5_4_ck8;
    private CheckBox mod6_p5_4_ck9;
    private CheckBox mod6_p5_4_ck10;
    private CheckBox mod6_p5_4_ck11;
    private CheckBox mod6_p5_4_ck12;
    private CheckBox mod6_p5_4_ck13;
    private CheckBox mod6_p5_4_ck14;
    private CheckBox mod6_p5_4_ck15;
    private CheckBox mod6_p5_4_ck16;
    private CheckBox mod6_p5_4_ck17;
    private CheckBox mod6_p5_4_ck18;
    private CheckBox mod6_p5_4_ck19;
    private CheckBox mod6_p5_4_ck20;
    private EditText mod6_p5_4_edt19;


    private CheckBox mod6_p5_5_ck1;
    private CheckBox mod6_p5_5_ck2;
    private CheckBox mod6_p5_5_ck3;
    private CheckBox mod6_p5_5_ck4;
    private CheckBox mod6_p5_5_ck5;
    private CheckBox mod6_p5_5_ck6;
    private CheckBox mod6_p5_5_ck7;
    private CheckBox mod6_p5_5_ck8;
    private CheckBox mod6_p5_5_ck9;
    private CheckBox mod6_p5_5_ck10;
    private CheckBox mod6_p5_5_ck11;
    private CheckBox mod6_p5_5_ck12;
    private CheckBox mod6_p5_5_ck13;
    private CheckBox mod6_p5_5_ck14;
    private CheckBox mod6_p5_5_ck15;
    private CheckBox mod6_p5_5_ck16;
    private CheckBox mod6_p5_5_ck17;
    private CheckBox mod6_p5_5_ck18;
    private CheckBox mod6_p5_5_ck19;
    private CheckBox mod6_p5_5_ck20;
    private EditText mod6_p5_5_edt19;



    private CheckBox mod6_p5_6_ck1;
    private CheckBox mod6_p5_6_ck2;
    private CheckBox mod6_p5_6_ck3;
    private CheckBox mod6_p5_6_ck4;
    private CheckBox mod6_p5_6_ck5;
    private CheckBox mod6_p5_6_ck6;
    private CheckBox mod6_p5_6_ck7;
    private CheckBox mod6_p5_6_ck8;
    private CheckBox mod6_p5_6_ck9;
    private CheckBox mod6_p5_6_ck10;
    private CheckBox mod6_p5_6_ck11;
    private CheckBox mod6_p5_6_ck12;
    private CheckBox mod6_p5_6_ck13;
    private CheckBox mod6_p5_6_ck14;
    private CheckBox mod6_p5_6_ck15;
    private CheckBox mod6_p5_6_ck16;
    private CheckBox mod6_p5_6_ck17;
    private CheckBox mod6_p5_6_ck18;
    private CheckBox mod6_p5_6_ck19;
    private CheckBox mod6_p5_6_ck20;
    private EditText mod6_p5_6_edt19;




    private CheckBox mod6_p5_7_ck1;
    private CheckBox mod6_p5_7_ck2;
    private CheckBox mod6_p5_7_ck3;
    private CheckBox mod6_p5_7_ck4;
    private CheckBox mod6_p5_7_ck5;
    private CheckBox mod6_p5_7_ck6;
    private CheckBox mod6_p5_7_ck7;
    private CheckBox mod6_p5_7_ck8;
    private CheckBox mod6_p5_7_ck9;
    private CheckBox mod6_p5_7_ck10;
    private CheckBox mod6_p5_7_ck11;
    private CheckBox mod6_p5_7_ck12;
    private CheckBox mod6_p5_7_ck13;
    private CheckBox mod6_p5_7_ck14;
    private CheckBox mod6_p5_7_ck15;
    private CheckBox mod6_p5_7_ck16;
    private CheckBox mod6_p5_7_ck17;
    private CheckBox mod6_p5_7_ck18;
    private CheckBox mod6_p5_7_ck19;
    private CheckBox mod6_p5_7_ck20;
    private EditText mod6_p5_7_edt19;




    private CheckBox mod6_p5_8_ck1;
    private CheckBox mod6_p5_8_ck2;
    private CheckBox mod6_p5_8_ck3;
    private CheckBox mod6_p5_8_ck4;
    private CheckBox mod6_p5_8_ck5;
    private CheckBox mod6_p5_8_ck6;
    private CheckBox mod6_p5_8_ck7;
    private CheckBox mod6_p5_8_ck8;
    private CheckBox mod6_p5_8_ck9;
    private CheckBox mod6_p5_8_ck10;
    private CheckBox mod6_p5_8_ck11;
    private CheckBox mod6_p5_8_ck12;
    private CheckBox mod6_p5_8_ck13;
    private CheckBox mod6_p5_8_ck14;
    private CheckBox mod6_p5_8_ck15;
    private CheckBox mod6_p5_8_ck16;
    private CheckBox mod6_p5_8_ck17;
    private CheckBox mod6_p5_8_ck18;
    private CheckBox mod6_p5_8_ck19;
    private CheckBox mod6_p5_8_ck20;
    private EditText mod6_p5_8_edt19;



    private CheckBox mod6_p5_9_ck1;
    private CheckBox mod6_p5_9_ck2;
    private CheckBox mod6_p5_9_ck3;
    private CheckBox mod6_p5_9_ck4;
    private CheckBox mod6_p5_9_ck5;
    private CheckBox mod6_p5_9_ck6;
    private CheckBox mod6_p5_9_ck7;
    private CheckBox mod6_p5_9_ck8;
    private CheckBox mod6_p5_9_ck9;
    private CheckBox mod6_p5_9_ck10;
    private CheckBox mod6_p5_9_ck11;
    private CheckBox mod6_p5_9_ck12;
    private CheckBox mod6_p5_9_ck13;
    private CheckBox mod6_p5_9_ck14;
    private CheckBox mod6_p5_9_ck15;
    private CheckBox mod6_p5_9_ck16;
    private CheckBox mod6_p5_9_ck17;
    private CheckBox mod6_p5_9_ck18;
    private CheckBox mod6_p5_9_ck19;
    private CheckBox mod6_p5_9_ck20;
    private EditText mod6_p5_9_edt19;

    private LinearLayout mod6_p5_ly1;
    private LinearLayout mod6_p5_ly2;
    private LinearLayout mod6_p5_ly3;
    private LinearLayout mod6_p5_ly4;
    private LinearLayout mod6_p5_ly5;
    private LinearLayout mod6_p5_ly6;
    private LinearLayout mod6_p5_ly7;
    private LinearLayout mod6_p5_ly8;
    private LinearLayout mod6_p5_ly9;
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

    int C6_P5_1_1;
    int C6_P5_1_2;
    int C6_P5_1_3;
    int C6_P5_1_4;
    int C6_P5_1_5;
    int C6_P5_1_6;
    int C6_P5_1_7;
    int C6_P5_1_8;
    int C6_P5_1_9;
    int C6_P5_1_10;
    int C6_P5_1_11;
    int C6_P5_1_12;
    int C6_P5_1_13;
    int C6_P5_1_14;
    int C6_P5_1_15;
    int C6_P5_1_16;
    int C6_P5_1_17;
    int C6_P5_1_18;
    int C6_P5_1_19;
    String C6_P5_1_19_0;
    int C6_P5_1_20;
    int C6_P5_2_1;
    int C6_P5_2_2;
    int C6_P5_2_3;
    int C6_P5_2_4;
    int C6_P5_2_5;
    int C6_P5_2_6;
    int C6_P5_2_7;
    int C6_P5_2_8;
    int C6_P5_2_9;
    int C6_P5_2_10;
    int C6_P5_2_11;
    int C6_P5_2_12;
    int C6_P5_2_13;
    int C6_P5_2_14;
    int C6_P5_2_15;
    int C6_P5_2_16;
    int C6_P5_2_17;
    int C6_P5_2_18;
    int C6_P5_2_19;
    String C6_P5_2_19_0;
    int C6_P5_2_20;
    int C6_P5_3_1;
    int C6_P5_3_2;
    int C6_P5_3_3;
    int C6_P5_3_4;
    int C6_P5_3_5;
    int C6_P5_3_6;
    int C6_P5_3_7;
    int C6_P5_3_8;
    int C6_P5_3_9;
    int C6_P5_3_10;
    int C6_P5_3_11;
    int C6_P5_3_12;
    int C6_P5_3_13;
    int C6_P5_3_14;
    int C6_P5_3_15;
    int C6_P5_3_16;
    int C6_P5_3_17;
    int C6_P5_3_18;
    int C6_P5_3_19;
    String C6_P5_3_19_0;
    int C6_P5_3_20;
    int C6_P5_4_1;
    int C6_P5_4_2;
    int C6_P5_4_3;
    int C6_P5_4_4;
    int C6_P5_4_5;
    int C6_P5_4_6;
    int C6_P5_4_7;
    int C6_P5_4_8;
    int C6_P5_4_9;
    int C6_P5_4_10;
    int C6_P5_4_11;
    int C6_P5_4_12;
    int C6_P5_4_13;
    int C6_P5_4_14;
    int C6_P5_4_15;
    int C6_P5_4_16;
    int C6_P5_4_17;
    int C6_P5_4_18;
    int C6_P5_4_19;
    String C6_P5_4_19_0;
    int C6_P5_4_20;
    int C6_P5_5_1;
    int C6_P5_5_2;
    int C6_P5_5_3;
    int C6_P5_5_4;
    int C6_P5_5_5;
    int C6_P5_5_6;
    int C6_P5_5_7;
    int C6_P5_5_8;
    int C6_P5_5_9;
    int C6_P5_5_10;
    int C6_P5_5_11;
    int C6_P5_5_12;
    int C6_P5_5_13;
    int C6_P5_5_14;
    int C6_P5_5_15;
    int C6_P5_5_16;
    int C6_P5_5_17;
    int C6_P5_5_18;
    int C6_P5_5_19;
    String C6_P5_5_19_0;
    int C6_P5_5_20;
    int C6_P5_6_1;
    int C6_P5_6_2;
    int C6_P5_6_3;
    int C6_P5_6_4;
    int C6_P5_6_5;
    int C6_P5_6_6;
    int C6_P5_6_7;
    int C6_P5_6_8;
    int C6_P5_6_9;
    int C6_P5_6_10;
    int C6_P5_6_11;
    int C6_P5_6_12;
    int C6_P5_6_13;
    int C6_P5_6_14;
    int C6_P5_6_15;
    int C6_P5_6_16;
    int C6_P5_6_17;
    int C6_P5_6_18;
    int C6_P5_6_19;
    String C6_P5_6_19_0;
    int C6_P5_6_20;
    int C6_P5_7_1;
    int C6_P5_7_2;
    int C6_P5_7_3;
    int C6_P5_7_4;
    int C6_P5_7_5;
    int C6_P5_7_6;
    int C6_P5_7_7;
    int C6_P5_7_8;
    int C6_P5_7_9;
    int C6_P5_7_10;
    int C6_P5_7_11;
    int C6_P5_7_12;
    int C6_P5_7_13;
    int C6_P5_7_14;
    int C6_P5_7_15;
    int C6_P5_7_16;
    int C6_P5_7_17;
    int C6_P5_7_18;
    int C6_P5_7_19;
    String C6_P5_7_19_0;
    int C6_P5_7_20;
    int C6_P5_8_1;
    int C6_P5_8_2;
    int C6_P5_8_3;
    int C6_P5_8_4;
    int C6_P5_8_5;
    int C6_P5_8_6;
    int C6_P5_8_7;
    int C6_P5_8_8;
    int C6_P5_8_9;
    int C6_P5_8_10;
    int C6_P5_8_11;
    int C6_P5_8_12;
    int C6_P5_8_13;
    int C6_P5_8_14;
    int C6_P5_8_15;
    int C6_P5_8_16;
    int C6_P5_8_17;
    int C6_P5_8_18;
    int C6_P5_8_19;
    String C6_P5_8_19_0;
    int C6_P5_8_20;
    int C6_P5_9_1;
    int C6_P5_9_2;
    int C6_P5_9_3;
    int C6_P5_9_4;
    int C6_P5_9_5;
    int C6_P5_9_6;
    int C6_P5_9_7;
    int C6_P5_9_8;
    int C6_P5_9_9;
    int C6_P5_9_10;
    int C6_P5_9_11;
    int C6_P5_9_12;
    int C6_P5_9_13;
    int C6_P5_9_14;
    int C6_P5_9_15;
    int C6_P5_9_16;
    int C6_P5_9_17;
    int C6_P5_9_18;
    int C6_P5_9_19;
    String C6_P5_9_19_0;
    int C6_P5_9_20;


    public Modulo6Fragment3() {
        // Required empty public constructor
    }

    @SuppressLint("ValidFragment")
    public Modulo6Fragment3(String idempresa, Context context) {
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

//        if (!modulo6.getC6_P3_2_1().equals("") && !modulo6.getC6_P3_2_1().equals("0"))
//        {C6_p3_1 = Integer.parseInt(modulo6.getC6_P3_2_1());}
//        if (!modulo6.getC6_P3_2_2().equals("") && !modulo6.getC6_P3_2_2().equals("0"))
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
        View rootView = inflater.inflate(R.layout.fragment_modulo6_fragment3, container, false);


        mod6_p5_ly1 = (LinearLayout) rootView.findViewById(R.id.mod6_p5_ly1);
        mod6_p5_ly2 = (LinearLayout) rootView.findViewById(R.id.mod6_p5_ly2);
        mod6_p5_ly3 = (LinearLayout) rootView.findViewById(R.id.mod6_p5_ly3);
        mod6_p5_ly4 = (LinearLayout) rootView.findViewById(R.id.mod6_p5_ly4);
        mod6_p5_ly5 = (LinearLayout) rootView.findViewById(R.id.mod6_p5_ly5);
        mod6_p5_ly6 = (LinearLayout) rootView.findViewById(R.id.mod6_p5_ly6);
        mod6_p5_ly7 = (LinearLayout) rootView.findViewById(R.id.mod6_p5_ly7);
        mod6_p5_ly8 = (LinearLayout) rootView.findViewById(R.id.mod6_p5_ly8);
        mod6_p5_ly9 = (LinearLayout) rootView.findViewById(R.id.mod6_p5_ly9);


        mod6_p5_1_ck1 = (CheckBox) rootView.findViewById(R.id.mod6_p5_1_ck1);
        mod6_p5_1_ck2 = (CheckBox) rootView.findViewById(R.id.mod6_p5_1_ck2);
        mod6_p5_1_ck3 = (CheckBox) rootView.findViewById(R.id.mod6_p5_1_ck3);
        mod6_p5_1_ck4 = (CheckBox) rootView.findViewById(R.id.mod6_p5_1_ck4);
        mod6_p5_1_ck5 = (CheckBox) rootView.findViewById(R.id.mod6_p5_1_ck5);
        mod6_p5_1_ck6 = (CheckBox) rootView.findViewById(R.id.mod6_p5_1_ck6);
        mod6_p5_1_ck7 = (CheckBox) rootView.findViewById(R.id.mod6_p5_1_ck7);
        mod6_p5_1_ck8 = (CheckBox) rootView.findViewById(R.id.mod6_p5_1_ck8);
        mod6_p5_1_ck9 = (CheckBox) rootView.findViewById(R.id.mod6_p5_1_ck9);
        mod6_p5_1_ck10 = (CheckBox) rootView.findViewById(R.id.mod6_p5_1_ck10);
        mod6_p5_1_ck11 = (CheckBox) rootView.findViewById(R.id.mod6_p5_1_ck11);
        mod6_p5_1_ck12 = (CheckBox) rootView.findViewById(R.id.mod6_p5_1_ck12);
        mod6_p5_1_ck13 = (CheckBox) rootView.findViewById(R.id.mod6_p5_1_ck13);
        mod6_p5_1_ck14 = (CheckBox) rootView.findViewById(R.id.mod6_p5_1_ck14);
        mod6_p5_1_ck15 = (CheckBox) rootView.findViewById(R.id.mod6_p5_1_ck15);
        mod6_p5_1_ck16 = (CheckBox) rootView.findViewById(R.id.mod6_p5_1_ck16);
        mod6_p5_1_ck17 = (CheckBox) rootView.findViewById(R.id.mod6_p5_1_ck17);
        mod6_p5_1_ck18 = (CheckBox) rootView.findViewById(R.id.mod6_p5_1_ck18);
        mod6_p5_1_ck19 = (CheckBox) rootView.findViewById(R.id.mod6_p5_1_ck19);
        mod6_p5_1_ck20 = (CheckBox) rootView.findViewById(R.id.mod6_p5_1_ck20);
        mod6_p5_1_edt19 = (EditText)rootView.findViewById(R.id.mod6_p5_1_edt19);


        mod6_p5_2_ck1 = (CheckBox) rootView.findViewById(R.id.mod6_p5_2_ck1);
        mod6_p5_2_ck2 = (CheckBox) rootView.findViewById(R.id.mod6_p5_2_ck2);
        mod6_p5_2_ck3 = (CheckBox) rootView.findViewById(R.id.mod6_p5_2_ck3);
        mod6_p5_2_ck4 = (CheckBox) rootView.findViewById(R.id.mod6_p5_2_ck4);
        mod6_p5_2_ck5 = (CheckBox) rootView.findViewById(R.id.mod6_p5_2_ck5);
        mod6_p5_2_ck6 = (CheckBox) rootView.findViewById(R.id.mod6_p5_2_ck6);
        mod6_p5_2_ck7 = (CheckBox) rootView.findViewById(R.id.mod6_p5_2_ck7);
        mod6_p5_2_ck8 = (CheckBox) rootView.findViewById(R.id.mod6_p5_2_ck8);
        mod6_p5_2_ck9 = (CheckBox) rootView.findViewById(R.id.mod6_p5_2_ck9);
        mod6_p5_2_ck10 = (CheckBox) rootView.findViewById(R.id.mod6_p5_2_ck10);
        mod6_p5_2_ck11 = (CheckBox) rootView.findViewById(R.id.mod6_p5_2_ck11);
        mod6_p5_2_ck12 = (CheckBox) rootView.findViewById(R.id.mod6_p5_2_ck12);
        mod6_p5_2_ck13 = (CheckBox) rootView.findViewById(R.id.mod6_p5_2_ck13);
        mod6_p5_2_ck14 = (CheckBox) rootView.findViewById(R.id.mod6_p5_2_ck14);
        mod6_p5_2_ck15 = (CheckBox) rootView.findViewById(R.id.mod6_p5_2_ck15);
        mod6_p5_2_ck16 = (CheckBox) rootView.findViewById(R.id.mod6_p5_2_ck16);
        mod6_p5_2_ck17 = (CheckBox) rootView.findViewById(R.id.mod6_p5_2_ck17);
        mod6_p5_2_ck18 = (CheckBox) rootView.findViewById(R.id.mod6_p5_2_ck18);
        mod6_p5_2_ck19 = (CheckBox) rootView.findViewById(R.id.mod6_p5_2_ck19);
        mod6_p5_2_ck20 = (CheckBox) rootView.findViewById(R.id.mod6_p5_2_ck20);
        mod6_p5_2_edt19 = (EditText)rootView.findViewById(R.id.mod6_p5_2_edt19);



        mod6_p5_3_ck1 = (CheckBox) rootView.findViewById(R.id.mod6_p5_3_ck1);
        mod6_p5_3_ck2 = (CheckBox) rootView.findViewById(R.id.mod6_p5_3_ck2);
        mod6_p5_3_ck3 = (CheckBox) rootView.findViewById(R.id.mod6_p5_3_ck3);
        mod6_p5_3_ck4 = (CheckBox) rootView.findViewById(R.id.mod6_p5_3_ck4);
        mod6_p5_3_ck5 = (CheckBox) rootView.findViewById(R.id.mod6_p5_3_ck5);
        mod6_p5_3_ck6 = (CheckBox) rootView.findViewById(R.id.mod6_p5_3_ck6);
        mod6_p5_3_ck7 = (CheckBox) rootView.findViewById(R.id.mod6_p5_3_ck7);
        mod6_p5_3_ck8 = (CheckBox) rootView.findViewById(R.id.mod6_p5_3_ck8);
        mod6_p5_3_ck9 = (CheckBox) rootView.findViewById(R.id.mod6_p5_3_ck9);
        mod6_p5_3_ck10 = (CheckBox) rootView.findViewById(R.id.mod6_p5_3_ck10);
        mod6_p5_3_ck11 = (CheckBox) rootView.findViewById(R.id.mod6_p5_3_ck11);
        mod6_p5_3_ck12 = (CheckBox) rootView.findViewById(R.id.mod6_p5_3_ck12);
        mod6_p5_3_ck13 = (CheckBox) rootView.findViewById(R.id.mod6_p5_3_ck13);
        mod6_p5_3_ck14 = (CheckBox) rootView.findViewById(R.id.mod6_p5_3_ck14);
        mod6_p5_3_ck15 = (CheckBox) rootView.findViewById(R.id.mod6_p5_3_ck15);
        mod6_p5_3_ck16 = (CheckBox) rootView.findViewById(R.id.mod6_p5_3_ck16);
        mod6_p5_3_ck17 = (CheckBox) rootView.findViewById(R.id.mod6_p5_3_ck17);
        mod6_p5_3_ck18 = (CheckBox) rootView.findViewById(R.id.mod6_p5_3_ck18);
        mod6_p5_3_ck19 = (CheckBox) rootView.findViewById(R.id.mod6_p5_3_ck19);
        mod6_p5_3_ck20 = (CheckBox) rootView.findViewById(R.id.mod6_p5_3_ck20);
        mod6_p5_3_edt19 = (EditText)rootView.findViewById(R.id.mod6_p5_3_edt19);



        mod6_p5_4_ck1 = (CheckBox) rootView.findViewById(R.id.mod6_p5_4_ck1);
        mod6_p5_4_ck2 = (CheckBox) rootView.findViewById(R.id.mod6_p5_4_ck2);
        mod6_p5_4_ck3 = (CheckBox) rootView.findViewById(R.id.mod6_p5_4_ck3);
        mod6_p5_4_ck4 = (CheckBox) rootView.findViewById(R.id.mod6_p5_4_ck4);
        mod6_p5_4_ck5 = (CheckBox) rootView.findViewById(R.id.mod6_p5_4_ck5);
        mod6_p5_4_ck6 = (CheckBox) rootView.findViewById(R.id.mod6_p5_4_ck6);
        mod6_p5_4_ck7 = (CheckBox) rootView.findViewById(R.id.mod6_p5_4_ck7);
        mod6_p5_4_ck8 = (CheckBox) rootView.findViewById(R.id.mod6_p5_4_ck8);
        mod6_p5_4_ck9 = (CheckBox) rootView.findViewById(R.id.mod6_p5_4_ck9);
        mod6_p5_4_ck10 = (CheckBox) rootView.findViewById(R.id.mod6_p5_4_ck10);
        mod6_p5_4_ck11 = (CheckBox) rootView.findViewById(R.id.mod6_p5_4_ck11);
        mod6_p5_4_ck12 = (CheckBox) rootView.findViewById(R.id.mod6_p5_4_ck12);
        mod6_p5_4_ck13 = (CheckBox) rootView.findViewById(R.id.mod6_p5_4_ck13);
        mod6_p5_4_ck14 = (CheckBox) rootView.findViewById(R.id.mod6_p5_4_ck14);
        mod6_p5_4_ck15 = (CheckBox) rootView.findViewById(R.id.mod6_p5_4_ck15);
        mod6_p5_4_ck16 = (CheckBox) rootView.findViewById(R.id.mod6_p5_4_ck16);
        mod6_p5_4_ck17 = (CheckBox) rootView.findViewById(R.id.mod6_p5_4_ck17);
        mod6_p5_4_ck18 = (CheckBox) rootView.findViewById(R.id.mod6_p5_4_ck18);
        mod6_p5_4_ck19 = (CheckBox) rootView.findViewById(R.id.mod6_p5_4_ck19);
        mod6_p5_4_ck20 = (CheckBox) rootView.findViewById(R.id.mod6_p5_4_ck20);
        mod6_p5_4_edt19 = (EditText)rootView.findViewById(R.id.mod6_p5_4_edt19);



        mod6_p5_5_ck1 = (CheckBox) rootView.findViewById(R.id.mod6_p5_5_ck1);
        mod6_p5_5_ck2 = (CheckBox) rootView.findViewById(R.id.mod6_p5_5_ck2);
        mod6_p5_5_ck3 = (CheckBox) rootView.findViewById(R.id.mod6_p5_5_ck3);
        mod6_p5_5_ck4 = (CheckBox) rootView.findViewById(R.id.mod6_p5_5_ck4);
        mod6_p5_5_ck5 = (CheckBox) rootView.findViewById(R.id.mod6_p5_5_ck5);
        mod6_p5_5_ck6 = (CheckBox) rootView.findViewById(R.id.mod6_p5_5_ck6);
        mod6_p5_5_ck7 = (CheckBox) rootView.findViewById(R.id.mod6_p5_5_ck7);
        mod6_p5_5_ck8 = (CheckBox) rootView.findViewById(R.id.mod6_p5_5_ck8);
        mod6_p5_5_ck9 = (CheckBox) rootView.findViewById(R.id.mod6_p5_5_ck9);
        mod6_p5_5_ck10 = (CheckBox) rootView.findViewById(R.id.mod6_p5_5_ck10);
        mod6_p5_5_ck11 = (CheckBox) rootView.findViewById(R.id.mod6_p5_5_ck11);
        mod6_p5_5_ck12 = (CheckBox) rootView.findViewById(R.id.mod6_p5_5_ck12);
        mod6_p5_5_ck13 = (CheckBox) rootView.findViewById(R.id.mod6_p5_5_ck13);
        mod6_p5_5_ck14 = (CheckBox) rootView.findViewById(R.id.mod6_p5_5_ck14);
        mod6_p5_5_ck15 = (CheckBox) rootView.findViewById(R.id.mod6_p5_5_ck15);
        mod6_p5_5_ck16 = (CheckBox) rootView.findViewById(R.id.mod6_p5_5_ck16);
        mod6_p5_5_ck17 = (CheckBox) rootView.findViewById(R.id.mod6_p5_5_ck17);
        mod6_p5_5_ck18 = (CheckBox) rootView.findViewById(R.id.mod6_p5_5_ck18);
        mod6_p5_5_ck19 = (CheckBox) rootView.findViewById(R.id.mod6_p5_5_ck19);
        mod6_p5_5_ck20 = (CheckBox) rootView.findViewById(R.id.mod6_p5_5_ck20);
        mod6_p5_5_edt19 = (EditText)rootView.findViewById(R.id.mod6_p5_5_edt19);


        mod6_p5_6_ck1 = (CheckBox) rootView.findViewById(R.id.mod6_p5_6_ck1);
        mod6_p5_6_ck2 = (CheckBox) rootView.findViewById(R.id.mod6_p5_6_ck2);
        mod6_p5_6_ck3 = (CheckBox) rootView.findViewById(R.id.mod6_p5_6_ck3);
        mod6_p5_6_ck4 = (CheckBox) rootView.findViewById(R.id.mod6_p5_6_ck4);
        mod6_p5_6_ck5 = (CheckBox) rootView.findViewById(R.id.mod6_p5_6_ck5);
        mod6_p5_6_ck6 = (CheckBox) rootView.findViewById(R.id.mod6_p5_6_ck6);
        mod6_p5_6_ck7 = (CheckBox) rootView.findViewById(R.id.mod6_p5_6_ck7);
        mod6_p5_6_ck8 = (CheckBox) rootView.findViewById(R.id.mod6_p5_6_ck8);
        mod6_p5_6_ck9 = (CheckBox) rootView.findViewById(R.id.mod6_p5_6_ck9);
        mod6_p5_6_ck10 = (CheckBox) rootView.findViewById(R.id.mod6_p5_6_ck10);
        mod6_p5_6_ck11 = (CheckBox) rootView.findViewById(R.id.mod6_p5_6_ck11);
        mod6_p5_6_ck12 = (CheckBox) rootView.findViewById(R.id.mod6_p5_6_ck12);
        mod6_p5_6_ck13 = (CheckBox) rootView.findViewById(R.id.mod6_p5_6_ck13);
        mod6_p5_6_ck14 = (CheckBox) rootView.findViewById(R.id.mod6_p5_6_ck14);
        mod6_p5_6_ck15 = (CheckBox) rootView.findViewById(R.id.mod6_p5_6_ck15);
        mod6_p5_6_ck16 = (CheckBox) rootView.findViewById(R.id.mod6_p5_6_ck16);
        mod6_p5_6_ck17 = (CheckBox) rootView.findViewById(R.id.mod6_p5_6_ck17);
        mod6_p5_6_ck18 = (CheckBox) rootView.findViewById(R.id.mod6_p5_6_ck18);
        mod6_p5_6_ck19 = (CheckBox) rootView.findViewById(R.id.mod6_p5_6_ck19);
        mod6_p5_6_ck20 = (CheckBox) rootView.findViewById(R.id.mod6_p5_6_ck20);
        mod6_p5_6_edt19 = (EditText)rootView.findViewById(R.id.mod6_p5_6_edt19);


        mod6_p5_7_ck1 = (CheckBox) rootView.findViewById(R.id.mod6_p5_7_ck1);
        mod6_p5_7_ck2 = (CheckBox) rootView.findViewById(R.id.mod6_p5_7_ck2);
        mod6_p5_7_ck3 = (CheckBox) rootView.findViewById(R.id.mod6_p5_7_ck3);
        mod6_p5_7_ck4 = (CheckBox) rootView.findViewById(R.id.mod6_p5_7_ck4);
        mod6_p5_7_ck5 = (CheckBox) rootView.findViewById(R.id.mod6_p5_7_ck5);
        mod6_p5_7_ck6 = (CheckBox) rootView.findViewById(R.id.mod6_p5_7_ck6);
        mod6_p5_7_ck7 = (CheckBox) rootView.findViewById(R.id.mod6_p5_7_ck7);
        mod6_p5_7_ck8 = (CheckBox) rootView.findViewById(R.id.mod6_p5_7_ck8);
        mod6_p5_7_ck9 = (CheckBox) rootView.findViewById(R.id.mod6_p5_7_ck9);
        mod6_p5_7_ck10 = (CheckBox) rootView.findViewById(R.id.mod6_p5_7_ck10);
        mod6_p5_7_ck11 = (CheckBox) rootView.findViewById(R.id.mod6_p5_7_ck11);
        mod6_p5_7_ck12 = (CheckBox) rootView.findViewById(R.id.mod6_p5_7_ck12);
        mod6_p5_7_ck13 = (CheckBox) rootView.findViewById(R.id.mod6_p5_7_ck13);
        mod6_p5_7_ck14 = (CheckBox) rootView.findViewById(R.id.mod6_p5_7_ck14);
        mod6_p5_7_ck15 = (CheckBox) rootView.findViewById(R.id.mod6_p5_7_ck15);
        mod6_p5_7_ck16 = (CheckBox) rootView.findViewById(R.id.mod6_p5_7_ck16);
        mod6_p5_7_ck17 = (CheckBox) rootView.findViewById(R.id.mod6_p5_7_ck17);
        mod6_p5_7_ck18 = (CheckBox) rootView.findViewById(R.id.mod6_p5_7_ck18);
        mod6_p5_7_ck19 = (CheckBox) rootView.findViewById(R.id.mod6_p5_7_ck19);
        mod6_p5_7_ck20 = (CheckBox) rootView.findViewById(R.id.mod6_p5_7_ck20);
        mod6_p5_7_edt19 = (EditText)rootView.findViewById(R.id.mod6_p5_7_edt19);



        mod6_p5_8_ck1 = (CheckBox) rootView.findViewById(R.id.mod6_p5_8_ck1);
        mod6_p5_8_ck2 = (CheckBox) rootView.findViewById(R.id.mod6_p5_8_ck2);
        mod6_p5_8_ck3 = (CheckBox) rootView.findViewById(R.id.mod6_p5_8_ck3);
        mod6_p5_8_ck4 = (CheckBox) rootView.findViewById(R.id.mod6_p5_8_ck4);
        mod6_p5_8_ck5 = (CheckBox) rootView.findViewById(R.id.mod6_p5_8_ck5);
        mod6_p5_8_ck6 = (CheckBox) rootView.findViewById(R.id.mod6_p5_8_ck6);
        mod6_p5_8_ck7 = (CheckBox) rootView.findViewById(R.id.mod6_p5_8_ck7);
        mod6_p5_8_ck8 = (CheckBox) rootView.findViewById(R.id.mod6_p5_8_ck8);
        mod6_p5_8_ck9 = (CheckBox) rootView.findViewById(R.id.mod6_p5_8_ck9);
        mod6_p5_8_ck10 = (CheckBox) rootView.findViewById(R.id.mod6_p5_8_ck10);
        mod6_p5_8_ck11 = (CheckBox) rootView.findViewById(R.id.mod6_p5_8_ck11);
        mod6_p5_8_ck12 = (CheckBox) rootView.findViewById(R.id.mod6_p5_8_ck12);
        mod6_p5_8_ck13 = (CheckBox) rootView.findViewById(R.id.mod6_p5_8_ck13);
        mod6_p5_8_ck14 = (CheckBox) rootView.findViewById(R.id.mod6_p5_8_ck14);
        mod6_p5_8_ck15 = (CheckBox) rootView.findViewById(R.id.mod6_p5_8_ck15);
        mod6_p5_8_ck16 = (CheckBox) rootView.findViewById(R.id.mod6_p5_8_ck16);
        mod6_p5_8_ck17 = (CheckBox) rootView.findViewById(R.id.mod6_p5_8_ck17);
        mod6_p5_8_ck18 = (CheckBox) rootView.findViewById(R.id.mod6_p5_8_ck18);
        mod6_p5_8_ck19 = (CheckBox) rootView.findViewById(R.id.mod6_p5_8_ck19);
        mod6_p5_8_ck20 = (CheckBox) rootView.findViewById(R.id.mod6_p5_8_ck20);
        mod6_p5_8_edt19 = (EditText)rootView.findViewById(R.id.mod6_p5_8_edt19);



        mod6_p5_9_ck1 = (CheckBox) rootView.findViewById(R.id.mod6_p5_9_ck1);
        mod6_p5_9_ck2 = (CheckBox) rootView.findViewById(R.id.mod6_p5_9_ck2);
        mod6_p5_9_ck3 = (CheckBox) rootView.findViewById(R.id.mod6_p5_9_ck3);
        mod6_p5_9_ck4 = (CheckBox) rootView.findViewById(R.id.mod6_p5_9_ck4);
        mod6_p5_9_ck5 = (CheckBox) rootView.findViewById(R.id.mod6_p5_9_ck5);
        mod6_p5_9_ck6 = (CheckBox) rootView.findViewById(R.id.mod6_p5_9_ck6);
        mod6_p5_9_ck7 = (CheckBox) rootView.findViewById(R.id.mod6_p5_9_ck7);
        mod6_p5_9_ck8 = (CheckBox) rootView.findViewById(R.id.mod6_p5_9_ck8);
        mod6_p5_9_ck9 = (CheckBox) rootView.findViewById(R.id.mod6_p5_9_ck9);
        mod6_p5_9_ck10 = (CheckBox) rootView.findViewById(R.id.mod6_p5_9_ck10);
        mod6_p5_9_ck11 = (CheckBox) rootView.findViewById(R.id.mod6_p5_9_ck11);
        mod6_p5_9_ck12 = (CheckBox) rootView.findViewById(R.id.mod6_p5_9_ck12);
        mod6_p5_9_ck13 = (CheckBox) rootView.findViewById(R.id.mod6_p5_9_ck13);
        mod6_p5_9_ck14 = (CheckBox) rootView.findViewById(R.id.mod6_p5_9_ck14);
        mod6_p5_9_ck15 = (CheckBox) rootView.findViewById(R.id.mod6_p5_9_ck15);
        mod6_p5_9_ck16 = (CheckBox) rootView.findViewById(R.id.mod6_p5_9_ck16);
        mod6_p5_9_ck17 = (CheckBox) rootView.findViewById(R.id.mod6_p5_9_ck17);
        mod6_p5_9_ck18 = (CheckBox) rootView.findViewById(R.id.mod6_p5_9_ck18);
        mod6_p5_9_ck19 = (CheckBox) rootView.findViewById(R.id.mod6_p5_9_ck19);
        mod6_p5_9_ck20 = (CheckBox) rootView.findViewById(R.id.mod6_p5_9_ck20);
        mod6_p5_9_edt19 = (EditText)rootView.findViewById(R.id.mod6_p5_9_edt19);

       // Toast.makeText(getActivity().getApplicationContext(), "modulo6 fragment 3", Toast.LENGTH_SHORT).show();
        //MOSTRAR LAS OCUPACIONES  SELECCIONADAS
        //4.1.GERENTES
        //MOSTRAR LAS OCUPACIONES  SELECCIONADAS
        //4.1.GERENTES
        validarPregunta(C6_p3_11,C5_t1,C6_p3_1,mod6_p5_ly1);

        //4.2.PROFESIONALES
        validarPregunta(C6_p3_22,C5_t2,C6_p3_2,mod6_p5_ly2);

        //4.3.TECNICOS
        validarPregunta(C6_p3_33,C5_t3,C6_p3_3,mod6_p5_ly3);

        //4.4.PERSONAL DE APOYO
        validarPregunta(C6_p3_44,C5_t4,C6_p3_4,mod6_p5_ly4);

        //4.5.PERSONAL DE SERVICIOS
        validarPregunta(C6_p3_55,C5_t5,C6_p3_5,mod6_p5_ly5);

        //4.6.TARBAJADORES CALIFICADOS
        validarPregunta(C6_p3_66,C5_t6,C6_p3_6,mod6_p5_ly6);

        //4.7.OFICIALES, OPERARIOS
        validarPregunta(C6_p3_77,C5_t7,C6_p3_7,mod6_p5_ly7);

        //4.8.OPERADORES DE INSTALACIONES
        validarPregunta(C6_p3_88,C5_t8,C6_p3_8,mod6_p5_ly8);

        //4.9.OCUPACIONES  ELEMENTALES
        validarPregunta(C6_p3_99,C5_t9,C6_p3_9,mod6_p5_ly9);

        return rootView;


    }




    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        final CheckBox[] listacheck1 ={
                mod6_p5_1_ck1, mod6_p5_1_ck2, mod6_p5_1_ck3, mod6_p5_1_ck4,
                mod6_p5_1_ck5, mod6_p5_1_ck6, mod6_p5_1_ck7, mod6_p5_1_ck8, mod6_p5_1_ck9,
                mod6_p5_1_ck10, mod6_p5_1_ck11, mod6_p5_1_ck12, mod6_p5_1_ck13, mod6_p5_1_ck14,
                mod6_p5_1_ck15, mod6_p5_1_ck16, mod6_p5_1_ck17, mod6_p5_1_ck18, mod6_p5_1_ck19
        };

        final CheckBox[] listacheck2 ={
                mod6_p5_2_ck1, mod6_p5_2_ck2, mod6_p5_2_ck3, mod6_p5_2_ck4,
                mod6_p5_2_ck5, mod6_p5_2_ck6, mod6_p5_2_ck7, mod6_p5_2_ck8, mod6_p5_2_ck9,
                mod6_p5_2_ck10, mod6_p5_2_ck11, mod6_p5_2_ck12, mod6_p5_2_ck13, mod6_p5_2_ck14,
                mod6_p5_2_ck15, mod6_p5_2_ck16, mod6_p5_2_ck17, mod6_p5_2_ck18, mod6_p5_2_ck19
        };


        final CheckBox[] listacheck3 ={
                mod6_p5_3_ck1, mod6_p5_3_ck2, mod6_p5_3_ck3, mod6_p5_3_ck4,
                mod6_p5_3_ck5, mod6_p5_3_ck6, mod6_p5_3_ck7, mod6_p5_3_ck8, mod6_p5_3_ck9,
                mod6_p5_3_ck10, mod6_p5_3_ck11, mod6_p5_3_ck12, mod6_p5_3_ck13, mod6_p5_3_ck14,
                mod6_p5_3_ck15, mod6_p5_3_ck16, mod6_p5_3_ck17, mod6_p5_3_ck18, mod6_p5_3_ck19
        };


        final CheckBox[] listacheck4 ={
                mod6_p5_4_ck1, mod6_p5_4_ck2, mod6_p5_4_ck3, mod6_p5_4_ck4,
                mod6_p5_4_ck5, mod6_p5_4_ck6, mod6_p5_4_ck7, mod6_p5_4_ck8, mod6_p5_4_ck9,
                mod6_p5_4_ck10, mod6_p5_4_ck11, mod6_p5_4_ck12, mod6_p5_4_ck13, mod6_p5_4_ck14,
                mod6_p5_4_ck15, mod6_p5_4_ck16, mod6_p5_4_ck17, mod6_p5_4_ck18, mod6_p5_4_ck19
        };


        final CheckBox[] listacheck5 ={
                mod6_p5_5_ck1, mod6_p5_5_ck2, mod6_p5_5_ck3, mod6_p5_5_ck4,
                mod6_p5_5_ck5, mod6_p5_5_ck6, mod6_p5_5_ck7, mod6_p5_5_ck8, mod6_p5_5_ck9,
                mod6_p5_5_ck10, mod6_p5_5_ck11, mod6_p5_5_ck12, mod6_p5_5_ck13, mod6_p5_5_ck14,
                mod6_p5_5_ck15, mod6_p5_5_ck16, mod6_p5_5_ck17, mod6_p5_5_ck18, mod6_p5_5_ck19
        };


        final CheckBox[] listacheck6 ={
                mod6_p5_6_ck1, mod6_p5_6_ck2, mod6_p5_6_ck3, mod6_p5_6_ck4,
                mod6_p5_6_ck5, mod6_p5_6_ck6, mod6_p5_6_ck7, mod6_p5_6_ck8, mod6_p5_6_ck9,
                mod6_p5_6_ck10, mod6_p5_6_ck11, mod6_p5_6_ck12, mod6_p5_6_ck13, mod6_p5_6_ck14,
                mod6_p5_6_ck15, mod6_p5_6_ck16, mod6_p5_6_ck17, mod6_p5_6_ck18, mod6_p5_6_ck19
        };


        final CheckBox[] listacheck7 ={
                mod6_p5_7_ck1, mod6_p5_7_ck2, mod6_p5_7_ck3, mod6_p5_7_ck4,
                mod6_p5_7_ck5, mod6_p5_7_ck6, mod6_p5_7_ck7, mod6_p5_7_ck8, mod6_p5_7_ck9,
                mod6_p5_7_ck10, mod6_p5_7_ck11, mod6_p5_7_ck12, mod6_p5_7_ck13, mod6_p5_7_ck14,
                mod6_p5_7_ck15, mod6_p5_7_ck16, mod6_p5_7_ck17, mod6_p5_7_ck18, mod6_p5_7_ck19
        };


        final CheckBox[] listacheck8 ={
                mod6_p5_8_ck1, mod6_p5_8_ck2, mod6_p5_8_ck3, mod6_p5_8_ck4,
                mod6_p5_8_ck5, mod6_p5_8_ck6, mod6_p5_8_ck7, mod6_p5_8_ck8, mod6_p5_8_ck9,
                mod6_p5_8_ck10, mod6_p5_8_ck11, mod6_p5_8_ck12, mod6_p5_8_ck13, mod6_p5_8_ck14,
                mod6_p5_8_ck15, mod6_p5_8_ck16, mod6_p5_8_ck17, mod6_p5_8_ck18, mod6_p5_8_ck19
        };


        final CheckBox[] listacheck9 ={
                mod6_p5_9_ck1, mod6_p5_9_ck2, mod6_p5_9_ck3, mod6_p5_9_ck4,
                mod6_p5_9_ck5, mod6_p5_9_ck6, mod6_p5_9_ck7, mod6_p5_9_ck8, mod6_p5_9_ck9,
                mod6_p5_9_ck10, mod6_p5_9_ck11, mod6_p5_9_ck12, mod6_p5_9_ck13, mod6_p5_9_ck14,
                mod6_p5_9_ck15, mod6_p5_9_ck16, mod6_p5_9_ck17, mod6_p5_9_ck18, mod6_p5_9_ck19
        };





        // MOSTRAR Y OCULTAR ESPECIFIQUE- PREGUNTA 1.19
        mod6_p5_1_edt19.setFilters(new InputFilter[]{new InputFilter.AllCaps()});
        mod6_p5_1_ck19.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    mod6_p5_1_edt19.setVisibility(View.VISIBLE);
                    mod6_p5_1_edt19.requestFocus();
                    mod6_p5_1_edt19.setBackgroundResource(R.drawable.caja_texto_enabled);

                } else {
                    mod6_p5_1_edt19.setVisibility(View.GONE);
                    mod6_p5_1_edt19.setText("");

                }
            }
        });


        // OCULTAR CHECKBOX --  PREGUNTA 1.20
        mod6_p5_1_ck20.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
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





        // MOSTRAR Y OCULTAR ESPECIFIQUE --  PREGUNTA 2.19
        mod6_p5_2_edt19.setFilters(new InputFilter[]{new InputFilter.AllCaps()});
        mod6_p5_2_ck19.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    mod6_p5_2_edt19.setVisibility(View.VISIBLE);
                    mod6_p5_2_edt19.requestFocus();
                    mod6_p5_2_edt19.setBackgroundResource(R.drawable.caja_texto_enabled);

                } else {
                    mod6_p5_2_edt19.setVisibility(View.GONE);
                    mod6_p5_2_edt19.setText("");

                }
            }
        });

        // // OCULTAR CHECKBOXS --  PREGUNTA 2.20
        mod6_p5_2_ck20.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override

            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

                if (b) {
                    for (int i = 0; i < listacheck2.length; i++) {
                        final CheckBox checkBox = listacheck2[i];
                        checkBox.setEnabled(false);
                        checkBox.setChecked(false);

                    }

                }
                else {
                    for (int i = 0; i < listacheck2.length; i++) {
                        final CheckBox checkBox = listacheck2[i];
                        checkBox.setEnabled(true);


                    }
                }
            }
        });




        // MOSTRAR Y OCULTAR ESPECIFIQUE --  PREGUNTA 3.19
        mod6_p5_3_edt19.setFilters(new InputFilter[]{new InputFilter.AllCaps()});
        mod6_p5_3_ck19.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    mod6_p5_3_edt19.setVisibility(View.VISIBLE);
                    mod6_p5_3_edt19.requestFocus();
                    mod6_p5_3_edt19.setBackgroundResource(R.drawable.caja_texto_enabled);

                } else {
                    mod6_p5_3_edt19.setVisibility(View.GONE);
                    mod6_p5_3_edt19.setText("");
                }
            }
        });

        // OCULTAR CHECKBOX --  PREGUNTA 3.20
        mod6_p5_3_ck20.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override

            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

                if (b) {
                    for (int i = 0; i < listacheck3.length; i++) {
                        final CheckBox checkBox = listacheck3[i];
                        checkBox.setEnabled(false);
                        checkBox.setChecked(false);

                    }

                }
                else {
                    for (int i = 0; i < listacheck3.length; i++) {
                        final CheckBox checkBox = listacheck3[i];
                        checkBox.setEnabled(true);


                    }
                }
            }
        });






        // MOSTRAR Y OCULTAR ESPECIFIQUE --  PREGUNTA 4.19
        mod6_p5_4_edt19.setFilters(new InputFilter[]{new InputFilter.AllCaps()});
        mod6_p5_4_ck19.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    mod6_p5_4_edt19.setVisibility(View.VISIBLE);
                    mod6_p5_4_edt19.requestFocus();
                    mod6_p5_4_edt19.setBackgroundResource(R.drawable.caja_texto_enabled);

                } else {
                    mod6_p5_4_edt19.setVisibility(View.GONE);
                    mod6_p5_4_edt19.setText("");
                }
            }
        });

        // OCULTAR CHECKBOX --  PREGUNTA 2.20
        mod6_p5_4_ck20.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override

            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

                if (b) {
                    for (int i = 0; i < listacheck4.length; i++) {
                        final CheckBox checkBox = listacheck4[i];
                        checkBox.setEnabled(false);
                        checkBox.setChecked(false);

                    }

                }
                else {
                    for (int i = 0; i < listacheck4.length; i++) {
                        final CheckBox checkBox = listacheck4[i];
                        checkBox.setEnabled(true);


                    }
                }
            }
        });






        // MOSTRAR Y OCULTAR ESPECIFIQUE --  PREGUNTA 5.19
        mod6_p5_5_edt19.setFilters(new InputFilter[]{new InputFilter.AllCaps()});
        mod6_p5_5_ck19.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    mod6_p5_5_edt19.setVisibility(View.VISIBLE);
                    mod6_p5_5_edt19.requestFocus();
                    mod6_p5_5_edt19.setBackgroundResource(R.drawable.caja_texto_enabled);

                } else {
                    mod6_p5_5_edt19.setVisibility(View.GONE);
                    mod6_p5_5_edt19.setText("");
                }
            }
        });

        // OCULTAR CHECKBOX --  PREGUNTA 5.20
        mod6_p5_5_ck20.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override

            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

                if (b) {
                    for (int i = 0; i < listacheck5.length; i++) {
                        final CheckBox checkBox = listacheck5[i];
                        checkBox.setEnabled(false);
                        checkBox.setChecked(false);

                    }

                }
                else {
                    for (int i = 0; i < listacheck5.length; i++) {
                        final CheckBox checkBox = listacheck5[i];
                        checkBox.setEnabled(true);


                    }
                }
            }
        });






        // MOSTRAR Y OCULTAR ESPECIFIQUE --  PREGUNTA 6.19
        mod6_p5_6_edt19.setFilters(new InputFilter[]{new InputFilter.AllCaps()});
        mod6_p5_6_ck19.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    mod6_p5_6_edt19.setVisibility(View.VISIBLE);
                    mod6_p5_6_edt19.requestFocus();
                    mod6_p5_6_edt19.setBackgroundResource(R.drawable.caja_texto_enabled);

                } else {
                    mod6_p5_6_edt19.setVisibility(View.GONE);
                    mod6_p5_6_edt19.setText("");

                }
            }
        });

        // OCULTAR CHECKBOX --  PREGUNTA 5.20
        mod6_p5_6_ck20.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override

            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

                if (b) {
                    for (int i = 0; i < listacheck6.length; i++) {
                        final CheckBox checkBox = listacheck6[i];
                        checkBox.setEnabled(false);
                        checkBox.setChecked(false);

                    }

                }
                else {
                    for (int i = 0; i < listacheck6.length; i++) {
                        final CheckBox checkBox = listacheck6[i];
                        checkBox.setEnabled(true);


                    }
                }
            }
        });









        // MOSTRAR Y OCULTAR ESPECIFIQUE --  PREGUNTA 7.19
        mod6_p5_7_edt19.setFilters(new InputFilter[]{new InputFilter.AllCaps()});
        mod6_p5_7_ck19.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    mod6_p5_7_edt19.setVisibility(View.VISIBLE);
                    mod6_p5_7_edt19.requestFocus();
                    mod6_p5_7_edt19.setBackgroundResource(R.drawable.caja_texto_enabled);

                } else {
                    mod6_p5_7_edt19.setVisibility(View.GONE);
                    mod6_p5_7_edt19.setText("");
                }
            }
        });

        // OCULTAR CHECKBOX --  PREGUNTA 7.20
        mod6_p5_7_ck20.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override

            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

                if (b) {
                    for (int i = 0; i < listacheck7.length; i++) {
                        final CheckBox checkBox = listacheck7[i];
                        checkBox.setEnabled(false);
                        checkBox.setChecked(false);

                    }

                }
                else {
                    for (int i = 0; i < listacheck7.length; i++) {
                        final CheckBox checkBox = listacheck7[i];
                        checkBox.setEnabled(true);


                    }
                }
            }
        });






        // MOSTRAR Y OCULTAR ESPECIFIQUE --  PREGUNTA 8.19
        mod6_p5_8_edt19.setFilters(new InputFilter[]{new InputFilter.AllCaps()});
        mod6_p5_8_ck19.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    mod6_p5_8_edt19.setVisibility(View.VISIBLE);
                    mod6_p5_8_edt19.requestFocus();
                    mod6_p5_8_edt19.setBackgroundResource(R.drawable.caja_texto_enabled);

                } else {
                    mod6_p5_8_edt19.setVisibility(View.GONE);
                    mod6_p5_8_edt19.setText("");
                }
            }
        });

        // OCULTAR CHECKBOX --  PREGUNTA 8.20
        mod6_p5_8_ck20.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override

            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

                if (b) {
                    for (int i = 0; i < listacheck8.length; i++) {
                        final CheckBox checkBox = listacheck8[i];
                        checkBox.setEnabled(false);
                        checkBox.setChecked(false);

                    }

                }
                else {
                    for (int i = 0; i < listacheck8.length; i++) {
                        final CheckBox checkBox = listacheck8[i];
                        checkBox.setEnabled(true);


                    }
                }
            }
        });


        // MOSTRAR Y OCULTAR ESPECIFIQUE --  PREGUNTA 9.19
        mod6_p5_9_edt19.setFilters(new InputFilter[]{new InputFilter.AllCaps()});
        mod6_p5_9_ck19.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    mod6_p5_9_edt19.setVisibility(View.VISIBLE);
                    mod6_p5_9_edt19.requestFocus();
                    mod6_p5_9_edt19.setBackgroundResource(R.drawable.caja_texto_enabled);

                } else {
                    mod6_p5_9_edt19.setVisibility(View.GONE);
                    mod6_p5_9_edt19.setText("");
                }
            }
        });

        // OCULTAR CHECKBOX --  PREGUNTA 9.20
        mod6_p5_9_ck20.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override

            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

                if (b) {
                    for (int i = 0; i < listacheck9.length; i++) {
                        final CheckBox checkBox = listacheck9[i];
                        checkBox.setEnabled(false);
                        checkBox.setChecked(false);
                    }

                }
                else {
                    for (int i = 0; i < listacheck9.length; i++) {
                        final CheckBox checkBox = listacheck9[i];
                        checkBox.setEnabled(true);


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
            //pregunta 5.1
            if (modulo6.getC6_P5_1_1().equals("1")) mod6_p5_1_ck1.setChecked(true);if (modulo6.getC6_P5_1_1().equals("0")) mod6_p5_1_ck1.setChecked(false);
            if (modulo6.getC6_P5_1_2().equals("1")) mod6_p5_1_ck2.setChecked(true);if (modulo6.getC6_P5_1_2().equals("0")) mod6_p5_1_ck2.setChecked(false);
            if (modulo6.getC6_P5_1_3().equals("1")) mod6_p5_1_ck3.setChecked(true);if (modulo6.getC6_P5_1_3().equals("0")) mod6_p5_1_ck3.setChecked(false);
            if (modulo6.getC6_P5_1_4().equals("1")) mod6_p5_1_ck4.setChecked(true);if (modulo6.getC6_P5_1_4().equals("0")) mod6_p5_1_ck4.setChecked(false);
            if (modulo6.getC6_P5_1_5().equals("1")) mod6_p5_1_ck5.setChecked(true);if (modulo6.getC6_P5_1_5().equals("0")) mod6_p5_1_ck5.setChecked(false);
            if (modulo6.getC6_P5_1_6().equals("1")) mod6_p5_1_ck6.setChecked(true);if (modulo6.getC6_P5_1_6().equals("0")) mod6_p5_1_ck6.setChecked(false);
            if (modulo6.getC6_P5_1_7().equals("1")) mod6_p5_1_ck7.setChecked(true);if (modulo6.getC6_P5_1_7().equals("0")) mod6_p5_1_ck7.setChecked(false);
            if (modulo6.getC6_P5_1_8().equals("1")) mod6_p5_1_ck8.setChecked(true);if (modulo6.getC6_P5_1_8().equals("0")) mod6_p5_1_ck8.setChecked(false);
            if (modulo6.getC6_P5_1_9().equals("1")) mod6_p5_1_ck9.setChecked(true);if (modulo6.getC6_P5_1_9().equals("0")) mod6_p5_1_ck9.setChecked(false);
            if (modulo6.getC6_P5_1_10().equals("1")) mod6_p5_1_ck10.setChecked(true);if (modulo6.getC6_P5_1_10().equals("0")) mod6_p5_1_ck10.setChecked(false);
            if (modulo6.getC6_P5_1_11().equals("1")) mod6_p5_1_ck11.setChecked(true);if (modulo6.getC6_P5_1_11().equals("0")) mod6_p5_1_ck11.setChecked(false);
            if (modulo6.getC6_P5_1_12().equals("1")) mod6_p5_1_ck12.setChecked(true);if (modulo6.getC6_P5_1_12().equals("0")) mod6_p5_1_ck12.setChecked(false);
            if (modulo6.getC6_P5_1_13().equals("1")) mod6_p5_1_ck13.setChecked(true);if (modulo6.getC6_P5_1_13().equals("0")) mod6_p5_1_ck13.setChecked(false);
            if (modulo6.getC6_P5_1_14().equals("1")) mod6_p5_1_ck14.setChecked(true);if (modulo6.getC6_P5_1_14().equals("0")) mod6_p5_1_ck14.setChecked(false);
            if (modulo6.getC6_P5_1_15().equals("1")) mod6_p5_1_ck15.setChecked(true);if (modulo6.getC6_P5_1_15().equals("0")) mod6_p5_1_ck15.setChecked(false);
            if (modulo6.getC6_P5_1_16().equals("1")) mod6_p5_1_ck16.setChecked(true);if (modulo6.getC6_P5_1_16().equals("0")) mod6_p5_1_ck16.setChecked(false);
            if (modulo6.getC6_P5_1_17().equals("1")) mod6_p5_1_ck17.setChecked(true);if (modulo6.getC6_P5_1_17().equals("0")) mod6_p5_1_ck17.setChecked(false);
            if (modulo6.getC6_P5_1_18().equals("1")) mod6_p5_1_ck18.setChecked(true);if (modulo6.getC6_P5_1_18().equals("0")) mod6_p5_1_ck18.setChecked(false);
            if (modulo6.getC6_P5_1_19().equals("1")) mod6_p5_1_ck19.setChecked(true);if (modulo6.getC6_P5_1_19().equals("0")) mod6_p5_1_ck19.setChecked(false);
            mod6_p5_1_edt19.setText(modulo6.getC6_P5_1_19_0());
            if (modulo6.getC6_P5_1_20().equals("1")) mod6_p5_1_ck20.setChecked(true);if (modulo6.getC6_P5_1_20().equals("0")) mod6_p5_1_ck20.setChecked(false);
            if (modulo6.getC6_P5_2_1().equals("1")) mod6_p5_2_ck1.setChecked(true);if (modulo6.getC6_P5_2_1().equals("0")) mod6_p5_2_ck1.setChecked(false);
            if (modulo6.getC6_P5_2_2().equals("1")) mod6_p5_2_ck2.setChecked(true);if (modulo6.getC6_P5_2_2().equals("0")) mod6_p5_2_ck2.setChecked(false);
            if (modulo6.getC6_P5_2_3().equals("1")) mod6_p5_2_ck3.setChecked(true);if (modulo6.getC6_P5_2_3().equals("0")) mod6_p5_2_ck3.setChecked(false);
            if (modulo6.getC6_P5_2_4().equals("1")) mod6_p5_2_ck4.setChecked(true);if (modulo6.getC6_P5_2_4().equals("0")) mod6_p5_2_ck4.setChecked(false);
            if (modulo6.getC6_P5_2_5().equals("1")) mod6_p5_2_ck5.setChecked(true);if (modulo6.getC6_P5_2_5().equals("0")) mod6_p5_2_ck5.setChecked(false);
            if (modulo6.getC6_P5_2_6().equals("1")) mod6_p5_2_ck6.setChecked(true);if (modulo6.getC6_P5_2_6().equals("0")) mod6_p5_2_ck6.setChecked(false);
            if (modulo6.getC6_P5_2_7().equals("1")) mod6_p5_2_ck7.setChecked(true);if (modulo6.getC6_P5_2_7().equals("0")) mod6_p5_2_ck7.setChecked(false);
            if (modulo6.getC6_P5_2_8().equals("1")) mod6_p5_2_ck8.setChecked(true);if (modulo6.getC6_P5_2_8().equals("0")) mod6_p5_2_ck8.setChecked(false);
            if (modulo6.getC6_P5_2_9().equals("1")) mod6_p5_2_ck9.setChecked(true);if (modulo6.getC6_P5_2_9().equals("0")) mod6_p5_2_ck9.setChecked(false);
            if (modulo6.getC6_P5_2_10().equals("1")) mod6_p5_2_ck10.setChecked(true);if (modulo6.getC6_P5_2_10().equals("0")) mod6_p5_2_ck10.setChecked(false);
            if (modulo6.getC6_P5_2_11().equals("1")) mod6_p5_2_ck11.setChecked(true);if (modulo6.getC6_P5_2_11().equals("0")) mod6_p5_2_ck11.setChecked(false);
            if (modulo6.getC6_P5_2_12().equals("1")) mod6_p5_2_ck12.setChecked(true);if (modulo6.getC6_P5_2_12().equals("0")) mod6_p5_2_ck12.setChecked(false);
            if (modulo6.getC6_P5_2_13().equals("1")) mod6_p5_2_ck13.setChecked(true);if (modulo6.getC6_P5_2_13().equals("0")) mod6_p5_2_ck13.setChecked(false);
            if (modulo6.getC6_P5_2_14().equals("1")) mod6_p5_2_ck14.setChecked(true);if (modulo6.getC6_P5_2_14().equals("0")) mod6_p5_2_ck14.setChecked(false);
            if (modulo6.getC6_P5_2_15().equals("1")) mod6_p5_2_ck15.setChecked(true);if (modulo6.getC6_P5_2_15().equals("0")) mod6_p5_2_ck15.setChecked(false);
            if (modulo6.getC6_P5_2_16().equals("1")) mod6_p5_2_ck16.setChecked(true);if (modulo6.getC6_P5_2_16().equals("0")) mod6_p5_2_ck16.setChecked(false);
            if (modulo6.getC6_P5_2_17().equals("1")) mod6_p5_2_ck17.setChecked(true);if (modulo6.getC6_P5_2_17().equals("0")) mod6_p5_2_ck17.setChecked(false);
            if (modulo6.getC6_P5_2_18().equals("1")) mod6_p5_2_ck18.setChecked(true);if (modulo6.getC6_P5_2_18().equals("0")) mod6_p5_2_ck18.setChecked(false);
            if (modulo6.getC6_P5_2_19().equals("1")) mod6_p5_2_ck19.setChecked(true);if (modulo6.getC6_P5_2_19().equals("0")) mod6_p5_2_ck19.setChecked(false);
            mod6_p5_2_edt19.setText(modulo6.getC6_P5_2_19_0());
            if (modulo6.getC6_P5_2_20().equals("1")) mod6_p5_2_ck20.setChecked(true);if (modulo6.getC6_P5_2_20().equals("0")) mod6_p5_2_ck20.setChecked(false);
            if (modulo6.getC6_P5_3_1().equals("1")) mod6_p5_3_ck1.setChecked(true);if (modulo6.getC6_P5_3_1().equals("0")) mod6_p5_3_ck1.setChecked(false);
            if (modulo6.getC6_P5_3_2().equals("1")) mod6_p5_3_ck2.setChecked(true);if (modulo6.getC6_P5_3_2().equals("0")) mod6_p5_3_ck2.setChecked(false);
            if (modulo6.getC6_P5_3_3().equals("1")) mod6_p5_3_ck3.setChecked(true);if (modulo6.getC6_P5_3_3().equals("0")) mod6_p5_3_ck3.setChecked(false);
            if (modulo6.getC6_P5_3_4().equals("1")) mod6_p5_3_ck4.setChecked(true);if (modulo6.getC6_P5_3_4().equals("0")) mod6_p5_3_ck4.setChecked(false);
            if (modulo6.getC6_P5_3_5().equals("1")) mod6_p5_3_ck5.setChecked(true);if (modulo6.getC6_P5_3_5().equals("0")) mod6_p5_3_ck5.setChecked(false);
            if (modulo6.getC6_P5_3_6().equals("1")) mod6_p5_3_ck6.setChecked(true);if (modulo6.getC6_P5_3_6().equals("0")) mod6_p5_3_ck6.setChecked(false);
            if (modulo6.getC6_P5_3_7().equals("1")) mod6_p5_3_ck7.setChecked(true);if (modulo6.getC6_P5_3_7().equals("0")) mod6_p5_3_ck7.setChecked(false);
            if (modulo6.getC6_P5_3_8().equals("1")) mod6_p5_3_ck8.setChecked(true);if (modulo6.getC6_P5_3_8().equals("0")) mod6_p5_3_ck8.setChecked(false);
            if (modulo6.getC6_P5_3_9().equals("1")) mod6_p5_3_ck9.setChecked(true);if (modulo6.getC6_P5_3_9().equals("0")) mod6_p5_3_ck9.setChecked(false);
            if (modulo6.getC6_P5_3_10().equals("1")) mod6_p5_3_ck10.setChecked(true);if (modulo6.getC6_P5_3_10().equals("0")) mod6_p5_3_ck10.setChecked(false);
            if (modulo6.getC6_P5_3_11().equals("1")) mod6_p5_3_ck11.setChecked(true);if (modulo6.getC6_P5_3_11().equals("0")) mod6_p5_3_ck11.setChecked(false);
            if (modulo6.getC6_P5_3_12().equals("1")) mod6_p5_3_ck12.setChecked(true);if (modulo6.getC6_P5_3_12().equals("0")) mod6_p5_3_ck12.setChecked(false);
            if (modulo6.getC6_P5_3_13().equals("1")) mod6_p5_3_ck13.setChecked(true);if (modulo6.getC6_P5_3_13().equals("0")) mod6_p5_3_ck13.setChecked(false);
            if (modulo6.getC6_P5_3_14().equals("1")) mod6_p5_3_ck14.setChecked(true);if (modulo6.getC6_P5_3_14().equals("0")) mod6_p5_3_ck14.setChecked(false);
            if (modulo6.getC6_P5_3_15().equals("1")) mod6_p5_3_ck15.setChecked(true);if (modulo6.getC6_P5_3_15().equals("0")) mod6_p5_3_ck15.setChecked(false);
            if (modulo6.getC6_P5_3_16().equals("1")) mod6_p5_3_ck16.setChecked(true);if (modulo6.getC6_P5_3_16().equals("0")) mod6_p5_3_ck16.setChecked(false);
            if (modulo6.getC6_P5_3_17().equals("1")) mod6_p5_3_ck17.setChecked(true);if (modulo6.getC6_P5_3_17().equals("0")) mod6_p5_3_ck17.setChecked(false);
            if (modulo6.getC6_P5_3_18().equals("1")) mod6_p5_3_ck18.setChecked(true);if (modulo6.getC6_P5_3_18().equals("0")) mod6_p5_3_ck18.setChecked(false);
            if (modulo6.getC6_P5_3_19().equals("1")) mod6_p5_3_ck19.setChecked(true);if (modulo6.getC6_P5_3_19().equals("0")) mod6_p5_3_ck19.setChecked(false);
            mod6_p5_3_edt19.setText(modulo6.getC6_P5_3_19_0());
            if (modulo6.getC6_P5_3_20().equals("1")) mod6_p5_3_ck20.setChecked(true);if (modulo6.getC6_P5_3_20().equals("0")) mod6_p5_3_ck20.setChecked(false);
            if (modulo6.getC6_P5_4_1().equals("1")) mod6_p5_4_ck1.setChecked(true);if (modulo6.getC6_P5_4_1().equals("0")) mod6_p5_4_ck1.setChecked(false);
            if (modulo6.getC6_P5_4_2().equals("1")) mod6_p5_4_ck2.setChecked(true);if (modulo6.getC6_P5_4_2().equals("0")) mod6_p5_3_ck2.setChecked(false);
            if (modulo6.getC6_P5_4_3().equals("1")) mod6_p5_4_ck3.setChecked(true);if (modulo6.getC6_P5_4_3().equals("0")) mod6_p5_4_ck3.setChecked(false);
            if (modulo6.getC6_P5_4_4().equals("1")) mod6_p5_4_ck4.setChecked(true);if (modulo6.getC6_P5_4_4().equals("0")) mod6_p5_4_ck4.setChecked(false);
            if (modulo6.getC6_P5_4_5().equals("1")) mod6_p5_4_ck5.setChecked(true);if (modulo6.getC6_P5_4_5().equals("0")) mod6_p5_4_ck5.setChecked(false);
            if (modulo6.getC6_P5_4_6().equals("1")) mod6_p5_4_ck6.setChecked(true);if (modulo6.getC6_P5_4_6().equals("0")) mod6_p5_4_ck6.setChecked(false);
            if (modulo6.getC6_P5_4_7().equals("1")) mod6_p5_4_ck7.setChecked(true);if (modulo6.getC6_P5_4_7().equals("0")) mod6_p5_4_ck7.setChecked(false);
            if (modulo6.getC6_P5_4_8().equals("1")) mod6_p5_4_ck8.setChecked(true);if (modulo6.getC6_P5_4_8().equals("0")) mod6_p5_4_ck8.setChecked(false);
            if (modulo6.getC6_P5_4_9().equals("1")) mod6_p5_4_ck9.setChecked(true);if (modulo6.getC6_P5_4_9().equals("0")) mod6_p5_4_ck9.setChecked(false);
            if (modulo6.getC6_P5_4_10().equals("1")) mod6_p5_4_ck10.setChecked(true);if (modulo6.getC6_P5_4_10().equals("0")) mod6_p5_4_ck10.setChecked(false);
            if (modulo6.getC6_P5_4_11().equals("1")) mod6_p5_4_ck11.setChecked(true);if (modulo6.getC6_P5_4_11().equals("0")) mod6_p5_4_ck11.setChecked(false);
            if (modulo6.getC6_P5_4_12().equals("1")) mod6_p5_4_ck12.setChecked(true);if (modulo6.getC6_P5_4_12().equals("0")) mod6_p5_4_ck12.setChecked(false);
            if (modulo6.getC6_P5_4_13().equals("1")) mod6_p5_4_ck13.setChecked(true);if (modulo6.getC6_P5_4_13().equals("0")) mod6_p5_4_ck13.setChecked(false);
            if (modulo6.getC6_P5_4_14().equals("1")) mod6_p5_4_ck14.setChecked(true);if (modulo6.getC6_P5_4_14().equals("0")) mod6_p5_4_ck14.setChecked(false);
            if (modulo6.getC6_P5_4_15().equals("1")) mod6_p5_4_ck15.setChecked(true);if (modulo6.getC6_P5_4_15().equals("0")) mod6_p5_4_ck15.setChecked(false);
            if (modulo6.getC6_P5_4_16().equals("1")) mod6_p5_4_ck16.setChecked(true);if (modulo6.getC6_P5_4_16().equals("0")) mod6_p5_4_ck16.setChecked(false);
            if (modulo6.getC6_P5_4_17().equals("1")) mod6_p5_4_ck17.setChecked(true);if (modulo6.getC6_P5_4_17().equals("0")) mod6_p5_4_ck17.setChecked(false);
            if (modulo6.getC6_P5_4_18().equals("1")) mod6_p5_4_ck18.setChecked(true);if (modulo6.getC6_P5_4_18().equals("0")) mod6_p5_4_ck18.setChecked(false);
            if (modulo6.getC6_P5_4_19().equals("1")) mod6_p5_4_ck19.setChecked(true);if (modulo6.getC6_P5_4_19().equals("0")) mod6_p5_4_ck19.setChecked(false);
            mod6_p5_4_edt19.setText(modulo6.getC6_P5_4_19_0());
            if (modulo6.getC6_P5_4_20().equals("1")) mod6_p5_4_ck20.setChecked(true);if (modulo6.getC6_P5_4_20().equals("0")) mod6_p5_4_ck20.setChecked(false);
            if (modulo6.getC6_P5_5_1().equals("1")) mod6_p5_5_ck1.setChecked(true);if (modulo6.getC6_P5_5_1().equals("0")) mod6_p5_5_ck1.setChecked(false);
            if (modulo6.getC6_P5_5_2().equals("1")) mod6_p5_5_ck2.setChecked(true);if (modulo6.getC6_P5_5_2().equals("0")) mod6_p5_5_ck2.setChecked(false);
            if (modulo6.getC6_P5_5_3().equals("1")) mod6_p5_5_ck3.setChecked(true);if (modulo6.getC6_P5_5_3().equals("0")) mod6_p5_5_ck3.setChecked(false);
            if (modulo6.getC6_P5_5_4().equals("1")) mod6_p5_5_ck4.setChecked(true);if (modulo6.getC6_P5_5_4().equals("0")) mod6_p5_5_ck4.setChecked(false);
            if (modulo6.getC6_P5_5_5().equals("1")) mod6_p5_5_ck5.setChecked(true);if (modulo6.getC6_P5_5_5().equals("0")) mod6_p5_5_ck5.setChecked(false);
            if (modulo6.getC6_P5_5_6().equals("1")) mod6_p5_5_ck6.setChecked(true);if (modulo6.getC6_P5_5_6().equals("0")) mod6_p5_5_ck6.setChecked(false);
            if (modulo6.getC6_P5_5_7().equals("1")) mod6_p5_5_ck7.setChecked(true);if (modulo6.getC6_P5_5_7().equals("0")) mod6_p5_5_ck7.setChecked(false);
            if (modulo6.getC6_P5_5_8().equals("1")) mod6_p5_5_ck8.setChecked(true);if (modulo6.getC6_P5_5_8().equals("0")) mod6_p5_5_ck8.setChecked(false);
            if (modulo6.getC6_P5_5_9().equals("1")) mod6_p5_5_ck9.setChecked(true);if (modulo6.getC6_P5_5_9().equals("0")) mod6_p5_5_ck9.setChecked(false);
            if (modulo6.getC6_P5_5_10().equals("1")) mod6_p5_5_ck10.setChecked(true);if (modulo6.getC6_P5_5_10().equals("0")) mod6_p5_5_ck10.setChecked(false);
            if (modulo6.getC6_P5_5_11().equals("1")) mod6_p5_5_ck11.setChecked(true);if (modulo6.getC6_P5_5_11().equals("0")) mod6_p5_5_ck11.setChecked(false);
            if (modulo6.getC6_P5_5_12().equals("1")) mod6_p5_5_ck12.setChecked(true);if (modulo6.getC6_P5_5_12().equals("0")) mod6_p5_5_ck12.setChecked(false);
            if (modulo6.getC6_P5_5_13().equals("1")) mod6_p5_5_ck13.setChecked(true);if (modulo6.getC6_P5_5_13().equals("0")) mod6_p5_5_ck13.setChecked(false);
            if (modulo6.getC6_P5_5_14().equals("1")) mod6_p5_5_ck14.setChecked(true);if (modulo6.getC6_P5_5_14().equals("0")) mod6_p5_5_ck14.setChecked(false);
            if (modulo6.getC6_P5_5_15().equals("1")) mod6_p5_5_ck15.setChecked(true);if (modulo6.getC6_P5_5_15().equals("0")) mod6_p5_5_ck15.setChecked(false);
            if (modulo6.getC6_P5_5_16().equals("1")) mod6_p5_5_ck16.setChecked(true);if (modulo6.getC6_P5_5_16().equals("0")) mod6_p5_5_ck16.setChecked(false);
            if (modulo6.getC6_P5_5_17().equals("1")) mod6_p5_5_ck17.setChecked(true);if (modulo6.getC6_P5_5_17().equals("0")) mod6_p5_5_ck17.setChecked(false);
            if (modulo6.getC6_P5_5_18().equals("1")) mod6_p5_5_ck18.setChecked(true);if (modulo6.getC6_P5_5_18().equals("0")) mod6_p5_5_ck18.setChecked(false);
            if (modulo6.getC6_P5_5_19().equals("1")) mod6_p5_5_ck19.setChecked(true);if (modulo6.getC6_P5_5_19().equals("0")) mod6_p5_5_ck19.setChecked(false);
            mod6_p5_5_edt19.setText(modulo6.getC6_P5_5_19_0());
            if (modulo6.getC6_P5_6_20().equals("1")) mod6_p5_5_ck20.setChecked(true);if (modulo6.getC6_P5_6_20().equals("0")) mod6_p5_5_ck20.setChecked(false);
            if (modulo6.getC6_P5_6_1().equals("1")) mod6_p5_6_ck1.setChecked(true);if (modulo6.getC6_P5_6_1().equals("0")) mod6_p5_6_ck1.setChecked(false);
            if (modulo6.getC6_P5_6_2().equals("1")) mod6_p5_6_ck2.setChecked(true);if (modulo6.getC6_P5_6_2().equals("0")) mod6_p5_6_ck2.setChecked(false);
            if (modulo6.getC6_P5_6_3().equals("1")) mod6_p5_6_ck3.setChecked(true);if (modulo6.getC6_P5_6_3().equals("0")) mod6_p5_6_ck3.setChecked(false);
            if (modulo6.getC6_P5_6_4().equals("1")) mod6_p5_6_ck4.setChecked(true);if (modulo6.getC6_P5_6_4().equals("0")) mod6_p5_6_ck4.setChecked(false);
            if (modulo6.getC6_P5_6_5().equals("1")) mod6_p5_6_ck5.setChecked(true);if (modulo6.getC6_P5_6_5().equals("0")) mod6_p5_6_ck5.setChecked(false);
            if (modulo6.getC6_P5_6_6().equals("1")) mod6_p5_6_ck6.setChecked(true);if (modulo6.getC6_P5_6_6().equals("0")) mod6_p5_6_ck6.setChecked(false);
            if (modulo6.getC6_P5_6_7().equals("1")) mod6_p5_6_ck7.setChecked(true);if (modulo6.getC6_P5_6_7().equals("0")) mod6_p5_6_ck7.setChecked(false);
            if (modulo6.getC6_P5_6_8().equals("1")) mod6_p5_6_ck8.setChecked(true);if (modulo6.getC6_P5_6_8().equals("0")) mod6_p5_6_ck8.setChecked(false);
            if (modulo6.getC6_P5_6_9().equals("1")) mod6_p5_6_ck9.setChecked(true);if (modulo6.getC6_P5_6_9().equals("0")) mod6_p5_6_ck9.setChecked(false);
            if (modulo6.getC6_P5_6_10().equals("1")) mod6_p5_6_ck10.setChecked(true);if (modulo6.getC6_P5_6_10().equals("0")) mod6_p5_6_ck10.setChecked(false);
            if (modulo6.getC6_P5_6_11().equals("1")) mod6_p5_6_ck11.setChecked(true);if (modulo6.getC6_P5_6_11().equals("0")) mod6_p5_6_ck11.setChecked(false);
            if (modulo6.getC6_P5_6_12().equals("1")) mod6_p5_6_ck12.setChecked(true);if (modulo6.getC6_P5_6_12().equals("0")) mod6_p5_6_ck12.setChecked(false);
            if (modulo6.getC6_P5_6_13().equals("1")) mod6_p5_6_ck13.setChecked(true);if (modulo6.getC6_P5_6_13().equals("0")) mod6_p5_6_ck13.setChecked(false);
            if (modulo6.getC6_P5_6_14().equals("1")) mod6_p5_6_ck14.setChecked(true);if (modulo6.getC6_P5_6_14().equals("0")) mod6_p5_6_ck14.setChecked(false);
            if (modulo6.getC6_P5_6_15().equals("1")) mod6_p5_6_ck15.setChecked(true);if (modulo6.getC6_P5_6_15().equals("0")) mod6_p5_6_ck15.setChecked(false);
            if (modulo6.getC6_P5_6_16().equals("1")) mod6_p5_6_ck16.setChecked(true);if (modulo6.getC6_P5_6_16().equals("0")) mod6_p5_6_ck16.setChecked(false);
            if (modulo6.getC6_P5_6_17().equals("1")) mod6_p5_6_ck17.setChecked(true);if (modulo6.getC6_P5_6_17().equals("0")) mod6_p5_6_ck17.setChecked(false);
            if (modulo6.getC6_P5_6_18().equals("1")) mod6_p5_6_ck18.setChecked(true);if (modulo6.getC6_P5_6_18().equals("0")) mod6_p5_6_ck18.setChecked(false);
            if (modulo6.getC6_P5_6_19().equals("1")) mod6_p5_6_ck19.setChecked(true);if (modulo6.getC6_P5_6_19().equals("0")) mod6_p5_6_ck19.setChecked(false);
            mod6_p5_6_edt19.setText(modulo6.getC6_P5_6_19_0());
            if (modulo6.getC6_P5_6_20().equals("1")) mod6_p5_6_ck20.setChecked(true);if (modulo6.getC6_P5_5_20().equals("0")) mod6_p5_6_ck20.setChecked(false);
            if (modulo6.getC6_P5_7_1().equals("1")) mod6_p5_7_ck1.setChecked(true);if (modulo6.getC6_P5_7_1().equals("0")) mod6_p5_7_ck1.setChecked(false);
            if (modulo6.getC6_P5_7_2().equals("1")) mod6_p5_7_ck2.setChecked(true);if (modulo6.getC6_P5_7_2().equals("0")) mod6_p5_7_ck2.setChecked(false);
            if (modulo6.getC6_P5_7_3().equals("1")) mod6_p5_7_ck3.setChecked(true);if (modulo6.getC6_P5_7_3().equals("0")) mod6_p5_7_ck3.setChecked(false);
            if (modulo6.getC6_P5_7_4().equals("1")) mod6_p5_7_ck4.setChecked(true);if (modulo6.getC6_P5_7_4().equals("0")) mod6_p5_7_ck4.setChecked(false);
            if (modulo6.getC6_P5_7_5().equals("1")) mod6_p5_7_ck5.setChecked(true);if (modulo6.getC6_P5_7_5().equals("0")) mod6_p5_7_ck5.setChecked(false);
            if (modulo6.getC6_P5_7_6().equals("1")) mod6_p5_7_ck6.setChecked(true);if (modulo6.getC6_P5_7_6().equals("0")) mod6_p5_7_ck6.setChecked(false);
            if (modulo6.getC6_P5_7_7().equals("1")) mod6_p5_7_ck7.setChecked(true);if (modulo6.getC6_P5_7_7().equals("0")) mod6_p5_7_ck7.setChecked(false);
            if (modulo6.getC6_P5_7_8().equals("1")) mod6_p5_7_ck8.setChecked(true);if (modulo6.getC6_P5_7_8().equals("0")) mod6_p5_7_ck8.setChecked(false);
            if (modulo6.getC6_P5_7_9().equals("1")) mod6_p5_7_ck9.setChecked(true);if (modulo6.getC6_P5_7_9().equals("0")) mod6_p5_7_ck9.setChecked(false);
            if (modulo6.getC6_P5_7_10().equals("1")) mod6_p5_7_ck10.setChecked(true);if (modulo6.getC6_P5_7_10().equals("0")) mod6_p5_7_ck10.setChecked(false);
            if (modulo6.getC6_P5_7_11().equals("1")) mod6_p5_7_ck11.setChecked(true);if (modulo6.getC6_P5_7_11().equals("0")) mod6_p5_7_ck11.setChecked(false);
            if (modulo6.getC6_P5_7_12().equals("1")) mod6_p5_7_ck12.setChecked(true);if (modulo6.getC6_P5_7_12().equals("0")) mod6_p5_7_ck12.setChecked(false);
            if (modulo6.getC6_P5_7_13().equals("1")) mod6_p5_7_ck13.setChecked(true);if (modulo6.getC6_P5_7_13().equals("0")) mod6_p5_7_ck13.setChecked(false);
            if (modulo6.getC6_P5_7_14().equals("1")) mod6_p5_7_ck14.setChecked(true);if (modulo6.getC6_P5_7_14().equals("0")) mod6_p5_7_ck14.setChecked(false);
            if (modulo6.getC6_P5_7_15().equals("1")) mod6_p5_7_ck15.setChecked(true);if (modulo6.getC6_P5_7_15().equals("0")) mod6_p5_7_ck15.setChecked(false);
            if (modulo6.getC6_P5_7_16().equals("1")) mod6_p5_7_ck16.setChecked(true);if (modulo6.getC6_P5_7_16().equals("0")) mod6_p5_7_ck16.setChecked(false);
            if (modulo6.getC6_P5_7_17().equals("1")) mod6_p5_7_ck17.setChecked(true);if (modulo6.getC6_P5_7_17().equals("0")) mod6_p5_7_ck17.setChecked(false);
            if (modulo6.getC6_P5_7_18().equals("1")) mod6_p5_7_ck18.setChecked(true);if (modulo6.getC6_P5_7_18().equals("0")) mod6_p5_7_ck18.setChecked(false);
            if (modulo6.getC6_P5_7_19().equals("1")) mod6_p5_7_ck19.setChecked(true);if (modulo6.getC6_P5_7_19().equals("0")) mod6_p5_7_ck19.setChecked(false);
            mod6_p5_7_edt19.setText(modulo6.getC6_P5_7_19_0());
            if (modulo6.getC6_P5_7_20().equals("1")) mod6_p5_7_ck20.setChecked(true);if (modulo6.getC6_P5_7_20().equals("0")) mod6_p5_7_ck20.setChecked(false);
            if (modulo6.getC6_P5_8_1().equals("1")) mod6_p5_8_ck1.setChecked(true);if (modulo6.getC6_P5_8_1().equals("0")) mod6_p5_8_ck1.setChecked(false);
            if (modulo6.getC6_P5_8_2().equals("1")) mod6_p5_8_ck2.setChecked(true);if (modulo6.getC6_P5_8_2().equals("0")) mod6_p5_8_ck2.setChecked(false);
            if (modulo6.getC6_P5_8_3().equals("1")) mod6_p5_8_ck3.setChecked(true);if (modulo6.getC6_P5_8_3().equals("0")) mod6_p5_8_ck3.setChecked(false);
            if (modulo6.getC6_P5_8_4().equals("1")) mod6_p5_8_ck4.setChecked(true);if (modulo6.getC6_P5_8_4().equals("0")) mod6_p5_8_ck4.setChecked(false);
            if (modulo6.getC6_P5_8_5().equals("1")) mod6_p5_8_ck5.setChecked(true);if (modulo6.getC6_P5_8_5().equals("0")) mod6_p5_8_ck5.setChecked(false);
            if (modulo6.getC6_P5_8_6().equals("1")) mod6_p5_8_ck6.setChecked(true);if (modulo6.getC6_P5_8_6().equals("0")) mod6_p5_8_ck6.setChecked(false);
            if (modulo6.getC6_P5_8_7().equals("1")) mod6_p5_8_ck7.setChecked(true);if (modulo6.getC6_P5_8_7().equals("0")) mod6_p5_8_ck7.setChecked(false);
            if (modulo6.getC6_P5_8_8().equals("1")) mod6_p5_8_ck8.setChecked(true);if (modulo6.getC6_P5_8_8().equals("0")) mod6_p5_8_ck8.setChecked(false);
            if (modulo6.getC6_P5_8_9().equals("1")) mod6_p5_8_ck9.setChecked(true);if (modulo6.getC6_P5_8_9().equals("0")) mod6_p5_8_ck9.setChecked(false);
            if (modulo6.getC6_P5_8_10().equals("1")) mod6_p5_8_ck10.setChecked(true);if (modulo6.getC6_P5_8_10().equals("0")) mod6_p5_8_ck10.setChecked(false);
            if (modulo6.getC6_P5_8_11().equals("1")) mod6_p5_8_ck11.setChecked(true);if (modulo6.getC6_P5_8_11().equals("0")) mod6_p5_8_ck11.setChecked(false);
            if (modulo6.getC6_P5_8_12().equals("1")) mod6_p5_8_ck12.setChecked(true);if (modulo6.getC6_P5_8_12().equals("0")) mod6_p5_8_ck12.setChecked(false);
            if (modulo6.getC6_P5_8_13().equals("1")) mod6_p5_8_ck13.setChecked(true);if (modulo6.getC6_P5_8_13().equals("0")) mod6_p5_8_ck13.setChecked(false);
            if (modulo6.getC6_P5_8_14().equals("1")) mod6_p5_8_ck14.setChecked(true);if (modulo6.getC6_P5_8_14().equals("0")) mod6_p5_8_ck14.setChecked(false);
            if (modulo6.getC6_P5_8_15().equals("1")) mod6_p5_8_ck15.setChecked(true);if (modulo6.getC6_P5_8_15().equals("0")) mod6_p5_8_ck15.setChecked(false);
            if (modulo6.getC6_P5_8_16().equals("1")) mod6_p5_8_ck16.setChecked(true);if (modulo6.getC6_P5_8_16().equals("0")) mod6_p5_8_ck16.setChecked(false);
            if (modulo6.getC6_P5_8_17().equals("1")) mod6_p5_8_ck17.setChecked(true);if (modulo6.getC6_P5_8_17().equals("0")) mod6_p5_8_ck17.setChecked(false);
            if (modulo6.getC6_P5_8_18().equals("1")) mod6_p5_8_ck18.setChecked(true);if (modulo6.getC6_P5_8_18().equals("0")) mod6_p5_8_ck18.setChecked(false);
            if (modulo6.getC6_P5_8_19().equals("1")) mod6_p5_8_ck19.setChecked(true);if (modulo6.getC6_P5_8_19().equals("0")) mod6_p5_8_ck19.setChecked(false);
            mod6_p5_8_edt19.setText(modulo6.getC6_P5_8_19_0());
            if (modulo6.getC6_P5_8_20().equals("1")) mod6_p5_8_ck20.setChecked(true);if (modulo6.getC6_P5_8_20().equals("0")) mod6_p5_8_ck20.setChecked(false);
            if (modulo6.getC6_P5_9_1().equals("1")) mod6_p5_9_ck1.setChecked(true);if (modulo6.getC6_P5_9_1().equals("0")) mod6_p5_9_ck1.setChecked(false);
            if (modulo6.getC6_P5_9_2().equals("1")) mod6_p5_9_ck2.setChecked(true);if (modulo6.getC6_P5_9_2().equals("0")) mod6_p5_9_ck2.setChecked(false);
            if (modulo6.getC6_P5_9_3().equals("1")) mod6_p5_9_ck3.setChecked(true);if (modulo6.getC6_P5_9_3().equals("0")) mod6_p5_9_ck3.setChecked(false);
            if (modulo6.getC6_P5_9_4().equals("1")) mod6_p5_9_ck4.setChecked(true);if (modulo6.getC6_P5_9_4().equals("0")) mod6_p5_9_ck4.setChecked(false);
            if (modulo6.getC6_P5_9_5().equals("1")) mod6_p5_9_ck5.setChecked(true);if (modulo6.getC6_P5_9_5().equals("0")) mod6_p5_9_ck5.setChecked(false);
            if (modulo6.getC6_P5_9_6().equals("1")) mod6_p5_9_ck6.setChecked(true);if (modulo6.getC6_P5_9_6().equals("0")) mod6_p5_9_ck6.setChecked(false);
            if (modulo6.getC6_P5_9_7().equals("1")) mod6_p5_9_ck7.setChecked(true);if (modulo6.getC6_P5_9_7().equals("0")) mod6_p5_9_ck7.setChecked(false);
            if (modulo6.getC6_P5_9_8().equals("1")) mod6_p5_9_ck8.setChecked(true);if (modulo6.getC6_P5_9_8().equals("0")) mod6_p5_9_ck8.setChecked(false);
            if (modulo6.getC6_P5_9_9().equals("1")) mod6_p5_9_ck9.setChecked(true);if (modulo6.getC6_P5_9_9().equals("0")) mod6_p5_9_ck9.setChecked(false);
            if (modulo6.getC6_P5_9_10().equals("1")) mod6_p5_9_ck10.setChecked(true);if (modulo6.getC6_P5_9_10().equals("0")) mod6_p5_9_ck10.setChecked(false);
            if (modulo6.getC6_P5_9_11().equals("1")) mod6_p5_9_ck11.setChecked(true);if (modulo6.getC6_P5_9_11().equals("0")) mod6_p5_9_ck11.setChecked(false);
            if (modulo6.getC6_P5_9_12().equals("1")) mod6_p5_9_ck12.setChecked(true);if (modulo6.getC6_P5_9_12().equals("0")) mod6_p5_9_ck12.setChecked(false);
            if (modulo6.getC6_P5_9_13().equals("1")) mod6_p5_9_ck13.setChecked(true);if (modulo6.getC6_P5_9_13().equals("0")) mod6_p5_9_ck13.setChecked(false);
            if (modulo6.getC6_P5_9_14().equals("1")) mod6_p5_9_ck14.setChecked(true);if (modulo6.getC6_P5_9_14().equals("0")) mod6_p5_9_ck14.setChecked(false);
            if (modulo6.getC6_P5_9_15().equals("1")) mod6_p5_9_ck15.setChecked(true);if (modulo6.getC6_P5_9_15().equals("0")) mod6_p5_9_ck15.setChecked(false);
            if (modulo6.getC6_P5_9_16().equals("1")) mod6_p5_9_ck16.setChecked(true);if (modulo6.getC6_P5_9_16().equals("0")) mod6_p5_9_ck16.setChecked(false);
            if (modulo6.getC6_P5_9_17().equals("1")) mod6_p5_9_ck17.setChecked(true);if (modulo6.getC6_P5_9_17().equals("0")) mod6_p5_9_ck17.setChecked(false);
            if (modulo6.getC6_P5_9_18().equals("1")) mod6_p5_9_ck18.setChecked(true);if (modulo6.getC6_P5_9_18().equals("0")) mod6_p5_9_ck18.setChecked(false);
            if (modulo6.getC6_P5_9_19().equals("1")) mod6_p5_9_ck19.setChecked(true);if (modulo6.getC6_P5_9_19().equals("0")) mod6_p5_9_ck19.setChecked(false);
            mod6_p5_9_edt19.setText(modulo6.getC6_P5_9_19_0());
            if (modulo6.getC6_P5_9_20().equals("1")) mod6_p5_9_ck20.setChecked(true);if (modulo6.getC6_P5_9_20().equals("0")) mod6_p5_9_ck20.setChecked(false);





        }
        data.close();
    }

    public void llenarMapaVariables() {
        //preguntas cabecera
        if (mod6_p5_1_ck1.isChecked()) C6_P5_1_1 = 1;else C6_P5_1_1= 0;
        if (mod6_p5_1_ck2.isChecked()) C6_P5_1_2 = 1;else C6_P5_1_2= 0;
        if (mod6_p5_1_ck3.isChecked()) C6_P5_1_3 = 1;else C6_P5_1_3= 0;
        if (mod6_p5_1_ck4.isChecked()) C6_P5_1_4 = 1;else C6_P5_1_4= 0;
        if (mod6_p5_1_ck5.isChecked()) C6_P5_1_5 = 1;else C6_P5_1_5= 0;
        if (mod6_p5_1_ck6.isChecked()) C6_P5_1_6 = 1;else C6_P5_1_6= 0;
        if (mod6_p5_1_ck7.isChecked()) C6_P5_1_7 = 1;else C6_P5_1_7= 0;
        if (mod6_p5_1_ck8.isChecked()) C6_P5_1_8 = 1;else C6_P5_1_8= 0;
        if (mod6_p5_1_ck9.isChecked()) C6_P5_1_9 = 1;else C6_P5_1_9= 0;
        if (mod6_p5_1_ck10.isChecked()) C6_P5_1_10 = 1;else C6_P5_1_10= 0;
        if (mod6_p5_1_ck11.isChecked()) C6_P5_1_11 = 1;else C6_P5_1_11= 0;
        if (mod6_p5_1_ck12.isChecked()) C6_P5_1_12 = 1;else C6_P5_1_12= 0;
        if (mod6_p5_1_ck13.isChecked()) C6_P5_1_13 = 1;else C6_P5_1_13= 0;
        if (mod6_p5_1_ck14.isChecked()) C6_P5_1_14 = 1;else C6_P5_1_14= 0;
        if (mod6_p5_1_ck15.isChecked()) C6_P5_1_15 = 1;else C6_P5_1_15= 0;
        if (mod6_p5_1_ck16.isChecked()) C6_P5_1_16 = 1;else C6_P5_1_16= 0;
        if (mod6_p5_1_ck17.isChecked()) C6_P5_1_17 = 1;else C6_P5_1_17= 0;
        if (mod6_p5_1_ck18.isChecked()) C6_P5_1_18 = 1;else C6_P5_1_18= 0;
        if (mod6_p5_1_ck19.isChecked()) C6_P5_1_19 = 1;else C6_P5_1_19= 0;
        C6_P5_1_19_0 = mod6_p5_1_edt19.getText().toString();
        if (mod6_p5_1_ck20.isChecked()) C6_P5_1_20 = 1;else C6_P5_1_20= 0;
        if (mod6_p5_2_ck1.isChecked()) C6_P5_2_1 = 1;else C6_P5_2_1= 0;
        if (mod6_p5_2_ck2.isChecked()) C6_P5_2_2 = 1;else C6_P5_2_2= 0;
        if (mod6_p5_2_ck3.isChecked()) C6_P5_2_3 = 1;else C6_P5_2_3= 0;
        if (mod6_p5_2_ck4.isChecked()) C6_P5_2_4 = 1;else C6_P5_2_4= 0;
        if (mod6_p5_2_ck5.isChecked()) C6_P5_2_5 = 1;else C6_P5_2_5= 0;
        if (mod6_p5_2_ck6.isChecked()) C6_P5_2_6 = 1;else C6_P5_2_6= 0;
        if (mod6_p5_2_ck7.isChecked()) C6_P5_2_7 = 1;else C6_P5_2_7= 0;
        if (mod6_p5_2_ck8.isChecked()) C6_P5_2_8 = 1;else C6_P5_2_8= 0;
        if (mod6_p5_2_ck9.isChecked()) C6_P5_2_9 = 1;else C6_P5_2_9= 0;
        if (mod6_p5_2_ck10.isChecked()) C6_P5_2_10 = 1;else C6_P5_2_10= 0;
        if (mod6_p5_2_ck11.isChecked()) C6_P5_2_11 = 1;else C6_P5_2_11= 0;
        if (mod6_p5_2_ck12.isChecked()) C6_P5_2_12 = 1;else C6_P5_2_12= 0;
        if (mod6_p5_2_ck13.isChecked()) C6_P5_2_13 = 1;else C6_P5_2_13= 0;
        if (mod6_p5_2_ck14.isChecked()) C6_P5_2_14 = 1;else C6_P5_2_14= 0;
        if (mod6_p5_2_ck15.isChecked()) C6_P5_2_15 = 1;else C6_P5_2_15= 0;
        if (mod6_p5_2_ck16.isChecked()) C6_P5_2_16 = 1;else C6_P5_2_16= 0;
        if (mod6_p5_2_ck17.isChecked()) C6_P5_2_17 = 1;else C6_P5_2_17= 0;
        if (mod6_p5_2_ck18.isChecked()) C6_P5_2_18 = 1;else C6_P5_2_18= 0;
        if (mod6_p5_2_ck19.isChecked()) C6_P5_2_19 = 1;else C6_P5_2_19= 0;
        C6_P5_2_19_0 = mod6_p5_2_edt19.getText().toString();

        if (mod6_p5_2_ck20.isChecked()) C6_P5_2_20 = 1;else C6_P5_2_20= 0;
        if (mod6_p5_3_ck1.isChecked()) C6_P5_3_1 = 1;else C6_P5_3_1= 0;
        if (mod6_p5_3_ck2.isChecked()) C6_P5_3_2 = 1;else C6_P5_3_2= 0;
        if (mod6_p5_3_ck3.isChecked()) C6_P5_3_3 = 1;else C6_P5_3_3= 0;
        if (mod6_p5_3_ck4.isChecked()) C6_P5_3_4 = 1;else C6_P5_3_4= 0;
        if (mod6_p5_3_ck5.isChecked()) C6_P5_3_5 = 1;else C6_P5_3_5= 0;
        if (mod6_p5_3_ck6.isChecked()) C6_P5_3_6 = 1;else C6_P5_3_6= 0;
        if (mod6_p5_3_ck7.isChecked()) C6_P5_3_7 = 1;else C6_P5_3_7= 0;
        if (mod6_p5_3_ck8.isChecked()) C6_P5_3_8 = 1;else C6_P5_3_8= 0;
        if (mod6_p5_3_ck9.isChecked()) C6_P5_3_9 = 1;else C6_P5_3_9= 0;
        if (mod6_p5_3_ck10.isChecked()) C6_P5_3_10 = 1;else C6_P5_3_10= 0;
        if (mod6_p5_3_ck11.isChecked()) C6_P5_3_11 = 1;else C6_P5_3_11= 0;
        if (mod6_p5_3_ck12.isChecked()) C6_P5_3_12 = 1;else C6_P5_3_12= 0;
        if (mod6_p5_3_ck13.isChecked()) C6_P5_3_13 = 1;else C6_P5_3_13= 0;
        if (mod6_p5_3_ck14.isChecked()) C6_P5_3_14 = 1;else C6_P5_3_14= 0;
        if (mod6_p5_3_ck15.isChecked()) C6_P5_3_15 = 1;else C6_P5_3_15= 0;
        if (mod6_p5_3_ck16.isChecked()) C6_P5_3_16 = 1;else C6_P5_3_16= 0;
        if (mod6_p5_3_ck17.isChecked()) C6_P5_3_17 = 1;else C6_P5_3_17= 0;
        if (mod6_p5_3_ck18.isChecked()) C6_P5_3_18 = 1;else C6_P5_3_18= 0;
        if (mod6_p5_3_ck19.isChecked()) C6_P5_3_19 = 1;else C6_P5_3_19= 0;
        C6_P5_3_19_0 = mod6_p5_3_edt19.getText().toString();
        if (mod6_p5_3_ck20.isChecked()) C6_P5_3_20 = 1;else C6_P5_3_20= 0;

        if (mod6_p5_4_ck1.isChecked()) C6_P5_4_1 = 1;else C6_P5_4_1= 0;
        if (mod6_p5_4_ck2.isChecked()) C6_P5_4_2 = 1;else C6_P5_4_2= 0;
        if (mod6_p5_4_ck3.isChecked()) C6_P5_4_3 = 1;else C6_P5_4_3= 0;
        if (mod6_p5_4_ck4.isChecked()) C6_P5_4_4 = 1;else C6_P5_4_4= 0;
        if (mod6_p5_4_ck5.isChecked()) C6_P5_4_5 = 1;else C6_P5_4_5= 0;
        if (mod6_p5_4_ck6.isChecked()) C6_P5_4_6 = 1;else C6_P5_4_6= 0;
        if (mod6_p5_4_ck7.isChecked()) C6_P5_4_7 = 1;else C6_P5_4_7= 0;
        if (mod6_p5_4_ck8.isChecked()) C6_P5_4_8 = 1;else C6_P5_4_8= 0;
        if (mod6_p5_4_ck9.isChecked()) C6_P5_4_9 = 1;else C6_P5_4_9= 0;
        if (mod6_p5_4_ck10.isChecked()) C6_P5_4_10 = 1;else C6_P5_4_10= 0;
        if (mod6_p5_4_ck11.isChecked()) C6_P5_4_11 = 1;else C6_P5_4_11= 0;
        if (mod6_p5_4_ck12.isChecked()) C6_P5_4_12 = 1;else C6_P5_4_12= 0;
        if (mod6_p5_4_ck13.isChecked()) C6_P5_4_13 = 1;else C6_P5_4_13= 0;
        if (mod6_p5_4_ck14.isChecked()) C6_P5_4_14 = 1;else C6_P5_4_14= 0;
        if (mod6_p5_4_ck15.isChecked()) C6_P5_4_15 = 1;else C6_P5_4_15= 0;
        if (mod6_p5_4_ck16.isChecked()) C6_P5_4_16 = 1;else C6_P5_4_16= 0;
        if (mod6_p5_4_ck17.isChecked()) C6_P5_4_17 = 1;else C6_P5_4_17= 0;
        if (mod6_p5_4_ck18.isChecked()) C6_P5_4_18 = 1;else C6_P5_4_18= 0;
        if (mod6_p5_4_ck19.isChecked()) C6_P5_4_19 = 1;else C6_P5_4_19= 0;
        C6_P5_4_19_0 = mod6_p5_4_edt19.getText().toString();
        if (mod6_p5_4_ck20.isChecked()) C6_P5_4_20 = 1;else C6_P5_4_20= 0;

        if (mod6_p5_5_ck1.isChecked()) C6_P5_5_1 = 1; else C6_P5_5_1= 0;
        if (mod6_p5_5_ck2.isChecked()) C6_P5_5_2 = 1;else C6_P5_5_2= 0;
        if (mod6_p5_5_ck3.isChecked()) C6_P5_5_3 = 1;else C6_P5_5_3= 0;
        if (mod6_p5_5_ck4.isChecked()) C6_P5_5_4 = 1;else C6_P5_5_4= 0;
        if (mod6_p5_5_ck5.isChecked()) C6_P5_5_5 = 1;else C6_P5_5_5= 0;
        if (mod6_p5_5_ck6.isChecked()) C6_P5_5_6 = 1;else C6_P5_5_6= 0;
        if (mod6_p5_5_ck7.isChecked()) C6_P5_5_7 = 1;else C6_P5_5_7= 0;
        if (mod6_p5_5_ck8.isChecked()) C6_P5_5_8 = 1;else C6_P5_5_8= 0;
        if (mod6_p5_5_ck9.isChecked()) C6_P5_5_9 = 1;else C6_P5_5_9= 0;
        if (mod6_p5_5_ck10.isChecked()) C6_P5_5_10 = 1;else C6_P5_5_10= 0;
        if (mod6_p5_5_ck11.isChecked()) C6_P5_5_11 = 1;else C6_P5_5_11= 0;
        if (mod6_p5_5_ck12.isChecked()) C6_P5_5_12 = 1;else C6_P5_5_12= 0;
        if (mod6_p5_5_ck13.isChecked()) C6_P5_5_13 = 1;else C6_P5_5_13= 0;
        if (mod6_p5_5_ck14.isChecked()) C6_P5_5_14 = 1;else C6_P5_5_14= 0;
        if (mod6_p5_5_ck15.isChecked()) C6_P5_5_15 = 1;else C6_P5_5_15= 0;
        if (mod6_p5_5_ck16.isChecked()) C6_P5_5_16 = 1;else C6_P5_5_16= 0;
        if (mod6_p5_5_ck17.isChecked()) C6_P5_5_17 = 1;else C6_P5_5_17= 0;
        if (mod6_p5_5_ck18.isChecked()) C6_P5_5_18 = 1;else C6_P5_5_18= 0;
        if (mod6_p5_5_ck19.isChecked()) C6_P5_5_19 = 1;else C6_P5_5_19= 0;
        C6_P5_5_19_0 = mod6_p5_5_edt19.getText().toString();
        if (mod6_p5_5_ck20.isChecked()) C6_P5_5_20 = 1;else C6_P5_5_20= 0;

        if (mod6_p5_6_ck1.isChecked()) C6_P5_6_1 = 1;else C6_P5_6_1= 0;
        if (mod6_p5_6_ck2.isChecked()) C6_P5_6_2 = 1;else C6_P5_6_2= 0;
        if (mod6_p5_6_ck3.isChecked()) C6_P5_6_3 = 1;else C6_P5_6_3= 0;
        if (mod6_p5_6_ck4.isChecked()) C6_P5_6_4 = 1;else C6_P5_6_4= 0;
        if (mod6_p5_6_ck5.isChecked()) C6_P5_6_5 = 1;else C6_P5_6_5= 0;
        if (mod6_p5_6_ck6.isChecked()) C6_P5_6_6 = 1;else C6_P5_6_6= 0;
        if (mod6_p5_6_ck7.isChecked()) C6_P5_6_7 = 1;else C6_P5_6_7= 0;
        if (mod6_p5_6_ck8.isChecked()) C6_P5_6_8 = 1;else C6_P5_6_8= 0;
        if (mod6_p5_6_ck9.isChecked()) C6_P5_6_9 = 1;else C6_P5_6_9= 0;
        if (mod6_p5_6_ck10.isChecked()) C6_P5_6_10 = 1;else C6_P5_6_10= 0;
        if (mod6_p5_6_ck11.isChecked()) C6_P5_6_11 = 1;else C6_P5_6_11= 0;
        if (mod6_p5_6_ck12.isChecked()) C6_P5_6_12 = 1;else C6_P5_6_12= 0;
        if (mod6_p5_6_ck13.isChecked()) C6_P5_6_13 = 1;else C6_P5_6_13= 0;
        if (mod6_p5_6_ck14.isChecked()) C6_P5_6_14 = 1;else C6_P5_6_14= 0;
        if (mod6_p5_6_ck15.isChecked()) C6_P5_6_15 = 1;else C6_P5_6_15= 0;
        if (mod6_p5_6_ck16.isChecked()) C6_P5_6_16 = 1;else C6_P5_6_16= 0;
        if (mod6_p5_6_ck17.isChecked()) C6_P5_6_17 = 1;else C6_P5_6_17= 0;
        if (mod6_p5_6_ck18.isChecked()) C6_P5_6_18 = 1;else C6_P5_6_18= 0;
        if (mod6_p5_6_ck19.isChecked()) C6_P5_6_19 = 1;else C6_P5_6_19= 0;
        C6_P5_6_19_0 = mod6_p5_6_edt19.getText().toString();
        if (mod6_p5_6_ck20.isChecked()) C6_P5_6_20 = 1;else C6_P5_6_20= 0;

        if (mod6_p5_7_ck1.isChecked()) C6_P5_7_1 = 1;else C6_P5_7_1= 0;
        if (mod6_p5_7_ck2.isChecked()) C6_P5_7_2 = 1;else C6_P5_7_2= 0;
        if (mod6_p5_7_ck3.isChecked()) C6_P5_7_3 = 1;else C6_P5_7_3= 0;
        if (mod6_p5_7_ck4.isChecked()) C6_P5_7_4 = 1;else C6_P5_7_4= 0;
        if (mod6_p5_7_ck5.isChecked()) C6_P5_7_5 = 1;else C6_P5_7_5= 0;
        if (mod6_p5_7_ck6.isChecked()) C6_P5_7_6 = 1;else C6_P5_7_6= 0;
        if (mod6_p5_7_ck7.isChecked()) C6_P5_7_7 = 1;else C6_P5_7_7= 0;
        if (mod6_p5_7_ck8.isChecked()) C6_P5_7_8 = 1;else C6_P5_7_8= 0;
        if (mod6_p5_7_ck9.isChecked()) C6_P5_7_9 = 1;else C6_P5_7_9= 0;
        if (mod6_p5_7_ck10.isChecked()) C6_P5_7_10 = 1;else C6_P5_7_10= 0;
        if (mod6_p5_7_ck11.isChecked()) C6_P5_7_11 = 1;else C6_P5_7_11= 0;
        if (mod6_p5_7_ck12.isChecked()) C6_P5_7_12 = 1;else C6_P5_7_12= 0;
        if (mod6_p5_7_ck13.isChecked()) C6_P5_7_13 = 1;else C6_P5_7_13= 0;
        if (mod6_p5_7_ck14.isChecked()) C6_P5_7_14 = 1;else C6_P5_7_14= 0;
        if (mod6_p5_7_ck15.isChecked()) C6_P5_7_15 = 1;else C6_P5_7_15= 0;
        if (mod6_p5_7_ck16.isChecked()) C6_P5_7_16 = 1;else C6_P5_7_16= 0;
        if (mod6_p5_7_ck17.isChecked()) C6_P5_7_17 = 1;else C6_P5_7_17= 0;
        if (mod6_p5_7_ck18.isChecked()) C6_P5_7_18 = 1;else C6_P5_7_18= 0;
        if (mod6_p5_7_ck19.isChecked()) C6_P5_7_19 = 1;else C6_P5_7_19= 0;
        C6_P5_7_19_0 = mod6_p5_7_edt19.getText().toString();
        if (mod6_p5_7_ck20.isChecked()) C6_P5_7_20 = 1;else C6_P5_7_20= 0;

        if (mod6_p5_8_ck1.isChecked()) C6_P5_8_1 = 1;else C6_P5_8_1= 0;
        if (mod6_p5_8_ck2.isChecked()) C6_P5_8_2 = 1;else C6_P5_8_2= 0;
        if (mod6_p5_8_ck3.isChecked()) C6_P5_8_3 = 1;else C6_P5_8_3= 0;
        if (mod6_p5_8_ck4.isChecked()) C6_P5_8_4 = 1;else C6_P5_8_4= 0;
        if (mod6_p5_8_ck5.isChecked()) C6_P5_8_5 = 1;else C6_P5_8_5= 0;
        if (mod6_p5_8_ck6.isChecked()) C6_P5_8_6 = 1;else C6_P5_8_6= 0;
        if (mod6_p5_8_ck7.isChecked()) C6_P5_8_7 = 1;else C6_P5_8_7= 0;
        if (mod6_p5_8_ck8.isChecked()) C6_P5_8_8 = 1;else C6_P5_8_8= 0;
        if (mod6_p5_8_ck9.isChecked()) C6_P5_8_9 = 1;else C6_P5_8_9= 0;
        if (mod6_p5_8_ck10.isChecked()) C6_P5_8_10 = 1;else C6_P5_8_10= 0;
        if (mod6_p5_8_ck11.isChecked()) C6_P5_8_11 = 1;else C6_P5_8_11= 0;
        if (mod6_p5_8_ck12.isChecked()) C6_P5_8_12 = 1;else C6_P5_8_12= 0;
        if (mod6_p5_8_ck13.isChecked()) C6_P5_8_13 = 1;else C6_P5_8_13= 0;
        if (mod6_p5_8_ck14.isChecked()) C6_P5_8_14 = 1;else C6_P5_8_14= 0;
        if (mod6_p5_8_ck15.isChecked()) C6_P5_8_15 = 1;else C6_P5_8_15= 0;
        if (mod6_p5_8_ck16.isChecked()) C6_P5_8_16 = 1;else C6_P5_8_16= 0;
        if (mod6_p5_8_ck17.isChecked()) C6_P5_8_17 = 1;else C6_P5_8_17= 0;
        if (mod6_p5_8_ck18.isChecked()) C6_P5_8_18 = 1;else C6_P5_8_18= 0;
        if (mod6_p5_8_ck19.isChecked()) C6_P5_8_19 = 1;else C6_P5_8_19= 0;
        C6_P5_8_19_0 = mod6_p5_8_edt19.getText().toString();
        if (mod6_p5_8_ck20.isChecked()) C6_P5_8_20 = 1;else C6_P5_8_20= 0;

        if (mod6_p5_9_ck1.isChecked()) C6_P5_9_1 = 1;else C6_P5_9_1= 0;
        if (mod6_p5_9_ck2.isChecked()) C6_P5_9_2 = 1;else C6_P5_9_2= 0;
        if (mod6_p5_9_ck3.isChecked()) C6_P5_9_3 = 1;else C6_P5_9_3= 0;
        if (mod6_p5_9_ck4.isChecked()) C6_P5_9_4 = 1;else C6_P5_9_4= 0;
        if (mod6_p5_9_ck5.isChecked()) C6_P5_9_5 = 1;else C6_P5_9_5= 0;
        if (mod6_p5_9_ck6.isChecked()) C6_P5_9_6 = 1;else C6_P5_9_6= 0;
        if (mod6_p5_9_ck7.isChecked()) C6_P5_9_7 = 1;else C6_P5_9_7= 0;
        if (mod6_p5_9_ck8.isChecked()) C6_P5_9_8 = 1;else C6_P5_9_8= 0;
        if (mod6_p5_9_ck9.isChecked()) C6_P5_9_9 = 1;else C6_P5_9_9= 0;
        if (mod6_p5_9_ck10.isChecked()) C6_P5_9_10 = 1;else C6_P5_9_10= 0;
        if (mod6_p5_9_ck11.isChecked()) C6_P5_9_11 = 1;else C6_P5_9_11= 0;
        if (mod6_p5_9_ck12.isChecked()) C6_P5_9_12 = 1;else C6_P5_9_12= 0;
        if (mod6_p5_9_ck13.isChecked()) C6_P5_9_13 = 1;else C6_P5_9_13= 0;
        if (mod6_p5_9_ck14.isChecked()) C6_P5_9_14 = 1;else C6_P5_9_14= 0;
        if (mod6_p5_9_ck15.isChecked()) C6_P5_9_15 = 1;else C6_P5_9_15= 0;
        if (mod6_p5_9_ck16.isChecked()) C6_P5_9_16 = 1;else C6_P5_9_16= 0;
        if (mod6_p5_9_ck17.isChecked()) C6_P5_9_17 = 1;else C6_P5_9_17= 0;
        if (mod6_p5_9_ck18.isChecked()) C6_P5_9_18 = 1;else C6_P5_9_18= 0;
        if (mod6_p5_9_ck19.isChecked()) C6_P5_9_19 = 1;else C6_P5_9_19= 0;
        C6_P5_9_19_0 = mod6_p5_9_edt19.getText().toString();
        if (mod6_p5_9_ck20.isChecked()) C6_P5_9_20 = 1;else C6_P5_9_20= 0;
    }

    public void guardarDatos() {
        data = new Data(context);
        data.open();
        if (data.existeModulo6(idempresa)) {
            ContentValues contentValues = new ContentValues(478);
            contentValues.put(SQLConstantes.MODULO6_P5_1_1,C6_P5_1_1+ "");
            contentValues.put(SQLConstantes.MODULO6_P5_1_2,C6_P5_1_2+ "");
            contentValues.put(SQLConstantes.MODULO6_P5_1_3,C6_P5_1_3+ "");
            contentValues.put(SQLConstantes.MODULO6_P5_1_4,C6_P5_1_4+ "");
            contentValues.put(SQLConstantes.MODULO6_P5_1_5,C6_P5_1_5+ "");
            contentValues.put(SQLConstantes.MODULO6_P5_1_6,C6_P5_1_6+"");
            contentValues.put(SQLConstantes.MODULO6_P5_1_7,C6_P5_1_7+"");
            contentValues.put(SQLConstantes.MODULO6_P5_1_8,C6_P5_1_8+"");
            contentValues.put(SQLConstantes.MODULO6_P5_1_9,C6_P5_1_9+"");
            contentValues.put(SQLConstantes.MODULO6_P5_1_10,C6_P5_1_10+"");
            contentValues.put(SQLConstantes.MODULO6_P5_1_11,C6_P5_1_11+"");
            contentValues.put(SQLConstantes.MODULO6_P5_1_12,C6_P5_1_12+"");
            contentValues.put(SQLConstantes.MODULO6_P5_1_13,C6_P5_1_13+"");
            contentValues.put(SQLConstantes.MODULO6_P5_1_14,C6_P5_1_14+"");
            contentValues.put(SQLConstantes.MODULO6_P5_1_15,C6_P5_1_15+"");
            contentValues.put(SQLConstantes.MODULO6_P5_1_16,C6_P5_1_16+"");
            contentValues.put(SQLConstantes.MODULO6_P5_1_17,C6_P5_1_17+"");
            contentValues.put(SQLConstantes.MODULO6_P5_1_18,C6_P5_1_18+"");
            contentValues.put(SQLConstantes.MODULO6_P5_1_19,C6_P5_1_19+"");
            contentValues.put(SQLConstantes.MODULO6_P5_1_19_0,C6_P5_1_19_0);
            contentValues.put(SQLConstantes.MODULO6_P5_1_20,C6_P5_1_20+"");
            contentValues.put(SQLConstantes.MODULO6_P5_2_1,C6_P5_2_1+"");
            contentValues.put(SQLConstantes.MODULO6_P5_2_2,C6_P5_2_2+"");
            contentValues.put(SQLConstantes.MODULO6_P5_2_3,C6_P5_2_3+"");
            contentValues.put(SQLConstantes.MODULO6_P5_2_4,C6_P5_2_4+"");
            contentValues.put(SQLConstantes.MODULO6_P5_2_5,C6_P5_2_5+"");
            contentValues.put(SQLConstantes.MODULO6_P5_2_6,C6_P5_2_6+"");
            contentValues.put(SQLConstantes.MODULO6_P5_2_7,C6_P5_2_7+"");
            contentValues.put(SQLConstantes.MODULO6_P5_2_8,C6_P5_2_8+"");
            contentValues.put(SQLConstantes.MODULO6_P5_2_9,C6_P5_2_9+"");
            contentValues.put(SQLConstantes.MODULO6_P5_2_10,C6_P5_2_10+"");
            contentValues.put(SQLConstantes.MODULO6_P5_2_11,C6_P5_2_11+"");
            contentValues.put(SQLConstantes.MODULO6_P5_2_12,C6_P5_2_12+"");
            contentValues.put(SQLConstantes.MODULO6_P5_2_13,C6_P5_2_13+"");
            contentValues.put(SQLConstantes.MODULO6_P5_2_14,C6_P5_2_14+"");
            contentValues.put(SQLConstantes.MODULO6_P5_2_15,C6_P5_2_15+"");
            contentValues.put(SQLConstantes.MODULO6_P5_2_16,C6_P5_2_16+"");
            contentValues.put(SQLConstantes.MODULO6_P5_2_17,C6_P5_2_17+"");
            contentValues.put(SQLConstantes.MODULO6_P5_2_18,C6_P5_2_18+"");
            contentValues.put(SQLConstantes.MODULO6_P5_2_19,C6_P5_2_19+"");
            contentValues.put(SQLConstantes.MODULO6_P5_2_19_0,C6_P5_2_19_0);
            contentValues.put(SQLConstantes.MODULO6_P5_2_20,C6_P5_2_20+"");
            contentValues.put(SQLConstantes.MODULO6_P5_3_1,C6_P5_3_1+"");
            contentValues.put(SQLConstantes.MODULO6_P5_3_2,C6_P5_3_2+"");
            contentValues.put(SQLConstantes.MODULO6_P5_3_3,C6_P5_3_3+"");
            contentValues.put(SQLConstantes.MODULO6_P5_3_4,C6_P5_3_4+"");
            contentValues.put(SQLConstantes.MODULO6_P5_3_5,C6_P5_3_5+"");
            contentValues.put(SQLConstantes.MODULO6_P5_3_6,C6_P5_3_6+"");
            contentValues.put(SQLConstantes.MODULO6_P5_3_7,C6_P5_3_7+"");
            contentValues.put(SQLConstantes.MODULO6_P5_3_8,C6_P5_3_8+"");
            contentValues.put(SQLConstantes.MODULO6_P5_3_9,C6_P5_3_9+"");
            contentValues.put(SQLConstantes.MODULO6_P5_3_10,C6_P5_3_10+"");
            contentValues.put(SQLConstantes.MODULO6_P5_3_11,C6_P5_3_11+"");
            contentValues.put(SQLConstantes.MODULO6_P5_3_12,C6_P5_3_12+"");
            contentValues.put(SQLConstantes.MODULO6_P5_3_13,C6_P5_3_13+"");
            contentValues.put(SQLConstantes.MODULO6_P5_3_14,C6_P5_3_14+"");
            contentValues.put(SQLConstantes.MODULO6_P5_3_15,C6_P5_3_15+"");
            contentValues.put(SQLConstantes.MODULO6_P5_3_16,C6_P5_3_16+"");
            contentValues.put(SQLConstantes.MODULO6_P5_3_17,C6_P5_3_17+"");
            contentValues.put(SQLConstantes.MODULO6_P5_3_18,C6_P5_3_18+"");
            contentValues.put(SQLConstantes.MODULO6_P5_3_19,C6_P5_3_19+"");
            contentValues.put(SQLConstantes.MODULO6_P5_3_19_0,C6_P5_3_19_0);
            contentValues.put(SQLConstantes.MODULO6_P5_3_20,C6_P5_3_20+"");
            contentValues.put(SQLConstantes.MODULO6_P5_4_1,C6_P5_4_1+"");
            contentValues.put(SQLConstantes.MODULO6_P5_4_2,C6_P5_4_2+"");
            contentValues.put(SQLConstantes.MODULO6_P5_4_3,C6_P5_4_3+"");
            contentValues.put(SQLConstantes.MODULO6_P5_4_4,C6_P5_4_4+"");
            contentValues.put(SQLConstantes.MODULO6_P5_4_5,C6_P5_4_5+"");
            contentValues.put(SQLConstantes.MODULO6_P5_4_6,C6_P5_4_6+"");
            contentValues.put(SQLConstantes.MODULO6_P5_4_7,C6_P5_4_7+"");
            contentValues.put(SQLConstantes.MODULO6_P5_4_8,C6_P5_4_8+"");
            contentValues.put(SQLConstantes.MODULO6_P5_4_9,C6_P5_4_9+"");
            contentValues.put(SQLConstantes.MODULO6_P5_4_10,C6_P5_4_10+"");
            contentValues.put(SQLConstantes.MODULO6_P5_4_11,C6_P5_4_11+"");
            contentValues.put(SQLConstantes.MODULO6_P5_4_12,C6_P5_4_12+"");
            contentValues.put(SQLConstantes.MODULO6_P5_4_13,C6_P5_4_13+"");
            contentValues.put(SQLConstantes.MODULO6_P5_4_14,C6_P5_4_14+"");
            contentValues.put(SQLConstantes.MODULO6_P5_4_15,C6_P5_4_15+"");
            contentValues.put(SQLConstantes.MODULO6_P5_4_16,C6_P5_4_16+"");
            contentValues.put(SQLConstantes.MODULO6_P5_4_17,C6_P5_4_17+"");
            contentValues.put(SQLConstantes.MODULO6_P5_4_18,C6_P5_4_18+"");
            contentValues.put(SQLConstantes.MODULO6_P5_4_19,C6_P5_4_19+"");
            contentValues.put(SQLConstantes.MODULO6_P5_4_19_0,C6_P5_4_19_0);
            contentValues.put(SQLConstantes.MODULO6_P5_4_20,C6_P5_4_20+"");
            contentValues.put(SQLConstantes.MODULO6_P5_5_1,C6_P5_5_1+"");
            contentValues.put(SQLConstantes.MODULO6_P5_5_2,C6_P5_5_2+"");
            contentValues.put(SQLConstantes.MODULO6_P5_5_3,C6_P5_5_3+"");
            contentValues.put(SQLConstantes.MODULO6_P5_5_4,C6_P5_5_4+"");
            contentValues.put(SQLConstantes.MODULO6_P5_5_5,C6_P5_5_5+"");
            contentValues.put(SQLConstantes.MODULO6_P5_5_6,C6_P5_5_6+"");
            contentValues.put(SQLConstantes.MODULO6_P5_5_7,C6_P5_5_7+"");
            contentValues.put(SQLConstantes.MODULO6_P5_5_8,C6_P5_5_8+"");
            contentValues.put(SQLConstantes.MODULO6_P5_5_9,C6_P5_5_9+"");
            contentValues.put(SQLConstantes.MODULO6_P5_5_10,C6_P5_5_10+"");
            contentValues.put(SQLConstantes.MODULO6_P5_5_11,C6_P5_5_11+"");
            contentValues.put(SQLConstantes.MODULO6_P5_5_12,C6_P5_5_12+"");
            contentValues.put(SQLConstantes.MODULO6_P5_5_13,C6_P5_5_13+"");
            contentValues.put(SQLConstantes.MODULO6_P5_5_14,C6_P5_5_14+"");
            contentValues.put(SQLConstantes.MODULO6_P5_5_15,C6_P5_5_15+"");
            contentValues.put(SQLConstantes.MODULO6_P5_5_16,C6_P5_5_16+"");
            contentValues.put(SQLConstantes.MODULO6_P5_5_17,C6_P5_5_17+"");
            contentValues.put(SQLConstantes.MODULO6_P5_5_18,C6_P5_5_18+"");
            contentValues.put(SQLConstantes.MODULO6_P5_5_19,C6_P5_5_19+"");
            contentValues.put(SQLConstantes.MODULO6_P5_5_19_0,C6_P5_5_19_0);
            contentValues.put(SQLConstantes.MODULO6_P5_5_20,C6_P5_5_20+"");
            contentValues.put(SQLConstantes.MODULO6_P5_6_1,C6_P5_6_1+"");
            contentValues.put(SQLConstantes.MODULO6_P5_6_2,C6_P5_6_2+"");
            contentValues.put(SQLConstantes.MODULO6_P5_6_3,C6_P5_6_3+"");
            contentValues.put(SQLConstantes.MODULO6_P5_6_4,C6_P5_6_4+"");
            contentValues.put(SQLConstantes.MODULO6_P5_6_5,C6_P5_6_5+"");
            contentValues.put(SQLConstantes.MODULO6_P5_6_6,C6_P5_6_6+"");
            contentValues.put(SQLConstantes.MODULO6_P5_6_7,C6_P5_6_7+"");
            contentValues.put(SQLConstantes.MODULO6_P5_6_8,C6_P5_6_8+"");
            contentValues.put(SQLConstantes.MODULO6_P5_6_9,C6_P5_6_9+"");
            contentValues.put(SQLConstantes.MODULO6_P5_6_10,C6_P5_6_10+"");
            contentValues.put(SQLConstantes.MODULO6_P5_6_11,C6_P5_6_11+"");
            contentValues.put(SQLConstantes.MODULO6_P5_6_12,C6_P5_6_12+"");
            contentValues.put(SQLConstantes.MODULO6_P5_6_13,C6_P5_6_13+"");
            contentValues.put(SQLConstantes.MODULO6_P5_6_14,C6_P5_6_14+"");
            contentValues.put(SQLConstantes.MODULO6_P5_6_15,C6_P5_6_15+"");
            contentValues.put(SQLConstantes.MODULO6_P5_6_16,C6_P5_6_16+"");
            contentValues.put(SQLConstantes.MODULO6_P5_6_17,C6_P5_6_17+"");
            contentValues.put(SQLConstantes.MODULO6_P5_6_18,C6_P5_6_18+"");
            contentValues.put(SQLConstantes.MODULO6_P5_6_19,C6_P5_6_19+"");
            contentValues.put(SQLConstantes.MODULO6_P5_6_19_0,C6_P5_6_19_0);
            contentValues.put(SQLConstantes.MODULO6_P5_6_20,C6_P5_6_20+"");
            contentValues.put(SQLConstantes.MODULO6_P5_7_1,C6_P5_7_1+"");
            contentValues.put(SQLConstantes.MODULO6_P5_7_2,C6_P5_7_2+"");
            contentValues.put(SQLConstantes.MODULO6_P5_7_3,C6_P5_7_3+"");
            contentValues.put(SQLConstantes.MODULO6_P5_7_4,C6_P5_7_4+"");
            contentValues.put(SQLConstantes.MODULO6_P5_7_5,C6_P5_7_5+"");
            contentValues.put(SQLConstantes.MODULO6_P5_7_6,C6_P5_7_6+"");
            contentValues.put(SQLConstantes.MODULO6_P5_7_7,C6_P5_7_7+"");
            contentValues.put(SQLConstantes.MODULO6_P5_7_8,C6_P5_7_8+"");
            contentValues.put(SQLConstantes.MODULO6_P5_7_9,C6_P5_7_9+"");
            contentValues.put(SQLConstantes.MODULO6_P5_7_10,C6_P5_7_10+"");
            contentValues.put(SQLConstantes.MODULO6_P5_7_11,C6_P5_7_11+"");
            contentValues.put(SQLConstantes.MODULO6_P5_7_12,C6_P5_7_12+"");
            contentValues.put(SQLConstantes.MODULO6_P5_7_13,C6_P5_7_13+"");
            contentValues.put(SQLConstantes.MODULO6_P5_7_14,C6_P5_7_14+"");
            contentValues.put(SQLConstantes.MODULO6_P5_7_15,C6_P5_7_15+"");
            contentValues.put(SQLConstantes.MODULO6_P5_7_16,C6_P5_7_16+"");
            contentValues.put(SQLConstantes.MODULO6_P5_7_17,C6_P5_7_17+"");
            contentValues.put(SQLConstantes.MODULO6_P5_7_18,C6_P5_7_18+"");
            contentValues.put(SQLConstantes.MODULO6_P5_7_19,C6_P5_7_19+"");
            contentValues.put(SQLConstantes.MODULO6_P5_7_19_0,C6_P5_7_19_0);
            contentValues.put(SQLConstantes.MODULO6_P5_7_20,C6_P5_7_20+"");
            contentValues.put(SQLConstantes.MODULO6_P5_8_1,C6_P5_8_1+"");
            contentValues.put(SQLConstantes.MODULO6_P5_8_2,C6_P5_8_2+"");
            contentValues.put(SQLConstantes.MODULO6_P5_8_3,C6_P5_8_3+"");
            contentValues.put(SQLConstantes.MODULO6_P5_8_4,C6_P5_8_4+"");
            contentValues.put(SQLConstantes.MODULO6_P5_8_5,C6_P5_8_5+"");
            contentValues.put(SQLConstantes.MODULO6_P5_8_6,C6_P5_8_6+"");
            contentValues.put(SQLConstantes.MODULO6_P5_8_7,C6_P5_8_7+"");
            contentValues.put(SQLConstantes.MODULO6_P5_8_8,C6_P5_8_8+"");
            contentValues.put(SQLConstantes.MODULO6_P5_8_9,C6_P5_8_9+"");
            contentValues.put(SQLConstantes.MODULO6_P5_8_10,C6_P5_8_10+"");
            contentValues.put(SQLConstantes.MODULO6_P5_8_11,C6_P5_8_11+"");
            contentValues.put(SQLConstantes.MODULO6_P5_8_12,C6_P5_8_12+"");
            contentValues.put(SQLConstantes.MODULO6_P5_8_13,C6_P5_8_13+"");
            contentValues.put(SQLConstantes.MODULO6_P5_8_14,C6_P5_8_14+"");
            contentValues.put(SQLConstantes.MODULO6_P5_8_15,C6_P5_8_15+"");
            contentValues.put(SQLConstantes.MODULO6_P5_8_16,C6_P5_8_16+"");
            contentValues.put(SQLConstantes.MODULO6_P5_8_17,C6_P5_8_17+"");
            contentValues.put(SQLConstantes.MODULO6_P5_8_18,C6_P5_8_18+"");
            contentValues.put(SQLConstantes.MODULO6_P5_8_19,C6_P5_8_19+"");
            contentValues.put(SQLConstantes.MODULO6_P5_8_19_0,C6_P5_8_19_0);
            contentValues.put(SQLConstantes.MODULO6_P5_8_20,C6_P5_8_20+"");
            contentValues.put(SQLConstantes.MODULO6_P5_9_1,C6_P5_9_1+"");
            contentValues.put(SQLConstantes.MODULO6_P5_9_2,C6_P5_9_2+"");
            contentValues.put(SQLConstantes.MODULO6_P5_9_3,C6_P5_9_3+"");
            contentValues.put(SQLConstantes.MODULO6_P5_9_4,C6_P5_9_4+"");
            contentValues.put(SQLConstantes.MODULO6_P5_9_5,C6_P5_9_5+"");
            contentValues.put(SQLConstantes.MODULO6_P5_9_6,C6_P5_9_6+"");
            contentValues.put(SQLConstantes.MODULO6_P5_9_7,C6_P5_9_7+"");
            contentValues.put(SQLConstantes.MODULO6_P5_9_8,C6_P5_9_8+"");
            contentValues.put(SQLConstantes.MODULO6_P5_9_9,C6_P5_9_9+"");
            contentValues.put(SQLConstantes.MODULO6_P5_9_10,C6_P5_9_10+"");
            contentValues.put(SQLConstantes.MODULO6_P5_9_11,C6_P5_9_11+"");
            contentValues.put(SQLConstantes.MODULO6_P5_9_12,C6_P5_9_12+"");
            contentValues.put(SQLConstantes.MODULO6_P5_9_13,C6_P5_9_13+"");
            contentValues.put(SQLConstantes.MODULO6_P5_9_14,C6_P5_9_14+"");
            contentValues.put(SQLConstantes.MODULO6_P5_9_15,C6_P5_9_15+"");
            contentValues.put(SQLConstantes.MODULO6_P5_9_16,C6_P5_9_16+"");
            contentValues.put(SQLConstantes.MODULO6_P5_9_17,C6_P5_9_17+"");
            contentValues.put(SQLConstantes.MODULO6_P5_9_18,C6_P5_9_18+"");
            contentValues.put(SQLConstantes.MODULO6_P5_9_19,C6_P5_9_19+"");
            contentValues.put(SQLConstantes.MODULO6_P5_9_19_0,C6_P5_9_19_0);
            contentValues.put(SQLConstantes.MODULO6_P5_9_20,C6_P5_9_20+"");
            data.actualizarModulo6(idempresa, contentValues);
        } else {
            //si no existe el elemento, lo construye para insertarlo
            modulo6 = new Modulo6();
            //llena el objeto a insertar
            modulo6.setMODULO6_ID(idempresa);
            modulo6.setC6_P5_1_1(C6_P5_1_1 + "");
            modulo6.setC6_P5_1_2(C6_P5_1_2 + "");
            modulo6.setC6_P5_1_3(C6_P5_1_3 + "");
            modulo6.setC6_P5_1_4(C6_P5_1_4 + "");
            modulo6.setC6_P5_1_5(C6_P5_1_5 + "");
            modulo6.setC6_P5_1_6(C6_P5_1_6 + "");
            modulo6.setC6_P5_1_7(C6_P5_1_7 + "");
            modulo6.setC6_P5_1_8(C6_P5_1_8 + "");
            modulo6.setC6_P5_1_9(C6_P5_1_9 + "");
            modulo6.setC6_P5_1_10(C6_P5_1_10 + "");
            modulo6.setC6_P5_1_11(C6_P5_1_11 + "");
            modulo6.setC6_P5_1_12(C6_P5_1_12 + "");
            modulo6.setC6_P5_1_13(C6_P5_1_13 + "");
            modulo6.setC6_P5_1_14(C6_P5_1_14 + "");
            modulo6.setC6_P5_1_15(C6_P5_1_15 + "");
            modulo6.setC6_P5_1_16(C6_P5_1_16 + "");
            modulo6.setC6_P5_1_17(C6_P5_1_17 + "");
            modulo6.setC6_P5_1_18(C6_P5_1_18 + "");
            modulo6.setC6_P5_1_19(C6_P5_1_19 + "");
            modulo6.setC6_P5_1_19_0(C6_P5_1_19_0);
            modulo6.setC6_P5_1_20(C6_P5_1_20 + "");
            modulo6.setC6_P5_2_1(C6_P5_2_1 + "");
            modulo6.setC6_P5_2_2(C6_P5_2_2 + "");
            modulo6.setC6_P5_2_3(C6_P5_2_3 + "");
            modulo6.setC6_P5_2_4(C6_P5_2_4 + "");
            modulo6.setC6_P5_2_5(C6_P5_2_5 + "");
            modulo6.setC6_P5_2_6(C6_P5_2_6 + "");
            modulo6.setC6_P5_2_7(C6_P5_2_7 + "");
            modulo6.setC6_P5_2_8(C6_P5_2_8 + "");
            modulo6.setC6_P5_2_9(C6_P5_2_9 + "");
            modulo6.setC6_P5_2_10(C6_P5_2_10 + "");
            modulo6.setC6_P5_2_11(C6_P5_2_11 + "");
            modulo6.setC6_P5_2_12(C6_P5_2_12 + "");
            modulo6.setC6_P5_2_13(C6_P5_2_13 + "");
            modulo6.setC6_P5_2_14(C6_P5_2_14 + "");
            modulo6.setC6_P5_2_15(C6_P5_2_15 + "");
            modulo6.setC6_P5_2_16(C6_P5_2_16 + "");
            modulo6.setC6_P5_2_17(C6_P5_2_17 + "");
            modulo6.setC6_P5_2_18(C6_P5_2_18 + "");
            modulo6.setC6_P5_2_19(C6_P5_2_19 + "");
            modulo6.setC6_P5_2_19_0(C6_P5_2_19_0);
            modulo6.setC6_P5_2_20(C6_P5_2_20 + "");
            modulo6.setC6_P5_3_1(C6_P5_3_1 + "");
            modulo6.setC6_P5_3_2(C6_P5_3_2 + "");
            modulo6.setC6_P5_3_3(C6_P5_3_3 + "");
            modulo6.setC6_P5_3_4(C6_P5_3_4 + "");
            modulo6.setC6_P5_3_5(C6_P5_3_5 + "");
            modulo6.setC6_P5_3_6(C6_P5_3_6 + "");
            modulo6.setC6_P5_3_7(C6_P5_3_7 + "");
            modulo6.setC6_P5_3_8(C6_P5_3_8 + "");
            modulo6.setC6_P5_3_9(C6_P5_3_9 + "");
            modulo6.setC6_P5_3_10(C6_P5_3_10 + "");
            modulo6.setC6_P5_3_11(C6_P5_3_11 + "");
            modulo6.setC6_P5_3_12(C6_P5_3_12 + "");
            modulo6.setC6_P5_3_13(C6_P5_3_13 + "");
            modulo6.setC6_P5_3_14(C6_P5_3_14 + "");
            modulo6.setC6_P5_3_15(C6_P5_3_15 + "");
            modulo6.setC6_P5_3_16(C6_P5_3_16 + "");
            modulo6.setC6_P5_3_17(C6_P5_3_17 + "");
            modulo6.setC6_P5_3_18(C6_P5_3_18 + "");
            modulo6.setC6_P5_3_19(C6_P5_3_19 + "");
            modulo6.setC6_P5_3_19_0(C6_P5_3_19_0);
            modulo6.setC6_P5_3_20(C6_P5_3_20 + "");
            modulo6.setC6_P5_4_1(C6_P5_4_1 + "");
            modulo6.setC6_P5_4_2(C6_P5_4_2 + "");
            modulo6.setC6_P5_4_3(C6_P5_4_3 + "");
            modulo6.setC6_P5_4_4(C6_P5_4_4 + "");
            modulo6.setC6_P5_4_5(C6_P5_4_5 + "");
            modulo6.setC6_P5_4_6(C6_P5_4_6 + "");
            modulo6.setC6_P5_4_7(C6_P5_4_7 + "");
            modulo6.setC6_P5_4_8(C6_P5_4_8 + "");
            modulo6.setC6_P5_4_9(C6_P5_4_9 + "");
            modulo6.setC6_P5_4_10(C6_P5_4_10 + "");
            modulo6.setC6_P5_4_11(C6_P5_4_11 + "");
            modulo6.setC6_P5_4_12(C6_P5_4_12 + "");
            modulo6.setC6_P5_4_13(C6_P5_4_13 + "");
            modulo6.setC6_P5_4_14(C6_P5_4_14 + "");
            modulo6.setC6_P5_4_15(C6_P5_4_15 + "");
            modulo6.setC6_P5_4_16(C6_P5_4_16 + "");
            modulo6.setC6_P5_4_17(C6_P5_4_17 + "");
            modulo6.setC6_P5_4_18(C6_P5_4_18 + "");
            modulo6.setC6_P5_4_19(C6_P5_4_19 + "");
            modulo6.setC6_P5_4_19_0(C6_P5_4_19_0);
            modulo6.setC6_P5_4_20(C6_P5_4_20 + "");
            modulo6.setC6_P5_5_1(C6_P5_5_1 + "");
            modulo6.setC6_P5_5_2(C6_P5_5_2 + "");
            modulo6.setC6_P5_5_3(C6_P5_5_3 + "");
            modulo6.setC6_P5_5_4(C6_P5_5_4 + "");
            modulo6.setC6_P5_5_5(C6_P5_5_5 + "");
            modulo6.setC6_P5_5_6(C6_P5_5_6 + "");
            modulo6.setC6_P5_5_7(C6_P5_5_7 + "");
            modulo6.setC6_P5_5_8(C6_P5_5_8 + "");
            modulo6.setC6_P5_5_9(C6_P5_5_9 + "");
            modulo6.setC6_P5_5_10(C6_P5_5_10 + "");
            modulo6.setC6_P5_5_11(C6_P5_5_11 + "");
            modulo6.setC6_P5_5_12(C6_P5_5_12 + "");
            modulo6.setC6_P5_5_13(C6_P5_5_13 + "");
            modulo6.setC6_P5_5_14(C6_P5_5_14 + "");
            modulo6.setC6_P5_5_15(C6_P5_5_15 + "");
            modulo6.setC6_P5_5_16(C6_P5_5_16 + "");
            modulo6.setC6_P5_5_17(C6_P5_5_17 + "");
            modulo6.setC6_P5_5_18(C6_P5_5_18 + "");
            modulo6.setC6_P5_5_19(C6_P5_5_19 + "");
            modulo6.setC6_P5_5_19_0(C6_P5_5_19_0);
            modulo6.setC6_P5_5_20(C6_P5_5_20 +"");
            modulo6.setC6_P5_6_1(C6_P5_6_1 + "");
            modulo6.setC6_P5_6_2(C6_P5_6_2 + "");
            modulo6.setC6_P5_6_3(C6_P5_6_3 + "");
            modulo6.setC6_P5_6_4(C6_P5_6_4 + "");
            modulo6.setC6_P5_6_5(C6_P5_6_5 + "");
            modulo6.setC6_P5_6_6(C6_P5_6_6 + "");
            modulo6.setC6_P5_6_7(C6_P5_6_7 + "");
            modulo6.setC6_P5_6_8(C6_P5_6_8 + "");
            modulo6.setC6_P5_6_9(C6_P5_6_9 + "");
            modulo6.setC6_P5_6_10(C6_P5_6_10 + "");
            modulo6.setC6_P5_6_11(C6_P5_6_11 + "");
            modulo6.setC6_P5_6_12(C6_P5_6_12 + "");
            modulo6.setC6_P5_6_13(C6_P5_6_13 + "");
            modulo6.setC6_P5_6_14(C6_P5_6_14 + "");
            modulo6.setC6_P5_6_15(C6_P5_6_15 + "");
            modulo6.setC6_P5_6_16(C6_P5_6_16 + "");
            modulo6.setC6_P5_6_17(C6_P5_6_17 + "");
            modulo6.setC6_P5_6_18(C6_P5_6_18 + "");
            modulo6.setC6_P5_6_19(C6_P5_6_19 + "");
            modulo6.setC6_P5_6_19_0(C6_P5_6_19_0);
            modulo6.setC6_P5_6_20(C6_P5_6_20 + "");
            modulo6.setC6_P5_7_1(C6_P5_7_1 + "");
            modulo6.setC6_P5_7_2(C6_P5_7_2 + "");
            modulo6.setC6_P5_7_3(C6_P5_7_3 + "");
            modulo6.setC6_P5_7_4(C6_P5_7_4 + "");
            modulo6.setC6_P5_7_5(C6_P5_7_5 + "");
            modulo6.setC6_P5_7_6(C6_P5_7_6 + "");
            modulo6.setC6_P5_7_7(C6_P5_7_7 + "");
            modulo6.setC6_P5_7_8(C6_P5_7_8 + "");
            modulo6.setC6_P5_7_9(C6_P5_7_9 + "");
            modulo6.setC6_P5_7_10(C6_P5_7_10 + "");
            modulo6.setC6_P5_7_11(C6_P5_7_11 + "");
            modulo6.setC6_P5_7_12(C6_P5_7_12 + "");
            modulo6.setC6_P5_7_13(C6_P5_7_13 + "");
            modulo6.setC6_P5_7_14(C6_P5_7_14 + "");
            modulo6.setC6_P5_7_15(C6_P5_7_15 + "");
            modulo6.setC6_P5_7_16(C6_P5_7_16 + "");
            modulo6.setC6_P5_7_17(C6_P5_7_17 + "");
            modulo6.setC6_P5_7_18(C6_P5_7_18 + "");
            modulo6.setC6_P5_7_19(C6_P5_7_19 + "");
            modulo6.setC6_P5_7_19_0(C6_P5_7_19_0);
            modulo6.setC6_P5_7_20(C6_P5_7_20 + "");
            modulo6.setC6_P5_8_1(C6_P5_8_1 + "");
            modulo6.setC6_P5_8_2(C6_P5_8_2 + "");
            modulo6.setC6_P5_8_3(C6_P5_8_3 + "");
            modulo6.setC6_P5_8_4(C6_P5_8_4 + "");
            modulo6.setC6_P5_8_5(C6_P5_8_5 + "");
            modulo6.setC6_P5_8_6(C6_P5_8_6 + "");
            modulo6.setC6_P5_8_7(C6_P5_8_7 + "");
            modulo6.setC6_P5_8_8(C6_P5_8_8 + "");
            modulo6.setC6_P5_8_9(C6_P5_8_9 + "");
            modulo6.setC6_P5_8_10(C6_P5_8_10 + "");
            modulo6.setC6_P5_8_11(C6_P5_8_11 + "");
            modulo6.setC6_P5_8_12(C6_P5_8_12 + "");
            modulo6.setC6_P5_8_13(C6_P5_8_13 + "");
            modulo6.setC6_P5_8_14(C6_P5_8_14 + "");
            modulo6.setC6_P5_8_15(C6_P5_8_15 + "");
            modulo6.setC6_P5_8_16(C6_P5_8_16 + "");
            modulo6.setC6_P5_8_17(C6_P5_8_17 + "");
            modulo6.setC6_P5_8_18(C6_P5_8_18 + "");
            modulo6.setC6_P5_8_19(C6_P5_8_19 + "");
            modulo6.setC6_P5_8_19_0(C6_P5_8_19_0);
            modulo6.setC6_P5_8_20(C6_P5_8_20 + "");
            modulo6.setC6_P5_9_1(C6_P5_9_1 + "");
            modulo6.setC6_P5_9_2(C6_P5_9_2 + "");
            modulo6.setC6_P5_9_3(C6_P5_9_3 + "");
            modulo6.setC6_P5_9_4(C6_P5_9_4 + "");
            modulo6.setC6_P5_9_5(C6_P5_9_5 + "");
            modulo6.setC6_P5_9_6(C6_P5_9_6 + "");
            modulo6.setC6_P5_9_7(C6_P5_9_7 + "");
            modulo6.setC6_P5_9_8(C6_P5_9_8 + "");
            modulo6.setC6_P5_9_9(C6_P5_9_9 + "");
            modulo6.setC6_P5_9_10(C6_P5_9_10 + "");
            modulo6.setC6_P5_9_11(C6_P5_9_11 + "");
            modulo6.setC6_P5_9_12(C6_P5_9_12 + "");
            modulo6.setC6_P5_9_13(C6_P5_9_13 + "");
            modulo6.setC6_P5_9_14(C6_P5_9_14 + "");
            modulo6.setC6_P5_9_15(C6_P5_9_15 + "");
            modulo6.setC6_P5_9_16(C6_P5_9_16 + "");
            modulo6.setC6_P5_9_17(C6_P5_9_17 + "");
            modulo6.setC6_P5_9_18(C6_P5_9_18 + "");
            modulo6.setC6_P5_9_19(C6_P5_9_19 + "");
            modulo6.setC6_P5_9_19_0(C6_P5_9_19_0);
            modulo6.setC6_P5_9_20(C6_P5_9_20 + "");
            Toast.makeText(context, C6_P5_1_1+"", Toast.LENGTH_SHORT).show();
            data.insertarModulo6(modulo6);
        }
        data.close();
    }





    public boolean validar(){
//        //revisarcampos
//        llenarMapaVariables();
//        boolean correcto = true;
//
//        return correcto;
        boolean valido = true;
        llenarMapaVariables();
        boolean vC6_P5_1= true ;
        boolean vC6_P5_2= true ;
        boolean vC6_P5_3= true ;
        boolean vC6_P5_4= true ;
        boolean vC6_P5_5= true ;
        boolean vC6_P5_6= true ;
        boolean vC6_P5_7= true ;
        boolean vC6_P5_8= true ;
        boolean vC6_P5_9= true ;

        Integer[] valores1={ C6_P5_1_1,C6_P5_1_2,C6_P5_1_3,C6_P5_1_4,C6_P5_1_5,C6_P5_1_6,C6_P5_1_7,C6_P5_1_8,C6_P5_1_9,C6_P5_1_10,
                C6_P5_1_11,C6_P5_1_12,C6_P5_1_13,C6_P5_1_14,C6_P5_1_15,C6_P5_1_16,C6_P5_1_17,C6_P5_1_18,C6_P5_1_19,C6_P5_1_20};
        Integer[] valores2={ C6_P5_2_1,C6_P5_2_2,C6_P5_2_3,C6_P5_2_4,C6_P5_2_5,C6_P5_2_6,C6_P5_2_7,C6_P5_2_8,C6_P5_2_9,C6_P5_2_10,
                C6_P5_2_11,C6_P5_2_12,C6_P5_2_13,C6_P5_2_14,C6_P5_2_15,C6_P5_2_16,C6_P5_2_17,C6_P5_2_18,C6_P5_2_19,C6_P5_2_20};
        Integer[] valores3={ C6_P5_3_1,C6_P5_3_2,C6_P5_3_3,C6_P5_3_4,C6_P5_3_5,C6_P5_3_6,C6_P5_3_7,C6_P5_3_8,C6_P5_3_9,C6_P5_3_10,
                C6_P5_3_11,C6_P5_3_12,C6_P5_3_13,C6_P5_3_14,C6_P5_3_15,C6_P5_3_16,C6_P5_3_17,C6_P5_3_18,C6_P5_3_19,C6_P5_3_20};
        Integer[] valores4={ C6_P5_4_1,C6_P5_4_2,C6_P5_4_3,C6_P5_4_4,C6_P5_4_5,C6_P5_4_6,C6_P5_4_7,C6_P5_4_8,C6_P5_4_9,C6_P5_4_10,
                C6_P5_4_11,C6_P5_4_12,C6_P5_4_13,C6_P5_4_14,C6_P5_4_15,C6_P5_4_16,C6_P5_4_17,C6_P5_4_18,C6_P5_4_19,C6_P5_4_20};
        Integer[] valores5={ C6_P5_5_1,C6_P5_5_2,C6_P5_5_3,C6_P5_5_4,C6_P5_5_5,C6_P5_5_6,C6_P5_5_7,C6_P5_5_8,C6_P5_5_9,C6_P5_5_10,
                C6_P5_5_11,C6_P5_5_12,C6_P5_5_13,C6_P5_5_14,C6_P5_5_15,C6_P5_5_16,C6_P5_5_17,C6_P5_5_18,C6_P5_5_19,C6_P5_5_20};
        Integer[] valores6={ C6_P5_6_1,C6_P5_6_2,C6_P5_6_3,C6_P5_6_4,C6_P5_6_5,C6_P5_6_6,C6_P5_6_7,C6_P5_6_8,C6_P5_6_9,C6_P5_6_10,
                C6_P5_6_11,C6_P5_6_12,C6_P5_6_13,C6_P5_6_14,C6_P5_6_15,C6_P5_6_16,C6_P5_6_17,C6_P5_6_18,C6_P5_6_19,C6_P5_6_20};
        Integer[] valores7={ C6_P5_7_1,C6_P5_7_2,C6_P5_7_3,C6_P5_7_4,C6_P5_7_5,C6_P5_7_6,C6_P5_7_7,C6_P5_7_8,C6_P5_7_9,C6_P5_7_10,
                C6_P5_7_11,C6_P5_7_12,C6_P5_7_13,C6_P5_7_14,C6_P5_7_15,C6_P5_7_16,C6_P5_7_17,C6_P5_7_18,C6_P5_7_19,C6_P5_7_20};
        Integer[] valores8={ C6_P5_8_1,C6_P5_8_2,C6_P5_8_3,C6_P5_8_4,C6_P5_8_5,C6_P5_8_6,C6_P5_8_7,C6_P5_8_8,C6_P5_8_9,C6_P5_8_10,
                C6_P5_8_11,C6_P5_8_12,C6_P5_8_13,C6_P5_8_14,C6_P5_8_15,C6_P5_8_16,C6_P5_8_17,C6_P5_8_18,C6_P5_8_19,C6_P5_8_20};
        Integer[] valores9={ C6_P5_9_1,C6_P5_9_2,C6_P5_9_3,C6_P5_9_4,C6_P5_9_5,C6_P5_9_6,C6_P5_9_7,C6_P5_9_8,C6_P5_9_9,C6_P5_9_10,
                C6_P5_9_11,C6_P5_9_12,C6_P5_9_13,C6_P5_9_14,C6_P5_9_15,C6_P5_9_16,C6_P5_9_17,C6_P5_9_18,C6_P5_9_19,C6_P5_9_20};

        for (Integer valor1:valores1 ) {
            if(valor1==1)vC6_P5_1=false;
        }
        for (Integer valor2:valores2 ) {
            if(valor2==1)vC6_P5_2=false;
        }
        for (Integer valor3:valores3 ) {
            if(valor3==1)vC6_P5_3=false;
        }
        for (Integer valor4:valores4 ) {
            if(valor4==1)vC6_P5_4=false;
        }
        for (Integer valor5:valores5 ) {
            if(valor5==1)vC6_P5_5=false;
        }
        for (Integer valor6:valores6 ) {
            if(valor6==1)vC6_P5_6=false;
        }
        for (Integer valor7:valores7 ) {
            if(valor7==1)vC6_P5_7=false;
        }
        for (Integer valor8:valores8 ) {
            if(valor8==1)vC6_P5_8=false;
        }
        for (Integer valor9:valores9 ) {
            if(valor9==1)vC6_P5_9=false;
        }
        if(vC6_P5_1 && Integer.parseInt(C6_p3_1)>=0 && Integer.parseInt(C6_p3_1)<Integer.parseInt(C5_t1)){
            mostrarMensaje("Pregunta 5.1: Debe seleccionar una o más opciones");
            valido=false;
        }else if(C6_P5_1_19== 1 && C6_P5_1_19_0.trim().length()<3){
            mostrarMensaje("Pregunta 5.1: Debe registrar información válida en Especifique");
            valido=false;
        }else if(vC6_P5_2 && Integer.parseInt(C6_p3_2)>=0 && Integer.parseInt(C6_p3_2)<Integer.parseInt(C5_t2)){
            mostrarMensaje("Pregunta 5.2: Debe seleccionar una o más opciones");
            valido=false;
        }else if(C6_P5_2_19== 1 && C6_P5_2_19_0.trim().length()<3){
            mostrarMensaje("Pregunta 5.2: Debe registrar información válida en Especifique");
            valido=false;
        }else if(vC6_P5_3 && Integer.parseInt(C6_p3_3)>=0 && Integer.parseInt(C6_p3_3)<Integer.parseInt(C5_t3)){
            mostrarMensaje("Pregunta 5.3: Debe seleccionar una o más opciones");
            valido=false;
        }else if(C6_P5_3_19== 1 && C6_P5_3_19_0.trim().length()<3){
            mostrarMensaje("Pregunta 5.3: Debe registrar información válida en Especifique");
            valido=false;
        }else if(vC6_P5_4 && Integer.parseInt(C6_p3_4)>=0 && Integer.parseInt(C6_p3_4)<Integer.parseInt(C5_t4)){
            mostrarMensaje("Pregunta 5.4: Debe seleccionar una o más opciones");
            valido=false;
        }else if(C6_P5_4_19== 1 && C6_P5_4_19_0.trim().length()<3){
            mostrarMensaje("Pregunta 5.4: Debe registrar información válida en Especifique");
            valido=false;
        }else if(vC6_P5_5 && Integer.parseInt(C6_p3_5)>=0 && Integer.parseInt(C6_p3_5)<Integer.parseInt(C5_t5)){
            mostrarMensaje("Pregunta 5.5: Debe seleccionar una o más opciones");
            valido=false;
        }else if(C6_P5_5_19== 1 && C6_P5_5_19_0.trim().length()<3){
            mostrarMensaje("Pregunta 5.5: Debe registrar información válida en Especifique");
            valido=false;
        }else if(vC6_P5_6 && Integer.parseInt(C6_p3_6)>=0 && Integer.parseInt(C6_p3_6)<Integer.parseInt(C5_t6)){
            mostrarMensaje("Pregunta 5.6: Debe seleccionar una o más opciones");
            valido=false;
        }else if(C6_P5_6_19== 1 && C6_P5_6_19_0.trim().length()<3){
            mostrarMensaje("Pregunta 5.6: Debe registrar información válida en Especifique");

            valido=false;
        }else if(vC6_P5_7 && Integer.parseInt(C6_p3_7)>=0 && Integer.parseInt(C6_p3_7)<Integer.parseInt(C5_t7)){
            mostrarMensaje("Pregunta 5.7: Debe seleccionar una o más opciones");
            valido=false;
        }else if(C6_P5_7_19== 1 && C6_P5_7_19_0.trim().length()<3){
            mostrarMensaje("Pregunta 5.7: Debe registrar información válida en Especifique");
            valido=false;
        }else if(vC6_P5_8 && Integer.parseInt(C6_p3_8)>=0 && Integer.parseInt(C6_p3_8)<Integer.parseInt(C5_t8)){
            mostrarMensaje("Pregunta 5.8: Debe seleccionar una o más opciones");
            valido=false;
        }else if(C6_P5_8_19== 1 && C6_P5_8_19_0.trim().length()<3){
            mostrarMensaje("Pregunta 5.8: Debe registrar información válida en Especifique");
            valido=false;
        }else if(vC6_P5_9 && Integer.parseInt(C6_p3_9)>=0 && Integer.parseInt(C6_p3_9)<Integer.parseInt(C5_t9)){
            mostrarMensaje("Pregunta 5.9: Debe seleccionar una o más opciones");
            valido=false;
        }else if(C6_P5_9_19== 1 && C6_P5_9_19_0.trim().length()<3){
            mostrarMensaje("Pregunta 5.9: Debe registrar información válida en Especifique");
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
