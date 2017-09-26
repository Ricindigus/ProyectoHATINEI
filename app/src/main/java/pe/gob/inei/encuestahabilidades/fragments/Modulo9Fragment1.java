package pe.gob.inei.encuestahabilidades.fragments;


import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
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

import pe.gob.inei.encuestahabilidades.R;
import pe.gob.inei.encuestahabilidades.modelo.Data;
import pe.gob.inei.encuestahabilidades.modelo.SQLConstantes;
import pe.gob.inei.encuestahabilidades.pojos.Identificacion;
import pe.gob.inei.encuestahabilidades.pojos.Modulo1;
import pe.gob.inei.encuestahabilidades.pojos.Modulo9;

/**
 * A simple {@link Fragment} subclass.
 */
public class Modulo9Fragment1 extends Fragment {

    private LinearLayout lytP1;

    private LinearLayout lytFragment9;
    private CheckBox ckMismoInformante9;
    private EditText edtNombYApellidos9;
    private EditText edtEspecifiqueCargo9;
    private LinearLayout lytFondoSpinner9;
    private Spinner spCargo9;
    private EditText edtObservaciones;

    private RadioGroup rgP1;
    private RadioGroup rgP2;

    private Identificacion identificacion;
    String informante;
    String cargo="0";
    String cargos="";

    private String idempresa;
    private Modulo9 modulo9;
    private Context context;
    private Data data;

    private String MODULO9_ID;
    private int C9_P0_0;
    private String C9_P0_1;
    private int C9_P0_2;
    private String C9_P0_3;
    private int C9_P1;
    private int C9_P2;
    private String OBS_MOD_IX;

    public Modulo9Fragment1() {
        // Required empty public constructor
    }

    @SuppressLint("ValidFragment")
    public Modulo9Fragment1(String idempresa, Context context) {
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
        View rootView;
        rootView = inflater.inflate(R.layout.fragment_modulo9_fragment1, container, false);
        lytP1 = (LinearLayout) rootView.findViewById(R.id.mod9_p1_lyt);

        lytFragment9 = (LinearLayout) rootView.findViewById(R.id.mod9_layoutFragment1);
        ckMismoInformante9 = (CheckBox) rootView.findViewById(R.id.cab_ckMismoInformante);
        edtNombYApellidos9 = (EditText)rootView.findViewById(R.id.cab_edtApeYNom);
        spCargo9= (Spinner) rootView.findViewById(R.id.cab_spCargo);
        edtEspecifiqueCargo9 = (EditText) rootView.findViewById(R.id.cab_edtEspecifiqueCargo);
        lytFondoSpinner9 = (LinearLayout) rootView.findViewById(R.id.cab_lytFondoSpinner);
        rgP1 = (RadioGroup) rootView.findViewById(R.id.mod9_p1_rg);
        rgP2 = (RadioGroup) rootView.findViewById(R.id.mod9_p2_rg);
        edtObservaciones= (EditText)rootView.findViewById(R.id.edtObservaciones);
        return rootView;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        /*DATOS INTRODUCTORIOS MODULO 9*/
        ckMismoInformante9.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    edtNombYApellidos9.setBackgroundResource(R.drawable.fondo_edit_text_disabled);
                    lytFondoSpinner9.setBackgroundResource(R.drawable.fondo_spinner_disabled);
                    spCargo9.setEnabled(false);
                    edtNombYApellidos9.setText(informante);
                    spCargo9.setSelection(Integer.parseInt(cargo));
                    edtEspecifiqueCargo9.setText(cargos);
                    edtNombYApellidos9.setEnabled(false);
                    edtEspecifiqueCargo9.setEnabled(false);
                    edtEspecifiqueCargo9.setBackgroundResource(R.drawable.fondo_edit_text_disabled);

                    lytP1.requestFocus();
                }else{
                    edtNombYApellidos9.setText("");
                    spCargo9.setSelection(0);
                    edtNombYApellidos9.setBackgroundResource(R.drawable.fondo_edit_text);
                    edtNombYApellidos9.setEnabled(true);
                    lytFondoSpinner9.setBackgroundResource(R.drawable.fondo_spinner);
                    spCargo9.setEnabled(true);
                    edtEspecifiqueCargo9.setEnabled(true);
                    edtEspecifiqueCargo9.setBackgroundResource(R.drawable.fondo_edit_text);
                    edtNombYApellidos9.requestFocus();
                }
            }
        });
        edtNombYApellidos9.setFilters(new InputFilter[]{new InputFilter.AllCaps()});
        edtNombYApellidos9.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View view, int keyCode, KeyEvent keyEvent) {
                if ((keyEvent.getAction() == KeyEvent.ACTION_DOWN) &&
                        (keyCode == KeyEvent.KEYCODE_ENTER)) {
                    ocultarTeclado(edtNombYApellidos9);
                    lytFondoSpinner9.requestFocus();
                    return true;
                }
                return false;
            }
        });

        spCargo9.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int pos, long l) {
                edtEspecifiqueCargo9.setVisibility(View.GONE);
                switch (pos){
                    case 0:break;
                    case 1:break;
                    case 2:break;
                    case 3:break;
                    case 4:
                        edtEspecifiqueCargo9.setVisibility(View.VISIBLE);
                        edtEspecifiqueCargo9.requestFocus();
                        break;
                }
                if (pos >= 0 && pos <4){
                    edtEspecifiqueCargo9.setText("");
                    lytP1.requestFocus();
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {}
        });
        edtEspecifiqueCargo9.setFilters(new InputFilter[]{new InputFilter.AllCaps()});
        edtEspecifiqueCargo9.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View view, int keyCode, KeyEvent keyEvent) {
                if ((keyEvent.getAction() == KeyEvent.ACTION_DOWN) && (keyCode == KeyEvent.KEYCODE_ENTER)) {
                    ocultarTeclado(edtEspecifiqueCargo9);
                    lytP1.requestFocus();
                    return true;
                }
                return false;
            }
        });
