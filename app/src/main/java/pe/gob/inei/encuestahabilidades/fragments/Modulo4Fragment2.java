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
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import pe.gob.inei.encuestahabilidades.R;
import pe.gob.inei.encuestahabilidades.modelo.Data;
import pe.gob.inei.encuestahabilidades.modelo.SQLConstantes;
import pe.gob.inei.encuestahabilidades.pojos.Modulo4;

/**
 * A simple {@link Fragment} subclass.
 */
public class Modulo4Fragment2 extends Fragment {

    private LinearLayout lytFragment4;
    //PREGUNTA 4
    private RadioGroup mod4_p4_rgb;
    //PREGUNTA 5
    private RadioGroup mod4_p5_rgb;
    //PREGUNTA 6
    private RadioGroup mod4_p6_rgb;
    //PREGUNTA 7
    private RadioGroup mod4_p7_rgb;

    private String idempresa;
    private Modulo4 modulo4;
    private Context context;
    private Data data;

    //mapeo de variables
    int C4_P4;int C4_P5;int C4_P6;int C4_P7;

    public Modulo4Fragment2() {
        // Required empty public constructor
    }

    @SuppressLint("ValidFragment")
    public Modulo4Fragment2(String idempresa, Context context) {
        this.idempresa = idempresa;
        this.context = context;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_modulo4_fragment2, container, false);
        lytFragment4 = (LinearLayout) rootView.findViewById(R.id.mod4_layoutFragment2);
        //PREGUNTA 4
        mod4_p4_rgb  = (RadioGroup) rootView.findViewById(R.id.mod4_p4_rgb);
        //PREGUNTA 5
        mod4_p5_rgb = (RadioGroup) rootView.findViewById(R.id.mod4_p5_rgb);
        //PREGUNTA 6
        mod4_p6_rgb = (RadioGroup) rootView.findViewById(R.id.mod4_p6_rgb);
        //PREGUNTA 7
        mod4_p7_rgb = (RadioGroup) rootView.findViewById(R.id.mod4_p7_rgb);
        return rootView;
        // Inflate the layout for this fragment
    };



    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        //PREGUNTA 4
        mod4_p4_rgb .setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, @IdRes int i) {
                switch (i)
                {
                    case R.id.mod4_p4_rgb1:break;
                    case R.id.mod4_p4_rgb2:break;
                    case R.id.mod4_p4_rgb3:break;
                    case R.id.mod4_p4_rgb4:break;
                    case R.id.mod4_p4_rgb5:break;
                }
                mod4_p4_rgb.setBackgroundColor(Color.TRANSPARENT);
                mod4_p6_rgb.setBackgroundColor(Color.TRANSPARENT);
                mod4_p7_rgb.setBackgroundColor(Color.TRANSPARENT);
                mod4_p5_rgb.requestFocus();
                mod4_p5_rgb.setBackgroundColor(Color.CYAN);
            };

        });
        //PREGUNTA 5
        mod4_p5_rgb .setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, @IdRes int i) {
                switch (i)
                {
                    case R.id.mod4_p5_rgb1:break;
                    case R.id.mod4_p5_rgb2:break;
                    case R.id.mod4_p5_rgb3:break;
                    case R.id.mod4_p5_rgb4:break;
                    case R.id.mod4_p5_rgb5:break;
                }
                mod4_p4_rgb.setBackgroundColor(Color.TRANSPARENT);
                mod4_p5_rgb.setBackgroundColor(Color.TRANSPARENT);
                mod4_p7_rgb.setBackgroundColor(Color.TRANSPARENT);
                mod4_p6_rgb.requestFocus();
                mod4_p6_rgb.setBackgroundColor(Color.CYAN);
            };

        });
        //PREGUNTA 6
        mod4_p6_rgb .setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, @IdRes int i) {
                switch (i)
                {
                    case R.id.mod4_p6_rgb1:break;
                    case R.id.mod4_p6_rgb2:break;
                    case R.id.mod4_p6_rgb3:break;
                    case R.id.mod4_p6_rgb4:break;
                    case R.id.mod4_p6_rgb5:break;
                }
                mod4_p4_rgb.setBackgroundColor(Color.TRANSPARENT);
                mod4_p5_rgb.setBackgroundColor(Color.TRANSPARENT);
                mod4_p6_rgb.setBackgroundColor(Color.TRANSPARENT);
                mod4_p7_rgb.requestFocus();
                mod4_p7_rgb.setBackgroundColor(Color.CYAN);


            };

        });
        //PREGUNTA 7
        mod4_p7_rgb .setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, @IdRes int i) {
                switch (i)
                {
                    case R.id.mod4_p7_rgb1:break;
                    case R.id.mod4_p7_rgb2:break;
                    case R.id.mod4_p7_rgb3:break;
                    case R.id.mod4_p7_rgb4:break;
                    case R.id.mod4_p7_rgb5:break;
                }
                mod4_p4_rgb.setBackgroundColor(Color.TRANSPARENT);
                mod4_p5_rgb.setBackgroundColor(Color.TRANSPARENT);
                mod4_p6_rgb.setBackgroundColor(Color.TRANSPARENT);
                mod4_p7_rgb.setBackgroundColor(Color.TRANSPARENT);
            };

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
            //pregunta 4
            if(!modulo4.getC4_P4().equals("")){
                int childPos4 = Integer.parseInt(modulo4.getC4_P4());
                ((RadioButton)mod4_p4_rgb.getChildAt(childPos4)).setChecked(true);
            }
            //pregunta 5
            if(!modulo4.getC4_P5().equals("")){
                int childPos5 = Integer.parseInt(modulo4.getC4_P5());
                ((RadioButton)mod4_p5_rgb.getChildAt(childPos5)).setChecked(true);
            }
            //pregunta 6
            if(!modulo4.getC4_P6().equals("")){
                int childPos6 = Integer.parseInt(modulo4.getC4_P6());
                ((RadioButton)mod4_p6_rgb.getChildAt(childPos6)).setChecked(true);
            }
            //pregunta 7
            if(!modulo4.getC4_P7().equals("")){
                int childPos7 = Integer.parseInt(modulo4.getC4_P7());
                ((RadioButton)mod4_p7_rgb.getChildAt(childPos7)).setChecked(true);
            }
        }
        data.close();
    }

    public void llenarMapaVariables(){
        //pregunta 4
        int childPosP4 = mod4_p4_rgb.indexOfChild(mod4_p4_rgb.findViewById(mod4_p4_rgb.getCheckedRadioButtonId()));
        C4_P4 = childPosP4;
        //pregunta 5
        int childPosP5 = mod4_p5_rgb.indexOfChild(mod4_p5_rgb.findViewById(mod4_p5_rgb.getCheckedRadioButtonId()));
        C4_P5 = childPosP5;
        //pregunta 6
        int childPosP6 = mod4_p6_rgb.indexOfChild(mod4_p6_rgb.findViewById(mod4_p6_rgb.getCheckedRadioButtonId()));
        C4_P6 = childPosP6;
        //pregunta 7
        int childPosP7 = mod4_p7_rgb.indexOfChild(mod4_p7_rgb.findViewById(mod4_p7_rgb.getCheckedRadioButtonId()));
        C4_P7 = childPosP7;
    }

    public void guardarDatos(){
        data = new Data(context);
        data.open();
        if(data.existeModulo4(idempresa)){
            ContentValues contentValues = new ContentValues(54);
            contentValues.put(SQLConstantes.MODULO4_P4,C4_P4);
            contentValues.put(SQLConstantes.MODULO4_P5,C4_P5);
            contentValues.put(SQLConstantes.MODULO4_P6,C4_P6);
            contentValues.put(SQLConstantes.MODULO4_P7,C4_P7);
            data.actualizarModulo4(idempresa,contentValues);
        }else{
            //si no existe el elemento, lo construye para insertarlo
            modulo4 = new Modulo4();
            //llena el objeto a insertar
            modulo4.setMODULO4_ID(idempresa);
            modulo4.setC4_P4(C4_P4+"");
            modulo4.setC4_P5(C4_P5+"");
            modulo4.setC4_P6(C4_P6+"");
            modulo4.setC4_P7(C4_P7+"");
            data.insertarModulo4(modulo4);
        }
        data.close();
    }

    public boolean validar(){
        boolean valido = true;
        llenarMapaVariables();

        if(C4_P4 == -1){
            mostrarMensaje("Pregunta 4: Marque una opción ");
            valido=false;
        }else if(C4_P5 == -1){
            mostrarMensaje("Pregunta 5: Marque una opción ");
            valido=false;
        }else if(C4_P6 == -1){
            mostrarMensaje("Pregunta 6: Marque una opción ");
            valido=false;
        }else if(C4_P7 == -1){
            mostrarMensaje("Pregunta 7: Marque una opción ");
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