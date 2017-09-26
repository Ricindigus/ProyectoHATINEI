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
import android.util.Log;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import java.util.Arrays;

import pe.gob.inei.encuestahabilidades.NumericKeyBoardTransformationMethod;
import pe.gob.inei.encuestahabilidades.R;
import pe.gob.inei.encuestahabilidades.modelo.Data;
import pe.gob.inei.encuestahabilidades.pojos.Modulo7;
import pe.gob.inei.encuestahabilidades.modelo.SQLConstantes;

/**
 * A simple {@link Fragment} subclass.
 */
public class Modulo7Fragment9 extends Fragment {
    //PREGUNTA 20
    private RadioGroup   mod7_p20_rgb;
    //PREGUNTA 21
    private RadioGroup   mod7_p21_rgb;
    //PREGUNTA 22
    private LinearLayout mod7_p22_rgb_ly;
    private CheckBox     mod7_p22_ck1;
    private CheckBox     mod7_p22_ck2;
    private CheckBox     mod7_p22_ck3;
    private CheckBox     mod7_p22_ck4;
    private CheckBox     mod7_p22_ck5;
    private CheckBox     mod7_p22_ck6;
    private CheckBox     mod7_p22_ck7;
    private CheckBox     mod7_p22_ck8;
    private CheckBox     mod7_p22_ck9;
    private CheckBox     mod7_p22_ck10;
    private CheckBox     mod7_p22_ck11;
    private CheckBox     mod7_p22_ck12;
    private CheckBox     mod7_p22_ck13;
    private CheckBox     mod7_p22_ck14;
    private CheckBox     mod7_p22_ck15;
    private CheckBox     mod7_p22_ck16;
    private CheckBox     mod7_p22_ck17;
    private EditText     mod7_p22_edt;
    //PREGUNTA 23
    private LinearLayout mod7_p23_ly;
    private CheckBox     mod7_p23_ck1;
    private CheckBox     mod7_p23_ck2;
    private CheckBox     mod7_p23_ck3;
    private CheckBox     mod7_p23_ck4;
    private CheckBox     mod7_p23_ck5;
    private CheckBox     mod7_p23_ck6;
    private CheckBox     mod7_p23_ck7;
    private CheckBox     mod7_p23_ck8;
    private CheckBox     mod7_p23_ck9;
    private CheckBox     mod7_p23_ck10;
    private EditText     mod7_p23_edt;
    //PREGUNTA 24
    private LinearLayout mod7_p24_ly;
    private LinearLayout mod7_p24_lyt;
    private RadioGroup   mod7_p24_rgb;
    private CheckBox     mod7_p24_ck1;
    private CheckBox     mod7_p24_ck2;
    private CheckBox     mod7_p24_ck3;
    private EditText     mod7_p24_edt1;
    private EditText     mod7_p24_edt2;
    private EditText     mod7_p24_edt3;
    //PREGUNTA 25
    private LinearLayout mod7_p25_ly;
    private LinearLayout mod7_p25_rgb_ly;
    private CheckBox     mod7_p25_ck1;
    private CheckBox     mod7_p25_ck2;
    private CheckBox     mod7_p25_ck3;
    private CheckBox     mod7_p25_ck4;
    private CheckBox     mod7_p25_ck5;
    private CheckBox     mod7_p25_ck6;
    //PREGUNTA 26
    private LinearLayout mod7_p26_ly;
    private CheckBox     mod7_p26_ck1;
    private CheckBox     mod7_p26_ck2;
    private CheckBox     mod7_p26_ck3;
    private CheckBox     mod7_p26_ck4;
    private CheckBox     mod7_p26_ck5;
    private CheckBox     mod7_p26_ck6;
    private CheckBox     mod7_p26_ck7;
    private CheckBox     mod7_p26_ck8;
    private CheckBox     mod7_p26_ck9;
    private CheckBox     mod7_p26_ck10;
    private CheckBox     mod7_p26_ck11;
    private CheckBox     mod7_p26_ck12;
    private CheckBox     mod7_p26_ck13;
    private CheckBox     mod7_p26_ck14;
    private CheckBox     mod7_p26_ck15;
    private CheckBox     mod7_p26_ck16;
    private CheckBox     mod7_p26_ck17;
    private CheckBox     mod7_p26_ck18;
    private CheckBox     mod7_p26_ck19;
    private CheckBox     mod7_p26_ck20;
    private CheckBox     mod7_p26_ck21;
    private CheckBox     mod7_p26_ck22;
    private EditText     mod7_p26_edt;
    //PREGUNTA 27
    private LinearLayout mod7_p27_ly;
    private EditText mod7_p27_edt;

    //PREGUNTA 28
    private LinearLayout mod7_p28_ly;
    private LinearLayout mod7_p28_lyt_ck;
    private EditText mod7_p28_ck4_edt;
    private CheckBox mod7_p28_ck1;
    private CheckBox mod7_p28_ck2;
    private CheckBox mod7_p28_ck3;
    private CheckBox mod7_p28_ck4;
    private CheckBox mod7_p28_ck5;

    //PREGUNTA 29
    private LinearLayout mod7_p29_ly;
    private EditText mod7_p29_edt;
    //PREGUNTA 30
    private LinearLayout mod7_p30_ly;
    private EditText mod7_p30_edt1;
    private EditText mod7_p30_edt2;
    //PREGUNTA 31
    private LinearLayout mod7_p31_ly;
    private LinearLayout mod7_p31_1_lyt;
    private LinearLayout mod7_p31_2_lyt;
    private LinearLayout mod7_p31_3_lyt;
    private LinearLayout mod7_p31_4_lyt;
    private LinearLayout mod7_p31_5_lyt;
    private LinearLayout mod7_p31_6_lyt;
    private LinearLayout mod7_p31_7_lyt;
    private LinearLayout mod7_p31_8_lyt;
    private LinearLayout mod7_p31_9_lyt;
    private RadioGroup mod7_p31_1_rgb;
    private RadioGroup mod7_p31_2_rgb;
    private RadioGroup mod7_p31_3_rgb;
    private RadioGroup mod7_p31_4_rgb;
    private RadioGroup mod7_p31_5_rgb;
    private RadioGroup mod7_p31_6_rgb;
    private RadioGroup mod7_p31_7_rgb;
    private RadioGroup mod7_p31_8_rgb;
    private RadioGroup mod7_p31_9_rgb;
    private EditText mod7_p31_1_edt;
    private EditText mod7_p31_2_edt;
    private EditText mod7_p31_3_edt;
    private EditText mod7_p31_4_edt;
    private EditText mod7_p31_5_edt;
    private EditText mod7_p31_6_edt;
    private EditText mod7_p31_7_edt;
    private EditText mod7_p31_8_edt;
    private EditText mod7_p31_9_edt;

    //PREGUNTA 32
    private LinearLayout mod7_p32_ly;
    private LinearLayout mod7_p32_lyt;
    private CheckBox mod7_p32_ck1;
    private CheckBox mod7_p32_ck2;
    private CheckBox mod7_p32_ck3;
    private CheckBox mod7_p32_ck4;

    //PREGUNTA 33
    private LinearLayout mod7_p33_ly;
    private EditText mod7_p33_edt1;


    private String idempresa;
    private Modulo7 modulo7;
    private Context context;
    private Data data;


    //mapeo de variables
    int C7_P20;int C7_P21;int C7_P22_1;int C7_P22_2;int C7_P22_3;int C7_P22_4;int C7_P22_5;
    int C7_P22_6;int C7_P22_7;int C7_P22_8;int C7_P22_9;int C7_P22_10;int C7_P22_11;int C7_P22_12;
    int C7_P22_13;int C7_P22_14;int C7_P22_15;int C7_P22_16;String C7_P22_16_0;int C7_P22_17;
    int C7_P23_1;int C7_P23_2;int C7_P23_3;int C7_P23_4;int C7_P23_5;
    int C7_P23_6;int C7_P23_7;int C7_P23_8;int C7_P23_9;int C7_P23_10;String C7_P23_10_0;
    int C7_P24; int C7_P24_1_1; int C7_P24_1_2; int C7_P24_1_3; String C7_P24_2_1; String C7_P24_2_2; String C7_P24_2_3;
    int C7_P25_1;int C7_P25_2;int C7_P25_3;int C7_P25_4;int C7_P25_5;int C7_P25_6;
    int C7_P26_1;int C7_P26_2;int C7_P26_3;int C7_P26_4;int C7_P26_5;
    int C7_P26_6;int C7_P26_7;int C7_P26_8;int C7_P26_9;int C7_P26_10;int C7_P26_11;int C7_P26_12;
    int C7_P26_13;int C7_P26_14;int C7_P26_15;int C7_P26_16;int C7_P26_17;int C7_P26_18;int C7_P26_19;
    int C7_P26_20;int C7_P26_21;String C7_P26_21_0;int C7_P26_22;String C7_P27;
    int C7_P28_1;int C7_P28_2;int C7_P28_3;int C7_P28_4;String C7_P28_4_0;int C7_P28_5;
    String C7_P29;String C7_P30_1;String C7_P30_2;

    int C7_P31_1_1;int C7_P31_1_2;int C7_P31_1_3;int C7_P31_1_4;int C7_P31_1_5;int C7_P31_1_6;int C7_P31_1_7;
    int C7_P31_1_8;int C7_P31_1_9;  String C7_P31_2_1;String C7_P31_2_2;String C7_P31_2_3;String C7_P31_2_4;String C7_P31_2_5;
    String C7_P31_2_6;String C7_P31_2_7;String C7_P31_2_8;String C7_P31_2_9;
    int C7_P32_1;int C7_P32_2;int C7_P32_3;int C7_P32_4;String C7_P33;




    public Modulo7Fragment9() {
        // Required empty public constructor
    }

    @SuppressLint("ValidFragment")
    public Modulo7Fragment9(String idempresa, Context context) {
        this.idempresa = idempresa;
        this.context = context;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_modulo7_fragment9, container, false);
        //PREGUNTA 20
        mod7_p20_rgb    = (RadioGroup) rootView.findViewById(R.id.mod7_p20_rgb);
        //PREGUNTA 21
        mod7_p21_rgb    = (RadioGroup) rootView.findViewById(R.id.mod7_p21_rgb);
        //PREGUNTA 22
        mod7_p22_rgb_ly = (LinearLayout) rootView.findViewById(R.id.mod7_p22_rgb_ly);
        mod7_p22_ck1    = (CheckBox) rootView.findViewById(R.id.mod7_p22_ck1);
        mod7_p22_ck2    = (CheckBox) rootView.findViewById(R.id.mod7_p22_ck2);
        mod7_p22_ck3    = (CheckBox) rootView.findViewById(R.id.mod7_p22_ck3);
        mod7_p22_ck4    = (CheckBox) rootView.findViewById(R.id.mod7_p22_ck4);
        mod7_p22_ck5    = (CheckBox) rootView.findViewById(R.id.mod7_p22_ck5);
        mod7_p22_ck6    = (CheckBox) rootView.findViewById(R.id.mod7_p22_ck6);
        mod7_p22_ck7    = (CheckBox) rootView.findViewById(R.id.mod7_p22_ck7);
        mod7_p22_ck8    = (CheckBox) rootView.findViewById(R.id.mod7_p22_ck8);
        mod7_p22_ck9    = (CheckBox) rootView.findViewById(R.id.mod7_p22_ck9);
        mod7_p22_ck10   = (CheckBox) rootView.findViewById(R.id.mod7_p22_ck10);
        mod7_p22_ck11   = (CheckBox) rootView.findViewById(R.id.mod7_p22_ck11);
        mod7_p22_ck12   = (CheckBox) rootView.findViewById(R.id.mod7_p22_ck12);
        mod7_p22_ck13   = (CheckBox) rootView.findViewById(R.id.mod7_p22_ck13);
        mod7_p22_ck14   = (CheckBox) rootView.findViewById(R.id.mod7_p22_ck14);
        mod7_p22_ck15   = (CheckBox) rootView.findViewById(R.id.mod7_p22_ck15);
        mod7_p22_ck16   = (CheckBox) rootView.findViewById(R.id.mod7_p22_ck16);
        mod7_p22_ck17   = (CheckBox) rootView.findViewById(R.id.mod7_p22_ck17);
        mod7_p22_edt    = (EditText) rootView.findViewById(R.id.mod7_p22_edt);
        //PREGUNTA 23
        mod7_p23_ly     = (LinearLayout) rootView.findViewById(R.id.mod7_p23_ly);
        mod7_p23_ck1    = (CheckBox) rootView.findViewById(R.id.mod7_p23_ck1);
        mod7_p23_ck2    = (CheckBox) rootView.findViewById(R.id.mod7_p23_ck2);
        mod7_p23_ck3    = (CheckBox) rootView.findViewById(R.id.mod7_p23_ck3);
        mod7_p23_ck4    = (CheckBox) rootView.findViewById(R.id.mod7_p23_ck4);
        mod7_p23_ck5    = (CheckBox) rootView.findViewById(R.id.mod7_p23_ck5);
        mod7_p23_ck6    = (CheckBox) rootView.findViewById(R.id.mod7_p23_ck6);
        mod7_p23_ck7    = (CheckBox) rootView.findViewById(R.id.mod7_p23_ck7);
        mod7_p23_ck8    = (CheckBox) rootView.findViewById(R.id.mod7_p23_ck8);
        mod7_p23_ck9    = (CheckBox) rootView.findViewById(R.id.mod7_p23_ck9);
        mod7_p23_ck10   = (CheckBox) rootView.findViewById(R.id.mod7_p23_ck10);
        mod7_p23_edt    = (EditText) rootView.findViewById(R.id.mod7_p23_edt);
        //PREGUNTA 24
        mod7_p24_ly    = (LinearLayout) rootView.findViewById(R.id.mod7_p24_ly);
        mod7_p24_lyt   = (LinearLayout) rootView.findViewById(R.id.mod7_p24_lyt);
        mod7_p24_ck1   = (CheckBox) rootView.findViewById(R.id.mod7_p24_ck1);
        mod7_p24_ck2   = (CheckBox) rootView.findViewById(R.id.mod7_p24_ck2);
        mod7_p24_ck3   = (CheckBox) rootView.findViewById(R.id.mod7_p24_ck3);
        mod7_p24_rgb   = (RadioGroup) rootView.findViewById(R.id.mod7_p24_rgb);
        mod7_p24_edt1  = (EditText) rootView.findViewById(R.id.mod7_p24_edt1);
        mod7_p24_edt2  = (EditText) rootView.findViewById(R.id.mod7_p24_edt2);
        mod7_p24_edt3  = (EditText) rootView.findViewById(R.id.mod7_p24_edt3);
        //PREGUNTA 25
        mod7_p25_ly    = (LinearLayout) rootView.findViewById(R.id.mod7_p25_ly);
        mod7_p25_ck1   = (CheckBox) rootView.findViewById(R.id.mod7_p25_ck1);
        mod7_p25_ck2   = (CheckBox) rootView.findViewById(R.id.mod7_p25_ck2);
        mod7_p25_ck3   = (CheckBox) rootView.findViewById(R.id.mod7_p25_ck3);
        mod7_p25_ck4   = (CheckBox) rootView.findViewById(R.id.mod7_p25_ck4);
        mod7_p25_ck5   = (CheckBox) rootView.findViewById(R.id.mod7_p25_ck5);
        mod7_p25_ck6   = (CheckBox) rootView.findViewById(R.id.mod7_p25_ck6);
        //PREGUNTA 26
        mod7_p26_ly    = (LinearLayout) rootView.findViewById(R.id.mod7_p26_ly);
        mod7_p26_ck1   = (CheckBox) rootView.findViewById(R.id.mod7_p26_ck1);
        mod7_p26_ck2   = (CheckBox) rootView.findViewById(R.id.mod7_p26_ck2);
        mod7_p26_ck3   = (CheckBox) rootView.findViewById(R.id.mod7_p26_ck3);
        mod7_p26_ck4   = (CheckBox) rootView.findViewById(R.id.mod7_p26_ck4);
        mod7_p26_ck5   = (CheckBox) rootView.findViewById(R.id.mod7_p26_ck5);
        mod7_p26_ck6   = (CheckBox) rootView.findViewById(R.id.mod7_p26_ck6);
        mod7_p26_ck7   = (CheckBox) rootView.findViewById(R.id.mod7_p26_ck7);
        mod7_p26_ck8   = (CheckBox) rootView.findViewById(R.id.mod7_p26_ck8);
        mod7_p26_ck9    = (CheckBox) rootView.findViewById(R.id.mod7_p26_ck9);
        mod7_p26_ck10   = (CheckBox) rootView.findViewById(R.id.mod7_p26_ck10);
        mod7_p26_ck11   = (CheckBox) rootView.findViewById(R.id.mod7_p26_ck11);
        mod7_p26_ck12   = (CheckBox) rootView.findViewById(R.id.mod7_p26_ck12);
        mod7_p26_ck13   = (CheckBox) rootView.findViewById(R.id.mod7_p26_ck13);
        mod7_p26_ck14   = (CheckBox) rootView.findViewById(R.id.mod7_p26_ck14);
        mod7_p26_ck15   = (CheckBox) rootView.findViewById(R.id.mod7_p26_ck15);
        mod7_p26_ck16   = (CheckBox) rootView.findViewById(R.id.mod7_p26_ck16);
        mod7_p26_ck17   = (CheckBox) rootView.findViewById(R.id.mod7_p26_ck17);
        mod7_p26_ck18   = (CheckBox) rootView.findViewById(R.id.mod7_p26_ck18);
        mod7_p26_ck19   = (CheckBox) rootView.findViewById(R.id.mod7_p26_ck19);
        mod7_p26_ck20   = (CheckBox) rootView.findViewById(R.id.mod7_p26_ck20);
        mod7_p26_ck21   = (CheckBox) rootView.findViewById(R.id.mod7_p26_ck21);
        mod7_p26_ck22   = (CheckBox) rootView.findViewById(R.id.mod7_p26_ck22);
        mod7_p26_edt    = (EditText) rootView.findViewById(R.id.mod7_p26_edt);