//        edtEspecifiqueCargo9.setOnFocusChangeListener(new View.OnFocusChangeListener() {
//            @Override
//            public void onFocusChange(View view, boolean conFocus) {
//                if(conFocus) {
//                    edtEspecifiqueCargo9.setBackgroundResource(R.drawable.caja_texto_enabled);
//                }
//                else if(view.isEnabled()){
//                    edtEspecifiqueCargo9.setBackgroundResource(R.drawable.cajas_de_texto);
//                }
//            }
//        });
        /*-------------------------------------------------------------------------------------*/
        //OBSERVACIONES
        edtObservaciones.setFilters(new InputFilter[]{new InputFilter.AllCaps()});
        cargarDatos();
    }

    public void ocultarTeclado(View view){
        InputMethodManager mgr = (InputMethodManager) getActivity().getSystemService(Context.INPUT_METHOD_SERVICE);
        mgr.hideSoftInputFromWindow(view.getWindowToken(), 0);
        
    }

    public void cargarDatos(){
        data = new Data(context);
        data.open();
        //verifico si ya existe un objeto con datos llenados previamente
        if(data.existeModulo9(idempresa)){
            //si existe traigo el objeto
            modulo9 = data.getModulo9(idempresa);
            //saco los datos del objeto para llenarlos en los elementos del fragment
            //datos cabecera
            if(modulo9.getC9_P0_0().equals("1")) ckMismoInformante9.setChecked(true);
            if(modulo9.getC9_P0_0().equals("0")) ckMismoInformante9.setChecked(false);
            edtNombYApellidos9.setText(modulo9.getC9_P0_1());
            spCargo9.setSelection(Integer.parseInt(modulo9.getC9_P0_2()));
            edtEspecifiqueCargo9.setText(modulo9.getC9_P0_3());
            //pregunta 1
            int childPos1 = Integer.parseInt(modulo9.getC9_P1());
            ((RadioButton)rgP1.getChildAt(childPos1)).setChecked(true);
            //pregunta 2
            int childPos2 = Integer.parseInt(modulo9.getC9_P2());
            ((RadioButton)rgP2.getChildAt(childPos2)).setChecked(true);
            //observaciones
            edtObservaciones.setText(modulo9.getOBS_MOD_IX());
        }
        data.close();
    }
    public void llenarMapaVariables(){
        //preguntas cabecera
        if(ckMismoInformante9.isChecked())C9_P0_0 = 1;
        else C9_P0_0 = 0;
        C9_P0_1 = edtNombYApellidos9.getText().toString();
        C9_P0_2 = spCargo9.getSelectedItemPosition();
        C9_P0_3 = edtEspecifiqueCargo9.getText().toString();
        //pregunta 1
        int childPosP1 = rgP1.indexOfChild(rgP1.findViewById(rgP1.getCheckedRadioButtonId()));
        C9_P1 = childPosP1;
        //pregunta 2
        int childPosP2 = rgP2.indexOfChild(rgP2.findViewById(rgP2.getCheckedRadioButtonId()));
        C9_P2 = childPosP2;
        //Observaciones
        OBS_MOD_IX = edtObservaciones.getText().toString();
    }
    public void guardarDatos(){
        data = new Data(context);
        data.open();
        if(data.existeModulo9(idempresa)){
            ContentValues contentValues = new ContentValues(8);
            contentValues.put(SQLConstantes.MODULO9_P0_0,C9_P0_0);
            contentValues.put(SQLConstantes.MODULO9_P0_1,C9_P0_1);
            contentValues.put(SQLConstantes.MODULO9_P0_2,C9_P0_2);
            contentValues.put(SQLConstantes.MODULO9_P0_3,C9_P0_3);
            contentValues.put(SQLConstantes.MODULO9_P1,C9_P1);
            contentValues.put(SQLConstantes.MODULO9_P2,C9_P2);
            contentValues.put(SQLConstantes.MODULO9_OBS_MOD_IX,OBS_MOD_IX);
            data.actualizarModulo9(idempresa,contentValues);
        }else{
            //si no existe el elemento, lo construye para insertarlo
            modulo9 = new Modulo9();
            //llena el objeto a insertar
            modulo9.setMODULO9_ID(idempresa);
            modulo9.setC9_P0_0(C9_P0_0+"");
            modulo9.setC9_P0_1(C9_P0_1);
            modulo9.setC9_P0_2(C9_P0_2+"");
            modulo9.setC9_P0_3(C9_P0_3);
            modulo9.setC9_P1(C9_P1+"");
            modulo9.setC9_P2(C9_P2+"");
            modulo9.setOBS_MOD_IX(OBS_MOD_IX);
            data.insertarModulo9(modulo9);
        }
        data.close();
    }
    public boolean validar(){
        boolean valido = true;
        llenarMapaVariables();

        if(C9_P0_1.trim().length()<3){
            mostrarMensaje("Ingrese 'Apellidos y nombres del informante'");
            valido=false;
        }else if(C9_P0_2 ==0){
            mostrarMensaje("Seleccione el cargo del informante");
            valido=false;
        }else if(C9_P0_2 == 4 && C9_P0_3.trim().length() < 3){
            mostrarMensaje("Debe registrar información valida en Especifique");
            valido=false;
        }else if(C9_P1==-1 ){
            mostrarMensaje("Pregunta 1: Debe seleccionar una opción");
            valido=false;
        }else if(C9_P2==-1 ){
            mostrarMensaje("Pregunta 2: Debe seleccionar una opción");
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
