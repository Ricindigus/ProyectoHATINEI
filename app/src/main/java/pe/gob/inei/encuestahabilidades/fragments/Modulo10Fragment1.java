package pe.gob.inei.encuestahabilidades.fragments;


import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AlertDialog;
import android.support.v7.widget.LinearLayoutManager;
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
import android.widget.Spinner;

import pe.gob.inei.encuestahabilidades.NumericKeyBoardTransformationMethod;
import pe.gob.inei.encuestahabilidades.R;
import pe.gob.inei.encuestahabilidades.modelo.Data;
import pe.gob.inei.encuestahabilidades.modelo.SQLConstantes;
import pe.gob.inei.encuestahabilidades.pojos.Identificacion;
import pe.gob.inei.encuestahabilidades.pojos.Modulo1;
import pe.gob.inei.encuestahabilidades.pojos.Modulo10;
import pe.gob.inei.encuestahabilidades.pojos.Modulo9;

/**
 * A simple {@link Fragment} subclass.
 */
public class Modulo10Fragment1 extends Fragment {

    private LinearLayout lytFragment10;
    private CheckBox ckMismoInformante10;
    private EditText edtNombYApellidos10;
    private EditText edtEspecifiqueCargo10;
    private LinearLayout lytFondoSpinner10;
    private Spinner spCargo10;
    private EditText edtObservaciones;

    private LinearLayout lytP1;
    private LinearLayout lytP2;
    private LinearLayout lytP3;
    private LinearLayout lytP4;

    private EditText edt1;
    private EditText edt2;
    private EditText edt3;
    private EditText edt4;

    private String MODULO9_ID;
    private int C10_P0_0;
    private String C10_P0_1;
    private int C10_P0_2;
    private String C10_P0_3;
    private String C10_P1;
    private String C10_P2;
    private String C10_P3;
    private String C10_P4;
    private String OBS_MOD_X;

    private String idempresa;
    private Modulo10 modulo10;
    private Context context;
    private Data data;

    private Identificacion identificacion;
    String informante;
    String cargo="0";
    String cargos="";



    @SuppressLint("ValidFragment")
    public Modulo10Fragment1(String idempresa, Context context) {
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

    public Modulo10Fragment1() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_modulo10_fragment1, container, false);
        lytP1 = (LinearLayout) rootView.findViewById(R.id.mod10_p1_lyt);
        lytP2 = (LinearLayout) rootView.findViewById(R.id.mod10_p2_lyt);
        lytP3 = (LinearLayout) rootView.findViewById(R.id.mod10_p3_lyt);
        lytP4 = (LinearLayout) rootView.findViewById(R.id.mod10_p4_lyt);

        edt1 = (EditText) rootView.findViewById(R.id.mod10_p1_edt);
        edt2 = (EditText) rootView.findViewById(R.id.mod10_p2_edt);
        edt3 = (EditText) rootView.findViewById(R.id.mod10_p3_edt);
        edt4 = (EditText) rootView.findViewById(R.id.mod10_p4_edt);

        lytFragment10 = (LinearLayout) rootView.findViewById(R.id.mod10_layoutFragment1);
        ckMismoInformante10 = (CheckBox) rootView.findViewById(R.id.cab_ckMismoInformante);
        edtNombYApellidos10 = (EditText)rootView.findViewById(R.id.cab_edtApeYNom);
        spCargo10 = (Spinner) rootView.findViewById(R.id.cab_spCargo);
        edtEspecifiqueCargo10 = (EditText) rootView.findViewById(R.id.cab_edtEspecifiqueCargo);
        lytFondoSpinner10 = (LinearLayout) rootView.findViewById(R.id.cab_lytFondoSpinner);
        edtObservaciones= (EditText)rootView.findViewById(R.id.edtObservaciones);

