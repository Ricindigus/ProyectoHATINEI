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
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import pe.gob.inei.encuestahabilidades.R;
import pe.gob.inei.encuestahabilidades.modelo.Data;
import pe.gob.inei.encuestahabilidades.modelo.SQLConstantes;
import pe.gob.inei.encuestahabilidades.pojos.Modulo1;
import pe.gob.inei.encuestahabilidades.pojos.Modulo4;

/**
 * A simple {@link Fragment} subclass.
 */
public class Modulo4Fragment3 extends Fragment {
    //PREGUNTA 8

    private LinearLayout mod4_p8_ly;
    private CheckBox mod4_p8_ck1;
    private CheckBox mod4_p8_ck2;
    private CheckBox mod4_p8_ck3;
    private CheckBox mod4_p8_ck4;
    private CheckBox mod4_p8_ck5;
    private CheckBox mod4_p8_ck6;
    private CheckBox mod4_p8_ck7;
    private CheckBox mod4_p8_ck8;
    private CheckBox mod4_p8_ck9;
    private CheckBox mod4_p8_ck10;
    private CheckBox mod4_p8_ck11;
    private CheckBox mod4_p8_ck12;
    private CheckBox mod4_p8_ck13;
    private CheckBox mod4_p8_ck14;
    private CheckBox mod4_p8_ck15;
    private CheckBox mod4_p8_ck16;
    private CheckBox mod4_p8_ck17;
    private CheckBox mod4_p8_ck18;


    private Spinner mod4_p8_sp1;
    private Spinner mod4_p8_sp2;
    private Spinner mod4_p8_sp3;
    private Spinner mod4_p8_sp4;
    private Spinner mod4_p8_sp5;
    private Spinner mod4_p8_sp6;
    private Spinner mod4_p8_sp7;
    private Spinner mod4_p8_sp8;
    private Spinner mod4_p8_sp9;
    private Spinner mod4_p8_sp10;
    private Spinner mod4_p8_sp11;
    private Spinner mod4_p8_sp12;
    private Spinner mod4_p8_sp13;
    private Spinner mod4_p8_sp14;
    private Spinner mod4_p8_sp15;
    private Spinner mod4_p8_sp16;
    private Spinner mod4_p8_sp17;
    private LinearLayout mod4_p8_ly1;
    private LinearLayout mod4_p8_ly2;
    private LinearLayout mod4_p8_ly3;
    private LinearLayout mod4_p8_ly4;
    private LinearLayout mod4_p8_ly5;
    private LinearLayout mod4_p8_ly6;
    private LinearLayout mod4_p8_ly7;
    private LinearLayout mod4_p8_ly8;
    private LinearLayout mod4_p8_ly9;
    private LinearLayout mod4_p8_ly10;
    private LinearLayout mod4_p8_ly11;
    private LinearLayout mod4_p8_ly12;
    private LinearLayout mod4_p8_ly13;
    private LinearLayout mod4_p8_ly14;
    private LinearLayout mod4_p8_ly15;
    private LinearLayout mod4_p8_ly16;
    private LinearLayout mod4_p8_ly17;
    private EditText mod4_p8_edt;
    //PREGUNTA 9
    private LinearLayout mod4_p9_ly;
    private CheckBox     mod4_p9_ck1;
    private CheckBox     mod4_p9_ck2;
    private CheckBox     mod4_p9_ck3;
    private CheckBox     mod4_p9_ck4;

    private String idempresa;
    private Modulo4 modulo4;
    private Context context;
    private Data data;

    //PREGUNTA 10
    private LinearLayout mod4_p10_ly;
    private RadioGroup   mod4_p10_rgb;
    //OBSERVACIONES
    private EditText edtObservaciones;

    //mapeo de variables
    int C4_P8_1_1 ;
    int C4_P8_1_2 ;
    int C4_P8_1_3  ;
    int C4_P8_1_4  ;
    int C4_P8_1_5 ;
    int C4_P8_1_6 ;
    int C4_P8_1_7 ;
    int C4_P8_1_8 ;
    int C4_P8_1_9  ;
    int C4_P8_1_10  ;
    int C4_P8_1_11  ;
    int C4_P8_1_12 ;
    int C4_P8_1_13  ;
    int C4_P8_1_14 ;
    int C4_P8_1_15  ;
    int C4_P8_1_16  ;
    int C4_P8_1_17  ;
    int C4_P8_1_18 ;
    String C4_P8_1_17_0  ;
    int C4_P8_2_1 ;
    int C4_P8_2_2  ;
    int C4_P8_2_3  ;
    int C4_P8_2_4 ;
    int C4_P8_2_5 ;
    int C4_P8_2_6 ;
    int C4_P8_2_7  ;
    int C4_P8_2_8 ;
    int C4_P8_2_9 ;
    int C4_P8_2_10 ;
    int C4_P8_2_11  ;
    int C4_P8_2_12 ;
    int C4_P8_2_13 ;
    int C4_P8_2_14;
    int C4_P8_2_15  ;
    int C4_P8_2_16 ;
    int C4_P8_2_17 ;
    int C4_P9_1 ;
    int C4_P9_2;
    int C4_P9_3  ;
    int C4_P9_4 ;
    int C4_P10 ;
    String OBS_MOD_IV ;

    public Modulo4Fragment3() {
    }

