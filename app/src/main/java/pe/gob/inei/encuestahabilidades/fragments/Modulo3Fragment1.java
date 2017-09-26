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
import android.widget.Toast;

import pe.gob.inei.encuestahabilidades.NumericKeyBoardTransformationMethod;
import pe.gob.inei.encuestahabilidades.R;
import pe.gob.inei.encuestahabilidades.modelo.Data;
import pe.gob.inei.encuestahabilidades.modelo.SQLConstantes;
import pe.gob.inei.encuestahabilidades.pojos.Identificacion;
import pe.gob.inei.encuestahabilidades.pojos.Modulo1;
import pe.gob.inei.encuestahabilidades.pojos.Modulo3;

import static android.widget.Toast.LENGTH_SHORT;

/**
 * A simple {@link Fragment} subclass.
 */
public class Modulo3Fragment1 extends Fragment {

    private LinearLayout lytP1;
    private LinearLayout lytP2;
    private LinearLayout lytP3;
    private LinearLayout lytP4;
    private LinearLayout lytP5;
    private LinearLayout lytP6;

    private LinearLayout lytFragment3;
    private CheckBox ckMismoInformante3;
    private EditText edtNombYApellidos3;
    private EditText edtEspecifiqueCargo3;
    private LinearLayout lytFondoSpinner3;
    private Spinner spCargo3;

    private RadioGroup rgP1;
    private RadioGroup rgP3;
    private RadioGroup rgP5;

    private EditText edtP2;
    private EditText edtP4;
    private EditText edtP5;
    private EditText edtP6;


    private Identificacion identificacion;
    String informante;
    String cargo="0";
    String cargos="";
    private String idempresa;
    private Modulo3 modulo3;
    private Context context;
    private Data data;

    //mapeo de variables
    int C3_P0_0;String C3_P0_1;int C3_P0_2;String C3_P0_3;
    int C3_P1;int C3_P2;int C3_P3;int C3_P4;int C3_P5;int C3_P5_1;
    int C3_P6;


    public Modulo3Fragment1() {
        // Required empty public constructor
    }
    @SuppressLint("ValidFragment")
    public Modulo3Fragment1(String idempresa, Context context) {
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
        View rootView = inflater.inflate(R.layout.fragment_modulo3_fragment1, container, false);

        lytP1 = (LinearLayout) rootView.findViewById(R.id.mod3_p1_lyt);
        lytP2 = (LinearLayout) rootView.findViewById(R.id.mod3_p2_lyt);
        lytP3 = (LinearLayout) rootView.findViewById(R.id.mod3_p3_lyt);
        lytP4 = (LinearLayout) rootView.findViewById(R.id.mod3_p4_lyt);
        lytP5 = (LinearLayout) rootView.findViewById(R.id.mod3_p5_lyt);
        lytP6 = (LinearLayout) rootView.findViewById(R.id.mod3_p6_lyt);

        rgP1 = (RadioGroup) rootView.findViewById(R.id.mod3_p1_rg);
        rgP3 = (RadioGroup) rootView.findViewById(R.id.mod3_p3_rg);
        rgP5 = (RadioGroup) rootView.findViewById(R.id.mod3_p5_rg);

        edtP2 = (EditText) rootView.findViewById(R.id.mod3_p2_edt);
        edtP4 = (EditText) rootView.findViewById(R.id.mod3_p4_edt);
        edtP5 = (EditText) rootView.findViewById(R.id.mod3_p5_edt);
        edtP6 = (EditText) rootView.findViewById(R.id.mod3_p6_edt);

        lytFragment3 = (LinearLayout) rootView.findViewById(R.id.mod3_layoutFragment1);
        ckMismoInformante3 = (CheckBox) rootView.findViewById(R.id.cab_ckMismoInformante);
        edtNombYApellidos3 = (EditText)rootView.findViewById(R.id.cab_edtApeYNom);
        spCargo3 = (Spinner) rootView.findViewById(R.id.cab_spCargo);
        edtEspecifiqueCargo3 = (EditText) rootView.findViewById(R.id.cab_edtEspecifiqueCargo);
        lytFondoSpinner3 = (LinearLayout) rootView.findViewById(R.id.cab_lytFondoSpinner);
        return rootView;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        /*DATOS INTRODUCTORIOS MODULO 3*/
        ckMismoInformante3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    edtNombYApellidos3.setBackgroundResource(R.drawable.fondo_edit_text_disabled);
                    lytFondoSpinner3.setBackgroundResource(R.drawable.fondo_spinner_disabled);
                    spCargo3.setEnabled(false);
                    edtNombYApellidos3.setText(informante);
                    spCargo3.setSelection(Integer.parseInt(cargo));
                    edtNombYApellidos3.setEnabled(false);
                    edtEspecifiqueCargo3.setText(cargos);
                    edtEspecifiqueCargo3.setEnabled(false);
                    edtEspecifiqueCargo3.setBackgroundResource(R.drawable.fondo_edit_text_disabled);
                    lytP1.requestFocus();
                }else{
                    edtNombYApellidos3.setText("");
                    spCargo3.setSelection(0);
                    edtNombYApellidos3.setBackgroundResource(R.drawable.fondo_edit_text);
                    edtNombYApellidos3.setEnabled(true);
                    lytFondoSpinner3.setBackgroundResource(R.drawable.fondo_spinner);
                    spCargo3.setEnabled(true);
                    edtEspecifiqueCargo3.setEnabled(true);
                    edtEspecifiqueCargo3.setBackgroundResource(R.drawable.fondo_edit_text);
                    edtNombYApellidos3.requestFocus();
                }
            }
        });
        edtNombYApellidos3.setFilters(new InputFilter[]{new InputFilter.AllCaps()});
        edtNombYApellidos3.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View view, int keyCode, KeyEvent keyEvent) {
                if ((keyEvent.getAction() == KeyEvent.ACTION_DOWN) &&
                        (keyCode == KeyEvent.KEYCODE_ENTER)) {
                    ocultarTeclado(lytFondoSpinner3);
                    lytFondoSpinner3.requestFocus();
                    return true;
                }
                return false;
            }
        });
        spCargo3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int pos, long l) {
                edtEspecifiqueCargo3.setVisibility(View.GONE);
                switch (pos){
                    case 0:break;
                    case 1:break;
                    case 2:break;
                    case 3:break;
                    case 4:
                        edtEspecifiqueCargo3.setVisibility(View.VISIBLE);
                        edtEspecifiqueCargo3.requestFocus();
                        break;
                }
                if (pos >= 0 && pos <4){
                    edtEspecifiqueCargo3.setText("");
                    lytP1.requestFocus();
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {}
        });
        edtEspecifiqueCargo3.setFilters(new InputFilter[]{new InputFilter.AllCaps()});
        edtEspecifiqueCargo3.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View view, int keyCode, KeyEvent keyEvent) {
                if ((keyEvent.getAction() == KeyEvent.ACTION_DOWN) && (keyCode == KeyEvent.KEYCODE_ENTER)) {
                    ocultarTeclado(edtEspecifiqueCargo3);
                    lytP1.requestFocus();
                    return true;
                }
                return false;
            }
        });
