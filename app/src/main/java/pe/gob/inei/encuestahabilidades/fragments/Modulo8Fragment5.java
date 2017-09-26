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
import android.text.InputFilter;
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
import android.widget.TextView;
import android.widget.Toast;

import pe.gob.inei.encuestahabilidades.R;
import pe.gob.inei.encuestahabilidades.modelo.Data;
import pe.gob.inei.encuestahabilidades.modelo.SQLConstantes;
import pe.gob.inei.encuestahabilidades.pojos.Modulo8;


/**
 * A simple {@link Fragment} subclass.
 */
public class Modulo8Fragment5 extends Fragment {

    //Variables de informante cabezera
//    private LinearLayout lytFragment;
//    private CheckBox ckMismoInformante8;
//    private EditText edtNombYApellidos8;
//    private EditText edtEspecifiqueCargo8;
//    private LinearLayout lytFondoSpinner8;
//    private Spinner spCargo8;

    //PREGUNTA 1
    private LinearLayout lytP1;
    private LinearLayout mod8_p1_ly_a;
    private RadioGroup rgP1;
    private RadioGroup rgP1_a;
    private TextView mod8_p1_tv;
    //PREGUNTA 2
    private LinearLayout mod8_p2_ly;
    private RadioGroup rgP2;
    private TextView mod8_p2_tv;
    //PREGUNTA 3
    private LinearLayout mod8_p3_ly;
    private CheckBox mod8_p3_ck1;
    private CheckBox mod8_p3_ck2;
    private CheckBox mod8_p3_ck3;
    private CheckBox mod8_p3_ck4;
    private CheckBox mod8_p3_ck5;
    private CheckBox mod8_p3_ck6;
    private EditText mod8_p3_edt;
    private TextView mod8_p3_tv;
    //PREGUNTA 4
    private LinearLayout mod8_p4_ly;
    private CheckBox mod8_p4_ck1;
    private CheckBox mod8_p4_ck2;
    private CheckBox mod8_p4_ck3;
    private CheckBox mod8_p4_ck4;
    private CheckBox mod8_p4_ck5;
    private CheckBox mod8_p4_ck6;
    private EditText mod8_p4_edt;
    private TextView mod8_p4_tv;
    //PREGUNTA 5
    private LinearLayout mod8_p5_ly;
    private RadioGroup rgP5;
    private TextView mod8_p5_tv;
    //PREGUNTA 6
    private LinearLayout mod8_p6_ly;
    private CheckBox mod8_p6_ckA;
    private CheckBox mod8_p6_ckB;
    private CheckBox mod8_p6_ckC;
    private CheckBox mod8_p6_ckD;
    private CheckBox mod8_p6_ckE;
    private CheckBox mod8_p6_ckF;
    private TextView mod8_p6_tv;
    //PREGUNTA 7
    private LinearLayout mod8_p7_ly;
    private RadioGroup rgP7;
    private TextView mod8_p7_tv;
    //PREGUNTA 8
    private LinearLayout mod8_p8_ly;
    private CheckBox mod8_p8_ck1;
    private CheckBox mod8_p8_ck2;
    private CheckBox mod8_p8_ck3;
    private CheckBox mod8_p8_ck4;
    private TextView mod8_p8_tv;
    //PREGUNTA 9
    private LinearLayout mod8_p9_ly;
    private CheckBox mod8_p9_ck1;
    private CheckBox mod8_p9_ck2;
    private CheckBox mod8_p9_ck3;
    private CheckBox mod8_p9_ck4;
    private TextView mod8_p9_tv;
    //PREGUNTA 10
    private LinearLayout mod8_p10_ly;
    private CheckBox mod8_p10_ck1;
    private CheckBox mod8_p10_ck2;
    private CheckBox mod8_p10_ck3;
    private CheckBox mod8_p10_ck4;
    private CheckBox mod8_p10_ck5;
    private CheckBox mod8_p10_ck6;
    private TextView mod8_p10_tv;

    private String idempresa;
    private Modulo8 modulo8;
    private Context context;
    private Data data;

    //mapeo de variables
//    int C8_P0_0; String C8_P0_1; int C8_P0_2; String C8_P0_3;
    int C8_P1_1_5; int C8_P1_2_5;
    int C8_P2_5;
    int C8_P3_1_5; int C8_P3_2_5; int C8_P3_3_5; int C8_P3_4_5; int C8_P3_5_5; int C8_P3_6_5; String C8_P3_6_5_0;
    int C8_P4_1_5; int C8_P4_2_5; int C8_P4_3_5; int C8_P4_4_5; int C8_P4_5_5; int C8_P4_6_5; String C8_P4_6_5_0;
    int C8_P5_5;
    int C8_P6_1_5; int C8_P6_2_5; int C8_P6_3_5; int C8_P6_4_5; int C8_P6_5_5; int C8_P6_6_5;
    int C8_P7_5;
    int C8_P8_1_5; int C8_P8_2_5; int C8_P8_3_5; int C8_P8_4_5;
    int C8_P9_1_5; int C8_P9_2_5; int C8_P9_3_5; int C8_P9_4_5;
    int C8_P10_1_5; int C8_P10_2_5; int C8_P10_3_5; int C8_P10_4_5; int C8_P10_5_5; int C8_P10_6_5;

    public Modulo8Fragment5() {
        // Required empty public constructor
    }

    @SuppressLint("ValidFragment")
    public Modulo8Fragment5 (String idempresa, Context context) {
        this.idempresa = idempresa;
        this.context = context;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_modulo8_fragment5, container, false);
        // CABEZERA
//        lytFragment = (LinearLayout) rootView.findViewById(R.id.mod8_layoutFragment5);
//        ckMismoInformante8 = (CheckBox) rootView.findViewById(R.id.cab_ckMismoInformante);
//        edtNombYApellidos8 = (EditText)rootView.findViewById(R.id.cab_edtApeYNom);
//        spCargo8 = (Spinner) rootView.findViewById(R.id.cab_spCargo);
//        edtEspecifiqueCargo8 = (EditText) rootView.findViewById(R.id.cab_edtEspecifiqueCargo);
//        lytFondoSpinner8 = (LinearLayout) rootView.findViewById(R.id.cab_lytFondoSpinner);

        //PREGUNTA 1
        lytP1 = (LinearLayout) rootView.findViewById(R.id.mod8_p1_ly);
        mod8_p1_ly_a = (LinearLayout) rootView.findViewById(R.id.mod8_p1_ly_a);
        rgP1 = (RadioGroup) rootView.findViewById(R.id.mod8_p1_rg);
        rgP1_a = (RadioGroup) rootView.findViewById(R.id.mod8_p1_rg_a);
        mod8_p1_tv = (TextView) rootView.findViewById(R.id.mod8_p1_tv);
        //PREGUNTA 2
        mod8_p2_ly = (LinearLayout) rootView.findViewById(R.id.mod8_p2_ly);
        rgP2 = (RadioGroup) rootView.findViewById(R.id.mod8_p2_rg);
        mod8_p2_tv = (TextView) rootView.findViewById(R.id.mod8_p2_tv);
        //PREGUNTA 3
        mod8_p3_ly = (LinearLayout) rootView.findViewById(R.id.mod8_p3_ly);
        mod8_p3_ck1 = (CheckBox) rootView.findViewById(R.id.mod8_p3_ck1);
        mod8_p3_ck2 = (CheckBox) rootView.findViewById(R.id.mod8_p3_ck2);
        mod8_p3_ck3 = (CheckBox) rootView.findViewById(R.id.mod8_p3_ck3);
        mod8_p3_ck4 = (CheckBox) rootView.findViewById(R.id.mod8_p3_ck4);
        mod8_p3_ck5 = (CheckBox) rootView.findViewById(R.id.mod8_p3_ck5);
        mod8_p3_ck6 = (CheckBox) rootView.findViewById(R.id.mod8_p3_ck6);
        mod8_p3_edt = (EditText) rootView.findViewById(R.id.mod8_p3_edt);
        mod8_p3_tv = (TextView) rootView.findViewById(R.id.mod8_p3_tv);
        //PREGUNTA 4
        mod8_p4_ly = (LinearLayout) rootView.findViewById(R.id.mod8_p4_ly);
        mod8_p4_ck1 = (CheckBox) rootView.findViewById(R.id.mod8_p4_ck1);
        mod8_p4_ck2 = (CheckBox) rootView.findViewById(R.id.mod8_p4_ck2);
        mod8_p4_ck3 = (CheckBox) rootView.findViewById(R.id.mod8_p4_ck3);
        mod8_p4_ck4 = (CheckBox) rootView.findViewById(R.id.mod8_p4_ck4);
        mod8_p4_ck5 = (CheckBox) rootView.findViewById(R.id.mod8_p4_ck5);
        mod8_p4_ck6 = (CheckBox) rootView.findViewById(R.id.mod8_p4_ck6);
        mod8_p4_edt = (EditText) rootView.findViewById(R.id.mod8_p4_edt);
        mod8_p4_tv = (TextView) rootView.findViewById(R.id.mod8_p4_tv);
        //PREGUNTA 5
        mod8_p5_ly = (LinearLayout) rootView.findViewById(R.id.mod8_p5_ly);
        rgP5 = (RadioGroup) rootView.findViewById(R.id.mod8_p5_rg);
        mod8_p5_tv = (TextView) rootView.findViewById(R.id.mod8_p5_tv);
        //PREGUNTA 6
        mod8_p6_ly = (LinearLayout) rootView.findViewById(R.id.mod8_p6_ly);
        mod8_p6_ckA = (CheckBox) rootView.findViewById(R.id.mod8_p6_ckA);
        mod8_p6_ckB = (CheckBox) rootView.findViewById(R.id.mod8_p6_ckB);
        mod8_p6_ckC = (CheckBox) rootView.findViewById(R.id.mod8_p6_ckC);
        mod8_p6_ckD = (CheckBox) rootView.findViewById(R.id.mod8_p6_ckD);
        mod8_p6_ckE = (CheckBox) rootView.findViewById(R.id.mod8_p6_ckE);
        mod8_p6_ckF = (CheckBox) rootView.findViewById(R.id.mod8_p6_ckF);
        mod8_p6_tv = (TextView) rootView.findViewById(R.id.mod8_p6_tv);
        //PREGUNTA 7
        mod8_p7_ly = (LinearLayout) rootView.findViewById(R.id.mod8_p7_ly);
        rgP7 = (RadioGroup) rootView.findViewById(R.id.mod8_p7_rg);
        mod8_p7_tv = (TextView) rootView.findViewById(R.id.mod8_p4_tv);
        //PREGUNTA 8
        mod8_p8_ly = (LinearLayout) rootView.findViewById(R.id.mod8_p8_ly);
        mod8_p8_ck1 = (CheckBox) rootView.findViewById(R.id.mod8_p8_ck1);
        mod8_p8_ck2 = (CheckBox) rootView.findViewById(R.id.mod8_p8_ck2);
        mod8_p8_ck3 = (CheckBox) rootView.findViewById(R.id.mod8_p8_ck3);
        mod8_p8_ck4 = (CheckBox) rootView.findViewById(R.id.mod8_p8_ck4);
        mod8_p8_tv = (TextView) rootView.findViewById(R.id.mod8_p4_tv);
        //PREGUNTA 9
        mod8_p9_ly = (LinearLayout) rootView.findViewById(R.id.mod8_p9_ly);
        mod8_p9_ck1 = (CheckBox) rootView.findViewById(R.id.mod8_p9_ck1);
        mod8_p9_ck2 = (CheckBox) rootView.findViewById(R.id.mod8_p9_ck2);
        mod8_p9_ck3 = (CheckBox) rootView.findViewById(R.id.mod8_p9_ck3);
        mod8_p9_ck4 = (CheckBox) rootView.findViewById(R.id.mod8_p9_ck4);
        mod8_p9_tv = (TextView) rootView.findViewById(R.id.mod8_p4_tv);
        //PREGUNTA 10
        mod8_p10_ly = (LinearLayout) rootView.findViewById(R.id.mod8_p10_ly);
        mod8_p10_ck1 = (CheckBox) rootView.findViewById(R.id.mod8_p10_ck1);
        mod8_p10_ck2 = (CheckBox) rootView.findViewById(R.id.mod8_p10_ck2);
        mod8_p10_ck3 = (CheckBox) rootView.findViewById(R.id.mod8_p10_ck3);
        mod8_p10_ck4 = (CheckBox) rootView.findViewById(R.id.mod8_p10_ck4);
        mod8_p10_ck5 = (CheckBox) rootView.findViewById(R.id.mod8_p10_ck5);
        mod8_p10_ck6 = (CheckBox) rootView.findViewById(R.id.mod8_p10_ck6);
        mod8_p10_tv = (TextView) rootView.findViewById(R.id.mod8_p10_tv);

