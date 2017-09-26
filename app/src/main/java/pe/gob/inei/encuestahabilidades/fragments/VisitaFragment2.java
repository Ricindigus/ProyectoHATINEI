package pe.gob.inei.encuestahabilidades.fragments;


import android.annotation.SuppressLint;
import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.content.ContentValues;
import android.content.Context;
import android.content.DialogInterface;
import android.support.annotation.IdRes;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AlertDialog;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.PopupMenu;
import android.support.v7.widget.RecyclerView;
import android.text.InputFilter;
import android.view.MenuItem;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.support.annotation.Nullable;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import pe.gob.inei.encuestahabilidades.NumericKeyBoardTransformationMethod;
import pe.gob.inei.encuestahabilidades.R;
import pe.gob.inei.encuestahabilidades.adapters.VisitaAdapter;
import pe.gob.inei.encuestahabilidades.modelo.Data;
import pe.gob.inei.encuestahabilidades.modelo.SQLConstantes;
import pe.gob.inei.encuestahabilidades.pojos.Caratula;
import pe.gob.inei.encuestahabilidades.pojos.DatosEntrevista;
import pe.gob.inei.encuestahabilidades.pojos.Identificacion;
import pe.gob.inei.encuestahabilidades.pojos.Modulo1;
import pe.gob.inei.encuestahabilidades.pojos.Modulo10;
import pe.gob.inei.encuestahabilidades.pojos.Modulo2;
import pe.gob.inei.encuestahabilidades.pojos.Modulo3;
import pe.gob.inei.encuestahabilidades.pojos.Modulo4;
import pe.gob.inei.encuestahabilidades.pojos.Modulo5;
import pe.gob.inei.encuestahabilidades.pojos.Modulo6;
import pe.gob.inei.encuestahabilidades.pojos.Modulo7;
import pe.gob.inei.encuestahabilidades.pojos.Modulo8;
import pe.gob.inei.encuestahabilidades.pojos.Modulo9;
import pe.gob.inei.encuestahabilidades.pojos.Visita;


/**
 * A simple {@link Fragment} subclass.
 */
public class VisitaFragment2 extends Fragment {

    ArrayList<Visita> visitas;
    ArrayList<Integer> eliminados;
    LinearLayoutManager linearLayoutManager;
    VisitaAdapter visitaAdapter;
    RecyclerView recyclerView;
    FloatingActionButton btnAgregar;
    DatosEntrevista datosEntrevista;
    RadioButton rbAbierto;
    RadioButton rbCerrado;

    Button btnFinalizar;
    TextView txtResultadoFinal;
    TextView txtFechaFinal;
    RadioGroup rgEstadoEnvio;
    Context context;
    String idEmpresa;
    Data data;
    int diaInicio;
    int mesInicio;
    int anioInicio;
    int horaInicio;
    int minutoInicio;
    int horaFin;
    int minutoFin;
    int diaProx;
    int mesProx;
    int anioProx;
    int horaProx;
    int minutoProx;

    String mensajeCoberturaGPS = "";
    String mensajeCoberturaCaratula = "";
    String mensajeCoberturaModulo1 = "";
    String mensajeCoberturaModulo2 = "";
    String mensajeCoberturaModulo3 = "";
    String mensajeCoberturaModulo4 = "";
    String mensajeCoberturaModulo5 = "";
    String mensajeCoberturaModulo6 = "";
    String mensajeCoberturaModulo7 = "";
    String mensajeCoberturaModulo8 = "";
    String mensajeCoberturaModulo9 = "";
    String mensajeCoberturaModulo10 = "";

    private String DNI_OPERADOR_E;
    private String V_OPERADOR_E;
    private String DNI_JEFE_EQUIPO;
    private String V_JEFE_EQUIPO;
    private String DNI_SUPERVISOR;
    private String V_SUPERVISOR;
    private int R_ENCUESTA;
    private String R_ENCUESTA_ESP;
    private int R_FECHA_DIA;
    private int R_FECHA_MES;
    private int R_FECHA_ANIO;


    public VisitaFragment2() {
        // Required empty public constructor
    }

    @SuppressLint("ValidFragment")
    public VisitaFragment2(String idEmpresa, Context context) {
        this.idEmpresa = idEmpresa;
        this.context = context;
        this.eliminados = new ArrayList<Integer>();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_visita_fragment2, container, false);
        recyclerView = (RecyclerView) rootView.findViewById(R.id.visita_recycler);

        txtResultadoFinal = (TextView) rootView.findViewById(R.id.visita_txtResultadoFinal);
        txtFechaFinal = (TextView) rootView.findViewById(R.id.visita_txtFechaResulFinal);
        rgEstadoEnvio = (RadioGroup) rootView.findViewById(R.id.visita_rgEstadoEnvio);

        rbAbierto = (RadioButton) rootView.findViewById(R.id.visita_rbAbierto);
        rbCerrado = (RadioButton) rootView.findViewById(R.id.visita_rbCerrado);

        btnAgregar = (FloatingActionButton) rootView.findViewById(R.id.visitas_btnAgregarVisita);
        btnFinalizar = (Button) rootView.findViewById(R.id.visita_btnFinalizar);

        return rootView;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        cargarDatos();
        recyclerView.setHasFixedSize(true);
        linearLayoutManager = new LinearLayoutManager(getActivity().getApplicationContext());
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(linearLayoutManager);
        visitaAdapter = new VisitaAdapter(visitas, context, new VisitaAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(View view, final int pos) {
                if(visitas.get(pos).getR_VISITA().equals("")){
                    PopupMenu popupMenu = new PopupMenu(context,view);
                    popupMenu.getMenuInflater().inflate(R.menu.menu_visita,popupMenu.getMenu());
                    popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                        @Override
                        public boolean onMenuItemClick(MenuItem item) {
                            switch(item.getItemId()){
                                case R.id.opcion_editar:
                                    editarVisita(pos);
                                    break;
//                                case R.id.opcion_eliminar:
//                                    eliminarVisita(pos);
//                                    break;
                                case R.id.opcion_finalizar:
                                    finalizarVisita(pos);
                                    break;
                            }
                            return true;
                        }
                    });
                    popupMenu.show();
                }
            }
        });
        recyclerView.setAdapter(visitaAdapter);


        btnAgregar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int numVisitas = visitas.size();
                if(numVisitas > 0 ){
                    if(!visitas.get(numVisitas - 1).getR_VISITA().equals("")){
                        agregarVisita();
                    }else{
                        Toast.makeText(context, "DEBE FINALIZAR LA VISITA ACTUAL", Toast.LENGTH_SHORT).show();
                    }
                }else{
                    agregarVisita();
                }
            }
        });





        btnFinalizar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boolean valido = true;
                String m = "";
                if(visitas.size() == 0) {
                    valido = false;
                    if (m.equals("")) m = "NO TIENE VISITAS FINALIZADAS, NO PUEDE FINALIZAR ENCUESTA";
                }else{
                    if(visitas.get(visitas.size()-1).getR_VISITA().equals("")){
                        valido = false;
                        if (m.equals("")) m = "DEBE FINALIZAR LA VISITA ACTUAL ANTES DE FINALIZAR ENCUESTA";
                    }
                    if(txtResultadoFinal.getText().toString().equals("")){
                        valido = false;
                        if (m.equals("")) m = "NO HA REGISTRADO EL RESULTADO FINAL DE LA ENCUESTA";
                    }
                    if(txtFechaFinal.getText().toString().equals("")){
                        valido = false;
                        if (m.equals("")) m = "NO HA REGISTRADO LA FECHA DEL RESULTADO FINAL DE LA ENCUESTA";
                    }
                    if(rgEstadoEnvio.indexOfChild(rgEstadoEnvio.findViewById(rgEstadoEnvio.getCheckedRadioButtonId())) == -1){
                        valido = false;
                        if (m.equals("")) m = "NO HA INDICADO EL ESTADO DE ENVIO";
                    }
                    int a1 = Integer.parseInt(visitas.get(visitas.size()-1).getV_ANIO());
                    int m1 = Integer.parseInt(visitas.get(visitas.size()-1).getV_MES());
                    int d1 = Integer.parseInt(visitas.get(visitas.size()-1).getV_DIA());

                    Date date1 = new Date(a1,m1,d1);
                    Date date2 = new Date(R_FECHA_ANIO,R_FECHA_MES,R_FECHA_DIA);

                    if(date2.before(date1)){
                        valido = false;
                        if (m.equals("")) m = "LA FECHA DEL RESULTADO DE LA ENCUESTA NO DEBE SER MENOR A LA FECHA DE LA ULTIMA VISITA";
                    }
                }
                if(valido){
                    guardarDatos();
                    data = new Data(context);
                    data.open();
                    ContentValues contentValues = new ContentValues(6);
                    contentValues.put(SQLConstantes.DATOS_FECHA_FINAL_DIA, R_FECHA_DIA+"");
                    contentValues.put(SQLConstantes.DATOS_FECHA_FINAL_MES,R_FECHA_MES+"");
                    contentValues.put(SQLConstantes.DATOS_FECHA_FINAL_ANIO, R_FECHA_ANIO+"");
                    contentValues.put(SQLConstantes.DATOS_RESULTADO_FINAL,R_ENCUESTA+"");
                    contentValues.put(SQLConstantes.DATOS_RESULTADO_FINAL_ESP, R_ENCUESTA_ESP);
                    contentValues.put(SQLConstantes.DATOS_ESTADO_ENVIO,
                            rgEstadoEnvio.indexOfChild(rgEstadoEnvio.findViewById(rgEstadoEnvio.getCheckedRadioButtonId())) + "");
                    data.actualizarDatosEntrevista(idEmpresa,contentValues);
                    data.close();
                    getActivity().finish();
                }else mostrarMensaje(m);
            }
        });
    }

