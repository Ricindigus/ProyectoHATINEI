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
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import pe.gob.inei.encuestahabilidades.R;
import pe.gob.inei.encuestahabilidades.modelo.Data;
import pe.gob.inei.encuestahabilidades.modelo.SQLConstantes;
import pe.gob.inei.encuestahabilidades.pojos.Modulo3;

/**
 * A simple {@link Fragment} subclass.
 */
public class Modulo3Fragment2 extends Fragment {
    private LinearLayout mod3_layoutFragment2;

    private LinearLayout lytP7;
    private LinearLayout lytP8;
    private LinearLayout lytP9;
    private LinearLayout lytP10;
    private LinearLayout lytP11;
    private LinearLayout lytP12;


    private RadioGroup rgP7;
    private RadioGroup rgP8;
    private RadioGroup rgP9;
    private RadioGroup rgP10;
    private RadioGroup rgP11;
    private RadioGroup rgP12;
    private EditText edtObservaciones;


    private String idempresa;
    private Modulo3 modulo3;
    private Context context;
    private Data data;

    //mapeo de variables
    int C3_P4; int C3_P7;int C3_P8;int C3_P9;int C3_P10;
    int C3_P11;int C3_P12;String C3_OBS_MOD3;



    @SuppressLint("ValidFragment")
    public Modulo3Fragment2(String idempresa, Context context) {
        this.idempresa = idempresa;
        this.context = context;
        data = new Data(context);
        data.open();
        modulo3 = data.getModulo3(idempresa);
        if(!modulo3.getC3_P4().toString().equals(""))
        {C3_P4= Integer.parseInt(modulo3.getC3_P4());}




    }

