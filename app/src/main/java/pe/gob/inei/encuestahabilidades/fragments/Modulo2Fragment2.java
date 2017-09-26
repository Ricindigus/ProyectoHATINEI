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
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import org.w3c.dom.Text;

import pe.gob.inei.encuestahabilidades.NumericKeyBoardTransformationMethod;
import pe.gob.inei.encuestahabilidades.R;
import pe.gob.inei.encuestahabilidades.TablaFragmentos;
import pe.gob.inei.encuestahabilidades.modelo.Data;
import pe.gob.inei.encuestahabilidades.modelo.SQLConstantes;
import pe.gob.inei.encuestahabilidades.pojos.BaseDatos;
import pe.gob.inei.encuestahabilidades.pojos.Modulo2;

/**
 * A simple {@link Fragment} subclass.
 */
public class Modulo2Fragment2 extends Fragment {

    private LinearLayout lytP6;
    private LinearLayout lytP7;
    private LinearLayout lytP8;
    private LinearLayout lytP9;
    private LinearLayout lytP10;
    private LinearLayout lytP11;
    private LinearLayout lytP12;
    private LinearLayout lytP13;

    private RadioGroup rgP6;

    private CheckBox ck1P8;
    private CheckBox ck2P8;
    private CheckBox ck1P9;
    private CheckBox ck2P9;
    private CheckBox ck3P9;
    private CheckBox ck4P9;
    private CheckBox ck5P9;

    private EditText edtP7;
    private EditText edt1P8;
    private EditText edt2P8;
    private EditText edt1P9;
    private EditText edt2P9;
    private EditText edt3P9;
    private EditText edt4P9;
    private EditText edt5P9;
    private EditText edtEspecifiqueP9;

    private TextView totalP8;
    private TextView totalP9;

    private LinearLayout lytSp1P10;
    private LinearLayout lytSp2P10;
    private LinearLayout lytSp3P10;
    private LinearLayout lytSp4P10;
    private LinearLayout lytSp5P10;
    private LinearLayout lytSp6P10;

    private LinearLayout lytSp1P11;
    private LinearLayout lytSp2P11;
    private LinearLayout lytSp3P11;
    private LinearLayout lytSp4P11;
    private LinearLayout lytSp5P11;
    private LinearLayout lytSp6P11;
    private LinearLayout lytSp7P11;

    private LinearLayout lytSp1P13;
    private LinearLayout lytSp2P13;
    private LinearLayout lytSp3P13;
    private LinearLayout lytSp4P13;
    private LinearLayout lytSp5P13;
    private LinearLayout lytSp6P13;
    private LinearLayout lytSp7P13;


    private Spinner sp2P10;
    private Spinner sp3P10;
    private Spinner sp4P10;
    private Spinner sp5P10;
    private Spinner sp6P10;

    private Spinner sp2P11;
    private Spinner sp3P11;
    private Spinner sp4P11;
    private Spinner sp5P11;
    private Spinner sp6P11;
    private Spinner sp7P11;

    private Spinner sp2P13;
    private Spinner sp3P13;
    private Spinner sp4P13;
    private Spinner sp5P13;
    private Spinner sp6P13;
    private Spinner sp7P13;

    private CheckBox ck1P10;
    private CheckBox ck2P10;
    private CheckBox ck3P10;
    private CheckBox ck4P10;
    private CheckBox ck5P10;
    private CheckBox ck6P10;

    private CheckBox ck1P11;
    private CheckBox ck2P11;
    private CheckBox ck3P11;
    private CheckBox ck4P11;
    private CheckBox ck5P11;
    private CheckBox ck6P11;
    private CheckBox ck7P11;

    private CheckBox ck1P12;
    private CheckBox ck2P12;
    private CheckBox ck3P12;

    private CheckBox ck1P13;
    private CheckBox ck2P13;
    private CheckBox ck3P13;
    private CheckBox ck4P13;
    private CheckBox ck5P13;
    private CheckBox ck6P13;
    private CheckBox ck7P13;

    private boolean[] hSpinners10 = {true, true, true, true, true};
    private boolean[] hSpinners11 = {true, true, true, true, true,true};
    private boolean[] hSpinners13 = {true, true, true, true, true,true};


    private EditText edtEspecifiqueP10;
    private EditText edtEspecifiqueP11;
    private EditText edtEspecifiqueP12;
    private EditText edtEspecifiqueP13;

    private LinearLayout lytFragment2;

    private String idempresa;
    private Modulo2 modulo2;
    private Context context;
    private Data data;

    private int C2_P6;
    private String C2_P7;
    private int C2_P8_0_1;
    private int C2_P8_0_2;
    private String C2_P8_1_1;
    private String C2_P8_1_2;
    private String C2_P8_2_3;
    private int C2_P9_0_1;
    private int C2_P9_0_2;
    private int C2_P9_0_3;
    private int C2_P9_0_4;
    private int C2_P9_0_5;
    private String C2_P9_1_1;
    private String C2_P9_1_2;
    private String C2_P9_1_3;
    private String C2_P9_1_4;
    private String C2_P9_1_4_0;
    private String C2_P9_1_5;
    private String C2_P9_1_6;
    private int C2_P10_1_1;
    private int C2_P10_1_2;
    private int C2_P10_1_3;
    private int C2_P10_1_4;
    private int C2_P10_1_5;
    private int C2_P10_1_6;
    private String C2_P10_1_6_0;
    private int C2_P10_2_2;
    private int C2_P10_2_3;
    private int C2_P10_2_4;
    private int C2_P10_2_5;
    private int C2_P10_2_6;
    private int C2_P11_1_1;
    private int C2_P11_1_2;
    private int C2_P11_1_3;
    private int C2_P11_1_4;
    private int C2_P11_1_5;
    private int C2_P11_1_6;
    private int C2_P11_1_7;
    private String C2_P11_1_7_0;
    private int C2_P11_2_2;
    private int C2_P11_2_3;
    private int C2_P11_2_4;
    private int C2_P11_2_5;
    private int C2_P11_2_6;
    private int C2_P11_2_7;
    private int C2_P12_1;
    private int C2_P12_2;
    private int C2_P12_3;
    private String C2_P12_3_0;
    private int C2_P13_1_1;
    private int C2_P13_1_2;
    private int C2_P13_1_3;
    private int C2_P13_1_4;
    private int C2_P13_1_5;
    private int C2_P13_1_6;
    private int C2_P13_1_7;
    private String C2_P13_1_7_0;
    private int C2_P13_2_2;
    private int C2_P13_2_3;
    private int C2_P13_2_4;
    private int C2_P13_2_5;
    private int C2_P13_2_6;
    private int C2_P13_2_7;

    public Modulo2Fragment2() {
        // Required empty public constructor
    }

    @SuppressLint("ValidFragment")
    public Modulo2Fragment2(String idempresa, Context context) {
        this.idempresa = idempresa;
        this.context = context;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_modulo2_fragment2, container, false);

        lytFragment2 = (LinearLayout) rootView.findViewById(R.id.mod2_layoutFragment2);

        lytP6 = (LinearLayout) rootView.findViewById(R.id.mod2_p6_lyt);
        lytP7 = (LinearLayout) rootView.findViewById(R.id.mod2_p7_lyt);
        lytP8 = (LinearLayout) rootView.findViewById(R.id.mod2_p8_lyt);
        lytP9 = (LinearLayout) rootView.findViewById(R.id.mod2_p9_lyt);
        lytP10 = (LinearLayout) rootView.findViewById(R.id.mod2_p10_lyt);
        lytP11 = (LinearLayout) rootView.findViewById(R.id.mod2_p11_lyt);
        lytP12 = (LinearLayout) rootView.findViewById(R.id.mod2_p12_lyt);
        lytP13 = (LinearLayout) rootView.findViewById(R.id.mod2_p13_lyt);

        lytSp1P10 = (LinearLayout) rootView.findViewById(R.id.mod2_p10_lytSp1);
        lytSp2P10 = (LinearLayout) rootView.findViewById(R.id.mod2_p10_lytSp2);
        lytSp3P10 = (LinearLayout) rootView.findViewById(R.id.mod2_p10_lytSp3);
        lytSp4P10 = (LinearLayout) rootView.findViewById(R.id.mod2_p10_lytSp4);
        lytSp5P10 = (LinearLayout) rootView.findViewById(R.id.mod2_p10_lytSp5);
        lytSp6P10 = (LinearLayout) rootView.findViewById(R.id.mod2_p10_lytSp6);


        sp2P10 = (Spinner) rootView.findViewById(R.id.mod2_p10_sp2);
        sp3P10 = (Spinner) rootView.findViewById(R.id.mod2_p10_sp3);
        sp4P10 = (Spinner) rootView.findViewById(R.id.mod2_p10_sp4);
        sp5P10 = (Spinner) rootView.findViewById(R.id.mod2_p10_sp5);
        sp6P10 = (Spinner) rootView.findViewById(R.id.mod2_p10_sp6);

        ck1P10 = (CheckBox) rootView.findViewById(R.id.mod2_p10_ck1);
        ck2P10 = (CheckBox) rootView.findViewById(R.id.mod2_p10_ck2);
        ck3P10 = (CheckBox) rootView.findViewById(R.id.mod2_p10_ck3);
        ck4P10 = (CheckBox) rootView.findViewById(R.id.mod2_p10_ck4);
        ck5P10 = (CheckBox) rootView.findViewById(R.id.mod2_p10_ck5);
        ck6P10 = (CheckBox) rootView.findViewById(R.id.mod2_p10_ck6);

        edtEspecifiqueP10 = (EditText) rootView.findViewById(R.id.mod2_p10_edtEspecifique);

        lytSp1P11 = (LinearLayout) rootView.findViewById(R.id.mod2_p11_lytSp1);
        lytSp2P11 = (LinearLayout) rootView.findViewById(R.id.mod2_p11_lytSp2);
        lytSp3P11 = (LinearLayout) rootView.findViewById(R.id.mod2_p11_lytSp3);
        lytSp4P11 = (LinearLayout) rootView.findViewById(R.id.mod2_p11_lytSp4);
        lytSp5P11 = (LinearLayout) rootView.findViewById(R.id.mod2_p11_lytSp5);
        lytSp6P11 = (LinearLayout) rootView.findViewById(R.id.mod2_p11_lytSp6);
        lytSp7P11 = (LinearLayout) rootView.findViewById(R.id.mod2_p11_lytSp7);


        sp2P11 = (Spinner) rootView.findViewById(R.id.mod2_p11_sp2);
        sp3P11 = (Spinner) rootView.findViewById(R.id.mod2_p11_sp3);
        sp4P11 = (Spinner) rootView.findViewById(R.id.mod2_p11_sp4);
        sp5P11 = (Spinner) rootView.findViewById(R.id.mod2_p11_sp5);
        sp6P11 = (Spinner) rootView.findViewById(R.id.mod2_p11_sp6);
        sp7P11 = (Spinner) rootView.findViewById(R.id.mod2_p11_sp7);

