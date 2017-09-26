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
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.LinearLayout;
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
public class Modulo7Fragment10 extends Fragment {

    private LinearLayout mod7_layoutFragment14;
    private LinearLayout mod7_p32_lyt;
    private LinearLayout mod7_p33_lyt;
    private LinearLayout mod7_p36_lyt;
    private LinearLayout mod7_p36_lyt_ck5;
    private LinearLayout mod7_p36_lyt1;

    private CheckBox mod7_p32_ck1;
    private CheckBox mod7_p32_ck2;
    private CheckBox mod7_p32_ck3;
    private CheckBox mod7_p32_ck4;
    private CheckBox mod7_p36_ck1;
    private CheckBox mod7_p36_ck2;
    private CheckBox mod7_p36_ck3;
    private CheckBox mod7_p36_ck4;
    private CheckBox mod7_p36_ck5;

    private EditText mod7_p36_ck5_edtEspecifique;
    private EditText mod7_p33_edt1;

    private RadioGroup mod7_p34_rgb;
    private RadioGroup mod7_p35_rgb;

    private RadioButton mod7_p34_rgb1;
    private RadioButton mod7_p34_rgb2;
    private RadioButton mod7_p35_rgb1;
    private RadioButton mod7_p35_rgb2;

    private String idempresa;
    private Modulo7 modulo7;
    private Context context;
    private Data data;

    //mapeo de variables
    int C7_P34;int C7_P35;int C7_P36_1;int C7_P36_2;int C7_P36_3;int C7_P36_4;int C7_P36_5;String C7_P36_5_O;


    public Modulo7Fragment10() {
        // Required empty public constructor
    }

    @SuppressLint("ValidFragment")
    public Modulo7Fragment10(String idempresa,Context context) {
        this.idempresa=idempresa;
        this.context= context;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_modulo7_fragment10, container, false);
        mod7_layoutFragment14 = (LinearLayout) rootView.findViewById(R.id.mod7_layoutFragment14);
//        mod7_p32_lyt = (LinearLayout) rootView.findViewById(R.id.mod7_p32_lyt);
//        mod7_p32_ck1 = (CheckBox) rootView.findViewById(R.id.mod7_p32_ck1);
//        mod7_p32_ck2 = (CheckBox) rootView.findViewById(R.id.mod7_p32_ck2);
//        mod7_p32_ck3 = (CheckBox) rootView.findViewById(R.id.mod7_p32_ck3);
//        mod7_p32_ck4 = (CheckBox) rootView.findViewById(R.id.mod7_p32_ck4);
//        mod7_p33_lyt = (LinearLayout) rootView.findViewById(R.id.mod7_p33_lyt);
//        mod7_p33_edt1 = (EditText) rootView.findViewById(R.id.mod7_p33_edt1);
        mod7_p34_rgb = (RadioGroup) rootView.findViewById(R.id.mod7_p34_rgb);
        mod7_p34_rgb1 = (RadioButton) rootView.findViewById(R.id.mod7_p34_rgb1);
        mod7_p34_rgb2 = (RadioButton) rootView.findViewById(R.id.mod7_p34_rgb2);
        mod7_p35_rgb = (RadioGroup) rootView.findViewById(R.id.mod7_p35_rgb);
        mod7_p35_rgb1 = (RadioButton) rootView.findViewById(R.id.mod7_p35_rgb1);
        mod7_p35_rgb2 = (RadioButton) rootView.findViewById(R.id.mod7_p35_rgb2);
        mod7_p36_lyt = (LinearLayout) rootView.findViewById(R.id.mod7_p36_lyt);
        mod7_p36_lyt1 = (LinearLayout) rootView.findViewById(R.id.mod7_p36_lyt1);
        mod7_p36_lyt_ck5 = (LinearLayout) rootView.findViewById(R.id.mod7_p36_lyt_ck5);
        mod7_p36_ck1 = (CheckBox) rootView.findViewById(R.id.mod7_p36_ck1);
        mod7_p36_ck2 = (CheckBox) rootView.findViewById(R.id.mod7_p36_ck2);
        mod7_p36_ck3 = (CheckBox) rootView.findViewById(R.id.mod7_p36_ck3);
        mod7_p36_ck4 = (CheckBox) rootView.findViewById(R.id.mod7_p36_ck4);
        mod7_p36_ck5 = (CheckBox) rootView.findViewById(R.id.mod7_p36_ck5);
        mod7_p36_ck5_edtEspecifique = (EditText) rootView.findViewById(R.id.mod7_p36_ck5_edtEspecifique);
        return rootView;
    }



    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

//        EditText[] cajasDeTexto = {mod7_p33_edt1, mod7_p36_ck5_edtEspecifique};
        RadioGroup[] radioGroups = {mod7_p34_rgb,mod7_p35_rgb};
//        CheckBox[] checkP32= {mod7_p32_ck1,mod7_p32_ck2,mod7_p32_ck3 ,mod7_p32_ck4};
        CheckBox[] checkP36 = {mod7_p36_ck1,mod7_p36_ck2,mod7_p36_ck3 ,mod7_p36_ck4};

        mod7_layoutFragment14.requestFocus();
