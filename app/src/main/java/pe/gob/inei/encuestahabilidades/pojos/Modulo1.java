package pe.gob.inei.encuestahabilidades.pojos;

import android.content.ContentValues;

import pe.gob.inei.encuestahabilidades.modelo.SQLConstantes;

/**
 * Created by jlavado on 10/08/2017.
 */

public class Modulo1 {
    private String MODULO1_ID;
    private String C1_P0_0;
    private String C1_P0_1;
    private String C1_P0_2;
    private String C1_P0_3;
    private String C1_P1_1;
    private String C1_P1_2;
    private String C1_P1_2_DETALLE;
    private String C1_P2_1_1;
    private String C1_P2_1_2;
    private String C1_P2_1_2_DETALLE;
    private String C1_P2_1_NO;
    private String C1_P2_2_1;
    private String C1_P2_2_2;
    private String C1_P2_2_2_DETALLE;
    private String C1_P2_2_NO;
    private String C1_P3;
    private String C1_P3_0;
    private String C1_P4_1_1;
    private String C1_P4_2_1;
    private String C1_P5;
    private String C1_P6_0;
    private String C1_P6_1;
    private String C1_P7_1_1;
    private String C1_P7_2_1;
    private String C1_P7_1_2;
    private String C1_P7_2_2;
    private String C1_P8;
    private String C1_P9;
    private String C1_P10;
    private String C1_P11;
    private String C1_P11_1;
    private String C1_P11_2;
    private String C1_P12_NO;
    private String C1_P12_TIPVIA;
    private String C1_P12_NOMVIA ;
    private String C1_P12_NROPTA;
    private String C1_P12_BLOCK;
    private String C1_P12_INT;
    private String C1_P12_PISO;
    private String C1_P12_MZA;
    private String C1_P12_LOTE;
    private String C1_P12_KM;
    private String C1_P12_DIST;
    private String C1_P12_CCDI;
    private String C1_P12_PROV;
    private String C1_P12_CCPP;
    private String C1_P12_DEP;
    private String C1_P12_CCDD;
    private String OBS_MOD_I;
    private String USU_CREACION;
    private String FEC_CREACION;
    private String USU_REGISTRO;
    private String FEC_REGISTRO;


    public Modulo1(){
        MODULO1_ID = "";
        C1_P0_0 = "";
        C1_P0_1 = "";
        C1_P0_2 = "";
        C1_P0_3 = "";
        C1_P1_1 = "";
        C1_P1_2 = "";
        C1_P1_2_DETALLE = "";
        C1_P2_1_1 = "";
        C1_P2_1_2 = "";
        C1_P2_1_2_DETALLE = "";
        C1_P2_1_NO = "";
        C1_P2_2_1 = "";
        C1_P2_2_2 = "";
        C1_P2_2_2_DETALLE = "";
        C1_P2_2_NO = "";
        C1_P3 = "";
        C1_P3_0 = "";
        C1_P4_1_1 = "";
        C1_P4_2_1 = "";
        C1_P5 = "";
        C1_P6_0 = "";
        C1_P6_1 = "";
        C1_P7_1_1 = "";
        C1_P7_2_1 = "";
        C1_P7_1_2 = "";
        C1_P7_2_2 = "";
        C1_P8 = "";
        C1_P9 = "";
        C1_P10 = "";
        C1_P11 = "";
        C1_P11_1 = "";
        C1_P11_2 = "";
        C1_P12_NO = "";
        C1_P12_TIPVIA = "";
        C1_P12_NOMVIA = "";
        C1_P12_NROPTA = "";
        C1_P12_BLOCK = "";
        C1_P12_INT = "";
        C1_P12_PISO = "";
        C1_P12_MZA = "";
        C1_P12_LOTE = "";
        C1_P12_KM = "";
        C1_P12_DIST = "";
        C1_P12_CCDI = "";
        C1_P12_PROV = "";
        C1_P12_CCPP = "";
        C1_P12_DEP = "";
        C1_P12_CCDD = "";
        OBS_MOD_I = "";
        this.USU_CREACION = "";
        this.FEC_CREACION = "";
        this.USU_REGISTRO = "";
        this.FEC_REGISTRO = "";
    }