    @SuppressLint("ValidFragment")
    public Modulo4Fragment3(String idempresa, Context context) {
        this.idempresa = idempresa;
        this.context = context;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_modulo4_fragment3, container, false);
        //PREGUNTA 8
        mod4_p8_ly = (LinearLayout) rootView.findViewById(R.id.mod4_p8_ly);
        mod4_p8_ck1 = (CheckBox) rootView.findViewById(R.id.mod4_p8_ck1);
        mod4_p8_ck2 = (CheckBox) rootView.findViewById(R.id.mod4_p8_ck2);
        mod4_p8_ck3 = (CheckBox) rootView.findViewById(R.id.mod4_p8_ck3);
        mod4_p8_ck4 = (CheckBox) rootView.findViewById(R.id.mod4_p8_ck4);
        mod4_p8_ck5 = (CheckBox) rootView.findViewById(R.id.mod4_p8_ck5);
        mod4_p8_ck6 = (CheckBox) rootView.findViewById(R.id.mod4_p8_ck6);
        mod4_p8_ck7 = (CheckBox) rootView.findViewById(R.id.mod4_p8_ck7);
        mod4_p8_ck8 = (CheckBox) rootView.findViewById(R.id.mod4_p8_ck8);
        mod4_p8_ck9 = (CheckBox) rootView.findViewById(R.id.mod4_p8_ck9);
        mod4_p8_ck10 = (CheckBox) rootView.findViewById(R.id.mod4_p8_ck10);
        mod4_p8_ck11 = (CheckBox) rootView.findViewById(R.id.mod4_p8_ck11);
        mod4_p8_ck12 = (CheckBox) rootView.findViewById(R.id.mod4_p8_ck12);
        mod4_p8_ck13 = (CheckBox) rootView.findViewById(R.id.mod4_p8_ck13);
        mod4_p8_ck14 = (CheckBox) rootView.findViewById(R.id.mod4_p8_ck14);
        mod4_p8_ck15 = (CheckBox) rootView.findViewById(R.id.mod4_p8_ck15);
        mod4_p8_ck16 = (CheckBox) rootView.findViewById(R.id.mod4_p8_ck16);
        mod4_p8_ck17 = (CheckBox) rootView.findViewById(R.id.mod4_p8_ck17);
        mod4_p8_ck18 = (CheckBox) rootView.findViewById(R.id.mod4_p8_ck18);
        mod4_p8_sp1 = (Spinner) rootView.findViewById(R.id.mod4_p8_sp1);
        mod4_p8_sp2 = (Spinner) rootView.findViewById(R.id.mod4_p8_sp2);
        mod4_p8_sp3 = (Spinner) rootView.findViewById(R.id.mod4_p8_sp3);
        mod4_p8_sp4 = (Spinner) rootView.findViewById(R.id.mod4_p8_sp4);
        mod4_p8_sp5 = (Spinner) rootView.findViewById(R.id.mod4_p8_sp5);
        mod4_p8_sp6 = (Spinner) rootView.findViewById(R.id.mod4_p8_sp6);
        mod4_p8_sp7 = (Spinner) rootView.findViewById(R.id.mod4_p8_sp7);
        mod4_p8_sp8 = (Spinner) rootView.findViewById(R.id.mod4_p8_sp8);
        mod4_p8_sp9 = (Spinner) rootView.findViewById(R.id.mod4_p8_sp9);
        mod4_p8_sp10 = (Spinner) rootView.findViewById(R.id.mod4_p8_sp10);
        mod4_p8_sp11 = (Spinner) rootView.findViewById(R.id.mod4_p8_sp11);
        mod4_p8_sp12 = (Spinner) rootView.findViewById(R.id.mod4_p8_sp12);
        mod4_p8_sp13 = (Spinner) rootView.findViewById(R.id.mod4_p8_sp13);
        mod4_p8_sp14 = (Spinner) rootView.findViewById(R.id.mod4_p8_sp14);
        mod4_p8_sp15 = (Spinner) rootView.findViewById(R.id.mod4_p8_sp15);
        mod4_p8_sp16 = (Spinner) rootView.findViewById(R.id.mod4_p8_sp16);
        mod4_p8_sp17 = (Spinner) rootView.findViewById(R.id.mod4_p8_sp17);
        mod4_p8_ly1 = (LinearLayout) rootView.findViewById(R.id.mod4_p8_ly1);
        mod4_p8_ly2 = (LinearLayout) rootView.findViewById(R.id.mod4_p8_ly2);
        mod4_p8_ly3 = (LinearLayout) rootView.findViewById(R.id.mod4_p8_ly3);
        mod4_p8_ly4 = (LinearLayout) rootView.findViewById(R.id.mod4_p8_ly4);
        mod4_p8_ly5 = (LinearLayout) rootView.findViewById(R.id.mod4_p8_ly5);
        mod4_p8_ly6 = (LinearLayout) rootView.findViewById(R.id.mod4_p8_ly6);
        mod4_p8_ly7 = (LinearLayout) rootView.findViewById(R.id.mod4_p8_ly7);
        mod4_p8_ly8 = (LinearLayout) rootView.findViewById(R.id.mod4_p8_ly8);
        mod4_p8_ly9 = (LinearLayout) rootView.findViewById(R.id.mod4_p8_ly9);
        mod4_p8_ly10 = (LinearLayout) rootView.findViewById(R.id.mod4_p8_ly10);
        mod4_p8_ly11 = (LinearLayout) rootView.findViewById(R.id.mod4_p8_ly11);
        mod4_p8_ly12 = (LinearLayout) rootView.findViewById(R.id.mod4_p8_ly12);
        mod4_p8_ly13 = (LinearLayout) rootView.findViewById(R.id.mod4_p8_ly13);
        mod4_p8_ly14 = (LinearLayout) rootView.findViewById(R.id.mod4_p8_ly14);
        mod4_p8_ly15 = (LinearLayout) rootView.findViewById(R.id.mod4_p8_ly15);
        mod4_p8_ly16 = (LinearLayout) rootView.findViewById(R.id.mod4_p8_ly16);
        mod4_p8_ly17 = (LinearLayout) rootView.findViewById(R.id.mod4_p8_ly17);
        mod4_p8_edt = (EditText) rootView.findViewById(R.id.mod4_p8_edt);
        //PREGUNTA 9
        mod4_p9_ly  = (LinearLayout) rootView.findViewById(R.id.mod4_p9_ly);
        mod4_p9_ck1 = (CheckBox) rootView.findViewById(R.id.mod4_p9_ck1);
        mod4_p9_ck2 = (CheckBox) rootView.findViewById(R.id.mod4_p9_ck2);
        mod4_p9_ck3 = (CheckBox) rootView.findViewById(R.id.mod4_p9_ck3);
        mod4_p9_ck4 = (CheckBox) rootView.findViewById(R.id.mod4_p9_ck4);