//    public void eliminarVisita(final int posicion){
//        final AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
//        builder.setMessage("¿Está seguro de eliminar la visita?")
//                .setPositiveButton("SI", new DialogInterface.OnClickListener() {
//                    public void onClick(DialogInterface dialog, int id) {
//                        eliminados.add(visitas.get(posicion).getID());
//                        visitas.remove(posicion);
//                        visitaAdapter.notifyDataSetChanged();
//                        dialog.dismiss();
//                    }
//                })
//                .setNegativeButton("NO", new DialogInterface.OnClickListener() {
//                    public void onClick(DialogInterface dialog, int id) {
//                        dialog.dismiss();
//                    }
//                });
//        final AlertDialog alertDialog = builder.create();
//        alertDialog.show();
//    }

    public void agregarVisita(){
        AlertDialog.Builder alert = new AlertDialog.Builder(getActivity());
        final View dialogView = getActivity().getLayoutInflater().inflate(R.layout.dialog_agregar_visita, null);
        final LinearLayout lytDialog = (LinearLayout) dialogView.findViewById(R.id.dialog_agregar_visita_lyt);
        final TextView txtNumero = (TextView) dialogView.findViewById(R.id.dialog_agregar_visita_txtNumero);
        final TextView txtFechaI = (TextView) dialogView.findViewById(R.id.dialog_agregar_visita_txtFI);
        final TextView txtHoraI = (TextView) dialogView.findViewById(R.id.dialog_agregar_visita_txtHI);

        txtFechaI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final Calendar calendario = Calendar.getInstance();
                int yy = calendario.get(Calendar.YEAR);
                int mm = calendario.get(Calendar.MONTH);
                int dd = calendario.get(Calendar.DAY_OF_MONTH);

                DatePickerDialog datePicker = new DatePickerDialog(getActivity(), new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
                        diaInicio = dayOfMonth;
                        mesInicio = monthOfYear + 1;
                        anioInicio = year;
                        String fecha = checkDigito(diaInicio) +"/"+checkDigito(mesInicio)
                                +"/"+checkDigito(anioInicio);
                        txtFechaI.setText(fecha);

                    }
                }, yy, mm, dd);
                datePicker.show();
            }
        });

        txtHoraI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final Calendar calendario = Calendar.getInstance();
                int hh = calendario.get(Calendar.HOUR_OF_DAY);
                int mm = calendario.get(Calendar.MINUTE);

                TimePickerDialog timePicker = new TimePickerDialog(context, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hourofDay, int minute) {
                        String hora = checkDigito(hourofDay) +":"+checkDigito(minute);
                        txtHoraI.setText(hora);
                        horaInicio = hourofDay;
                        minutoInicio = minute;
                    }
                }, hh, mm,true);
                timePicker.show();
            }
        });

        alert.setTitle("AGREGAR VISITA");
        alert.setView(dialogView);
        alert.setPositiveButton("Agregar",null);
        alert.setNegativeButton("Cancelar",null);
        final AlertDialog alertDialog = alert.create();

        alertDialog.setOnShowListener(new DialogInterface.OnShowListener() {
            @Override
            public void onShow(DialogInterface dialogInterface) {
                Calendar c = Calendar.getInstance();
                diaInicio = c.get(Calendar.DAY_OF_MONTH);
                mesInicio = c.get(Calendar.MONTH) + 1;
                anioInicio = c.get(Calendar.YEAR);
                horaInicio = c.get(Calendar.HOUR_OF_DAY);
                minutoInicio = c.get(Calendar.MINUTE);

                txtNumero.setText(checkDigito((visitaAdapter.getItemCount() + 1)));
                txtFechaI.setText(checkDigito(diaInicio) + "/" + checkDigito(mesInicio) + "/" + checkDigito(anioInicio));
                txtHoraI.setText(checkDigito(horaInicio) + ":" + checkDigito(minutoInicio));
                Button btnAdd = alertDialog.getButton(AlertDialog.BUTTON_POSITIVE);
                btnAdd.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        // TODO Do something
                        boolean valido =true;
                        String mensaje = "";
                        boolean vFechaInicio = true, vHoraInicio = true;
                        if(visitas.size() > 0){
                            int y = Integer.parseInt(visitas.get(visitas.size()-1).getV_ANIO());
                            int m = Integer.parseInt(visitas.get(visitas.size()-1).getV_MES());
                            int d = Integer.parseInt(visitas.get(visitas.size()-1).getV_DIA());

                            Date fi1 = new Date(y,m,d);
                            Date fi2 = new Date(anioInicio,mesInicio,diaInicio);
                            String sfi1 = checkDigito(d) + "/" + checkDigito(m) + "/" + checkDigito(y);
                            String sfi2 = checkDigito(diaInicio) + "/" + checkDigito(mesInicio) + "/" + checkDigito(anioInicio);
                            if(fi2.before(fi1)){
                                vFechaInicio = false;
                                if(mensaje.equals("")) mensaje = "FECHA: LA FECHA DE LA NUEVA VISITA NO DEBE SER MENOR A LA VISITA ANTERIOR";
                            }
                        }

                        valido = vFechaInicio;
                        if(valido){
                            Visita visita = new Visita();
                            visita.setID_EMPRESA(idEmpresa);
                            visita.setN_VISITA(String.valueOf(visitaAdapter.getItemCount()+1));
                            visita.setDNI_OPERADOR_E(DNI_OPERADOR_E);
                            visita.setDNI_JEFE_EQUIPO(DNI_JEFE_EQUIPO);
                            visita.setDNI_SUPERVISOR(DNI_SUPERVISOR);
                            visita.setV_OPERADOR_E(V_OPERADOR_E);
                            visita.setV_JEFE_EQUIPO(V_JEFE_EQUIPO);
                            visita.setV_SUPERVISOR(V_SUPERVISOR);
                            visita.setV_DIA(diaInicio+"");
                            visita.setV_MES(mesInicio+"");
                            visita.setV_ANIO(anioInicio + "");
                            visita.setV_HORA_I(horaInicio +"");
                            visita.setV_MINUTO_I(minutoInicio + "");
                            visitas.add(visita);
                            txtResultadoFinal.setText("");
                            txtFechaFinal.setText("");
                            txtFechaFinal.setOnClickListener(null);
//                            rgEstadoEnvio.clearCheck();
                            recyclerView.getAdapter().notifyDataSetChanged();
                            alertDialog.dismiss();
                        }else Toast.makeText(context, mensaje, Toast.LENGTH_SHORT).show();
                    }
                });
            }
        });
        alertDialog.show();
    }

    public void editarVisita(final int posicion){
        AlertDialog.Builder alert = new AlertDialog.Builder(getActivity());
        final View dialogView = getActivity().getLayoutInflater().inflate(R.layout.dialog_agregar_visita, null);
        final LinearLayout lytDialog = (LinearLayout) dialogView.findViewById(R.id.dialog_agregar_visita_lyt);
        final TextView txtNumero = (TextView) dialogView.findViewById(R.id.dialog_agregar_visita_txtNumero);
        final TextView txtFechaI = (TextView) dialogView.findViewById(R.id.dialog_agregar_visita_txtFI);
        final TextView txtHoraI = (TextView) dialogView.findViewById(R.id.dialog_agregar_visita_txtHI);

        txtFechaI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                final Calendar calendario = Calendar.getInstance();
//                int yy = calendario.get(Calendar.YEAR);
//                int mm = calendario.get(Calendar.MONTH);
//                int dd = calendario.get(Calendar.DAY_OF_MONTH);

                int dd = Integer.parseInt(visitas.get(posicion).getV_DIA());
                int mm = Integer.parseInt(visitas.get(posicion).getV_MES());
                int yy = Integer.parseInt(visitas.get(posicion).getV_ANIO());

                DatePickerDialog datePicker = new DatePickerDialog(getActivity(), new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
                        diaInicio = dayOfMonth;
                        mesInicio = monthOfYear + 1;
                        anioInicio = year;
                        String fecha = checkDigito(diaInicio) +"/"+checkDigito(mesInicio)
                                +"/"+checkDigito(anioInicio);
                        txtFechaI.setText(fecha);

                    }
                }, yy, mm-1, dd);
                datePicker.show();
            }
        });

        txtHoraI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final Calendar calendario = Calendar.getInstance();
                int hh = calendario.get(Calendar.HOUR_OF_DAY);
                int mm = calendario.get(Calendar.MINUTE);

                TimePickerDialog timePicker = new TimePickerDialog(context, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hourofDay, int minute) {
                        String hora = checkDigito(hourofDay) +":"+checkDigito(minute);
                        txtHoraI.setText(hora);
                        horaInicio= hourofDay;
                        minutoInicio = minute;
                    }
                }, hh, mm,true);
                timePicker.show();
            }
        });

        alert.setTitle("EDITAR VISITA");
        alert.setView(dialogView);
        alert.setPositiveButton("Guardar",null);
        alert.setNegativeButton("Cancelar",null);
        final AlertDialog alertDialog = alert.create();

        alertDialog.setOnShowListener(new DialogInterface.OnShowListener() {
            @Override
            public void onShow(DialogInterface dialogInterface) {
                diaInicio = Integer.parseInt(visitas.get(posicion).getV_DIA());
                mesInicio = Integer.parseInt(visitas.get(posicion).getV_MES());
                anioInicio = Integer.parseInt(visitas.get(posicion).getV_ANIO());
                horaInicio = Integer.parseInt(visitas.get(posicion).getV_HORA_I());
                minutoInicio = Integer.parseInt(visitas.get(posicion).getV_MINUTO_I());

                txtNumero.setText(checkDigito(Integer.parseInt(visitas.get(posicion).getN_VISITA())));
                txtFechaI.setText(checkDigito(diaInicio) + "/" + checkDigito(mesInicio) + "/" + checkDigito(anioInicio));
                txtHoraI.setText(checkDigito(horaInicio) + ":" + checkDigito(minutoInicio));
                Button btnAdd = alertDialog.getButton(AlertDialog.BUTTON_POSITIVE);
                btnAdd.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        // TODO Do something
                        boolean valido =true;
                        String mensaje = "";
                        boolean vFechaInicio = true;

                        if(visitas.size() > 1){
                            int y = Integer.parseInt(visitas.get(posicion-1).getV_ANIO());
                            int m = Integer.parseInt(visitas.get(posicion-1).getV_MES());
                            int d = Integer.parseInt(visitas.get(posicion-1).getV_DIA());
                            Date fi1 = new Date(y,m,d);
                            Date fi2 = new Date(anioInicio,mesInicio,diaInicio);
                            String sfi1 = checkDigito(d) + "/" + checkDigito(m) + "/" + checkDigito(y);
                            String sfi2 = checkDigito(diaInicio) + "/" + checkDigito(mesInicio) + "/" + checkDigito(anioInicio);

                            if(fi2.before(fi1)){
                                vFechaInicio = false;
                                if(mensaje.equals("")) mensaje = "FECHA: LA FECHA DE LA PROXIMA VISITA NO DEBE SER MENOR A LA VISITA ACTUAL";
                            }
                        }

                        valido = vFechaInicio;
                        if(valido){
                            visitas.get(posicion).setV_DIA(diaInicio+"");
                            visitas.get(posicion).setV_MES(mesInicio+"");
                            visitas.get(posicion).setV_ANIO(anioInicio + "");
                            visitas.get(posicion).setV_HORA_I(horaInicio +"");
                            visitas.get(posicion).setV_MINUTO_I(minutoInicio + "");
                            visitaAdapter.notifyDataSetChanged();
                            alertDialog.dismiss();
                        }else Toast.makeText(context, mensaje, Toast.LENGTH_SHORT).show();
                    }
                });
            }
        });
        alertDialog.show();
    }

    public void finalizarVisita(final int posicion){
        AlertDialog.Builder alert = new AlertDialog.Builder(getActivity());
        final View dialogView = getActivity().getLayoutInflater().inflate(R.layout.dialog_finalizar_visita, null);
        final LinearLayout lytDialog = (LinearLayout) dialogView.findViewById(R.id.dialog_finalizar_visita_lyt);
        final TextView txtNumero = (TextView) dialogView.findViewById(R.id.dialog_finalizar_visita_txtNumero);
        final TextView txtHoraF = (TextView) dialogView.findViewById(R.id.dialog_finalizar_visita_txtHoraFin);
        final Spinner spResultado = (Spinner) dialogView.findViewById(R.id.dialog_finalizar_visita_spResultado);
        final EditText edtEspecifique = (EditText) dialogView.findViewById(R.id.dialog_finalizar_visita_edtEspecifique);
        final CheckBox ckProxVisita = (CheckBox) dialogView.findViewById(R.id.dialog_finalizar_visita_ckProximaVisita);
        final TextView txtFechaProxVisita = (TextView) dialogView.findViewById(R.id.dialog_finalizar_visita_txtFechaProx);
        final TextView txtHoraProxVisita = (TextView) dialogView.findViewById(R.id.dialog_finalizar_visita_txtHoraProx);
        String especifique = "";

        txtHoraF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final Calendar calendario = Calendar.getInstance();
                int dia = calendario.get(Calendar.DAY_OF_MONTH);
                int mes = calendario.get(Calendar.MONTH);
                int anio = calendario.get(Calendar.YEAR);
                int hh = calendario.get(Calendar.HOUR_OF_DAY);
                int mm = calendario.get(Calendar.MINUTE);

                TimePickerDialog timePicker = new TimePickerDialog(context, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hourofDay, int minute) {
                        String hora = checkDigito(hourofDay) +":"+checkDigito(minute);
                        txtHoraF.setText(hora);
                        horaFin = hourofDay;
                        minutoFin = minute;
                    }
                }, hh, mm,true);
                timePicker.show();
            }
        });

        spResultado.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int pos, long l) {
                if(pos == 4 || pos == 2){
                    ckProxVisita.setEnabled(true);
                    ckProxVisita.setChecked(true);
                }else{
                    ckProxVisita.setChecked(false);
                    ckProxVisita.setEnabled(false);
                }
                if(pos == 7){
                    edtEspecifique.setEnabled(true);
                    edtEspecifique.setBackgroundResource(R.drawable.fondo_edit_text);
                }else{
                    if(edtEspecifique.isEnabled()){
                        edtEspecifique.setText("");
                        edtEspecifique.setBackgroundResource(R.drawable.fondo_edit_text_disabled);
                        edtEspecifique.setEnabled(false);
                    }
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {}
        });

        ckProxVisita.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    txtFechaProxVisita.setEnabled(true);
                    txtHoraProxVisita.setEnabled(true);
                    txtFechaProxVisita.setClickable(true);
                    txtHoraProxVisita.setClickable(true);
                    txtFechaProxVisita.setBackgroundResource(R.drawable.fondo_edit_text);
                    txtHoraProxVisita.setBackgroundResource(R.drawable.fondo_edit_text);
                }else{
                    txtFechaProxVisita.setBackgroundResource(R.drawable.fondo_edit_text_disabled);
                    txtHoraProxVisita.setBackgroundResource(R.drawable.fondo_edit_text_disabled);
                    txtFechaProxVisita.setClickable(false);
                    txtHoraProxVisita.setClickable(false);
                    txtFechaProxVisita.setEnabled(false);
                    txtHoraProxVisita.setEnabled(false);
                }
            }
        });



        txtFechaProxVisita.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final Calendar calendario = Calendar.getInstance();
                int yy = calendario.get(Calendar.YEAR);
                int mm = calendario.get(Calendar.MONTH);
                int dd = calendario.get(Calendar.DAY_OF_MONTH);

                DatePickerDialog datePicker = new DatePickerDialog(getActivity(), new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
                        diaProx = dayOfMonth;
                        mesProx = monthOfYear + 1;
                        anioProx = year;
                        String fecha = checkDigito(diaProx) +"/"+checkDigito(mesProx)
                                +"/"+checkDigito(anioProx);
                        txtFechaProxVisita.setText(fecha);

                    }
                }, yy, mm, dd);
                datePicker.show();
            }
        });
        txtHoraProxVisita.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final Calendar calendario = Calendar.getInstance();
                int hh = calendario.get(Calendar.HOUR_OF_DAY);
                int mm = calendario.get(Calendar.MINUTE);

                TimePickerDialog timePicker = new TimePickerDialog(context, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hourofDay, int minute) {
                        String hora = checkDigito(hourofDay) +":"+checkDigito(minute);
                        txtHoraProxVisita.setText(hora);
                        horaProx = hourofDay;
                        minutoProx = minute;
                    }
                }, hh, mm,true);
                timePicker.show();
            }
        });

        alert.setTitle("FINALIZAR VISITA");
        alert.setView(dialogView);
        alert.setPositiveButton("Finalizar",null);
        alert.setNegativeButton("Cancelar",null);
        final AlertDialog alertDialog = alert.create();

        alertDialog.setOnShowListener(new DialogInterface.OnShowListener() {
            @Override
            public void onShow(DialogInterface dialogInterface) {
                ocultarTeclado(lytDialog);
                Calendar c = Calendar.getInstance();
                diaProx = c.get(Calendar.DAY_OF_MONTH);
                mesProx = c.get(Calendar.MONTH) + 1;
                anioProx = c.get(Calendar.YEAR);
                horaProx = c.get(Calendar.HOUR_OF_DAY);
                minutoProx = c.get(Calendar.MINUTE);
                horaFin = horaProx;
                minutoFin = minutoProx;
                txtNumero.setText(checkDigito(Integer.parseInt(visitas.get(posicion).getN_VISITA())));
                txtHoraF.setText(checkDigito(horaFin) + ":" + checkDigito(minutoFin));
                txtFechaProxVisita.setText(checkDigito(diaProx + 1) + "/" + checkDigito(mesProx) + "/" +
                        checkDigito(anioProx));
                txtHoraProxVisita.setText(checkDigito(horaProx) + ":" + checkDigito(minutoProx));
                Button btnFinalizarVisita = alertDialog.getButton(AlertDialog.BUTTON_POSITIVE);
                btnFinalizarVisita.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        // TODO Do something
                        boolean valido = false;
                        boolean vHoraFin = true, vResultado = true,
                                vEspecifique = true, vFechaProxima = true,
                                vHoraProxima = true;
                        String mensaje = "";

                        int t1 = Integer.parseInt(visitas.get(posicion).getV_HORA_I())*60 +
                                Integer.parseInt(visitas.get(posicion).getV_MINUTO_I());
                        int t2 = horaFin * 60 + minutoFin;

                        if(t1 >= t2){
                            vHoraFin = false;
                            if(mensaje.equals("")) mensaje = "LA HORA DE FIN DEBE SER MAYOR A LA DE INICIO";
                        }

                        if(spResultado.getSelectedItemPosition() == 0){
                            vResultado = false;
                            if(mensaje.equals("")) mensaje = "DEBE INDICAR EL RESULTADO DE LA VISITA";
                        }
                        if(spResultado.getSelectedItemPosition() == 1){
                            if(!coberturaCorrecta()){
                                vResultado = false;
                                if(mensaje.equals("")) mensaje = "LA COBERTURA Y CIERRE ES INCORRECTA NO PUEDE FINALIZAR COMO COMPLETA";
                            }
                        }
                        if(spResultado.getSelectedItemPosition() == 4 && !ckProxVisita.isChecked()){
                            vResultado = false;
                            if(mensaje.equals("")) mensaje = "DEBE REGISTRAR INFORMACION DE LA PROXIMA VISITA";
                        }
                        if(edtEspecifique.isEnabled() && edtEspecifique.getText().toString().trim().length() < 3){
                            vEspecifique = false;
                            if(mensaje.equals("")) mensaje = "DEBE ESPECIFICAR EL RESULTADO DE LA VISITA";
                        }
                        if(ckProxVisita.isChecked()){
                            int y = Integer.parseInt(visitas.get(posicion).getV_ANIO());
                            int m = Integer.parseInt(visitas.get(posicion).getV_MES());
                            int d = Integer.parseInt(visitas.get(posicion).getV_DIA());
                            Date fi1 = new Date(y,m,d);
                            Date fi2 = new Date(anioProx,mesProx,diaProx);
                            String sfi1 = checkDigito(d) + "/" + checkDigito(m) + "/" + checkDigito(y);
                            String sfi2 = checkDigito(diaProx) + "/" + checkDigito(mesProx) + "/" + checkDigito(anioProx);

                            if(fi2.before(fi1)){
                                vFechaProxima = false;
                                if(mensaje.equals("")) mensaje = "FECHA: LA FECHA DE LA PROXIMA VISITA NO DEBE SER MENOR A LA VISITA ACTUAL";
                            }
                        }

                        valido = vHoraFin && vResultado && vEspecifique && vFechaProxima;

                        if(valido){
                            visitas.get(posicion).setV_HORA_F(checkDigito(horaFin));
                            visitas.get(posicion).setV_MINUTO_F(checkDigito(minutoFin));
                            visitas.get(posicion).setR_VISITA(spResultado.getSelectedItemPosition()+"");
                            visitas.get(posicion).setR_VISITA_ESP(edtEspecifique.getText().toString());
                            if(ckProxVisita.isChecked()){
                                visitas.get(posicion).setV_PROX_FECHA_DIA(checkDigito(diaProx));
                                visitas.get(posicion).setV_PROX_FECHA_MES(checkDigito(mesProx));
                                visitas.get(posicion).setV_PROX_FECHA_ANIO(checkDigito(anioProx));
                                visitas.get(posicion).setV_PROX_HORA(checkDigito(horaProx));
                                visitas.get(posicion).setV_PROX_MIN(checkDigito(minutoProx));
                            }
                            if(spResultado.getSelectedItemPosition() == 1){
                                btnAgregar.setVisibility(View.GONE);
                            }else{
                                btnAgregar.setVisibility(View.VISIBLE);
                            }
                            visitaAdapter.notifyDataSetChanged();
                            txtResultadoFinal.setText(getResources().getStringArray(R.array.array_resultado_visita)[spResultado.getSelectedItemPosition()]);
                            R_ENCUESTA = spResultado.getSelectedItemPosition();
                            R_ENCUESTA_ESP = edtEspecifique.getText().toString();
                            final Calendar cal = Calendar.getInstance();
                            int yy = Integer.parseInt(visitas.get(posicion).getV_ANIO());
                            int mm = Integer.parseInt(visitas.get(posicion).getV_MES());
                            int dd = Integer.parseInt(visitas.get(posicion).getV_DIA());
                            R_FECHA_DIA = dd;
                            R_FECHA_MES = mm;
                            R_FECHA_ANIO = yy;
                            txtFechaFinal.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    if(visitas.size() > 0){
                                        if(visitas.get(visitas.size()-1).getR_VISITA().equals("")){
                                            mostrarMensaje("DEBE FINALIZAR LA VISITA ACTUAL ANTES DE REGISTRAR DATOS FINALES DE LA ENCUESTA");
                                        }else {
                                            final Calendar calendario = Calendar.getInstance();
                                            int yy = R_FECHA_ANIO;
                                            int mm = R_FECHA_MES -1;
                                            int dd = R_FECHA_DIA;

                                            DatePickerDialog datePicker = new DatePickerDialog(getActivity(), new DatePickerDialog.OnDateSetListener() {
                                                @Override
                                                public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
                                                    R_FECHA_DIA = dayOfMonth;
                                                    R_FECHA_MES = monthOfYear + 1;
                                                    R_FECHA_ANIO = year;
                                                    String fecha = checkDigito(R_FECHA_DIA) +"/"+checkDigito(R_FECHA_MES)
                                                            +"/"+checkDigito(R_FECHA_ANIO);
                                                    txtFechaFinal.setText(fecha);
                                                }
                                            }, yy, mm, dd);
                                            datePicker.show();
                                        }
                                    }else{
                                        mostrarMensaje("NO TIENE VISITAS FINALIZADAS, NO PUEDE REGISTRAR DATOS FINALES DE LA ENCUESTA AUN");
                                    }
                                }
                            });
                            txtFechaFinal.setText(checkDigito(dd) + "/" + checkDigito(mm) + "/" + checkDigito(yy));
                            alertDialog.dismiss();
                        }else Toast.makeText(context, mensaje, Toast.LENGTH_SHORT).show();
                    }
                });
            }
        });
        alertDialog.show();
    }

    public boolean coberturaCorrecta(){
        boolean correcto = false;
        data = new Data(context);
        data.open();
        boolean existenModulos = data.existeModulo1(idEmpresa) && data.existeModulo2(idEmpresa) &&
                data.existeModulo3(idEmpresa) && data.existeModulo4(idEmpresa) &&
                data.existeModulo5(idEmpresa) && data.existeModulo6(idEmpresa) &&
                data.existeModulo7(idEmpresa) && data.existeModulo8(idEmpresa) &&
                data.existeModulo9(idEmpresa) && data.existeModulo10(idEmpresa);
        data.close();
        if(existenModulos){
            mensajeCoberturaCaratula = "";
            mensajeCoberturaGPS = "";
            mensajeCoberturaModulo1 = "";
            mensajeCoberturaModulo2 = "";
            mensajeCoberturaModulo3 = "";
            mensajeCoberturaModulo4 = "";
            mensajeCoberturaModulo5 = "";
            mensajeCoberturaModulo6 = "";
            mensajeCoberturaModulo7 = "";
            mensajeCoberturaModulo8 = "";
            mensajeCoberturaModulo9 = "";
            mensajeCoberturaModulo10 = "";
            correcto = coberturaCaratula() && coberturaModulo1() && coberturaModulo2() &&
                    coberturaModulo3() && coberturaModulo4() && coberturaModulo5() &&
                    coberturaModulo6() && coberturaModulo7() && coberturaModulo8() &&
                    coberturaModulo9() && coberturaModulo10();
        }
        return correcto;
    }

    public boolean coberturaGPS(){
        boolean correcto = false;
        data = new Data(context);
        data.open();
        Caratula caratula = data.getCaratula(idEmpresa);
        data.close();
        if(!caratula.getGPSLATITUD().equals("") && !caratula.getGPSLATITUD().equals("99,99999999") &&
                !caratula.getGPSALTITUD().equals("") && !caratula.getGPSALTITUD().equals("99,99999999") &&
                !caratula.getGPSLONGITUD().equals("") && !caratula.getGPSLONGITUD().equals("99,99999999")){
            correcto = true;
        }
        if(!correcto){
            if(mensajeCoberturaGPS.equals("")) mensajeCoberturaGPS = "FALTA COMPLETAR EL GPS";
        }
        return correcto;
    }
    public boolean coberturaCaratula(){
        boolean correcto = false;

        data = new Data(context);
        data.open();
        Caratula caratula = data.getCaratula(idEmpresa);
        Identificacion identificacion = data.getIdentificacion(idEmpresa);
        DatosEntrevista datosEntrevista = data.getDatosEntrevista(idEmpresa);
        data.close();

        int cTIPVIA = 0;
        String cNOMVIA = caratula.getNOMVIA();
        String cDNI_OPERADOR_E = datosEntrevista.getDNI_OPERADOR();
        String cV_OPERADOR_E = datosEntrevista. getNOM_OPERADOR();
        String cNUM_RUC = identificacion.getNUM_RUC();
        String cRAZON_SOCIAL = identificacion.getRAZON_SOCIAL();
        int cANIO_FUNDACION = 0;
        int cANIO_OPERACION = 0;
        String cNOM_INFORMANTE = identificacion.getNOM_INFORMANTE();
        int cSEXO_INFORMANTE = 0;
        int cEDAD_INFORMANTE = 0;
        int cACAD_INFORMANTE = 0;
        int cCARGO_INFORMANTE = 0;

        if(!caratula.getTIPVIA().equals("")) cTIPVIA = Integer.parseInt(caratula.getTIPVIA());
        if(!identificacion.getANIO_FUNDACION().equals("")) cANIO_FUNDACION = Integer.parseInt(identificacion.getANIO_FUNDACION());
        if(!identificacion.getANIO_OPERACION().equals("")) cANIO_OPERACION = Integer.parseInt(identificacion.getANIO_OPERACION());
        if(!identificacion.getSEXO_INFORMANTE().equals("")) cSEXO_INFORMANTE = Integer.parseInt(identificacion.getSEXO_INFORMANTE());
        if(!identificacion.getEDAD_INFORMANTE().equals("")) cEDAD_INFORMANTE = Integer.parseInt(identificacion.getEDAD_INFORMANTE());
        if(!identificacion.getACAD_INFORMANTE().equals("")) cACAD_INFORMANTE = Integer.parseInt(identificacion.getACAD_INFORMANTE());
        if(!identificacion.getCARGO_INFORMANTE().equals("")) cCARGO_INFORMANTE = Integer.parseInt(identificacion.getCARGO_INFORMANTE());

        if(cTIPVIA > 0 && !cNOMVIA.equals("") && !cDNI_OPERADOR_E.equals("") &&
                !cV_OPERADOR_E.equals("") && !cNUM_RUC.equals("") && !cRAZON_SOCIAL.equals("") &&
                cANIO_FUNDACION > 1900 && cANIO_OPERACION > 1900 && !cNOM_INFORMANTE.equals("") &&
                cSEXO_INFORMANTE > 0 && cEDAD_INFORMANTE > 18 && cACAD_INFORMANTE > 0 && cCARGO_INFORMANTE>0){
            correcto = true;
        }

        if(!correcto){
            if(mensajeCoberturaCaratula.equals("")) mensajeCoberturaCaratula = "FALTA COMPLETAR LA CARATULA, REVISE LAS PANTALLAS DE CARATULA, DATOS ENTREVISTA O IDENTIFICACION";
        }

        return correcto;
    }
    public boolean coberturaModulo1(){
        boolean correcto = false;
        data = new Data(context);
        data.open();
        Modulo1 modulo1 = data.getModulo1(idEmpresa);
        data.close();
        if(!modulo1.getC1_P3().equals("") && !modulo1.getC1_P5().equals("") && !modulo1.getC1_P8().equals("")){
            if(!modulo1.getC1_P1_1().equals("") &&
                    Integer.parseInt(modulo1.getC1_P3())>-1 &&
                    Integer.parseInt(modulo1.getC1_P5())>-1 &&
                    Integer.parseInt(modulo1.getC1_P8())>-1){
                correcto = true;
            }
        }
        if(!correcto){
            if(mensajeCoberturaModulo1.equals("")) mensajeCoberturaModulo1 = "FALTA COMPLETAR EL MODULO 1";
        }
        return correcto;
    }
    public boolean coberturaModulo2(){
        boolean correcto = true;
        data = new Data(context);
        data.open();
        Modulo2 modulo2 = data.getModulo2(idEmpresa);
        data.close();
        if(!modulo2.getC2_P6().equals("") && !modulo2.getC2_P17().equals("") &&
                !modulo2.getC2_P21().equals("") && !modulo2.getC2_P23().equals("") &&
                !modulo2.getC2_P24().equals("") && !modulo2.getC2_P25().equals("")){
            if(!modulo2.getC2_P1().equals("") && Integer.parseInt(modulo2.getC2_P6())>-1 &&
                    !modulo2.getC2_P14().equals("") && Integer.parseInt(modulo2.getC2_P17())>-1 &&
                    Integer.parseInt(modulo2.getC2_P21())>-1 && Integer.parseInt(modulo2.getC2_P23())>-1 &&
                    Integer.parseInt(modulo2.getC2_P24())>-1 && Integer.parseInt(modulo2.getC2_P25())>-1){
                correcto = true;
            }
        }
        if(!correcto){
            if(mensajeCoberturaModulo2.equals("")) mensajeCoberturaModulo2 = "FALTA COMPLETAR EL MODULO 2";
        }
        return correcto;
    }
    public boolean coberturaModulo3(){
        boolean correcto = false;
        data = new Data(context);
        data.open();
        Modulo3 modulo3 = data.getModulo3(idEmpresa);
        data.close();

        if(!modulo3.getC3_P1().equals("") &&
                !modulo3.getC3_P2().equals("") &&
                !modulo3.getC3_P3().equals("") &&
                !modulo3.getC3_P5().equals("") &&
                !modulo3.getC3_P7().equals("") &&
                !modulo3.getC3_P8().equals("") &&
                !modulo3.getC3_P9().equals("") &&
                !modulo3.getC3_P10().equals("") &&
                !modulo3.getC3_P11().equals("") &&
                !modulo3.getC3_P12().equals("")){
            if(Integer.parseInt(modulo3.getC3_P1()) > -1 &&
                    Integer.parseInt(modulo3.getC3_P2()) > -1 &&
                    Integer.parseInt(modulo3.getC3_P3()) > -1 &&
                    Integer.parseInt(modulo3.getC3_P5()) > -1 &&
                    Integer.parseInt(modulo3.getC3_P7()) > -1 &&
                    Integer.parseInt(modulo3.getC3_P8()) > -1 &&
                    Integer.parseInt(modulo3.getC3_P9()) > -1 &&
                    Integer.parseInt(modulo3.getC3_P10()) > -1 &&
                    Integer.parseInt(modulo3.getC3_P11()) > -1 &&
                    Integer.parseInt(modulo3.getC3_P12()) > -1){
                correcto = true;
            }
        }

        if(!correcto){
            if(mensajeCoberturaModulo3.equals("")) mensajeCoberturaModulo3 = "FALTA COMPLETAR EL MODULO 3";
        }
        return correcto;
    }
    public boolean coberturaModulo4(){
        boolean correcto = false;
        data = new Data(context);
        data.open();
        Modulo4 modulo4 = data.getModulo4(idEmpresa);
        data.close();

        if(!modulo4.getC4_P1().equals("") &&
                !modulo4.getC4_P2().equals("") &&
                !modulo4.getC4_P3().equals("") &&
                !modulo4.getC4_P4().equals("") &&
                !modulo4.getC4_P5().equals("") &&
                !modulo4.getC4_P6().equals("") &&
                !modulo4.getC4_P7().equals("") &&
                !modulo4.getC4_P10().equals("")){
            if(Integer.parseInt(modulo4.getC4_P1())>-1 &&
                    Integer.parseInt(modulo4.getC4_P2())>-1 &&
                    Integer.parseInt(modulo4.getC4_P3())>-1 &&
                    Integer.parseInt(modulo4.getC4_P4())>-1 &&
                    Integer.parseInt(modulo4.getC4_P5())>-1 &&
                    Integer.parseInt(modulo4.getC4_P6())>-1 &&
                    Integer.parseInt(modulo4.getC4_P7())>-1 &&
                    Integer.parseInt(modulo4.getC4_P10())>-1
                    ){
                correcto = true;
            }
        }

        if(!correcto){
            if(mensajeCoberturaModulo4.equals("")) mensajeCoberturaModulo4 = "FALTA COMPLETAR EL MODULO 4";
        }

        return correcto;
    }
    public boolean coberturaModulo5(){
        boolean correcto1 = false;
        boolean correcto2 = false;

        data = new Data(context);
        data.open();
        Modulo5 modulo5 = data.getModulo5(idEmpresa);
        data.close();

        if(!modulo5.getC5_P1().equals("") && !modulo5.getC5_P6().equals("") && !modulo5.getC5_P8().equals("")){
            if(Integer.parseInt(modulo5.getC5_P1())>-1 &&
                    (!modulo5.getC5_P1_1_1().equals("") || !modulo5.getC5_P1_1_2().equals("") || !modulo5.getC5_P1_1_3().equals("") ||
                            !modulo5.getC5_P1_1_4().equals("") || !modulo5.getC5_P1_1_5().equals("") || !modulo5.getC5_P1_1_6().equals("") ||
                            !modulo5.getC5_P1_1_7().equals("") || !modulo5.getC5_P1_1_8().equals("") || !modulo5.getC5_P1_1_9().equals("")) &&
                    Integer.parseInt(modulo5.getC5_P6())>-1 &&
                    Integer.parseInt(modulo5.getC5_P8())==0 ){
                correcto1 = true;
            }
        }
        if(!modulo5.getC5_P1().equals("") &&
                !modulo5.getC5_P6().equals("") &&
                !modulo5.getC5_P8().equals("") &&
                !modulo5.getC5_P27_1_1().equals("") &&
                !modulo5.getC5_P27_1_2().equals("") &&
                !modulo5.getC5_P27_1_3().equals("") &&
                !modulo5.getC5_P27_1_4().equals("") &&
                !modulo5.getC5_P27_1_5().equals("") &&
                !modulo5.getC5_P27_1_6().equals("") &&
                !modulo5.getC5_P27_1_7().equals("") &&
                !modulo5.getC5_P27_1_8().equals("") &&
                !modulo5.getC5_P27_1_9().equals("") &&
                !modulo5.getC5_P27_2_1().equals("") &&
                !modulo5.getC5_P27_2_2().equals("") &&
                !modulo5.getC5_P27_2_3().equals("") &&
                !modulo5.getC5_P27_2_4().equals("") &&
                !modulo5.getC5_P27_2_5().equals("") &&
                !modulo5.getC5_P27_2_6().equals("") &&
                !modulo5.getC5_P27_2_7().equals("") &&
                !modulo5.getC5_P27_2_8().equals("") &&
                !modulo5.getC5_P27_2_9().equals("")){
            if(Integer.parseInt(modulo5.getC5_P1()) > -1 &&
                    (!modulo5.getC5_P1_1_1().equals("") || !modulo5.getC5_P1_1_2().equals("") || !modulo5.getC5_P1_1_3().equals("") ||
                            !modulo5.getC5_P1_1_4().equals("") || !modulo5.getC5_P1_1_5().equals("") || !modulo5.getC5_P1_1_6().equals("") ||
                            !modulo5.getC5_P1_1_7().equals("") || !modulo5.getC5_P1_1_8().equals("") || !modulo5.getC5_P1_1_9().equals("")) &&
                    Integer.parseInt(modulo5.getC5_P6()) > -1 &&
                    Integer.parseInt(modulo5.getC5_P27_1_1()) > -1 &&
                    Integer.parseInt(modulo5.getC5_P27_1_2()) > -1 &&
                    Integer.parseInt(modulo5.getC5_P27_1_3()) > -1 &&
                    Integer.parseInt(modulo5.getC5_P27_1_4()) > -1 &&
                    Integer.parseInt(modulo5.getC5_P27_1_5()) > -1 &&
                    Integer.parseInt(modulo5.getC5_P27_1_6()) > -1 &&
                    Integer.parseInt(modulo5.getC5_P27_1_7()) > -1 &&
                    Integer.parseInt(modulo5.getC5_P27_1_8()) > -1 &&
                    Integer.parseInt(modulo5.getC5_P27_1_9()) > -1 &&
                    Integer.parseInt(modulo5.getC5_P27_2_1()) > -1 &&
                    Integer.parseInt(modulo5.getC5_P27_2_2()) > -1 &&
                    Integer.parseInt(modulo5.getC5_P27_2_3()) > -1 &&
                    Integer.parseInt(modulo5.getC5_P27_2_4()) > -1 &&
                    Integer.parseInt(modulo5.getC5_P27_2_5()) > -1 &&
                    Integer.parseInt(modulo5.getC5_P27_2_6()) > -1 &&
                    Integer.parseInt(modulo5.getC5_P27_2_7()) > -1 &&
                    Integer.parseInt(modulo5.getC5_P27_2_8()) > -1 &&
                    Integer.parseInt(modulo5.getC5_P27_2_9()) > -1){
                correcto2 = true;
            }
        }
        if(!correcto1 && ! correcto2){
            if(mensajeCoberturaModulo5.equals("")) mensajeCoberturaModulo5 = "FALTA COMPLETAR EL MODULO 5";
        }

        return correcto1 || correcto2;
    }
    public boolean coberturaModulo6(){
        boolean correcto1 = false;
        boolean correcto2 = false;

        data = new Data(context);
        data.open();
        Modulo6 modulo6 = data.getModulo6(idEmpresa);
        data.close();
        if(!modulo6.getC6_P1().equals("") &&
                !modulo6.getC6_P2().equals("") &&
                !modulo6.getC6_P3().equals("") &&
                !modulo6.getC6_P9().equals("") &&
                !modulo6.getC6_P11_1().equals("") &&
                !modulo6.getC6_P11_2().equals("") &&
                !modulo6.getC6_P11_3().equals("") &&
                !modulo6.getC6_P11_4().equals("") &&
                !modulo6.getC6_P11_5().equals("") &&
                !modulo6.getC6_P11_6().equals("") &&
                !modulo6.getC6_P11_7().equals("") &&
                !modulo6.getC6_P11_8().equals("") &&
                !modulo6.getC6_P11_9().equals("")
                ){
            if(Integer.parseInt(modulo6.getC6_P1()) > -1 &&
                    Integer.parseInt(modulo6.getC6_P3()) > -1 &&
                    Integer.parseInt(modulo6.getC6_P9()) > -1 &&
                    (Integer.parseInt(modulo6.getC6_P11_1()) +
                            Integer.parseInt(modulo6.getC6_P11_2()) +
                            Integer.parseInt(modulo6.getC6_P11_3()) +
                            Integer.parseInt(modulo6.getC6_P11_4()) +
                            Integer.parseInt(modulo6.getC6_P11_5()) +
                            Integer.parseInt(modulo6.getC6_P11_6()) +
                            Integer.parseInt(modulo6.getC6_P11_7()) +
                            Integer.parseInt(modulo6.getC6_P11_8()) +
                            Integer.parseInt(modulo6.getC6_P11_9())) > 0){
                correcto1 = true;
            }
            if(Integer.parseInt(modulo6.getC6_P1()) == 0 &&
                    Integer.parseInt(modulo6.getC6_P2()) > -1 &&
                    Integer.parseInt(modulo6.getC6_P3()) > -1 &&
                    Integer.parseInt(modulo6.getC6_P9()) > -1 &&
                    (Integer.parseInt(modulo6.getC6_P11_1()) +
                            Integer.parseInt(modulo6.getC6_P11_2()) +
                            Integer.parseInt(modulo6.getC6_P11_3()) +
                            Integer.parseInt(modulo6.getC6_P11_4()) +
                            Integer.parseInt(modulo6.getC6_P11_5()) +
                            Integer.parseInt(modulo6.getC6_P11_6()) +
                            Integer.parseInt(modulo6.getC6_P11_7()) +
                            Integer.parseInt(modulo6.getC6_P11_8()) +
                            Integer.parseInt(modulo6.getC6_P11_9())) > 0){
                correcto2 = true;
            }
        }

        if(!correcto1 && ! correcto2){
            if(mensajeCoberturaModulo6.equals("")) mensajeCoberturaModulo6 = "FALTA COMPLETAR EL MODULO 6";
        }

        return correcto1 || correcto2;
    }
    public boolean coberturaModulo7(){
        boolean correcto = false;
        data = new Data(context);
        data.open();
        Modulo7 modulo7 = data.getModulo7(idEmpresa);
        data.close();
        if(!modulo7.getC7_P1().equals("") &&
                !modulo7.getC7_P1().equals("") &&
                !modulo7.getC7_P2().equals("") &&
                !modulo7.getC7_P4().equals("") &&
                !modulo7.getC7_P7().equals("") &&
                !modulo7.getC7_P10().equals("") &&
                !modulo7.getC7_P11().equals("") &&
                !modulo7.getC7_P14().equals("") &&
                !modulo7.getC7_P15().equals("") &&
                !modulo7.getC7_P20().equals("") &&
                !modulo7.getC7_P21().equals("") &&
                !modulo7.getC7_P28_1().equals("") &&
                !modulo7.getC7_P28_2().equals("") &&
                !modulo7.getC7_P28_3().equals("") &&
                !modulo7.getC7_P28_4().equals("") &&
                !modulo7.getC7_P28_5().equals("") &&
                !modulo7.getC7_P34().equals("") &&
                !modulo7.getC7_P35().equals("") &&
                !modulo7.getC7_P37().equals("") &&
                !modulo7.getC7_P38_1_1().equals("") &&
                !modulo7.getC7_P38_1_2().equals("") &&
                !modulo7.getC7_P38_1_3().equals("") &&
                !modulo7.getC7_P38_1_4().equals("") &&
                !modulo7.getC7_P38_1_5().equals("") &&
                !modulo7.getC7_P41().equals("") &&
                !modulo7.getC7_P44().equals("") &&
                !modulo7.getC7_P46().equals("")){
            if(Integer.parseInt(modulo7.getC7_P1())>-1 &&
                    Integer.parseInt(modulo7.getC7_P2())>-1 &&
                    Integer.parseInt(modulo7.getC7_P4())>-1 &&
                    Integer.parseInt(modulo7.getC7_P7())>-1 &&
                    Integer.parseInt(modulo7.getC7_P10())>-1 &&
                    Integer.parseInt(modulo7.getC7_P11())>-1 &&
                    Integer.parseInt(modulo7.getC7_P14())>-1 &&
                    Integer.parseInt(modulo7.getC7_P15())>-1 &&
                    Integer.parseInt(modulo7.getC7_P20())>-1 &&
                    Integer.parseInt(modulo7.getC7_P21())>-1 &&
                    (Integer.parseInt(modulo7.getC7_P28_1()) +
                            Integer.parseInt(modulo7.getC7_P28_2()) +
                            Integer.parseInt(modulo7.getC7_P28_3()) +
                            Integer.parseInt(modulo7.getC7_P28_4()) +
                            Integer.parseInt(modulo7.getC7_P28_5())) > 0 &&
                    Integer.parseInt(modulo7.getC7_P34())>-1 &&
                    Integer.parseInt(modulo7.getC7_P35())>-1 &&
                    Integer.parseInt(modulo7.getC7_P37())>-1 &&
                    (Integer.parseInt(modulo7.getC7_P38_1_1()) +
                            Integer.parseInt(modulo7.getC7_P38_1_2()) +
                            Integer.parseInt(modulo7.getC7_P38_1_3()) +
                            Integer.parseInt(modulo7.getC7_P38_1_4()) +
                            Integer.parseInt(modulo7.getC7_P38_1_5())) > 0){
                    correcto = true;
            }else{if(mensajeCoberturaModulo7.equals("")) mensajeCoberturaModulo7 = "FALTA COMPLETAR EL MODULO 7";}
        }else{if(mensajeCoberturaModulo7.equals("")) mensajeCoberturaModulo7 = "FALTA COMPLETAR EL MODULO 7";}
        return correcto;
    }
    public boolean coberturaModulo8(){
        boolean correcto = false;
        data = new Data(context);
        data.open();
        Modulo8 modulo8 = data.getModulo8(idEmpresa);
        data.close();


        if(!modulo8.getC8_P1_1_1().equals("") && !modulo8.getC8_P1_1_2().equals("") &&
                !modulo8.getC8_P1_1_3().equals("") && !modulo8.getC8_P1_1_4().equals("") &&
                !modulo8.getC8_P1_1_5().equals("") && !modulo8.getC8_P1_1_6().equals("")){
            if(Integer.parseInt(modulo8.getC8_P1_1_1())>-1 &&
                    Integer.parseInt(modulo8.getC8_P1_1_2())>-1 &&
                    Integer.parseInt(modulo8.getC8_P1_1_3())>-1 &&
                    Integer.parseInt(modulo8.getC8_P1_1_4())>-1 &&
                    Integer.parseInt(modulo8.getC8_P1_1_5())>-1 &&
                    Integer.parseInt(modulo8.getC8_P1_1_6())>-1){
                correcto = true;
            }else{if(mensajeCoberturaModulo8.equals("")) mensajeCoberturaModulo8 = "FALTA COMPLETAR EL MODULO 8";}
        }else{if(mensajeCoberturaModulo8.equals("")) mensajeCoberturaModulo8 = "FALTA COMPLETAR EL MODULO 8";}
        return correcto;
    }
    public boolean coberturaModulo9(){
        boolean correcto = false;
        data = new Data(context);
        data.open();
        Modulo9 modulo9 = data.getModulo9(idEmpresa);
        data.close();
        boolean cC9_P1 = false;
        boolean cC9_P2 = false;
        if(!modulo9.getC9_P1().equals(""))cC9_P1 = true;
        else if(mensajeCoberturaModulo9.equals("")) mensajeCoberturaModulo9 = "FALTA COMPLETAR P1 DEL MODULO 9";
        if(!modulo9.getC9_P2().equals(""))cC9_P2 = true;
        else if(mensajeCoberturaModulo9.equals("")) mensajeCoberturaModulo9 = "FALTA COMPLETAR P2 DEL MODULO 9";
        correcto = cC9_P1 && cC9_P2;
        return correcto;
    }
    public boolean coberturaModulo10(){
        boolean correcto = false;
        data = new Data(context);
        data.open();
        Modulo10 modulo10 = data.getModulo10(idEmpresa);
        data.close();
        boolean cC10_P1 = false;
        boolean cC10_P2 = false;
        boolean cC10_P3 = false;
        boolean cC10_P4 = false;
        if(!modulo10.getC10_P1().equals("")) cC10_P1 = true;
        else if(mensajeCoberturaModulo10.equals("")) mensajeCoberturaModulo10 = "FALTA COMPLETAR P1 DEL MODULO 10";
        if(!modulo10.getC10_P2().equals("")) cC10_P2 = true;
        else if(mensajeCoberturaModulo10.equals("")) mensajeCoberturaModulo10 = "FALTA COMPLETAR P2 DEL MODULO 10";
        if(!modulo10.getC10_P3().equals("")) cC10_P3 = true;
        else if(mensajeCoberturaModulo10.equals("")) mensajeCoberturaModulo10 = "FALTA COMPLETAR P3 DEL MODULO 10";
        if(!modulo10.getC10_P4().equals("")) cC10_P4 = true;
        else if(mensajeCoberturaModulo10.equals("")) mensajeCoberturaModulo10 = "FALTA COMPLETAR P4 DEL MODULO 10";
        correcto = cC10_P1 && cC10_P2 && cC10_P3 && cC10_P4;
        return correcto;
    }


    public String checkDigito (int number) {
        return number <= 9 ? "0" + number : String.valueOf(number);
    }
    public void ocultarTeclado(View view){
        InputMethodManager mgr = (InputMethodManager) getActivity().getSystemService(Context.INPUT_METHOD_SERVICE);
        mgr.hideSoftInputFromWindow(view.getWindowToken(), 0);
    }

    public void cargarDatos(){
        data = new Data(context);
        data.open();
        datosEntrevista = new DatosEntrevista();
        datosEntrevista = data.getDatosEntrevista(idEmpresa);
        DNI_OPERADOR_E = datosEntrevista.getDNI_OPERADOR();
        V_OPERADOR_E = datosEntrevista.getNOM_OPERADOR();
        DNI_JEFE_EQUIPO = datosEntrevista.getDNI_JEFE();
        V_JEFE_EQUIPO = datosEntrevista.getNOM_JEFE();
        DNI_SUPERVISOR = datosEntrevista.getDNI_SUPERVISOR();
        V_SUPERVISOR = datosEntrevista.getNOM_SUPERVISOR();



        if(!datosEntrevista.getR_ESTADO_ENVIO().equals("")){
            int childPos = Integer.parseInt(datosEntrevista.getR_ESTADO_ENVIO());
            ((RadioButton)rgEstadoEnvio.getChildAt(childPos)).setChecked(true);
        }
        visitas = new ArrayList<Visita>();
        if(data.existenVisitas(idEmpresa)){
            visitas = data.getVisitas(idEmpresa);
        }
        data.close();
        if(visitas.size() > 0){
            if(!visitas.get(visitas.size()-1).getR_VISITA().equals("")){
                if(!datosEntrevista.getR_FECHA_DIA().equals("")){
                    R_FECHA_DIA = Integer.parseInt(datosEntrevista.getR_FECHA_DIA());
                    R_FECHA_MES = Integer.parseInt(datosEntrevista.getR_FECHA_MES());
                    R_FECHA_ANIO = Integer.parseInt(datosEntrevista.getR_FECHA_ANIO());
                    String fecha = checkDigito(R_FECHA_DIA) +"/"+checkDigito(R_FECHA_MES)
                            +"/"+checkDigito(R_FECHA_ANIO);
                    txtFechaFinal.setText(fecha);
                }
                if(!datosEntrevista.getR_ENCUESTA().equals("")){
                    String[] array = getActivity().getResources().getStringArray(R.array.array_resultado_visita);
                    txtResultadoFinal.setText(array[Integer.parseInt(datosEntrevista.getR_ENCUESTA())]);
                }
            }
        }
    }

    public void guardarDatos(){
        data = new Data(context);
        data.open();
        for (Visita visita: visitas) {
            if(visita.getID() == -1){
                data.insertarVisita(visita);
            }else{
                data.actualizarVisita(visita.getID(),visita.toValues());
            }
        }
        data.close();
    }

    public boolean validar(){
//        //revisarcampos
        String mensaje = "";
        boolean valido = false;
        boolean vVisitaAbierta = true;
        if(visitas.size() == 0){
            vVisitaAbierta = false;
            if(mensaje.equals("")) mensaje = "DEBE AGREGAR UNA VISITA ANTES DE CONTINUAR";
        }else{
            if(!visitas.get(visitas.size()-1).getR_VISITA().equals("")) {
                vVisitaAbierta = false;
                if(!txtResultadoFinal.getText().equals("")) {
                    if (mensaje.equals(""))
                        mensaje = "VISITA FINALIZADA, AGREGUE UNA NUEVA VISITA SI QUIERE CONTINUAR";
                }else {
                    if (mensaje.equals(""))
                            mensaje = "DEBE AGREGAR UNA VISITA ANTES DE CONTINUAR";
                }
            }
        }
        valido = vVisitaAbierta;
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
}