        return rootView;
    }
    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        /*DATOS INTRODUCTORIOS MODULO 1*/
//        ckMismoInformante8.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
//            @Override
//            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
//                if (b) {
//                    edtNombYApellidos8.setBackgroundResource(R.drawable.cajas_de_texto_disabled);
//                    lytFondoSpinner8.setBackgroundResource(R.drawable.cajas_de_texto_disabled);
//                    spCargo8.setEnabled(false);
//                    edtNombYApellidos8.setText("JULIO LAVADO");
//                    spCargo8.setSelection(1);
//                    edtNombYApellidos8.setEnabled(false);
//
//                }else{
//                    edtNombYApellidos8.setText("");
//                    spCargo8.setSelection(0);
//                    edtNombYApellidos8.setBackgroundResource(R.drawable.cajas_de_texto);
//                    edtNombYApellidos8.setEnabled(true);
//                    lytFondoSpinner8.setBackgroundResource(R.drawable.cajas_de_texto);
//                    spCargo8.setEnabled(true);
//                    edtNombYApellidos8.requestFocus();
//                }
//            }
//        });
//        edtNombYApellidos8.setFilters(new InputFilter[]{new InputFilter.AllCaps()});
//        edtNombYApellidos8.setOnKeyListener(new View.OnKeyListener() {
//            @Override
//            public boolean onKey(View view, int keyCode, KeyEvent keyEvent) {
//                if ((keyEvent.getAction() == KeyEvent.ACTION_DOWN) &&
//                        (keyCode == KeyEvent.KEYCODE_ENTER)) {
//                    ocultarTeclado(lytFondoSpinner8);
//                    lytFondoSpinner8.requestFocus();
//                    return true;
//                }
//                return false;
//            }
//        });
//        edtNombYApellidos8.setOnFocusChangeListener(new View.OnFocusChangeListener() {
//            @Override
//            public void onFocusChange(View view, boolean conFocus) {
//                if(conFocus) {
//                    edtNombYApellidos8.setBackgroundResource(R.drawable.caja_texto_enabled);
//                }
//                else if(view.isEnabled()){
//                    edtNombYApellidos8.setBackgroundResource(R.drawable.cajas_de_texto);
//                }
//            }
//        });
//        lytFondoSpinner8.setOnFocusChangeListener(new View.OnFocusChangeListener() {
//            @Override
//            public void onFocusChange(View view, boolean conFocus) {
//                if(conFocus) {
//                    lytFondoSpinner8.setBackgroundResource(R.drawable.caja_texto_enabled);
//                    ocultarTeclado(lytFondoSpinner8);
//                }
//                else if(view.isEnabled()){
//                    lytFondoSpinner8.setBackgroundResource(R.drawable.cajas_de_texto);
//                }
//            }
//        });
//        spCargo8.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
//            @Override
//            public void onItemSelected(AdapterView<?> adapterView, View view, int pos, long l) {
//                edtEspecifiqueCargo8.setVisibility(View.GONE);
//                switch (pos){
//                    case 0:break;
//                    case 1:break;
//                    case 2:break;
//                    case 3:break;
//                    case 4:
//                        edtEspecifiqueCargo8.setVisibility(View.VISIBLE);
//                        edtEspecifiqueCargo8.requestFocus();
//                        break;
//                }
//                if (pos >= 0 && pos <4){
//                    edtEspecifiqueCargo8.setText("");
//                    lytP1.requestFocus();
//                }
//            }
//            @Override
//            public void onNothingSelected(AdapterView<?> adapterView) {}
//        });
//        edtEspecifiqueCargo8.setFilters(new InputFilter[]{new InputFilter.AllCaps()});
//        edtEspecifiqueCargo8.setOnKeyListener(new View.OnKeyListener() {
//            @Override
//            public boolean onKey(View view, int keyCode, KeyEvent keyEvent) {
//                if ((keyEvent.getAction() == KeyEvent.ACTION_DOWN) && (keyCode == KeyEvent.KEYCODE_ENTER)) {
//                    ocultarTeclado(edtEspecifiqueCargo8);
//                    rgP1.requestFocus();
//                    return true;
//                }
//                return false;
//            }
//        });
//        edtEspecifiqueCargo8.setOnFocusChangeListener(new View.OnFocusChangeListener() {
//            @Override
//            public void onFocusChange(View view, boolean conFocus) {
//                if(conFocus) {
//                    edtEspecifiqueCargo8.setBackgroundResource(R.drawable.caja_texto_enabled);
//                }
//                else if(view.isEnabled()){
//                    edtEspecifiqueCargo8.setBackgroundResource(R.drawable.cajas_de_texto);
//                }
//            }
//        });

        ////////////////////////////////////////////////////////////
        final CheckBox[] listacheck3 ={mod8_p3_ck1,mod8_p3_ck2,mod8_p3_ck3,mod8_p3_ck4,mod8_p3_ck5,mod8_p3_ck6};
        final CheckBox[] listacheck4 ={mod8_p4_ck1,mod8_p4_ck2,mod8_p4_ck3,mod8_p4_ck4,mod8_p4_ck5,mod8_p4_ck6};

        final CheckBox[] listacheck6 ={mod8_p6_ckA,mod8_p6_ckB,mod8_p6_ckC,mod8_p6_ckD,mod8_p6_ckE};
        final CheckBox[] listacheck8 ={mod8_p8_ck1,mod8_p8_ck2,mod8_p8_ck3};
        final CheckBox[] listacheck8ABE ={mod8_p8_ck1,mod8_p8_ck2,mod8_p8_ck3,mod8_p8_ck4};
        final CheckBox[] listacheck9 ={mod8_p9_ck1,mod8_p9_ck2,mod8_p9_ck3};
        final CheckBox[] listacheck10 ={mod8_p10_ck1,mod8_p10_ck2,mod8_p10_ck3,mod8_p10_ck4,mod8_p10_ck6};
        final CheckBox[] listacheck106 ={mod8_p10_ck1,mod8_p10_ck2,mod8_p10_ck3,mod8_p10_ck4,mod8_p10_ck5};
        final CheckBox[] listacheck109D ={mod8_p9_ck1,mod8_p9_ck2,mod8_p9_ck3,mod8_p9_ck4,mod8_p10_ck1,mod8_p10_ck2,mod8_p10_ck3,mod8_p10_ck4,mod8_p10_ck5,mod8_p10_ck6};
        mod8_p1_tv.setText("1. ¿Se encuentra actualmente utilizando Producción con impresión en 3D en el proceso que utiliza para producir sus bienes o servicios?");
        mod8_p2_tv.setText("2. ¿Qué tan probable es que utilice más Producción con impresión en 3D en los próximos  tres años en su sistema de producción de bienes y/o servicios?");
        mod8_p3_tv.setText("3. ¿Por qué no ha introducido Producción con impresión en 3D? ");
        mod8_p4_tv.setText("4. ¿Por qué no va introducir o es poco probable que introduzca Producción con impresión en 3D en los próximos 3 años? ");
        mod8_p5_tv.setText("5. ¿Cuál cree que va a ser el impacto neto de la Producción con impresión en 3D, en el empleo de su empresa?");
        mod8_p6_tv.setText("6. La introducción de la Producción con impresión en 3D va a llevar a:");

        mod8_p9_ly.setVisibility(View.GONE);


        //PREGUNTA  1
        rgP1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, @IdRes int i) {
                switch (i) {
                    case R.id.mod8_p1_rb1:
                        mod8_p1_ly_a.setVisibility(View.VISIBLE);
                        mod8_p2_tv.setText("2. ¿Qué tan probable es que utilice más Producción con impresión en 3D en los próximos  tres años en su sistema de producción de bienes y/o servicios?");
                        switch (rgP2.getCheckedRadioButtonId()) {
                            case R.id.mod8_p2_rb1:
                                mod8_p3_ly.setVisibility(View.GONE);
                                mod8_p3_ck1.setChecked(false);
                                mod8_p3_ck2.setChecked(false);
                                mod8_p3_ck3.setChecked(false);
                                mod8_p3_ck4.setChecked(false);
                                mod8_p3_ck5.setChecked(false);
                                mod8_p3_ck6.setChecked(false);
                                mod8_p3_edt.setText("");

                                mod8_p4_ly.setVisibility(View.GONE);
                                mod8_p4_ck1.setChecked(false);
                                mod8_p4_ck2.setChecked(false);
                                mod8_p4_ck3.setChecked(false);
                                mod8_p4_ck4.setChecked(false);
                                mod8_p4_ck5.setChecked(false);
                                mod8_p4_ck6.setChecked(false);
                                mod8_p4_edt.setText("");

                                mod8_p5_ly.setVisibility(View.VISIBLE);
                                mod8_p6_ly.setVisibility(View.VISIBLE);
                                break;
                            case R.id.mod8_p2_rb2:
                                mod8_p3_ly.setVisibility(View.GONE);
                                mod8_p3_ck1.setChecked(false);
                                mod8_p3_ck2.setChecked(false);
                                mod8_p3_ck3.setChecked(false);
                                mod8_p3_ck4.setChecked(false);
                                mod8_p3_ck5.setChecked(false);
                                mod8_p3_ck6.setChecked(false);
                                mod8_p3_edt.setText("");

                                mod8_p4_ly.setVisibility(View.GONE);
                                mod8_p4_ck1.setChecked(false);
                                mod8_p4_ck2.setChecked(false);
                                mod8_p4_ck3.setChecked(false);
                                mod8_p4_ck4.setChecked(false);
                                mod8_p4_ck5.setChecked(false);
                                mod8_p4_ck6.setChecked(false);
                                mod8_p4_edt.setText("");

                                mod8_p5_ly.setVisibility(View.VISIBLE);
                                mod8_p6_ly.setVisibility(View.VISIBLE);
                                break;
                            case R.id.mod8_p2_rb3:
                                mod8_p3_ly.setVisibility(View.GONE);
                                mod8_p3_ck1.setChecked(false);
                                mod8_p3_ck2.setChecked(false);
                                mod8_p3_ck3.setChecked(false);
                                mod8_p3_ck4.setChecked(false);
                                mod8_p3_ck5.setChecked(false);
                                mod8_p3_ck6.setChecked(false);
                                mod8_p3_edt.setText("");

                                mod8_p4_ly.setVisibility(View.GONE);
                                mod8_p4_ck1.setChecked(false);
                                mod8_p4_ck2.setChecked(false);
                                mod8_p4_ck3.setChecked(false);
                                mod8_p4_ck4.setChecked(false);
                                mod8_p4_ck5.setChecked(false);
                                mod8_p4_ck6.setChecked(false);
                                mod8_p4_edt.setText("");

                                mod8_p5_ly.setVisibility(View.VISIBLE);
                                mod8_p6_ly.setVisibility(View.VISIBLE);
                                break;
                            case R.id.mod8_p2_rb4:
                                mod8_p3_ly.setVisibility(View.GONE);
                                mod8_p3_ck1.setChecked(false);
                                mod8_p3_ck2.setChecked(false);
                                mod8_p3_ck3.setChecked(false);
                                mod8_p3_ck4.setChecked(false);
                                mod8_p3_ck5.setChecked(false);
                                mod8_p3_ck6.setChecked(false);
                                mod8_p3_edt.setText("");

                                mod8_p4_ly.setVisibility(View.GONE);
                                mod8_p4_ck1.setChecked(false);
                                mod8_p4_ck2.setChecked(false);
                                mod8_p4_ck3.setChecked(false);
                                mod8_p4_ck4.setChecked(false);
                                mod8_p4_ck5.setChecked(false);
                                mod8_p4_ck6.setChecked(false);
                                mod8_p4_edt.setText("");

                                mod8_p5_ly.setVisibility(View.VISIBLE);
                                mod8_p6_ly.setVisibility(View.VISIBLE);
                                break;
                            case R.id.mod8_p2_rb5:
                                mod8_p3_ly.setVisibility(View.GONE);
                                mod8_p3_ck1.setChecked(false);
                                mod8_p3_ck2.setChecked(false);
                                mod8_p3_ck3.setChecked(false);
                                mod8_p3_ck4.setChecked(false);
                                mod8_p3_ck5.setChecked(false);
                                mod8_p3_ck6.setChecked(false);
                                mod8_p3_edt.setText("");

                                mod8_p4_ly.setVisibility(View.GONE);
                                mod8_p4_ck1.setChecked(false);
                                mod8_p4_ck2.setChecked(false);
                                mod8_p4_ck3.setChecked(false);
                                mod8_p4_ck4.setChecked(false);
                                mod8_p4_ck5.setChecked(false);
                                mod8_p4_ck6.setChecked(false);
                                mod8_p4_edt.setText("");

                                mod8_p5_ly.setVisibility(View.VISIBLE);
                                mod8_p6_ly.setVisibility(View.VISIBLE);
                                break;
                        }
                        break;
                    case R.id.mod8_p1_rb2:
                        mod8_p1_ly_a.setVisibility(View.GONE);
                        mod8_p2_tv.setText("2. ¿Qué tan probable es que introduzca Producción con impresión en 3D en los próximos  tres años en su sistema de producción de bienes y/o servicios?");
                        rgP1_a.clearCheck();
                        switch (rgP2.getCheckedRadioButtonId()) {
                            case R.id.mod8_p2_rb1:
                                mod8_p3_ly.setVisibility(View.VISIBLE);
                                mod8_p4_ly.setVisibility(View.GONE);
                                mod8_p4_ck1.setChecked(false);
                                mod8_p4_ck2.setChecked(false);
                                mod8_p4_ck3.setChecked(false);
                                mod8_p4_ck4.setChecked(false);
                                mod8_p4_ck5.setChecked(false);
                                mod8_p4_ck6.setChecked(false);
                                mod8_p4_edt.setText("");

                                mod8_p5_ly.setVisibility(View.VISIBLE);
                                mod8_p6_ly.setVisibility(View.VISIBLE);
                                break;
                            case R.id.mod8_p2_rb2:
                                mod8_p3_ly.setVisibility(View.VISIBLE);
                                mod8_p4_ly.setVisibility(View.GONE);
                                mod8_p4_ck1.setChecked(false);
                                mod8_p4_ck2.setChecked(false);
                                mod8_p4_ck3.setChecked(false);
                                mod8_p4_ck4.setChecked(false);
                                mod8_p4_ck5.setChecked(false);
                                mod8_p4_ck6.setChecked(false);
                                mod8_p4_edt.setText("");

                                mod8_p5_ly.setVisibility(View.VISIBLE);
                                mod8_p6_ly.setVisibility(View.VISIBLE);
                                break;
                            case R.id.mod8_p2_rb3:
                                mod8_p3_ly.setVisibility(View.VISIBLE);
                                mod8_p4_ly.setVisibility(View.VISIBLE);
                                mod8_p5_ly.setVisibility(View.GONE);
                                rgP5.clearCheck();
                                mod8_p6_ly.setVisibility(View.GONE);
                                mod8_p6_ckA.setChecked(false);
                                mod8_p6_ckB.setChecked(false);
                                mod8_p6_ckC.setChecked(false);
                                mod8_p6_ckD.setChecked(false);
                                mod8_p6_ckE.setChecked(false);
                                mod8_p6_ckF.setChecked(false);
                                break;
                            case R.id.mod8_p2_rb4:
                                mod8_p3_ly.setVisibility(View.VISIBLE);
                                mod8_p4_ly.setVisibility(View.VISIBLE);
                                mod8_p5_ly.setVisibility(View.GONE);
                                rgP5.clearCheck();
                                mod8_p6_ly.setVisibility(View.GONE);
                                mod8_p6_ckA.setChecked(false);
                                mod8_p6_ckB.setChecked(false);
                                mod8_p6_ckC.setChecked(false);
                                mod8_p6_ckD.setChecked(false);
                                mod8_p6_ckE.setChecked(false);
                                mod8_p6_ckF.setChecked(false);
                                break;
                            case R.id.mod8_p2_rb5:
                                mod8_p3_ly.setVisibility(View.VISIBLE);
                                mod8_p4_ly.setVisibility(View.GONE);
                                mod8_p4_ck1.setChecked(false);
                                mod8_p4_ck2.setChecked(false);
                                mod8_p4_ck3.setChecked(false);
                                mod8_p4_ck4.setChecked(false);
                                mod8_p4_ck5.setChecked(false);
                                mod8_p4_ck6.setChecked(false);
                                mod8_p4_edt.setText("");

                                mod8_p5_ly.setVisibility(View.GONE);
                                rgP5.clearCheck();
                                mod8_p6_ly.setVisibility(View.GONE);
                                mod8_p6_ckA.setChecked(false);
                                mod8_p6_ckB.setChecked(false);
                                mod8_p6_ckC.setChecked(false);
                                mod8_p6_ckD.setChecked(false);
                                mod8_p6_ckE.setChecked(false);
                                mod8_p6_ckF.setChecked(false);
                                break;
                        }
                        break;
                }


            }
        });
        //PREGUNTA 2
        rgP2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, @IdRes int i) {
                switch (i) {
                    case R.id.mod8_p2_rb1:

                        switch (rgP1.getCheckedRadioButtonId()) {
                            case R.id.mod8_p1_rb1:
                                mod8_p3_ly.setVisibility(View.GONE);
                                mod8_p3_ck1.setChecked(false);
                                mod8_p3_ck2.setChecked(false);
                                mod8_p3_ck3.setChecked(false);
                                mod8_p3_ck4.setChecked(false);
                                mod8_p3_ck5.setChecked(false);
                                mod8_p3_ck6.setChecked(false);
                                mod8_p3_edt.setText("");

                                mod8_p4_ly.setVisibility(View.GONE);
                                mod8_p4_ck1.setChecked(false);
                                mod8_p4_ck2.setChecked(false);
                                mod8_p4_ck3.setChecked(false);
                                mod8_p4_ck4.setChecked(false);
                                mod8_p4_ck5.setChecked(false);
                                mod8_p4_ck6.setChecked(false);
                                mod8_p4_edt.setText("");

                                mod8_p5_ly.setVisibility(View.VISIBLE);
                                mod8_p6_ly.setVisibility(View.VISIBLE);
                                break;
                            case R.id.mod8_p1_rb2:
                                mod8_p3_ly.setVisibility(View.VISIBLE);
                                mod8_p4_ly.setVisibility(View.GONE);
                                mod8_p4_ck1.setChecked(false);
                                mod8_p4_ck2.setChecked(false);
                                mod8_p4_ck3.setChecked(false);
                                mod8_p4_ck4.setChecked(false);
                                mod8_p4_ck5.setChecked(false);
                                mod8_p4_ck6.setChecked(false);
                                mod8_p4_edt.setText("");

                                mod8_p5_ly.setVisibility(View.VISIBLE);
                                mod8_p6_ly.setVisibility(View.VISIBLE);
                                break;
                        }
                        break;
                    case R.id.mod8_p2_rb2:
                        switch (rgP1.getCheckedRadioButtonId()) {
                            case R.id.mod8_p1_rb1:
                                mod8_p3_ly.setVisibility(View.GONE);
                                mod8_p3_ck1.setChecked(false);
                                mod8_p3_ck2.setChecked(false);
                                mod8_p3_ck3.setChecked(false);
                                mod8_p3_ck4.setChecked(false);
                                mod8_p3_ck5.setChecked(false);
                                mod8_p3_ck6.setChecked(false);
                                mod8_p3_edt.setText("");

                                mod8_p4_ly.setVisibility(View.GONE);
                                mod8_p4_ck1.setChecked(false);
                                mod8_p4_ck2.setChecked(false);
                                mod8_p4_ck3.setChecked(false);
                                mod8_p4_ck4.setChecked(false);
                                mod8_p4_ck5.setChecked(false);
                                mod8_p4_ck6.setChecked(false);
                                mod8_p4_edt.setText("");

                                mod8_p5_ly.setVisibility(View.VISIBLE);
                                mod8_p6_ly.setVisibility(View.VISIBLE);
                                break;
                            case R.id.mod8_p1_rb2:
                                mod8_p3_ly.setVisibility(View.VISIBLE);
                                mod8_p4_ly.setVisibility(View.GONE);
                                mod8_p4_ck1.setChecked(false);
                                mod8_p4_ck2.setChecked(false);
                                mod8_p4_ck3.setChecked(false);
                                mod8_p4_ck4.setChecked(false);
                                mod8_p4_ck5.setChecked(false);
                                mod8_p4_ck6.setChecked(false);
                                mod8_p4_edt.setText("");

                                mod8_p5_ly.setVisibility(View.VISIBLE);
                                mod8_p6_ly.setVisibility(View.VISIBLE);
                        }
                        break;
                    case R.id.mod8_p2_rb3:
                        switch (rgP1.getCheckedRadioButtonId()) {
                            case R.id.mod8_p1_rb1:
                                mod8_p3_ly.setVisibility(View.GONE);
                                mod8_p3_ck1.setChecked(false);
                                mod8_p3_ck2.setChecked(false);
                                mod8_p3_ck3.setChecked(false);
                                mod8_p3_ck4.setChecked(false);
                                mod8_p3_ck5.setChecked(false);
                                mod8_p3_ck6.setChecked(false);
                                mod8_p3_edt.setText("");

                                mod8_p4_ly.setVisibility(View.GONE);
                                mod8_p4_ck1.setChecked(false);
                                mod8_p4_ck2.setChecked(false);
                                mod8_p4_ck3.setChecked(false);
                                mod8_p4_ck4.setChecked(false);
                                mod8_p4_ck5.setChecked(false);
                                mod8_p4_ck6.setChecked(false);
                                mod8_p4_edt.setText("");

                                mod8_p5_ly.setVisibility(View.VISIBLE);
                                mod8_p6_ly.setVisibility(View.VISIBLE);
                                break;
                            case R.id.mod8_p1_rb2:
                                mod8_p3_ly.setVisibility(View.VISIBLE);
                                mod8_p4_ly.setVisibility(View.VISIBLE);
                                mod8_p5_ly.setVisibility(View.GONE);
                                rgP5.clearCheck();
                                mod8_p6_ly.setVisibility(View.GONE);
                                mod8_p6_ckA.setChecked(false);
                                mod8_p6_ckB.setChecked(false);
                                mod8_p6_ckC.setChecked(false);
                                mod8_p6_ckD.setChecked(false);
                                mod8_p6_ckE.setChecked(false);
                                mod8_p6_ckF.setChecked(false);
                        }
                        break;

                    case R.id.mod8_p2_rb4:
                        switch (rgP1.getCheckedRadioButtonId()) {
                            case R.id.mod8_p1_rb1:
                                mod8_p3_ly.setVisibility(View.GONE);
                                mod8_p3_ck1.setChecked(false);
                                mod8_p3_ck2.setChecked(false);
                                mod8_p3_ck3.setChecked(false);
                                mod8_p3_ck4.setChecked(false);
                                mod8_p3_ck5.setChecked(false);
                                mod8_p3_ck6.setChecked(false);
                                mod8_p3_edt.setText("");

                                mod8_p4_ly.setVisibility(View.GONE);
                                mod8_p4_ck1.setChecked(false);
                                mod8_p4_ck2.setChecked(false);
                                mod8_p4_ck3.setChecked(false);
                                mod8_p4_ck4.setChecked(false);
                                mod8_p4_ck5.setChecked(false);
                                mod8_p4_ck6.setChecked(false);
                                mod8_p4_edt.setText("");

                                mod8_p5_ly.setVisibility(View.VISIBLE);
                                mod8_p6_ly.setVisibility(View.VISIBLE);
                                break;
                            case R.id.mod8_p1_rb2:
                                mod8_p3_ly.setVisibility(View.VISIBLE);
                                mod8_p4_ly.setVisibility(View.VISIBLE);
                                mod8_p5_ly.setVisibility(View.GONE);
                                rgP5.clearCheck();
                                mod8_p6_ly.setVisibility(View.GONE);
                                mod8_p6_ckA.setChecked(false);
                                mod8_p6_ckB.setChecked(false);
                                mod8_p6_ckC.setChecked(false);
                                mod8_p6_ckD.setChecked(false);
                                mod8_p6_ckE.setChecked(false);
                                mod8_p6_ckF.setChecked(false);
                        }
                        break;

                    case R.id.mod8_p2_rb5:
                        switch (rgP1.getCheckedRadioButtonId()) {
                            case R.id.mod8_p1_rb1:
                                mod8_p3_ly.setVisibility(View.GONE);
                                mod8_p3_ck1.setChecked(false);
                                mod8_p3_ck2.setChecked(false);
                                mod8_p3_ck3.setChecked(false);
                                mod8_p3_ck4.setChecked(false);
                                mod8_p3_ck5.setChecked(false);
                                mod8_p3_ck6.setChecked(false);
                                mod8_p3_edt.setText("");

                                mod8_p4_ly.setVisibility(View.GONE);
                                mod8_p4_ck1.setChecked(false);
                                mod8_p4_ck2.setChecked(false);
                                mod8_p4_ck3.setChecked(false);
                                mod8_p4_ck4.setChecked(false);
                                mod8_p4_ck5.setChecked(false);
                                mod8_p4_ck6.setChecked(false);
                                mod8_p4_edt.setText("");

                                mod8_p5_ly.setVisibility(View.VISIBLE);
                                mod8_p6_ly.setVisibility(View.VISIBLE);
                                break;
                            case R.id.mod8_p1_rb2:
                                mod8_p3_ly.setVisibility(View.VISIBLE);
                                mod8_p4_ly.setVisibility(View.GONE);
                                mod8_p4_ck1.setChecked(false);
                                mod8_p4_ck2.setChecked(false);
                                mod8_p4_ck3.setChecked(false);
                                mod8_p4_ck4.setChecked(false);
                                mod8_p4_ck5.setChecked(false);
                                mod8_p4_ck6.setChecked(false);
                                mod8_p4_edt.setText("");

                                mod8_p5_ly.setVisibility(View.GONE);
                                rgP5.clearCheck();
                                mod8_p6_ly.setVisibility(View.GONE);
                                mod8_p6_ckA.setChecked(false);
                                mod8_p6_ckB.setChecked(false);
                                mod8_p6_ckC.setChecked(false);
                                mod8_p6_ckD.setChecked(false);
                                mod8_p6_ckE.setChecked(false);
                                mod8_p6_ckF.setChecked(false);
                        }
                        break;




                }


            }
        });

        //PREGUNTA 3 - OCULTAR ESPECIFIQUE
        mod8_p3_edt.setFilters(new InputFilter[]{new InputFilter.AllCaps()});
        mod8_p3_ck6.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    mod8_p3_edt.setVisibility(View.VISIBLE);
                    mod8_p3_edt.setBackgroundResource(R.drawable.spinner_enabled);
                }else{
                    mod8_p3_edt.setVisibility(View.GONE);
                    mod8_p3_edt.setBackgroundResource(R.drawable.spinner_disabled);
                    mod8_p3_edt.setText("");
                }
            }
        });
        //PREGUNTA 4 - OCULTAR ESPECIFIQUE
        mod8_p4_edt.setFilters(new InputFilter[]{new InputFilter.AllCaps()});
        mod8_p4_ck6.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    mod8_p4_edt.setVisibility(View.VISIBLE);
                    mod8_p4_edt.setBackgroundResource(R.drawable.spinner_enabled);
                }else{
                    mod8_p4_edt.setVisibility(View.GONE);
                    mod8_p4_edt.setBackgroundResource(R.drawable.spinner_disabled);
                    mod8_p4_edt.setText("");
                }
            }
        });

        //PREGUNTA 6.A
        mod8_p6_ckA.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (mod8_p6_ckA.isChecked() && mod8_p6_ckB.isChecked() && mod8_p6_ckE.isChecked() ) {
                    mod8_p7_ly.setVisibility(View.VISIBLE);
                    mod8_p8_ly.setVisibility(View.VISIBLE);
                }else
                {
                    if (mod8_p6_ckA.isChecked() && mod8_p6_ckB.isChecked())
                    {
                        mod8_p7_ly.setVisibility(View.VISIBLE);
                        mod8_p8_ly.setVisibility(View.VISIBLE);
                    }
                    else {
                        if (mod8_p6_ckB.isChecked() && mod8_p6_ckE.isChecked())
                        {
                            mod8_p7_ly.setVisibility(View.VISIBLE);
                            mod8_p8_ly.setVisibility(View.VISIBLE);
                        }
                        else
                        {
                            if (mod8_p6_ckA.isChecked() && mod8_p6_ckE.isChecked())
                            {
                                mod8_p7_ly.setVisibility(View.VISIBLE);
                                mod8_p8_ly.setVisibility(View.VISIBLE);
                            }
                            else{
                                if (mod8_p6_ckA.isChecked() || mod8_p6_ckB.isChecked() || mod8_p6_ckE.isChecked())
                                {
                                    mod8_p7_ly.setVisibility(View.VISIBLE);
                                    mod8_p8_ly.setVisibility(View.VISIBLE);
                                }
                                else
                                {
                                    mod8_p7_ly.setVisibility(View.GONE);
                                    rgP7.clearCheck();
                                    mod8_p8_ly.setVisibility(View.GONE);
                                    for (int i = 0; i < listacheck8ABE.length; i++) {
                                        final CheckBox checkBox = listacheck8ABE[i];
                                        checkBox.setChecked(false);
                                    }
                                }
                            }

                        }
                    }
                }
            }
        });
        //PREGUNTA 6.B
        mod8_p6_ckB.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (mod8_p6_ckA.isChecked() && mod8_p6_ckB.isChecked() && mod8_p6_ckE.isChecked() ) {
                    mod8_p7_ly.setVisibility(View.VISIBLE);
                    mod8_p8_ly.setVisibility(View.VISIBLE);
                }else
                {
                    if (mod8_p6_ckA.isChecked() && mod8_p6_ckB.isChecked())
                    {
                        mod8_p7_ly.setVisibility(View.VISIBLE);
                        mod8_p8_ly.setVisibility(View.VISIBLE);
                    }
                    else {
                        if (mod8_p6_ckB.isChecked() && mod8_p6_ckE.isChecked())
                        {
                            mod8_p7_ly.setVisibility(View.VISIBLE);
                            mod8_p8_ly.setVisibility(View.VISIBLE);
                        }
                        else
                        {
                            if (mod8_p6_ckA.isChecked() && mod8_p6_ckE.isChecked())
                            {
                                mod8_p7_ly.setVisibility(View.VISIBLE);
                                mod8_p8_ly.setVisibility(View.VISIBLE);
                            }
                            else{
                                if (mod8_p6_ckA.isChecked() || mod8_p6_ckB.isChecked() || mod8_p6_ckE.isChecked())
                                {
                                    mod8_p7_ly.setVisibility(View.VISIBLE);
                                    mod8_p8_ly.setVisibility(View.VISIBLE);
                                }
                                else
                                {   mod8_p7_ly.setVisibility(View.GONE);
                                    rgP7.clearCheck();
                                    mod8_p8_ly.setVisibility(View.GONE);
                                    for (int i = 0; i < listacheck8ABE.length; i++) {
                                        final CheckBox checkBox = listacheck8ABE[i];
                                        checkBox.setChecked(false);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        });
//        //PREGUNTA 6.C
//        mod8_p6_ckC.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
//            @Override
//            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
//                if (mod8_p6_ckA.isChecked()==false && mod8_p6_ckB.isChecked()==false
//                        && mod8_p6_ckD.isChecked()==false && mod8_p6_ckE.isChecked()==false
//                        && (mod8_p6_ckC.isChecked()==true || mod8_p6_ckF.isChecked()==true)) {
//                    if (b) {
//                        mod8_p9_ly.setVisibility(View.GONE);
//                        for (int i = 0; i < listacheck109D.length; i++) {
//                            final CheckBox checkBox = listacheck109D[i];
//                            checkBox.setChecked(false);
//                        }
//                    }
//                }
//            }
//        });
        //PREGUNTA 6.D
        mod8_p6_ckD.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    mod8_p9_ly.setVisibility(View.VISIBLE);
                    mod8_p10_ly.setVisibility(View.VISIBLE);
                }else
                {
                    mod8_p9_ly.setVisibility(View.GONE);
                    mod8_p10_ly.setVisibility(View.GONE);
                    for (int i = 0; i < listacheck109D.length; i++) {
                        final CheckBox checkBox = listacheck109D[i];
                        checkBox.setChecked(false);
                    }
                }
            }
        });

        //PREGUNTA 6.E
        mod8_p6_ckE.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (mod8_p6_ckA.isChecked() && mod8_p6_ckB.isChecked() && mod8_p6_ckE.isChecked() ) {
                    mod8_p7_ly.setVisibility(View.VISIBLE);
                    mod8_p8_ly.setVisibility(View.VISIBLE);
                }else
                {
                    if (mod8_p6_ckA.isChecked() && mod8_p6_ckB.isChecked())
                    {
                        mod8_p7_ly.setVisibility(View.VISIBLE);
                        mod8_p8_ly.setVisibility(View.VISIBLE);
                    }
                    else {
                        if (mod8_p6_ckB.isChecked() && mod8_p6_ckE.isChecked())
                        {
                            mod8_p7_ly.setVisibility(View.VISIBLE);
                            mod8_p8_ly.setVisibility(View.VISIBLE);
                        }
                        else
                        {
                            if (mod8_p6_ckA.isChecked() && mod8_p6_ckE.isChecked())
                            {
                                mod8_p7_ly.setVisibility(View.VISIBLE);
                                mod8_p8_ly.setVisibility(View.VISIBLE);
                            }
                            else{
                                if (mod8_p6_ckA.isChecked() || mod8_p6_ckB.isChecked() || mod8_p6_ckE.isChecked())
                                {
                                    mod8_p7_ly.setVisibility(View.VISIBLE);
                                    mod8_p8_ly.setVisibility(View.VISIBLE);
                                }
                                else
                                {   mod8_p7_ly.setVisibility(View.GONE);
                                    rgP7.clearCheck();
                                    mod8_p8_ly.setVisibility(View.GONE);
                                    for (int i = 0; i < listacheck8ABE.length; i++) {
                                        final CheckBox checkBox = listacheck8ABE[i];
                                        checkBox.setChecked(false);


                                    }


                                }
                            }

                        }
                    }
                }
            }
        });


        //PREGUNTA 8
        mod8_p8_ck4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
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

        //PREGUNTA 9
        mod8_p9_ck4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
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

        //PREGUNTA 10
        mod8_p10_ck5.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override

            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    for (int i = 0; i < listacheck10.length; i++) {
                        final CheckBox checkBox = listacheck10[i];
                        checkBox.setEnabled(false);
                        checkBox.setChecked(false);
                    }
                }
                else {
                    for (int i = 0; i < listacheck10.length; i++) {
                        final CheckBox checkBox = listacheck10[i];
                        checkBox.setEnabled(true);
                    }
                }
            }
        });

        mod8_p10_ck6.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override

            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    for (int i = 0; i < listacheck106.length; i++) {
                        final CheckBox checkBox = listacheck106[i];
                        checkBox.setEnabled(false);
                        checkBox.setChecked(false);
                    }
                }
                else {
                    for (int i = 0; i < listacheck106.length; i++) {
                        final CheckBox checkBox = listacheck106[i];
                        checkBox.setEnabled(true);
                    }
                }
            }
        });

        cargarDatos();