        //PREGUNTA 10
        mod4_p10_ly = (LinearLayout) rootView.findViewById(R.id.mod4_p10_ly);
        mod4_p10_rgb = (RadioGroup) rootView.findViewById(R.id.mod4_p10_rgb);
        //OBSERVACIONES
        edtObservaciones =(EditText) rootView.findViewById(R.id.edtObservaciones);

        return rootView;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        mod4_p8_ly.requestFocus();
        final CheckBox[] listacheck ={mod4_p8_ck1,mod4_p8_ck2,mod4_p8_ck3,mod4_p8_ck4,
                mod4_p8_ck5,mod4_p8_ck6,mod4_p8_ck7,mod4_p8_ck8,mod4_p8_ck9,mod4_p8_ck10,
                mod4_p8_ck11,mod4_p8_ck12,mod4_p8_ck13,mod4_p8_ck14
                ,mod4_p8_ck15,mod4_p8_ck16,mod4_p8_ck17};
        final Spinner[] listaspinner ={mod4_p8_sp1,mod4_p8_sp2,mod4_p8_sp3,mod4_p8_sp4,
                mod4_p8_sp5,mod4_p8_sp6,mod4_p8_sp7,mod4_p8_sp8,mod4_p8_sp9,
                mod4_p8_sp10,mod4_p8_sp11,mod4_p8_sp12,mod4_p8_sp13,mod4_p8_sp14
                ,mod4_p8_sp15,mod4_p8_sp16,mod4_p8_sp17};

        final LinearLayout[] listasLinearlayout ={mod4_p8_ly1,mod4_p8_ly2,mod4_p8_ly3,mod4_p8_ly4,
                mod4_p8_ly5,mod4_p8_ly6,mod4_p8_ly7,mod4_p8_ly8,mod4_p8_ly9,
                mod4_p8_ly10,mod4_p8_ly11,mod4_p8_ly12,mod4_p8_ly13,mod4_p8_ly14
                ,mod4_p8_ly15,mod4_p8_ly16,mod4_p8_ly17};


        final CheckBox[] listacheck1 ={
                mod4_p9_ck1, mod4_p9_ck2, mod4_p9_ck3
        };

        //PREGUNTA 8