        ck1P11 = (CheckBox) rootView.findViewById(R.id.mod2_p11_ck1);
        ck2P11 = (CheckBox) rootView.findViewById(R.id.mod2_p11_ck2);
        ck3P11 = (CheckBox) rootView.findViewById(R.id.mod2_p11_ck3);
        ck4P11 = (CheckBox) rootView.findViewById(R.id.mod2_p11_ck4);
        ck5P11 = (CheckBox) rootView.findViewById(R.id.mod2_p11_ck5);
        ck6P11 = (CheckBox) rootView.findViewById(R.id.mod2_p11_ck6);
        ck7P11 = (CheckBox) rootView.findViewById(R.id.mod2_p11_ck7);

        edtEspecifiqueP11 = (EditText) rootView.findViewById(R.id.mod2_p11_edtEspecifique);

        ck1P12 = (CheckBox) rootView.findViewById(R.id.mod2_p12_ck1);
        ck2P12 = (CheckBox) rootView.findViewById(R.id.mod2_p12_ck2);
        ck3P12 = (CheckBox) rootView.findViewById(R.id.mod2_p12_ck3);

        edtEspecifiqueP12 = (EditText) rootView.findViewById(R.id.mod2_p12_edtEspecifique);

        lytSp1P13 = (LinearLayout) rootView.findViewById(R.id.mod2_p13_lytSp1);
        lytSp2P13 = (LinearLayout) rootView.findViewById(R.id.mod2_p13_lytSp2);
        lytSp3P13 = (LinearLayout) rootView.findViewById(R.id.mod2_p13_lytSp3);
        lytSp4P13 = (LinearLayout) rootView.findViewById(R.id.mod2_p13_lytSp4);
        lytSp5P13 = (LinearLayout) rootView.findViewById(R.id.mod2_p13_lytSp5);
        lytSp6P13 = (LinearLayout) rootView.findViewById(R.id.mod2_p13_lytSp6);
        lytSp7P13 = (LinearLayout) rootView.findViewById(R.id.mod2_p13_lytSp7);

        sp2P13 = (Spinner) rootView.findViewById(R.id.mod2_p13_sp2);
        sp3P13 = (Spinner) rootView.findViewById(R.id.mod2_p13_sp3);
        sp4P13 = (Spinner) rootView.findViewById(R.id.mod2_p13_sp4);
        sp5P13 = (Spinner) rootView.findViewById(R.id.mod2_p13_sp5);
        sp6P13 = (Spinner) rootView.findViewById(R.id.mod2_p13_sp6);
        sp7P13 = (Spinner) rootView.findViewById(R.id.mod2_p13_sp7);

        ck1P13 = (CheckBox) rootView.findViewById(R.id.mod2_p13_ck1);
        ck2P13 = (CheckBox) rootView.findViewById(R.id.mod2_p13_ck2);
        ck3P13 = (CheckBox) rootView.findViewById(R.id.mod2_p13_ck3);
        ck4P13 = (CheckBox) rootView.findViewById(R.id.mod2_p13_ck4);
        ck5P13 = (CheckBox) rootView.findViewById(R.id.mod2_p13_ck5);
        ck6P13 = (CheckBox) rootView.findViewById(R.id.mod2_p13_ck6);
        ck7P13 = (CheckBox) rootView.findViewById(R.id.mod2_p13_ck7);

        edtEspecifiqueP13 = (EditText) rootView.findViewById(R.id.mod2_p13_edtEspecifique);

        rgP6 = (RadioGroup) rootView.findViewById(R.id.mod2_p6_rg);
        edtP7 = (EditText) rootView.findViewById(R.id.mod2_p7_edt);

        ck1P8 = (CheckBox) rootView.findViewById(R.id.mod2_p8_ck1);
        ck2P8 = (CheckBox) rootView.findViewById(R.id.mod2_p8_ck2);
        edt1P8 = (EditText) rootView.findViewById(R.id.mod2_p8_edt1);
        edt2P8 = (EditText) rootView.findViewById(R.id.mod2_p8_edt2);

        ck1P9 = (CheckBox) rootView.findViewById(R.id.mod2_p9_ck1);
        ck2P9 = (CheckBox) rootView.findViewById(R.id.mod2_p9_ck2);
        ck3P9 = (CheckBox) rootView.findViewById(R.id.mod2_p9_ck3);
        ck4P9 = (CheckBox) rootView.findViewById(R.id.mod2_p9_ck4);
        ck5P9 = (CheckBox) rootView.findViewById(R.id.mod2_p9_ck5);

        edt1P9 = (EditText) rootView.findViewById(R.id.mod2_p9_edt1);
        edt2P9 = (EditText) rootView.findViewById(R.id.mod2_p9_edt2);
        edt3P9 = (EditText) rootView.findViewById(R.id.mod2_p9_edt3);
        edt4P9 = (EditText) rootView.findViewById(R.id.mod2_p9_edt4);
        edt5P9 = (EditText) rootView.findViewById(R.id.mod2_p9_edt5);

        totalP8 = (TextView) rootView.findViewById(R.id.mod2_p8_txtTotal);
        totalP9 = (TextView) rootView.findViewById(R.id.mod2_p9_txtTotal);

        edtEspecifiqueP9 = (EditText) rootView.findViewById(R.id.mod2_p9_edtEspecifique);

        return rootView;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        sp2P10.setEnabled(false);
        sp3P10.setEnabled(false);
        sp4P10.setEnabled(false);
        sp5P10.setEnabled(false);
        sp6P10.setEnabled(false);

        sp2P11.setEnabled(false);
        sp3P11.setEnabled(false);
        sp4P11.setEnabled(false);
        sp5P11.setEnabled(false);
        sp6P11.setEnabled(false);
        sp7P11.setEnabled(false);

        sp2P13.setEnabled(false);
        sp3P13.setEnabled(false);
        sp4P13.setEnabled(false);
        sp5P13.setEnabled(false);
        sp6P13.setEnabled(false);
        sp7P13.setEnabled(false);

        final LinearLayout[] linearLayouts = {lytP6, lytP7, lytP8, lytP9, lytP10, lytP11, lytP12, lytP13};

        Spinner[] spinners = {sp2P10, sp3P10, sp4P10, sp5P10, sp2P11, sp3P11, sp4P11, sp5P11, sp2P13, sp3P13, sp4P13, sp5P13, sp6P13};
        LinearLayout[] layoutSpinners = {lytSp2P10, lytSp3P10, lytSp4P10, lytSp5P10, lytSp2P11
                , lytSp3P11, lytSp4P11, lytSp5P11, lytSp2P13, lytSp3P13, lytSp4P13, lytSp5P13, lytSp6P13};
        CheckBox[] checkBoxes = {ck2P10, ck3P10, ck4P10, ck5P10, ck2P11, ck3P11, ck4P11
                , ck5P11, ck2P13, ck3P13, ck4P13, ck5P13, ck6P13};

        final Spinner[] spinnersP10 = {sp2P10, sp3P10, sp4P10, sp5P10};
        final Spinner[] spinnersP10Aux = {sp2P10, sp3P10, sp4P10, sp5P10, sp6P10};

        final Spinner[] spinnersP11 = {sp2P11, sp3P11, sp4P11, sp5P11, sp6P11};
        final Spinner[] spinnersP11Aux = {sp2P11, sp3P11, sp4P11, sp5P11, sp6P11, sp7P11};

        final LinearLayout[] layoutSpinnersP10 = {lytSp2P10, lytSp3P10, lytSp4P10, lytSp5P10};
        final LinearLayout[] layoutSpinnersP11 = {lytSp2P11, lytSp3P11, lytSp4P11, lytSp5P11, lytSp6P11};

        final CheckBox[] checkBoxesP10 = {ck2P10, ck3P10, ck4P10, ck5P10};
        final CheckBox[] checkBoxesP11 = {ck2P11, ck3P11, ck4P11, ck5P11, ck6P11};
        final CheckBox[] checkBoxesP13 = {ck2P13, ck3P13, ck4P13, ck5P13, ck6P13};

        final Spinner[] spinnersP13 = {sp2P13, sp3P13, sp4P13, sp5P13, sp6P13};
        final Spinner[] spinnersP13Aux = {sp2P13, sp3P13, sp4P13, sp5P13, sp6P13, sp7P13};


        final LinearLayout[] layoutSpinnersP13 = {lytSp2P13, lytSp3P13, lytSp4P13, lytSp5P13, lytSp6P13};