    public Modulo1(String MODULO1_ID, String c1_P0_0, String c1_P0_1, String c1_P0_2, String c1_P0_3, String c1_P1_1, String c1_P1_2, String c1_P1_2_DETALLE, String c1_P2_1_1, String c1_P2_1_2, String c1_P2_1_2_DETALLE, String c1_P2_1_NO, String c1_P2_2_1, String c1_P2_2_2, String c1_P2_2_2_DETALLE, String c1_P2_2_NO, String c1_P3, String c1_P3_0, String c1_P4_1_1, String c1_P4_2_1, String c1_P5, String c1_P6_0, String c1_P6_1, String c1_P7_1_1, String c1_P7_2_1, String c1_P7_1_2, String c1_P7_2_2, String c1_P8, String c1_P9, String c1_P10, String c1_P11, String c1_P11_1, String c1_P11_2, String c1_P12_NO, String c1_P12_TIPVIA, String c1_P12_NOMVIA, String c1_P12_NROPTA, String c1_P12_BLOCK, String c1_P12_INT, String c1_P12_PISO, String c1_P12_MZA, String c1_P12_LOTE, String c1_P12_KM, String c1_P12_DIST, String c1_P12_CCDI, String c1_P12_PROV, String c1_P12_CCPP, String c1_P12_DEP, String c1_P12_CCDD, String OBS_MOD_I, String USU_CREACION, String FEC_CREACION, String USU_REGISTRO, String FEC_REGISTRO) {
        this.MODULO1_ID = MODULO1_ID;
        C1_P0_0 = c1_P0_0;
        C1_P0_1 = c1_P0_1;
        C1_P0_2 = c1_P0_2;
        C1_P0_3 = c1_P0_3;
        C1_P1_1 = c1_P1_1;
        C1_P1_2 = c1_P1_2;
        C1_P1_2_DETALLE = c1_P1_2_DETALLE;
        C1_P2_1_1 = c1_P2_1_1;
        C1_P2_1_2 = c1_P2_1_2;
        C1_P2_1_2_DETALLE = c1_P2_1_2_DETALLE;
        C1_P2_1_NO = c1_P2_1_NO;
        C1_P2_2_1 = c1_P2_2_1;
        C1_P2_2_2 = c1_P2_2_2;
        C1_P2_2_2_DETALLE = c1_P2_2_2_DETALLE;
        C1_P2_2_NO = c1_P2_2_NO;
        C1_P3 = c1_P3;
        C1_P3_0 = c1_P3_0;
        C1_P4_1_1 = c1_P4_1_1;
        C1_P4_2_1 = c1_P4_2_1;
        C1_P5 = c1_P5;
        C1_P6_0 = c1_P6_0;
        C1_P6_1 = c1_P6_1;
        C1_P7_1_1 = c1_P7_1_1;
        C1_P7_2_1 = c1_P7_2_1;
        C1_P7_1_2 = c1_P7_1_2;
        C1_P7_2_2 = c1_P7_2_2;
        C1_P8 = c1_P8;
        C1_P9 = c1_P9;
        C1_P10 = c1_P10;
        C1_P11 = c1_P11;
        C1_P11_1 = c1_P11_1;
        C1_P11_2 = c1_P11_2;
        C1_P12_NO = c1_P12_NO;
        C1_P12_TIPVIA = c1_P12_TIPVIA;
        C1_P12_NOMVIA = c1_P12_NOMVIA;
        C1_P12_NROPTA = c1_P12_NROPTA;
        C1_P12_BLOCK = c1_P12_BLOCK;
        C1_P12_INT = c1_P12_INT;
        C1_P12_PISO = c1_P12_PISO;
        C1_P12_MZA = c1_P12_MZA;
        C1_P12_LOTE = c1_P12_LOTE;
        C1_P12_KM = c1_P12_KM;
        C1_P12_DIST = c1_P12_DIST;
        C1_P12_CCDI = c1_P12_CCDI;
        C1_P12_PROV = c1_P12_PROV;
        C1_P12_CCPP = c1_P12_CCPP;
        C1_P12_DEP = c1_P12_DEP;
        C1_P12_CCDD = c1_P12_CCDD;
        this.OBS_MOD_I = OBS_MOD_I;
        this.USU_CREACION = USU_CREACION;
        this.FEC_CREACION = FEC_CREACION;
        this.USU_REGISTRO = USU_REGISTRO;
        this.FEC_REGISTRO = FEC_REGISTRO;
    }

