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

import pe.gob.inei.encuestahabilidades.R;
import pe.gob.inei.encuestahabilidades.modelo.Data;
import pe.gob.inei.encuestahabilidades.modelo.SQLConstantes;
import pe.gob.inei.encuestahabilidades.pojos.Identificacion;
import pe.gob.inei.encuestahabilidades.pojos.Modulo1;
import pe.gob.inei.encuestahabilidades.pojos.Modulo7;

/**
 * A simple {@link Fragment} subclass.
 */
public class Modulo7Fragment1 extends Fragment {

    private LinearLayout lytP1;

    private LinearLayout lytFragment7;
    private CheckBox ckMismoInformante7;
    private EditText edtNombYApellidos7;
    private EditText edtEspecifiqueCargo7;
    private LinearLayout lytFondoSpinner7;
    private Spinner spCargo7;

    //VARIABLES PREGUNTA 1
    private LinearLayout mod7_p3_ly;
    private RadioGroup mod7_p1_rgb;
    private RadioGroup mod7_p2_rgb;
    private EditText   mod7_p3_edt;
    private RadioGroup mod7_p4_rgb;

    private Identificacion identificacion;
    String informante;
    String cargo="0";
    String cargos="";
    private String idempresa;
    private Modulo7 modulo7;
    private Context context;
    private Data data;

    //mapeo de variables
    int C7_P0_0;String C7_P0_1;int C7_P0_2;String C7_P0_3;
    int C7_P1; int C7_P2; String C7_P3; int C7_P4;

    public Modulo7Fragment1() {
        // Required empty public constructor
    }


