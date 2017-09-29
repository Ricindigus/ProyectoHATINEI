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
import pe.gob.inei.encuestahabilidades.modelo.Data;
import pe.gob.inei.encuestahabilidades.modelo.SQLConstantes;
import pe.gob.inei.encuestahabilidades.pojos.Identificacion;
import pe.gob.inei.encuestahabilidades.pojos.Modulo2;
import pe.gob.inei.encuestahabilidades.pojos.Modulo5;

/**
 * A simple {@link Fragment} subclass.
 */
public class Modulo5Fragment1 extends Fragment {
    
    private LinearLayout lytP1;
    private LinearLayout lytSp1;
    private LinearLayout lytSp2;
    private LinearLayout lytSp3;
    private LinearLayout lytSp4;
    private LinearLayout lytSp5;
    private LinearLayout lytSp6;
    private LinearLayout lytSp7;
    private LinearLayout lytSp8;
    private LinearLayout lytSp9;

    private CheckBox ckSp1;
    private CheckBox ckSp2;
    private CheckBox ckSp3;
    private CheckBox ckSp4;
    private CheckBox ckSp5;
    private CheckBox ckSp6;
    private CheckBox ckSp7;
    private CheckBox ckSp8;
    private CheckBox ckSp9;

    private EditText edtSp1;
    private EditText edtSp2;
    private EditText edtSp3;
    private EditText edtSp4;
    private EditText edtSp5;
    private EditText edtSp6;
    private EditText edtSp7;
    private EditText edtSp8;
    private EditText edtSp9;

    private RadioGroup rgP1;

    private TextView txtTotalTrab;

    private LinearLayout lytFragment5;
    private CheckBox ckMismoInformante5;
    private EditText edtNombYApellidos5;
    private EditText edtEspecifiqueCargo5;
    private LinearLayout lytFondoSpinner5;
    private Spinner spCargo5;
    //CARGADO Y GUARDADO
    private String idempresa;
    private Modulo5 modulo5;
    private Context context;
    private Data data;
    private TextView txtP1Total;
    private Identificacion identificacion;
    private Modulo2 modulo2;
    String informante;
    String cargo="0";
    String cargos="";
    //mapeo de variables
    int C2_P1;
    int C5_P0_0;
    String C5_P0_1;
    int C5_P0_2;
    String C5_P0_3;
    int C5_P1;
    int C5_P1_1_1;
    int C5_P1_1_2;
    int C5_P1_1_3;
    int C5_P1_1_4;
    int C5_P1_1_5;
    int C5_P1_1_6;
    int C5_P1_1_7;
    int C5_P1_1_8;
    int C5_P1_1_9;
    String C5_P1_1_10;
    String C5_P1_2_1;
    String C5_P1_2_2;
    String C5_P1_2_3;
    String C5_P1_2_4;
    String C5_P1_2_5;
    String C5_P1_2_6;
    String C5_P1_2_7;
    String C5_P1_2_8;
    String C5_P1_2_9;
    String C5_P1_2_10;
    
    
    
    public Modulo5Fragment1() {
        // Required empty public constructor
    }

    @SuppressLint("ValidFragment")
    public Modulo5Fragment1(String idempresa, Context context) {
        this.idempresa = idempresa;
        this.context = context;
        data = new Data(context);
        data.open();
        identificacion = data.getIdentificacion(idempresa);
        modulo2 =data.getModulo2(idempresa);

        if (!modulo2.getC2_P1().equals("")) {
            C2_P1 = Integer.parseInt(modulo2.getC2_P1());
        }
        if (!identificacion.getNOM_INFORMANTE().equals("") && !identificacion.getNOM_INFORMANTE().equals("0"))
        { informante= identificacion.getNOM_INFORMANTE();}

        if (!identificacion.getCARGO_INFORMANTE().equals("") && !identificacion.getCARGO_INFORMANTE().equals("0"))
        { cargo= identificacion.getCARGO_INFORMANTE();}

        cargos= identificacion.getCARGO_INFORMANTE_ESP();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_modulo5_fragment1, container, false);
        lytP1 = (LinearLayout) rootView.findViewById(R.id.mod5_p1_lyt);

        lytSp1 = (LinearLayout) rootView.findViewById(R.id.mod5_p1_lytSp1);
        lytSp2 = (LinearLayout) rootView.findViewById(R.id.mod5_p1_lytSp2);
        lytSp3 = (LinearLayout) rootView.findViewById(R.id.mod5_p1_lytSp3);
        lytSp4 = (LinearLayout) rootView.findViewById(R.id.mod5_p1_lytSp4);
        lytSp5 = (LinearLayout) rootView.findViewById(R.id.mod5_p1_lytSp5);
        lytSp6 = (LinearLayout) rootView.findViewById(R.id.mod5_p1_lytSp6);
        lytSp7 = (LinearLayout) rootView.findViewById(R.id.mod5_p1_lytSp7);
        lytSp8 = (LinearLayout) rootView.findViewById(R.id.mod5_p1_lytSp8);
        lytSp9 = (LinearLayout) rootView.findViewById(R.id.mod5_p1_lytSp9);

