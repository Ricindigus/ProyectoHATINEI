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
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import pe.gob.inei.encuestahabilidades.NumericKeyBoardTransformationMethod;
import pe.gob.inei.encuestahabilidades.R;
import pe.gob.inei.encuestahabilidades.TablaFragmentos;
import pe.gob.inei.encuestahabilidades.modelo.Data;
import pe.gob.inei.encuestahabilidades.modelo.SQLConstantes;
import pe.gob.inei.encuestahabilidades.pojos.Modulo5;

/**
 * A simple {@link Fragment} subclass.
 */
public class Modulo5Fragment4 extends Fragment {
    private LinearLayout mod5_p6_lyt;
    private RadioGroup mod5_p6_rgb;

    private LinearLayout mod5_p7_lyt;
    private LinearLayout mod5_p8_lyt;

    private RadioGroup mod5_p7_rgb1;
    private RadioGroup mod5_p7_rgb2;
    private RadioGroup mod5_p7_rgb3;
    private RadioGroup mod5_p7_rgb4;
    private RadioGroup mod5_p7_rgb5;

    private RadioButton mod5_p7_rgb1_1;
    private RadioButton mod5_p7_rgb1_2;
    private RadioButton mod5_p7_rgb2_1;
    private RadioButton mod5_p7_rgb2_2;
    private RadioButton mod5_p7_rgb3_1;
    private RadioButton mod5_p7_rgb3_2;
    private RadioButton mod5_p7_rgb4_1;
    private RadioButton mod5_p7_rgb4_2;
    private RadioButton mod5_p7_rgb5_1;
    private RadioButton mod5_p7_rgb5_2;

    private LinearLayout mod5_p7_lyt1;
    private LinearLayout mod5_p7_lyt2;
    private LinearLayout mod5_p7_lyt3;
    private LinearLayout mod5_p7_lyt4;
    private LinearLayout mod5_p7_lyt5;

    private CheckBox mod5_p7_ck1_1;
    private CheckBox mod5_p7_ck1_2;
    private CheckBox mod5_p7_ck1_3;
    private CheckBox mod5_p7_ck1_4;
    private CheckBox mod5_p7_ck1_5;
    private CheckBox mod5_p7_ck1_6;
    private CheckBox mod5_p7_ck1_7;

    private CheckBox mod5_p7_ck2_1;
    private CheckBox mod5_p7_ck2_2;
    private CheckBox mod5_p7_ck2_3;
    private CheckBox mod5_p7_ck2_4;
    private CheckBox mod5_p7_ck2_5;
    private CheckBox mod5_p7_ck2_6;
    private CheckBox mod5_p7_ck2_7;

    private CheckBox mod5_p7_ck3_1;
    private CheckBox mod5_p7_ck3_2;
    private CheckBox mod5_p7_ck3_3;
    private CheckBox mod5_p7_ck3_4;
    private CheckBox mod5_p7_ck3_5;
    private CheckBox mod5_p7_ck3_6;
    private CheckBox mod5_p7_ck3_7;

    private CheckBox mod5_p7_ck4_1;
    private CheckBox mod5_p7_ck4_2;
    private CheckBox mod5_p7_ck4_3;
    private CheckBox mod5_p7_ck4_4;
    private CheckBox mod5_p7_ck4_5;
    private CheckBox mod5_p7_ck4_6;
    private CheckBox mod5_p7_ck4_7;

    private CheckBox mod5_p7_ck5_1;
    private CheckBox mod5_p7_ck5_2;
    private CheckBox mod5_p7_ck5_3;
    private CheckBox mod5_p7_ck5_4;
    private CheckBox mod5_p7_ck5_5;
    private CheckBox mod5_p7_ck5_6;
    private CheckBox mod5_p7_ck5_7;

    private EditText mod5_p7_edt1;
    private EditText mod5_p7_edt2;
    private EditText mod5_p7_edt3;
    private EditText mod5_p7_edt4;
    private EditText mod5_p7_edt5;
    private EditText mod5_p7_edt5_1;

    private EditText mod5_p8_edt;
    //CARGADO Y GUARDADO
    private String idempresa;
    private Modulo5 modulo5;
    private Context context;
    private Data data;
    int C5_P6;
    int C5_P7_1;
    int C5_P7_2;
    int C5_P7_3;
    int C5_P7_4;
    int C5_P7_5;
    String C5_P7_5_0;
    int C5_P7_1_1;
    int C5_P7_2_1;
    int C5_P7_3_1;
    int C5_P7_4_1;
    int C5_P7_5_1;
    int C5_P7_6_1;
    String C5_P7_6_1_0;
    int C5_P7_7_1;
    int C5_P7_1_2;
    int C5_P7_2_2;
    int C5_P7_3_2;
    int C5_P7_4_2;
    int C5_P7_5_2;
    int C5_P7_6_2;
    String C5_P7_6_2_0;
    int C5_P7_7_2;
    int C5_P7_1_3;
    int C5_P7_2_3;
    int C5_P7_3_3;
    int C5_P7_4_3;
    int C5_P7_5_3;
    int C5_P7_6_3;
    String C5_P7_6_3_0;
    int C5_P7_7_3;
    int C5_P7_1_4;
    int C5_P7_2_4;
    int C5_P7_3_4;
    int C5_P7_4_4;
    int C5_P7_5_4;
    int C5_P7_6_4;
    String C5_P7_6_4_0;
    int C5_P7_7_4;
    int C5_P7_1_5;
    int C5_P7_2_5;
    int C5_P7_3_5;
    int C5_P7_4_5;
    int C5_P7_5_5;
    int C5_P7_6_5;
    String C5_P7_6_5_0;
    int C5_P7_7_5;
    String C5_P8;



    public Modulo5Fragment4() {
        // Required empty public constructor
    }

    @SuppressLint("ValidFragment")
    public Modulo5Fragment4(String idempresa, Context context) {
        this.idempresa = idempresa;
        this.context = context;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_modulo5_fragment4, container, false);

        mod5_p6_lyt = (LinearLayout) rootView.findViewById(R.id.mod5_p6_lyt);
        mod5_p7_lyt = (LinearLayout) rootView.findViewById(R.id.mod5_p7_lyt);
        mod5_p8_lyt = (LinearLayout) rootView.findViewById(R.id.mod5_p8_lyt);
        mod5_p6_rgb = (RadioGroup) rootView.findViewById(R.id.mod5_p6_rgb);

        mod5_p7_rgb1 = (RadioGroup) rootView.findViewById(R.id.mod5_p7_rgb1);
        mod5_p7_rgb2 = (RadioGroup) rootView.findViewById(R.id.mod5_p7_rgb2);
        mod5_p7_rgb3 = (RadioGroup) rootView.findViewById(R.id.mod5_p7_rgb3);
        mod5_p7_rgb4 = (RadioGroup) rootView.findViewById(R.id.mod5_p7_rgb4);
        mod5_p7_rgb5 = (RadioGroup) rootView.findViewById(R.id.mod5_p7_rgb5);

