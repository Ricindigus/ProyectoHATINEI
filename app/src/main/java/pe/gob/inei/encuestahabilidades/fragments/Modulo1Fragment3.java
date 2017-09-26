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
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.util.Log;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.ArrayList;

import pe.gob.inei.encuestahabilidades.NumericKeyBoardTransformationMethod;
import pe.gob.inei.encuestahabilidades.R;
import pe.gob.inei.encuestahabilidades.modelo.Data;
import pe.gob.inei.encuestahabilidades.modelo.SQLConstantes;
import pe.gob.inei.encuestahabilidades.pojos.BaseDatos;
import pe.gob.inei.encuestahabilidades.pojos.Marco;
import pe.gob.inei.encuestahabilidades.pojos.Modulo1;

/**
 * A simple {@link Fragment} subclass.
 */
public class Modulo1Fragment3 extends Fragment {
    private LinearLayout lytP8;
    private LinearLayout lytP9;
    private LinearLayout lytP10;
    private LinearLayout lytP11;
    private LinearLayout lytP12;
    private LinearLayout mod1_p11_lytEdit1;
    private LinearLayout mod1_p11_lytEdit2;
    private RadioGroup rgP11;
    private EditText mod1_p11_edt1;
    private EditText mod1_p11_edt2;

    private TextView txtPregunta11;
    private TextView txtPregunta12;

    private int[] arreglosDepartamentos  = {
            R.array.D_AMAZONAS, R.array.D_ANCASH, R.array.D_APURIMAC, R.array.D_AREQUIPA,
            R.array.D_AYACUCHO, R.array.D_CAJAMARCA, R.array.D_CALLAO, R.array.D_CUSCO,
            R.array.D_HUANCAVELICA, R.array.D_HUANUCO, R.array.D_ICA, R.array.D_JUNIN,
            R.array.D_LA_LIBERTAD, R.array.D_LAMBAYEQUE, R.array.D_LIMA, R.array.D_LORETO,
            R.array.D_MADRE_DE_DIOS, R.array.D_MOQUEGUA, R.array.D_PASCO, R.array.D_PIURA,
            R.array.D_PUNO, R.array.D_SAN_MARTIN, R.array.D_TACNA, R.array.D_TUMBES, R.array.D_UCAYALI
    };

    private EditText edt1P12;
    private EditText edt2P12;
    private EditText edt3P12;
    private EditText edt4P12;
    private EditText edt5P12;
    private EditText edt6P12;
    private EditText edt7P12;
    private EditText edt8P12;

    private LinearLayout lytFondoSpinner;
    private LinearLayout lytEdit1;
    private LinearLayout lytEdit2;
    private LinearLayout lytObservaciones1;
    private LinearLayout lytSpP12;
    private LinearLayout lytSpDepartamento;
    private LinearLayout lytSpProvincia;
    private LinearLayout lytSpDistrito;



    private RadioGroup rgP8;
    private RadioGroup rgP10;

    private EditText edtP9;
    private EditText edtObservaciones;

    private RadioGroup rgAnio;

    private Spinner spTipoVia;
    private LinearLayout lytFragment3;

    private CheckBox mod1_p12_ck;

    private Spinner spDepartamentoP12;
    private Spinner spProvinciaP12;
    private Spinner spDistritoP12;

    private LinearLayout lytSpDepartamentoP12;
    private LinearLayout lytSpProvinciaP12;
    private LinearLayout lytSpDistritoP12;

    private TextView mod1_p9_txt9_1;

    private String idempresa;
    private Modulo1 modulo1;
    private Context context;
    private Data data;
    private String[] distritos;

    private int C1_P8;
    private String C1_P9;
    private int C1_P10;
    private int C1_P11;
    private String C1_P11_1;
    private String C1_P11_2;
    private int C1_P12_NO;
    private int C1_P12_TIPVIA;
    private String C1_P12_NOMVIA ;
    private String C1_P12_NROPTA;
    private String C1_P12_BLOCK;
    private String C1_P12_INT;
    private String C1_P12_PISO;
    private String C1_P12_MZA;
    private String C1_P12_LOTE;
    private String C1_P12_KM;
    private int C1_P12_CCDD;
    private int C1_P12_CCPP;
    private int C1_P12_CCDI;
    private String OBS_MOD_I;

    public Modulo1Fragment3() {
        // Required empty public constructor
    }

