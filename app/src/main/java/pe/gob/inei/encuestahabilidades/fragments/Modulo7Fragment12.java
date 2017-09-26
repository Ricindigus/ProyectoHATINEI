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
import pe.gob.inei.encuestahabilidades.modelo.Data;
import pe.gob.inei.encuestahabilidades.modelo.SQLConstantes;
import pe.gob.inei.encuestahabilidades.pojos.Modulo7;

import static java.lang.String.valueOf;


/**
 * A simple {@link Fragment} subclass.
 */
public class Modulo7Fragment12 extends Fragment {


    private LinearLayout lytFragment;
    private LinearLayout mod7_p42_lyt;
    private LinearLayout mod7_p40;
    private LinearLayout mod7_p43_lyt;
    private LinearLayout mod7_p41_lyt;
    private LinearLayout mod7_p43_lyt1;
    private LinearLayout mod7_p40_lyt;

    private CheckBox mod7_p40_ck1;
    private CheckBox mod7_p40_ck2;
    private CheckBox mod7_p40_ck3;
    private CheckBox mod7_p40_ck4;
    private CheckBox mod7_p40_ck5;

    private RadioGroup mod7_p41_rgb;
    private RadioButton mod7_p41_rgb1;
    private RadioButton mod7_p41_rgb2;

    private RadioGroup mod7_p42_rgb;
    private RadioButton mod7_p42_rgb1;
    private RadioButton mod7_p42_rgb2;

    private EditText mod7_p43_edt1;
    private EditText mod7_p43_edt2;

    private String idempresa;
    private Modulo7 modulo7;

    private Context context;
    private Data data;

    //mapeo de variables
    int C7_P40_1;
    int C7_P40_2;
    int C7_P40_3;
    int C7_P40_4;
    int C7_P40_5;
    int C7_P41;
    int C7_P42;
    String C7_P43_1;
    String C7_P43_2;
    int C7_P38_1_1;


    public Modulo7Fragment12() {
        // Required empty public constructor
    }

    @SuppressLint("ValidFragment")
    public Modulo7Fragment12(String idempresa, Context context) {
        this.idempresa = idempresa;
        this.context = context;

        data = new Data(context);
        data.open();

        modulo7 = data.getModulo7(idempresa);
        C7_P38_1_1=Integer.parseInt(modulo7.getC7_P38_1_1());
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView =  inflater.inflate(R.layout.fragment_modulo7_fragment12, container, false);
        lytFragment = (LinearLayout) rootView.findViewById(R.id.mod7_layoutFragment16);
        mod7_p40 = (LinearLayout) rootView.findViewById(R.id.mod7_p40);
        mod7_p40_lyt = (LinearLayout) rootView.findViewById(R.id.mod7_p40_lyt);
        mod7_p41_lyt = (LinearLayout) rootView.findViewById(R.id.mod7_p41_lyt);
        mod7_p42_lyt = (LinearLayout) rootView.findViewById(R.id.mod7_p42_lyt);
        mod7_p43_lyt = (LinearLayout) rootView.findViewById(R.id.mod7_p43_lyt);
        mod7_p43_lyt1 = (LinearLayout) rootView.findViewById(R.id.mod7_p43_lyt1);

        mod7_p40_ck1 = (CheckBox) rootView.findViewById(R.id.mod7_p40_ck1);
        mod7_p40_ck2 = (CheckBox) rootView.findViewById(R.id.mod7_p40_ck2);
        mod7_p40_ck3 = (CheckBox) rootView.findViewById(R.id.mod7_p40_ck3);
        mod7_p40_ck4 = (CheckBox) rootView.findViewById(R.id.mod7_p40_ck4);
        mod7_p40_ck5 = (CheckBox) rootView.findViewById(R.id.mod7_p40_ck5);

        mod7_p41_rgb = (RadioGroup) rootView.findViewById(R.id.mod7_p41_rgb);
        mod7_p41_rgb1 =  (RadioButton) rootView.findViewById(R.id.mod7_p41_rgb1);
        mod7_p41_rgb2 = (RadioButton) rootView.findViewById(R.id.mod7_p41_rgb2);

        mod7_p42_rgb = (RadioGroup) rootView.findViewById(R.id.mod7_p42_rgb);
        mod7_p42_rgb1 =  (RadioButton) rootView.findViewById(R.id.mod7_p42_rgb1);
        mod7_p42_rgb2 = (RadioButton) rootView.findViewById(R.id.mod7_p42_rgb2);

        mod7_p43_edt1 = (EditText) rootView.findViewById(R.id.mod7_p43_edt1);
        mod7_p43_edt2 = (EditText) rootView.findViewById(R.id.mod7_p43_edt2);

        return rootView;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        lytFragment.requestFocus();

        if(C7_P38_1_1!=0){
            mod7_p40_lyt.setVisibility(View.VISIBLE);
        }else{
            mod7_p40_lyt.setVisibility(View.GONE);
        }

        mod7_p43_edt1.setTransformationMethod(new NumericKeyBoardTransformationMethod());
        mod7_p43_edt2.setTransformationMethod(new NumericKeyBoardTransformationMethod());
        RadioGroup[] radioGroups = {mod7_p41_rgb,mod7_p42_rgb};

        //EditText[] editTexts = {mod7_p43_edt1,mod7_p43_edt2};

        CheckBox[] checkP40 = {mod7_p40_ck1,mod7_p40_ck2,mod7_p40_ck3 ,mod7_p40_ck4, mod7_p40_ck5};

        mod7_p43_edt1.setFilters(new InputFilter[]{new InputFilter.AllCaps()});
        mod7_p43_edt2.setFilters(new InputFilter[]{new InputFilter.AllCaps()});
        for (CheckBox c: checkP40) {
            c.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton compoundButton, boolean checkeado) {
                    if(checkeado) {
                        mod7_p40.setBackgroundColor(Color.TRANSPARENT);
                    }
                }
            });
        }


