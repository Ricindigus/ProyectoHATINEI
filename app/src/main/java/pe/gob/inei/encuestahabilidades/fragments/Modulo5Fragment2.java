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
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
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
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import pe.gob.inei.encuestahabilidades.NumericKeyBoardTransformationMethod;
import pe.gob.inei.encuestahabilidades.R;
import pe.gob.inei.encuestahabilidades.modelo.Data;
import pe.gob.inei.encuestahabilidades.modelo.SQLConstantes;
import pe.gob.inei.encuestahabilidades.pojos.Modulo2;
import pe.gob.inei.encuestahabilidades.pojos.Modulo5;

/**
 * A simple {@link Fragment} subclass.
 */
public class Modulo5Fragment2 extends Fragment {
    private LinearLayout lytP2;
    private LinearLayout lytSP2;
    private LinearLayout lytSp2;
    private LinearLayout lytSp3;
    private LinearLayout lytSp4;
    private LinearLayout lytSp5;
    private LinearLayout lytSp6;
    private LinearLayout lytSp7;
    private LinearLayout lytSp8;
    private LinearLayout lytSp9;

    private CheckBox ckSP1;
    private CheckBox ckSp2;
    private CheckBox ckSp3;
    private CheckBox ckSp4;
    private CheckBox ckSp5;
    private CheckBox ckSp6;
    private CheckBox ckSp7;
    private CheckBox ckSp8;
    private CheckBox ckSp9;

    private EditText edtSP1;
    private EditText edtSp2;
    private EditText edtSp3;
    private EditText edtSp4;
    private EditText edtSp5;
    private EditText edtSp6;
    private EditText edtSp7;
    private EditText edtSp8;
    private EditText edtSp9;

    private RadioGroup rgP2;
    private TextView txtTotalTrab;

    private RadioGroup rg1P2;
    private RadioGroup rg2P2;
    private RadioGroup rg3P2;
    private RadioGroup rg4P2;
    private RadioGroup rg5P2;
    private RadioGroup rg6P2;
    private RadioGroup rg7P2;
    private RadioGroup rg8P2;
    private RadioGroup rg9P2;


    //CARGADO Y GUARDADO
    private String idempresa;
    private Modulo5 modulo5;
    private Modulo2 modulo2;
    private Context context;
    private Data data;
    private TextView txtP2Total;
    //mapeo de variables
    int C2_P7;
    int C5_P2;
    int C5_P2_0_1;
    int C5_P2_0_2;
    int C5_P2_0_3;
    int C5_P2_0_4;
    int C5_P2_0_5;
    int C5_P2_0_6;
    int C5_P2_0_7;
    int C5_P2_0_8;
    int C5_P2_0_9;
    int C5_P2_1_1;
    int C5_P2_1_2;
    int C5_P2_1_3;
    int C5_P2_1_4;
    int C5_P2_1_5;
    int C5_P2_1_6;
    int C5_P2_1_7;
    int C5_P2_1_8;
    int C5_P2_1_9;
    String C5_P2_2_1;
    String C5_P2_2_2;
    String C5_P2_2_3;
    String C5_P2_2_4;
    String C5_P2_2_5;
    String C5_P2_2_6;
    String C5_P2_2_7;
    String C5_P2_2_8;
    String C5_P2_2_9;
    String C5_P2_2_10;



    public Modulo5Fragment2() {
        // Required empty public constructor
    }

    @SuppressLint("ValidFragment")
    public Modulo5Fragment2(String idempresa, Context context) {
        this.idempresa = idempresa;
        this.context = context;
        data = new Data(context);
        data.open();
        modulo2 =data.getModulo2(idempresa);
        if (!modulo2.getC2_P7().equals("")) {
            C2_P7=Integer.parseInt(modulo2.getC2_P7());
        }

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_modulo5_fragment2, container, false);
        lytP2 = (LinearLayout) rootView.findViewById(R.id.mod5_p2_lyt);

        lytSP2 = (LinearLayout) rootView.findViewById(R.id.mod5_p2_lytSp1);
        lytSp2 = (LinearLayout) rootView.findViewById(R.id.mod5_p2_lytSp2);
        lytSp3 = (LinearLayout) rootView.findViewById(R.id.mod5_p2_lytSp3);
        lytSp4 = (LinearLayout) rootView.findViewById(R.id.mod5_p2_lytSp4);
        lytSp5 = (LinearLayout) rootView.findViewById(R.id.mod5_p2_lytSp5);
        lytSp6 = (LinearLayout) rootView.findViewById(R.id.mod5_p2_lytSp6);
        lytSp7 = (LinearLayout) rootView.findViewById(R.id.mod5_p2_lytSp7);
        lytSp8 = (LinearLayout) rootView.findViewById(R.id.mod5_p2_lytSp8);
        lytSp9 = (LinearLayout) rootView.findViewById(R.id.mod5_p2_lytSp9);

        ckSP1 = (CheckBox) rootView.findViewById(R.id.mod5_p2_ck1);
        ckSp2 = (CheckBox) rootView.findViewById(R.id.mod5_p2_ck2);
        ckSp3 = (CheckBox) rootView.findViewById(R.id.mod5_p2_ck3);
        ckSp4 = (CheckBox) rootView.findViewById(R.id.mod5_p2_ck4);
        ckSp5 = (CheckBox) rootView.findViewById(R.id.mod5_p2_ck5);
        ckSp6 = (CheckBox) rootView.findViewById(R.id.mod5_p2_ck6);
        ckSp7 = (CheckBox) rootView.findViewById(R.id.mod5_p2_ck7);
        ckSp8 = (CheckBox) rootView.findViewById(R.id.mod5_p2_ck8);
        ckSp9 = (CheckBox) rootView.findViewById(R.id.mod5_p2_ck9);