    public String getMODULO1_ID() {
        return MODULO1_ID;
    }

    public void setMODULO1_ID(String MODULO1_ID) {
        this.MODULO1_ID = MODULO1_ID;
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

    public String getC1_P0_0() {
        return C1_P0_0;
    }

    public void setC1_P0_0(String c1_P0_0) {
        C1_P0_0 = c1_P0_0;
    }

    public String getC1_P0_1() {
        return C1_P0_1;
    }

    public void setC1_P0_1(String c1_P0_1) {
        C1_P0_1 = c1_P0_1;
    }

    public String getC1_P0_2() {
        return C1_P0_2;
    }

    public void setC1_P0_2(String c1_P0_2) {
        C1_P0_2 = c1_P0_2;
    }

    public String getC1_P0_3() {
        return C1_P0_3;
    }

    public void setC1_P0_3(String c1_P0_3) {
        C1_P0_3 = c1_P0_3;
    }

    public String getC1_P1_1() {
        return C1_P1_1;
    }

    public void setC1_P1_1(String c1_P1_1) {
        C1_P1_1 = c1_P1_1;
    }

    public String getC1_P1_2() {
        return C1_P1_2;
    }

    public void setC1_P1_2(String c1_P1_2) {
        C1_P1_2 = c1_P1_2;
    }

    public String getC1_P1_2_DETALLE() {
        return C1_P1_2_DETALLE;
    }

    public void setC1_P1_2_DETALLE(String c1_P1_2_DETALLE) {
        C1_P1_2_DETALLE = c1_P1_2_DETALLE;
    }

    public String getC1_P2_1_1() {
        return C1_P2_1_1;
    }

    public void setC1_P2_1_1(String c1_P2_1_1) {
        C1_P2_1_1 = c1_P2_1_1;
    }

    public String getC1_P2_1_2() {
        return C1_P2_1_2;
    }

    public void setC1_P2_1_2(String c1_P2_1_2) {
        C1_P2_1_2 = c1_P2_1_2;
    }

    public String getC1_P2_1_2_DETALLE() {
        return C1_P2_1_2_DETALLE;
    }

    public void setC1_P2_1_2_DETALLE(String c1_P2_1_2_DETALLE) {
        C1_P2_1_2_DETALLE = c1_P2_1_2_DETALLE;
    }

    public String getC1_P2_1_NO() {
        return C1_P2_1_NO;
    }

    public void setC1_P2_1_NO(String c1_P2_1_NO) {
        C1_P2_1_NO = c1_P2_1_NO;
    }

    public String getC1_P2_2_1() {
        return C1_P2_2_1;
    }

    public void setC1_P2_2_1(String c1_P2_2_1) {
        C1_P2_2_1 = c1_P2_2_1;
    }

    public String getC1_P2_2_2() {
        return C1_P2_2_2;
    }

    public void setC1_P2_2_2(String c1_P2_2_2) {
        C1_P2_2_2 = c1_P2_2_2;
    }

    public String getC1_P2_2_2_DETALLE() {
        return C1_P2_2_2_DETALLE;
    }

    public void setC1_P2_2_2_DETALLE(String c1_P2_2_2_DETALLE) {
        C1_P2_2_2_DETALLE = c1_P2_2_2_DETALLE;
    }

    public String getC1_P2_2_NO() {
        return C1_P2_2_NO;
    }

    public void setC1_P2_2_NO(String c1_P2_2_NO) {
        C1_P2_2_NO = c1_P2_2_NO;
    }

    public String getC1_P3() {
        return C1_P3;
    }

    public void setC1_P3(String c1_P3) {
        C1_P3 = c1_P3;
    }

    public String getC1_P3_0() {
        return C1_P3_0;
    }

    public void setC1_P3_0(String c1_P3_0) {
        C1_P3_0 = c1_P3_0;
    }

    public String getC1_P4_1_1() {
        return C1_P4_1_1;
    }

    public void setC1_P4_1_1(String c1_P4_1_1) {
        C1_P4_1_1 = c1_P4_1_1;
    }

    public String getC1_P4_2_1() {
        return C1_P4_2_1;
    }

    public void setC1_P4_2_1(String c1_P4_2_1) {
        C1_P4_2_1 = c1_P4_2_1;
    }

    public String getC1_P5() {
        return C1_P5;
    }

    public void setC1_P5(String c1_P5) {
        C1_P5 = c1_P5;
    }

    public String getC1_P6_0() {
        return C1_P6_0;
    }

    public void setC1_P6_0(String c1_P6_0) {
        C1_P6_0 = c1_P6_0;
    }

    public String getC1_P6_1() {
        return C1_P6_1;
    }

    public void setC1_P6_1(String c1_P6_1) {
        C1_P6_1 = c1_P6_1;
    }

    public String getC1_P7_1_1() {
        return C1_P7_1_1;
    }

    public void setC1_P7_1_1(String c1_P7_1_1) {
        C1_P7_1_1 = c1_P7_1_1;
    }

    public String getC1_P7_2_1() {
        return C1_P7_2_1;
    }

    public void setC1_P7_2_1(String c1_P7_2_1) {
        C1_P7_2_1 = c1_P7_2_1;
    }

    public String getC1_P7_1_2() {
        return C1_P7_1_2;
    }

    public void setC1_P7_1_2(String c1_P7_1_2) {
        C1_P7_1_2 = c1_P7_1_2;
    }

    public String getC1_P7_2_2() {
        return C1_P7_2_2;
    }

    public void setC1_P7_2_2(String c1_P7_2_2) {
        C1_P7_2_2 = c1_P7_2_2;
    }

    public String getC1_P8() {
        return C1_P8;
    }

    public void setC1_P8(String c1_P8) {
        C1_P8 = c1_P8;
    }

    public String getC1_P9() {
        return C1_P9;
    }

    public void setC1_P9(String c1_P9) {
        C1_P9 = c1_P9;
    }

    public String getC1_P10() {
        return C1_P10;
    }

    public void setC1_P10(String c1_P10) {
        C1_P10 = c1_P10;
    }

    public String getC1_P11() {
        return C1_P11;
    }

    public void setC1_P11(String c1_P11) {
        C1_P11 = c1_P11;
    }

    public String getC1_P11_1() {
        return C1_P11_1;
    }

    public void setC1_P11_1(String c1_P11_1) {
        C1_P11_1 = c1_P11_1;
    }

    public String getC1_P11_2() {
        return C1_P11_2;
    }

    public void setC1_P11_2(String c1_P11_2) {
        C1_P11_2 = c1_P11_2;
    }

    public String getC1_P12_NO() {
        return C1_P12_NO;
    }

    public void setC1_P12_NO(String c1_P12_NO) {
        C1_P12_NO = c1_P12_NO;
    }

    public String getC1_P12_TIPVIA() {
        return C1_P12_TIPVIA;
    }

    public void setC1_P12_TIPVIA(String c1_P12_TIPVIA) {
        C1_P12_TIPVIA = c1_P12_TIPVIA;
    }

    public String getC1_P12_NOMVIA() {
        return C1_P12_NOMVIA;
    }

    public void setC1_P12_NOMVIA(String c1_P12_NOMVIA) {
        C1_P12_NOMVIA = c1_P12_NOMVIA;
    }

    public String getC1_P12_NROPTA() {
        return C1_P12_NROPTA;
    }

    public void setC1_P12_NROPTA(String c1_P12_NROPTA) {
        C1_P12_NROPTA = c1_P12_NROPTA;
    }

    public String getC1_P12_BLOCK() {
        return C1_P12_BLOCK;
    }

    public void setC1_P12_BLOCK(String c1_P12_BLOCK) {
        C1_P12_BLOCK = c1_P12_BLOCK;
    }

    public String getC1_P12_INT() {
        return C1_P12_INT;
    }

    public void setC1_P12_INT(String c1_P12_INT) {
        C1_P12_INT = c1_P12_INT;
    }

    public String getC1_P12_PISO() {
        return C1_P12_PISO;
    }

    public void setC1_P12_PISO(String c1_P12_PISO) {
        C1_P12_PISO = c1_P12_PISO;
    }

    public String getC1_P12_MZA() {
        return C1_P12_MZA;
    }

    public void setC1_P12_MZA(String c1_P12_MZA) {
        C1_P12_MZA = c1_P12_MZA;
    }

    public String getC1_P12_LOTE() {
        return C1_P12_LOTE;
    }

    public void setC1_P12_LOTE(String c1_P12_LOTE) {
        C1_P12_LOTE = c1_P12_LOTE;
    }

    public String getC1_P12_KM() {
        return C1_P12_KM;
    }

    public void setC1_P12_KM(String c1_P12_KM) {
        C1_P12_KM = c1_P12_KM;
    }

    public String getC1_P12_DIST() {
        return C1_P12_DIST;
    }

    public void setC1_P12_DIST(String c1_P12_DIST) {
        C1_P12_DIST = c1_P12_DIST;
    }

    public String getC1_P12_CCDI() {
        return C1_P12_CCDI;
    }

    public void setC1_P12_CCDI(String c1_P12_CCDI) {
        C1_P12_CCDI = c1_P12_CCDI;
    }

    public String getC1_P12_PROV() {
        return C1_P12_PROV;
    }

    public void setC1_P12_PROV(String c1_P12_PROV) {
        C1_P12_PROV = c1_P12_PROV;
    }

    public String getC1_P12_CCPP() {
        return C1_P12_CCPP;
    }

    public void setC1_P12_CCPP(String c1_P12_CCPP) {
        C1_P12_CCPP = c1_P12_CCPP;
    }

    public String getC1_P12_DEP() {
        return C1_P12_DEP;
    }

    public void setC1_P12_DEP(String c1_P12_DEP) {
        C1_P12_DEP = c1_P12_DEP;
    }

    public String getC1_P12_CCDD() {
        return C1_P12_CCDD;
    }

    public void setC1_P12_CCDD(String c1_P12_CCDD) {
        C1_P12_CCDD = c1_P12_CCDD;
    }

    public String getOBS_MOD_I() {
        return OBS_MOD_I;
    }

    public void setOBS_MOD_I(String OBS_MOD_I) {
        this.OBS_MOD_I = OBS_MOD_I;
    }

    public ContentValues toValues(){
        ContentValues contentValues = new ContentValues(54);
        contentValues.put(SQLConstantes.MODULO1_ID,MODULO1_ID);
        contentValues.put(SQLConstantes.MODULO1_P0_0,C1_P0_0);
        contentValues.put(SQLConstantes.MODULO1_P0_1,C1_P0_1);
        contentValues.put(SQLConstantes.MODULO1_P0_2,C1_P0_2);
        contentValues.put(SQLConstantes.MODULO1_P0_3,C1_P0_3);
        contentValues.put(SQLConstantes.MODULO1_P1_1,C1_P1_1);
        contentValues.put(SQLConstantes.MODULO1_P1_2,C1_P1_2);
        contentValues.put(SQLConstantes.MODULO1_P1_2_DETALLE,C1_P1_2_DETALLE);
        contentValues.put(SQLConstantes.MODULO1_P2_1_1,C1_P2_1_1);
        contentValues.put(SQLConstantes.MODULO1_P2_1_2,C1_P2_1_2);
        contentValues.put(SQLConstantes.MODULO1_P2_1_2_DETALLE,C1_P2_1_2_DETALLE);
        contentValues.put(SQLConstantes.MODULO1_P2_1_NO,C1_P2_1_NO);
        contentValues.put(SQLConstantes.MODULO1_P2_2_1,C1_P2_2_1);
        contentValues.put(SQLConstantes.MODULO1_P2_2_2,C1_P2_2_2);
        contentValues.put(SQLConstantes.MODULO1_P2_2_2_DETALLE,C1_P2_2_2_DETALLE);
        contentValues.put(SQLConstantes.MODULO1_P2_2_NO,C1_P2_2_NO);
        contentValues.put(SQLConstantes.MODULO1_P3,C1_P3);
        contentValues.put(SQLConstantes.MODULO1_P3_0,C1_P3_0);
        contentValues.put(SQLConstantes.MODULO1_P4_1_1,C1_P4_1_1);
        contentValues.put(SQLConstantes.MODULO1_P4_2_1,C1_P4_2_1);
        contentValues.put(SQLConstantes.MODULO1_P5,C1_P5);
        contentValues.put(SQLConstantes.MODULO1_P6_0,C1_P6_0);
        contentValues.put(SQLConstantes.MODULO1_P6_1,C1_P6_1);
        contentValues.put(SQLConstantes.MODULO1_P7_1_1,C1_P7_1_1);
        contentValues.put(SQLConstantes.MODULO1_P7_2_1,C1_P7_2_1);
        contentValues.put(SQLConstantes.MODULO1_P7_1_2,C1_P7_1_2);
        contentValues.put(SQLConstantes.MODULO1_P7_2_2,C1_P7_2_2);
        contentValues.put(SQLConstantes.MODULO1_P8,C1_P8);
        contentValues.put(SQLConstantes.MODULO1_P9,C1_P9);
        contentValues.put(SQLConstantes.MODULO1_P10,C1_P10);
        contentValues.put(SQLConstantes.MODULO1_P11,C1_P11);
        contentValues.put(SQLConstantes.MODULO1_P11_1,C1_P11_1);
        contentValues.put(SQLConstantes.MODULO1_P11_2,C1_P11_2);
        contentValues.put(SQLConstantes.MODULO1_P12_NO,C1_P12_NO);
        contentValues.put(SQLConstantes.MODULO1_P12_TIPVIA,C1_P12_TIPVIA);
        contentValues.put(SQLConstantes.MODULO1_P12_NOMVIA ,C1_P12_NOMVIA );
        contentValues.put(SQLConstantes.MODULO1_P12_NROPTA,C1_P12_NROPTA);
        contentValues.put(SQLConstantes.MODULO1_P12_BLOCK,C1_P12_BLOCK);
        contentValues.put(SQLConstantes.MODULO1_P12_INT,C1_P12_INT);
        contentValues.put(SQLConstantes.MODULO1_P12_PISO,C1_P12_PISO);
        contentValues.put(SQLConstantes.MODULO1_P12_MZA,C1_P12_MZA);
        contentValues.put(SQLConstantes.MODULO1_P12_LOTE,C1_P12_LOTE);
        contentValues.put(SQLConstantes.MODULO1_P12_KM,C1_P12_KM);
        contentValues.put(SQLConstantes.MODULO1_P12_DIST,C1_P12_DIST);
        contentValues.put(SQLConstantes.MODULO1_P12_CCDI,C1_P12_CCDI);
        contentValues.put(SQLConstantes.MODULO1_P12_PROV,C1_P12_PROV);
        contentValues.put(SQLConstantes.MODULO1_P12_CCPP,C1_P12_CCPP);
        contentValues.put(SQLConstantes.MODULO1_P12_DEP,C1_P12_DEP);
        contentValues.put(SQLConstantes.MODULO1_P12_CCDD,C1_P12_CCDD);
        contentValues.put(SQLConstantes.MODULO1_OBS_MOD_I,OBS_MOD_I);
        contentValues.put(SQLConstantes.MODULO1_USUCREACION,USU_CREACION);
        contentValues.put(SQLConstantes.MODULO1_FECCREACION,FEC_CREACION);
        contentValues.put(SQLConstantes.MODULO1_USUREGISTRO,USU_REGISTRO);
        contentValues.put(SQLConstantes.MODULO1_FECREGISTRO,FEC_REGISTRO);
        return contentValues;

    }


}