//        for (int i = 0; i < editTexts.length; i++) {
//            final EditText editText = editTexts[i];
//            editText.setTransformationMethod(new NumericKeyBoardTransformationMethod());
//            editText.setOnFocusChangeListener(new View.OnFocusChangeListener() {
//                @Override
//                public void onFocusChange(View view, boolean conFocus) {
//                    if(conFocus) {
//                        editText.setBackgroundResource(R.drawable.caja_texto_enabled);
//                        mostrarTeclado();
//                    }
//                    else editText.setBackgroundResource(R.drawable.cajas_de_texto);
//                }
//            });
//        }

        for (int i = 0; i < radioGroups.length; i++) {
            final RadioGroup radioGroup = radioGroups[i];
            radioGroup.setOnFocusChangeListener(new View.OnFocusChangeListener() {
                @Override
                public void onFocusChange(View view, boolean conFocus) {
                    if(conFocus) {
                        ocultarTeclado(radioGroup);
                        radioGroup.setBackgroundColor(Color.CYAN);
                    }
                    else if(view.isEnabled()){
                        radioGroup.setBackgroundColor(Color.TRANSPARENT);
                    }
                }
            });
        }
        mod7_p40.requestFocus();
        mod7_p40.setBackgroundColor(Color.CYAN);
        mod7_p41_rgb.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, @IdRes int i) {
                switch (i){
                    case R.id.mod7_p41_rgb1:
                        mod7_p42_lyt.setVisibility(View.VISIBLE);
                        mod7_p42_rgb.requestFocus();
                        mod7_p43_lyt.setVisibility(View.VISIBLE);
                        break;
                    case R.id.mod7_p41_rgb2:
                        mod7_p42_rgb.clearCheck();
                        mod7_p43_edt1.setText("");
                        mod7_p43_edt2.setText("");
                        mod7_p42_lyt.setVisibility(View.GONE);
                        mod7_p43_lyt.setVisibility(View.GONE);
                        break;
                }
            }
        });
        //PREGUNTA 42
        mod7_p42_rgb.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, @IdRes int i) {
                switch (i){
                    case R.id.mod7_p42_rgb1:
                        mod7_p43_lyt.setVisibility(View.VISIBLE);
                        mod7_p43_lyt.requestFocus();
                        mod7_p43_edt1.requestFocus();
                        mostrarTeclado();
                        break;
                    case R.id.mod7_p42_rgb2:
                        mod7_p43_edt1.setText("");
                        mod7_p43_edt2.setText("");
                        mod7_p43_lyt.setVisibility(View.GONE);
                        break;
                }
            }
        });
        //PREGUNTA 43
        mod7_p43_edt2.setBackgroundResource(R.drawable.cajas_de_texto);
        mod7_p43_edt2.setEnabled(true);

        mod7_p43_edt1.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) { }
            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) { }
            @Override
            public void afterTextChanged(Editable editable) {
                if(mod7_p43_edt1.getText().toString().equals("")){
//                    if(mod7_p43_edt1.getText().toString().equals("") || mod7_p43_edt1.getText().toString().equals("0")){
                    mod7_p43_edt2.setBackgroundResource(R.drawable.cajas_de_texto);
                    mod7_p43_edt2.setEnabled(true);
                }else{
                    mod7_p43_edt2.setBackgroundResource(R.drawable.cajas_de_texto_disabled);
                    mod7_p43_edt2.setEnabled(false);
                }
            }
        });

        mod7_p43_edt2.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) { }
            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) { }
            @Override
            public void afterTextChanged(Editable editable) {
                if(mod7_p43_edt2.getText().toString().equals("")){
//                    if(mod7_p43_edt2.getText().toString().equals("") || mod7_p43_edt2.getText().toString().equals("0")){
                    mod7_p43_edt1.setBackgroundResource(R.drawable.cajas_de_texto);
                    mod7_p43_edt1.setEnabled(true);
                }else{
                    mod7_p43_edt1.setBackgroundResource(R.drawable.cajas_de_texto_disabled);
                    mod7_p43_edt1.setEnabled(false);
                }

                if (!editable.toString().equals("") && mod7_p43_edt1.getText().toString().equals("")) {
                    if (Integer.parseInt(mod7_p43_edt2.getText().toString()) >= 101 || Integer.parseInt(mod7_p43_edt2.getText().toString()) == 0) {
                        Toast.makeText(context, "Debe registrar un porcentaje valido", Toast.LENGTH_SHORT).show();
                        mod7_p43_edt2.requestFocus();
                        mod7_p43_edt2.setText("");
                    }
                }
            }
        });

        cargarDatos();
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


    public void cargarDatos(){
        data = new Data(context);
        data.open();
        //verifico si ya existe un objeto con datos llenados previamente
        if(data.existeModulo7(idempresa)){
            //si existe traigo el objeto
            modulo7 = data.getModulo7(idempresa);

            //----------- Pregunta 40 ---------------//
            //--- 40.1
            if(modulo7.getC7_P40_1().equals("1")) mod7_p40_ck1.setChecked(true);
            if(modulo7.getC7_P40_1().equals("0")) mod7_p40_ck1.setChecked(false);
            //--- 40.2
            if(modulo7.getC7_P40_2().equals("1")) mod7_p40_ck2.setChecked(true);
            if(modulo7.getC7_P40_2().equals("0")) mod7_p40_ck2.setChecked(false);
            //--- 40.3
            if(modulo7.getC7_P40_3().equals("1")) mod7_p40_ck3.setChecked(true);
            if(modulo7.getC7_P40_3().equals("0")) mod7_p40_ck3.setChecked(false);
            //--- 40.4
            if(modulo7.getC7_P40_4().equals("1")) mod7_p40_ck4.setChecked(true);
            if(modulo7.getC7_P40_4().equals("0")) mod7_p40_ck4.setChecked(false);
            //--- 40.5
            if(modulo7.getC7_P40_5().equals("1")) mod7_p40_ck5.setChecked(true);
            if(modulo7.getC7_P40_5().equals("0")) mod7_p40_ck5.setChecked(false);

            //pregunta 41
            if(!modulo7.getC7_P41().equals("") && !modulo7.getC7_P41().equals("-1")){
                ((RadioButton)mod7_p41_rgb.getChildAt(Integer.parseInt(modulo7.getC7_P41()))).setChecked(true);
            }

            //pregunta 42
            if(!modulo7.getC7_P42().equals("") && !modulo7.getC7_P42().equals("-1")){
                ((RadioButton)mod7_p42_rgb.getChildAt(Integer.parseInt(modulo7.getC7_P42()))).setChecked(true);
            }

//            //pregunta 43.1
//            if (modulo7.getC7_P43_1()==""){
//                mod7_p43_edt1.setText("");
//            }else{
//                mod7_p43_edt1.setText(modulo7.getC7_P43_1());
//            }

//            //pregunta 43.2
//            if (modulo7.getC7_P43_2()==""){
//                mod7_p43_edt2.setText("");
//            }else{
//                mod7_p43_edt2.setText(modulo7.getC7_P43_2());
//            }

            //pregunta 43.1
            mod7_p43_edt1.setText(modulo7.getC7_P43_1());
            //pregunta 43.2
            mod7_p43_edt2.setText(modulo7.getC7_P43_2());

        }
        data.close();
    }
    public void llenarMapaVariables(){

        //pregunta 40.1
        if(mod7_p40_ck1.isChecked())C7_P40_1 = 1;
        else C7_P40_1 = 0;
        //pregunta 40.2
        if(mod7_p40_ck2.isChecked())C7_P40_2 = 1;
        else C7_P40_2 = 0;
        //pregunta 40.3
        if(mod7_p40_ck3.isChecked())C7_P40_3 = 1;
        else C7_P40_3 = 0;
        //pregunta 40.4
        if(mod7_p40_ck4.isChecked())C7_P40_4 = 1;
        else C7_P40_4 = 0;
        //pregunta 40.5
        if(mod7_p40_ck5.isChecked())C7_P40_5 = 1;
        else C7_P40_5 = 0;

        //pregunta 41
        int childPosP41 = mod7_p41_rgb.indexOfChild(mod7_p41_rgb.findViewById(mod7_p41_rgb.getCheckedRadioButtonId()));
        C7_P41 = childPosP41;

        //pregunta 42
        int childPosP42 = mod7_p42_rgb.indexOfChild(mod7_p42_rgb.findViewById(mod7_p42_rgb.getCheckedRadioButtonId()));
        C7_P42 = childPosP42;

//        //pregunta 43.1
//        if(!mod7_p43_edt1.getText().toString().equals("")){
//            C7_P43_1= mod7_p43_edt1.getText().toString();
//        }
//        //pregunta 43.2
//        if(!mod7_p43_edt2.getText().toString().equals("")){
//            C7_P43_2= mod7_p43_edt2.getText().toString();
//        }

        C7_P43_1 = mod7_p43_edt1.getText().toString();
        C7_P43_2 = mod7_p43_edt2.getText().toString();

    }

    public void guardarDatos(){
        data = new Data(context);
        data.open();
        if(data.existeModulo7(idempresa)){
            ContentValues contentValues = new ContentValues(255);
            contentValues.put(SQLConstantes.MODULO7_P40_1,C7_P40_1+"");
            contentValues.put(SQLConstantes.MODULO7_P40_2,C7_P40_2+"");
            contentValues.put(SQLConstantes.MODULO7_P40_3,C7_P40_3+"");
            contentValues.put(SQLConstantes.MODULO7_P40_4,C7_P40_4+"");
            contentValues.put(SQLConstantes.MODULO7_P40_5,C7_P40_5+"");
            contentValues.put(SQLConstantes.MODULO7_P41,C7_P41+"");
            contentValues.put(SQLConstantes.MODULO7_P42,C7_P42+"");
            contentValues.put(SQLConstantes.MODULO7_P43_1,C7_P43_1);
            contentValues.put(SQLConstantes.MODULO7_P43_2,C7_P43_2);
            data.actualizarModulo7(idempresa,contentValues);
        }else{
            //si no existe el elemento, lo construye para insertarlo
            modulo7 = new Modulo7();
            //llena el objeto a insertar
            modulo7.setMODULO7_ID(idempresa);
            modulo7.setC7_P40_1(C7_P40_1+"");
            modulo7.setC7_P40_2(C7_P40_2+"");
            modulo7.setC7_P40_3(C7_P40_3+"");
            modulo7.setC7_P40_4(C7_P40_4+"");
            modulo7.setC7_P40_5(C7_P40_5+"");
            modulo7.setC7_P41(C7_P41+"");
            modulo7.setC7_P42(C7_P42+"");
            modulo7.setC7_P43_1(C7_P43_1);
            modulo7.setC7_P43_2(C7_P43_2);
            data.insertarModulo7(modulo7);
        }
        data.close();
    }


    public boolean validar(){
        //revisarcampos
        boolean valido = true, vC7_P40=true;

        llenarMapaVariables();

        Integer[] checkP40 = {C7_P40_1,C7_P40_2,C7_P40_3 ,C7_P40_4, C7_P40_5};
        for (Integer valor: checkP40 ) {
            if(valor==1)vC7_P40=false;
        }

        if(C7_P38_1_1==1 && vC7_P40 ){
            mostrarMensaje("Pregunta 40: Debe seleccionar una o más opciones ");
            valido=false;
        }else if(C7_P41 == -1){
            mostrarMensaje("Pregunta 41: Debe seleccionar una opción");
            valido=false;
        }else if(C7_P41 == 0 && C7_P42 == -1){
            mostrarMensaje("Pregunta 42: Debe seleccionar una opción");
            valido=false;
        }else  if(C7_P42==0 && C7_P43_1.trim().length() == 0 && C7_P43_2.trim().length() == 0){
            mostrarMensaje("Pregunta 43: Debe registrar número o porcentaje");
            valido=false;
        }else if(C7_P43_1.equals("0")){
            mostrarMensaje("Pregunta 43.1: Debe registrar un número mayor a cero");
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
