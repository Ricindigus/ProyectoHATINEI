package pe.gob.inei.encuestahabilidades.fragments;


import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
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
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import pe.gob.inei.encuestahabilidades.NumericKeyBoardTransformationMethod;
import pe.gob.inei.encuestahabilidades.R;
import pe.gob.inei.encuestahabilidades.modelo.Data;
import pe.gob.inei.encuestahabilidades.modelo.SQLConstantes;
import pe.gob.inei.encuestahabilidades.pojos.BaseDatos;
import pe.gob.inei.encuestahabilidades.pojos.Identificacion;
import pe.gob.inei.encuestahabilidades.pojos.Modulo1;
import pe.gob.inei.encuestahabilidades.pojos.Modulo2;

/**
 * A simple {@link Fragment} subclass.
 */
public class Modulo2Fragment1 extends Fragment {
    private LinearLayout lytP1;
    private LinearLayout lytP2;
    private LinearLayout lytP3;
    private LinearLayout lytP4;
    private LinearLayout lytP5;

    private TextView txtPregunta1;
    private TextView txtPregunta2;
    private TextView txtPregunta3;
    private TextView txtPregunta4;
    private TextView txtPregunta5;

    private LinearLayout lytFragment1;
    private CheckBox ckMismoInformante2;
    private EditText edtNombYApellidos2;
    private EditText edtEspecifiqueCargo2;
    private LinearLayout lytFondoSpinner2;
    private Spinner spCargo2;

    private EditText edtP1;
    private EditText edtP2;
    private EditText edtP3;
    private EditText edtP4;

    private EditText edt1;
    private EditText edt2;
    private EditText edt3;
    private EditText edt4;
    private EditText edt5;

    private CheckBox ck1;
    private CheckBox ck2;
    private CheckBox ck3;
    private CheckBox ck4;
    private CheckBox ck5;

    private TextView txtTotal;
    private Identificacion identificacion;
    String informante;
    String cargo="0";
    String cargos="";

    private String idempresa;
    private Modulo2 modulo2;
    private Context context;
    private Data data;

    private int C2_P0_0;
    private String C2_P0_1;
    private int C2_P0_2;
    private String C2_P0_3;
    private String C2_P1;
    private String C2_P2;
    private String C2_P3;
    private String C2_P4;
    public int C2_P5_0_1;
    public int C2_P5_0_2;
    public int C2_P5_0_3;
    public int C2_P5_0_4;
    public int C2_P5_0_5;
    private String C2_P5_1_1;
    private String C2_P5_1_2;
    private String C2_P5_1_3;
    private String C2_P5_1_4;
    private String C2_P5_1_5;
    private String C2_P5_1_6;

    public Modulo2Fragment1() {
        // Required empty public constructor
    }

