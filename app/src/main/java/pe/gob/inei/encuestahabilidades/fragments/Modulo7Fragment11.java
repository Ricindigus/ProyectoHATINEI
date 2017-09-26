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
import pe.gob.inei.encuestahabilidades.pojos.Modulo7;

/**
 * A simple {@link Fragment} subclass.
 */
public class Modulo7Fragment11 extends Fragment {

    private LinearLayout mod7_layoutFragment11;
    private LinearLayout mod7_p37_lyt;
    private LinearLayout mod7_p39_lyt;
    private EditText mod7_p37_edt;
    private LinearLayout mod7_p38_lyt;
    private CheckBox mod7_p38_ck1;
    private CheckBox mod7_p38_ck2;
    private CheckBox mod7_p38_ck3;
    private CheckBox mod7_p38_ck4;
    private CheckBox mod7_p38_ck5;
    private Spinner mod7_p38_sp1;
    private Spinner mod7_p38_sp2;
    private Spinner mod7_p38_sp3;
    private Spinner mod7_p38_sp4;
    private Spinner mod7_p38_sp5;
    private EditText mod7_p38_ck5_edt;
    private LinearLayout mod7_p38_ly1;
    private LinearLayout mod7_p38_ly2;
    private LinearLayout mod7_p38_ly3;
    private LinearLayout mod7_p38_ly4;
    private LinearLayout mod7_p38_ly5;
    private RadioGroup mod7_p39_rgb;
    private RadioButton mod7_p39_rgb1;
    private RadioButton mod7_p39_rgb2;
    private RadioButton mod7_p39_rgb3;
    private RadioButton mod7_p39_rgb4;
    private RadioButton mod7_p39_rgb5;
    private RadioButton mod7_p39_rgb6;
    private RadioButton mod7_p39_rgb7;
    private EditText mod7_p39_edtEspecifique;

    private String idempresa;
    private Modulo7 modulo7;
    private Context context;
    private Data data;

    //mapeo de variables
    int C7_P37=0;int C7_P38_1_1;int C7_P38_1_2;int C7_P38_1_3;int C7_P38_1_4;int C7_P38_1_5;String C7_P38_1_5_0;
    int C7_P38_2_1;int C7_P38_2_2;int C7_P38_2_3;int C7_P38_2_4;int C7_P38_2_5;int C7_P39;String C7_P39_O;

    public Modulo7Fragment11() {
        // Required empty public constructor
    }

    @SuppressLint("ValidFragment")
    public Modulo7Fragment11(String idempresa, Context context) {
        this.idempresa = idempresa;
        this.context = context;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_modulo7_fragment11, container, false);
        mod7_layoutFragment11 = (LinearLayout) rootView.findViewById(R.id.mod7_layoutFragment15);
        mod7_p37_lyt = (LinearLayout) rootView.findViewById(R.id.mod7_p37_lyt);
        mod7_p39_lyt = (LinearLayout) rootView.findViewById(R.id.mod7_p39_lyt);
        mod7_p37_edt = (EditText) rootView.findViewById(R.id.mod7_p37_edt);


        mod7_p38_lyt = (LinearLayout) rootView.findViewById(R.id.mod7_p38_lyt);