    @SuppressLint("ValidFragment")
    public Modulo7Fragment1(String idempresa, Context context) {
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
        View rootView = inflater.inflate(R.layout.fragment_modulo7_fragment1, container, false);
        lytP1 = (LinearLayout) rootView.findViewById(R.id.mod7_p1_lyt);

        lytFragment7 = (LinearLayout) rootView.findViewById(R.id.mod7_layoutFragment1);
        ckMismoInformante7 = (CheckBox) rootView.findViewById(R.id.cab_ckMismoInformante);
        edtNombYApellidos7 = (EditText)rootView.findViewById(R.id.cab_edtApeYNom);
        spCargo7 = (Spinner) rootView.findViewById(R.id.cab_spCargo);
        edtEspecifiqueCargo7 = (EditText) rootView.findViewById(R.id.cab_edtEspecifiqueCargo);
        lytFondoSpinner7 = (LinearLayout) rootView.findViewById(R.id.cab_lytFondoSpinner);
        mod7_p3_ly = (LinearLayout) rootView.findViewById(R.id.mod7_p3_ly);
        mod7_p1_rgb = (RadioGroup) rootView.findViewById(R.id.mod7_p1_rgb);
        mod7_p2_rgb = (RadioGroup) rootView.findViewById(R.id.mod7_p2_rgb);
        mod7_p3_edt = (EditText)rootView.findViewById(R.id.mod7_p3_edt);
        mod7_p4_rgb = (RadioGroup) rootView.findViewById(R.id.mod7_p4_rgb);
        return rootView;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        /*DATOS INTRODUCTORIOS MODULO 7*/
        ckMismoInformante7.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    edtNombYApellidos7.setBackgroundResource(R.drawable.fondo_edit_text_disabled);
                    lytFondoSpinner7.setBackgroundResource(R.drawable.fondo_spinner_disabled);
                    spCargo7.setEnabled(false);
                    edtNombYApellidos7.setText(informante);
                    spCargo7.setSelection(Integer.parseInt(cargo));
                    edtEspecifiqueCargo7.setText(cargos);
                    edtEspecifiqueCargo7.setEnabled(false);
                    edtEspecifiqueCargo7.setBackgroundResource(R.drawable.fondo_edit_text_disabled);
                    edtNombYApellidos7.setEnabled(false);
//                    mod7_p1_rgb.requestFocus();
//                    mod7_p1_rgb.setBackgroundResource(R.drawable.cajas_de_texto);
//                    mod7_p1_rgb.setBackgroundColor(Color.CYAN);
                    //lytP1.requestFocus();
                }else{
                    edtNombYApellidos7.setText("");
                    spCargo7.setSelection(0);
                    edtNombYApellidos7.setBackgroundResource(R.drawable.fondo_edit_text);
                    edtNombYApellidos7.setEnabled(true);
                    lytFondoSpinner7.setBackgroundResource(R.drawable.fondo_spinner);
                    spCargo7.setEnabled(true);
                    edtEspecifiqueCargo7.setEnabled(true);
                    edtEspecifiqueCargo7.setBackgroundResource(R.drawable.fondo_edit_text);
                    edtNombYApellidos7.requestFocus();
                }
            }
        });
        edtNombYApellidos7.setFilters(new InputFilter[]{new InputFilter.AllCaps()});
        edtNombYApellidos7.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View view, int keyCode, KeyEvent keyEvent) {
                if ((keyEvent.getAction() == KeyEvent.ACTION_DOWN) &&
                        (keyCode == KeyEvent.KEYCODE_ENTER)) {
                    ocultarTeclado(edtNombYApellidos7);
                    lytFondoSpinner7.requestFocus();
                    return true;
                }
                return false;
            }
        });

        spCargo7.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int pos, long l) {
                edtEspecifiqueCargo7.setVisibility(View.GONE);
                switch (pos){
                    case 0:break;
                    case 1:break;
                    case 2:break;
                    case 3:break;
                    case 4:
                        edtEspecifiqueCargo7.setVisibility(View.VISIBLE);
                        edtEspecifiqueCargo7.requestFocus();
                        break;
                }
                if (pos >= 0 && pos <4)
//                    mod7_p1_rgb.requestFocus();
                    edtEspecifiqueCargo7.setText("");
                    lytP1.requestFocus();
            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {}
        });
        edtEspecifiqueCargo7.setFilters(new InputFilter[]{new InputFilter.AllCaps()});
        edtEspecifiqueCargo7.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View view, int keyCode, KeyEvent keyEvent) {
                if ((keyEvent.getAction() == KeyEvent.ACTION_DOWN) && (keyCode == KeyEvent.KEYCODE_ENTER)) {
                    ocultarTeclado(edtEspecifiqueCargo7);
                    lytP1.requestFocus();
                    return true;
                }
                return false;
            }
        });