//        edtEspecifiqueCargo3.setOnFocusChangeListener(new View.OnFocusChangeListener() {
//            @Override
//            public void onFocusChange(View view, boolean conFocus) {
//                if(conFocus) {
//                    edtEspecifiqueCargo3.setBackgroundResource(R.drawable.caja_texto_enabled);
//                }
//                else if(view.isEnabled()){
//                    edtEspecifiqueCargo3.setBackgroundResource(R.drawable.cajas_de_texto);
//                }
//            }
//        });
        /*-------------------------------------------------------------------------------------*/

        EditText[] editTexts = {edtP2,edtP4,edtP5,edtP6};
        LinearLayout[] linearLayouts = {lytP2,lytP4,lytP5,lytP6};
        for (int i = 0; i <editTexts.length ; i++) {
            final EditText editText = editTexts[i];
            final LinearLayout linearLayout = linearLayouts[i];

            editText.setTransformationMethod(new NumericKeyBoardTransformationMethod());
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
        }
        ////////////////////////MENSAJE DE PREGUNTAS
        edtP2.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View view, int keyCode, KeyEvent keyEvent) {
                if(edtP2.equals("0"))
                {
                    Toast.makeText(getContext(),"Pregunta 2:Ingrese valores",Toast.LENGTH_SHORT).show();

                }
                else{
                    if ((keyEvent.getAction() == KeyEvent.ACTION_DOWN) &&
                            (keyCode == KeyEvent.KEYCODE_ENTER)) {
////                    if(edtP2.equals("0"))
////                    {
//                        Toast.makeText(getContext(),"Pregunta 2:Ingrese valores",Toast.LENGTH_SHORT).show();
//
////                    }
////                    else{
                        ocultarTeclado(edtP2);
                        edtP2.requestFocus();
                        return true;

//                    }

                    }
                }
                return false;
            }
        });




        rgP3.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, @IdRes int i) {
                switch (i) {
                    case R.id.mod3_p3_rb1:
                        lytP4.setVisibility(View.VISIBLE);
                        edtP4.setEnabled(true);
                        break;
                    case R.id.mod3_p3_rb2:
                        edtP4.setText("");
                        edtP4.setEnabled(false);
                        lytP4.setVisibility(View.GONE);
                        break;
                }
            }
        });


        edtP4.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {            }
            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {            }
            @Override
            public void afterTextChanged(Editable editable) {
                if (!editable.toString().equals("")) {
                    if (Integer.parseInt(edtP4.getText().toString()) >= 101) {
                        //Toast.makeText(context, "Debe registrar un porcentaje valido", Toast.LENGTH_SHORT).show();
                        edtP4.requestFocus();
                        edtP4.setText("");
                    }
                }
            }
        });

        rgP5.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, @IdRes int i) {
                switch (i){
                    case R.id.mod3_p5_rb1:
                        edtP5.setEnabled(true);
                        edtP5.setBackgroundResource(R.drawable.fondo_edit_text);
                        break;
                    case R.id.mod3_p5_rb2:
                        edtP5.setText("");
                        edtP5.setBackgroundResource(R.drawable.fondo_edit_text_disabled);
                        edtP5.setEnabled(false);
                        break;
                    case R.id.mod3_p5_rb3:
                        edtP5.setEnabled(true);
                        edtP5.setBackgroundResource(R.drawable.fondo_edit_text);
                        break;
                }
            }
        });

