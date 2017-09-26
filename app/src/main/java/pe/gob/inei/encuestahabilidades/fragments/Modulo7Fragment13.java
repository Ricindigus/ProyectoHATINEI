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
import pe.gob.inei.encuestahabilidades.pojos.Modulo2;


/**
 * A simple {@link Fragment} subclass.
 */
public class Modulo7Fragment13 extends Fragment {

    private LinearLayout mod7_layoutFragment17;
    private EditText mod7_p44_edt;

    private RadioGroup mod7_p45_rgb;
    private RadioGroup mod7_p46_rgb;

    private RadioButton mod7_p45_rgb1;
    private RadioButton mod7_p45_rgb2;

    private RadioButton mod7_p46_rgb1;
    private RadioButton mod7_p46_rgb2;
    private RadioButton mod7_p46_rgb3;
    private RadioButton mod7_p46_rgb4;
    private EditText edtObservaciones;

    private String idempresa;
    private Modulo7 modulo7;
    private Modulo2 modulo2;

    private Context context;
    private Data data;

    //mapeo de variables
    //int C7_P44=0
    int C7_P44;int C7_P45;int C7_P46;String OBS_MOD_VII;
    int C2_P1;

    public Modulo7Fragment13() {
        // Required empty public constructor
    }

    @SuppressLint("ValidFragment")
    public Modulo7Fragment13(String idempresa, Context context) {
        this.idempresa = idempresa;
        this.context = context;

        data = new Data(context);
        data.open();
        modulo2 = data.getModulo2(idempresa);
        if(!modulo2.getC2_P1().toString().equals(""))
        {C2_P1 = Integer.parseInt(modulo2.getC2_P1());}
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_modulo7_fragment13, container, false);
        mod7_layoutFragment17 = (LinearLayout) rootView.findViewById(R.id.mod7_layoutFragment17);

        mod7_p44_edt = (EditText) rootView.findViewById(R.id.mod7_p44_edt);

        mod7_p45_rgb = (RadioGroup) rootView.findViewById(R.id.mod7_p45_rgb);
        mod7_p46_rgb = (RadioGroup) rootView.findViewById(R.id.mod7_p46_rgb);
        mod7_p46_rgb1 = (RadioButton) rootView.findViewById(R.id.mod7_p46_rgb1);
        mod7_p46_rgb2 = (RadioButton) rootView.findViewById(R.id.mod7_p46_rgb2);
        mod7_p46_rgb3 = (RadioButton) rootView.findViewById(R.id.mod7_p46_rgb3);
        mod7_p46_rgb4 = (RadioButton) rootView.findViewById(R.id.mod7_p46_rgb4);


        mod7_p45_rgb1 = (RadioButton) rootView.findViewById(R.id.mod7_p45_rgb1);
        mod7_p45_rgb2 = (RadioButton) rootView.findViewById(R.id.mod7_p45_rgb2);

        edtObservaciones = (EditText)rootView.findViewById(R.id.edtObservaciones);