        //PREGUNTA 27
        mod7_p27_ly    = (LinearLayout) rootView.findViewById(R.id.mod7_p27_ly);
        mod7_p27_edt = (EditText) rootView.findViewById(R.id.mod7_p27_edt);
        //PREGUNTA 28
        mod7_p28_ly    = (LinearLayout) rootView.findViewById(R.id.mod7_p28_ly);
        mod7_p28_lyt_ck = (LinearLayout) rootView.findViewById(R.id.mod7_p28_lyt_ck);
        mod7_p28_ck4_edt = (EditText) rootView.findViewById(R.id.mod7_p28_ck4_edt);
        mod7_p28_ck1 = (CheckBox) rootView.findViewById(R.id.mod7_p28_ck1);
        mod7_p28_ck2 = (CheckBox) rootView.findViewById(R.id.mod7_p28_ck2);
        mod7_p28_ck3 = (CheckBox) rootView.findViewById(R.id.mod7_p28_ck3);
        mod7_p28_ck4 = (CheckBox) rootView.findViewById(R.id.mod7_p28_ck4);
        mod7_p28_ck5 = (CheckBox) rootView.findViewById(R.id.mod7_p28_ck5);
        //PREGUNTA 29
        mod7_p29_ly    = (LinearLayout) rootView.findViewById(R.id.mod7_p29_ly);
        mod7_p29_edt = (EditText) rootView.findViewById(R.id.mod7_p29_edt);
        //PREGUNTA 30
        mod7_p30_ly    = (LinearLayout) rootView.findViewById(R.id.mod7_p30_ly);
        mod7_p30_edt1 = (EditText) rootView.findViewById(R.id.mod7_p30_edt1);
        mod7_p30_edt2 = (EditText) rootView.findViewById(R.id.mod7_p30_edt2);
        //PREGUNTA 31
        mod7_p31_ly    = (LinearLayout) rootView.findViewById(R.id.mod7_p31_ly);
        mod7_p31_1_lyt = (LinearLayout) rootView.findViewById(R.id.mod7_p31_1_lyt);
        mod7_p31_2_lyt = (LinearLayout) rootView.findViewById(R.id.mod7_p31_2_lyt);
        mod7_p31_3_lyt = (LinearLayout) rootView.findViewById(R.id.mod7_p31_3_lyt);
        mod7_p31_4_lyt = (LinearLayout) rootView.findViewById(R.id.mod7_p31_4_lyt);
        mod7_p31_5_lyt = (LinearLayout) rootView.findViewById(R.id.mod7_p31_5_lyt);
        mod7_p31_6_lyt = (LinearLayout) rootView.findViewById(R.id.mod7_p31_6_lyt);
        mod7_p31_7_lyt = (LinearLayout) rootView.findViewById(R.id.mod7_p31_7_lyt);
        mod7_p31_8_lyt = (LinearLayout) rootView.findViewById(R.id.mod7_p31_8_lyt);
        mod7_p31_9_lyt = (LinearLayout) rootView.findViewById(R.id.mod7_p31_9_lyt);
        mod7_p31_1_rgb = (RadioGroup) rootView.findViewById(R.id.mod7_p31_1_rgb);
        mod7_p31_2_rgb = (RadioGroup) rootView.findViewById(R.id.mod7_p31_2_rgb);
        mod7_p31_3_rgb = (RadioGroup) rootView.findViewById(R.id.mod7_p31_3_rgb);
        mod7_p31_4_rgb = (RadioGroup) rootView.findViewById(R.id.mod7_p31_4_rgb);
        mod7_p31_5_rgb = (RadioGroup) rootView.findViewById(R.id.mod7_p31_5_rgb);
        mod7_p31_6_rgb = (RadioGroup) rootView.findViewById(R.id.mod7_p31_6_rgb);
        mod7_p31_7_rgb = (RadioGroup) rootView.findViewById(R.id.mod7_p31_7_rgb);
        mod7_p31_8_rgb = (RadioGroup) rootView.findViewById(R.id.mod7_p31_8_rgb);
        mod7_p31_9_rgb = (RadioGroup) rootView.findViewById(R.id.mod7_p31_9_rgb);
        mod7_p31_1_edt = (EditText) rootView.findViewById(R.id.mod7_p31_1_edt);
        mod7_p31_2_edt = (EditText) rootView.findViewById(R.id.mod7_p31_2_edt);
        mod7_p31_3_edt = (EditText) rootView.findViewById(R.id.mod7_p31_3_edt);
        mod7_p31_4_edt = (EditText) rootView.findViewById(R.id.mod7_p31_4_edt);
        mod7_p31_5_edt = (EditText) rootView.findViewById(R.id.mod7_p31_5_edt);
        mod7_p31_6_edt = (EditText) rootView.findViewById(R.id.mod7_p31_6_edt);
        mod7_p31_7_edt = (EditText) rootView.findViewById(R.id.mod7_p31_7_edt);
        mod7_p31_8_edt = (EditText) rootView.findViewById(R.id.mod7_p31_8_edt);
        mod7_p31_9_edt = (EditText) rootView.findViewById(R.id.mod7_p31_9_edt);

        //PREGUNTA 32
        mod7_p32_ly    = (LinearLayout) rootView.findViewById(R.id.mod7_p32_ly);
        mod7_p32_lyt = (LinearLayout) rootView.findViewById(R.id.mod7_p32_lyt);
        mod7_p32_ck1 = (CheckBox) rootView.findViewById(R.id.mod7_p32_ck1);
        mod7_p32_ck2 = (CheckBox) rootView.findViewById(R.id.mod7_p32_ck2);
        mod7_p32_ck3 = (CheckBox) rootView.findViewById(R.id.mod7_p32_ck3);
        mod7_p32_ck4 = (CheckBox) rootView.findViewById(R.id.mod7_p32_ck4);
        //PREGUNTA 33
        mod7_p33_ly    = (LinearLayout) rootView.findViewById(R.id.mod7_p33_ly);
        mod7_p33_edt1 = (EditText) rootView.findViewById(R.id.mod7_p33_edt1);








