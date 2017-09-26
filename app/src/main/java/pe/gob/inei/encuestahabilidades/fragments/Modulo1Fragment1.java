package pe.gob.inei.encuestahabilidades.fragments;


import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.content.Context;
import android.content.DialogInterface;
import android.support.annotation.Nullable;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.inputmethodservice.Keyboard;
import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.content.res.ResourcesCompat;
import android.support.v7.app.AlertDialog;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.util.Log;
import android.view.GestureDetector;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
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

import org.w3c.dom.Text;

import pe.gob.inei.encuestahabilidades.NumericKeyBoardTransformationMethod;
import pe.gob.inei.encuestahabilidades.R;
import pe.gob.inei.encuestahabilidades.modelo.Data;
import pe.gob.inei.encuestahabilidades.modelo.SQLConstantes;
import pe.gob.inei.encuestahabilidades.pojos.BaseDatos;
import pe.gob.inei.encuestahabilidades.pojos.Identificacion;
import pe.gob.inei.encuestahabilidades.pojos.Modulo1;

/**
 * A simple {@link Fragment} subclass.
 */
public class Modulo1Fragment1 extends Fragment {

    private LinearLayout lytP1;
    private LinearLayout lytP2;
    private LinearLayout lytP3;
    private LinearLayout lytP4;

    private LinearLayout lyt1P2;
    private LinearLayout lyt2P2;

    private AutoCompleteTextView autoP1;
    private AutoCompleteTextView auto1P2;
    private AutoCompleteTextView auto2P2;

    private TextView txtP1;
    private TextView txt1P2;
    private TextView txt2P2;
    private EditText mod1_p1_edt1;
    private EditText mod1_p2_edt1;
    private EditText mod1_p2_edt2;

    private EditText edtEspecifiqueP3;
    private LinearLayout lytEspecifiqueP3;

    private CheckBox ck1P2;
    private CheckBox ck2P2;

    private LinearLayout lytFragment1;
    private CheckBox ckMismoInformante1;
    private EditText edtNombYApellidos1;
    private EditText edtEspecifiqueCargo1;
    private LinearLayout lytFondoSpinner1;
    private Spinner spCargo1;


    private RadioButton mod1_p3_rb7;
    private LinearLayout lytP3_1;
    private RadioGroup rgP3;
    private RadioGroup rgP41;
    private RadioGroup rgP42;

    private Identificacion identificacion;
    String informante;
    String cargo="0";
    String cargos="";

    private String idempresa;
    private Modulo1 modulo1;
    private Context context;
    private Data data;

    //mapeo de variables
    int C1_P0_0;String C1_P0_1;int C1_P0_2;String C1_P0_3;
    String C1_P1_1;String C1_P1_2;String C1_P1_2_DETALLE;String C1_P2_1_1;String C1_P2_1_2;
    String C1_P2_1_2_DETALLE;int C1_P2_1_NO;String C1_P2_2_1;String C1_P2_2_2;String C1_P2_2_2_DETALLE;
    int C1_P2_2_NO;int C1_P3;String C1_P3_0;
    int C1_P4_1_1;int C1_P4_2_1;


    public Modulo1Fragment1() {
        // Required empty public constructor
    }