        return rootView;
    }

    @Override
    public void onViewCreated(final View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        mod7_p44_edt.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean conFocus) {
                if(conFocus) {
                    mod7_p44_edt.setBackgroundResource(R.drawable.caja_texto_enabled);
                    mod7_p44_edt.requestFocus();
                }else if(view.isEnabled()){
                    mod7_p44_edt.setBackgroundResource(R.drawable.cajas_de_texto);
                }
            }
        });

        mod7_p44_edt.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View view, int keyCode, KeyEvent keyEvent) {
                if ((keyEvent.getAction() == KeyEvent.ACTION_DOWN) &&
                        (keyCode == KeyEvent.KEYCODE_ENTER)) {
                    ocultarTeclado(mod7_p44_edt);
                    mod7_p45_rgb.requestFocus();
                    return true;
                }
                return false;
            }
        });

        RadioGroup[] spnP38= {mod7_p45_rgb,mod7_p46_rgb};

        for (final RadioGroup c:spnP38) {
            c.setOnFocusChangeListener(new View.OnFocusChangeListener() {
                @Override
                public void onFocusChange(View view, boolean conFocus) {
                    if(conFocus) {
                        c.setBackgroundColor(Color.CYAN);
                        c.requestFocus();
                    }else if(view.isEnabled()){
                        c.setBackgroundColor(Color.TRANSPARENT);
                    }
                }
            });
        }

        mod7_p44_edt.setTransformationMethod(new NumericKeyBoardTransformationMethod());

        mod7_p45_rgb.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, @IdRes int i) {
                mod7_p46_rgb.requestFocus();
            }
        });

        mod7_p46_rgb.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, @IdRes int i) {
                mod7_p46_rgb.setBackgroundColor(Color.TRANSPARENT);
            }
        });
        cargarDatos();
        edtObservaciones.setFilters(new InputFilter[]{new InputFilter.AllCaps()});
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

            //pregunta 44
            mod7_p44_edt.setText(modulo7.getC7_P44());

            //pregunta 45
            if(!modulo7.getC7_P45().equals("") && !modulo7.getC7_P45().equals("-1")){
                ((RadioButton)mod7_p45_rgb.getChildAt(Integer.parseInt(modulo7.getC7_P45()))).setChecked(true);
            }

            //pregunta 46
            if(!modulo7.getC7_P46().equals("") && !modulo7.getC7_P46().equals("-1")){
                ((RadioButton)mod7_p46_rgb.getChildAt(Integer.parseInt(modulo7.getC7_P46()))).setChecked(true);
            }
            //OBSRVACION
            edtObservaciones.setText(modulo7.getOBS_MOD_VII());
        }
        data.close();
    }

    public void llenarMapaVariables(){

        //pregunta 44
        if(!mod7_p44_edt.getText().toString().equals("")){
            C7_P44 = Integer.parseInt( mod7_p44_edt.getText().toString());
        }
        //pregunta 45
        int childPosP45 = mod7_p45_rgb.indexOfChild(mod7_p45_rgb.findViewById(mod7_p45_rgb.getCheckedRadioButtonId()));
        C7_P45 = childPosP45;
        //pregunta 46
        int childPosP46 = mod7_p46_rgb.indexOfChild(mod7_p46_rgb.findViewById(mod7_p46_rgb.getCheckedRadioButtonId()));
        C7_P46 = childPosP46;
        //observaciones
        OBS_MOD_VII = edtObservaciones.getText().toString();

    }

    public void guardarDatos(){
        data = new Data(context);
        data.open();
        if(data.existeModulo7(idempresa)){
            ContentValues contentValues = new ContentValues(255);
            contentValues.put(SQLConstantes.MODULO7_P44,C7_P44+"");
            contentValues.put(SQLConstantes.MODULO7_P45,C7_P45+"");
            contentValues.put(SQLConstantes.MODULO7_P46,C7_P46+"");
            contentValues.put(SQLConstantes.MODULO7_OBS_MOD_VII,OBS_MOD_VII);
            data.actualizarModulo7(idempresa,contentValues);
        }else{
            //si no existe el elemento, lo construye para insertarlo
            modulo7 = new Modulo7();
            //llena el objeto a insertar
            modulo7.setMODULO7_ID(idempresa);
            modulo7.setC7_P44(C7_P44+"");
            modulo7.setC7_P45(C7_P45+"");
            modulo7.setC7_P46(C7_P46+"");
            modulo7.setOBS_MOD_VII(OBS_MOD_VII);
            data.insertarModulo7(modulo7);
        }
        data.close();
    }

    public boolean validar(){
        //revisarcampos
        boolean valido = true;

        llenarMapaVariables();

        if(String.valueOf(C7_P44).equals("")){
            mostrarMensaje("Pregunta 44: Debe Ingresar datos");
            valido=false;
        }else if(C7_P44 > C2_P1){
            mostrarMensaje("Pregunta 44: El número de trabajadores que son miembros del sindicado es mayor que el número total de trabajadores");
            valido=false;
        }else if(C7_P45==-1 ){
            mostrarMensaje("Pregunta 45: Debe seleccionar una opción");
            valido=false;
        }else if(C7_P46 == -1){
            mostrarMensaje("Pregunta 46: Debe seleccionar una opción");
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
