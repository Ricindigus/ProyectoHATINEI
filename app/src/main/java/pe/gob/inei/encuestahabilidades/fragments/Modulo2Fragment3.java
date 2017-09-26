package pe.gob.inei.encuestahabilidades.fragments;


import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AlertDialog;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.util.Log;
import android.view.KeyEvent;
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
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import pe.gob.inei.encuestahabilidades.NumericKeyBoardTransformationMethod;
import pe.gob.inei.encuestahabilidades.R;
import pe.gob.inei.encuestahabilidades.modelo.Data;
import pe.gob.inei.encuestahabilidades.modelo.SQLConstantes;
import pe.gob.inei.encuestahabilidades.pojos.BaseDatos;
import pe.gob.inei.encuestahabilidades.pojos.Modulo2;
import pe.gob.inei.encuestahabilidades.pojos.Visita;

/**
 * A simple {@link Fragment} subclass.
 */
public class Modulo2Fragment3 extends Fragment {

    private LinearLayout lytP14;
    private LinearLayout lytP15;
    private LinearLayout lytP16;
    private LinearLayout lytP17;

    private TextView txtTextoP14;

    private EditText edtP14;
    private EditText edtEspecifiqueP15;
    private EditText edtEspecifiqueP16;

    private CheckBox ck1P15;
    private CheckBox ck2P15;
    private CheckBox ck3P15;
    private CheckBox ck4P15;
    private CheckBox ck5P15;
    private CheckBox ck6P15;

    private CheckBox ck1P16;
    private CheckBox ck2P16;
    private CheckBox ck3P16;
    private CheckBox ck4P16;
    private CheckBox ck5P16;
    private CheckBox ck6P16;

    private RadioGroup rgP17;

    private String idempresa;
    private Modulo2 modulo2;
    private Context context;
    private Data data;
    private int mod2P1;

    private String C2_P14;
    private int C2_P15_1;
    private int C2_P15_2;
    private int C2_P15_3;
    private int C2_P15_4;
    private int C2_P15_5;
    private int C2_P15_6;
    private String C2_P15_6_0;
    private int C2_P16_1_1;
    private int C2_P16_1_2;
    private int C2_P16_1_3;
    private int C2_P16_1_4;
    private int C2_P16_1_5;
    private int C2_P16_1_6;
    private String C2_P16_1_6_0;
    private int C2_P17;

    public Modulo2Fragment3() {
        // Required empty public constructor
    }

