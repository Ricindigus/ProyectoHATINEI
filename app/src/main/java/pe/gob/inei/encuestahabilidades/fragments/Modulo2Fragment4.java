package pe.gob.inei.encuestahabilidades.fragments;


import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AlertDialog;
import android.text.InputFilter;
import android.util.Log;
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
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import pe.gob.inei.encuestahabilidades.R;
import pe.gob.inei.encuestahabilidades.modelo.Data;
import pe.gob.inei.encuestahabilidades.modelo.SQLConstantes;
import pe.gob.inei.encuestahabilidades.pojos.Modulo2;

/**
 * A simple {@link Fragment} subclass.
 */
public class Modulo2Fragment4 extends Fragment {
    private LinearLayout lytP18;
    private LinearLayout lytP19;

    private CheckBox ck1P18;
    private CheckBox ck2P18;
    private CheckBox ck3P18;
    private CheckBox ck4P18;
    private CheckBox ck5P18;
    private CheckBox ck6P18;
    private CheckBox ck7P18;

    private CheckBox ck1P19;
    private CheckBox ck2P19;
    private CheckBox ck3P19;
    private CheckBox ck4P19;
    private CheckBox ck5P19;

    private Spinner sp1P18;
    private Spinner sp2P18;
    private Spinner sp3P18;
    private Spinner sp4P18;
    private Spinner sp5P18;
    private Spinner sp6P18;
    private Spinner sp7P18;

    private Spinner sp1P19;
    private Spinner sp2P19;
    private Spinner sp3P19;
    private Spinner sp4P19;
    private Spinner sp5P19;

    private LinearLayout lytSp1P18;
    private LinearLayout lytSp2P18;
    private LinearLayout lytSp3P18;
    private LinearLayout lytSp4P18;
    private LinearLayout lytSp5P18;
    private LinearLayout lytSp6P18;
    private LinearLayout lytSp7P18;

    private LinearLayout lytSp1P19;
    private LinearLayout lytSp2P19;
    private LinearLayout lytSp3P19;
    private LinearLayout lytSp4P19;
    private LinearLayout lytSp5P19;

    private EditText edtEspecifiqueP18;
    private EditText edtEspecifiqueP19;

    private String idempresa;
    private Modulo2 modulo2;
    private Context context;
    private Data data;

    private int C2_P18_1_1;
    private int C2_P18_1_2;
    private int C2_P18_1_3;
    private int C2_P18_1_4;
    private int C2_P18_1_5;
    private int C2_P18_1_6;
    private int C2_P18_1_7;
    private String C2_P18_1_7_0;
    private int C2_P18_2_1;
    private int C2_P18_2_2;
    private int C2_P18_2_3;
    private int C2_P18_2_4;
    private int C2_P18_2_5;
    private int C2_P18_2_6;
    private int C2_P18_2_7;
    private int C2_P19_1_1;
    private int C2_P19_1_2;
    private int C2_P19_1_3;
    private int C2_P19_1_4;
    private int C2_P19_1_5;
    private String C2_P19_1_5_0;
    private int C2_P19_2_1;
    private int C2_P19_2_2;
    private int C2_P19_2_3;
    private int C2_P19_2_4;
    private int C2_P19_2_5;

    public Modulo2Fragment4() {
        // Required empty public constructor
    }

    @SuppressLint("ValidFragment")
    public Modulo2Fragment4(String idempresa, Context context) {
        this.idempresa = idempresa;
        this.context = context;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_modulo2_fragment4, container, false);
        lytP18 = (LinearLayout) rootView.findViewById(R.id.mod2_p18_lyt);
        lytP19 = (LinearLayout) rootView.findViewById(R.id.mod2_p19_lyt);

        ck1P18 = (CheckBox) rootView.findViewById(R.id.mod2_p18_ck1);
        ck2P18 = (CheckBox) rootView.findViewById(R.id.mod2_p18_ck2);
        ck3P18 = (CheckBox) rootView.findViewById(R.id.mod2_p18_ck3);
        ck4P18 = (CheckBox) rootView.findViewById(R.id.mod2_p18_ck4);
        ck5P18 = (CheckBox) rootView.findViewById(R.id.mod2_p18_ck5);
        ck6P18 = (CheckBox) rootView.findViewById(R.id.mod2_p18_ck6);
        ck7P18 = (CheckBox) rootView.findViewById(R.id.mod2_p18_ck7);