        return rootView;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        /*DATOS INTRODUCTORIOS MODULO 9*/
        ckMismoInformante10.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    edtNombYApellidos10.setBackgroundResource(R.drawable.fondo_edit_text_disabled);
                    lytFondoSpinner10.setBackgroundResource(R.drawable.fondo_spinner_disabled);
                    spCargo10.setEnabled(false);
                    edtNombYApellidos10.setText(informante);
                    spCargo10.setSelection(Integer.parseInt(cargo));
                    edtEspecifiqueCargo10.setText(cargos);
                    edtNombYApellidos10.setEnabled(false);
                    edtEspecifiqueCargo10.setEnabled(false);
                    edtEspecifiqueCargo10.setBackgroundResource(R.drawable.fondo_edit_text_disabled);
                    lytP1.requestFocus();
                }else{
                    edtNombYApellidos10.setText("");
                    spCargo10.setSelection(0);
                    edtNombYApellidos10.setBackgroundResource(R.drawable.fondo_edit_text);
                    edtNombYApellidos10.setEnabled(true);
                    lytFondoSpinner10.setBackgroundResource(R.drawable.fondo_spinner);
                    spCargo10.setEnabled(true);
                    edtEspecifiqueCargo10.setEnabled(true);
                    edtEspecifiqueCargo10.setBackgroundResource(R.drawable.fondo_edit_text);
                    edtNombYApellidos10.requestFocus();
                }
            }
        });
        edtNombYApellidos10.setFilters(new InputFilter[]{new InputFilter.AllCaps()});
        edtNombYApellidos10.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View view, int keyCode, KeyEvent keyEvent) {
                if ((keyEvent.getAction() == KeyEvent.ACTION_DOWN) &&
                        (keyCode == KeyEvent.KEYCODE_ENTER)) {
                    ocultarTeclado(edtNombYApellidos10);
                    lytFondoSpinner10.requestFocus();
                    return true;
                }
                return false;
            }
        });

        spCargo10.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int pos, long l) {
                edtEspecifiqueCargo10.setVisibility(View.GONE);
                switch (pos){
                    case 0:break;
                    case 1:break;
                    case 2:break;
                    case 3:break;
                    case 4:
                        edtEspecifiqueCargo10.setVisibility(View.VISIBLE);
                        edtEspecifiqueCargo10.requestFocus();
                        break;
                }
                if (pos >= 0 && pos <4){
                    edtEspecifiqueCargo10.setText("");
                    lytP1.requestFocus();
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {}
        });
        edtEspecifiqueCargo10.setFilters(new InputFilter[]{new InputFilter.AllCaps()});
        edtEspecifiqueCargo10.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View view, int keyCode, KeyEvent keyEvent) {
                if ((keyEvent.getAction() == KeyEvent.ACTION_DOWN) && (keyCode == KeyEvent.KEYCODE_ENTER)) {
                    ocultarTeclado(edtEspecifiqueCargo10);
                    lytP1.requestFocus();
                    return true;
                }
                return false;
            }
        });

        edt1.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View view, int keyCode, KeyEvent keyEvent) {
                if ((keyEvent.getAction() == KeyEvent.ACTION_DOWN) &&
                        (keyCode == KeyEvent.KEYCODE_ENTER)) {
                    ocultarTeclado(edt1);
                    lytP1.requestFocus();
                    return true;
                }
                return false;
            }
        });
        edt2.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View view, int keyCode, KeyEvent keyEvent) {
                if ((keyEvent.getAction() == KeyEvent.ACTION_DOWN) &&
                        (keyCode == KeyEvent.KEYCODE_ENTER)) {
                    ocultarTeclado(edt2);
                    lytP2.requestFocus();
                    return true;
                }
                return false;
            }
        });
        edt3.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View view, int keyCode, KeyEvent keyEvent) {
                if ((keyEvent.getAction() == KeyEvent.ACTION_DOWN) &&
                        (keyCode == KeyEvent.KEYCODE_ENTER)) {
                    ocultarTeclado(edt3);
                    lytP3.requestFocus();
                    return true;
                }
                return false;
            }
        });
        edt4.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View view, int keyCode, KeyEvent keyEvent) {
                if ((keyEvent.getAction() == KeyEvent.ACTION_DOWN) &&
                        (keyCode == KeyEvent.KEYCODE_ENTER)) {
                    ocultarTeclado(edt4);
                    lytP4.requestFocus();
                    return true;
                }
                return false;
            }
        });

        edt1.setTransformationMethod(new NumericKeyBoardTransformationMethod());
        edt2.setTransformationMethod(new NumericKeyBoardTransformationMethod());
        edt3.setTransformationMethod(new NumericKeyBoardTransformationMethod());
        edt4.setTransformationMethod(new NumericKeyBoardTransformationMethod());

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
        if(data.existeModulo10(idempresa)){
            //si existe traigo el objeto
            modulo10 = data.getModulo10(idempresa);
            //saco los datos del objeto para llenarlos en los elementos del fragment
            //datos cabecera
            if(modulo10.getC10_P0_0().equals("1")) ckMismoInformante10.setChecked(true);
            if(modulo10.getC10_P0_0().equals("0")) ckMismoInformante10.setChecked(false);
            edtNombYApellidos10.setText(modulo10.getC10_P0_1());
            spCargo10.setSelection(Integer.parseInt(modulo10.getC10_P0_2()));
            edtEspecifiqueCargo10.setText(modulo10.getC10_P0_3());
            edtObservaciones.setText(modulo10.getOBS_MOD_X());

            edt1.setText(modulo10.getC10_P1());
            edt2.setText(modulo10.getC10_P2());
            edt3.setText(modulo10.getC10_P3());
            edt4.setText(modulo10.getC10_P4());

            edtObservaciones.setText(modulo10.getOBS_MOD_X());
        }
        data.close();

    }


    public void llenarMapaVariables(){
        //preguntas cabecera
        if(ckMismoInformante10.isChecked())C10_P0_0 = 1;
        else C10_P0_0 = 0;
        C10_P0_1 = edtNombYApellidos10.getText().toString();
        C10_P0_2 = spCargo10.getSelectedItemPosition();
        C10_P0_3 = edtEspecifiqueCargo10.getText().toString();
        //preguntas
        C10_P1 = edt1.getText().toString();
        C10_P2 = edt2.getText().toString();
        C10_P3 = edt3.getText().toString();
        C10_P4 = edt4.getText().toString();
        //Observaciones
        OBS_MOD_X = edtObservaciones.getText().toString();
    }

    public void guardarDatos(){
        data = new Data(context);
        data.open();
        if(data.existeModulo10(idempresa)){
            ContentValues contentValues = new ContentValues(9);
            contentValues.put(SQLConstantes.MODULO10_P0_0,C10_P0_0);
            contentValues.put(SQLConstantes.MODULO10_P0_1,C10_P0_1);
            contentValues.put(SQLConstantes.MODULO10_P0_2,C10_P0_2);
            contentValues.put(SQLConstantes.MODULO10_P0_3,C10_P0_3);
            contentValues.put(SQLConstantes.MODULO10_P1,C10_P1);
            contentValues.put(SQLConstantes.MODULO10_P2,C10_P2);
            contentValues.put(SQLConstantes.MODULO10_P3,C10_P3);
            contentValues.put(SQLConstantes.MODULO10_P4,C10_P4);
            contentValues.put(SQLConstantes.MODULO10_OBS_MOD_X,OBS_MOD_X);
            data.actualizarModulo10(idempresa,contentValues);
        }else{
            //si no existe el elemento, lo construye para insertarlo
            modulo10 = new Modulo10();
            //llena el objeto a insertar
            modulo10.setMODULO10_ID(idempresa);
            modulo10.setC10_P0_0(C10_P0_0+"");
            modulo10.setC10_P0_1(C10_P0_1);
            modulo10.setC10_P0_2(C10_P0_2+"");
            modulo10.setC10_P0_3(C10_P0_3);
            modulo10.setC10_P1(C10_P1+"");
            modulo10.setC10_P2(C10_P2+"");
            modulo10.setC10_P3(C10_P3+"");
            modulo10.setC10_P4(C10_P4+"");
            modulo10.setOBS_MOD_X(OBS_MOD_X);
            data.insertarModulo10(modulo10);
        }
        data.close();
    }



    public boolean validar(){
        llenarMapaVariables();
        boolean valido = false;
        String mensaje = "";

        boolean vC10_P0_0=true,
        vC10_P0_1=true,
        vC10_P0_2=true,
        vC10_P0_3=true,
        vC10_P1=true,
        vC10_P2=true,
        vC10_P3=true,
        vC10_P4=true;

        if(C10_P0_1.trim().length() == 0){
            vC10_P0_1 = false;
            if(mensaje.equals(""))mensaje = "DATOS DE INFORMANTE: DEBE REGISTRAR NOMBRE DEL INFORMANTE";
        }
        if(C10_P0_2 < 1 || C10_P0_2 > 4){
            vC10_P0_2 = false;
            if(mensaje.equals(""))mensaje = "DATOS DE INFORMANTE: DEBE INDICAR EL CARGO DEL INFORMANTE";
        }
        if(C10_P0_2 == 4){
            if(C10_P0_3.trim().length() < 3){
                vC10_P0_3 = false;
                if(mensaje.equals(""))mensaje = "DATOS DE INFORMANTE: DEBE REGISTRAR INFORMACION VALIDA EN ESPECIFIQUE";
            }
        }

        if(C10_P1.trim().length() == 0){
            vC10_P1 = false;
            if(mensaje.equals(""))mensaje = "PREGUNTA 1: DEBE INDICAR A CUANTO ASCIENDE EL VALOR AGREGADO";
        }
        if(C10_P2.trim().length() == 0){
            vC10_P2 = false;
            if(mensaje.equals(""))mensaje = "PREGUNTA 2: DEBE INDICAR A CUANTO ASCIENDE EL CONSUMO INTERMEDIO";
        }
        if(C10_P3.trim().length() == 0){
            vC10_P3 = false;
            if(mensaje.equals(""))mensaje = "PREGUNTA 3: DEBE INDICAR A CUANTO ASCIENDE EL SALDO FINAL DEL ACTIVO FIJO";
        }
        if(C10_P4.trim().length() == 0){
            vC10_P4 = false;
            if(mensaje.equals(""))mensaje = "PREGUNTA 4: DEBE INDICAR A CUANTO ASCIENDE EL SALDO FINAL DE LA DEPRECIACION";
        }

        valido = vC10_P0_0 && vC10_P0_1 && vC10_P0_2 && vC10_P0_3 &&
                vC10_P1 && vC10_P2 && vC10_P3 && vC10_P4;

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
