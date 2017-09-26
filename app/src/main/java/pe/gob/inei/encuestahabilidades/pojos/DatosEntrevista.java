package pe.gob.inei.encuestahabilidades.pojos;

import android.content.ContentValues;

import pe.gob.inei.encuestahabilidades.modelo.SQLConstantes;

/**
 * Created by otin016 on 25/08/2017.
 */

public class DatosEntrevista {
    private String ID;
    private String DNI_OPERADOR;
    private String DNI_JEFE;
    private String DNI_SUPERVISOR;
    private String NOM_OPERADOR;
    private String NOM_JEFE;
    private String NOM_SUPERVISOR;

    private String R_ENCUESTA;
    private String R_ENCUESTA_ESP;
    private String R_FECHA_DIA;
    private String R_FECHA_MES;
    private String R_FECHA_ANIO;
    private String R_ESTADO_ENVIO;

    private String USU_CREACION;
    private String FEC_CREACION;
    private String USU_REGISTRO;
    private String FEC_REGISTRO;

    public DatosEntrevista() {
        this.ID = "";
        this.DNI_OPERADOR = "";
        this.DNI_JEFE = "";
        this.DNI_SUPERVISOR = "";
        this.NOM_OPERADOR = "";
        this.NOM_JEFE = "";
        this.NOM_SUPERVISOR = "";
        this.R_ENCUESTA= "";
        this.R_ENCUESTA_ESP= "";
        this.R_FECHA_DIA= "";
        this.R_FECHA_MES= "";
        this.R_FECHA_ANIO= "";
        this.R_ESTADO_ENVIO= "";
        this.USU_CREACION = "";
        this.FEC_CREACION = "";
        this.USU_REGISTRO = "";
        this.FEC_REGISTRO = "";

    }

    public void setR_ESTADO_ENVIO(String r_ESTADO_ENVIO) {
        R_ESTADO_ENVIO = r_ESTADO_ENVIO;
    }

    public String getR_ESTADO_ENVIO() {
        return R_ESTADO_ENVIO;
    }

    public String getR_ENCUESTA() {
        return R_ENCUESTA;
    }

    public void setR_ENCUESTA(String r_ENCUESTA) {
        R_ENCUESTA = r_ENCUESTA;
    }

    public String getR_ENCUESTA_ESP() {
        return R_ENCUESTA_ESP;
    }

    public void setR_ENCUESTA_ESP(String r_ENCUESTA_ESP) {
        R_ENCUESTA_ESP = r_ENCUESTA_ESP;
    }

    public String getR_FECHA_DIA() {
        return R_FECHA_DIA;
    }

    public void setR_FECHA_DIA(String r_FECHA_DIA) {
        R_FECHA_DIA = r_FECHA_DIA;
    }

    public String getR_FECHA_MES() {
        return R_FECHA_MES;
    }

    public void setR_FECHA_MES(String r_FECHA_MES) {
        R_FECHA_MES = r_FECHA_MES;
    }

    public String getR_FECHA_ANIO() {
        return R_FECHA_ANIO;
    }

    public void setR_FECHA_ANIO(String r_FECHA_ANIO) {
        R_FECHA_ANIO = r_FECHA_ANIO;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
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

    public String getDNI_OPERADOR() {
        return DNI_OPERADOR;
    }

    public void setDNI_OPERADOR(String DNI_OPERADOR) {
        this.DNI_OPERADOR = DNI_OPERADOR;
    }

    public String getDNI_JEFE() {
        return DNI_JEFE;
    }

    public void setDNI_JEFE(String DNI_JEFE) {
        this.DNI_JEFE = DNI_JEFE;
    }

    public String getDNI_SUPERVISOR() {
        return DNI_SUPERVISOR;
    }

    public void setDNI_SUPERVISOR(String DNI_SUPERVISOR) {
        this.DNI_SUPERVISOR = DNI_SUPERVISOR;
    }

    public String getNOM_OPERADOR() {
        return NOM_OPERADOR;
    }

    public void setNOM_OPERADOR(String NOM_OPERADOR) {
        this.NOM_OPERADOR = NOM_OPERADOR;
    }

    public String getNOM_JEFE() {
        return NOM_JEFE;
    }

    public void setNOM_JEFE(String NOM_JEFE) {
        this.NOM_JEFE = NOM_JEFE;
    }

    public String getNOM_SUPERVISOR() {
        return NOM_SUPERVISOR;
    }

    public void setNOM_SUPERVISOR(String NOM_SUPERVISOR) {
        this.NOM_SUPERVISOR = NOM_SUPERVISOR;
    }

    public ContentValues toValues(){
        ContentValues contentValues = new ContentValues(17);
        contentValues.put(SQLConstantes.DATOS_ID,ID);
        contentValues.put(SQLConstantes.DATOS_DNI_OPERADOR,DNI_OPERADOR);
        contentValues.put(SQLConstantes.DATOS_DNI_JEFE,DNI_JEFE);
        contentValues.put(SQLConstantes.DATOS_DNI_SUPERVISOR,DNI_SUPERVISOR);
        contentValues.put(SQLConstantes.DATOS_NOMBRE_OPERADOR,NOM_OPERADOR);
        contentValues.put(SQLConstantes.DATOS_NOMBRE_JEFE,NOM_JEFE);
        contentValues.put(SQLConstantes.DATOS_NOMBRE_SUPERVISOR,NOM_SUPERVISOR);
        contentValues.put(SQLConstantes.DATOS_RESULTADO_FINAL,R_ENCUESTA);
        contentValues.put(SQLConstantes.DATOS_RESULTADO_FINAL_ESP,R_ENCUESTA_ESP);
        contentValues.put(SQLConstantes.DATOS_FECHA_FINAL_DIA,R_FECHA_DIA);
        contentValues.put(SQLConstantes.DATOS_FECHA_FINAL_MES,R_FECHA_MES);
        contentValues.put(SQLConstantes.DATOS_FECHA_FINAL_ANIO,R_FECHA_ANIO);
        contentValues.put(SQLConstantes.DATOS_ESTADO_ENVIO,R_ESTADO_ENVIO);
        contentValues.put(SQLConstantes.DATOS_USUCREACION,USU_CREACION);
        contentValues.put(SQLConstantes.DATOS_FECCREACION,FEC_CREACION);
        contentValues.put(SQLConstantes.DATOS_USUREGISTRO,USU_REGISTRO);
        contentValues.put(SQLConstantes.DATOS_FECREGISTRO,FEC_REGISTRO);
        return contentValues;
    }
}
