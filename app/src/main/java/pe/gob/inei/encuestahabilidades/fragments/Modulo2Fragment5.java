package pe.gob.inei.encuestahabilidades.fragments;


import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.provider.MediaStore;
import android.support.annotation.IdRes;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AlertDialog;
import android.text.InputFilter;
import android.util.Log;
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
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import pe.gob.inei.encuestahabilidades.NumericKeyBoardTransformationMethod;
import pe.gob.inei.encuestahabilidades.R;
import pe.gob.inei.encuestahabilidades.modelo.Data;
import pe.gob.inei.encuestahabilidades.modelo.SQLConstantes;
import pe.gob.inei.encuestahabilidades.pojos.Modulo2;

/**
 * A simple {@link Fragment} subclass.
 */
public class Modulo2Fragment5 extends Fragment {

    private LinearLayout lytP20;
    private LinearLayout lytP21;
    private LinearLayout lytP22;

    private CheckBox ck1P20;
    private CheckBox ck2P20;
    private CheckBox ck3P20;
    private CheckBox ck4P20;
    private CheckBox ck5P20;
    private CheckBox ck6P20;
    private CheckBox ck7P20;
    private CheckBox ck8P20;

    private Spinner sp1P20;
    private Spinner sp2P20;
    private Spinner sp3P20;
    private Spinner sp4P20;
    private Spinner sp5P20;
    private Spinner sp6P20;
    private Spinner sp7P20;
    private Spinner sp8P20;

    private LinearLayout lytSp1P20;
    private LinearLayout lytSp2P20;
    private LinearLayout lytSp3P20;
    private LinearLayout lytSp4P20;
    private LinearLayout lytSp5P20;
    private LinearLayout lytSp6P20;
    private LinearLayout lytSp7P20;
    private LinearLayout lytSp8P20;

    private EditText edtEspecifiqueP20;
    private EditText edtEspecifiqueP22;

    private Toast mToastToShow;


    private RadioGroup rgP21;

    private RadioGroup rg1P22;
    private RadioGroup rg2P22;
    private RadioGroup rg3P22;
    private RadioGroup rg4P22;
    private RadioGroup rg5P22;
    private RadioGroup rg6P22;

    private CheckBox ck1P22;
    private CheckBox ck2P22;
    private CheckBox ck3P22;
    private CheckBox ck4P22;
    private CheckBox ck5P22;
    private CheckBox ck6P22;

    private EditText edt1P22;
    private EditText edt2P22;
    private EditText edt3P22;
    private EditText edt4P22;
    private EditText edt5P22;
    private EditText edt6P22;

    private String idempresa;
    private Modulo2 modulo2;
    private Context context;
    private Data data;

    private int C2_P20_1_1;
    private int C2_P20_1_2;
    private int C2_P20_1_3;
    private int C2_P20_1_4;
    private int C2_P20_1_5;
    private int C2_P20_1_6;
    private int C2_P20_1_7;
    private int C2_P20_1_8;
    private String C2_P20_1_8_0;
    private int C2_P20_2_1;
    private int C2_P20_2_2;
    private int C2_P20_2_3;
    private int C2_P20_2_4;
    private int C2_P20_2_5;
    private int C2_P20_2_6;
    private int C2_P20_2_7;
    private int C2_P20_2_8;
    private int C2_P21;
    private int C2_P22_1_1;
    private int C2_P22_1_2;
    private int C2_P22_1_3;
    private int C2_P22_1_4;
    private int C2_P22_1_5;
    private int C2_P22_1_6;
    private String C2_P22_1_6_0;
    private String C2_P22_2_1;
    private String C2_P22_2_2;
    private String C2_P22_2_3;
    private String C2_P22_2_4;
    private String C2_P22_2_5;
    private String C2_P22_2_6;

    public Modulo2Fragment5() {
        // Required empty public constructor
    }

    @SuppressLint("ValidFragment")
    public Modulo2Fragment5(String idempresa, Context context) {
        this.idempresa = idempresa;
        this.context = context;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_modulo2_fragment5, container, false);

        lytP20 = (LinearLayout) rootView.findViewById(R.id.mod2_p20_lyt);
        lytP21 = (LinearLayout) rootView.findViewById(R.id.mod2_p21_lyt);
        lytP22 = (LinearLayout) rootView.findViewById(R.id.mod2_p22_lyt);

        lytSp1P20 = (LinearLayout) rootView.findViewById(R.id.mod2_p20_lyt1);
        lytSp2P20 = (LinearLayout) rootView.findViewById(R.id.mod2_p20_lyt2);
        lytSp3P20 = (LinearLayout) rootView.findViewById(R.id.mod2_p20_lyt3);
        lytSp4P20 = (LinearLayout) rootView.findViewById(R.id.mod2_p20_lyt4);
        lytSp5P20 = (LinearLayout) rootView.findViewById(R.id.mod2_p20_lyt5);
        lytSp6P20 = (LinearLayout) rootView.findViewById(R.id.mod2_p20_lyt6);
        lytSp7P20 = (LinearLayout) rootView.findViewById(R.id.mod2_p20_lyt7);
        lytSp8P20 = (LinearLayout) rootView.findViewById(R.id.mod2_p20_lyt8);


