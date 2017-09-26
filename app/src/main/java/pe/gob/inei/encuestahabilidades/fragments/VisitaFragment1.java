package pe.gob.inei.encuestahabilidades.fragments;


import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AlertDialog;
import android.text.InputFilter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.Toast;

import pe.gob.inei.encuestahabilidades.NumericKeyBoardTransformationMethod;
import pe.gob.inei.encuestahabilidades.R;
import pe.gob.inei.encuestahabilidades.modelo.Data;
import pe.gob.inei.encuestahabilidades.modelo.SQLConstantes;
import pe.gob.inei.encuestahabilidades.pojos.DatosEntrevista;

/**
 * A simple {@link Fragment} subclass.
 */
public class VisitaFragment1 extends Fragment {
    EditText edtDniOperador;
    EditText edtDniJefe;
    EditText edtDniSupervisor;

    EditText edtNombreOperador;
    EditText edtNombreJefe;
    EditText edtNombreSupervisor;

    Data data;
    Context context;
    String idEmpresa;

    private String ID;
    private String DNI_OPERADOR;
    private String DNI_JEFE;
    private String DNI_SUPERVISOR;
    private String NOM_OPERADOR;
    private String NOM_JEFE;
    private String NOM_SUPERVISOR;

    public VisitaFragment1() {
        // Required empty public constructor
    }

    @SuppressLint("ValidFragment")
    public VisitaFragment1(String idEmpresa, Context context) {
        this.context = context;
        this.idEmpresa = idEmpresa;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_visita_fragment1, container, false);

        edtDniOperador = (EditText) rootView.findViewById(R.id.visita_edtDNIOperador);
        edtDniJefe = (EditText) rootView.findViewById(R.id.visita_edtDNIJefe);
        edtDniSupervisor = (EditText) rootView.findViewById(R.id.visita_edtDNISupervisor);

        edtNombreOperador = (EditText) rootView.findViewById(R.id.visita_edtNombreOperador);
        edtNombreJefe = (EditText) rootView.findViewById(R.id.visita_edtNombreJefe);
        edtNombreSupervisor = (EditText) rootView.findViewById(R.id.visita_edtNombreSupervisor);

        return rootView;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        edtDniOperador.setTransformationMethod(new NumericKeyBoardTransformationMethod());
        edtDniJefe.setTransformationMethod(new NumericKeyBoardTransformationMethod());
        edtDniSupervisor.setTransformationMethod(new NumericKeyBoardTransformationMethod());

        edtNombreOperador.setFilters(new InputFilter[]{new InputFilter.AllCaps(),new InputFilter.LengthFilter(300)});
        edtNombreJefe.setFilters(new InputFilter[]{new InputFilter.AllCaps(),new InputFilter.LengthFilter(300)});
        edtNombreSupervisor.setFilters(new InputFilter[]{new InputFilter.AllCaps(),new InputFilter.LengthFilter(300)});

