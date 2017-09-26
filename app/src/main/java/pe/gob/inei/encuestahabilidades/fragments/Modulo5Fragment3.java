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
import pe.gob.inei.encuestahabilidades.pojos.Modulo4;
import pe.gob.inei.encuestahabilidades.pojos.Modulo5;

/**
 * A simple {@link Fragment} subclass.
 */
public class Modulo5Fragment3 extends Fragment {

    private LinearLayout lytP3;
    private LinearLayout lytP5;

    private CheckBox ck1P3;
    private CheckBox ck2P3;
    private CheckBox ck3P3;
    private CheckBox ck4P3;
    private CheckBox ck5P3;
    private CheckBox ck6P3;
    private CheckBox ck7P3;
    private CheckBox ck8P3;
    private CheckBox ck9P3;
    private CheckBox ck10P3;
    private CheckBox ck11P3;
    private CheckBox ck12P3;

    private Spinner sp1P3;
    private Spinner sp2P3;
    private Spinner sp3P3;
    private Spinner sp4P3;
    private Spinner sp5P3;
    private Spinner sp6P3;
    private Spinner sp7P3;
    private Spinner sp8P3;
    private Spinner sp9P3;
    private Spinner sp10P3;
    private Spinner sp11P3;
    private Spinner sp12P3;

    private LinearLayout lyt1P3;
    private LinearLayout lyt2P3;
    private LinearLayout lyt3P3;
    private LinearLayout lyt4P3;
    private LinearLayout lyt5P3;
    private LinearLayout lyt6P3;
    private LinearLayout lyt7P3;
    private LinearLayout lyt8P3;
    private LinearLayout lyt9P3;
    private LinearLayout lyt10P3;
    private LinearLayout lyt11P3;
    private LinearLayout lyt12P3;

    private EditText edtEspecifiqueP3;

    private LinearLayout mod5_p4_lyt;


    private CheckBox ck1P4;
    private CheckBox ck2P4;
    private CheckBox ck3P4;
    private CheckBox ck4P4;
    private CheckBox ck5P4;
    private CheckBox ck6P4;
    private CheckBox ck7P4;
    private CheckBox ck8P4;


    private Spinner sp1P4;
    private Spinner sp2P4;
    private Spinner sp3P4;
    private Spinner sp4P4;
    private Spinner sp5P4;
    private Spinner sp6P4;
    private Spinner sp7P4;
    private Spinner sp8P4;


    private LinearLayout lyt1P4;
    private LinearLayout lyt2P4;
    private LinearLayout lyt3P4;
    private LinearLayout lyt4P4;
    private LinearLayout lyt5P4;
    private LinearLayout lyt6P4;
    private LinearLayout lyt7P4;
    private LinearLayout lyt8P4;

    private CheckBox ck1P5;
    private CheckBox ck2P5;
    private CheckBox ck3P5;
    private CheckBox ck4P5;
    private CheckBox ck5P5;
    private CheckBox ck6P5;

    private String idempresa;
    private Modulo5 modulo5;
    private Context context;
    private Data data;

    private int C5_P3_1_1;
    private int C5_P3_1_2;
    private int C5_P3_1_3;
    private int C5_P3_1_4;
    private int C5_P3_1_5;
    private int C5_P3_1_6;
    private int C5_P3_1_7;
    private int C5_P3_1_8;
    private int C5_P3_1_9;
    private int C5_P3_1_10;
    private int C5_P3_1_11;
    private int C5_P3_1_12;
    private String C5_P3_1_12_0;
    private int C5_P3_2_1;
    private int C5_P3_2_2;
    private int C5_P3_2_3;
    private int C5_P3_2_4;
    private int C5_P3_2_5;
    private int C5_P3_2_6;
    private int C5_P3_2_7;
    private int C5_P3_2_8;
    private int C5_P3_2_9;
    private int C5_P3_2_10;
    private int C5_P3_2_11;
    private int C5_P3_2_12;
    private int C5_P4_1_1;
    private int C5_P4_1_2;
    private int C5_P4_1_3;
    private int C5_P4_1_4;
    private int C5_P4_1_5;
    private int C5_P4_1_6;
    private int C5_P4_1_7;
    private int C5_P4_1_8;
    private int C5_P4_2_1;
    private int C5_P4_2_2;
    private int C5_P4_2_3;
    private int C5_P4_2_4;
    private int C5_P4_2_5;
    private int C5_P4_2_6;
    private int C5_P4_2_7;
    private int C5_P4_2_8;
    private int C5_P5_1;
    private int C5_P5_2;
    private int C5_P5_3;
    private int C5_P5_4;
    private int C5_P5_5;
    private int C5_P5_6;

    public Modulo5Fragment3() {
        // Required empty public constructor
    }

    @SuppressLint("ValidFragment")
    public Modulo5Fragment3(String idempresa, Context context) {
        this.idempresa = idempresa;
        this.context = context;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_modulo5_fragment3, container, false);
        lytP3 = (LinearLayout) rootView.findViewById(R.id.mod5_p3_lyt);

        ck1P3 = (CheckBox) rootView.findViewById(R.id.mod5_p3_ck1);
        ck2P3 = (CheckBox) rootView.findViewById(R.id.mod5_p3_ck2);
        ck3P3 = (CheckBox) rootView.findViewById(R.id.mod5_p3_ck3);
        ck4P3 = (CheckBox) rootView.findViewById(R.id.mod5_p3_ck4);
        ck5P3 = (CheckBox) rootView.findViewById(R.id.mod5_p3_ck5);
        ck6P3 = (CheckBox) rootView.findViewById(R.id.mod5_p3_ck6);
        ck7P3 = (CheckBox) rootView.findViewById(R.id.mod5_p3_ck7);
        ck8P3 = (CheckBox) rootView.findViewById(R.id.mod5_p3_ck8);
        ck9P3 = (CheckBox) rootView.findViewById(R.id.mod5_p3_ck9);
        ck10P3 = (CheckBox) rootView.findViewById(R.id.mod5_p3_ck10);
        ck11P3 = (CheckBox) rootView.findViewById(R.id.mod5_p3_ck11);
        ck12P3 = (CheckBox) rootView.findViewById(R.id.mod5_p3_ck12);