//        edtEspecifiqueCargo7.setOnFocusChangeListener(new View.OnFocusChangeListener() {
//            @Override
//            public void onFocusChange(View view, boolean conFocus) {
//                if(conFocus) {
//                    edtEspecifiqueCargo7.setBackgroundResource(R.drawable.caja_texto_enabled);
//                }
//                else if(view.isEnabled()){
//                    edtEspecifiqueCargo7.setBackgroundResource(R.drawable.cajas_de_texto);
//                }
//            }
//        });
        /*-------------------------------------------------------------------------------------*/
        //PREGUNTA 1-
        RadioGroup[] radioGroups = {
                mod7_p1_rgb,mod7_p2_rgb,mod7_p4_rgb
        };
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

        EditText[] cajasDeTexto = {mod7_p3_edt};
        for (int i = 0; i < cajasDeTexto.length; i++) {
            final EditText editText = cajasDeTexto[i];
            editText.setOnFocusChangeListener(new View.OnFocusChangeListener() {
                @Override
                public void onFocusChange(View view, boolean conFocus) {
                    if(conFocus) {
                        editText.setBackgroundResource(R.drawable.caja_texto_enabled);
                        mostrarTeclado();
                    }
                    else if(view.isEnabled()){
                        editText.setBackgroundResource(R.drawable.cajas_de_texto);
                    }
                }
            });
        }


        //PREGUNTA 1.1
        mod7_p1_rgb.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, @IdRes int i) {
                switch (i){
                    case R.id.mod7_p1_rb_1:
                        break;
                    case R.id.mod7_p1_rb_2:
                        break;
                    case R.id.mod7_p1_rb_3:
                        break;


                }
                mod7_p2_rgb.requestFocus();
            }
        });
        //PREGUNTA 1.2
        mod7_p2_rgb.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, @IdRes int i) {
                switch (i){
                    case R.id.mod7_p2_rb_1:
                        mod7_p3_ly.setVisibility(View.VISIBLE);
                        mod7_p3_edt.requestFocus();
                        mod7_p3_edt.setBackgroundResource(R.drawable.caja_texto_enabled);

                        break;
                    case R.id.mod7_p2_rb_2:
                        mod7_p3_ly.setVisibility(View.GONE);
                        mod7_p4_rgb.requestFocus();
                        mod7_p3_edt.setText("");

                        break;


                }
                //mod7_p3_edt.requestFocus();
                //mod7_p3_edt.setBackgroundResource(R.drawable.caja_texto_enabled);
            }
        });
        //PREGUNTA 1.3
        mod7_p3_edt.setFilters(new InputFilter[]{new InputFilter.AllCaps()});
        mod7_p3_edt.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View view, int keyCode, KeyEvent keyEvent) {
                if ((keyEvent.getAction() == KeyEvent.ACTION_DOWN) &&
                        (keyCode == KeyEvent.KEYCODE_ENTER)) {
                    //ocultarTeclado(mod7_p4_rgb);
                    mod7_p4_rgb.requestFocus();
                    return true;
                }
                return false;
            }
        });
        cargarDatos();
       // lytFragment7.requestFocus();
        //ocultarTeclado(lytFragment7);

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
        //Toast.makeText(context,data.existeModulo7(idempresa)+ "", Toast.LENGTH_SHORT).show();
        if(data.existeModulo7(idempresa)){
            //si existe traigo el objeto
            modulo7 = data.getModulo7(idempresa);
            //saco los datos del objeto para llenarlos en los elementos del fragment
            //datos cabecera
            if(modulo7.getC7_P0_0().equals("1")) ckMismoInformante7.setChecked(true);
            if(modulo7.getC7_P0_0().equals("0")) ckMismoInformante7.setChecked(false);
            edtNombYApellidos7.setText(modulo7.getC7_P0_1());
            if(!modulo7.getC7_P0_2().equals("")){
                spCargo7.setSelection(Integer.parseInt(modulo7.getC7_P0_2()));
            }
            edtEspecifiqueCargo7.setText(modulo7.getC7_P0_3());
            //pregunta 1
            if(!modulo7.getC7_P1().equals("") && !modulo7.getC7_P1().equals("-1")){
                int childPos1 = Integer.parseInt(modulo7.getC7_P1());
                ((RadioButton)mod7_p1_rgb.getChildAt(childPos1)).setChecked(true);
            }
            //pregunta 2
            if(!modulo7.getC7_P2().equals("")&& !modulo7.getC7_P2().equals("-1")){
                ((RadioButton)mod7_p2_rgb.getChildAt(Integer.parseInt(modulo7.getC7_P2()))).setChecked(true);
            }
            mod7_p3_edt.setText(modulo7.getC7_P3());
            //pregunta 4
            if(!modulo7.getC7_P4().equals("")&& !modulo7.getC7_P4().equals("-1")){
                int childPos4 = Integer.parseInt(modulo7.getC7_P4());
                ((RadioButton)mod7_p4_rgb.getChildAt(childPos4)).setChecked(true);
            }

        }
        data.close();
    }

    public void llenarMapaVariables(){
        //preguntas cabecera
        if(ckMismoInformante7.isChecked())C7_P0_0 = 1;
        else C7_P0_0 = 0;
        C7_P0_1 = edtNombYApellidos7.getText().toString();
        C7_P0_2 = spCargo7.getSelectedItemPosition();
        C7_P0_3 = edtEspecifiqueCargo7.getText().toString();
        //pregunta 1
        C7_P1 = mod7_p1_rgb.indexOfChild(mod7_p1_rgb.findViewById(mod7_p1_rgb.getCheckedRadioButtonId()));
        C7_P2 = mod7_p2_rgb.indexOfChild(mod7_p2_rgb.findViewById(mod7_p2_rgb.getCheckedRadioButtonId()));
        C7_P3 = mod7_p3_edt.getText().toString();

        C7_P4 = mod7_p4_rgb.indexOfChild(mod7_p4_rgb.findViewById(mod7_p4_rgb.getCheckedRadioButtonId()));
    }

    public void guardarDatos(){
        data = new Data(context);
        data.open();
        if(data.existeModulo7(idempresa)){
            ContentValues contentValues = new ContentValues(255);
            contentValues.put(SQLConstantes.MODULO7_P0_0,C7_P0_0+"");
            contentValues.put(SQLConstantes.MODULO7_P0_1,C7_P0_1);
            contentValues.put(SQLConstantes.MODULO7_P0_2,C7_P0_2+"");
            contentValues.put(SQLConstantes.MODULO7_P0_3,C7_P0_3);
            contentValues.put(SQLConstantes.MODULO7_P1,C7_P1+"");
            contentValues.put(SQLConstantes.MODULO7_P2,C7_P2+"");
            contentValues.put(SQLConstantes.MODULO7_P3,C7_P3);
            contentValues.put(SQLConstantes.MODULO7_P4,C7_P4+"");
            data.actualizarModulo7(idempresa,contentValues);
        }else{
            //si no existe el elemento, lo construye para insertarlo
            modulo7 = new Modulo7();
            //llena el objeto a insertar
            modulo7.setMODULO7_ID(idempresa);
            modulo7.setC7_P0_0(C7_P0_0+"");
            modulo7.setC7_P0_1(C7_P0_1);
            modulo7.setC7_P0_2(C7_P0_2+"");
            modulo7.setC7_P0_3(C7_P0_3);
            modulo7.setC7_P1(C7_P1+"");
            modulo7.setC7_P2(C7_P2+"");
            modulo7.setC7_P3(C7_P3);
            modulo7.setC7_P4(C7_P4+"");
            data.insertarModulo7(modulo7);
        }
        data.close();
    }

    public boolean validar(){
        //revisarcampos
        boolean valido = true;
        llenarMapaVariables();
        boolean vC7_P0_1 = false;boolean vC7_P0_2 = false;boolean vC7_P0_3 = false;
        boolean vC7_P1 = false;boolean vC7_P2 = false;
        boolean vC7_P3 = false;boolean vC7_P4 = false;

        //cabecera
        if(C7_P0_1.trim().length()<3)
        {mostrarMensaje("Ingrese 'Apellidos y nombres del informante'");
            valido=false;
        }else if(C7_P0_2 ==0)
        {mostrarMensaje("Seleccione el cargo del informante");
            valido=false;
        }else if(C7_P0_2 == 4 && C7_P0_3.trim().length() < 3)
        {mostrarMensaje("Debe registrar información valida en Especifique");
            valido=false;
        }else if(C7_P1==-1){
            mostrarMensaje("Pregunta 1: Marque una opción ");
            valido=false;
        }else if(C7_P2==-1){
            mostrarMensaje("Pregunta 2: Marque una opción ");
            valido=false;
        }else if(C7_P2==0 && C7_P3.equals("") ){
            mostrarMensaje("Pregunta 3: Debe registrar la empresa que lo certificó");
            valido=false;
        }else if(C7_P4==-1 ){
            mostrarMensaje("Pregunta 4: Marque una opción");
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
