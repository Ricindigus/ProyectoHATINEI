package pe.gob.inei.encuestahabilidades.fragments;


import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AlertDialog;
import android.text.InputFilter;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import pe.gob.inei.encuestahabilidades.R;
import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
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
import pe.gob.inei.encuestahabilidades.pojos.Modulo5;


/**
 * A simple {@link Fragment} subclass.
 */
public class Modulo5Fragment23 extends Fragment {

    private LinearLayout mod5_p27_lyt;
    private RadioGroup mod5_p27_rgb1;
    private RadioGroup mod5_p27_rgb2;
    private RadioGroup mod5_p27_rgb3;
    private RadioGroup mod5_p27_rgb4;
    private RadioGroup mod5_p27_rgb5;
    private RadioGroup mod5_p27_rgb6;
    private RadioGroup mod5_p27_rgb7;
    private RadioGroup mod5_p27_rgb8;
    private RadioGroup mod5_p27_rgb9;
    private RadioGroup mod5_p27_rgb10;
    private RadioGroup mod5_p27_rgb11;
    private RadioGroup mod5_p27_rgb12;
    private RadioGroup mod5_p27_rgb13;
    private RadioGroup mod5_p27_rgb14;
    private RadioGroup mod5_p27_rgb15;
    private RadioGroup mod5_p27_rgb16;
    private RadioGroup mod5_p27_rgb17;
    private RadioGroup mod5_p27_rgb18;

    private EditText edtObservaciones5_27;

    private String idempresa;
    private Modulo5 modulo5;
    private Context context;
    private Data data;

    //mapeo de variables
    int C5_1_P1;
    int C5_1_P2;
    int C5_1_P3;
    int C5_1_P4;
    int C5_1_P5;
    int C5_1_P6;
    int C5_1_P7;
    int C5_1_P8;
    int C5_1_P9;

    int C5_2_P1;
    int C5_2_P2;
    int C5_2_P3;
    int C5_2_P4;
    int C5_2_P5;
    int C5_2_P6;
    int C5_2_P7;
    int C5_2_P8;
    int C5_2_P9;
    String OBS_MOD_V;

    public Modulo5Fragment23() {
        // Required empty public constructor
    }

    @SuppressLint("ValidFragment")
    public Modulo5Fragment23(String idempresa, Context context) {
        this.idempresa = idempresa;
        this.context = context;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
//        return inflater.inflate(R.layout.fragment_modulo5_fragment23, container, false);
        View rootView = inflater.inflate(R.layout.fragment_modulo5_fragment23, container, false);
        mod5_p27_lyt = (LinearLayout) rootView.findViewById(R.id.mod5_p27_lyt);

        mod5_p27_rgb1 = (RadioGroup) rootView.findViewById(R.id.mod5_p27_rgb1);
        mod5_p27_rgb2= (RadioGroup) rootView.findViewById(R.id.mod5_p27_rgb2);
        mod5_p27_rgb3 = (RadioGroup) rootView.findViewById(R.id.mod5_p27_rgb3);
        mod5_p27_rgb4 = (RadioGroup) rootView.findViewById(R.id.mod5_p27_rgb4);
        mod5_p27_rgb5 = (RadioGroup) rootView.findViewById(R.id.mod5_p27_rgb5);
        mod5_p27_rgb6 = (RadioGroup) rootView.findViewById(R.id.mod5_p27_rgb6);
        mod5_p27_rgb7 = (RadioGroup) rootView.findViewById(R.id.mod5_p27_rgb7);
        mod5_p27_rgb8 = (RadioGroup) rootView.findViewById(R.id.mod5_p27_rgb8);
        mod5_p27_rgb9 = (RadioGroup) rootView.findViewById(R.id.mod5_p27_rgb9);
        mod5_p27_rgb10 = (RadioGroup) rootView.findViewById(R.id.mod5_p27_rgb10);
        mod5_p27_rgb11 = (RadioGroup) rootView.findViewById(R.id.mod5_p27_rgb11);
        mod5_p27_rgb12 = (RadioGroup) rootView.findViewById(R.id.mod5_p27_rgb12);
        mod5_p27_rgb13 = (RadioGroup) rootView.findViewById(R.id.mod5_p27_rgb13);
        mod5_p27_rgb14 = (RadioGroup) rootView.findViewById(R.id.mod5_p27_rgb14);
        mod5_p27_rgb15 = (RadioGroup) rootView.findViewById(R.id.mod5_p27_rgb15);
        mod5_p27_rgb16 = (RadioGroup) rootView.findViewById(R.id.mod5_p27_rgb16);
        mod5_p27_rgb17 = (RadioGroup) rootView.findViewById(R.id.mod5_p27_rgb17);
        mod5_p27_rgb18 = (RadioGroup) rootView.findViewById(R.id.mod5_p27_rgb18);
        edtObservaciones5_27 = (EditText) rootView.findViewById(R.id.edtObservaciones);

        return rootView;

    }



    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        edtObservaciones5_27.setFilters(new InputFilter[]{new InputFilter.AllCaps()});
        cargarDatos();

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