//        mod7_p32_lyt.setBackgroundColor(Color.CYAN);
//        for (CheckBox c: checkP32) {
//            c.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
//                @Override
//                public void onCheckedChanged(CompoundButton compoundButton, boolean checkeado) {
//                    if(checkeado) {
//                        mod7_p32_lyt.setBackgroundColor(Color.TRANSPARENT);
//                        mod7_p33_edt1.requestFocus();
//                    }
//                }
//            });
//        }

        for (CheckBox c: checkP36) {
            c.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton compoundButton, boolean checkeado) {
                    if(checkeado) {
                        mod7_p36_lyt1.setBackgroundColor(Color.TRANSPARENT);
                    }
                }
            });
        }

//        for (int i = 0; i < cajasDeTexto.length; i++) {
//            final EditText editText = cajasDeTexto[i];
//            editText.setOnFocusChangeListener(new View.OnFocusChangeListener() {
//                @Override
//                public void onFocusChange(View view, boolean conFocus) {
//                    if(conFocus) {
//                        editText.setBackgroundResource(R.drawable.caja_texto_enabled);
//                        mostrarTeclado();
//                    }else if(view.isEnabled()){
//                        editText.setBackgroundResource(R.drawable.cajas_de_texto);
//                    }
//                }
//            });
//        }

        for (int i = 0; i < radioGroups.length; i++) {
            final RadioGroup radioGroup = radioGroups[i];
            radioGroup.setOnFocusChangeListener(new View.OnFocusChangeListener() {
                @Override
                public void onFocusChange(View view, boolean conFocus) {
                    if(conFocus) {
                        radioGroup.setBackgroundColor(Color.CYAN);
                        ocultarTeclado(radioGroup);
                    }
                    else if(view.isEnabled()){
                        radioGroup.setBackgroundColor(Color.TRANSPARENT);
                    }
                }
            });
        }