        edtSP1 = (EditText) rootView.findViewById(R.id.mod5_p2_edt1);
        edtSp2 = (EditText) rootView.findViewById(R.id.mod5_p2_edt2);
        edtSp3 = (EditText) rootView.findViewById(R.id.mod5_p2_edt3);
        edtSp4 = (EditText) rootView.findViewById(R.id.mod5_p2_edt4);
        edtSp5 = (EditText) rootView.findViewById(R.id.mod5_p2_edt5);
        edtSp6 = (EditText) rootView.findViewById(R.id.mod5_p2_edt6);
        edtSp7 = (EditText) rootView.findViewById(R.id.mod5_p2_edt7);
        edtSp8 = (EditText) rootView.findViewById(R.id.mod5_p2_edt8);
        edtSp9 = (EditText) rootView.findViewById(R.id.mod5_p2_edt9);

        rgP2 = (RadioGroup) rootView.findViewById(R.id.mod5_p2_rg);
        rg1P2 = (RadioGroup) rootView.findViewById(R.id.mod5_p2_rg1);
        rg2P2 = (RadioGroup) rootView.findViewById(R.id.mod5_p2_rg2);
        rg3P2 = (RadioGroup) rootView.findViewById(R.id.mod5_p2_rg3);
        rg4P2 = (RadioGroup) rootView.findViewById(R.id.mod5_p2_rg4);
        rg5P2 = (RadioGroup) rootView.findViewById(R.id.mod5_p2_rg5);
        rg6P2 = (RadioGroup) rootView.findViewById(R.id.mod5_p2_rg6);
        rg7P2 = (RadioGroup) rootView.findViewById(R.id.mod5_p2_rg7);
        rg8P2 = (RadioGroup) rootView.findViewById(R.id.mod5_p2_rg8);
        rg9P2 = (RadioGroup) rootView.findViewById(R.id.mod5_p2_rg9);

        txtTotalTrab = (TextView) rootView.findViewById(R.id.mod5_p2_totalTrab);


        txtP2Total = (TextView) rootView.findViewById(R.id.mod5_p2_txtTotal);
        return rootView;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        final CheckBox[] checkBoxes = {ckSP1,ckSp2,ckSp3,ckSp4,ckSp5,ckSp6,ckSp7,ckSp8,ckSp9};
        final EditText[] editTexts = {edtSP1,edtSp2,edtSp3,edtSp4,edtSp5,edtSp6,edtSp7,edtSp8,edtSp9};
        LinearLayout[]  linearLayouts = {lytSP2,lytSp2,lytSp3,lytSp4,lytSp5,lytSp6,lytSp7,lytSp8,lytSp9};
        RadioGroup[] radioGroups = {rg1P2,rg2P2,rg3P2,rg4P2,rg5P2,rg6P2,rg7P2,rg8P2,rg9P2};
        final int[] idSi = {R.id.mod5_p2_rb1Si,R.id.mod5_p2_rb2Si,R.id.mod5_p2_rb3Si,R.id.mod5_p2_rb4Si,
                R.id.mod5_p2_rb5Si,R.id.mod5_p2_rb6Si,R.id.mod5_p2_rb7Si,R.id.mod5_p2_rb8Si,R.id.mod5_p2_rb9Si};
        final int[] idNo = {R.id.mod5_p2_rb1No,R.id.mod5_p2_rb2No,R.id.mod5_p2_rb3No,R.id.mod5_p2_rb4No,
                R.id.mod5_p2_rb5No,R.id.mod5_p2_rb6No,R.id.mod5_p2_rb7No,R.id.mod5_p2_rb8No,R.id.mod5_p2_rb9No};

