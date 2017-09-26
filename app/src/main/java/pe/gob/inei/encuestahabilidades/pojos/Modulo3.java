package pe.gob.inei.encuestahabilidades.pojos;

import android.content.ContentValues;

import pe.gob.inei.encuestahabilidades.modelo.SQLConstantes;

/**
 * Created by jlavado on 10/08/2017.
 */

public class Modulo3 {
    private String MODULO3_ID;
    private String C3_P0_0;
    private String C3_P0_1;
    private String C3_P0_2;
    private String C3_P0_3;
    private String C3_P1;
    private String C3_P2;
    private String C3_P3;
    private String C3_P4;
    private String C3_P5;
    private String C3_P5_1;
    private String C3_P6;
    private String C3_P7;
    private String C3_P8;
    private String C3_P9;
    private String C3_P10;
    private String C3_P11;
    private String C3_P12;
    private String OBS_MOD_III;
    private String USU_CREACION;
    private String FEC_CREACION;
    private String USU_REGISTRO;
    private String FEC_REGISTRO;

    public Modulo3(){
        MODULO3_ID = "";
        C3_P0_0 = "" ;
        C3_P0_1 = "" ;
        C3_P0_2 = "" ;
        C3_P0_3 = "" ;
        C3_P1 = "" ;
        C3_P2 = "" ;
        C3_P3 = "" ;
        C3_P4 = "" ;
        C3_P5 = "" ;
        C3_P5_1 = "" ;
        C3_P6 = "" ;
        C3_P7 = "" ;
        C3_P8 = "" ;
        C3_P9 = "" ;
        C3_P10 = "" ;
        C3_P11 = "" ;
        C3_P12 = "" ;
        OBS_MOD_III = "" ;
        this.USU_CREACION = "";
        this.FEC_CREACION = "";
        this.USU_REGISTRO = "";
        this.FEC_REGISTRO = "";


    }