        return rootView;

    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        //PREGUNTA  20
        mod7_p20_rgb.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, @IdRes int i) {
                switch (i) {
                    case R.id.mod7_p20_rb1:

                        switch (mod7_p21_rgb.getCheckedRadioButtonId()) {
                            case R.id.mod7_p21_rb1:
                                mod7_p22_rgb_ly.setVisibility(View.GONE);
                                mod7_p22_ck1.setChecked(false);
                                mod7_p22_ck2.setChecked(false);
                                mod7_p22_ck3.setChecked(false);
                                mod7_p22_ck4.setChecked(false);
                                mod7_p22_ck5.setChecked(false);
                                mod7_p22_ck6.setChecked(false);
                                mod7_p22_ck7.setChecked(false);
                                mod7_p22_ck8.setChecked(false);
                                mod7_p22_ck9.setChecked(false);
                                mod7_p22_ck10.setChecked(false);
                                mod7_p22_ck11.setChecked(false);
                                mod7_p22_ck12.setChecked(false);
                                mod7_p22_ck13.setChecked(false);
                                mod7_p22_ck14.setChecked(false);
                                mod7_p22_ck15.setChecked(false);
                                mod7_p22_ck16.setChecked(false);
                                mod7_p22_ck17.setChecked(false);
                                mod7_p22_edt.setText("");
                                mod7_p23_ly.setVisibility(View.VISIBLE);
                                mod7_p24_ly.setVisibility(View.VISIBLE);
                                mod7_p25_ly.setVisibility(View.VISIBLE);
                                mod7_p26_ly.setVisibility(View.VISIBLE);
                                mod7_p27_ly.setVisibility(View.VISIBLE);
                                mod7_p28_ly.setVisibility(View.VISIBLE);
                                mod7_p29_ly.setVisibility(View.VISIBLE);
                                mod7_p30_ly.setVisibility(View.VISIBLE);
                                mod7_p31_ly.setVisibility(View.VISIBLE);
                                mod7_p32_ly.setVisibility(View.VISIBLE);
                                mod7_p33_ly.setVisibility(View.VISIBLE);



                                break;
                            case R.id.mod7_p21_rb2:
                                mod7_p22_rgb_ly.setVisibility(View.GONE);
                                mod7_p22_ck1.setChecked(false);
                                mod7_p22_ck2.setChecked(false);
                                mod7_p22_ck3.setChecked(false);
                                mod7_p22_ck4.setChecked(false);
                                mod7_p22_ck5.setChecked(false);
                                mod7_p22_ck6.setChecked(false);
                                mod7_p22_ck7.setChecked(false);
                                mod7_p22_ck8.setChecked(false);
                                mod7_p22_ck9.setChecked(false);
                                mod7_p22_ck10.setChecked(false);
                                mod7_p22_ck11.setChecked(false);
                                mod7_p22_ck12.setChecked(false);
                                mod7_p22_ck13.setChecked(false);
                                mod7_p22_ck14.setChecked(false);
                                mod7_p22_ck15.setChecked(false);
                                mod7_p22_ck16.setChecked(false);
                                mod7_p22_ck17.setChecked(false);
                                mod7_p22_edt.setText("");
                                mod7_p23_ly.setVisibility(View.VISIBLE);
                                mod7_p24_ly.setVisibility(View.VISIBLE);
                                mod7_p25_ly.setVisibility(View.VISIBLE);
                                mod7_p26_ly.setVisibility(View.VISIBLE);
                                mod7_p27_ly.setVisibility(View.VISIBLE);
                                mod7_p28_ly.setVisibility(View.VISIBLE);
                                mod7_p29_ly.setVisibility(View.VISIBLE);
                                mod7_p30_ly.setVisibility(View.VISIBLE);
                                mod7_p31_ly.setVisibility(View.VISIBLE);
                                mod7_p32_ly.setVisibility(View.VISIBLE);
                                mod7_p33_ly.setVisibility(View.VISIBLE);

                                break;

                        }

                        break;
                    case R.id.mod7_p20_rb2:
                        switch (mod7_p21_rgb.getCheckedRadioButtonId()) {
                            case R.id.mod7_p21_rb1:
                                mod7_p22_rgb_ly.setVisibility(View.GONE);
                                mod7_p22_ck1.setChecked(false);
                                mod7_p22_ck2.setChecked(false);
                                mod7_p22_ck3.setChecked(false);
                                mod7_p22_ck4.setChecked(false);
                                mod7_p22_ck5.setChecked(false);
                                mod7_p22_ck6.setChecked(false);
                                mod7_p22_ck7.setChecked(false);
                                mod7_p22_ck8.setChecked(false);
                                mod7_p22_ck9.setChecked(false);
                                mod7_p22_ck10.setChecked(false);
                                mod7_p22_ck11.setChecked(false);
                                mod7_p22_ck12.setChecked(false);
                                mod7_p22_ck13.setChecked(false);
                                mod7_p22_ck14.setChecked(false);
                                mod7_p22_ck15.setChecked(false);
                                mod7_p22_ck16.setChecked(false);
                                mod7_p22_ck17.setChecked(false);
                                mod7_p22_edt.setText("");
                                mod7_p23_ly.setVisibility(View.VISIBLE);
                                mod7_p24_ly.setVisibility(View.VISIBLE);
                                mod7_p25_ly.setVisibility(View.VISIBLE);
                                mod7_p26_ly.setVisibility(View.VISIBLE);
                                mod7_p27_ly.setVisibility(View.VISIBLE);
                                mod7_p28_ly.setVisibility(View.VISIBLE);
                                mod7_p29_ly.setVisibility(View.VISIBLE);
                                mod7_p30_ly.setVisibility(View.VISIBLE);
                                mod7_p31_ly.setVisibility(View.VISIBLE);
                                mod7_p32_ly.setVisibility(View.VISIBLE);
                                mod7_p33_ly.setVisibility(View.VISIBLE);


                                break;
                            case R.id.mod7_p21_rb2:
                                mod7_p22_rgb_ly.setVisibility(View.VISIBLE);
                                mod7_p23_ly.setVisibility(View.VISIBLE);
                                mod7_p24_ly.setVisibility(View.VISIBLE);
                                mod7_p25_ly.setVisibility(View.VISIBLE);
                                mod7_p26_ly.setVisibility(View.GONE);
                                mod7_p26_ck1.setChecked(false);
                                mod7_p26_ck2.setChecked(false);
                                mod7_p26_ck3.setChecked(false);
                                mod7_p26_ck4.setChecked(false);
                                mod7_p26_ck5.setChecked(false);
                                mod7_p26_ck6.setChecked(false);
                                mod7_p26_ck7.setChecked(false);
                                mod7_p26_ck8.setChecked(false);
                                mod7_p26_ck9.setChecked(false);
                                mod7_p26_ck10.setChecked(false);
                                mod7_p26_ck11.setChecked(false);
                                mod7_p26_ck12.setChecked(false);
                                mod7_p26_ck13.setChecked(false);
                                mod7_p26_ck14.setChecked(false);
                                mod7_p26_ck15.setChecked(false);
                                mod7_p26_ck16.setChecked(false);
                                mod7_p26_ck17.setChecked(false);
                                mod7_p26_ck18.setChecked(false);
                                mod7_p26_ck19.setChecked(false);
                                mod7_p26_ck20.setChecked(false);
                                mod7_p26_ck21.setChecked(false);
                                mod7_p26_ck22.setChecked(false);
                                mod7_p26_edt.setText("");

                                mod7_p27_ly.setVisibility(View.GONE);
                                mod7_p27_edt.setText("");

                                mod7_p28_ly.setVisibility(View.VISIBLE);
                                mod7_p29_ly.setVisibility(View.GONE);
                                mod7_p29_edt.setText("");

                                mod7_p30_ly.setVisibility(View.GONE);
                                mod7_p30_edt1.setText("");
                                mod7_p30_edt2.setText("");

                                mod7_p31_ly.setVisibility(View.GONE);
                                mod7_p31_1_rgb.clearCheck();
                                mod7_p31_2_rgb.clearCheck();
                                mod7_p31_3_rgb.clearCheck();
                                mod7_p31_4_rgb.clearCheck();
                                mod7_p31_5_rgb.clearCheck();
                                mod7_p31_6_rgb.clearCheck();
                                mod7_p31_7_rgb.clearCheck();
                                mod7_p31_8_rgb.clearCheck();
                                mod7_p31_9_rgb.clearCheck();
                                mod7_p31_1_edt.getText();
                                mod7_p31_2_edt.getText();
                                mod7_p31_3_edt.getText();
                                mod7_p31_4_edt.getText();
                                mod7_p31_5_edt.getText();
                                mod7_p31_6_edt.getText();
                                mod7_p31_7_edt.getText();
                                mod7_p31_8_edt.getText();
                                mod7_p31_9_edt.getText();

                                mod7_p32_ly.setVisibility(View.GONE);
                                mod7_p32_ck1.setChecked(false);
                                mod7_p32_ck2.setChecked(false);
                                mod7_p32_ck3.setChecked(false);
                                mod7_p32_ck4.setChecked(false);

                                mod7_p33_ly.setVisibility(View.GONE);
                                mod7_p33_edt1.setText("");
                                break;

                        }
                        break;
                }


            }
        });
        //PREGUNTA 21
        mod7_p21_rgb.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, @IdRes int i) {
                switch (i) {
                    case R.id.mod7_p21_rb1:

                        switch (mod7_p20_rgb.getCheckedRadioButtonId()) {
                            case R.id.mod7_p20_rb1:
                                mod7_p22_rgb_ly.setVisibility(View.GONE);
                                mod7_p22_ck1.setChecked(false);
                                mod7_p22_ck2.setChecked(false);
                                mod7_p22_ck3.setChecked(false);
                                mod7_p22_ck4.setChecked(false);
                                mod7_p22_ck5.setChecked(false);
                                mod7_p22_ck6.setChecked(false);
                                mod7_p22_ck7.setChecked(false);
                                mod7_p22_ck8.setChecked(false);
                                mod7_p22_ck9.setChecked(false);
                                mod7_p22_ck10.setChecked(false);
                                mod7_p22_ck11.setChecked(false);
                                mod7_p22_ck12.setChecked(false);
                                mod7_p22_ck13.setChecked(false);
                                mod7_p22_ck14.setChecked(false);
                                mod7_p22_ck15.setChecked(false);
                                mod7_p22_ck16.setChecked(false);
                                mod7_p22_ck17.setChecked(false);
                                mod7_p22_edt.setText("");

                                mod7_p23_ly.setVisibility(View.VISIBLE);
                                mod7_p24_ly.setVisibility(View.VISIBLE);
                                mod7_p25_ly.setVisibility(View.VISIBLE);
                                mod7_p26_ly.setVisibility(View.VISIBLE);
                                mod7_p27_ly.setVisibility(View.VISIBLE);
                                mod7_p28_ly.setVisibility(View.VISIBLE);
                                mod7_p29_ly.setVisibility(View.VISIBLE);
                                mod7_p30_ly.setVisibility(View.VISIBLE);
                                mod7_p31_ly.setVisibility(View.VISIBLE);
                                mod7_p32_ly.setVisibility(View.VISIBLE);
                                mod7_p33_ly.setVisibility(View.VISIBLE);


                                break;
                            case R.id.mod7_p20_rb2:
                                mod7_p22_rgb_ly.setVisibility(View.GONE);
                                mod7_p22_ck1.setChecked(false);
                                mod7_p22_ck2.setChecked(false);
                                mod7_p22_ck3.setChecked(false);
                                mod7_p22_ck4.setChecked(false);
                                mod7_p22_ck5.setChecked(false);
                                mod7_p22_ck6.setChecked(false);
                                mod7_p22_ck7.setChecked(false);
                                mod7_p22_ck8.setChecked(false);
                                mod7_p22_ck9.setChecked(false);
                                mod7_p22_ck10.setChecked(false);
                                mod7_p22_ck11.setChecked(false);
                                mod7_p22_ck12.setChecked(false);
                                mod7_p22_ck13.setChecked(false);
                                mod7_p22_ck14.setChecked(false);
                                mod7_p22_ck15.setChecked(false);
                                mod7_p22_ck16.setChecked(false);
                                mod7_p22_ck17.setChecked(false);
                                mod7_p22_edt.setText("");

                                mod7_p23_ly.setVisibility(View.VISIBLE);
                                mod7_p24_ly.setVisibility(View.VISIBLE);
                                mod7_p25_ly.setVisibility(View.VISIBLE);
                                mod7_p26_ly.setVisibility(View.VISIBLE);
                                mod7_p27_ly.setVisibility(View.VISIBLE);
                                mod7_p28_ly.setVisibility(View.VISIBLE);
                                mod7_p29_ly.setVisibility(View.VISIBLE);
                                mod7_p30_ly.setVisibility(View.VISIBLE);
                                mod7_p31_ly.setVisibility(View.VISIBLE);
                                mod7_p32_ly.setVisibility(View.VISIBLE);
                                mod7_p33_ly.setVisibility(View.VISIBLE);

                                break;

                        }

                        break;
                    case R.id.mod7_p21_rb2:
                        switch (mod7_p20_rgb.getCheckedRadioButtonId()) {
                            case R.id.mod7_p20_rb1:
                                mod7_p22_rgb_ly.setVisibility(View.GONE);
                                mod7_p22_ck1.setChecked(false);
                                mod7_p22_ck2.setChecked(false);
                                mod7_p22_ck3.setChecked(false);
                                mod7_p22_ck4.setChecked(false);
                                mod7_p22_ck5.setChecked(false);
                                mod7_p22_ck6.setChecked(false);
                                mod7_p22_ck7.setChecked(false);
                                mod7_p22_ck8.setChecked(false);
                                mod7_p22_ck9.setChecked(false);
                                mod7_p22_ck10.setChecked(false);
                                mod7_p22_ck11.setChecked(false);
                                mod7_p22_ck12.setChecked(false);
                                mod7_p22_ck13.setChecked(false);
                                mod7_p22_ck14.setChecked(false);
                                mod7_p22_ck15.setChecked(false);
                                mod7_p22_ck16.setChecked(false);
                                mod7_p22_ck17.setChecked(false);
                                mod7_p22_edt.setText("");

                                mod7_p23_ly.setVisibility(View.VISIBLE);
                                mod7_p24_ly.setVisibility(View.VISIBLE);
                                mod7_p25_ly.setVisibility(View.VISIBLE);
                                mod7_p26_ly.setVisibility(View.VISIBLE);
                                mod7_p27_ly.setVisibility(View.VISIBLE);
                                mod7_p28_ly.setVisibility(View.VISIBLE);
                                mod7_p29_ly.setVisibility(View.VISIBLE);
                                mod7_p30_ly.setVisibility(View.VISIBLE);
                                mod7_p31_ly.setVisibility(View.VISIBLE);
                                mod7_p32_ly.setVisibility(View.VISIBLE);
                                mod7_p33_ly.setVisibility(View.VISIBLE);

                                break;
                            case R.id.mod7_p20_rb2:
                                mod7_p22_rgb_ly.setVisibility(View.VISIBLE);
                                mod7_p22_ck1.setChecked(false);
                                mod7_p22_ck2.setChecked(false);
                                mod7_p22_ck3.setChecked(false);
                                mod7_p22_ck4.setChecked(false);
                                mod7_p22_ck5.setChecked(false);
                                mod7_p22_ck6.setChecked(false);
                                mod7_p22_ck7.setChecked(false);
                                mod7_p22_ck8.setChecked(false);
                                mod7_p22_ck9.setChecked(false);
                                mod7_p22_ck10.setChecked(false);
                                mod7_p22_ck11.setChecked(false);
                                mod7_p22_ck12.setChecked(false);
                                mod7_p22_ck13.setChecked(false);
                                mod7_p22_ck14.setChecked(false);
                                mod7_p22_ck15.setChecked(false);
                                mod7_p22_ck16.setChecked(false);
                                mod7_p22_ck17.setChecked(false);
                                mod7_p22_edt.setText("");

                                mod7_p23_ly.setVisibility(View.VISIBLE);
                                mod7_p24_ly.setVisibility(View.VISIBLE);
                                mod7_p25_ly.setVisibility(View.VISIBLE);
                                mod7_p26_ly.setVisibility(View.GONE);
                                mod7_p26_ck1.setChecked(false);
                                mod7_p26_ck2.setChecked(false);
                                mod7_p26_ck3.setChecked(false);
                                mod7_p26_ck4.setChecked(false);
                                mod7_p26_ck5.setChecked(false);
                                mod7_p26_ck6.setChecked(false);
                                mod7_p26_ck7.setChecked(false);
                                mod7_p26_ck8.setChecked(false);
                                mod7_p26_ck9.setChecked(false);
                                mod7_p26_ck10.setChecked(false);
                                mod7_p26_ck11.setChecked(false);
                                mod7_p26_ck12.setChecked(false);
                                mod7_p26_ck13.setChecked(false);
                                mod7_p26_ck14.setChecked(false);
                                mod7_p26_ck15.setChecked(false);
                                mod7_p26_ck16.setChecked(false);
                                mod7_p26_ck17.setChecked(false);
                                mod7_p26_ck18.setChecked(false);
                                mod7_p26_ck19.setChecked(false);
                                mod7_p26_ck20.setChecked(false);
                                mod7_p26_ck21.setChecked(false);
                                mod7_p26_ck22.setChecked(false);
                                mod7_p26_edt.setText("");

                                mod7_p27_ly.setVisibility(View.GONE);
                                mod7_p27_edt.setText("");

                                mod7_p28_ly.setVisibility(View.VISIBLE);
                                mod7_p29_ly.setVisibility(View.GONE);
                                mod7_p29_edt.setText("");

                                mod7_p30_ly.setVisibility(View.GONE);
                                mod7_p30_edt1.setText("");
                                mod7_p30_edt2.setText("");

                                mod7_p31_ly.setVisibility(View.GONE);
                                mod7_p31_1_rgb.clearCheck();
                                mod7_p31_2_rgb.clearCheck();
                                mod7_p31_3_rgb.clearCheck();
                                mod7_p31_4_rgb.clearCheck();
                                mod7_p31_5_rgb.clearCheck();
                                mod7_p31_6_rgb.clearCheck();
                                mod7_p31_7_rgb.clearCheck();
                                mod7_p31_8_rgb.clearCheck();
                                mod7_p31_9_rgb.clearCheck();
                                mod7_p31_1_edt.getText();
                                mod7_p31_2_edt.getText();
                                mod7_p31_3_edt.getText();
                                mod7_p31_4_edt.getText();
                                mod7_p31_5_edt.getText();
                                mod7_p31_6_edt.getText();
                                mod7_p31_7_edt.getText();
                                mod7_p31_8_edt.getText();
                                mod7_p31_9_edt.getText();

                                mod7_p32_ly.setVisibility(View.GONE);
                                mod7_p32_ck1.setChecked(false);
                                mod7_p32_ck2.setChecked(false);
                                mod7_p32_ck3.setChecked(false);
                                mod7_p32_ck4.setChecked(false);

                                mod7_p33_ly.setVisibility(View.GONE);
                                mod7_p33_edt1.setText("");

                                break;

                        }
                        break;
                }


            }
        });
        //PREGUNTA 22 (Mostrar y ocultar otros)
        mod7_p22_ck16.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    mod7_p22_edt.setVisibility(View.VISIBLE);
                    mod7_p22_edt.setBackgroundResource(R.drawable.spinner_enabled);


                }else{

                    mod7_p22_edt.setVisibility(View.GONE);
                    mod7_p22_edt.setBackgroundResource(R.drawable.spinner_disabled);
                    mod7_p22_edt.setText("");


                }
            }
        });
        final CheckBox[] listacheck ={
                mod7_p22_ck1,mod7_p22_ck2,mod7_p22_ck3,mod7_p22_ck4,
                mod7_p22_ck5,mod7_p22_ck6,mod7_p22_ck7,mod7_p22_ck8,
                mod7_p22_ck9,mod7_p22_ck10,mod7_p22_ck11,mod7_p22_ck12,
                mod7_p22_ck13,mod7_p22_ck14,mod7_p22_ck15,mod7_p22_ck16,

        };
        //PREGUNTA 22 (deshabilitar opciones)
        mod7_p22_edt.setFilters(new InputFilter[]{new InputFilter.AllCaps()});
        mod7_p22_ck17.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override

            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

                if (b) {
                    for (int i = 0; i < listacheck.length; i++) {
                        final CheckBox checkBox = listacheck[i];
                        checkBox.setEnabled(false);
                        checkBox.setChecked(false);
                        mod7_p22_edt.setText("");

                    }

                }
                else {
                    for (int i = 0; i < listacheck.length; i++) {
                        final CheckBox checkBox = listacheck[i];
                        checkBox.setEnabled(true);


                    }
                }
            }
        });

        //PREGUNTA 23
        mod7_p23_edt.setFilters(new InputFilter[]{new InputFilter.AllCaps()});
        mod7_p23_ck10.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    mod7_p23_edt.setVisibility(View.VISIBLE);
                    mod7_p23_edt.setBackgroundResource(R.drawable.spinner_enabled);


                }else{

                    mod7_p23_edt.setVisibility(View.GONE);
                    mod7_p23_edt.setBackgroundResource(R.drawable.spinner_disabled);
                    mod7_p23_edt.setText("");


                }
            }
        });
        //PREGUNTA 24
        mod7_p24_edt1.setFilters(new InputFilter[]{new InputFilter.AllCaps()});
        mod7_p24_edt2.setFilters(new InputFilter[]{new InputFilter.AllCaps()});
        mod7_p24_edt3.setFilters(new InputFilter[]{new InputFilter.AllCaps()});
        mod7_p24_lyt.setVisibility(View.GONE);
        //             SI/NO
        mod7_p24_rgb.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, @IdRes int i) {
                switch (i) {
                    case R.id.mod7_p24_rb1:
                        mod7_p24_edt1.requestFocus();
                        mod7_p24_lyt.setVisibility(View.VISIBLE);
                        mod7_p24_edt1.setEnabled(false);
                        mod7_p24_edt1.setBackgroundResource(R.drawable.cajas_de_texto_disabled);
                        mod7_p24_edt2.setEnabled(false);
                        mod7_p24_edt2.setBackgroundResource(R.drawable.cajas_de_texto_disabled);
                        mod7_p24_edt3.setEnabled(false);
                        mod7_p24_edt3.setBackgroundResource(R.drawable.cajas_de_texto_disabled);
                        mod7_p25_ly.setVisibility(View.GONE);
                        mod7_p25_ck1.setChecked(false);
                        mod7_p25_ck2.setChecked(false);
                        mod7_p25_ck3.setChecked(false);
                        mod7_p25_ck4.setChecked(false);
                        mod7_p25_ck5.setChecked(false);
                        mod7_p25_ck6.setChecked(false);

                        break;
                    case R.id.mod7_p24_rb2:
                        mod7_p25_ck1.requestFocus();
                        mod7_p24_lyt.setVisibility(View.GONE);
                        mod7_p24_edt1.setText("");
                        mod7_p24_edt2.setText("");
                        mod7_p24_edt3.setText("");
                        mod7_p25_ly.setVisibility(View.VISIBLE);
                        mod7_p24_ck1.setChecked(false);
                        mod7_p24_ck2.setChecked(false);
                        mod7_p24_ck3.setChecked(false);
                        break;
                }

            }
        });
        // SI-1
        mod7_p24_ck1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    mod7_p24_edt1.setEnabled(true);
                    mod7_p24_edt1.setBackgroundResource(R.drawable.cajas_de_texto);
                }else{

                    mod7_p24_edt1.setEnabled(false);
                    mod7_p24_edt1.setBackgroundResource(R.drawable.cajas_de_texto_disabled);
                    mod7_p24_edt1.setText("");
                }
            }
        });
        // SI-2
        mod7_p24_ck2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    mod7_p24_edt2.setEnabled(true);
                    mod7_p24_edt2.setBackgroundResource(R.drawable.cajas_de_texto);
                }else{
                    mod7_p24_edt2.setEnabled(false);
                    mod7_p24_edt2.setBackgroundResource(R.drawable.cajas_de_texto_disabled);
                    mod7_p24_edt2.setText("");
                }
            }
        });
        // SI-3
        mod7_p24_ck3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    mod7_p24_edt3.setEnabled(true);
                    mod7_p24_edt3.setBackgroundResource(R.drawable.cajas_de_texto);
                    mod7_p24_edt3.setText("");
                }else{

                    mod7_p24_edt3.setEnabled(false);
                    mod7_p24_edt3.setBackgroundResource(R.drawable.cajas_de_texto_disabled);
                    mod7_p24_edt3.setText("");
                }
            }
        });

        //PREGUNTA 25
        final CheckBox[] listacheck25 = {mod7_p25_ck1,mod7_p25_ck2,mod7_p25_ck3,mod7_p25_ck4,mod7_p25_ck5,mod7_p25_ck6};


        //PREGUNTA 26
        mod7_p26_edt.setFilters(new InputFilter[]{new InputFilter.AllCaps()});
        ////////////////////////////////////////////////////////////////////setEnabled(false);

        if(C7_P26_1==1 || C7_P26_2==1){
            mod7_p27_ly.setVisibility(View.VISIBLE);
        }else{
            mod7_p27_ly.setVisibility(View.GONE);
            mod7_p27_edt.setText("");
        }

        mod7_p26_ck1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (mod7_p26_ck1.isChecked() && mod7_p26_ck2.isChecked()) {
                    mod7_p27_ly.setVisibility(View.VISIBLE);

                }else{
                    if(mod7_p26_ck1.isChecked() || mod7_p26_ck2.isChecked())
                    {mod7_p27_ly.setVisibility(View.VISIBLE);}
                    else{
                        mod7_p27_ly.setVisibility(View.GONE);}
                        mod7_p27_edt.setText("");

                }
            }
        });

        mod7_p26_ck2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (mod7_p26_ck2.isChecked() && mod7_p26_ck1.isChecked()) {
                    mod7_p27_ly.setVisibility(View.VISIBLE);

                }else{
                    if(mod7_p26_ck2.isChecked() || mod7_p26_ck1.isChecked())
                    {mod7_p27_ly.setVisibility(View.VISIBLE);}
                    else{
                        mod7_p27_ly.setVisibility(View.GONE);}
                        mod7_p27_edt.setText("");



                }
            }
        });

        mod7_p26_ck21.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    mod7_p26_edt.setVisibility(View.VISIBLE);
                    mod7_p26_edt.setBackgroundResource(R.drawable.spinner_enabled);


                }else{

                    mod7_p26_edt.setVisibility(View.GONE);
                    mod7_p26_edt.setBackgroundResource(R.drawable.spinner_disabled);
                    mod7_p26_edt.setText("");


                }
            }
        });
        final CheckBox[] listacheck26 ={
                mod7_p26_ck1,mod7_p26_ck2,mod7_p26_ck3,mod7_p26_ck4,
                mod7_p26_ck5,mod7_p26_ck6,mod7_p26_ck7,mod7_p26_ck8,
                mod7_p26_ck9,mod7_p26_ck10,mod7_p26_ck11,mod7_p26_ck12,
                mod7_p26_ck13,mod7_p26_ck14,mod7_p26_ck15,mod7_p26_ck16,mod7_p26_ck17,mod7_p26_ck18,
                mod7_p26_ck19,mod7_p26_ck20,mod7_p26_ck21,

        };

        mod7_p26_ck22.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override

            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

                if (b) {
                    for (int i = 0; i < listacheck26.length; i++) {
                        final CheckBox checkBox = listacheck26[i];
                        checkBox.setEnabled(false);
                        checkBox.setChecked(false);
                        mod7_p26_edt.setText("");

                    }

                }
                else {
                    for (int i = 0; i < listacheck26.length; i++) {
                        final CheckBox checkBox = listacheck26[i];
                        checkBox.setEnabled(true);


                    }
                }
            }
        });

        //PREGUNTA 27
        EditText[] cajasDeTexto = {mod7_p27_edt,mod7_p28_ck4_edt,
                mod7_p29_edt,mod7_p30_edt1,mod7_p30_edt2};


        for (int i = 0; i < cajasDeTexto.length; i++) {
            final EditText editText = cajasDeTexto[i];
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

        mod7_p27_edt.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View view, int keyCode, KeyEvent keyEvent) {
                if ((keyEvent.getAction() == KeyEvent.ACTION_DOWN) &&
                        (keyCode == KeyEvent.KEYCODE_ENTER)) {
                    ocultarTeclado(mod7_p27_edt);
                    mod7_p28_lyt_ck.setBackgroundColor(Color.CYAN);
                    mod7_p28_lyt_ck.requestFocus();
                    mod7_p27_edt.setBackgroundResource(R.drawable.cajas_de_texto);

                    return true;
                }
                return false;
            }
        });
        //PREGUNTA 28
        mod7_p28_ck4_edt.setVisibility(View.GONE);
        mod7_p28_ck4_edt.setFilters(new InputFilter[]{new InputFilter.AllCaps()});
        final CheckBox[] listacheck28 = {mod7_p28_ck1,mod7_p28_ck2,mod7_p28_ck3,mod7_p28_ck4,mod7_p28_ck5};

        for (int i = 0; i < listacheck28.length; i++) {
            if(i!=4){
                final int e=i;
                CheckBox c=listacheck28[i];
                c.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        mod7_p28_lyt_ck.setBackgroundColor(Color.TRANSPARENT);
                        if (e==3){
                            if (b) {
                                mod7_p28_ck4_edt.setVisibility(View.VISIBLE);
                                mod7_p28_ck4_edt.setBackgroundResource(R.drawable.spinner_enabled);
                                mod7_p28_ck4_edt.requestFocus();
                            }else{
                                mod7_p28_ck4_edt.setVisibility(View.GONE);
                                mod7_p28_ck4_edt.setBackgroundResource(R.drawable.spinner_disabled);
                                mod7_p28_ck4_edt.setText("");
                            }
                        }
                    }
                });
            }
        }

        //PREGUNTA 29
        mod7_p29_edt.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View view, int keyCode, KeyEvent keyEvent) {
                if ((keyEvent.getAction() == KeyEvent.ACTION_DOWN) &&
                        (keyCode == KeyEvent.KEYCODE_ENTER)) {
                    ocultarTeclado(mod7_p29_edt);
                    mod7_p30_edt1.setBackgroundColor(Color.CYAN);
                    mod7_p30_edt1.requestFocus();
                    mod7_p29_edt.setBackgroundResource(R.drawable.cajas_de_texto);

                    return true;
                }
                return false;
            }
        });
        //PREGUNTA 30
        //mod7_p30_edt2.setBackgroundResource(R.drawable.cajas_de_texto_disabled);
        //mod7_p30_edt2.setEnabled(false);
        mod7_p30_edt1.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) { }
            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) { }
            @Override
            public void afterTextChanged(Editable editable) {
                if(mod7_p30_edt1.getText().toString().equals("")){
//                    if(mod7_p30_edt1.getText().toString().equals("") || mod7_p30_edt1.getText().toString().equals("0")){
                        mod7_p30_edt2.setBackgroundResource(R.drawable.cajas_de_texto);
                    mod7_p30_edt2.setEnabled(true);
                }else{
                    mod7_p30_edt2.setBackgroundResource(R.drawable.cajas_de_texto_disabled);
                    mod7_p30_edt2.setEnabled(false);
                }
            }
        });

        mod7_p30_edt2.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) { }
            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) { }
            @Override
            public void afterTextChanged(Editable editable) {
                if(mod7_p30_edt2.getText().toString().equals("")){
//                    if(mod7_p30_edt2.getText().toString().equals("") || mod7_p30_edt2.getText().toString().equals("0")){
                    mod7_p30_edt1.setBackgroundResource(R.drawable.cajas_de_texto);
                    mod7_p30_edt1.setEnabled(true);
                }else{
                    mod7_p30_edt1.setBackgroundResource(R.drawable.cajas_de_texto_disabled);
                    mod7_p30_edt1.setEnabled(false);
                }
            }
        });



        //PREGUNTA 31
        final EditText[] cajasDeTexto31 = {mod7_p31_1_edt,
                mod7_p31_2_edt,
                mod7_p31_3_edt,
                mod7_p31_4_edt,
                mod7_p31_5_edt,
                mod7_p31_6_edt,
                mod7_p31_7_edt,
                mod7_p31_8_edt,
                mod7_p31_9_edt};

        final EditText[] cajasDeTexto31_Rangos = {mod7_p29_edt,mod7_p30_edt2,mod7_p31_1_edt,
                mod7_p31_2_edt,
                mod7_p31_3_edt,
                mod7_p31_4_edt,
                mod7_p31_5_edt,
                mod7_p31_6_edt,
                mod7_p31_7_edt,
                mod7_p31_8_edt,
                mod7_p31_9_edt};

        final LinearLayout[] linearlayout = {mod7_p31_1_lyt,
                mod7_p31_2_lyt,
                mod7_p31_3_lyt,
                mod7_p31_4_lyt,
                mod7_p31_5_lyt,
                mod7_p31_6_lyt,
                mod7_p31_7_lyt,
                mod7_p31_8_lyt,
                mod7_p31_9_lyt};

        final RadioGroup[] radioGroup = {mod7_p31_1_rgb,
                mod7_p31_2_rgb,
                mod7_p31_3_rgb,
                mod7_p31_4_rgb,
                mod7_p31_5_rgb,
                mod7_p31_6_rgb,
                mod7_p31_7_rgb,
                mod7_p31_8_rgb,
                mod7_p31_9_rgb};

        final int[] opcionSi = {R.id.mod7_p31_1_rgb1,
                R.id.mod7_p31_2_rgb1,
                R.id.mod7_p31_3_rgb1,
                R.id.mod7_p31_4_rgb1,
                R.id.mod7_p31_5_rgb1,
                R.id.mod7_p31_6_rgb1,
                R.id.mod7_p31_7_rgb1,
                R.id.mod7_p31_8_rgb1,
                R.id.mod7_p31_9_rgb1};

        final int[] opcionNo = {R.id.mod7_p31_1_rgb2,
                R.id.mod7_p31_2_rgb2,
                R.id.mod7_p31_3_rgb2,
                R.id.mod7_p31_4_rgb2,
                R.id.mod7_p31_5_rgb2,
                R.id.mod7_p31_6_rgb2,
                R.id.mod7_p31_7_rgb2,
                R.id.mod7_p31_8_rgb2,
                R.id.mod7_p31_9_rgb2};


        for (int i = 0; i < cajasDeTexto31.length; i++) {
            final EditText editText = cajasDeTexto31[i];
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
            if (i!=8){
                final int e=i;
                editText.setOnKeyListener(new View.OnKeyListener() {
                    @Override
                    public boolean onKey(View view, int keyCode, KeyEvent keyEvent) {
                        if ((keyEvent.getAction() == KeyEvent.ACTION_DOWN) &&
                                (keyCode == KeyEvent.KEYCODE_ENTER)) {
                            ocultarTeclado(editText);
                            radioGroup[e+1].setBackgroundColor(Color.CYAN);
                            radioGroup[e+1].requestFocus();
                            editText.setBackgroundResource(R.drawable.cajas_de_texto);

                            return true;
                        }
                        return false;
                    }
                });
            }

        }
        //PREGUNTA 27_VALIDACIONES RANGOS 0 - 100
        mod7_p27_edt.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {            }
            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {            }
            @Override
            public void afterTextChanged(Editable editable) {
                if (!editable.toString().equals("")) {
                    if (Integer.parseInt(mod7_p27_edt.getText().toString()) >= 101) {
                        Toast.makeText(context, "Debe registrar un porcentaje valido", Toast.LENGTH_SHORT).show();
                        mod7_p27_edt.requestFocus();
                        mod7_p27_edt.setText("");
                    }
                }
            }
        });


        for (int i = 0; i < cajasDeTexto31_Rangos.length; i++) {
            final EditText editTextRangos = cajasDeTexto31_Rangos[i];

            //PREGUNTA 31 VALIDACIONES RANGOS
            editTextRangos.addTextChangedListener(new TextWatcher() {
                @Override
                public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {            }
                @Override
                public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {            }
                @Override
                public void afterTextChanged(Editable editable) {
                    if (!editable.toString().equals("")) {
                        if (Integer.parseInt(editTextRangos.getText().toString()) >= 101 || Integer.parseInt(editTextRangos.getText().toString()) == 0) {
                            Toast.makeText(context, "Debe registrar un porcentaje valido", Toast.LENGTH_SHORT).show();
                            editTextRangos.requestFocus();
                            editTextRangos.setText("");
                        }
                    }
                }
            });
        }

        for (LinearLayout c: linearlayout) {
            c.setVisibility(View.GONE);
        }


        for (int i = 0; i < radioGroup.length; i++) {
            final RadioGroup rg = radioGroup[i];
            rg.setOnFocusChangeListener(new View.OnFocusChangeListener() {
                @Override
                public void onFocusChange(View view, boolean conFocus) {
                    if(conFocus) {
                        rg.setBackgroundColor(Color.CYAN);
                    }else if(view.isEnabled()){
                        rg.setBackgroundColor(Color.TRANSPARENT);
                    }
                }
            });
            final int u=i;
            rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup radioGroups, @IdRes int e) {
                    if(e == opcionSi[u]){
                        linearlayout[u].setVisibility(View.VISIBLE);
                        // rg.setBackgroundColor(Color.TRANSPARENT);
                        cajasDeTexto31[u].requestFocus();

                    }else{
                        rg.setBackgroundColor(Color.TRANSPARENT);
                        linearlayout[u].setVisibility(View.GONE);
                        cajasDeTexto31[u].setText("");
                        if(u != 8){
                            radioGroup[u+1].requestFocus();
                        }
                    }
                }
            });

        }

        for (int i = 0; i < radioGroup.length; i++) {
            final RadioGroup rg = radioGroup[i];
            rg.setOnFocusChangeListener(new View.OnFocusChangeListener() {
                @Override
                public void onFocusChange(View view, boolean conFocus) {
                    if(conFocus) {
                        rg.setBackgroundColor(Color.CYAN);
                    }else if(view.isEnabled()){
                        rg.setBackgroundColor(Color.TRANSPARENT);
                    }
                }
            });
        }

        //PREGUNTA 32,33,34
        EditText[] cajasDeTexto33 = {mod7_p33_edt1};
        // RadioGroup[] radioGroups = {mod7_p34_rgb};
        CheckBox[] checkP32= {mod7_p32_ck1,mod7_p32_ck2,mod7_p32_ck3 ,mod7_p32_ck4};


        // mod7_layoutFragment14.requestFocus();
        //mod7_p32_lyt.setBackgroundColor(Color.CYAN);
        for (CheckBox c: checkP32) {
            c.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton compoundButton, boolean checkeado) {
                    if(checkeado) {
                        mod7_p32_lyt.setBackgroundColor(Color.TRANSPARENT);
                        mod7_p33_edt1.requestFocus();
                    }
                }
            });
        }



        for (int i = 0; i < cajasDeTexto33.length; i++) {
            final EditText editText = cajasDeTexto33[i];
            editText.setOnFocusChangeListener(new View.OnFocusChangeListener() {
                @Override
                public void onFocusChange(View view, boolean conFocus) {
                    if(conFocus) {
                        editText.setBackgroundResource(R.drawable.caja_texto_enabled);
                        mostrarTeclado();
                    }else if(view.isEnabled()){
                        editText.setBackgroundResource(R.drawable.cajas_de_texto);
                    }
                }
            });
        }


        mod7_p33_edt1.setTransformationMethod(new NumericKeyBoardTransformationMethod());
        mod7_p33_edt1.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View view, int keyCode, KeyEvent keyEvent) {
                if ((keyEvent.getAction() == KeyEvent.ACTION_DOWN) &&
                        (keyCode == KeyEvent.KEYCODE_ENTER)) {
                    ocultarTeclado(mod7_p33_edt1);
                    // mod7_p34_rgb.requestFocus();
                    return true;
                }
                return false;
            }
        });
        cargarDatos();
        alertaCheckLimpiar(mod7_p25_ck6,listacheck25);
        alertaCheckLimpiar(mod7_p28_ck5,listacheck28);
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
        if(data.existeModulo7(idempresa)) {
            //si existe traigo el objeto
            modulo7 = data.getModulo7(idempresa);
            //saco los datos del objeto para llenarlos en los elementos del fragment
            //pregunta 20
            if(!modulo7.getC7_P20().equals("") && !modulo7.getC7_P20().equals("-1")){
                ((RadioButton)mod7_p20_rgb.getChildAt(Integer.parseInt(modulo7.getC7_P20()))).setChecked(true);
            }
            //pregunta 21
            if(!modulo7.getC7_P21().equals("")&& !modulo7.getC7_P21().equals("-1")){
                ((RadioButton)mod7_p21_rgb.getChildAt(Integer.parseInt(modulo7.getC7_P21()))).setChecked(true);
            }

            //---------Pregunta 22-------------
            //Pregunta 22.1
            if (modulo7.getC7_P22_1().equals("1")) mod7_p22_ck1.setChecked(true);
            if (modulo7.getC7_P22_1().equals("0")) mod7_p22_ck1.setChecked(false);
            //Pregunta 22.2
            if (modulo7.getC7_P22_2().equals("1")) mod7_p22_ck2.setChecked(true);
            if (modulo7.getC7_P22_2().equals("0")) mod7_p22_ck2.setChecked(false);
            //Pregunta 22.3
            if (modulo7.getC7_P22_3().equals("1")) mod7_p22_ck3.setChecked(true);
            if (modulo7.getC7_P22_3().equals("0")) mod7_p22_ck3.setChecked(false);
            //Pregunta 22.4
            if (modulo7.getC7_P22_4().equals("1")) mod7_p22_ck4.setChecked(true);
            if (modulo7.getC7_P22_4().equals("0")) mod7_p22_ck4.setChecked(false);
            //Pregunta 22.5
            if (modulo7.getC7_P22_5().equals("1")) mod7_p22_ck5.setChecked(true);
            if (modulo7.getC7_P22_5().equals("0")) mod7_p22_ck5.setChecked(false);
            //Pregunta 22.6
            if (modulo7.getC7_P22_6().equals("1")) mod7_p22_ck6.setChecked(true);
            if (modulo7.getC7_P22_6().equals("0")) mod7_p22_ck6.setChecked(false);
            //Pregunta 22.7
            if (modulo7.getC7_P22_7().equals("1")) mod7_p22_ck7.setChecked(true);
            if (modulo7.getC7_P22_7().equals("0")) mod7_p22_ck7.setChecked(false);
            //Pregunta 22.8
            if (modulo7.getC7_P22_8().equals("1")) mod7_p22_ck8.setChecked(true);
            if (modulo7.getC7_P22_8().equals("0")) mod7_p22_ck8.setChecked(false);
            //Pregunta 22.9
            if (modulo7.getC7_P22_9().equals("1")) mod7_p22_ck9.setChecked(true);
            if (modulo7.getC7_P22_9().equals("0")) mod7_p22_ck9.setChecked(false);
            //Pregunta 22.10
            if (modulo7.getC7_P22_10().equals("1")) mod7_p22_ck10.setChecked(true);
            if (modulo7.getC7_P22_10().equals("0")) mod7_p22_ck10.setChecked(false);
            //Pregunta 22.11
            if (modulo7.getC7_P22_11().equals("1")) mod7_p22_ck11.setChecked(true);
            if (modulo7.getC7_P22_11().equals("0")) mod7_p22_ck11.setChecked(false);
            //Pregunta 22.12
            if (modulo7.getC7_P22_12().equals("1")) mod7_p22_ck12.setChecked(true);
            if (modulo7.getC7_P22_12().equals("0")) mod7_p22_ck12.setChecked(false);
            //Pregunta 22.13
            if (modulo7.getC7_P22_13().equals("1")) mod7_p22_ck13.setChecked(true);
            if (modulo7.getC7_P22_13().equals("0")) mod7_p22_ck13.setChecked(false);
            //Pregunta 22.14
            if (modulo7.getC7_P22_14().equals("1")) mod7_p22_ck14.setChecked(true);
            if (modulo7.getC7_P22_14().equals("0")) mod7_p22_ck14.setChecked(false);
            //Pregunta 22.15
            if (modulo7.getC7_P22_15().equals("1")) mod7_p22_ck15.setChecked(true);
            if (modulo7.getC7_P22_15().equals("0")) mod7_p22_ck15.setChecked(false);
            //Pregunta 22.16
            if (modulo7.getC7_P22_16().equals("1")) mod7_p22_ck16.setChecked(true);
            if (modulo7.getC7_P22_16().equals("0")) mod7_p22_ck16.setChecked(false);
            mod7_p22_edt.setText(modulo7.getC7_P22_16_0());
            //Pregunta 22.17
            if (modulo7.getC7_P22_17().equals("1")) mod7_p22_ck17.setChecked(true);
            if (modulo7.getC7_P22_17().equals("0")) mod7_p22_ck17.setChecked(false);
            //---------Pregunta 23-------------
            //Pregunta 23.1
            if (modulo7.getC7_P23_1().equals("1")) mod7_p23_ck1.setChecked(true);
            if (modulo7.getC7_P23_1().equals("0")) mod7_p23_ck1.setChecked(false);
            //Pregunta 23.2
            if (modulo7.getC7_P23_2().equals("1")) mod7_p23_ck2.setChecked(true);
            if (modulo7.getC7_P23_2().equals("0")) mod7_p23_ck2.setChecked(false);
            //Pregunta 23.3
            if (modulo7.getC7_P23_3().equals("1")) mod7_p23_ck3.setChecked(true);
            if (modulo7.getC7_P23_3().equals("0")) mod7_p23_ck3.setChecked(false);
            //Pregunta 23.4
            if (modulo7.getC7_P23_4().equals("1")) mod7_p23_ck4.setChecked(true);
            if (modulo7.getC7_P23_4().equals("0")) mod7_p23_ck4.setChecked(false);
            //Pregunta 23.5
            if (modulo7.getC7_P23_5().equals("1")) mod7_p23_ck5.setChecked(true);
            if (modulo7.getC7_P23_5().equals("0")) mod7_p23_ck5.setChecked(false);
            //Pregunta 23.6
            if (modulo7.getC7_P23_6().equals("1")) mod7_p23_ck6.setChecked(true);
            if (modulo7.getC7_P23_6().equals("0")) mod7_p23_ck6.setChecked(false);
            //Pregunta 23.7
            if (modulo7.getC7_P23_7().equals("1")) mod7_p23_ck7.setChecked(true);
            if (modulo7.getC7_P23_7().equals("0")) mod7_p23_ck7.setChecked(false);
            //Pregunta 23.8
            if (modulo7.getC7_P23_8().equals("1")) mod7_p23_ck8.setChecked(true);
            if (modulo7.getC7_P23_8().equals("0")) mod7_p23_ck8.setChecked(false);
            //Pregunta 23.9
            if (modulo7.getC7_P23_9().equals("1")) mod7_p23_ck9.setChecked(true);
            if (modulo7.getC7_P23_9().equals("0")) mod7_p23_ck9.setChecked(false);
            //Pregunta 23.10
            if (modulo7.getC7_P23_10().equals("1")) mod7_p23_ck10.setChecked(true);
            if (modulo7.getC7_P23_10().equals("0")) mod7_p23_ck10.setChecked(false);
            mod7_p23_edt.setText(modulo7.getC7_P23_10_0());
            //pregunta 24
            if(!modulo7.getC7_P24().equals("") && !modulo7.getC7_P24().equals("-1")){
                ((RadioButton)mod7_p24_rgb.getChildAt(Integer.parseInt(modulo7.getC7_P24()))).setChecked(true);
            }
            if (modulo7.getC7_P24_1_1().equals("1")) mod7_p24_ck1.setChecked(true);
            if (modulo7.getC7_P24_1_1().equals("0")) mod7_p24_ck1.setChecked(false);
            if (modulo7.getC7_P24_1_2().equals("1")) mod7_p24_ck2.setChecked(true);
            if (modulo7.getC7_P24_1_2().equals("0")) mod7_p24_ck2.setChecked(false);
            if (modulo7.getC7_P24_1_3().equals("1")) mod7_p24_ck3.setChecked(true);
            if (modulo7.getC7_P24_1_3().equals("0")) mod7_p24_ck3.setChecked(false);
            mod7_p24_edt1.setText(modulo7.getC7_P24_2_1());
            mod7_p24_edt2.setText(modulo7.getC7_P24_2_2());
            mod7_p24_edt3.setText(modulo7.getC7_P24_2_3());

            //---------Pregunta 25-------------
            //Pregunta 25.1
            if (modulo7.getC7_P25_1().equals("1")) mod7_p25_ck1.setChecked(true);
            if (modulo7.getC7_P25_1().equals("0")) mod7_p25_ck1.setChecked(false);
            //Pregunta 25.2
            if (modulo7.getC7_P25_2().equals("1")) mod7_p25_ck2.setChecked(true);
            if (modulo7.getC7_P25_2().equals("0")) mod7_p25_ck2.setChecked(false);
            //Pregunta 25.3
            if (modulo7.getC7_P25_3().equals("1")) mod7_p25_ck3.setChecked(true);
            if (modulo7.getC7_P25_3().equals("0")) mod7_p25_ck3.setChecked(false);
            //Pregunta 25.4
            if (modulo7.getC7_P25_4().equals("1")) mod7_p25_ck4.setChecked(true);
            if (modulo7.getC7_P25_4().equals("0")) mod7_p25_ck4.setChecked(false);
            //Pregunta 25.5
            if (modulo7.getC7_P25_5().equals("1")) mod7_p25_ck5.setChecked(true);
            if (modulo7.getC7_P25_5().equals("0")) mod7_p25_ck5.setChecked(false);
            //Pregunta 25.6
            if (modulo7.getC7_P25_6().equals("1")) mod7_p25_ck6.setChecked(true);
            if (modulo7.getC7_P25_6().equals("0")) mod7_p25_ck6.setChecked(false);
            //---------Pregunta 26-------------
            //Pregunta 26.1
            if (modulo7.getC7_P26_1().equals("1")) mod7_p26_ck1.setChecked(true);
            if (modulo7.getC7_P26_1().equals("0")) mod7_p26_ck1.setChecked(false);
            //Pregunta 26.2
            if (modulo7.getC7_P26_2().equals("1")) mod7_p26_ck2.setChecked(true);
            if (modulo7.getC7_P26_2().equals("0")) mod7_p26_ck2.setChecked(false);
            //Pregunta 26.3
            if (modulo7.getC7_P26_3().equals("1")) mod7_p26_ck3.setChecked(true);
            if (modulo7.getC7_P26_3().equals("0")) mod7_p26_ck3.setChecked(false);
            //Pregunta 26.4
            if (modulo7.getC7_P26_4().equals("1")) mod7_p26_ck4.setChecked(true);
            if (modulo7.getC7_P26_4().equals("0")) mod7_p26_ck4.setChecked(false);
            //Pregunta 26.5
            if (modulo7.getC7_P26_5().equals("1")) mod7_p26_ck5.setChecked(true);
            if (modulo7.getC7_P26_5().equals("0")) mod7_p26_ck5.setChecked(false);
            //Pregunta 26.6
            if (modulo7.getC7_P26_6().equals("1")) mod7_p26_ck6.setChecked(true);
            if (modulo7.getC7_P26_6().equals("0")) mod7_p26_ck6.setChecked(false);
            //Pregunta 26.7
            if (modulo7.getC7_P26_7().equals("1")) mod7_p26_ck7.setChecked(true);
            if (modulo7.getC7_P26_7().equals("0")) mod7_p26_ck7.setChecked(false);
            //Pregunta 26.8
            if (modulo7.getC7_P26_8().equals("1")) mod7_p26_ck8.setChecked(true);
            if (modulo7.getC7_P26_8().equals("0")) mod7_p26_ck8.setChecked(false);
            //Pregunta 26.9
            if (modulo7.getC7_P26_9().equals("1")) mod7_p26_ck9.setChecked(true);
            if (modulo7.getC7_P26_9().equals("0")) mod7_p26_ck9.setChecked(false);
            //Pregunta 26.10
            if (modulo7.getC7_P26_10().equals("1")) mod7_p26_ck10.setChecked(true);
            if (modulo7.getC7_P26_10().equals("0")) mod7_p26_ck10.setChecked(false);
            //Pregunta 26.11
            if (modulo7.getC7_P26_11().equals("1")) mod7_p26_ck11.setChecked(true);
            if (modulo7.getC7_P26_11().equals("0")) mod7_p26_ck11.setChecked(false);
            //Pregunta 26.12
            if (modulo7.getC7_P26_12().equals("1")) mod7_p26_ck12.setChecked(true);
            if (modulo7.getC7_P26_12().equals("0")) mod7_p26_ck12.setChecked(false);
            //Pregunta 26.13
            if (modulo7.getC7_P26_13().equals("1")) mod7_p26_ck13.setChecked(true);
            if (modulo7.getC7_P26_13().equals("0")) mod7_p26_ck13.setChecked(false);
            //Pregunta 26.14
            if (modulo7.getC7_P26_14().equals("1")) mod7_p26_ck14.setChecked(true);
            if (modulo7.getC7_P26_14().equals("0")) mod7_p26_ck14.setChecked(false);
            //Pregunta 26.15
            if (modulo7.getC7_P26_15().equals("1")) mod7_p26_ck15.setChecked(true);
            if (modulo7.getC7_P26_15().equals("0")) mod7_p26_ck15.setChecked(false);
            //Pregunta 26.16
            if (modulo7.getC7_P26_16().equals("1")) mod7_p26_ck16.setChecked(true);
            if (modulo7.getC7_P26_16().equals("0")) mod7_p26_ck16.setChecked(false);
            //Pregunta 26.17
            if (modulo7.getC7_P26_17().equals("1")) mod7_p26_ck17.setChecked(true);
            if (modulo7.getC7_P26_17().equals("0")) mod7_p26_ck17.setChecked(false);
            //Pregunta 26.18
            if (modulo7.getC7_P26_18().equals("1")) mod7_p26_ck18.setChecked(true);
            if (modulo7.getC7_P26_18().equals("0")) mod7_p26_ck18.setChecked(false);
            //Pregunta 26.19
            if (modulo7.getC7_P26_19().equals("1")) mod7_p26_ck19.setChecked(true);
            if (modulo7.getC7_P26_19().equals("0")) mod7_p26_ck19.setChecked(false);
            //Pregunta 26.20
            if (modulo7.getC7_P26_20().equals("1")) mod7_p26_ck20.setChecked(true);
            if (modulo7.getC7_P26_20().equals("0")) mod7_p26_ck20.setChecked(false);
            //Pregunta 26.21
            if (modulo7.getC7_P26_21().equals("1")) mod7_p26_ck21.setChecked(true);
            if (modulo7.getC7_P26_21().equals("0")) mod7_p26_ck21.setChecked(false);
            mod7_p26_edt.setText(modulo7.getC7_P26_21_0());
            //Pregunta 26.22
            if (modulo7.getC7_P26_22().equals("1")) mod7_p26_ck22.setChecked(true);
            if (modulo7.getC7_P26_22().equals("0")) mod7_p26_ck22.setChecked(false);

            /////PREGUNTA 27
            mod7_p27_edt.setText(modulo7.getC7_P27());

            ///PREGUNTA 28
            //Pregunta 28.1
            if (modulo7.getC7_P28_1().equals("1")) mod7_p28_ck1.setChecked(true);
            if (modulo7.getC7_P28_1().equals("0")) mod7_p28_ck1.setChecked(false);
            //Pregunta 28.2
            if (modulo7.getC7_P28_2().equals("1")) mod7_p28_ck2.setChecked(true);
            if (modulo7.getC7_P28_2().equals("0")) mod7_p28_ck2.setChecked(false);
            //Pregunta 28.3
            if (modulo7.getC7_P28_3().equals("1")) mod7_p28_ck3.setChecked(true);
            if (modulo7.getC7_P28_3().equals("0")) mod7_p28_ck3.setChecked(false);
            //Pregunta 28.4
            if (modulo7.getC7_P28_4().equals("1")) mod7_p28_ck4.setChecked(true);
            if (modulo7.getC7_P28_4().equals("0")) mod7_p28_ck4.setChecked(false);
            mod7_p28_ck4_edt.setText(modulo7.getC7_P28_4_0());
            //Pregunta 28.5
            if (modulo7.getC7_P28_5().equals("1")) mod7_p28_ck5.setChecked(true);
            if (modulo7.getC7_P28_5().equals("0")) mod7_p28_ck5.setChecked(false);

            /////PREGUNTA 29
            mod7_p29_edt.setText(modulo7.getC7_P29());
            /////PREGUNTA 30
            mod7_p30_edt1.setText(modulo7.getC7_P30_1());
            mod7_p30_edt2.setText(modulo7.getC7_P30_2());
            ////PREGUNTA 31
            if(!modulo7.getC7_P31_1_1().equals("") && !modulo7.getC7_P31_1_1().equals("-1")){
                ((RadioButton)mod7_p31_1_rgb.getChildAt(Integer.parseInt(modulo7.getC7_P31_1_1()))).setChecked(true);
                mod7_p31_1_edt.setText(modulo7.getC7_P31_2_1());
            }
            if(!modulo7.getC7_P31_1_2().equals("") && !modulo7.getC7_P31_1_2().equals("-1")){
                ((RadioButton)mod7_p31_2_rgb.getChildAt(Integer.parseInt(modulo7.getC7_P31_1_2()))).setChecked(true);
                mod7_p31_2_edt.setText(modulo7.getC7_P31_2_2());
            }
            if(!modulo7.getC7_P31_1_3().equals("") && !modulo7.getC7_P31_1_3().equals("-1")){
                ((RadioButton)mod7_p31_3_rgb.getChildAt(Integer.parseInt(modulo7.getC7_P31_1_3()))).setChecked(true);
                mod7_p31_3_edt.setText(modulo7.getC7_P31_2_3());
            }
            if(!modulo7.getC7_P31_1_4().equals("") && !modulo7.getC7_P31_1_4().equals("-1")){
                ((RadioButton)mod7_p31_4_rgb.getChildAt(Integer.parseInt(modulo7.getC7_P31_1_4()))).setChecked(true);
                mod7_p31_4_edt.setText(modulo7.getC7_P31_2_4());
            }
            if(!modulo7.getC7_P31_1_5().equals("") && !modulo7.getC7_P31_1_5().equals("-1")){
                ((RadioButton)mod7_p31_5_rgb.getChildAt(Integer.parseInt(modulo7.getC7_P31_1_5()))).setChecked(true);
                mod7_p31_5_edt.setText(modulo7.getC7_P31_2_5());
            }
            if(!modulo7.getC7_P31_1_6().equals("") && !modulo7.getC7_P31_1_6().equals("-1")){
                ((RadioButton)mod7_p31_6_rgb.getChildAt(Integer.parseInt(modulo7.getC7_P31_1_6()))).setChecked(true);
                mod7_p31_6_edt.setText(modulo7.getC7_P31_2_6());
            }
            if(!modulo7.getC7_P31_1_7().equals("") && !modulo7.getC7_P31_1_7().equals("-1")){
                ((RadioButton)mod7_p31_7_rgb.getChildAt(Integer.parseInt(modulo7.getC7_P31_1_7()))).setChecked(true);
                mod7_p31_7_edt.setText(modulo7.getC7_P31_2_7());
            }
            if(!modulo7.getC7_P31_1_8().equals("") && !modulo7.getC7_P31_1_8().equals("-1")){
                ((RadioButton)mod7_p31_8_rgb.getChildAt(Integer.parseInt(modulo7.getC7_P31_1_8()))).setChecked(true);
                mod7_p31_8_edt.setText(modulo7.getC7_P31_2_8());
            }
            if(!modulo7.getC7_P31_1_9().equals("") && !modulo7.getC7_P31_1_9().equals("-1")){
                ((RadioButton)mod7_p31_9_rgb.getChildAt(Integer.parseInt(modulo7.getC7_P31_1_9()))).setChecked(true);
                mod7_p31_9_edt.setText(modulo7.getC7_P31_2_9());
            }
            ////PREGUNTA 32
            //Pregunta 32.1
            if (modulo7.getC7_P32_1().equals("1")) mod7_p32_ck1.setChecked(true);
            if (modulo7.getC7_P32_1().equals("0")) mod7_p32_ck1.setChecked(false);
            //Pregunta 32.2
            if (modulo7.getC7_P32_2().equals("1")) mod7_p32_ck2.setChecked(true);
            if (modulo7.getC7_P32_2().equals("0")) mod7_p32_ck2.setChecked(false);
            //Pregunta 32.3
            if (modulo7.getC7_P32_3().equals("1")) mod7_p32_ck3.setChecked(true);
            if (modulo7.getC7_P32_3().equals("0")) mod7_p32_ck3.setChecked(false);
            //Pregunta 32.4
            if (modulo7.getC7_P32_4().equals("1")) mod7_p32_ck4.setChecked(true);
            if (modulo7.getC7_P32_4().equals("0")) mod7_p32_ck4.setChecked(false);

            //PREGUNTA 33
            mod7_p33_edt1.setText(modulo7.getC7_P33());

        }
        data.close();
    }
    public void llenarMapaVariables(){
        //PREGUNTA 20
        C7_P20 = mod7_p20_rgb.indexOfChild(mod7_p20_rgb.findViewById(mod7_p20_rgb.getCheckedRadioButtonId()));
        //PREGUNTA 21
        C7_P21 = mod7_p21_rgb.indexOfChild(mod7_p21_rgb.findViewById(mod7_p21_rgb.getCheckedRadioButtonId()));
        //PREGUNTA 22
        if(mod7_p22_ck1.isChecked())C7_P22_1 = 1;
        else C7_P22_1 = 0;
        if(mod7_p22_ck2.isChecked())C7_P22_2 = 1;
        else C7_P22_2 = 0;
        if(mod7_p22_ck3.isChecked())C7_P22_3 = 1;
        else C7_P22_3 = 0;
        if(mod7_p22_ck4.isChecked())C7_P22_4 = 1;
        else C7_P22_4 = 0;
        if(mod7_p22_ck5.isChecked())C7_P22_5 = 1;
        else C7_P22_5 = 0;
        if(mod7_p22_ck6.isChecked())C7_P22_6 = 1;
        else C7_P22_6 = 0;
        if(mod7_p22_ck7.isChecked())C7_P22_7 = 1;
        else C7_P22_7 = 0;
        if(mod7_p22_ck8.isChecked())C7_P22_8 = 1;
        else C7_P22_8 = 0;
        if(mod7_p22_ck9.isChecked())C7_P22_9 = 1;
        else C7_P22_9 = 0;
        if(mod7_p22_ck10.isChecked())C7_P22_10 = 1;
        else C7_P22_10 = 0;
        if(mod7_p22_ck11.isChecked())C7_P22_11 = 1;
        else C7_P22_11 = 0;
        if(mod7_p22_ck12.isChecked())C7_P22_12 = 1;
        else C7_P22_12 = 0;
        if(mod7_p22_ck13.isChecked())C7_P22_13 = 1;
        else C7_P22_13 = 0;
        if(mod7_p22_ck14.isChecked())C7_P22_14 = 1;
        else C7_P22_14 = 0;
        if(mod7_p22_ck15.isChecked())C7_P22_15 = 1;
        else C7_P22_15 = 0;
        if(mod7_p22_ck16.isChecked())C7_P22_16 = 1;
        else C7_P22_16 = 0;
        if(mod7_p22_ck17.isChecked())C7_P22_17 = 1;
        else C7_P22_17 = 0;
        C7_P22_16_0 = mod7_p22_edt.getText().toString();
        //PREGUNTA 23
        if(mod7_p23_ck1.isChecked())C7_P23_1 = 1;
        else C7_P23_1 = 0;
        if(mod7_p23_ck2.isChecked())C7_P23_2 = 1;
        else C7_P23_2 = 0;
        if(mod7_p23_ck3.isChecked())C7_P23_3 = 1;
        else C7_P23_3 = 0;
        if(mod7_p23_ck4.isChecked())C7_P23_4 = 1;
        else C7_P23_4 = 0;
        if(mod7_p23_ck5.isChecked())C7_P23_5 = 1;
        else C7_P23_5 = 0;
        if(mod7_p23_ck6.isChecked())C7_P23_6 = 1;
        else C7_P23_6 = 0;
        if(mod7_p23_ck7.isChecked())C7_P23_7 = 1;
        else C7_P23_7 = 0;
        if(mod7_p23_ck8.isChecked())C7_P23_8 = 1;
        else C7_P23_8 = 0;
        if(mod7_p23_ck9.isChecked())C7_P23_9 = 1;
        else C7_P23_9 = 0;
        if(mod7_p23_ck10.isChecked())C7_P23_10 = 1;
        else C7_P23_10 = 0;
        C7_P23_10_0 = mod7_p23_edt.getText().toString();
        //PREGUNTA 24
        C7_P24 = mod7_p24_rgb.indexOfChild(mod7_p24_rgb.findViewById(mod7_p24_rgb.getCheckedRadioButtonId()));
        if(mod7_p24_ck1.isChecked())C7_P24_1_1 = 1;
        else C7_P24_1_1 = 0;
        if(mod7_p24_ck2.isChecked())C7_P24_1_2 = 1;
        else C7_P24_1_2 = 0;
        if(mod7_p24_ck3.isChecked())C7_P24_1_3 = 1;
        else C7_P24_1_3 = 0;
        C7_P24_2_1 = mod7_p24_edt1.getText().toString();
        C7_P24_2_2 = mod7_p24_edt2.getText().toString();
        C7_P24_2_3 = mod7_p24_edt3.getText().toString();
        //PREGUNRTA 25
        if(mod7_p25_ck1.isChecked())C7_P25_1 = 1;
        else C7_P25_1 = 0;
        if(mod7_p25_ck2.isChecked())C7_P25_2 = 1;
        else C7_P25_2 = 0;
        if(mod7_p25_ck3.isChecked())C7_P25_3 = 1;
        else C7_P25_3 = 0;
        if(mod7_p25_ck4.isChecked())C7_P25_4 = 1;
        else C7_P25_4 = 0;
        if(mod7_p25_ck5.isChecked())C7_P25_5 = 1;
        else C7_P25_5 = 0;
        //PREGUNTA 26
        if(mod7_p26_ck1.isChecked())C7_P26_1 = 1;
        else C7_P26_1 = 0;
        if(mod7_p26_ck2.isChecked())C7_P26_2 = 1;
        else C7_P26_2 = 0;
        if(mod7_p26_ck3.isChecked())C7_P26_3 = 1;
        else C7_P26_3 = 0;
        if(mod7_p26_ck4.isChecked())C7_P26_4 = 1;
        else C7_P26_4 = 0;
        if(mod7_p26_ck5.isChecked())C7_P26_5 = 1;
        else C7_P26_5 = 0;
        if(mod7_p26_ck6.isChecked())C7_P26_6 = 1;
        else C7_P26_6 = 0;
        if(mod7_p26_ck7.isChecked())C7_P26_7 = 1;
        else C7_P26_7 = 0;
        if(mod7_p26_ck8.isChecked())C7_P26_8 = 1;
        else C7_P26_8 = 0;
        if(mod7_p26_ck9.isChecked())C7_P26_9 = 1;
        else C7_P26_9 = 0;
        if(mod7_p26_ck10.isChecked())C7_P26_10 = 1;
        else C7_P26_10 = 0;
        if(mod7_p26_ck11.isChecked())C7_P26_11 = 1;
        else C7_P26_11 = 0;
        if(mod7_p26_ck12.isChecked())C7_P26_12 = 1;
        else C7_P26_12 = 0;
        if(mod7_p26_ck13.isChecked())C7_P26_13 = 1;
        else C7_P26_13 = 0;
        if(mod7_p26_ck14.isChecked())C7_P26_14 = 1;
        else C7_P26_14 = 0;
        if(mod7_p26_ck15.isChecked())C7_P26_15 = 1;
        else C7_P26_15 = 0;
        if(mod7_p26_ck16.isChecked())C7_P26_16 = 1;
        else C7_P26_16 = 0;
        if(mod7_p26_ck17.isChecked())C7_P26_17 = 1;
        else C7_P26_17 = 0;
        if(mod7_p26_ck18.isChecked())C7_P26_18 = 1;
        else C7_P26_18 = 0;
        if(mod7_p26_ck19.isChecked())C7_P26_19 = 1;
        else C7_P26_19 = 0;
        if(mod7_p26_ck20.isChecked())C7_P26_20 = 1;
        else C7_P26_20 = 0;
        if(mod7_p26_ck21.isChecked())C7_P26_21 = 1;
        else C7_P26_21 = 0;
        if(mod7_p26_ck22.isChecked())C7_P26_22 = 1;
        else C7_P26_22 = 0;
        C7_P26_21_0 = mod7_p26_edt.getText().toString();
        //PREGUNTA 27
        C7_P27 = mod7_p27_edt.getText().toString();
        //PREGUNTA 28
        if(mod7_p28_ck1.isChecked())C7_P28_1 = 1;
        else C7_P28_1 = 0;
        if(mod7_p28_ck2.isChecked())C7_P28_2 = 1;
        else C7_P28_2 = 0;
        if(mod7_p28_ck3.isChecked())C7_P28_3 = 1;
        else C7_P28_3 = 0;
        if(mod7_p28_ck4.isChecked())C7_P28_4 = 1;
        else C7_P28_4 = 0;
        if(mod7_p28_ck5.isChecked())C7_P28_5 = 1;
        else C7_P28_5 = 0;
        C7_P28_4_0 = mod7_p28_ck4_edt.getText().toString();
        //PREGUNTA 29
        C7_P29 = mod7_p29_edt.getText().toString();
        //PREGUNTA30
        C7_P30_1 = mod7_p30_edt1.getText().toString();
        C7_P30_2 = mod7_p30_edt2.getText().toString();
        //PREGUNTA 31
        C7_P31_1_1 = mod7_p31_1_rgb.indexOfChild(mod7_p31_1_rgb.findViewById(mod7_p31_1_rgb.getCheckedRadioButtonId()));
        C7_P31_1_2 = mod7_p31_2_rgb.indexOfChild(mod7_p31_2_rgb.findViewById(mod7_p31_2_rgb.getCheckedRadioButtonId()));
        C7_P31_1_3 = mod7_p31_3_rgb.indexOfChild(mod7_p31_3_rgb.findViewById(mod7_p31_3_rgb.getCheckedRadioButtonId()));
        C7_P31_1_4 = mod7_p31_4_rgb.indexOfChild(mod7_p31_4_rgb.findViewById(mod7_p31_4_rgb.getCheckedRadioButtonId()));
        C7_P31_1_5 = mod7_p31_5_rgb.indexOfChild(mod7_p31_5_rgb.findViewById(mod7_p31_5_rgb.getCheckedRadioButtonId()));
        C7_P31_1_6 = mod7_p31_6_rgb.indexOfChild(mod7_p31_6_rgb.findViewById(mod7_p31_6_rgb.getCheckedRadioButtonId()));
        C7_P31_1_7 = mod7_p31_7_rgb.indexOfChild(mod7_p31_7_rgb.findViewById(mod7_p31_7_rgb.getCheckedRadioButtonId()));
        C7_P31_1_8 = mod7_p31_8_rgb.indexOfChild(mod7_p31_8_rgb.findViewById(mod7_p31_8_rgb.getCheckedRadioButtonId()));
        C7_P31_1_9 = mod7_p31_9_rgb.indexOfChild(mod7_p31_9_rgb.findViewById(mod7_p31_9_rgb.getCheckedRadioButtonId()));
        C7_P31_2_1 = mod7_p31_1_edt.getText().toString();
        C7_P31_2_2 = mod7_p31_2_edt.getText().toString();
        C7_P31_2_3 = mod7_p31_3_edt.getText().toString();
        C7_P31_2_4 = mod7_p31_4_edt.getText().toString();
        C7_P31_2_5 = mod7_p31_5_edt.getText().toString();
        C7_P31_2_6 = mod7_p31_6_edt.getText().toString();
        C7_P31_2_7 = mod7_p31_7_edt.getText().toString();
        C7_P31_2_8 = mod7_p31_8_edt.getText().toString();
        C7_P31_2_9 = mod7_p31_9_edt.getText().toString();
        //PREGUNTA 32
        if(mod7_p32_ck1.isChecked())C7_P32_1 = 1;
        else C7_P32_1 = 0;
        if(mod7_p32_ck2.isChecked())C7_P32_2 = 1;
        else C7_P32_2 = 0;
        if(mod7_p32_ck3.isChecked())C7_P32_3 = 1;
        else C7_P32_3 = 0;
        if(mod7_p32_ck4.isChecked())C7_P32_4 = 1;
        else C7_P32_4 = 0;
        //PREGUNTA 33
        C7_P33 = mod7_p33_edt1.getText().toString();

    }

    public void guardarDatos(){
        data = new Data(context);
        data.open();
        ContentValues contentValues = new ContentValues(255);
        contentValues.put(SQLConstantes.MODULO7_P20,C7_P20+"");
        contentValues.put(SQLConstantes.MODULO7_P21,C7_P21+"");
        contentValues.put(SQLConstantes.MODULO7_P22_1,C7_P22_1+"");
        contentValues.put(SQLConstantes.MODULO7_P22_2,C7_P22_2+"");
        contentValues.put(SQLConstantes.MODULO7_P22_3,C7_P22_3+"");
        contentValues.put(SQLConstantes.MODULO7_P22_4,C7_P22_4+"");
        contentValues.put(SQLConstantes.MODULO7_P22_5,C7_P22_5+"");
        contentValues.put(SQLConstantes.MODULO7_P22_6,C7_P22_6+"");
        contentValues.put(SQLConstantes.MODULO7_P22_7,C7_P22_7+"");
        contentValues.put(SQLConstantes.MODULO7_P22_8,C7_P22_8+"");
        contentValues.put(SQLConstantes.MODULO7_P22_9,C7_P22_9+"");
        contentValues.put(SQLConstantes.MODULO7_P22_10,C7_P22_10+"");
        contentValues.put(SQLConstantes.MODULO7_P22_11,C7_P22_11+"");
        contentValues.put(SQLConstantes.MODULO7_P22_12,C7_P22_12+"");
        contentValues.put(SQLConstantes.MODULO7_P22_13,C7_P22_13+"");
        contentValues.put(SQLConstantes.MODULO7_P22_14,C7_P22_14+"");
        contentValues.put(SQLConstantes.MODULO7_P22_15,C7_P22_15+"");
        contentValues.put(SQLConstantes.MODULO7_P22_16,C7_P22_16+"");
        contentValues.put(SQLConstantes.MODULO7_P22_16_0,C7_P22_16_0);
        contentValues.put(SQLConstantes.MODULO7_P22_17,C7_P22_17+"");
        contentValues.put(SQLConstantes.MODULO7_P23_1,C7_P23_1+"");
        contentValues.put(SQLConstantes.MODULO7_P23_2,C7_P23_2+"");
        contentValues.put(SQLConstantes.MODULO7_P23_3,C7_P23_3+"");
        contentValues.put(SQLConstantes.MODULO7_P23_4,C7_P23_4+"");
        contentValues.put(SQLConstantes.MODULO7_P23_5,C7_P23_5+"");
        contentValues.put(SQLConstantes.MODULO7_P23_6,C7_P23_6+"");
        contentValues.put(SQLConstantes.MODULO7_P23_7,C7_P23_7+"");
        contentValues.put(SQLConstantes.MODULO7_P23_8,C7_P23_8+"");
        contentValues.put(SQLConstantes.MODULO7_P23_9,C7_P23_9+"");
        contentValues.put(SQLConstantes.MODULO7_P23_10,C7_P23_10+"");
        contentValues.put(SQLConstantes.MODULO7_P23_10_0,C7_P23_10_0);
        contentValues.put(SQLConstantes.MODULO7_P24,C7_P24+"");
        contentValues.put(SQLConstantes.MODULO7_P24_1_1,C7_P24_1_1+"");
        contentValues.put(SQLConstantes.MODULO7_P24_1_2,C7_P24_1_2+"");
        contentValues.put(SQLConstantes.MODULO7_P24_1_3,C7_P24_1_3+"");
        contentValues.put(SQLConstantes.MODULO7_P24_2_1,C7_P24_2_1);
        contentValues.put(SQLConstantes.MODULO7_P24_2_2,C7_P24_2_2);
        contentValues.put(SQLConstantes.MODULO7_P24_2_3,C7_P24_2_3);
        contentValues.put(SQLConstantes.MODULO7_P25_1,C7_P25_1+"");
        contentValues.put(SQLConstantes.MODULO7_P25_2,C7_P25_2+"");
        contentValues.put(SQLConstantes.MODULO7_P25_3,C7_P25_3+"");
        contentValues.put(SQLConstantes.MODULO7_P25_4,C7_P25_4+"");
        contentValues.put(SQLConstantes.MODULO7_P25_5,C7_P25_5+"");
        contentValues.put(SQLConstantes.MODULO7_P26_1,C7_P26_1+"");
        contentValues.put(SQLConstantes.MODULO7_P26_2,C7_P26_2+"");
        contentValues.put(SQLConstantes.MODULO7_P26_3,C7_P26_3+"");
        contentValues.put(SQLConstantes.MODULO7_P26_4,C7_P26_4+"");
        contentValues.put(SQLConstantes.MODULO7_P26_5,C7_P26_5+"");
        contentValues.put(SQLConstantes.MODULO7_P26_6,C7_P26_6+"");
        contentValues.put(SQLConstantes.MODULO7_P26_7,C7_P26_7+"");
        contentValues.put(SQLConstantes.MODULO7_P26_8,C7_P26_8+"");
        contentValues.put(SQLConstantes.MODULO7_P26_9,C7_P26_9+"");
        contentValues.put(SQLConstantes.MODULO7_P26_10,C7_P26_10+"");
        contentValues.put(SQLConstantes.MODULO7_P26_11,C7_P26_11+"");
        contentValues.put(SQLConstantes.MODULO7_P26_12,C7_P26_12+"");
        contentValues.put(SQLConstantes.MODULO7_P26_13,C7_P26_13+"");
        contentValues.put(SQLConstantes.MODULO7_P26_14,C7_P26_14+"");
        contentValues.put(SQLConstantes.MODULO7_P26_15,C7_P26_15+"");
        contentValues.put(SQLConstantes.MODULO7_P26_16,C7_P26_16+"");
        contentValues.put(SQLConstantes.MODULO7_P26_17,C7_P26_17+"");
        contentValues.put(SQLConstantes.MODULO7_P26_18,C7_P26_18+"");
        contentValues.put(SQLConstantes.MODULO7_P26_19,C7_P26_19+"");
        contentValues.put(SQLConstantes.MODULO7_P26_20,C7_P26_20+"");
        contentValues.put(SQLConstantes.MODULO7_P26_21,C7_P26_21+"");
        contentValues.put(SQLConstantes.MODULO7_P26_21_0,C7_P26_21_0);
        contentValues.put(SQLConstantes.MODULO7_P26_22,C7_P26_22+"");
        contentValues.put(SQLConstantes.MODULO7_P27,C7_P27);
        contentValues.put(SQLConstantes.MODULO7_P28_1,C7_P28_1+"");
        contentValues.put(SQLConstantes.MODULO7_P28_2,C7_P28_2+"");
        contentValues.put(SQLConstantes.MODULO7_P28_3,C7_P28_3+"");
        contentValues.put(SQLConstantes.MODULO7_P28_4,C7_P28_4+"");
        contentValues.put(SQLConstantes.MODULO7_P28_4_0,C7_P28_4_0);
        contentValues.put(SQLConstantes.MODULO7_P28_5,C7_P28_5+"");
        contentValues.put(SQLConstantes.MODULO7_P29,C7_P29);
        contentValues.put(SQLConstantes.MODULO7_P30_1,C7_P30_1);
        contentValues.put(SQLConstantes.MODULO7_P30_2,C7_P30_2);
        contentValues.put(SQLConstantes.MODULO7_P31_1_1,C7_P31_1_1+"");
        contentValues.put(SQLConstantes.MODULO7_P31_1_2,C7_P31_1_2+"");
        contentValues.put(SQLConstantes.MODULO7_P31_1_3,C7_P31_1_3+"");
        contentValues.put(SQLConstantes.MODULO7_P31_1_4,C7_P31_1_4+"");
        contentValues.put(SQLConstantes.MODULO7_P31_1_5,C7_P31_1_5+"");
        contentValues.put(SQLConstantes.MODULO7_P31_1_6,C7_P31_1_6+"");
        contentValues.put(SQLConstantes.MODULO7_P31_1_7,C7_P31_1_7+"");
        contentValues.put(SQLConstantes.MODULO7_P31_1_8,C7_P31_1_8+"");
        contentValues.put(SQLConstantes.MODULO7_P31_1_9,C7_P31_1_9+"");
        contentValues.put(SQLConstantes.MODULO7_P31_2_1,C7_P31_2_1);
        contentValues.put(SQLConstantes.MODULO7_P31_2_2,C7_P31_2_2);
        contentValues.put(SQLConstantes.MODULO7_P31_2_3,C7_P31_2_3);
        contentValues.put(SQLConstantes.MODULO7_P31_2_4,C7_P31_2_4);
        contentValues.put(SQLConstantes.MODULO7_P31_2_5,C7_P31_2_5);
        contentValues.put(SQLConstantes.MODULO7_P31_2_6,C7_P31_2_6);
        contentValues.put(SQLConstantes.MODULO7_P31_2_7,C7_P31_2_7);
        contentValues.put(SQLConstantes.MODULO7_P31_2_8,C7_P31_2_8);
        contentValues.put(SQLConstantes.MODULO7_P31_2_9,C7_P31_2_9);
        contentValues.put(SQLConstantes.MODULO7_P32_1,C7_P32_1+"");
        contentValues.put(SQLConstantes.MODULO7_P32_2,C7_P32_2+"");
        contentValues.put(SQLConstantes.MODULO7_P32_3,C7_P32_3+"");
        contentValues.put(SQLConstantes.MODULO7_P32_4,C7_P32_4+"");
        contentValues.put(SQLConstantes.MODULO7_P33,C7_P33);

        data.actualizarModulo7(idempresa,contentValues);
        data.close();
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
    public boolean validar(){
        //revisarcampos
        boolean valido = true;
        llenarMapaVariables();

        /*
        boolean vC7_P20 = false; boolean vC7_P21=false; boolean vC7_P22=false; boolean vC7_P23=false;
        boolean vC7_P24=false; boolean vC7_P25=false; boolean vC7_P26=false; boolean vC7_P27=false; boolean vC7_P28=false;
        boolean vC7_P29=false; boolean vC7_P30=false; boolean vC7_P31=false;
        boolean vC7_P32=false; boolean vC7_P33=false;

        //p20
        if(C7_P20 >= 0 && C7_P20 <= 1){
            vC7_P20=true;}
        //p21
        if(C7_P21 >= 0 && C7_P21 <= 1){
            vC7_P21=true;}
        //p22
        if(C7_P20 == 1 && C7_P21 == 1) {
            if (C7_P22_17 != 0) {
                vC7_P22 = true;
            }else {
                Integer[] checkBoxsP22 = {C7_P22_1, C7_P22_2, C7_P22_3, C7_P22_4, C7_P22_5, C7_P22_6, C7_P22_7,
                        C7_P22_8, C7_P22_9, C7_P22_10, C7_P22_11, C7_P22_12, C7_P22_13, C7_P22_14, C7_P22_15, C7_P22_16};
                for (Integer i : checkBoxsP22) {
                    if (i != 0) {
                        if (C7_P22_16 != 0) {
                            if (!C7_P22_16_0.equals("") && C7_P22_16_0.trim().length() >= 3) {
                                vC7_P22 = true;
                            }
                        } else vC7_P22 = true;

                    }
                }
            }
        }else vC7_P22 = true;

        //p23
        Integer[] checkBoxsP23= {C7_P23_1,C7_P23_2, C7_P23_3, C7_P23_4, C7_P23_5, C7_P23_6,C7_P23_7,
                C7_P23_8, C7_P23_9, C7_P23_10};
        for (Integer i: checkBoxsP23 ) {
            if(i!=0){
                if (C7_P23_10!=0){
                    if(!C7_P23_10_0.equals("") && C7_P23_10_0.trim().length()>=3){
                        vC7_P23=true;
                    }
                }else vC7_P23=true;
            }
        }
        //p24
        if(C7_P24 == 0 ){
            Integer[] checkBoxsP24= {C7_P24_1_1,C7_P24_1_2, C7_P24_1_3};
            for (Integer i: checkBoxsP24 ) {
                if(C7_P24_1_1!=0){
                    if(!C7_P24_2_1.equals("") && C7_P24_2_1.trim().length()>=3){
                        vC7_P24=true;
                    }
                }
                if(C7_P24_1_2!=0){
                    if(!C7_P24_2_2.equals("") && C7_P24_2_2.trim().length()>=3){
                        vC7_P24=true;
                    }
                }
                if(C7_P24_1_3!=0){
                    if(!C7_P24_2_3.equals("") && C7_P24_2_3.trim().length()>=3){
                        vC7_P24=true;
                    }
                }
            }
        }else  vC7_P24=true;

        //p25
        if(C7_P25_6 != 0) {
            Integer[] checkBoxsP25 = {C7_P25_1, C7_P25_2, C7_P25_3, C7_P25_4, C7_P25_5};
            for (Integer i : checkBoxsP25) {
                if (i != 0) vC7_P25 = true;
            }
        }else vC7_P25 = true;

        //p26
        if(C7_P20 == 0 || C7_P21 == 0) {
            if (C7_P26_22 != 0) {
                vC7_P26 = true;
            }else {
                Integer[] checkBoxsP26 = {C7_P26_1, C7_P26_2, C7_P26_3, C7_P26_4, C7_P26_5, C7_P26_6, C7_P26_7,
                        C7_P26_8, C7_P26_9, C7_P26_10, C7_P26_11, C7_P26_12, C7_P26_13, C7_P26_14, C7_P26_15, C7_P26_16
                        , C7_P26_17,C7_P26_18, C7_P26_19, C7_P26_20, C7_P26_21};
                for (Integer i : checkBoxsP26) {
                    if (i != 0) {
                        if (C7_P26_21 != 0) {
                            if (!C7_P26_21_0.equals("") && C7_P26_21_0.trim().length() >= 3) {
                                vC7_P26 = true;
                            }
                        } else vC7_P26 = true;

                    }
                }
            }
        }else vC7_P26 = true;

        //p27
        if(C7_P26_1 != 0 || C7_P26_2 != 0){
            if (!C7_P27.equals("") && C7_P27.trim().length() >= 3) vC7_P27 = true;
        }else vC7_P27 = true;
        //p28
        if(C7_P28_5 != 0) {
            Integer[] checkBoxsP25 = {C7_P28_1, C7_P28_2, C7_P28_3, C7_P28_4};
            for (Integer i : checkBoxsP25) {
                if (i != 0) {
                    if(C7_P28_4!=0){
                        if (!C7_P28_4_0.equals("") && C7_P28_4_0.trim().length() >= 3) {
                            vC7_P28 = true; }
                    }else vC7_P28 = true;
                }
            }
        }else vC7_P28 = true;

        //p29
        if(C7_P20 == 0 || C7_P21 == 0){
            if (!C7_P29.equals("") && C7_P29.trim().length() >= 3) vC7_P29 = true;
        }else vC7_P29 = true;

        //p30
        if(C7_P20 == 0 || C7_P21 == 0){
            if (!C7_P30_1.equals("") && C7_P30_1.trim().length() >= 3) vC7_P30 = true;
        }else vC7_P30 = true;

        //p31

        if(C7_P20 == 0 || C7_P21 == 0) {
            boolean vC7_P31_1_1=false;
            boolean vC7_P31_1_2=false; boolean vC7_P31_1_3=false; boolean vC7_P31_1_4=false; boolean vC7_P31_1_5=false;
            boolean vC7_P31_1_6=false; boolean vC7_P31_1_7=false; boolean vC7_P31_1_8=false; boolean vC7_P31_1_9=false;
            Integer[] radiogroup31 = {C7_P31_1_1, C7_P31_1_2, C7_P31_1_3, C7_P31_1_4, C7_P31_1_5,C7_P31_1_6,
                    C7_P31_1_7, C7_P31_1_8, C7_P31_1_9};
            String[] editText31 = {C7_P31_2_1, C7_P31_2_2, C7_P31_2_3, C7_P31_2_4, C7_P31_2_5,C7_P31_2_6,
                    C7_P31_2_7, C7_P31_2_8, C7_P31_2_9};
            Boolean[] vp31={false, false, false, false, false,
                    false,false, false, false};
            for (int i=0 ; i<radiogroup31.length;i++) {
                if (radiogroup31[i] == 0 ) {
                    if (!editText31[i].equals("") && editText31[i].trim().length() >= 3) {
                        vp31[i]=true;
                    }
                }else if(radiogroup31[i]==1){
                    vp31[i]=true;
                }
            }
            vC7_P31 =vp31[0] && vp31[1] && vp31[2] && vp31[3] &&vp31[4] &&vp31[5] &&vp31[6] &&vp31[7] &&vp31[8] ;

        } else vC7_P31 = true;

        //p32
        if(C7_P20 == 0 || C7_P21 == 0) {
            Integer[] checkBoxsP25 = {C7_P32_1, C7_P32_2, C7_P32_3, C7_P32_4};
            for (Integer i : checkBoxsP25) {
                if (i != 0) vC7_P32 = true;
            }
        }else vC7_P32 = true;

        //p33
        if(C7_P20 == 0 || C7_P21 == 0){
            if (!C7_P33.equals("") && C7_P33.trim().length() >= 3) vC7_P33 = true;
        }else vC7_P33 = true;

        valido =  vC7_P20 && vC7_P21
//                && vC7_P22 && vC7_P23 && vC7_P24 && vC7_P25 && vC7_P26 && vC7_P27 &&
//                vC7_P28 && vC7_P29 && vC7_P30  && vC7_P32 && vC7_P31 && vC7_P33
        ;
        if(!valido){
            Toast.makeText(context, "DEBE LLENAR TODOS LOS DATOS", Toast.LENGTH_SHORT).show();
        }*/

        Integer[] checkBoxsP28= {C7_P28_1,C7_P28_2, C7_P28_3, C7_P28_4, C7_P28_5};
        Integer[] checkBoxsP22= {C7_P22_1,C7_P22_2, C7_P22_3, C7_P22_4, C7_P22_5,
                C7_P22_16,C7_P22_7, C7_P22_8, C7_P22_9, C7_P22_10,
                C7_P22_11,C7_P22_12, C7_P22_13, C7_P22_14, C7_P22_15,C7_P22_16,C7_P22_17 };
        Integer[] checkBoxsP23= {C7_P23_1,C7_P23_2, C7_P23_3, C7_P23_4, C7_P23_5,
                C7_P23_6,C7_P23_7, C7_P23_8, C7_P23_9, C7_P23_10};
        Integer[] checkBoxsP25= {C7_P25_1,C7_P25_2, C7_P25_3, C7_P25_4, C7_P25_5,
                C7_P25_6};
        Integer[] checkBoxsP26= {C7_P26_1,C7_P26_2, C7_P26_3, C7_P26_4, C7_P26_5,
                C7_P26_6,C7_P26_7,C7_P26_8, C7_P26_9, C7_P26_10, C7_P26_11,
                C7_P26_12,C7_P26_13,C7_P26_14, C7_P26_15, C7_P26_16, C7_P26_17,
                C7_P26_18,C7_P26_19, C7_P26_20, C7_P26_21, C7_P26_22  };
        Integer[] checkBoxsP32= {C7_P32_1,C7_P32_2, C7_P32_3, C7_P32_4};

        boolean vC7_P28=true,vC7_P22=true,vC7_P23=true,vC7_P25=true,vC7_P26=true,vC7_P32=true;

        for (Integer valor:checkBoxsP28 ) {
            if(valor==1)vC7_P28=false;
        }

        for (Integer valor:checkBoxsP22 ) {
            if(valor==1)vC7_P22=false;
        }

        for (Integer valor:checkBoxsP23 ) {
            if(valor==1)vC7_P23=false;
        }

        for (Integer valor:checkBoxsP25 ) {
            if(valor==1)vC7_P25=false;
        }

        for (Integer valor:checkBoxsP26 ) {
            if(valor==1)vC7_P26=false;
        }

        for (Integer valor:checkBoxsP32 ) {
            if(valor==1)vC7_P32=false;
        }

        if(C7_P20 == -1){
            mostrarMensaje("Pregunta 20: Debe seleccionar una opción");
            valido=false;
        }else if(C7_P21 == -1){
            mostrarMensaje("Pregunta 21: Debe seleccionar una opción");
            valido=false;
        }else if((C7_P20 == 1 && C7_P21 == 1) && vC7_P22 ){
            mostrarMensaje("Pregunta 22: No registra razones para no organizar ni financiar la capacitación");
            valido=false;
        }else if((C7_P20 == 1 && C7_P21 == 1) && C7_P22_16 == 1 && C7_P22_16_0.trim().length() < 3){
            mostrarMensaje("Pregunta 22: Debe registrar información válida en Especifique");
            valido=false;
        }else if(vC7_P23){
            mostrarMensaje("Pregunta 23: Debe seleccionar una o más opciones");
            valido=false;
        }else if(C7_P23_10 == 1 && C7_P23_10_0.trim().length() < 3){
            mostrarMensaje("Pregunta 23: Debe registrar información válida en Especifique");
            valido=false;
        }else if(C7_P24 == -1 ){
            mostrarMensaje("Pregunta 24: Debe seleccionar una opción");
            valido=false;
        }else if(C7_P24 == 0 && C7_P24_1_1==0  && C7_P24_1_2==0 && C7_P24_1_3==0 ){
            mostrarMensaje("Pregunta 24: Debe ingresar por lo menos una entidad");
            valido=false;
        }else if(C7_P24 == 0 && C7_P24_1_1 == 1 && C7_P24_2_1.trim().length()<3 ){
            mostrarMensaje("Pregunta 24.1: Debe registrar nombre de Entidad");
            valido=false;
        }else if(C7_P24 == 0 && C7_P24_1_2 == 1 && C7_P24_2_2.trim().length()<3 ){
            mostrarMensaje("Pregunta 24.2: Debe registrar nombre de Entidad");
            valido=false;
        }else if(C7_P24 == 0 && C7_P24_1_3 == 1 && C7_P24_2_3.trim().length()<3 ){
            mostrarMensaje("Pregunta 24.3: Debe registrar nombre de Entidad");
            valido=false;
        }else if(C7_P24==1 && vC7_P25){
            mostrarMensaje("Pregunta 25: Debe seleccionar una o más opciones");
            valido=false;
        }else if(!(C7_P20 == 1 && C7_P21 == 1) && vC7_P26){
            mostrarMensaje("Pregunta 26: Debe seleccionar una o más opciones");
            valido=false;
        }else if(!(C7_P20 == 1 && C7_P21 == 1) && C7_P26_21 == 1 && C7_P26_21_0.trim().length() < 3){
            mostrarMensaje("Pregunta 26: Debe registrar información válida en Especifique");
            valido=false;
        }else if( (C7_P26_1 == 1 || C7_P26_2 == 1) && C7_P27.equals("") ){
            mostrarMensaje("Pregunta 27: Debe registrar porcentaje");
            valido=false;
        }else if(vC7_P28){
            mostrarMensaje("Pregunta 28: Debe registrar acciones para el desarrollo de sus trabajadores");
            valido=false;
        }else if(C7_P28_4 == 1 && C7_P28_4_0.trim().length() < 3){
            mostrarMensaje("Pregunta 28: Debe registrar información válida en Especifique");
            valido=false;
        }else if( (C7_P20 == 0 || C7_P21 == 0) && C7_P29.equals("") ){
            mostrarMensaje("Pregunta 29: Debe registrar porcentaje");
            valido=false;
        }else if(!(C7_P20 == 1 && C7_P21 == 1) && C7_P30_1.trim().length() == 0 && C7_P30_2.trim().length() == 0){
            mostrarMensaje("Pregunta 30: Debe registrar número o porcentaje");
            valido=false;
        }else if( (C7_P20 == 0 || C7_P21 == 0) && C7_P31_1_1 ==-1 ){
            mostrarMensaje("Pregunta 31.1: Debe seleccionar una opción");
            valido=false;
        }else if( (C7_P20 == 0 || C7_P21 == 0) && C7_P31_1_1 ==0 && C7_P31_2_1.equals("") ){
            mostrarMensaje("Pregunta 31.1: Debe registrar porcentaje de los trabajadores");
            valido=false;
        }else if( (C7_P20 == 0 || C7_P21 == 0) && C7_P31_1_2 ==-1 ){
            mostrarMensaje("Pregunta 31.2: Debe seleccionar una opción");
            valido=false;
        }else if( (C7_P20 == 0 || C7_P21 == 0) && C7_P31_1_2 ==0 && C7_P31_2_2.equals("") ){
            mostrarMensaje("Pregunta 31.2: Debe registrar porcentaje de los trabajadores");
            valido=false;
        }else if( (C7_P20 == 0 || C7_P21 == 0) && C7_P31_1_3 ==-1 ){
            mostrarMensaje("Pregunta 31.3: Debe seleccionar una opción");
            valido=false;
        }else if( (C7_P20 == 0 || C7_P21 == 0) && C7_P31_1_3 ==0 && C7_P31_2_3.equals("")){
            mostrarMensaje("Pregunta 31.3: Debe registrar porcentaje de los trabajadores");
            valido=false;
        }else if( (C7_P20 == 0 || C7_P21 == 0) && C7_P31_1_4 ==-1 ){
            mostrarMensaje("Pregunta 31.4: Debe seleccionar una opción");
            valido=false;
        }else if( (C7_P20 == 0 || C7_P21 == 0) && C7_P31_1_4 ==0 && C7_P31_2_4.equals("")){
            mostrarMensaje("Pregunta 31.4: Debe registrar porcentaje de los trabajadores");
            valido=false;
        }else if( (C7_P20 == 0 || C7_P21 == 0) && C7_P31_1_5 ==-1 ){
            mostrarMensaje("Pregunta 31.5: Debe seleccionar una opción");
            valido=false;
        }else if( (C7_P20 == 0 || C7_P21 == 0) && C7_P31_1_5 ==0 && C7_P31_2_5.equals("") ){
            mostrarMensaje("Pregunta 31.5: Debe registrar porcentaje de los trabajadores");
            valido=false;
        }else if( (C7_P20 == 0 || C7_P21 == 0) && C7_P31_1_6 ==-1 ){
            mostrarMensaje("Pregunta 31.6: Debe seleccionar una opción");
            valido=false;
        }else if( (C7_P20 == 0 || C7_P21 == 0) && C7_P31_1_6 ==0 && C7_P31_2_6.equals("") ){
            mostrarMensaje("Pregunta 31.6: Debe registrar porcentaje de los trabajadores");
            valido=false;
        }else if( (C7_P20 == 0 || C7_P21 == 0) && C7_P31_1_7 ==-1 ){
            mostrarMensaje("Pregunta 31.7: Debe seleccionar una opción");
            valido=false;
        }else if( (C7_P20 == 0 || C7_P21 == 0) && C7_P31_1_7 ==0 && C7_P31_2_7.equals("")){
            mostrarMensaje("Pregunta 31.7: Debe registrar porcentaje de los trabajadores");
            valido=false;
        }else if( (C7_P20 == 0 || C7_P21 == 0) && C7_P31_1_8 ==-1 ){
            mostrarMensaje("Pregunta 31.8: Debe seleccionar una opción");
            valido=false;
        }else if( (C7_P20 == 0 || C7_P21 == 0) && C7_P31_1_8 ==0 && C7_P31_2_8.equals("")){
            mostrarMensaje("Pregunta 31.1: Debe registrar porcentaje de los trabajadores");
            valido=false;
        }else if( (C7_P20 == 0 || C7_P21 == 0) && C7_P31_1_9 ==-1 ){
            mostrarMensaje("Pregunta 31.9: Debe seleccionar una opción");
            valido=false;
        }else if( (C7_P20 == 0 || C7_P21 == 0) && C7_P31_1_9 ==0 && C7_P31_2_9.equals("")){
            mostrarMensaje("Pregunta 31.9: Debe registrar porcentaje de los trabajadores");
            valido=false;
        }else if( (C7_P20 == 0 || C7_P21 == 0) && vC7_P32){
            mostrarMensaje("Pregunta 32: Debe seleccionar una o más opciones");
            valido=false;
        }else if( (C7_P20 == 0 || C7_P21 == 0) && (C7_P33.equals("") || C7_P33.equals("0"))){
            mostrarMensaje("Pregunta 33: Debe registrar horas de capacitación promedio");
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