    public Modulo3Fragment2() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_modulo3_fragment2, container, false);
        mod3_layoutFragment2 = (LinearLayout) rootView.findViewById(R.id.mod3_layoutFragment2);
        lytP7 = (LinearLayout) rootView.findViewById(R.id.mod3_p7_lyt);
        lytP8 = (LinearLayout) rootView.findViewById(R.id.mod3_p8_lyt);
        lytP9 = (LinearLayout) rootView.findViewById(R.id.mod3_p9_lyt);
        lytP10 = (LinearLayout) rootView.findViewById(R.id.mod3_p10_lyt);
        lytP11 = (LinearLayout) rootView.findViewById(R.id.mod3_p11_lyt);
        lytP12 = (LinearLayout) rootView.findViewById(R.id.mod3_p12_lyt);


        rgP7 = (RadioGroup) rootView.findViewById(R.id.mod3_p7_rg);
        rgP8 = (RadioGroup) rootView.findViewById(R.id.mod3_p8_rg);
        rgP9 = (RadioGroup) rootView.findViewById(R.id.mod3_p9_rg);
        rgP10 = (RadioGroup) rootView.findViewById(R.id.mod3_p10_rg);
        rgP11 = (RadioGroup) rootView.findViewById(R.id.mod3_p11_rg);
        rgP12 = (RadioGroup) rootView.findViewById(R.id.mod3_p12_rg);
        edtObservaciones = (EditText)rootView.findViewById(R.id.edtObservaciones);

        return rootView;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        edtObservaciones.setFilters(new InputFilter[]{new InputFilter.AllCaps()});




        cargarDatos();
        mod3_layoutFragment2.requestFocus();
        ocultarTeclado(mod3_layoutFragment2);
    }


    public void ocultarTeclado(View view){
        InputMethodManager mgr = (InputMethodManager) getActivity().getSystemService(Context.INPUT_METHOD_SERVICE);
        mgr.hideSoftInputFromWindow(view.getWindowToken(), 0);
    }

    public void cargarDatos(){
        data = new Data(context);
        data.open();
        //verifico si ya existe un objeto con datos llenados previamente
        if(data.existeModulo3(idempresa)){
            //si existe traigo el objeto
            modulo3 = data.getModulo3(idempresa);

            //pregunta 7
            if(!modulo3.getC3_P7().equals("")){
                ((RadioButton)rgP7.getChildAt(Integer.parseInt(modulo3.getC3_P7()))).setChecked(true);
            }
            //pregunta 8
            if(!modulo3.getC3_P8().equals("")){
                ((RadioButton)rgP8.getChildAt(Integer.parseInt(modulo3.getC3_P8()))).setChecked(true);
            }


            //pregunta 9
            if(!modulo3.getC3_P9().equals("")){
                ((RadioButton)rgP9.getChildAt(Integer.parseInt(modulo3.getC3_P9()))).setChecked(true);
            }


            //pregunta 10
            if(!modulo3.getC3_P10().equals("")){
                ((RadioButton)rgP10.getChildAt(Integer.parseInt(modulo3.getC3_P10()))).setChecked(true);
            }


            //pregunta 11
            if(!modulo3.getC3_P11().equals("")){
                ((RadioButton)rgP11.getChildAt(Integer.parseInt(modulo3.getC3_P11()))).setChecked(true);
            }

            //pregunta 12
            if(!modulo3.getC3_P12().equals("")){
                ((RadioButton)rgP12.getChildAt(Integer.parseInt(modulo3.getC3_P12()))).setChecked(true);
            }

            //OBSRVACION
            edtObservaciones.setText(modulo3.getOBS_MOD_III());

        }
        data.close();
    }
    public void llenarMapaVariables(){

        //pregunta 7
        int childPosP7 = rgP7.indexOfChild(rgP7.findViewById(rgP7.getCheckedRadioButtonId()));
        C3_P7 = childPosP7;

        //pregunta 8
        int childPosP8 = rgP8.indexOfChild(rgP8.findViewById(rgP8.getCheckedRadioButtonId()));
        C3_P8 = childPosP8;

        //pregunta 9
        int childPosP9 = rgP9.indexOfChild(rgP9.findViewById(rgP9.getCheckedRadioButtonId()));
        C3_P9 = childPosP9;

        //pregunta 10
        int childPosP10 = rgP10.indexOfChild(rgP10.findViewById(rgP10.getCheckedRadioButtonId()));
        C3_P10 = childPosP10;

        //pregunta 11
        int childPosP11 = rgP11.indexOfChild(rgP11.findViewById(rgP11.getCheckedRadioButtonId()));
        C3_P11 = childPosP11;

        //pregunta 12
        int childPosP12 = rgP12.indexOfChild(rgP12.findViewById(rgP12.getCheckedRadioButtonId()));
        C3_P12 = childPosP12;

        //observaciones
        C3_OBS_MOD3 = edtObservaciones.getText().toString();

    }
    public void guardarDatos(){
        data = new Data(context);
        data.open();
        if(data.existeModulo3(idempresa)){
            ContentValues contentValues = new ContentValues(19);
            contentValues.put(SQLConstantes.MODULO3_P7,C3_P7+"");
            contentValues.put(SQLConstantes.MODULO3_P8,C3_P8+"");
            contentValues.put(SQLConstantes.MODULO3_P9,C3_P9+"");
            contentValues.put(SQLConstantes.MODULO3_P10,C3_P10+"");
            contentValues.put(SQLConstantes.MODULO3_P11,C3_P11+"");
            contentValues.put(SQLConstantes.MODULO3_P12,C3_P12+"");
            contentValues.put(SQLConstantes.MODULO3_OBS_MOD_III,C3_OBS_MOD3);
            data.actualizarModulo3(idempresa,contentValues);
        }else{
            //si no existe el elemento, lo construye para insertarlo
            modulo3 = new Modulo3();
            //llena el objeto a insertar
            modulo3.setMODULO3_ID(idempresa);
            modulo3.setC3_P7(C3_P7+"");
            modulo3.setC3_P8(C3_P8+"");
            modulo3.setC3_P9(C3_P9+"");
            modulo3.setC3_P10(C3_P10+"");
            modulo3.setC3_P11(C3_P11+"");
            modulo3.setC3_P12(C3_P12+"");
            modulo3.setOBS_MOD_III(C3_OBS_MOD3);
            data.insertarModulo3(modulo3);
        }
        data.close();
    }
    public boolean validar(){
        //revisarcampos
        boolean correcto = true;
        llenarMapaVariables();
        boolean vC3_P7 = false;boolean vC3_P8 = false;
        boolean vC3_P9 = false;boolean vC3_P10 = false;
        boolean vC3_P11 = false;boolean vC3_P12 = false;
        boolean vObserv = false;

        if(C3_P7 == -1 ){
            mostrarMensaje("Pregunta 7: Marque una opción ");
            correcto=false;
        }else if(C3_P7 == 3 && C3_P4<30 )
        {mostrarMensaje("Pregunta 7: Verifique que su principal mercado sea América del Sur o Internacional ya que sus exportaciones son menores al 30% de sus ventas");
            correcto=false;

        }else if(C3_P7 == 4 && C3_P4<30 )
        {mostrarMensaje("Pregunta 7: Verifique que su principal mercado sea América del Sur o Internacional ya que sus exportaciones son menores al 30% de sus ventas");
            correcto=false;

        }else if(C3_P8 == -1 )
        {mostrarMensaje("Pregunta 8: Marque una opción ");
            correcto=false;

        }else if(C3_P9 == -1 )
        {mostrarMensaje("Pregunta 9: Marque una opción ");
            correcto=false;

        }else if(C3_P10 == -1 )
        {mostrarMensaje("Pregunta 10: Marque una opción ");
            correcto=false;

        }else
        if(C3_P11 == -1 )
        {mostrarMensaje("Pregunta 11: Marque una opción ");
            correcto=false;

        }else if(C3_P12 == -1 )
        {mostrarMensaje("Pregunta 12: Marque una opción ");
            correcto=false;

        }


//        if(C3_P7 >= 0 && C3_P7 <= 4){
//            vC3_P7=true;
//        }
//
//
//        if(C3_P8 >= 0 && C3_P8 <= 3){
//            vC3_P8=true;
//        }
//
//
//        if(C3_P9 >= 0 && C3_P9 <= 4){
//            vC3_P9=true;
//        }
//
//        //p1
//        if(C3_P10 >= 0 && C3_P10 <= 4){
//            vC3_P10=true;
//        }
//
//
//        if(C3_P11 >= 0 && C3_P11 <= 4){
//            vC3_P11=true;
//        }
//
//
//        if(C3_P12 >= 0 && C3_P12 <= 4){
//            vC3_P12=true;
//        }
//
//
//        correcto=  vC3_P7 &&  vC3_P8 &&  vC3_P9 &&  vC3_P10 &&  vC3_P11 &&  vC3_P12   ;
//
//        if(!correcto) Toast.makeText(context, "DEBE LLEBAR TODOS LOS DATOS", Toast.LENGTH_SHORT).show();

        return correcto;
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