        txtTotalTrab = (TextView) rootView.findViewById(R.id.mod5_p1_totalTrab);

        ckSp1 = (CheckBox) rootView.findViewById(R.id.mod5_p1_ck1);
        ckSp2 = (CheckBox) rootView.findViewById(R.id.mod5_p1_ck2);
        ckSp3 = (CheckBox) rootView.findViewById(R.id.mod5_p1_ck3);
        ckSp4 = (CheckBox) rootView.findViewById(R.id.mod5_p1_ck4);
        ckSp5 = (CheckBox) rootView.findViewById(R.id.mod5_p1_ck5);
        ckSp6 = (CheckBox) rootView.findViewById(R.id.mod5_p1_ck6);
        ckSp7 = (CheckBox) rootView.findViewById(R.id.mod5_p1_ck7);
        ckSp8 = (CheckBox) rootView.findViewById(R.id.mod5_p1_ck8);
        ckSp9 = (CheckBox) rootView.findViewById(R.id.mod5_p1_ck9);

        edtSp1 = (EditText) rootView.findViewById(R.id.mod5_p1_edt1);
        edtSp2 = (EditText) rootView.findViewById(R.id.mod5_p1_edt2);
        edtSp3 = (EditText) rootView.findViewById(R.id.mod5_p1_edt3);
        edtSp4 = (EditText) rootView.findViewById(R.id.mod5_p1_edt4);
        edtSp5 = (EditText) rootView.findViewById(R.id.mod5_p1_edt5);
        edtSp6 = (EditText) rootView.findViewById(R.id.mod5_p1_edt6);
        edtSp7 = (EditText) rootView.findViewById(R.id.mod5_p1_edt7);
        edtSp8 = (EditText) rootView.findViewById(R.id.mod5_p1_edt8);
        edtSp9 = (EditText) rootView.findViewById(R.id.mod5_p1_edt9);

        rgP1 = (RadioGroup) rootView.findViewById(R.id.mod5_p1_rg);

        txtP1Total = (TextView) rootView.findViewById(R.id.mod5_p1_txtTotal);

        lytFragment5 = (LinearLayout) rootView.findViewById(R.id.mod5_layoutFragment1);
        ckMismoInformante5 = (CheckBox) rootView.findViewById(R.id.cab_ckMismoInformante);
        edtNombYApellidos5 = (EditText)rootView.findViewById(R.id.cab_edtApeYNom);
        spCargo5 = (Spinner) rootView.findViewById(R.id.cab_spCargo);
        edtEspecifiqueCargo5 = (EditText) rootView.findViewById(R.id.cab_edtEspecifiqueCargo);
        lytFondoSpinner5 = (LinearLayout) rootView.findViewById(R.id.cab_lytFondoSpinner);
        return rootView;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        /*DATOS INTRODUCTORIOS MODULO 5*/
        ckMismoInformante5.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    edtNombYApellidos5.setBackgroundResource(R.drawable.fondo_edit_text_disabled);
                    lytFondoSpinner5.setBackgroundResource(R.drawable.fondo_spinner_disabled);
                    spCargo5.setEnabled(false);
                    edtNombYApellidos5.setText(informante);
                    spCargo5.setSelection(Integer.parseInt(cargo));
                    edtNombYApellidos5.setEnabled(false);
                    edtEspecifiqueCargo5.setText(cargos);
                    edtEspecifiqueCargo5.setEnabled(false);
                    edtEspecifiqueCargo5.setBackgroundResource(R.drawable.fondo_edit_text_disabled);
                    lytP1.requestFocus();
                }else{
                    edtNombYApellidos5.setText("");
                    spCargo5.setSelection(0);
                    edtNombYApellidos5.setBackgroundResource(R.drawable.fondo_edit_text);
                    edtNombYApellidos5.setEnabled(true);
                    lytFondoSpinner5.setBackgroundResource(R.drawable.fondo_spinner);
                    spCargo5.setEnabled(true);
                    edtEspecifiqueCargo5.setEnabled(true);
                    edtEspecifiqueCargo5.setBackgroundResource(R.drawable.fondo_edit_text);
                    edtNombYApellidos5.requestFocus();
                }
            }
        });
        edtNombYApellidos5.setFilters(new InputFilter[]{new InputFilter.AllCaps()});
        edtNombYApellidos5.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View view, int keyCode, KeyEvent keyEvent) {
                if ((keyEvent.getAction() == KeyEvent.ACTION_DOWN) &&
                        (keyCode == KeyEvent.KEYCODE_ENTER)) {
                    ocultarTeclado(edtNombYApellidos5);
                    lytFondoSpinner5.requestFocus();
                    return true;
                }
                return false;
            }
        });

        spCargo5.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int pos, long l) {
                edtEspecifiqueCargo5.setVisibility(View.GONE);
                switch (pos){
                    case 0:break;
                    case 1:break;
                    case 2:break;
                    case 3:break;
                    case 4:
                        edtEspecifiqueCargo5.setVisibility(View.VISIBLE);
                        edtEspecifiqueCargo5.requestFocus();
                        break;
                }
                if (pos >= 0 && pos <4){
                    edtEspecifiqueCargo5.setText("");
                    lytP1.requestFocus();
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {}
        });
        edtEspecifiqueCargo5.setFilters(new InputFilter[]{new InputFilter.AllCaps()});
        edtEspecifiqueCargo5.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View view, int keyCode, KeyEvent keyEvent) {
                if ((keyEvent.getAction() == KeyEvent.ACTION_DOWN) && (keyCode == KeyEvent.KEYCODE_ENTER)) {
                    ocultarTeclado(edtEspecifiqueCargo5);
                    lytP1.requestFocus();
                    return true;
                }
                return false;
            }
        });