        for(int i = 0; i <listacheck.length ; i++) {
            final int posicion = 1;
            CheckBox checkBox = listacheck[i];
            listaspinner[i].setEnabled(false);
            listasLinearlayout[i].setBackgroundResource(R.drawable.fondo_spinner_disabled);
            if(i!=18){
                final Spinner spinner = listaspinner[i];
                final LinearLayout linearLayout = listasLinearlayout[i];
                checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if(b){
                            if(verificarCheck(listaspinner)){
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

        for (int i = 0; i <listaspinner.length ; i++) {
            final int posicion= i;
            final Spinner spinner = listaspinner[i];
            spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> adapterView, View view, int pos, long l) {
                    switch (pos){
                        case 0: restaurarSpinner(listacheck,listaspinner,listasLinearlayout);break;
                        case 1: validarSpiner(listaspinner,listasLinearlayout,posicion,1); break;
                        case 2: validarSpiner(listaspinner,listasLinearlayout,posicion,2); break;
                        case 3: validarSpiner(listaspinner,listasLinearlayout,posicion,3); break;
                    }
                }
                @Override
                public void onNothingSelected(AdapterView<?> adapterView) {}
            });
        }

        if(!mod4_p8_ck17.isChecked()){
            mod4_p8_edt.setText("");
            mod4_p8_edt.setBackgroundResource(R.drawable.cajas_de_texto_disabled);
            mod4_p8_edt.setVisibility(View.GONE);
            mod4_p8_edt.setEnabled(false);
            mod4_p8_sp17.setSelection(0);
            mod4_p8_ly17.setBackgroundResource(R.drawable.fondo_spinner_disabled);
            mod4_p8_sp17.setEnabled(false);
        }
        mod4_p8_ck17.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    mod4_p8_edt.setEnabled(true);
                    mod4_p8_edt.setVisibility(View.VISIBLE);
                    mod4_p8_edt.setBackgroundResource(R.drawable.fondo_edit_text);
                    if(verificarCheck(listaspinner)){
                        mod4_p8_sp17.setEnabled(false);
                        mod4_p8_ly17.setBackgroundResource(R.drawable.fondo_spinner_disabled);
                    }else{
                        mod4_p8_sp17.setEnabled(true);
                        mod4_p8_ly17.setBackgroundResource(R.drawable.fondo_spinner);
                    }
                }else{
                    mod4_p8_edt.setText("");
                    mod4_p8_edt.setBackgroundResource(R.drawable.cajas_de_texto_disabled);
                    mod4_p8_edt.setEnabled(false);
                    mod4_p8_edt.setVisibility(View.GONE);
                    mod4_p8_sp17.setSelection(0);
                    mod4_p8_ly17.setBackgroundResource(R.drawable.fondo_spinner_disabled);
                    mod4_p8_sp17.setEnabled(false);
                }
            }
        });


        //CAMPOS CON MAYUSCULAS
        mod4_p8_edt.setFilters(new InputFilter[]{new InputFilter.AllCaps()});

        //CAMPOS CON MAYUSCULAS
        edtObservaciones.setFilters(new InputFilter[]{new InputFilter.AllCaps()});

        cargarDatos();

        if(mod4_p8_ck18.isChecked()){
            for ( CheckBox c:listacheck ) {
                c.setChecked(false);c.setEnabled(false);c.setTextColor(Color.LTGRAY);
            }
        }

        if(mod4_p9_ck4.isChecked()){
            for ( CheckBox c:listacheck1 ) {
                c.setChecked(false);c.setEnabled(false);c.setTextColor(Color.LTGRAY);
            }
        }

        alertaCheckLimpiar(mod4_p8_ck18,listacheck);
        alertaCheckLimpiar(mod4_p9_ck4,listacheck1);
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
                                    "No puede dos razones que indiquen 1 como más importante",Toast.LENGTH_SHORT).show();
                        }else if(valor == 2){
                            Toast.makeText(getActivity().getApplicationContext(),
                                    "No puede dos razones que indiquen 2 como el segundo más importante",Toast.LENGTH_SHORT).show();
                        }else if(valor == 3) {
                            Toast.makeText(getActivity().getApplicationContext(),
                                    "No puede dos razones que indiquen 3 como el tercer más importante",Toast.LENGTH_SHORT).show();
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

    public void ocultarTeclado(View view){
        InputMethodManager mgr =(InputMethodManager) getActivity().getSystemService(Context.INPUT_METHOD_SERVICE);
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
        if(data.existeModulo4(idempresa)) {
            //si existe traigo el objeto
            modulo4 = data.getModulo4(idempresa);
            //saco los datos del objeto para llenarlos en los elementos del fragment
            //---------Pregunta 8-------------
            //Pregunta 8.1
            if (modulo4.getC4_P8_1_1().equals("1")) mod4_p8_ck1.setChecked(true);
            if (modulo4.getC4_P8_1_1().equals("0")) mod4_p8_ck1.setChecked(false);
            if (!modulo4.getC4_P8_2_1().equals("")) {
                mod4_p8_sp1.setSelection(Integer.parseInt(modulo4.getC4_P8_2_1()));
            }
            //Pregunta 8.2
            if (modulo4.getC4_P8_1_2().equals("1")) mod4_p8_ck2.setChecked(true);
            if (modulo4.getC4_P8_1_2().equals("0")) mod4_p8_ck2.setChecked(false);
            if (!modulo4.getC4_P8_2_2().equals("")) {
                mod4_p8_sp2.setSelection(Integer.parseInt(modulo4.getC4_P8_2_2()));
            }
            //Pregunta 8.3
            if (modulo4.getC4_P8_1_3().equals("1")) mod4_p8_ck3.setChecked(true);
            if (modulo4.getC4_P8_1_3().equals("0")) mod4_p8_ck3.setChecked(false);
            if (!modulo4.getC4_P8_2_3().equals("")) {
                mod4_p8_sp3.setSelection(Integer.parseInt(modulo4.getC4_P8_2_3()));
            }
            //Pregunta 8.4
            if (modulo4.getC4_P8_1_4().equals("1")) mod4_p8_ck4.setChecked(true);
            if (modulo4.getC4_P8_1_4().equals("0")) mod4_p8_ck4.setChecked(false);
            if (!modulo4.getC4_P8_2_4().equals("")) {
                mod4_p8_sp4.setSelection(Integer.parseInt(modulo4.getC4_P8_2_4()));
            }
            //Pregunta 8.5
            if (modulo4.getC4_P8_1_5().equals("1")) mod4_p8_ck5.setChecked(true);
            if (modulo4.getC4_P8_1_5().equals("0")) mod4_p8_ck5.setChecked(false);
            if (!modulo4.getC4_P8_2_5().equals("")) {
                mod4_p8_sp5.setSelection(Integer.parseInt(modulo4.getC4_P8_2_5()));
            }
            //Pregunta 8.6
            if (modulo4.getC4_P8_1_6().equals("1")) mod4_p8_ck6.setChecked(true);
            if (modulo4.getC4_P8_1_6().equals("0")) mod4_p8_ck6.setChecked(false);
            if (!modulo4.getC4_P8_2_6().equals("")) {
                mod4_p8_sp6.setSelection(Integer.parseInt(modulo4.getC4_P8_2_6()));
            }
            //Pregunta 8.7
            if (modulo4.getC4_P8_1_7().equals("1")) mod4_p8_ck7.setChecked(true);
            if (modulo4.getC4_P8_1_7().equals("0")) mod4_p8_ck7.setChecked(false);
            if (!modulo4.getC4_P8_2_7().equals("")) {
                mod4_p8_sp7.setSelection(Integer.parseInt(modulo4.getC4_P8_2_7()));
            }
            //Pregunta 8.8
            if (modulo4.getC4_P8_1_8().equals("1")) mod4_p8_ck8.setChecked(true);
            if (modulo4.getC4_P8_1_8().equals("0")) mod4_p8_ck8.setChecked(false);
            if (!modulo4.getC4_P8_2_8().equals("")) {
                mod4_p8_sp8.setSelection(Integer.parseInt(modulo4.getC4_P8_2_8()));
            }
            //Pregunta 8.9
            if (modulo4.getC4_P8_1_9().equals("1")) mod4_p8_ck9.setChecked(true);
            if (modulo4.getC4_P8_1_9().equals("0")) mod4_p8_ck9.setChecked(false);
            if (!modulo4.getC4_P8_2_9().equals("")) {
                mod4_p8_sp9.setSelection(Integer.parseInt(modulo4.getC4_P8_2_9()));
            }
            //Pregunta 8.10
            if (modulo4.getC4_P8_1_10().equals("1")) mod4_p8_ck10.setChecked(true);
            if (modulo4.getC4_P8_1_10().equals("0")) mod4_p8_ck10.setChecked(false);
            if (!modulo4.getC4_P8_2_10().equals("")) {
                mod4_p8_sp10.setSelection(Integer.parseInt(modulo4.getC4_P8_2_10()));
            }
            //Pregunta 8.11
            if (modulo4.getC4_P8_1_11().equals("1")) mod4_p8_ck11.setChecked(true);
            if (modulo4.getC4_P8_1_11().equals("0")) mod4_p8_ck11.setChecked(false);
            if (!modulo4.getC4_P8_2_11().equals("")) {
                mod4_p8_sp11.setSelection(Integer.parseInt(modulo4.getC4_P8_2_11()));
            }
            //Pregunta 8.12
            if (modulo4.getC4_P8_1_12().equals("1")) mod4_p8_ck12.setChecked(true);
            if (modulo4.getC4_P8_1_12().equals("0")) mod4_p8_ck12.setChecked(false);
            if (!modulo4.getC4_P8_2_12().equals("")) {
                mod4_p8_sp12.setSelection(Integer.parseInt(modulo4.getC4_P8_2_12()));
            }
            //Pregunta 8.13
            if (modulo4.getC4_P8_1_13().equals("1")) mod4_p8_ck13.setChecked(true);
            if (modulo4.getC4_P8_1_13().equals("0")) mod4_p8_ck13.setChecked(false);
            if (!modulo4.getC4_P8_2_13().equals("")) {
                mod4_p8_sp13.setSelection(Integer.parseInt(modulo4.getC4_P8_2_13()));
            }
            //Pregunta 8.14
            if (modulo4.getC4_P8_1_14().equals("1")) mod4_p8_ck14.setChecked(true);
            if (modulo4.getC4_P8_1_14().equals("0")) mod4_p8_ck14.setChecked(false);
            if (!modulo4.getC4_P8_2_14().equals("")) {
                mod4_p8_sp14.setSelection(Integer.parseInt(modulo4.getC4_P8_2_14()));
            }
            //Pregunta 8.15
            if (modulo4.getC4_P8_1_15().equals("1")) mod4_p8_ck15.setChecked(true);
            if (modulo4.getC4_P8_1_15().equals("0")) mod4_p8_ck15.setChecked(false);
            if (!modulo4.getC4_P8_2_15().equals("")) {
                mod4_p8_sp15.setSelection(Integer.parseInt(modulo4.getC4_P8_2_15()));
            }
            //Pregunta 8.16
            if (modulo4.getC4_P8_1_16().equals("1")) mod4_p8_ck16.setChecked(true);
            if (modulo4.getC4_P8_1_16().equals("0")) mod4_p8_ck16.setChecked(false);
            if (!modulo4.getC4_P8_2_16().equals("")) {
                mod4_p8_sp16.setSelection(Integer.parseInt(modulo4.getC4_P8_2_16()));
            }
            //Pregunta 8.17
            if (modulo4.getC4_P8_1_17().equals("1")) mod4_p8_ck17.setChecked(true);
            if (modulo4.getC4_P8_1_17().equals("0")) mod4_p8_ck17.setChecked(false);
            if (!modulo4.getC4_P8_2_17().equals("")) {
                mod4_p8_sp17.setSelection(Integer.parseInt(modulo4.getC4_P8_2_17()));
            }
            mod4_p8_edt.setText(modulo4.getC4_P8_1_17_0());
            //Pregunta 8.18
            if (modulo4.getC4_P8_1_18().equals("1")) mod4_p8_ck18.setChecked(true);
            if (modulo4.getC4_P8_1_18().equals("0")) mod4_p8_ck18.setChecked(false);

            //---------Pregunta 9-------------
            //Pregunta 9.1
            if (modulo4.getC4_P9_1().equals("1")) mod4_p9_ck1.setChecked(true);
            if (modulo4.getC4_P9_1().equals("0")) mod4_p9_ck1.setChecked(false);
            //Pregunta 9.2
            if (modulo4.getC4_P9_2().equals("1")) mod4_p9_ck2.setChecked(true);
            if (modulo4.getC4_P9_2().equals("0")) mod4_p9_ck2.setChecked(false);
            //Pregunta 9.3
            if (modulo4.getC4_P9_3().equals("1")) mod4_p9_ck3.setChecked(true);
            if (modulo4.getC4_P9_3().equals("0")) mod4_p9_ck3.setChecked(false);
            //Pregunta 9.4
            if (modulo4.getC4_P9_4().equals("1")) mod4_p9_ck4.setChecked(true);
            if (modulo4.getC4_P9_4().equals("0")) mod4_p9_ck4.setChecked(false);

            //---------Pregunta 10-------------
            //pregunta 10
            if(!modulo4.getC4_P10().equals("") && !modulo4.getC4_P10().equals("-1")){
                int childPos10 = Integer.parseInt(modulo4.getC4_P10());
                ((RadioButton) mod4_p10_rgb.getChildAt(childPos10)).setChecked(true);
            }

            //observaciones
            edtObservaciones.setText(modulo4.getOBS_MOD_IV());
        }
        data.close();
    }


    public void guardarDatos(){
        data = new Data(context);
        data.open();
        if(data.existeModulo4(idempresa)){
            ContentValues contentValues = new ContentValues(53);
            contentValues.put(SQLConstantes.MODULO4_P8_1_1,C4_P8_1_1+"");
            contentValues.put(SQLConstantes.MODULO4_P8_1_2,C4_P8_1_2+"");
            contentValues.put(SQLConstantes.MODULO4_P8_1_3,C4_P8_1_3+"");
            contentValues.put(SQLConstantes.MODULO4_P8_1_4,C4_P8_1_4+"");
            contentValues.put(SQLConstantes.MODULO4_P8_1_5,C4_P8_1_5+"");
            contentValues.put(SQLConstantes.MODULO4_P8_1_6,C4_P8_1_6+"");
            contentValues.put(SQLConstantes.MODULO4_P8_1_7,C4_P8_1_7+"");
            contentValues.put(SQLConstantes.MODULO4_P8_1_8,C4_P8_1_8+"");
            contentValues.put(SQLConstantes.MODULO4_P8_1_9,C4_P8_1_9+"");
            contentValues.put(SQLConstantes.MODULO4_P8_1_10,C4_P8_1_10+"");
            contentValues.put(SQLConstantes.MODULO4_P8_1_11,C4_P8_1_11+"");
            contentValues.put(SQLConstantes.MODULO4_P8_1_12,C4_P8_1_12+"");
            contentValues.put(SQLConstantes.MODULO4_P8_1_13,C4_P8_1_13+"");
            contentValues.put(SQLConstantes.MODULO4_P8_1_14,C4_P8_1_14+"");
            contentValues.put(SQLConstantes.MODULO4_P8_1_15,C4_P8_1_15+"");
            contentValues.put(SQLConstantes.MODULO4_P8_1_16,C4_P8_1_16+"");
            contentValues.put(SQLConstantes.MODULO4_P8_1_17,C4_P8_1_17+"");
            contentValues.put(SQLConstantes.MODULO4_P8_1_18,C4_P8_1_18+"");
            contentValues.put(SQLConstantes.MODULO4_P8_2_1,C4_P8_2_1+"");
            contentValues.put(SQLConstantes.MODULO4_P8_2_2,C4_P8_2_2+"");
            contentValues.put(SQLConstantes.MODULO4_P8_2_3,C4_P8_2_3+"");
            contentValues.put(SQLConstantes.MODULO4_P8_2_4,C4_P8_2_4+"");
            contentValues.put(SQLConstantes.MODULO4_P8_2_5,C4_P8_2_5+"");
            contentValues.put(SQLConstantes.MODULO4_P8_2_6,C4_P8_2_6+"");
            contentValues.put(SQLConstantes.MODULO4_P8_2_7,C4_P8_2_7+"");
            contentValues.put(SQLConstantes.MODULO4_P8_2_8,C4_P8_2_8+"");
            contentValues.put(SQLConstantes.MODULO4_P8_2_9,C4_P8_2_9+"");
            contentValues.put(SQLConstantes.MODULO4_P8_2_10,C4_P8_2_10+"");
            contentValues.put(SQLConstantes.MODULO4_P8_2_11,C4_P8_2_11+"");
            contentValues.put(SQLConstantes.MODULO4_P8_2_12,C4_P8_2_12+"");
            contentValues.put(SQLConstantes.MODULO4_P8_2_13,C4_P8_2_13+"");
            contentValues.put(SQLConstantes.MODULO4_P8_2_14,C4_P8_2_14+"");
            contentValues.put(SQLConstantes.MODULO4_P8_2_15,C4_P8_2_15+"");
            contentValues.put(SQLConstantes.MODULO4_P8_2_16,C4_P8_2_16+"");
            contentValues.put(SQLConstantes.MODULO4_P8_2_17,C4_P8_2_17+"");
            contentValues.put(SQLConstantes.MODULO4_P8_1_17_0,C4_P8_1_17_0);
            contentValues.put(SQLConstantes.MODULO4_P9_1,C4_P9_1+"");
            contentValues.put(SQLConstantes.MODULO4_P9_2,C4_P9_2+"");
            contentValues.put(SQLConstantes.MODULO4_P9_3,C4_P9_3+"");
            contentValues.put(SQLConstantes.MODULO4_P9_4,C4_P9_4+"");
            contentValues.put(SQLConstantes.MODULO4_P10,C4_P10+"");
            contentValues.put(SQLConstantes.MODULO4_OBS_MOD_IV,OBS_MOD_IV);
            data.actualizarModulo4(idempresa,contentValues);
        }else{
            //si no existe el elemento, lo construye para insertarlo
            modulo4 = new Modulo4();
            //llena el objeto a insertar
            modulo4.setMODULO4_ID(idempresa);
            modulo4.setC4_P8_1_1(C4_P8_1_1+"");
            modulo4.setC4_P8_1_2(C4_P8_1_2+"");
            modulo4.setC4_P8_1_3(C4_P8_1_3+"");
            modulo4.setC4_P8_1_4(C4_P8_1_4+"");
            modulo4.setC4_P8_1_5(C4_P8_1_5+"");
            modulo4.setC4_P8_1_6(C4_P8_1_6+"");
            modulo4.setC4_P8_1_7(C4_P8_1_7+"");
            modulo4.setC4_P8_1_8(C4_P8_1_8+"");
            modulo4.setC4_P8_1_9(C4_P8_1_9+"");
            modulo4.setC4_P8_1_10(C4_P8_1_10+"");
            modulo4.setC4_P8_1_11(C4_P8_1_11+"");
            modulo4.setC4_P8_1_12(C4_P8_1_12+"");
            modulo4.setC4_P8_1_13(C4_P8_1_13+"");
            modulo4.setC4_P8_1_14(C4_P8_1_14+"");
            modulo4.setC4_P8_1_15(C4_P8_1_15+"");
            modulo4.setC4_P8_1_16(C4_P8_1_16+"");
            modulo4.setC4_P8_1_17(C4_P8_1_17+"");
            modulo4.setC4_P8_1_18(C4_P8_1_18+"");
            modulo4.setC4_P8_2_1(C4_P8_2_1+"");
            modulo4.setC4_P8_2_2(C4_P8_2_2+"");
            modulo4.setC4_P8_2_3(C4_P8_2_3+"");
            modulo4.setC4_P8_2_4(C4_P8_2_4+"");
            modulo4.setC4_P8_2_5(C4_P8_2_5+"");
            modulo4.setC4_P8_2_6(C4_P8_2_6+"");
            modulo4.setC4_P8_2_7(C4_P8_2_7+"");
            modulo4.setC4_P8_2_8(C4_P8_2_8+"");
            modulo4.setC4_P8_2_9(C4_P8_2_9+"");
            modulo4.setC4_P8_2_10(C4_P8_2_10+"");
            modulo4.setC4_P8_2_11(C4_P8_2_11+"");
            modulo4.setC4_P8_2_12(C4_P8_2_12+"");
            modulo4.setC4_P8_2_13(C4_P8_2_13+"");
            modulo4.setC4_P8_2_14(C4_P8_2_14+"");
            modulo4.setC4_P8_2_15(C4_P8_2_15+"");
            modulo4.setC4_P8_2_16(C4_P8_2_16+"");
            modulo4.setC4_P8_2_17(C4_P8_2_17+"");
            modulo4.setC4_P8_1_17_0(C4_P8_1_17_0);
            modulo4.setC4_P9_1(C4_P9_1+"");
            modulo4.setC4_P9_2(C4_P9_2+"");
            modulo4.setC4_P9_3(C4_P9_3+"");
            modulo4.setC4_P9_4(C4_P9_4+"");
            modulo4.setC4_P10(C4_P10+"");
            modulo4.setOBS_MOD_IV(OBS_MOD_IV);
            data.insertarModulo4(modulo4);
        }
        data.close();
    }

    public void llenarMapaVariables(){

        //---------Pregunta 8-------------
        //Pregunta 8.1
        if(mod4_p8_ck1.isChecked())C4_P8_1_1 = 1;
        else C4_P8_1_1 = 0;
        C4_P8_2_1=mod4_p8_sp1.getSelectedItemPosition();
        //Pregunta 8.2
        if(mod4_p8_ck2.isChecked())C4_P8_1_2 = 1;
        else C4_P8_1_2 = 0;
        C4_P8_2_2=mod4_p8_sp2.getSelectedItemPosition();
        //Pregunta 8.3
        if(mod4_p8_ck3.isChecked())C4_P8_1_3 = 1;
        else C4_P8_1_3 = 0;
        C4_P8_2_3=mod4_p8_sp3.getSelectedItemPosition();
        //Pregunta 8.4
        if(mod4_p8_ck4.isChecked())C4_P8_1_4 = 1;
        else C4_P8_1_4 = 0;
        C4_P8_2_4=mod4_p8_sp4.getSelectedItemPosition();
        //Pregunta 8.5
        if(mod4_p8_ck5.isChecked())C4_P8_1_5 = 1;
        else C4_P8_1_5 = 0;
        C4_P8_2_5=mod4_p8_sp5.getSelectedItemPosition();
        //Pregunta 8.6
        if(mod4_p8_ck6.isChecked())C4_P8_1_6 = 1;
        else C4_P8_1_6 = 0;
        C4_P8_2_6=mod4_p8_sp6.getSelectedItemPosition();
        //Pregunta 8.7
        if(mod4_p8_ck7.isChecked())C4_P8_1_7 = 1;
        else C4_P8_1_7 = 0;
        C4_P8_2_7=mod4_p8_sp7.getSelectedItemPosition();
        //Pregunta 8.8
        if(mod4_p8_ck8.isChecked())C4_P8_1_8 = 1;
        else C4_P8_1_8 = 0;
        C4_P8_2_8=mod4_p8_sp8.getSelectedItemPosition();
        //Pregunta 8.9
        if(mod4_p8_ck9.isChecked())C4_P8_1_9 = 1;
        else C4_P8_1_9 = 0;
        C4_P8_2_9=mod4_p8_sp9.getSelectedItemPosition();
        //Pregunta 8.10
        if(mod4_p8_ck10.isChecked())C4_P8_1_10 = 1;
        else C4_P8_1_10 = 0;
        C4_P8_2_10=mod4_p8_sp10.getSelectedItemPosition();
        //Pregunta 8.11
        if(mod4_p8_ck11.isChecked())C4_P8_1_11 = 1;
        else C4_P8_1_11 = 0;
        C4_P8_2_11=mod4_p8_sp11.getSelectedItemPosition();
        //Pregunta 8.12
        if(mod4_p8_ck12.isChecked())C4_P8_1_12 = 1;
        else C4_P8_1_12 = 0;
        C4_P8_2_12=mod4_p8_sp12.getSelectedItemPosition();
        //Pregunta 8.13
        if(mod4_p8_ck13.isChecked())C4_P8_1_13 = 1;
        else C4_P8_1_13 = 0;
        C4_P8_2_13=mod4_p8_sp13.getSelectedItemPosition();
        //Pregunta 8.14
        if(mod4_p8_ck14.isChecked())C4_P8_1_14 = 1;
        else C4_P8_1_14 = 0;
        C4_P8_2_14=mod4_p8_sp14.getSelectedItemPosition();
        //Pregunta 8.15
        if(mod4_p8_ck15.isChecked())C4_P8_1_15 = 1;
        else C4_P8_1_15 = 0;
        C4_P8_2_15=mod4_p8_sp15.getSelectedItemPosition();
        //Pregunta 8.16
        if(mod4_p8_ck16.isChecked())C4_P8_1_16 = 1;
        else C4_P8_1_16 = 0;
        C4_P8_2_16=mod4_p8_sp16.getSelectedItemPosition();
        //Pregunta 8.17
        if(mod4_p8_ck17.isChecked())C4_P8_1_17 = 1;
        else C4_P8_1_17 = 0;
        C4_P8_2_17=mod4_p8_sp17.getSelectedItemPosition();
        C4_P8_1_17_0 = mod4_p8_edt.getText().toString();
        //Pregunta 8.18
        if(mod4_p8_ck18.isChecked())C4_P8_1_18 = 1;
        else C4_P8_1_18 = 0;

        //---------Pregunta 9-------------
        //Pregunta 9.1
        if(mod4_p9_ck1.isChecked())C4_P9_1 = 1;
        else C4_P9_1 = 0;
        //Pregunta 9.2
        if(mod4_p9_ck2.isChecked())C4_P9_2 = 1;
        else C4_P9_2 = 0;
        //Pregunta 9.3
        if(mod4_p9_ck3.isChecked())C4_P9_3 = 1;
        else C4_P9_3 = 0;
        //Pregunta 9.4
        if(mod4_p9_ck4.isChecked())C4_P9_4 = 1;
        else C4_P9_4 = 0;

        //---------Pregunta 10-------------
        int childPosP10 = mod4_p10_rgb.indexOfChild(mod4_p10_rgb.findViewById(mod4_p10_rgb.getCheckedRadioButtonId()));
        C4_P10 = childPosP10;

        //OBSERVACIONES
        OBS_MOD_IV = edtObservaciones.getText().toString();

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
        boolean   vC4_P9=true;
        boolean valido=true;
        llenarMapaVariables();

        //pregunta 8

        Integer[] checkBoxsP8= {C4_P8_1_1,C4_P8_1_2,C4_P8_1_3,C4_P8_1_4,C4_P8_1_5,C4_P8_1_6,C4_P8_1_7,
                C4_P8_1_8,C4_P8_1_9,C4_P8_1_10,C4_P8_1_11,C4_P8_1_12,C4_P8_1_13,C4_P8_1_14,C4_P8_1_15,
                C4_P8_1_16,C4_P8_1_17,C4_P8_1_18 };
        Integer[] spinners= {C4_P8_2_1,C4_P8_2_2,C4_P8_2_3,C4_P8_2_4,C4_P8_2_5,C4_P8_2_6,C4_P8_2_7,
                C4_P8_2_8,C4_P8_2_9,C4_P8_2_10,C4_P8_2_11,C4_P8_2_12,C4_P8_2_13,C4_P8_2_14,C4_P8_2_15,
                C4_P8_2_16,C4_P8_2_17};

        Integer[] checkBoxsP9={ C4_P9_1, C4_P9_2, C4_P9_3, C4_P9_4};

        for (int valor:checkBoxsP9 ) {
            if(valor==1)vC4_P9=false;
        }

        if(validarGuardadoSpiner(checkBoxsP8,spinners,17)){
            mostrarMensaje("Pregunta 8: Debe ingresar datos válidos ");
            valido=false;
        }else if(C4_P8_1_17!=0 && (C4_P8_1_17_0.equals("") || C4_P8_1_17_0.trim().length()<3 )){
            mostrarMensaje("Pregunta 8 opción 17: Debe registrar información válida en Especifique ");
            valido=false;
        }else if(vC4_P9){
            mostrarMensaje("Pregunta 9:  Marque una o más opciones");
            valido=false;
        }else if(C4_P10 == -1 ){
            mostrarMensaje("Pregunta 10: Marque una opción ");
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
