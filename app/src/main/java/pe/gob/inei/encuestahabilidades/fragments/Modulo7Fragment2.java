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
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import pe.gob.inei.encuestahabilidades.NumericKeyBoardTransformationMethod;
import pe.gob.inei.encuestahabilidades.R;
import pe.gob.inei.encuestahabilidades.modelo.Data;
import pe.gob.inei.encuestahabilidades.modelo.SQLConstantes;
import pe.gob.inei.encuestahabilidades.pojos.Modulo1;
import pe.gob.inei.encuestahabilidades.pojos.Modulo7;

/**
 * A simple {@link Fragment} subclass.
 */
public class Modulo7Fragment2 extends Fragment {

    //VARIABLES
    private RadioGroup mod7_p5_rgb;
    private EditText   mod7_p6_edt1;
    private EditText   mod7_p6_edt2;
    private RadioGroup mod7_p7_rgb;
    private EditText   mod7_p7_edt;

    private String idempresa;
    private Modulo7 modulo7;
    private Context context;
    private Data data;

    //mapeo de variables
    int C7_P5;String C7_P6_1;String C7_P6_2;int C7_P7; String C7_P7_0;




    public Modulo7Fragment2() {
        // Required empty public constructor
    }

    @SuppressLint("ValidFragment")
    public Modulo7Fragment2(String idempresa, Context context) {
        this.idempresa = idempresa;
        this.context = context;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_modulo7_fragment2, container, false);
        mod7_p5_rgb  = (RadioGroup) rootView.findViewById(R.id.mod7_p5_rgb);
        mod7_p6_edt1 = (EditText)rootView.findViewById(R.id.mod7_p6_edt1);
        mod7_p6_edt2 = (EditText)rootView.findViewById(R.id.mod7_p6_edt2);
        mod7_p7_rgb  = (RadioGroup) rootView.findViewById(R.id.mod7_p7_rgb);
        mod7_p7_edt = (EditText)rootView.findViewById(R.id.mod7_p7_edt);
        return  rootView;

    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
//        RadioGroup[] radioGroups = {
//                mod7_p5_rgb,mod7_p7_rgb
//        };
//        for (int i = 0; i < radioGroups.length; i++) {
//            final RadioGroup radioGroup = radioGroups[i];
//            radioGroup.setOnFocusChangeListener(new View.OnFocusChangeListener() {
//                @Override
//                public void onFocusChange(View view, boolean conFocus) {
//                    if(conFocus) {
//                        ocultarTeclado(radioGroup);
//                        radioGroup.setBackgroundColor(Color.CYAN);
//                    }
//                    else if(view.isEnabled()){
//                        radioGroup.setBackgroundColor(Color.TRANSPARENT);
//                    }
//                }
//            });
//        }
        //PREGUNTA 5
        mod7_p5_rgb.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, @IdRes int i) {
                switch (i) {
                    case R.id.mod7_p5_rb1:
                        break;
                    case R.id.mod7_p5_rb2:
                        break;
                    case R.id.mod7_p5_rb3:
                        break;
                    case R.id.mod7_p5_rb4:
                        break;
                    case R.id.mod7_p5_rb5:
                        break;

                }
                mod7_p6_edt1.requestFocus();
                mod7_p6_edt1.setBackgroundResource(R.drawable.caja_texto_enabled);
            }
        });
        //PREGUNTA 6
        mod7_p6_edt1.setTransformationMethod(new NumericKeyBoardTransformationMethod());
        mod7_p6_edt2.setTransformationMethod(new NumericKeyBoardTransformationMethod());

        //PREGUNTA 6_B VALIDACIONES RANGOS 1 - 100
        mod7_p6_edt2.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {            }
            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {            }
            @Override
            public void afterTextChanged(Editable editable) {
                if (!editable.toString().equals("")) {
                    if (Integer.parseInt(mod7_p6_edt2.getText().toString()) >= 101) {
                        Toast.makeText(context, "Debe registrar un porcentaje valido", Toast.LENGTH_SHORT).show();
                        mod7_p6_edt2.requestFocus();
                        mod7_p6_edt2.setText("");
                    }
                }
            }
        });

        //PREGUNTA 7
        mod7_p7_edt.setFilters(new InputFilter[]{new InputFilter.AllCaps()});
        mod7_p7_rgb.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, @IdRes int i) {
                switch (i) {
                    case R.id.mod7_p7_rb1:
                        mod7_p7_edt.setVisibility(View.GONE);
                        mod7_p7_edt.setText("");
                        break;
                    case R.id.mod7_p7_rb2:
                        mod7_p7_edt.setVisibility(View.GONE);
                        mod7_p7_edt.setText("");
                        break;
                    case R.id.mod7_p7_rb3:
                        mod7_p7_edt.setVisibility(View.GONE);
                        mod7_p7_edt.setText("");
                        break;
                    case R.id.mod7_p7_rb4:
                        mod7_p7_edt.setVisibility(View.GONE);
                        mod7_p7_edt.setText("");
                        break;
                    case R.id.mod7_p7_rb5:
                        mod7_p7_edt.setVisibility(View.VISIBLE);
                        mod7_p7_edt.requestFocus();
                        mod7_p7_edt.setBackgroundResource(R.drawable.caja_texto_enabled);
                        break;

                }
                //mod7_p6_edt1.requestFocus();
                //mod7_p6_edt1.setBackgroundResource(R.drawable.caja_texto_enabled);
            }
        });

        mod7_p6_edt1.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) { }
            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) { }
            @Override
            public void afterTextChanged(Editable editable) {
                if(mod7_p6_edt1.getText().toString().equals("")){
//                    if(mod7_p6_edt1.getText().toString().equals("") || mod7_p6_edt1.getText().toString().equals("0")){

                    mod7_p6_edt2.setBackgroundResource(R.drawable.cajas_de_texto);
                    mod7_p6_edt2.setEnabled(true);
                }else{
                    mod7_p6_edt2.setBackgroundResource(R.drawable.cajas_de_texto_disabled);
                    mod7_p6_edt2.setEnabled(false);
                }
            }
        });

        mod7_p6_edt2.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) { }
            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) { }
            @Override
            public void afterTextChanged(Editable editable) {
                if(mod7_p6_edt2.getText().toString().equals("")){
//                    if(mod7_p6_edt2.getText().toString().equals("") || mod7_p6_edt2.getText().toString().equals("0")){

                        mod7_p6_edt1.setBackgroundResource(R.drawable.cajas_de_texto);
                    mod7_p6_edt1.setEnabled(true);
                }else{
                    mod7_p6_edt1.setBackgroundResource(R.drawable.cajas_de_texto_disabled);
                    mod7_p6_edt1.setEnabled(false);
                }
            }
        });

        cargarDatos();
    }

    public void cargarDatos(){
        data = new Data(context);
        data.open();
        modulo7 = data.getModulo7(idempresa);
        if( !modulo7.getC7_P5().equals("")&&!modulo7.getC7_P5().equals("-1") ) ((RadioButton)mod7_p5_rgb.getChildAt(Integer.parseInt(modulo7.getC7_P5()))).setChecked(true);
        mod7_p6_edt1.setText(modulo7.getC7_P6_1());
        mod7_p6_edt2.setText(modulo7.getC7_P6_2());
        if(!modulo7.getC7_P7().equals("")) ((RadioButton)mod7_p7_rgb.getChildAt(Integer.parseInt(modulo7.getC7_P7()))).setChecked(true);
        mod7_p7_edt.setText(modulo7.getC7_P7_0());
        data.close();
    }

    public void llenarMapaVariables(){
        C7_P5 = mod7_p5_rgb.indexOfChild(mod7_p5_rgb.findViewById(mod7_p5_rgb.getCheckedRadioButtonId()));
        C7_P6_1 = mod7_p6_edt1.getText().toString();
        C7_P6_2 = mod7_p6_edt2.getText().toString();
        C7_P7 = mod7_p7_rgb.indexOfChild(mod7_p7_rgb.findViewById(mod7_p7_rgb.getCheckedRadioButtonId()));
        C7_P7_0 = mod7_p7_edt.getText().toString();

    }
    public void guardarDatos(){
        data = new Data(context);
        data.open();
        if(data.existeModulo7(idempresa)){
            ContentValues contentValues = new ContentValues(255);
            contentValues.put(SQLConstantes.MODULO7_P5,C7_P5+"");
            contentValues.put(SQLConstantes.MODULO7_P6_1,C7_P6_1);
            contentValues.put(SQLConstantes.MODULO7_P6_2,C7_P6_2);
            contentValues.put(SQLConstantes.MODULO7_P7,C7_P7+"");
            contentValues.put(SQLConstantes.MODULO7_P7_0,C7_P7_0+"");
            data.actualizarModulo7(idempresa,contentValues);
        }else{
            //si no existe el elemento, lo construye para insertarlo
            modulo7 = new Modulo7();
            //llena el objeto a insertar
            modulo7.setMODULO7_ID(idempresa);
            modulo7.setC7_P5(C7_P5+"");
            modulo7.setC7_P6_1(C7_P6_1);
            modulo7.setC7_P6_2(C7_P6_2);
            modulo7.setC7_P7(C7_P7+"");
            modulo7.setC7_P7_0(C7_P7_0+"");
            data.insertarModulo7(modulo7);
        }
        data.close();
    }

    public boolean validar(){
        //revisarcampos
        boolean valido = true;

        llenarMapaVariables();

        boolean vC7_P5 = false;boolean vC7_P6_1 = false;
        boolean vC7_P6_2 = false;boolean vC7_P7 = false;
        boolean vC7_P7_0 = false;

        if(C7_P5==-1 ){
            mostrarMensaje("Pregunta 5: Marque una opción");
            valido=false;
        }else if(C7_P6_1.trim().length() == 0 && C7_P6_2.trim().length() == 0){
            mostrarMensaje("Pregunta 6: Debe registrar número o porcentaje");
            valido=false;
        }else if(C7_P7==-1 ){
            mostrarMensaje("Pregunta 7: Marque una opción");
            valido=false;
        }else if(C7_P7==4 && C7_P7_0.trim().length()<3 ){
            mostrarMensaje("Debe registrar información válida en Especifique");
            valido=false;
        }

        return valido;
    }

    //METODOS
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