    @SuppressLint("ValidFragment")
    public Modulo1Fragment3(String idempresa, Context context) {
        this.idempresa = idempresa;
        this.context = context;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_modulo1_fragment3, container, false);
        lytP8 = (LinearLayout) rootView.findViewById(R.id.mod1_p8_lyt);
        lytP9 = (LinearLayout) rootView.findViewById(R.id.mod1_p9_lyt);
        lytP10 = (LinearLayout) rootView.findViewById(R.id.mod1_p10_lyt);
        lytP11 = (LinearLayout) rootView.findViewById(R.id.mod1_p11_lyt);
        mod1_p11_lytEdit1 = (LinearLayout) rootView.findViewById(R.id.mod1_p11_lytEdit1);
        mod1_p11_lytEdit2 = (LinearLayout) rootView.findViewById(R.id.mod1_p11_lytEdit2);
        lytP12 = (LinearLayout) rootView.findViewById(R.id.mod1_p12_lyt);
        edtP9 = (EditText) rootView.findViewById(R.id.mod1_p9_edt);
        rgP8 = (RadioGroup) rootView.findViewById(R.id.mod1_p8_rg);
        rgP10 = (RadioGroup) rootView.findViewById(R.id.mod1_p10_rg);
        rgP11 = (RadioGroup) rootView.findViewById(R.id.mod1_p11_rg);
        lytFragment3 = (LinearLayout) rootView.findViewById(R.id.mod1_layoutFragment3);



        spTipoVia = (Spinner) rootView.findViewById(R.id.mod1_p12_sp);
        lytSpP12 = (LinearLayout) rootView.findViewById(R.id.mod1_p12_lytFondoSpVia);

        lytSpDepartamento = (LinearLayout) rootView.findViewById(R.id.mod1_p12_lytSpDepartamentos);
        lytSpProvincia = (LinearLayout) rootView.findViewById(R.id.mod1_p12_lytSpProvincia);
        lytSpDistrito = (LinearLayout) rootView.findViewById(R.id.mod1_p12_lytSpDistrito);

        mod1_p11_edt1 = (EditText) rootView.findViewById(R.id.mod1_p11_edt1);
        mod1_p11_edt2 = (EditText) rootView.findViewById(R.id.mod1_p11_edt2);
        edt1P12 = (EditText) rootView.findViewById(R.id.mod1_p12_edt1);
        edt2P12 = (EditText) rootView.findViewById(R.id.mod1_p12_edt2);
        edt3P12 = (EditText) rootView.findViewById(R.id.mod1_p12_edt3);
        edt4P12 = (EditText) rootView.findViewById(R.id.mod1_p12_edt4);
        edt5P12 = (EditText) rootView.findViewById(R.id.mod1_p12_edt5);
        edt6P12 = (EditText) rootView.findViewById(R.id.mod1_p12_edt6);
        edt7P12 = (EditText) rootView.findViewById(R.id.mod1_p12_edt7);
        edt8P12 = (EditText) rootView.findViewById(R.id.mod1_p12_edt8);


        spDepartamentoP12 = (Spinner) rootView.findViewById(R.id.mod1_p12_spDepartamentos);
        spProvinciaP12 = (Spinner) rootView.findViewById(R.id.mod1_p12_spProvincia);
        spDistritoP12 = (Spinner) rootView.findViewById(R.id.mod1_p12_spDistrito);

        lytSpDepartamentoP12 = (LinearLayout) rootView.findViewById(R.id.mod1_p12_lytSpDepartamentos);
        lytSpProvinciaP12 = (LinearLayout) rootView.findViewById(R.id.mod1_p12_lytSpProvincia);
        lytSpDistritoP12 = (LinearLayout) rootView.findViewById(R.id.mod1_p12_lytSpDistrito);

        mod1_p12_ck = (CheckBox) rootView.findViewById(R.id.mod1_p12_ck);
        edtObservaciones = (EditText) rootView.findViewById(R.id.edtObservaciones);
        lytObservaciones1 = (LinearLayout) rootView.findViewById(R.id.mod1_observaciones);
        distritos = getResources().getStringArray(R.array.LIMA_DISTRITO);
        //mod1_p9_txt9_1 = (TextView) rootView.findViewById(R.id.mod1_p9_txt9_1);

