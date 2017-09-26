package pe.gob.inei.encuestahabilidades.pojos;

import android.content.ContentValues;

import pe.gob.inei.encuestahabilidades.modelo.SQLConstantes;

/**
 * Created by otin016 on 28/06/2017.
 */

public class Visita {

    private int ID;
    private String ID_EMPRESA;
    private String DNI_OPERADOR_E;
    private String V_OPERADOR_E;
    private String DNI_JEFE_EQUIPO;
    private String V_JEFE_EQUIPO;
    private String DNI_SUPERVISOR;
    private String V_SUPERVISOR;
    private String N_VISITA;
    private String V_DIA;
    private String V_MES;
    private String V_ANIO;
    private String V_HORA_I;
    private String V_MINUTO_I;
    private String V_HORA_F;
    private String V_MINUTO_F;
    private String R_VISITA;
    private String R_VISITA_ESP;
    private String V_PROX_FECHA_DIA;
    private String V_PROX_FECHA_MES;
    private String V_PROX_FECHA_ANIO;
    private String V_PROX_HORA;
    private String V_PROX_MIN;
    private String USU_CREACION;
    private String FEC_CREACION;
    private String USU_REGISTRO;
    private String FEC_REGISTRO;



    public Visita() {
        this.ID = -1;
        this.ID_EMPRESA = "";
        this.DNI_OPERADOR_E = "";
        V_OPERADOR_E = "";
        this.DNI_JEFE_EQUIPO = "";
        V_JEFE_EQUIPO = "";
        this.DNI_SUPERVISOR = "";
        V_SUPERVISOR = "";
        N_VISITA = "";
        V_DIA = "";
        V_MES = "";
        V_ANIO = "";
        V_HORA_I = "";
        V_MINUTO_I = "";
        V_HORA_F = "";
        V_MINUTO_F = "";
        R_VISITA = "";
        R_VISITA_ESP = "";
        V_PROX_FECHA_DIA = "";
        V_PROX_FECHA_MES = "";
        V_PROX_FECHA_ANIO = "";
        V_PROX_HORA = "";
        V_PROX_MIN = "";
        this.USU_CREACION = "";
        this.FEC_CREACION = "";
        this.USU_REGISTRO = "";
        this.FEC_REGISTRO = "";
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getUSU_CREACION() {
        return USU_CREACION;
    }

    public void setUSU_CREACION(String USU_CREACION) {
        this.USU_CREACION = USU_CREACION;
    }

    public String getFEC_CREACION() {
        return FEC_CREACION;
    }

    public void setFEC_CREACION(String FEC_CREACION) {
        this.FEC_CREACION = FEC_CREACION;
    }

    public String getUSU_REGISTRO() {
        return USU_REGISTRO;
    }

    public void setUSU_REGISTRO(String USU_REGISTRO) {
        this.USU_REGISTRO = USU_REGISTRO;
    }

    public String getFEC_REGISTRO() {
        return FEC_REGISTRO;
    }

    public void setFEC_REGISTRO(String FEC_REGISTRO) {
        this.FEC_REGISTRO = FEC_REGISTRO;
    }

    public String getID_EMPRESA() {
        return ID_EMPRESA;
    }

    public void setID_EMPRESA(String ID_EMPRESA) {
        this.ID_EMPRESA = ID_EMPRESA;
    }

    public String getDNI_OPERADOR_E() {
        return DNI_OPERADOR_E;
    }

    public void setDNI_OPERADOR_E(String DNI_OPERADOR_E) {
        this.DNI_OPERADOR_E = DNI_OPERADOR_E;
    }

    public String getV_OPERADOR_E() {
        return V_OPERADOR_E;
    }

    public void setV_OPERADOR_E(String v_OPERADOR_E) {
        V_OPERADOR_E = v_OPERADOR_E;
    }

    public String getDNI_JEFE_EQUIPO() {
        return DNI_JEFE_EQUIPO;
    }

    public void setDNI_JEFE_EQUIPO(String DNI_JEFE_EQUIPO) {
        this.DNI_JEFE_EQUIPO = DNI_JEFE_EQUIPO;
    }

    public String getV_JEFE_EQUIPO() {
        return V_JEFE_EQUIPO;
    }

    public void setV_JEFE_EQUIPO(String v_JEFE_EQUIPO) {
        V_JEFE_EQUIPO = v_JEFE_EQUIPO;
    }

    public String getDNI_SUPERVISOR() {
        return DNI_SUPERVISOR;
    }

    public void setDNI_SUPERVISOR(String DNI_SUPERVISOR) {
        this.DNI_SUPERVISOR = DNI_SUPERVISOR;
    }

    public String getV_SUPERVISOR() {
        return V_SUPERVISOR;
    }

    public void setV_SUPERVISOR(String v_SUPERVISOR) {
        V_SUPERVISOR = v_SUPERVISOR;
    }

    public String getN_VISITA() {
        return N_VISITA;
    }

    public void setN_VISITA(String n_VISITA) {
        N_VISITA = n_VISITA;
    }

    public String getV_DIA() {
        return V_DIA;
    }

    public void setV_DIA(String v_DIA) {
        V_DIA = v_DIA;
    }

    public String getV_MES() {
        return V_MES;
    }

    public void setV_MES(String v_MES) {
        V_MES = v_MES;
    }

    public String getV_ANIO() {
        return V_ANIO;
    }

    public void setV_ANIO(String v_ANIO) {
        V_ANIO = v_ANIO;
    }

    public String getV_HORA_I() {
        return V_HORA_I;
    }

    public void setV_HORA_I(String v_HORA_I) {
        V_HORA_I = v_HORA_I;
    }

    public String getV_MINUTO_I() {
        return V_MINUTO_I;
    }

    public void setV_MINUTO_I(String v_MINUTO_I) {
        V_MINUTO_I = v_MINUTO_I;
    }

    public String getV_HORA_F() {
        return V_HORA_F;
    }

    public void setV_HORA_F(String v_HORA_F) {
        V_HORA_F = v_HORA_F;
    }

    public String getV_MINUTO_F() {
        return V_MINUTO_F;
    }

    public void setV_MINUTO_F(String v_MINUTO_F) {
        V_MINUTO_F = v_MINUTO_F;
    }

    public String getR_VISITA() {
        return R_VISITA;
    }

    public void setR_VISITA(String r_VISITA) {
        R_VISITA = r_VISITA;
    }

    public String getR_VISITA_ESP() {
        return R_VISITA_ESP;
    }

    public void setR_VISITA_ESP(String r_VISITA_ESP) {
        R_VISITA_ESP = r_VISITA_ESP;
    }

    public String getV_PROX_FECHA_DIA() {
        return V_PROX_FECHA_DIA;
    }

    public void setV_PROX_FECHA_DIA(String v_PROX_FECHA_DIA) {
        V_PROX_FECHA_DIA = v_PROX_FECHA_DIA;
    }

    public String getV_PROX_FECHA_MES() {
        return V_PROX_FECHA_MES;
    }

    public void setV_PROX_FECHA_MES(String v_PROX_FECHA_MES) {
        V_PROX_FECHA_MES = v_PROX_FECHA_MES;
    }

    public String getV_PROX_FECHA_ANIO() {
        return V_PROX_FECHA_ANIO;
    }

    public void setV_PROX_FECHA_ANIO(String v_PROX_FECHA_ANIO) {
        V_PROX_FECHA_ANIO = v_PROX_FECHA_ANIO;
    }

    public String getV_PROX_HORA() {
        return V_PROX_HORA;
    }

    public void setV_PROX_HORA(String v_PROX_HORA) {
        V_PROX_HORA = v_PROX_HORA;
    }

    public String getV_PROX_MIN() {
        return V_PROX_MIN;
    }

    public void setV_PROX_MIN(String v_PROX_MIN) {
        V_PROX_MIN = v_PROX_MIN;
    }

    public ContentValues toValues() {
        ContentValues contentValues = new ContentValues(26);
        contentValues.put(SQLConstantes.VISITA_ID_EMPRESA,ID_EMPRESA);
        contentValues.put(SQLConstantes.VISITA_DNI_OPERADOR,DNI_OPERADOR_E);
        contentValues.put(SQLConstantes.VISITA_NOMBRE_OPERADOR,V_OPERADOR_E);
        contentValues.put(SQLConstantes.VISITA_DNI_JEFE,DNI_JEFE_EQUIPO);
        contentValues.put(SQLConstantes.VISITA_NOMBRE_JEFE,V_JEFE_EQUIPO);
        contentValues.put(SQLConstantes.VISITA_DNI_SUPERVISOR,DNI_SUPERVISOR);
        contentValues.put(SQLConstantes.VISITA_NOMBRE_SUPERVISOR,V_SUPERVISOR);
        contentValues.put(SQLConstantes.VISITA_N,N_VISITA);
        contentValues.put(SQLConstantes.VISITA_DIA,V_DIA);
        contentValues.put(SQLConstantes.VISITA_MES,V_MES);
        contentValues.put(SQLConstantes.VISITA_ANIO,V_ANIO);
        contentValues.put(SQLConstantes.VISITA_HORAI,V_HORA_I);
        contentValues.put(SQLConstantes.VISITA_MINUTOI,V_MINUTO_I);
        contentValues.put(SQLConstantes.VISITA_HORAF,V_HORA_F);
        contentValues.put(SQLConstantes.VISITA_MINUTOF,V_MINUTO_F);
        contentValues.put(SQLConstantes.VISITA_RESULTADO,R_VISITA);
        contentValues.put(SQLConstantes.VISITA_RESULTADO_ESP,R_VISITA_ESP);
        contentValues.put(SQLConstantes.VISITA_PROX_DIA,V_PROX_FECHA_DIA);
        contentValues.put(SQLConstantes.VISITA_PROX_MES,V_PROX_FECHA_MES);
        contentValues.put(SQLConstantes.VISITA_PROX_ANIO,V_PROX_FECHA_ANIO);
        contentValues.put(SQLConstantes.VISITA_PROX_HORA,V_PROX_HORA);
        contentValues.put(SQLConstantes.VISITA_PROX_MINUTO,V_PROX_MIN);
        contentValues.put(SQLConstantes.VISITA_USUCREACION,USU_CREACION);
        contentValues.put(SQLConstantes.VISITA_FECCREACION,FEC_CREACION);
        contentValues.put(SQLConstantes.VISITA_USUREGISTRO,USU_REGISTRO);
        contentValues.put(SQLConstantes.VISITA_FECREGISTRO,FEC_REGISTRO);
        return contentValues;
    }
}
