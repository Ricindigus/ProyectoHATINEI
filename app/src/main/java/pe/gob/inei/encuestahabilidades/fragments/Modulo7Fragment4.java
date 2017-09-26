package pe.gob.inei.encuestahabilidades.fragments;


import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Bundle;
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
import android.widget.Button;
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
import pe.gob.inei.encuestahabilidades.pojos.Modulo7;

/**
 * A simple {@link Fragment} subclass.
 */
public class Modulo7Fragment4 extends Fragment {

    //PREGUNTA 9
    private CheckBox mod7_p9_ck1;
    private CheckBox mod7_p9_ck2;
    private CheckBox mod7_p9_ck3;
    private CheckBox mod7_p9_ck4;
    private CheckBox mod7_p9_ck5;
    private CheckBox mod7_p9_ck6;
    private CheckBox mod7_p9_ck7;
    private CheckBox mod7_p9_ck8;
    private CheckBox mod7_p9_ck9;
    private CheckBox mod7_p9_ck10;
    private CheckBox mod7_p9_ck11;
    private CheckBox mod7_p9_ck12;
    private CheckBox mod7_p9_ck13;
    private CheckBox mod7_p9_ck14;
    private CheckBox mod7_p9_ck15;
    private CheckBox mod7_p9_ck16;
    private CheckBox mod7_p9_ck17;
    private CheckBox mod7_p9_ck18;
    private CheckBox mod7_p9_ck19;
    private CheckBox mod7_p9_ck20;
    private LinearLayout mod7_p9_ly;
    private LinearLayout mod7_p9_ly1;
    private LinearLayout mod7_p9_ly2;
    private LinearLayout mod7_p9_ly3;
    private LinearLayout mod7_p9_ly4;
    private LinearLayout mod7_p9_ly5;
    private LinearLayout mod7_p9_ly6;
    private LinearLayout mod7_p9_ly7;
    private LinearLayout mod7_p9_ly8;
    private LinearLayout mod7_p9_ly9;
    private LinearLayout mod7_p9_ly10;
    private LinearLayout mod7_p9_ly11;
    private LinearLayout mod7_p9_ly12;
    private LinearLayout mod7_p9_ly13;
    private LinearLayout mod7_p9_ly14;
    private LinearLayout mod7_p9_ly15;
    private LinearLayout mod7_p9_ly16;
    private LinearLayout mod7_p9_ly17;
    private LinearLayout mod7_p9_ly18;
    private LinearLayout mod7_p9_ly19;
    private Spinner mod7_p9_sp1;
    private Spinner mod7_p9_sp2;
    private Spinner mod7_p9_sp3;
    private Spinner mod7_p9_sp4;
    private Spinner mod7_p9_sp5;
    private Spinner mod7_p9_sp6;
    private Spinner mod7_p9_sp7;
    private Spinner mod7_p9_sp8;
    private Spinner mod7_p9_sp9;
    private Spinner mod7_p9_sp10;
    private Spinner mod7_p9_sp11;
    private Spinner mod7_p9_sp12;
    private Spinner mod7_p9_sp13;
    private Spinner mod7_p9_sp14;
    private Spinner mod7_p9_sp15;
    private Spinner mod7_p9_sp16;
    private Spinner mod7_p9_sp17;
    private Spinner mod7_p9_sp18;
    private Spinner mod7_p9_sp19;


    private EditText mod7_p9_edt19;


    private String idempresa;
    private Modulo7 MODULO7;
    private Context context;
    private Data data;

    //mapeo de variables
    int C7_P9_1_1 ;
    int C7_P9_1_2 ;
    int C7_P9_1_3  ;
    int C7_P9_1_4  ;
    int C7_P9_1_5 ;
    int C7_P9_1_6 ;
    int C7_P9_1_7 ;
    int C7_P9_1_8 ;
    int C7_P9_1_9  ;
    int C7_P9_1_10  ;
    int C7_P9_1_11  ;
    int C7_P9_1_12 ;
    int C7_P9_1_13  ;
    int C7_P9_1_14 ;
    int C7_P9_1_15  ;
    int C7_P9_1_16  ;
    int C7_P9_1_17  ;
    int C7_P9_1_18 ;
    int C7_P9_1_19  ;
    int C7_P9_1_20 ;
    String C7_P9_1_19_0  ;
    int C7_P9_2_1 ;
    int C7_P9_2_2  ;
    int C7_P9_2_3  ;
    int C7_P9_2_4 ;
    int C7_P9_2_5 ;
    int C7_P9_2_6 ;
    int C7_P9_2_7  ;
    int C7_P9_2_8 ;
    int C7_P9_2_9 ;
    int C7_P9_2_10 ;
    int C7_P9_2_11  ;
    int C7_P9_2_12 ;
    int C7_P9_2_13 ;
    int C7_P9_2_14;
    int C7_P9_2_15  ;
    int C7_P9_2_16 ;
    int C7_P9_2_17 ;
    int C7_P9_2_18  ;
    int C7_P9_2_19  ;

    @SuppressLint("ValidFragment")
    public Modulo7Fragment4(String idempresa, Context context) {
        this.idempresa = idempresa;
        this.context = context;
    }