        mod5_p7_rgb1_1 = (RadioButton) rootView.findViewById(R.id.mod5_p7_rgb1_1);
        mod5_p7_rgb1_2 = (RadioButton) rootView.findViewById(R.id.mod5_p7_rgb1_2);
        mod5_p7_rgb2_1 = (RadioButton) rootView.findViewById(R.id.mod5_p7_rgb2_1);
        mod5_p7_rgb2_2 = (RadioButton) rootView.findViewById(R.id.mod5_p7_rgb2_2);
        mod5_p7_rgb3_1 = (RadioButton) rootView.findViewById(R.id.mod5_p7_rgb3_1);
        mod5_p7_rgb3_2 = (RadioButton) rootView.findViewById(R.id.mod5_p7_rgb3_2);
        mod5_p7_rgb4_1 = (RadioButton) rootView.findViewById(R.id.mod5_p7_rgb4_1);
        mod5_p7_rgb4_2 = (RadioButton) rootView.findViewById(R.id.mod5_p7_rgb4_2);
        mod5_p7_rgb5_1 = (RadioButton) rootView.findViewById(R.id.mod5_p7_rgb5_1);
        mod5_p7_rgb5_2 = (RadioButton) rootView.findViewById(R.id.mod5_p7_rgb5_2);


        mod5_p7_lyt1 = (LinearLayout) rootView.findViewById(R.id.mod5_p7_lyt1);
        mod5_p7_lyt2 = (LinearLayout) rootView.findViewById(R.id.mod5_p7_lyt2);
        mod5_p7_lyt3 = (LinearLayout) rootView.findViewById(R.id.mod5_p7_lyt3);
        mod5_p7_lyt4 = (LinearLayout) rootView.findViewById(R.id.mod5_p7_lyt4);
        mod5_p7_lyt5 = (LinearLayout) rootView.findViewById(R.id.mod5_p7_lyt5);

        mod5_p7_ck1_1 = (CheckBox) rootView.findViewById(R.id.mod5_p7_ck1_1);
        mod5_p7_ck1_2 = (CheckBox) rootView.findViewById(R.id.mod5_p7_ck1_2);
        mod5_p7_ck1_3 = (CheckBox) rootView.findViewById(R.id.mod5_p7_ck1_3);
        mod5_p7_ck1_4 = (CheckBox) rootView.findViewById(R.id.mod5_p7_ck1_4);
        mod5_p7_ck1_5 = (CheckBox) rootView.findViewById(R.id.mod5_p7_ck1_5);
        mod5_p7_ck1_6 = (CheckBox) rootView.findViewById(R.id.mod5_p7_ck1_6);
        mod5_p7_ck1_7 = (CheckBox) rootView.findViewById(R.id.mod5_p7_ck1_7);

        mod5_p7_ck2_1 = (CheckBox) rootView.findViewById(R.id.mod5_p7_ck2_1);
        mod5_p7_ck2_2 = (CheckBox) rootView.findViewById(R.id.mod5_p7_ck2_2);
        mod5_p7_ck2_3 = (CheckBox) rootView.findViewById(R.id.mod5_p7_ck2_3);
        mod5_p7_ck2_4 = (CheckBox) rootView.findViewById(R.id.mod5_p7_ck2_4);
        mod5_p7_ck2_5 = (CheckBox) rootView.findViewById(R.id.mod5_p7_ck2_5);
        mod5_p7_ck2_6 = (CheckBox) rootView.findViewById(R.id.mod5_p7_ck2_6);
        mod5_p7_ck2_7 = (CheckBox) rootView.findViewById(R.id.mod5_p7_ck2_7);

        mod5_p7_ck3_1 = (CheckBox) rootView.findViewById(R.id.mod5_p7_ck3_1);
        mod5_p7_ck3_2 = (CheckBox) rootView.findViewById(R.id.mod5_p7_ck3_2);
        mod5_p7_ck3_3 = (CheckBox) rootView.findViewById(R.id.mod5_p7_ck3_3);
        mod5_p7_ck3_4 = (CheckBox) rootView.findViewById(R.id.mod5_p7_ck3_4);
        mod5_p7_ck3_5 = (CheckBox) rootView.findViewById(R.id.mod5_p7_ck3_5);
        mod5_p7_ck3_6 = (CheckBox) rootView.findViewById(R.id.mod5_p7_ck3_6);
        mod5_p7_ck3_7 = (CheckBox) rootView.findViewById(R.id.mod5_p7_ck3_7);

        mod5_p7_ck4_1 = (CheckBox) rootView.findViewById(R.id.mod5_p7_ck4_1);
        mod5_p7_ck4_2 = (CheckBox) rootView.findViewById(R.id.mod5_p7_ck4_2);
        mod5_p7_ck4_3 = (CheckBox) rootView.findViewById(R.id.mod5_p7_ck4_3);
        mod5_p7_ck4_4 = (CheckBox) rootView.findViewById(R.id.mod5_p7_ck4_4);
        mod5_p7_ck4_5 = (CheckBox) rootView.findViewById(R.id.mod5_p7_ck4_5);
        mod5_p7_ck4_6 = (CheckBox) rootView.findViewById(R.id.mod5_p7_ck4_6);
        mod5_p7_ck4_7 = (CheckBox) rootView.findViewById(R.id.mod5_p7_ck4_7);

        mod5_p7_ck5_1 = (CheckBox) rootView.findViewById(R.id.mod5_p7_ck5_1);
        mod5_p7_ck5_2 = (CheckBox) rootView.findViewById(R.id.mod5_p7_ck5_2);
        mod5_p7_ck5_3 = (CheckBox) rootView.findViewById(R.id.mod5_p7_ck5_3);
        mod5_p7_ck5_4 = (CheckBox) rootView.findViewById(R.id.mod5_p7_ck5_4);
        mod5_p7_ck5_5 = (CheckBox) rootView.findViewById(R.id.mod5_p7_ck5_5);
        mod5_p7_ck5_6 = (CheckBox) rootView.findViewById(R.id.mod5_p7_ck5_6);
        mod5_p7_ck5_7 = (CheckBox) rootView.findViewById(R.id.mod5_p7_ck5_7);

        mod5_p7_edt1 = (EditText) rootView.findViewById(R.id.mod5_p7_edt1);
        mod5_p7_edt2 = (EditText) rootView.findViewById(R.id.mod5_p7_edt2);
        mod5_p7_edt3 = (EditText) rootView.findViewById(R.id.mod5_p7_edt3);
        mod5_p7_edt4 = (EditText) rootView.findViewById(R.id.mod5_p7_edt4);
        mod5_p7_edt5 = (EditText) rootView.findViewById(R.id.mod5_p7_edt5);
        mod5_p7_edt5_1 = (EditText) rootView.findViewById(R.id.mod5_p7_edt5_1);

        mod5_p8_edt = (EditText) rootView.findViewById(R.id.mod5_p8_edt);