        ck1P20 = (CheckBox) rootView.findViewById(R.id.mod2_p20_ck1);
        ck2P20 = (CheckBox) rootView.findViewById(R.id.mod2_p20_ck2);
        ck3P20 = (CheckBox) rootView.findViewById(R.id.mod2_p20_ck3);
        ck4P20 = (CheckBox) rootView.findViewById(R.id.mod2_p20_ck4);
        ck5P20 = (CheckBox) rootView.findViewById(R.id.mod2_p20_ck5);
        ck6P20 = (CheckBox) rootView.findViewById(R.id.mod2_p20_ck6);
        ck7P20 = (CheckBox) rootView.findViewById(R.id.mod2_p20_ck7);
        ck8P20 = (CheckBox) rootView.findViewById(R.id.mod2_p20_ck8);

        sp1P20 = (Spinner) rootView.findViewById(R.id.mod2_p20_sp1);
        sp2P20 = (Spinner) rootView.findViewById(R.id.mod2_p20_sp2);
        sp3P20 = (Spinner) rootView.findViewById(R.id.mod2_p20_sp3);
        sp4P20 = (Spinner) rootView.findViewById(R.id.mod2_p20_sp4);
        sp5P20 = (Spinner) rootView.findViewById(R.id.mod2_p20_sp5);
        sp6P20 = (Spinner) rootView.findViewById(R.id.mod2_p20_sp6);
        sp7P20 = (Spinner) rootView.findViewById(R.id.mod2_p20_sp7);
        sp8P20 = (Spinner) rootView.findViewById(R.id.mod2_p20_sp8);

        rgP21 = (RadioGroup) rootView.findViewById(R.id.mod2_p21_rg);

        rg1P22 = (RadioGroup) rootView.findViewById(R.id.mod2_p22_rg1);
        rg2P22 = (RadioGroup) rootView.findViewById(R.id.mod2_p22_rg2);
        rg3P22 = (RadioGroup) rootView.findViewById(R.id.mod2_p22_rg3);
        rg4P22 = (RadioGroup) rootView.findViewById(R.id.mod2_p22_rg4);
        rg5P22 = (RadioGroup) rootView.findViewById(R.id.mod2_p22_rg5);
        rg6P22 = (RadioGroup) rootView.findViewById(R.id.mod2_p22_rg6);

        edt1P22 = (EditText) rootView.findViewById(R.id.mod2_p22_edt1);
        edt2P22 = (EditText) rootView.findViewById(R.id.mod2_p22_edt2);
        edt3P22 = (EditText) rootView.findViewById(R.id.mod2_p22_edt3);
        edt4P22 = (EditText) rootView.findViewById(R.id.mod2_p22_edt4);
        edt5P22 = (EditText) rootView.findViewById(R.id.mod2_p22_edt5);
        edt6P22 = (EditText) rootView.findViewById(R.id.mod2_p22_edt6);

        edtEspecifiqueP20 = (EditText) rootView.findViewById(R.id.mod2_p20_edtEspecifique);
        edtEspecifiqueP22 = (EditText) rootView.findViewById(R.id.mod2_p22_edtEspecifique);

        return rootView;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        final Spinner[] spinners = {sp1P20,sp2P20,sp3P20,sp4P20,sp5P20,sp6P20,sp7P20};
        final Spinner[] spinnersAux = {sp1P20,sp2P20,sp3P20,sp4P20,sp5P20,sp6P20,sp7P20,sp8P20};

        final LinearLayout[] layoutSpinners = {lytSp1P20,lytSp2P20,lytSp3P20,lytSp4P20,lytSp5P20,lytSp6P20,lytSp7P20};
        final CheckBox[] checkBoxes = {ck1P20,ck2P20,ck3P20,ck4P20,ck5P20,ck6P20,ck7P20};

        RadioGroup[] radioGroups = {rg1P22,rg2P22,rg3P22,rg4P22,rg5P22,rg6P22};
        EditText[] editTexts = {edt1P22,edt2P22,edt3P22,edt4P22,edt5P22,edt6P22};