    public void cargarDatos(){
        data = new Data(context);
        data.open();
        //verifico si ya existe un objeto con datos llenados previamente
        if(data.existeModulo5(idempresa)){
            //si existe traigo el objeto
            modulo5 = data.getModulo5(idempresa);


            if(!modulo5.getC5_P27_1_1().equals("") && !modulo5.getC5_P27_1_1().equals("-1")){
                ((RadioButton)mod5_p27_rgb1.getChildAt(Integer.parseInt(modulo5.getC5_P27_1_1()))).setChecked(true);
            }
            if(!modulo5.getC5_P27_1_2().equals("") && !modulo5.getC5_P27_1_2().equals("-1")){
                ((RadioButton)mod5_p27_rgb3.getChildAt(Integer.parseInt(modulo5.getC5_P27_1_2()))).setChecked(true);
            }
            if(!modulo5.getC5_P27_1_3().equals("") && !modulo5.getC5_P27_1_3().equals("-1")){
                ((RadioButton)mod5_p27_rgb5.getChildAt(Integer.parseInt(modulo5.getC5_P27_1_3()))).setChecked(true);
            }
            if(!modulo5.getC5_P27_1_4().equals("") && !modulo5.getC5_P27_1_4().equals("-1")){
                ((RadioButton)mod5_p27_rgb7.getChildAt(Integer.parseInt(modulo5.getC5_P27_1_4()))).setChecked(true);
            }
            if(!modulo5.getC5_P27_1_5().equals("") && !modulo5.getC5_P27_1_5().equals("-1")){
                ((RadioButton)mod5_p27_rgb9.getChildAt(Integer.parseInt(modulo5.getC5_P27_1_5()))).setChecked(true);
            }
            if(!modulo5.getC5_P27_1_6().equals("") && !modulo5.getC5_P27_1_6().equals("-1")){
                ((RadioButton)mod5_p27_rgb11.getChildAt(Integer.parseInt(modulo5.getC5_P27_1_6()))).setChecked(true);
            }
            if(!modulo5.getC5_P27_1_7().equals("") && !modulo5.getC5_P27_1_7().equals("-1")){
                ((RadioButton)mod5_p27_rgb13.getChildAt(Integer.parseInt(modulo5.getC5_P27_1_7()))).setChecked(true);
            }
            if(!modulo5.getC5_P27_1_8().equals("") && !modulo5.getC5_P27_1_8().equals("-1")){
                ((RadioButton)mod5_p27_rgb15.getChildAt(Integer.parseInt(modulo5.getC5_P27_1_8()))).setChecked(true);
            }
            if(!modulo5.getC5_P27_1_9().equals("") && !modulo5.getC5_P27_1_9().equals("-1")){
                ((RadioButton)mod5_p27_rgb17.getChildAt(Integer.parseInt(modulo5.getC5_P27_1_9()))).setChecked(true);
            }


            if(!modulo5.getC5_P27_2_1().equals("") && !modulo5.getC5_P27_2_1().equals("-1")){
                ((RadioButton)mod5_p27_rgb2.getChildAt(Integer.parseInt(modulo5.getC5_P27_2_1()))).setChecked(true);
            }
            if(!modulo5.getC5_P27_2_2().equals("") && !modulo5.getC5_P27_2_2().equals("-1")){
                ((RadioButton)mod5_p27_rgb4.getChildAt(Integer.parseInt(modulo5.getC5_P27_2_2()))).setChecked(true);
            }
            if(!modulo5.getC5_P27_2_3().equals("") && !modulo5.getC5_P27_2_3().equals("-1")){
                ((RadioButton)mod5_p27_rgb6.getChildAt(Integer.parseInt(modulo5.getC5_P27_2_3()))).setChecked(true);
            }
            if(!modulo5.getC5_P27_2_4().equals("") && !modulo5.getC5_P27_2_4().equals("-1")){
                ((RadioButton)mod5_p27_rgb8.getChildAt(Integer.parseInt(modulo5.getC5_P27_2_4()))).setChecked(true);
            }
            if(!modulo5.getC5_P27_2_5().equals("") && !modulo5.getC5_P27_2_5().equals("-1")){
                ((RadioButton)mod5_p27_rgb10.getChildAt(Integer.parseInt(modulo5.getC5_P27_2_5()))).setChecked(true);
            }
            if(!modulo5.getC5_P27_2_6().equals("") && !modulo5.getC5_P27_2_6().equals("-1")){
                ((RadioButton)mod5_p27_rgb12.getChildAt(Integer.parseInt(modulo5.getC5_P27_2_6()))).setChecked(true);
            }
            if(!modulo5.getC5_P27_2_7().equals("") && !modulo5.getC5_P27_2_7().equals("-1")){
                ((RadioButton)mod5_p27_rgb14.getChildAt(Integer.parseInt(modulo5.getC5_P27_2_7()))).setChecked(true);
            }
            if(!modulo5.getC5_P27_2_8().equals("") && !modulo5.getC5_P27_2_8().equals("-1")){
                ((RadioButton)mod5_p27_rgb16.getChildAt(Integer.parseInt(modulo5.getC5_P27_2_8()))).setChecked(true);
            }
            if(!modulo5.getC5_P27_2_9().equals("") && !modulo5.getC5_P27_2_9().equals("-1")){
                ((RadioButton)mod5_p27_rgb18.getChildAt(Integer.parseInt(modulo5.getC5_P27_2_9()))).setChecked(true);
            }

            edtObservaciones5_27.setText(modulo5.getOBS_MOD_V());

        }
        data.close();
    }
    public void llenarMapaVariables(){

        //pregunta
        int childPosP1 = mod5_p27_rgb1.indexOfChild(mod5_p27_rgb1.findViewById(mod5_p27_rgb1.getCheckedRadioButtonId()));
        C5_1_P1 = childPosP1;

        //pregunta
        int childPosP2 = mod5_p27_rgb2.indexOfChild(mod5_p27_rgb2.findViewById(mod5_p27_rgb2.getCheckedRadioButtonId()));
        C5_2_P1 = childPosP2;

        //pregunta
        int childPosP3 = mod5_p27_rgb3.indexOfChild(mod5_p27_rgb3.findViewById(mod5_p27_rgb3.getCheckedRadioButtonId()));
        C5_1_P2 = childPosP3;

        //pregunta
        int childPosP4 = mod5_p27_rgb4.indexOfChild(mod5_p27_rgb4.findViewById(mod5_p27_rgb4.getCheckedRadioButtonId()));
        C5_2_P2 = childPosP4;

        //pregunta
        int childPosP5 = mod5_p27_rgb5.indexOfChild(mod5_p27_rgb5.findViewById(mod5_p27_rgb5.getCheckedRadioButtonId()));
        C5_1_P3 = childPosP5;

        //pregunta
        int childosP6 = mod5_p27_rgb6.indexOfChild(mod5_p27_rgb6.findViewById(mod5_p27_rgb6.getCheckedRadioButtonId()));
        C5_2_P3 = childosP6;

        //pregunta
        int childPosP7 = mod5_p27_rgb7.indexOfChild(mod5_p27_rgb7.findViewById(mod5_p27_rgb7.getCheckedRadioButtonId()));
        C5_1_P4 = childPosP7;

        //pregunta
        int childPosP8 = mod5_p27_rgb8.indexOfChild(mod5_p27_rgb8.findViewById(mod5_p27_rgb8.getCheckedRadioButtonId()));
        C5_2_P4 = childPosP8;

        //pregunta
        int childPosP9 = mod5_p27_rgb9.indexOfChild(mod5_p27_rgb9.findViewById(mod5_p27_rgb9.getCheckedRadioButtonId()));
        C5_1_P5 = childPosP9;

        int childPosP10 = mod5_p27_rgb10.indexOfChild(mod5_p27_rgb10.findViewById(mod5_p27_rgb10.getCheckedRadioButtonId()));
        C5_2_P5 = childPosP10;

        //pregunta
        int childPosP11 = mod5_p27_rgb11.indexOfChild(mod5_p27_rgb11.findViewById(mod5_p27_rgb11.getCheckedRadioButtonId()));
        C5_1_P6 = childPosP11;

        //pregunta
        int childPosP12 = mod5_p27_rgb12.indexOfChild(mod5_p27_rgb12.findViewById(mod5_p27_rgb12.getCheckedRadioButtonId()));
        C5_2_P6 = childPosP12;

        //pregunta
        int childPosP13 = mod5_p27_rgb13.indexOfChild(mod5_p27_rgb13.findViewById(mod5_p27_rgb13.getCheckedRadioButtonId()));
        C5_1_P7 = childPosP13;

        //pregunta
        int childPosP14 = mod5_p27_rgb14.indexOfChild(mod5_p27_rgb14.findViewById(mod5_p27_rgb14.getCheckedRadioButtonId()));
        C5_2_P7 = childPosP14;

        //pregunta
        int childosP15 = mod5_p27_rgb15.indexOfChild(mod5_p27_rgb15.findViewById(mod5_p27_rgb15.getCheckedRadioButtonId()));
        C5_1_P8 = childosP15;

        //pregunta
        int childPosP16 = mod5_p27_rgb16.indexOfChild(mod5_p27_rgb16.findViewById(mod5_p27_rgb16.getCheckedRadioButtonId()));
        C5_2_P8 = childPosP16;

        //pregunta
        int childPosP17 = mod5_p27_rgb17.indexOfChild(mod5_p27_rgb17.findViewById(mod5_p27_rgb17.getCheckedRadioButtonId()));
        C5_1_P9 = childPosP17;

        //pregunta
        int childPosP18 = mod5_p27_rgb18.indexOfChild(mod5_p27_rgb18.findViewById(mod5_p27_rgb18.getCheckedRadioButtonId()));
        C5_2_P9 = childPosP18;

        OBS_MOD_V = edtObservaciones5_27.getText().toString();

    }

