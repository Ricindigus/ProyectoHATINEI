package pe.gob.inei.encuestahabilidades.fragments;


import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.annotation.IdRes;
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
import android.widget.TextView;
import android.widget.Toast;

import pe.gob.inei.encuestahabilidades.NumericKeyBoardTransformationMethod;
import pe.gob.inei.encuestahabilidades.R;
import pe.gob.inei.encuestahabilidades.modelo.Data;
import pe.gob.inei.encuestahabilidades.modelo.SQLConstantes;
import pe.gob.inei.encuestahabilidades.pojos.Modulo2;

/**
 * A simple {@link Fragment} subclass.
 */
public class Modulo2Fragment6 extends Fragment {

    private RadioGroup rgP23;
    private RadioGroup rgP24;
    private RadioGroup rgP25;

    private EditText edt1P25;
    private EditText edt2P25;
    private TextView edt3P25Total;
    private LinearLayout lytP25;
    private  EditText edtObservaciones;

    private String idempresa;
    private Modulo2 modulo2;
    private Context context;
    private Data data;
    private int C2_P23;
    private int C2_P24;
    private int C2_P25;
    private String C2_P25_T;
    private String C2_P25_H;
    private String C2_P25_M;
    private String OBS_MOD_II;

    public Modulo2Fragment6() {
        // Required empty public constructor
    }

    @SuppressLint("ValidFragment")
    public Modulo2Fragment6(String idempresa, Context context) {
        this.idempresa = idempresa;
        this.context = context;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_modulo2_fragment6, container, false);

        rgP23 = (RadioGroup) rootView.findViewById(R.id.mod2_p23_rg);
        rgP24 = (RadioGroup) rootView.findViewById(R.id.mod2_p24_rg);
        rgP25 = (RadioGroup) rootView.findViewById(R.id.mod2_p25_rg);