    public Modulo3(String MODULO3_ID, String c3_P0_0, String c3_P0_1, String c3_P0_2, String c3_P0_3, String c3_P1, String c3_P2, String c3_P3, String c3_P4, String c3_P5, String c3_P5_1, String c3_P6, String c3_P7, String c3_P8, String c3_P9, String c3_P10, String c3_P11, String c3_P12, String OBS_MOD_III, String USU_CREACION, String FEC_CREACION, String USU_REGISTRO, String FEC_REGISTRO) {
        this.MODULO3_ID = MODULO3_ID;
        C3_P0_0 = c3_P0_0;
        C3_P0_1 = c3_P0_1;
        C3_P0_2 = c3_P0_2;
        C3_P0_3 = c3_P0_3;
        C3_P1 = c3_P1;
        C3_P2 = c3_P2;
        C3_P3 = c3_P3;
        C3_P4 = c3_P4;
        C3_P5 = c3_P5;
        C3_P5_1 = c3_P5_1;
        C3_P6 = c3_P6;
        C3_P7 = c3_P7;
        C3_P8 = c3_P8;
        C3_P9 = c3_P9;
        C3_P10 = c3_P10;
        C3_P11 = c3_P11;
        C3_P12 = c3_P12;
        this.OBS_MOD_III = OBS_MOD_III;
        this.USU_CREACION = USU_CREACION;
        this.FEC_CREACION = FEC_CREACION;
        this.USU_REGISTRO = USU_REGISTRO;
        this.FEC_REGISTRO = FEC_REGISTRO;
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

    public String getMODULO3_ID() {
        return MODULO3_ID;
    }

    public void setMODULO3_ID(String MODULO3_ID) {
        this.MODULO3_ID = MODULO3_ID;
    }

    public String getC3_P0_0() {
        return C3_P0_0;
    }

    public void setC3_P0_0(String c3_P0_0) {
        C3_P0_0 = c3_P0_0;
    }

    public String getC3_P0_1() {
        return C3_P0_1;
    }

    public void setC3_P0_1(String c3_P0_1) {
        C3_P0_1 = c3_P0_1;
    }

    public String getC3_P0_2() {
        return C3_P0_2;
    }

    public void setC3_P0_2(String c3_P0_2) {
        C3_P0_2 = c3_P0_2;
    }

    public String getC3_P0_3() {
        return C3_P0_3;
    }

    public void setC3_P0_3(String c3_P0_3) {
        C3_P0_3 = c3_P0_3;
    }

    public String getC3_P1() {
        return C3_P1;
    }

    public void setC3_P1(String c3_P1) {
        C3_P1 = c3_P1;
    }

    public String getC3_P2() {
        return C3_P2;
    }

    public void setC3_P2(String c3_P2) {
        C3_P2 = c3_P2;
    }

    public String getC3_P3() {
        return C3_P3;
    }

    public void setC3_P3(String c3_P3) {
        C3_P3 = c3_P3;
    }

    public String getC3_P4() {
        return C3_P4;
    }

    public void setC3_P4(String c3_P4) {
        C3_P4 = c3_P4;
    }

    public String getC3_P5() {
        return C3_P5;
    }

    public void setC3_P5(String c3_P5) {
        C3_P5 = c3_P5;
    }

    public String getC3_P5_1() {
        return C3_P5_1;
    }

    public void setC3_P5_1(String c3_P5_1) {
        C3_P5_1 = c3_P5_1;
    }

    public String getC3_P6() {
        return C3_P6;
    }

    public void setC3_P6(String c3_P6) {
        C3_P6 = c3_P6;
    }

    public String getC3_P7() {
        return C3_P7;
    }

    public void setC3_P7(String c3_P7) {
        C3_P7 = c3_P7;
    }

    public String getC3_P8() {
        return C3_P8;
    }

    public void setC3_P8(String c3_P8) {
        C3_P8 = c3_P8;
    }

    public String getC3_P9() {
        return C3_P9;
    }

    public void setC3_P9(String c3_P9) {
        C3_P9 = c3_P9;
    }

    public String getC3_P10() {
        return C3_P10;
    }

    public void setC3_P10(String c3_P10) {
        C3_P10 = c3_P10;
    }

    public String getC3_P11() {
        return C3_P11;
    }

    public void setC3_P11(String c3_P11) {
        C3_P11 = c3_P11;
    }

    public String getC3_P12() {
        return C3_P12;
    }

    public void setC3_P12(String c3_P12) {
        C3_P12 = c3_P12;
    }

    public String getOBS_MOD_III() {
        return OBS_MOD_III;
    }

    public void setOBS_MOD_III(String OBS_MOD_III) {
        this.OBS_MOD_III = OBS_MOD_III;
    }

    public ContentValues toValues(){
        ContentValues contentValues = new ContentValues(23);
        contentValues.put(SQLConstantes.MODULO3_ID,MODULO3_ID);
        contentValues.put(SQLConstantes.MODULO3_P0_0,C3_P0_0);
        contentValues.put(SQLConstantes.MODULO3_P0_1,C3_P0_1);
        contentValues.put(SQLConstantes.MODULO3_P0_2,C3_P0_2);
        contentValues.put(SQLConstantes.MODULO3_P0_3,C3_P0_3);
        contentValues.put(SQLConstantes.MODULO3_P1,C3_P1);
        contentValues.put(SQLConstantes.MODULO3_P2,C3_P2);
        contentValues.put(SQLConstantes.MODULO3_P3,C3_P3);
        contentValues.put(SQLConstantes.MODULO3_P4,C3_P4);
        contentValues.put(SQLConstantes.MODULO3_P5,C3_P5);
        contentValues.put(SQLConstantes.MODULO3_P5_1,C3_P5_1);
        contentValues.put(SQLConstantes.MODULO3_P6,C3_P6);
        contentValues.put(SQLConstantes.MODULO3_P7,C3_P7);
        contentValues.put(SQLConstantes.MODULO3_P8,C3_P8);
        contentValues.put(SQLConstantes.MODULO3_P9,C3_P9);
        contentValues.put(SQLConstantes.MODULO3_P10,C3_P10);
        contentValues.put(SQLConstantes.MODULO3_P11,C3_P11);
        contentValues.put(SQLConstantes.MODULO3_P12,C3_P12);
        contentValues.put(SQLConstantes.MODULO3_OBS_MOD_III,OBS_MOD_III);
        contentValues.put(SQLConstantes.MODULO3_USUCREACION,USU_CREACION);
        contentValues.put(SQLConstantes.MODULO3_FECCREACION,FEC_CREACION);
        contentValues.put(SQLConstantes.MODULO3_USUREGISTRO,USU_REGISTRO);
        contentValues.put(SQLConstantes.MODULO3_FECREGISTRO,FEC_REGISTRO);
        return contentValues;

    }


}