    public void guardarDatos(){
        data = new Data(context);
        data.open();
        if(data.existeModulo5(idempresa)){
            ContentValues contentValues = new ContentValues(188);
            contentValues.put(SQLConstantes.MODULO5_P27_1_1,C5_1_P1+"");
            contentValues.put(SQLConstantes.MODULO5_P27_1_2,C5_1_P2+"");
            contentValues.put(SQLConstantes.MODULO5_P27_1_3,C5_1_P3+"");
            contentValues.put(SQLConstantes.MODULO5_P27_1_4,C5_1_P4+"");
            contentValues.put(SQLConstantes.MODULO5_P27_1_5,C5_1_P5+"");
            contentValues.put(SQLConstantes.MODULO5_P27_1_6,C5_1_P6+"");
            contentValues.put(SQLConstantes.MODULO5_P27_1_7,C5_1_P7+"");
            contentValues.put(SQLConstantes.MODULO5_P27_1_8,C5_1_P8+"");
            contentValues.put(SQLConstantes.MODULO5_P27_1_9,C5_1_P9+"");

            contentValues.put(SQLConstantes.MODULO5_P27_2_1,C5_2_P1+"");
            contentValues.put(SQLConstantes.MODULO5_P27_2_2,C5_2_P2+"");
            contentValues.put(SQLConstantes.MODULO5_P27_2_3,C5_2_P3+"");
            contentValues.put(SQLConstantes.MODULO5_P27_2_4,C5_2_P4+"");
            contentValues.put(SQLConstantes.MODULO5_P27_2_5,C5_2_P5+"");
            contentValues.put(SQLConstantes.MODULO5_P27_2_6,C5_2_P6+"");
            contentValues.put(SQLConstantes.MODULO5_P27_2_7,C5_2_P7+"");
            contentValues.put(SQLConstantes.MODULO5_P27_2_8,C5_2_P8+"");
            contentValues.put(SQLConstantes.MODULO5_P27_2_9,C5_2_P9+"");
            contentValues.put(SQLConstantes.MODULO5_OBS_MOD_V,OBS_MOD_V);
            data.actualizarModulo5(idempresa,contentValues);
        }else{
            //si no existe el elemento, lo construye para insertarlo
            modulo5 = new Modulo5();
            //llena el objeto a insertar
            modulo5.setMODULO5_ID(idempresa);
            modulo5.setC5_P27_1_1(C5_1_P1+"");
            modulo5.setC5_P27_1_2(C5_1_P2+"");
            modulo5.setC5_P27_1_3(C5_1_P3+"");
            modulo5.setC5_P27_1_4(C5_1_P4+"");
            modulo5.setC5_P27_1_5(C5_1_P5+"");
            modulo5.setC5_P27_1_6(C5_1_P6+"");
            modulo5.setC5_P27_1_7(C5_1_P7+"");
            modulo5.setC5_P27_1_8(C5_1_P8+"");
            modulo5.setC5_P27_1_9(C5_1_P9+"");

            modulo5.setC5_P27_2_1(C5_2_P1+"");
            modulo5.setC5_P27_2_2(C5_2_P2+"");
            modulo5.setC5_P27_2_3(C5_2_P3+"");
            modulo5.setC5_P27_2_4(C5_2_P4+"");
            modulo5.setC5_P27_2_5(C5_2_P5+"");
            modulo5.setC5_P27_2_6(C5_2_P6+"");
            modulo5.setC5_P27_2_7(C5_2_P7+"");
            modulo5.setC5_P27_2_8(C5_2_P8+"");
            modulo5.setC5_P27_2_9(C5_2_P9+"");
            modulo5.setOBS_MOD_V(OBS_MOD_V);
            data.insertarModulo5(modulo5);
        }
        data.close();
    }


