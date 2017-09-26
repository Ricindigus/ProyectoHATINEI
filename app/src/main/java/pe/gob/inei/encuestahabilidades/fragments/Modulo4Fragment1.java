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
import pe.gob.inei.encuestahabilidades.pojos.Modulo4;

/**
 * A simple {@link Fragment} subclass.
 */
public class Modulo4Fragment1 extends Fragment {

    //CABECERA INFORMANTE
    private LinearLayout lytFragment4;
    private CheckBox ckMismoInformante4;
    private EditText edtNombYApellidos4;
    private EditText edtEspecifiqueCargo4;
    private LinearLayout lytFondoSpinner4;
    private Spinner spCargo4;
    //PREGUNTA 1
    private RadioGroup mod4_p1_rgb;
    private LinearLayout lytP1;
    //PREGUNTA 2
    private RadioGroup mod4_p2_rgb;
    //PREGUNTA 3
    private RadioGroup mod4_p3_rgb;

    private Identificacion identificacion;
    String informante;
    String cargo="0";
    String cargos="";
    private String idempresa;
    private Modulo4 modulo4;
    private Context context;
    private Data data;

    //mapeo de variables
    int C4_P0_0;String C4_P0_1;int C4_P0_2;String C4_P0_3;
    int C4_P1;int C4_P2;int C4_P3;

    public Modulo4Fragment1() {
        // Required empty public constructor
    }

    @SuppressLint("ValidFragment")
    public Modulo4Fragment1(String idempresa, Context context) {
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
        View rootView = inflater.inflate(R.layout.fragment_modulo4_fragment1, container, false);
        lytFragment4 = (LinearLayout) rootView.findViewById(R.id.mod4_layoutFragment1);
        //CABEZERA INFORMANTE
        ckMismoInformante4 = (CheckBox) rootView.findViewById(R.id.mod4_cab_ckMismoInformante);
        edtNombYApellidos4 = (EditText)rootView.findViewById(R.id.mod4_cab_edtApeYNom);
        spCargo4 = (Spinner) rootView.findViewById(R.id.mod4_cab_spCargo);
        edtEspecifiqueCargo4 = (EditText) rootView.findViewById(R.id.mod4_cab_edtEspecifiqueCargo);
        lytFondoSpinner4 = (LinearLayout) rootView.findViewById(R.id.mod4_cab_lytFondoSpinner);
        //PREGUNTA 1
        mod4_p1_rgb  = (RadioGroup) rootView.findViewById(R.id.mod4_p1_rgb);
        lytP1 = (LinearLayout) rootView.findViewById(R.id.mod4_p1_ly);
        //PREGUNTA 2
        mod4_p2_rgb = (RadioGroup) rootView.findViewById(R.id.mod4_p2_rgb);
        //PREGUNTA 3
        mod4_p3_rgb = (RadioGroup) rootView.findViewById(R.id.mod4_p3_rgb);


        return rootView;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        /*DATOS INTRODUCTORIOS MODULO 1*/
        ckMismoInformante4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    edtNombYApellidos4.setBackgroundResource(R.drawable.fondo_edit_text_disabled);
                    lytFondoSpinner4.setBackgroundResource(R.drawable.fondo_spinner_disabled);
                    spCargo4.setEnabled(false);
                    edtNombYApellidos4.setText(informante);
                    spCargo4.setSelection(Integer.parseInt(cargo));
                    edtEspecifiqueCargo4.setText(cargos);
                    edtEspecifiqueCargo4.setEnabled(false);
                    edtEspecifiqueCargo4.setBackgroundResource(R.drawable.fondo_edit_text_disabled);
                    edtNombYApellidos4.setEnabled(false);
                }else{
                    edtNombYApellidos4.setText("");
                    spCargo4.setSelection(0);
                    edtNombYApellidos4.setBackgroundResource(R.drawable.fondo_edit_text);
                    edtNombYApellidos4.setEnabled(true);
                    lytFondoSpinner4.setBackgroundResource(R.drawable.fondo_spinner);
                    spCargo4.setEnabled(true);
                    edtEspecifiqueCargo4.setEnabled(true);
                    edtEspecifiqueCargo4.setBackgroundResource(R.drawable.fondo_edit_text);
                    edtNombYApellidos4.requestFocus();
                }
            }
        });
        edtNombYApellidos4.setFilters(new InputFilter[]{new InputFilter.AllCaps()});
        edtNombYApellidos4.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View view, int keyCode, KeyEvent keyEvent) {
                if ((keyEvent.getAction() == KeyEvent.ACTION_DOWN) &&
                        (keyCode == KeyEvent.KEYCODE_ENTER)) {
                    ocultarTeclado(lytFondoSpinner4);
                    lytFondoSpinner4.requestFocus();
                    return true;
                }
                return false;
            }
        });

        spCargo4.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int pos, long l) {
                edtEspecifiqueCargo4.setVisibility(View.GONE);
                switch (pos){
                    case 0:break;
                    case 1:break;
                    case 2:break;
                    case 3:break;
                    case 4:
                        edtEspecifiqueCargo4.setVisibility(View.VISIBLE);
                        edtEspecifiqueCargo4.requestFocus();
                        break;
                }
                if (pos >= 0 && pos <4){
                    edtEspecifiqueCargo4.setText("");
                    lytP1.requestFocus();
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {}
        });
        edtEspecifiqueCargo4.setFilters(new InputFilter[]{new InputFilter.AllCaps()});
        edtEspecifiqueCargo4.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View view, int keyCode, KeyEvent keyEvent) {
                if ((keyEvent.getAction() == KeyEvent.ACTION_DOWN) && (keyCode == KeyEvent.KEYCODE_ENTER)) {
                    ocultarTeclado(edtEspecifiqueCargo4);
                    lytP1.requestFocus();
                    return true;
                }
                return false;
            }
        });