//        mod7_p33_edt1.setTransformationMethod(new NumericKeyBoardTransformationMethod());
//        mod7_p33_edt1.setOnKeyListener(new View.OnKeyListener() {
//            @Override
//            public boolean onKey(View view, int keyCode, KeyEvent keyEvent) {
//                if ((keyEvent.getAction() == KeyEvent.ACTION_DOWN) &&
//                        (keyCode == KeyEvent.KEYCODE_ENTER)) {
//                    ocultarTeclado(mod7_p33_edt1);
//                    mod7_p34_rgb.requestFocus();
//                    return true;
//                }
//                return false;
//            }
//        });

        mod7_p35_rgb.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, @IdRes int i) {
                switch (i){
                    case R.id.mod7_p35_rgb1:
                        mod7_p36_ck1.setChecked(false);
                        mod7_p36_ck2.setChecked(false);
                        mod7_p36_ck3.setChecked(false);
                        mod7_p36_ck4.setChecked(false);
                        mod7_p36_ck5.setChecked(false);
                        mod7_p36_ck5_edtEspecifique.setText("");
                        mod7_p36_ck5_edtEspecifique.setVisibility(View.GONE);
                        mod7_p36_lyt.setVisibility(View.GONE);
                        mod7_p35_rgb.requestFocus();
                        break;
                    case R.id.mod7_p35_rgb2:
                        mod7_p36_lyt.setVisibility(View.VISIBLE);
                        mod7_p35_rgb.setBackgroundColor(Color.TRANSPARENT);
                        mod7_p36_lyt1.setBackgroundColor(Color.CYAN);
                        mod7_p36_lyt1.requestFocus();
                        break;
                }
            }
        });

        mod7_p34_rgb.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, @IdRes int i) {
                mod7_p35_rgb.requestFocus();
            }
        });

        mod7_p36_ck5_edtEspecifique.setFilters(new InputFilter[]{new InputFilter.AllCaps()});
        mod7_p36_ck5_edtEspecifique.setVisibility(View.GONE);
        mod7_p36_ck5.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    mod7_p36_ck5_edtEspecifique.setVisibility(View.VISIBLE);
                    mod7_p36_ck5_edtEspecifique.requestFocus();
                    mod7_p36_lyt1.setBackgroundColor(Color.TRANSPARENT);
                    mostrarTeclado();
                } else {
                    mod7_p36_ck5_edtEspecifique.setText("");
                    mod7_p36_ck5_edtEspecifique.setVisibility(View.GONE);
                    mod7_p36_lyt1.requestFocus();
                }
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

            //pregunta 34
            if(!modulo7.getC7_P34().equals("") && !modulo7.getC7_P34().equals("-1")){
                ((RadioButton)mod7_p34_rgb.getChildAt(Integer.parseInt(modulo7.getC7_P34()))).setChecked(true);
            }
            //pregunta 35
            if(!modulo7.getC7_P35().equals("") && !modulo7.getC7_P35().equals("-1")){
                ((RadioButton)mod7_p35_rgb.getChildAt(Integer.parseInt(modulo7.getC7_P35()))).setChecked(true);
            }

            //pregunta 36
            if(modulo7.getC7_P36_1().equals("1")) mod7_p36_ck1.setChecked(true);
            if(modulo7.getC7_P36_1().equals("0")) mod7_p36_ck1.setChecked(false);

            if(modulo7.getC7_P36_2().equals("1")) mod7_p36_ck2.setChecked(true);
            if(modulo7.getC7_P36_2().equals("0")) mod7_p36_ck2.setChecked(false);

            if(modulo7.getC7_P36_3().equals("1")) mod7_p36_ck3.setChecked(true);
            if(modulo7.getC7_P36_3().equals("0")) mod7_p36_ck3.setChecked(false);

            if(modulo7.getC7_P36_4().equals("1")) mod7_p36_ck4.setChecked(true);
            if(modulo7.getC7_P36_4().equals("0")) mod7_p36_ck4.setChecked(false);

            if(modulo7.getC7_P36_5().equals("1")) mod7_p36_ck5.setChecked(true);
            if(modulo7.getC7_P36_5().equals("0")) mod7_p36_ck5.setChecked(false);
            mod7_p36_ck5_edtEspecifique.setText(modulo7.getC7_P36_5_0());

        }
        data.close();
    }
    public void llenarMapaVariables(){

        //pregunta 34
        C7_P34 = mod7_p34_rgb.indexOfChild(mod7_p34_rgb.findViewById(mod7_p34_rgb.getCheckedRadioButtonId()));

        //pregunta 35
        C7_P35 = mod7_p35_rgb.indexOfChild(mod7_p35_rgb.findViewById(mod7_p35_rgb.getCheckedRadioButtonId()));

        if(mod7_p36_ck1.isChecked())C7_P36_1 = 1;
        else C7_P36_1 = 0;

        if(mod7_p36_ck2.isChecked())C7_P36_2 = 1;
        else C7_P36_2 = 0;

        if(mod7_p36_ck3.isChecked())C7_P36_3 = 1;
        else C7_P36_3 = 0;

        if(mod7_p36_ck4.isChecked())C7_P36_4 = 1;
        else C7_P36_4 = 0;

        if(mod7_p36_ck5.isChecked())C7_P36_5 = 1;
        else C7_P36_5 = 0;
        C7_P36_5_O = mod7_p36_ck5_edtEspecifique.getText().toString();
    }

    public void guardarDatos(){
        data = new Data(context);
        data.open();
        if(data.existeModulo7(idempresa)){
            ContentValues contentValues = new ContentValues(255);
            contentValues.put(SQLConstantes.MODULO7_P34,C7_P34+"");
            contentValues.put(SQLConstantes.MODULO7_P35,C7_P35+"");
            contentValues.put(SQLConstantes.MODULO7_P36_1,C7_P36_1+"");
            contentValues.put(SQLConstantes.MODULO7_P36_2,C7_P36_2+"");
            contentValues.put(SQLConstantes.MODULO7_P36_3,C7_P36_3+"");
            contentValues.put(SQLConstantes.MODULO7_P36_4,C7_P36_4+"");
            contentValues.put(SQLConstantes.MODULO7_P36_5,C7_P36_5+"");
            contentValues.put(SQLConstantes.MODULO7_P36_5_0,C7_P36_5_O);
            data.actualizarModulo7(idempresa,contentValues);
        }else{
            //si no existe el elemento, lo construye para insertarlo
            modulo7 = new Modulo7();
            //llena el objeto a insertar
            modulo7.setMODULO7_ID(idempresa);
            modulo7.setC7_P34(C7_P34+"");
            modulo7.setC7_P35(C7_P35+"");
            modulo7.setC7_P36_1(C7_P36_1+"");
            modulo7.setC7_P36_2(C7_P36_2+"");
            modulo7.setC7_P36_3(C7_P36_3+"");
            modulo7.setC7_P36_4(C7_P36_4+"");
            modulo7.setC7_P36_5(C7_P36_5+"");
            modulo7.setC7_P36_5_0(C7_P36_5_O);
            data.insertarModulo7(modulo7);
        }
        data.close();
    }

    public boolean validar(){
        //revisarcampos

        boolean valido = true,vC7_P36=true;
        llenarMapaVariables();

        Integer [] pregunta36={C7_P36_1, C7_P36_2,C7_P36_3, C7_P36_4,C7_P36_5};
        for (Integer i: pregunta36  ) {
            if(i==1)vC7_P36=false;
        }

        if( C7_P34 == -1){
            mostrarMensaje("Pregunta 34: Debe seleccionar una opción");
            valido=false;
        }else if( C7_P35 == -1){
            mostrarMensaje("Pregunta 35: Debe seleccionar una opción");
            valido=false;
        } else if(C7_P35==1 && vC7_P36 ){
            mostrarMensaje("Pregunta 36: Debe seleccionar una o más opciones");
            valido=false;
        }else if(mod7_p36_ck5.isChecked() && C7_P36_5_O.trim().length()<3 ){
            mostrarMensaje("Pregunta 36: Debe registrar información válida en Especifique");
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