//        edtP6.setTransformationMethod(new NumericKeyBoardTransformationMethod());
  //      edtP6.setInputType(InputType.TYPE_CLASS_NUMBER | InputType.TYPE_NUMBER_FLAG_SIGNED);
        cargarDatos();
        lytFragment3.requestFocus();
        ocultarTeclado(lytFragment3);
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

    public void cargarDatos(){
        data = new Data(context);
        data.open();
        //verifico si ya existe un objeto con datos llenados previamente
        if(data.existeModulo3(idempresa)){
            //si existe traigo el objeto
            modulo3 = data.getModulo3(idempresa);
            //saco los datos del objeto para llenarlos en los elementos del fragment
            //datos cabecera
            if(modulo3.getC3_P0_0().equals("1")) ckMismoInformante3.setChecked(true);
            if(modulo3.getC3_P0_0().equals("0")) ckMismoInformante3.setChecked(false);
            edtNombYApellidos3.setText(modulo3.getC3_P0_1());
            if(!modulo3.getC3_P0_1().equals("")){
                spCargo3.setSelection(Integer.parseInt(modulo3.getC3_P0_2()));
            }
            edtEspecifiqueCargo3.setText(modulo3.getC3_P0_3());
            //pregunta 1
            if(!modulo3.getC3_P1().equals("") && !modulo3.getC3_P1().equals("-1")){
                ((RadioButton)rgP1.getChildAt(Integer.parseInt(modulo3.getC3_P1()))).setChecked(true);
            }

            //pregunta 2
            edtP2.setText(modulo3.getC3_P2());

            //pregunta 3
            if(!modulo3.getC3_P3().equals("") && !modulo3.getC3_P3().equals("-1")){
                ((RadioButton)rgP3.getChildAt(Integer.parseInt(modulo3.getC3_P3()))).setChecked(true);

            }

            //pregunta 4
            edtP4.setText(modulo3.getC3_P4());

            //pregunta 5
            if(!modulo3.getC3_P5().equals("") && !modulo3.getC3_P5().equals("-1")){
                ((RadioButton)rgP5.getChildAt(Integer.parseInt(modulo3.getC3_P5()))).setChecked(true);
                edtP5.setText(modulo3.getC3_P5_1());
            }

            //pregunta 6
            edtP6.setText(modulo3.getC3_P6());

        }
        data.close();
    }
    public void llenarMapaVariables(){
        //preguntas cabecera
        if(ckMismoInformante3.isChecked())C3_P0_0 = 1;
        else C3_P0_0 = 0;
        C3_P0_1 = edtNombYApellidos3.getText().toString();
        C3_P0_2 = spCargo3.getSelectedItemPosition();
        C3_P0_3 = edtEspecifiqueCargo3.getText().toString();
        //pregunta 1
        int childPosP1 = rgP1.indexOfChild(rgP1.findViewById(rgP1.getCheckedRadioButtonId()));
        C3_P1 = childPosP1;

        //pregunta 2
        if(!edtP2.getText().toString().equals("")){
            C3_P2 = Integer.parseInt( edtP2.getText().toString());

        }

        //pregunta 3
        int childPosP3 = rgP3.indexOfChild(rgP3.findViewById(rgP3.getCheckedRadioButtonId()));
        C3_P3 = childPosP3;

        //pregunta 4
        if(!edtP4.getText().toString().equals("")){
            C3_P4 = Integer.parseInt( edtP4.getText().toString());

        }


        //pregunta 5
        int childPosP5 = rgP5.indexOfChild(rgP5.findViewById(rgP5.getCheckedRadioButtonId()));
        C3_P5 = childPosP5;
        if(!edtP5.getText().toString().equals("")){
            C3_P5_1 =  Integer.parseInt( edtP5.getText().toString());

        }

        //pregunta 6
        if(!edtP6.getText().toString().equals("")){
            C3_P6 = Integer.parseInt( edtP6.getText().toString());
        }
//        if(!edtP6.getText().toString().equals("")){
//
//            String x = edtP6.getText().toString();
//            String y = x.substring(1,6);
//            if(x.equals("+"+y)){
//                Toast.makeText(context, "Pregunta 6: Ingrese solo numeros ", Toast.LENGTH_SHORT).show();
//            }
//            else { C3_P6 = Integer.parseInt(edtP6.getText().toString());}
//
//        }
//        if(!edtP6.getText().toString().equals("") || Integer.parseInt(edtP6.getText().toString())<=0 || Integer.parseInt(edtP6.getText().toString())>=0  ){
//            C3_P6 = Integer.parseInt(edtP6.getText().toString());
//        }
//        else {Toast.makeText(context, "Pregunta 6: Ingrese solo numeros ", Toast.LENGTH_SHORT).show(); }
//


    }
    public void guardarDatos(){
        data = new Data(context);
        data.open();
        if(data.existeModulo3(idempresa)){
            ContentValues contentValues = new ContentValues(19);
            contentValues.put(SQLConstantes.MODULO3_P0_0,C3_P0_0+"");
            contentValues.put(SQLConstantes.MODULO3_P0_1,C3_P0_1);
            contentValues.put(SQLConstantes.MODULO3_P0_2,C3_P0_2+"");
            contentValues.put(SQLConstantes.MODULO3_P0_3,C3_P0_3);
            contentValues.put(SQLConstantes.MODULO3_P1,C3_P1+"");
            contentValues.put(SQLConstantes.MODULO3_P2,C3_P2+"");
            contentValues.put(SQLConstantes.MODULO3_P3,C3_P3+"");
            contentValues.put(SQLConstantes.MODULO3_P4,C3_P4+"");
            contentValues.put(SQLConstantes.MODULO3_P5,C3_P5+"");
            contentValues.put(SQLConstantes.MODULO3_P5_1,C3_P5_1+"");
            contentValues.put(SQLConstantes.MODULO3_P6,C3_P6+"");
            data.actualizarModulo3(idempresa,contentValues);
        }else{
            //si no existe el elemento, lo construye para insertarlo
            modulo3 = new Modulo3();
            //llena el objeto a insertar
            modulo3.setMODULO3_ID(idempresa);
            modulo3.setC3_P0_0(C3_P0_0+"");
            modulo3.setC3_P0_1(C3_P0_1);
            modulo3.setC3_P0_2(C3_P0_2+"");
            modulo3.setC3_P0_3(C3_P0_3);
            modulo3.setC3_P1(C3_P1+"");
            modulo3.setC3_P2(C3_P2+"");
            modulo3.setC3_P3(C3_P3+"");
            modulo3.setC3_P4(C3_P4+"");
            modulo3.setC3_P5(C3_P5+"");
            modulo3.setC3_P5_1(C3_P5_1+"");
            modulo3.setC3_P6(C3_P6+"");
            data.insertarModulo3(modulo3);
        }
        data.close();
    }

    public boolean validar(){
        //revisarcampos
        boolean valido = true;
        String mensaje = "";
        llenarMapaVariables();
        boolean vC3_P0_1 = false;boolean vC3_P0_2 = false;boolean vC3_P0_3 = false;
        boolean vC3_P1 = false;boolean vC3_P2 = false;
        boolean vC3_P3 = false;boolean vC3_P4 = false;
        boolean vC3_P5_1 = false;boolean vC3_P5 = false;
        boolean vC3_P6 = false;

        //cabecera
        if(C3_P0_1.trim().length()<3)
        {mostrarMensaje("Ingrese 'Apellidos y nombres del informante'");
            valido=false;

        }else if(C3_P0_2 ==0)
        {mostrarMensaje("Seleccione el cargo del informante");
            valido=false;

        }else if(C3_P0_2 == 4 && C3_P0_3.trim().length() < 3)
        {mostrarMensaje("Debe registrar información valida en Especifique");
            valido=false;

        }else if(C3_P1 == -1 )
        {mostrarMensaje("Pregunta 1: Marque una opción ");
            valido=false;

        }else if(C3_P2 == 0 )
        {mostrarMensaje("Pregunta 2: Ingrese el monto de venta anual ");
            valido=false;

        }else if(C3_P3 == -1 )
        {mostrarMensaje("Pregunta 3: Marque una opción ");
            valido=false;

        }else if(C3_P3 == 0 && C3_P4 ==0 )
        {mostrarMensaje("Pregunta 4: Ingrese porcentaje de ventas anuales por exportación ");
            valido=false;

        }else if(C3_P5 == -1 )
        {mostrarMensaje("Pregunta 5: Marque una opción ");
            valido=false;

        }else if(C3_P5 == 0 && C3_P5_1 == 0)
        {mostrarMensaje("Pregunta 5: Ingrese el porcentaje aumentado");
            valido=false;

        }else if(C3_P5 == 2 && C3_P5_1 == 0) {
            mostrarMensaje("Pregunta 5: Ingrese el porcentaje disminuido");
            valido = false;
        }
//        }else if(C3_P6 == 0)
//        {mostrarMensaje("Pregunta 6: Ingrese el excedente bruto de explotacion");
//            valido=false;
//
//        }else if(C3_P6 >C3_P2 )
//        {mostrarMensaje("Pregunta 6: El excedente bruto de operación no puede ser mayor que las ventas anuales");
//            valido=false;
//        }
//       //cabecera
//        if(C3_P0_1.trim().length() != 0) vC3_P0_1 = true;
//        if(C3_P0_2 >= 1 && C3_P0_2 <= 4){
//            vC3_P0_2 = true;
//            if(C3_P0_2 == 4){if(C3_P0_3.trim().length() != 0) vC3_P0_3 = true;}
//            else vC3_P0_3 = true;
//        }

//            else vC3_P0_3 = true;



//        if(C3_P0_2 >= 1 && C3_P0_2 <= 4){
//            vC3_P0_2 = true;
//            if(C3_P0_2 == 4){if(C3_P0_3.trim().length() != 0) vC3_P0_3 = true;}
//            else vC3_P0_3 = true;
//        }
//        //p1
//        if(C3_P1 >= 0 && C3_P1 <= 2){
//            vC3_P1=true;
//        }
//
//        //p2
//        if(!(C3_P2+"").equals("") && C3_P2>0){
//            vC3_P2=true;
//        }
//
//        //p3 y p4
//        if(C3_P3 == 0 ){
//            vC3_P3=true;
//            if(!(C3_P4+"").equals("") && C3_P4>0){
//                vC3_P4=true;
//            }
//        }else if(C3_P3 == 1){
//            vC3_P3=true;
//            vC3_P4=true;
//        }
//
//        //p5
//        if(C3_P5 == 0 || C3_P5== 2){
//            vC3_P5=true;
//            if(!(C3_P5_1+"").equals("") && C3_P5_1>0 ){
//                vC3_P5_1=true;
//            }
//        }else if(C3_P5 == 1){
//            vC3_P5=true;
//            vC3_P5_1=true;
//        }
//
//        if(!(C3_P6+"").equals("") && C3_P6>0 ){
//            vC3_P6=true;
//        }

//          if(!vC3_P1) Toast.makeText(context, "Ingrese 'Apellidos y nombres del informante'", Toast.LENGTH_SHORT).show();

//        if(!vC3_P2) Toast.makeText(context, "DEBE INGRESAR UN VALOR MMAYOR A CERO EN LA PREGUNTA 2", Toast.LENGTH_SHORT).show();
//        if(!vC3_P4) Toast.makeText(context, "DEBE INGRESAR UN VALOR MMAYOR A CERO EN LA PREGUNTA 4", Toast.LENGTH_SHORT).show();
//        if(!vC3_P5) Toast.makeText(context, "DEBE INGRESAR UN VALOR MMAYOR A CERO EN LA PREGUNTA 5", Toast.LENGTH_SHORT).show();
//        if(!vC3_P6) Toast.makeText(context, "DEBE INGRESAR UN VALOR MMAYOR A CERO EN LA PREGUNTA 6", Toast.LENGTH_SHORT).show();

       // valido = vC3_P0_1 ;
//                && vC3_P0_2 && vC3_P0_3 && vC3_P1 &&
//                vC3_P2 && vC3_P3 && vC3_P4 && vC3_P5 &&
//                vC3_P6 && vC3_P5_1 ;

       // if(!valido) Toast.makeText(context, "Ingrese Informacion en el Formulario", Toast.LENGTH_SHORT).show();



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