        mod7_p38_ck1 = (CheckBox) rootView.findViewById(R.id.mod7_p38_ck1);
        mod7_p38_ck2 = (CheckBox) rootView.findViewById(R.id.mod7_p38_ck2);
        mod7_p38_ck3 = (CheckBox) rootView.findViewById(R.id.mod7_p38_ck3);
        mod7_p38_ck4 = (CheckBox) rootView.findViewById(R.id.mod7_p38_ck4);
        mod7_p38_ck5 = (CheckBox) rootView.findViewById(R.id.mod7_p38_ck5);
        mod7_p38_sp1 = (Spinner) rootView.findViewById(R.id.mod7_p38_sp1);
        mod7_p38_sp2 = (Spinner) rootView.findViewById(R.id.mod7_p38_sp2);
        mod7_p38_sp3 = (Spinner) rootView.findViewById(R.id.mod7_p38_sp3);
        mod7_p38_sp4 = (Spinner) rootView.findViewById(R.id.mod7_p38_sp4);
        mod7_p38_sp5 = (Spinner) rootView.findViewById(R.id.mod7_p38_sp5);
        mod7_p38_ck5_edt = (EditText) rootView.findViewById(R.id.mod7_p38_ck5_edt);
        mod7_p38_ly1 = (LinearLayout) rootView.findViewById(R.id.mod7_p38_ly1);
        mod7_p38_ly2 = (LinearLayout) rootView.findViewById(R.id.mod7_p38_ly2);
        mod7_p38_ly3 = (LinearLayout) rootView.findViewById(R.id.mod7_p38_ly3);
        mod7_p38_ly4 = (LinearLayout) rootView.findViewById(R.id.mod7_p38_ly4);
        mod7_p38_ly5 = (LinearLayout) rootView.findViewById(R.id.mod7_p38_ly5);
        mod7_p39_rgb = (RadioGroup) rootView.findViewById(R.id.mod7_p39_rgb);
        mod7_p39_rgb1 = (RadioButton) rootView.findViewById(R.id.mod7_p39_rgb1);
        mod7_p39_rgb2 = (RadioButton) rootView.findViewById(R.id.mod7_p39_rgb2);
        mod7_p39_rgb3 = (RadioButton) rootView.findViewById(R.id.mod7_p39_rgb3);
        mod7_p39_rgb4 = (RadioButton) rootView.findViewById(R.id.mod7_p39_rgb4);
        mod7_p39_rgb5 = (RadioButton) rootView.findViewById(R.id.mod7_p39_rgb5);
        mod7_p39_rgb6 = (RadioButton) rootView.findViewById(R.id.mod7_p39_rgb6);
        mod7_p39_rgb7 = (RadioButton) rootView.findViewById(R.id.mod7_p39_rgb7);
        mod7_p39_edtEspecifique = (EditText) rootView.findViewById(R.id.mod7_p39_edtEspecifique);

