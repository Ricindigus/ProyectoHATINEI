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
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
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
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import pe.gob.inei.encuestahabilidades.NumericKeyBoardTransformationMethod;
import pe.gob.inei.encuestahabilidades.R;
import pe.gob.inei.encuestahabilidades.modelo.Data;
import pe.gob.inei.encuestahabilidades.modelo.SQLConstantes;
import pe.gob.inei.encuestahabilidades.pojos.BaseDatos;
import pe.gob.inei.encuestahabilidades.pojos.Caratula;
import pe.gob.inei.encuestahabilidades.pojos.Identificacion;
import pe.gob.inei.encuestahabilidades.pojos.Marco;

/**
 * A simple {@link Fragment} subclass.
 */
public class InicioFragment extends Fragment {

    private EditText inicio_edt1;
    private EditText inicio_edt2;
    private EditText inicio_edt3;
    private EditText inicio_edt4;
    private EditText inicio_edt5;
    private EditText inicio_edt6;
    private EditText inicio_edt7;
    private EditText inicio_edt8;
    private EditText inicio_edt9;
    private EditText inicio_edt10;
    private EditText inicio_edt12;
    private EditText edtEspecifique;

    private CheckBox inicio_ck1;
    private CheckBox inicio_ck2;
    private CheckBox inicio_ck3;
    private CheckBox inicio_ck4;

    private Spinner inicio_sp1;
    private Spinner inicio_sp2;
    private Spinner inicio_sp3;
    private Spinner inicio_sp4;

    private LinearLayout inicio_lyt1;
    private LinearLayout lytP10;
    private LinearLayout lytP7;

    private TextView txtError4;
    private TextView txtError9;
    private TextView txtError12;


    private String idEmpresa;
    private Identificacion identificacion;
    private Context context;
    private Data data;

    //mapeo de variables
    public String NUM_RUC;
    public String RAZON_SOCIAL;
    public String NOM_COMER_COOP;
    public String ANIO_FUNDACION;
    public String PAG_WEB;
    public int PAG_WEB_NO;
    public String CORREO;
    public int CORREO_NO;
    public int COD_FIJO;
    public String TEL_FIJO;
    public int TEL_FIJO_NO;
    public String TEL_MOVIL;
    public int TEL_MOVIL_NO;
    public String ANIO_OPERACION;
    public String NOM_INFORMANTE;
    public int SEXO_INFORMANTE;
    public String EDAD_INFORMANTE;
    public int ACAD_INFORMANTE;
    public int CARGO_INFORMANTE;
    public String CARGO_INFORMANTE_ESP;

    public InicioFragment() {
        // Required empty public constructor
    }

    @SuppressLint("ValidFragment")
    public InicioFragment(String idEmpresa, Context context) {
        this.idEmpresa = idEmpresa;
        this.context = context;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_inicio, container, false);
        inicio_lyt1 = (LinearLayout) rootView.findViewById(R.id.inicio_lyt1);
        lytP10 = (LinearLayout) rootView.findViewById(R.id.inicio_lytP10);
        lytP7 = (LinearLayout) rootView.findViewById(R.id.inicio_lytP7);
        inicio_edt1 = (EditText) rootView.findViewById(R.id.inicio_edt1);
        inicio_edt2 = (EditText) rootView.findViewById(R.id.inicio_edt2);
        inicio_edt3 = (EditText) rootView.findViewById(R.id.inicio_edt3);
        inicio_edt4 = (EditText) rootView.findViewById(R.id.inicio_edt4);
        inicio_edt5 = (EditText) rootView.findViewById(R.id.inicio_edt5);
        inicio_edt6 = (EditText) rootView.findViewById(R.id.inicio_edt6);
        inicio_edt7 = (EditText) rootView.findViewById(R.id.inicio_edt7);
        inicio_edt8 = (EditText) rootView.findViewById(R.id.inicio_edt8);
        inicio_edt9 = (EditText) rootView.findViewById(R.id.inicio_edt9);
        inicio_edt10 = (EditText) rootView.findViewById(R.id.inicio_edt10);
        inicio_edt12 = (EditText) rootView.findViewById(R.id.inicio_edt12);
        edtEspecifique = (EditText) rootView.findViewById(R.id.inicio_edtEspecifique);
        inicio_ck1 = (CheckBox) rootView.findViewById(R.id.inicio_ck1);
        inicio_ck2 = (CheckBox) rootView.findViewById(R.id.inicio_ck2);
        inicio_ck3 = (CheckBox) rootView.findViewById(R.id.inicio_ck3);
        inicio_ck4 = (CheckBox) rootView.findViewById(R.id.inicio_ck4);
        inicio_sp1 = (Spinner) rootView.findViewById(R.id.inicio_sp1);
        inicio_sp2 = (Spinner) rootView.findViewById(R.id.inicio_sp2);
        inicio_sp3 = (Spinner) rootView.findViewById(R.id.inicio_sp3);
        inicio_sp4 = (Spinner) rootView.findViewById(R.id.inicio_sp4);
        txtError4 = (TextView) rootView.findViewById(R.id.inicio_txtError4);
        txtError9 = (TextView) rootView.findViewById(R.id.inicio_txtError9);
        txtError12 = (TextView) rootView.findViewById(R.id.inicio_txtError12);

