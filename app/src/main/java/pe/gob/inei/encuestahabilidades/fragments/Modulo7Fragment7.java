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
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.text.InputFilter;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import pe.gob.inei.encuestahabilidades.R;
import pe.gob.inei.encuestahabilidades.modelo.Data;
import pe.gob.inei.encuestahabilidades.modelo.SQLConstantes;
import pe.gob.inei.encuestahabilidades.pojos.Modulo7;

/**
 * A simple {@link Fragment} subclass.
 */
public class Modulo7Fragment7 extends Fragment {
    //PREGUNTA 18
    private EditText      mod7_p18_edt;
    private CheckBox      mod7_p18_ck;
    private RadioButton   mod7_p18_rb10_1;
    private RadioButton   mod7_p18_rb10_2;
    private RadioButton   mod7_p18_rb10_3;
    private RadioButton   mod7_p18_rb10_4;
    private RadioButton   mod7_p18_rb10_5;

    private RadioGroup mod7_p18_rgb1;
    private RadioGroup mod7_p18_rgb2;
    private RadioGroup mod7_p18_rgb3;
    private RadioGroup mod7_p18_rgb4;
    private RadioGroup mod7_p18_rgb5;
    private RadioGroup mod7_p18_rgb6;
    private RadioGroup mod7_p18_rgb7;
    private RadioGroup mod7_p18_rgb8;
    private RadioGroup mod7_p18_rgb9;
    private RadioGroup mod7_p18_rgb10;

    private String idempresa;
    private Modulo7 modulo7;
    private Context context;
    private Data data;

    //mapeo de variables
    int C7_P18_1;int C7_P18_2;int C7_P18_3;int C7_P18_4;int C7_P18_5;int C7_P18_6;int C7_P18_7;
    int C7_P18_8;int C7_P18_9;;int C7_P18_10;String C7_P18_10_0;

    @SuppressLint("ValidFragment")
    public Modulo7Fragment7(String idempresa, Context context) {
        this.idempresa = idempresa;
        this.context = context;
    }