        rgP2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, @IdRes int i) {
                for (int j = 0; j < checkBoxes.length; j++) {
                    CheckBox checkBox = checkBoxes[j];
                    checkBox.setEnabled(true);
                }
                switch (i){
                    case R.id.mod5_p2_rb1:
                        for (int j = 0; j < editTexts.length; j++) {
                            EditText editText = editTexts[j];
                            editText.setText("");
                            editText.setHint("Ingrese número");
                            editText.setFilters(new InputFilter[]{new InputFilter.LengthFilter(5)});
                        }
                        txtP2Total.setText("0");
                        break;
//                    case R.id.mod5_p2_rb2:
//                        for (int j = 0; j < editTexts.length; j++) {
//                            EditText editText = editTexts[j];
//                            editText.setText("");
//                            editText.setHint("Ingrese porcentaje");
//                            editText.setFilters(new InputFilter[]{new InputFilter.LengthFilter(3)});
//                        }
//                        txtP2Total.setText("0");
//                        break;
                }
            }
        });
        for (int i = 0; i < checkBoxes.length; i++) {
            CheckBox checkBox = checkBoxes[i];
            final EditText editText = editTexts[i];
            final LinearLayout linearLayout = linearLayouts[i];
            final RadioGroup radioGroup = radioGroups[i];
            final int pos = i;

            checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                    if(b){
                        //editText.setEnabled(true);
                        //editText.setBackgroundResource(R.drawable.fondo_edit_text);
                        for(int j = 0; j < radioGroup.getChildCount(); j++){
                            ((RadioButton)radioGroup.getChildAt(j)).setEnabled(true);

                        }
                    }else{
                        radioGroup.clearCheck();
                        for(int k = 0; k < radioGroup.getChildCount(); k++){
                            ((RadioButton)radioGroup.getChildAt(k)).setEnabled(false);
                        }
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
                        if(rgP2.indexOfChild(rgP2.findViewById(rgP2.getCheckedRadioButtonId()))==0){
                            txtP2Total.setText((Integer.parseInt(txtP2Total.getText().toString()) - Integer.parseInt(charSequence.toString()))+"");
                        }else{
                            int porcentaje=Integer.parseInt(charSequence.toString());
                            int subTotal = C2_P7*porcentaje/100;
                            txtP2Total.setText((Integer.parseInt(txtP2Total.getText().toString()) - subTotal)+"");
                        }
                      //txtP2Total.setText((Integer.parseInt(txtP2Total.getText().toString()) - Integer.parseInt(charSequence.toString()))+"");
                    }
                }

                @Override
                public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                }

                @Override
                public void afterTextChanged(Editable editable) {
                    int despues = 0;
                    if(!editable.toString().equals("")) despues = Integer.parseInt(editable.toString());
                    if(!(Integer.parseInt(txtP2Total.getText().toString())== 0)){
                        if(rgP2.indexOfChild(rgP2.findViewById(rgP2.getCheckedRadioButtonId()))==0){
                            txtP2Total.setText((Integer.parseInt(txtP2Total.getText().toString()) + despues) +"");
                        }else{
                            int subTotal = C2_P7*despues/100;
                            txtP2Total.setText((Integer.parseInt(txtP2Total.getText().toString()) + subTotal)+"");
                        }
                    }else{
                        if(rgP2.indexOfChild(rgP2.findViewById(rgP2.getCheckedRadioButtonId()))==0){
                            txtP2Total.setText(despues+"");
                        }else{
                            int subTotal = C2_P7*despues/100;
                            txtP2Total.setText((Integer.parseInt(txtP2Total.getText().toString()) + subTotal)+"");
                        }
                    }




//                    int despues = 0;
//                    if(!editable.toString().equals("")) despues = Integer.parseInt(editable.toString());
//                    if(!(Integer.parseInt(txtP2Total.getText().toString())== 0)){
//                        txtP2Total.setText((Integer.parseInt(txtP2Total.getText().toString()) + despues) +"");
//                    }else{
//                        txtP2Total.setText(despues+"");
//                    }
                }
            });
            radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup radioGroup, @IdRes int i) {
                    if(i == idSi[pos]){
                        editText.setEnabled(true);
                        editText.setBackgroundResource(R.drawable.fondo_edit_text);
                    }
                    if(i == idNo[pos]){
                        editText.setText("");
                        editText.setBackgroundResource(R.drawable.fondo_edit_text_disabled);
                        editText.setEnabled(false);
                    }
                }
            });
        }
        cargarDatos();
    }

    public void ocultarTeclado(View view){
        InputMethodManager mgr = (InputMethodManager) getActivity().getSystemService(Context.INPUT_METHOD_SERVICE);
        mgr.hideSoftInputFromWindow(view.getWindowToken(), 0);
    }
    //GUARDADO Y CARGADO
    public void cargarDatos() {
        data = new Data(context);
        data.open();
        modulo5 = data.getModulo5(idempresa);
        Modulo2 modulo2 = data.getModulo2(idempresa);
        txtTotalTrab.setText("Total Trabajadores : " + modulo2.getC2_P7());
        //verifico si ya existe un objeto con datos llenados previamente
        if (data.existeModulo5(idempresa)) {
            //si existe traigo el objeto

            //saco los datos del objeto para llenarlos en los elementos del fragment
            //datos cabecera
            
            //pregunta 2
            if(!modulo5.getC5_P2().equals("") && (!modulo5.getC5_P2().equals("-1")))
            {int childPos2 = Integer.parseInt(modulo5.getC5_P2());
            ((RadioButton) rgP2.getChildAt(childPos2)).setChecked(true);}
            if (modulo5.getC5_P2_0_1().equals("1")) ckSP1.setChecked(true);
            if (modulo5.getC5_P2_0_1().equals("0")) ckSP1.setChecked(false);
            if (modulo5.getC5_P2_0_2().equals("1")) ckSp2.setChecked(true);
            if (modulo5.getC5_P2_0_2().equals("0")) ckSp2.setChecked(false);
            if (modulo5.getC5_P2_0_3().equals("1")) ckSp3.setChecked(true);
            if (modulo5.getC5_P2_0_3().equals("0")) ckSp3.setChecked(false);
            if (modulo5.getC5_P2_0_4().equals("1")) ckSp4.setChecked(true);
            if (modulo5.getC5_P2_0_4().equals("0")) ckSp4.setChecked(false);
            if (modulo5.getC5_P2_0_5().equals("1")) ckSp5.setChecked(true);
            if (modulo5.getC5_P2_0_5().equals("0")) ckSp5.setChecked(false);
            if (modulo5.getC5_P2_0_6().equals("1")) ckSp6.setChecked(true);
            if (modulo5.getC5_P2_0_6().equals("0")) ckSp6.setChecked(false);
            if (modulo5.getC5_P2_0_7().equals("1")) ckSp7.setChecked(true);
            if (modulo5.getC5_P2_0_7().equals("0")) ckSp7.setChecked(false);
            if (modulo5.getC5_P2_0_8().equals("1")) ckSp8.setChecked(true);
            if (modulo5.getC5_P2_0_8().equals("0")) ckSp8.setChecked(false);
            if (modulo5.getC5_P2_0_9().equals("1")) ckSp9.setChecked(true);
            if (modulo5.getC5_P2_0_9().equals("0")) ckSp9.setChecked(false);

            if(!modulo5.getC5_P2_1_1().equals("") && (!modulo5.getC5_P2_1_1().equals("-1")))
            {int childPos21 = Integer.parseInt(modulo5.getC5_P2_1_1());
            ((RadioButton) rg1P2.getChildAt(childPos21)).setChecked(true);}

            if(!modulo5.getC5_P2_1_2().equals("") && (!modulo5.getC5_P2_1_2().equals("-1")))
            {int childPos22 = Integer.parseInt(modulo5.getC5_P2_1_2());
            ((RadioButton) rg2P2.getChildAt(childPos22)).setChecked(true);}

            if(!modulo5.getC5_P2_1_3().equals("") && (!modulo5.getC5_P2_1_3().equals("-1")))
            {int childPos23 = Integer.parseInt(modulo5.getC5_P2_1_3());
            ((RadioButton) rg3P2.getChildAt(childPos23)).setChecked(true);}

            if(!modulo5.getC5_P2_1_4().equals("") && (!modulo5.getC5_P2_1_4().equals("-1")))
            {int childPos24 = Integer.parseInt(modulo5.getC5_P2_1_4());
            ((RadioButton) rg4P2.getChildAt(childPos24)).setChecked(true);}

            if(!modulo5.getC5_P2_1_5().equals("") && (!modulo5.getC5_P2_1_5().equals("-1")))
            {int childPos25 = Integer.parseInt(modulo5.getC5_P2_1_5());
            ((RadioButton) rg5P2.getChildAt(childPos25)).setChecked(true);}

            if(!modulo5.getC5_P2_1_6().equals("") && (!modulo5.getC5_P2_1_6().equals("-1")))
            {int childPos26 = Integer.parseInt(modulo5.getC5_P2_1_6());
            ((RadioButton) rg6P2.getChildAt(childPos26)).setChecked(true);}

            if(!modulo5.getC5_P2_1_7().equals("") && (!modulo5.getC5_P2_1_7().equals("-1")))
            {int childPos27 = Integer.parseInt(modulo5.getC5_P2_1_7());
            ((RadioButton) rg7P2.getChildAt(childPos27)).setChecked(true);}

            if(!modulo5.getC5_P2_1_8().equals("") && (!modulo5.getC5_P2_1_8().equals("-1")))
            {int childPos28 = Integer.parseInt(modulo5.getC5_P2_1_8());
            ((RadioButton) rg8P2.getChildAt(childPos28)).setChecked(true);}

            if(!modulo5.getC5_P2_1_9().equals("") && (!modulo5.getC5_P2_1_9().equals("-1")))
            {int childPos29 = Integer.parseInt(modulo5.getC5_P2_1_9());
            ((RadioButton) rg9P2.getChildAt(childPos29)).setChecked(true);}

            edtSP1.setText(modulo5.getC5_P2_2_1());
            edtSp2.setText(modulo5.getC5_P2_2_2());
            edtSp3.setText(modulo5.getC5_P2_2_3());
            edtSp4.setText(modulo5.getC5_P2_2_4());
            edtSp5.setText(modulo5.getC5_P2_2_5());
            edtSp6.setText(modulo5.getC5_P2_2_6());
            edtSp7.setText(modulo5.getC5_P2_2_7());
            edtSp8.setText(modulo5.getC5_P2_2_8());
            edtSp9.setText(modulo5.getC5_P2_2_9());


        }
        data.close();
    }

    public void llenarMapaVariables() {
        //preguntas cabecera

        //pregunta 2
        int childPosP3 = rgP2.indexOfChild(rgP2.findViewById(rgP2.getCheckedRadioButtonId()));
        C5_P2 = childPosP3;
        if (ckSP1.isChecked()) C5_P2_0_1 = 1;
        else C5_P2_0_1 = 0;
        if (ckSp2.isChecked()) C5_P2_0_2 = 1;
        else C5_P2_0_2 = 0;
        if (ckSp3.isChecked()) C5_P2_0_3 = 1;
        else C5_P2_0_3 = 0;
        if (ckSp4.isChecked()) C5_P2_0_4 = 1;
        else C5_P2_0_4 = 0;
        if (ckSp5.isChecked()) C5_P2_0_5 = 1;
        else C5_P2_0_5 = 0;
        if (ckSp6.isChecked()) C5_P2_0_6 = 1;
        else C5_P2_0_6 = 0;
        if (ckSp7.isChecked()) C5_P2_0_7 = 1;
        else C5_P2_0_7 = 0;
        if (ckSp8.isChecked()) C5_P2_0_8 = 1;
        else C5_P2_0_8 = 0;
        if (ckSp9.isChecked()) C5_P2_0_9 = 1;
        else C5_P2_0_9 = 0;
        int childPosP21 = rg1P2.indexOfChild(rg1P2.findViewById(rg1P2.getCheckedRadioButtonId()));
        C5_P2_1_1 = childPosP21;
        int childPosP22 = rg2P2.indexOfChild(rg2P2.findViewById(rg2P2.getCheckedRadioButtonId()));
        C5_P2_1_2 = childPosP22;
        int childPosP23 = rg3P2.indexOfChild(rg3P2.findViewById(rg3P2.getCheckedRadioButtonId()));
        C5_P2_1_3 = childPosP23;
        int childPosP24 = rg4P2.indexOfChild(rg4P2.findViewById(rg4P2.getCheckedRadioButtonId()));
        C5_P2_1_4 = childPosP24;
        int childPosP25 = rg5P2.indexOfChild(rg5P2.findViewById(rg5P2.getCheckedRadioButtonId()));
        C5_P2_1_5 = childPosP25;
        int childPosP26 = rg6P2.indexOfChild(rg6P2.findViewById(rg6P2.getCheckedRadioButtonId()));
        C5_P2_1_6 = childPosP26;
        int childPosP27 = rg7P2.indexOfChild(rg7P2.findViewById(rg7P2.getCheckedRadioButtonId()));
        C5_P2_1_7 = childPosP27;
        int childPosP28 = rg8P2.indexOfChild(rg8P2.findViewById(rg8P2.getCheckedRadioButtonId()));
        C5_P2_1_8 = childPosP28;
        int childPosP29 = rg9P2.indexOfChild(rg9P2.findViewById(rg9P2.getCheckedRadioButtonId()));
        C5_P2_1_9 = childPosP29;
//        C5_P2_2_1 = edtSP2.getText().toString();
//        C5_P2_2_2 = edtSp2.getText().toString();
//        C5_P2_2_3 = edtSp3.getText().toString();
//        C5_P2_2_4 = edtSp4.getText().toString();
//        C5_P2_2_5 = edtSp5.getText().toString();
//        C5_P2_2_6 = edtSp6.getText().toString();
//        C5_P2_2_7 = edtSp7.getText().toString();
//        C5_P2_2_8 = edtSp8.getText().toString();
//        C5_P2_2_9 = edtSp9.getText().toString();
        C5_P2_2_10 = txtP2Total.getText().toString();
        if(edtSP1.getText().toString().equals("")){
            C5_P2_2_1 = "0";
        }
        if(edtSp2.getText().toString().equals("")){
            C5_P2_2_2 = "0";
        }
        if(edtSp3.getText().toString().equals("")){
            C5_P2_2_3 = "0";
        }
        if(edtSp4.getText().toString().equals("")){
            C5_P2_2_4="0";
        }
        if(edtSp5.getText().toString().equals("")){
            C5_P2_2_5 = "0";
        }
        if(edtSp6.getText().toString().equals("")){
            C5_P2_2_6 = "0";
        }
        if(edtSp7.getText().toString().equals("")){
            C5_P2_2_7 = "0";
        }
        if(edtSp8.getText().toString().equals("")){
            C5_P2_2_8 = "0";
        }
        if(edtSp9.getText().toString().equals("")){
            C5_P2_2_9 = "0";
        }

        if(!edtSP1.getText().toString().equals("")){
            C5_P2_2_1 = edtSP1.getText().toString();
        }
        if(!edtSp2.getText().toString().equals("")){
            C5_P2_2_2 = edtSp2.getText().toString();
        }
        if(!edtSp3.getText().toString().equals("")){
            C5_P2_2_3 = edtSp3.getText().toString();
        }
        if(!edtSp4.getText().toString().equals("")){
            C5_P2_2_4 = edtSp4.getText().toString();
        }
        if(!edtSp5.getText().toString().equals("")){
            C5_P2_2_5 = edtSp5.getText().toString();
        }
        if(!edtSp6.getText().toString().equals("")){
            C5_P2_2_6 = edtSp6.getText().toString();
        }
        if(!edtSp7.getText().toString().equals("")){
            C5_P2_2_7 = edtSp7.getText().toString();
        }
        if(!edtSp8.getText().toString().equals("")){
            C5_P2_2_8 = edtSp8.getText().toString();
        }
        if(!edtSp9.getText().toString().equals("")){
            C5_P2_2_9 = edtSp9.getText().toString();
        }



    }

    public void guardarDatos() {
        data = new Data(context);
        data.open();
        if (data.existeModulo5(idempresa)) {
            ContentValues contentValues = new ContentValues(478);
            contentValues.put(SQLConstantes.MODULO5_P2, C5_P2 + "");
            contentValues.put(SQLConstantes.MODULO5_P2_0_1, C5_P2_0_1 + "");
            contentValues.put(SQLConstantes.MODULO5_P2_0_2, C5_P2_0_2 + "");
            contentValues.put(SQLConstantes.MODULO5_P2_0_3, C5_P2_0_3 + "");
            contentValues.put(SQLConstantes.MODULO5_P2_0_4, C5_P2_0_4 + "");
            contentValues.put(SQLConstantes.MODULO5_P2_0_5, C5_P2_0_5 + "");
            contentValues.put(SQLConstantes.MODULO5_P2_0_6, C5_P2_0_6 + "");
            contentValues.put(SQLConstantes.MODULO5_P2_0_7, C5_P2_0_7 + "");
            contentValues.put(SQLConstantes.MODULO5_P2_0_8, C5_P2_0_8 + "");
            contentValues.put(SQLConstantes.MODULO5_P2_0_9, C5_P2_0_9 + "");
            contentValues.put(SQLConstantes.MODULO5_P2_1_1, C5_P2_1_1 + "");
            contentValues.put(SQLConstantes.MODULO5_P2_1_2, C5_P2_1_2 + "");
            contentValues.put(SQLConstantes.MODULO5_P2_1_3, C5_P2_1_3 + "");
            contentValues.put(SQLConstantes.MODULO5_P2_1_4, C5_P2_1_4 + "");
            contentValues.put(SQLConstantes.MODULO5_P2_1_5, C5_P2_1_5 + "");
            contentValues.put(SQLConstantes.MODULO5_P2_1_6, C5_P2_1_6 + "");
            contentValues.put(SQLConstantes.MODULO5_P2_1_7, C5_P2_1_7 + "");
            contentValues.put(SQLConstantes.MODULO5_P2_1_8, C5_P2_1_8 + "");
            contentValues.put(SQLConstantes.MODULO5_P2_1_9, C5_P2_1_9 + "");
            contentValues.put(SQLConstantes.MODULO5_P2_2_1, C5_P2_2_1);
            contentValues.put(SQLConstantes.MODULO5_P2_2_2, C5_P2_2_2);
            contentValues.put(SQLConstantes.MODULO5_P2_2_3, C5_P2_2_3);
            contentValues.put(SQLConstantes.MODULO5_P2_2_4, C5_P2_2_4);
            contentValues.put(SQLConstantes.MODULO5_P2_2_5, C5_P2_2_5);
            contentValues.put(SQLConstantes.MODULO5_P2_2_6, C5_P2_2_6);
            contentValues.put(SQLConstantes.MODULO5_P2_2_7, C5_P2_2_7);
            contentValues.put(SQLConstantes.MODULO5_P2_2_8, C5_P2_2_8);
            contentValues.put(SQLConstantes.MODULO5_P2_2_9, C5_P2_2_9);
            contentValues.put(SQLConstantes.MODULO5_P2_2_10, C5_P2_2_10);
            data.actualizarModulo5(idempresa, contentValues);
        } else {
            //si no existe el elemento, lo construye para insertarlo
            modulo5 = new Modulo5();
            //llena el objeto a insertar
            modulo5.setMODULO5_ID(idempresa);
            modulo5.setC5_P2(C5_P2 + "");
            modulo5.setC5_P2_0_1(C5_P2_0_1 + "");
            modulo5.setC5_P2_0_2(C5_P2_0_2 + "");
            modulo5.setC5_P2_0_3(C5_P2_0_3 + "");
            modulo5.setC5_P2_0_4(C5_P2_0_4 + "");
            modulo5.setC5_P2_0_5(C5_P2_0_5 + "");
            modulo5.setC5_P2_0_6(C5_P2_0_6 + "");
            modulo5.setC5_P2_0_7(C5_P2_0_7 + "");
            modulo5.setC5_P2_0_8(C5_P2_0_8 + "");
            modulo5.setC5_P2_0_9(C5_P2_0_9 + "");
            modulo5.setC5_P2_1_1(C5_P2_1_1 + "");
            modulo5.setC5_P2_1_2(C5_P2_1_2 + "");
            modulo5.setC5_P2_1_3(C5_P2_1_3 + "");
            modulo5.setC5_P2_1_4(C5_P2_1_4 + "");
            modulo5.setC5_P2_1_5(C5_P2_1_5 + "");
            modulo5.setC5_P2_1_6(C5_P2_1_6 + "");
            modulo5.setC5_P2_1_7(C5_P2_1_7 + "");
            modulo5.setC5_P2_1_8(C5_P2_1_8 + "");
            modulo5.setC5_P2_1_9(C5_P2_1_9 + "");
            modulo5.setC5_P2_2_1(C5_P2_2_1);
            modulo5.setC5_P2_2_2(C5_P2_2_2);
            modulo5.setC5_P2_2_3(C5_P2_2_3);
            modulo5.setC5_P2_2_4(C5_P2_2_4);
            modulo5.setC5_P2_2_5(C5_P2_2_5);
            modulo5.setC5_P2_2_6(C5_P2_2_6);
            modulo5.setC5_P2_2_7(C5_P2_2_7);
            modulo5.setC5_P2_2_8(C5_P2_2_8);
            modulo5.setC5_P2_2_9(C5_P2_2_9);
            modulo5.setC5_P2_2_10(C5_P2_2_10);

            data.insertarModulo5(modulo5);
        }
        data.close();
    }

    public boolean validar() {
        boolean valido = true;
        llenarMapaVariables();
        boolean vC5_P0_1 = false;
        boolean vC5_P0_2 = false;
        boolean vC5_P0_3 = false;
        boolean vC5_P2 = false;
        boolean vC5_P2_1 = false;
        boolean vC5_P2_2 = false;
        boolean vC5_P2_3 = false;
        boolean vC5_P2_4 = false;
        boolean vC5_P2_5 = false;
        boolean vC5_P2_6 = false;
        boolean vC5_P2_7 = false;
        boolean vC5_P2_8 = false;
        boolean vC5_P2_9 = false;

        if(C5_P2 == -1 )
        {mostrarMensaje("Pregunta 2: Debe seleccionar N° personas contratadas ");
            valido=false;
        }else
        if(C5_P2 == 0)
        {
            if (C5_P2_0_1 == 1 && C5_P2_1_1 == -1 && C5_P2_2_1=="0") {
                mostrarMensaje( "Pregunta 2.1: Debe Seleccionar ¿Contrató?");
                valido = false;
            } else if (C5_P2_0_1 == 1 && C5_P2_1_1 == 0 && C5_P2_2_1=="0") {
                mostrarMensaje( "Pregunta 2.1: Debe Ingresar número");
                valido = false;
            } else if (C5_P2_0_2 == 1 && C5_P2_1_2 == -1 && C5_P2_2_2=="0") {
                mostrarMensaje( "Pregunta 2.2: Debe Seleccionar ¿Contrató?");
                valido = false;
            } else if (C5_P2_0_2 == 1 && C5_P2_1_2 == 0 && C5_P2_2_2=="0") {
                mostrarMensaje( "Pregunta 2.2: Debe Ingresar número");
                valido = false;
            } else if (C5_P2_0_3 == 1 && C5_P2_1_3 == -1 && C5_P2_2_3=="0") {
                mostrarMensaje( "Pregunta 2.3: Debe Seleccionar ¿Contrató?");
                valido = false;
            } else if (C5_P2_0_3 == 1 && C5_P2_1_3 == 0 && C5_P2_2_3=="0") {
                mostrarMensaje( "Pregunta 2.3: Debe Ingresar número");
                valido = false;
            } else if (C5_P2_0_4 == 1 && C5_P2_1_4 == -1 && C5_P2_2_4=="0") {
                mostrarMensaje( "Pregunta 2.4: Debe Seleccionar ¿Contrató?");
                valido = false;
            } else if (C5_P2_0_4 == 1 && C5_P2_1_4 == 0 && C5_P2_2_4=="0") {
                mostrarMensaje( "Pregunta 2.4: Debe Ingresar número");
                valido = false;
            } else if (C5_P2_0_5 == 1 && C5_P2_1_5 == -1 && C5_P2_2_5=="0") {
                mostrarMensaje( "Pregunta 2.5: Debe Seleccionar ¿Contrató?");
                valido = false;
            } else if (C5_P2_0_5 == 1 && C5_P2_1_5 == 0 && C5_P2_2_5=="0") {
                mostrarMensaje( "Pregunta 2.5: Debe Ingresar número");
                valido = false;
            } else if (C5_P2_0_6 == 1 && C5_P2_1_6 == -1 && C5_P2_2_6=="0") {
                mostrarMensaje( "Pregunta 2.6: Debe Seleccionar ¿Contrató?");
                valido = false;
            } else if (C5_P2_0_6 == 1 && C5_P2_1_6 == 0 && C5_P2_2_6=="0") {
                mostrarMensaje( "Pregunta 2.6: Debe Ingresar número");
                valido = false;
            } else if (C5_P2_0_7 == 1 && C5_P2_1_7 == -1 && C5_P2_2_7=="0") {
                mostrarMensaje( "Pregunta 2.7: Debe Seleccionar ¿Contrató?");
                valido = false;
            } else if (C5_P2_0_7 == 1 && C5_P2_1_7 == 0 && C5_P2_2_7=="0") {
                mostrarMensaje( "Pregunta 2.7: Debe Ingresar número");
                valido = false;
            } else if (C5_P2_0_8 == 1 && C5_P2_1_8 == -1 && C5_P2_2_8=="0") {
                mostrarMensaje( "Pregunta 2.8: Debe Seleccionar ¿Contrató?");
                valido = false;
            } else if (C5_P2_0_8 == 1 && C5_P2_1_8 == 0 && C5_P2_2_8=="0") {
                mostrarMensaje( "Pregunta 2.8: Debe Ingresar número");
                valido = false;
            } else if (C5_P2_0_9 == 1 && C5_P2_1_9 == -1 && C5_P2_2_9=="0") {
                mostrarMensaje( "Pregunta 2.9: Debe Seleccionar ¿Contrató?");
                valido = false;
            } else if (C5_P2_0_9 == 1 && C5_P2_1_9 == 0 && C5_P2_2_9=="0") {
                mostrarMensaje( "Pregunta 2.9: Debe Ingresar número");
                valido = false;
            } else if ((Integer.parseInt(C5_P2_2_10)>C2_P7)||(Integer.parseInt(C5_P2_2_10)<C2_P7)){
                mostrarMensaje( "El total de los grandes grupos ocupacionales no coincide con el \n" +
                        "    número de trabajadores en los últimos 12 meses, registrados en el CAP 2 Pregunta 7\n");
                valido = false;
            }

        } else

        if(C5_P2 == 1)
        {
            if (C5_P2_0_1 == 1 && C5_P2_1_1 == -1 && C5_P2_2_1=="0") {
                mostrarMensaje( "Pregunta 2.1: Debe Seleccionar ¿Contrató?");
                valido = false;
            } else if (C5_P2_0_1 == 1 && C5_P2_1_1 == 0 && C5_P2_2_1=="0") {
                mostrarMensaje( "Pregunta 2.1: Debe Ingresar número");
                valido = false;
            } else if (Integer.parseInt(C5_P2_2_1) > 100) {
                mostrarMensaje( "Pregunta 2.1: Solo puede Ingresar Numeros del 1 al 100 (Porcentaje)");
                valido = false;
            } else if (C5_P2_0_2 == 1 && C5_P2_1_2 == -1 && C5_P2_2_2=="0") {
                mostrarMensaje( "Pregunta 2.2: Debe Seleccionar ¿Contrató?");
                valido = false;
            } else if (C5_P2_0_2 == 1 && C5_P2_1_2 == 0 && C5_P2_2_2=="0") {
                mostrarMensaje( "Pregunta 2.2: Debe Ingresar número");
                valido = false;
            } else if (Integer.parseInt(C5_P2_2_2) > 100) {
                mostrarMensaje( "Pregunta 2.2: Solo puede Ingresar Numeros del 1 al 100 (Porcentaje)");
                valido = false;
            } else if (C5_P2_0_3 == 1 && C5_P2_1_3 == -1 && C5_P2_2_3=="0") {
                mostrarMensaje( "Pregunta 2.3: Debe Seleccionar ¿Contrató?");
                valido = false;
            } else if (C5_P2_0_3 == 1 && C5_P2_1_3 == 0 && C5_P2_2_3=="0") {
                mostrarMensaje( "Pregunta 2.3: Debe Ingresar número");
                valido = false;
            } else if (Integer.parseInt(C5_P2_2_3) > 100) {
                mostrarMensaje( "Pregunta 2.3: Solo puede Ingresar Numeros del 1 al 100 (Porcentaje)");
                valido = false;
            } else if (C5_P2_0_4 == 1 && C5_P2_1_4 == -1 && C5_P2_2_4=="0") {
                mostrarMensaje( "Pregunta 2.4: Debe Seleccionar ¿Contrató?");
                valido = false;
            } else if (C5_P2_0_4 == 1 && C5_P2_1_4 == 0 && C5_P2_2_4=="0") {
                mostrarMensaje( "Pregunta 2.4: Debe Ingresar número");
                valido = false;
            } else if (Integer.parseInt(C5_P2_2_4) > 100) {
                mostrarMensaje( "Pregunta 2.4: Solo puede Ingresar Numeros del 1 al 100 (Porcentaje)");
                valido = false;
            } else if (C5_P2_0_5 == 1 && C5_P2_1_5 == -1 && C5_P2_2_5=="0") {
                mostrarMensaje( "Pregunta 2.5: Debe Seleccionar ¿Contrató?");
                valido = false;
            } else if (C5_P2_0_5 == 1 && C5_P2_1_5 == 0 && C5_P2_2_5=="0") {
                mostrarMensaje( "Pregunta 2.5: Debe Ingresar número");
                valido = false;
            } else if (Integer.parseInt(C5_P2_2_5) > 100) {
                mostrarMensaje( "Pregunta 2.5: Solo puede Ingresar Numeros del 1 al 100 (Porcentaje)");
                valido = false;
            } else if (C5_P2_0_6 == 1 && C5_P2_1_6 == -1 && C5_P2_2_6=="0") {
                mostrarMensaje( "Pregunta 2.6: Debe Seleccionar ¿Contrató?");
                valido = false;
            } else if (C5_P2_0_6 == 1 && C5_P2_1_6 == 0 && C5_P2_2_6=="0") {
                mostrarMensaje( "Pregunta 2.6: Debe Ingresar número");
                valido = false;
            } else if (Integer.parseInt(C5_P2_2_6) > 100) {
                mostrarMensaje( "Pregunta 2.6: Solo puede Ingresar Numeros del 1 al 100 (Porcentaje)");
                valido = false;
            } else if (C5_P2_0_7 == 1 && C5_P2_1_7 == -1 && C5_P2_2_7=="0") {
                mostrarMensaje( "Pregunta 2.7: Debe Seleccionar ¿Contrató?");
                valido = false;
            } else if (C5_P2_0_7 == 1 && C5_P2_1_7 == 0 && C5_P2_2_7=="0") {
                mostrarMensaje( "Pregunta 2.7: Debe Ingresar número");
                valido = false;
            } else if (Integer.parseInt(C5_P2_2_7) > 100) {
                mostrarMensaje( "Pregunta 2.7: Solo puede Ingresar Numeros del 1 al 100 (Porcentaje)");
                valido = false;
            } else if (C5_P2_0_8 == 1 && C5_P2_1_8 == -1 && C5_P2_2_8=="0") {
                mostrarMensaje( "Pregunta 2.8: Debe Seleccionar ¿Contrató?");
                valido = false;
            } else if (C5_P2_0_8 == 1 && C5_P2_1_8 == 0 && C5_P2_2_8=="0") {
                mostrarMensaje( "Pregunta 2.8: Debe Ingresar número");
                valido = false;
            } else if (Integer.parseInt(C5_P2_2_8) > 100) {
                mostrarMensaje( "Pregunta 2.8: Solo puede Ingresar Numeros del 1 al 100 (Porcentaje)");
                valido = false;
            } else if (C5_P2_0_9 == 1 && C5_P2_1_9 == -1 && C5_P2_2_9=="0") {
                mostrarMensaje( "Pregunta 2.9: Debe Seleccionar ¿Contrató?");
                valido = false;
            } else if (C5_P2_0_9 == 1 && C5_P2_1_9 == 0 && C5_P2_2_9=="0") {
                mostrarMensaje( "Pregunta 2.9: Debe Ingresar número");
                valido = false;
            }else
            if (Integer.parseInt(C5_P2_2_9) > 100) {
            mostrarMensaje( "Pregunta 2.9: Solo puede Ingresar Numeros del 1 al 100 (Porcentaje)");
            valido = false;
            } else if ((Integer.parseInt(C5_P2_2_10)>C2_P7)||(Integer.parseInt(C5_P2_2_10)<C2_P7)){
            mostrarMensaje( "El total de los grandes grupos ocupacionales no coincide con el \n" +
                    "    número de trabajadores en los últimos 12 meses, registrados en el CAP 2 Pregunta 7\n");
            valido = false;
        }

        }



//        //cabecera
//
//
//        //P2
//        if (C5_P2 >= 0 && C5_P2 <= 1) {
//            vC5_P2 = true;
//        }
//        if (C5_P2_2_1.trim().length() != 0) vC5_P2_1 = true;
//        if (C5_P2_2_2.trim().length() != 0) vC5_P2_2 = true;
//        if (C5_P2_2_3.trim().length() != 0) vC5_P2_3 = true;
//        if (C5_P2_2_4.trim().length() != 0) vC5_P2_4 = true;
//        if (C5_P2_2_5.trim().length() != 0) vC5_P2_5 = true;
//        if (C5_P2_2_6.trim().length() != 0) vC5_P2_6 = true;
//        if (C5_P2_2_7.trim().length() != 0) vC5_P2_7 = true;
//        if (C5_P2_2_8.trim().length() != 0) vC5_P2_8 = true;
//        if (C5_P2_2_9.trim().length() != 0) vC5_P2_9 = true;
//
//
//        valido =  vC5_P2
//        //&&  vC6_P3
////                & vC6_P3_1 & vC6_P3_2 & vC6_P3_3  &vC6_P3_4 & vC6_P3_5 & vC6_P3_6
////                & vC6_P3_7 & vC6_P3_8 & vC6_P3_9
//        ;
//        if (!valido)
//            Toast.makeText(context, "DEBE LLENAR TODOS LOS DATOS", Toast.LENGTH_SHORT).show();
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