        return rootView;
    }
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        final LinearLayout[] listasLinearlayout ={mod5_p7_lyt1,
                mod5_p7_lyt2,
                mod5_p7_lyt3,
                mod5_p7_lyt4,
                mod5_p7_lyt5};
        final CheckBox[] listacheck1 ={mod5_p7_ck1_1,
                mod5_p7_ck1_2,
                mod5_p7_ck1_3,
                mod5_p7_ck1_4,
                mod5_p7_ck1_5,
                mod5_p7_ck1_6,
                mod5_p7_ck1_7};

        final CheckBox[] listacheck2 ={mod5_p7_ck2_1,
                mod5_p7_ck2_2,
                mod5_p7_ck2_3,
                mod5_p7_ck2_4,
                mod5_p7_ck2_5,
                mod5_p7_ck2_6,
                mod5_p7_ck2_7};

        final CheckBox[] listacheck3 ={mod5_p7_ck3_1,
                mod5_p7_ck3_2,
                mod5_p7_ck3_3,
                mod5_p7_ck3_4,
                mod5_p7_ck3_5,
                mod5_p7_ck3_6,
                mod5_p7_ck3_7};

        final CheckBox[] listacheck4 ={mod5_p7_ck4_1,
                mod5_p7_ck4_2,
                mod5_p7_ck4_3,
                mod5_p7_ck4_4,
                mod5_p7_ck4_5,
                mod5_p7_ck4_6,
                mod5_p7_ck4_7};

        final CheckBox[] listacheck5 ={mod5_p7_ck5_1,
                mod5_p7_ck5_2,
                mod5_p7_ck5_3,
                mod5_p7_ck5_4,
                mod5_p7_ck5_5,
                mod5_p7_ck5_6,
                mod5_p7_ck5_7};

        final CheckBox[] listacheck0 ={mod5_p7_ck1_6,
                mod5_p7_ck2_6,
                mod5_p7_ck3_6,
                mod5_p7_ck4_6,
                mod5_p7_ck5_6};


        final CheckBox[] listacheck ={mod5_p7_ck1_1,
                mod5_p7_ck1_2,
                mod5_p7_ck1_3,
                mod5_p7_ck1_4,
                mod5_p7_ck1_5,
                mod5_p7_ck1_6,
                mod5_p7_ck1_7,
                mod5_p7_ck2_1,
                mod5_p7_ck2_2,
                mod5_p7_ck2_3,
                mod5_p7_ck2_4,
                mod5_p7_ck2_5,
                mod5_p7_ck2_6,
                mod5_p7_ck2_7,
                mod5_p7_ck3_1,
                mod5_p7_ck3_2,
                mod5_p7_ck3_3,
                mod5_p7_ck3_4,
                mod5_p7_ck3_5,
                mod5_p7_ck3_6,
                mod5_p7_ck3_7,
                mod5_p7_ck4_1,
                mod5_p7_ck4_2,
                mod5_p7_ck4_3,
                mod5_p7_ck4_4,
                mod5_p7_ck4_5,
                mod5_p7_ck4_6,
                mod5_p7_ck4_7,
                mod5_p7_ck5_1,
                mod5_p7_ck5_2,
                mod5_p7_ck5_3,
                mod5_p7_ck5_4,
                mod5_p7_ck5_5,
                mod5_p7_ck5_6,
                mod5_p7_ck5_7};

        final EditText[] listaEdt={mod5_p7_edt1,
                mod5_p7_edt2,
                mod5_p7_edt3,
                mod5_p7_edt4,
                mod5_p7_edt5
        };

        final RadioGroup[] listaRgb={mod5_p7_rgb1,
                mod5_p7_rgb2,
                mod5_p7_rgb3,
                mod5_p7_rgb4,
                mod5_p7_rgb5};
        final RadioButton[] listaRb={mod5_p7_rgb1_1, mod5_p7_rgb1_2,
                mod5_p7_rgb2_1, mod5_p7_rgb2_2,
                mod5_p7_rgb3_1, mod5_p7_rgb3_2,
                mod5_p7_rgb4_1, mod5_p7_rgb4_2,
                mod5_p7_rgb5_1, mod5_p7_rgb5_2,
                };

        for (int e = 0; e < listaRb.length; e++) {
            listaRb[e].setEnabled(false);
        }


        mod5_p6_rgb.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, @IdRes int i) {
                switch (i){
                    case R.id.mod5_p6_rgb1:
                        mod5_p7_lyt.setVisibility(View.VISIBLE);
                        mod5_p7_lyt.requestFocus();
                        for (int e = 0; e < listaRb.length; e++) {
                            listaRb[e].setEnabled(true);
                        }
                        break;
                    case R.id.mod5_p6_rgb2:
                        // rgP7.clearCheck();
                        mod5_p7_lyt.setVisibility(View.GONE);

                        for (int e = 0; e < listacheck.length; e++) {
                            listacheck[e].setChecked(false);
                        }
                        for (int e = 0; e < listaEdt.length; e++) {
                            listaEdt[e].setText("");
                        }
                        for (int e = 0; e < listaRb.length; e++) {
                            listaRb[e].setChecked(false);
                        }
                        mod5_p8_lyt.requestFocus();

                        break;
                    case R.id.mod5_p6_rgb3:
                        // rgp2.clearCheck();
                        mod5_p7_lyt.setVisibility(View.GONE);
                        for (int e = 0; e < listacheck.length; e++) {
                            listacheck[e].setChecked(false);
                        }
                        for (int e = 0; e < listaEdt.length; e++) {
                            listaEdt[e].setText("");
                        }
                        for (int e = 0; e < listaRb.length; e++) {
                            listaRb[e].setChecked(false);
                        }
                        mod5_p8_lyt.requestFocus();
                        break;
                }
            }
        });

        //PREGUNTA 7

        //mod5_p7_edt5_1.setEnabled(false);
        mod5_p7_edt5_1.setFilters(new InputFilter[]{new InputFilter.AllCaps()});
        //mod5_p7_edt5_1.setBackgroundResource(R.drawable.spinner_disabled);

        for (int e = 0; e < listaEdt.length; e++) {
            listaEdt[e].setEnabled(false);
            listaEdt[e].setFilters(new InputFilter[]{new InputFilter.AllCaps()});
            listaEdt[e].setBackgroundResource(R.drawable.spinner_disabled);

            for (int j = 0; j < listaEdt.length; j++) {
                final int f=j;
                listaEdt[f].setOnKeyListener(new View.OnKeyListener()
                {
                    @Override
                    public boolean onKey(View view, int keyCode, KeyEvent keyEvent) {
                        if ((keyEvent.getAction() == KeyEvent.ACTION_DOWN) &&
                                (keyCode == KeyEvent.KEYCODE_ENTER)) {
                            ocultarTeclado(listaEdt[f]);
                            listaEdt[f].setBackgroundResource(R.drawable.fondo_spinner);
                            listasLinearlayout[f].requestFocus();
                            ocultarTeclado(listaEdt[f]);

                            return true;
                        }
                        return false;
                    }
                });
            }

        }

        for (int e = 0; e < listacheck.length; e++) {
            listacheck[e].setEnabled(false);
        }

        mod5_p7_rgb1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, @IdRes int i) {
                switch (i){
                    case R.id.mod5_p7_rgb1_1:

                        for (int e = 0; e < listacheck1.length; e++) {
                            listacheck1[e].setEnabled(false);
                            listacheck1[e].setChecked(false);
                        }

                      mod5_p7_lyt2.requestFocus();
                        break;
                    case R.id.mod5_p7_rgb1_2:
                        // rgp2.clearCheck();
                        for (int e = 0; e < listacheck1.length; e++) {
                            listacheck1[e].setEnabled(true);
                        }
                     //   mod5_p7_ck1_1.requestFocus();
                        break;

                }
            }
        });

        mod5_p7_rgb2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, @IdRes int i) {
                switch (i){
                    case R.id.mod5_p7_rgb2_1:


                        for (int e = 0; e < listacheck2.length; e++) {
                            listacheck2[e].setEnabled(false);
                            listacheck2[e].setChecked(false);
                        }

                        mod5_p7_lyt3.requestFocus();
                        break;
                    case R.id.mod5_p7_rgb2_2:
                        // rgp2.clearCheck();
                        for (int e = 0; e < listacheck2.length; e++) {
                            listacheck2[e].setEnabled(true);
                        }
                        //mod5_p7_ck2_1.requestFocus();
                        break;

                }
            }
        });
        mod5_p7_rgb3.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, @IdRes int i) {
                switch (i){
                    case R.id.mod5_p7_rgb3_1:


                        for (int e = 0; e < listacheck3.length; e++) {
                            listacheck3[e].setEnabled(false);
                            listacheck3[e].setChecked(false);
                        }

                        mod5_p7_lyt4.requestFocus();
                        break;
                    case R.id.mod5_p7_rgb3_2:
                        // rgp2.clearCheck();
                        for (int e = 0; e < listacheck3.length; e++) {
                            listacheck3[e].setEnabled(true);
                        }
                       // mod5_p7_ck3_1.requestFocus();
                        break;

                }
            }
        });
        mod5_p7_rgb4.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, @IdRes int i) {
                switch (i){
                    case R.id.mod5_p7_rgb4_1:


                        for (int e = 0; e < listacheck4.length; e++) {
                            listacheck4[e].setEnabled(false);
                            listacheck4[e].setChecked(false);
                        }

                        mod5_p7_lyt5.requestFocus();
                        break;
                    case R.id.mod5_p7_rgb4_2:

                        for (int e = 0; e < listacheck4.length; e++) {
                            listacheck4[e].setEnabled(true);
                        }
                      //  mod5_p7_ck4_1.requestFocus();
                        break;

                }
            }
        });
        mod5_p7_rgb5.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, @IdRes int i) {
                switch (i){
                    case R.id.mod5_p7_rgb5_1:
                        mod5_p7_edt5_1.setEnabled(true);
                        mod5_p7_edt5_1.setBackgroundResource(R.drawable.fondo_spinner);
//                        mod5_p7_edt5_1.requestFocus();
                        mostrarTeclado();
                        for (int e = 0; e < listacheck5.length; e++) {
                            listacheck5[e].setEnabled(false);
                            listacheck5[e].setChecked(false);
                        }
                        mod5_p7_edt5_1.requestFocus();
                        mostrarTeclado();
                        break;
                    case R.id.mod5_p7_rgb5_2:
                        // rgp2.clearCheck();
                        for (int e = 0; e < listacheck5.length; e++) {
                            listacheck5[e].setEnabled(true);
                        }
                    //    mod5_p7_ck5_1.requestFocus();
                        break;

                }
            }
        });



        //SELECCION DE  CHECKBOX
        for ( int i=0 ; i<listacheck0.length ;i++) {
            final int e=i;

            listacheck0[e].setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton compoundButton, boolean checkeado) {

                    if(checkeado) {
                            listaEdt[e].setEnabled(true);
                            listaEdt[e].setBackgroundResource(R.drawable.spinner_enabled);


                    }else{

                        listaEdt[e].setEnabled(false);
                        listaEdt[e].setBackgroundResource(R.drawable.spinner_disabled);
                        listaEdt[e].setText("");
                        }

                    }

            });



        }//------------

        mod5_p8_edt.setTransformationMethod(new NumericKeyBoardTransformationMethod());

        cargarDatos();
    }
    public void ocultarTeclado(View view){
        InputMethodManager mgr =(InputMethodManager) getActivity().getSystemService(Context.INPUT_METHOD_SERVICE);
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
        if (data.existeModulo5(idempresa)) {
            //si existe traigo el objeto
            modulo5 = data.getModulo5(idempresa);
            //saco los datos del objeto para llenarlos en los elementos del fragment
            //datos cabecera

            //PREGUNTA 6
            if(!modulo5.getC5_P6().equals("") && (!modulo5.getC5_P6().equals("-1")))
            {int childPos6 = Integer.parseInt(modulo5.getC5_P6());
                ((RadioButton) mod5_p6_rgb.getChildAt(childPos6)).setChecked(true);}
            //PREGUNTA 7.1
            if(!modulo5.getC5_P7_1().equals("") && (!modulo5.getC5_P7_1().equals("-1")))
            {int childPos1 = Integer.parseInt(modulo5.getC5_P7_1());
                ((RadioButton) mod5_p7_rgb1.getChildAt(childPos1)).setChecked(true);}
            if (modulo5.getC5_P7_1_1().equals("1")) mod5_p7_ck1_1.setChecked(true);
            if (modulo5.getC5_P7_1_1().equals("0")) mod5_p7_ck1_1.setChecked(false);
            if (modulo5.getC5_P7_2_1().equals("1")) mod5_p7_ck1_2.setChecked(true);
            if (modulo5.getC5_P7_2_1().equals("0")) mod5_p7_ck1_2.setChecked(false);
            if (modulo5.getC5_P7_3_1().equals("1")) mod5_p7_ck1_3.setChecked(true);
            if (modulo5.getC5_P7_3_1().equals("0")) mod5_p7_ck1_3.setChecked(false);
            if (modulo5.getC5_P7_4_1().equals("1")) mod5_p7_ck1_4.setChecked(true);
            if (modulo5.getC5_P7_4_1().equals("0")) mod5_p7_ck1_4.setChecked(false);
            if (modulo5.getC5_P7_5_1().equals("1")) mod5_p7_ck1_5.setChecked(true);
            if (modulo5.getC5_P7_5_1().equals("0")) mod5_p7_ck1_5.setChecked(false);
            if (modulo5.getC5_P7_6_1().equals("1")) mod5_p7_ck1_6.setChecked(true);
            if (modulo5.getC5_P7_6_1().equals("0")) mod5_p7_ck1_6.setChecked(false);
            mod5_p7_edt1.setText(modulo5.getC5_P7_6_1_0());
            if (modulo5.getC5_P7_7_1().equals("1")) mod5_p7_ck1_7.setChecked(true);
            if (modulo5.getC5_P7_7_1().equals("0")) mod5_p7_ck1_7.setChecked(false);
            //PREGUNTA 7.2
            if(!modulo5.getC5_P7_2().equals("") && (!modulo5.getC5_P7_2().equals("-1")))
            {int childPos2 = Integer.parseInt(modulo5.getC5_P7_2());
                ((RadioButton) mod5_p7_rgb2.getChildAt(childPos2)).setChecked(true);}
            if (modulo5.getC5_P7_1_2().equals("1")) mod5_p7_ck2_1.setChecked(true);
            if (modulo5.getC5_P7_1_2().equals("0")) mod5_p7_ck2_1.setChecked(false);
            if (modulo5.getC5_P7_2_2().equals("1")) mod5_p7_ck2_2.setChecked(true);
            if (modulo5.getC5_P7_2_2().equals("0")) mod5_p7_ck2_2.setChecked(false);
            if (modulo5.getC5_P7_3_2().equals("1")) mod5_p7_ck2_3.setChecked(true);
            if (modulo5.getC5_P7_3_2().equals("0")) mod5_p7_ck2_3.setChecked(false);
            if (modulo5.getC5_P7_4_2().equals("1")) mod5_p7_ck2_4.setChecked(true);
            if (modulo5.getC5_P7_4_2().equals("0")) mod5_p7_ck2_4.setChecked(false);
            if (modulo5.getC5_P7_5_2().equals("1")) mod5_p7_ck2_5.setChecked(true);
            if (modulo5.getC5_P7_5_2().equals("0")) mod5_p7_ck2_5.setChecked(false);
            if (modulo5.getC5_P7_6_2().equals("1")) mod5_p7_ck2_6.setChecked(true);
            if (modulo5.getC5_P7_6_2().equals("0")) mod5_p7_ck2_6.setChecked(false);
            mod5_p7_edt2.setText(modulo5.getC5_P7_6_2_0());
            if (modulo5.getC5_P7_7_2().equals("1")) mod5_p7_ck2_7.setChecked(true);
            if (modulo5.getC5_P7_7_2().equals("0")) mod5_p7_ck2_7.setChecked(false);

            //PREGUNTA 7.3
            if(!modulo5.getC5_P7_3().equals("") && (!modulo5.getC5_P7_3().equals("-1")))
            {int childPos3 = Integer.parseInt(modulo5.getC5_P7_3());
                ((RadioButton) mod5_p7_rgb3.getChildAt(childPos3)).setChecked(true);}
            if (modulo5.getC5_P7_1_3().equals("1")) mod5_p7_ck3_1.setChecked(true);
            if (modulo5.getC5_P7_1_3().equals("0")) mod5_p7_ck3_1.setChecked(false);
            if (modulo5.getC5_P7_2_3().equals("1")) mod5_p7_ck3_2.setChecked(true);
            if (modulo5.getC5_P7_2_3().equals("0")) mod5_p7_ck3_2.setChecked(false);
            if (modulo5.getC5_P7_3_3().equals("1")) mod5_p7_ck3_3.setChecked(true);
            if (modulo5.getC5_P7_3_3().equals("0")) mod5_p7_ck3_3.setChecked(false);
            if (modulo5.getC5_P7_4_3().equals("1")) mod5_p7_ck3_4.setChecked(true);
            if (modulo5.getC5_P7_4_3().equals("0")) mod5_p7_ck3_4.setChecked(false);
            if (modulo5.getC5_P7_5_3().equals("1")) mod5_p7_ck3_5.setChecked(true);
            if (modulo5.getC5_P7_5_3().equals("0")) mod5_p7_ck3_5.setChecked(false);
            if (modulo5.getC5_P7_6_3().equals("1")) mod5_p7_ck3_6.setChecked(true);
            if (modulo5.getC5_P7_6_3().equals("0")) mod5_p7_ck3_6.setChecked(false);
            mod5_p7_edt3.setText(modulo5.getC5_P7_6_3_0());
            if (modulo5.getC5_P7_7_3().equals("1")) mod5_p7_ck3_7.setChecked(true);
            if (modulo5.getC5_P7_7_3().equals("0")) mod5_p7_ck3_7.setChecked(false);
            //PREGUNTA 7.4
            if(!modulo5.getC5_P7_4().equals("") && (!modulo5.getC5_P7_4().equals("-1")))
            {int childPos4 = Integer.parseInt(modulo5.getC5_P7_4());
                ((RadioButton) mod5_p7_rgb4.getChildAt(childPos4)).setChecked(true);}
            if (modulo5.getC5_P7_1_4().equals("1")) mod5_p7_ck4_1.setChecked(true);
            if (modulo5.getC5_P7_1_4().equals("0")) mod5_p7_ck4_1.setChecked(false);
            if (modulo5.getC5_P7_2_4().equals("1")) mod5_p7_ck4_2.setChecked(true);
            if (modulo5.getC5_P7_2_4().equals("0")) mod5_p7_ck4_2.setChecked(false);
            if (modulo5.getC5_P7_3_4().equals("1")) mod5_p7_ck4_3.setChecked(true);
            if (modulo5.getC5_P7_3_4().equals("0")) mod5_p7_ck4_3.setChecked(false);
            if (modulo5.getC5_P7_4_4().equals("1")) mod5_p7_ck4_4.setChecked(true);
            if (modulo5.getC5_P7_4_4().equals("0")) mod5_p7_ck4_4.setChecked(false);
            if (modulo5.getC5_P7_5_4().equals("1")) mod5_p7_ck4_5.setChecked(true);
            if (modulo5.getC5_P7_5_4().equals("0")) mod5_p7_ck4_5.setChecked(false);
            if (modulo5.getC5_P7_6_4().equals("1")) mod5_p7_ck4_6.setChecked(true);
            if (modulo5.getC5_P7_6_4().equals("0")) mod5_p7_ck4_6.setChecked(false);
            mod5_p7_edt4.setText(modulo5.getC5_P7_6_4_0());
            if (modulo5.getC5_P7_7_4().equals("1")) mod5_p7_ck4_7.setChecked(true);
            if (modulo5.getC5_P7_7_4().equals("0")) mod5_p7_ck4_7.setChecked(false);
            //PREGUNTA 7.5
            mod5_p7_edt5_1.setText(modulo5.getC5_P7_5_0());
            if(!modulo5.getC5_P7_5().equals("") && (!modulo5.getC5_P7_5().equals("-1")))
            {int childPos5 = Integer.parseInt(modulo5.getC5_P7_5());
                ((RadioButton) mod5_p7_rgb5.getChildAt(childPos5)).setChecked(true);}
            if (modulo5.getC5_P7_1_5().equals("1")) mod5_p7_ck5_1.setChecked(true);
            if (modulo5.getC5_P7_1_5().equals("0")) mod5_p7_ck5_1.setChecked(false);
            if (modulo5.getC5_P7_2_5().equals("1")) mod5_p7_ck5_2.setChecked(true);
            if (modulo5.getC5_P7_2_5().equals("0")) mod5_p7_ck5_2.setChecked(false);
            if (modulo5.getC5_P7_3_5().equals("1")) mod5_p7_ck5_3.setChecked(true);
            if (modulo5.getC5_P7_3_5().equals("0")) mod5_p7_ck5_3.setChecked(false);
            if (modulo5.getC5_P7_4_5().equals("1")) mod5_p7_ck5_4.setChecked(true);
            if (modulo5.getC5_P7_4_5().equals("0")) mod5_p7_ck5_4.setChecked(false);
            if (modulo5.getC5_P7_5_5().equals("1")) mod5_p7_ck5_5.setChecked(true);
            if (modulo5.getC5_P7_5_5().equals("0")) mod5_p7_ck5_5.setChecked(false);
            if (modulo5.getC5_P7_6_5().equals("1")) mod5_p7_ck5_6.setChecked(true);
            if (modulo5.getC5_P7_6_5().equals("0")) mod5_p7_ck5_6.setChecked(false);
            mod5_p7_edt5.setText(modulo5.getC5_P7_6_5_0());
            if (modulo5.getC5_P7_7_5().equals("1")) mod5_p7_ck5_7.setChecked(true);
            if (modulo5.getC5_P7_7_5().equals("0")) mod5_p7_ck5_7.setChecked(false);
            //PREGUNTA 8
            mod5_p8_edt.setText(modulo5.getC5_P8());








        }
        data.close();
    }

    public void llenarMapaVariables() {
        //preguntas cabecera

        //pregunta 6
        int childPosP6 = mod5_p6_rgb.indexOfChild(mod5_p6_rgb.findViewById(mod5_p6_rgb.getCheckedRadioButtonId()));
        C5_P6 = childPosP6;
        //PREGUNTA 7.1
        int childPosP1 = mod5_p7_rgb1.indexOfChild(mod5_p7_rgb1.findViewById(mod5_p7_rgb1.getCheckedRadioButtonId()));
        C5_P7_1 = childPosP1;
        if (mod5_p7_ck1_1.isChecked()) C5_P7_1_1 = 1;
        else C5_P7_1_1 = 0;
        if (mod5_p7_ck1_2.isChecked()) C5_P7_2_1 = 1;
        else C5_P7_2_1 = 0;
        if (mod5_p7_ck1_3.isChecked()) C5_P7_3_1 = 1;
        else C5_P7_3_1 = 0;
        if (mod5_p7_ck1_4.isChecked()) C5_P7_4_1 = 1;
        else C5_P7_4_1 = 0;
        if (mod5_p7_ck1_5.isChecked()) C5_P7_5_1 = 1;
        else C5_P7_5_1 = 0;
        if (mod5_p7_ck1_6.isChecked()) C5_P7_6_1 = 1;
        else C5_P7_6_1 = 0;
        C5_P7_6_1_0 = mod5_p7_edt1.getText().toString();
        if (mod5_p7_ck1_7.isChecked()) C5_P7_7_1 = 1;
        else C5_P7_7_1 = 0;
        //PREGUNTA 7.2
        int childPosP2 = mod5_p7_rgb2.indexOfChild(mod5_p7_rgb2.findViewById(mod5_p7_rgb2.getCheckedRadioButtonId()));
        C5_P7_2 = childPosP2;
        if (mod5_p7_ck2_1.isChecked()) C5_P7_1_2 = 1;
        else C5_P7_1_2 = 0;
        if (mod5_p7_ck2_2.isChecked()) C5_P7_2_2 = 1;
        else C5_P7_2_2 = 0;
        if (mod5_p7_ck2_3.isChecked()) C5_P7_3_2 = 1;
        else C5_P7_3_2 = 0;
        if (mod5_p7_ck2_4.isChecked()) C5_P7_4_2 = 1;
        else C5_P7_4_2 = 0;
        if (mod5_p7_ck2_5.isChecked()) C5_P7_5_2 = 1;
        else C5_P7_5_2 = 0;
        if (mod5_p7_ck2_6.isChecked()) C5_P7_6_2 = 1;
        else C5_P7_6_2 = 0;
        C5_P7_6_2_0 = mod5_p7_edt2.getText().toString();
        if (mod5_p7_ck2_7.isChecked()) C5_P7_7_2 = 1;
        else C5_P7_7_2 = 0;
        //PREGUNTA 7.3
        int childPosP3 = mod5_p7_rgb3.indexOfChild(mod5_p7_rgb3.findViewById(mod5_p7_rgb3.getCheckedRadioButtonId()));
        C5_P7_3 = childPosP3;
        if (mod5_p7_ck3_1.isChecked()) C5_P7_1_3 = 1;
        else C5_P7_1_3 = 0;
        if (mod5_p7_ck3_2.isChecked()) C5_P7_2_3 = 1;
        else C5_P7_2_3 = 0;
        if (mod5_p7_ck3_3.isChecked()) C5_P7_3_3 = 1;
        else C5_P7_3_3 = 0;
        if (mod5_p7_ck3_4.isChecked()) C5_P7_4_3 = 1;
        else C5_P7_4_3 = 0;
        if (mod5_p7_ck3_5.isChecked()) C5_P7_5_3 = 1;
        else C5_P7_5_3 = 0;
        if (mod5_p7_ck3_6.isChecked()) C5_P7_6_3 = 1;
        else C5_P7_6_3 = 0;
        C5_P7_6_3_0 = mod5_p7_edt3.getText().toString();
        if (mod5_p7_ck3_7.isChecked()) C5_P7_7_3 = 1;
        else C5_P7_7_3 = 0;
        //PREGUNTA 7.4
        int childPosP4 = mod5_p7_rgb4.indexOfChild(mod5_p7_rgb4.findViewById(mod5_p7_rgb4.getCheckedRadioButtonId()));
        C5_P7_4 = childPosP4;
        if (mod5_p7_ck4_1.isChecked()) C5_P7_1_4 = 1;
        else C5_P7_1_4 = 0;
        if (mod5_p7_ck4_2.isChecked()) C5_P7_2_4 = 1;
        else C5_P7_2_4 = 0;
        if (mod5_p7_ck4_3.isChecked()) C5_P7_3_4 = 1;
        else C5_P7_3_4 = 0;
        if (mod5_p7_ck4_4.isChecked()) C5_P7_4_4 = 1;
        else C5_P7_4_4 = 0;
        if (mod5_p7_ck4_5.isChecked()) C5_P7_5_4 = 1;
        else C5_P7_5_4 = 0;
        if (mod5_p7_ck4_6.isChecked()) C5_P7_6_4 = 1;
        else C5_P7_6_4 = 0;
        C5_P7_6_4_0 = mod5_p7_edt4.getText().toString();
        if (mod5_p7_ck4_7.isChecked()) C5_P7_7_4 = 1;
        else C5_P7_7_4 = 0;
        //PREGUNTA 7.5
        C5_P7_5_0 = mod5_p7_edt5_1.getText().toString();
        int childPosP5 = mod5_p7_rgb5.indexOfChild(mod5_p7_rgb5.findViewById(mod5_p7_rgb5.getCheckedRadioButtonId()));
        C5_P7_5 = childPosP5;
        if (mod5_p7_ck5_1.isChecked()) C5_P7_1_5 = 1;
        else C5_P7_1_5 = 0;
        if (mod5_p7_ck5_2.isChecked()) C5_P7_2_5 = 1;
        else C5_P7_2_5 = 0;
        if (mod5_p7_ck5_3.isChecked()) C5_P7_3_5 = 1;
        else C5_P7_3_5 = 0;
        if (mod5_p7_ck5_4.isChecked()) C5_P7_4_5 = 1;
        else C5_P7_4_5 = 0;
        if (mod5_p7_ck5_5.isChecked()) C5_P7_5_5 = 1;
        else C5_P7_5_5 = 0;
        if (mod5_p7_ck5_6.isChecked()) C5_P7_6_5 = 1;
        else C5_P7_6_5 = 0;
        C5_P7_6_5_0 = mod5_p7_edt5.getText().toString();
        if (mod5_p7_ck5_7.isChecked()) C5_P7_7_5 = 1;
        else C5_P7_7_5 = 0;
        //C5_P7_7_0 = mod5_p7_0_edt.getText().toString();
        //PREGUNTA 8
        C5_P8 = mod5_p8_edt.getText().toString();

//        if(mod5_p8_edt.getText().toString().equals("")){
//            C5_P8 ="0";
//        }
//
//        if(!mod5_p8_edt.getText().toString().equals("")){
//            C5_P8 = mod5_p8_edt.getText().toString();
//        }

    }

    public void guardarDatos() {
        data = new Data(context);
        data.open();

        if (data.existeModulo5(idempresa)) {
            ContentValues contentValues = new ContentValues(478);
            contentValues.put(SQLConstantes.MODULO5_P6, C5_P6 + "");
            contentValues.put(SQLConstantes.MODULO5_P7_1, C5_P7_1 + "");
            contentValues.put(SQLConstantes.MODULO5_P7_1_1, C5_P7_1_1 + "");
            contentValues.put(SQLConstantes.MODULO5_P7_2_1, C5_P7_2_1 + "");
            contentValues.put(SQLConstantes.MODULO5_P7_3_1, C5_P7_3_1 + "");
            contentValues.put(SQLConstantes.MODULO5_P7_4_1, C5_P7_4_1 + "");
            contentValues.put(SQLConstantes.MODULO5_P7_5_1, C5_P7_5_1 + "");
            contentValues.put(SQLConstantes.MODULO5_P7_6_1, C5_P7_6_1 + "");
            contentValues.put(SQLConstantes.MODULO5_P7_6_1_0, C5_P7_6_1_0);
            contentValues.put(SQLConstantes.MODULO5_P7_7_1, C5_P7_7_1 + "");

            contentValues.put(SQLConstantes.MODULO5_P7_2, C5_P7_2 + "");
            contentValues.put(SQLConstantes.MODULO5_P7_1_2,C5_P7_1_2 + "");
            contentValues.put(SQLConstantes.MODULO5_P7_2_2,C5_P7_2_2 + "");
            contentValues.put(SQLConstantes.MODULO5_P7_3_2,C5_P7_3_2 + "");
            contentValues.put(SQLConstantes.MODULO5_P7_4_2,C5_P7_4_2 + "");
            contentValues.put(SQLConstantes.MODULO5_P7_5_2,C5_P7_5_2 + "");
            contentValues.put(SQLConstantes.MODULO5_P7_6_2,C5_P7_6_2 + "");
            contentValues.put(SQLConstantes.MODULO5_P7_6_2_0,C5_P7_6_2_0);
            contentValues.put(SQLConstantes.MODULO5_P7_7_2,C5_P7_7_2 + "");

            contentValues.put(SQLConstantes.MODULO5_P7_3, C5_P7_3 + "");
            contentValues.put(SQLConstantes.MODULO5_P7_1_3,C5_P7_1_3 + "");
            contentValues.put(SQLConstantes.MODULO5_P7_2_3,C5_P7_2_3 + "");
            contentValues.put(SQLConstantes.MODULO5_P7_3_3,C5_P7_3_3 + "");
            contentValues.put(SQLConstantes.MODULO5_P7_4_3,C5_P7_4_3 + "");
            contentValues.put(SQLConstantes.MODULO5_P7_5_3,C5_P7_5_3 + "");
            contentValues.put(SQLConstantes.MODULO5_P7_6_3,C5_P7_6_3 + "");
            contentValues.put(SQLConstantes.MODULO5_P7_6_3_0,C5_P7_6_3_0);
            contentValues.put(SQLConstantes.MODULO5_P7_7_3,C5_P7_7_3 + "");

            contentValues.put(SQLConstantes.MODULO5_P7_4, C5_P7_4 + "");
            contentValues.put(SQLConstantes.MODULO5_P7_1_4,C5_P7_1_4 + "");
            contentValues.put(SQLConstantes.MODULO5_P7_2_4,C5_P7_2_4 + "");
            contentValues.put(SQLConstantes.MODULO5_P7_3_4,C5_P7_3_4 + "");
            contentValues.put(SQLConstantes.MODULO5_P7_4_4,C5_P7_4_4 + "");
            contentValues.put(SQLConstantes.MODULO5_P7_5_4,C5_P7_5_4 + "");
            contentValues.put(SQLConstantes.MODULO5_P7_6_4,C5_P7_6_4 + "");
            contentValues.put(SQLConstantes.MODULO5_P7_6_4_0,C5_P7_6_4_0);
            contentValues.put(SQLConstantes.MODULO5_P7_7_4,C5_P7_7_4 + "");

            contentValues.put(SQLConstantes.MODULO5_P7_5_0, C5_P7_5_0 + "");
            contentValues.put(SQLConstantes.MODULO5_P7_5, C5_P7_5 + "");
            contentValues.put(SQLConstantes.MODULO5_P7_1_5,C5_P7_1_5 + "");
            contentValues.put(SQLConstantes.MODULO5_P7_2_5,C5_P7_2_5 + "");
            contentValues.put(SQLConstantes.MODULO5_P7_3_5,C5_P7_3_5 + "");
            contentValues.put(SQLConstantes.MODULO5_P7_4_5,C5_P7_4_5 + "");
            contentValues.put(SQLConstantes.MODULO5_P7_5_5,C5_P7_5_5 + "");
            contentValues.put(SQLConstantes.MODULO5_P7_6_5,C5_P7_6_5 + "");
            contentValues.put(SQLConstantes.MODULO5_P7_6_5_0,C5_P7_6_5_0);
            contentValues.put(SQLConstantes.MODULO5_P7_7_5,C5_P7_7_5 + "");


            contentValues.put(SQLConstantes.MODULO5_P8,C5_P8);

            data.actualizarModulo5(idempresa, contentValues);
        } else {
            //si no existe el elemento, lo construye para insertarlo
            modulo5 = new Modulo5();
            //llena el objeto a insertar
            modulo5.setMODULO5_ID(idempresa);

            modulo5.setC5_P6(C5_P6 + "");
            modulo5.setC5_P7_1(C5_P7_1 + "");
            modulo5.setC5_P7_1_1(C5_P7_1_1 + "");
            modulo5.setC5_P7_2_1(C5_P7_2_1 + "");
            modulo5.setC5_P7_3_1(C5_P7_3_1 + "");
            modulo5.setC5_P7_4_1(C5_P7_4_1 + "");
            modulo5.setC5_P7_5_1(C5_P7_5_1 + "");
            modulo5.setC5_P7_6_1(C5_P7_6_1 + "");
            modulo5.setC5_P7_6_1_0(C5_P7_6_1_0);
            modulo5.setC5_P7_7_1(C5_P7_7_1 + "");

            modulo5.setC5_P7_2(C5_P7_2 + "");
            modulo5.setC5_P7_1_2(C5_P7_1_2 + "");
            modulo5.setC5_P7_2_2(C5_P7_2_2 + "");
            modulo5.setC5_P7_3_2(C5_P7_3_2 + "");
            modulo5.setC5_P7_4_2(C5_P7_4_2 + "");
            modulo5.setC5_P7_5_2(C5_P7_5_2 + "");
            modulo5.setC5_P7_6_2(C5_P7_6_2 + "");
            modulo5.setC5_P7_6_2_0(C5_P7_6_2_0);
            modulo5.setC5_P7_7_2(C5_P7_7_2 + "");

            modulo5.setC5_P7_3(C5_P7_3 + "");
            modulo5.setC5_P7_1_3(C5_P7_1_3 + "");
            modulo5.setC5_P7_2_3(C5_P7_2_3 + "");
            modulo5.setC5_P7_3_3(C5_P7_3_3 + "");
            modulo5.setC5_P7_4_3(C5_P7_4_3 + "");
            modulo5.setC5_P7_5_3(C5_P7_5_3 + "");
            modulo5.setC5_P7_6_3(C5_P7_6_3 + "");
            modulo5.setC5_P7_6_3_0(C5_P7_6_3_0);
            modulo5.setC5_P7_7_3(C5_P7_7_3 + "");

            modulo5.setC5_P7_4(C5_P7_4 + "");
            modulo5.setC5_P7_1_4(C5_P7_1_4 + "");
            modulo5.setC5_P7_2_4(C5_P7_2_4 + "");
            modulo5.setC5_P7_3_4(C5_P7_3_4 + "");
            modulo5.setC5_P7_4_4(C5_P7_4_4 + "");
            modulo5.setC5_P7_5_4(C5_P7_5_4 + "");
            modulo5.setC5_P7_6_4(C5_P7_6_4 + "");
            modulo5.setC5_P7_6_4_0(C5_P7_6_4_0);
            modulo5.setC5_P7_7_4(C5_P7_7_4 + "");

            modulo5.setC5_P7_5_0(C5_P7_5_0 + "");
            modulo5.setC5_P7_5(C5_P7_5 + "");
            modulo5.setC5_P7_1_5(C5_P7_1_5 + "");
            modulo5.setC5_P7_2_5(C5_P7_2_5 + "");
            modulo5.setC5_P7_3_5(C5_P7_3_5 + "");
            modulo5.setC5_P7_4_5(C5_P7_4_5 + "");
            modulo5.setC5_P7_5_5(C5_P7_5_5 + "");
            modulo5.setC5_P7_6_5(C5_P7_6_5 + "");
            modulo5.setC5_P7_6_5_0(C5_P7_6_5_0);
            modulo5.setC5_P7_7_5(C5_P7_7_5 + "");
            //modulo5.setC5_P7_7_5_0(C5_P7_7_0);

            modulo5.setC5_P8(C5_P8);

            data.insertarModulo5(modulo5);
        }
        ContentValues f = new ContentValues(1);
        if(C5_P8.equals("0")){
            f.put(SQLConstantes.FRAGMENT_HABILITADO,"0");
        }else{
            f.put(SQLConstantes.FRAGMENT_HABILITADO,"1");
        }
        data.actualizarFragment(idempresa+ TablaFragmentos.FRAGMENT_M5F5,f);
        data.actualizarFragment(idempresa+ TablaFragmentos.FRAGMENT_M5F6,f);
        data.actualizarFragment(idempresa+ TablaFragmentos.FRAGMENT_M5F7,f);
        data.actualizarFragment(idempresa+ TablaFragmentos.FRAGMENT_M5F8,f);
        data.actualizarFragment(idempresa+ TablaFragmentos.FRAGMENT_M5F9,f);
        data.actualizarFragment(idempresa+ TablaFragmentos.FRAGMENT_M5F10,f);
        data.actualizarFragment(idempresa+ TablaFragmentos.FRAGMENT_M5F11,f);
        data.actualizarFragment(idempresa+ TablaFragmentos.FRAGMENT_M5F12,f);
        data.actualizarFragment(idempresa+ TablaFragmentos.FRAGMENT_M5F13,f);
        data.actualizarFragment(idempresa+ TablaFragmentos.FRAGMENT_M5F14,f);
        data.actualizarFragment(idempresa+ TablaFragmentos.FRAGMENT_M5F15,f);
        data.actualizarFragment(idempresa+ TablaFragmentos.FRAGMENT_M5F16,f);
        data.actualizarFragment(idempresa+ TablaFragmentos.FRAGMENT_M5F17,f);
        data.actualizarFragment(idempresa+ TablaFragmentos.FRAGMENT_M5F18,f);
        data.actualizarFragment(idempresa+ TablaFragmentos.FRAGMENT_M5F19,f);
        data.actualizarFragment(idempresa+ TablaFragmentos.FRAGMENT_M5F20,f);
        data.actualizarFragment(idempresa+ TablaFragmentos.FRAGMENT_M5F21,f);
        data.actualizarFragment(idempresa+ TablaFragmentos.FRAGMENT_M5F22,f);
        data.actualizarFragment(idempresa+ TablaFragmentos.FRAGMENT_M5F23,f);
        data.close();

    }

    public boolean validar() {
        boolean valido = true;
        llenarMapaVariables();


        boolean vC5_P7_1 = true;
        boolean vC5_P7_2 = true;
        boolean vC5_P7_3 = true;
        boolean vC5_P7_4 = true;
        boolean vC5_P7_5 = true;
        Integer[] valores1={ C5_P7_1_1,C5_P7_2_1,C5_P7_3_1,C5_P7_4_1,C5_P7_5_1,C5_P7_6_1,C5_P7_7_1};
        Integer[] valores2={ C5_P7_1_2,C5_P7_2_2,C5_P7_3_2,C5_P7_4_2,C5_P7_5_2,C5_P7_6_2,C5_P7_7_2};
        Integer[] valores3={ C5_P7_1_3,C5_P7_2_3,C5_P7_3_3,C5_P7_4_3,C5_P7_5_3,C5_P7_6_3,C5_P7_7_3};
        Integer[] valores4={ C5_P7_1_4,C5_P7_2_4,C5_P7_3_4,C5_P7_4_4,C5_P7_5_4,C5_P7_6_4,C5_P7_7_4};
        Integer[] valores5={ C5_P7_1_5,C5_P7_2_5,C5_P7_3_5,C5_P7_4_5,C5_P7_5_5,C5_P7_6_5,C5_P7_7_5};
        for (Integer valor1:valores1 ) {
            if(valor1==1)vC5_P7_1=false;
        }
        for (Integer valor2:valores2 ) {
            if(valor2==1)vC5_P7_2=false;
        }
        for (Integer valor3:valores3 ) {
            if(valor3==1)vC5_P7_3=false;
        }
        for (Integer valor4:valores4 ) {
            if(valor4==1)vC5_P7_4=false;
        }
        for (Integer valor5:valores5 ) {
            if(valor5==1)vC5_P7_5=false;
        }


        if(C5_P6 == -1 )
        {mostrarMensaje("Pregunta 6: Debe marcar la opción  ");
            valido=false;
        }else

            if (C5_P6 == 0 && C5_P7_1 == -1) {
                mostrarMensaje( "Pregunta 7.1: Debe Seleccionar ¿Utilizo?");
                valido = false;
            } else  if (C5_P6 == 0 && C5_P7_1 == 1 && vC5_P7_1) {
                mostrarMensaje( "Pregunta 7.1: Debe seleccionar una o más opciones");
                valido = false;
            }else if(C5_P6== 0 && C5_P7_6_1== 1 && C5_P7_6_1_0.trim().length()<3){
                mostrarMensaje( "Pregunta 7.1: Debe registrar información válida en Especifique");
                valido=false;
            }else if (C5_P6 == 0 && C5_P7_2 == -1) {
                mostrarMensaje( "Pregunta 7.2: Debe Seleccionar ¿Utilizo?");
                valido = false;
            } else  if (C5_P6 == 0 && C5_P7_2 == 1 && vC5_P7_2) {
                mostrarMensaje( "Pregunta 7.2: Debe seleccionar una o más opciones");
                valido = false;
            }else if(C5_P6== 0 && C5_P7_6_2== 1 && C5_P7_6_2_0.trim().length()<3){
                mostrarMensaje( "Pregunta 7.2: Debe registrar información válida en Especifique");
                valido=false;
            }else if (C5_P6 == 0 && C5_P7_3 == -1) {
                mostrarMensaje( "Pregunta 7.3: Debe Seleccionar ¿Utilizo?");
                valido = false;
            } else  if (C5_P6 == 0 && C5_P7_3 == 1 && vC5_P7_3) {
                mostrarMensaje( "Pregunta 7.3: Debe seleccionar una o más opciones");
                valido = false;
            }else if(C5_P6== 0 && C5_P7_6_3== 1 && C5_P7_6_3_0.trim().length()<3){
                mostrarMensaje( "Pregunta 7.3: Debe registrar información válida en Especifique");
                valido=false;
            }else if (C5_P6 == 0 && C5_P7_4 == -1) {
                mostrarMensaje( "Pregunta 7.4: Debe Seleccionar ¿Utilizo?");
                valido = false;
            }else  if (C5_P6 == 0 && C5_P7_4 == 1 && vC5_P7_4) {
                mostrarMensaje( "Pregunta 7.4: Debe seleccionar una o más opciones");
                valido = false;
            }else if(C5_P6== 0 && C5_P7_6_4== 1 && C5_P7_6_4_0.trim().length()<3){
                mostrarMensaje( "Pregunta 7.4: Debe registrar información válida en Especifique");
                valido=false;
            }else if (C5_P6 == 0 && C5_P7_5 == -1) {
                mostrarMensaje( "Pregunta 7.5: Debe Seleccionar ¿Utilizo?");
                valido = false;
            }else if (C5_P6 == 0 && C5_P7_5 == 1 && vC5_P7_5) {
                mostrarMensaje( "Pregunta 7.5: Debe seleccionar una o más opciones");
                valido = false;
            }else  if (C5_P6 == 0 && C5_P7_5_0.trim().length()<3) {
                mostrarMensaje( "Pregunta 7.5: Debe especificar la OTRA modalidad");
                valido = false;
            }else if(C5_P6== 0 && C5_P7_6_5== 1 && C5_P7_6_5_0.trim().length()<3){
                mostrarMensaje( "Pregunta 7.5: Debe registrar información válida en Especifique");
                valido=false;
            } else if(C5_P8.trim().length()<1 ){
                mostrarMensaje( "Pregunta 8: Debe registrar un valor mayor o igual a cero");
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