        edt1P25 = (EditText) rootView.findViewById(R.id.mod2_p25_edt1);
        edt2P25 = (EditText) rootView.findViewById(R.id.mod2_p25_edt2);
        edt3P25Total = (TextView) rootView.findViewById(R.id.mod2_p25_edt3);
        lytP25 = (LinearLayout) rootView.findViewById(R.id.mod2_p25_lyt);
        edtObservaciones = (EditText)rootView.findViewById(R.id.edtObservaciones);
        return rootView;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        rgP25.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, @IdRes int i) {
                switch (i){
                    case R.id.mod2_p25_rbsi:
                        edt1P25.setEnabled(true);
                        edt2P25.setEnabled(true);
                        edt1P25.setBackgroundResource(R.drawable.fondo_edit_text);
                        edt2P25.setBackgroundResource(R.drawable.fondo_edit_text);
                        break;
                    case R.id.mod2_p25_rbno:
                        edt1P25.setText("");
                        edt2P25.setText("");
                        edt3P25Total.setText("0");
                        edt1P25.setBackgroundResource(R.drawable.cajas_de_texto_disabled);
                        edt2P25.setBackgroundResource(R.drawable.cajas_de_texto_disabled);
                        edt1P25.setEnabled(false);
                        edt2P25.setEnabled(false);
                        break;
                }
            }
        });

        EditText[] editTexts = {edt1P25,edt2P25};
        for (int i = 0; i < editTexts.length; i++) {
            final EditText editText = editTexts[i];
            editText.setTransformationMethod(new NumericKeyBoardTransformationMethod());
            editText.setOnKeyListener(new View.OnKeyListener() {
                @Override
                public boolean onKey(View view, int keyCode, KeyEvent keyEvent) {
                    if ((keyEvent.getAction() == KeyEvent.ACTION_DOWN) &&
                            (keyCode == KeyEvent.KEYCODE_ENTER)) {
                        ocultarTeclado(editText);
                        lytP25.requestFocus();
                        return true;
                    }
                    return false;
                }
            });

            editText.addTextChangedListener(new TextWatcher() {
                @Override
                public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                    if(!charSequence.toString().equals("")){
                        edt3P25Total.setText((Integer.parseInt(edt3P25Total.getText().toString()) - Integer.parseInt(charSequence.toString()))+"");
                    }
                }

                @Override
                public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                }

                @Override
                public void afterTextChanged(Editable editable) {
                    int despues = 0;
                    if(!editable.toString().equals("")) despues = Integer.parseInt(editable.toString());
                    if(!(Integer.parseInt(edt3P25Total.getText().toString())== 0)){//error
                        edt3P25Total.setText((Integer.parseInt(edt3P25Total.getText().toString()) + despues) +"");
                    }else{
                        edt3P25Total.setText(despues+"");
                    }
                }

            });
        }

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
        modulo2 = data.getModulo2(idempresa);

        if(!modulo2.getC2_P23().equals("") && !modulo2.getC2_P23().equals("-1")){
            ((RadioButton)rgP23.getChildAt(Integer.parseInt(modulo2.getC2_P23()))).setChecked(true);
        }
        if(!modulo2.getC2_P24().equals("") && !modulo2.getC2_P24().equals("-1")){
            ((RadioButton)rgP24.getChildAt(Integer.parseInt(modulo2.getC2_P24()))).setChecked(true);
        }
        if(!modulo2.getC2_P25().equals("") && !modulo2.getC2_P25().equals("-1")){
            ((RadioButton)rgP25.getChildAt(Integer.parseInt(modulo2.getC2_P25()))).setChecked(true);
        }

        edt1P25.setText(modulo2.getC2_P25_H());
        edt2P25.setText(modulo2.getC2_P25_M());
        edtObservaciones.setText(modulo2.getOBS_MOD_II());
        data.close();
    }
    public void llenarMapaVariables(){
        C2_P23 = rgP23.indexOfChild(rgP23.findViewById(rgP23.getCheckedRadioButtonId()));
        C2_P24 = rgP24.indexOfChild(rgP24.findViewById(rgP24.getCheckedRadioButtonId()));
        C2_P25 = rgP25.indexOfChild(rgP25.findViewById(rgP25.getCheckedRadioButtonId()));

        C2_P25_H = edt1P25.getText().toString();
        C2_P25_M = edt2P25.getText().toString();
        C2_P25_T = edt3P25Total.getText().toString();

        OBS_MOD_II = edtObservaciones.getText().toString();
    }
    public void guardarDatos(){
        data = new Data(context);
        data.open();
        ContentValues contentValues = new ContentValues(7);
        contentValues.put(SQLConstantes.MODULO2_P23,C2_P23);
        contentValues.put(SQLConstantes.MODULO2_P24,C2_P24);
        contentValues.put(SQLConstantes.MODULO2_P25,C2_P25);
        contentValues.put(SQLConstantes.MODULO2_P25_T,C2_P25_T);
        contentValues.put(SQLConstantes.MODULO2_P25_H,C2_P25_H);
        contentValues.put(SQLConstantes.MODULO2_P25_M,C2_P25_M);
        contentValues.put(SQLConstantes.MODULO2_OBS_MOD_II,OBS_MOD_II);
        data.actualizarModulo2(idempresa,contentValues);
        data.close();
    }

    public boolean validar(){
        boolean valido = false;
        llenarMapaVariables();
        String mensaje = "";
        boolean
        vC2_P23=true,
        vC2_P24=true,
        vC2_P25=true,
        vC2_P25_H=true,
        vC2_P25_M=true;

        if(C2_P23 == -1){
            vC2_P23 = false;
            if(mensaje.equals("")) mensaje = "PREGUNTA 23: DEBE INDICAR UNA OPCION";
        }
        if(C2_P24 == -1){
            vC2_P24 = false;
            if(mensaje.equals("")) mensaje = "PREGUNTA 24: DEBE INDICAR UNA OPCION";
        }
        if(C2_P25 == -1){
            vC2_P25 = false;
            if(mensaje.equals("")) mensaje = "PREGUNTA 25: DEBE INDICAR UNA OPCION";
        }
        valido = vC2_P23 && vC2_P24 && vC2_P25 && vC2_P25_H && vC2_P25_M;

        if(!valido) {
            mostrarMensaje(mensaje);
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