        return rootView;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        mod1_p11_edt1.setTransformationMethod(new NumericKeyBoardTransformationMethod());
        mod1_p11_edt2.setTransformationMethod(new NumericKeyBoardTransformationMethod());
        rgP11.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, @IdRes int i) {
                switch (i){
                    case R.id.mod1_p11_rbSi:
                        lytP12.setVisibility(View.VISIBLE);
                        mod1_p11_edt1.setText("");
                        mod1_p11_lytEdit1.setVisibility(View.GONE);
                        mod1_p11_lytEdit2.setVisibility(View.VISIBLE);
                        mod1_p11_edt2.requestFocus();
                        break;
                    case R.id.mod1_p11_rbNo:
//                        mod1_p11_edt2.setText("");
//                        mod1_p11_lytEdit2.setVisibility(View.GONE);
                        mod1_p11_lytEdit2.setVisibility(View.VISIBLE);
                        mod1_p11_lytEdit1.setVisibility(View.VISIBLE);
                        mod1_p11_edt1.requestFocus();
                        break;
                }
            }
        });

        mod1_p11_edt1.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View view, int keyCode, KeyEvent keyEvent) {
                if ((keyEvent.getAction() == KeyEvent.ACTION_DOWN) &&
                        (keyCode == KeyEvent.KEYCODE_ENTER)) {
                    lytP11.requestFocus();
                    ocultarTeclado(lytP11);
                    return true;
                }
                return false;
            }
        });
        mod1_p11_edt2.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View view, int keyCode, KeyEvent keyEvent) {
                if ((keyEvent.getAction() == KeyEvent.ACTION_DOWN) &&
                        (keyCode == KeyEvent.KEYCODE_ENTER)) {
                    lytP11.requestFocus();
                    ocultarTeclado(lytP11);
                    return true;
                }
                return false;
            }
        });

        mod1_p11_edt1.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            @Override
            public void afterTextChanged(Editable editable) {
                int despues = 0;
                int valorMeses = 0;
                if(!mod1_p11_edt2.getText().toString().equals("")) valorMeses = Integer.parseInt(mod1_p11_edt2.getText().toString());
                if(!editable.toString().equals("")){despues = Integer.parseInt(editable.toString());}
                if((despues * 12 + valorMeses) > 36) {
                    lytP12.setVisibility(View.GONE);
                    spTipoVia.setSelection(0);
                    edt1P12.setText("");
                    edt2P12.setText("");
                    edt3P12.setText("");
                    edt4P12.setText("");
                    edt5P12.setText("");
                    edt6P12.setText("");
                    edt7P12.setText("");
                    edt8P12.setText("");
                    spDistritoP12.setSelection(0);
                    spProvinciaP12.setSelection(0);
                    spDepartamentoP12.setSelection(0);
                }else{
                    lytP12.setVisibility(View.VISIBLE);
                }
            }
        });
        mod1_p11_edt2.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            @Override
            public void afterTextChanged(Editable editable) {
                int despues = 0;
                int valorAnios = 0;
                if(!mod1_p11_edt1.getText().toString().equals("")) valorAnios = Integer.parseInt(mod1_p11_edt1.getText().toString());
                if(!editable.toString().equals("")){despues = Integer.parseInt(editable.toString());}
                if((valorAnios * 12 + despues) > 36) {
                    lytP12.setVisibility(View.GONE);
                    spTipoVia.setSelection(0);
                    edt1P12.setText("");
                    edt2P12.setText("");
                    edt3P12.setText("");
                    edt4P12.setText("");
                    edt5P12.setText("");
                    edt6P12.setText("");
                    edt7P12.setText("");
                    edt8P12.setText("");
                    spDistritoP12.setSelection(0);
                    spProvinciaP12.setSelection(0);
                    spDepartamentoP12.setSelection(0);
                }else{
                    lytP12.setVisibility(View.VISIBLE);
                }
            }
        });

        final EditText[] cajasDeTexto = {edt1P12, edt2P12, edt3P12, edt4P12, edt5P12, edt6P12,
                edt7P12, edt8P12};

        mod1_p12_ck.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    spTipoVia.setSelection(0);
//                    spDepartamentoP12.setSelection(0);
//                    spProvinciaP12.setSelection(0);
//                    spDistritoP12.setSelection(0);
                    spTipoVia.setEnabled(false);
//                    spDepartamentoP12.setEnabled(false);
//                    spProvinciaP12.setEnabled(false);
//                    spDistritoP12.setEnabled(false);
                    spDistritoP12.setOnItemSelectedListener(null);
                    spProvinciaP12.setOnItemSelectedListener(null);
                    spDepartamentoP12.setOnItemSelectedListener(null);
                    spDepartamentoP12.setSelection(0);
                    spProvinciaP12.setSelection(0);
                    spDistritoP12.setSelection(0);