        ck1P19 = (CheckBox) rootView.findViewById(R.id.mod2_p19_ck1);
        ck2P19 = (CheckBox) rootView.findViewById(R.id.mod2_p19_ck2);
        ck3P19 = (CheckBox) rootView.findViewById(R.id.mod2_p19_ck3);
        ck4P19 = (CheckBox) rootView.findViewById(R.id.mod2_p19_ck4);
        ck5P19 = (CheckBox) rootView.findViewById(R.id.mod2_p19_ck5);

        lytSp1P18 = (LinearLayout) rootView.findViewById(R.id.mod2_p18_lyt1);
        lytSp2P18 = (LinearLayout) rootView.findViewById(R.id.mod2_p18_lyt2);
        lytSp3P18 = (LinearLayout) rootView.findViewById(R.id.mod2_p18_lyt3);
        lytSp4P18 = (LinearLayout) rootView.findViewById(R.id.mod2_p18_lyt4);
        lytSp5P18 = (LinearLayout) rootView.findViewById(R.id.mod2_p18_lyt5);
        lytSp6P18 = (LinearLayout) rootView.findViewById(R.id.mod2_p18_lyt6);
        lytSp7P18 = (LinearLayout) rootView.findViewById(R.id.mod2_p18_lyt7);


        lytSp1P19 = (LinearLayout) rootView.findViewById(R.id.mod2_p19_lyt1);
        lytSp2P19 = (LinearLayout) rootView.findViewById(R.id.mod2_p19_lyt2);
        lytSp3P19 = (LinearLayout) rootView.findViewById(R.id.mod2_p19_lyt3);
        lytSp4P19 = (LinearLayout) rootView.findViewById(R.id.mod2_p19_lyt4);
        lytSp5P19 = (LinearLayout) rootView.findViewById(R.id.mod2_p19_lyt5);

        sp1P18 = (Spinner) rootView.findViewById(R.id.mod2_p18_sp1);
        sp2P18 = (Spinner) rootView.findViewById(R.id.mod2_p18_sp2);
        sp3P18 = (Spinner) rootView.findViewById(R.id.mod2_p18_sp3);
        sp4P18 = (Spinner) rootView.findViewById(R.id.mod2_p18_sp4);
        sp5P18 = (Spinner) rootView.findViewById(R.id.mod2_p18_sp5);
        sp6P18 = (Spinner) rootView.findViewById(R.id.mod2_p18_sp6);
        sp7P18 = (Spinner) rootView.findViewById(R.id.mod2_p18_sp7);

        sp1P19 = (Spinner) rootView.findViewById(R.id.mod2_p19_sp1);
        sp2P19 = (Spinner) rootView.findViewById(R.id.mod2_p19_sp2);
        sp3P19 = (Spinner) rootView.findViewById(R.id.mod2_p19_sp3);
        sp4P19 = (Spinner) rootView.findViewById(R.id.mod2_p19_sp4);
        sp5P19 = (Spinner) rootView.findViewById(R.id.mod2_p19_sp5);

        edtEspecifiqueP18 = (EditText) rootView.findViewById(R.id.mod2_p18_edtEspecifique);
        edtEspecifiqueP19 = (EditText) rootView.findViewById(R.id.mod2_p19_edtEspecifique);

        return rootView;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        sp1P19.setEnabled(false);
        sp2P19.setEnabled(false);
        sp3P19.setEnabled(false);
        sp4P19.setEnabled(false);
        sp5P19.setEnabled(false);

        sp1P18.setEnabled(false);
        sp2P18.setEnabled(false);
        sp3P18.setEnabled(false);
        sp4P18.setEnabled(false);
        sp5P18.setEnabled(false);
        sp6P18.setEnabled(false);
        sp7P18.setEnabled(false);

        final Spinner[] spinnersP18 = {sp1P18,sp2P18,sp3P18,sp4P18,sp5P18,sp6P18};
        final Spinner[] spinnersP18Aux = {sp1P18,sp2P18,sp3P18,sp4P18,sp5P18,sp6P18,sp7P18};

        final Spinner[] spinnersP19 = {sp1P19,sp2P19,sp3P19,sp4P19};
        final Spinner[] spinnersP19Aux = {sp1P19,sp2P19,sp3P19,sp4P19,sp5P19};