        //PREGUNTA 10
        for (int i = 0; i < checkBoxesP10.length; i++) {
            final int posic = i;
            CheckBox checkBox = checkBoxesP10[i];
            final Spinner spinner = spinnersP10[i];
            final LinearLayout linearLayout = layoutSpinnersP10[i];
            checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                    if (b) {
                        if(!comprobarSumaSpinner(spinnersP10Aux)){
                            spinner.setEnabled(true);
                            linearLayout.setBackgroundResource(R.drawable.fondo_spinner);
                        }
                    } else {
                        spinner.setSelection(0);
                        linearLayout.setBackgroundResource(R.drawable.fondo_spinner_disabled);
                        spinner.setEnabled(false);
                    }
                }
            });
        }

        ck6P10.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    edtEspecifiqueP10.setEnabled(true);
                    edtEspecifiqueP10.setBackgroundResource(R.drawable.fondo_edit_text);
                    if(!comprobarSumaSpinner(spinnersP10Aux)) {
                        sp6P10.setEnabled(true);
                        lytSp6P10.setBackgroundResource(R.drawable.fondo_spinner);
                    }
                } else {
                    edtEspecifiqueP10.setText("");
                    edtEspecifiqueP10.setBackgroundResource(R.drawable.fondo_edit_text_disabled);
                    edtEspecifiqueP10.setEnabled(false);
                    sp6P10.setSelection(0);
                    lytSp6P10.setBackgroundResource(R.drawable.fondo_spinner_disabled);
                    sp6P10.setEnabled(false);
                }
            }
        });
        ck1P10.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, final boolean b) {
                if (b) {
                    ck2P10.setChecked(false);
                    ck2P10.setEnabled(false);
                    ck2P10.setTextColor(Color.LTGRAY);
                    ck3P10.setChecked(false);
                    ck3P10.setEnabled(false);
                    ck3P10.setTextColor(Color.LTGRAY);
                    ck4P10.setChecked(false);
                    ck4P10.setEnabled(false);
                    ck4P10.setTextColor(Color.LTGRAY);
                    ck5P10.setChecked(false);
                    ck5P10.setEnabled(false);
                    ck5P10.setTextColor(Color.LTGRAY);
                    ck6P10.setChecked(false);
                    ck6P10.setEnabled(false);
                    ck6P10.setTextColor(Color.LTGRAY);


                } else {
                    ck2P10.setEnabled(true);
                    ck2P10.setTextColor(Color.BLACK);
                    ck3P10.setEnabled(true);
                    ck3P10.setTextColor(Color.BLACK);
                    ck4P10.setEnabled(true);
                    ck4P10.setTextColor(Color.BLACK);
                    ck5P10.setEnabled(true);
                    ck5P10.setTextColor(Color.BLACK);
                    ck6P10.setEnabled(true);
                    ck6P10.setTextColor(Color.BLACK);
                }
            }

        });
        ck1P11.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, final boolean b) {
                if (b) {
                    ck2P11.setChecked(false);
                    ck2P11.setEnabled(false);
                    ck2P11.setTextColor(Color.LTGRAY);
                    ck3P11.setChecked(false);
                    ck3P11.setEnabled(false);
                    ck3P11.setTextColor(Color.LTGRAY);
                    ck4P11.setChecked(false);
                    ck4P11.setEnabled(false);
                    ck4P11.setTextColor(Color.LTGRAY);
                    ck5P11.setChecked(false);
                    ck5P11.setEnabled(false);
                    ck5P11.setTextColor(Color.LTGRAY);
                    ck6P11.setChecked(false);
                    ck6P11.setEnabled(false);
                    ck6P11.setTextColor(Color.LTGRAY);
                    ck7P11.setChecked(false);
                    ck7P11.setEnabled(false);
                    ck7P11.setTextColor(Color.LTGRAY);
                } else {
                    ck2P11.setEnabled(true);
                    ck2P11.setTextColor(Color.BLACK);
                    ck3P11.setEnabled(true);
                    ck3P11.setTextColor(Color.BLACK);
                    ck4P11.setEnabled(true);
                    ck4P11.setTextColor(Color.BLACK);
                    ck5P11.setEnabled(true);
                    ck5P11.setTextColor(Color.BLACK);
                    ck6P11.setEnabled(true);
                    ck6P11.setTextColor(Color.BLACK);
                    ck7P11.setEnabled(true);
                    ck7P11.setTextColor(Color.BLACK);
                }
            }

        });
        for (int i = 0; i < checkBoxesP11.length; i++) {
            final int posicion = 1;
            CheckBox checkBox = checkBoxesP11[i];
            final Spinner spinner = spinnersP11[i];
            final LinearLayout linearLayout = layoutSpinnersP11[i];
            checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                    if (b) {
                        if(!comprobarSumaSpinner(spinnersP11Aux)){
                            spinner.setEnabled(true);
                            linearLayout.setBackgroundResource(R.drawable.fondo_spinner);
                        }
                    } else {
                        spinner.setSelection(0);
                        linearLayout.setBackgroundResource(R.drawable.fondo_spinner_disabled);
                        spinner.setEnabled(false);
                    }
                }
            });
        }
        ck7P11.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    edtEspecifiqueP11.setEnabled(true);
                    edtEspecifiqueP11.setBackgroundResource(R.drawable.fondo_edit_text);
                    if(!comprobarSumaSpinner(spinnersP11Aux)){
                        sp7P11.setEnabled(true);
                        lytSp7P11.setBackgroundResource(R.drawable.fondo_spinner);
                    }
                } else {
                    edtEspecifiqueP11.setText("");
                    edtEspecifiqueP11.setBackgroundResource(R.drawable.fondo_edit_text_disabled);
                    edtEspecifiqueP11.setEnabled(false);
                    sp7P11.setSelection(0);
                    lytSp7P11.setBackgroundResource(R.drawable.fondo_spinner_disabled);
                    sp7P11.setEnabled(false);
                }
            }
        });
        ck6P11.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    if(!comprobarSumaSpinner(spinnersP11Aux)) {
                        sp6P11.setEnabled(true);
                        lytSp6P11.setBackgroundResource(R.drawable.fondo_spinner);
                    }
                    lytP12.setVisibility(View.VISIBLE);
                } else {
                    sp6P11.setSelection(0);
                    lytSp6P11.setBackgroundResource(R.drawable.fondo_spinner_disabled);
                    sp6P11.setEnabled(false);
                    ck1P12.setChecked(false);
                    ck2P12.setChecked(false);
                    ck3P12.setChecked(false);
                    lytP12.setVisibility(View.GONE);
                }
            }
        });

        ck1P13.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, final boolean b) {
                if (b) {
                    ck2P13.setChecked(false);
                    ck2P13.setEnabled(false);
                    ck2P13.setTextColor(Color.LTGRAY);
                    ck3P13.setChecked(false);
                    ck3P13.setEnabled(false);
                    ck3P13.setTextColor(Color.LTGRAY);
                    ck4P13.setChecked(false);
                    ck4P13.setEnabled(false);
                    ck4P13.setTextColor(Color.LTGRAY);
                    ck5P13.setChecked(false);
                    ck5P13.setEnabled(false);
                    ck5P13.setTextColor(Color.LTGRAY);
                    ck6P13.setChecked(false);
                    ck6P13.setEnabled(false);
                    ck6P13.setTextColor(Color.LTGRAY);
                    ck7P13.setChecked(false);
                    ck7P13.setEnabled(false);
                    ck7P13.setTextColor(Color.LTGRAY);
                } else {
                    ck2P13.setEnabled(true);
                    ck2P13.setTextColor(Color.BLACK);
                    ck3P13.setEnabled(true);
                    ck3P13.setTextColor(Color.BLACK);
                    ck4P13.setEnabled(true);
                    ck4P13.setTextColor(Color.BLACK);
                    ck5P13.setEnabled(true);
                    ck5P13.setTextColor(Color.BLACK);
                    ck6P13.setEnabled(true);
                    ck6P13.setTextColor(Color.BLACK);
                    ck7P13.setEnabled(true);
                    ck7P13.setTextColor(Color.BLACK);
                }
            }

        });
        for (int i = 0; i < checkBoxesP13.length; i++) {
            final int posicion = 1;
            CheckBox checkBox = checkBoxesP13[i];
            final Spinner spinner = spinnersP13[i];
            final LinearLayout linearLayout = layoutSpinnersP13[i];
            checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                    if (b) {
                        if(!comprobarSumaSpinner(spinnersP13Aux)){
                            spinner.setEnabled(true);
                            linearLayout.setBackgroundResource(R.drawable.fondo_spinner);
                        }
                    } else {
                        spinner.setSelection(0);
                        linearLayout.setBackgroundResource(R.drawable.fondo_spinner_disabled);
                        spinner.setEnabled(false);
                    }
                }
            });
        }

        ck7P13.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    edtEspecifiqueP13.setEnabled(true);
                    edtEspecifiqueP13.setBackgroundResource(R.drawable.fondo_edit_text);
                    if(!comprobarSumaSpinner(spinnersP13Aux)) {
                        sp7P13.setEnabled(true);
                        lytSp7P13.setBackgroundResource(R.drawable.fondo_spinner);
                    }
                } else {
                    edtEspecifiqueP13.setText("");
                    edtEspecifiqueP13.setBackgroundResource(R.drawable.cajas_de_texto_disabled);
                    edtEspecifiqueP13.setEnabled(false);
                    sp7P13.setSelection(0);
                    lytSp7P13.setBackgroundResource(R.drawable.fondo_spinner_disabled);
                    sp7P13.setEnabled(false);
                }
            }
        });



        ck3P12.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    edtEspecifiqueP12.setEnabled(true);
                    edtEspecifiqueP12.setBackgroundResource(R.drawable.fondo_edit_text);
                } else {
                    edtEspecifiqueP12.setText("");
                    edtEspecifiqueP12.setEnabled(false);
                    edtEspecifiqueP12.setBackgroundResource(R.drawable.cajas_de_texto_disabled);
                }
            }
        });

        for (int i = 0; i < linearLayouts.length; i++) {
            final LinearLayout linearLayout = linearLayouts[i];
            linearLayout.setOnFocusChangeListener(new View.OnFocusChangeListener() {
                @Override
                public void onFocusChange(View view, boolean b) {
                    if (b) ocultarTeclado(linearLayout);
                }
            });
        }

        rgP6.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                if (b) rgP6.setBackgroundColor(Color.CYAN);
                else rgP6.setBackgroundColor(Color.TRANSPARENT);
            }
        });

        edtP7.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                if (b) edtP7.setBackgroundResource(R.drawable.fondo_edit_text);
                else edtP7.setBackgroundResource(R.drawable.fondo_edit_text);
            }
        });

        rgP6.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, @IdRes int i) {
                ocultarTeclado(rgP6);
                switch (i) {
                    case R.id.mod2_p6_rbsi:
                        lytP7.setVisibility(View.VISIBLE);
                        lytP8.setVisibility(View.VISIBLE);
                        lytP9.setVisibility(View.VISIBLE);
                        lytP10.setVisibility(View.VISIBLE);
                        lytP11.setVisibility(View.VISIBLE);
                        lytP12.setVisibility(View.GONE);
                        lytP13.setVisibility(View.VISIBLE);
                        lytP7.requestFocus();
                        break;
                    case R.id.mod2_p6_rbno:
                        edtP7.setText("");
                        ck1P8.setChecked(false);
                        ck2P8.setChecked(false);
                        ck1P9.setChecked(false);
                        ck2P9.setChecked(false);
                        ck3P9.setChecked(false);
                        ck4P9.setChecked(false);
                        ck5P9.setChecked(false);
                        ck1P10.setChecked(false);
                        ck2P10.setChecked(false);
                        ck3P10.setChecked(false);
                        ck4P10.setChecked(false);
                        ck5P10.setChecked(false);
                        ck6P10.setChecked(false);
                        ck1P11.setChecked(false);
                        ck2P11.setChecked(false);
                        ck3P11.setChecked(false);
                        ck4P11.setChecked(false);
                        ck5P11.setChecked(false);
                        ck6P11.setChecked(false);
                        ck7P11.setChecked(false);
                        ck1P12.setChecked(false);
                        ck2P12.setChecked(false);
                        ck3P12.setChecked(false);
                        ck7P11.setChecked(false);
                        ck1P13.setChecked(false);
                        ck2P13.setChecked(false);
                        ck3P13.setChecked(false);
                        ck4P13.setChecked(false);
                        ck5P13.setChecked(false);
                        ck6P13.setChecked(false);
                        ck7P13.setChecked(false);
                        lytP7.setVisibility(View.GONE);
                        lytP8.setVisibility(View.GONE);
                        lytP9.setVisibility(View.GONE);
                        lytP10.setVisibility(View.GONE);
                        lytP11.setVisibility(View.GONE);
                        lytP12.setVisibility(View.GONE);
                        lytP13.setVisibility(View.GONE);
                        break;
                }

            }
        });

        edtP7.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View view, int keyCode, KeyEvent keyEvent) {
                if ((keyEvent.getAction() == KeyEvent.ACTION_DOWN) &&
                        (keyCode == KeyEvent.KEYCODE_ENTER)) {
                    ocultarTeclado(edtP7);
                    lytP8.requestFocus();
                    return true;
                }
                return false;
            }
        });

        EditText[] editTexts1 = {edt1P8, edt2P8};
        CheckBox[] checkBoxes1 = {ck1P8, ck2P8};
        for (int i = 0; i < editTexts1.length; i++) {
            final EditText editText = editTexts1[i];
            CheckBox checkBox = checkBoxes1[i];
            editText.setOnFocusChangeListener(new View.OnFocusChangeListener() {
                @Override
                public void onFocusChange(View view, boolean conFocus) {
                    if (view.isEnabled()) {
                        if (conFocus) {
                            editText.setBackgroundResource(R.drawable.fondo_edit_text);
                        } else editText.setBackgroundResource(R.drawable.fondo_edit_text);
                    } else {
                        ocultarTeclado(editText);
                    }
                }
            });
            editText.setTransformationMethod(new NumericKeyBoardTransformationMethod());
            editText.addTextChangedListener(new TextWatcher() {
                @Override
                public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                    if (!charSequence.toString().equals("")) {
                        totalP8.setText((Integer.parseInt(totalP8.getText().toString()) - Integer.parseInt(charSequence.toString())) + "");
                    }
                }

                @Override
                public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                }

                @Override
                public void afterTextChanged(Editable editable) {
                    int despues = 0;
                    if (!editable.toString().equals(""))
                        despues = Integer.parseInt(editable.toString());
                    if (!(Integer.parseInt(totalP8.getText().toString()) == 0)) {
                        totalP8.setText((Integer.parseInt(totalP8.getText().toString()) + despues) + "");
                    } else {
                        totalP8.setText(despues + "");
                    }
                }
            });
            checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                    if (b) {
                        editText.setEnabled(true);
                        editText.setBackgroundResource(R.drawable.fondo_edit_text);
                        editText.requestFocus();
                    } else {
                        editText.setEnabled(false);
                        editText.setText("");
                        editText.setBackgroundResource(R.drawable.fondo_edit_text_disabled);
                    }
                }
            });
        }
        edt2P8.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View view, int keyCode, KeyEvent keyEvent) {
                if ((keyEvent.getAction() == KeyEvent.ACTION_DOWN) &&
                        (keyCode == KeyEvent.KEYCODE_ENTER)) {
                    ocultarTeclado(edt2P8);
                    lytP9.requestFocus();
                    return true;
                }
                return false;
            }
        });
        EditText[] editTexts2 = {edt1P9, edt2P9, edt3P9, edt5P9};
        final CheckBox[] checkBoxes2 = {ck1P9, ck2P9, ck3P9, ck5P9};
        for (int i = 0; i < editTexts2.length; i++) {
            final EditText editText = editTexts2[i];
            CheckBox checkBox = checkBoxes2[i];
            editText.setOnFocusChangeListener(new View.OnFocusChangeListener() {
                @Override
                public void onFocusChange(View view, boolean conFocus) {
                    if (view.isEnabled()) {
                        if (conFocus) {
                            editText.setBackgroundResource(R.drawable.fondo_edit_text);
                        } else editText.setBackgroundResource(R.drawable.fondo_edit_text);
                    } else {
                        ocultarTeclado(editText);
                    }
                }
            });
            editText.setTransformationMethod(new NumericKeyBoardTransformationMethod());
            editText.addTextChangedListener(new TextWatcher() {
                @Override
                public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                    if (!charSequence.toString().equals("")) {
                        totalP9.setText((Integer.parseInt(totalP9.getText().toString()) - Integer.parseInt(charSequence.toString())) + "");
                    }
                }

                @Override
                public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                }

                @Override
                public void afterTextChanged(Editable editable) {
                    int despues = 0;
                    if (!editable.toString().equals(""))
                        despues = Integer.parseInt(editable.toString());
                    if (!(Integer.parseInt(totalP9.getText().toString()) == 0)) {
                        totalP9.setText((Integer.parseInt(totalP9.getText().toString()) + despues) + "");
                    } else {
                        totalP9.setText(despues + "");
                    }
                }
            });
            checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                    if (b) {
                        editText.setEnabled(true);
                        editText.setBackgroundResource(R.drawable.fondo_edit_text);
                        editText.requestFocus();
                    } else {
                        editText.setEnabled(false);
                        editText.setText("");
                        editText.setBackgroundResource(R.drawable.fondo_edit_text_disabled);
                    }
                }
            });
        }

        edt4P9.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean conFocus) {
                if (view.isEnabled()) {
                    if (conFocus) {
                        edt4P9.setBackgroundResource(R.drawable.fondo_edit_text);
                    } else {
                        edt4P9.setBackgroundResource(R.drawable.fondo_edit_text);
                    }
                } else {
                    ocultarTeclado(edt4P9);
                }
            }
        });
        edt4P9.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if (!charSequence.toString().equals("")) {
                    totalP9.setText((Integer.parseInt(totalP9.getText().toString()) - Integer.parseInt(charSequence.toString())) + "");
                }
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            @Override
            public void afterTextChanged(Editable editable) {
                int despues = 0;
                if (!editable.toString().equals(""))
                    despues = Integer.parseInt(editable.toString());
                if (!(Integer.parseInt(totalP9.getText().toString()) == 0)) {
                    totalP9.setText((Integer.parseInt(totalP9.getText().toString()) + despues) + "");
                } else {
                    totalP9.setText(despues + "");
                }
            }
        });
        ck4P9.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    edt4P9.setEnabled(true);
                    edt4P9.setBackgroundResource(R.drawable.fondo_edit_text);
                    edtEspecifiqueP9.setEnabled(true);
                    edtEspecifiqueP9.setBackgroundResource(R.drawable.fondo_edit_text);
                    edtEspecifiqueP9.requestFocus();
                } else {
                    edt4P9.setText("");
                    edt4P9.setBackgroundResource(R.drawable.fondo_edit_text_disabled);
                    edt4P9.setEnabled(false);
                    edtEspecifiqueP9.setText("");
                    edtEspecifiqueP9.setBackgroundResource(R.drawable.fondo_edit_text_disabled);
                    edtEspecifiqueP9.setEnabled(false);
                }
            }
        });
        EditText[] edtEspecifiques = {edtEspecifiqueP10, edtEspecifiqueP11, edtEspecifiqueP12, edtEspecifiqueP13};
        LinearLayout[] lytespecifiques = {lytP10, lytP11, lytP12, lytP13};
        for (int i = 0; i < edtEspecifiques.length; i++) {
            EditText editText = edtEspecifiques[i];
            final LinearLayout lyt = lytespecifiques[i];
            editText.setOnKeyListener(new View.OnKeyListener() {
                @Override
                public boolean onKey(View view, int keyCode, KeyEvent keyEvent) {
                    if ((keyEvent.getAction() == KeyEvent.ACTION_DOWN) &&
                            (keyCode == KeyEvent.KEYCODE_ENTER)) {
                        ocultarTeclado(edtP7);
                        lyt.requestFocus();
                        return true;
                    }
                    return false;
                }
            });
        }

        final CheckBox[] checkBoxes3 = {ck2P10,ck3P10,ck4P10,ck5P10,ck6P10};
        final Spinner[] spinners1 = {sp2P10,sp3P10,sp4P10,sp5P10,sp6P10};
        final LinearLayout[] linearLayouts1 = {lytSp2P10,lytSp3P10,lytSp4P10,lytSp5P10,lytSp6P10};

        for (int i = 0; i <spinners1.length ; i++) {
            final Spinner spinner = spinners1[i];
            final int posicion = i;
            spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                    comprobarSpinner(spinner,spinners1,posicion);
                    deshabilitarSpinners(spinners1,checkBoxes3,linearLayouts1);
                }
                @Override
                public void onNothingSelected(AdapterView<?> adapterView) {}
            });
        }

        final CheckBox[] checkBoxes4 = {ck2P11,ck3P11,ck4P11,ck5P11,ck6P11,ck7P11};
        final Spinner[] spinners2 = {sp2P11,sp3P11,sp4P11,sp5P11,sp6P11,sp7P11};
        final LinearLayout[] linearLayouts2 = {lytSp2P11,lytSp3P11,lytSp4P11,lytSp5P11,lytSp6P11,lytSp7P11};

        for (int i = 0; i <spinners2.length ; i++) {
            final Spinner spinner = spinners2[i];
            final int posicion = i;
            spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                    comprobarSpinner(spinner,spinners2,posicion);
                    deshabilitarSpinners(spinners2,checkBoxes4,linearLayouts2);
                }
                @Override
                public void onNothingSelected(AdapterView<?> adapterView) {}
            });
        }

        final CheckBox[] checkBoxes5 = {ck2P13,ck3P13,ck4P13,ck5P13,ck6P13,ck7P13};
        final Spinner[] spinners3 = {sp2P13,sp3P13,sp4P13,sp5P13,sp6P13,sp7P13};
        final LinearLayout[] linearLayouts3 = {lytSp2P13,lytSp3P13,lytSp4P13,lytSp5P13,lytSp6P13,lytSp7P13};

        for (int i = 0; i <spinners3.length ; i++) {
            final Spinner spinner = spinners3[i];
            final int posicion = i;
            spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                    comprobarSpinner(spinner,spinners3,posicion);
                    deshabilitarSpinners(spinners3,checkBoxes5,linearLayouts3);
                }
                @Override
                public void onNothingSelected(AdapterView<?> adapterView) {}
            });
        }
        edtP7.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {            }
            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {            }
            @Override
            public void afterTextChanged(Editable editable) {
                if (!editable.toString().equals("")) {
                    if (Integer.parseInt(edtP7.getText().toString())==0) {
                        Toast.makeText(context, "Pregunta7: Ingrese un valor mayor a cero", Toast.LENGTH_SHORT).show();
                        edtP7.requestFocus();
                        edtP7.setText("");
                    }
                }
            }
        });

        edtEspecifiqueP9.setFilters(new InputFilter[]{new InputFilter.AllCaps()});
        edtEspecifiqueP10.setFilters(new InputFilter[]{new InputFilter.AllCaps()});
        edtEspecifiqueP11.setFilters(new InputFilter[]{new InputFilter.AllCaps()});
        edtEspecifiqueP12.setFilters(new InputFilter[]{new InputFilter.AllCaps()});
        edtEspecifiqueP13.setFilters(new InputFilter[]{new InputFilter.AllCaps()});

        edtP7.setTransformationMethod(new NumericKeyBoardTransformationMethod());
        edt4P9.setTransformationMethod(new NumericKeyBoardTransformationMethod());
        cargarDatos();
        deshabilitarSpinners(spinners1,checkBoxes3,linearLayouts1);
        lytFragment2.requestFocus();
        ocultarTeclado(lytFragment2);
    }


    public void ocultarTeclado(View view){
        InputMethodManager mgr = (InputMethodManager) getActivity().getSystemService(Context.INPUT_METHOD_SERVICE);
        mgr.hideSoftInputFromWindow(view.getWindowToken(), 0);
    }

    public void cargarDatos(){
        data = new Data(context);
        data.open();
        modulo2 = data.getModulo2(idempresa);
        //p6
        if(!modulo2.getC2_P6().equals(""))((RadioButton)rgP6.getChildAt(Integer.parseInt(modulo2.getC2_P6()))).setChecked(true);
        //p7p8p9p10p11p12p13
        if(modulo2.getC2_P6().equals("0")){
            edtP7.setText(modulo2.getC2_P7().toString());

            if(modulo2.getC2_P8_0_1().equals("1")){ck1P8.setChecked(true);edt1P8.setText(modulo2.getC2_P8_1_1());}
            else ck1P8.setChecked(false);
            if(modulo2.getC2_P8_0_2().equals("1")){ck2P8.setChecked(true);edt2P8.setText(modulo2.getC2_P8_1_2());}
            else ck2P8.setChecked(false);
            if(modulo2.getC2_P9_0_1().equals("1")){ck1P9.setChecked(true);edt1P9.setText(modulo2.getC2_P9_1_1());}
            else ck1P9.setChecked(false);
            if(modulo2.getC2_P9_0_2().equals("1")){ck2P9.setChecked(true);edt2P9.setText(modulo2.getC2_P9_1_2());}
            else ck2P9.setChecked(false);
            if(modulo2.getC2_P9_0_3().equals("1")){ck3P9.setChecked(true);edt3P9.setText(modulo2.getC2_P9_1_3());}
            else ck3P9.setChecked(false);
            if(modulo2.getC2_P9_0_4().equals("1")){ck4P9.setChecked(true);edt4P9.setText(modulo2.getC2_P9_1_4());}
            else ck4P9.setChecked(false);
            edtEspecifiqueP9.setText(modulo2.getC2_P9_1_4_0());
            if(modulo2.getC2_P9_0_5().equals("1")){ck5P9.setChecked(true);edt5P9.setText(modulo2.getC2_P9_1_5());}
            else ck5P9.setChecked(false);

            if(modulo2.getC2_P10_1_1().equals("0")){
                ck1P10.setChecked(false);
                if(modulo2.getC2_P10_1_2().equals("1")){ck2P10.setChecked(true);sp2P10.setSelection(Integer.parseInt(modulo2.getC2_P10_2_2()));
                }else ck2P10.setChecked(false);
                if(modulo2.getC2_P10_1_3().equals("1")){ck3P10.setChecked(true);sp3P10.setSelection(Integer.parseInt(modulo2.getC2_P10_2_3()));
                }else ck3P10.setChecked(false);
                if(modulo2.getC2_P10_1_4().equals("1")){ck4P10.setChecked(true);sp4P10.setSelection(Integer.parseInt(modulo2.getC2_P10_2_4()));
                }else ck4P10.setChecked(false);
                if(modulo2.getC2_P10_1_5().equals("1")){ck5P10.setChecked(true);sp5P10.setSelection(Integer.parseInt(modulo2.getC2_P10_2_5()));
                }else ck5P10.setChecked(false);
                if(modulo2.getC2_P10_1_6().equals("1")){ck6P10.setChecked(true);sp6P10.setSelection(Integer.parseInt(modulo2.getC2_P10_2_6()));edtEspecifiqueP10.setText(modulo2.getC2_P10_1_6_0());
                }else ck6P10.setChecked(false);
            }else ck1P10.setChecked(true);

            if(modulo2.getC2_P11_1_1().equals("0")){
                ck1P11.setChecked(false);
                if(modulo2.getC2_P11_1_2().equals("1")){ck2P11.setChecked(true);sp2P11.setSelection(Integer.parseInt(modulo2.getC2_P11_2_2()));
                }else ck2P11.setChecked(false);
                if(modulo2.getC2_P11_1_3().equals("1")){ck3P11.setChecked(true);sp3P11.setSelection(Integer.parseInt(modulo2.getC2_P11_2_3()));
                }else ck3P11.setChecked(false);
                if(modulo2.getC2_P11_1_4().equals("1")){ck4P11.setChecked(true);sp4P11.setSelection(Integer.parseInt(modulo2.getC2_P11_2_4()));
                }else ck4P11.setChecked(false);
                if(modulo2.getC2_P11_1_5().equals("1")){ck5P11.setChecked(true);sp5P11.setSelection(Integer.parseInt(modulo2.getC2_P11_2_5()));
                }else ck5P11.setChecked(false);
                if(modulo2.getC2_P11_1_6().equals("1")){ck6P11.setChecked(true);sp6P11.setSelection(Integer.parseInt(modulo2.getC2_P11_2_6()));
                }else ck6P11.setChecked(false);
                if(modulo2.getC2_P11_1_7().equals("1")){ck7P11.setChecked(true);sp7P11.setSelection(Integer.parseInt(modulo2.getC2_P11_2_7()));edtEspecifiqueP11.setText(modulo2.getC2_P11_1_7_0());
                }else ck7P11.setChecked(false);
            }else ck1P11.setChecked(true);

            if(modulo2.getC2_P12_1().equals("1"))ck1P12.setChecked(true);else ck1P12.setChecked(false);
            if(modulo2.getC2_P12_2().equals("1"))ck2P12.setChecked(true);else ck2P12.setChecked(false);
            if(modulo2.getC2_P12_3().equals("1")){ck3P12.setChecked(true);edtEspecifiqueP12.setText(modulo2.getC2_P12_3_0());}
            else ck3P12.setChecked(false);

            if(modulo2.getC2_P13_1_1().equals("0")){
                ck1P13.setChecked(false);
                if(modulo2.getC2_P13_1_2().equals("1")){ck2P13.setChecked(true);sp2P13.setSelection(Integer.parseInt(modulo2.getC2_P13_2_2()));
                }else ck2P13.setChecked(false);
                if(modulo2.getC2_P13_1_3().equals("1")){ck3P13.setChecked(true);sp3P13.setSelection(Integer.parseInt(modulo2.getC2_P13_2_3()));
                }else ck3P13.setChecked(false);
                if(modulo2.getC2_P13_1_4().equals("1")){ck4P13.setChecked(true);sp4P13.setSelection(Integer.parseInt(modulo2.getC2_P13_2_4()));
                }else ck4P13.setChecked(false);
                if(modulo2.getC2_P13_1_5().equals("1")){ck5P13.setChecked(true);sp5P13.setSelection(Integer.parseInt(modulo2.getC2_P13_2_5()));
                }else ck5P13.setChecked(false);
                if(modulo2.getC2_P13_1_6().equals("1")){ck6P13.setChecked(true);sp6P13.setSelection(Integer.parseInt(modulo2.getC2_P13_2_6()));
                }else ck6P13.setChecked(false);
                if(modulo2.getC2_P13_1_7().equals("1")){ck7P13.setChecked(true);sp7P13.setSelection(Integer.parseInt(modulo2.getC2_P13_2_7()));edtEspecifiqueP13.setText(modulo2.getC2_P13_1_7_0());
                }else ck7P13.setChecked(false);
            }else ck1P13.setChecked(true);
        }
        data.close();
    }
    public void llenarMapaVariables(){
        //p6
        C2_P6 = rgP6.indexOfChild(rgP6.findViewById(rgP6.getCheckedRadioButtonId()));
        //p7
        C2_P7 = edtP7.getText().toString();
        //p8
        if(ck1P8.isChecked())C2_P8_0_1 = 1;
        else C2_P8_0_1 = 0;
        if(ck2P8.isChecked())C2_P8_0_2 = 1;
        else C2_P8_0_2 = 0;
        C2_P8_1_1 = edt1P8.getText().toString();
        C2_P8_1_2 = edt2P8.getText().toString();
        C2_P8_2_3 = totalP8.getText().toString();
        //p9
        if(ck1P9.isChecked())C2_P9_0_1 = 1;else C2_P9_0_1 = 0;
        if(ck2P9.isChecked())C2_P9_0_2 = 1;else C2_P9_0_2 = 0;
        if(ck3P9.isChecked())C2_P9_0_3 = 1;else C2_P9_0_3 = 0;
        if(ck4P9.isChecked())C2_P9_0_4 = 1;else C2_P9_0_4 = 0;
        if(ck5P9.isChecked())C2_P9_0_5 = 1;else C2_P9_0_5 = 0;
        C2_P9_1_1 = edt1P9.getText().toString();
        C2_P9_1_2 = edt2P9.getText().toString();
        C2_P9_1_3 = edt3P9.getText().toString();
        C2_P9_1_4 = edt4P9.getText().toString();
        C2_P9_1_5 = edt5P9.getText().toString();
        C2_P9_1_6 = totalP9.getText().toString();
        C2_P9_1_4_0 = edtEspecifiqueP9.getText().toString();
        //p10
        if(ck1P10.isChecked())C2_P10_1_1 = 1;else C2_P10_1_1 = 0;
        if(ck2P10.isChecked())C2_P10_1_2 = 1;else C2_P10_1_2 = 0;
        if(ck3P10.isChecked())C2_P10_1_3 = 1;else C2_P10_1_3 = 0;
        if(ck4P10.isChecked())C2_P10_1_4 = 1;else C2_P10_1_4 = 0;
        if(ck5P10.isChecked())C2_P10_1_5 = 1;else C2_P10_1_5 = 0;
        if(ck6P10.isChecked())C2_P10_1_6 = 1;else C2_P10_1_6 = 0;
        C2_P10_2_2 = sp2P10.getSelectedItemPosition();
        C2_P10_2_3 = sp3P10.getSelectedItemPosition();
        C2_P10_2_4 = sp4P10.getSelectedItemPosition();
        C2_P10_2_5 = sp5P10.getSelectedItemPosition();
        C2_P10_2_6 = sp6P10.getSelectedItemPosition();
        C2_P10_1_6_0 = edtEspecifiqueP10.getText().toString();
        //p11
        if(ck1P11.isChecked())C2_P11_1_1 = 1;else C2_P11_1_1 = 0;
        if(ck2P11.isChecked())C2_P11_1_2 = 1;else C2_P11_1_2 = 0;
        if(ck3P11.isChecked())C2_P11_1_3 = 1;else C2_P11_1_3 = 0;
        if(ck4P11.isChecked())C2_P11_1_4 = 1;else C2_P11_1_4 = 0;
        if(ck5P11.isChecked())C2_P11_1_5 = 1;else C2_P11_1_5 = 0;
        if(ck6P11.isChecked())C2_P11_1_6 = 1;else C2_P11_1_6 = 0;
        if(ck7P11.isChecked())C2_P11_1_7 = 1;else C2_P11_1_7 = 0;
        C2_P11_2_2 = sp2P11.getSelectedItemPosition();
        C2_P11_2_3 = sp3P11.getSelectedItemPosition();
        C2_P11_2_4 = sp4P11.getSelectedItemPosition();
        C2_P11_2_5 = sp5P11.getSelectedItemPosition();
        C2_P11_2_6 = sp6P11.getSelectedItemPosition();
        C2_P11_2_7 = sp7P11.getSelectedItemPosition();
        C2_P11_1_7_0 = edtEspecifiqueP11.getText().toString();
        //p12
        if(ck1P12.isChecked())C2_P12_1 = 1;else C2_P12_1 = 0;
        if(ck2P12.isChecked())C2_P12_2 = 1;else C2_P12_2 = 0;
        if(ck3P12.isChecked())C2_P12_3 = 1;else C2_P12_3 = 0;
        C2_P12_3_0 = edtEspecifiqueP12.getText().toString();
        //p13
        if(ck1P13.isChecked())C2_P13_1_1 = 1;else C2_P13_1_1 = 0;
        if(ck2P13.isChecked())C2_P13_1_2 = 1;else C2_P13_1_2 = 0;
        if(ck3P13.isChecked())C2_P13_1_3 = 1;else C2_P13_1_3 = 0;
        if(ck4P13.isChecked())C2_P13_1_4 = 1;else C2_P13_1_4 = 0;
        if(ck5P13.isChecked())C2_P13_1_5 = 1;else C2_P13_1_5 = 0;
        if(ck6P13.isChecked())C2_P13_1_6 = 1;else C2_P13_1_6 = 0;
        if(ck7P13.isChecked())C2_P13_1_7 = 1;else C2_P13_1_7 = 0;
        C2_P13_2_2 = sp2P13.getSelectedItemPosition();
        C2_P13_2_3 = sp3P13.getSelectedItemPosition();
        C2_P13_2_4 = sp4P13.getSelectedItemPosition();
        C2_P13_2_5 = sp5P13.getSelectedItemPosition();
        C2_P13_2_6 = sp6P13.getSelectedItemPosition();
        C2_P13_2_7 = sp7P13.getSelectedItemPosition();
        C2_P13_1_7_0 = edtEspecifiqueP13.getText().toString();
    }



    public void guardarDatos(){
        data = new Data(context);
        data.open();

        if(C2_P6 == 1){
            ContentValues f = new ContentValues(1);
            f.put(SQLConstantes.FRAGMENT_HABILITADO,"0");
            data.actualizarFragment(idempresa+ TablaFragmentos.FRAGMENT_M5F2,f);
            data.actualizarFragment(idempresa+ TablaFragmentos.FRAGMENT_M5F3,f);
        }else{
            ContentValues f = new ContentValues(1);
            f.put(SQLConstantes.FRAGMENT_HABILITADO,"1");
            data.actualizarFragment(idempresa+ TablaFragmentos.FRAGMENT_M5F2,f);
            data.actualizarFragment(idempresa+ TablaFragmentos.FRAGMENT_M5F3,f);
        }

        ContentValues contentValues = new ContentValues(163);
        contentValues.put(SQLConstantes.MODULO2_P6,C2_P6);
        contentValues.put(SQLConstantes.MODULO2_P7,C2_P7);
        contentValues.put(SQLConstantes.MODULO2_P8_0_1,C2_P8_0_1);
        contentValues.put(SQLConstantes.MODULO2_P8_0_2,C2_P8_0_2);
        contentValues.put(SQLConstantes.MODULO2_P8_1_1,C2_P8_1_1);
        contentValues.put(SQLConstantes.MODULO2_P8_1_2,C2_P8_1_2);
        contentValues.put(SQLConstantes.MODULO2_P8_2_3,C2_P8_2_3);
        contentValues.put(SQLConstantes.MODULO2_P9_0_1,C2_P9_0_1);
        contentValues.put(SQLConstantes.MODULO2_P9_0_2,C2_P9_0_2);
        contentValues.put(SQLConstantes.MODULO2_P9_0_3,C2_P9_0_3);
        contentValues.put(SQLConstantes.MODULO2_P9_0_4,C2_P9_0_4);
        contentValues.put(SQLConstantes.MODULO2_P9_0_5,C2_P9_0_5);
        contentValues.put(SQLConstantes.MODULO2_P9_1_1,C2_P9_1_1);
        contentValues.put(SQLConstantes.MODULO2_P9_1_2,C2_P9_1_2);
        contentValues.put(SQLConstantes.MODULO2_P9_1_3,C2_P9_1_3);
        contentValues.put(SQLConstantes.MODULO2_P9_1_4,C2_P9_1_4);
        contentValues.put(SQLConstantes.MODULO2_P9_1_4_0,C2_P9_1_4_0);
        contentValues.put(SQLConstantes.MODULO2_P9_1_5,C2_P9_1_5);
        contentValues.put(SQLConstantes.MODULO2_P9_1_6,C2_P9_1_6);
        contentValues.put(SQLConstantes.MODULO2_P10_1_1,C2_P10_1_1);
        contentValues.put(SQLConstantes.MODULO2_P10_1_2,C2_P10_1_2);
        contentValues.put(SQLConstantes.MODULO2_P10_1_3,C2_P10_1_3);
        contentValues.put(SQLConstantes.MODULO2_P10_1_4,C2_P10_1_4);
        contentValues.put(SQLConstantes.MODULO2_P10_1_5,C2_P10_1_5);
        contentValues.put(SQLConstantes.MODULO2_P10_1_6,C2_P10_1_6);
        contentValues.put(SQLConstantes.MODULO2_P10_1_6_0,C2_P10_1_6_0);
        contentValues.put(SQLConstantes.MODULO2_P10_2_2,C2_P10_2_2);
        contentValues.put(SQLConstantes.MODULO2_P10_2_3,C2_P10_2_3);
        contentValues.put(SQLConstantes.MODULO2_P10_2_4,C2_P10_2_4);
        contentValues.put(SQLConstantes.MODULO2_P10_2_5,C2_P10_2_5);
        contentValues.put(SQLConstantes.MODULO2_P10_2_6,C2_P10_2_6);
        contentValues.put(SQLConstantes.MODULO2_P11_1_1,C2_P11_1_1);
        contentValues.put(SQLConstantes.MODULO2_P11_1_2,C2_P11_1_2);
        contentValues.put(SQLConstantes.MODULO2_P11_1_3,C2_P11_1_3);
        contentValues.put(SQLConstantes.MODULO2_P11_1_4,C2_P11_1_4);
        contentValues.put(SQLConstantes.MODULO2_P11_1_5,C2_P11_1_5);
        contentValues.put(SQLConstantes.MODULO2_P11_1_6,C2_P11_1_6);
        contentValues.put(SQLConstantes.MODULO2_P11_1_7,C2_P11_1_7);
        contentValues.put(SQLConstantes.MODULO2_P11_1_7_0,C2_P11_1_7_0);
        contentValues.put(SQLConstantes.MODULO2_P11_2_2,C2_P11_2_2);
        contentValues.put(SQLConstantes.MODULO2_P11_2_3,C2_P11_2_3);
        contentValues.put(SQLConstantes.MODULO2_P11_2_4,C2_P11_2_4);
        contentValues.put(SQLConstantes.MODULO2_P11_2_5,C2_P11_2_5);
        contentValues.put(SQLConstantes.MODULO2_P11_2_6,C2_P11_2_6);
        contentValues.put(SQLConstantes.MODULO2_P11_2_7,C2_P11_2_7);
        contentValues.put(SQLConstantes.MODULO2_P12_1,C2_P12_1);
        contentValues.put(SQLConstantes.MODULO2_P12_2,C2_P12_2);
        contentValues.put(SQLConstantes.MODULO2_P12_3,C2_P12_3);
        contentValues.put(SQLConstantes.MODULO2_P12_3_0,C2_P12_3_0);
        contentValues.put(SQLConstantes.MODULO2_P13_1_1,C2_P13_1_1);
        contentValues.put(SQLConstantes.MODULO2_P13_1_2,C2_P13_1_2);
        contentValues.put(SQLConstantes.MODULO2_P13_1_3,C2_P13_1_3);
        contentValues.put(SQLConstantes.MODULO2_P13_1_4,C2_P13_1_4);
        contentValues.put(SQLConstantes.MODULO2_P13_1_5,C2_P13_1_5);
        contentValues.put(SQLConstantes.MODULO2_P13_1_6,C2_P13_1_6);
        contentValues.put(SQLConstantes.MODULO2_P13_1_7,C2_P13_1_7);
        contentValues.put(SQLConstantes.MODULO2_P13_1_7_0,C2_P13_1_7_0);
        contentValues.put(SQLConstantes.MODULO2_P13_2_2,C2_P13_2_2);
        contentValues.put(SQLConstantes.MODULO2_P13_2_3,C2_P13_2_3);
        contentValues.put(SQLConstantes.MODULO2_P13_2_4,C2_P13_2_4);
        contentValues.put(SQLConstantes.MODULO2_P13_2_5,C2_P13_2_5);
        contentValues.put(SQLConstantes.MODULO2_P13_2_6,C2_P13_2_6);
        contentValues.put(SQLConstantes.MODULO2_P13_2_7,C2_P13_2_7);
        data.actualizarModulo2(idempresa,contentValues);
        data.close();
    }

    public void deshabilitarSpinners(Spinner[] spinners, CheckBox[] checkBoxes,LinearLayout[] linearLayouts){
        int suma = 0;
        for (int i = 0; i <spinners.length ; i++) {
            suma = suma + spinners[i].getSelectedItemPosition();
        }
        if(suma == 3){
            for (int i = 0; i <spinners.length ; i++) {
                if(spinners[i].getSelectedItemPosition() == 0){
                    spinners[i].setEnabled(false);
                    linearLayouts[i].setBackgroundResource(R.drawable.fondo_spinner_disabled);
                }
            }
        }else{
            for (int i = 0; i <spinners.length ; i++) {
                if(checkBoxes[i].isChecked()){
                    spinners[i].setEnabled(true);
                    linearLayouts[i].setBackgroundResource(R.drawable.fondo_spinner);
                }
            }
        }
    }

    public boolean comprobarSumaSpinner(Spinner[] spinners){
        boolean correcto = false;
        int suma = 0;
        for (int i = 0; i <spinners.length ; i++) {
            suma = suma + spinners[i].getSelectedItemPosition();
        }
        if(suma == 3) correcto = true;
        return correcto;
    }
    public void comprobarSpinner(Spinner spinner, Spinner[] spinners, int sp){
        int seleccion = spinner.getSelectedItemPosition();
        for (int i = 0; i <spinners.length ; i++) {
            if(i != sp && seleccion != 0 && spinners[i].getSelectedItemPosition() == seleccion){
                spinner.setSelection(0);
                Toast.makeText(context, "NO PUEDE HABER DOS OPCIONES CON EL MISMO ORDEN DE IMPORTANCIA", Toast.LENGTH_SHORT).show();
            }
        }
    }

    public boolean validar(){
        boolean valido = false;
        llenarMapaVariables();
        String mensaje = "";
        boolean
        vC2_P6 = true,
        vC2_P7 = true,
        vC2_P8_0_1 = true,
        vC2_P8_0_2 = true,
        vC2_P8_1_1 = true,
        vC2_P8_1_2 = true,
        vC2_P9_0_1 = true,
        vC2_P9_0_2 = true,
        vC2_P9_0_3 = true,
        vC2_P9_0_4 = true,
        vC2_P9_0_5 = true,
        vC2_P9_1_1 = true,
        vC2_P9_1_2 = true,
        vC2_P9_1_3 = true,
        vC2_P9_1_4 = true,
        vC2_P9_1_4_0 = true,
        vC2_P9_1_5 = true,
        vC2_P10_1_1 = true,
        vC2_P10_1_2 = true,
        vC2_P10_1_3 = true,
        vC2_P10_1_4 = true,
        vC2_P10_1_5 = true,
        vC2_P10_1_6 = true,
        vC2_P10_1_6_0 = true,
        vC2_P10_2_2 = true,
        vC2_P10_2_3 = true,
        vC2_P10_2_4 = true,
        vC2_P10_2_5 = true,
        vC2_P10_2_6 = true,
        vC2_P11_1_1 = true,
        vC2_P11_1_2 = true,
        vC2_P11_1_3 = true,
        vC2_P11_1_4 = true,
        vC2_P11_1_5 = true,
        vC2_P11_1_6 = true,
        vC2_P11_1_7 = true,
        vC2_P11_1_7_0 = true,
        vC2_P11_2_2 = true,
        vC2_P11_2_3 = true,
        vC2_P11_2_4 = true,
        vC2_P11_2_5 = true,
        vC2_P11_2_6 = true,
        vC2_P11_2_7 = true,
        vC2_P12_1 = true,
        vC2_P12_2 = true,
        vC2_P12_3 = true,
        vC2_P12_3_0 = true,
        vC2_P13_1_1 = true,
        vC2_P13_1_2 = true,
        vC2_P13_1_3 = true,
        vC2_P13_1_4 = true,
        vC2_P13_1_5 = true,
        vC2_P13_1_6 = true,
        vC2_P13_1_7 = true,
        vC2_P13_1_7_0 = true,
        vC2_P13_2_2 = true,
        vC2_P13_2_3 = true,
        vC2_P13_2_4 = true,
        vC2_P13_2_5 = true,
        vC2_P13_2_6 = true,
        vC2_P13_2_7 = true,
        vC2_P8_2_3 = true,
        vC2_P9_1_6 = true;


        if(C2_P6 < 0){
            vC2_P6 = false;
            if(mensaje.equals(""))mensaje = "PREGUNTA 6: DEBE INDICAR SI CONTRATO TRABAJADORES";
        }



        if(C2_P6 == 0){
            if(C2_P7.equals("")){
                vC2_P7 = false;
                if(mensaje.equals(""))mensaje = "PREGUNTA 7: DEBE INDICAR NUMERO DE TRABAJADORES CONTRATADOS";
            }

            if(C2_P7.trim().length() == 0){
                vC2_P7 = false;
                if(mensaje.equals(""))mensaje = "PREGUNTA 7: DEBE INDICAR NUMERO DE TRABAJADORES CONTRATADOS";
            }

            if(edt1P8.isEnabled()){
                if (C2_P8_1_1.trim().length() == 0){
                    vC2_P8_1_1 = false;
                    if(mensaje.equals(""))mensaje = "PREGUNTA 8: DEBE REGISTRAR INFORMACION";
                }
            }
            if(edt2P8.isEnabled()){
                if (C2_P8_1_2.trim().length() == 0){
                    vC2_P8_1_2 = false;
                    if(mensaje.equals(""))mensaje = "PREGUNTA 8: DEBE REGISTRAR INFORMACION";
                }
            }

            if(C2_P8_2_3.trim().length() != 0 && C2_P7.trim().length() != 0){
                if(Integer.parseInt(C2_P8_2_3) < Integer.parseInt(C2_P7)){
                    vC2_P8_2_3 = false;
                    if(mensaje.equals(""))mensaje = "PREGUNTA 8: EN LOS ULTIMOS 12 MESES EL NUMERO TOTAL DE CONTRATOS" +
                            " SUSCRITOS NO DEBEN SER MENOR AL NUMERO DE TRABAJADORES";
                }
            }

            if(edt1P9.isEnabled()){
                if (C2_P9_1_1.trim().length() == 0){
                    vC2_P9_1_1 = false;
                    if(mensaje.equals(""))mensaje = "PREGUNTA 9: DEBE REGISTRAR INFORMACION";
                }
            }

            if(edt2P9.isEnabled()){
                if (C2_P9_1_2.trim().length() == 0){
                    vC2_P9_1_2 = false;
                    if(mensaje.equals(""))mensaje = "PREGUNTA 9: DEBE REGISTRAR INFORMACION";
                }
            }
            if(edt3P9.isEnabled()){
                if (C2_P9_1_3.trim().length() == 0){
                    vC2_P9_1_3 = false;
                    if(mensaje.equals(""))mensaje = "PREGUNTA 9: DEBE REGISTRAR INFORMACION";
                }
            }
            if(edt4P9.isEnabled()){
                if (C2_P9_1_4.trim().length() == 0){
                    vC2_P9_1_4 = false;
                    if(mensaje.equals(""))mensaje = "PREGUNTA 9: DEBE REGISTRAR INFORMACION";
                }
            }
            if(edt5P9.isEnabled()){
                if (C2_P9_1_5.trim().length() == 0){
                    vC2_P9_1_5 = false;
                    if(mensaje.equals(""))mensaje = "PREGUNTA 9: DEBE REGISTRAR INFORMACION";
                }
            }

            if(edtEspecifiqueP9.isEnabled()){
                if (C2_P9_1_4_0.trim().length() < 3){
                    vC2_P9_1_4_0 = false;
                    if(mensaje.equals(""))mensaje = "PREGUNTA 9: DEBE REGISTRAR INFORMACION VALIDA EN ESPECIFIQUE";
                }
            }

            if(C2_P8_2_3.trim().length() != 0 && C2_P9_1_6.trim().length() != 0)
                if(Integer.parseInt(C2_P8_2_3) != Integer.parseInt(C2_P9_1_6)){
                    vC2_P9_1_6 = false;
                    if(mensaje.equals(""))mensaje = "PREGUNTA 9: EL NUMERO DE CONTRATOS SUCRITOS TOTAL POR JORNADA DE TRABAJO" +
                            " DEBE SER IGUAL AL TOTAL POR TIPO DE CONTRATO";
                }
            if(C2_P9_1_5.trim().length() != 0 && C2_P9_1_6.trim().length() != 0)
                if(Integer.parseInt(C2_P9_1_5) == Integer.parseInt(C2_P9_1_6)){
                    vC2_P9_1_5 = false;
                    if(mensaje.equals(""))mensaje = "PREGUNTA 9: NO PUEDE INDICAR QUE NO USO CONTRATOS PARA TODOS SUS TRABAJADORES";
                }

            if(C2_P9_1_1.trim().length() == 0 &&
                    (C2_P10_1_2 == 1 || C2_P10_1_3 == 1 || C2_P10_1_4 == 1 || C2_P10_1_5 == 1 || C2_P10_1_6 == 1)){
                vC2_P10_1_2 = false;
                if(mensaje.equals(""))mensaje = "PREGUNTA 10: SI NO EXISTE UN TRABAJADOR CON ESTE TIPO DE CONTRATO NO DEBERIA ESPECIFICAR RAZONES";
            }

            if(C2_P9_1_1.trim().length() != 0) {
                if (Integer.parseInt(C2_P9_1_1) > 0 && C2_P10_1_1 == 1) {
                    vC2_P10_1_1 = false;
                    if (mensaje.equals(""))
                        mensaje = "PREGUNTA 10: SI HAY TRABAJADORES CON ESTE TIPO DE CONTRATO NO " +
                                "DEBERIA INDICAR QUE NO UTILIZO ESTA MODALIDAD CONTRACTUAL";
                }
            }
            if(C2_P10_1_1 == 0 && C2_P10_1_2 == 0 && C2_P10_1_3 == 0 && C2_P10_1_4 == 0 &&
                    C2_P10_1_5 == 0 && C2_P10_1_6 == 0){
                vC2_P10_1_1 = false;
                if(mensaje.equals(""))mensaje = "PREGUNTA 10: INDICAR QUE NO UTILIZO CONTRATOS O ESPECIFICAR ALGUNA RAZON";
            }

            if(edtEspecifiqueP10.isEnabled()){
                if (C2_P10_1_6_0.trim().length() < 3){
                    vC2_P10_1_6_0 = false;
                    if(mensaje.equals(""))mensaje = "PREGUNTA 10: DEBE REGISTRAR INFORMACION VALIDA EN ESPECIFIQUE";
                }
            }

            if(C2_P10_1_1 == 0){
                if(C2_P10_1_1 == 0 && (C2_P10_1_2 + C2_P10_1_3 + C2_P10_1_4 + C2_P10_1_5 + C2_P10_1_6) == 1){
                    if((C2_P10_2_2 + C2_P10_2_3 + C2_P10_2_4 + C2_P10_2_5 + C2_P10_2_6) != 1){
                        vC2_P10_2_2=false;vC2_P10_2_3=false;vC2_P10_2_4=false;vC2_P10_2_5=false;vC2_P10_2_6=false;
                        if(mensaje.equals(""))mensaje = "PREGUNTA 10: DEBE ASIGNAR 1 Y 2 PARA EL ORDEN DE IMPORTANCIA DE LAS RAZONES";
                    }
                }else if((C2_P10_2_2 + C2_P10_2_3 + C2_P10_2_4 + C2_P10_2_5 + C2_P10_2_6) != 3){
                    vC2_P10_2_2=false;vC2_P10_2_3=false;vC2_P10_2_4=false;vC2_P10_2_5=false;vC2_P10_2_6=false;
                    if(mensaje.equals(""))mensaje = "PREGUNTA 10: SI SELECCIONO SOLO UNA OPCION, DEBE ASIGNAR 1 PARA EL ORDEN DE IMPORTANCIA DE LAS RAZONES";
                }
            }

            if(C2_P11_1_1 == 0 && C2_P11_1_2 == 0 && C2_P11_1_3 == 0 && C2_P11_1_4 == 0 &&
                    C2_P11_1_5 == 0 && C2_P11_1_6 == 0 && C2_P11_1_7 == 0){
                vC2_P11_1_1 = false;
                if(mensaje.equals(""))mensaje = "PREGUNTA 11: INDICAR QUE NO UTILIZO CONTRATOS O ESPECIFICAR ALGUNA RAZON";
            }

            if(edtEspecifiqueP11.isEnabled()){
                if (C2_P11_1_7_0.trim().length() < 3){
                    vC2_P11_1_7_0 = false;
                    if(mensaje.equals(""))mensaje = "PREGUNTA 11: DEBE REGISTRAR INFORMACION VALIDA EN ESPECIFIQUE";
                }
            }

            if(C2_P9_1_2.trim().length() == 0 &&
                    (C2_P11_1_2 == 1 || C2_P11_1_3 == 1 || C2_P11_1_4 == 1 || C2_P11_1_5 == 1 || C2_P11_1_6 == 1 || C2_P11_1_7 == 1)){
                vC2_P11_1_2 = false;
                if(mensaje.equals(""))mensaje = "PREGUNTA 11: SI NO EXISTE UN TRABAJADOR CON ESTE TIPO DE CONTRATO NO DEBERIA ESPECIFICAR RAZONES";
            }
            if(C2_P9_1_2.trim().length() != 0) {
                if (Integer.parseInt(C2_P9_1_2) > 0 && C2_P11_1_1 == 1) {
                    vC2_P11_1_1 = false;
                    if (mensaje.equals(""))
                        mensaje = "PREGUNTA 11: SI HAY TRABAJADORES CON ESTE TIPO DE CONTRATO NO " +
                                "DEBERIA INDICAR QUE NO UTILIZO ESTA MODALIDAD CONTRACTUAL";
                }
            }

            if(C2_P11_1_1 == 0){
                if((C2_P11_1_2 + C2_P11_1_3 + C2_P11_1_4 + C2_P11_1_5 + C2_P11_1_6 + C2_P11_1_7) == 1){
                    if((C2_P11_2_2 + C2_P11_2_3 + C2_P11_2_4 + C2_P11_2_5 + C2_P11_2_6 + C2_P11_2_7) != 1){
                        vC2_P11_2_2=false;vC2_P11_2_3=false;vC2_P11_2_4=false;vC2_P11_2_5=false;vC2_P11_2_6=false;vC2_P11_2_7=false;
                        if(mensaje.equals(""))mensaje = "PREGUNTA 11: DEBE ASIGNAR 1 Y 2 PARA EL ORDEN DE IMPORTANCIA DE LAS RAZONES";
                    }
                }else if((C2_P11_2_2 + C2_P11_2_3 + C2_P11_2_4 + C2_P11_2_5 + C2_P11_2_6 + C2_P11_2_7) != 3){
                    vC2_P11_2_2=false;vC2_P11_2_3=false;vC2_P11_2_4=false;vC2_P11_2_5=false;vC2_P11_2_6=false;vC2_P11_2_7=false;
                    if(mensaje.equals(""))mensaje = "PREGUNTA 11: SI SELECCIONO SOLO UNA OPCION, DEBE ASIGNAR 1 PARA EL ORDEN DE IMPORTANCIA DE LAS RAZONES";
                }
            }




            if(C2_P11_1_6 == 1){
                if(C2_P12_1 == 0 && C2_P12_2 == 0 && C2_P12_3 == 0){
                    vC2_P12_1 = false;vC2_P12_2 = false;vC2_P12_3 = false;
                    if(mensaje.equals(""))mensaje = "PREGUNTA 12: DEBE MARCAR UNA DE LAS OPCIONES";
                }
                if(C2_P12_3 == 1 && C2_P12_3_0.equals("")){
                    vC2_P12_3_0 = false;
                    if(mensaje.equals(""))mensaje = "PREGUNTA 12: DEBE ESPECIFICAR SI MARCO OTRA";
                }
            }

            if(C2_P13_1_1 == 0 && C2_P13_1_2 == 0 && C2_P13_1_3 == 0 && C2_P13_1_4 == 0 &&
                    C2_P13_1_5 == 0 && C2_P13_1_6 == 0 && C2_P13_1_7 == 0){
                vC2_P13_1_1 = false;
                if(mensaje.equals(""))mensaje = "PREGUNTA 13: INDICAR QUE NO UTILIZO CONTRATOS O ESPECIFICAR ALGUNA RAZON";
            }
            if(edtEspecifiqueP13.isEnabled()){
                if (C2_P13_1_7_0.trim().length() < 3){
                    vC2_P13_1_7_0 = false;
                    if(mensaje.equals(""))mensaje = "PREGUNTA 13: DEBE REGISTRAR INFORMACION VALIDA EN ESPECIFIQUE";
                }
            }
            if(C2_P9_1_3.trim().length() == 0 &&
                    (C2_P13_1_2 == 1 || C2_P13_1_3 == 1 || C2_P13_1_4 == 1 || C2_P13_1_5 == 1 || C2_P13_1_6 == 1 || C2_P13_1_7 == 1)){
                vC2_P13_1_2 = false;
                if(mensaje.equals(""))mensaje = "PREGUNTA 13: SI NO EXISTE UN TRABAJADOR CON ESTE TIPO DE CONTRATO NO DEBERIA ESPECIFICAR RAZONES";
            }
            if(C2_P9_1_3.trim().length() != 0) {
                if (Integer.parseInt(C2_P9_1_3) > 0 && C2_P13_1_1 == 1) {
                    vC2_P13_1_1 = false;
                    if (mensaje.equals(""))
                        mensaje = "PREGUNTA 13: SI HAY TRABAJADORES CON ESTE TIPO DE CONTRATO NO " +
                                "DEBERIA INDICAR QUE NO UTILIZO ESTA MODALIDAD CONTRACTUAL";
                }
            }
            if(C2_P13_1_1 == 0){
                if((C2_P13_1_2 + C2_P13_1_3 + C2_P13_1_4 + C2_P13_1_5 + C2_P13_1_6 + C2_P13_1_7) == 1){
                    if((C2_P13_2_2 + C2_P13_2_3 + C2_P13_2_4 + C2_P13_2_5 + C2_P13_2_6 + C2_P13_2_7) != 1){
                        vC2_P13_2_2=false;vC2_P13_2_3=false;vC2_P13_2_4=false;vC2_P13_2_5=false;vC2_P13_2_6=false;vC2_P13_2_7=false;
                        if(mensaje.equals(""))mensaje = "PREGUNTA 13: SI SELECCIONO SOLO UNA OPCION, DEBE ASIGNAR 1 PARA EL ORDEN DE IMPORTANCIA DE LAS RAZONES";
                    }
                }else if((C2_P13_2_2 + C2_P13_2_3 + C2_P13_2_4 + C2_P13_2_5 + C2_P13_2_6 + C2_P13_2_7) != 3){
                    vC2_P13_2_2=false;vC2_P13_2_3=false;vC2_P13_2_4=false;vC2_P13_2_5=false;vC2_P13_2_6=false;vC2_P13_2_7=false;
                    if(mensaje.equals(""))mensaje = "PREGUNTA 13: DEBE ASIGNAR 1 Y 2 PARA EL ORDEN DE IMPORTANCIA DE LAS RAZONES";
                }
            }

            if(C2_P13_1_1 == 0 && C2_P13_1_2 == 0 && C2_P13_1_3 == 0 && C2_P13_1_4 == 0 &&
                    C2_P13_1_5 == 0 && C2_P13_1_6 == 0 && C2_P13_1_7 == 0){
                vC2_P13_1_1 = false;
                if(mensaje.equals(""))mensaje = "PREGUNTA 13: INDICAR QUE NO UTILIZO CONTRATOS O ESPECIFICAR ALGUNA RAZON";
            }
        }

        valido = vC2_P6 && vC2_P7 && vC2_P8_0_1 && vC2_P8_0_2 && vC2_P8_1_1 && vC2_P8_1_2 && vC2_P9_0_1 && vC2_P9_0_2 && vC2_P9_0_3
                && vC2_P9_0_4 && vC2_P9_0_5 && vC2_P9_1_1 && vC2_P9_1_2 && vC2_P9_1_3 && vC2_P9_1_4 && vC2_P9_1_4_0 && vC2_P9_1_5
                && vC2_P10_1_1 && vC2_P10_1_2 && vC2_P10_1_3 && vC2_P10_1_4 && vC2_P10_1_5 && vC2_P10_1_6 && vC2_P10_1_6_0 &&
                vC2_P10_2_2 && vC2_P10_2_3 && vC2_P10_2_4 && vC2_P10_2_5 && vC2_P10_2_6 && vC2_P11_1_1 && vC2_P11_1_2 && vC2_P11_1_3 &&
                vC2_P11_1_4 && vC2_P11_1_5 && vC2_P11_1_6 && vC2_P11_1_7 && vC2_P11_1_7_0 && vC2_P11_2_2 && vC2_P11_2_3 && vC2_P11_2_4 &&
                vC2_P11_2_5 && vC2_P11_2_6 && vC2_P11_2_7 && vC2_P12_1 && vC2_P12_2 && vC2_P12_3 && vC2_P12_3_0 && vC2_P13_1_1 &&
                vC2_P13_1_2 && vC2_P13_1_3 && vC2_P13_1_4 && vC2_P13_1_5 && vC2_P13_1_6 && vC2_P13_1_7 && vC2_P13_1_7_0 && vC2_P13_2_2 &&
                vC2_P13_2_3 && vC2_P13_2_4 && vC2_P13_2_5 && vC2_P13_2_6 && vC2_P13_2_7 && vC2_P8_2_3 && vC2_P9_1_6;

        if(!valido) {
            mostrarMensaje(mensaje);
            Log.e("vC2_P6:",vC2_P6 + "");
            Log.e("vC2_P7:",vC2_P7 + "");
            Log.e("vC2_P8_0_1:",vC2_P8_0_1 + "");
            Log.e("vC2_P8_0_2:",vC2_P8_0_2 + "");
            Log.e("vC2_P8_1_1:",vC2_P8_1_1 + "");
            Log.e("vC2_P8_1_2:",vC2_P8_1_2 + "");
            Log.e("vC2_P9_0_1:",vC2_P9_0_1 + "");
            Log.e("vC2_P9_0_2:",vC2_P9_0_2 + "");
            Log.e("vC2_P9_0_3:",vC2_P9_0_3 + "");
            Log.e("vC2_P9_0_4:",vC2_P9_0_4 + "");
            Log.e("vC2_P9_0_5:",vC2_P9_0_5 + "");
            Log.e("vC2_P9_1_1:",vC2_P9_1_1 + "");
            Log.e("vC2_P9_1_2:",vC2_P9_1_2 + "");
            Log.e("vC2_P9_1_3:",vC2_P9_1_3 + "");
            Log.e("vC2_P9_1_4:",vC2_P9_1_4 + "");
            Log.e("vC2_P9_1_4_0:",vC2_P9_1_4_0 + "");
            Log.e("vC2_P9_1_5:",vC2_P9_1_5 + "");
            Log.e("vC2_P10_1_1:",vC2_P10_1_1 + "");
            Log.e("vC2_P10_1_2:",vC2_P10_1_2 + "");
            Log.e("vC2_P10_1_3:",vC2_P10_1_3 + "");
            Log.e("vC2_P10_1_4:",vC2_P10_1_4 + "");
            Log.e("vC2_P10_1_5:",vC2_P10_1_5 + "");
            Log.e("vC2_P10_1_6:",vC2_P10_1_6 + "");
            Log.e("vC2_P10_1_6_0:",vC2_P10_1_6_0 + "");
            Log.e("vC2_P10_2_2:",vC2_P10_2_2 + "");
            Log.e("vC2_P10_2_3:",vC2_P10_2_3 + "");
            Log.e("vC2_P10_2_4:",vC2_P10_2_4 + "");
            Log.e("vC2_P10_2_5:",vC2_P10_2_5 + "");
            Log.e("vC2_P10_2_6:",vC2_P10_2_6 + "");
            Log.e("vC2_P11_1_1:",vC2_P11_1_1 + "");
            Log.e("vC2_P11_1_2:",vC2_P11_1_2 + "");
            Log.e("vC2_P11_1_3:",vC2_P11_1_3 + "");
            Log.e("vC2_P11_1_4:",vC2_P11_1_4 + "");
            Log.e("vC2_P11_1_5:",vC2_P11_1_5 + "");
            Log.e("vC2_P11_1_6:",vC2_P11_1_6 + "");
            Log.e("vC2_P11_1_7:",vC2_P11_1_7 + "");
            Log.e("vC2_P11_1_7_0:",vC2_P11_1_7_0 + "");
            Log.e("vC2_P11_2_2:",vC2_P11_2_2 + "");
            Log.e("vC2_P11_2_3:",vC2_P11_2_3 + "");
            Log.e("vC2_P11_2_4:",vC2_P11_2_4 + "");
            Log.e("vC2_P11_2_5:",vC2_P11_2_5 + "");
            Log.e("vC2_P11_2_6:",vC2_P11_2_6 + "");
            Log.e("vC2_P11_2_7:",vC2_P11_2_7 + "");
            Log.e("vC2_P12_1:",vC2_P12_1 + "");
            Log.e("vC2_P12_2:",vC2_P12_2 + "");
            Log.e("vC2_P12_3:",vC2_P12_3 + "");
            Log.e("vC2_P12_3_0:",vC2_P12_3_0 + "");
            Log.e("vC2_P13_1_1:",vC2_P13_1_1 + "");
            Log.e("vC2_P13_1_2:",vC2_P13_1_2 + "");
            Log.e("vC2_P13_1_3:",vC2_P13_1_3 + "");
            Log.e("vC2_P13_1_4:",vC2_P13_1_4 + "");
            Log.e("vC2_P13_1_5:",vC2_P13_1_5 + "");
            Log.e("vC2_P13_1_6:",vC2_P13_1_6 + "");
            Log.e("vC2_P13_1_7:",vC2_P13_1_7 + "");
            Log.e("vC2_P13_1_7_0:",vC2_P13_1_7_0 + "");
            Log.e("vC2_P13_2_2:",vC2_P13_2_2 + "");
            Log.e("vC2_P13_2_3:",vC2_P13_2_3 + "");
            Log.e("vC2_P13_2_4:",vC2_P13_2_4 + "");
            Log.e("vC2_P13_2_5:",vC2_P13_2_5 + "");
            Log.e("vC2_P13_2_6:",vC2_P13_2_6 + "");
            Log.e("vC2_P13_2_7:",vC2_P13_2_7 + "");
            Log.e("vC2_P8_2_3:",vC2_P8_2_3 + "");
            Log.e("vC2_P9_1_6:",vC2_P9_1_6 + "");
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