//        edtEspecifiqueCargo4.setOnFocusChangeListener(new View.OnFocusChangeListener() {
//            @Override
//            public void onFocusChange(View view, boolean conFocus) {
//                if(conFocus) {
//                    edtEspecifiqueCargo4.setBackgroundResource(R.drawable.caja_texto_enabled);
//                }
//                else if(view.isEnabled()){
//                    edtEspecifiqueCargo4.setBackgroundResource(R.drawable.cajas_de_texto);
//                }
//            }
//        });
        /*-------------------------------------------------------------------------------------*/

        //PREGUNTA 1
        mod4_p1_rgb.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, @IdRes int i) {
                switch (i)
                {
                    case R.id.mod4_p1_rgb1:break;
                    case R.id.mod4_p1_rgb2:break;
                    case R.id.mod4_p1_rgb3:break;
                    case R.id.mod4_p1_rgb4:break;
                    case R.id.mod4_p1_rgb5:break;
                }
                mod4_p1_rgb.setBackgroundColor(Color.TRANSPARENT);
                mod4_p3_rgb.setBackgroundColor(Color.TRANSPARENT);
                mod4_p2_rgb.requestFocus();
                mod4_p2_rgb.setBackgroundColor(Color.CYAN);
            }
        });
        //PREGUNTA 2
        mod4_p2_rgb .setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, @IdRes int i) {
                switch (i)
                {
                    case R.id.mod4_p2_rgb1:break;
                    case R.id.mod4_p2_rgb2:break;
                    case R.id.mod4_p2_rgb3:break;
                    case R.id.mod4_p2_rgb4:break;
                    case R.id.mod4_p2_rgb5:break;
                }
                mod4_p2_rgb.setBackgroundColor(Color.TRANSPARENT);
                mod4_p3_rgb.requestFocus();
                mod4_p3_rgb.setBackgroundColor(Color.CYAN);
            }
        });
        //PREGUNTA 3
        mod4_p3_rgb .setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, @IdRes int i) {
                switch (i)
                {
                    case R.id.mod4_p3_rgb1:break;
                    case R.id.mod4_p3_rgb2:break;
                    case R.id.mod4_p3_rgb3:break;
                    case R.id.mod4_p3_rgb4:break;
                    case R.id.mod4_p3_rgb5:break;
                }
                mod4_p3_rgb.setBackgroundColor(Color.TRANSPARENT);

            }
        });

        cargarDatos();
        lytFragment4.requestFocus();
        ocultarTeclado(lytFragment4);

    }

    public void ocultarTeclado(View view){
        InputMethodManager mgr = (InputMethodManager) getActivity().getSystemService(Context.INPUT_METHOD_SERVICE);
        mgr.hideSoftInputFromWindow(view.getWindowToken(), 0);
    }

    public void cargarDatos(){
        data = new Data(context);
        data.open();
        //verifico si ya existe un objeto con datos llenados previamente
        if(data.existeModulo4(idempresa)){
            //si existe traigo el objeto
            modulo4 = data.getModulo4(idempresa);
            //saco los datos del objeto para llenarlos en los elementos del fragment
            //datos cabecera
            if(modulo4.getC4_P0_0().equals("1")) ckMismoInformante4.setChecked(true);
            if(modulo4.getC4_P0_0().equals("0")) ckMismoInformante4.setChecked(false);
            edtNombYApellidos4.setText(modulo4.getC4_P0_1());
            if(!modulo4.getC4_P0_2().equals("")){
                spCargo4.setSelection(Integer.parseInt(modulo4.getC4_P0_2()));
            }
            edtEspecifiqueCargo4.setText(modulo4.getC4_P0_3());
            //pregunta 1
            if(!modulo4.getC4_P1().equals("")){
                ((RadioButton)mod4_p1_rgb.getChildAt( Integer.parseInt(modulo4.getC4_P1()))).setChecked(true);
            }
            //pregunta 2
            if(!modulo4.getC4_P2().equals("")) {
                ((RadioButton) mod4_p2_rgb.getChildAt(Integer.parseInt(modulo4.getC4_P2()))).setChecked(true);
            }
            //pregunta 3
            if(!modulo4.getC4_P3().equals("")) {
                ((RadioButton) mod4_p3_rgb.getChildAt(Integer.parseInt(modulo4.getC4_P3()))).setChecked(true);
            }
        }
        data.close();
    }

    public void llenarMapaVariables(){
        //preguntas cabecera
        if(ckMismoInformante4.isChecked())C4_P0_0 = 1;
        else C4_P0_0 = 0;
        C4_P0_1 = edtNombYApellidos4.getText().toString();
        C4_P0_2 = spCargo4.getSelectedItemPosition();
        C4_P0_3 = edtEspecifiqueCargo4.getText().toString();
        //pregunta 1
        int childPosP1 = mod4_p1_rgb.indexOfChild(mod4_p1_rgb.findViewById(mod4_p1_rgb.getCheckedRadioButtonId()));
        C4_P1 = childPosP1;
        //pregunta 2
        int childPosP2 = mod4_p2_rgb.indexOfChild(mod4_p2_rgb.findViewById(mod4_p2_rgb.getCheckedRadioButtonId()));
        C4_P2 = childPosP2;
        //pregunta 3
        int childPosP3 = mod4_p3_rgb.indexOfChild(mod4_p3_rgb.findViewById(mod4_p3_rgb.getCheckedRadioButtonId()));
        C4_P3 = childPosP3;
    }

    public void guardarDatos(){
        data = new Data(context);
        data.open();
        if(data.existeModulo4(idempresa)){
            ContentValues contentValues = new ContentValues(54);
            contentValues.put(SQLConstantes.MODULO4_P0_0,C4_P0_0+"");
            contentValues.put(SQLConstantes.MODULO4_P0_1,C4_P0_1);
            contentValues.put(SQLConstantes.MODULO4_P0_2,C4_P0_2+"");
            contentValues.put(SQLConstantes.MODULO4_P0_3,C4_P0_3);
            contentValues.put(SQLConstantes.MODULO4_P1,C4_P1);
            contentValues.put(SQLConstantes.MODULO4_P2,C4_P2);
            contentValues.put(SQLConstantes.MODULO4_P3,C4_P3);
            data.actualizarModulo4(idempresa,contentValues);
        }else{
            //si no existe el elemento, lo construye para insertarlo
            modulo4 = new Modulo4();
            //llena el objeto a insertar
            modulo4.setMODULO4_ID(idempresa);
            modulo4.setC4_P0_0(C4_P0_0+"");
            modulo4.setC4_P0_1(C4_P0_1);
            modulo4.setC4_P0_2(C4_P0_2+"");
            modulo4.setC4_P0_3(C4_P0_3);
            modulo4.setC4_P1(C4_P1+"");
            modulo4.setC4_P2(C4_P2+"");
            modulo4.setC4_P3(C4_P3+"");
            data.insertarModulo4(modulo4);
        }
        data.close();
    }


    public boolean validar(){
        boolean valido = true;
        llenarMapaVariables();
        //cabecera
        if(C4_P0_1.trim().length()<3){
            mostrarMensaje("Ingrese 'Apellidos y nombres del informante'");
            valido=false;
        }else if(C4_P0_2 ==0){
            mostrarMensaje("Seleccione el cargo del informante");
            valido=false;
        }else if(C4_P0_2 == 4 && C4_P0_3.trim().length() < 3){
            mostrarMensaje("Debe registrar información valida en Especifique");
            valido=false;
        }else if(C4_P1 == -1){
            mostrarMensaje("Pregunta 1: Marque una opción ");
            valido=false;
        }else if(C4_P2 == -1){
            mostrarMensaje("Pregunta 2: Marque una opción ");
            valido=false;
        }else if(C4_P3 == -1){
            mostrarMensaje("Pregunta 3: Marque una opción ");
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
