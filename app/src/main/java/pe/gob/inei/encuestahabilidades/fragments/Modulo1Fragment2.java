package pe.gob.inei.encuestahabilidades.fragments;


import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Bundle;
import android.provider.MediaStore;
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
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import pe.gob.inei.encuestahabilidades.NumericKeyBoardTransformationMethod;
import pe.gob.inei.encuestahabilidades.R;
import pe.gob.inei.encuestahabilidades.modelo.Data;
import pe.gob.inei.encuestahabilidades.modelo.SQLConstantes;
import pe.gob.inei.encuestahabilidades.pojos.Modulo1;

/**
 * A simple {@link Fragment} subclass.
 */
public class Modulo1Fragment2 extends Fragment {

    private LinearLayout lytP6;
    private LinearLayout lytP7;


    private TextView txtPregunta6;
    private TextView txtPregunta7;
    private TextView txtPregunta8;
    private TextView txtPregunta9;
    private TextView txtPregunta10;

    private AutoCompleteTextView autoCompleteTextView;
    private TextView txtPaisSeleccionado;

    private RadioGroup rgP5;
    private RadioGroup rg1P7;
    private RadioGroup rg2P7;
    private RadioGroup rgP7Sp1;
    private RadioGroup rgP7Sp2;

    private LinearLayout lytP7Sp1;
    private LinearLayout lytP7Sp2;

    private LinearLayout lytFragment2;

    private String idempresa;
    private Modulo1 modulo1;
    private Context context;
    private Data data;

    private int C1_P5;
    private String C1_P6_0;
    private String C1_P6_1;
    private int C1_P7_1_1;
    private int C1_P7_2_1;
    private int C1_P7_1_2;
    private int C1_P7_2_2;

    public Modulo1Fragment2() {
        // Required empty public constructor
    }

    @SuppressLint("ValidFragment")
    public Modulo1Fragment2(String idempresa, Context context) {
        this.idempresa = idempresa;
        this.context = context;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_modulo1_fragment2, container, false);

        lytFragment2 = (LinearLayout) rootView.findViewById(R.id.mod1_layoutFragment2);
        lytP6 = (LinearLayout) rootView.findViewById(R.id.mod1_p6_lyt);
        lytP7 = (LinearLayout) rootView.findViewById(R.id.mod1_p7_lyt);
        autoCompleteTextView = (AutoCompleteTextView) rootView.findViewById(R.id.mod1_p6_autotxt);
        txtPaisSeleccionado = (TextView) rootView.findViewById(R.id.mod1_p6_txtPaisSeleccionado);
        rgP5 = (RadioGroup) rootView.findViewById(R.id.mod1_p5_rg);
        rg1P7 = (RadioGroup) rootView.findViewById(R.id.mod1_p7_rg1);
        rg2P7 = (RadioGroup) rootView.findViewById(R.id.mod1_p7_rg2);
        rgP7Sp1 = (RadioGroup) rootView.findViewById(R.id.mod1_p7_rgSp1);
        rgP7Sp2 = (RadioGroup) rootView.findViewById(R.id.mod1_p7_rgSp2);
        lytP7Sp1 = (LinearLayout) rootView.findViewById(R.id.mod1_p7_lytSp1);
        lytP7Sp2 = (LinearLayout) rootView.findViewById(R.id.mod1_p7_lytSp2);