    @SuppressLint("ValidFragment")
    public Modulo2Fragment1(String idempresa, Context context) {
        this.idempresa = idempresa;
        this.context = context;
        data = new Data(context);
        data.open();
        identificacion = data.getIdentificacion(idempresa);

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
        View rootView = inflater.inflate(R.layout.fragment_modulo2_fragment1, container, false);

        lytP1 = (LinearLayout) rootView.findViewById(R.id.mod2_p1_lyt);
        lytP2 = (LinearLayout) rootView.findViewById(R.id.mod2_p2_lyt);
        lytP3 = (LinearLayout) rootView.findViewById(R.id.mod2_p3_lyt);
        lytP4 = (LinearLayout) rootView.findViewById(R.id.mod2_p4_lyt);
        lytP5 = (LinearLayout) rootView.findViewById(R.id.mod2_p5_lyt);

        txtPregunta1 = (TextView) rootView.findViewById(R.id.mod2_p1_txtPregunta);
        txtPregunta2 = (TextView) rootView.findViewById(R.id.mod2_p2_txtPregunta);
        txtPregunta3 = (TextView) rootView.findViewById(R.id.mod2_p3_txtPregunta);
        txtPregunta4 = (TextView) rootView.findViewById(R.id.mod2_p4_txtPregunta);
        txtPregunta5 = (TextView) rootView.findViewById(R.id.mod2_p5_txtPregunta);

        lytFragment1 = (LinearLayout) rootView.findViewById(R.id.mod2_layoutFragment1);
        ckMismoInformante2 = (CheckBox) rootView.findViewById(R.id.cab_ckMismoInformante);
        edtNombYApellidos2 = (EditText)rootView.findViewById(R.id.cab_edtApeYNom);
        spCargo2 = (Spinner) rootView.findViewById(R.id.cab_spCargo);
        edtEspecifiqueCargo2 = (EditText) rootView.findViewById(R.id.cab_edtEspecifiqueCargo);
        lytFondoSpinner2 = (LinearLayout) rootView.findViewById(R.id.cab_lytFondoSpinner);

        edtP1 = (EditText) rootView.findViewById(R.id.mod2_p1_edt);
        edtP2 = (EditText) rootView.findViewById(R.id.mod2_p2_edt);
        edtP3 = (EditText) rootView.findViewById(R.id.mod2_p3_edt);
        edtP4 = (EditText) rootView.findViewById(R.id.mod2_p4_edt);

        edt1 = (EditText) rootView.findViewById(R.id.mod2_p5_edt1);
        edt2 = (EditText) rootView.findViewById(R.id.mod2_p5_edt2);
        edt3 = (EditText) rootView.findViewById(R.id.mod2_p5_edt3);
        edt4 = (EditText) rootView.findViewById(R.id.mod2_p5_edt4);
        edt5 = (EditText) rootView.findViewById(R.id.mod2_p5_edt5);

        ck1 = (CheckBox) rootView.findViewById(R.id.mod2_p5_ck1);
        ck2 = (CheckBox) rootView.findViewById(R.id.mod2_p5_ck2);
        ck3 = (CheckBox) rootView.findViewById(R.id.mod2_p5_ck3);
        ck4 = (CheckBox) rootView.findViewById(R.id.mod2_p5_ck4);
        ck5 = (CheckBox) rootView.findViewById(R.id.mod2_p5_ck5);

        txtTotal = (TextView) rootView.findViewById(R.id.mod2_p5_txtTotal);
        return rootView;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        ckMismoInformante2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    edtNombYApellidos2.setBackgroundResource(R.drawable.fondo_edit_text_disabled);
                    lytFondoSpinner2.setBackgroundResource(R.drawable.fondo_spinner_disabled);
                    spCargo2.setEnabled(false);
                    edtNombYApellidos2.setText(informante);
                    spCargo2.setSelection(Integer.parseInt(cargo));
                    edtNombYApellidos2.setEnabled(false);
                    edtEspecifiqueCargo2.setText(cargos);
                    edtEspecifiqueCargo2.setEnabled(false);
                    edtEspecifiqueCargo2.setBackgroundResource(R.drawable.fondo_edit_text_disabled);
                    lytP1.requestFocus();
                }else{
                    edtNombYApellidos2.setText("");
                    spCargo2.setSelection(0);
                    edtNombYApellidos2.setBackgroundResource(R.drawable.fondo_edit_text);
                    edtNombYApellidos2.setEnabled(true);
                    lytFondoSpinner2.setBackgroundResource(R.drawable.fondo_spinner);
                    spCargo2.setEnabled(true);
                    edtEspecifiqueCargo2.setEnabled(true);
                    edtEspecifiqueCargo2.setBackgroundResource(R.drawable.fondo_edit_text);
                    edtNombYApellidos2.requestFocus();
                }
            }
        });
        edtNombYApellidos2.setFilters(new InputFilter[]{new InputFilter.AllCaps()});

        edtNombYApellidos2.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View view, int keyCode, KeyEvent keyEvent) {
                if ((keyEvent.getAction() == KeyEvent.ACTION_DOWN) &&
                        (keyCode == KeyEvent.KEYCODE_ENTER)) {
                    ocultarTeclado(lytFondoSpinner2);
                    lytFondoSpinner2.requestFocus();
                    return true;
                }
                return false;
            }
        });


        edtEspecifiqueCargo2.setFilters(new InputFilter[]{new InputFilter.AllCaps()});
        edtEspecifiqueCargo2.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View view, int keyCode, KeyEvent keyEvent) {
                if ((keyEvent.getAction() == KeyEvent.ACTION_DOWN) && (keyCode == KeyEvent.KEYCODE_ENTER)) {
                    ocultarTeclado(edtEspecifiqueCargo2);
                    lytP2.requestFocus();
                    return true;
                }
                return false;
            }
        });
        spCargo2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int pos, long l) {
                edtEspecifiqueCargo2.setVisibility(View.GONE);
                switch (pos){
                    case 0:break;
                    case 1:break;
                    case 2:break;
                    case 3:break;
                    case 4:
                        edtEspecifiqueCargo2.setVisibility(View.VISIBLE);
                        break;
                }
                if(pos == 4) edtEspecifiqueCargo2.requestFocus();
                else if (pos >= 0 && pos <4){
                    edtEspecifiqueCargo2.setText("");
                    lytP1.requestFocus();
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        LinearLayout[] linearLayouts = {lytP1,lytP2,lytP3,lytP4,lytP5};
        TextView[] textViews = {txtPregunta1,txtPregunta2,txtPregunta3,txtPregunta4,txtPregunta5};


        for (int i = 0; i < linearLayouts.length; i++) {
            final LinearLayout linearLayout = linearLayouts[i];
            final TextView textView = textViews[i];
            linearLayout.setOnFocusChangeListener(new View.OnFocusChangeListener() {
                @Override
                public void onFocusChange(View view, boolean b) {
                    if(b) {
                        ocultarTeclado(linearLayout);
                        //textView.setBackgroundColor(Color.CYAN);
                    }else
                        textView.setBackgroundColor(Color.TRANSPARENT);
                }
            });
        }

        EditText[] editTexts = {edtP1,edtP2,edtP3,edtP4};
        for (int i = 0; i < editTexts.length; i++) {
            final EditText editText = editTexts[i];
            final LinearLayout linearLayout = linearLayouts[i+1];
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
        }

        EditText[] editTexts1 = {edt1,edt2,edt3,edt4,edt5};
        final CheckBox[] checkBoxes = {ck1,ck2,ck3,ck4,ck5};
        for (int i = 0; i <editTexts1.length ; i++) {
            final EditText editText = editTexts1[i];
            CheckBox checkBox = checkBoxes[i];
            editText.setOnFocusChangeListener(new View.OnFocusChangeListener() {
                @Override
                public void onFocusChange(View view, boolean conFocus) {
                    if(view.isEnabled()){
                        if(conFocus) {
                            editText.setBackgroundResource(R.drawable.fondo_edit_text);
                        }
                        else editText.setBackgroundResource(R.drawable.fondo_edit_text);
                    }else{
                        ocultarTeclado(editText);
                    }
                }
            });
            editText.setTransformationMethod(new NumericKeyBoardTransformationMethod());
            editText.addTextChangedListener(new TextWatcher() {
                @Override
                public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                    if(!charSequence.toString().equals("")){
                        txtTotal.setText((Integer.parseInt(txtTotal.getText().toString()) - Integer.parseInt(charSequence.toString()))+"");
                    }
                }

                @Override
                public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                }

                @Override
                public void afterTextChanged(Editable editable) {
                    int despues = 0;
                    if(!editable.toString().equals("")) despues = Integer.parseInt(editable.toString());
                    if(!(Integer.parseInt(txtTotal.getText().toString())== 0)){
                        txtTotal.setText((Integer.parseInt(txtTotal.getText().toString()) + despues) +"");
                    }else{
                        txtTotal.setText(despues+"");
                    }
                }
            });
            checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                    if(b){
                        editText.setEnabled(true);
                        editText.setBackgroundResource(R.drawable.fondo_edit_text);
                        editText.requestFocus();
                    }else{
                        editText.setEnabled(false);
                        editText.setText("");
                        editText.setBackgroundResource(R.drawable.fondo_edit_text_disabled);
                    }
                }
            });
        }

        edt5.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View view, int keyCode, KeyEvent keyEvent) {
                if ((keyEvent.getAction() == KeyEvent.ACTION_DOWN) &&
                        (keyCode == KeyEvent.KEYCODE_ENTER)) {
                    ocultarTeclado(edt5);
                    lytP5.requestFocus();
                    txtPregunta5.setBackgroundColor(Color.TRANSPARENT);
                    return true;
                }
                return false;
            }
        });
        lytFragment1.requestFocus();
        ocultarTeclado(lytFragment1);
        cargarDatos();
    }
    public void ocultarTeclado(View view){
        InputMethodManager mgr = (InputMethodManager) getActivity().getSystemService(Context.INPUT_METHOD_SERVICE);
        mgr.hideSoftInputFromWindow(view.getWindowToken(), 0);
    }
    public void mostrarTeclado(){
        InputMethodManager imm = (InputMethodManager) getActivity().getSystemService(getActivity().INPUT_METHOD_SERVICE);
        imm.toggleSoftInput(InputMethodManager.SHOW_FORCED, 0);
    }
    public void cargarDatos(){
        data = new Data(context);
        data.open();
        //verifico si ya existe un objeto con datos llenados previamente
        if(data.existeModulo2(idempresa)){
            //si existe traigo el objeto
            modulo2 = data.getModulo2(idempresa);
            //saco los datos del objeto para llenarlos en los elementos del fragment
            //datos cabecera
            if(modulo2.getC2_P0_0().equals("1")) ckMismoInformante2.setChecked(true);
            if(modulo2.getC2_P0_0().equals("0")) ckMismoInformante2.setChecked(false);
            edtNombYApellidos2.setText(modulo2.getC2_P0_1());
            spCargo2.setSelection(Integer.parseInt(modulo2.getC2_P0_2()));
            edtEspecifiqueCargo2.setText(modulo2.getC2_P0_3());
            //pregunta 1
            edtP1.setText(modulo2.getC2_P1());
            //pregunta 2
            edtP2.setText(modulo2.getC2_P2());
            //pregunta 3
            edtP3.setText(modulo2.getC2_P3());
            //pregunta 4
            edtP4.setText(modulo2.getC2_P4());
            //pregunta 5
            if(modulo2.getC2_P5_0_1().equals("1")) ck1.setChecked(true);
            edt1.setText(modulo2.getC2_P5_1_1());
            if(modulo2.getC2_P5_0_2().equals("1")) ck2.setChecked(true);
            edt2.setText(modulo2.getC2_P5_1_2());
            if(modulo2.getC2_P5_0_3().equals("1")) ck3.setChecked(true);
            edt3.setText(modulo2.getC2_P5_1_3());
            if(modulo2.getC2_P5_0_4().equals("1")) ck4.setChecked(true);
            edt4.setText(modulo2.getC2_P5_1_4());
            if(modulo2.getC2_P5_0_5().equals("1")) ck5.setChecked(true);
            edt5.setText(modulo2.getC2_P5_1_5());
        }
        data.close();
    }
    public void llenarMapaVariables(){
        //preguntas cabecera
        if(ckMismoInformante2.isChecked())C2_P0_0 = 1;
        else C2_P0_0 = 0;
        C2_P0_1 = edtNombYApellidos2.getText().toString();
        C2_P0_2 = spCargo2.getSelectedItemPosition();
        C2_P0_3 = edtEspecifiqueCargo2.getText().toString();

        //pregunta 1
        C2_P1 = edtP1.getText().toString();
        //pregunta 2
        C2_P2 = edtP2.getText().toString();
        //pregunta 3
        C2_P3 = edtP3.getText().toString();
        //pregunta 4
        C2_P4 = edtP4.getText().toString();
        //pregunta 5
        if(ck1.isChecked())C2_P5_0_1 = 1;
        else C2_P5_0_1 = 0;
        if(ck2.isChecked())C2_P5_0_2 = 1;
        else C2_P5_0_2 = 0;
        if(ck3.isChecked())C2_P5_0_3 = 1;
        else C2_P5_0_3 = 0;
        if(ck4.isChecked())C2_P5_0_4 = 1;
        else C2_P5_0_4 = 0;
        if(ck5.isChecked())C2_P5_0_5 = 1;
        else C2_P5_0_5 = 0;
        C2_P5_1_1 = edt1.getText().toString();
        C2_P5_1_2 = edt2.getText().toString();
        C2_P5_1_3 = edt3.getText().toString();
        C2_P5_1_4 = edt4.getText().toString();
        C2_P5_1_5 = edt5.getText().toString();
        C2_P5_1_6 = txtTotal.getText().toString();
    }
    public void guardarDatos(){
        data = new Data(context);
        data.open();
        if(data.existeModulo2(idempresa)){
            ContentValues contentValues = new ContentValues(163);
            contentValues.put(SQLConstantes.MODULO2_P0_0,C2_P0_0);
            contentValues.put(SQLConstantes.MODULO2_P0_1,C2_P0_1);
            contentValues.put(SQLConstantes.MODULO2_P0_2,C2_P0_2);
            contentValues.put(SQLConstantes.MODULO2_P0_3,C2_P0_3);
            contentValues.put(SQLConstantes.MODULO2_P1,C2_P1);
            contentValues.put(SQLConstantes.MODULO2_P2,C2_P2);
            contentValues.put(SQLConstantes.MODULO2_P3,C2_P3);
            contentValues.put(SQLConstantes.MODULO2_P4,C2_P4);
            contentValues.put(SQLConstantes.MODULO2_P5_0_1,C2_P5_0_1);
            contentValues.put(SQLConstantes.MODULO2_P5_0_2,C2_P5_0_2);
            contentValues.put(SQLConstantes.MODULO2_P5_0_3,C2_P5_0_3);
            contentValues.put(SQLConstantes.MODULO2_P5_0_4,C2_P5_0_4);
            contentValues.put(SQLConstantes.MODULO2_P5_0_5,C2_P5_0_5);
            contentValues.put(SQLConstantes.MODULO2_P5_1_1,C2_P5_1_1);
            contentValues.put(SQLConstantes.MODULO2_P5_1_2,C2_P5_1_2);
            contentValues.put(SQLConstantes.MODULO2_P5_1_3,C2_P5_1_3);
            contentValues.put(SQLConstantes.MODULO2_P5_1_4,C2_P5_1_4);
            contentValues.put(SQLConstantes.MODULO2_P5_1_5,C2_P5_1_5);
            contentValues.put(SQLConstantes.MODULO2_P5_1_6,C2_P5_1_6);
            data.actualizarModulo2(idempresa,contentValues);
        }else{
            //si no existe el elemento, lo construye para insertarlo
            modulo2 = new Modulo2();
            //llena el objeto a insertar
            modulo2.setMODULO2_ID(idempresa);
            modulo2.setC2_P0_0(C2_P0_0+"");
            modulo2.setC2_P0_1(C2_P0_1);
            modulo2.setC2_P0_2(C2_P0_2+"");
            modulo2.setC2_P0_3(C2_P0_3);
            modulo2.setC2_P1(C2_P1);
            modulo2.setC2_P2(C2_P2);
            modulo2.setC2_P3(C2_P3);
            modulo2.setC2_P4(C2_P4);
            modulo2.setC2_P5_0_1(C2_P5_0_1+"");
            modulo2.setC2_P5_0_2(C2_P5_0_2+"");
            modulo2.setC2_P5_0_3(C2_P5_0_3+"");
            modulo2.setC2_P5_0_4(C2_P5_0_4+"");
            modulo2.setC2_P5_0_5(C2_P5_0_5+"");
            modulo2.setC2_P5_1_1(C2_P5_1_1);
            modulo2.setC2_P5_1_2(C2_P5_1_2);
            modulo2.setC2_P5_1_3(C2_P5_1_3);
            modulo2.setC2_P5_1_4(C2_P5_1_4);
            modulo2.setC2_P5_1_5(C2_P5_1_5);
            modulo2.setC2_P5_1_6(C2_P5_1_6);
            data.insertarModulo2(modulo2);
        }
        data.close();
    }
    public boolean validar(){
        boolean valido = false;
        llenarMapaVariables();
        String mensaje = "";

        boolean vC2_P0_1=true, vC2_P0_2=true, vC2_P0_3=true, vC2_P1=true,
                vC2_P2=true, vC2_P3=true, vC2_P4=true, vC2_P5_0_1=true, vC2_P5_0_2=true,
                vC2_P5_0_3=true, vC2_P5_0_4=true, vC2_P5_0_5=true, vC2_P5_1_1=true,
                vC2_P5_1_2=true, vC2_P5_1_3=true, vC2_P5_1_4=true, vC2_P5_1_5=true,
                vC2_P5_1_6=true;


        if(C2_P0_1.trim().length() == 0){
            vC2_P0_1 = false;
            if(mensaje.equals(""))mensaje = "DATOS DE INFORMANTE: DEBE REGISTRAR NOMBRE DEL INFORMANTE";
        }
        if(C2_P0_2 < 1 || C2_P0_2 > 4){
            vC2_P0_2 = false;
            if(mensaje.equals(""))mensaje = "DATOS DE INFORMANTE: DEBE INDICAR EL CARGO DEL INFORMANTE";
        }
        if(C2_P0_2 == 4){
            if(C2_P0_3.trim().length() < 3){
                vC2_P0_3 = false;
                if(mensaje.equals(""))mensaje = "DATOS DE INFORMANTE: DEBE REGISTRAR INFORMACION VALIDA EN ESPECIFIQUE";
            }
        }


        //p1
        if(C2_P1.trim().length() == 0) {
            vC2_P1 = false;
            if(mensaje.equals(""))mensaje = "PREGUNTA 1: DEBE REGISTRAR NUMERO TOTAL DE TRABAJADORES";
        }

        if(C2_P1.trim().length() != 0){
            //p2
            if(C2_P2.trim().length() == 0){
                vC2_P2 = false;
                if(mensaje.equals(""))mensaje = "PREGUNTA 2: DEBE REGISTRAR NUMERO TOTAL DE TRABAJADORES MUJERES";
            }
            if(!C2_P1.equals("") && !C2_P2.equals("")){
                if(Integer.parseInt(C2_P1) < Integer.parseInt(C2_P2)) {
                    vC2_P2 = false;
                    if(mensaje.equals(""))mensaje = "PREGUNTA 2: EL NUMERO DE TRABAJADORES DE P1 DEBE SER MAYOR";
                }
            }
            //p3
            if(C2_P3.trim().length() == 0){
                vC2_P3 = false;
                if(mensaje.equals(""))mensaje = "PREGUNTA 3: DEBE REGISTRAR NUMERO DE TRABAJADORES A TIEMPO PARCIAL";
            }

            if(!C2_P1.equals("") && !C2_P3.equals("")){
                if(Integer.parseInt(C2_P1) < Integer.parseInt(C2_P3)){
                    vC2_P2 = false;
                    if(mensaje.equals(""))mensaje = "PREGUNTA 3: EL NUMERO DE TRABAJADORES DE P1 DEBE SER MAYOR";
                }
            }
            //p4
            if(C2_P4.trim().length() == 0){
                vC2_P4 = false;
                if(mensaje.equals(""))mensaje = "PREGUNTA 4: DEBE REGISTRAR NUMERO DE TRABAJADORES CON CONTRATOS TEMPORALES";
            }
            if(!C2_P1.equals("") && !C2_P4.equals("")){
                if(Integer.parseInt(C2_P1) < Integer.parseInt(C2_P4)) {
                    vC2_P2 = false;
                    if(mensaje.equals(""))mensaje = "PREGUNTA 4: EL NUMERO DE TRABAJADORES DE P1 DEBE SER MAYOR";
                }
            }
            //p5
            if(C2_P5_0_1 != 1 && C2_P5_0_2 != 1 && C2_P5_0_3 != 1 && C2_P5_0_4 != 1 && C2_P5_0_5 != 1) {
                vC2_P5_0_1 = false;vC2_P5_0_2 = false;vC2_P5_0_3 = false;vC2_P5_0_4 = false;vC2_P5_0_5= false;
                if(mensaje.equals(""))mensaje = "PREGUNTA 5: DEBE SELECCIONAR AL MENOS UNA OPCION";
            }
            if(edt1.isEnabled()){
                if (C2_P5_1_1.trim().length() == 0) {
                    vC2_P5_1_1 = false;
                    if(mensaje.equals(""))mensaje = "PREGUNTA 5: DEBE INDICAR EL NUMERO DE TRABAJADORES PARA EL PERIODO DE CONTRATO";
                }
            }
            if(edt2.isEnabled()){
                if (C2_P5_1_2.trim().length() == 0) {
                    vC2_P5_1_2 = false;
                    if(mensaje.equals(""))mensaje = "PREGUNTA 5: DEBE INDICAR EL NUMERO DE TRABAJADORES PARA EL PERIODO DE CONTRATO";
                }
            }
            if(edt3.isEnabled()){
                if (C2_P5_1_3.trim().length() == 0) {
                    vC2_P5_1_3 = false;
                    if(mensaje.equals(""))mensaje = "PREGUNTA 5: DEBE INDICAR EL NUMERO DE TRABAJADORES PARA EL PERIODO DE CONTRATO";
                }
            }
            if(edt4.isEnabled()){
                if (C2_P5_1_4.trim().length() == 0) {
                    vC2_P5_1_4 = false;
                    if(mensaje.equals(""))mensaje = "PREGUNTA 5: DEBE INDICAR EL NUMERO DE TRABAJADORES PARA EL PERIODO DE CONTRATO";
                }
            }
            if(edt5.isEnabled()){
                if (C2_P5_1_5.trim().length() == 0){
                    vC2_P5_1_5 = false;
                    if(mensaje.equals(""))mensaje = "PREGUNTA 5: DEBE INDICAR EL NUMERO DE TRABAJADORES PARA EL PERIODO DE CONTRATO";
                }
            }

            if(!C2_P5_1_6.equals("") && !C2_P1.equals("")){
                if(Integer.parseInt(C2_P5_1_6) != Integer.parseInt(C2_P1)){
                    vC2_P5_1_6 = false;
                    if(mensaje.equals(""))mensaje = "PREGUNTA 5: LA SUMATORIA POR TIPO DE PERIODO DE CONTRATO DEBE SER IGUAL AL NUMERO DE TRABAJDORES";
                }
            }
            if(!C2_P5_1_5.equals("") && !C2_P5_1_6.equals("")){
                if(Integer.parseInt(C2_P5_1_5) == Integer.parseInt(C2_P5_1_6)){
                    vC2_P5_1_5 = false;
                    if(mensaje.equals(""))mensaje = "PREGUNTA 5: NO PUEDE INDICAR QUE NO SABE EL PERIODO DE CONTRATACION DE SUS TRABAJADORES";
                }
            }
            data = new Data(context);
            data.open();
            int anioOperacion = Integer.parseInt(data.getIdentificacion(idempresa).getANIO_OPERACION());
            data.close();
            int verificacion = 2017 - anioOperacion;
            if(C2_P5_1_2.equals("")) C2_P5_1_2 = "0";
            if(C2_P5_1_3.equals("")) C2_P5_1_3 = "0";
            if(C2_P5_1_4.equals("")) C2_P5_1_4 = "0";
            if(C2_P5_1_5.equals("")) C2_P5_1_5 = "0";

            if(verificacion < 1 &&
                    (Integer.parseInt(C2_P5_1_2) > 0 || Integer.parseInt(C2_P5_1_3) > 0 ||
                            Integer.parseInt(C2_P5_1_4) > 0 || Integer.parseInt(C2_P5_1_5) > 0)){
                vC2_P5_1_5 = false;
                if(mensaje.equals(""))mensaje = "PREGUNTA 5: NO HAY CORRELATIVIDAD ENTRE AÑO DE INICIO DE OPERACIONES Y EL PREIODO DE CONTRATO DE LOS TRABAJADORES";
            }

            if(verificacion < 5 && (Integer.parseInt(C2_P5_1_3) > 0 || Integer.parseInt(C2_P5_1_4) > 0)){
                vC2_P5_1_5 = false;
                if(mensaje.equals(""))mensaje = "PREGUNTA 5: NO HAY CORRELATIVIDAD ENTRE AÑO DE INICIO DE OPERACIONES Y EL PREIODO DE CONTRATO DE LOS TRABAJADORES";
            }

            if(verificacion < 10 && (Integer.parseInt(C2_P5_1_4) > 0)){
                vC2_P5_1_5 = false;
                if(mensaje.equals(""))mensaje = "PREGUNTA 5: NO HAY CORRELATIVIDAD ENTRE AÑO DE INICIO DE OPERACIONES Y EL PREIODO DE CONTRATO DE LOS TRABAJADORES";
            }
        }

        valido = vC2_P0_1 && vC2_P0_2 && vC2_P0_3 && vC2_P1 && vC2_P2 &&
                vC2_P3 && vC2_P4 && vC2_P5_0_1 && vC2_P5_0_2 && vC2_P5_0_3 && vC2_P5_0_4 &&
                vC2_P5_0_5 && vC2_P5_1_1 && vC2_P5_1_2 && vC2_P5_1_3 && vC2_P5_1_4 && vC2_P5_1_5 && vC2_P5_1_6;

        if(!valido) {
            mostrarMensaje(mensaje);
            Log.e("vC2_P0_1:",vC2_P0_1 + "");
            Log.e("vC2_P0_2:",vC2_P0_2 + "");
            Log.e("vC2_P0_3:",vC2_P0_3 + "");
            Log.e("vC2_P1:",vC2_P1 + "");
            Log.e("vC2_P2:",vC2_P2 + "");
            Log.e("vC2_P3:",vC2_P3 + "");
            Log.e("vC2_P4:",vC2_P4 + "");
            Log.e("vC2_P5_0_1:",vC2_P5_0_1 + "");
            Log.e("vC2_P5_0_2:",vC2_P5_0_2 + "");
            Log.e("vC2_P5_0_3:",vC2_P5_0_3 + "");
            Log.e("vC2_P5_0_4:",vC2_P5_0_4 + "");
            Log.e("vC2_P5_0_5:",vC2_P5_0_5 + "");
            Log.e("vC2_P5_1_1:",vC2_P5_1_1 + "");
            Log.e("vC2_P5_1_2:",vC2_P5_1_2 + "");
            Log.e("vC2_P5_1_3:",vC2_P5_1_3 + "");
            Log.e("vC2_P5_1_4:",vC2_P5_1_4 + "");
            Log.e("vC2_P5_1_5:",vC2_P5_1_5 + "");
            Log.e("vC2_P5_1_6:",vC2_P5_1_6 + "");
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