        cargarDatos();
    }

    public void cargarDatos(){
        data = new Data(context);
        data.open();
        if(data.existeDatosEntrevista(idEmpresa)){
            DatosEntrevista datosEntrevista = new DatosEntrevista();
            datosEntrevista = data.getDatosEntrevista(idEmpresa);
            edtDniOperador.setText(datosEntrevista.getDNI_OPERADOR());
            edtDniJefe.setText(datosEntrevista.getDNI_JEFE());
            edtDniSupervisor.setText(datosEntrevista.getDNI_SUPERVISOR());
            edtNombreOperador.setText(datosEntrevista.getNOM_OPERADOR());
            edtNombreJefe.setText(datosEntrevista.getNOM_JEFE());
            edtNombreSupervisor.setText(datosEntrevista.getNOM_SUPERVISOR());
        }
    }

    public void llenarMapaVariables(){
        ID = idEmpresa;
        DNI_OPERADOR = edtDniOperador.getText().toString();
        DNI_JEFE = edtDniJefe.getText().toString();
        DNI_SUPERVISOR = edtDniSupervisor.getText().toString();
        NOM_OPERADOR = edtNombreOperador.getText().toString();
        NOM_JEFE = edtNombreJefe.getText().toString();
        NOM_SUPERVISOR = edtNombreSupervisor.getText().toString();
    }

    public boolean validar(){
        llenarMapaVariables();
        boolean correcto = false;
        String mensaje = "";
        boolean
        vDNI_OPERADOR=true,
        vDNI_JEFE=true,
        vDNI_SUPERVISOR=true,
        vNOM_OPERADOR=true,
        vNOM_JEFE=true,
        vNOM_SUPERVISOR=true;

        if(DNI_OPERADOR.equals("") || NOM_OPERADOR.equals("")){
            vDNI_OPERADOR = false; vNOM_OPERADOR = false;
            if(mensaje.equals(""))mensaje = "DEBE REGISTRAR DNI Y NOMBRE DEL OPERADOR";
        }
        if((!DNI_JEFE.equals("") && NOM_JEFE.equals("")) || (DNI_JEFE.equals("") && !NOM_JEFE.equals(""))){
            vDNI_JEFE = false; vNOM_JEFE = false;
            if(mensaje.equals(""))mensaje = "SI REGISTRA DNI DEL JEFE DEBE REGISTRAR EL NOMBRE Y VICEVERSA";
        }
        if((!DNI_SUPERVISOR.equals("") && NOM_SUPERVISOR.equals("")) || (DNI_SUPERVISOR.equals("") && !NOM_SUPERVISOR.equals(""))){
            vDNI_SUPERVISOR = false; vNOM_SUPERVISOR = false;
            if(mensaje.equals(""))mensaje = "SI REGISTRA DNI DEL SUPERVISOR DEBE REGISTRAR EL NOMBRE Y VICEVERSA";
        }

        if(!DNI_OPERADOR.equals("") && DNI_OPERADOR.trim().length() < 8){
            vDNI_OPERADOR = false;
            if(mensaje.equals(""))mensaje = "EL DNI DEL OPERADOR DEBE TENER 8 DIGITOS";
        }
        if(!DNI_JEFE.equals("") && DNI_JEFE.trim().length() < 8){
            vDNI_JEFE = false;
            if(mensaje.equals(""))mensaje = "EL DNI DEL JEFE DEBE TENER 8 DIGITOS";
        }
        if(!DNI_SUPERVISOR.equals("") && DNI_SUPERVISOR.trim().length() < 8){
            vDNI_SUPERVISOR = false;
            if(mensaje.equals(""))mensaje = "EL DNI DEL SUPERVISOR DEBE TENER 8 DIGITOS";
        }

        correcto = vDNI_OPERADOR && vDNI_JEFE && vDNI_SUPERVISOR && vNOM_OPERADOR && vNOM_JEFE && vNOM_SUPERVISOR;

        if(!correcto) mostrarMensaje(mensaje);

        return correcto;
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
    public void guardarDatos(){
        data = new Data(context);
        data.open();
        if(!data.existeDatosEntrevista(idEmpresa)){
            DatosEntrevista datosEntrevista = new DatosEntrevista();
            datosEntrevista.setID(idEmpresa);
            datosEntrevista.setDNI_OPERADOR(DNI_OPERADOR);
            datosEntrevista.setDNI_JEFE(DNI_JEFE);
            datosEntrevista.setDNI_SUPERVISOR(DNI_SUPERVISOR);
            datosEntrevista.setNOM_OPERADOR(NOM_OPERADOR);
            datosEntrevista.setNOM_JEFE(NOM_JEFE);
            datosEntrevista.setNOM_SUPERVISOR(NOM_SUPERVISOR);
            data.insertarDatosEntrevista(datosEntrevista);
        }else{
            ContentValues contentValues = new ContentValues(6);
            contentValues.put(SQLConstantes.DATOS_DNI_OPERADOR,DNI_OPERADOR);
            contentValues.put(SQLConstantes.DATOS_DNI_JEFE,DNI_JEFE);
            contentValues.put(SQLConstantes.DATOS_DNI_SUPERVISOR,DNI_SUPERVISOR);
            contentValues.put(SQLConstantes.DATOS_NOMBRE_OPERADOR,NOM_OPERADOR);
            contentValues.put(SQLConstantes.DATOS_NOMBRE_JEFE,NOM_JEFE);
            contentValues.put(SQLConstantes.DATOS_NOMBRE_SUPERVISOR,DNI_SUPERVISOR);
            data.actualizarDatosEntrevista(idEmpresa,contentValues);
        }
        data.close();
    }
}