    public Modulo7Fragment4() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_modulo7_fragment4, container, false);
        //PREGUNTA 9
        mod7_p9_ck1 = (CheckBox) rootView.findViewById(R.id.mod7_p9_ck1);
        mod7_p9_ck2 = (CheckBox) rootView.findViewById(R.id.mod7_p9_ck2);
        mod7_p9_ck3 = (CheckBox) rootView.findViewById(R.id.mod7_p9_ck3);
        mod7_p9_ck4 = (CheckBox) rootView.findViewById(R.id.mod7_p9_ck4);
        mod7_p9_ck5 = (CheckBox) rootView.findViewById(R.id.mod7_p9_ck5);
        mod7_p9_ck6 = (CheckBox) rootView.findViewById(R.id.mod7_p9_ck6);
        mod7_p9_ck7 = (CheckBox) rootView.findViewById(R.id.mod7_p9_ck7);
        mod7_p9_ck8 = (CheckBox) rootView.findViewById(R.id.mod7_p9_ck8);
        mod7_p9_ck9 = (CheckBox) rootView.findViewById(R.id.mod7_p9_ck9);
        mod7_p9_ck10 = (CheckBox) rootView.findViewById(R.id.mod7_p9_ck10);
        mod7_p9_ck11 = (CheckBox) rootView.findViewById(R.id.mod7_p9_ck11);
        mod7_p9_ck12 = (CheckBox) rootView.findViewById(R.id.mod7_p9_ck12);
        mod7_p9_ck13 = (CheckBox) rootView.findViewById(R.id.mod7_p9_ck13);
        mod7_p9_ck14 = (CheckBox) rootView.findViewById(R.id.mod7_p9_ck14);
        mod7_p9_ck15 = (CheckBox) rootView.findViewById(R.id.mod7_p9_ck15);
        mod7_p9_ck16 = (CheckBox) rootView.findViewById(R.id.mod7_p9_ck16);
        mod7_p9_ck17 = (CheckBox) rootView.findViewById(R.id.mod7_p9_ck17);
        mod7_p9_ck18 = (CheckBox) rootView.findViewById(R.id.mod7_p9_ck18);
        mod7_p9_ck19 = (CheckBox) rootView.findViewById(R.id.mod7_p9_ck19);
        mod7_p9_ck20 = (CheckBox) rootView.findViewById(R.id.mod7_p9_ck20);
        mod7_p9_ly = (LinearLayout) rootView.findViewById(R.id.mod7_p9_ly);
        mod7_p9_ly1 = (LinearLayout) rootView.findViewById(R.id.mod7_p9_ly1);
        mod7_p9_ly2 = (LinearLayout) rootView.findViewById(R.id.mod7_p9_ly2);
        mod7_p9_ly3 = (LinearLayout) rootView.findViewById(R.id.mod7_p9_ly3);
        mod7_p9_ly4 = (LinearLayout) rootView.findViewById(R.id.mod7_p9_ly4);
        mod7_p9_ly5 = (LinearLayout) rootView.findViewById(R.id.mod7_p9_ly5);
        mod7_p9_ly6 = (LinearLayout) rootView.findViewById(R.id.mod7_p9_ly6);
        mod7_p9_ly7 = (LinearLayout) rootView.findViewById(R.id.mod7_p9_ly7);
        mod7_p9_ly8 = (LinearLayout) rootView.findViewById(R.id.mod7_p9_ly8);
        mod7_p9_ly9 = (LinearLayout) rootView.findViewById(R.id.mod7_p9_ly9);
        mod7_p9_ly10 = (LinearLayout) rootView.findViewById(R.id.mod7_p9_ly10);
        mod7_p9_ly11 = (LinearLayout) rootView.findViewById(R.id.mod7_p9_ly11);
        mod7_p9_ly12 = (LinearLayout) rootView.findViewById(R.id.mod7_p9_ly12);
        mod7_p9_ly13 = (LinearLayout) rootView.findViewById(R.id.mod7_p9_ly13);
        mod7_p9_ly14 = (LinearLayout) rootView.findViewById(R.id.mod7_p9_ly14);
        mod7_p9_ly15 = (LinearLayout) rootView.findViewById(R.id.mod7_p9_ly15);
        mod7_p9_ly16 = (LinearLayout) rootView.findViewById(R.id.mod7_p9_ly16);
        mod7_p9_ly17 = (LinearLayout) rootView.findViewById(R.id.mod7_p9_ly17);
        mod7_p9_ly18 = (LinearLayout) rootView.findViewById(R.id.mod7_p9_ly18);
        mod7_p9_ly19 = (LinearLayout) rootView.findViewById(R.id.mod7_p9_ly19);


        mod7_p9_sp1 = (Spinner) rootView.findViewById(R.id.mod7_p9_sp1);
        mod7_p9_sp2 = (Spinner) rootView.findViewById(R.id.mod7_p9_sp2);
        mod7_p9_sp3 = (Spinner) rootView.findViewById(R.id.mod7_p9_sp3);
        mod7_p9_sp4 = (Spinner) rootView.findViewById(R.id.mod7_p9_sp4);
        mod7_p9_sp5 = (Spinner) rootView.findViewById(R.id.mod7_p9_sp5);
        mod7_p9_sp6 = (Spinner) rootView.findViewById(R.id.mod7_p9_sp6);
        mod7_p9_sp7 = (Spinner) rootView.findViewById(R.id.mod7_p9_sp7);
        mod7_p9_sp8 = (Spinner) rootView.findViewById(R.id.mod7_p9_sp8);
        mod7_p9_sp9 = (Spinner) rootView.findViewById(R.id.mod7_p9_sp9);
        mod7_p9_sp10 = (Spinner) rootView.findViewById(R.id.mod7_p9_sp10);
        mod7_p9_sp11 = (Spinner) rootView.findViewById(R.id.mod7_p9_sp11);
        mod7_p9_sp12 = (Spinner) rootView.findViewById(R.id.mod7_p9_sp12);
        mod7_p9_sp13 = (Spinner) rootView.findViewById(R.id.mod7_p9_sp13);
        mod7_p9_sp14 = (Spinner) rootView.findViewById(R.id.mod7_p9_sp14);
        mod7_p9_sp15 = (Spinner) rootView.findViewById(R.id.mod7_p9_sp15);
        mod7_p9_sp16 = (Spinner) rootView.findViewById(R.id.mod7_p9_sp16);
        mod7_p9_sp17 = (Spinner) rootView.findViewById(R.id.mod7_p9_sp17);
        mod7_p9_sp18 = (Spinner) rootView.findViewById(R.id.mod7_p9_sp18);
        mod7_p9_sp19 = (Spinner) rootView.findViewById(R.id.mod7_p9_sp19);


        mod7_p9_edt19 = (EditText) rootView.findViewById(R.id.mod7_p9_edt19);

        return rootView;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        mod7_p9_ck1.requestFocus();

        final CheckBox[] listacheckP9 ={mod7_p9_ck1,mod7_p9_ck2,mod7_p9_ck3,mod7_p9_ck4,
                mod7_p9_ck5,mod7_p9_ck6,mod7_p9_ck7,mod7_p9_ck8,mod7_p9_ck9,mod7_p9_ck10,
                mod7_p9_ck11,mod7_p9_ck12,mod7_p9_ck13,mod7_p9_ck14
                ,mod7_p9_ck15,mod7_p9_ck16,mod7_p9_ck17,mod7_p9_ck18,mod7_p9_ck19};

        final Spinner[] listaspinnerP9 ={mod7_p9_sp1,mod7_p9_sp2,mod7_p9_sp3,mod7_p9_sp4,
                mod7_p9_sp5,mod7_p9_sp6,mod7_p9_sp7,mod7_p9_sp8,mod7_p9_sp9,
                mod7_p9_sp10,mod7_p9_sp11,mod7_p9_sp12,mod7_p9_sp13,mod7_p9_sp14
                ,mod7_p9_sp15,mod7_p9_sp16,mod7_p9_sp17,mod7_p9_sp18,mod7_p9_sp19};

        final LinearLayout[] listasLinearlayoutP9 ={mod7_p9_ly1,mod7_p9_ly2,mod7_p9_ly3,mod7_p9_ly4,
                mod7_p9_ly5,mod7_p9_ly6,mod7_p9_ly7,mod7_p9_ly8,mod7_p9_ly9,
                mod7_p9_ly10,mod7_p9_ly11,mod7_p9_ly12,mod7_p9_ly13,mod7_p9_ly14
                ,mod7_p9_ly15,mod7_p9_ly16,mod7_p9_ly17,mod7_p9_ly18,mod7_p9_ly19};

        //SELECCION DE  SPINNER
        for(int i = 0; i <listacheckP9.length ; i++) {
            final int posicion = 1;
            CheckBox checkBox = listacheckP9[i];
            listaspinnerP9[i].setEnabled(false);
            listasLinearlayoutP9[i].setBackgroundResource(R.drawable.fondo_spinner_disabled);
            if(i!=18){
                final Spinner spinner = listaspinnerP9[i];
                final LinearLayout linearLayout = listasLinearlayoutP9[i];
                checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if(b){
                            if(verificarCheck(listaspinnerP9)){
                                spinner.setEnabled(false);
                                linearLayout.setBackgroundResource(R.drawable.fondo_spinner_disabled);
                            }else{
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
        }

        for (int i = 0; i <listaspinnerP9.length ; i++) {
            final int posicion= i;
            final Spinner spinner = listaspinnerP9[i];
            spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> adapterView, View view, int pos, long l) {
                    switch (pos){
                        case 0: restaurarSpinner(listacheckP9,listaspinnerP9,listasLinearlayoutP9);break;
                        case 1: validarSpiner(listaspinnerP9,listasLinearlayoutP9,posicion,1); break;
                        case 2: validarSpiner(listaspinnerP9,listasLinearlayoutP9,posicion,2); break;
                        case 3: validarSpiner(listaspinnerP9,listasLinearlayoutP9,posicion,3); break;
                    }
                }
                @Override
                public void onNothingSelected(AdapterView<?> adapterView) {}
            });
        }

        if(!mod7_p9_ck19.isChecked()){
            mod7_p9_edt19.setText("");
            mod7_p9_edt19.setBackgroundResource(R.drawable.cajas_de_texto_disabled);
            mod7_p9_edt19.setEnabled(false);
            mod7_p9_sp19.setSelection(0);
            mod7_p9_ly19.setBackgroundResource(R.drawable.fondo_spinner_disabled);
            mod7_p9_sp19.setEnabled(false);
        }
        mod7_p9_edt19.setFilters(new InputFilter[]{new InputFilter.AllCaps()});
        mod7_p9_ck19.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    mod7_p9_edt19.setEnabled(true);
                    mod7_p9_edt19.setBackgroundResource(R.drawable.fondo_edit_text);
                    if(verificarCheck(listaspinnerP9)){
                        mod7_p9_sp19.setEnabled(false);
                        mod7_p9_ly19.setBackgroundResource(R.drawable.fondo_spinner_disabled);
                    }else{
                        mod7_p9_sp19.setEnabled(true);
                        mod7_p9_ly19.setBackgroundResource(R.drawable.fondo_spinner);
                    }
                }else{
                    mod7_p9_edt19.setText("");
                    mod7_p9_edt19.setBackgroundResource(R.drawable.cajas_de_texto_disabled);
                    mod7_p9_edt19.setEnabled(false);
                    mod7_p9_sp19.setSelection(0);
                    mod7_p9_ly19.setBackgroundResource(R.drawable.fondo_spinner_disabled);
                    mod7_p9_sp19.setEnabled(false);
                }
            }
        });

        cargarDatos();

        if(mod7_p9_ck20.isChecked()){
            for ( CheckBox c:listacheckP9 ) {
                c.setChecked(false);c.setEnabled(false);c.setTextColor(Color.LTGRAY);
            }
        }

        alertaCheckLimpiar(mod7_p9_ck20,listacheckP9);
    }

    public void alertaCheckLimpiar(final CheckBox check, final CheckBox[] listaCheck){
        check.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, final boolean b ) {
                if(b){
                    AlertDialog.Builder alert = new AlertDialog.Builder(getActivity());
                    final View dialogView = getActivity().getLayoutInflater().inflate(R.layout.dialog_alerta, null);
                    final LinearLayout lytDialog = (LinearLayout) dialogView.findViewById(R.id.dialog_visita_lyt);
                    alert.setTitle("ALERTA");
                    alert.setView(dialogView);
                    alert.setPositiveButton("OK",null);
                    alert.setNegativeButton("Cancelar",null);
                    final AlertDialog alertDialog = alert.create();
                    alertDialog.setOnShowListener(new DialogInterface.OnShowListener() {
                        @Override
                        public void onShow(DialogInterface dialogInterface) {
                            Button ok = alertDialog.getButton(AlertDialog.BUTTON_POSITIVE);
                            Button cancelar = alertDialog.getButton(AlertDialog.BUTTON_NEGATIVE);
                            ok.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    if(check.isChecked()){
                                        for (CheckBox c: listaCheck){
                                            if(c!=check){
                                                c.setChecked(false);c.setEnabled(false);c.setTextColor(Color.LTGRAY);
                                            }
                                        }
                                    }
                                    alertDialog.dismiss();
                                }

                            });
                            cancelar.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    if(check.isChecked()){
                                        check.setChecked(false);
                                        for (CheckBox c: listaCheck){
                                            if(c!=check) {
                                                c.setEnabled(true);
                                                c.setTextColor(Color.BLACK);
                                            }
                                        }
                                    }
                                    alertDialog.dismiss();
                                }
                            });
                        }
                    });
                    alertDialog.show();
                }else{
                    for (CheckBox c: listaCheck){
                        c.setEnabled(true);c.setTextColor(Color.BLACK);
                    }
                }
            }

        });
    }


    public void validarSpiner(Spinner[] spinners, LinearLayout[] layoutSpinners,int posicion, int valor){
        List<Spinner> sLista= new ArrayList<Spinner>();
        for(int i = 0; i <spinners.length ; i++) {
            Spinner spinner = spinners[i];
            if(spinner.getSelectedItemPosition()!=0){
                sLista.add(spinner);
                if(i!=posicion){
                    if(Integer.parseInt(spinner.getSelectedItem().toString()) == valor){
                        spinners[posicion].setSelection(0);
                        if(valor == 1){
                            Toast.makeText(getActivity().getApplicationContext(),
                                    "No puede dos habilidades que indiquen 1 como más importante",Toast.LENGTH_SHORT).show();
                        }else if(valor == 2){
                            Toast.makeText(getActivity().getApplicationContext(),
                                    "No puede dos habilidades que indiquen 2 como el segundo más importante",Toast.LENGTH_SHORT).show();
                        }else if(valor == 3) {
                            Toast.makeText(getActivity().getApplicationContext(),
                                    "No puede dos habilidades que indiquen 3 como el tercer más importante",Toast.LENGTH_SHORT).show();
                        }
                    }
                }
                if(sLista.size() == 3){
                    verificarSpiner(spinners,layoutSpinners);
                }
            }
        }
    }

    public void verificarSpiner(Spinner[] spinners, LinearLayout[] layoutSpinners){
        for(int i = 0; i <spinners.length ; i++) {
            Spinner spn = spinners[i];
            if(spn.getSelectedItemPosition()==0){
                spn.setEnabled(false);
                layoutSpinners[i].setBackgroundResource(R.drawable.fondo_spinner_disabled);
            }
        }
    }

    public void restaurarSpinner(CheckBox[] checkBoxes, Spinner[] spinners, LinearLayout[] layoutSpinners){
        for(int i = 0; i <checkBoxes.length ; i++) {
            CheckBox checkBox = checkBoxes[i];
            final Spinner spinner = spinners[i];
            final LinearLayout linearLayout = layoutSpinners[i];
            if(checkBox.isChecked()){
                spinner.setEnabled(true);
                linearLayout.setBackgroundResource(R.drawable.fondo_spinner);
            }
        }
    }

    public boolean verificarCheck(Spinner[] spinners){
        boolean t=false;
        List<Spinner> sLista= new ArrayList<Spinner>();
        for(int i = 0; i < spinners.length ; i++) {
            Spinner spn = spinners[i];
            if(spn.getSelectedItemPosition()!= 0){
                sLista.add(spn);
            }
        }
        if(sLista.size()==3) t=true;
        return t;
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
        if(data.existeModulo7(idempresa)) {
            //si existe traigo el objeto
            MODULO7 = data.getModulo7(idempresa);
            //saco los datos del objeto para llenarlos en los elementos del fragment
            //---------Pregunta 9-------------
            //Pregunta 9.1
            if (MODULO7.getC7_P9_1_1().equals("1")) mod7_p9_ck1.setChecked(true);
            if (MODULO7.getC7_P9_1_1().equals("0")) mod7_p9_ck1.setChecked(false);
            if (!MODULO7.getC7_P9_2_1().equals("")) {
                mod7_p9_sp1.setSelection(Integer.parseInt(MODULO7.getC7_P9_2_1()));
            }
            //Pregunta 9.2
            if (MODULO7.getC7_P9_1_2().equals("1")) mod7_p9_ck2.setChecked(true);
            if (MODULO7.getC7_P9_1_2().equals("0")) mod7_p9_ck2.setChecked(false);
            if (!MODULO7.getC7_P9_2_2().equals("")) {
                mod7_p9_sp2.setSelection(Integer.parseInt(MODULO7.getC7_P9_2_2()));
            }
            //Pregunta 9.3
            if (MODULO7.getC7_P9_1_3().equals("1")) mod7_p9_ck3.setChecked(true);
            if (MODULO7.getC7_P9_1_3().equals("0")) mod7_p9_ck3.setChecked(false);
            if (!MODULO7.getC7_P9_2_3().equals("")) {
                mod7_p9_sp3.setSelection(Integer.parseInt(MODULO7.getC7_P9_2_3()));
            }
            //Pregunta 9.4
            if (MODULO7.getC7_P9_1_4().equals("1")) mod7_p9_ck4.setChecked(true);
            if (MODULO7.getC7_P9_1_4().equals("0")) mod7_p9_ck4.setChecked(false);
            if (!MODULO7.getC7_P9_2_4().equals("")) {
                mod7_p9_sp4.setSelection(Integer.parseInt(MODULO7.getC7_P9_2_4()));
            }
            //Pregunta 9.5
            if (MODULO7.getC7_P9_1_5().equals("1")) mod7_p9_ck5.setChecked(true);
            if (MODULO7.getC7_P9_1_5().equals("0")) mod7_p9_ck5.setChecked(false);
            if (!MODULO7.getC7_P9_2_5().equals("")) {
                mod7_p9_sp5.setSelection(Integer.parseInt(MODULO7.getC7_P9_2_5()));
            }
            //Pregunta 9.6
            if (MODULO7.getC7_P9_1_6().equals("1")) mod7_p9_ck6.setChecked(true);
            if (MODULO7.getC7_P9_1_6().equals("0")) mod7_p9_ck6.setChecked(false);
            if (!MODULO7.getC7_P9_2_6().equals("")) {
                mod7_p9_sp6.setSelection(Integer.parseInt(MODULO7.getC7_P9_2_6()));
            }
            //Pregunta 9.7
            if (MODULO7.getC7_P9_1_7().equals("1")) mod7_p9_ck7.setChecked(true);
            if (MODULO7.getC7_P9_1_7().equals("0")) mod7_p9_ck7.setChecked(false);
            if (!MODULO7.getC7_P9_2_7().equals("")) {
                mod7_p9_sp7.setSelection(Integer.parseInt(MODULO7.getC7_P9_2_7()));
            }
            //Pregunta 9.8
            if (MODULO7.getC7_P9_1_8().equals("1")) mod7_p9_ck8.setChecked(true);
            if (MODULO7.getC7_P9_1_8().equals("0")) mod7_p9_ck8.setChecked(false);
            if (!MODULO7.getC7_P9_2_8().equals("")) {
                mod7_p9_sp8.setSelection(Integer.parseInt(MODULO7.getC7_P9_2_8()));
            }
            //Pregunta 9.9
            if (MODULO7.getC7_P9_1_9().equals("1")) mod7_p9_ck9.setChecked(true);
            if (MODULO7.getC7_P9_1_9().equals("0")) mod7_p9_ck9.setChecked(false);
            if (!MODULO7.getC7_P9_2_9().equals("")) {
                mod7_p9_sp9.setSelection(Integer.parseInt(MODULO7.getC7_P9_2_9()));
            }
            //Pregunta 9.10
            if (MODULO7.getC7_P9_1_10().equals("1")) mod7_p9_ck10.setChecked(true);
            if (MODULO7.getC7_P9_1_10().equals("0")) mod7_p9_ck10.setChecked(false);
            if (!MODULO7.getC7_P9_2_10().equals("")) {
                mod7_p9_sp10.setSelection(Integer.parseInt(MODULO7.getC7_P9_2_10()));
            }
            //Pregunta 9.11
            if (MODULO7.getC7_P9_1_11().equals("1")) mod7_p9_ck11.setChecked(true);
            if (MODULO7.getC7_P9_1_11().equals("0")) mod7_p9_ck11.setChecked(false);
            if (!MODULO7.getC7_P9_2_11().equals("")) {
                mod7_p9_sp11.setSelection(Integer.parseInt(MODULO7.getC7_P9_2_11()));
            }
            //Pregunta 9.12
            if (MODULO7.getC7_P9_1_12().equals("1")) mod7_p9_ck12.setChecked(true);
            if (MODULO7.getC7_P9_1_12().equals("0")) mod7_p9_ck12.setChecked(false);
            if (!MODULO7.getC7_P9_2_12().equals("")) {
                mod7_p9_sp12.setSelection(Integer.parseInt(MODULO7.getC7_P9_2_12()));
            }
            //Pregunta 9.13
            if (MODULO7.getC7_P9_1_13().equals("1")) mod7_p9_ck13.setChecked(true);
            if (MODULO7.getC7_P9_1_13().equals("0")) mod7_p9_ck13.setChecked(false);
            if (!MODULO7.getC7_P9_2_13().equals("")) {
                mod7_p9_sp13.setSelection(Integer.parseInt(MODULO7.getC7_P9_2_13()));
            }
            //Pregunta 9.14
            if (MODULO7.getC7_P9_1_14().equals("1")) mod7_p9_ck14.setChecked(true);
            if (MODULO7.getC7_P9_1_14().equals("0")) mod7_p9_ck14.setChecked(false);
            if (!MODULO7.getC7_P9_2_14().equals("")) {
                mod7_p9_sp14.setSelection(Integer.parseInt(MODULO7.getC7_P9_2_14()));
            }
            //Pregunta 9.15
            if (MODULO7.getC7_P9_1_15().equals("1")) mod7_p9_ck15.setChecked(true);
            if (MODULO7.getC7_P9_1_15().equals("0")) mod7_p9_ck15.setChecked(false);
            if (!MODULO7.getC7_P9_2_15().equals("")) {
                mod7_p9_sp15.setSelection(Integer.parseInt(MODULO7.getC7_P9_2_15()));
            }
            //Pregunta 9.16
            if (MODULO7.getC7_P9_1_16().equals("1")) mod7_p9_ck16.setChecked(true);
            if (MODULO7.getC7_P9_1_16().equals("0")) mod7_p9_ck16.setChecked(false);
            if (!MODULO7.getC7_P9_2_16().equals("")) {
                mod7_p9_sp16.setSelection(Integer.parseInt(MODULO7.getC7_P9_2_16()));
            }
            //Pregunta 9.17
            if (MODULO7.getC7_P9_1_17().equals("1")) mod7_p9_ck17.setChecked(true);
            if (MODULO7.getC7_P9_1_17().equals("0")) mod7_p9_ck17.setChecked(false);
            if (!MODULO7.getC7_P9_2_17().equals("")) {
                mod7_p9_sp17.setSelection(Integer.parseInt(MODULO7.getC7_P9_2_17()));
            }

            //Pregunta 9.18
            if (MODULO7.getC7_P9_1_18().equals("1")) mod7_p9_ck18.setChecked(true);
            if (MODULO7.getC7_P9_1_18().equals("0")) mod7_p9_ck18.setChecked(false);
            if (!MODULO7.getC7_P9_2_18().equals("")) {
                mod7_p9_sp18.setSelection(Integer.parseInt(MODULO7.getC7_P9_2_18()));
            }
            //Pregunta 9.19
            if (MODULO7.getC7_P9_1_19().equals("1")) mod7_p9_ck19.setChecked(true);
            if (MODULO7.getC7_P9_1_19().equals("0")) mod7_p9_ck19.setChecked(false);
            if (!MODULO7.getC7_P9_2_19().equals("")) {
                mod7_p9_sp19.setSelection(Integer.parseInt(MODULO7.getC7_P9_2_19()));
            }
            mod7_p9_edt19.setText(MODULO7.getC7_P8_1_19_0());

            if (MODULO7.getC7_P9_1_20().equals("1")) mod7_p9_ck20.setChecked(true);
            if (MODULO7.getC7_P9_1_20().equals("0")) mod7_p9_ck20.setChecked(false);

        }
        data.close();
    }


    public void guardarDatos(){
        data = new Data(context);
        data.open();
        if(data.existeModulo7(idempresa)){
            ContentValues contentValues = new ContentValues(255);
            contentValues.put(SQLConstantes.MODULO7_P9_1_1,C7_P9_1_1+"");
            contentValues.put(SQLConstantes.MODULO7_P9_1_2,C7_P9_1_2+"");
            contentValues.put(SQLConstantes.MODULO7_P9_1_3,C7_P9_1_3+"");
            contentValues.put(SQLConstantes.MODULO7_P9_1_4,C7_P9_1_4+"");
            contentValues.put(SQLConstantes.MODULO7_P9_1_5,C7_P9_1_5+"");
            contentValues.put(SQLConstantes.MODULO7_P9_1_6,C7_P9_1_6+"");
            contentValues.put(SQLConstantes.MODULO7_P9_1_7,C7_P9_1_7+"");
            contentValues.put(SQLConstantes.MODULO7_P9_1_8,C7_P9_1_8+"");
            contentValues.put(SQLConstantes.MODULO7_P9_1_9,C7_P9_1_9+"");
            contentValues.put(SQLConstantes.MODULO7_P9_1_10,C7_P9_1_10+"");
            contentValues.put(SQLConstantes.MODULO7_P9_1_11,C7_P9_1_11+"");
            contentValues.put(SQLConstantes.MODULO7_P9_1_12,C7_P9_1_12+"");
            contentValues.put(SQLConstantes.MODULO7_P9_1_13,C7_P9_1_13+"");
            contentValues.put(SQLConstantes.MODULO7_P9_1_14,C7_P9_1_14+"");
            contentValues.put(SQLConstantes.MODULO7_P9_1_15,C7_P9_1_15+"");
            contentValues.put(SQLConstantes.MODULO7_P9_1_16,C7_P9_1_16+"");
            contentValues.put(SQLConstantes.MODULO7_P9_1_17,C7_P9_1_17+"");
            contentValues.put(SQLConstantes.MODULO7_P9_1_18,C7_P9_1_18+"");
            contentValues.put(SQLConstantes.MODULO7_P9_1_19,C7_P9_1_19+"");
            contentValues.put(SQLConstantes.MODULO7_P8_1_19_0,C7_P9_1_19_0);
            contentValues.put(SQLConstantes.MODULO7_P9_1_20,C7_P9_1_20+"");
            contentValues.put(SQLConstantes.MODULO7_P9_2_1,C7_P9_2_1+"");
            contentValues.put(SQLConstantes.MODULO7_P9_2_2,C7_P9_2_2+"");
            contentValues.put(SQLConstantes.MODULO7_P9_2_3,C7_P9_2_3+"");
            contentValues.put(SQLConstantes.MODULO7_P9_2_4,C7_P9_2_4+"");
            contentValues.put(SQLConstantes.MODULO7_P9_2_5,C7_P9_2_5+"");
            contentValues.put(SQLConstantes.MODULO7_P9_2_6,C7_P9_2_6+"");
            contentValues.put(SQLConstantes.MODULO7_P9_2_7,C7_P9_2_7+"");
            contentValues.put(SQLConstantes.MODULO7_P9_2_8,C7_P9_2_8+"");
            contentValues.put(SQLConstantes.MODULO7_P9_2_9,C7_P9_2_9+"");
            contentValues.put(SQLConstantes.MODULO7_P9_2_10,C7_P9_2_10+"");
            contentValues.put(SQLConstantes.MODULO7_P9_2_11,C7_P9_2_11+"");
            contentValues.put(SQLConstantes.MODULO7_P9_2_12,C7_P9_2_12+"");
            contentValues.put(SQLConstantes.MODULO7_P9_2_13,C7_P9_2_13+"");
            contentValues.put(SQLConstantes.MODULO7_P9_2_14,C7_P9_2_14+"");
            contentValues.put(SQLConstantes.MODULO7_P9_2_15,C7_P9_2_15+"");
            contentValues.put(SQLConstantes.MODULO7_P9_2_16,C7_P9_2_16+"");
            contentValues.put(SQLConstantes.MODULO7_P9_2_17,C7_P9_2_17+"");
            contentValues.put(SQLConstantes.MODULO7_P9_2_18,C7_P9_2_18+"");
            contentValues.put(SQLConstantes.MODULO7_P9_2_19,C7_P9_2_19+"");
            data.actualizarModulo7(idempresa,contentValues);
        }else{
            //si no existe el elemento, lo construye para insertarlo
            MODULO7 = new Modulo7();
            //llena el objeto a insertar
            MODULO7.setMODULO7_ID(idempresa);
            MODULO7.setC7_P9_1_1(C7_P9_1_1+"");
            MODULO7.setC7_P9_1_2(C7_P9_1_2+"");
            MODULO7.setC7_P9_1_3(C7_P9_1_3+"");
            MODULO7.setC7_P9_1_4(C7_P9_1_4+"");
            MODULO7.setC7_P9_1_5(C7_P9_1_5+"");
            MODULO7.setC7_P9_1_6(C7_P9_1_6+"");
            MODULO7.setC7_P9_1_7(C7_P9_1_7+"");
            MODULO7.setC7_P9_1_8(C7_P9_1_8+"");
            MODULO7.setC7_P9_1_9(C7_P9_1_9+"");
            MODULO7.setC7_P9_1_10(C7_P9_1_10+"");
            MODULO7.setC7_P9_1_11(C7_P9_1_11+"");
            MODULO7.setC7_P9_1_12(C7_P9_1_12+"");
            MODULO7.setC7_P9_1_13(C7_P9_1_13+"");
            MODULO7.setC7_P9_1_14(C7_P9_1_14+"");
            MODULO7.setC7_P9_1_15(C7_P9_1_15+"");
            MODULO7.setC7_P9_1_16(C7_P9_1_16+"");
            MODULO7.setC7_P9_1_17(C7_P9_1_17+"");
            MODULO7.setC7_P9_1_18(C7_P9_1_18+"");
            MODULO7.setC7_P9_1_19(C7_P9_1_19+"");
            MODULO7.setC7_P9_1_20(C7_P9_1_20+"");
            MODULO7.setC7_P8_1_19_0(C7_P9_1_19_0);
            MODULO7.setC7_P9_2_1(C7_P9_2_1+"");
            MODULO7.setC7_P9_2_2(C7_P9_2_2+"");
            MODULO7.setC7_P9_2_3(C7_P9_2_3+"");
            MODULO7.setC7_P9_2_4(C7_P9_2_4+"");
            MODULO7.setC7_P9_2_5(C7_P9_2_5+"");
            MODULO7.setC7_P9_2_6(C7_P9_2_6+"");
            MODULO7.setC7_P9_2_7(C7_P9_2_7+"");
            MODULO7.setC7_P9_2_8(C7_P9_2_8+"");
            MODULO7.setC7_P9_2_9(C7_P9_2_9+"");
            MODULO7.setC7_P9_2_10(C7_P9_2_10+"");
            MODULO7.setC7_P9_2_11(C7_P9_2_11+"");
            MODULO7.setC7_P9_2_12(C7_P9_2_12+"");
            MODULO7.setC7_P9_2_13(C7_P9_2_13+"");
            MODULO7.setC7_P9_2_14(C7_P9_2_14+"");
            MODULO7.setC7_P9_2_15(C7_P9_2_15+"");
            MODULO7.setC7_P9_2_16(C7_P9_2_16+"");
            MODULO7.setC7_P9_2_17(C7_P9_2_17+"");
            MODULO7.setC7_P9_1_18(C7_P9_2_18+"");
            MODULO7.setC7_P9_1_19(C7_P9_2_19+"");
            data.insertarModulo7(MODULO7);
        }
        data.close();
    }

    public void llenarMapaVariables(){

        //---------Pregunta 9-------------
        //Pregunta 9.1
        if(mod7_p9_ck1.isChecked())C7_P9_1_1 = 1;
        else C7_P9_1_1 = 0;
        C7_P9_2_1=mod7_p9_sp1.getSelectedItemPosition();
        //Pregunta 9.2
        if(mod7_p9_ck2.isChecked())C7_P9_1_2 = 1;
        else C7_P9_1_2 = 0;
        C7_P9_2_2=mod7_p9_sp2.getSelectedItemPosition();
        //Pregunta 9.3
        if(mod7_p9_ck3.isChecked())C7_P9_1_3 = 1;
        else C7_P9_1_3 = 0;
        C7_P9_2_3=mod7_p9_sp3.getSelectedItemPosition();
        //Pregunta 9.4
        if(mod7_p9_ck4.isChecked())C7_P9_1_4 = 1;
        else C7_P9_1_4 = 0;
        C7_P9_2_4=mod7_p9_sp4.getSelectedItemPosition();
        //Pregunta 9.5
        if(mod7_p9_ck5.isChecked())C7_P9_1_5 = 1;
        else C7_P9_1_5 = 0;
        C7_P9_2_5=mod7_p9_sp5.getSelectedItemPosition();
        //Pregunta 9.6
        if(mod7_p9_ck6.isChecked())C7_P9_1_6 = 1;
        else C7_P9_1_6 = 0;
        C7_P9_2_6=mod7_p9_sp6.getSelectedItemPosition();
        //Pregunta 9.7
        if(mod7_p9_ck7.isChecked())C7_P9_1_7 = 1;
        else C7_P9_1_7 = 0;
        C7_P9_2_7=mod7_p9_sp7.getSelectedItemPosition();
        //Pregunta 9.8
        if(mod7_p9_ck8.isChecked())C7_P9_1_8 = 1;
        else C7_P9_1_8 = 0;
        C7_P9_2_8=mod7_p9_sp8.getSelectedItemPosition();
        //Pregunta 9.9
        if(mod7_p9_ck9.isChecked())C7_P9_1_9 = 1;
        else C7_P9_1_9 = 0;
        C7_P9_2_9=mod7_p9_sp9.getSelectedItemPosition();
        //Pregunta 9.10
        if(mod7_p9_ck10.isChecked())C7_P9_1_10 = 1;
        else C7_P9_1_10 = 0;
        C7_P9_2_10=mod7_p9_sp10.getSelectedItemPosition();
        //Pregunta 9.11
        if(mod7_p9_ck11.isChecked())C7_P9_1_11 = 1;
        else C7_P9_1_11 = 0;
        C7_P9_2_11=mod7_p9_sp11.getSelectedItemPosition();
        //Pregunta 9.12
        if(mod7_p9_ck12.isChecked())C7_P9_1_12 = 1;
        else C7_P9_1_12 = 0;
        C7_P9_2_12=mod7_p9_sp12.getSelectedItemPosition();
        //Pregunta 9.13
        if(mod7_p9_ck13.isChecked())C7_P9_1_13 = 1;
        else C7_P9_1_13 = 0;
        C7_P9_2_13=mod7_p9_sp13.getSelectedItemPosition();
        //Pregunta 9.14
        if(mod7_p9_ck14.isChecked())C7_P9_1_14 = 1;
        else C7_P9_1_14 = 0;
        C7_P9_2_14=mod7_p9_sp14.getSelectedItemPosition();
        //Pregunta 9.15
        if(mod7_p9_ck15.isChecked())C7_P9_1_15 = 1;
        else C7_P9_1_15 = 0;
        C7_P9_2_15=mod7_p9_sp15.getSelectedItemPosition();
        //Pregunta 9.16
        if(mod7_p9_ck16.isChecked())C7_P9_1_16 = 1;
        else C7_P9_1_16 = 0;
        C7_P9_2_16=mod7_p9_sp16.getSelectedItemPosition();
        //Pregunta 9.17
        if(mod7_p9_ck17.isChecked())C7_P9_1_17 = 1;
        else C7_P9_1_17 = 0;
        C7_P9_2_17=mod7_p9_sp17.getSelectedItemPosition();
        //Pregunta 9.18
        if(mod7_p9_ck18.isChecked())C7_P9_1_18 = 1;
        else C7_P9_1_18 = 0;
        C7_P9_2_18=mod7_p9_sp18.getSelectedItemPosition();
        //Pregunta 9.19
        if(mod7_p9_ck19.isChecked())C7_P9_1_19 = 1;
        else C7_P9_1_19 = 0;
        C7_P9_2_19=mod7_p9_sp19.getSelectedItemPosition();
        C7_P9_1_19_0 = mod7_p9_edt19.getText().toString();
        //Pregunta 9.20
        if(mod7_p9_ck20.isChecked())C7_P9_1_20 = 1;
        else C7_P9_1_20 = 0;

    }

    public boolean validarGuardadoSpiner(Integer[] checkBoxs, Integer[] spinners,Integer posNinguna){
        boolean valor=false;
        int checks = 0;
        int spnTotal=0;
        for(int i=0; i < checkBoxs.length ; i++ ) {
            if(i!=posNinguna && checkBoxs[i]==1){
                checks++;
                spnTotal=spnTotal+spinners[i];
            }
        }
        if(checkBoxs[posNinguna]==1 || checks==1 && spnTotal==1 || checks==2 && spnTotal==3 || checks>=3 && spnTotal==6 ){
            valor=false;
        }else  valor=true;

        return valor;
    }



    public boolean validar(){
        boolean  vC7_P9=true;
        boolean valido=true;
        llenarMapaVariables();
        Integer[] checkBoxsP9= {C7_P9_1_1,C7_P9_1_2,C7_P9_1_3,C7_P9_1_4,C7_P9_1_5,C7_P9_1_6,C7_P9_1_7,
                C7_P9_1_8,C7_P9_1_9,C7_P9_1_10,C7_P9_1_11,C7_P9_1_12,C7_P9_1_13,C7_P9_1_14,C7_P9_1_15,
                C7_P9_1_16,C7_P9_1_17,C7_P9_1_18,C7_P9_1_19,C7_P9_1_20 };
        Integer[] spinners= {C7_P9_2_1,C7_P9_2_2,C7_P9_2_3,C7_P9_2_4,C7_P9_2_5,C7_P9_2_6,C7_P9_2_7,
                C7_P9_2_8,C7_P9_2_9,C7_P9_2_10,C7_P9_2_11,C7_P9_2_12,C7_P9_2_13,C7_P9_2_14,C7_P9_2_15,
                C7_P9_2_16,C7_P9_2_17,C7_P9_2_18,C7_P9_2_19};

        //pregunta 9
         if(validarGuardadoSpiner(checkBoxsP9,spinners,19)){
            mostrarMensaje("Pregunta 9: Debe ingresar datos válidos");
            valido=false;
        }else if(C7_P9_1_19!=0 && C7_P9_1_19_0.trim().length()<3){
            mostrarMensaje("Debe registrar información válida en Especifique");
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