        sp1P3 = (Spinner) rootView.findViewById(R.id.mod5_p3_sp1);
        sp2P3 = (Spinner) rootView.findViewById(R.id.mod5_p3_sp2);
        sp3P3 = (Spinner) rootView.findViewById(R.id.mod5_p3_sp3);
        sp4P3 = (Spinner) rootView.findViewById(R.id.mod5_p3_sp4);
        sp5P3 = (Spinner) rootView.findViewById(R.id.mod5_p3_sp5);
        sp6P3 = (Spinner) rootView.findViewById(R.id.mod5_p3_sp6);
        sp7P3 = (Spinner) rootView.findViewById(R.id.mod5_p3_sp7);
        sp8P3 = (Spinner) rootView.findViewById(R.id.mod5_p3_sp8);
        sp9P3 = (Spinner) rootView.findViewById(R.id.mod5_p3_sp9);
        sp10P3 = (Spinner) rootView.findViewById(R.id.mod5_p3_sp10);
        sp11P3 = (Spinner) rootView.findViewById(R.id.mod5_p3_sp11);
        sp12P3 = (Spinner) rootView.findViewById(R.id.mod5_p3_sp12);

        lyt1P3 = (LinearLayout) rootView.findViewById(R.id.mod5_p3_lyt1);
        lyt2P3 = (LinearLayout) rootView.findViewById(R.id.mod5_p3_lyt2);
        lyt3P3 = (LinearLayout) rootView.findViewById(R.id.mod5_p3_lyt3);
        lyt4P3 = (LinearLayout) rootView.findViewById(R.id.mod5_p3_lyt4);
        lyt5P3 = (LinearLayout) rootView.findViewById(R.id.mod5_p3_lyt5);
        lyt6P3 = (LinearLayout) rootView.findViewById(R.id.mod5_p3_lyt6);
        lyt7P3 = (LinearLayout) rootView.findViewById(R.id.mod5_p3_lyt7);
        lyt8P3 = (LinearLayout) rootView.findViewById(R.id.mod5_p3_lyt8);
        lyt9P3 = (LinearLayout) rootView.findViewById(R.id.mod5_p3_lyt9);
        lyt10P3 = (LinearLayout) rootView.findViewById(R.id.mod5_p3_lyt10);
        lyt11P3 = (LinearLayout) rootView.findViewById(R.id.mod5_p3_lyt11);
        lyt12P3 = (LinearLayout) rootView.findViewById(R.id.mod5_p3_lyt12);

        edtEspecifiqueP3 = (EditText) rootView.findViewById(R.id.mod5_p3_edt);

        mod5_p4_lyt = (LinearLayout) rootView.findViewById(R.id.mod5_p4_lyt);
        lytP5 = (LinearLayout) rootView.findViewById(R.id.mod5_p5_lyt);

        ck1P4 = (CheckBox) rootView.findViewById(R.id.mod5_p4_ck1);
        ck2P4 = (CheckBox) rootView.findViewById(R.id.mod5_p4_ck2);
        ck3P4 = (CheckBox) rootView.findViewById(R.id.mod5_p4_ck3);
        ck4P4 = (CheckBox) rootView.findViewById(R.id.mod5_p4_ck4);
        ck5P4 = (CheckBox) rootView.findViewById(R.id.mod5_p4_ck5);
        ck6P4 = (CheckBox) rootView.findViewById(R.id.mod5_p4_ck6);
        ck7P4 = (CheckBox) rootView.findViewById(R.id.mod5_p4_ck7);
        ck8P4 = (CheckBox) rootView.findViewById(R.id.mod5_p4_ck8);


        sp1P4 = (Spinner) rootView.findViewById(R.id.mod5_p4_sp1);
        sp2P4 = (Spinner) rootView.findViewById(R.id.mod5_p4_sp2);
        sp3P4 = (Spinner) rootView.findViewById(R.id.mod5_p4_sp3);
        sp4P4 = (Spinner) rootView.findViewById(R.id.mod5_p4_sp4);
        sp5P4 = (Spinner) rootView.findViewById(R.id.mod5_p4_sp5);
        sp6P4 = (Spinner) rootView.findViewById(R.id.mod5_p4_sp6);
        sp7P4 = (Spinner) rootView.findViewById(R.id.mod5_p4_sp7);
        sp8P4 = (Spinner) rootView.findViewById(R.id.mod5_p4_sp8);


        lyt1P4 = (LinearLayout) rootView.findViewById(R.id.mod5_p4_lyt1);
        lyt2P4 = (LinearLayout) rootView.findViewById(R.id.mod5_p4_lyt2);
        lyt3P4 = (LinearLayout) rootView.findViewById(R.id.mod5_p4_lyt3);
        lyt4P4 = (LinearLayout) rootView.findViewById(R.id.mod5_p4_lyt4);
        lyt5P4 = (LinearLayout) rootView.findViewById(R.id.mod5_p4_lyt5);
        lyt6P4 = (LinearLayout) rootView.findViewById(R.id.mod5_p4_lyt6);
        lyt7P4 = (LinearLayout) rootView.findViewById(R.id.mod5_p4_lyt7);
        lyt8P4 = (LinearLayout) rootView.findViewById(R.id.mod5_p4_lyt8);