        //pregunta20
        for (int i = 0; i <checkBoxes.length ; i++) {
            CheckBox checkBox = checkBoxes[i];
            final Spinner spinner = spinners[i];
            final LinearLayout linearLayout = layoutSpinners[i];
            checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                    if(b){
                        if(!comprobarSumaSpinner(spinnersAux)){
                            spinner.setEnabled(true);
                            linearLayout.setBackgroundResource(R.drawable.fondo_spinner);
                        }
                    }else{
                        spinner.setSelection(0);
                        linearLayout.setBackgroundResource(R.drawable.fondo_spinner_disabled);
                        spinner.setEnabled(false);
                    }
                }
            });
        }

        ck8P20.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    edtEspecifiqueP20.setEnabled(true);
                    edtEspecifiqueP20.setBackgroundResource(R.drawable.fondo_edit_text);
                    if(!comprobarSumaSpinner(spinnersAux)){
                        sp8P20.setEnabled(true);
                        lytSp8P20.setBackgroundResource(R.drawable.fondo_spinner);
                    }
                }else{
                    edtEspecifiqueP20.setText("");
                    edtEspecifiqueP20.setBackgroundResource(R.drawable.cajas_de_texto_disabled);
                    edtEspecifiqueP20.setEnabled(false);
                    sp8P20.setSelection(0);
                    lytSp8P20.setBackgroundResource(R.drawable.fondo_spinner_disabled);
                    sp8P20.setEnabled(false);
                }
            }
        });

        edtEspecifiqueP20.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View view, int keyCode, KeyEvent keyEvent) {
                if ((keyEvent.getAction() == KeyEvent.ACTION_DOWN) &&
                        (keyCode == KeyEvent.KEYCODE_ENTER)) {
                    ocultarTeclado(edtEspecifiqueP22);
                    lytP20.requestFocus();
                    return true;
                }
                return false;
            }
        });

        edtEspecifiqueP20.setFilters(new InputFilter[]{new InputFilter.AllCaps(),new InputFilter.LengthFilter(200)});


        //pregunta 22
        for (int i = 0; i <radioGroups.length ; i++) {
            final int posicion = i;
            RadioGroup radioGroup = radioGroups[i];
            final EditText editText = editTexts[i];

            radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup radioGroup, @IdRes int i) {
                    if(i == R.id.mod2_p22_rbsi1 || i == R.id.mod2_p22_rbsi2 || i == R.id.mod2_p22_rbsi3 ||
                            i == R.id.mod2_p22_rbsi4 || i == R.id.mod2_p22_rbsi5 || i == R.id.mod2_p22_rbsi6){
                        editText.setEnabled(true);
                        editText.setBackgroundResource(R.drawable.fondo_edit_text);
                    }
                    if(i == R.id.mod2_p22_rbno1 || i == R.id.mod2_p22_rbno2 || i == R.id.mod2_p22_rbno3 ||
                            i == R.id.mod2_p22_rbno4 || i == R.id.mod2_p22_rbno5 || i == R.id.mod2_p22_rbno6){
                        editText.setText("");
                        editText.setBackgroundResource(R.drawable.caja_redonda_disabled);
                        editText.setEnabled(false);
                    }
                    if( i == R.id.mod2_p22_rbsi6 ){
                        edtEspecifiqueP22.setEnabled(true);
                        edtEspecifiqueP22.setBackgroundResource(R.drawable.fondo_edit_text);
                    }else if(i == R.id.mod2_p22_rbno6){
                        edtEspecifiqueP22.setText("");
                        edtEspecifiqueP22.setBackgroundResource(R.drawable.caja_redonda_disabled);
                        edtEspecifiqueP22.setEnabled(false);
                    }
                }
            });

            editText.setOnKeyListener(new View.OnKeyListener() {
                @Override
                public boolean onKey(View view, int keyCode, KeyEvent keyEvent) {
                    if ((keyEvent.getAction() == KeyEvent.ACTION_DOWN) &&
                            (keyCode == KeyEvent.KEYCODE_ENTER)) {
                        ocultarTeclado(editText);
                        lytP22.requestFocus();
                        return true;
                    }
                    return false;
                }
            });
        }


        edtEspecifiqueP22.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View view, int keyCode, KeyEvent keyEvent) {
                if ((keyEvent.getAction() == KeyEvent.ACTION_DOWN) &&
                        (keyCode == KeyEvent.KEYCODE_ENTER)) {
                    ocultarTeclado(edtEspecifiqueP22);
                    lytP22.requestFocus();
                    return true;
                }
                return false;
            }
        });

        final CheckBox[] checkBoxes4 = {ck1P20,ck2P20,ck3P20,ck4P20,ck5P20,ck6P20,ck7P20,ck8P20};
        final Spinner[] spinners2 = {sp1P20,sp2P20,sp3P20,sp4P20,sp5P20,sp6P20,sp7P20,sp8P20};
        final LinearLayout[] linearLayouts2 = {lytSp1P20,lytSp2P20,lytSp3P20,lytSp4P20,lytSp5P20,lytSp6P20,lytSp7P20,lytSp8P20};
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

        edtEspecifiqueP22.setFilters(new InputFilter[]{new InputFilter.AllCaps(),new InputFilter.LengthFilter(200)});
        edt1P22.setTransformationMethod(new NumericKeyBoardTransformationMethod());
        edt2P22.setTransformationMethod(new NumericKeyBoardTransformationMethod());
        edt3P22.setTransformationMethod(new NumericKeyBoardTransformationMethod());
        edt4P22.setTransformationMethod(new NumericKeyBoardTransformationMethod());
        edt5P22.setTransformationMethod(new NumericKeyBoardTransformationMethod());
        edt6P22.setTransformationMethod(new NumericKeyBoardTransformationMethod());
        cargarDatos();

    }
    public void ocultarTeclado(View view){
        InputMethodManager mgr = (InputMethodManager) getActivity().getSystemService(Context.INPUT_METHOD_SERVICE);
        mgr.hideSoftInputFromWindow(view.getWindowToken(), 0);
    }

    public void deshabilitarSpinners(Spinner[] spinners, CheckBox[] checkBoxes,LinearLayout[] linearLayouts){
        int suma = 0;
        for (int i = 0; i <spinners.length ; i++) {
            suma = suma + spinners[i].getSelectedItemPosition();
        }
        if(suma == 6){
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
        if(suma == 6) correcto = true;
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

    public void cargarDatos(){
        data = new Data(context);
        data.open();
        modulo2 = data.getModulo2(idempresa);
        if(modulo2.getC2_P20_1_1().equals("1")){ck1P20.setChecked(true);sp1P20.setSelection(Integer.parseInt(modulo2.getC2_P20_2_1()));
        }else ck1P20.setChecked(false);
        if(modulo2.getC2_P20_1_2().equals("1")){ck2P20.setChecked(true);sp2P20.setSelection(Integer.parseInt(modulo2.getC2_P20_2_2()));
        }else ck2P20.setChecked(false);
        if(modulo2.getC2_P20_1_3().equals("1")){ck3P20.setChecked(true);sp3P20.setSelection(Integer.parseInt(modulo2.getC2_P20_2_3()));
        }else ck3P20.setChecked(false);
        if(modulo2.getC2_P20_1_4().equals("1")){ck4P20.setChecked(true);sp4P20.setSelection(Integer.parseInt(modulo2.getC2_P20_2_4()));
        }else ck4P20.setChecked(false);
        if(modulo2.getC2_P20_1_5().equals("1")){ck5P20.setChecked(true);sp5P20.setSelection(Integer.parseInt(modulo2.getC2_P20_2_5()));
        }else ck5P20.setChecked(false);
        if(modulo2.getC2_P20_1_6().equals("1")){ck6P20.setChecked(true);sp6P20.setSelection(Integer.parseInt(modulo2.getC2_P20_2_6()));
        }else ck6P20.setChecked(false);
        if(modulo2.getC2_P20_1_7().equals("1")){ck7P20.setChecked(true);sp7P20.setSelection(Integer.parseInt(modulo2.getC2_P20_2_7()));
        }else ck7P20.setChecked(false);
        if(modulo2.getC2_P20_1_8().equals("1")){ck8P20.setChecked(true);sp8P20.setSelection(Integer.parseInt(modulo2.getC2_P20_2_8()));edtEspecifiqueP20.setText(modulo2.getC2_P20_1_8_0());
        }else ck8P20.setChecked(false);
        if(!modulo2.getC2_P21().equals("") && !modulo2.getC2_P21().equals("-1")){
            ((RadioButton)rgP21.getChildAt(Integer.parseInt(modulo2.getC2_P21()))).setChecked(true);
        }

        if(!modulo2.getC2_P22_1_1().equals("") && !modulo2.getC2_P22_1_1().equals("-1")){
            ((RadioButton)rg1P22.getChildAt(Integer.parseInt(modulo2.getC2_P22_1_1()))).setChecked(true);
        }
        if(!modulo2.getC2_P22_1_2().equals("") && !modulo2.getC2_P22_1_2().equals("-1")){
            ((RadioButton)rg2P22.getChildAt(Integer.parseInt(modulo2.getC2_P22_1_2()))).setChecked(true);
        }
        if(!modulo2.getC2_P22_1_3().equals("") && !modulo2.getC2_P22_1_3().equals("-1")){
            ((RadioButton)rg3P22.getChildAt(Integer.parseInt(modulo2.getC2_P22_1_3()))).setChecked(true);
        }
        if(!modulo2.getC2_P22_1_4().equals("") && !modulo2.getC2_P22_1_4().equals("-1")){
            ((RadioButton)rg4P22.getChildAt(Integer.parseInt(modulo2.getC2_P22_1_4()))).setChecked(true);
        }
        if(!modulo2.getC2_P22_1_5().equals("") && !modulo2.getC2_P22_1_5().equals("-1")){
            ((RadioButton)rg5P22.getChildAt(Integer.parseInt(modulo2.getC2_P22_1_5()))).setChecked(true);
        }
        if(!modulo2.getC2_P22_1_6().equals("") && !modulo2.getC2_P22_1_6().equals("-1")){
            ((RadioButton)rg6P22.getChildAt(Integer.parseInt(modulo2.getC2_P22_1_6()))).setChecked(true);
        }
        edt1P22.setText(modulo2.getC2_P22_2_1());
        edt2P22.setText(modulo2.getC2_P22_2_2());
        edt3P22.setText(modulo2.getC2_P22_2_3());
        edt4P22.setText(modulo2.getC2_P22_2_4());
        edt5P22.setText(modulo2.getC2_P22_2_5());
        edt6P22.setText(modulo2.getC2_P22_2_6());
        edtEspecifiqueP22.setText(modulo2.getC2_P22_1_6_0());
        data.close();
    }
    public void llenarMapaVariables(){
        if(ck1P20.isChecked())C2_P20_1_1 = 1;else C2_P20_1_1 = 0;
        if(ck2P20.isChecked())C2_P20_1_2 = 1;else C2_P20_1_2 = 0;
        if(ck3P20.isChecked())C2_P20_1_3 = 1;else C2_P20_1_3 = 0;
        if(ck4P20.isChecked())C2_P20_1_4 = 1;else C2_P20_1_4 = 0;
        if(ck5P20.isChecked())C2_P20_1_5 = 1;else C2_P20_1_5 = 0;
        if(ck6P20.isChecked())C2_P20_1_6 = 1;else C2_P20_1_6 = 0;
        if(ck7P20.isChecked())C2_P20_1_7 = 1;else C2_P20_1_7 = 0;
        if(ck8P20.isChecked())C2_P20_1_8 = 1;else C2_P20_1_8 = 0;
        C2_P20_2_1 = sp1P20.getSelectedItemPosition();
        C2_P20_2_2 = sp2P20.getSelectedItemPosition();
        C2_P20_2_3 = sp3P20.getSelectedItemPosition();
        C2_P20_2_4 = sp4P20.getSelectedItemPosition();
        C2_P20_2_5 = sp5P20.getSelectedItemPosition();
        C2_P20_2_6 = sp6P20.getSelectedItemPosition();
        C2_P20_2_7 = sp7P20.getSelectedItemPosition();
        C2_P20_2_8 = sp8P20.getSelectedItemPosition();
        C2_P20_1_8_0 = edtEspecifiqueP20.getText().toString();

        C2_P21 = rgP21.indexOfChild(rgP21.findViewById(rgP21.getCheckedRadioButtonId()));

        C2_P22_1_1 = rg1P22.indexOfChild(rg1P22.findViewById(rg1P22.getCheckedRadioButtonId()));
        C2_P22_1_2 = rg2P22.indexOfChild(rg2P22.findViewById(rg2P22.getCheckedRadioButtonId()));
        C2_P22_1_3 = rg3P22.indexOfChild(rg3P22.findViewById(rg3P22.getCheckedRadioButtonId()));
        C2_P22_1_4 = rg4P22.indexOfChild(rg4P22.findViewById(rg4P22.getCheckedRadioButtonId()));
        C2_P22_1_5 = rg5P22.indexOfChild(rg5P22.findViewById(rg5P22.getCheckedRadioButtonId()));
        C2_P22_1_6 = rg6P22.indexOfChild(rg6P22.findViewById(rg6P22.getCheckedRadioButtonId()));

        C2_P22_1_6_0 =edtEspecifiqueP22.getText().toString();

        C2_P22_2_1 = edt1P22.getText().toString();
        C2_P22_2_2 = edt2P22.getText().toString();
        C2_P22_2_3 = edt3P22.getText().toString();
        C2_P22_2_4 = edt4P22.getText().toString();
        C2_P22_2_5 = edt5P22.getText().toString();
        C2_P22_2_6 = edt6P22.getText().toString();
    }
    public void guardarDatos(){
        data = new Data(context);
        data.open();
        ContentValues contentValues = new ContentValues(163);
        contentValues.put(SQLConstantes.MODULO2_P20_1_1,C2_P20_1_1 + "");
        contentValues.put(SQLConstantes.MODULO2_P20_1_2,C2_P20_1_2 + "");
        contentValues.put(SQLConstantes.MODULO2_P20_1_3,C2_P20_1_3 + "");
        contentValues.put(SQLConstantes.MODULO2_P20_1_4,C2_P20_1_4 + "");
        contentValues.put(SQLConstantes.MODULO2_P20_1_5,C2_P20_1_5 + "");
        contentValues.put(SQLConstantes.MODULO2_P20_1_6,C2_P20_1_6 + "");
        contentValues.put(SQLConstantes.MODULO2_P20_1_7,C2_P20_1_7 + "");
        contentValues.put(SQLConstantes.MODULO2_P20_1_8,C2_P20_1_8 + "");
        contentValues.put(SQLConstantes.MODULO2_P20_1_8_0,C2_P20_1_8_0);
        contentValues.put(SQLConstantes.MODULO2_P20_2_1,C2_P20_2_1 + "");
        contentValues.put(SQLConstantes.MODULO2_P20_2_2,C2_P20_2_2 + "");
        contentValues.put(SQLConstantes.MODULO2_P20_2_3,C2_P20_2_3 + "");
        contentValues.put(SQLConstantes.MODULO2_P20_2_4,C2_P20_2_4 + "");
        contentValues.put(SQLConstantes.MODULO2_P20_2_5,C2_P20_2_5 + "");
        contentValues.put(SQLConstantes.MODULO2_P20_2_6,C2_P20_2_6 + "");
        contentValues.put(SQLConstantes.MODULO2_P20_2_7,C2_P20_2_7 + "");
        contentValues.put(SQLConstantes.MODULO2_P20_2_8,C2_P20_2_8 + "");
        contentValues.put(SQLConstantes.MODULO2_P21,C2_P21 + "");
        contentValues.put(SQLConstantes.MODULO2_P22_1_1,C2_P22_1_1 + "");
        contentValues.put(SQLConstantes.MODULO2_P22_1_2,C2_P22_1_2 + "");
        contentValues.put(SQLConstantes.MODULO2_P22_1_3,C2_P22_1_3 + "");
        contentValues.put(SQLConstantes.MODULO2_P22_1_4,C2_P22_1_4 + "");
        contentValues.put(SQLConstantes.MODULO2_P22_1_5,C2_P22_1_5 + "");
        contentValues.put(SQLConstantes.MODULO2_P22_1_6,C2_P22_1_6 + "");
        contentValues.put(SQLConstantes.MODULO2_P22_1_6_0,C2_P22_1_6_0);
        contentValues.put(SQLConstantes.MODULO2_P22_2_1,C2_P22_2_1);
        contentValues.put(SQLConstantes.MODULO2_P22_2_2,C2_P22_2_2);
        contentValues.put(SQLConstantes.MODULO2_P22_2_3,C2_P22_2_3);
        contentValues.put(SQLConstantes.MODULO2_P22_2_4,C2_P22_2_4);
        contentValues.put(SQLConstantes.MODULO2_P22_2_5,C2_P22_2_5);
        contentValues.put(SQLConstantes.MODULO2_P22_2_6,C2_P22_2_6);
        data.actualizarModulo2(idempresa,contentValues);
        data.close();
    }

    public boolean validar(){
        boolean valido = false;
        llenarMapaVariables();
        String mensaje = "";
        data =new Data(context);
        data.open();
        int C2_P11_1_6 = Integer.parseInt(data.getModulo2(idempresa).getC2_P11_1_6());
        int C2_P12_2 = 0;
        if(C2_P11_1_6 == 1){
            C2_P12_2 = Integer.parseInt(data.getModulo2(idempresa).getC2_P12_2());
        }
        data.close();
        boolean vC2_P20_1_1=false,
        vC2_P20_1_2=false,
        vC2_P20_1_3=false,
        vC2_P20_1_4=false,
        vC2_P20_1_5=false,
        vC2_P20_1_6=false,
        vC2_P20_1_7=false,
        vC2_P20_1_8=false,
        vC2_P20_1_8_0=false,
        vC2_P20_2_1=false,
        vC2_P20_2_2=false,
        vC2_P20_2_3=false,
        vC2_P20_2_4=false,
        vC2_P20_2_5=false,
        vC2_P20_2_6=false,
        vC2_P20_2_7=false,
        vC2_P20_2_8=false,
        vC2_P21=false,
        vC2_P22_1_1=false,
        vC2_P22_1_2=false,
        vC2_P22_1_3=false,
        vC2_P22_1_4=false,
        vC2_P22_1_5=false,
        vC2_P22_1_6=false,
        vC2_P22_1_6_0=false,
        vC2_P22_2_1=false,
        vC2_P22_2_2=false,
        vC2_P22_2_3=false,
        vC2_P22_2_4=false,
        vC2_P22_2_5=false,
        vC2_P22_2_6=false,
        vsumaPorcentaje = false,
        validacionAdicional = true;

        if(C2_P20_1_1 == 1 ||C2_P20_1_2 == 1 ||C2_P20_1_3 == 1 ||C2_P20_1_4 == 1 ||C2_P20_1_5 == 1 ||C2_P20_1_6 == 1 ||C2_P20_1_7 == 1||C2_P20_1_8 == 1) {
            vC2_P20_1_1 = true;vC2_P20_1_2 = true;vC2_P20_1_3 = true;
            vC2_P20_1_4 = true;vC2_P20_1_5 = true;vC2_P20_1_6 = true;
            vC2_P20_1_7 = true;vC2_P20_1_8 = true;
        }else if(mensaje.equals(""))mensaje = "PREGUNTA 20: DEBE SELECCIONAR ALGUNA OPCION";
        if(edtEspecifiqueP20.isEnabled()){
            if(C2_P20_1_8_0.trim().length() != 0) vC2_P20_1_8_0 = true;
            else if(mensaje.equals(""))mensaje = "PREGUNTA 20: DEBE ESPECIFICAR SI SELECCIONA OTRO";
        }else vC2_P20_1_8_0=true;

        int opcSeleccionadas = C2_P20_1_1 + C2_P20_1_2 + C2_P20_1_3 + C2_P20_1_4 + C2_P20_1_5 + C2_P20_1_6 + C2_P20_1_7+ C2_P20_1_8;
        int ordenSeleccionado = C2_P20_2_1 + C2_P20_2_2 + C2_P20_2_3 + C2_P20_2_4 + C2_P20_2_5 + C2_P20_2_6 + C2_P20_2_7+ C2_P20_2_8;
        if(opcSeleccionadas == 1){
            if(ordenSeleccionado == 1){
                vC2_P20_2_1=true;vC2_P20_2_2=true;vC2_P20_2_3=true;vC2_P20_2_4=true;vC2_P20_2_5=true;vC2_P20_2_6=true;vC2_P20_2_7=true;vC2_P20_2_8=true;
            }else if(mensaje.equals(""))mensaje = "PREGUNTA 20: SI SELECCIONO SOLO UNA OPCION, DEBE ASIGNAR 1 PARA EL ORDEN DE IMPORTANCIA DE LA RAZON";
        }else if(opcSeleccionadas == 2){
            if(ordenSeleccionado == 3){
                vC2_P20_2_1=true;vC2_P20_2_2=true;vC2_P20_2_3=true;vC2_P20_2_4=true;vC2_P20_2_5=true;vC2_P20_2_6=true;vC2_P20_2_7=true;vC2_P20_2_8=true;
            }else if(mensaje.equals(""))mensaje = "PREGUNTA 20: SI SELECCIONO SOLO 2 OPCIONES, DEBE ASIGNAR 1 Y 2 PARA EL ORDEN DE IMPORTANCIA DE LAS RAZONES";
        }else{
            if(ordenSeleccionado == 6){
                vC2_P20_2_1=true;vC2_P20_2_2=true;vC2_P20_2_3=true;vC2_P20_2_4=true;vC2_P20_2_5=true;vC2_P20_2_6=true;vC2_P20_2_7=true;vC2_P20_2_8=true;
            }else if(mensaje.equals(""))mensaje = "PREGUNTA 20: DEBE ELEGIR 1, 2 O 3 SEGUN EL ORDEN DE IMPORTANCIA";
        }

        if(C2_P21 != -1) vC2_P21 = true;
        else if(mensaje.equals(""))mensaje = "PREGUNTA 21: DEBE ELEGIR UNA OPCION";

        if(C2_P21 == 1){
            if(C2_P11_1_6 == 1 && C2_P12_2 == 1){
                validacionAdicional = false;
                if(mensaje.equals(""))mensaje = "PREGUNTA 21: CONOCE LA REINCORPORACION DE TRABAJADORES " +
                        "POR FALLAS DEL TRIBUNAL CONSTITUCIONAL PERO NO LO CONSIDERA COMO UNA RAZON DE " +
                        "QUE ES COSTOSO TERMINAR UN CONTRATO PERMANENTE";
            }
        }

        if(C2_P22_1_1 != -1) vC2_P22_1_1 = true;
        else if(mensaje.equals(""))mensaje = "PREGUNTA 22: DEBE MARCAR SI O NO PARA TODAS LAS OPCIONES";
        if(C2_P22_1_2 != -1) vC2_P22_1_2 = true;
        else if(mensaje.equals(""))mensaje = "PREGUNTA 22: DEBE MARCAR SI O NO PARA TODAS LAS OPCIONES";
        if(C2_P22_1_3 != -1) vC2_P22_1_3 = true;
        else if(mensaje.equals(""))mensaje = "PREGUNTA 22: DEBE MARCAR SI O NO PARA TODAS LAS OPCIONES";
        if(C2_P22_1_4 != -1) vC2_P22_1_4 = true;
        else if(mensaje.equals(""))mensaje = "PREGUNTA 22: DEBE MARCAR SI O NO PARA TODAS LAS OPCIONES";
        if(C2_P22_1_5 != -1) vC2_P22_1_5 = true;
        else if(mensaje.equals(""))mensaje = "PREGUNTA 22: DEBE MARCAR SI O NO PARA TODAS LAS OPCIONES";
        if(C2_P22_1_6 != -1) vC2_P22_1_6 = true;
        else if(mensaje.equals(""))mensaje = "PREGUNTA 22: DEBE MARCAR SI O NO PARA TODAS LAS OPCIONES";

        if(edtEspecifiqueP22.isEnabled()){
            if(C2_P22_1_6_0.trim().length() != 0) vC2_P22_1_6_0 = true;
            else if(mensaje.equals(""))mensaje = "PREGUNTA 22: DEBE ESPECIFICAR SI MARCA OTRO";
        }else vC2_P22_1_6_0=true;

        if(edt1P22.isEnabled()){
            if(C2_P22_2_1.trim().length() != 0){
                if(Integer.parseInt(C2_P22_2_1) <= 100){
                    vC2_P22_2_1 = true;
                }else if(mensaje.equals(""))mensaje = "PREGUNTA 22: EL PORCENTAJE NO PUEDE EXCEDER AL 100%";
            }else if(mensaje.equals(""))mensaje = "PREGUNTA 22: DEBE ESPECIFICAR PARA QUE PORCENTAJE DE SUS TRABAJADORES";
        }else vC2_P22_2_1=true;
        if(edt2P22.isEnabled()){
            if(C2_P22_2_2.trim().length() != 0){
                if(Integer.parseInt(C2_P22_2_2) <= 100){
                    vC2_P22_2_2 = true;
                }else if(mensaje.equals(""))mensaje = "PREGUNTA 22: EL PORCENTAJE NO PUEDE EXCEDER AL 100%";
            }else if(mensaje.equals(""))mensaje = "PREGUNTA 22: DEBE ESPECIFICAR PARA QUE PORCENTAJE DE SUS TRABAJADORES";
        }else vC2_P22_2_2=true;
        if(edt3P22.isEnabled()){
            if(C2_P22_2_3.trim().length() != 0){
                if(Integer.parseInt(C2_P22_2_3) <= 100){
                    vC2_P22_2_3 = true;
                }else if(mensaje.equals(""))mensaje = "PREGUNTA 22: EL PORCENTAJE NO PUEDE EXCEDER AL 100%";
            }else if(mensaje.equals(""))mensaje = "PREGUNTA 22: DEBE ESPECIFICAR PARA QUE PORCENTAJE DE SUS TRABAJADORES";
        }else vC2_P22_2_3=true;
        if(edt4P22.isEnabled()){
            if(C2_P22_2_4.trim().length() != 0){
                if(Integer.parseInt(C2_P22_2_4) <= 100){
                    vC2_P22_2_4= true;
                }else if(mensaje.equals(""))mensaje = "PREGUNTA 22: EL PORCENTAJE NO PUEDE EXCEDER AL 100%";
            }else if(mensaje.equals(""))mensaje = "PREGUNTA 22: DEBE ESPECIFICAR PARA QUE PORCENTAJE DE SUS TRABAJADORES";
        }else vC2_P22_2_4=true;
        if(edt5P22.isEnabled()){
            if(C2_P22_2_5.trim().length() != 0){
                if(Integer.parseInt(C2_P22_2_5) <= 100){
                    vC2_P22_2_5 = true;
                }else if(mensaje.equals(""))mensaje = "PREGUNTA 22: EL PORCENTAJE NO PUEDE EXCEDER AL 100%";
            }else if(mensaje.equals(""))mensaje = "PREGUNTA 22: DEBE ESPECIFICAR PARA QUE PORCENTAJE DE SUS TRABAJADORES";
        }else vC2_P22_2_5=true;
        if(edt6P22.isEnabled()){
            if(C2_P22_2_6.trim().length() != 0){
                if(Integer.parseInt(C2_P22_2_6) <= 100){
                    vC2_P22_2_6 = true;
                }else if(mensaje.equals(""))mensaje = "PREGUNTA 22: EL PORCENTAJE NO PUEDE EXCEDER AL 100%";
            }else if(mensaje.equals(""))mensaje = "PREGUNTA 22: DEBE ESPECIFICAR PARA QUE PORCENTAJE DE SUS TRABAJADORES";
        }else vC2_P22_2_6=true;

        valido = vC2_P20_1_1 &&
                vC2_P20_1_2 &&
                vC2_P20_1_3 &&
                vC2_P20_1_4 &&
                vC2_P20_1_5 &&
                vC2_P20_1_6 &&
                vC2_P20_1_7 &&
                vC2_P20_1_8 &&
                vC2_P20_1_8_0 &&
                vC2_P20_2_1 &&
                vC2_P20_2_2 &&
                vC2_P20_2_3 &&
                vC2_P20_2_4 &&
                vC2_P20_2_5 &&
                vC2_P20_2_6 &&
                vC2_P20_2_7 &&
                vC2_P20_2_8 &&
                vC2_P21 &&
                vC2_P22_1_1 &&
                vC2_P22_1_2 &&
                vC2_P22_1_3 &&
                vC2_P22_1_4 &&
                vC2_P22_1_5 &&
                vC2_P22_1_6 &&
                vC2_P22_1_6_0 &&
                vC2_P22_2_1 &&
                vC2_P22_2_2 &&
                vC2_P22_2_3 &&
                vC2_P22_2_4 &&
                vC2_P22_2_5 &&
                vC2_P22_2_6 &&
                //vsumaPorcentaje &&
                validacionAdicional;

        if(!valido) {
            mostrarMensaje(mensaje);
            Log.e("vC2_P20_1_1:",vC2_P20_1_1 + "");
            Log.e("vC2_P20_1_2:",vC2_P20_1_2 + "");
            Log.e("vC2_P20_1_3:",vC2_P20_1_3 + "");
            Log.e("vC2_P20_1_4:",vC2_P20_1_4 + "");
            Log.e("vC2_P20_1_5:",vC2_P20_1_5 + "");
            Log.e("vC2_P20_1_6:",vC2_P20_1_6 + "");
            Log.e("vC2_P20_1_7:",vC2_P20_1_7 + "");
            Log.e("vC2_P20_1_8:",vC2_P20_1_8 + "");
            Log.e("vC2_P20_1_8_0:",vC2_P20_1_8_0 + "");
            Log.e("vC2_P20_2_1:",vC2_P20_2_1 + "");
            Log.e("vC2_P20_2_2:",vC2_P20_2_2 + "");
            Log.e("vC2_P20_2_3:",vC2_P20_2_3 + "");
            Log.e("vC2_P20_2_4:",vC2_P20_2_4 + "");
            Log.e("vC2_P20_2_5:",vC2_P20_2_5 + "");
            Log.e("vC2_P20_2_6:",vC2_P20_2_6 + "");
            Log.e("vC2_P20_2_7:",vC2_P20_2_7 + "");
            Log.e("vC2_P20_2_8:",vC2_P20_2_8 + "");
            Log.e("vC2_P21:",vC2_P21 + "");
            Log.e("vC2_P22_1_1:",vC2_P22_1_1 + "");
            Log.e("vC2_P22_1_2:",vC2_P22_1_2 + "");
            Log.e("vC2_P22_1_3:",vC2_P22_1_3 + "");
            Log.e("vC2_P22_1_4:",vC2_P22_1_4 + "");
            Log.e("vC2_P22_1_5:",vC2_P22_1_5 + "");
            Log.e("vC2_P22_1_6:",vC2_P22_1_6 + "");
            Log.e("vC2_P22_1_6_0:",vC2_P22_1_6_0 + "");
            Log.e("vC2_P22_2_1:",vC2_P22_2_1 + "");
            Log.e("vC2_P22_2_2:",vC2_P22_2_2 + "");
            Log.e("vC2_P22_2_3:",vC2_P22_2_3 + "");
            Log.e("vC2_P22_2_4:",vC2_P22_2_4 + "");
            Log.e("vC2_P22_2_5:",vC2_P22_2_5 + "");
            Log.e("vC2_P22_2_6:",vC2_P22_2_6 + "");
        }
        return valido;
    }
    public void mostrarToast(String mensaje){
        int toastDurationInMilliSeconds = 6000;
        mToastToShow = Toast.makeText(context, mensaje, Toast.LENGTH_LONG);
        CountDownTimer toastCountDown;
        toastCountDown = new CountDownTimer(toastDurationInMilliSeconds, 1000) {
            public void onTick(long millisUntilFinished) {
                mToastToShow.show();
            }
            public void onFinish() {
                mToastToShow.cancel();
            }
        };
        mToastToShow.show();
        toastCountDown.start();
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