//                    cargarUbigeoInicial();
                    spDistritoP12.setEnabled(false);
                    spProvinciaP12.setEnabled(false);
                    spDepartamentoP12.setEnabled(false);
                    lytSpP12.setBackgroundResource(R.drawable.fondo_spinner_disabled);
                    lytSpDepartamento.setBackgroundResource(R.drawable.fondo_spinner_disabled);
                    lytSpProvincia.setBackgroundResource(R.drawable.fondo_spinner_disabled);
                    lytSpDistrito.setBackgroundResource(R.drawable.fondo_spinner_disabled);
                    for (int j = 0; j <cajasDeTexto.length ; j++) {
                        EditText editText = cajasDeTexto[j];
                        editText.setEnabled(false);
                        editText.setText("");
                        editText.setBackgroundResource(R.drawable.cajas_de_texto_disabled);
                    }
                }else{
                    spTipoVia.setEnabled(true);
//                    spDepartamentoP12.setEnabled(true);
//                    spProvinciaP12.setEnabled(true);
//                    spDistritoP12.setEnabled(true);
                    spDistritoP12.setEnabled(true);
                    spProvinciaP12.setEnabled(true);
                    spDepartamentoP12.setEnabled(true);
                    spDistritoP12.setOnItemSelectedListener(null);
                    spProvinciaP12.setOnItemSelectedListener(null);
                    spDepartamentoP12.setOnItemSelectedListener(null);
                    lytSpP12.setBackgroundResource(R.drawable.fondo_spinner);
                    lytSpDepartamento.setBackgroundResource(R.drawable.fondo_spinner);
                    lytSpProvincia.setBackgroundResource(R.drawable.fondo_spinner);
                    lytSpDistrito.setBackgroundResource(R.drawable.fondo_spinner);
                    for (int j = 0; j <cajasDeTexto.length ; j++) {
                        EditText editText = cajasDeTexto[j];
                        editText.setEnabled(true);
                        editText.setBackgroundResource(R.drawable.cajas_de_texto);
                    }
                }
            }
        });


        edtObservaciones.setHorizontallyScrolling(false);
        edtObservaciones.setMaxLines(Integer.MAX_VALUE);
        rgP8.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, @IdRes int i) {

                switch (i){
                    case R.id.mod1_p8_rb1:
                        edtP9.setText("");
                        rgP10.clearCheck();
                        lytP9.setVisibility(View.GONE);
                        lytP10.setVisibility(View.GONE);
                        lytP11.requestFocus();
                        break;
                    case R.id.mod1_p8_rb2:break;
                    case R.id.mod1_p8_rb3:break;
                    case R.id.mod1_p8_rb4:break;
                }
                if(i == R.id.mod1_p8_rb2 || i == R.id.mod1_p8_rb3 || i == R.id.mod1_p8_rb4){
                    lytP9.setVisibility(View.VISIBLE);
                    lytP10.setVisibility(View.VISIBLE);
                    lytP9.requestFocus();
                }
            }
        });

        edtP9.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View view, int keyCode, KeyEvent keyEvent) {
                if ((keyEvent.getAction() == KeyEvent.ACTION_DOWN) &&
                        (keyCode == KeyEvent.KEYCODE_ENTER)) {
                    lytP9.requestFocus();
                    ocultarTeclado(lytP9);
                    return true;
                }
                return false;
            }
        });


        edtP9.setTransformationMethod(new NumericKeyBoardTransformationMethod());



        spTipoVia.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int pos, long l) {

                switch (pos){
                    case 1:break;
                    case 2:break;
                    case 3:break;
                    case 4:break;
                    case 5:break;
                    case 6:break;
                    case 7:break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        spDepartamentoP12.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == MotionEvent.ACTION_UP) {
                    spDepartamentoP12.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        @Override
                        public void onItemSelected(AdapterView<?> adapterView, View view, final int pos, long l) {
                            if(pos != 0){
                                final String[] provincias = context.getResources().getStringArray(arreglosDepartamentos[pos-1]);
                                cargarSpinerProvincias(provincias);
                            }else{
                                String[] p = {};
                                cargarSpinerProvincias(p);
                                ArrayList<String> d = new ArrayList<String>();
                                cargarSpinerDistritos(d);
                            }
                        }
                        @Override
                        public void onNothingSelected(AdapterView<?> adapterView) {}
                    });

                    spProvinciaP12.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        @Override
                        public void onItemSelected(AdapterView<?> adapterView, View view, final int pos, long l) {
                            if(pos!=0){
                                data = new Data(context);
                                data.open();
                                String idUbi = checkDigito(spDepartamentoP12.getSelectedItemPosition()) + checkDigito(pos);
                                final ArrayList<String> ubis = data.getUbigeos(idUbi);
                                data.close();
                                cargarSpinerDistritos(ubis);
                            }else{
                                ArrayList<String> d = new ArrayList<String>();
                                cargarSpinerDistritos(d);
                            }
                        }
                        @Override
                        public void onNothingSelected(AdapterView<?> adapterView) {}
                    });
                }
                return false;
            }
        });


        spProvinciaP12.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == MotionEvent.ACTION_UP) {
                    spProvinciaP12.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        @Override
                        public void onItemSelected(AdapterView<?> adapterView, View view, final int pos, long l) {
                            data = new Data(context);
                            data.open();
                            String idUbi = checkDigito(spDepartamentoP12.getSelectedItemPosition()) + checkDigito(pos);
                            final ArrayList<String> ubis = data.getUbigeos(idUbi);
                            data.close();
                            cargarSpinerDistritos(ubis);
                        }

                        @Override
                        public void onNothingSelected(AdapterView<?> adapterView) {}
                    });
                }
                return false;
            }
        });

        edt1P12.setFilters(new InputFilter[]{new InputFilter.AllCaps()});
        edt2P12.setFilters(new InputFilter[]{new InputFilter.AllCaps()});
        edt3P12.setFilters(new InputFilter[]{new InputFilter.AllCaps()});
        edt4P12.setFilters(new InputFilter[]{new InputFilter.AllCaps()});
        edt5P12.setFilters(new InputFilter[]{new InputFilter.AllCaps()});
        edt6P12.setFilters(new InputFilter[]{new InputFilter.AllCaps()});
        edt7P12.setFilters(new InputFilter[]{new InputFilter.AllCaps()});
        edt8P12.setFilters(new InputFilter[]{new InputFilter.AllCaps()});

        edtObservaciones.setFilters(new InputFilter[]{new InputFilter.AllCaps()});

        cargarDatosIniciales();
        lytFragment3.requestFocus();
        ocultarTeclado(lytFragment3);
    }

    public void ocultarTeclado(View view){
        InputMethodManager mgr = (InputMethodManager) getActivity().getSystemService(Context.INPUT_METHOD_SERVICE);
        mgr.hideSoftInputFromWindow(view.getWindowToken(), 0);
    }

    public void mostrarTeclado(){
        InputMethodManager imm = (InputMethodManager) getActivity().getSystemService(getActivity().INPUT_METHOD_SERVICE);
        imm.toggleSoftInput(InputMethodManager.SHOW_FORCED, 0);
    }

    public void cargarDatosIniciales(){
        Thread thread = new Thread(){
            @Override
            public void run() {
                final String[] departamentos = context.getResources().getStringArray(R.array.DEPARTAMENTOS);
                data = new Data(context);
                data.open();
                modulo1 = data.getModulo1(idempresa);
                if(!modulo1.getC1_P12_CCDD().equals("")){
                    final String[] provincias = context.getResources().getStringArray(arreglosDepartamentos[Integer.parseInt(modulo1.getC1_P12_CCDD())-1]);
                    String idUbi = checkDigito(Integer.parseInt(modulo1.getC1_P12_CCDD())) + checkDigito(Integer.parseInt(modulo1.getC1_P12_CCPP()));
                    final ArrayList<String> distritos = data.getUbigeos(idUbi);
                    getActivity().runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            cargarSpinerDepartamentos(departamentos);
                            cargarSpinerProvincias(provincias);
                            cargarSpinerDistritos(distritos);
                            spDepartamentoP12.setSelection(Integer.parseInt(modulo1.getC1_P12_CCDD()));
                            spProvinciaP12.setSelection(Integer.parseInt(modulo1.getC1_P12_CCPP()));
                            spDistritoP12.setSelection(Integer.parseInt(modulo1.getC1_P12_CCDI()));
                            cargarDatos();
                        }
                    });
                }else{
                    getActivity().runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            cargarSpinerDepartamentos(departamentos);
                            cargarDatos();
                        }
                    });
                }
                data.close();
            }
        };
        thread.start();
    }