//        edtEspecifiqueCargo5.setOnFocusChangeListener(new View.OnFocusChangeListener() {
//            @Override
//            public void onFocusChange(View view, boolean conFocus) {
//                if(conFocus) {
//                    edtEspecifiqueCargo5.setBackgroundResource(R.drawable.caja_texto_enabled);
//                }
//                else if(view.isEnabled()){
//                    edtEspecifiqueCargo5.setBackgroundResource(R.drawable.cajas_de_texto);
//                }
//            }
//        });
        /*-------------------------------------------------------------------------------------*/

        final CheckBox[] checkBoxes = {ckSp1,ckSp2,ckSp3,ckSp4,ckSp5,ckSp6,ckSp7,ckSp8,ckSp9};
        final EditText[] editTexts = {edtSp1,edtSp2,edtSp3,edtSp4,edtSp5,edtSp6,edtSp7,edtSp8,edtSp9};
        LinearLayout[]  linearLayouts = {lytSp1,lytSp2,lytSp3,lytSp4,lytSp5,lytSp6,lytSp7,lytSp8,lytSp9};

        rgP1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, @IdRes int i) {
                for (int j = 0; j < checkBoxes.length; j++) {
                    CheckBox checkBox = checkBoxes[j];
                    checkBox.setEnabled(true);
                }
                switch (i){
                    case R.id.mod5_p1_rb1:
                        for (int j = 0; j < editTexts.length; j++) {
                            EditText editText = editTexts[j];
                            editText.setText("");
                            editText.setHint("Ingrese número");
                            editText.setFilters(new InputFilter[]{new InputFilter.LengthFilter(5)});
                        }
                        txtP1Total.setText("0");
                        break;
//                    case R.id.mod5_p1_rb2:
//                        for (int j = 0; j < editTexts.length; j++) {
//                            EditText editText = editTexts[j];
//                            editText.setText("");
//                            editText.setHint("Ingrese porcentaje");
//                            editText.setFilters(new InputFilter[]{new InputFilter.LengthFilter(3)});
//                        }
//                        txtP1Total.setText("0");
//                        break;
                }
            }
        });
        for (int i = 0; i < checkBoxes.length; i++) {
            CheckBox checkBox = checkBoxes[i];
            final EditText editText = editTexts[i];
            final LinearLayout linearLayout = linearLayouts[i];
            checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                    if(b){
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
                        if(rgP1.indexOfChild(rgP1.findViewById(rgP1.getCheckedRadioButtonId()))==0){
                            txtP1Total.setText((Integer.parseInt(txtP1Total.getText().toString()) - Integer.parseInt(charSequence.toString()))+"");
                        }else{
                            int porcentaje=Integer.parseInt(charSequence.toString());
                            int subTotal = C2_P1*porcentaje/100;
                            txtP1Total.setText((Integer.parseInt(txtP1Total.getText().toString()) - subTotal)+"");
                        }
                    }
                }
                @Override
                public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {}
                @Override
                public void afterTextChanged(Editable editable) {
                    int despues = 0;
                    if(!editable.toString().equals("")) despues = Integer.parseInt(editable.toString());
                    if(!(Integer.parseInt(txtP1Total.getText().toString())== 0)){
                        if(rgP1.indexOfChild(rgP1.findViewById(rgP1.getCheckedRadioButtonId()))==0){
                            txtP1Total.setText((Integer.parseInt(txtP1Total.getText().toString()) + despues) +"");
                        }else{
                            int subTotal = C2_P1*despues/100;
                            txtP1Total.setText((Integer.parseInt(txtP1Total.getText().toString()) + subTotal)+"");
                        }
                    }else{
                        if(rgP1.indexOfChild(rgP1.findViewById(rgP1.getCheckedRadioButtonId()))==0){
                            txtP1Total.setText(despues+"");
                        }else{
                            int subTotal = C2_P1*despues/100;
                            txtP1Total.setText((Integer.parseInt(txtP1Total.getText().toString()) + subTotal)+"");
                        }
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
        Modulo2 modulo2 = data.getModulo2(idempresa);
        txtTotalTrab.setText("Total Trabajadores : " + modulo2.getC2_P1());

        //verifico si ya existe un objeto con datos llenados previamente
        if (data.existeModulo5(idempresa)) {
            //si existe traigo el objeto
            modulo5 = data.getModulo5(idempresa);

            //saco los datos del objeto para llenarlos en los elementos del fragment
            //datos cabecera
            if (modulo5.getC5_P0_0().equals("1")) ckMismoInformante5.setChecked(true);
            if (modulo5.getC5_P0_0().equals("0")) ckMismoInformante5.setChecked(false);
            edtNombYApellidos5.setText(modulo5.getC5_P0_1());
            if (!modulo5.getC5_P0_2().equals("")) {
            spCargo5.setSelection(Integer.parseInt(modulo5.getC5_P0_2()));}
            edtEspecifiqueCargo5.setText(modulo5.getC5_P0_3());
            //pregunta 18
            if(!modulo5.getC5_P1().equals("") && (!modulo5.getC5_P1().equals("-1")))
            {int childPos3 = Integer.parseInt(modulo5.getC5_P1());
            ((RadioButton) rgP1.getChildAt(childPos3)).setChecked(true);}
            if (modulo5.getC5_P1_1_1().equals("1")) ckSp1.setChecked(true);
            if (modulo5.getC5_P1_1_1().equals("0")) ckSp1.setChecked(false);
            if (modulo5.getC5_P1_1_2().equals("1")) ckSp2.setChecked(true);
            if (modulo5.getC5_P1_1_2().equals("0")) ckSp2.setChecked(false);
            if (modulo5.getC5_P1_1_3().equals("1")) ckSp3.setChecked(true);
            if (modulo5.getC5_P1_1_3().equals("0")) ckSp3.setChecked(false);
            if (modulo5.getC5_P1_1_4().equals("1")) ckSp4.setChecked(true);
            if (modulo5.getC5_P1_1_4().equals("0")) ckSp4.setChecked(false);
            if (modulo5.getC5_P1_1_5().equals("1")) ckSp5.setChecked(true);
            if (modulo5.getC5_P1_1_5().equals("0")) ckSp5.setChecked(false);
            if (modulo5.getC5_P1_1_6().equals("1")) ckSp6.setChecked(true);
            if (modulo5.getC5_P1_1_6().equals("0")) ckSp6.setChecked(false);
            if (modulo5.getC5_P1_1_7().equals("1")) ckSp7.setChecked(true);
            if (modulo5.getC5_P1_1_7().equals("0")) ckSp7.setChecked(false);
            if (modulo5.getC5_P1_1_8().equals("1")) ckSp8.setChecked(true);
            if (modulo5.getC5_P1_1_8().equals("0")) ckSp8.setChecked(false);
            if (modulo5.getC5_P1_1_9().equals("1")) ckSp9.setChecked(true);
            if (modulo5.getC5_P1_1_9().equals("0")) ckSp9.setChecked(false);

            edtSp1.setText(modulo5.getC5_P1_2_1());
            edtSp2.setText(modulo5.getC5_P1_2_2());
            edtSp3.setText(modulo5.getC5_P1_2_3());
            edtSp4.setText(modulo5.getC5_P1_2_4());
            edtSp5.setText(modulo5.getC5_P1_2_5());
            edtSp6.setText(modulo5.getC5_P1_2_6());
            edtSp7.setText(modulo5.getC5_P1_2_7());
            edtSp8.setText(modulo5.getC5_P1_2_8());
            edtSp9.setText(modulo5.getC5_P1_2_9());

        }
        data.close();
    }

    public void llenarMapaVariables() {
        //preguntas cabecera
        if (ckMismoInformante5.isChecked()) C5_P0_0 = 1;
        else C5_P0_0 = 0;
        C5_P0_1 = edtNombYApellidos5.getText().toString();
        C5_P0_2 = spCargo5.getSelectedItemPosition();
        C5_P0_3 = edtEspecifiqueCargo5.getText().toString();
        //pregunta 3
        int childPosP3 = rgP1.indexOfChild(rgP1.findViewById(rgP1.getCheckedRadioButtonId()));
        C5_P1 = childPosP3;
        if (ckSp1.isChecked()) C5_P1_1_1 = 1;
        else C5_P1_1_1 = 0;
        if (ckSp2.isChecked()) C5_P1_1_2 = 1;
        else C5_P1_1_2 = 0;
        if (ckSp3.isChecked()) C5_P1_1_3 = 1;
        else C5_P1_1_3 = 0;
        if (ckSp4.isChecked()) C5_P1_1_4 = 1;
        else C5_P1_1_4 = 0;
        if (ckSp5.isChecked()) C5_P1_1_5 = 1;
        else C5_P1_1_5 = 0;
        if (ckSp6.isChecked()) C5_P1_1_6 = 1;
        else C5_P1_1_6 = 0;
        if (ckSp7.isChecked()) C5_P1_1_7 = 1;
        else C5_P1_1_7 = 0;
        if (ckSp8.isChecked()) C5_P1_1_8 = 1;
        else C5_P1_1_8 = 0;
        if (ckSp9.isChecked()) C5_P1_1_9 = 1;
        else C5_P1_1_9 = 0;
//        C5_P1_1_10 = edtSp1.getText().toString();
//        C5_P1_2_1 = edtSp1.getText().toString();
//        C5_P1_2_2 = edtSp2.getText().toString();
//        C5_P1_2_3 = edtSp3.getText().toString();
//        C5_P1_2_4 = edtSp4.getText().toString();
//        C5_P1_2_5 = edtSp5.getText().toString();
//        C5_P1_2_6 = edtSp6.getText().toString();
//        C5_P1_2_7 = edtSp7.getText().toString();
//        C5_P1_2_8 = edtSp8.getText().toString();
//        C5_P1_2_9 = edtSp9.getText().toString();


        if(edtSp1.getText().toString().equals("")){
            C5_P1_2_1 = null;
        }
        if(edtSp2.getText().toString().equals("")){
            C5_P1_2_2 = null;
        }
        if(edtSp3.getText().toString().equals("")){
            C5_P1_2_3 = null;
        }
        if(edtSp4.getText().toString().equals("")){
            C5_P1_2_4=null;
        }
        if(edtSp5.getText().toString().equals("")){
            C5_P1_2_5 = null;
        }
        if(edtSp6.getText().toString().equals("")){
            C5_P1_2_6 = null;
        }
        if(edtSp7.getText().toString().equals("")){
            C5_P1_2_7 = null;
        }
        if(edtSp8.getText().toString().equals("")){
            C5_P1_2_8 = null;
        }
        if(edtSp9.getText().toString().equals("")){
            C5_P1_2_9 = null;
        }

        if(!edtSp1.getText().toString().equals("")){
            C5_P1_2_1 = edtSp1.getText().toString();
        }
        if(!edtSp2.getText().toString().equals("")){
            C5_P1_2_2 = edtSp2.getText().toString();
        }
        if(!edtSp3.getText().toString().equals("")){
            C5_P1_2_3 = edtSp3.getText().toString();
        }
        if(!edtSp4.getText().toString().equals("")){
            C5_P1_2_4 = edtSp4.getText().toString();
        }
        if(!edtSp5.getText().toString().equals("")){
            C5_P1_2_5 = edtSp5.getText().toString();
        }
        if(!edtSp6.getText().toString().equals("")){
            C5_P1_2_6 = edtSp6.getText().toString();
        }
        if(!edtSp7.getText().toString().equals("")){
            C5_P1_2_7 = edtSp7.getText().toString();
        }
        if(!edtSp8.getText().toString().equals("")){
            C5_P1_2_8 = edtSp8.getText().toString();
        }
        if(!edtSp9.getText().toString().equals("")){
            C5_P1_2_9 = edtSp9.getText().toString();
        }
        if(!txtP1Total.getText().toString().equals("")){
            C5_P1_1_10 = txtP1Total.getText().toString();
        }
    }

    public void guardarDatos() {
        data = new Data(context);
        data.open();

        if (data.existeModulo6(idempresa)){
            if ( C5_P1_2_1.equals("0")){
                ContentValues contentValue = new ContentValues(1);
                contentValue.put(SQLConstantes.MODULO6_P3_2_1, "");
                data.actualizarModulo6(idempresa, contentValue);
            }
            if ( C5_P1_2_2.equals("0")){
                ContentValues contentValue = new ContentValues(1);
                contentValue.put(SQLConstantes.MODULO6_P3_2_2, "");
                data.actualizarModulo6(idempresa, contentValue);
            }
            if ( C5_P1_2_3.equals("0")){
                ContentValues contentValue = new ContentValues(1);
                contentValue.put(SQLConstantes.MODULO6_P3_2_3, "");
                data.actualizarModulo6(idempresa, contentValue);
            }
            if ( C5_P1_2_4.equals("0")){
                ContentValues contentValue = new ContentValues(1);
                contentValue.put(SQLConstantes.MODULO6_P3_2_4, "");
                data.actualizarModulo6(idempresa, contentValue);
            }
            if ( C5_P1_2_5.equals("0")){
                ContentValues contentValue = new ContentValues(1);
                contentValue.put(SQLConstantes.MODULO6_P3_2_5, "");
                data.actualizarModulo6(idempresa, contentValue);
            }
            if ( C5_P1_2_6.equals("0")){
                ContentValues contentValue = new ContentValues(1);
                contentValue.put(SQLConstantes.MODULO6_P3_2_6, "");
                data.actualizarModulo6(idempresa, contentValue);
            }
            if ( C5_P1_2_7.equals("0")){
                ContentValues contentValue = new ContentValues(1);
                contentValue.put(SQLConstantes.MODULO6_P3_2_7, "");
                data.actualizarModulo6(idempresa, contentValue);
            }
            if ( C5_P1_2_8.equals("0")){
                ContentValues contentValue = new ContentValues(1);
                contentValue.put(SQLConstantes.MODULO6_P3_2_8, "");
                data.actualizarModulo6(idempresa, contentValue);
            }
            if ( C5_P1_2_9.equals("0")){
                ContentValues contentValue = new ContentValues(1);
                contentValue.put(SQLConstantes.MODULO6_P3_2_9, "");
                data.actualizarModulo6(idempresa, contentValue);
            }

        }
        if (data.existeModulo5(idempresa)) {
            ContentValues contentValues = new ContentValues(478);
            contentValues.put(SQLConstantes.MODULO5_P0_0, C5_P0_0 + "");
            contentValues.put(SQLConstantes.MODULO5_P0_1, C5_P0_1);
            contentValues.put(SQLConstantes.MODULO5_P0_2, C5_P0_2 + "");
            contentValues.put(SQLConstantes.MODULO5_P0_3, C5_P0_3);
            contentValues.put(SQLConstantes.MODULO5_P1, C5_P1 + "");
            contentValues.put(SQLConstantes.MODULO5_P1_1_1, C5_P1_1_1 + "");
            contentValues.put(SQLConstantes.MODULO5_P1_1_2, C5_P1_1_2 + "");
            contentValues.put(SQLConstantes.MODULO5_P1_1_3, C5_P1_1_3 + "");
            contentValues.put(SQLConstantes.MODULO5_P1_1_4, C5_P1_1_4 + "");
            contentValues.put(SQLConstantes.MODULO5_P1_1_5, C5_P1_1_5 + "");
            contentValues.put(SQLConstantes.MODULO5_P1_1_6, C5_P1_1_6 + "");
            contentValues.put(SQLConstantes.MODULO5_P1_1_7, C5_P1_1_7 + "");
            contentValues.put(SQLConstantes.MODULO5_P1_1_8, C5_P1_1_8 + "");
            contentValues.put(SQLConstantes.MODULO5_P1_1_9, C5_P1_1_9 + "");
            contentValues.put(SQLConstantes.MODULO5_P1_1_10, C5_P1_1_10);
            contentValues.put(SQLConstantes.MODULO5_P1_2_1, C5_P1_2_1);
            contentValues.put(SQLConstantes.MODULO5_P1_2_2, C5_P1_2_2);
            contentValues.put(SQLConstantes.MODULO5_P1_2_3, C5_P1_2_3);
            contentValues.put(SQLConstantes.MODULO5_P1_2_4, C5_P1_2_4);
            contentValues.put(SQLConstantes.MODULO5_P1_2_5, C5_P1_2_5);
            contentValues.put(SQLConstantes.MODULO5_P1_2_6, C5_P1_2_6);
            contentValues.put(SQLConstantes.MODULO5_P1_2_7, C5_P1_2_7);
            contentValues.put(SQLConstantes.MODULO5_P1_2_8, C5_P1_2_8);
            contentValues.put(SQLConstantes.MODULO5_P1_2_9, C5_P1_2_9);
            contentValues.put(SQLConstantes.MODULO5_P1_2_10, C5_P1_2_10);
            data.actualizarModulo5(idempresa, contentValues);
        } else {
            //si no existe el elemento, lo construye para insertarlo
            modulo5 = new Modulo5();
            //llena el objeto a insertar
            modulo5.setMODULO5_ID(idempresa);
            modulo5.setC5_P0_0(C5_P0_0 + "");
            modulo5.setC5_P0_1(C5_P0_1);
            modulo5.setC5_P0_2(C5_P0_2 + "");
            modulo5.setC5_P0_3(C5_P0_3);
            modulo5.setC5_P1(C5_P1 + "");
            modulo5.setC5_P1_1_1(C5_P1_1_1 + "");
            modulo5.setC5_P1_1_2(C5_P1_1_2 + "");
            modulo5.setC5_P1_1_3(C5_P1_1_3 + "");
            modulo5.setC5_P1_1_4(C5_P1_1_4 + "");
            modulo5.setC5_P1_1_5(C5_P1_1_5 + "");
            modulo5.setC5_P1_1_6(C5_P1_1_6 + "");
            modulo5.setC5_P1_1_7(C5_P1_1_7 + "");
            modulo5.setC5_P1_1_8(C5_P1_1_8 + "");
            modulo5.setC5_P1_1_9(C5_P1_1_9 + "");
            modulo5.setC5_P1_1_10(C5_P1_1_10);
            modulo5.setC5_P1_2_1(C5_P1_2_1);
            modulo5.setC5_P1_2_2(C5_P1_2_2);
            modulo5.setC5_P1_2_3(C5_P1_2_3);
            modulo5.setC5_P1_2_4(C5_P1_2_4);
            modulo5.setC5_P1_2_5(C5_P1_2_5);
            modulo5.setC5_P1_2_6(C5_P1_2_6);
            modulo5.setC5_P1_2_7(C5_P1_2_7);
            modulo5.setC5_P1_2_8(C5_P1_2_8);
            modulo5.setC5_P1_2_9(C5_P1_2_9);
            modulo5.setC5_P1_2_10(C5_P1_2_10);

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
        boolean vC5_P1 = false;
        boolean vC5_P1_1 = false;
        boolean vC5_P1_2 = false;
        boolean vC5_P1_3 = false;
        boolean vC5_P1_4 = false;
        boolean vC5_P1_5 = false;
        boolean vC5_P1_6 = false;
        boolean vC5_P1_7 = false;
        boolean vC5_P1_8 = false;
        boolean vC5_P1_9 = false;

        if(C5_P0_1.trim().length()<=3)
        {mostrarMensaje("Ingrese 'Apellidos y nombres del informante'");
            valido=false;
        }else
        if(C5_P0_2 ==0)
        {mostrarMensaje("Seleccione el cargo del informante");
            valido=false;
        }else
        if(C5_P0_2 == 4 && C5_P0_3.trim().length() <= 3)
        {mostrarMensaje("Debe registrar información valida en Especifique");
            valido=false;
        }else
        if(C5_P1 == -1 )
        {mostrarMensaje("Pregunta 1: Debe seleccionar N° personas ocupadas");
            valido=false;
        }else
        if(C5_P1 == 0)
        {
            if ((C5_P1_1_1 == 0 && C5_P1_2_1==null) || (C5_P1_1_1 == 1 && C5_P1_2_1==null)) {
                mostrarMensaje("Pregunta 1.1: Debe Ingresar número");
                valido = false;
            } else if ((C5_P1_1_2 == 0 && C5_P1_2_2==null) || (C5_P1_1_2 == 1 && C5_P1_2_2==null)) {
                mostrarMensaje("Pregunta 1.2: Debe Ingresar número");
                valido = false;
            } else  if ((C5_P1_1_3 == 0 && C5_P1_2_3==null) || (C5_P1_1_3 == 1 && C5_P1_2_3==null)) {
                mostrarMensaje("Pregunta 1.3: Debe Ingresar número");
                valido = false;
            } else  if ((C5_P1_1_4 == 0 && C5_P1_2_4==null) || (C5_P1_1_4 == 1 && C5_P1_2_4==null)) {
                mostrarMensaje("Pregunta 1.4: Debe Ingresar número");
                valido = false;
            } else if ((C5_P1_1_5 == 0 && C5_P1_2_5==null) || (C5_P1_1_5 == 1 && C5_P1_2_5==null)) {
                mostrarMensaje("Pregunta 1.5: Debe Ingresar número");
                valido = false;
            } else if ((C5_P1_1_6 == 0 && C5_P1_2_6==null) || (C5_P1_1_6 == 1 && C5_P1_2_6==null)) {
                mostrarMensaje("Pregunta 1.6: Debe Ingresar número");
                valido = false;
            } else if ((C5_P1_1_7 == 0 && C5_P1_2_7==null) || (C5_P1_1_7 == 1 && C5_P1_2_7==null)) {
                mostrarMensaje("Pregunta 1.7: Debe Ingresar número");
                valido = false;
            } else if ((C5_P1_1_8 == 0 && C5_P1_2_8==null) || (C5_P1_1_8 == 1 && C5_P1_2_8==null)) {
                mostrarMensaje("Pregunta 1.8: Debe Ingresar número");
                valido = false;
            } else if ((C5_P1_1_9 == 0 && C5_P1_2_9==null) || (C5_P1_1_9 == 1 && C5_P1_2_9==null)) {
                mostrarMensaje("Pregunta 1.9: Debe Ingresar número");
                valido = false;
            }else if (Integer.parseInt(C5_P1_1_10) != C2_P1){
                mostrarMensaje("El total de los grandes grupos ocupacionales no coincide con el \n" +
                        "Número de trabajadores actualmente, registrados en el CAP 2 Pregunta 1");
                valido = false;
            }
        } else

        if(C5_P1 == 1)
        {
            if ((C5_P1_1_1 == 0 && C5_P1_2_1==null) || (C5_P1_1_1 == 1 && C5_P1_2_1==null)) {
                mostrarMensaje("Pregunta 1.1: Debe Ingresar número");
                valido = false;
            } else if (Integer.parseInt(C5_P1_2_1) > 100) {
                mostrarMensaje("Pregunta 1.1: Solo puede Ingresar Numeros del 1 al 100 (Porcentaje) ");
                valido = false;
            } else if ((C5_P1_1_2 == 0 && C5_P1_2_2==null) || (C5_P1_1_2 == 1 && C5_P1_2_2==null)) {
                mostrarMensaje("Pregunta 1.2: Debe Ingresar número");
                valido = false;
            } else if (Integer.parseInt(C5_P1_2_2) > 100) {
                mostrarMensaje("Pregunta 1.2: Solo puede Ingresar Numeros del 1 al 100 (Porcentaje) ");
                valido = false;
            } else if ((C5_P1_1_3 == 0 && C5_P1_2_3==null) || (C5_P1_1_3 == 1 && C5_P1_2_3==null)) {
                mostrarMensaje("Pregunta 1.3: Debe Ingresar número");
                valido = false;
            } else if (Integer.parseInt(C5_P1_2_3) > 100) {
                mostrarMensaje("Pregunta 1.3: Solo puede Ingresar Numeros del 1 al 100 (Porcentaje) ");
                valido = false;
            } else if ((C5_P1_1_4 == 0 && C5_P1_2_4==null) || (C5_P1_1_4 == 1 && C5_P1_2_4==null)) {
                mostrarMensaje("Pregunta 1.4: Debe Ingresar número");
                valido = false;
            } else if (Integer.parseInt(C5_P1_2_4) > 100) {
                mostrarMensaje("Pregunta 1.4: Solo puede Ingresar Numeros del 1 al 100 (Porcentaje) ");
                valido = false;
            } else if ((C5_P1_1_5 == 0 && C5_P1_2_5==null) || (C5_P1_1_5 == 1 && C5_P1_2_5==null)) {
                mostrarMensaje("Pregunta 1.5: Debe Ingresar número");
                valido = false;
            } else if (Integer.parseInt(C5_P1_2_5) > 100) {
                mostrarMensaje("Pregunta 1.5: Solo puede Ingresar Numeros del 1 al 100 (Porcentaje) ");
                valido = false;
            } else if ((C5_P1_1_6 == 0 && C5_P1_2_6==null) || (C5_P1_1_6 == 1 && C5_P1_2_6==null)) {
                mostrarMensaje("Pregunta 1.6: Debe Ingresar número");
                valido = false;
            } else if (Integer.parseInt(C5_P1_2_6) > 100) {
                mostrarMensaje("Pregunta 1.6: Solo puede Ingresar Numeros del 1 al 100 (Porcentaje) ");
                valido = false;
            } else if ((C5_P1_1_7 == 0 && C5_P1_2_7==null) || (C5_P1_1_7 == 1 && C5_P1_2_7==null)) {
                mostrarMensaje("Pregunta 1.7: Debe Ingresar número");
                valido = false;
            } else if (Integer.parseInt(C5_P1_2_7) > 100) {
                mostrarMensaje("Pregunta 1.7: Solo puede Ingresar Numeros del 1 al 100 (Porcentaje) ");
                valido = false;
            } else if ((C5_P1_1_8 == 0 && C5_P1_2_8==null) || (C5_P1_1_8 == 1 && C5_P1_2_8==null)) {
                mostrarMensaje("Pregunta 1.8: Debe Ingresar número");
                valido = false;
            } else if (Integer.parseInt(C5_P1_2_8) > 100) {
                mostrarMensaje("Pregunta 1.8: Solo puede Ingresar Numeros del 1 al 100 (Porcentaje) ");
                valido = false;
            } else if ((C5_P1_1_9 == 0 && C5_P1_2_9==null) || (C5_P1_1_9 == 1 && C5_P1_2_9==null)) {
                mostrarMensaje("Pregunta 1.9: Debe Ingresar número");
                valido = false;
            } else if (Integer.parseInt(C5_P1_2_9) > 100) {
                mostrarMensaje("Pregunta 1.9: Solo puede Ingresar Numeros del 1 al 100 (Porcentaje) ");
                valido = false;
            }else if (Integer.parseInt(C5_P1_2_10)!=C2_P1){
                mostrarMensaje("El total de los grandes grupos ocupacionales no coincide con el \n" +
                        "Número de trabajadores actualmente, registrados en el CAP 2 Pregunta 1");
                valido = false;
            }

        }



//        //cabecera
//        if (C5_P0_1.trim().length() != 0) vC5_P0_1 = true;
//        if (C5_P0_2 >= 1 && C5_P0_2 <= 4) {
//            vC5_P0_2 = true;
//            if (C5_P0_2 == 4) {
//                if (C5_P0_3.trim().length() != 0) vC5_P0_3 = true;
//            } else vC5_P0_3 = true;
//        }
//
//        //P1
//        if (C5_P1 >= 0 && C5_P1 <= 1) {
//            vC5_P1 = true;
//        }
//        if (C5_P1_2_1.trim().length() != 0) vC5_P1_1 = true;
//        if (C5_P1_2_2.trim().length() != 0) vC5_P1_2 = true;
//        if (C5_P1_2_3.trim().length() != 0) vC5_P1_3 = true;
//        if (C5_P1_2_4.trim().length() != 0) vC5_P1_4 = true;
//        if (C5_P1_2_5.trim().length() != 0) vC5_P1_5 = true;
//        if (C5_P1_2_6.trim().length() != 0) vC5_P1_6 = true;
//        if (C5_P1_2_7.trim().length() != 0) vC5_P1_7 = true;
//        if (C5_P1_2_8.trim().length() != 0) vC5_P1_8 = true;
//        if (C5_P1_2_9.trim().length() != 0) vC5_P1_9 = true;
//
//
//        valido = vC5_P0_1 && vC5_P0_2 && vC5_P0_3 && vC5_P1
//                //&&  vC5_P3
////                & vC5_P3_1 & vC5_P3_2 & vC5_P3_3  &vC5_P3_4 & vC5_P3_5 & vC5_P3_6
////                & vC5_P3_7 & vC5_P3_8 & vC5_P3_9
//        ;
//        if (!valido)
//            mostrarMensaje( "DEBE LLENAR TODOS LOS DATOS", Toast.LENGTH_SHORT).show();
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