        return rootView;
    }

    @Override
    public void onViewCreated(final View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        final CheckBox[] checkP38 = {mod7_p38_ck1, mod7_p38_ck2, mod7_p38_ck3, mod7_p38_ck4, mod7_p38_ck5};
        final Spinner[] spnP38 = {mod7_p38_sp1, mod7_p38_sp2, mod7_p38_sp3, mod7_p38_sp4, mod7_p38_sp5};
        final LinearLayout[] layoutP38 = {mod7_p38_ly1, mod7_p38_ly2, mod7_p38_ly3, mod7_p38_ly4,mod7_p38_ly5};

        //SELECCION DE  SPINNER
        for(int i = 0; i <checkP38.length ; i++) {
            final int posicion = i;
            CheckBox checkBox = checkP38[i];
            spnP38[i].setEnabled(false);
            layoutP38[i].setBackgroundResource(R.drawable.fondo_spinner_disabled);
            if(i!=18){
                final Spinner spinner = spnP38[i];
                final LinearLayout linearLayout = layoutP38[i];
                checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if(b){
                            if(verificarCheck(spnP38)){
                                spinner.setEnabled(false);
                                linearLayout.setBackgroundResource(R.drawable.fondo_spinner_disabled);
                            }else{
                                spinner.setEnabled(true);
                                linearLayout.setBackgroundResource(R.drawable.fondo_spinner);
                            }
                            if(posicion==0){
                                mod7_p39_lyt.setVisibility(View.GONE);
                                mod7_p39_rgb.clearCheck();
                            }
                        }else{
                            spinner.setSelection(0);
                            linearLayout.setBackgroundResource(R.drawable.fondo_spinner_disabled);
                            spinner.setEnabled(false);
                            if(posicion==0){
                                mod7_p39_lyt.setVisibility(View.VISIBLE);
                            }
                        }
                    }
                });
            }
        }

        if(!mod7_p38_ck1.isChecked()){
            mod7_p39_lyt.setVisibility(View.VISIBLE);
        }else{
            mod7_p39_lyt.setVisibility(View.GONE);
            mod7_p39_rgb.clearCheck();
        }

        for (int i = 0; i <spnP38.length ; i++) {
            final int posicion= i;
            final Spinner spinner = spnP38[i];
            spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> adapterView, View view, int pos, long l) {
                    switch (pos){
                        case 0: restaurarSpinner(checkP38,spnP38,layoutP38);break;
                        case 1: validarSpiner(spnP38,layoutP38,posicion,1); break;
                        case 2: validarSpiner(spnP38,layoutP38,posicion,2); break;
                        case 3: validarSpiner(spnP38,layoutP38,posicion,3); break;
                    }
                }
                @Override
                public void onNothingSelected(AdapterView<?> adapterView) {}
            });
        }

        if(!mod7_p38_ck5.isChecked()){
            //mod7_p38_ck5_edt.setText("");
            mod7_p38_ck5_edt.setBackgroundResource(R.drawable.cajas_de_texto_disabled);
            mod7_p38_ck5_edt.setEnabled(false);
            mod7_p38_sp5.setSelection(0);
            mod7_p38_ly5.setBackgroundResource(R.drawable.fondo_spinner_disabled);
            mod7_p38_sp5.setEnabled(false);
        }
        mod7_p38_ck5_edt.setFilters(new InputFilter[]{new InputFilter.AllCaps()});
        mod7_p38_ck5.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    mod7_p38_ck5_edt.setEnabled(true);
                    mod7_p38_ck5_edt.setBackgroundResource(R.drawable.fondo_edit_text);
                    if(verificarCheck(spnP38)){
                        mod7_p38_sp5.setEnabled(false);
                        mod7_p38_ly5.setBackgroundResource(R.drawable.fondo_spinner_disabled);
                    }else{
                        mod7_p38_sp5.setEnabled(true);
                        mod7_p38_ly5.setBackgroundResource(R.drawable.fondo_spinner);
                    }
                }else{
                    mod7_p38_ck5_edt.setText("");
                    mod7_p38_ck5_edt.setBackgroundResource(R.drawable.cajas_de_texto_disabled);
                    mod7_p38_ck5_edt.setEnabled(false);
                    mod7_p38_sp5.setSelection(0);
                    mod7_p38_ly5.setBackgroundResource(R.drawable.fondo_spinner_disabled);
                    mod7_p38_sp5.setEnabled(false);
                }
            }
        });


        //CAMPOS CON MAYUSCULAS
        mod7_p38_ck5_edt.setFilters(new InputFilter[]{new InputFilter.AllCaps() });
        mod7_p37_edt.setTransformationMethod(new NumericKeyBoardTransformationMethod());

        //PREGUNTA 37 VALIDACIONES RANGOS 1 - 100
        mod7_p37_edt.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {            }

            @Override
            public void afterTextChanged(Editable editable) {
                if (!editable.toString().equals("")) {
                    if (Integer.parseInt(mod7_p37_edt.getText().toString()) >= 101) {
                        Toast.makeText(context, "Debe registrar un porcentaje valido", Toast.LENGTH_SHORT).show();
                        mod7_p37_edt.requestFocus();
                        mod7_p37_edt.setText("");
                    }
                }
            }
        });

        mod7_p39_edtEspecifique.setVisibility(View.GONE);
        mod7_p39_rgb.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, @IdRes int i) {
                switch (i){
                    case R.id.mod7_p39_rgb1:mod7_p39_edtEspecifique.setVisibility(View.GONE); break;
                    case R.id.mod7_p39_rgb2:mod7_p39_edtEspecifique.setVisibility(View.GONE); break;
                    case R.id.mod7_p39_rgb3:mod7_p39_edtEspecifique.setVisibility(View.GONE); break;
                    case R.id.mod7_p39_rgb4:mod7_p39_edtEspecifique.setVisibility(View.GONE); break;
                    case R.id.mod7_p39_rgb5:mod7_p39_edtEspecifique.setVisibility(View.GONE); break;
                    case R.id.mod7_p39_rgb6:mod7_p39_edtEspecifique.setVisibility(View.GONE); break;
                    case R.id.mod7_p39_rgb7:
                        mod7_p39_edtEspecifique.setVisibility(View.VISIBLE);
                        mod7_p39_edtEspecifique.requestFocus();
                        break;
                }
                mod7_p39_edtEspecifique.setText("");
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

    public void validarSpiner(Spinner[] spinners, LinearLayout[] layoutSpinners,int posicion, int valor){
        List<Spinner> sLista= new ArrayList<Spinner>();
        for(int i = 0; i <spinners.length ; i++) {
            Spinner spinner = spinners[i];
            if(spinner.getSelectedItemPosition()!=0){
                sLista.add(spinner);
                if(i!=posicion){
                    if(Integer.parseInt(spinner.getSelectedItem().toString()) == valor){
                        spinners[posicion].setSelection(0);
                        if(valor == 1){
                            Toast.makeText(getActivity().getApplicationContext(),
                                    "No puede dos fuentes que indiquen 1 como más importante",Toast.LENGTH_SHORT).show();
                        }else if(valor == 2){
                            Toast.makeText(getActivity().getApplicationContext(),
                                    "No puede dos fuentes que indiquen 2 como el segundo más importante",Toast.LENGTH_SHORT).show();
                        }else if(valor == 3) {
                            Toast.makeText(getActivity().getApplicationContext(),
                                    "No puede dos fuentes que indiquen 3 como el tercer más importante",Toast.LENGTH_SHORT).show();
                        }
                    }
                }
                if(sLista.size() == 2){
                    verificarSpiner(spinners,layoutSpinners);
                }
            }
        }
    }

    public void verificarSpiner(Spinner[] spinners, LinearLayout[] layoutSpinners){
        for(int i = 0; i <spinners.length ; i++) {
            Spinner spn = spinners[i];
            if(spn.getSelectedItemPosition()==0){
                spn.setEnabled(false);
                layoutSpinners[i].setBackgroundResource(R.drawable.fondo_spinner_disabled);
            }
        }
    }

    public void restaurarSpinner(CheckBox[] checkBoxes, Spinner[] spinners, LinearLayout[] layoutSpinners){
        for(int i = 0; i <checkBoxes.length ; i++) {
            CheckBox checkBox = checkBoxes[i];
            final Spinner spinner = spinners[i];
            final LinearLayout linearLayout = layoutSpinners[i];
            if(checkBox.isChecked()){
                spinner.setEnabled(true);
                linearLayout.setBackgroundResource(R.drawable.fondo_spinner);
            }
        }
    }

    public boolean verificarCheck(Spinner[] spinners){
        boolean t=false;
        List<Spinner> sLista= new ArrayList<Spinner>();
        for(int i = 0; i < spinners.length ; i++) {
            Spinner spn = spinners[i];
            if(spn.getSelectedItemPosition()!= 0){
                sLista.add(spn);
            }
        }
        if(sLista.size()==2) t=true;
        return t;
    }

    public void cargarDatos(){
        data = new Data(context);
        data.open();
        //verifico si ya existe un objeto con datos llenados previamente
        if(data.existeModulo7(idempresa)){
            //si existe traigo el objeto
            modulo7 = data.getModulo7(idempresa);

            //p37
            mod7_p37_edt.setText(modulo7.getC7_P37());

            //p38
            if(modulo7.getC7_P38_1_1().equals("1")) mod7_p38_ck1.setChecked(true);
            if(modulo7.getC7_P38_1_1().equals("0")) mod7_p38_ck1.setChecked(false);
            if(!modulo7.getC7_P38_2_1().equals("")){
                mod7_p38_sp1.setSelection(Integer.parseInt(modulo7.getC7_P38_2_1()));
            }

            if(modulo7.getC7_P38_1_2().equals("1")) mod7_p38_ck2.setChecked(true);
            if(modulo7.getC7_P38_1_2().equals("0")) mod7_p38_ck2.setChecked(false);
            if(!modulo7.getC7_P38_2_2().equals("")){
                mod7_p38_sp2.setSelection(Integer.parseInt(modulo7.getC7_P38_2_2()));
            }

            if(modulo7.getC7_P38_1_3().equals("1")) mod7_p38_ck3.setChecked(true);
            if(modulo7.getC7_P38_1_3().equals("0")) mod7_p38_ck3.setChecked(false);
            if(!modulo7.getC7_P38_2_3().equals("")) {
                mod7_p38_sp3.setSelection(Integer.parseInt(modulo7.getC7_P38_2_3()));
            }

            if(modulo7.getC7_P38_1_4().equals("1")) mod7_p38_ck4.setChecked(true);
            if(modulo7.getC7_P38_1_4().equals("0")) mod7_p38_ck4.setChecked(false);
            if(!modulo7.getC7_P38_2_4().equals("")) {
                mod7_p38_sp4.setSelection(Integer.parseInt(modulo7.getC7_P38_2_4()));
            }

            if(modulo7.getC7_P38_1_5().equals("1")) mod7_p38_ck5.setChecked(true);
            if(modulo7.getC7_P38_1_5().equals("0")) mod7_p38_ck5.setChecked(false);
            if(!modulo7.getC7_P38_2_5().equals("")) {
                mod7_p38_sp5.setSelection(Integer.parseInt(modulo7.getC7_P38_2_5()));
            }
            mod7_p38_ck5_edt.setText(modulo7.getC7_P38_1_5_0());

            //p39
            if(!modulo7.getC7_P39().equals("") && !modulo7.getC7_P39().equals("-1")) {
                int childPos39 = Integer.parseInt(modulo7.getC7_P39());
                ((RadioButton)mod7_p39_rgb.getChildAt(childPos39)).setChecked(true);
            }
            mod7_p39_edtEspecifique.setText(modulo7.getC7_P39_0());

        }
        data.close();
    }
    public void llenarMapaVariables(){
        if(!mod7_p37_edt.getText().toString().equals("")) {
            C7_P37 = Integer.parseInt(mod7_p37_edt.getText().toString());
        }

        if(mod7_p38_ck1.isChecked())C7_P38_1_1 = 1;
        else C7_P38_1_1 = 0;
        C7_P38_2_1=mod7_p38_sp1.getSelectedItemPosition();

        if(mod7_p38_ck2.isChecked())C7_P38_1_2 = 1;
        else C7_P38_1_2 = 0;
        C7_P38_2_2=mod7_p38_sp2.getSelectedItemPosition();

        if(mod7_p38_ck3.isChecked())C7_P38_1_3 = 1;
        else C7_P38_1_3 = 0;
        C7_P38_2_3=mod7_p38_sp3.getSelectedItemPosition();

        if(mod7_p38_ck4.isChecked())C7_P38_1_4 = 1;
        else C7_P38_1_4 = 0;
        C7_P38_2_4=mod7_p38_sp4.getSelectedItemPosition();

        if(mod7_p38_ck5.isChecked())C7_P38_1_5 = 1;
        else C7_P38_1_5 = 0;
        C7_P38_2_5=mod7_p38_sp5.getSelectedItemPosition();
        C7_P38_1_5_0 = mod7_p38_ck5_edt.getText().toString();

        int childPosP39 = mod7_p39_rgb.indexOfChild(mod7_p39_rgb.findViewById(mod7_p39_rgb.getCheckedRadioButtonId()));
        C7_P39 = childPosP39;
        C7_P39_O = mod7_p39_edtEspecifique.getText().toString();

    }
    public void guardarDatos(){
        data = new Data(context);
        data.open();
        if(data.existeModulo7(idempresa)){
            ContentValues contentValues = new ContentValues(255);
            contentValues.put(SQLConstantes.MODULO7_P37,C7_P37+"");
            contentValues.put(SQLConstantes.MODULO7_P38_1_1,C7_P38_1_1+"");
            contentValues.put(SQLConstantes.MODULO7_P38_1_2,C7_P38_1_2+"");
            contentValues.put(SQLConstantes.MODULO7_P38_1_3,C7_P38_1_3+"");
            contentValues.put(SQLConstantes.MODULO7_P38_1_4,C7_P38_1_4+"");
            contentValues.put(SQLConstantes.MODULO7_P38_1_5,C7_P38_1_5+"");
            contentValues.put(SQLConstantes.MODULO7_P38_1_5_0,C7_P38_1_5_0);
            contentValues.put(SQLConstantes.MODULO7_P38_2_1,C7_P38_2_1+"");
            contentValues.put(SQLConstantes.MODULO7_P38_2_2,C7_P38_2_2+"");
            contentValues.put(SQLConstantes.MODULO7_P38_2_3,C7_P38_2_3+"");
            contentValues.put(SQLConstantes.MODULO7_P38_2_4,C7_P38_2_4+"");
            contentValues.put(SQLConstantes.MODULO7_P38_2_5,C7_P38_2_5+"");
            contentValues.put(SQLConstantes.MODULO7_P39,C7_P39+"");
            contentValues.put(SQLConstantes.MODULO7_P39_0,C7_P39_O);
            data.actualizarModulo7(idempresa,contentValues);
        }else{
            //si no existe el elemento, lo construye para insertarlo
            modulo7 = new Modulo7();
            //llena el objeto a insertar
            modulo7.setMODULO7_ID(idempresa);
            modulo7.setC7_P37(C7_P37+"");
            modulo7.setC7_P38_1_1(C7_P38_1_1+"");
            modulo7.setC7_P38_1_2(C7_P38_1_2+"");
            modulo7.setC7_P38_1_3(C7_P38_1_3+"");
            modulo7.setC7_P38_1_4(C7_P38_1_4+"");
            modulo7.setC7_P38_1_5(C7_P38_1_5+"");
            modulo7.setC7_P38_1_5_0(C7_P38_1_5_0+"");
            modulo7.setC7_P38_2_1(C7_P38_2_1+"");
            modulo7.setC7_P38_2_2(C7_P38_2_2+"");
            modulo7.setC7_P38_2_3(C7_P38_2_3+"");
            modulo7.setC7_P38_2_4(C7_P38_2_4+"");
            modulo7.setC7_P38_2_5(C7_P38_2_5+"");
            modulo7.setC7_P39(C7_P39+"");
            modulo7.setC7_P39_0(C7_P39_O);

            data.insertarModulo7(modulo7);
        }
        data.close();
    }

    public boolean validarGuardadoSpiner(Integer[] checkBoxs, Integer[] spinners,Integer posNinguna){
        boolean valor=false;
        int checks = 0;
        int spnTotal=0;
        for(int i=0; i < checkBoxs.length ; i++ ) {
            if(i!=posNinguna && checkBoxs[i]==1){
                checks++;
                spnTotal=spnTotal+spinners[i];
            }
        }
        if(checks==1 && spnTotal==1 || checks>=2 && spnTotal==3 ){
            valor=false;
        }else  valor=true;

        return valor;
    }

    public boolean validar(){

        boolean  vC7_P38=true;
        boolean valido=true;
        llenarMapaVariables();

        //p38
        Integer[] checkBoxs= {C7_P38_1_1,C7_P38_1_2,C7_P38_1_3,C7_P38_1_4,C7_P38_1_5 };
        Integer[] spinners= {C7_P38_2_1,C7_P38_2_2,C7_P38_2_3,C7_P38_2_4,C7_P38_2_5};

        //pregunta 38
        for (Integer valor:checkBoxs ) {
            if(valor==1)vC7_P38=false;
        }

//        if(C7_P37==0 ){
//            mostrarMensaje("Pregunta 37: Debe Ingresar datos");
//            valido=false;
//        }else
        if(vC7_P38){
            mostrarMensaje("Pregunta 38: Debe seleccionar una opción");
            valido=false;
        }else if(validarGuardadoSpiner(checkBoxs,spinners,-1)){
            mostrarMensaje("Pregunta 38: Debe ingresar datos válidos ");
            valido=false;
        }else if(C7_P38_1_5!=0 && C7_P38_1_5_0.trim().length() < 3){
            mostrarMensaje("Pregunta 38: Debe registrar información válida en Especifique");
            valido=false;
        }else  if(C7_P38_1_1==0 && C7_P39 ==-1){
            mostrarMensaje("Pregunta 39: Debe seleccionar una opción");
            valido=false;
        }else if(C7_P39==6 && C7_P39_O.trim().length() < 3){
            mostrarMensaje("Pregunta 39: Debe registrar información válida en Especifique");
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