//    public void cargarUbigeoInicial(){
//        Thread thread = new Thread(){
//            @Override
//            public void run() {
//                final String[] departamentos = context.getResources().getStringArray(R.array.DEPARTAMENTOS);
//                data = new Data(context);
//                data.open();
//                final Marco marco = data.getMarco(idempresa);
//                final String[] provincias = context.getResources().getStringArray(arreglosDepartamentos[Integer.parseInt(marco.getCCDD())-1]);
//                String idUbi = checkDigito(Integer.parseInt(marco.getCCDD())) + checkDigito(Integer.parseInt(marco.getCCPP()));
//                final ArrayList<String> distritos = data.getUbigeos(idUbi);
//                data.close();
//                getActivity().runOnUiThread(new Runnable() {
//                    @Override
//                    public void run() {
//                        cargarSpinerDepartamentos(departamentos);
//                        cargarSpinerProvincias(provincias);
//                        cargarSpinerDistritos(distritos);
//                        spDepartamentoP12.setSelection(Integer.parseInt(marco.getCCDD()));
//                        spProvinciaP12.setSelection(Integer.parseInt(marco.getCCPP()));
//                        spDistritoP12.setSelection(Integer.parseInt(marco.getCCDI()));
//                    }
//                });
//            }
//        };
//        thread.start();
//    }
    public String checkDigito (int number) {
        return number <= 9 ? "0" + number : String.valueOf(number);
    }
    public void cargarDatos(){
        data = new Data(context);
        data.open();
        //verifico si ya existe un objeto con datos llenados previamente
        modulo1 = data.getModulo1(idempresa);
        if(!modulo1.getC1_P8().equals(""))
            ((RadioButton)rgP8.getChildAt(Integer.parseInt(modulo1.getC1_P8()))).setChecked(true);
        edtP9.setText(modulo1.getC1_P9());
        if(!modulo1.getC1_P10().equals("") && !modulo1.getC1_P10().equals("-1"))
            ((RadioButton)rgP10.getChildAt(Integer.parseInt(modulo1.getC1_P10()))).setChecked(true);
        if(!modulo1.getC1_P11().equals(""))
            ((RadioButton)rgP11.getChildAt(Integer.parseInt(modulo1.getC1_P11()))).setChecked(true);
        mod1_p11_edt1.setText(modulo1.getC1_P11_1());
        mod1_p11_edt2.setText(modulo1.getC1_P11_2());
        if(modulo1.getC1_P12_NO().equals("1")) mod1_p12_ck.setChecked(true);
        if(!modulo1.getC1_P12_TIPVIA().equals(""))
            spTipoVia.setSelection(Integer.parseInt(modulo1.getC1_P12_TIPVIA()));
        edt1P12.setText(modulo1.getC1_P12_NOMVIA());
        edt2P12.setText(modulo1.getC1_P12_NROPTA());
        edt3P12.setText(modulo1.getC1_P12_BLOCK());
        edt4P12.setText(modulo1.getC1_P12_INT());
        edt5P12.setText(modulo1.getC1_P12_PISO());
        edt6P12.setText(modulo1.getC1_P12_MZA());
        edt7P12.setText(modulo1.getC1_P12_LOTE());
        edt8P12.setText(modulo1.getC1_P12_KM());
        edtObservaciones.setText(modulo1.getOBS_MOD_I());
        data.close();
    }
    public void cargarSpinerDepartamentos(String[] datos){
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(context, android.R.layout.simple_spinner_item,datos);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spDepartamentoP12.setAdapter(adapter);
    }

    public void cargarSpinerProvincias(String[] datos){
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(context, android.R.layout.simple_spinner_item,datos);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spProvinciaP12.setAdapter(adapter);
    }

    public void cargarSpinerDistritos(ArrayList<String> datos){
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(context, android.R.layout.simple_spinner_item,datos);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spDistritoP12.setAdapter(adapter);
    }
    public void llenarMapaVariables(){
        C1_P8 = rgP8.indexOfChild(rgP8.findViewById(rgP8.getCheckedRadioButtonId()));
        C1_P9 = edtP9.getText().toString();
        if(C1_P8 != 0) C1_P10 = rgP10.indexOfChild(rgP10.findViewById(rgP10.getCheckedRadioButtonId()));
        C1_P11 = rgP11.indexOfChild(rgP11.findViewById(rgP11.getCheckedRadioButtonId()));
        C1_P11_1 = mod1_p11_edt1.getText().toString();
        C1_P11_2 = mod1_p11_edt2.getText().toString();
        if(mod1_p12_ck.isChecked())C1_P12_NO = 1;
        else C1_P12_NO = 0;

        if(spTipoVia.isEnabled()){
            C1_P12_TIPVIA = spTipoVia.getSelectedItemPosition();
            C1_P12_NOMVIA = edt1P12.getText().toString();
            C1_P12_NROPTA = edt2P12.getText().toString();
            C1_P12_BLOCK = edt3P12.getText().toString();
            C1_P12_INT  = edt4P12.getText().toString();
            C1_P12_PISO  = edt5P12.getText().toString();
            C1_P12_MZA  = edt6P12.getText().toString();
            C1_P12_LOTE  = edt7P12.getText().toString();
            C1_P12_KM  = edt8P12.getText().toString();
            C1_P12_CCDD  = spDepartamentoP12.getSelectedItemPosition();
            C1_P12_CCPP  = spProvinciaP12.getSelectedItemPosition();
            C1_P12_CCDI  = spDistritoP12.getSelectedItemPosition();
        } else{
            C1_P12_TIPVIA = spTipoVia.getSelectedItemPosition();
            C1_P12_NOMVIA = edt1P12.getText().toString();
            C1_P12_NROPTA = edt2P12.getText().toString();
            C1_P12_BLOCK = edt3P12.getText().toString();
            C1_P12_INT  = edt4P12.getText().toString();
            C1_P12_PISO  = edt5P12.getText().toString();
            C1_P12_MZA  = edt6P12.getText().toString();
            C1_P12_LOTE  = edt7P12.getText().toString();
            C1_P12_KM  = edt8P12.getText().toString();
            C1_P12_CCDD  = 0;
            C1_P12_CCPP  = 0;
            C1_P12_CCDI  = 0;
        }
        OBS_MOD_I = edtObservaciones.getText().toString();
    }
    public void guardarDatos(){
        data = new Data(context);
        data.open();
        ContentValues contentValues = new ContentValues(47);
        contentValues.put(SQLConstantes.MODULO1_P8,C1_P8+"");
        contentValues.put(SQLConstantes.MODULO1_P9,C1_P9);
        contentValues.put(SQLConstantes.MODULO1_P10,C1_P10+"");
        contentValues.put(SQLConstantes.MODULO1_P11,C1_P11+"");
        contentValues.put(SQLConstantes.MODULO1_P11_1,C1_P11_1);
        contentValues.put(SQLConstantes.MODULO1_P11_2,C1_P11_2);
        contentValues.put(SQLConstantes.MODULO1_P12_NO,C1_P12_NO+"");
        contentValues.put(SQLConstantes.MODULO1_P12_TIPVIA,C1_P12_TIPVIA+"");
        contentValues.put(SQLConstantes.MODULO1_P12_NOMVIA ,C1_P12_NOMVIA);
        contentValues.put(SQLConstantes.MODULO1_P12_NROPTA,C1_P12_NROPTA);
        contentValues.put(SQLConstantes.MODULO1_P12_BLOCK,C1_P12_BLOCK);
        contentValues.put(SQLConstantes.MODULO1_P12_INT,C1_P12_INT);
        contentValues.put(SQLConstantes.MODULO1_P12_PISO,C1_P12_PISO);
        contentValues.put(SQLConstantes.MODULO1_P12_MZA,C1_P12_MZA);
        contentValues.put(SQLConstantes.MODULO1_P12_LOTE,C1_P12_LOTE);
        contentValues.put(SQLConstantes.MODULO1_P12_KM,C1_P12_KM);
        if(C1_P12_CCDI == 0)contentValues.put(SQLConstantes.MODULO1_P12_CCDI,"");
        else contentValues.put(SQLConstantes.MODULO1_P12_CCDI,C1_P12_CCDI+"");
        if(C1_P12_CCPP == 0)contentValues.put(SQLConstantes.MODULO1_P12_CCPP,"");
        else contentValues.put(SQLConstantes.MODULO1_P12_CCPP,C1_P12_CCPP+"");
        if(C1_P12_CCDD == 0)contentValues.put(SQLConstantes.MODULO1_P12_CCDD,"");
        else contentValues.put(SQLConstantes.MODULO1_P12_CCDD,C1_P12_CCDD+"");
        contentValues.put(SQLConstantes.MODULO1_OBS_MOD_I,OBS_MOD_I);
        data.actualizarModulo1(idempresa,contentValues);
        data.close();
    }
    public boolean validar(){

        boolean valido = false;
        llenarMapaVariables();
        String mensaje = "";

        boolean vC1_P8 = true, vC1_P9 = true, vC1_P10 = true, vC1_P11 = true, vC1_P11_1 = true,
                vC1_P11_2 = true, vC1_P12_TIPVIA = true, vC1_P12_NOMVIA  = true,
                vC1_P12_NROPTA = true, vC1_P12_BLOCK = true, vC1_P12_INT = true, vC1_P12_PISO = true,
                vC1_P12_MZA = true, vC1_P12_LOTE = true, vC1_P12_KM = true,vC1_P12_CCDI = true,vC1_P12_CCDD= true,vC1_P12_CCPP= true;

        if(C1_P8 < 0 || C1_P8 > 3){
            vC1_P8 = false;
            if(mensaje.equals(""))mensaje = "PREGUNTA 8: DEBE INDICAR LA CATEGORIA DE ESTABLECIMIENTO";
        }
        if(!C1_P9.equals("")){
            if((C1_P8 >= 1 && C1_P8 <= 3) && Integer.parseInt(C1_P9) == 1){
                vC1_P9 = false;
                if(mensaje.equals(""))mensaje = "PREGUNTA 9: NO CORRESPONDE LA CATEGORIA DE ESTABLECIMIENTO CON EL NUMERO DE ESTABLECIMIENTOS QUE TIENE";
            }
        }
        if((C1_P8 >= 0 && C1_P8 <= 1) && C1_P10 == 1){
            vC1_P8 = false;
            if(mensaje.equals(""))mensaje = "PREGUNTA 10: NO CORRESPONDE LA CATEGORIA DE ESTABLECIMIENTO SI ESTE ES SEDE CENTRAL";
        }
        if((C1_P8 >= 2 && C1_P8 <= 3) && C1_P10 == 0){
            vC1_P8 = false;
            if(mensaje.equals(""))mensaje = "PREGUNTA 10: NO CORRESPONDE LA CATEGORIA DE ESTABLECIMIENTO SI ESTE ES SEDE CENTRAL";
        }
        if(C1_P11 < 0 || C1_P11 > 1){
            vC1_P11 = false;
            if(mensaje.equals(""))mensaje = "PREGUNTA 11: DEBE INDICAR EL TIEMPO QUE LLEVA OPERANDO";
        }

        if(C1_P11 == 0){
            if(C1_P11_2.equals("")){
                vC1_P11_2 = false;
                if(mensaje.equals(""))mensaje = "PREGUNTA 11: DEBE REGISTRAR LOS MESES";
            }else{
                if(Integer.parseInt(C1_P11_2) < 1 || Integer.parseInt(C1_P11_2) > 11){
                    vC1_P11_2 = false;
                    if(mensaje.equals(""))mensaje = "PREGUNTA 11-MESES: LA CANTIDAD DE MESES DEBE ESTAR EN EL RANGO DE 1 A 11";
                }
            }

        }
        if(C1_P11 == 1){
            if(C1_P11_1.equals("") || C1_P11_2.equals("")){
                vC1_P11_1 = false;vC1_P11_2 = false;
                if(mensaje.equals(""))mensaje = "PREGUNTA 11: DEBE REGISTRAR AÑOS Y MESES";
            }
        }
        if(!C1_P11_1.equals("")){
            if(Integer.parseInt(C1_P11_1) <= 0){
                vC1_P11_1 = false;
                if(mensaje.equals(""))mensaje = "PREGUNTA 11-AÑOS: DEBE REGISTRAR UNA CANTIDAD DE AÑOS MAYOR A CERO";
            }
        }
        if(!C1_P11_2.equals("")){
            if(Integer.parseInt(C1_P11_2) > 11){
                vC1_P11_2 = false;
                if(mensaje.equals(""))mensaje = "PREGUNTA 11-MESES: LA CANTIDAD DE MESES NO DEBE SER MAYOR A 11";
            }
        }

        if(lytP12.getVisibility() == View.VISIBLE && spTipoVia.isEnabled()){
            if(C1_P12_TIPVIA == 0){
                vC1_P12_TIPVIA = false;
                if(mensaje.equals(""))mensaje = "PREGUNTA 12: DEBE SELECCIONAR TIPO DE VIA";
            }
            if(C1_P12_NOMVIA.trim().length() == 0){
                vC1_P12_NOMVIA=false;
                if(mensaje.equals(""))mensaje = "PREGUNTA 12: DEBE REGISTRAR NOMBRE DE VIA";
            }
            if(C1_P12_NROPTA.trim().length() == 0){
                vC1_P12_NROPTA=false;
                if(mensaje.equals(""))mensaje = "PREGUNTA 12: DEBE REGISTRAR NUMERO DE PUERTA";
            }
            if(C1_P12_TIPVIA == 5 && C1_P12_KM.equals("")){
                vC1_P12_TIPVIA =false;
                if(mensaje.equals(""))mensaje = "PREGUNTA 12: DEBE REGISTRAR KILOMETRO YA QUE EL TIPO DE VIA ES CARRETERA";
            }

            if(!C1_P12_BLOCK.equals("") && C1_P12_INT.equals("")){
                vC1_P12_INT = false;
                if(mensaje.equals(""))mensaje = "PREGUNTA 12: SI REGISTRA BLOCK DEBE REGISTRAR INTERIOR";
            }
            if(C1_P12_MZA.equals("") && !C1_P12_LOTE.equals("")){
                vC1_P12_MZA= false;
                if(mensaje.equals(""))mensaje = "PREGUNTA 12: SI REGISTRA MANZANA DEBE REGISTRAR LOTE Y VICEVERSA";
            }
            if(!C1_P12_MZA.equals("") && C1_P12_LOTE.equals("")){
                vC1_P12_LOTE= false;
                if(mensaje.equals(""))mensaje = "PREGUNTA 12: SI REGISTRA MANZANA DEBE REGISTRAR LOTE Y VICEVERSA";
            }
            if(C1_P12_CCDD == 0){
                vC1_P12_CCDD= false;
                if(mensaje.equals(""))mensaje = "PREGUNTA 12: DEBE SELECCIONAR DEPARTAMENTO";
            }else{
                if(C1_P12_CCPP == 0){
                    vC1_P12_CCPP= false;
                    if(mensaje.equals(""))mensaje = "PREGUNTA 12: DEBE SELECCIONAR PROVINCIA";
                }else{
                    if(C1_P12_CCDI == 0){
                        vC1_P12_CCDI= false;
                        if(mensaje.equals(""))mensaje = "PREGUNTA 12: DEBE SELECCIONAR DISTRITO";
                    }
                }
            }

        }


        valido = vC1_P8 && vC1_P9 && vC1_P10 && vC1_P11 && vC1_P11_1 &&
                vC1_P11_2 && vC1_P12_TIPVIA && vC1_P12_NOMVIA  &&
                vC1_P12_NROPTA && vC1_P12_PISO && vC1_P12_INT && vC1_P12_MZA && vC1_P12_LOTE &&
                 vC1_P12_CCDI && vC1_P12_CCDD && vC1_P12_CCPP;

        if(!valido) {
            mostrarMensaje(mensaje);
            Log.e("vC1_P8:",vC1_P8 + "");
            Log.e("vC1_P8:",vC1_P9+ "");
            Log.e("vC1_P8:",vC1_P10+ "");
            Log.e("vC1_P8:",vC1_P11+ "");
            Log.e("vC1_P8:",vC1_P11_1+ "");
            Log.e("vC1_P8:",vC1_P11_2+ "");
            Log.e("vC1_P8:",vC1_P12_TIPVIA+ "");
            Log.e("vC1_P8:",vC1_P12_NOMVIA+ "");
            Log.e("vC1_P8:",vC1_P12_NROPTA+ "");
            Log.e("vC1_P8:",vC1_P12_BLOCK+ "");
            Log.e("vC1_P8:",vC1_P12_INT+ "");
            Log.e("vC1_P8:",vC1_P12_PISO+ "");
            Log.e("vC1_P8:",vC1_P12_MZA+ "");
            Log.e("vC1_P8:",vC1_P12_LOTE+ "");
            Log.e("vC1_P8:",vC1_P12_KM+ "");
            Log.e("vC1_P8:",vC1_P12_CCDI+ "");
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