    public boolean validar(){
        //revisarcampos
        boolean valido = true;
        llenarMapaVariables();

        boolean vC5_1_P1= false; boolean vC5_1_P2 = false;boolean vC5_1_P3=false; boolean vC5_1_P4 = false;boolean vC5_1_P5= false; boolean vC5_1_P6 = false;boolean vC5_1_P7=false;
        boolean vC5_1_P8= false; boolean vC5_1_P9 = false;boolean vC5_2_P1= false; boolean vC5_2_P2 = false;boolean vC5_2_P3=false; boolean vC5_2_P4 = false;boolean vC5_2_P5= false;
        boolean vC5_2_P6 = false;boolean vC5_2_P7=false;boolean vC5_2_P8= false; boolean vC5_2_P9 = false;


        //
        if(C5_1_P1 >= 0 && C5_1_P1 <= 1) vC5_1_P1 = true;
        //
        if(C5_1_P2 >= 0 && C5_1_P2 <= 1) vC5_1_P2 = true;
        //
        if(C5_1_P3 >= 0 && C5_1_P3 <= 1) vC5_1_P3 = true;
        //
        if(C5_1_P4 >= 0 && C5_1_P4 <= 1) vC5_1_P4 = true;
        //
        if(C5_1_P5 >= 0 && C5_1_P5 <= 1) vC5_1_P5 = true;
        //
        if(C5_1_P6 >= 0 && C5_1_P6 <= 1) vC5_1_P6 = true;
        //
        if(C5_1_P7 >= 0 && C5_1_P7 <= 1) vC5_1_P7 = true;
        //
        if(C5_1_P8 >= 0 && C5_1_P8 <= 1) vC5_1_P8 = true;
        //
        if(C5_1_P9 >= 0 && C5_1_P9 <= 1) vC5_1_P9 = true;

//
        if(C5_2_P1 >= 0 && C5_2_P1 <= 1) vC5_2_P1 = true;
        //
        if(C5_2_P2 >= 0 && C5_2_P2 <= 1) vC5_2_P2 = true;
        //
        if(C5_2_P3 >= 0 && C5_2_P3 <= 1) vC5_2_P3 = true;
        //
        if(C5_2_P4 >= 0 && C5_2_P4 <= 1) vC5_2_P4 = true;
        //
        if(C5_2_P5 >= 0 && C5_2_P5 <= 1) vC5_2_P5 = true;
        //
        if(C5_2_P6 >= 0 && C5_2_P6 <= 1) vC5_2_P6 = true;
        //
        if(C5_2_P7 >= 0 && C5_2_P7 <= 1) vC5_2_P7 = true;
        //
        if(C5_2_P8 >= 0 && C5_2_P8 <= 1) vC5_2_P8 = true;
        //
        if(C5_2_P9 >= 0 && C5_2_P9 <= 1) vC5_2_P9 = true;


        valido = vC5_1_P1 && vC5_1_P2  && vC5_1_P3 && vC5_1_P4 && vC5_1_P5
                && vC5_1_P6 && vC5_1_P7 && vC5_1_P8  && vC5_1_P9 && vC5_2_P1 && vC5_2_P2
                && vC5_2_P3 && vC5_2_P4 && vC5_2_P5  && vC5_2_P6 && vC5_2_P7 && vC5_2_P8 && vC5_2_P9;

        if(!valido) mostrarMensaje("DEBE LLENAR TODOS LOS DATOS");
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