        return rootView;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        cargarDatos();
        EditText[] edts = {inicio_edt2, inicio_edt3, inicio_edt5, inicio_edt6, inicio_edt10, edtEspecifique};
        for (EditText c: edts) { c.setFilters(new InputFilter[]{new InputFilter.AllCaps()});}
        EditText[] edtsNumero = {inicio_edt1,inicio_edt4,inicio_edt7, inicio_edt8, inicio_edt9, inicio_edt12};
        for (EditText r: edtsNumero) { r.setTransformationMethod(new NumericKeyBoardTransformationMethod());}

        inicio_edt1.setFilters(new InputFilter[]{new InputFilter.LengthFilter(11)});
        inicio_edt4.setFilters(new InputFilter[]{new InputFilter.LengthFilter(4)});
        inicio_edt7.setFilters(new InputFilter[]{new InputFilter.LengthFilter(7)});
        inicio_edt8.setFilters(new InputFilter[]{new InputFilter.LengthFilter(9)});
        inicio_edt9.setFilters(new InputFilter[]{new InputFilter.LengthFilter(4)});
        inicio_edt12.setFilters(new InputFilter[]{new InputFilter.LengthFilter(2)});

        validarAnio(inicio_edt4,txtError4);
        validarAnio(inicio_edt9,txtError9);

        okLayout(inicio_edt6,lytP7);
        okLayout(inicio_edt9,lytP10);
        okLayout(inicio_edt10,lytP10);
        okLayout(inicio_edt12,lytP10);

        validarEdad(inicio_edt12,txtError12);

        checkNoTiene(inicio_ck1,inicio_edt5);
        checkNoTiene(inicio_ck2,inicio_edt6);
        checkNoTiene(inicio_ck4,inicio_edt8);