    public Modulo7Fragment7() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_modulo7_fragment7, container, false);
        //PREGUNTA 18
        mod7_p18_edt= (EditText) rootView.findViewById(R.id.mod7_p18_edt);
        mod7_p18_ck= (CheckBox) rootView.findViewById(R.id.mod7_p18_ck);
        mod7_p18_rb10_1=(RadioButton) rootView.findViewById(R.id.mod7_p18_rb10_1);
        mod7_p18_rb10_2=(RadioButton) rootView.findViewById(R.id.mod7_p18_rb10_2);
        mod7_p18_rb10_3=(RadioButton) rootView.findViewById(R.id.mod7_p18_rb10_3);
        mod7_p18_rb10_4=(RadioButton) rootView.findViewById(R.id.mod7_p18_rb10_4);
        mod7_p18_rb10_5=(RadioButton) rootView.findViewById(R.id.mod7_p18_rb10_5);

        mod7_p18_rgb1 = (RadioGroup) rootView.findViewById(R.id.mod7_p18_rgb1);
        mod7_p18_rgb2 = (RadioGroup) rootView.findViewById(R.id.mod7_p18_rgb2);
        mod7_p18_rgb3 = (RadioGroup) rootView.findViewById(R.id.mod7_p18_rgb3);
        mod7_p18_rgb4 = (RadioGroup) rootView.findViewById(R.id.mod7_p18_rgb4);
        mod7_p18_rgb5 = (RadioGroup) rootView.findViewById(R.id.mod7_p18_rgb5);
        mod7_p18_rgb6 = (RadioGroup) rootView.findViewById(R.id.mod7_p18_rgb6);
        mod7_p18_rgb7 = (RadioGroup) rootView.findViewById(R.id.mod7_p18_rgb7);
        mod7_p18_rgb8 = (RadioGroup) rootView.findViewById(R.id.mod7_p18_rgb8);
        mod7_p18_rgb9 = (RadioGroup) rootView.findViewById(R.id.mod7_p18_rgb9);
        mod7_p18_rgb10 = (RadioGroup) rootView.findViewById(R.id.mod7_p18_rgb10);

        return rootView;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        //PREGUNTA 18
        mod7_p18_edt.setFilters(new InputFilter[]{new InputFilter.AllCaps()});

        //ACTIVAR O DESACTIVAR ESPECIFIQUE
        mod7_p18_rb10_1.setEnabled(false);
        mod7_p18_rb10_2.setEnabled(false);
        mod7_p18_rb10_3.setEnabled(false);
        mod7_p18_rb10_4.setEnabled(false);
        mod7_p18_rb10_5.setEnabled(false);
        mod7_p18_edt.setEnabled(false);
        mod7_p18_edt.setBackgroundResource(R.drawable.spinner_disabled);
        mod7_p18_rgb10.setBackgroundResource(R.drawable.cajas_de_texto_disabled);
        mod7_p18_ck.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b)
            {
                if (b) {
                    mod7_p18_rb10_1.setEnabled(true);
                    mod7_p18_rb10_2.setEnabled(true);
                    mod7_p18_rb10_3.setEnabled(true);
                    mod7_p18_rb10_4.setEnabled(true);
                    mod7_p18_rb10_5.setEnabled(true);
                    mod7_p18_edt.setEnabled(true);
                    mod7_p18_rgb10.setEnabled(true);
                    mod7_p18_edt.setBackgroundResource(R.drawable.spinner_enabled);
                    mod7_p18_rgb10.setBackgroundResource(R.drawable.cajas_de_texto);
                }
                else   {
                    mod7_p18_rb10_1.setEnabled(false);
                    mod7_p18_rb10_2.setEnabled(false);
                    mod7_p18_rb10_3.setEnabled(false);
                    mod7_p18_rb10_4.setEnabled(false);
                    mod7_p18_rb10_5.setEnabled(false);
                    mod7_p18_edt.setEnabled(false);
                    mod7_p18_rgb10.setEnabled(false);
                    mod7_p18_edt.setBackgroundResource(R.drawable.spinner_disabled);
                    mod7_p18_rgb10.setBackgroundResource(R.drawable.cajas_de_texto_disabled);
                    mod7_p18_edt.setText("");
                    mod7_p18_rgb10.clearCheck();

                }
            }
        });

        //PASAR FOCUS DEL EDITEXT AL RADIOGROUP
        mod7_p18_edt.setOnKeyListener(new View.OnKeyListener()
        {
            @Override
            public boolean onKey(View view, int keyCode, KeyEvent keyEvent) {
                if ((keyEvent.getAction() == KeyEvent.ACTION_DOWN) &&
                        (keyCode == KeyEvent.KEYCODE_ENTER)) {
                    ocultarTeclado(mod7_p18_edt);
                    mod7_p18_rgb10.requestFocus();
                    mod7_p18_edt.setBackgroundResource(R.drawable.fondo_spinner);

                    return true;
                }
                return false;
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

            //pregunta
            if(!modulo7.getC7_P18_1().equals("") && !modulo7.getC7_P18_1().equals("-1")){
                ((RadioButton)mod7_p18_rgb1.getChildAt(Integer.parseInt(modulo7.getC7_P18_1()))).setChecked(true);
            }

            //pregunta
            if(!modulo7.getC7_P18_2().equals("") && !modulo7.getC7_P18_2().equals("-1")){
                ((RadioButton)mod7_p18_rgb2.getChildAt(Integer.parseInt(modulo7.getC7_P18_2()))).setChecked(true);
            }

            //pregunta
            if(!modulo7.getC7_P18_3().equals("") && !modulo7.getC7_P18_3().equals("-1")){
                ((RadioButton)mod7_p18_rgb3.getChildAt(Integer.parseInt(modulo7.getC7_P18_3()))).setChecked(true);
            }

            //pregunta
            if(!modulo7.getC7_P18_4().equals("") && !modulo7.getC7_P18_4().equals("-1")){
                ((RadioButton)mod7_p18_rgb4.getChildAt(Integer.parseInt(modulo7.getC7_P18_4()))).setChecked(true);
            }

            //pregunta
            if(!modulo7.getC7_P18_5().equals("") && !modulo7.getC7_P18_5().equals("-1")){
                ((RadioButton)mod7_p18_rgb5.getChildAt(Integer.parseInt(modulo7.getC7_P18_5()))).setChecked(true);
            }

            //pregunta
            if(!modulo7.getC7_P18_6().equals("") && !modulo7.getC7_P18_6().equals("-1")){
                ((RadioButton)mod7_p18_rgb6.getChildAt(Integer.parseInt(modulo7.getC7_P18_6()))).setChecked(true);
            }

            //pregunta
            if(!modulo7.getC7_P18_7().equals("") && !modulo7.getC7_P18_7().equals("-1")){
                ((RadioButton)mod7_p18_rgb7.getChildAt(Integer.parseInt(modulo7.getC7_P18_7()))).setChecked(true);
            }

            //pregunta
            if(!modulo7.getC7_P18_8().equals("") && !modulo7.getC7_P18_8().equals("-1")){
                ((RadioButton)mod7_p18_rgb8.getChildAt(Integer.parseInt(modulo7.getC7_P18_8()))).setChecked(true);
            }

            //pregunta
            if(!modulo7.getC7_P18_9().equals("") && !modulo7.getC7_P18_9().equals("-1")){
                ((RadioButton)mod7_p18_rgb9.getChildAt(Integer.parseInt(modulo7.getC7_P18_9()))).setChecked(true);
            }

            //pregunta
            if(!modulo7.getC7_P18_10().equals("") && !modulo7.getC7_P18_10().equals("-1")){
                ((RadioButton)mod7_p18_rgb10.getChildAt(Integer.parseInt(modulo7.getC7_P18_10()))).setChecked(true);
                mod7_p18_ck.setChecked(true);
            }else{
                mod7_p18_ck.setChecked(false);
            }

            //pregunta
            mod7_p18_edt.setText(modulo7.getC7_P18_10_0());

        }
        data.close();
    }
    public void llenarMapaVariables(){

        //pregunta
        int childPosP1 = mod7_p18_rgb1.indexOfChild(mod7_p18_rgb1.findViewById(mod7_p18_rgb1.getCheckedRadioButtonId()));
        C7_P18_1 = childPosP1;

        //pregunta
        int childPosP2 = mod7_p18_rgb2.indexOfChild(mod7_p18_rgb2.findViewById(mod7_p18_rgb2.getCheckedRadioButtonId()));
        C7_P18_2 = childPosP2;

        //pregunta
        int childPosP3 = mod7_p18_rgb3.indexOfChild(mod7_p18_rgb3.findViewById(mod7_p18_rgb3.getCheckedRadioButtonId()));
        C7_P18_3 = childPosP3;

        //pregunta
        int childPosP4 = mod7_p18_rgb4.indexOfChild(mod7_p18_rgb4.findViewById(mod7_p18_rgb4.getCheckedRadioButtonId()));
        C7_P18_4 = childPosP4;

        //pregunta
        int childPosP5 = mod7_p18_rgb5.indexOfChild(mod7_p18_rgb5.findViewById(mod7_p18_rgb5.getCheckedRadioButtonId()));
        C7_P18_5 = childPosP5;

        //pregunta
        int childosP6 = mod7_p18_rgb6.indexOfChild(mod7_p18_rgb6.findViewById(mod7_p18_rgb6.getCheckedRadioButtonId()));
        C7_P18_6 = childosP6;

        //pregunta
        int childPosP7 = mod7_p18_rgb7.indexOfChild(mod7_p18_rgb7.findViewById(mod7_p18_rgb7.getCheckedRadioButtonId()));
        C7_P18_7 = childPosP7;

        //pregunta
        int childPosP8 = mod7_p18_rgb8.indexOfChild(mod7_p18_rgb8.findViewById(mod7_p18_rgb8.getCheckedRadioButtonId()));
        C7_P18_8 = childPosP8;

        //pregunta
        int childPosP9 = mod7_p18_rgb9.indexOfChild(mod7_p18_rgb9.findViewById(mod7_p18_rgb9.getCheckedRadioButtonId()));
        C7_P18_9 = childPosP9;

        //pregunta
        int childPosP10= mod7_p18_rgb10.indexOfChild(mod7_p18_rgb10.findViewById(mod7_p18_rgb10.getCheckedRadioButtonId()));
        C7_P18_10 = childPosP10;

        C7_P18_10_0 = mod7_p18_edt.getText().toString();
    }

    public void guardarDatos(){
        data = new Data(context);
        data.open();
        if(data.existeModulo7(idempresa)){
            ContentValues contentValues = new ContentValues(255);
            contentValues.put(SQLConstantes.MODULO7_P18_1,C7_P18_1+"");
            contentValues.put(SQLConstantes.MODULO7_P18_2,C7_P18_2+"");
            contentValues.put(SQLConstantes.MODULO7_P18_3,C7_P18_3+"");
            contentValues.put(SQLConstantes.MODULO7_P18_4,C7_P18_4+"");
            contentValues.put(SQLConstantes.MODULO7_P18_5,C7_P18_5+"");
            contentValues.put(SQLConstantes.MODULO7_P18_6,C7_P18_6+"");
            contentValues.put(SQLConstantes.MODULO7_P18_7,C7_P18_7+"");
            contentValues.put(SQLConstantes.MODULO7_P18_8,C7_P18_8+"");
            contentValues.put(SQLConstantes.MODULO7_P18_9,C7_P18_9+"");
            contentValues.put(SQLConstantes.MODULO7_P18_10,C7_P18_10+"");
            contentValues.put(SQLConstantes.MODULO7_P18_10_0,C7_P18_10_0);
            data.actualizarModulo7(idempresa,contentValues);
        }else{
            //si no existe el elemento, lo construye para insertarlo
            modulo7 = new Modulo7();
            //llena el objeto a insertar
            modulo7.setMODULO7_ID(idempresa);
            modulo7.setC7_P18_1(C7_P18_1+"");
            modulo7.setC7_P18_2(C7_P18_2+"");
            modulo7.setC7_P18_3(C7_P18_3+"");
            modulo7.setC7_P18_4(C7_P18_4+"");
            modulo7.setC7_P18_5(C7_P18_5+"");
            modulo7.setC7_P18_6(C7_P18_6+"");
            modulo7.setC7_P18_7(C7_P18_7+"");
            modulo7.setC7_P18_8(C7_P18_8+"");
            modulo7.setC7_P18_9(C7_P18_9+"");
            modulo7.setC7_P18_10(C7_P18_10+"");
            modulo7.setC7_P18_10_0(C7_P18_10_0);
            data.insertarModulo7(modulo7);
        }
        data.close();
    }

    public boolean validar(){
        //revisarcampos
        boolean valido = true;
        llenarMapaVariables();

        boolean vC7_P18_1= false, vC7_P18_2 = false,vC7_P18_3=false, vC7_P18_4 = false,vC7_P18_5= false, vC7_P18_6 = false,vC7_P18_7=false,
                vC7_P18_8= false, vC7_P18_9 = false,vC7_P18_10=false , vC7_P18_10_0=false ;

        if(C7_P18_1 == -1){
            mostrarMensaje("Pregunta 18 opción 1: Debe seleccionar una opción");
            valido=false;
        }else if(C7_P18_2 == -1){
            mostrarMensaje("Pregunta 18 opción 2: Debe seleccionar una opción");
            valido=false;
        }else if(C7_P18_3 == -1){
            mostrarMensaje("Pregunta 18 opción 3: Debe seleccionar una opción");
            valido=false;
        }else if(C7_P18_4 == -1){
            mostrarMensaje("Pregunta 18 opción 4: Debe seleccionar una opción");
            valido=false;
        }else if(C7_P18_5 == -1){
            mostrarMensaje("Pregunta 18 opción 5: Debe seleccionar una opción");
            valido=false;
        }else if(C7_P18_6 == -1){
            mostrarMensaje("Pregunta 18 opción 6: Debe seleccionar una opción");
            valido=false;
        }else if(C7_P18_7 == -1){
            mostrarMensaje("Pregunta 18 opción 7: Debe seleccionar una opción");
            valido=false;
        }else if(C7_P18_8 == -1){
            mostrarMensaje("Pregunta 18 opción 8: Debe seleccionar una opción");
            valido=false;
        }else if(C7_P18_9 == -1){
            mostrarMensaje("Pregunta 18 opción 9: Debe seleccionar una opción");
            valido=false;
        }else if(mod7_p18_ck.isChecked() && C7_P18_10 == -1){
            mostrarMensaje("Pregunta 18 opción 10: Debe seleccionar una opción");
            valido=false;
        }else if( C7_P18_10 != -1 && C7_P18_10_0.trim().length()<3){
            mostrarMensaje("Debe registrar información válida en Especifique");
            valido=false;
        }

        //
        if(C7_P18_1 >= 0 && C7_P18_1 <= 4) vC7_P18_1 = true;

        //
        if(C7_P18_2 >= 0 && C7_P18_2 <= 4) vC7_P18_2 = true;

        //
        if(C7_P18_3 >= 0 && C7_P18_3 <= 4) vC7_P18_3 = true;

        //
        if(C7_P18_4 >= 0 && C7_P18_4 <= 4) vC7_P18_4 = true;

        //
        if(C7_P18_5 >= 0 && C7_P18_5 <= 4) vC7_P18_5 = true;

        //
        if(C7_P18_6 >= 0 && C7_P18_6 <= 4) vC7_P18_6 = true;

        //
        if(C7_P18_7 >= 0 && C7_P18_7 <= 4) vC7_P18_7 = true;

        //
        if(C7_P18_8 >= 0 && C7_P18_8 <= 4) vC7_P18_8 = true;

        //
        if(C7_P18_9 >= 0 && C7_P18_9 <= 4) vC7_P18_9 = true;

        //
        if(C7_P18_10 >= 0 && C7_P18_10 <= 4) vC7_P18_10 = true;


        if (C7_P18_10 == -1 && !mod7_p18_ck.isChecked()) {
            vC7_P18_10=true;
            vC7_P18_10_0 = true;
        } else {
            if(C7_P18_10 >= 0 && C7_P18_10 <= 4) vC7_P18_10 = true;
            if (!C7_P18_10_0.equals("")) {
                vC7_P18_10_0 = true;
            }
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
