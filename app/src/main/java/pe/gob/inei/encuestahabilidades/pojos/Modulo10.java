package pe.gob.inei.encuestahabilidades.pojos;

import android.content.ContentValues;

import pe.gob.inei.encuestahabilidades.modelo.SQLConstantes;

/**
 * Created by otin016 on 06/09/2017.
 */

public class Modulo10 {
    private String MODULO10_ID;
    private String C10_P0_0;
    private String C10_P0_1;
    private String C10_P0_2;
    private String C10_P0_3;
    private String C10_P1;
    private String C10_P2;
    private String C10_P3;
    private String C10_P4;
    private String OBS_MOD_X;
    private String USU_CREACION;
    private String FEC_CREACION;
    private String USU_REGISTRO;
    private String FEC_REGISTRO;

    public Modulo10() {
        this.MODULO10_ID = "";
        C10_P0_0 = "";
        C10_P0_1 = "";
        C10_P0_2 = "";
        C10_P0_3 = "";
        C10_P1 = "";
        C10_P2 = "";
        C10_P3 = "";
        C10_P4 = "";
        this.OBS_MOD_X = "";
        this.USU_CREACION = "";
        this.FEC_CREACION = "";
        this.USU_REGISTRO = "";
        this.FEC_REGISTRO = "";
    }

    public Modulo10(String MODULO10_ID, String c10_P0_0, String c10_P0_1, String c10_P0_2, String c10_P0_3, String c10_P1, String c10_P2, String c10_P3, String c10_P4, String OBS_MOD_X, String USU_CREACION, String FEC_CREACION, String USU_REGISTRO, String FEC_REGISTRO) {
        this.MODULO10_ID = MODULO10_ID;
        C10_P0_0 = c10_P0_0;
        C10_P0_1 = c10_P0_1;
        C10_P0_2 = c10_P0_2;
        C10_P0_3 = c10_P0_3;
        C10_P1 = c10_P1;
        C10_P2 = c10_P2;
        C10_P3 = c10_P3;
        C10_P4 = c10_P4;
        this.OBS_MOD_X = OBS_MOD_X;
        this.USU_CREACION = USU_CREACION;
        this.FEC_CREACION = FEC_CREACION;
        this.USU_REGISTRO = USU_REGISTRO;
        this.FEC_REGISTRO = FEC_REGISTRO;
    }

    public String getMODULO10_ID() {
        return MODULO10_ID;
    }

    public void setMODULO10_ID(String MODULO10_ID) {
        this.MODULO10_ID = MODULO10_ID;
    }

    public String getC10_P0_0() {
        return C10_P0_0;
    }

    public void setC10_P0_0(String c10_P0_0) {
        C10_P0_0 = c10_P0_0;
    }

    public String getC10_P0_1() {
        return C10_P0_1;
    }

    public void setC10_P0_1(String c10_P0_1) {
        C10_P0_1 = c10_P0_1;
    }

    public String getC10_P0_2() {
        return C10_P0_2;
    }

    public void setC10_P0_2(String c10_P0_2) {
        C10_P0_2 = c10_P0_2;
    }

    public String getC10_P0_3() {
        return C10_P0_3;
    }

    public void setC10_P0_3(String c10_P0_3) {
        C10_P0_3 = c10_P0_3;
    }

    public String getC10_P1() {
        return C10_P1;
    }

    public void setC10_P1(String c10_P1) {
        C10_P1 = c10_P1;
    }

    public String getC10_P2() {
        return C10_P2;
    }

    public void setC10_P2(String c10_P2) {
        C10_P2 = c10_P2;
    }

    public String getC10_P3() {
        return C10_P3;
    }

    public void setC10_P3(String c10_P3) {
        C10_P3 = c10_P3;
    }

    public String getC10_P4() {
        return C10_P4;
    }

    public void setC10_P4(String c10_P4) {
        C10_P4 = c10_P4;
    }

    public String getOBS_MOD_X() {
        return OBS_MOD_X;
    }

    public void setOBS_MOD_X(String OBS_MOD_X) {
        this.OBS_MOD_X = OBS_MOD_X;
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

    public ContentValues toValues() {
        ContentValues contentValues = new ContentValues(14);
        contentValues.put(SQLConstantes.MODULO10_ID,MODULO10_ID);
        contentValues.put(SQLConstantes.MODULO10_P0_0,C10_P0_0);
        contentValues.put(SQLConstantes.MODULO10_P0_1,C10_P0_1);
        contentValues.put(SQLConstantes.MODULO10_P0_2,C10_P0_2);
        contentValues.put(SQLConstantes.MODULO10_P0_3,C10_P0_3);
        contentValues.put(SQLConstantes.MODULO10_P1,C10_P1);
        contentValues.put(SQLConstantes.MODULO10_P2,C10_P2);
        contentValues.put(SQLConstantes.MODULO10_P3,C10_P3);
        contentValues.put(SQLConstantes.MODULO10_P4,C10_P4);
        contentValues.put(SQLConstantes.MODULO10_OBS_MOD_X,OBS_MOD_X);
        contentValues.put(SQLConstantes.MODULO10_USUCREACION,USU_CREACION);
        contentValues.put(SQLConstantes.MODULO10_FECCREACION,FEC_CREACION);
        contentValues.put(SQLConstantes.MODULO10_USUREGISTRO,USU_REGISTRO);
        contentValues.put(SQLConstantes.MODULO10_FECREGISTRO,FEC_REGISTRO);
        return contentValues;
    }
}