        return rootView;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        String[] paises = getResources().getStringArray(R.array.paises);
        ArrayAdapter adapter = new ArrayAdapter(getActivity().getApplicationContext(),R.layout.lista_item,R.id.item,paises);
        autoCompleteTextView.setAdapter(adapter);
        autoCompleteTextView.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View view, int keyCode, KeyEvent keyEvent) {
                if ((keyEvent.getAction() == KeyEvent.ACTION_DOWN) &&
                        (keyCode == KeyEvent.KEYCODE_ENTER)) {
                    ocultarTeclado(autoCompleteTextView);
                    lytP6.requestFocus();
                    return true;
                }
                return false;
            }
        });
        autoCompleteTextView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                txtPaisSeleccionado.setText(autoCompleteTextView.getText().toString().toUpperCase());
                ocultarTeclado(autoCompleteTextView);
                lytP6.requestFocus();
            }
        });
        rgP5.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, @IdRes int i) {
                switch (i){
                    case R.id.mod1_p5_rb1:
                        autoCompleteTextView.setText("");
                        txtPaisSeleccionado.setText("");
                        lytP6.setVisibility(View.VISIBLE);
                        break;
                    case R.id.mod1_p5_rb2:
                        lytP6.setVisibility(View.GONE);
                        break;
                }
            }
        });

        rgP5.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean conFocus) {
                if(conFocus) {
                    rgP5.setBackgroundColor(Color.CYAN);
                }
                else if(view.isEnabled()){
                    rgP5.setBackgroundColor(Color.TRANSPARENT);
                }
            }
        });

        autoCompleteTextView.setFilters(new InputFilter[]{new InputFilter.AllCaps()});
        lytFragment2.requestFocus();
        ocultarTeclado(lytFragment2);

        autoCompleteTextView.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean conFocus) {
                if(conFocus) {
                    if(rgP5.getCheckedRadioButtonId()==-1){
                        ocultarTeclado(autoCompleteTextView);
                        Toast.makeText(getActivity().getApplicationContext(), "DEBE SELECCIONAR LA PREGUNTA C1_P5", Toast.LENGTH_SHORT).show();
                        rgP5.requestFocus();
                    }
                }
                else if(view.isEnabled()){
                    //rg1P7.setBackgroundColor(Color.CYAN);
                    ocultarTeclado(autoCompleteTextView);
                }
            }
        });
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
        modulo1 = data.getModulo1(idempresa);
        if(!modulo1.getC1_P5().equals("")) ((RadioButton)rgP5.getChildAt(Integer.parseInt(modulo1.getC1_P5()))).setChecked(true);
        txtPaisSeleccionado.setText(modulo1.getC1_P6_0());
        if(!modulo1.getC1_P7_1_1().equals("") && Integer.parseInt(modulo1.getC1_P7_1_1()) != -1)
        ((RadioButton)rg1P7.getChildAt(Integer.parseInt(modulo1.getC1_P7_1_1()))).setChecked(true);
        if(!modulo1.getC1_P7_1_2().equals("") && Integer.parseInt(modulo1.getC1_P7_1_2()) != -1)
        ((RadioButton)rgP7Sp1.getChildAt(Integer.parseInt(modulo1.getC1_P7_1_2()))).setChecked(true);
        if(!modulo1.getC1_P7_2_1().equals("") && Integer.parseInt(modulo1.getC1_P7_2_1()) != -1)
        ((RadioButton)rg2P7.getChildAt(Integer.parseInt(modulo1.getC1_P7_2_1()))).setChecked(true);
        if(!modulo1.getC1_P7_2_2().equals("") && Integer.parseInt(modulo1.getC1_P7_2_2()) != -1)
        ((RadioButton)rgP7Sp2.getChildAt(Integer.parseInt(modulo1.getC1_P7_2_2()))).setChecked(true);
        data.close();
    }
    public void llenarMapaVariables(){
        C1_P5 = rgP5.indexOfChild(rgP5.findViewById(rgP5.getCheckedRadioButtonId()));
        C1_P6_0 = txtPaisSeleccionado.getText().toString();
        if(!C1_P6_0.equals("")) C1_P6_1 = extraerCodigo(C1_P6_0);
        else C1_P6_1 = "";
        C1_P7_1_1 = rg1P7.indexOfChild(rg1P7.findViewById(rg1P7.getCheckedRadioButtonId()));
        C1_P7_1_2 = rgP7Sp1.indexOfChild(rgP7Sp1.findViewById(rgP7Sp1.getCheckedRadioButtonId()));
        C1_P7_2_1 = rg2P7.indexOfChild(rg2P7.findViewById(rg2P7.getCheckedRadioButtonId()));
        C1_P7_2_2 = rgP7Sp2.indexOfChild(rgP7Sp2.findViewById(rgP7Sp2.getCheckedRadioButtonId()));
    }
    public void guardarDatos(){
        data = new Data(context);
        data.open();
        ContentValues contentValues = new ContentValues(47);
        contentValues.put(SQLConstantes.MODULO1_P5,C1_P5+"");
        contentValues.put(SQLConstantes.MODULO1_P6_0,C1_P6_0);
        contentValues.put(SQLConstantes.MODULO1_P6_1,C1_P6_1);
        contentValues.put(SQLConstantes.MODULO1_P7_1_1,C1_P7_1_1+"");
        contentValues.put(SQLConstantes.MODULO1_P7_2_1,C1_P7_2_1+"");
        contentValues.put(SQLConstantes.MODULO1_P7_1_2,C1_P7_1_2+"");
        contentValues.put(SQLConstantes.MODULO1_P7_2_2,C1_P7_2_2+"");
        data.actualizarModulo1(idempresa,contentValues);
        data.close();
    }

    public boolean validar(){
        boolean valido = false;
        llenarMapaVariables();
        String mensaje ="";
        boolean vC1_P5 = false, vC1_P6_0 = false, vC1_P6_1 = false, vC1_P7_1_1 = false,
                vC1_P7_2_1 = false, vC1_P7_1_2 = false, vC1_P7_2_2 = false;
        //p5
        if(C1_P5 >= 0 && C1_P5 <= 1) vC1_P5 = true;
        else if(mensaje.equals(""))mensaje = "PREGUNTA 5: DEBE INDICAR SI PERTENECE A UN GRUPO U ORGANIZACION EMPRESARIAL";
        //p6
        if(C1_P5 == 0){
            if(C1_P6_0.trim().length() != 0){
                vC1_P6_0 = true;
                vC1_P6_1 = true;
            }else if(mensaje.equals(""))mensaje = "PREGUNTA 6: DEBE INDICAR PAIS";
        }else{
            vC1_P6_0 = true;vC1_P6_1 = true;
        }
        //p7
        if(C1_P7_1_1 >= 0 && C1_P7_1_1 <= 1) {
            vC1_P7_1_1 = true;
        }else if(mensaje.equals(""))mensaje = "PREGUNTA 7: COMPLETE LAS PREGUNTAS";
        if(C1_P7_1_2 >= 0 && C1_P7_1_2 <= 1) {
            vC1_P7_1_2 = true;
        }else if(mensaje.equals(""))mensaje = "PREGUNTA 7: COMPLETE LAS PREGUNTAS";
        if(C1_P7_2_1 >= 0 && C1_P7_2_1 <= 1) {
            vC1_P7_2_1 = true;
        }else if(mensaje.equals(""))mensaje = "PREGUNTA 7: COMPLETE LAS PREGUNTAS";
        if(C1_P7_2_2 >= 0 && C1_P7_2_2 <= 1) {
            vC1_P7_2_2 = true;
        }else if(mensaje.equals(""))mensaje = "PREGUNTA 7: COMPLETE LAS PREGUNTAS";

        valido = vC1_P5;
           valido = vC1_P5 && vC1_P6_0 && vC1_P6_1 && vC1_P7_1_1 && vC1_P7_2_1 && vC1_P7_1_2 && vC1_P7_2_2;

        if(!valido) mostrarMensaje(mensaje);
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
    public String extraerCodigo(String str){
        String codigo = "";
        int indiceI = str.indexOf("[");
        int indiceF = str.indexOf("]");
        codigo = str.substring(indiceI + 1, indiceF);
        return codigo;
    }
}