        ck1P5 = (CheckBox) rootView.findViewById(R.id.mod5_p5_ck1);
        ck2P5 = (CheckBox) rootView.findViewById(R.id.mod5_p5_ck2);
        ck3P5 = (CheckBox) rootView.findViewById(R.id.mod5_p5_ck3);
        ck4P5 = (CheckBox) rootView.findViewById(R.id.mod5_p5_ck4);
        ck5P5 = (CheckBox) rootView.findViewById(R.id.mod5_p5_ck5);
        ck6P5 = (CheckBox) rootView.findViewById(R.id.mod5_p5_ck6);

        return rootView;
    }



    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        edtEspecifiqueP3.setFilters(new InputFilter[]{new InputFilter.AllCaps()});
        sp1P3.setEnabled(false);
        sp12P3.setEnabled(false);

        final CheckBox[] checkBoxesP3 = {ck1P3,ck2P3, ck3P3, ck4P3, ck5P3, ck6P3, ck7P3,
                ck8P3, ck9P3, ck10P3, ck11P3, ck12P3};

        final Spinner[] spinnersP3 = {sp1P3, sp2P3, sp3P3, sp4P3, sp5P3, sp6P3, sp7P3,
                sp8P3, sp9P3, sp10P3, sp11P3, sp12P3};

        final LinearLayout[] layoutSpinnersP3 = {lyt1P3,lyt2P3, lyt3P3, lyt4P3, lyt5P3,
                lyt6P3, lyt7P3, lyt8P3, lyt9P3, lyt10P3, lyt11P3, lyt12P3};

        final CheckBox[] checkBoxesP4 = {ck1P4, ck2P4, ck3P4, ck4P4, ck5P4, ck6P4,
                ck7P4, ck8P4};

        final Spinner[] spinnersP4 = {sp1P4, sp2P4, sp3P4, sp4P4, sp5P4, sp6P4, sp7P4, sp8P4};

        final LinearLayout[] layoutSpinnersP4 = {lyt1P4, lyt2P4, lyt3P4, lyt4P4, lyt5P4, lyt6P4,
                lyt7P4, lyt8P4};

        final CheckBox[] checkBoxesP5 ={ck1P5,ck2P5,ck3P5,ck4P5,ck5P5,ck6P5};
        final CheckBox[] checkBoxesP5_1 ={ck2P5,ck3P5,ck4P5,ck5P5,ck6P5};


        for(int i = 0; i <checkBoxesP3.length ; i++) {
            final int posicion = 1;
            CheckBox checkBox = checkBoxesP3[i];
            spinnersP3[i].setEnabled(false);
            layoutSpinnersP3[i].setBackgroundResource(R.drawable.fondo_spinner_disabled);
            if(i!=11 && i!=0){
                final Spinner spinner = spinnersP3[i];
                final LinearLayout linearLayout = layoutSpinnersP3[i];
                checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if(b){
                            if(verificarCheck(spinnersP3)){
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

        for (int i = 0; i <spinnersP3.length ; i++) {
            final int posicion= i;
            final Spinner spinner = spinnersP3[i];
            spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> adapterView, View view, int pos, long l) {
                    switch (pos){
                        case 0: restaurarSpinner(checkBoxesP3,spinnersP3,layoutSpinnersP3);break;
                        case 1: validarSpiner(spinnersP3,layoutSpinnersP3,posicion,1); break;
                        case 2: validarSpiner(spinnersP3,layoutSpinnersP3,posicion,2); break;
                        case 3: validarSpiner(spinnersP3,layoutSpinnersP3,posicion,3); break;
                    }
                }
                @Override
                public void onNothingSelected(AdapterView<?> adapterView) {}
            });
        }

        if(!ck12P3.isChecked()){
            edtEspecifiqueP3.setText("");
            edtEspecifiqueP3.setBackgroundResource(R.drawable.cajas_de_texto_disabled);
            edtEspecifiqueP3.setEnabled(false);
            sp12P3.setSelection(0);
            lyt12P3.setBackgroundResource(R.drawable.fondo_spinner_disabled);
            sp12P3.setEnabled(false);
        }
        ck12P3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    edtEspecifiqueP3.setEnabled(true);
                    edtEspecifiqueP3.setBackgroundResource(R.drawable.fondo_edit_text);
                    if(verificarCheck(spinnersP3)){
                        sp12P3.setEnabled(false);
                        lyt12P3.setBackgroundResource(R.drawable.fondo_spinner_disabled);
                    }else{
                        sp12P3.setEnabled(true);
                        lyt12P3.setBackgroundResource(R.drawable.fondo_spinner);
                    }
                }else{
                    edtEspecifiqueP3.setText("");
                    edtEspecifiqueP3.setBackgroundResource(R.drawable.cajas_de_texto_disabled);
                    edtEspecifiqueP3.setEnabled(false);
                    sp12P3.setSelection(0);
                    lyt12P3.setBackgroundResource(R.drawable.fondo_spinner_disabled);
                    sp12P3.setEnabled(false);
                }
            }
        });
        if(!ck1P3.isChecked()){
            sp12P3.setSelection(0);
            lyt12P3.setBackgroundResource(R.drawable.fondo_spinner_disabled);
            sp12P3.setEnabled(false);
        }
        ck1P3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    lytP5.setVisibility(View.GONE);
                    if(verificarCheck(spinnersP3)){
                        sp1P3.setEnabled(false);
                        lyt1P3.setBackgroundResource(R.drawable.fondo_spinner_disabled);
                    }else{
                        sp1P3.setEnabled(true);
                        lyt1P3.setBackgroundResource(R.drawable.fondo_spinner);
                    }
                }else{
                    lytP5.setVisibility(View.VISIBLE);
                    sp1P3.setSelection(0);
                    lyt1P3.setBackgroundResource(R.drawable.fondo_spinner_disabled);
                    sp1P3.setEnabled(false);
                }
            }
        });


        for(int i = 0; i <checkBoxesP4.length ; i++) {
            final int posicion = 1;
            CheckBox checkBox = checkBoxesP4[i];
            spinnersP4[i].setEnabled(false);
            layoutSpinnersP4[i].setBackgroundResource(R.drawable.fondo_spinner_disabled);
            if(i!=18){
                final Spinner spinner = spinnersP4[i];
                final LinearLayout linearLayout = layoutSpinnersP4[i];
                checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if(b){
                            if(verificarCheck(spinnersP4)){
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

        for (int i = 0; i <spinnersP4.length ; i++) {
            final int posicion= i;
            final Spinner spinner = spinnersP4[i];
            spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> adapterView, View view, int pos, long l) {
                    switch (pos){
                        case 0: restaurarSpinner(checkBoxesP4,spinnersP4,layoutSpinnersP4);break;
                        case 1: validarSpiner(spinnersP4,layoutSpinnersP4,posicion,1); break;
                        case 2: validarSpiner(spinnersP4,layoutSpinnersP4,posicion,2); break;
                        case 3: validarSpiner(spinnersP4,layoutSpinnersP4,posicion,3); break;
                    }
                }
                @Override
                public void onNothingSelected(AdapterView<?> adapterView) {}
            });
        }

        ck1P5.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override

            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

                if (b) {
                    for (int i = 0; i < checkBoxesP5_1.length; i++) {
                        final CheckBox checkBox = checkBoxesP5_1[i];
                        checkBox.setEnabled(false);
                        checkBox.setChecked(false);
                    }

                }
                else {
                    for (int i = 0; i < checkBoxesP5_1.length; i++) {
                        final CheckBox checkBox = checkBoxesP5_1[i];
                        checkBox.setEnabled(true);


                    }
                }
            }
        });


        cargarDatos();

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
                if(sLista.size() == 2){
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
        if(sLista.size()==2) t=true;
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
        if(data.existeModulo5(idempresa)) {
            //si existe traigo el objeto
            modulo5 = data.getModulo5(idempresa);
            //saco los datos del objeto para llenarlos en los elementos del fragment
            //---------Pregunta 3-------------

            //Pregunta 3.1
            if (modulo5.getC5_P3_1_1().equals("1")) ck1P3.setChecked(true);
            if (modulo5.getC5_P3_1_1().equals("0")) ck1P3.setChecked(false);
            if (!modulo5.getC5_P3_2_1().equals("")) {
                sp1P3.setSelection(Integer.parseInt(modulo5.getC5_P3_2_1()));
            }
            //Pregunta 3.2
            if (modulo5.getC5_P3_1_2().equals("1")) ck2P3.setChecked(true);
            if (modulo5.getC5_P3_1_2().equals("0")) ck2P3.setChecked(false);
            if (!modulo5.getC5_P3_2_2().equals("")) {
                sp2P3.setSelection(Integer.parseInt(modulo5.getC5_P3_2_2()));
            }
            //Pregunta 3.3
            if (modulo5.getC5_P3_1_3().equals("1")) ck3P3.setChecked(true);
            if (modulo5.getC5_P3_1_3().equals("0")) ck3P3.setChecked(false);
            if (!modulo5.getC5_P3_2_3().equals("")) {
                sp3P3.setSelection(Integer.parseInt(modulo5.getC5_P3_2_3()));
            }
            //Pregunta 8.4
            if (modulo5.getC5_P3_1_4().equals("1")) ck4P3.setChecked(true);
            if (modulo5.getC5_P3_1_4().equals("0")) ck4P3.setChecked(false);
            if (!modulo5.getC5_P3_2_4().equals("")) {
                sp4P3.setSelection(Integer.parseInt(modulo5.getC5_P3_2_4()));
            }
            //Pregunta 8.5
            if (modulo5.getC5_P3_1_5().equals("1")) ck5P3.setChecked(true);
            if (modulo5.getC5_P3_1_5().equals("0")) ck5P3.setChecked(false);
            if (!modulo5.getC5_P3_2_5().equals("")) {
                sp5P3.setSelection(Integer.parseInt(modulo5.getC5_P3_2_5()));
            }
            //Pregunta 8.6
            if (modulo5.getC5_P3_1_6().equals("1")) ck6P3.setChecked(true);
            if (modulo5.getC5_P3_1_6().equals("0")) ck6P3.setChecked(false);
            if (!modulo5.getC5_P3_2_6().equals("")) {
                sp6P3.setSelection(Integer.parseInt(modulo5.getC5_P3_2_6()));
            }
            //Pregunta 8.7
            if (modulo5.getC5_P3_1_7().equals("1")) ck7P3.setChecked(true);
            if (modulo5.getC5_P3_1_7().equals("0")) ck7P3.setChecked(false);
            if (!modulo5.getC5_P3_2_7().equals("")) {
                sp7P3.setSelection(Integer.parseInt(modulo5.getC5_P3_2_7()));
            }
            //Pregunta 8.8
            if (modulo5.getC5_P3_1_8().equals("1")) ck8P3.setChecked(true);
            if (modulo5.getC5_P3_1_8().equals("0")) ck8P3.setChecked(false);
            if (!modulo5.getC5_P3_2_8().equals("")) {
                sp8P3.setSelection(Integer.parseInt(modulo5.getC5_P3_2_8()));
            }
            //Pregunta 8.9
            if (modulo5.getC5_P3_1_9().equals("1")) ck9P3.setChecked(true);
            if (modulo5.getC5_P3_1_9().equals("0")) ck9P3.setChecked(false);
            if (!modulo5.getC5_P3_2_9().equals("")) {
                sp9P3.setSelection(Integer.parseInt(modulo5.getC5_P3_2_9()));
            }
            //Pregunta 8.10
            if (modulo5.getC5_P3_1_10().equals("1")) ck10P3.setChecked(true);
            if (modulo5.getC5_P3_1_10().equals("0")) ck10P3.setChecked(false);
            if (!modulo5.getC5_P3_2_10().equals("")) {
                sp10P3.setSelection(Integer.parseInt(modulo5.getC5_P3_2_10()));
            }
            //Pregunta 8.11
            if (modulo5.getC5_P3_1_11().equals("1")) ck11P3.setChecked(true);
            if (modulo5.getC5_P3_1_11().equals("0")) ck11P3.setChecked(false);
            if (!modulo5.getC5_P3_2_11().equals("")) {
                sp11P3.setSelection(Integer.parseInt(modulo5.getC5_P3_2_11()));
            }
            //Pregunta 8.12
            if (modulo5.getC5_P3_1_12().equals("1")) ck12P3.setChecked(true);
            if (modulo5.getC5_P3_1_12().equals("0")) ck12P3.setChecked(false);
            if (!modulo5.getC5_P3_2_12().equals("")) {
                sp12P3.setSelection(Integer.parseInt(modulo5.getC5_P3_2_12()));
            }
            edtEspecifiqueP3.setText(modulo5.getC5_P3_1_12_0());
            //---------Pregunta 4-------------

            //Pregunta 3.1
            if (modulo5.getC5_P4_1_1().equals("1")) ck1P4.setChecked(true);
            if (modulo5.getC5_P4_1_1().equals("0")) ck1P4.setChecked(false);
            if (!modulo5.getC5_P4_2_1().equals("")) {
                sp1P4.setSelection(Integer.parseInt(modulo5.getC5_P4_2_1()));
            }
            //Pregunta 3.2
            if (modulo5.getC5_P4_1_2().equals("1")) ck2P4.setChecked(true);
            if (modulo5.getC5_P4_1_2().equals("0")) ck2P4.setChecked(false);
            if (!modulo5.getC5_P4_2_2().equals("")) {
                sp2P4.setSelection(Integer.parseInt(modulo5.getC5_P4_2_2()));
            }
            //Pregunta 3.3
            if (modulo5.getC5_P4_1_3().equals("1")) ck3P4.setChecked(true);
            if (modulo5.getC5_P4_1_3().equals("0")) ck3P4.setChecked(false);
            if (!modulo5.getC5_P4_2_3().equals("")) {
                sp3P4.setSelection(Integer.parseInt(modulo5.getC5_P4_2_3()));
            }
            //Pregunta 8.4
            if (modulo5.getC5_P4_1_4().equals("1")) ck4P4.setChecked(true);
            if (modulo5.getC5_P4_1_4().equals("0")) ck4P4.setChecked(false);
            if (!modulo5.getC5_P4_2_4().equals("")) {
                sp4P4.setSelection(Integer.parseInt(modulo5.getC5_P4_2_4()));
            }
            //Pregunta 8.5
            if (modulo5.getC5_P4_1_5().equals("1")) ck5P4.setChecked(true);
            if (modulo5.getC5_P4_1_5().equals("0")) ck5P4.setChecked(false);
            if (!modulo5.getC5_P4_2_5().equals("")) {
                sp5P4.setSelection(Integer.parseInt(modulo5.getC5_P4_2_5()));
            }
            //Pregunta 8.6
            if (modulo5.getC5_P4_1_6().equals("1")) ck6P4.setChecked(true);
            if (modulo5.getC5_P4_1_6().equals("0")) ck6P4.setChecked(false);
            if (!modulo5.getC5_P4_2_6().equals("")) {
                sp6P4.setSelection(Integer.parseInt(modulo5.getC5_P4_2_6()));
            }
            //Pregunta 8.7
            if (modulo5.getC5_P4_1_7().equals("1")) ck7P4.setChecked(true);
            if (modulo5.getC5_P4_1_7().equals("0")) ck7P4.setChecked(false);
            if (!modulo5.getC5_P4_2_7().equals("")) {
                sp7P4.setSelection(Integer.parseInt(modulo5.getC5_P4_2_7()));
            }
            //Pregunta 8.8
            if (modulo5.getC5_P4_1_8().equals("1")) ck8P4.setChecked(true);
            if (modulo5.getC5_P4_1_8().equals("0")) ck8P4.setChecked(false);
            if (!modulo5.getC5_P4_2_8().equals("")) {
                sp8P4.setSelection(Integer.parseInt(modulo5.getC5_P4_2_8()));
            }

            //---------Pregunta 5-------------

            //Pregunta 3.1
            if (modulo5.getC5_P5_1().equals("1")) ck1P5.setChecked(true);
            if (modulo5.getC5_P5_1().equals("0")) ck1P5.setChecked(false);

            //Pregunta 3.2
            if (modulo5.getC5_P5_2().equals("1")) ck2P5.setChecked(true);
            if (modulo5.getC5_P5_2().equals("0")) ck2P5.setChecked(false);

            //Pregunta 3.3
            if (modulo5.getC5_P5_3().equals("1")) ck3P5.setChecked(true);
            if (modulo5.getC5_P5_3().equals("0")) ck3P5.setChecked(false);

            //Pregunta 8.4
            if (modulo5.getC5_P5_4().equals("1")) ck4P5.setChecked(true);
            if (modulo5.getC5_P5_4().equals("0")) ck4P5.setChecked(false);

            //Pregunta 8.5
            if (modulo5.getC5_P5_5().equals("1")) ck5P5.setChecked(true);
            if (modulo5.getC5_P5_5().equals("0")) ck5P5.setChecked(false);

            //Pregunta 8.6
            if (modulo5.getC5_P5_6().equals("1")) ck6P5.setChecked(true);
            if (modulo5.getC5_P5_6().equals("0")) ck6P5.setChecked(false);

        }
        data.close();
    }


    public void guardarDatos(){
        data = new Data(context);
        data.open();
        if(data.existeModulo5(idempresa)){
            ContentValues contentValues = new ContentValues(53);
            contentValues.put(SQLConstantes.MODULO5_P3_1_1,C5_P3_1_1+"");
            contentValues.put(SQLConstantes.MODULO5_P3_1_2,C5_P3_1_2+"");
            contentValues.put(SQLConstantes.MODULO5_P3_1_3,C5_P3_1_3+"");
            contentValues.put(SQLConstantes.MODULO5_P3_1_4,C5_P3_1_4+"");
            contentValues.put(SQLConstantes.MODULO5_P3_1_5,C5_P3_1_5+"");
            contentValues.put(SQLConstantes.MODULO5_P3_1_6,C5_P3_1_6+"");
            contentValues.put(SQLConstantes.MODULO5_P3_1_7,C5_P3_1_7+"");
            contentValues.put(SQLConstantes.MODULO5_P3_1_8,C5_P3_1_8+"");
            contentValues.put(SQLConstantes.MODULO5_P3_1_9,C5_P3_1_9+"");
            contentValues.put(SQLConstantes.MODULO5_P3_1_10,C5_P3_1_10+"");
            contentValues.put(SQLConstantes.MODULO5_P3_1_11,C5_P3_1_11+"");
            contentValues.put(SQLConstantes.MODULO5_P3_1_12,C5_P3_1_12+"");
            contentValues.put(SQLConstantes.MODULO5_P3_2_1,C5_P3_2_1+"");
            contentValues.put(SQLConstantes.MODULO5_P3_2_2,C5_P3_2_2+"");
            contentValues.put(SQLConstantes.MODULO5_P3_2_3,C5_P3_2_3+"");
            contentValues.put(SQLConstantes.MODULO5_P3_2_4,C5_P3_2_4+"");
            contentValues.put(SQLConstantes.MODULO5_P3_2_5,C5_P3_2_5+"");
            contentValues.put(SQLConstantes.MODULO5_P3_2_6,C5_P3_2_6+"");
            contentValues.put(SQLConstantes.MODULO5_P3_2_7,C5_P3_2_7+"");
            contentValues.put(SQLConstantes.MODULO5_P3_2_8,C5_P3_2_8+"");
            contentValues.put(SQLConstantes.MODULO5_P3_2_9,C5_P3_2_9+"");
            contentValues.put(SQLConstantes.MODULO5_P3_2_10,C5_P3_2_10+"");
            contentValues.put(SQLConstantes.MODULO5_P3_2_11,C5_P3_2_11+"");
            contentValues.put(SQLConstantes.MODULO5_P3_2_12,C5_P3_2_12+"");
            contentValues.put(SQLConstantes.MODULO5_P3_1_12_0,C5_P3_1_12_0);

            contentValues.put(SQLConstantes.MODULO5_P4_1_1,C5_P4_1_1+"");
            contentValues.put(SQLConstantes.MODULO5_P4_1_2,C5_P4_1_2+"");
            contentValues.put(SQLConstantes.MODULO5_P4_1_3,C5_P4_1_3+"");
            contentValues.put(SQLConstantes.MODULO5_P4_1_4,C5_P4_1_4+"");
            contentValues.put(SQLConstantes.MODULO5_P4_1_5,C5_P4_1_5+"");
            contentValues.put(SQLConstantes.MODULO5_P4_1_6,C5_P4_1_6+"");
            contentValues.put(SQLConstantes.MODULO5_P4_1_7,C5_P4_1_7+"");
            contentValues.put(SQLConstantes.MODULO5_P4_1_8,C5_P4_1_8+"");
            contentValues.put(SQLConstantes.MODULO5_P4_2_1,C5_P4_2_1+"");
            contentValues.put(SQLConstantes.MODULO5_P4_2_2,C5_P4_2_2+"");
            contentValues.put(SQLConstantes.MODULO5_P4_2_3,C5_P4_2_3+"");
            contentValues.put(SQLConstantes.MODULO5_P4_2_4,C5_P4_2_4+"");
            contentValues.put(SQLConstantes.MODULO5_P4_2_5,C5_P4_2_5+"");
            contentValues.put(SQLConstantes.MODULO5_P4_2_6,C5_P4_2_6+"");
            contentValues.put(SQLConstantes.MODULO5_P4_2_7,C5_P4_2_7+"");
            contentValues.put(SQLConstantes.MODULO5_P4_2_8,C5_P4_2_8+"");

            contentValues.put(SQLConstantes.MODULO5_P5_1,C5_P5_1+"");
            contentValues.put(SQLConstantes.MODULO5_P5_2,C5_P5_2+"");
            contentValues.put(SQLConstantes.MODULO5_P5_3,C5_P5_3+"");
            contentValues.put(SQLConstantes.MODULO5_P5_4,C5_P5_4+"");
            contentValues.put(SQLConstantes.MODULO5_P5_5,C5_P5_5+"");
            contentValues.put(SQLConstantes.MODULO5_P5_6,C5_P5_6+"");

            data.actualizarModulo5(idempresa,contentValues);
        }else{
            //si no existe el elemento, lo construye para insertarlo
            modulo5 = new Modulo5();
            //llena el objeto a insertar
            modulo5.setMODULO5_ID(idempresa);
            modulo5.setC5_P3_1_1(C5_P3_1_1+"");
            modulo5.setC5_P3_1_2(C5_P3_1_2+"");
            modulo5.setC5_P3_1_3(C5_P3_1_3+"");
            modulo5.setC5_P3_1_4(C5_P3_1_4+"");
            modulo5.setC5_P3_1_5(C5_P3_1_5+"");
            modulo5.setC5_P3_1_6(C5_P3_1_6+"");
            modulo5.setC5_P3_1_7(C5_P3_1_7+"");
            modulo5.setC5_P3_1_8(C5_P3_1_8+"");
            modulo5.setC5_P3_1_9(C5_P3_1_9+"");
            modulo5.setC5_P3_1_10(C5_P3_1_10+"");
            modulo5.setC5_P3_1_11(C5_P3_1_11+"");
            modulo5.setC5_P3_1_12(C5_P3_1_12+"");

            modulo5.setC5_P3_2_1(C5_P3_2_1+"");
            modulo5.setC5_P3_2_2(C5_P3_2_2+"");
            modulo5.setC5_P3_2_3(C5_P3_2_3+"");
            modulo5.setC5_P3_2_4(C5_P3_2_4+"");
            modulo5.setC5_P3_2_5(C5_P3_2_5+"");
            modulo5.setC5_P3_2_6(C5_P3_2_6+"");
            modulo5.setC5_P3_2_7(C5_P3_2_7+"");
            modulo5.setC5_P3_2_8(C5_P3_2_8+"");
            modulo5.setC5_P3_2_9(C5_P3_2_9+"");
            modulo5.setC5_P3_2_10(C5_P3_2_10+"");
            modulo5.setC5_P3_2_11(C5_P3_2_11+"");
            modulo5.setC5_P3_2_12(C5_P3_2_12+"");

            modulo5.setC5_P3_1_12_0(C5_P3_1_12_0);

            modulo5.setC5_P4_1_1(C5_P4_1_1+"");
            modulo5.setC5_P4_1_2(C5_P4_1_2+"");
            modulo5.setC5_P4_1_3(C5_P4_1_3+"");
            modulo5.setC5_P4_1_4(C5_P4_1_4+"");
            modulo5.setC5_P4_1_5(C5_P4_1_5+"");
            modulo5.setC5_P4_1_6(C5_P4_1_6+"");
            modulo5.setC5_P4_1_7(C5_P4_1_7+"");
            modulo5.setC5_P4_1_8(C5_P4_1_8+"");
            modulo5.setC5_P4_2_1(C5_P4_2_1+"");
            modulo5.setC5_P4_2_2(C5_P4_2_2+"");
            modulo5.setC5_P4_2_3(C5_P4_2_3+"");
            modulo5.setC5_P4_2_4(C5_P4_2_4+"");
            modulo5.setC5_P4_2_5(C5_P4_2_5+"");
            modulo5.setC5_P4_2_6(C5_P4_2_6+"");
            modulo5.setC5_P4_2_7(C5_P4_2_7+"");
            modulo5.setC5_P4_2_8(C5_P4_2_8+"");

            modulo5.setC5_P5_1(C5_P5_1+"");
            modulo5.setC5_P5_2(C5_P5_2+"");
            modulo5.setC5_P5_3(C5_P5_3+"");
            modulo5.setC5_P5_4(C5_P5_4+"");
            modulo5.setC5_P5_5(C5_P5_5+"");
            modulo5.setC5_P5_6(C5_P5_6+"");
            data.insertarModulo5(modulo5);
        }
        data.close();
    }

    public void llenarMapaVariables(){

        //---------Pregunta 3-------------
        //Pregunta 8.1
        if(ck1P3.isChecked())C5_P3_1_1 = 1;
        else C5_P3_1_1 = 0;
        C5_P3_2_1=sp1P3.getSelectedItemPosition();
        //Pregunta 3.2
        if(ck2P3.isChecked())C5_P3_1_2 = 1;
        else C5_P3_1_2 = 0;
        C5_P3_2_2=sp2P3.getSelectedItemPosition();
        //Pregunta 3.3
        if(ck3P3.isChecked())C5_P3_1_3 = 1;
        else C5_P3_1_3 = 0;
        C5_P3_2_3=sp3P3.getSelectedItemPosition();
        //Pregunta 3.4
        if(ck4P3.isChecked())C5_P3_1_4 = 1;
        else C5_P3_1_4 = 0;
        C5_P3_2_4=sp4P3.getSelectedItemPosition();
        //Pregunta 3.5
        if(ck5P3.isChecked())C5_P3_1_5 = 1;
        else C5_P3_1_5 = 0;
        C5_P3_2_5=sp5P3.getSelectedItemPosition();
        //Pregunta 3.6
        if(ck6P3.isChecked())C5_P3_1_6 = 1;
        else C5_P3_1_6 = 0;
        C5_P3_2_6=sp6P3.getSelectedItemPosition();
        //Pregunta 3.7
        if(ck7P3.isChecked())C5_P3_1_7 = 1;
        else C5_P3_1_7 = 0;
        C5_P3_2_7=sp7P3.getSelectedItemPosition();
        //Pregunta 3.8
        if(ck8P3.isChecked())C5_P3_1_8 = 1;
        else C5_P3_1_8 = 0;
        C5_P3_2_8=sp8P3.getSelectedItemPosition();
        //Pregunta 3.9
        if(ck9P3.isChecked())C5_P3_1_9 = 1;
        else C5_P3_1_9 = 0;
        C5_P3_2_9=sp9P3.getSelectedItemPosition();
        //Pregunta 3.10
        if(ck10P3.isChecked())C5_P3_1_10 = 1;
        else C5_P3_1_10 = 0;
        C5_P3_2_10=sp10P3.getSelectedItemPosition();
        //Pregunta 3.11
        if(ck11P3.isChecked())C5_P3_1_11 = 1;
        else C5_P3_1_11 = 0;
        C5_P3_2_11=sp11P3.getSelectedItemPosition();
        //Pregunta 3.12
        if(ck12P3.isChecked())C5_P3_1_12 = 1;
        else C5_P3_1_12 = 0;
        C5_P3_2_12=sp12P3.getSelectedItemPosition();
        C5_P3_1_12_0 = edtEspecifiqueP3.getText().toString();

        //---------Pregunta 4-------------
        //Pregunta 4.1
        if(ck1P4.isChecked())C5_P4_1_1 = 1;
        else C5_P4_1_1 = 0;
        C5_P4_2_1=sp1P4.getSelectedItemPosition();
        //Pregunta 4.2
        if(ck2P4.isChecked())C5_P4_1_2 = 1;
        else C5_P4_1_2 = 0;
        C5_P4_2_2=sp2P4.getSelectedItemPosition();
        //Pregunta 4.3
        if(ck3P4.isChecked())C5_P4_1_3 = 1;
        else C5_P4_1_3 = 0;
        C5_P4_2_3=sp3P4.getSelectedItemPosition();
        //Pregunta 4.4
        if(ck4P4.isChecked())C5_P4_1_4 = 1;
        else C5_P4_1_4 = 0;
        C5_P4_2_4=sp4P4.getSelectedItemPosition();
        //Pregunta 4.5
        if(ck5P4.isChecked())C5_P4_1_5 = 1;
        else C5_P4_1_5 = 0;
        C5_P4_2_5=sp5P4.getSelectedItemPosition();
        //Pregunta 4.6
        if(ck6P4.isChecked())C5_P4_1_6 = 1;
        else C5_P4_1_6 = 0;
        C5_P4_2_6=sp6P4.getSelectedItemPosition();
        //Pregunta 4.7
        if(ck7P4.isChecked())C5_P4_1_7 = 1;
        else C5_P4_1_7 = 0;
        C5_P4_2_7=sp7P4.getSelectedItemPosition();
        //Pregunta 4.8
        if(ck8P4.isChecked())C5_P4_1_8 = 1;
        else C5_P4_1_8 = 0;
        C5_P4_2_8=sp8P4.getSelectedItemPosition();

        //---------Pregunta 5-------------
        //Pregunta 5.1
        if(ck1P5.isChecked())C5_P5_1 = 1;
        else C5_P5_1 = 0;
        //Pregunta 5.2
        if(ck2P5.isChecked())C5_P5_2 = 1;
        else C5_P5_2 = 0;
        //Pregunta 5.3
        if(ck3P5.isChecked())C5_P5_3 = 1;
        else C5_P5_3 = 0;
        //Pregunta 5.4
        if(ck4P5.isChecked())C5_P5_4 = 1;
        else C5_P5_4 = 0;
        //Pregunta 5.3
        if(ck5P5.isChecked())C5_P5_5 = 1;
        else C5_P5_5 = 0;
        //Pregunta 5.4
        if(ck6P5.isChecked())C5_P5_6 = 1;
        else C5_P5_6 = 0;

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
        if( (posNinguna!=-1 && checkBoxs[posNinguna]==1 ) || checks==1 && spnTotal==1 || checks>=2 && spnTotal==3 || checks>=3 && spnTotal==6 ){
            valor=false;
        }else  valor=true;

        return valor;
    }

    public boolean validar(){
        //revisarcampos
        boolean valido = true;
        boolean  vC5_P5 =true ;
        llenarMapaVariables();

        //pregunta 3
        Integer[] checkBoxsP3= {C5_P3_1_1,C5_P3_1_2,C5_P3_1_3,C5_P3_1_4,C5_P3_1_5,C5_P3_1_6,C5_P3_1_7,
                    C5_P3_1_8,C5_P3_1_9,C5_P3_1_10,C5_P3_1_11,C5_P3_1_12};
        Integer[] spinners= {C5_P3_2_1,C5_P3_2_2,C5_P3_2_3,C5_P3_2_4,C5_P3_2_5,C5_P3_2_6,C5_P3_2_7,
                    C5_P3_2_8,C5_P3_2_9,C5_P3_2_10,C5_P3_2_11,C5_P3_2_12};

        //pregunta 4
        Integer[] checkBoxsP4= {C5_P4_1_1,C5_P4_1_2,C5_P4_1_3,C5_P4_1_4,C5_P4_1_5,C5_P4_1_6,C5_P4_1_7,
                C5_P4_1_8};
        Integer[] spinners4= {C5_P4_2_1,C5_P4_2_2,C5_P4_2_3,C5_P4_2_4,C5_P4_2_5,C5_P4_2_6,C5_P4_2_7,
                C5_P4_2_8};

        //pregunta 5
        Integer[] checkBoxesP5 ={C5_P5_1,C5_P5_2,C5_P5_3,C5_P5_4,C5_P5_5,C5_P5_6};
        for (Integer i: checkBoxesP5  ) {
            if(i==1)vC5_P5=false;
        }

        if(validarGuardadoSpiner(checkBoxsP3,spinners,-1)){
            mostrarMensaje("Pregunta 3: Debe ingresar datos válidos ");
            valido=false;
        }else if(C5_P3_1_12!=0 && (C5_P3_1_12_0.equals("") || C5_P3_1_12_0.trim().length()<3 )){
            mostrarMensaje("Pregunta 3 opción 12: Debe registrar información válida en Especifique ");
            valido=false;
        }else if(validarGuardadoSpiner(checkBoxsP4,spinners4,-1)){
            mostrarMensaje("Pregunta 4: Debe ingresar datos válidos ");
            valido=false;
        }else if(C5_P3_1_1!=1 && vC5_P5){
            mostrarMensaje("Pregunta 5: Seleccione una o más opciones ");
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