        inicio_ck3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    inicio_sp1.setSelection(0);
                    inicio_lyt1.setBackgroundResource(R.drawable.fondo_spinner_disabled);
                    inicio_edt7.setText("");
                    inicio_edt7.setBackgroundResource(R.drawable.fondo_edit_text_disabled);
                    inicio_sp1.setEnabled(false);
                    inicio_edt7.setEnabled(false);
                }else{
                    inicio_lyt1.setBackgroundResource(R.drawable.fondo_spinner);
                    inicio_edt7.setBackgroundResource(R.drawable.fondo_edit_text);
                    inicio_sp1.setEnabled(true);
                    inicio_edt7.setEnabled(true);
                }
            }
        });

        inicio_sp4.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int pos, long l) {
                edtEspecifique.setVisibility(View.GONE);
                edtEspecifique.setEnabled(false);
                edtEspecifique.setBackgroundResource(R.drawable.fondo_edit_text_disabled);
                switch (pos){
                    case 0:break;
                    case 1:break;
                    case 2:break;
                    case 3:break;
                    case 4:
                        edtEspecifique.setVisibility(View.VISIBLE);
                        edtEspecifique.setEnabled(true);
                        edtEspecifique.setBackgroundResource(R.drawable.fondo_edit_text);
                        edtEspecifique.requestFocus();
                        break;
                }
                if (pos >= 0 && pos <4){
                    edtEspecifique.setText("");
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {}
        });

    }
    public void llenarMapaVariables(){
        llenarVariablesEdit();
        llenarVariablesCheck();
        llenarVariablesSpinner();
    }

    public boolean validar(){
        boolean valido = true;
        String mensaje = "";
        llenarMapaVariables();
        boolean vNUM_RUC=false; boolean vRAZON_SOCIAL=false; boolean vNOM_COMER_COOP=false, vCOD_FIJO = true;
        boolean vANIO_FUNDACION=false;boolean vPAG_WEB=false; boolean vCORREO=false, vTelefonoMovil = true, condTelFijo1=true,condTelFijo2=true;
        boolean vTEL_MOVIL=false; boolean vANIO_OPERACION=false; boolean vNOM_INFORMANTE=false;
        boolean vSEXO_INFORMANTE=false; boolean vEDAD_INFORMANTE=false; boolean vACAD_INFORMANTE=false; boolean vCARGO_INFORMANTE=false; boolean vCARGO_INFORMANTE_ESP=false; boolean vTEL_FIJO=false;

        if(NUM_RUC.trim().length() != 0)vNUM_RUC=true;
        else if(mensaje.equals(""))mensaje = "DEBE REGISTRAR RUC";
        if(RAZON_SOCIAL.trim().length() != 0)vRAZON_SOCIAL=true;
        else if(mensaje.equals(""))mensaje = "DEBE REGISTRAR LA RAZON SOCIAL";
        if(NOM_COMER_COOP.trim().length() != 0)vNOM_COMER_COOP=true;
        else if(mensaje.equals(""))mensaje = "DEBE REGISTRAR NOMBRE COMERCIAL";
        if(ANIO_FUNDACION.trim().length() != 0){
            if(Integer.parseInt(ANIO_FUNDACION)>=1900 && Integer.parseInt(ANIO_FUNDACION)<=2017) vANIO_FUNDACION=true;
            else if(mensaje.equals(""))mensaje = "DEBE REGISTRAR UN AÑO VALIDO";
        }
        else if(mensaje.equals(""))mensaje = "DEBE REGISTRAR AÑO DE FUNDACION";
        if(PAG_WEB_NO==1) vPAG_WEB=true;
        if(PAG_WEB_NO==0) {
            if(PAG_WEB.trim().length() != 0) vPAG_WEB = true;
            else if(mensaje.equals(""))mensaje = "DEBE REGISTRAR DIRECCION DE PAGINA WEB O INDICAR QUE NO TIENE";
        }
        if(CORREO_NO==1) vCORREO=true;
        if(CORREO_NO==0) {
            if(CORREO.trim().length() != 0)vCORREO=true;
            else if(mensaje.equals(""))mensaje = "DEBE REGISTRAR CORREO ELECTRONICO O INDICAR QUE NO TIENE";
        }
        if(TEL_FIJO_NO==1){ vTEL_FIJO=true;}
        if(TEL_FIJO_NO==0) {
            if(TEL_FIJO.trim().length() != 0) vTEL_FIJO=true;
            else if(mensaje.equals(""))mensaje = "DEBE REGISTRAR TELEFONO FIJO O INDICAR QUE NO TIENE";
        }
        if(TEL_MOVIL_NO==1) vTEL_MOVIL=true;
        if(TEL_MOVIL_NO==0) {
            if(TEL_MOVIL.trim().length() == 9)vTEL_MOVIL=true;
            else if(mensaje.equals(""))mensaje = "DEBE REGISTRAR TELEFONO MOVIL O INDICAR QUE NO TIENE";
        }
        if(TEL_FIJO_NO == 1 && TEL_MOVIL_NO == 1){
            vTelefonoMovil = false;
            if(mensaje.equals(""))mensaje = "TELEFONO: DEBE REGISTRAR TELEFONO FIJO O DE CELULAR";
        }

        if(TEL_FIJO_NO == 0 && COD_FIJO == 0){
            vCOD_FIJO = false;
            if(mensaje.equals(""))mensaje = "TELEFONO: DEBE REGISTRAR TELEFONO FIJO O DE CELULAR";
        }

        if(TEL_FIJO_NO == 0 && COD_FIJO == 7 && TEL_FIJO.trim().length() < 7){
            condTelFijo1 = false;
            if(mensaje.equals(""))mensaje = "TELEFONO: DEBE REGISTRAR NUMERO DE TELEFONO FIJO VALIDO";
        }
        if(TEL_FIJO_NO == 0 && COD_FIJO != 7 && TEL_FIJO.trim().length() < 6){
            condTelFijo2 = false;
            if(mensaje.equals(""))mensaje = "TELEFONO: DEBE REGISTRAR NUMERO DE TELEFONO FIJO VALIDO";
        }


        if(ANIO_OPERACION.trim().length() != 0){
            if(Integer.parseInt(ANIO_OPERACION)>=1900 && Integer.parseInt(ANIO_OPERACION)<=2017){
                if(vANIO_FUNDACION){
                    if(Integer.parseInt(ANIO_FUNDACION) > Integer.parseInt(ANIO_OPERACION)){
                        if(mensaje.equals(""))mensaje = "EL AÑO DE FUNDACION NO DEBE SER MAYOR AL AÑO DE OPERACION";
                    }else vANIO_OPERACION=true;
                }else vANIO_OPERACION=true;
            }
            else if(mensaje.equals(""))mensaje = "DEBE REGISTRAR UN AÑO VALIDO";
        }else if(mensaje.equals(""))mensaje = "DEBE REGISTRAR AÑO DE OPERACION";
        if(NOM_INFORMANTE.trim().length() != 0)vNOM_INFORMANTE=true;
        else if(mensaje.equals(""))mensaje = "DEBE REGISTRAR NOMBRE DEL INFORMANTE";
        if(EDAD_INFORMANTE.trim().length() != 0)vEDAD_INFORMANTE=true;
        else if(mensaje.equals(""))mensaje = "DEBE REGISTRAR LA EDAD DEL INFORMANTE";
        if(SEXO_INFORMANTE!=0)vSEXO_INFORMANTE=true;
        else if(mensaje.equals(""))mensaje = "DEBE INDICAR SEXO DEL INFORMANTE";
        if(ACAD_INFORMANTE!=0)vACAD_INFORMANTE=true;
        else if(mensaje.equals(""))mensaje = "DEBE INDICAR NIVEL DE ESTUDIOS";
        if(CARGO_INFORMANTE!=0)vCARGO_INFORMANTE=true;
        else if(mensaje.equals(""))mensaje = "DEBE INDICAR CARGO DEL INFORMANTE";
        if(CARGO_INFORMANTE== 4) {
            if(CARGO_INFORMANTE_ESP.trim().length() >= 3){
                vCARGO_INFORMANTE_ESP=true;
            }else if(mensaje.equals(""))mensaje = "DEBE REGISTRAR INFORMACION VALIDA EN ESPECIFIQUE";
        }else vCARGO_INFORMANTE_ESP=true;

        valido= vNUM_RUC &&  vRAZON_SOCIAL &&  vANIO_FUNDACION && vPAG_WEB &&
                vCORREO && vTEL_MOVIL &&  vANIO_OPERACION &&  vNOM_INFORMANTE&&
                vSEXO_INFORMANTE &&  vEDAD_INFORMANTE &&  vACAD_INFORMANTE &&
                vCARGO_INFORMANTE &&  vCARGO_INFORMANTE_ESP &&  vTEL_FIJO && vCOD_FIJO &&
                condTelFijo1 && condTelFijo2 && vTelefonoMovil;
        if(!valido){
            mostrarMensaje(mensaje);
                    Log.d("vNUM_RUC" , vNUM_RUC+"");
                    Log.d("vRAZON_SOCIAL",vRAZON_SOCIAL+"");
                    Log.d("vANIO_FUNDACION",vANIO_FUNDACION+"");
                    Log.d("vPAG_WEB",vPAG_WEB+"");
                    Log.d("vCORREO",vCORREO+"");
                    Log.d("vTEL_MOVIL",vTEL_MOVIL+"");
                    Log.d("vANIO_OPERACION",vANIO_OPERACION+"");
                    Log.d("vNOM_INFORMANTE",vNOM_INFORMANTE+"");
                    Log.d("vSEXO_INFORMANTE",vSEXO_INFORMANTE+"");
                    Log.d("vEDAD_INFORMANTE",vEDAD_INFORMANTE+"");
                    Log.d("vACAD_INFORMANTE",vACAD_INFORMANTE+"");
                    Log.d("vCARGO_INFORMANTE",vCARGO_INFORMANTE+"");
                    Log.d("vCARGO_INFORMANTE_ESP",vCARGO_INFORMANTE_ESP+"");
                    Log.d("vTEL_FIJO",vTEL_FIJO+"");
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
    public void cargarDatos(){
        data = new Data(context);
        data.open();
        identificacion = data.getIdentificacion(idEmpresa);

        if(identificacion.getID().equals("")){
            Marco marco = data.getMarco(idEmpresa);
            identificacion.setNUM_RUC(marco.getRUC());
            identificacion.setRAZON_SOCIAL(marco.getRAZON_SOCIAL());
            identificacion.setNOM_COMER_COOP(marco.getNOMBRE_COMERCIAL());
        }
        data.close();
        inicio_edt1.setText(identificacion.getNUM_RUC());
        inicio_edt2.setText(identificacion.getRAZON_SOCIAL());
        inicio_edt3.setText(identificacion.getNOM_COMER_COOP());
        inicio_edt4.setText(identificacion.getANIO_FUNDACION());

        int ckPagWeb = 0;
        if(!identificacion.getPAG_WEB_NO().equals("")) ckPagWeb = Integer.parseInt(identificacion.getPAG_WEB_NO());
        int ckCorreo = 0;
        if(!identificacion.getCORREO_NO().equals("")) ckCorreo = Integer.parseInt(identificacion.getCORREO_NO());
        int ckTelFijo = 0;
        if(!identificacion.getTEL_FIJO_NO().equals("")) ckTelFijo = Integer.parseInt(identificacion.getTEL_FIJO_NO());
        int ckTelMovil = 0;
        if(!identificacion.getTEL_MOVIL_NO().equals("")) ckTelMovil = Integer.parseInt(identificacion.getTEL_MOVIL_NO());

        if(ckPagWeb == 1){
            inicio_ck1.setChecked(true);
            inicio_edt5.setBackgroundResource(R.drawable.fondo_edit_text_disabled);
            inicio_edt5.setEnabled(false);
        }
        if(ckPagWeb == 0){
            inicio_ck1.setChecked(false);
            inicio_edt5.setText(identificacion.getPAG_WEB());
        }
        if(ckCorreo == 1){
            inicio_ck2.setChecked(true);
            inicio_edt6.setBackgroundResource(R.drawable.fondo_edit_text_disabled);
            inicio_edt6.setEnabled(false);
        }
        if(ckCorreo == 0){
            inicio_ck2.setChecked(false);
            inicio_edt6.setText(identificacion.getCORREO());
        }
        if(ckTelFijo == 1){
            inicio_ck3.setChecked(true);
            inicio_lyt1.setBackgroundResource(R.drawable.fondo_spinner_disabled);
            inicio_sp1.setEnabled(false);
            inicio_edt7.setBackgroundResource(R.drawable.fondo_edit_text_disabled);
            inicio_edt7.setEnabled(false);
        }
        if(ckTelFijo == 0){
            inicio_ck3.setChecked(false);
            if(!identificacion.getCOD_FIJO().equals("")) inicio_sp1.setSelection(Integer.parseInt(identificacion.getCOD_FIJO()));
            inicio_edt7.setText(identificacion.getTEL_FIJO());
        }
        if(ckTelMovil == 1){
            inicio_ck4.setChecked(true);
            inicio_edt8.setBackgroundResource(R.drawable.fondo_edit_text_disabled);
            inicio_edt8.setEnabled(false);
        }
        if(ckTelMovil == 0){
            inicio_ck4.setChecked(false);
            inicio_edt8.setText(identificacion.getTEL_MOVIL());
        }
        inicio_edt9.setText(identificacion.getANIO_OPERACION());
        inicio_edt10.setText(identificacion.getNOM_INFORMANTE());
        if(!identificacion.getSEXO_INFORMANTE().equals("")) inicio_sp2.setSelection(Integer.parseInt(identificacion.getSEXO_INFORMANTE()));
        inicio_edt12.setText(identificacion.getEDAD_INFORMANTE());
        if(!identificacion.getACAD_INFORMANTE().equals(""))inicio_sp3.setSelection(Integer.parseInt(identificacion.getACAD_INFORMANTE()));
        if(!identificacion.getCARGO_INFORMANTE().equals(""))inicio_sp4.setSelection(Integer.parseInt(identificacion.getCARGO_INFORMANTE()));
        edtEspecifique.setText(identificacion.getCARGO_INFORMANTE_ESP());
    }

    public void guardarDatos(){
        data = new Data(context);
        data.open();
        if(data.existeIdentificacion(idEmpresa)){
            ContentValues contentValues = new ContentValues(21);
            contentValues.put(SQLConstantes.IDENTIFICACION_RUC,inicio_edt1.getText().toString());
            contentValues.put(SQLConstantes.IDENTIFICACION_RAZON,inicio_edt2.getText().toString());
            contentValues.put(SQLConstantes.IDENTIFICACION_NOMBRE,inicio_edt3.getText().toString());
            contentValues.put(SQLConstantes.IDENTIFICACION_ANIO_FUNDACION,inicio_edt4.getText().toString());
            contentValues.put(SQLConstantes.IDENTIFICACION_WEB,inicio_edt5.getText().toString());
            if(inicio_ck1.isChecked())contentValues.put(SQLConstantes.IDENTIFICACION_WEBNO,"1");
            if(!inicio_ck1.isChecked())contentValues.put(SQLConstantes.IDENTIFICACION_WEBNO,"0");
            contentValues.put(SQLConstantes.IDENTIFICACION_CORREO,inicio_edt6.getText().toString());
            if(inicio_ck2.isChecked())contentValues.put(SQLConstantes.IDENTIFICACION_CORREONO,"1");
            if(!inicio_ck2.isChecked())contentValues.put(SQLConstantes.IDENTIFICACION_CORREONO,"0");
            contentValues.put(SQLConstantes.IDENTIFICACION_FIJO,inicio_edt7.getText().toString());
            contentValues.put(SQLConstantes.IDENTIFICACION_CODFIJO,String.valueOf(inicio_sp1.getSelectedItemPosition()));
            if(inicio_ck3.isChecked())contentValues.put(SQLConstantes.IDENTIFICACION_FIJONO,"1");
            if(!inicio_ck3.isChecked())contentValues.put(SQLConstantes.IDENTIFICACION_FIJONO,"0");
            contentValues.put(SQLConstantes.IDENTIFICACION_MOVIL,inicio_edt8.getText().toString());
            if(inicio_ck4.isChecked())contentValues.put(SQLConstantes.IDENTIFICACION_MOVILNO,"1");
            if(!inicio_ck4.isChecked())contentValues.put(SQLConstantes.IDENTIFICACION_MOVILNO,"0");
            contentValues.put(SQLConstantes.IDENTIFICACION_ANIO_FUNCIONAMIENTO,inicio_edt9.getText().toString());
            contentValues.put(SQLConstantes.IDENTIFICACION_CONDUCTOR_NOMBRE,inicio_edt10.getText().toString());
            contentValues.put(SQLConstantes.IDENTIFICACION_CONDUCTOR_SEXO,String.valueOf(inicio_sp2.getSelectedItemPosition()));
            contentValues.put(SQLConstantes.IDENTIFICACION_CONDUCTOR_EDAD,inicio_edt12.getText().toString());
            contentValues.put(SQLConstantes.IDENTIFICACION_CONDUCTOR_ESTUDIOS,String.valueOf(inicio_sp3.getSelectedItemPosition()));
            contentValues.put(SQLConstantes.IDENTIFICACION_CONDUCTOR_CARGO,String.valueOf(inicio_sp4.getSelectedItemPosition()));
            contentValues.put(SQLConstantes.IDENTIFICACION_CONDUCTOR_CARGO_ESP,edtEspecifique.getText().toString());
            data.actualizarIdentificacion(idEmpresa,contentValues);
        }else{
            identificacion = new Identificacion();
            identificacion.setID(idEmpresa);
            identificacion.setNUM_RUC(inicio_edt1.getText().toString());
            identificacion.setRAZON_SOCIAL(inicio_edt2.getText().toString());
            identificacion.setNOM_COMER_COOP(inicio_edt3.getText().toString());
            identificacion.setANIO_FUNDACION(inicio_edt4.getText().toString());
            identificacion.setPAG_WEB(inicio_edt5.getText().toString());
            if(inicio_ck1.isChecked())identificacion.setPAG_WEB_NO("1");
            if(!inicio_ck1.isChecked())identificacion.setPAG_WEB_NO("0");
            identificacion.setCORREO(inicio_edt6.getText().toString());
            if(inicio_ck2.isChecked())identificacion.setCORREO_NO("1");
            if(!inicio_ck2.isChecked())identificacion.setCORREO_NO("0");
            identificacion.setTEL_FIJO(inicio_edt7.getText().toString());
            identificacion.setCOD_FIJO(String.valueOf(inicio_sp1.getSelectedItemPosition()));
            if(inicio_ck3.isChecked())identificacion.setTEL_FIJO_NO("1");
            if(!inicio_ck3.isChecked())identificacion.setTEL_FIJO_NO("0");
            identificacion.setTEL_MOVIL(inicio_edt8.getText().toString());
            if(inicio_ck4.isChecked())identificacion.setTEL_MOVIL_NO("1");
            if(!inicio_ck4.isChecked())identificacion.setTEL_MOVIL_NO("0");
            identificacion.setANIO_OPERACION(inicio_edt9.getText().toString());
            identificacion.setNOM_INFORMANTE(inicio_edt10.getText().toString());
            identificacion.setSEXO_INFORMANTE(String.valueOf(inicio_sp2.getSelectedItemPosition()));
            identificacion.setEDAD_INFORMANTE(inicio_edt12.getText().toString());
            identificacion.setACAD_INFORMANTE(String.valueOf(inicio_sp3.getSelectedItemPosition()));
            identificacion.setCARGO_INFORMANTE(String.valueOf(inicio_sp4.getSelectedItemPosition()));
            identificacion.setCARGO_INFORMANTE_ESP(edtEspecifique.getText().toString());
            data.insertarIdentificacion(identificacion);
        }
        data.close();
    }

    public void ocultarTeclado(View view){
        InputMethodManager mgr = (InputMethodManager) getActivity().getSystemService(Context.INPUT_METHOD_SERVICE);
        mgr.hideSoftInputFromWindow(view.getWindowToken(), 0);
    }

    public void validarAnio(final EditText editText, final TextView textView){
        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {}
            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {}
            @Override
            public void afterTextChanged(Editable editable) {
                int despues = 0;
                if (!editable.toString().equals("")) despues = Integer.parseInt(editable.toString());
                if(despues > 1000){
                    if(despues<1900 || despues >2017){
                        editText.setBackgroundResource(R.drawable.fondo_edit_text_error);
                        textView.setText("Debe ingresar un año en el rango de 1900 a 2017");
                    } else{
                        editText.setBackgroundResource(R.drawable.fondo_edit_text);
                        textView.setText("");
                    }
                }
            }
        });
        editText.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean hasFocus) {
                if (!hasFocus) {
                    if(!editText.getText().toString().equals("")){
                        int valor =Integer.parseInt(editText.getText().toString());
                        if(valor < 1900 || valor >2017){
                            editText.setBackgroundResource(R.drawable.fondo_edit_text_error);
                            textView.setText("Debe ingresar un año en el rango de 1900 a 2017");
                        }else{
                            editText.setBackgroundResource(R.drawable.fondo_edit_text);
                            textView.setText("");
                        }
                    }else{
                        editText.setBackgroundResource(R.drawable.fondo_edit_text);
                        textView.setText("");
                    }

                }
            }
        });
    }

    public void validarEdad(final EditText editText, final TextView textView){
        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {}
            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {}
            @Override
            public void afterTextChanged(Editable editable) {
                int despues = 0;
                if (!editable.toString().equals("")) despues = Integer.parseInt(editable.toString());
                if(despues > 10){
                    if(despues<18 || despues >99){
                        editText.setBackgroundResource(R.drawable.fondo_edit_text_error);
                        textView.setText("Rango edad: 18 a 99");
                    } else{
                        editText.setBackgroundResource(R.drawable.fondo_edit_text);
                        textView.setText("");
                    }
                }
            }
        });
        editText.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean hasFocus) {
                if (!hasFocus) {
                    if(!editText.getText().toString().equals("")){
                        int valor =Integer.parseInt(editText.getText().toString());
                        if(valor < 18 || valor >99){
                            editText.setBackgroundResource(R.drawable.fondo_edit_text_error);
                            textView.setText("Rango edad: 18 a 99");
                        }else{
                            editText.setBackgroundResource(R.drawable.fondo_edit_text);
                            textView.setText("");
                        }
                    }else{
                        editText.setBackgroundResource(R.drawable.fondo_edit_text);
                        textView.setText("");
                    }

                }
            }
        });
    }

    public void okLayout(final EditText editText, final LinearLayout linearLayout){
        editText.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View view, int keyCode, KeyEvent keyEvent) {
                if ((keyEvent.getAction() == KeyEvent.ACTION_DOWN) &&
                        (keyCode == KeyEvent.KEYCODE_ENTER)) {
                    ocultarTeclado(editText);
                    linearLayout.requestFocus();
                    return true;
                }
                return false;
            }
        });
    }

    public void checkNoTiene(CheckBox checkBox, final EditText editText){
        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    editText.setEnabled(false);
                    editText.setText("");
                    editText.setBackgroundResource(R.drawable.fondo_edit_text_disabled);
                }else{
                    editText.setEnabled(true);
                    editText.setBackgroundResource(R.drawable.fondo_edit_text);
                }
            }
        });
    }
    public void llenarVariablesEdit(){
        NUM_RUC = inicio_edt1.getText().toString();
        RAZON_SOCIAL = inicio_edt2.getText().toString() ;
        NOM_COMER_COOP = inicio_edt3.getText().toString() ;
        ANIO_FUNDACION = inicio_edt4.getText().toString();
        PAG_WEB = inicio_edt5.getText().toString();
        CORREO = inicio_edt6.getText().toString();
        TEL_FIJO = inicio_edt7.getText().toString();
        TEL_MOVIL = inicio_edt8.getText().toString();
        ANIO_OPERACION = inicio_edt9.getText().toString();
        NOM_INFORMANTE = inicio_edt10.getText().toString();
        EDAD_INFORMANTE = inicio_edt12.getText().toString();
        CARGO_INFORMANTE_ESP = edtEspecifique.getText().toString();
    }

    public void llenarVariablesCheck(){
        if(inicio_ck1.isChecked())PAG_WEB_NO=1;
        else PAG_WEB_NO = 0;
        if(inicio_ck2.isChecked())CORREO_NO=1;
        else CORREO_NO = 0;
        if(inicio_ck3.isChecked())TEL_FIJO_NO=1;
        else TEL_FIJO_NO = 0;
        if(inicio_ck4.isChecked())TEL_MOVIL_NO=1;
        else TEL_MOVIL_NO = 0;
    }

    public void llenarVariablesSpinner(){
        COD_FIJO =  inicio_sp1.getSelectedItemPosition();
        SEXO_INFORMANTE = inicio_sp2.getSelectedItemPosition();
        ACAD_INFORMANTE = inicio_sp3.getSelectedItemPosition();
        CARGO_INFORMANTE = inicio_sp4.getSelectedItemPosition();
    }
}