    @SuppressLint("ValidFragment")
    public Modulo1Fragment1(String idempresa, Context context) {
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

        View rootView = inflater.inflate(R.layout.fragment_modulo1_fragment1, container, false);

        lytP1 = (LinearLayout) rootView.findViewById(R.id.mod1_p1_lyt);
        lytP2 = (LinearLayout) rootView.findViewById(R.id.mod1_p2_lyt);
        lytP3 = (LinearLayout) rootView.findViewById(R.id.mod1_p3_lyt);
        lytP4 = (LinearLayout) rootView.findViewById(R.id.mod1_p4_lyt);

        lyt1P2 = (LinearLayout) rootView.findViewById(R.id.mod1_p2_lyt1);
        lyt2P2 = (LinearLayout) rootView.findViewById(R.id.mod1_p2_lyt2);

        autoP1  = (AutoCompleteTextView) rootView.findViewById(R.id.mod1_p1_auto);
        auto1P2 = (AutoCompleteTextView) rootView.findViewById(R.id.mod1_p2_auto1);
        auto2P2 = (AutoCompleteTextView) rootView.findViewById(R.id.mod1_p2_auto2);

        txtP1  = (TextView) rootView.findViewById(R.id.mod1_p1_txt);
        txt1P2 = (TextView) rootView.findViewById(R.id.mod1_p2_txt1);
        txt2P2 = (TextView) rootView.findViewById(R.id.mod1_p2_txt2);

        ck1P2 = (CheckBox) rootView.findViewById(R.id.mod1_p2_ck1);
        ck2P2 = (CheckBox) rootView.findViewById(R.id.mod1_p2_ck2);

        rgP3  =(RadioGroup) rootView.findViewById(R.id.mod1_p3_rg);
        rgP41 =(RadioGroup) rootView.findViewById(R.id.mod1_p4_rg41);
        rgP42 =(RadioGroup) rootView.findViewById(R.id.mod1_p4_rg42);

        lytEspecifiqueP3 = (LinearLayout) rootView.findViewById(R.id.mod1_p3_lytEspecifique);
        edtEspecifiqueP3 = (EditText) rootView.findViewById(R.id.mod1_p3_edtEspecifique);

        lytFragment1 = (LinearLayout) rootView.findViewById(R.id.mod1_layoutFragment1);
        ckMismoInformante1 = (CheckBox) rootView.findViewById(R.id.cab_ckMismoInformante);
        edtNombYApellidos1 = (EditText)rootView.findViewById(R.id.cab_edtApeYNom);
        spCargo1 = (Spinner) rootView.findViewById(R.id.cab_spCargo);
        edtEspecifiqueCargo1 = (EditText) rootView.findViewById(R.id.cab_edtEspecifiqueCargo);
        lytFondoSpinner1 = (LinearLayout) rootView.findViewById(R.id.cab_lytFondoSpinner);

        mod1_p1_edt1=(EditText) rootView.findViewById(R.id.mod1_p1_edt1);
        mod1_p2_edt1=(EditText) rootView.findViewById(R.id.mod1_p2_edt1);
        mod1_p2_edt2=(EditText) rootView.findViewById(R.id.mod1_p2_edt2);

        return rootView;

    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        /*DATOS INTRODUCTORIOS MODULO 1*/
        ckMismoInformante1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    edtNombYApellidos1.setBackgroundResource(R.drawable.fondo_edit_text_disabled);
                    lytFondoSpinner1.setBackgroundResource(R.drawable.fondo_spinner_disabled);
                    spCargo1.setEnabled(false);
                    edtNombYApellidos1.setText(informante);
                    spCargo1.setSelection(Integer.parseInt(cargo));
                    edtNombYApellidos1.setEnabled(false);
                    edtEspecifiqueCargo1.setText(cargos);
                    edtEspecifiqueCargo1.setEnabled(false);
                    edtEspecifiqueCargo1.setBackgroundResource(R.drawable.fondo_edit_text_disabled);
                    lytP1.requestFocus();
                }else{
                    edtNombYApellidos1.setText("");
                    spCargo1.setSelection(0);
                    edtNombYApellidos1.setBackgroundResource(R.drawable.fondo_edit_text);
                    edtNombYApellidos1.setEnabled(true);
                    lytFondoSpinner1.setBackgroundResource(R.drawable.fondo_spinner);
                    spCargo1.setEnabled(true);
                    edtEspecifiqueCargo1.setEnabled(true);
                    edtEspecifiqueCargo1.setBackgroundResource(R.drawable.fondo_edit_text);
                    edtNombYApellidos1.requestFocus();
                }
            }
        });
        edtNombYApellidos1.setFilters(new InputFilter[]{new InputFilter.AllCaps()});
        edtNombYApellidos1.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View view, int keyCode, KeyEvent keyEvent) {
                if ((keyEvent.getAction() == KeyEvent.ACTION_DOWN) &&
                        (keyCode == KeyEvent.KEYCODE_ENTER)) {
                    ocultarTeclado(lytFondoSpinner1);
                    lytFondoSpinner1.requestFocus();
                    return true;
                }
                return false;
            }
        });

        spCargo1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int pos, long l) {
                edtEspecifiqueCargo1.setVisibility(View.GONE);
                switch (pos){
                    case 0:break;
                    case 1:break;
                    case 2:break;
                    case 3:break;
                    case 4:
                        edtEspecifiqueCargo1.setVisibility(View.VISIBLE);
                        edtEspecifiqueCargo1.requestFocus();
                        break;
                }
                if (pos >= 0 && pos <4){
                    edtEspecifiqueCargo1.setText("");
                    lytP1.requestFocus();
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {}
        });
        edtEspecifiqueCargo1.setFilters(new InputFilter[]{new InputFilter.AllCaps()});
        edtEspecifiqueCargo1.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View view, int keyCode, KeyEvent keyEvent) {
                if ((keyEvent.getAction() == KeyEvent.ACTION_DOWN) && (keyCode == KeyEvent.KEYCODE_ENTER)) {
                    ocultarTeclado(edtEspecifiqueCargo1);
                    lytP1.requestFocus();
                    return true;
                }
                return false;
            }
        });
        mod1_p1_edt1.setFilters(new InputFilter[]{new InputFilter.AllCaps()});
        mod1_p2_edt1.setFilters(new InputFilter[]{new InputFilter.AllCaps()});
        mod1_p2_edt2.setFilters(new InputFilter[]{new InputFilter.AllCaps()});
        String[] paises = getResources().getStringArray(R.array.ciuu);
        ArrayAdapter adapter = new ArrayAdapter(getActivity().getApplicationContext(),R.layout.lista_item,R.id.item,paises);
        autoP1.setAdapter(adapter);
        auto1P2.setAdapter(adapter);
        auto2P2.setAdapter(adapter);

        autoP1.setFilters(new InputFilter[]{new InputFilter.AllCaps()});
        auto1P2.setFilters(new InputFilter[]{new InputFilter.AllCaps()});
        auto2P2.setFilters(new InputFilter[]{new InputFilter.AllCaps()});

        AutoCompleteTextView[] autoCompleteTextViews = {autoP1,auto1P2,auto2P2};
        TextView[] textViews = {txtP1,txt1P2,txt2P2};
        LinearLayout[] linearLayouts = {lytP1,lyt1P2,lyt2P2};

        for (int i = 0; i <autoCompleteTextViews.length ; i++) {
            final AutoCompleteTextView autoCompleteTextView = autoCompleteTextViews[i];
            final TextView textView = textViews[i];
            final LinearLayout linearLayout = linearLayouts[i];

            autoCompleteTextView.setOnKeyListener(new View.OnKeyListener() {
                @Override
                public boolean onKey(View view, int keyCode, KeyEvent keyEvent) {
                    if ((keyEvent.getAction() == KeyEvent.ACTION_DOWN) &&
                            (keyCode == KeyEvent.KEYCODE_ENTER)) {
                        ocultarTeclado(autoCompleteTextView);
                        linearLayout.requestFocus();
                        return true;
                    }
                    return false;
                }
            });
            autoCompleteTextView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                    textView.setText(extraerCodigo(autoCompleteTextView.getText().toString()));
                    ocultarTeclado(autoCompleteTextView);
                    linearLayout.requestFocus();
                }
            });
        }

        watcherCIUU(mod1_p1_edt1,txtP1,autoP1);
        watcherCIUU(mod1_p2_edt1,txt1P2,auto1P2);
        watcherCIUU(mod1_p2_edt2,txt2P2,auto2P2);

        ck1P2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    auto1P2.setText("");
                    txt1P2.setText("");
                    mod1_p2_edt1.setText("");
                    auto1P2.setEnabled(false);
                    mod1_p2_edt1.setEnabled(false);
                    auto1P2.setBackgroundResource(R.drawable.fondo_edit_text_disabled);
                    txt1P2.setBackgroundResource(R.drawable.fondo_edit_text_disabled);
                    mod1_p2_edt1.setBackgroundResource(R.drawable.fondo_edit_text_disabled);
                    //mod1_p2_edt2.setBackgroundResource(R.drawable.fondo_edit_text_disabled);

                    auto2P2.setText("");
                    txt2P2.setText("");
                    mod1_p2_edt2.setText("");
                    ocultarTeclado(ck1P2);
                    lyt2P2.setVisibility(View.GONE);
                }else{
                    mod1_p2_edt1.setEnabled(true);
                    auto1P2.setEnabled(true);
                    mod1_p2_edt1.setBackgroundResource(R.drawable.fondo_edit_text);
                    auto1P2.setBackgroundResource(R.drawable.fondo_edit_text);
                    txt1P2.setBackgroundResource(R.drawable.fondo_edit_text);
                    lyt2P2.setVisibility(View.VISIBLE);
                }
            }
        });
        ck2P2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    mod1_p2_edt2.setText("");
                    auto2P2.setText("");
                    txt2P2.setText("");
                    auto2P2.setBackgroundResource(R.drawable.fondo_edit_text_disabled);
                    txt2P2.setBackgroundResource(R.drawable.fondo_edit_text_disabled);
                    mod1_p2_edt2.setBackgroundResource(R.drawable.fondo_edit_text_disabled);
                    mod1_p2_edt2.setEnabled(false);
                    auto2P2.setEnabled(false);
                    ocultarTeclado(ck2P2);

                }else{
                    auto2P2.setEnabled(true);
                    txt2P2.setEnabled(true);
                    mod1_p2_edt2.setEnabled(true);
                    mod1_p2_edt2.setBackgroundResource(R.drawable.fondo_edit_text);
                    auto2P2.setBackgroundResource(R.drawable.fondo_edit_text);
                    txt2P2.setBackgroundResource(R.drawable.fondo_edit_text);
                }
            }
        });
        lytEspecifiqueP3.setVisibility(View.GONE);
        rgP3.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, @IdRes int i) {
                switch (i){
                    case R.id.mod1_p3_rb1:
                        edtEspecifiqueP3.setText("");
                        lytEspecifiqueP3.setVisibility(View.GONE);
                        break;
                    case R.id.mod1_p3_rb2:
                        edtEspecifiqueP3.setText("");
                        lytEspecifiqueP3.setVisibility(View.GONE);
                        break;
                    case R.id.mod1_p3_rb3:
                        edtEspecifiqueP3.setText("");
                        lytEspecifiqueP3.setVisibility(View.GONE);
                        break;
                    case R.id.mod1_p3_rb4:
                        edtEspecifiqueP3.setText("");
                        lytEspecifiqueP3.setVisibility(View.GONE);
                        break;
                    case R.id.mod1_p3_rb5:
                        edtEspecifiqueP3.setText("");
                        lytEspecifiqueP3.setVisibility(View.GONE);
                        break;
                    case R.id.mod1_p3_rb6:
                        edtEspecifiqueP3.setText("");
                        lytEspecifiqueP3.setVisibility(View.GONE);
                        break;
                    case R.id.mod1_p3_rb7:
                        lytEspecifiqueP3.setVisibility(View.VISIBLE);
                        edtEspecifiqueP3.setBackgroundResource(R.drawable.fondo_edit_text);
                        edtEspecifiqueP3.requestFocus();
                        break;
                }
            }
        });
        edtEspecifiqueP3.setFilters(new InputFilter[]{new InputFilter.AllCaps()});
        edtEspecifiqueP3.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View view, int keyCode, KeyEvent keyEvent) {
                if ((keyEvent.getAction() == KeyEvent.ACTION_DOWN) &&
                        (keyCode == KeyEvent.KEYCODE_ENTER)) {
                    ocultarTeclado(edtEspecifiqueP3);
                    lytEspecifiqueP3.requestFocus();
                    return true;
                }
                return false;
            }
        });
        cargarDatos();
        lytFragment1.requestFocus();
        ocultarTeclado(lytFragment1);
    }

    public void ocultarTeclado(View view){
        InputMethodManager mgr = (InputMethodManager) getActivity().getSystemService(Context.INPUT_METHOD_SERVICE);
        mgr.hideSoftInputFromWindow(view.getWindowToken(), 0);
    }
    public String extraerCodigo(String ocupacion){
        int indiceI = ocupacion.indexOf("[");
        int indiceF = ocupacion.indexOf("]");
        ocupacion = ocupacion.substring(indiceI + 1, indiceF);

        return ocupacion;
    }

    public void watcherCIUU(final EditText editText, final TextView textView, final AutoCompleteTextView autoCompleteTextView){
        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {}
            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {}
            @Override
            public void afterTextChanged(Editable editable) {
                if (editable.toString().equals("")){
                    textView.setText("");
                    autoCompleteTextView.setText("");
                }
            }
        });
    }
    public void cargarDatos(){
        data = new Data(context);
        data.open();
        //verifico si ya existe un objeto con datos llenados previamente
        if(data.existeModulo1(idempresa)){
            //si existe traigo el objeto
            modulo1 = data.getModulo1(idempresa);
            //saco los datos del objeto para llenarlos en los elementos del fragment
            //datos cabecera
            if(modulo1.getC1_P0_0().equals("1")) ckMismoInformante1.setChecked(true);
            if(modulo1.getC1_P0_0().equals("0")) ckMismoInformante1.setChecked(false);
            edtNombYApellidos1.setText(modulo1.getC1_P0_1());
            spCargo1.setSelection(Integer.parseInt(modulo1.getC1_P0_2()));
            edtEspecifiqueCargo1.setText(modulo1.getC1_P0_3());
            //pregunta 1
            mod1_p1_edt1.setText(modulo1.getC1_P1_1());
            txtP1.setText(modulo1.getC1_P1_2());
            autoP1.setText(modulo1.getC1_P1_2_DETALLE());
            //pregunta 2
            //2.1
            if(modulo1.getC1_P2_1_NO().equals("1")) ck1P2.setChecked(true);
            if(modulo1.getC1_P2_1_NO().equals("0")) ck1P2.setChecked(false);
            mod1_p2_edt1.setText(modulo1.getC1_P2_1_1());
            txt1P2.setText(modulo1.getC1_P2_1_2());
            auto1P2.setText(modulo1.getC1_P2_1_2_DETALLE());
            //2.2
            if(modulo1.getC1_P2_2_NO().equals("1")) ck2P2.setChecked(true);
            if(modulo1.getC1_P2_2_NO().equals("0")) ck2P2.setChecked(false);
            mod1_p2_edt2.setText(modulo1.getC1_P2_2_1());
            txt2P2.setText(modulo1.getC1_P2_2_2());
            auto2P2.setText(modulo1.getC1_P2_2_2_DETALLE());
            //pregunta 3
            int childPos3 = Integer.parseInt(modulo1.getC1_P3());
            ((RadioButton)rgP3.getChildAt(childPos3)).setChecked(true);
            edtEspecifiqueP3.setText(modulo1.getC1_P3_0());
            //pregunta 4
            int childPos41 = Integer.parseInt(modulo1.getC1_P4_1_1());
            ((RadioButton)rgP41.getChildAt(childPos41)).setChecked(true);
            int childPos42 = Integer.parseInt(modulo1.getC1_P4_2_1());
            ((RadioButton)rgP42.getChildAt(childPos42)).setChecked(true);
        }
        data.close();
    }
    public void llenarMapaVariables(){
        //preguntas cabecera
        if(ckMismoInformante1.isChecked())C1_P0_0 = 1;
        else C1_P0_0 = 0;
        C1_P0_1 = edtNombYApellidos1.getText().toString();
        C1_P0_2 = spCargo1.getSelectedItemPosition();
        C1_P0_3 = edtEspecifiqueCargo1.getText().toString();
        //pregunta 1
        C1_P1_1 = mod1_p1_edt1.getText().toString();
        C1_P1_2 = txtP1.getText().toString();
//        C1_P1_2_DETALLE = autoP1.getText().toString();
        C1_P1_2_DETALLE = "";


        //pregunta 2
        //->secundaria1
        if(ck1P2.isChecked())C1_P2_1_NO = 1;
        else C1_P2_1_NO = 0;
        C1_P2_1_1 = mod1_p2_edt1.getText().toString();
        C1_P2_1_2 = txt1P2.getText().toString();
//        C1_P2_1_2_DETALLE = auto1P2.getText().toString();
        C1_P2_1_2_DETALLE = "";

        //->secundaria2
        if(ck2P2.isChecked())C1_P2_2_NO = 1;
        else C1_P2_2_NO = 0;
        C1_P2_2_1 = mod1_p2_edt2.getText().toString();
        C1_P2_2_2 = txt2P2.getText().toString();
//        C1_P2_2_2_DETALLE = auto2P2.getText().toString();
        C1_P2_2_2_DETALLE = "";


        //pregunta 3
        int childPosP3 = rgP3.indexOfChild(rgP3.findViewById(rgP3.getCheckedRadioButtonId()));
        C1_P3 = childPosP3;
        C1_P3_0 = edtEspecifiqueP3.getText().toString();
        //pregunta 4
        //->4.1
        int childPosP41 = rgP41.indexOfChild(rgP41.findViewById(rgP41.getCheckedRadioButtonId()));
        C1_P4_1_1 = childPosP41;
        //->4.2
        int childPosP42 = rgP42.indexOfChild(rgP42.findViewById(rgP42.getCheckedRadioButtonId()));
        C1_P4_2_1 = childPosP42;
    }
    public void guardarDatos(){
        data = new Data(context);
        data.open();
        if(data.existeModulo1(idempresa)){
            ContentValues contentValues = new ContentValues(50);
            contentValues.put(SQLConstantes.MODULO1_P0_0,C1_P0_0+"");
            contentValues.put(SQLConstantes.MODULO1_P0_1,C1_P0_1);
            contentValues.put(SQLConstantes.MODULO1_P0_2,C1_P0_2+"");
            contentValues.put(SQLConstantes.MODULO1_P0_3,C1_P0_3);
            contentValues.put(SQLConstantes.MODULO1_P1_1,C1_P1_1);
            contentValues.put(SQLConstantes.MODULO1_P1_2,C1_P1_2);
            contentValues.put(SQLConstantes.MODULO1_P1_2_DETALLE,C1_P1_2_DETALLE);
            contentValues.put(SQLConstantes.MODULO1_P2_1_1,C1_P2_1_1);
            contentValues.put(SQLConstantes.MODULO1_P2_1_2,C1_P2_1_2);
            contentValues.put(SQLConstantes.MODULO1_P2_1_2_DETALLE,C1_P2_1_2_DETALLE);
            contentValues.put(SQLConstantes.MODULO1_P2_1_NO,C1_P2_1_NO+"");
            contentValues.put(SQLConstantes.MODULO1_P2_2_1,C1_P2_2_1);
            contentValues.put(SQLConstantes.MODULO1_P2_2_2,C1_P2_2_2);
            contentValues.put(SQLConstantes.MODULO1_P2_2_2_DETALLE,C1_P2_2_2_DETALLE);
            contentValues.put(SQLConstantes.MODULO1_P2_2_NO,C1_P2_2_NO+"");
            contentValues.put(SQLConstantes.MODULO1_P3,C1_P3+"");
            contentValues.put(SQLConstantes.MODULO1_P3_0,C1_P3_0);
            contentValues.put(SQLConstantes.MODULO1_P4_1_1,C1_P4_1_1+"");
            contentValues.put(SQLConstantes.MODULO1_P4_2_1,C1_P4_2_1+"");
            data.actualizarModulo1(idempresa,contentValues);
        }else{
            //si no existe el elemento, lo construye para insertarlo
            modulo1 = new Modulo1();
            //llena el objeto a insertar
            modulo1.setMODULO1_ID(idempresa);
            modulo1.setC1_P0_0(C1_P0_0+"");
            modulo1.setC1_P0_1(C1_P0_1);
            modulo1.setC1_P0_2(C1_P0_2+"");
            modulo1.setC1_P0_3(C1_P0_3);
            modulo1.setC1_P1_1(C1_P1_1);
            modulo1.setC1_P1_2(C1_P1_2);
            modulo1.setC1_P1_2_DETALLE(C1_P1_2_DETALLE);
            modulo1.setC1_P2_1_1(C1_P2_1_1);
            modulo1.setC1_P2_1_2(C1_P2_1_2);
            modulo1.setC1_P2_1_2_DETALLE(C1_P2_1_2_DETALLE);
            modulo1.setC1_P2_1_NO(C1_P2_1_NO+"");
            modulo1.setC1_P2_2_1(C1_P2_2_1);
            modulo1.setC1_P2_2_2(C1_P2_2_2);
            modulo1.setC1_P2_2_2_DETALLE(C1_P2_2_2_DETALLE);
            modulo1.setC1_P2_2_NO(C1_P2_2_NO+"");
            modulo1.setC1_P3(C1_P3+"");
            modulo1.setC1_P3_0(C1_P3_0);
            modulo1.setC1_P4_1_1(C1_P4_1_1+"");
            modulo1.setC1_P4_2_1(C1_P4_2_1+"");
            data.insertarModulo1(modulo1);
        }
        data.close();
    }
    public boolean validar(){
        boolean valido = false;
        llenarMapaVariables();
        String mensaje = "";
        boolean vC1_P0_1 = false;boolean vC1_P0_2 = false;boolean vC1_P0_3 = false;
        boolean vC1_P1_1 = false;boolean vC1_P1_2 = false;
        boolean vC1_P2_1_1 = false;boolean vC1_P2_1_2 = false;
        boolean vC1_P2_2_1 = false;boolean vC1_P2_2_2 = false;
        boolean vC1_P3 = false;boolean vC1_P3_0 = false;
        boolean vC1_P4_1_1 = false;boolean vC1_P4_2_1 = false;

        //cabecera
        if(C1_P0_1.trim().length() != 0) vC1_P0_1 = true;
        else if(mensaje.equals(""))mensaje = "DATOS INFORMANTE: DEBE REGISTRAR NOMBRE DE INFORMANTE";
        if(C1_P0_2 >= 1 && C1_P0_2 <= 4){
            vC1_P0_2 = true;
            if(C1_P0_2 == 4){
                if(C1_P0_3.trim().length() >= 3) vC1_P0_3 = true;
                else if(mensaje.equals(""))mensaje = "DATOS INFORMANTE: DEBE REGISTRAR INFORMACION VALIDA EN ESPECIFIQUE";
            }
            else vC1_P0_3 = true;
        }else if(mensaje.equals(""))mensaje = "DATOS INFORMANTE: DEBE INDICAR CARGO DEL INFORMANTE";
        //p1
        if(C1_P1_1.trim().length() != 0){
            if(C1_P1_1.equals(C1_P2_1_1) || C1_P1_1.equals(C1_P2_2_1)){
                if(mensaje.equals(""))mensaje = "PREGUNTA 1: NO DEBE REGISTRAR 2 VECES LA MISMA ACTIVIDAD ECONOMICA";
            } else vC1_P1_1 = true;
        }
        else if(mensaje.equals(""))mensaje = "PREGUNTA 1: DEBE REGISTRAR ACTIVIDAD ECONOMICA PRINCIPAL DE LA EMPRESA";
        if(C1_P1_2.trim().length() != 0) vC1_P1_2 = true;
        else if(mensaje.equals(""))mensaje = "PREGUNTA 1: DEBE REGISTRAR EL CODIGO CIIU DE LA ACTIVIDAD ECONOMICA PRINCIPAL DE LA EMPRESA";
        //p2
        if(C1_P2_1_NO == 1){vC1_P2_1_1=true;vC1_P2_1_2=true;vC1_P2_2_1=true;vC1_P2_2_2=true;}
        else{
            if(C1_P2_1_1.trim().length() != 0){
               if(C1_P2_1_1.equals(C1_P2_1_2) || C1_P2_1_1.equals(C1_P1_1)) {
                   if(mensaje.equals(""))mensaje = "PREGUNTA 2: NO DEBE REGISTRAR 2 VECES LA MISMA ACTIVIDAD ECONOMICA";
               }else vC1_P2_1_1 = true;
            }
            else{
                if(C1_P2_2_1.trim().length() != 0){
                    if(mensaje.equals(""))mensaje = "PREGUNTA 2: DEBE REGISTRAR ACTIVIDAD SECUNDARIA 1 PRIMERO";
                }
                else if(mensaje.equals(""))mensaje = "PREGUNTA 2: DEBE REGISTRAR ACTIVIDAD SECUNDARIA 1 O INDICAR QUE NO TIENE";
            }
            if(C1_P2_1_2.trim().length() != 0) vC1_P2_1_2 = true;
            else if(mensaje.equals(""))mensaje = "PREGUNTA 2: DEBE REGISTRAR EL CODIGO CIUU DE LA ACTIVIDAD ECONOMICA SECUNDARIA 1";
            if(C1_P2_2_NO == 1){vC1_P2_2_1=true;vC1_P2_2_2=true;}
            else{
                if(C1_P2_2_1.trim().length() != 0){
                    if(C1_P2_2_1.equals(C1_P2_1_1) || C1_P2_2_1.equals(C1_P1_1)) {
                        if(mensaje.equals(""))mensaje = "PREGUNTA 2: NO DEBE REGISTRAR 2 VECES LA MISMA ACTIVIDAD ECONOMICA";
                    }else vC1_P2_2_1 = true;
                } else if(mensaje.equals(""))mensaje = "PREGUNTA 2: DEBE REGISTRAR ACTIVIDAD SECUNDARIA 2 O INDICAR NO TIENE";
                if(C1_P2_2_2.trim().length() != 0) vC1_P2_2_2 = true;
                else if(mensaje.equals(""))mensaje = "PREGUNTA 2: DEBE REGISTRAR EL CODIGO CIUU DE LA ACTIVIDAD ECONOMICA SECUNDARIA 2";
            }
        }

        //p3
        if(C1_P3 >= 0 && C1_P3 <= 6){
            vC1_P3=true;
            if(C1_P3 == 6){
                if(C1_P3_0.trim().length() >= 3) vC1_P3_0 = true;
                else if(mensaje.equals(""))mensaje = "PREGUNTA 3: DEBE REGISTRAR INFORMACION VALIDA EN ESPECIFIQUE";
            }
            else  vC1_P3_0 = true;
        }else if(mensaje.equals(""))mensaje = "PREGUNTA 3: DEBE INDICAR LA ORGANIZACION DE LA EMPRESA";
        //p4
        if(C1_P4_1_1 >= 0 && C1_P4_1_1 <= 2) vC1_P4_1_1=true;
        else if(mensaje.equals(""))mensaje = "PREGUNTA 4: DEBE INDICAR UN REGIMEN DE PROPIEDAD";
        if(C1_P4_2_1 >= 0 && C1_P4_2_1 <= 1) vC1_P4_2_1=true;
        else if(mensaje.equals(""))mensaje = "PREGUNTA 4: DEBE INDICAR EL TIPO DE CONTROL DE SU EMPRESA";

        valido = vC1_P0_1 && vC1_P0_2 && vC1_P0_3 && vC1_P1_1 &&
                vC1_P1_2 && vC1_P2_1_1 && vC1_P2_1_2 && vC1_P2_2_1 &&
                vC1_P2_2_2 && vC1_P3 && vC1_P3_0 && vC1_P4_1_1 && vC1_P4_2_1;
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