        final LinearLayout[] layoutSpinnersP18 = {lytSp1P18,lytSp2P18,lytSp3P18,lytSp4P18,lytSp5P18,lytSp6P18};
        final LinearLayout[] layoutSpinnersP19 = {lytSp1P19 ,lytSp2P19,lytSp3P19,lytSp4P19};

        final CheckBox[] checkBoxesP18 = {ck1P18,ck2P18,ck3P18,ck4P18,ck5P18,ck6P18};
        final CheckBox[] checkBoxesP19 = {ck1P19,ck2P19,ck3P19,ck4P19};

    //pregunta 18
        for(int i = 0; i <checkBoxesP18.length ; i++) {
            final int posicion = 1;
            CheckBox checkBox = checkBoxesP18[i];
            final Spinner spinner = spinnersP18[i];
            final LinearLayout linearLayout = layoutSpinnersP18[i];
            checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                    if(b){
                        if(!comprobarSumaSpinner(spinnersP18Aux)){
                            spinner.setEnabled(true);
                            linearLayout.setBackgroundResource(R.drawable.fondo_spinner);
                        }
                    }else{
                        spinner.setSelection(0);
                        linearLayout.setBackgroundResource(R.drawable.fondo_spinner_disabled);
                        spinner.setEnabled(false);
                    }
                }
            });
        }

        ck7P18.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    edtEspecifiqueP18.setEnabled(true);
                    edtEspecifiqueP18.setBackgroundResource(R.drawable.fondo_edit_text);
                    if(!comprobarSumaSpinner(spinnersP18Aux)) {
                        sp7P18.setEnabled(true);
                        lytSp7P18.setBackgroundResource(R.drawable.fondo_spinner);
                    }
                }else{
                    edtEspecifiqueP18.setText("");
                    edtEspecifiqueP18.setBackgroundResource(R.drawable.cajas_de_texto_disabled);
                    edtEspecifiqueP18.setEnabled(false);
                    sp7P18.setSelection(0);
                    lytSp7P18.setBackgroundResource(R.drawable.fondo_spinner_disabled);
                    sp7P18.setEnabled(false);
                }
            }
        });

        edtEspecifiqueP18.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View view, int keyCode, KeyEvent keyEvent) {
                if ((keyEvent.getAction() == KeyEvent.ACTION_DOWN) &&
                        (keyCode == KeyEvent.KEYCODE_ENTER)) {
                    ocultarTeclado(edtEspecifiqueP18);
                    lytP18.requestFocus();
                    return true;
                }
                return false;
            }
        });

        edtEspecifiqueP18.setFilters(new InputFilter[]{new InputFilter.AllCaps()});

        //pregunta 19
        for(int i = 0; i <checkBoxesP19.length ; i++) {
            final int posicion = 1;
            CheckBox checkBox = checkBoxesP19[i];
            final Spinner spinner = spinnersP19[i];
            final LinearLayout linearLayout = layoutSpinnersP19[i];
            spinner.setEnabled(false);
            checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                    if(b){
                        if(!comprobarSumaSpinner(spinnersP19Aux)){
                            spinner.setEnabled(true);
                            linearLayout.setBackgroundResource(R.drawable.fondo_spinner);
                        }
                    }else{
                        spinner.setSelection(0);
                        linearLayout.setBackgroundResource(R.drawable.fondo_spinner_disabled);
                        spinner.setEnabled(false);
                    }
                }
            });
        }

        ck5P19.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    edtEspecifiqueP19.setEnabled(true);
                    edtEspecifiqueP19.setBackgroundResource(R.drawable.fondo_edit_text);
                    if(!comprobarSumaSpinner(spinnersP19Aux)){
                        sp5P19.setEnabled(true);
                        lytSp5P19.setBackgroundResource(R.drawable.fondo_spinner);
                    }
                }else{
                    edtEspecifiqueP19.setText("");
                    edtEspecifiqueP19.setBackgroundResource(R.drawable.cajas_de_texto_disabled);
                    edtEspecifiqueP19.setEnabled(false);
                    sp5P19.setSelection(0);
                    lytSp5P19.setBackgroundResource(R.drawable.fondo_spinner_disabled);
                    sp5P19.setEnabled(false);
                }
            }
        });


        final CheckBox[] checkBoxes5 = {ck1P18,ck2P18,ck3P18,ck4P18,ck5P18,ck6P18,ck7P18};
        final Spinner[] spinners3 = {sp1P18,sp2P18,sp3P18,sp4P18,sp5P18,sp6P18,sp7P18};
        final LinearLayout[] linearLayouts3 = {lytSp1P18,lytSp2P18,lytSp3P18,lytSp4P18,lytSp5P18,lytSp6P18,lytSp7P18};

        for (int i = 0; i <spinners3.length ; i++) {
            final Spinner spinner = spinners3[i];
            final int posicion = i;
            spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                    comprobarSpinner(spinner,spinners3,posicion);
                    deshabilitarSpinners(spinners3,checkBoxes5,linearLayouts3);
                }
                @Override
                public void onNothingSelected(AdapterView<?> adapterView) {}
            });
        }

        final CheckBox[] checkBoxes4 = {ck1P19,ck2P19,ck3P19,ck4P19,ck5P19};
        final Spinner[] spinners2 = {sp1P19,sp2P19,sp3P19,sp4P19,sp5P19};
        final LinearLayout[] linearLayouts2 = {lytSp1P19,lytSp2P19,lytSp3P19,lytSp4P19,lytSp5P19};
        for (int i = 0; i <spinners2.length ; i++) {
            final Spinner spinner = spinners2[i];
            final int posicion = i;
            spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                    comprobarSpinner(spinner,spinners2,posicion);
                    deshabilitarSpinners(spinners2,checkBoxes4,linearLayouts2);
                }
                @Override
                public void onNothingSelected(AdapterView<?> adapterView) {}
            });
        }

        edtEspecifiqueP19.setFilters(new InputFilter[]{new InputFilter.AllCaps()});
        cargarDatos();
    }



    public void ocultarTeclado(View view){
        InputMethodManager mgr = (InputMethodManager) getActivity().getSystemService(Context.INPUT_METHOD_SERVICE);
        mgr.hideSoftInputFromWindow(view.getWindowToken(), 0);
    }

    public void mostrarTeclado(){
        InputMethodManager imm = (InputMethodManager) getActivity().getSystemService(getActivity().INPUT_METHOD_SERVICE);
        imm.toggleSoftInput(InputMethodManager.SHOW_FORCED, 0);
    }

    public void cargarDatos(){
        data = new Data(context);
        data.open();
        modulo2 = data.getModulo2(idempresa);
        if(modulo2.getC2_P18_1_1().equals("1")){ck1P18.setChecked(true);sp1P18.setSelection(Integer.parseInt(modulo2.getC2_P18_2_1()));
        }else ck1P18.setChecked(false);
        if(modulo2.getC2_P18_1_2().equals("1")){ck2P18.setChecked(true);sp2P18.setSelection(Integer.parseInt(modulo2.getC2_P18_2_2()));
        }else ck2P18.setChecked(false);
        if(modulo2.getC2_P18_1_3().equals("1")){ck3P18.setChecked(true);sp3P18.setSelection(Integer.parseInt(modulo2.getC2_P18_2_3()));
        }else ck3P18.setChecked(false);
        if(modulo2.getC2_P18_1_4().equals("1")){ck4P18.setChecked(true);sp4P18.setSelection(Integer.parseInt(modulo2.getC2_P18_2_4()));
        }else ck4P18.setChecked(false);
        if(modulo2.getC2_P18_1_5().equals("1")){ck5P18.setChecked(true);sp5P18.setSelection(Integer.parseInt(modulo2.getC2_P18_2_5()));
        }else ck5P18.setChecked(false);
        if(modulo2.getC2_P18_1_6().equals("1")){ck6P18.setChecked(true);sp6P18.setSelection(Integer.parseInt(modulo2.getC2_P18_2_6()));
        }else ck6P18.setChecked(false);
        if(modulo2.getC2_P18_1_7().equals("1")){ck7P18.setChecked(true);sp7P18.setSelection(Integer.parseInt(modulo2.getC2_P18_2_7()));edtEspecifiqueP18.setText(modulo2.getC2_P18_1_7_0());
        }else ck7P18.setChecked(false);

        if(modulo2.getC2_P19_1_1().equals("1")){ck1P19.setChecked(true);sp1P19.setSelection(Integer.parseInt(modulo2.getC2_P19_2_1()));
        }else ck2P19.setChecked(false);
        if(modulo2.getC2_P19_1_2().equals("1")){ck2P19.setChecked(true);sp2P19.setSelection(Integer.parseInt(modulo2.getC2_P19_2_2()));
        }else ck2P19.setChecked(false);
        if(modulo2.getC2_P19_1_3().equals("1")){ck3P19.setChecked(true);sp3P19.setSelection(Integer.parseInt(modulo2.getC2_P19_2_3()));
        }else ck3P19.setChecked(false);
        if(modulo2.getC2_P19_1_4().equals("1")){ck4P19.setChecked(true);sp4P19.setSelection(Integer.parseInt(modulo2.getC2_P19_2_4()));
        }else ck4P19.setChecked(false);
        if(modulo2.getC2_P19_1_5().equals("1")){ck5P19.setChecked(true);sp5P19.setSelection(Integer.parseInt(modulo2.getC2_P19_2_5()));edtEspecifiqueP19.setText(modulo2.getC2_P19_1_5_0());
        }else ck5P19.setChecked(false);
        data.close();
    }
    public void llenarMapaVariables(){
        //p18
        if(ck1P18.isChecked())C2_P18_1_1 = 1;else C2_P18_1_1 = 0;
        if(ck2P18.isChecked())C2_P18_1_2 = 1;else C2_P18_1_2 = 0;
        if(ck3P18.isChecked())C2_P18_1_3 = 1;else C2_P18_1_3 = 0;
        if(ck4P18.isChecked())C2_P18_1_4 = 1;else C2_P18_1_4 = 0;
        if(ck5P18.isChecked())C2_P18_1_5 = 1;else C2_P18_1_5 = 0;
        if(ck6P18.isChecked())C2_P18_1_6 = 1;else C2_P18_1_6 = 0;
        if(ck7P18.isChecked())C2_P18_1_7 = 1;else C2_P18_1_7 = 0;
        C2_P18_2_1 = sp1P18.getSelectedItemPosition();
        C2_P18_2_2 = sp2P18.getSelectedItemPosition();
        C2_P18_2_3 = sp3P18.getSelectedItemPosition();
        C2_P18_2_4 = sp4P18.getSelectedItemPosition();
        C2_P18_2_5 = sp5P18.getSelectedItemPosition();
        C2_P18_2_6 = sp6P18.getSelectedItemPosition();
        C2_P18_2_7 = sp7P18.getSelectedItemPosition();
        C2_P18_1_7_0 = edtEspecifiqueP18.getText().toString();
        //p19
        if(ck1P19.isChecked())C2_P19_1_1 = 1;else C2_P19_1_1 = 0;
        if(ck2P19.isChecked())C2_P19_1_2 = 1;else C2_P19_1_2 = 0;
        if(ck3P19.isChecked())C2_P19_1_3 = 1;else C2_P19_1_3 = 0;
        if(ck4P19.isChecked())C2_P19_1_4 = 1;else C2_P19_1_4 = 0;
        if(ck5P19.isChecked())C2_P19_1_5 = 1;else C2_P19_1_5 = 0;
        C2_P19_2_1 = sp1P19.getSelectedItemPosition();
        C2_P19_2_2 = sp2P19.getSelectedItemPosition();
        C2_P19_2_3 = sp3P19.getSelectedItemPosition();
        C2_P19_2_4 = sp4P19.getSelectedItemPosition();
        C2_P19_2_5 = sp5P19.getSelectedItemPosition();
        C2_P19_1_5_0 = edtEspecifiqueP19.getText().toString();
    }
    public void guardarDatos(){
        data = new Data(context);
        data.open();
        ContentValues contentValues = new ContentValues(163);
        contentValues.put(SQLConstantes.MODULO2_P18_1_1,C2_P18_1_1+"");
        contentValues.put(SQLConstantes.MODULO2_P18_1_2,C2_P18_1_2+"");
        contentValues.put(SQLConstantes.MODULO2_P18_1_3,C2_P18_1_3+"");
        contentValues.put(SQLConstantes.MODULO2_P18_1_4,C2_P18_1_4+"");
        contentValues.put(SQLConstantes.MODULO2_P18_1_5,C2_P18_1_5+"");
        contentValues.put(SQLConstantes.MODULO2_P18_1_6,C2_P18_1_6+"");
        contentValues.put(SQLConstantes.MODULO2_P18_1_7,C2_P18_1_7+"");
        contentValues.put(SQLConstantes.MODULO2_P18_1_7_0,C2_P18_1_7_0);
        contentValues.put(SQLConstantes.MODULO2_P18_2_1,C2_P18_2_1+"");
        contentValues.put(SQLConstantes.MODULO2_P18_2_2,C2_P18_2_2+"");
        contentValues.put(SQLConstantes.MODULO2_P18_2_3,C2_P18_2_3+"");
        contentValues.put(SQLConstantes.MODULO2_P18_2_4,C2_P18_2_4+"");
        contentValues.put(SQLConstantes.MODULO2_P18_2_5,C2_P18_2_5+"");
        contentValues.put(SQLConstantes.MODULO2_P18_2_6,C2_P18_2_6+"");
        contentValues.put(SQLConstantes.MODULO2_P18_2_7,C2_P18_2_7+"");
        contentValues.put(SQLConstantes.MODULO2_P19_1_1,C2_P19_1_1+"");
        contentValues.put(SQLConstantes.MODULO2_P19_1_2,C2_P19_1_2+"");
        contentValues.put(SQLConstantes.MODULO2_P19_1_3,C2_P19_1_3+"");
        contentValues.put(SQLConstantes.MODULO2_P19_1_4,C2_P19_1_4+"");
        contentValues.put(SQLConstantes.MODULO2_P19_1_5,C2_P19_1_5+"");
        contentValues.put(SQLConstantes.MODULO2_P19_1_5_0,C2_P19_1_5_0);
        contentValues.put(SQLConstantes.MODULO2_P19_2_1,C2_P19_2_1+"");
        contentValues.put(SQLConstantes.MODULO2_P19_2_2,C2_P19_2_2+"");
        contentValues.put(SQLConstantes.MODULO2_P19_2_3,C2_P19_2_3+"");
        contentValues.put(SQLConstantes.MODULO2_P19_2_4,C2_P19_2_4+"");
        contentValues.put(SQLConstantes.MODULO2_P19_2_5,C2_P19_2_5+"");
        data.actualizarModulo2(idempresa,contentValues);
        data.close();
    }
    public void deshabilitarSpinners(Spinner[] spinners, CheckBox[] checkBoxes,LinearLayout[] linearLayouts){
        int suma = 0;
        for (int i = 0; i <spinners.length ; i++) {
            suma = suma + spinners[i].getSelectedItemPosition();
        }
        if(suma == 3){
            for (int i = 0; i <spinners.length ; i++) {
                if(spinners[i].getSelectedItemPosition() == 0){
                    spinners[i].setEnabled(false);
                    linearLayouts[i].setBackgroundResource(R.drawable.fondo_spinner_disabled);
                }
            }
        }else{
            for (int i = 0; i <spinners.length ; i++) {
                if(checkBoxes[i].isChecked()){
                    spinners[i].setEnabled(true);
                    linearLayouts[i].setBackgroundResource(R.drawable.fondo_spinner);
                }
            }
        }
    }

    public boolean comprobarSumaSpinner(Spinner[] spinners){
        boolean correcto = false;
        int suma = 0;
        for (int i = 0; i <spinners.length ; i++) {
            suma = suma + spinners[i].getSelectedItemPosition();
        }
        if(suma == 3) correcto = true;
        return correcto;
    }
    public void comprobarSpinner(Spinner spinner, Spinner[] spinners, int sp){
        int seleccion = spinner.getSelectedItemPosition();
        for (int i = 0; i <spinners.length ; i++) {
            if(i != sp && seleccion != 0 && spinners[i].getSelectedItemPosition() == seleccion){
                spinner.setSelection(0);
                Toast.makeText(context, "NO PUEDE HABER DOS OPCIONES CON EL MISMO ORDEN DE IMPORTANCIA", Toast.LENGTH_SHORT).show();
            }
        }
    }

    public boolean validar(){
        boolean valido = false;
        llenarMapaVariables();
        String mensaje="";
        boolean
                vC2_P18_1_1=false,
        vC2_P18_1_2=false,
        vC2_P18_1_3=false,
        vC2_P18_1_4=false,
        vC2_P18_1_5=false,
        vC2_P18_1_6=false,
        vC2_P18_1_7=false,
        vC2_P18_1_7_0=false,
        vC2_P18_2_1=false,
        vC2_P18_2_2=false,
        vC2_P18_2_3=false,
        vC2_P18_2_4=false,
        vC2_P18_2_5=false,
        vC2_P18_2_6=false,
        vC2_P18_2_7=false,
        vC2_P19_1_1=false,
        vC2_P19_1_2=false,
        vC2_P19_1_3=false,
        vC2_P19_1_4=false,
        vC2_P19_1_5=false,
        vC2_P19_1_5_0=false,
        vC2_P19_2_1=false,
        vC2_P19_2_2=false,
        vC2_P19_2_3=false,
        vC2_P19_2_4=false,
        vC2_P19_2_5=false;

        if(C2_P18_1_1 == 1 ||C2_P18_1_2 == 1 ||C2_P18_1_3 == 1 ||C2_P18_1_4 == 1 ||C2_P18_1_5 == 1 ||C2_P18_1_6 == 1 ||C2_P18_1_7 == 1) {
            vC2_P18_1_1 = true;vC2_P18_1_2 = true;vC2_P18_1_3 = true;vC2_P18_1_4 = true;vC2_P18_1_5 = true;vC2_P18_1_6 = true;vC2_P18_1_7 = true;
        }else if(mensaje.equals(""))mensaje = "PREGUNTA 18: DEBE MARCAR UNA OPCION";
        if((C2_P18_1_1 + C2_P18_1_2 + C2_P18_1_3 + C2_P18_1_4 + C2_P18_1_5 + C2_P18_1_6 + C2_P18_1_7) == 1){
            if((C2_P18_2_1 + C2_P18_2_2 + C2_P18_2_3 + C2_P18_2_4 + C2_P18_2_5 + C2_P18_2_6 + C2_P18_2_7) == 1){
                vC2_P18_2_1=true;vC2_P18_2_2=true;vC2_P18_2_3=true;vC2_P18_2_4=true;vC2_P18_2_5=true;vC2_P18_2_6=true;vC2_P18_2_7=true;
            }else if(mensaje.equals(""))mensaje = "PREGUNTA 18: SI SELECCIONO SOLO UNA OPCION, DEBE ASIGNAR 1 PARA EL ORDEN DE IMPORTANCIA DE LAS RAZONES";
        }else {
            if((C2_P18_2_1 + C2_P18_2_2 + C2_P18_2_3 + C2_P18_2_4 + C2_P18_2_5 + C2_P18_2_6 + C2_P18_2_7) == 3){
                vC2_P18_2_1=true;vC2_P18_2_2=true;vC2_P18_2_3=true;vC2_P18_2_4=true;vC2_P18_2_5=true;vC2_P18_2_6=true;vC2_P18_2_7=true;
            }else if(mensaje.equals(""))mensaje = "PREGUNTA 18: DEBE ELEGIR 1 O 2 SEGUN EL ORDEN DE IMPORTANCIA";
        }
        if(edtEspecifiqueP18.isEnabled()){
            if(C2_P18_1_7_0.trim().length() != 0) vC2_P18_1_7_0 = true;
            else if(mensaje.equals(""))mensaje = "PREGUNTA 18: DEBE ESPECIFICAR SI MARCO OTRO";
        }else vC2_P18_1_7_0=true;

        if(C2_P19_1_1 == 1 ||C2_P19_1_2 == 1 ||C2_P19_1_3 == 1 ||C2_P19_1_4 == 1 ||C2_P19_1_5 == 1) {
            vC2_P19_1_1 = true;vC2_P19_1_2 = true;vC2_P19_1_3 = true;vC2_P19_1_4 = true;vC2_P19_1_5=true;
        }else if(mensaje.equals(""))mensaje = "PREGUNTA 19: DEBE MARCAR UNA OPCION";

        if((C2_P19_1_1 + C2_P19_1_2 + C2_P19_1_3 + C2_P19_1_4 + C2_P19_1_5) == 1){
            if((C2_P19_2_1 + C2_P19_2_2 + C2_P19_2_3 + C2_P19_2_4 + C2_P19_2_5) == 1){
                vC2_P19_2_1=true;vC2_P19_2_2=true;vC2_P19_2_3=true;vC2_P19_2_4=true;vC2_P19_2_5=true;
            }else if(mensaje.equals(""))mensaje = "PREGUNTA 19: SI SELECCIONO SOLO UNA OPCION, DEBE ASIGNAR 1 PARA EL ORDEN DE IMPORTANCIA DE LAS RAZONES";
        }else {
            if((C2_P19_2_1 + C2_P19_2_2 + C2_P19_2_3 + C2_P19_2_4 + C2_P19_2_5) == 3){
                vC2_P19_2_1=true;vC2_P19_2_2=true;vC2_P19_2_3=true;vC2_P19_2_4=true;vC2_P19_2_5=true;
            }else if(mensaje.equals(""))mensaje = "PREGUNTA 19: DEBE ELEGIR 1 O 2 SEGUN EL ORDEN DE IMPORTANCIA";
        }

        if(edtEspecifiqueP19.isEnabled()){
            if(C2_P19_1_5_0.trim().length() != 0) vC2_P19_1_5_0 = true;
            else if(mensaje.equals(""))mensaje = "PREGUNTA 19: DEBE ESPECIFICAR SI MARCO OTRO";
        }else vC2_P19_1_5_0=true;

        valido = vC2_P18_1_1 && vC2_P18_1_2 && vC2_P18_1_3 && vC2_P18_1_4 && vC2_P18_1_5 && vC2_P18_1_6 &&
                vC2_P18_1_7 && vC2_P18_1_7_0 && vC2_P18_2_1 && vC2_P18_2_2 && vC2_P18_2_3 && vC2_P18_2_4 &&
                vC2_P18_2_5 && vC2_P18_2_6 && vC2_P18_2_7 && vC2_P19_1_1 && vC2_P19_1_2 && vC2_P19_1_3 &&
                vC2_P19_1_4 && vC2_P19_1_5 && vC2_P19_1_5_0 && vC2_P19_2_1 && vC2_P19_2_2 && vC2_P19_2_3 &&
                vC2_P19_2_4 && vC2_P19_2_5;

        if(!valido) {
           mostrarMensaje(mensaje);
            Log.e("vC2_P18_1_1:",vC2_P18_1_1 + "");
            Log.e("vC2_P18_1_2:",vC2_P18_1_2 + "");
            Log.e("vC2_P18_1_3:",vC2_P18_1_3 + "");
            Log.e("vC2_P18_1_4:",vC2_P18_1_4 + "");
            Log.e("vC2_P18_1_5:",vC2_P18_1_5 + "");
            Log.e("vC2_P18_1_6:",vC2_P18_1_6 + "");
            Log.e("vC2_P18_1_7:",vC2_P18_1_7 + "");
            Log.e("vC2_P18_1_7_0:",vC2_P18_1_7_0 + "");
            Log.e("vC2_P18_2_1:",vC2_P18_2_1 + "");
            Log.e("vC2_P18_2_2:",vC2_P18_2_2 + "");
            Log.e("vC2_P18_2_3:",vC2_P18_2_3 + "");
            Log.e("vC2_P18_2_4:",vC2_P18_2_4 + "");
            Log.e("vC2_P18_2_5:",vC2_P18_2_5 + "");
            Log.e("vC2_P18_2_6:",vC2_P18_2_6 + "");
            Log.e("vC2_P18_2_7:",vC2_P18_2_7 + "");
            Log.e("vC2_P19_1_1:",vC2_P19_1_1 + "");
            Log.e("vC2_P19_1_2:",vC2_P19_1_2 + "");
            Log.e("vC2_P19_1_3:",vC2_P19_1_3 + "");
            Log.e("vC2_P19_1_4:",vC2_P19_1_4 + "");
            Log.e("vC2_P19_1_5:",vC2_P19_1_5 + "");
            Log.e("vC2_P19_1_5_0:",vC2_P19_1_5_0 + "");
            Log.e("vC2_P19_2_1:",vC2_P19_2_1 + "");
            Log.e("vC2_P19_2_2:",vC2_P19_2_2 + "");
            Log.e("vC2_P19_2_3:",vC2_P19_2_3 + "");
            Log.e("vC2_P19_2_4:",vC2_P19_2_4 + "");
            Log.e("vC2_P19_2_5:",vC2_P19_2_5 + "");
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