//        lytFragment.requestFocus();
//        ocultarTeclado(lytFragment);

        //PREGUNTA 6.F
        mod8_p6_ckF.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override

            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
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
                                    if(mod8_p6_ckF.isChecked()){
                                        mod8_p6_ckA.setChecked(false);mod8_p6_ckA.setEnabled(false);mod8_p6_ckA.setTextColor(Color.LTGRAY);
                                        mod8_p6_ckB.setChecked(false);mod8_p6_ckB.setEnabled(false);mod8_p6_ckB.setTextColor(Color.LTGRAY);
                                        mod8_p6_ckC.setChecked(false);mod8_p6_ckC.setEnabled(false);mod8_p6_ckC.setTextColor(Color.LTGRAY);
                                        mod8_p6_ckD.setChecked(false);mod8_p6_ckD.setEnabled(false);mod8_p6_ckD.setTextColor(Color.LTGRAY);
                                        mod8_p6_ckE.setChecked(false);mod8_p6_ckE.setEnabled(false);mod8_p6_ckE.setTextColor(Color.LTGRAY);

                                    }
                                    alertDialog.dismiss();
                                }

                            });
                            cancelar.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    if(mod8_p6_ckF.isChecked()){
                                        mod8_p6_ckF.setChecked(false);mod8_p6_ckF.setEnabled(true);mod8_p6_ckF.setTextColor(Color.BLACK);
                                        mod8_p6_ckA.setEnabled(true);mod8_p6_ckA.setTextColor(Color.BLACK);
                                        mod8_p6_ckB.setEnabled(true);mod8_p6_ckB.setTextColor(Color.BLACK);
                                        mod8_p6_ckC.setEnabled(true);mod8_p6_ckC.setTextColor(Color.BLACK);
                                        mod8_p6_ckD.setEnabled(true);mod8_p6_ckD.setTextColor(Color.BLACK);
                                        mod8_p6_ckE.setEnabled(true);mod8_p6_ckE.setTextColor(Color.BLACK);
                                    }
                                    alertDialog.dismiss();
                                }
                            });
                        }
                    });
                    alertDialog.show();

                }else {
                    mod8_p6_ckA.setEnabled(true);mod8_p6_ckA.setTextColor(Color.BLACK);
                    mod8_p6_ckB.setEnabled(true);mod8_p6_ckB.setTextColor(Color.BLACK);
                    mod8_p6_ckC.setEnabled(true);mod8_p6_ckC.setTextColor(Color.BLACK);
                    mod8_p6_ckD.setEnabled(true);mod8_p6_ckD.setTextColor(Color.BLACK);
                    mod8_p6_ckE.setEnabled(true);mod8_p6_ckE.setTextColor(Color.BLACK);
                }
            }

        });
    }

    //METODOS
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
    public void cargarDatos(){
        data = new Data(context);
        data.open();
        //verifico si ya existe un objeto con datos llenados previamente
        if(data.existeModulo8(idempresa)){
            //si existe traigo el objeto
            modulo8 = data.getModulo8(idempresa);
            //saco los datos del objeto para llenarlos en los elementos del fragment
            //datos cabecera
//            if(modulo8.getC8_P0_0().equals("1")) ckMismoInformante8.setChecked(true);
//            if(modulo8.getC8_P0_0().equals("0")) ckMismoInformante8.setChecked(false);
//            edtNombYApellidos8.setText(modulo8.getC8_P0_1());
//            spCargo8.setSelection(Integer.parseInt(modulo8.getC8_P0_2()));
//            edtEspecifiqueCargo8.setText(modulo8.getC8_P0_3());
            //pregunta 1
            if(!modulo8.getC8_P1_1_5().equals("")) {
                ((RadioButton) rgP1.getChildAt(Integer.parseInt(modulo8.getC8_P1_1_5()))).setChecked(true);
                if(modulo8.getC8_P1_1_5().equals("0")){
                    if(!modulo8.getC8_P1_2_5().equals("")){
                        ((RadioButton) rgP1_a.getChildAt(Integer.parseInt(modulo8.getC8_P1_2_5()))).setChecked(true);}
                }
            }

            //pregunta 2
            if(!modulo8.getC8_P2_5().equals(""))
                ((RadioButton)rgP2.getChildAt(Integer.parseInt(modulo8.getC8_P2_5()))).setChecked(true);

            //pregunta 3
            if(modulo8.getC8_P3_1_5().equals("1")) mod8_p3_ck1.setChecked(true);
            if(modulo8.getC8_P3_1_5().equals("0")) mod8_p3_ck1.setChecked(false);
            if(modulo8.getC8_P3_2_5().equals("1")) mod8_p3_ck2.setChecked(true);
            if(modulo8.getC8_P3_2_5().equals("0")) mod8_p3_ck2.setChecked(false);
            if(modulo8.getC8_P3_3_5().equals("1")) mod8_p3_ck3.setChecked(true);
            if(modulo8.getC8_P3_3_5().equals("0")) mod8_p3_ck3.setChecked(false);
            if(modulo8.getC8_P3_4_5().equals("1")) mod8_p3_ck4.setChecked(true);
            if(modulo8.getC8_P3_4_5().equals("0")) mod8_p3_ck4.setChecked(false);
            if(modulo8.getC8_P3_5_5().equals("1")) mod8_p3_ck5.setChecked(true);
            if(modulo8.getC8_P3_5_5().equals("0")) mod8_p3_ck5.setChecked(false);
            if(modulo8.getC8_P3_6_5().equals("1")) mod8_p3_ck6.setChecked(true);
            if(modulo8.getC8_P3_6_5().equals("0")) mod8_p3_ck6.setChecked(false);
            mod8_p3_edt.setText(modulo8.getC8_P3_6_5_0());

            //pregunta 4
            if(modulo8.getC8_P4_1_5().equals("1")) mod8_p4_ck1.setChecked(true);
            if(modulo8.getC8_P4_1_5().equals("0")) mod8_p4_ck1.setChecked(false);
            if(modulo8.getC8_P4_2_5().equals("1")) mod8_p4_ck2.setChecked(true);
            if(modulo8.getC8_P4_2_5().equals("0")) mod8_p4_ck2.setChecked(false);
            if(modulo8.getC8_P4_3_5().equals("1")) mod8_p4_ck3.setChecked(true);
            if(modulo8.getC8_P4_3_5().equals("0")) mod8_p4_ck3.setChecked(false);
            if(modulo8.getC8_P4_4_5().equals("1")) mod8_p4_ck4.setChecked(true);
            if(modulo8.getC8_P4_4_5().equals("0")) mod8_p4_ck4.setChecked(false);
            if(modulo8.getC8_P4_5_5().equals("1")) mod8_p4_ck5.setChecked(true);
            if(modulo8.getC8_P4_5_5().equals("0")) mod8_p4_ck5.setChecked(false);
            if(modulo8.getC8_P4_6_5().equals("1")) mod8_p4_ck6.setChecked(true);
            if(modulo8.getC8_P4_6_5().equals("0")) mod8_p4_ck6.setChecked(false);
            mod8_p4_edt.setText(modulo8.getC8_P4_6_5_0());

            //pregunta 5
            if(!modulo8.getC8_P5_5().equals("")){
                if(!modulo8.getC8_P5_5().equals("-1")){
                    ((RadioButton) rgP5.getChildAt(Integer.parseInt(modulo8.getC8_P5_5()))).setChecked(true);
                }
            }

            //pregunta 6
            if(modulo8.getC8_P6_1_5().equals("1")) mod8_p6_ckA.setChecked(true);
            if(modulo8.getC8_P6_1_5().equals("0")) mod8_p6_ckA.setChecked(false);
            if(modulo8.getC8_P6_2_5().equals("1")) mod8_p6_ckB.setChecked(true);
            if(modulo8.getC8_P6_2_5().equals("0")) mod8_p6_ckB.setChecked(false);
            if(modulo8.getC8_P6_3_5().equals("1")) mod8_p6_ckC.setChecked(true);
            if(modulo8.getC8_P6_3_5().equals("0")) mod8_p6_ckC.setChecked(false);
            if(modulo8.getC8_P6_4_5().equals("1")) mod8_p6_ckD.setChecked(true);
            if(modulo8.getC8_P6_4_5().equals("0")) mod8_p6_ckD.setChecked(false);
            if(modulo8.getC8_P6_5_5().equals("1")) mod8_p6_ckE.setChecked(true);
            if(modulo8.getC8_P6_5_5().equals("0")) mod8_p6_ckE.setChecked(false);
            if(modulo8.getC8_P6_6_5().equals("1")) mod8_p6_ckF.setChecked(true);
            if(modulo8.getC8_P6_6_5().equals("0")) mod8_p6_ckF.setChecked(false);

            //pregunta 7
            if(!modulo8.getC8_P7_5().equals("")){
                if(!modulo8.getC8_P7_5().equals("-1")){
                    ((RadioButton) rgP7.getChildAt(Integer.parseInt(modulo8.getC8_P7_5()))).setChecked(true);
                }
            }

            //pregunta 8
            if(modulo8.getC8_P8_1_5().equals("1")) mod8_p8_ck1.setChecked(true);
            if(modulo8.getC8_P8_1_5().equals("0")) mod8_p8_ck1.setChecked(false);
            if(modulo8.getC8_P8_2_5().equals("1")) mod8_p8_ck2.setChecked(true);
            if(modulo8.getC8_P8_2_5().equals("0")) mod8_p8_ck2.setChecked(false);
            if(modulo8.getC8_P8_3_5().equals("1")) mod8_p8_ck3.setChecked(true);
            if(modulo8.getC8_P8_3_5().equals("0")) mod8_p8_ck3.setChecked(false);
            if(modulo8.getC8_P8_4_5().equals("1")) mod8_p8_ck4.setChecked(true);
            if(modulo8.getC8_P8_4_5().equals("0")) mod8_p8_ck4.setChecked(false);

            //pregunta 9
            if(modulo8.getC8_P9_1_5().equals("1")) mod8_p9_ck1.setChecked(true);
            if(modulo8.getC8_P9_1_5().equals("0")) mod8_p9_ck1.setChecked(false);
            if(modulo8.getC8_P9_2_5().equals("1")) mod8_p9_ck2.setChecked(true);
            if(modulo8.getC8_P9_2_5().equals("0")) mod8_p9_ck2.setChecked(false);
            if(modulo8.getC8_P9_3_5().equals("1")) mod8_p9_ck3.setChecked(true);
            if(modulo8.getC8_P9_3_5().equals("0")) mod8_p9_ck3.setChecked(false);
            if(modulo8.getC8_P9_4_5().equals("1")) mod8_p9_ck4.setChecked(true);
            if(modulo8.getC8_P9_4_5().equals("0")) mod8_p9_ck4.setChecked(false);

            //pregunta 10
            if(modulo8.getC8_P10_1_5().equals("1")) mod8_p10_ck1.setChecked(true);
            if(modulo8.getC8_P10_1_5().equals("0")) mod8_p10_ck1.setChecked(false);
            if(modulo8.getC8_P10_2_5().equals("1")) mod8_p10_ck2.setChecked(true);
            if(modulo8.getC8_P10_2_5().equals("0")) mod8_p10_ck2.setChecked(false);
            if(modulo8.getC8_P10_3_5().equals("1")) mod8_p10_ck3.setChecked(true);
            if(modulo8.getC8_P10_3_5().equals("0")) mod8_p10_ck3.setChecked(false);
            if(modulo8.getC8_P10_4_5().equals("1")) mod8_p10_ck4.setChecked(true);
            if(modulo8.getC8_P10_4_5().equals("0")) mod8_p10_ck4.setChecked(false);
            if(modulo8.getC8_P10_5_5().equals("1")) mod8_p10_ck5.setChecked(true);
            if(modulo8.getC8_P10_5_5().equals("0")) mod8_p10_ck5.setChecked(false);
            if(modulo8.getC8_P10_6_5().equals("1")) mod8_p10_ck6.setChecked(true);
            if(modulo8.getC8_P10_6_5().equals("0")) mod8_p10_ck6.setChecked(false);

        }
        data.close();
    }
    public void llenarMapaVariables(){
        //preguntas cabecera
//        if(ckMismoInformante8.isChecked())C8_P0_0 = 1;
//        else C8_P0_0 = 0;
//        C8_P0_1 = edtNombYApellidos8.getText().toString();
//        C8_P0_2 = spCargo8.getSelectedItemPosition();
//        C8_P0_3 = edtEspecifiqueCargo8.getText().toString();
        //pregunta 1
        int childPosP1b = rgP1.indexOfChild(rgP1.findViewById(rgP1.getCheckedRadioButtonId()));
        C8_P1_1_5 = childPosP1b;
        //preguntar
        int childPosP11b = rgP1_a.indexOfChild(rgP1_a.findViewById(rgP1_a.getCheckedRadioButtonId()));
        C8_P1_2_5 = childPosP11b;

        //pregunta 2
        int childPosP2b = rgP2.indexOfChild(rgP2.findViewById(rgP2.getCheckedRadioButtonId()));
        C8_P2_5 = childPosP2b;

        //pregunta 3
        if(mod8_p3_ck1.isChecked())C8_P3_1_5 = 1;
        else C8_P3_1_5 = 0;
        if(mod8_p3_ck2.isChecked())C8_P3_2_5 = 1;
        else C8_P3_2_5 = 0;
        if(mod8_p3_ck3.isChecked())C8_P3_3_5 = 1;
        else C8_P3_3_5 = 0;
        if(mod8_p3_ck4.isChecked())C8_P3_4_5 = 1;
        else C8_P3_4_5 = 0;
        if(mod8_p3_ck5.isChecked())C8_P3_5_5 = 1;
        else C8_P3_5_5 = 0;
        if(mod8_p3_ck6.isChecked())C8_P3_6_5 = 1;
        else C8_P3_6_5 = 0;
        C8_P3_6_5_0 = mod8_p3_edt.getText().toString();

        //pregunta 4
        if(mod8_p4_ck1.isChecked())C8_P4_1_5 = 1;
        else C8_P4_1_5 = 0;
        if(mod8_p4_ck2.isChecked())C8_P4_2_5 = 1;
        else C8_P4_2_5 = 0;
        if(mod8_p4_ck3.isChecked())C8_P4_3_5 = 1;
        else C8_P4_3_5 = 0;
        if(mod8_p4_ck4.isChecked())C8_P4_4_5 = 1;
        else C8_P4_4_5 = 0;
        if(mod8_p4_ck5.isChecked())C8_P4_5_5 = 1;
        else C8_P4_5_5 = 0;
        if(mod8_p4_ck6.isChecked())C8_P4_6_5 = 1;
        else C8_P4_6_5 = 0;
        C8_P4_6_5_0 = mod8_p4_edt.getText().toString();

        //pregunta 5
        int childPosP5b = rgP5.indexOfChild(rgP5.findViewById(rgP5.getCheckedRadioButtonId()));
        C8_P5_5 = childPosP5b;

        //pregunta 6
        if(mod8_p6_ckA.isChecked())C8_P6_1_5 = 1;
        else C8_P6_1_5 = 0;
        if(mod8_p6_ckB.isChecked())C8_P6_2_5 = 1;
        else C8_P6_2_5 = 0;
        if(mod8_p6_ckC.isChecked())C8_P6_3_5 = 1;
        else C8_P6_3_5 = 0;
        if(mod8_p6_ckD.isChecked())C8_P6_4_5 = 1;
        else C8_P6_4_5 = 0;
        if(mod8_p6_ckE.isChecked())C8_P6_5_5 = 1;
        else C8_P6_5_5 = 0;
        if(mod8_p6_ckF.isChecked())C8_P6_6_5 = 1;
        else C8_P6_6_5 = 0;

        //pregunta 7
        int childPosP7b = rgP7.indexOfChild(rgP7.findViewById(rgP7.getCheckedRadioButtonId()));
        C8_P7_5 = childPosP7b;

        //pregunta 8
        if(mod8_p8_ck1.isChecked())C8_P8_1_5 = 1;
        else C8_P8_1_5 = 0;
        if(mod8_p8_ck2.isChecked())C8_P8_2_5 = 1;
        else C8_P8_2_5 = 0;
        if(mod8_p8_ck3.isChecked())C8_P8_3_5 = 1;
        else C8_P8_3_5 = 0;
        if(mod8_p8_ck4.isChecked())C8_P8_4_5 = 1;
        else C8_P8_4_5 = 0;

        //pregunta 9
        if(mod8_p9_ck1.isChecked())C8_P9_1_5 = 1;
        else C8_P9_1_5 = 0;
        if(mod8_p9_ck2.isChecked())C8_P9_2_5 = 1;
        else C8_P9_2_5 = 0;
        if(mod8_p9_ck3.isChecked())C8_P9_3_5 = 1;
        else C8_P9_3_5 = 0;
        if(mod8_p9_ck4.isChecked())C8_P9_4_5 = 1;
        else C8_P9_4_5 = 0;

        //pregunta 10
        if(mod8_p10_ck1.isChecked())C8_P10_1_5 = 1;
        else C8_P10_1_5 = 0;
        if(mod8_p10_ck2.isChecked())C8_P10_2_5 = 1;
        else C8_P10_2_5 = 0;
        if(mod8_p10_ck3.isChecked())C8_P10_3_5 = 1;
        else C8_P10_3_5 = 0;
        if(mod8_p10_ck4.isChecked())C8_P10_4_5 = 1;
        else C8_P10_4_5 = 0;
        if(mod8_p10_ck5.isChecked())C8_P10_5_5 = 1;
        else C8_P10_5_5 = 0;
        if(mod8_p10_ck6.isChecked())C8_P10_6_5 = 1;
        else C8_P10_6_5 = 0;

    }

    public void guardarDatos(){
        data = new Data(context);
        data.open();
        if(data.existeModulo8(idempresa)){
            ContentValues contentValues = new ContentValues(240);
//            contentValues.put(SQLConstantes.MODULO8_P0_0,C8_P0_0+"");
//            contentValues.put(SQLConstantes.MODULO8_P0_1,C8_P0_1);
//            contentValues.put(SQLConstantes.MODULO8_P0_2,C8_P0_2+"");
//            contentValues.put(SQLConstantes.MODULO8_P0_3,C8_P0_3);
            contentValues.put(SQLConstantes.MODULO8_P1_1_5,C8_P1_1_5+"");
            contentValues.put(SQLConstantes.MODULO8_P1_2_5,C8_P1_2_5+"");
            contentValues.put(SQLConstantes.MODULO8_P2_5,C8_P2_5+"");
            contentValues.put(SQLConstantes.MODULO8_P3_1_5,C8_P3_1_5+"");
            contentValues.put(SQLConstantes.MODULO8_P3_2_5,C8_P3_2_5+"");
            contentValues.put(SQLConstantes.MODULO8_P3_3_5,C8_P3_3_5+"");
            contentValues.put(SQLConstantes.MODULO8_P3_4_5,C8_P3_4_5+"");
            contentValues.put(SQLConstantes.MODULO8_P3_5_5,C8_P3_5_5+"");
            contentValues.put(SQLConstantes.MODULO8_P3_6_5,C8_P3_6_5+"");
            contentValues.put(SQLConstantes.MODULO8_P3_6_5_0,C8_P3_6_5_0);
            contentValues.put(SQLConstantes.MODULO8_P4_1_5,C8_P4_1_5+"");
            contentValues.put(SQLConstantes.MODULO8_P4_2_5,C8_P4_2_5+"");
            contentValues.put(SQLConstantes.MODULO8_P4_3_5,C8_P4_3_5+"");
            contentValues.put(SQLConstantes.MODULO8_P4_4_5,C8_P4_4_5+"");
            contentValues.put(SQLConstantes.MODULO8_P4_5_5,C8_P4_5_5+"");
            contentValues.put(SQLConstantes.MODULO8_P4_6_5,C8_P4_6_5+"");
            contentValues.put(SQLConstantes.MODULO8_P4_6_5_0,C8_P4_6_5_0);
            contentValues.put(SQLConstantes.MODULO8_P5_5,C8_P5_5+"");
            contentValues.put(SQLConstantes.MODULO8_P6_1_5,C8_P6_1_5+"");
            contentValues.put(SQLConstantes.MODULO8_P6_2_5,C8_P6_2_5+"");
            contentValues.put(SQLConstantes.MODULO8_P6_3_5,C8_P6_3_5+"");
            contentValues.put(SQLConstantes.MODULO8_P6_4_5,C8_P6_4_5+"");
            contentValues.put(SQLConstantes.MODULO8_P6_5_5,C8_P6_5_5+"");
            contentValues.put(SQLConstantes.MODULO8_P6_6_5,C8_P6_6_5+"");
            contentValues.put(SQLConstantes.MODULO8_P7_5,C8_P7_5+"");
            contentValues.put(SQLConstantes.MODULO8_P8_1_5,C8_P8_1_5+"");
            contentValues.put(SQLConstantes.MODULO8_P8_2_5,C8_P8_2_5+"");
            contentValues.put(SQLConstantes.MODULO8_P8_3_5,C8_P8_3_5+"");
            contentValues.put(SQLConstantes.MODULO8_P8_4_5,C8_P8_4_5+"");
            contentValues.put(SQLConstantes.MODULO8_P9_1_5,C8_P9_1_5+"");
            contentValues.put(SQLConstantes.MODULO8_P9_2_5,C8_P9_2_5+"");
            contentValues.put(SQLConstantes.MODULO8_P9_3_5,C8_P9_3_5+"");
            contentValues.put(SQLConstantes.MODULO8_P9_4_5,C8_P9_4_5+"");
            contentValues.put(SQLConstantes.MODULO8_P10_1_5,C8_P10_1_5+"");
            contentValues.put(SQLConstantes.MODULO8_P10_2_5,C8_P10_2_5+"");
            contentValues.put(SQLConstantes.MODULO8_P10_3_5,C8_P10_3_5+"");
            contentValues.put(SQLConstantes.MODULO8_P10_4_5,C8_P10_4_5+"");
            contentValues.put(SQLConstantes.MODULO8_P10_5_5,C8_P10_5_5+"");
            contentValues.put(SQLConstantes.MODULO8_P10_6_5,C8_P10_6_5+"");
            data.actualizarModulo8(idempresa,contentValues);
        }else{
            //si no existe el elemento, lo construye para insertarlo
            modulo8 = new Modulo8();
            //llena el objeto a insertar
            modulo8.setMODULO8_ID(idempresa);
//            modulo8.setC8_P0_0(C8_P0_0+"");
//            modulo8.setC8_P0_1(C8_P0_1);
//            modulo8.setC8_P0_2(C8_P0_2+"");
//            modulo8.setC8_P0_3(C8_P0_3);
            modulo8.setC8_P1_1_5(C8_P1_1_5+"");
            modulo8.setC8_P1_2_5(C8_P1_2_5+"");
            modulo8.setC8_P2_5(C8_P2_5+"");
            modulo8.setC8_P3_1_5(C8_P3_1_5+"");
            modulo8.setC8_P3_2_5(C8_P3_2_5+"");
            modulo8.setC8_P3_3_5(C8_P3_3_5+"");
            modulo8.setC8_P3_4_5(C8_P3_4_5+"");
            modulo8.setC8_P3_5_5(C8_P3_5_5+"");
            modulo8.setC8_P3_6_5(C8_P3_6_5+"");
            modulo8.setC8_P3_6_5_0(C8_P3_6_5_0);
            modulo8.setC8_P4_1_5(C8_P4_1_5+"");
            modulo8.setC8_P4_2_5(C8_P4_2_5+"");
            modulo8.setC8_P4_3_5(C8_P4_3_5+"");
            modulo8.setC8_P4_4_5(C8_P4_4_5+"");
            modulo8.setC8_P4_5_5(C8_P4_5_5+"");
            modulo8.setC8_P4_6_5(C8_P4_6_5+"");
            modulo8.setC8_P4_6_5_0(C8_P4_6_5_0);
            modulo8.setC8_P5_5(C8_P5_5+"");
            modulo8.setC8_P6_1_5(C8_P6_1_5+"");
            modulo8.setC8_P6_2_5(C8_P6_2_5+"");
            modulo8.setC8_P6_3_5(C8_P6_3_5+"");
            modulo8.setC8_P6_4_5(C8_P6_4_5+"");
            modulo8.setC8_P6_5_5(C8_P6_5_5+"");
            modulo8.setC8_P6_6_5(C8_P6_6_5+"");
            modulo8.setC8_P7_5(C8_P7_5+"");
            modulo8.setC8_P8_1_5(C8_P8_1_5+"");
            modulo8.setC8_P8_2_5(C8_P8_2_5+"");
            modulo8.setC8_P8_3_5(C8_P8_3_5+"");
            modulo8.setC8_P8_4_5(C8_P8_4_5+"");
            modulo8.setC8_P9_1_5(C8_P9_1_5+"");
            modulo8.setC8_P9_2_5(C8_P9_2_5+"");
            modulo8.setC8_P9_3_5(C8_P9_3_5+"");
            modulo8.setC8_P9_4_5(C8_P9_4_5+"");
            modulo8.setC8_P10_1_5(C8_P10_1_5+"");
            modulo8.setC8_P10_2_5(C8_P10_2_5+"");
            modulo8.setC8_P10_3_5(C8_P10_3_5+"");
            modulo8.setC8_P10_4_5(C8_P10_4_5+"");
            modulo8.setC8_P10_5_5(C8_P10_5_5+"");
            modulo8.setC8_P10_6_5(C8_P10_6_5+"");
            data.insertarModulo8(modulo8);
        }
        data.close();
    }

    public boolean validar(){
        boolean valido = true;
        String mensaje = "";
        llenarMapaVariables();

//        boolean vC8_P0_1 = false; boolean vC8_P0_2 = false; boolean vC8_P0_3 = false;
        boolean vC8_P1_1_5 = false; boolean vC8_P1_2_5 = false;
        boolean vC8_P2_5 = false;
        boolean vC8_P3_1_5 = false; boolean vC8_P3_2_5 = false; boolean vC8_P3_3_5 = false; boolean vC8_P3_4_5 = false; boolean vC8_P3_5_5 = false; boolean vC8_P3_6_5 = false; boolean vC8_P3_6_5_0 = false;
        boolean vC8_P4_1_5 = false; boolean vC8_P4_2_5 = false; boolean vC8_P4_3_5 = false; boolean vC8_P4_4_5 = false; boolean vC8_P4_5_5 = false; boolean vC8_P4_6_5 = false; boolean vC8_P4_6_5_0 = false;
        boolean vC8_P5_5 = false;
        boolean vC8_P6_1_5 = false; boolean vC8_P6_2_5 = false; boolean vC8_P6_3_5 = false; boolean vC8_P6_4_5 = false; boolean vC8_P6_5_5 = false; boolean vC8_P6_6_5 = false;
        boolean vC8_P7_5 = false;
        boolean vC8_P8_1_5 = false; boolean vC8_P8_2_5 = false; boolean vC8_P8_3_5 = false; boolean vC8_P8_4_5 = false;
        boolean vC8_P9_1_5 = false; boolean vC8_P9_2_5 = false; boolean vC8_P9_3_5 = false; boolean vC8_P9_4_5 = false;
        boolean vC8_P10_1_5 = false; boolean vC8_P10_2_5 = false; boolean vC8_P10_3_5 = false; boolean vC8_P10_4_5 = false; boolean vC8_P10_5_5 = false; boolean vC8_P10_6_5 = false;



        //pregunta1
        if(C8_P1_1_5 == -1)
        {if(mensaje.equals("")) mensaje = "Pregunta 1: Marque una opción ";
            valido=false;
        }
        if(C8_P1_1_5 == 0 && C8_P1_2_5 == -1)
        {if(mensaje.equals("")) mensaje = "Pregunta 1: Marque una opción en Afectación";
            valido=false;
        }

        //pregunta2
        if(C8_P2_5 == -1)
        {if(mensaje.equals("")) mensaje = "Pregunta 2: Marque una opción";
            valido=false;
        }

        if(C8_P1_1_5 == 0) {
            if (C8_P2_5 >= 0) {
                if (C8_P5_5 == -1) {
                    if(mensaje.equals("")) mensaje = "Pregunta 5: Marque una opción";
                    valido = false;
                }
                if (C8_P5_5 >= 0) {
                    //pregunta6
                    if ((C8_P6_1_5 + C8_P6_2_5 + C8_P6_3_5 + C8_P6_4_5 + C8_P6_5_5 + C8_P6_6_5) == 0) {
                        if(mensaje.equals("")) mensaje = "Pregunta 6: Marque una o más opciones";
                        valido = false;
                    }
                    if((C8_P6_1_5 + C8_P6_2_5 + C8_P6_4_5 + C8_P6_5_5) == 0 && (C8_P6_3_5+C8_P6_6_5) == 1){
                        //if(mensaje.equals("")) mensaje = "Modulo registrado correctamente";
                    }else if((C8_P6_1_5 + C8_P6_2_5 + C8_P6_5_5) >0 && (C8_P6_4_5+C8_P6_6_5) == 0){
                        //pregunta7
                        if(C8_P7_5 == -1)
                        {if(mensaje.equals("")) mensaje = "Pregunta 7: Marque una opción";
                            valido=false;
                        }
                        //pregunta8
                        if((C8_P8_1_5+C8_P8_2_5+C8_P8_3_5+C8_P8_4_5) == 0)
                        {if(mensaje.equals("")) mensaje = "Pregunta 8: Marque una o más opciones";
                            valido=false;
                        }
                    }else if((C8_P6_1_5 + C8_P6_2_5 + C8_P6_5_5) >0 && C8_P6_4_5 == 1 && C8_P6_6_5== 0){
                        //pregunta7
                        if(C8_P7_5 == -1)
                        {if(mensaje.equals("")) mensaje = "Pregunta 7: Marque una opción";
                            valido=false;
                        }
                        //pregunta8
                        if((C8_P8_1_5+C8_P8_2_5+C8_P8_3_5+C8_P8_4_5) == 0)
                        {if(mensaje.equals("")) mensaje = "Pregunta 8: Marque una o más opciones";
                            valido=false;
                        }
                        //pregunta9
                        if((C8_P9_1_5+C8_P9_2_5+C8_P9_3_5+C8_P9_4_5) == 0)
                        {if(mensaje.equals("")) mensaje = "Pregunta 9: Marque una o más opciones";
                            valido=false;
                        }
                        //pregunta10
                        if((C8_P10_1_5+C8_P10_2_5+C8_P10_3_5+C8_P10_4_5+C8_P10_5_5+C8_P10_6_5) == 0)
                        {if(mensaje.equals("")) mensaje = "Pregunta 10: Marque una o más opciones";
                            valido=false;
                        }
                    }else if((C8_P6_1_5 + C8_P6_2_5 + C8_P6_5_5) == 0 && C8_P6_4_5 == 1 && C8_P6_6_5== 0){
                        //pregunta9
                        if((C8_P9_1_5+C8_P9_2_5+C8_P9_3_5+C8_P9_4_5) == 0)
                        {if(mensaje.equals("")) mensaje = "Pregunta 9: Marque una o más opciones";
                            valido=false;
                        }
                        //pregunta10
                        if((C8_P10_1_5+C8_P10_2_5+C8_P10_3_5+C8_P10_4_5+C8_P10_5_5+C8_P10_6_5) == 0)
                        {if(mensaje.equals("")) mensaje = "Pregunta 10: Marque una o más opciones";
                            valido=false;
                        }
                    }
                }
            }
        }else if(C8_P1_1_5 == 1){
            if(C8_P2_5 == 0 || C8_P2_5 == 1){
                //pregunta3
                if((C8_P3_1_5+C8_P3_2_5+C8_P3_3_5+C8_P3_4_5+C8_P3_5_5+C8_P3_6_5) == 0)
                {if(mensaje.equals("")) mensaje = "Pregunta 3: Marque una o más opciones";
                    valido=false;
                }
                if((C8_P3_6_5) == 1 && C8_P3_6_5_0.trim().length() == 0)
                {if(mensaje.equals("")) mensaje = "Pregunta 3: Debe ingresar información valida en especifique";
                    valido=false;
                }
                //pregunta5
                if(C8_P5_5 == -1)
                {if(mensaje.equals("")) mensaje = "Pregunta 5: Marque una opción";
                    valido=false;
                }
                //pregunta6
                if ((C8_P6_1_5 + C8_P6_2_5 + C8_P6_3_5 + C8_P6_4_5 + C8_P6_5_5 + C8_P6_6_5) == 0) {
                    if(mensaje.equals("")) mensaje = "Pregunta 6: Marque una o más opciones";
                    valido = false;
                }
                if((C8_P6_1_5 + C8_P6_2_5 + C8_P6_4_5 + C8_P6_5_5) == 0 && (C8_P6_3_5 + C8_P6_6_5) == 1){
                    //if(mensaje.equals("")) mensaje = "Modulo registrado correctamente";
                }else if((C8_P6_1_5 + C8_P6_2_5 + C8_P6_5_5) > 0 && (C8_P6_4_5 + C8_P6_6_5) == 0){
                    //pregunta7
                    if(C8_P7_5 == -1)
                    {if(mensaje.equals("")) mensaje = "Pregunta 7: Marque una opción";
                        valido=false;
                    }
                    //pregunta8
                    if((C8_P8_1_5+C8_P8_2_5+C8_P8_3_5+C8_P8_4_5) == 0)
                    {if(mensaje.equals("")) mensaje = "Pregunta 8: Marque una o más opciones";
                        valido=false;
                    }
                }else if((C8_P6_1_5 + C8_P6_2_5 + C8_P6_5_5) > 0 && C8_P6_4_5 == 1 && C8_P6_6_5 == 0){
                    //pregunta7
                    if(C8_P7_5 == -1)
                    {if(mensaje.equals("")) mensaje = "Pregunta 7: Marque una opción";
                        valido=false;
                    }
                    //pregunta8
                    if((C8_P8_1_5+C8_P8_2_5+C8_P8_3_5+C8_P8_4_5) == 0)
                    {if(mensaje.equals("")) mensaje = "Pregunta 8: Marque una o más opciones";
                        valido=false;
                    }
                    //pregunta9
                    if((C8_P9_1_5+C8_P9_2_5+C8_P9_3_5+C8_P9_4_5) == 0)
                    {if(mensaje.equals("")) mensaje = "Pregunta 9: Marque una o más opciones";
                        valido=false;
                    }
                    //pregunta10
                    if((C8_P10_1_5+C8_P10_2_5+C8_P10_3_5+C8_P10_4_5+C8_P10_5_5+C8_P10_6_5) == 0)
                    {if(mensaje.equals("")) mensaje = "Pregunta 10: Marque una o más opciones";
                        valido=false;
                    }
                }else if((C8_P6_1_5 + C8_P6_2_5 + C8_P6_5_5) == 0 && C8_P6_4_5 == 1 && C8_P6_6_5 == 0){
                    //pregunta9
                    if((C8_P9_1_5+C8_P9_2_5+C8_P9_3_5+C8_P9_4_5) == 0)
                    {if(mensaje.equals("")) mensaje = "Pregunta 9: Marque una o más opciones";
                        valido=false;
                    }
                    //pregunta10
                    if((C8_P10_1_5+C8_P10_2_5+C8_P10_3_5+C8_P10_4_5+C8_P10_5_5+C8_P10_6_5) == 0)
                    {if(mensaje.equals("")) mensaje = "Pregunta 10: Marque una o más opciones";
                        valido=false;
                    }
                }
            }else if(C8_P2_5 == 2 || C8_P2_5 == 3){
                //pregunta3
                if((C8_P3_1_5+C8_P3_2_5+C8_P3_3_5+C8_P3_4_5+C8_P3_5_5+C8_P3_6_5) == 0)
                {if(mensaje.equals("")) mensaje = "Pregunta 3: Marque una o más opciones";
                    valido=false;
                }
                if((C8_P3_6_5) == 1 && C8_P3_6_5_0.trim().length() == 0)
                {if(mensaje.equals("")) mensaje = "Pregunta 3: Debe ingresar información valida en especifique";
                    valido=false;
                }
                //pregunta4
                if((C8_P4_1_5+C8_P4_2_5+C8_P4_3_5+C8_P4_4_5+C8_P4_5_5+C8_P4_6_5) == 0)
                {if(mensaje.equals("")) mensaje = "Pregunta 4: Marque una o más opciones";
                    valido=false;
                }
                if((C8_P4_6_5) == 1 && C8_P4_6_5_0.trim().length() == 0)
                {if(mensaje.equals("")) mensaje = "Pregunta 4: Debe ingresar información valida en especifique";
                    valido=false;
                }
            }else if(C8_P2_5 == 4){
                //pregunta3
                if((C8_P3_1_5+C8_P3_2_5+C8_P3_3_5+C8_P3_4_5+C8_P3_5_5+C8_P3_6_5) == 0)
                {if(mensaje.equals("")) mensaje = "Pregunta 3: Marque una o más opciones";
                    valido=false;
                }
                if((C8_P3_6_5) == 1 && C8_P3_6_5_0.trim().length() == 0)
                {if(mensaje.equals("")) mensaje = "Pregunta 3: Debe ingresar información valida en especifique";
                    valido=false;
                }
            }
        }
        if(!valido) mostrarMensaje(mensaje);
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
