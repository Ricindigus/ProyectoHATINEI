package pe.gob.inei.encuestahabilidades.pojos;

import android.content.ContentValues;

import pe.gob.inei.encuestahabilidades.modelo.SQLConstantes;

/**
 * Created by jlavado on 10/08/2017.
 */

public class Modulo9 {
    private String MODULO9_ID;
    private String C9_P0_0;
    private String C9_P0_1;
    private String C9_P0_2;
    private String C9_P0_3;
    private String C9_P1;
    private String C9_P2;
    private String OBS_MOD_IX;
    private String USU_CREACION;
    private String FEC_CREACION;
    private String USU_REGISTRO;
    private String FEC_REGISTRO;



    public Modulo9(){
        MODULO9_ID = "";
        C9_P0_0 = "" ;
        C9_P0_1 = "" ;
        C9_P0_2 = "" ;
        C9_P0_3 = "" ;
        C9_P1 = "" ;
        C9_P2 = "" ;
        OBS_MOD_IX = "" ;
        this.USU_CREACION = "";
        this.FEC_CREACION = "";
        this.USU_REGISTRO = "";
        this.FEC_REGISTRO = "";
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

    public String getMODULO9_ID() {
        return MODULO9_ID;
    }

    public void setMODULO9_ID(String MODULO9_ID) {
        this.MODULO9_ID = MODULO9_ID;
    }

    public String getC9_P0_0() {
        return C9_P0_0;
    }

    public void setC9_P0_0(String c9_P0_0) {
        C9_P0_0 = c9_P0_0;
    }

    public String getC9_P0_1() {
        return C9_P0_1;
    }

    public void setC9_P0_1(String c9_P0_1) {
        C9_P0_1 = c9_P0_1;
    }

    public String getC9_P0_2() {
        return C9_P0_2;
    }

    public void setC9_P0_2(String c9_P0_2) {
        C9_P0_2 = c9_P0_2;
    }

    public String getC9_P0_3() {
        return C9_P0_3;
    }

    public void setC9_P0_3(String c9_P0_3) {
        C9_P0_3 = c9_P0_3;
    }

    public String getC9_P1() {
        return C9_P1;
    }

    public void setC9_P1(String c9_P1) {
        C9_P1 = c9_P1;
    }

    public String getC9_P2() {
        return C9_P2;
    }

    public void setC9_P2(String c9_P2) {
        C9_P2 = c9_P2;
    }

    public String getOBS_MOD_IX() {
        return OBS_MOD_IX;
    }

    public void setOBS_MOD_IX(String OBS_MOD_IX) {
        this.OBS_MOD_IX = OBS_MOD_IX;
    }

    public ContentValues toValues() {
        ContentValues contentValues = new ContentValues(8);
        contentValues.put(SQLConstantes.MODULO9_ID,MODULO9_ID);
        contentValues.put(SQLConstantes.MODULO9_P0_0,C9_P0_0);
        contentValues.put(SQLConstantes.MODULO9_P0_1,C9_P0_1);
        contentValues.put(SQLConstantes.MODULO9_P0_2,C9_P0_2);
        contentValues.put(SQLConstantes.MODULO9_P0_3,C9_P0_3);
        contentValues.put(SQLConstantes.MODULO9_P1,C9_P1);
        contentValues.put(SQLConstantes.MODULO9_P2,C9_P2);
        contentValues.put(SQLConstantes.MODULO9_OBS_MOD_IX,OBS_MOD_IX);
        contentValues.put(SQLConstantes.MODULO9_USUCREACION,USU_CREACION);
        contentValues.put(SQLConstantes.MODULO9_FECCREACION,FEC_CREACION);
        contentValues.put(SQLConstantes.MODULO9_USUREGISTRO,USU_REGISTRO);
        contentValues.put(SQLConstantes.MODULO9_FECREGISTRO,FEC_REGISTRO);
        return contentValues;
    }



}