    @SuppressLint("ValidFragment")
    public Modulo2Fragment3(String idempresa, Context context) {
        this.idempresa = idempresa;
        this.context = context;
        Data data = new Data(context);
        data.open();
        if (!data.getModulo2(idempresa).getC2_P1().equals("")){
            mod2P1 = Integer.parseInt(data.getModulo2(idempresa).getC2_P1());
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_modulo2_fragment3, container, false);

        lytP14 = (LinearLayout) rootView.findViewById(R.id.mod2_p14_lyt);
        lytP15 = (LinearLayout) rootView.findViewById(R.id.mod2_p15_lyt);
        lytP16 = (LinearLayout) rootView.findViewById(R.id.mod2_p16_lyt);
        lytP17 = (LinearLayout) rootView.findViewById(R.id.mod2_p17_lyt);

        edtP14 = (EditText) rootView.findViewById(R.id.mod2_p14_edt);

        ck1P15 = (CheckBox) rootView.findViewById(R.id.mod2_p15_ck1);
        ck2P15 = (CheckBox) rootView.findViewById(R.id.mod2_p15_ck2);
        ck3P15 = (CheckBox) rootView.findViewById(R.id.mod2_p15_ck3);
        ck4P15 = (CheckBox) rootView.findViewById(R.id.mod2_p15_ck4);
        ck5P15 = (CheckBox) rootView.findViewById(R.id.mod2_p15_ck5);
        ck6P15 = (CheckBox) rootView.findViewById(R.id.mod2_p15_ck6);

        ck1P16 = (CheckBox) rootView.findViewById(R.id.mod2_p16_ck1);
        ck2P16 = (CheckBox) rootView.findViewById(R.id.mod2_p16_ck2);
        ck3P16 = (CheckBox) rootView.findViewById(R.id.mod2_p16_ck3);
        ck4P16 = (CheckBox) rootView.findViewById(R.id.mod2_p16_ck4);
        ck5P16 = (CheckBox) rootView.findViewById(R.id.mod2_p16_ck5);
        ck6P16 = (CheckBox) rootView.findViewById(R.id.mod2_p16_ck6);

        edtEspecifiqueP15 = (EditText) rootView.findViewById(R.id.mod2_p15_edtEspecifique);
        edtEspecifiqueP16 = (EditText) rootView.findViewById(R.id.mod2_p16_edtEspecifique);

        rgP17 = (RadioGroup) rootView.findViewById(R.id.mod2_p17_rg);

        txtTextoP14 = (TextView) rootView.findViewById(R.id.mod2_p14_texto);

        return rootView;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        final CheckBox[] checkBoxesP15 = {ck1P15,ck2P15,ck3P15,ck4P15,ck5P15,ck6P15};
        final CheckBox[] checkBoxesP16 = {ck1P16,ck2P16,ck3P16,ck4P16,ck5P16};
        final LinearLayout[] lyt = {lytP17,lytP17,lytP17,lytP17,lytP17,lytP17};

        edtP14.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View view, int keyCode, KeyEvent keyEvent) {
                if ((keyEvent.getAction() == KeyEvent.ACTION_DOWN) &&
                        (keyCode == KeyEvent.KEYCODE_ENTER)) {
                    ocultarTeclado(edtP14);
                    return true;
                }
                return false;
            }
        });

        edtEspecifiqueP15.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View view, int keyCode, KeyEvent keyEvent) {
                if ((keyEvent.getAction() == KeyEvent.ACTION_DOWN) &&
                        (keyCode == KeyEvent.KEYCODE_ENTER)) {
                    ocultarTeclado(lytP15);
                    return true;
                }
                return false;
            }
        });

        edtEspecifiqueP16.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View view, int keyCode, KeyEvent keyEvent) {
                if ((keyEvent.getAction() == KeyEvent.ACTION_DOWN) &&
                        (keyCode == KeyEvent.KEYCODE_ENTER)) {
                    ocultarTeclado(lytP16);
                    return true;
                }
                return false;
            }
        });

        ck6P16.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b) {
                    edtEspecifiqueP16.setEnabled(true);
                    edtEspecifiqueP16.setBackgroundResource(R.drawable.fondo_edit_text);
                }else{
                    edtEspecifiqueP16.setText("");
                    edtEspecifiqueP16.setBackgroundResource(R.drawable.fondo_edit_text_disabled);
                    edtEspecifiqueP16.setEnabled(false);
                }
            }
        });

        ck6P15.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b) {
                    edtEspecifiqueP15.setEnabled(true);
                    edtEspecifiqueP15.setBackgroundResource(R.drawable.fondo_edit_text);
                }else{
                    edtEspecifiqueP15.setText("");
                    edtEspecifiqueP15.setBackgroundResource(R.drawable.fondo_edit_text_disabled);
                    edtEspecifiqueP15.setEnabled(false);
                }
            }
        });

        edtP14.setTransformationMethod(new NumericKeyBoardTransformationMethod());
        edtP14.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            @Override
            public void afterTextChanged(Editable editable) {
                int despues = 0;
                if(!editable.toString().equals("")){
                    despues = Integer.parseInt(editable.toString());
                    if(mod2P1 > despues) {
                        lytP15.setVisibility(View.VISIBLE);
                        lytP17.setVisibility(View.VISIBLE);
                        deshabilitaP16();
                    }else if(mod2P1 < despues){
                        lytP16.setVisibility(View.VISIBLE);
                        lytP17.setVisibility(View.VISIBLE);
                        deshabilitaP15();
                    }else if(despues == mod2P1){
                        lytP17.setVisibility(View.VISIBLE);
                        deshabilitaP15();
                        deshabilitaP16();
                    }
                } else{
                    deshabilitaP15();
                    deshabilitaP16();
                }
            }
        });
        edtEspecifiqueP15.setFilters(new InputFilter[]{new InputFilter.AllCaps()});
        edtEspecifiqueP16.setFilters(new InputFilter[]{new InputFilter.AllCaps()});
        cargarDatos();
    }

    public void deshabilitaP15(){
        ck1P15.setChecked(false);
        ck2P15.setChecked(false);
        ck3P15.setChecked(false);
        ck4P15.setChecked(false);
        ck5P15.setChecked(false);
        ck6P15.setChecked(false);
        lytP15.setVisibility(View.GONE);
    }
    public void deshabilitaP16(){
        ck1P16.setChecked(false);
        ck2P16.setChecked(false);
        ck3P16.setChecked(false);
        ck4P16.setChecked(false);
        ck5P16.setChecked(false);
        ck6P16.setChecked(false);
        lytP16.setVisibility(View.GONE);
    }
    public void deshabilitaP17(){
        rgP17.clearCheck();
        lytP17.setVisibility(View.GONE);
    }


    public void ocultarTeclado(View view){
        InputMethodManager mgr = (InputMethodManager) getActivity().getSystemService(Context.INPUT_METHOD_SERVICE);
        mgr.hideSoftInputFromWindow(view.getWindowToken(), 0);
    }
    public void cargarDatos(){
        data = new Data(context);
        data.open();
        modulo2 = data.getModulo2(idempresa);
        ArrayList<Visita> visitas = new ArrayList<Visita>();
        String sMes = "";
        if(data.existenVisitas(idempresa)){
            visitas = data.getVisitas(idempresa);
        }
        if(visitas.size() > 0){
            int mes = Integer.parseInt(visitas.get(visitas.size()-1).getV_MES());
            if(mes == 9 ) sMes = "Setiembre";
            if(mes == 10 ) sMes = "Octubre";
            if(mes == 11 ) sMes = "Noviembre";
            if(mes == 12 ) sMes = "Diciembre";
        }
        txtTextoP14.setText("14.En " + sMes + " del 2016 ¿Cuántos trabajadores tenía en su empresa en total?");
        edtP14.setText(modulo2.getC2_P14());
        if(lytP15.getVisibility() == View.VISIBLE){
            if(modulo2.getC2_P15_1().equals("1"))ck1P15.setChecked(true);
            if(modulo2.getC2_P15_2().equals("1"))ck2P15.setChecked(true);
            if(modulo2.getC2_P15_3().equals("1"))ck3P15.setChecked(true);
            if(modulo2.getC2_P15_4().equals("1"))ck4P15.setChecked(true);
            if(modulo2.getC2_P15_5().equals("1"))ck5P15.setChecked(true);
            if(modulo2.getC2_P15_6().equals("1")){ck6P15.setChecked(true);edtEspecifiqueP15.setText(modulo2.getC2_P15_6_0());}
        }
        if(lytP16.getVisibility() == View.VISIBLE){
            if(modulo2.getC2_P16_1_1().equals("1"))ck1P16.setChecked(true);
            if(modulo2.getC2_P16_1_2().equals("1"))ck2P16.setChecked(true);
            if(modulo2.getC2_P16_1_3().equals("1"))ck3P16.setChecked(true);
            if(modulo2.getC2_P16_1_4().equals("1"))ck4P16.setChecked(true);
            if(modulo2.getC2_P16_1_5().equals("1"))ck5P16.setChecked(true);
            if(modulo2.getC2_P16_1_6().equals("1")){ck6P16.setChecked(true);edtEspecifiqueP16.setText(modulo2.getC2_P16_1_6_0());}
        }
        if(!modulo2.getC2_P17().equals("") && !modulo2.getC2_P17().equals("-1")){
            ((RadioButton)rgP17.getChildAt(Integer.parseInt(modulo2.getC2_P17()))).setChecked(true);
        }

        data.close();
    }
    public void llenarMapaVariables(){
        //p14
        C2_P14 = edtP14.getText().toString();
        //p15
        if(ck1P15.isChecked())C2_P15_1 = 1;else C2_P15_1 = 0;
        if(ck2P15.isChecked())C2_P15_2 = 1;else C2_P15_2 = 0;
        if(ck3P15.isChecked())C2_P15_3 = 1;else C2_P15_3 = 0;
        if(ck4P15.isChecked())C2_P15_4 = 1;else C2_P15_4 = 0;
        if(ck5P15.isChecked())C2_P15_5 = 1;else C2_P15_5 = 0;
        if(ck6P15.isChecked())C2_P15_6 = 1;else C2_P15_6 = 0;
        C2_P15_6_0 = edtEspecifiqueP15.getText().toString();
        //p16
        if(ck1P16.isChecked())C2_P16_1_1 = 1;else C2_P16_1_1 = 0;
        if(ck2P16.isChecked())C2_P16_1_2 = 1;else C2_P16_1_2 = 0;
        if(ck3P16.isChecked())C2_P16_1_3 = 1;else C2_P16_1_3 = 0;
        if(ck4P16.isChecked())C2_P16_1_4 = 1;else C2_P16_1_4 = 0;
        if(ck5P16.isChecked())C2_P16_1_5 = 1;else C2_P16_1_5 = 0;
        if(ck6P16.isChecked())C2_P16_1_6 = 1;else C2_P16_1_6 = 0;
        C2_P16_1_6_0 = edtEspecifiqueP16.getText().toString();
        //p17
        C2_P17 = rgP17.indexOfChild(rgP17.findViewById(rgP17.getCheckedRadioButtonId()));
    }
    public void guardarDatos(){
        data = new Data(context);
        data.open();
        ContentValues contentValues = new ContentValues(163);
        contentValues.put(SQLConstantes.MODULO2_P14,C2_P14);
        contentValues.put(SQLConstantes.MODULO2_P15_1,C2_P15_1+"");
        contentValues.put(SQLConstantes.MODULO2_P15_2,C2_P15_2+"");
        contentValues.put(SQLConstantes.MODULO2_P15_3,C2_P15_3+"");
        contentValues.put(SQLConstantes.MODULO2_P15_4,C2_P15_4+"");
        contentValues.put(SQLConstantes.MODULO2_P15_5,C2_P15_5+"");
        contentValues.put(SQLConstantes.MODULO2_P15_6,C2_P15_6+"");
        contentValues.put(SQLConstantes.MODULO2_P15_6_0,C2_P15_6_0);
        contentValues.put(SQLConstantes.MODULO2_P16_1_1,C2_P16_1_1+"");
        contentValues.put(SQLConstantes.MODULO2_P16_1_2,C2_P16_1_2+"");
        contentValues.put(SQLConstantes.MODULO2_P16_1_3,C2_P16_1_3+"");
        contentValues.put(SQLConstantes.MODULO2_P16_1_4,C2_P16_1_4+"");
        contentValues.put(SQLConstantes.MODULO2_P16_1_5,C2_P16_1_5+"");
        contentValues.put(SQLConstantes.MODULO2_P16_1_6,C2_P16_1_6+"");
        contentValues.put(SQLConstantes.MODULO2_P16_1_6_0,C2_P16_1_6_0);
        contentValues.put(SQLConstantes.MODULO2_P17,C2_P17+"");
        data.actualizarModulo2(idempresa,contentValues);
        data.close();
    }

    public boolean validar(){
        boolean valido = false;
        llenarMapaVariables();
        String mensaje = "";
        boolean vC2_P14=false,
        vC2_P15_1=false,
        vC2_P15_2=false,
        vC2_P15_3=false,
        vC2_P15_4=false,
        vC2_P15_5=false,
        vC2_P15_6=false,
        vC2_P15_6_0=false,
        vC2_P16_1_1=false,
        vC2_P16_1_2=false,
        vC2_P16_1_3=false,
        vC2_P16_1_4=false,
        vC2_P16_1_5=false,
        vC2_P16_1_6=false,
        vC2_P16_1_6_0=false,
        vC2_P17=false;

        //p14
        if(C2_P14.trim().length() != 0){
            vC2_P14 = true;
            if(lytP15.getVisibility() == View.VISIBLE){
                if(C2_P15_1 == 1||C2_P15_2 == 1||C2_P15_3 == 1||C2_P15_4 == 1||C2_P15_5 == 1||C2_P15_6 == 1) {
                    vC2_P15_1 = true;vC2_P15_2 = true;vC2_P15_3 = true;vC2_P15_4 = true;vC2_P15_5 = true;vC2_P15_6 = true;
                }else if(mensaje.equals(""))mensaje = "PREGUNTA 15: DEBE SELECCIONAR ALGUNA OPCION";
                if(edtEspecifiqueP15.isEnabled()){
                    if(C2_P15_6_0.trim().length() >= 3) vC2_P15_6_0 = true;
                    else if(mensaje.equals(""))mensaje = "PREGUNTA 15: DEBE ESPECIFICAR SI MARCO OTRO";
                }else vC2_P15_6_0 = true;
            }else{
                vC2_P15_1=true;vC2_P15_2=true;vC2_P15_3=true;vC2_P15_4=true;vC2_P15_5=true;
                vC2_P15_6=true;vC2_P15_6_0=true;
            }
            if(lytP16.getVisibility() == View.VISIBLE){
                if(C2_P16_1_1 == 1||C2_P16_1_2 == 1||C2_P16_1_3 == 1||C2_P16_1_4 == 1||C2_P16_1_5 == 1||C2_P16_1_6 == 1) {
                    vC2_P16_1_1 = true;vC2_P16_1_2 = true;vC2_P16_1_3 = true;vC2_P16_1_4 = true;vC2_P16_1_5 = true;vC2_P16_1_6 = true;
                }else if(mensaje.equals(""))mensaje = "PREGUNTA 16: DEBE SELECCIONAR ALGUNA OPCION";
                if(edtEspecifiqueP16.isEnabled()){
                    if(C2_P16_1_6_0.trim().length() != 0) vC2_P16_1_6_0 = true;
                    else if(mensaje.equals(""))mensaje = "PREGUNTA 16: DEBE ESPECIFICAR SI MARCO OTRO";
                } else vC2_P16_1_6_0 = true;
            }else{
                vC2_P16_1_1=true;vC2_P16_1_2=true;vC2_P16_1_3=true;vC2_P16_1_4=true;
                vC2_P16_1_5=true;vC2_P16_1_6=true;vC2_P16_1_6_0=true;
            }
            if(lytP17.getVisibility() == View.VISIBLE){
                if(C2_P17 != -1) vC2_P17 = true;
                else if(mensaje.equals(""))mensaje = "PREGUNTA 17: DEBE MARCAR UNA OPCION";
            }else{
                vC2_P17 = true;
            }
        }else if(mensaje.equals(""))mensaje = "PREGUNTA 14: DEBE REGISTRAR NUMERO DE TRABAJADORES QUE TENIA EN AGOSTO DEL 2016";

        valido = vC2_P14 && vC2_P15_1 && vC2_P15_2 && vC2_P15_3 && vC2_P15_4 && vC2_P15_5 &&
                vC2_P15_6 && vC2_P15_6_0 && vC2_P16_1_1 && vC2_P16_1_2 && vC2_P16_1_3 &&
                vC2_P16_1_4 && vC2_P16_1_5 && vC2_P16_1_6 && vC2_P16_1_6_0 && vC2_P17;

        if(!valido) {
            mostrarMensaje(mensaje);
            Log.e("vC2_P14:",vC2_P14 + "");
            Log.e("vC2_P15_1:",vC2_P15_1 + "");
            Log.e("vC2_P15_2:",vC2_P15_2 + "");
            Log.e("vC2_P15_3:",vC2_P15_3 + "");
            Log.e("vC2_P15_4:",vC2_P15_4 + "");
            Log.e("vC2_P15_5:",vC2_P15_5 + "");
            Log.e("vC2_P15_6:",vC2_P15_6 + "");
            Log.e("vC2_P15_6_0:",vC2_P15_6_0 + "");
            Log.e("vC2_P16_1_1:",vC2_P16_1_1 + "");
            Log.e("vC2_P16_1_2:",vC2_P16_1_2 + "");
            Log.e("vC2_P16_1_3:",vC2_P16_1_3 + "");
            Log.e("vC2_P16_1_4:",vC2_P16_1_4 + "");
            Log.e("vC2_P16_1_5:",vC2_P16_1_5 + "");
            Log.e("vC2_P16_1_6:",vC2_P16_1_6 + "");
            Log.e("vC2_P16_1_6_0:",vC2_P16_1_6_0 + "");
            Log.e("vC2_P17:",vC2_P17 + "");
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
