package pe.gob.inei.encuestahabilidades.pojos;

import android.content.ContentValues;

import pe.gob.inei.encuestahabilidades.modelo.SQLConstantes;

/**
 * Created by jlavado on 10/08/2017.
 */

public class Modulo8 {

    private String MODULO8_ID;
    private String C8_P0_0;
    private String C8_P0_1;
    private String C8_P0_2;
    private String C8_P0_3;
    private String C8_P1_1_1;
    private String C8_P1_2_1;
    private String C8_P2_1;
    private String C8_P3_1_1;
    private String C8_P3_2_1;
    private String C8_P3_3_1;
    private String C8_P3_4_1;
    private String C8_P3_5_1;
    private String C8_P3_6_1;
    private String C8_P3_6_1_0;
    private String C8_P4_1_1;
    private String C8_P4_2_1;
    private String C8_P4_3_1;
    private String C8_P4_4_1;
    private String C8_P4_5_1;
    private String C8_P4_6_1;
    private String C8_P4_6_1_0;
    private String C8_P5_1;
    private String C8_P6_1_1;
    private String C8_P6_2_1;
    private String C8_P6_3_1;
    private String C8_P6_4_1;
    private String C8_P6_5_1;
    private String C8_P6_6_1;
    private String C8_P7_1;
    private String C8_P8_1_1;
    private String C8_P8_2_1;
    private String C8_P8_3_1;
    private String C8_P8_4_1;
    private String C8_P9_1_1;
    private String C8_P9_2_1;
    private String C8_P9_3_1;
    private String C8_P9_4_1;
    private String C8_P10_1_1;
    private String C8_P10_2_1;
    private String C8_P10_3_1;
    private String C8_P10_4_1;
    private String C8_P10_5_1;
    private String C8_P10_6_1;
    private String C8_P1_1_2;
    private String C8_P1_2_2;
    private String C8_P2_2;
    private String C8_P3_1_2;
    private String C8_P3_2_2;
    private String C8_P3_3_2;
    private String C8_P3_4_2;
    private String C8_P3_5_2;
    private String C8_P3_6_2;
    private String C8_P3_6_2_0;
    private String C8_P4_1_2;
    private String C8_P4_2_2;
    private String C8_P4_3_2;
    private String C8_P4_4_2;
    private String C8_P4_5_2;
    private String C8_P4_6_2;
    private String C8_P4_6_2_0;
    private String C8_P5_2;
    private String C8_P6_1_2;
    private String C8_P6_2_2;
    private String C8_P6_3_2;
    private String C8_P6_4_2;
    private String C8_P6_5_2;
    private String C8_P6_6_2;
    private String C8_P7_2;
    private String C8_P8_1_2;
    private String C8_P8_2_2;
    private String C8_P8_3_2;
    private String C8_P8_4_2;
    private String C8_P9_1_2;
    private String C8_P9_2_2;
    private String C8_P9_3_2;
    private String C8_P9_4_2;
    private String C8_P10_1_2;
    private String C8_P10_2_2;
    private String C8_P10_3_2;
    private String C8_P10_4_2;
    private String C8_P10_5_2;
    private String C8_P10_6_2;
    private String C8_P1_1_3;
    private String C8_P1_2_3;
    private String C8_P2_3;
    private String C8_P3_1_3;
    private String C8_P3_2_3;
    private String C8_P3_3_3;
    private String C8_P3_4_3;
    private String C8_P3_5_3;
    private String C8_P3_6_3;
    private String C8_P3_6_3_0;
    private String C8_P4_1_3;
    private String C8_P4_2_3;
    private String C8_P4_3_3;
    private String C8_P4_4_3;
    private String C8_P4_5_3;
    private String C8_P4_6_3;
    private String C8_P4_6_3_0;
    private String C8_P5_3;
    private String C8_P6_1_3;
    private String C8_P6_2_3;
    private String C8_P6_3_3;
    private String C8_P6_4_3;
    private String C8_P6_5_3;
    private String C8_P6_6_3;
    private String C8_P7_3;
    private String C8_P8_1_3;
    private String C8_P8_2_3;
    private String C8_P8_3_3;
    private String C8_P8_4_3;
    private String C8_P9_1_3;
    private String C8_P9_2_3;
    private String C8_P9_3_3;
    private String C8_P9_4_3;
    private String C8_P10_1_3;
    private String C8_P10_2_3;
    private String C8_P10_3_3;
    private String C8_P10_4_3;
    private String C8_P10_5_3;
    private String C8_P10_6_3;
    private String C8_P1_1_4;
    private String C8_P1_2_4;
    private String C8_P2_4;
    private String C8_P3_1_4;
    private String C8_P3_2_4;
    private String C8_P3_3_4;
    private String C8_P3_4_4;
    private String C8_P3_5_4;
    private String C8_P3_6_4;
    private String C8_P3_6_4_0;
    private String C8_P4_1_4;
    private String C8_P4_2_4;
    private String C8_P4_3_4;
    private String C8_P4_4_4;
    private String C8_P4_5_4;
    private String C8_P4_6_4;
    private String C8_P4_6_4_0;
    private String C8_P5_4;
    private String C8_P6_1_4;
    private String C8_P6_2_4;
    private String C8_P6_3_4;
    private String C8_P6_4_4;
    private String C8_P6_5_4;
    private String C8_P6_6_4;
    private String C8_P7_4;
    private String C8_P8_1_4;
    private String C8_P8_2_4;
    private String C8_P8_3_4;
    private String C8_P8_4_4;
    private String C8_P9_1_4;
    private String C8_P9_2_4;
    private String C8_P9_3_4;
    private String C8_P9_4_4;
    private String C8_P10_1_4;
    private String C8_P10_2_4;
    private String C8_P10_3_4;
    private String C8_P10_4_4;
    private String C8_P10_5_4;
    private String C8_P10_6_4;
    private String C8_P1_1_5;
    private String C8_P1_2_5;
    private String C8_P2_5;
    private String C8_P3_1_5;
    private String C8_P3_2_5;
    private String C8_P3_3_5;
    private String C8_P3_4_5;
    private String C8_P3_5_5;
    private String C8_P3_6_5;
    private String C8_P3_6_5_0;
    private String C8_P4_1_5;
    private String C8_P4_2_5;
    private String C8_P4_3_5;
    private String C8_P4_4_5;
    private String C8_P4_5_5;
    private String C8_P4_6_5;
    private String C8_P4_6_5_0;
    private String C8_P5_5;
    private String C8_P6_1_5;
    private String C8_P6_2_5;
    private String C8_P6_3_5;
    private String C8_P6_4_5;
    private String C8_P6_5_5;
    private String C8_P6_6_5;
    private String C8_P7_5;
    private String C8_P8_1_5;
    private String C8_P8_2_5;
    private String C8_P8_3_5;
    private String C8_P8_4_5;
    private String C8_P9_1_5;
    private String C8_P9_2_5;
    private String C8_P9_3_5;
    private String C8_P9_4_5;
    private String C8_P10_1_5;
    private String C8_P10_2_5;
    private String C8_P10_3_5;
    private String C8_P10_4_5;
    private String C8_P10_5_5;
    private String C8_P10_6_5;
    private String C8_P1_1_6;
    private String C8_P1_2_6;
    private String C8_P2_6;
    private String C8_P3_1_6;
    private String C8_P3_2_6;
    private String C8_P3_3_6;
    private String C8_P3_4_6;
    private String C8_P3_5_6;
    private String C8_P3_6_6;
    private String C8_P3_6_6_0;
    private String C8_P4_1_6;
    private String C8_P4_2_6;
    private String C8_P4_3_6;
    private String C8_P4_4_6;
    private String C8_P4_5_6;
    private String C8_P4_6_6;
    private String C8_P4_6_6_0;
    private String C8_P5_6;
    private String C8_P6_1_6;
    private String C8_P6_2_6;
    private String C8_P6_3_6;
    private String C8_P6_4_6;
    private String C8_P6_5_6;
    private String C8_P6_6_6;
    private String C8_P7_6;
    private String C8_P8_1_6;
    private String C8_P8_2_6;
    private String C8_P8_3_6;
    private String C8_P8_4_6;
    private String C8_P9_1_6;
    private String C8_P9_2_6;
    private String C8_P9_3_6;
    private String C8_P9_4_6;
    private String C8_P10_1_6;
    private String C8_P10_2_6;
    private String C8_P10_3_6;
    private String C8_P10_4_6;
    private String C8_P10_5_6;
    private String C8_P10_6_6;
    private String OBS_MOD_VIII;
    private String USU_CREACION;
    private String FEC_CREACION;
    private String USU_REGISTRO;
    private String FEC_REGISTRO;


    public Modulo8(){
        MODULO8_ID = "";
        C8_P0_0 = "" ;
        C8_P0_1 = "" ;
        C8_P0_2 = "" ;
        C8_P0_3 = "" ;
        C8_P1_1_1 = "" ;
        C8_P1_2_1 = "" ;
        C8_P2_1 = "" ;
        C8_P3_1_1 = "" ;
        C8_P3_2_1 = "" ;
        C8_P3_3_1 = "" ;
        C8_P3_4_1 = "" ;
        C8_P3_5_1 = "" ;
        C8_P3_6_1 = "" ;
        C8_P3_6_1_0 = "" ;
        C8_P4_1_1 = "" ;
        C8_P4_2_1 = "" ;
        C8_P4_3_1 = "" ;
        C8_P4_4_1 = "" ;
        C8_P4_5_1 = "" ;
        C8_P4_6_1 = "" ;
        C8_P4_6_1_0 = "" ;
        C8_P5_1 = "" ;
        C8_P6_1_1 = "" ;
        C8_P6_2_1 = "" ;
        C8_P6_3_1 = "" ;
        C8_P6_4_1 = "" ;
        C8_P6_5_1 = "" ;
        C8_P6_6_1 = "" ;
        C8_P7_1 = "" ;
        C8_P8_1_1 = "" ;
        C8_P8_2_1 = "" ;
        C8_P8_3_1 = "" ;
        C8_P8_4_1 = "" ;
        C8_P9_1_1 = "" ;
        C8_P9_2_1 = "" ;
        C8_P9_3_1 = "" ;
        C8_P9_4_1 = "" ;
        C8_P10_1_1 = "" ;
        C8_P10_2_1 = "" ;
        C8_P10_3_1 = "" ;
        C8_P10_4_1 = "" ;
        C8_P10_5_1 = "" ;
        C8_P10_6_1 = "" ;
        C8_P1_1_2 = "" ;
        C8_P1_2_2 = "" ;
        C8_P2_2 = "" ;
        C8_P3_1_2 = "" ;
        C8_P3_2_2 = "" ;
        C8_P3_3_2 = "" ;
        C8_P3_4_2 = "" ;
        C8_P3_5_2 = "" ;
        C8_P3_6_2 = "" ;
        C8_P3_6_2_0 = "" ;
        C8_P4_1_2 = "" ;
        C8_P4_2_2 = "" ;
        C8_P4_3_2 = "" ;
        C8_P4_4_2 = "" ;
        C8_P4_5_2 = "" ;
        C8_P4_6_2 = "" ;
        C8_P4_6_2_0 = "" ;
        C8_P5_2 = "" ;
        C8_P6_1_2 = "" ;
        C8_P6_2_2 = "" ;
        C8_P6_3_2 = "" ;
        C8_P6_4_2 = "" ;
        C8_P6_5_2 = "" ;
        C8_P6_6_2 = "" ;
        C8_P7_2 = "" ;
        C8_P8_1_2 = "" ;
        C8_P8_2_2 = "" ;
        C8_P8_3_2 = "" ;
        C8_P8_4_2 = "" ;
        C8_P9_1_2 = "" ;
        C8_P9_2_2 = "" ;
        C8_P9_3_2 = "" ;
        C8_P9_4_2 = "" ;
        C8_P10_1_2 = "" ;
        C8_P10_2_2 = "" ;
        C8_P10_3_2 = "" ;
        C8_P10_4_2 = "" ;
        C8_P10_5_2 = "" ;
        C8_P10_6_2 = "" ;
        C8_P1_1_3 = "" ;
        C8_P1_2_3 = "" ;
        C8_P2_3 = "" ;
        C8_P3_1_3 = "" ;
        C8_P3_2_3 = "" ;
        C8_P3_3_3 = "" ;
        C8_P3_4_3 = "" ;
        C8_P3_5_3 = "" ;
        C8_P3_6_3 = "" ;
        C8_P3_6_3_0 = "" ;
        C8_P4_1_3 = "" ;
        C8_P4_2_3 = "" ;
        C8_P4_3_3 = "" ;
        C8_P4_4_3 = "" ;
        C8_P4_5_3 = "" ;
        C8_P4_6_3 = "" ;
        C8_P4_6_3_0 = "" ;
        C8_P5_3 = "" ;
        C8_P6_1_3 = "" ;
        C8_P6_2_3 = "" ;
        C8_P6_3_3 = "" ;
        C8_P6_4_3 = "" ;
        C8_P6_5_3 = "" ;
        C8_P6_6_3 = "" ;
        C8_P7_3 = "" ;
        C8_P8_1_3 = "" ;
        C8_P8_2_3 = "" ;
        C8_P8_3_3 = "" ;
        C8_P8_4_3 = "" ;
        C8_P9_1_3 = "" ;
        C8_P9_2_3 = "" ;
        C8_P9_3_3 = "" ;
        C8_P9_4_3 = "" ;
        C8_P10_1_3 = "" ;
        C8_P10_2_3 = "" ;
        C8_P10_3_3 = "" ;
        C8_P10_4_3 = "" ;
        C8_P10_5_3 = "" ;
        C8_P10_6_3 = "" ;
        C8_P1_1_4 = "" ;
        C8_P1_2_4 = "" ;
        C8_P2_4 = "" ;
        C8_P3_1_4 = "" ;
        C8_P3_2_4 = "" ;
        C8_P3_3_4 = "" ;
        C8_P3_4_4 = "" ;
        C8_P3_5_4 = "" ;
        C8_P3_6_4 = "" ;
        C8_P3_6_4_0 = "" ;
        C8_P4_1_4 = "" ;
        C8_P4_2_4 = "" ;
        C8_P4_3_4 = "" ;
        C8_P4_4_4 = "" ;
        C8_P4_5_4 = "" ;
        C8_P4_6_4 = "" ;
        C8_P4_6_4_0 = "" ;
        C8_P5_4 = "" ;
        C8_P6_1_4 = "" ;
        C8_P6_2_4 = "" ;
        C8_P6_3_4 = "" ;
        C8_P6_4_4 = "" ;
        C8_P6_5_4 = "" ;
        C8_P6_6_4 = "" ;
        C8_P7_4 = "" ;
        C8_P8_1_4 = "" ;
        C8_P8_2_4 = "" ;
        C8_P8_3_4 = "" ;
        C8_P8_4_4 = "" ;
        C8_P9_1_4 = "" ;
        C8_P9_2_4 = "" ;
        C8_P9_3_4 = "" ;
        C8_P9_4_4 = "" ;
        C8_P10_1_4 = "" ;
        C8_P10_2_4 = "" ;
        C8_P10_3_4 = "" ;
        C8_P10_4_4 = "" ;
        C8_P10_5_4 = "" ;
        C8_P10_6_4 = "" ;
        C8_P1_1_5 = "" ;
        C8_P1_2_5 = "" ;
        C8_P2_5 = "" ;
        C8_P3_1_5 = "" ;
        C8_P3_2_5 = "" ;
        C8_P3_3_5 = "" ;
        C8_P3_4_5 = "" ;
        C8_P3_5_5 = "" ;
        C8_P3_6_5 = "" ;
        C8_P3_6_5_0 = "" ;
        C8_P4_1_5 = "" ;
        C8_P4_2_5 = "" ;
        C8_P4_3_5 = "" ;
        C8_P4_4_5 = "" ;
        C8_P4_5_5 = "" ;
        C8_P4_6_5 = "" ;
        C8_P4_6_5_0 = "" ;
        C8_P5_5 = "" ;
        C8_P6_1_5 = "" ;
        C8_P6_2_5 = "" ;
        C8_P6_3_5 = "" ;
        C8_P6_4_5 = "" ;
        C8_P6_5_5 = "" ;
        C8_P6_6_5 = "" ;
        C8_P7_5 = "" ;
        C8_P8_1_5 = "" ;
        C8_P8_2_5 = "" ;
        C8_P8_3_5 = "" ;
        C8_P8_4_5 = "" ;
        C8_P9_1_5 = "" ;
        C8_P9_2_5 = "" ;
        C8_P9_3_5 = "" ;
        C8_P9_4_5 = "" ;
        C8_P10_1_5 = "" ;
        C8_P10_2_5 = "" ;
        C8_P10_3_5 = "" ;
        C8_P10_4_5 = "" ;
        C8_P10_5_5 = "" ;
        C8_P10_6_5 = "" ;
        C8_P1_1_6 = "" ;
        C8_P1_2_6 = "" ;
        C8_P2_6 = "" ;
        C8_P3_1_6 = "" ;
        C8_P3_2_6 = "" ;
        C8_P3_3_6 = "" ;
        C8_P3_4_6 = "" ;
        C8_P3_5_6 = "" ;
        C8_P3_6_6 = "" ;
        C8_P3_6_6_0 = "" ;
        C8_P4_1_6 = "" ;
        C8_P4_2_6 = "" ;
        C8_P4_3_6 = "" ;
        C8_P4_4_6 = "" ;
        C8_P4_5_6 = "" ;
        C8_P4_6_6 = "" ;
        C8_P4_6_6_0 = "" ;
        C8_P5_6 = "" ;
        C8_P6_1_6 = "" ;
        C8_P6_2_6 = "" ;
        C8_P6_3_6 = "" ;
        C8_P6_4_6 = "" ;
        C8_P6_5_6 = "" ;
        C8_P6_6_6 = "" ;
        C8_P7_6 = "" ;
        C8_P8_1_6 = "" ;
        C8_P8_2_6 = "" ;
        C8_P8_3_6 = "" ;
        C8_P8_4_6 = "" ;
        C8_P9_1_6 = "" ;
        C8_P9_2_6 = "" ;
        C8_P9_3_6 = "" ;
        C8_P9_4_6 = "" ;
        C8_P10_1_6 = "" ;
        C8_P10_2_6 = "" ;
        C8_P10_3_6 = "" ;
        C8_P10_4_6 = "" ;
        C8_P10_5_6 = "" ;
        C8_P10_6_6 = "" ;
        OBS_MOD_VIII = "";
        this.USU_CREACION = "";
        this.FEC_CREACION = "";
        this.USU_REGISTRO = "";
        this.FEC_REGISTRO = "";
    }



    public String getMODULO8_ID() {
        return MODULO8_ID;
    }

    public void setMODULO8_ID(String MODULO8_ID) {
        this.MODULO8_ID = MODULO8_ID;
    }

    public String getC8_P0_0() {
        return C8_P0_0;
    }

    public void setC8_P0_0(String c8_P0_0) {
        C8_P0_0 = c8_P0_0;
    }

    public String getC8_P0_1() {
        return C8_P0_1;
    }

    public void setC8_P0_1(String c8_P0_1) {
        C8_P0_1 = c8_P0_1;
    }

    public String getC8_P0_2() {
        return C8_P0_2;
    }

    public void setC8_P0_2(String c8_P0_2) {
        C8_P0_2 = c8_P0_2;
    }

    public String getC8_P0_3() {
        return C8_P0_3;
    }

    public void setC8_P0_3(String c8_P0_3) {
        C8_P0_3 = c8_P0_3;
    }

    public String getC8_P1_1_1() {
        return C8_P1_1_1;
    }

    public void setC8_P1_1_1(String c8_P1_1_1) {
        C8_P1_1_1 = c8_P1_1_1;
    }

    public String getC8_P1_2_1() {
        return C8_P1_2_1;
    }

    public void setC8_P1_2_1(String c8_P1_2_1) {
        C8_P1_2_1 = c8_P1_2_1;
    }

    public String getC8_P2_1() {
        return C8_P2_1;
    }

    public void setC8_P2_1(String c8_P2_1) {
        C8_P2_1 = c8_P2_1;
    }

    public String getC8_P3_1_1() {
        return C8_P3_1_1;
    }

    public void setC8_P3_1_1(String c8_P3_1_1) {
        C8_P3_1_1 = c8_P3_1_1;
    }

    public String getC8_P3_2_1() {
        return C8_P3_2_1;
    }

    public void setC8_P3_2_1(String c8_P3_2_1) {
        C8_P3_2_1 = c8_P3_2_1;
    }

    public String getC8_P3_3_1() {
        return C8_P3_3_1;
    }

    public void setC8_P3_3_1(String c8_P3_3_1) {
        C8_P3_3_1 = c8_P3_3_1;
    }

    public String getC8_P3_4_1() {
        return C8_P3_4_1;
    }

    public void setC8_P3_4_1(String c8_P3_4_1) {
        C8_P3_4_1 = c8_P3_4_1;
    }

    public String getC8_P3_5_1() {
        return C8_P3_5_1;
    }

    public void setC8_P3_5_1(String c8_P3_5_1) {
        C8_P3_5_1 = c8_P3_5_1;
    }

    public String getC8_P3_6_1() {
        return C8_P3_6_1;
    }

    public void setC8_P3_6_1(String c8_P3_6_1) {
        C8_P3_6_1 = c8_P3_6_1;
    }

    public String getC8_P3_6_1_0() {
        return C8_P3_6_1_0;
    }

    public void setC8_P3_6_1_0(String c8_P3_6_1_0) {
        C8_P3_6_1_0 = c8_P3_6_1_0;
    }

    public String getC8_P4_1_1() {
        return C8_P4_1_1;
    }

    public void setC8_P4_1_1(String c8_P4_1_1) {
        C8_P4_1_1 = c8_P4_1_1;
    }

    public String getC8_P4_2_1() {
        return C8_P4_2_1;
    }

    public void setC8_P4_2_1(String c8_P4_2_1) {
        C8_P4_2_1 = c8_P4_2_1;
    }

    public String getC8_P4_3_1() {
        return C8_P4_3_1;
    }

    public void setC8_P4_3_1(String c8_P4_3_1) {
        C8_P4_3_1 = c8_P4_3_1;
    }

    public String getC8_P4_4_1() {
        return C8_P4_4_1;
    }

    public void setC8_P4_4_1(String c8_P4_4_1) {
        C8_P4_4_1 = c8_P4_4_1;
    }

    public String getC8_P4_5_1() {
        return C8_P4_5_1;
    }

    public void setC8_P4_5_1(String c8_P4_5_1) {
        C8_P4_5_1 = c8_P4_5_1;
    }

    public String getC8_P4_6_1() {
        return C8_P4_6_1;
    }

    public void setC8_P4_6_1(String c8_P4_6_1) {
        C8_P4_6_1 = c8_P4_6_1;
    }

    public String getC8_P4_6_1_0() {
        return C8_P4_6_1_0;
    }

    public void setC8_P4_6_1_0(String c8_P4_6_1_0) {
        C8_P4_6_1_0 = c8_P4_6_1_0;
    }

    public String getC8_P5_1() {
        return C8_P5_1;
    }

    public void setC8_P5_1(String c8_P5_1) {
        C8_P5_1 = c8_P5_1;
    }

    public String getC8_P6_1_1() {
        return C8_P6_1_1;
    }

    public void setC8_P6_1_1(String c8_P6_1_1) {
        C8_P6_1_1 = c8_P6_1_1;
    }

    public String getC8_P6_2_1() {
        return C8_P6_2_1;
    }

    public void setC8_P6_2_1(String c8_P6_2_1) {
        C8_P6_2_1 = c8_P6_2_1;
    }

    public String getC8_P6_3_1() {
        return C8_P6_3_1;
    }

    public void setC8_P6_3_1(String c8_P6_3_1) {
        C8_P6_3_1 = c8_P6_3_1;
    }

    public String getC8_P6_4_1() {
        return C8_P6_4_1;
    }

    public void setC8_P6_4_1(String c8_P6_4_1) {
        C8_P6_4_1 = c8_P6_4_1;
    }

    public String getC8_P6_5_1() {
        return C8_P6_5_1;
    }

    public void setC8_P6_5_1(String c8_P6_5_1) {
        C8_P6_5_1 = c8_P6_5_1;
    }

    public String getC8_P6_6_1() {
        return C8_P6_6_1;
    }

    public void setC8_P6_6_1(String c8_P6_6_1) {
        C8_P6_6_1 = c8_P6_6_1;
    }

    public String getC8_P7_1() {
        return C8_P7_1;
    }

    public void setC8_P7_1(String c8_P7_1) {
        C8_P7_1 = c8_P7_1;
    }

    public String getC8_P8_1_1() {
        return C8_P8_1_1;
    }

    public void setC8_P8_1_1(String c8_P8_1_1) {
        C8_P8_1_1 = c8_P8_1_1;
    }

    public String getC8_P8_2_1() {
        return C8_P8_2_1;
    }

    public void setC8_P8_2_1(String c8_P8_2_1) {
        C8_P8_2_1 = c8_P8_2_1;
    }

    public String getC8_P8_3_1() {
        return C8_P8_3_1;
    }

    public void setC8_P8_3_1(String c8_P8_3_1) {
        C8_P8_3_1 = c8_P8_3_1;
    }

    public String getC8_P8_4_1() {
        return C8_P8_4_1;
    }

    public void setC8_P8_4_1(String c8_P8_4_1) {
        C8_P8_4_1 = c8_P8_4_1;
    }

    public String getC8_P9_1_1() {
        return C8_P9_1_1;
    }

    public void setC8_P9_1_1(String c8_P9_1_1) {
        C8_P9_1_1 = c8_P9_1_1;
    }

    public String getC8_P9_2_1() {
        return C8_P9_2_1;
    }

    public void setC8_P9_2_1(String c8_P9_2_1) {
        C8_P9_2_1 = c8_P9_2_1;
    }

    public String getC8_P9_3_1() {
        return C8_P9_3_1;
    }

    public void setC8_P9_3_1(String c8_P9_3_1) {
        C8_P9_3_1 = c8_P9_3_1;
    }

    public String getC8_P9_4_1() {
        return C8_P9_4_1;
    }

    public void setC8_P9_4_1(String c8_P9_4_1) {
        C8_P9_4_1 = c8_P9_4_1;
    }

    public String getC8_P10_1_1() {
        return C8_P10_1_1;
    }

    public void setC8_P10_1_1(String c8_P10_1_1) {
        C8_P10_1_1 = c8_P10_1_1;
    }

    public String getC8_P10_2_1() {
        return C8_P10_2_1;
    }

    public void setC8_P10_2_1(String c8_P10_2_1) {
        C8_P10_2_1 = c8_P10_2_1;
    }

    public String getC8_P10_3_1() {
        return C8_P10_3_1;
    }

    public void setC8_P10_3_1(String c8_P10_3_1) {
        C8_P10_3_1 = c8_P10_3_1;
    }

    public String getC8_P10_4_1() {
        return C8_P10_4_1;
    }

    public void setC8_P10_4_1(String c8_P10_4_1) {
        C8_P10_4_1 = c8_P10_4_1;
    }

    public String getC8_P10_5_1() {
        return C8_P10_5_1;
    }

    public void setC8_P10_5_1(String c8_P10_5_1) {
        C8_P10_5_1 = c8_P10_5_1;
    }

    public String getC8_P10_6_1() {
        return C8_P10_6_1;
    }

    public void setC8_P10_6_1(String c8_P10_6_1) {
        C8_P10_6_1 = c8_P10_6_1;
    }

    public String getC8_P1_1_2() {
        return C8_P1_1_2;
    }

    public void setC8_P1_1_2(String c8_P1_1_2) {
        C8_P1_1_2 = c8_P1_1_2;
    }

    public String getC8_P1_2_2() {
        return C8_P1_2_2;
    }

    public void setC8_P1_2_2(String c8_P1_2_2) {
        C8_P1_2_2 = c8_P1_2_2;
    }

    public String getC8_P2_2() {
        return C8_P2_2;
    }

    public void setC8_P2_2(String c8_P2_2) {
        C8_P2_2 = c8_P2_2;
    }

    public String getC8_P3_1_2() {
        return C8_P3_1_2;
    }

    public void setC8_P3_1_2(String c8_P3_1_2) {
        C8_P3_1_2 = c8_P3_1_2;
    }

    public String getC8_P3_2_2() {
        return C8_P3_2_2;
    }

    public void setC8_P3_2_2(String c8_P3_2_2) {
        C8_P3_2_2 = c8_P3_2_2;
    }

    public String getC8_P3_3_2() {
        return C8_P3_3_2;
    }

    public void setC8_P3_3_2(String c8_P3_3_2) {
        C8_P3_3_2 = c8_P3_3_2;
    }

    public String getC8_P3_4_2() {
        return C8_P3_4_2;
    }

    public void setC8_P3_4_2(String c8_P3_4_2) {
        C8_P3_4_2 = c8_P3_4_2;
    }

    public String getC8_P3_5_2() {
        return C8_P3_5_2;
    }

    public void setC8_P3_5_2(String c8_P3_5_2) {
        C8_P3_5_2 = c8_P3_5_2;
    }

    public String getC8_P3_6_2() {
        return C8_P3_6_2;
    }

    public void setC8_P3_6_2(String c8_P3_6_2) {
        C8_P3_6_2 = c8_P3_6_2;
    }

    public String getC8_P3_6_2_0() {
        return C8_P3_6_2_0;
    }

    public void setC8_P3_6_2_0(String c8_P3_6_2_0) {
        C8_P3_6_2_0 = c8_P3_6_2_0;
    }

    public String getC8_P4_1_2() {
        return C8_P4_1_2;
    }

    public void setC8_P4_1_2(String c8_P4_1_2) {
        C8_P4_1_2 = c8_P4_1_2;
    }

    public String getC8_P4_2_2() {
        return C8_P4_2_2;
    }

    public void setC8_P4_2_2(String c8_P4_2_2) {
        C8_P4_2_2 = c8_P4_2_2;
    }

    public String getC8_P4_3_2() {
        return C8_P4_3_2;
    }

    public void setC8_P4_3_2(String c8_P4_3_2) {
        C8_P4_3_2 = c8_P4_3_2;
    }

    public String getC8_P4_4_2() {
        return C8_P4_4_2;
    }

    public void setC8_P4_4_2(String c8_P4_4_2) {
        C8_P4_4_2 = c8_P4_4_2;
    }

    public String getC8_P4_5_2() {
        return C8_P4_5_2;
    }

    public void setC8_P4_5_2(String c8_P4_5_2) {
        C8_P4_5_2 = c8_P4_5_2;
    }

    public String getC8_P4_6_2() {
        return C8_P4_6_2;
    }

    public void setC8_P4_6_2(String c8_P4_6_2) {
        C8_P4_6_2 = c8_P4_6_2;
    }

    public String getC8_P4_6_2_0() {
        return C8_P4_6_2_0;
    }

    public void setC8_P4_6_2_0(String c8_P4_6_2_0) {
        C8_P4_6_2_0 = c8_P4_6_2_0;
    }

    public String getC8_P5_2() {
        return C8_P5_2;
    }

    public void setC8_P5_2(String c8_P5_2) {
        C8_P5_2 = c8_P5_2;
    }

    public String getC8_P6_1_2() {
        return C8_P6_1_2;
    }

    public void setC8_P6_1_2(String c8_P6_1_2) {
        C8_P6_1_2 = c8_P6_1_2;
    }

    public String getC8_P6_2_2() {
        return C8_P6_2_2;
    }

    public void setC8_P6_2_2(String c8_P6_2_2) {
        C8_P6_2_2 = c8_P6_2_2;
    }

    public String getC8_P6_3_2() {
        return C8_P6_3_2;
    }

    public void setC8_P6_3_2(String c8_P6_3_2) {
        C8_P6_3_2 = c8_P6_3_2;
    }

    public String getC8_P6_4_2() {
        return C8_P6_4_2;
    }

    public void setC8_P6_4_2(String c8_P6_4_2) {
        C8_P6_4_2 = c8_P6_4_2;
    }

    public String getC8_P6_5_2() {
        return C8_P6_5_2;
    }

    public void setC8_P6_5_2(String c8_P6_5_2) {
        C8_P6_5_2 = c8_P6_5_2;
    }

    public String getC8_P6_6_2() {
        return C8_P6_6_2;
    }

    public void setC8_P6_6_2(String c8_P6_6_2) {
        C8_P6_6_2 = c8_P6_6_2;
    }

    public String getC8_P7_2() {
        return C8_P7_2;
    }

    public void setC8_P7_2(String c8_P7_2) {
        C8_P7_2 = c8_P7_2;
    }

    public String getC8_P8_1_2() {
        return C8_P8_1_2;
    }

    public void setC8_P8_1_2(String c8_P8_1_2) {
        C8_P8_1_2 = c8_P8_1_2;
    }

    public String getC8_P8_2_2() {
        return C8_P8_2_2;
    }

    public void setC8_P8_2_2(String c8_P8_2_2) {
        C8_P8_2_2 = c8_P8_2_2;
    }

    public String getC8_P8_3_2() {
        return C8_P8_3_2;
    }

    public void setC8_P8_3_2(String c8_P8_3_2) {
        C8_P8_3_2 = c8_P8_3_2;
    }

    public String getC8_P8_4_2() {
        return C8_P8_4_2;
    }

    public void setC8_P8_4_2(String c8_P8_4_2) {
        C8_P8_4_2 = c8_P8_4_2;
    }

    public String getC8_P9_1_2() {
        return C8_P9_1_2;
    }

    public void setC8_P9_1_2(String c8_P9_1_2) {
        C8_P9_1_2 = c8_P9_1_2;
    }

    public String getC8_P9_2_2() {
        return C8_P9_2_2;
    }

    public void setC8_P9_2_2(String c8_P9_2_2) {
        C8_P9_2_2 = c8_P9_2_2;
    }

    public String getC8_P9_3_2() {
        return C8_P9_3_2;
    }

    public void setC8_P9_3_2(String c8_P9_3_2) {
        C8_P9_3_2 = c8_P9_3_2;
    }

    public String getC8_P9_4_2() {
        return C8_P9_4_2;
    }

    public void setC8_P9_4_2(String c8_P9_4_2) {
        C8_P9_4_2 = c8_P9_4_2;
    }

    public String getC8_P10_1_2() {
        return C8_P10_1_2;
    }

    public void setC8_P10_1_2(String c8_P10_1_2) {
        C8_P10_1_2 = c8_P10_1_2;
    }

    public String getC8_P10_2_2() {
        return C8_P10_2_2;
    }

    public void setC8_P10_2_2(String c8_P10_2_2) {
        C8_P10_2_2 = c8_P10_2_2;
    }

    public String getC8_P10_3_2() {
        return C8_P10_3_2;
    }

    public void setC8_P10_3_2(String c8_P10_3_2) {
        C8_P10_3_2 = c8_P10_3_2;
    }

    public String getC8_P10_4_2() {
        return C8_P10_4_2;
    }

    public void setC8_P10_4_2(String c8_P10_4_2) {
        C8_P10_4_2 = c8_P10_4_2;
    }

    public String getC8_P10_5_2() {
        return C8_P10_5_2;
    }

    public void setC8_P10_5_2(String c8_P10_5_2) {
        C8_P10_5_2 = c8_P10_5_2;
    }

    public String getC8_P10_6_2() {
        return C8_P10_6_2;
    }

    public void setC8_P10_6_2(String c8_P10_6_2) {
        C8_P10_6_2 = c8_P10_6_2;
    }

    public String getC8_P1_1_3() {
        return C8_P1_1_3;
    }

    public void setC8_P1_1_3(String c8_P1_1_3) {
        C8_P1_1_3 = c8_P1_1_3;
    }

    public String getC8_P1_2_3() {
        return C8_P1_2_3;
    }

    public void setC8_P1_2_3(String c8_P1_2_3) {
        C8_P1_2_3 = c8_P1_2_3;
    }

    public String getC8_P2_3() {
        return C8_P2_3;
    }

    public void setC8_P2_3(String c8_P2_3) {
        C8_P2_3 = c8_P2_3;
    }

    public String getC8_P3_1_3() {
        return C8_P3_1_3;
    }

    public void setC8_P3_1_3(String c8_P3_1_3) {
        C8_P3_1_3 = c8_P3_1_3;
    }

    public String getC8_P3_2_3() {
        return C8_P3_2_3;
    }

    public void setC8_P3_2_3(String c8_P3_2_3) {
        C8_P3_2_3 = c8_P3_2_3;
    }

    public String getC8_P3_3_3() {
        return C8_P3_3_3;
    }

    public void setC8_P3_3_3(String c8_P3_3_3) {
        C8_P3_3_3 = c8_P3_3_3;
    }

    public String getC8_P3_4_3() {
        return C8_P3_4_3;
    }

    public void setC8_P3_4_3(String c8_P3_4_3) {
        C8_P3_4_3 = c8_P3_4_3;
    }

    public String getC8_P3_5_3() {
        return C8_P3_5_3;
    }

    public void setC8_P3_5_3(String c8_P3_5_3) {
        C8_P3_5_3 = c8_P3_5_3;
    }

    public String getC8_P3_6_3() {
        return C8_P3_6_3;
    }

    public void setC8_P3_6_3(String c8_P3_6_3) {
        C8_P3_6_3 = c8_P3_6_3;
    }

    public String getC8_P3_6_3_0() {
        return C8_P3_6_3_0;
    }

    public void setC8_P3_6_3_0(String c8_P3_6_3_0) {
        C8_P3_6_3_0 = c8_P3_6_3_0;
    }

    public String getC8_P4_1_3() {
        return C8_P4_1_3;
    }

    public void setC8_P4_1_3(String c8_P4_1_3) {
        C8_P4_1_3 = c8_P4_1_3;
    }

    public String getC8_P4_2_3() {
        return C8_P4_2_3;
    }

    public void setC8_P4_2_3(String c8_P4_2_3) {
        C8_P4_2_3 = c8_P4_2_3;
    }

    public String getC8_P4_3_3() {
        return C8_P4_3_3;
    }

    public void setC8_P4_3_3(String c8_P4_3_3) {
        C8_P4_3_3 = c8_P4_3_3;
    }

    public String getC8_P4_4_3() {
        return C8_P4_4_3;
    }

    public void setC8_P4_4_3(String c8_P4_4_3) {
        C8_P4_4_3 = c8_P4_4_3;
    }

    public String getC8_P4_5_3() {
        return C8_P4_5_3;
    }

    public void setC8_P4_5_3(String c8_P4_5_3) {
        C8_P4_5_3 = c8_P4_5_3;
    }

    public String getC8_P4_6_3() {
        return C8_P4_6_3;
    }

    public void setC8_P4_6_3(String c8_P4_6_3) {
        C8_P4_6_3 = c8_P4_6_3;
    }

    public String getC8_P4_6_3_0() {
        return C8_P4_6_3_0;
    }

    public void setC8_P4_6_3_0(String c8_P4_6_3_0) {
        C8_P4_6_3_0 = c8_P4_6_3_0;
    }

    public String getC8_P5_3() {
        return C8_P5_3;
    }

    public void setC8_P5_3(String c8_P5_3) {
        C8_P5_3 = c8_P5_3;
    }

    public String getC8_P6_1_3() {
        return C8_P6_1_3;
    }

    public void setC8_P6_1_3(String c8_P6_1_3) {
        C8_P6_1_3 = c8_P6_1_3;
    }

    public String getC8_P6_2_3() {
        return C8_P6_2_3;
    }

    public void setC8_P6_2_3(String c8_P6_2_3) {
        C8_P6_2_3 = c8_P6_2_3;
    }

    public String getC8_P6_3_3() {
        return C8_P6_3_3;
    }

    public void setC8_P6_3_3(String c8_P6_3_3) {
        C8_P6_3_3 = c8_P6_3_3;
    }

    public String getC8_P6_4_3() {
        return C8_P6_4_3;
    }

    public void setC8_P6_4_3(String c8_P6_4_3) {
        C8_P6_4_3 = c8_P6_4_3;
    }

    public String getC8_P6_5_3() {
        return C8_P6_5_3;
    }

    public void setC8_P6_5_3(String c8_P6_5_3) {
        C8_P6_5_3 = c8_P6_5_3;
    }

    public String getC8_P6_6_3() {
        return C8_P6_6_3;
    }

    public void setC8_P6_6_3(String c8_P6_6_3) {
        C8_P6_6_3 = c8_P6_6_3;
    }

    public String getC8_P7_3() {
        return C8_P7_3;
    }

    public void setC8_P7_3(String c8_P7_3) {
        C8_P7_3 = c8_P7_3;
    }

    public String getC8_P8_1_3() {
        return C8_P8_1_3;
    }

    public void setC8_P8_1_3(String c8_P8_1_3) {
        C8_P8_1_3 = c8_P8_1_3;
    }

    public String getC8_P8_2_3() {
        return C8_P8_2_3;
    }

    public void setC8_P8_2_3(String c8_P8_2_3) {
        C8_P8_2_3 = c8_P8_2_3;
    }

    public String getC8_P8_3_3() {
        return C8_P8_3_3;
    }

    public void setC8_P8_3_3(String c8_P8_3_3) {
        C8_P8_3_3 = c8_P8_3_3;
    }

    public String getC8_P8_4_3() {
        return C8_P8_4_3;
    }

    public void setC8_P8_4_3(String c8_P8_4_3) {
        C8_P8_4_3 = c8_P8_4_3;
    }

    public String getC8_P9_1_3() {
        return C8_P9_1_3;
    }

    public void setC8_P9_1_3(String c8_P9_1_3) {
        C8_P9_1_3 = c8_P9_1_3;
    }

    public String getC8_P9_2_3() {
        return C8_P9_2_3;
    }

    public void setC8_P9_2_3(String c8_P9_2_3) {
        C8_P9_2_3 = c8_P9_2_3;
    }

    public String getC8_P9_3_3() {
        return C8_P9_3_3;
    }

    public void setC8_P9_3_3(String c8_P9_3_3) {
        C8_P9_3_3 = c8_P9_3_3;
    }

    public String getC8_P9_4_3() {
        return C8_P9_4_3;
    }

    public void setC8_P9_4_3(String c8_P9_4_3) {
        C8_P9_4_3 = c8_P9_4_3;
    }

    public String getC8_P10_1_3() {
        return C8_P10_1_3;
    }

    public void setC8_P10_1_3(String c8_P10_1_3) {
        C8_P10_1_3 = c8_P10_1_3;
    }

    public String getC8_P10_2_3() {
        return C8_P10_2_3;
    }

    public void setC8_P10_2_3(String c8_P10_2_3) {
        C8_P10_2_3 = c8_P10_2_3;
    }

    public String getC8_P10_3_3() {
        return C8_P10_3_3;
    }

    public void setC8_P10_3_3(String c8_P10_3_3) {
        C8_P10_3_3 = c8_P10_3_3;
    }

    public String getC8_P10_4_3() {
        return C8_P10_4_3;
    }

    public void setC8_P10_4_3(String c8_P10_4_3) {
        C8_P10_4_3 = c8_P10_4_3;
    }

    public String getC8_P10_5_3() {
        return C8_P10_5_3;
    }

    public void setC8_P10_5_3(String c8_P10_5_3) {
        C8_P10_5_3 = c8_P10_5_3;
    }

    public String getC8_P10_6_3() {
        return C8_P10_6_3;
    }

    public void setC8_P10_6_3(String c8_P10_6_3) {
        C8_P10_6_3 = c8_P10_6_3;
    }

    public String getC8_P1_1_4() {
        return C8_P1_1_4;
    }

    public void setC8_P1_1_4(String c8_P1_1_4) {
        C8_P1_1_4 = c8_P1_1_4;
    }

    public String getC8_P1_2_4() {
        return C8_P1_2_4;
    }

    public void setC8_P1_2_4(String c8_P1_2_4) {
        C8_P1_2_4 = c8_P1_2_4;
    }

    public String getC8_P2_4() {
        return C8_P2_4;
    }

    public void setC8_P2_4(String c8_P2_4) {
        C8_P2_4 = c8_P2_4;
    }

    public String getC8_P3_1_4() {
        return C8_P3_1_4;
    }

    public void setC8_P3_1_4(String c8_P3_1_4) {
        C8_P3_1_4 = c8_P3_1_4;
    }

    public String getC8_P3_2_4() {
        return C8_P3_2_4;
    }

    public void setC8_P3_2_4(String c8_P3_2_4) {
        C8_P3_2_4 = c8_P3_2_4;
    }

    public String getC8_P3_3_4() {
        return C8_P3_3_4;
    }

    public void setC8_P3_3_4(String c8_P3_3_4) {
        C8_P3_3_4 = c8_P3_3_4;
    }

    public String getC8_P3_4_4() {
        return C8_P3_4_4;
    }

    public void setC8_P3_4_4(String c8_P3_4_4) {
        C8_P3_4_4 = c8_P3_4_4;
    }

    public String getC8_P3_5_4() {
        return C8_P3_5_4;
    }

    public void setC8_P3_5_4(String c8_P3_5_4) {
        C8_P3_5_4 = c8_P3_5_4;
    }

    public String getC8_P3_6_4() {
        return C8_P3_6_4;
    }

    public void setC8_P3_6_4(String c8_P3_6_4) {
        C8_P3_6_4 = c8_P3_6_4;
    }

    public String getC8_P3_6_4_0() {
        return C8_P3_6_4_0;
    }

    public void setC8_P3_6_4_0(String c8_P3_6_4_0) {
        C8_P3_6_4_0 = c8_P3_6_4_0;
    }

    public String getC8_P4_1_4() {
        return C8_P4_1_4;
    }

    public void setC8_P4_1_4(String c8_P4_1_4) {
        C8_P4_1_4 = c8_P4_1_4;
    }

    public String getC8_P4_2_4() {
        return C8_P4_2_4;
    }

    public void setC8_P4_2_4(String c8_P4_2_4) {
        C8_P4_2_4 = c8_P4_2_4;
    }

    public String getC8_P4_3_4() {
        return C8_P4_3_4;
    }

    public void setC8_P4_3_4(String c8_P4_3_4) {
        C8_P4_3_4 = c8_P4_3_4;
    }

    public String getC8_P4_4_4() {
        return C8_P4_4_4;
    }

    public void setC8_P4_4_4(String c8_P4_4_4) {
        C8_P4_4_4 = c8_P4_4_4;
    }

    public String getC8_P4_5_4() {
        return C8_P4_5_4;
    }

    public void setC8_P4_5_4(String c8_P4_5_4) {
        C8_P4_5_4 = c8_P4_5_4;
    }

    public String getC8_P4_6_4() {
        return C8_P4_6_4;
    }

    public void setC8_P4_6_4(String c8_P4_6_4) {
        C8_P4_6_4 = c8_P4_6_4;
    }

    public String getC8_P4_6_4_0() {
        return C8_P4_6_4_0;
    }

    public void setC8_P4_6_4_0(String c8_P4_6_4_0) {
        C8_P4_6_4_0 = c8_P4_6_4_0;
    }

    public String getC8_P5_4() {
        return C8_P5_4;
    }

    public void setC8_P5_4(String c8_P5_4) {
        C8_P5_4 = c8_P5_4;
    }

    public String getC8_P6_1_4() {
        return C8_P6_1_4;
    }

    public void setC8_P6_1_4(String c8_P6_1_4) {
        C8_P6_1_4 = c8_P6_1_4;
    }

    public String getC8_P6_2_4() {
        return C8_P6_2_4;
    }

    public void setC8_P6_2_4(String c8_P6_2_4) {
        C8_P6_2_4 = c8_P6_2_4;
    }

    public String getC8_P6_3_4() {
        return C8_P6_3_4;
    }

    public void setC8_P6_3_4(String c8_P6_3_4) {
        C8_P6_3_4 = c8_P6_3_4;
    }

    public String getC8_P6_4_4() {
        return C8_P6_4_4;
    }

    public void setC8_P6_4_4(String c8_P6_4_4) {
        C8_P6_4_4 = c8_P6_4_4;
    }

    public String getC8_P6_5_4() {
        return C8_P6_5_4;
    }

    public void setC8_P6_5_4(String c8_P6_5_4) {
        C8_P6_5_4 = c8_P6_5_4;
    }

    public String getC8_P6_6_4() {
        return C8_P6_6_4;
    }

    public void setC8_P6_6_4(String c8_P6_6_4) {
        C8_P6_6_4 = c8_P6_6_4;
    }

    public String getC8_P7_4() {
        return C8_P7_4;
    }

    public void setC8_P7_4(String c8_P7_4) {
        C8_P7_4 = c8_P7_4;
    }

    public String getC8_P8_1_4() {
        return C8_P8_1_4;
    }

    public void setC8_P8_1_4(String c8_P8_1_4) {
        C8_P8_1_4 = c8_P8_1_4;
    }

    public String getC8_P8_2_4() {
        return C8_P8_2_4;
    }

    public void setC8_P8_2_4(String c8_P8_2_4) {
        C8_P8_2_4 = c8_P8_2_4;
    }

    public String getC8_P8_3_4() {
        return C8_P8_3_4;
    }

    public void setC8_P8_3_4(String c8_P8_3_4) {
        C8_P8_3_4 = c8_P8_3_4;
    }

    public String getC8_P8_4_4() {
        return C8_P8_4_4;
    }

    public void setC8_P8_4_4(String c8_P8_4_4) {
        C8_P8_4_4 = c8_P8_4_4;
    }

    public String getC8_P9_1_4() {
        return C8_P9_1_4;
    }

    public void setC8_P9_1_4(String c8_P9_1_4) {
        C8_P9_1_4 = c8_P9_1_4;
    }

    public String getC8_P9_2_4() {
        return C8_P9_2_4;
    }

    public void setC8_P9_2_4(String c8_P9_2_4) {
        C8_P9_2_4 = c8_P9_2_4;
    }

    public String getC8_P9_3_4() {
        return C8_P9_3_4;
    }

    public void setC8_P9_3_4(String c8_P9_3_4) {
        C8_P9_3_4 = c8_P9_3_4;
    }

    public String getC8_P9_4_4() {
        return C8_P9_4_4;
    }

    public void setC8_P9_4_4(String c8_P9_4_4) {
        C8_P9_4_4 = c8_P9_4_4;
    }

    public String getC8_P10_1_4() {
        return C8_P10_1_4;
    }

    public void setC8_P10_1_4(String c8_P10_1_4) {
        C8_P10_1_4 = c8_P10_1_4;
    }

    public String getC8_P10_2_4() {
        return C8_P10_2_4;
    }

    public void setC8_P10_2_4(String c8_P10_2_4) {
        C8_P10_2_4 = c8_P10_2_4;
    }

    public String getC8_P10_3_4() {
        return C8_P10_3_4;
    }

    public void setC8_P10_3_4(String c8_P10_3_4) {
        C8_P10_3_4 = c8_P10_3_4;
    }

    public String getC8_P10_4_4() {
        return C8_P10_4_4;
    }

    public void setC8_P10_4_4(String c8_P10_4_4) {
        C8_P10_4_4 = c8_P10_4_4;
    }

    public String getC8_P10_5_4() {
        return C8_P10_5_4;
    }

    public void setC8_P10_5_4(String c8_P10_5_4) {
        C8_P10_5_4 = c8_P10_5_4;
    }

    public String getC8_P10_6_4() {
        return C8_P10_6_4;
    }

    public void setC8_P10_6_4(String c8_P10_6_4) {
        C8_P10_6_4 = c8_P10_6_4;
    }

    public String getC8_P1_1_5() {
        return C8_P1_1_5;
    }

    public void setC8_P1_1_5(String c8_P1_1_5) {
        C8_P1_1_5 = c8_P1_1_5;
    }

    public String getC8_P1_2_5() {
        return C8_P1_2_5;
    }

    public void setC8_P1_2_5(String c8_P1_2_5) {
        C8_P1_2_5 = c8_P1_2_5;
    }

    public String getC8_P2_5() {
        return C8_P2_5;
    }

    public void setC8_P2_5(String c8_P2_5) {
        C8_P2_5 = c8_P2_5;
    }

    public String getC8_P3_1_5() {
        return C8_P3_1_5;
    }

    public void setC8_P3_1_5(String c8_P3_1_5) {
        C8_P3_1_5 = c8_P3_1_5;
    }

    public String getC8_P3_2_5() {
        return C8_P3_2_5;
    }

    public void setC8_P3_2_5(String c8_P3_2_5) {
        C8_P3_2_5 = c8_P3_2_5;
    }

    public String getC8_P3_3_5() {
        return C8_P3_3_5;
    }

    public void setC8_P3_3_5(String c8_P3_3_5) {
        C8_P3_3_5 = c8_P3_3_5;
    }

    public String getC8_P3_4_5() {
        return C8_P3_4_5;
    }

    public void setC8_P3_4_5(String c8_P3_4_5) {
        C8_P3_4_5 = c8_P3_4_5;
    }

    public String getC8_P3_5_5() {
        return C8_P3_5_5;
    }

    public void setC8_P3_5_5(String c8_P3_5_5) {
        C8_P3_5_5 = c8_P3_5_5;
    }

    public String getC8_P3_6_5() {
        return C8_P3_6_5;
    }

    public void setC8_P3_6_5(String c8_P3_6_5) {
        C8_P3_6_5 = c8_P3_6_5;
    }

    public String getC8_P3_6_5_0() {
        return C8_P3_6_5_0;
    }

    public void setC8_P3_6_5_0(String c8_P3_6_5_0) {
        C8_P3_6_5_0 = c8_P3_6_5_0;
    }

    public String getC8_P4_1_5() {
        return C8_P4_1_5;
    }

    public void setC8_P4_1_5(String c8_P4_1_5) {
        C8_P4_1_5 = c8_P4_1_5;
    }

    public String getC8_P4_2_5() {
        return C8_P4_2_5;
    }

    public void setC8_P4_2_5(String c8_P4_2_5) {
        C8_P4_2_5 = c8_P4_2_5;
    }

    public String getC8_P4_3_5() {
        return C8_P4_3_5;
    }

    public void setC8_P4_3_5(String c8_P4_3_5) {
        C8_P4_3_5 = c8_P4_3_5;
    }

    public String getC8_P4_4_5() {
        return C8_P4_4_5;
    }

    public void setC8_P4_4_5(String c8_P4_4_5) {
        C8_P4_4_5 = c8_P4_4_5;
    }

    public String getC8_P4_5_5() {
        return C8_P4_5_5;
    }

    public void setC8_P4_5_5(String c8_P4_5_5) {
        C8_P4_5_5 = c8_P4_5_5;
    }

    public String getC8_P4_6_5() {
        return C8_P4_6_5;
    }

    public void setC8_P4_6_5(String c8_P4_6_5) {
        C8_P4_6_5 = c8_P4_6_5;
    }

    public String getC8_P4_6_5_0() {
        return C8_P4_6_5_0;
    }

    public void setC8_P4_6_5_0(String c8_P4_6_5_0) {
        C8_P4_6_5_0 = c8_P4_6_5_0;
    }

    public String getC8_P5_5() {
        return C8_P5_5;
    }

    public void setC8_P5_5(String c8_P5_5) {
        C8_P5_5 = c8_P5_5;
    }

    public String getC8_P6_1_5() {
        return C8_P6_1_5;
    }

    public void setC8_P6_1_5(String c8_P6_1_5) {
        C8_P6_1_5 = c8_P6_1_5;
    }

    public String getC8_P6_2_5() {
        return C8_P6_2_5;
    }

    public void setC8_P6_2_5(String c8_P6_2_5) {
        C8_P6_2_5 = c8_P6_2_5;
    }

    public String getC8_P6_3_5() {
        return C8_P6_3_5;
    }

    public void setC8_P6_3_5(String c8_P6_3_5) {
        C8_P6_3_5 = c8_P6_3_5;
    }

    public String getC8_P6_4_5() {
        return C8_P6_4_5;
    }

    public void setC8_P6_4_5(String c8_P6_4_5) {
        C8_P6_4_5 = c8_P6_4_5;
    }

    public String getC8_P6_5_5() {
        return C8_P6_5_5;
    }

    public void setC8_P6_5_5(String c8_P6_5_5) {
        C8_P6_5_5 = c8_P6_5_5;
    }

    public String getC8_P6_6_5() {
        return C8_P6_6_5;
    }

    public void setC8_P6_6_5(String c8_P6_6_5) {
        C8_P6_6_5 = c8_P6_6_5;
    }

    public String getC8_P7_5() {
        return C8_P7_5;
    }

    public void setC8_P7_5(String c8_P7_5) {
        C8_P7_5 = c8_P7_5;
    }

    public String getC8_P8_1_5() {
        return C8_P8_1_5;
    }

    public void setC8_P8_1_5(String c8_P8_1_5) {
        C8_P8_1_5 = c8_P8_1_5;
    }

    public String getC8_P8_2_5() {
        return C8_P8_2_5;
    }

    public void setC8_P8_2_5(String c8_P8_2_5) {
        C8_P8_2_5 = c8_P8_2_5;
    }

    public String getC8_P8_3_5() {
        return C8_P8_3_5;
    }

    public void setC8_P8_3_5(String c8_P8_3_5) {
        C8_P8_3_5 = c8_P8_3_5;
    }

    public String getC8_P8_4_5() {
        return C8_P8_4_5;
    }

    public void setC8_P8_4_5(String c8_P8_4_5) {
        C8_P8_4_5 = c8_P8_4_5;
    }

    public String getC8_P9_1_5() {
        return C8_P9_1_5;
    }

    public void setC8_P9_1_5(String c8_P9_1_5) {
        C8_P9_1_5 = c8_P9_1_5;
    }

    public String getC8_P9_2_5() {
        return C8_P9_2_5;
    }

    public void setC8_P9_2_5(String c8_P9_2_5) {
        C8_P9_2_5 = c8_P9_2_5;
    }

    public String getC8_P9_3_5() {
        return C8_P9_3_5;
    }

    public void setC8_P9_3_5(String c8_P9_3_5) {
        C8_P9_3_5 = c8_P9_3_5;
    }

    public String getC8_P9_4_5() {
        return C8_P9_4_5;
    }

    public void setC8_P9_4_5(String c8_P9_4_5) {
        C8_P9_4_5 = c8_P9_4_5;
    }

    public String getC8_P10_1_5() {
        return C8_P10_1_5;
    }

    public void setC8_P10_1_5(String c8_P10_1_5) {
        C8_P10_1_5 = c8_P10_1_5;
    }

    public String getC8_P10_2_5() {
        return C8_P10_2_5;
    }

    public void setC8_P10_2_5(String c8_P10_2_5) {
        C8_P10_2_5 = c8_P10_2_5;
    }

    public String getC8_P10_3_5() {
        return C8_P10_3_5;
    }

    public void setC8_P10_3_5(String c8_P10_3_5) {
        C8_P10_3_5 = c8_P10_3_5;
    }

    public String getC8_P10_4_5() {
        return C8_P10_4_5;
    }

    public void setC8_P10_4_5(String c8_P10_4_5) {
        C8_P10_4_5 = c8_P10_4_5;
    }

    public String getC8_P10_5_5() {
        return C8_P10_5_5;
    }

    public void setC8_P10_5_5(String c8_P10_5_5) {
        C8_P10_5_5 = c8_P10_5_5;
    }

    public String getC8_P10_6_5() {
        return C8_P10_6_5;
    }

    public void setC8_P10_6_5(String c8_P10_6_5) {
        C8_P10_6_5 = c8_P10_6_5;
    }

    public String getC8_P1_1_6() {
        return C8_P1_1_6;
    }

    public void setC8_P1_1_6(String c8_P1_1_6) {
        C8_P1_1_6 = c8_P1_1_6;
    }

    public String getC8_P1_2_6() {
        return C8_P1_2_6;
    }

    public void setC8_P1_2_6(String c8_P1_2_6) {
        C8_P1_2_6 = c8_P1_2_6;
    }

    public String getC8_P2_6() {
        return C8_P2_6;
    }

    public void setC8_P2_6(String c8_P2_6) {
        C8_P2_6 = c8_P2_6;
    }

    public String getC8_P3_1_6() {
        return C8_P3_1_6;
    }

    public void setC8_P3_1_6(String c8_P3_1_6) {
        C8_P3_1_6 = c8_P3_1_6;
    }

    public String getC8_P3_2_6() {
        return C8_P3_2_6;
    }

    public void setC8_P3_2_6(String c8_P3_2_6) {
        C8_P3_2_6 = c8_P3_2_6;
    }

    public String getC8_P3_3_6() {
        return C8_P3_3_6;
    }

    public void setC8_P3_3_6(String c8_P3_3_6) {
        C8_P3_3_6 = c8_P3_3_6;
    }

    public String getC8_P3_4_6() {
        return C8_P3_4_6;
    }

    public void setC8_P3_4_6(String c8_P3_4_6) {
        C8_P3_4_6 = c8_P3_4_6;
    }

    public String getC8_P3_5_6() {
        return C8_P3_5_6;
    }

    public void setC8_P3_5_6(String c8_P3_5_6) {
        C8_P3_5_6 = c8_P3_5_6;
    }

    public String getC8_P3_6_6() {
        return C8_P3_6_6;
    }

    public void setC8_P3_6_6(String c8_P3_6_6) {
        C8_P3_6_6 = c8_P3_6_6;
    }

    public String getC8_P3_6_6_0() {
        return C8_P3_6_6_0;
    }

    public void setC8_P3_6_6_0(String c8_P3_6_6_0) {
        C8_P3_6_6_0 = c8_P3_6_6_0;
    }

    public String getC8_P4_1_6() {
        return C8_P4_1_6;
    }

    public void setC8_P4_1_6(String c8_P4_1_6) {
        C8_P4_1_6 = c8_P4_1_6;
    }

    public String getC8_P4_2_6() {
        return C8_P4_2_6;
    }

    public void setC8_P4_2_6(String c8_P4_2_6) {
        C8_P4_2_6 = c8_P4_2_6;
    }

    public String getC8_P4_3_6() {
        return C8_P4_3_6;
    }

    public void setC8_P4_3_6(String c8_P4_3_6) {
        C8_P4_3_6 = c8_P4_3_6;
    }

    public String getC8_P4_4_6() {
        return C8_P4_4_6;
    }

    public void setC8_P4_4_6(String c8_P4_4_6) {
        C8_P4_4_6 = c8_P4_4_6;
    }

    public String getC8_P4_5_6() {
        return C8_P4_5_6;
    }

    public void setC8_P4_5_6(String c8_P4_5_6) {
        C8_P4_5_6 = c8_P4_5_6;
    }

    public String getC8_P4_6_6() {
        return C8_P4_6_6;
    }

    public void setC8_P4_6_6(String c8_P4_6_6) {
        C8_P4_6_6 = c8_P4_6_6;
    }

    public String getC8_P4_6_6_0() {
        return C8_P4_6_6_0;
    }

    public void setC8_P4_6_6_0(String c8_P4_6_6_0) {
        C8_P4_6_6_0 = c8_P4_6_6_0;
    }

    public String getC8_P5_6() {
        return C8_P5_6;
    }

    public void setC8_P5_6(String c8_P5_6) {
        C8_P5_6 = c8_P5_6;
    }

    public String getC8_P6_1_6() {
        return C8_P6_1_6;
    }

    public void setC8_P6_1_6(String c8_P6_1_6) {
        C8_P6_1_6 = c8_P6_1_6;
    }

    public String getC8_P6_2_6() {
        return C8_P6_2_6;
    }

    public void setC8_P6_2_6(String c8_P6_2_6) {
        C8_P6_2_6 = c8_P6_2_6;
    }

    public String getC8_P6_3_6() {
        return C8_P6_3_6;
    }

    public void setC8_P6_3_6(String c8_P6_3_6) {
        C8_P6_3_6 = c8_P6_3_6;
    }

    public String getC8_P6_4_6() {
        return C8_P6_4_6;
    }

    public void setC8_P6_4_6(String c8_P6_4_6) {
        C8_P6_4_6 = c8_P6_4_6;
    }

    public String getC8_P6_5_6() {
        return C8_P6_5_6;
    }

    public void setC8_P6_5_6(String c8_P6_5_6) {
        C8_P6_5_6 = c8_P6_5_6;
    }

    public String getC8_P6_6_6() {
        return C8_P6_6_6;
    }

    public void setC8_P6_6_6(String c8_P6_6_6) {
        C8_P6_6_6 = c8_P6_6_6;
    }

    public String getC8_P7_6() {
        return C8_P7_6;
    }

    public void setC8_P7_6(String c8_P7_6) {
        C8_P7_6 = c8_P7_6;
    }

    public String getC8_P8_1_6() {
        return C8_P8_1_6;
    }

    public void setC8_P8_1_6(String c8_P8_1_6) {
        C8_P8_1_6 = c8_P8_1_6;
    }

    public String getC8_P8_2_6() {
        return C8_P8_2_6;
    }

    public void setC8_P8_2_6(String c8_P8_2_6) {
        C8_P8_2_6 = c8_P8_2_6;
    }

    public String getC8_P8_3_6() {
        return C8_P8_3_6;
    }

    public void setC8_P8_3_6(String c8_P8_3_6) {
        C8_P8_3_6 = c8_P8_3_6;
    }

    public String getC8_P8_4_6() {
        return C8_P8_4_6;
    }

    public void setC8_P8_4_6(String c8_P8_4_6) {
        C8_P8_4_6 = c8_P8_4_6;
    }

    public String getC8_P9_1_6() {
        return C8_P9_1_6;
    }

    public void setC8_P9_1_6(String c8_P9_1_6) {
        C8_P9_1_6 = c8_P9_1_6;
    }

    public String getC8_P9_2_6() {
        return C8_P9_2_6;
    }

    public void setC8_P9_2_6(String c8_P9_2_6) {
        C8_P9_2_6 = c8_P9_2_6;
    }

    public String getC8_P9_3_6() {
        return C8_P9_3_6;
    }

    public void setC8_P9_3_6(String c8_P9_3_6) {
        C8_P9_3_6 = c8_P9_3_6;
    }

    public String getC8_P9_4_6() {
        return C8_P9_4_6;
    }

    public void setC8_P9_4_6(String c8_P9_4_6) {
        C8_P9_4_6 = c8_P9_4_6;
    }

    public String getC8_P10_1_6() {
        return C8_P10_1_6;
    }

    public void setC8_P10_1_6(String c8_P10_1_6) {
        C8_P10_1_6 = c8_P10_1_6;
    }

    public String getC8_P10_2_6() {
        return C8_P10_2_6;
    }

    public void setC8_P10_2_6(String c8_P10_2_6) {
        C8_P10_2_6 = c8_P10_2_6;
    }

    public String getC8_P10_3_6() {
        return C8_P10_3_6;
    }

    public void setC8_P10_3_6(String c8_P10_3_6) {
        C8_P10_3_6 = c8_P10_3_6;
    }

    public String getC8_P10_4_6() {
        return C8_P10_4_6;
    }

    public void setC8_P10_4_6(String c8_P10_4_6) {
        C8_P10_4_6 = c8_P10_4_6;
    }

    public String getC8_P10_5_6() {
        return C8_P10_5_6;
    }

    public void setC8_P10_5_6(String c8_P10_5_6) {
        C8_P10_5_6 = c8_P10_5_6;
    }

    public String getC8_P10_6_6() {
        return C8_P10_6_6;
    }

    public void setC8_P10_6_6(String c8_P10_6_6) {
        C8_P10_6_6 = c8_P10_6_6;
    }

    public String getOBS_MOD_VIII() {
        return OBS_MOD_VIII;
    }

    public void setOBS_MOD_VIII(String OBS_MOD_VIII) {
        this.OBS_MOD_VIII = OBS_MOD_VIII;
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
        ContentValues contentValues = new ContentValues(244);
        contentValues.put(SQLConstantes.MODULO8_ID,MODULO8_ID);
        contentValues.put(SQLConstantes.MODULO8_P0_0,C8_P0_0);
        contentValues.put(SQLConstantes.MODULO8_P0_1,C8_P0_1);
        contentValues.put(SQLConstantes.MODULO8_P0_2,C8_P0_2);
        contentValues.put(SQLConstantes.MODULO8_P0_3,C8_P0_3);
        contentValues.put(SQLConstantes.MODULO8_P1_1_1,C8_P1_1_1);
        contentValues.put(SQLConstantes.MODULO8_P1_2_1,C8_P1_2_1);
        contentValues.put(SQLConstantes.MODULO8_P2_1,C8_P2_1);
        contentValues.put(SQLConstantes.MODULO8_P3_1_1,C8_P3_1_1);
        contentValues.put(SQLConstantes.MODULO8_P3_2_1,C8_P3_2_1);
        contentValues.put(SQLConstantes.MODULO8_P3_3_1,C8_P3_3_1);
        contentValues.put(SQLConstantes.MODULO8_P3_4_1,C8_P3_4_1);
        contentValues.put(SQLConstantes.MODULO8_P3_5_1,C8_P3_5_1);
        contentValues.put(SQLConstantes.MODULO8_P3_6_1,C8_P3_6_1);
        contentValues.put(SQLConstantes.MODULO8_P3_6_1_0,C8_P3_6_1_0);
        contentValues.put(SQLConstantes.MODULO8_P4_1_1,C8_P4_1_1);
        contentValues.put(SQLConstantes.MODULO8_P4_2_1,C8_P4_2_1);
        contentValues.put(SQLConstantes.MODULO8_P4_3_1,C8_P4_3_1);
        contentValues.put(SQLConstantes.MODULO8_P4_4_1,C8_P4_4_1);
        contentValues.put(SQLConstantes.MODULO8_P4_5_1,C8_P4_5_1);
        contentValues.put(SQLConstantes.MODULO8_P4_6_1,C8_P4_6_1);
        contentValues.put(SQLConstantes.MODULO8_P4_6_1_0,C8_P4_6_1_0);
        contentValues.put(SQLConstantes.MODULO8_P5_1,C8_P5_1);
        contentValues.put(SQLConstantes.MODULO8_P6_1_1,C8_P6_1_1);
        contentValues.put(SQLConstantes.MODULO8_P6_2_1,C8_P6_2_1);
        contentValues.put(SQLConstantes.MODULO8_P6_3_1,C8_P6_3_1);
        contentValues.put(SQLConstantes.MODULO8_P6_4_1,C8_P6_4_1);
        contentValues.put(SQLConstantes.MODULO8_P6_5_1,C8_P6_5_1);
        contentValues.put(SQLConstantes.MODULO8_P6_6_1,C8_P6_6_1);
        contentValues.put(SQLConstantes.MODULO8_P7_1,C8_P7_1);
        contentValues.put(SQLConstantes.MODULO8_P8_1_1,C8_P8_1_1);
        contentValues.put(SQLConstantes.MODULO8_P8_2_1,C8_P8_2_1);
        contentValues.put(SQLConstantes.MODULO8_P8_3_1,C8_P8_3_1);
        contentValues.put(SQLConstantes.MODULO8_P8_4_1,C8_P8_4_1);
        contentValues.put(SQLConstantes.MODULO8_P9_1_1,C8_P9_1_1);
        contentValues.put(SQLConstantes.MODULO8_P9_2_1,C8_P9_2_1);
        contentValues.put(SQLConstantes.MODULO8_P9_3_1,C8_P9_3_1);
        contentValues.put(SQLConstantes.MODULO8_P9_4_1,C8_P9_4_1);
        contentValues.put(SQLConstantes.MODULO8_P10_1_1,C8_P10_1_1);
        contentValues.put(SQLConstantes.MODULO8_P10_2_1,C8_P10_2_1);
        contentValues.put(SQLConstantes.MODULO8_P10_3_1,C8_P10_3_1);
        contentValues.put(SQLConstantes.MODULO8_P10_4_1,C8_P10_4_1);
        contentValues.put(SQLConstantes.MODULO8_P10_5_1,C8_P10_5_1);
        contentValues.put(SQLConstantes.MODULO8_P10_6_1,C8_P10_6_1);
        contentValues.put(SQLConstantes.MODULO8_P1_1_2,C8_P1_1_2);
        contentValues.put(SQLConstantes.MODULO8_P1_2_2,C8_P1_2_2);
        contentValues.put(SQLConstantes.MODULO8_P2_2,C8_P2_2);
        contentValues.put(SQLConstantes.MODULO8_P3_1_2,C8_P3_1_2);
        contentValues.put(SQLConstantes.MODULO8_P3_2_2,C8_P3_2_2);
        contentValues.put(SQLConstantes.MODULO8_P3_3_2,C8_P3_3_2);
        contentValues.put(SQLConstantes.MODULO8_P3_4_2,C8_P3_4_2);
        contentValues.put(SQLConstantes.MODULO8_P3_5_2,C8_P3_5_2);
        contentValues.put(SQLConstantes.MODULO8_P3_6_2,C8_P3_6_2);
        contentValues.put(SQLConstantes.MODULO8_P3_6_2_0,C8_P3_6_2_0);
        contentValues.put(SQLConstantes.MODULO8_P4_1_2,C8_P4_1_2);
        contentValues.put(SQLConstantes.MODULO8_P4_2_2,C8_P4_2_2);
        contentValues.put(SQLConstantes.MODULO8_P4_3_2,C8_P4_3_2);
        contentValues.put(SQLConstantes.MODULO8_P4_4_2,C8_P4_4_2);
        contentValues.put(SQLConstantes.MODULO8_P4_5_2,C8_P4_5_2);
        contentValues.put(SQLConstantes.MODULO8_P4_6_2,C8_P4_6_2);
        contentValues.put(SQLConstantes.MODULO8_P4_6_2_0,C8_P4_6_2_0);
        contentValues.put(SQLConstantes.MODULO8_P5_2,C8_P5_2);
        contentValues.put(SQLConstantes.MODULO8_P6_1_2,C8_P6_1_2);
        contentValues.put(SQLConstantes.MODULO8_P6_2_2,C8_P6_2_2);
        contentValues.put(SQLConstantes.MODULO8_P6_3_2,C8_P6_3_2);
        contentValues.put(SQLConstantes.MODULO8_P6_4_2,C8_P6_4_2);
        contentValues.put(SQLConstantes.MODULO8_P6_5_2,C8_P6_5_2);
        contentValues.put(SQLConstantes.MODULO8_P6_6_2,C8_P6_6_2);
        contentValues.put(SQLConstantes.MODULO8_P7_2,C8_P7_2);
        contentValues.put(SQLConstantes.MODULO8_P8_1_2,C8_P8_1_2);
        contentValues.put(SQLConstantes.MODULO8_P8_2_2,C8_P8_2_2);
        contentValues.put(SQLConstantes.MODULO8_P8_3_2,C8_P8_3_2);
        contentValues.put(SQLConstantes.MODULO8_P8_4_2,C8_P8_4_2);
        contentValues.put(SQLConstantes.MODULO8_P9_1_2,C8_P9_1_2);
        contentValues.put(SQLConstantes.MODULO8_P9_2_2,C8_P9_2_2);
        contentValues.put(SQLConstantes.MODULO8_P9_3_2,C8_P9_3_2);
        contentValues.put(SQLConstantes.MODULO8_P9_4_2,C8_P9_4_2);
        contentValues.put(SQLConstantes.MODULO8_P10_1_2,C8_P10_1_2);
        contentValues.put(SQLConstantes.MODULO8_P10_2_2,C8_P10_2_2);
        contentValues.put(SQLConstantes.MODULO8_P10_3_2,C8_P10_3_2);
        contentValues.put(SQLConstantes.MODULO8_P10_4_2,C8_P10_4_2);
        contentValues.put(SQLConstantes.MODULO8_P10_5_2,C8_P10_5_2);
        contentValues.put(SQLConstantes.MODULO8_P10_6_2,C8_P10_6_2);
        contentValues.put(SQLConstantes.MODULO8_P1_1_3,C8_P1_1_3);
        contentValues.put(SQLConstantes.MODULO8_P1_2_3,C8_P1_2_3);
        contentValues.put(SQLConstantes.MODULO8_P2_3,C8_P2_3);
        contentValues.put(SQLConstantes.MODULO8_P3_1_3,C8_P3_1_3);
        contentValues.put(SQLConstantes.MODULO8_P3_2_3,C8_P3_2_3);
        contentValues.put(SQLConstantes.MODULO8_P3_3_3,C8_P3_3_3);
        contentValues.put(SQLConstantes.MODULO8_P3_4_3,C8_P3_4_3);
        contentValues.put(SQLConstantes.MODULO8_P3_5_3,C8_P3_5_3);
        contentValues.put(SQLConstantes.MODULO8_P3_6_3,C8_P3_6_3);
        contentValues.put(SQLConstantes.MODULO8_P3_6_3_0,C8_P3_6_3_0);
        contentValues.put(SQLConstantes.MODULO8_P4_1_3,C8_P4_1_3);
        contentValues.put(SQLConstantes.MODULO8_P4_2_3,C8_P4_2_3);
        contentValues.put(SQLConstantes.MODULO8_P4_3_3,C8_P4_3_3);
        contentValues.put(SQLConstantes.MODULO8_P4_4_3,C8_P4_4_3);
        contentValues.put(SQLConstantes.MODULO8_P4_5_3,C8_P4_5_3);
        contentValues.put(SQLConstantes.MODULO8_P4_6_3,C8_P4_6_3);
        contentValues.put(SQLConstantes.MODULO8_P4_6_3_0,C8_P4_6_3_0);
        contentValues.put(SQLConstantes.MODULO8_P5_3,C8_P5_3);
        contentValues.put(SQLConstantes.MODULO8_P6_1_3,C8_P6_1_3);
        contentValues.put(SQLConstantes.MODULO8_P6_2_3,C8_P6_2_3);
        contentValues.put(SQLConstantes.MODULO8_P6_3_3,C8_P6_3_3);
        contentValues.put(SQLConstantes.MODULO8_P6_4_3,C8_P6_4_3);
        contentValues.put(SQLConstantes.MODULO8_P6_5_3,C8_P6_5_3);
        contentValues.put(SQLConstantes.MODULO8_P6_6_3,C8_P6_6_3);
        contentValues.put(SQLConstantes.MODULO8_P7_3,C8_P7_3);
        contentValues.put(SQLConstantes.MODULO8_P8_1_3,C8_P8_1_3);
        contentValues.put(SQLConstantes.MODULO8_P8_2_3,C8_P8_2_3);
        contentValues.put(SQLConstantes.MODULO8_P8_3_3,C8_P8_3_3);
        contentValues.put(SQLConstantes.MODULO8_P8_4_3,C8_P8_4_3);
        contentValues.put(SQLConstantes.MODULO8_P9_1_3,C8_P9_1_3);
        contentValues.put(SQLConstantes.MODULO8_P9_2_3,C8_P9_2_3);
        contentValues.put(SQLConstantes.MODULO8_P9_3_3,C8_P9_3_3);
        contentValues.put(SQLConstantes.MODULO8_P9_4_3,C8_P9_4_3);
        contentValues.put(SQLConstantes.MODULO8_P10_1_3,C8_P10_1_3);
        contentValues.put(SQLConstantes.MODULO8_P10_2_3,C8_P10_2_3);
        contentValues.put(SQLConstantes.MODULO8_P10_3_3,C8_P10_3_3);
        contentValues.put(SQLConstantes.MODULO8_P10_4_3,C8_P10_4_3);
        contentValues.put(SQLConstantes.MODULO8_P10_5_3,C8_P10_5_3);
        contentValues.put(SQLConstantes.MODULO8_P10_6_3,C8_P10_6_3);
        contentValues.put(SQLConstantes.MODULO8_P1_1_4,C8_P1_1_4);
        contentValues.put(SQLConstantes.MODULO8_P1_2_4,C8_P1_2_4);
        contentValues.put(SQLConstantes.MODULO8_P2_4,C8_P2_4);
        contentValues.put(SQLConstantes.MODULO8_P3_1_4,C8_P3_1_4);
        contentValues.put(SQLConstantes.MODULO8_P3_2_4,C8_P3_2_4);
        contentValues.put(SQLConstantes.MODULO8_P3_3_4,C8_P3_3_4);
        contentValues.put(SQLConstantes.MODULO8_P3_4_4,C8_P3_4_4);
        contentValues.put(SQLConstantes.MODULO8_P3_5_4,C8_P3_5_4);
        contentValues.put(SQLConstantes.MODULO8_P3_6_4,C8_P3_6_4);
        contentValues.put(SQLConstantes.MODULO8_P3_6_4_0,C8_P3_6_4_0);
        contentValues.put(SQLConstantes.MODULO8_P4_1_4,C8_P4_1_4);
        contentValues.put(SQLConstantes.MODULO8_P4_2_4,C8_P4_2_4);
        contentValues.put(SQLConstantes.MODULO8_P4_3_4,C8_P4_3_4);
        contentValues.put(SQLConstantes.MODULO8_P4_4_4,C8_P4_4_4);
        contentValues.put(SQLConstantes.MODULO8_P4_5_4,C8_P4_5_4);
        contentValues.put(SQLConstantes.MODULO8_P4_6_4,C8_P4_6_4);
        contentValues.put(SQLConstantes.MODULO8_P4_6_4_0,C8_P4_6_4_0);
        contentValues.put(SQLConstantes.MODULO8_P5_4,C8_P5_4);
        contentValues.put(SQLConstantes.MODULO8_P6_1_4,C8_P6_1_4);
        contentValues.put(SQLConstantes.MODULO8_P6_2_4,C8_P6_2_4);
        contentValues.put(SQLConstantes.MODULO8_P6_3_4,C8_P6_3_4);
        contentValues.put(SQLConstantes.MODULO8_P6_4_4,C8_P6_4_4);
        contentValues.put(SQLConstantes.MODULO8_P6_5_4,C8_P6_5_4);
        contentValues.put(SQLConstantes.MODULO8_P6_6_4,C8_P6_6_4);
        contentValues.put(SQLConstantes.MODULO8_P7_4,C8_P7_4);
        contentValues.put(SQLConstantes.MODULO8_P8_1_4,C8_P8_1_4);
        contentValues.put(SQLConstantes.MODULO8_P8_2_4,C8_P8_2_4);
        contentValues.put(SQLConstantes.MODULO8_P8_3_4,C8_P8_3_4);
        contentValues.put(SQLConstantes.MODULO8_P8_4_4,C8_P8_4_4);
        contentValues.put(SQLConstantes.MODULO8_P9_1_4,C8_P9_1_4);
        contentValues.put(SQLConstantes.MODULO8_P9_2_4,C8_P9_2_4);
        contentValues.put(SQLConstantes.MODULO8_P9_3_4,C8_P9_3_4);
        contentValues.put(SQLConstantes.MODULO8_P9_4_4,C8_P9_4_4);
        contentValues.put(SQLConstantes.MODULO8_P10_1_4,C8_P10_1_4);
        contentValues.put(SQLConstantes.MODULO8_P10_2_4,C8_P10_2_4);
        contentValues.put(SQLConstantes.MODULO8_P10_3_4,C8_P10_3_4);
        contentValues.put(SQLConstantes.MODULO8_P10_4_4,C8_P10_4_4);
        contentValues.put(SQLConstantes.MODULO8_P10_5_4,C8_P10_5_4);
        contentValues.put(SQLConstantes.MODULO8_P10_6_4,C8_P10_6_4);
        contentValues.put(SQLConstantes.MODULO8_P1_1_5,C8_P1_1_5);
        contentValues.put(SQLConstantes.MODULO8_P1_2_5,C8_P1_2_5);
        contentValues.put(SQLConstantes.MODULO8_P2_5,C8_P2_5);
        contentValues.put(SQLConstantes.MODULO8_P3_1_5,C8_P3_1_5);
        contentValues.put(SQLConstantes.MODULO8_P3_2_5,C8_P3_2_5);
        contentValues.put(SQLConstantes.MODULO8_P3_3_5,C8_P3_3_5);
        contentValues.put(SQLConstantes.MODULO8_P3_4_5,C8_P3_4_5);
        contentValues.put(SQLConstantes.MODULO8_P3_5_5,C8_P3_5_5);
        contentValues.put(SQLConstantes.MODULO8_P3_6_5,C8_P3_6_5);
        contentValues.put(SQLConstantes.MODULO8_P3_6_5_0,C8_P3_6_5_0);
        contentValues.put(SQLConstantes.MODULO8_P4_1_5,C8_P4_1_5);
        contentValues.put(SQLConstantes.MODULO8_P4_2_5,C8_P4_2_5);
        contentValues.put(SQLConstantes.MODULO8_P4_3_5,C8_P4_3_5);
        contentValues.put(SQLConstantes.MODULO8_P4_4_5,C8_P4_4_5);
        contentValues.put(SQLConstantes.MODULO8_P4_5_5,C8_P4_5_5);
        contentValues.put(SQLConstantes.MODULO8_P4_6_5,C8_P4_6_5);
        contentValues.put(SQLConstantes.MODULO8_P4_6_5_0,C8_P4_6_5_0);
        contentValues.put(SQLConstantes.MODULO8_P5_5,C8_P5_5);
        contentValues.put(SQLConstantes.MODULO8_P6_1_5,C8_P6_1_5);
        contentValues.put(SQLConstantes.MODULO8_P6_2_5,C8_P6_2_5);
        contentValues.put(SQLConstantes.MODULO8_P6_3_5,C8_P6_3_5);
        contentValues.put(SQLConstantes.MODULO8_P6_4_5,C8_P6_4_5);
        contentValues.put(SQLConstantes.MODULO8_P6_5_5,C8_P6_5_5);
        contentValues.put(SQLConstantes.MODULO8_P6_6_5,C8_P6_6_5);
        contentValues.put(SQLConstantes.MODULO8_P7_5,C8_P7_5);
        contentValues.put(SQLConstantes.MODULO8_P8_1_5,C8_P8_1_5);
        contentValues.put(SQLConstantes.MODULO8_P8_2_5,C8_P8_2_5);
        contentValues.put(SQLConstantes.MODULO8_P8_3_5,C8_P8_3_5);
        contentValues.put(SQLConstantes.MODULO8_P8_4_5,C8_P8_4_5);
        contentValues.put(SQLConstantes.MODULO8_P9_1_5,C8_P9_1_5);
        contentValues.put(SQLConstantes.MODULO8_P9_2_5,C8_P9_2_5);
        contentValues.put(SQLConstantes.MODULO8_P9_3_5,C8_P9_3_5);
        contentValues.put(SQLConstantes.MODULO8_P9_4_5,C8_P9_4_5);
        contentValues.put(SQLConstantes.MODULO8_P10_1_5,C8_P10_1_5);
        contentValues.put(SQLConstantes.MODULO8_P10_2_5,C8_P10_2_5);
        contentValues.put(SQLConstantes.MODULO8_P10_3_5,C8_P10_3_5);
        contentValues.put(SQLConstantes.MODULO8_P10_4_5,C8_P10_4_5);
        contentValues.put(SQLConstantes.MODULO8_P10_5_5,C8_P10_5_5);
        contentValues.put(SQLConstantes.MODULO8_P10_6_5,C8_P10_6_5);
        contentValues.put(SQLConstantes.MODULO8_P1_1_6,C8_P1_1_6);
        contentValues.put(SQLConstantes.MODULO8_P1_2_6,C8_P1_2_6);
        contentValues.put(SQLConstantes.MODULO8_P2_6,C8_P2_6);
        contentValues.put(SQLConstantes.MODULO8_P3_1_6,C8_P3_1_6);
        contentValues.put(SQLConstantes.MODULO8_P3_2_6,C8_P3_2_6);
        contentValues.put(SQLConstantes.MODULO8_P3_3_6,C8_P3_3_6);
        contentValues.put(SQLConstantes.MODULO8_P3_4_6,C8_P3_4_6);
        contentValues.put(SQLConstantes.MODULO8_P3_5_6,C8_P3_5_6);
        contentValues.put(SQLConstantes.MODULO8_P3_6_6,C8_P3_6_6);
        contentValues.put(SQLConstantes.MODULO8_P3_6_6_0,C8_P3_6_6_0);
        contentValues.put(SQLConstantes.MODULO8_P4_1_6,C8_P4_1_6);
        contentValues.put(SQLConstantes.MODULO8_P4_2_6,C8_P4_2_6);
        contentValues.put(SQLConstantes.MODULO8_P4_3_6,C8_P4_3_6);
        contentValues.put(SQLConstantes.MODULO8_P4_4_6,C8_P4_4_6);
        contentValues.put(SQLConstantes.MODULO8_P4_5_6,C8_P4_5_6);
        contentValues.put(SQLConstantes.MODULO8_P4_6_6,C8_P4_6_6);
        contentValues.put(SQLConstantes.MODULO8_P4_6_6_0,C8_P4_6_6_0);
        contentValues.put(SQLConstantes.MODULO8_P5_6,C8_P5_6);
        contentValues.put(SQLConstantes.MODULO8_P6_1_6,C8_P6_1_6);
        contentValues.put(SQLConstantes.MODULO8_P6_2_6,C8_P6_2_6);
        contentValues.put(SQLConstantes.MODULO8_P6_3_6,C8_P6_3_6);
        contentValues.put(SQLConstantes.MODULO8_P6_4_6,C8_P6_4_6);
        contentValues.put(SQLConstantes.MODULO8_P6_5_6,C8_P6_5_6);
        contentValues.put(SQLConstantes.MODULO8_P6_6_6,C8_P6_6_6);
        contentValues.put(SQLConstantes.MODULO8_P7_6,C8_P7_6);
        contentValues.put(SQLConstantes.MODULO8_P8_1_6,C8_P8_1_6);
        contentValues.put(SQLConstantes.MODULO8_P8_2_6,C8_P8_2_6);
        contentValues.put(SQLConstantes.MODULO8_P8_3_6,C8_P8_3_6);
        contentValues.put(SQLConstantes.MODULO8_P8_4_6,C8_P8_4_6);
        contentValues.put(SQLConstantes.MODULO8_P9_1_6,C8_P9_1_6);
        contentValues.put(SQLConstantes.MODULO8_P9_2_6,C8_P9_2_6);
        contentValues.put(SQLConstantes.MODULO8_P9_3_6,C8_P9_3_6);
        contentValues.put(SQLConstantes.MODULO8_P9_4_6,C8_P9_4_6);
        contentValues.put(SQLConstantes.MODULO8_P10_1_6,C8_P10_1_6);
        contentValues.put(SQLConstantes.MODULO8_P10_2_6,C8_P10_2_6);
        contentValues.put(SQLConstantes.MODULO8_P10_3_6,C8_P10_3_6);
        contentValues.put(SQLConstantes.MODULO8_P10_4_6,C8_P10_4_6);
        contentValues.put(SQLConstantes.MODULO8_P10_5_6,C8_P10_5_6);
        contentValues.put(SQLConstantes.MODULO8_P10_6_6,C8_P10_6_6);
        contentValues.put(SQLConstantes.MODULO8_OBS_MOD_VIII,OBS_MOD_VIII);
        contentValues.put(SQLConstantes.MODULO8_USUCREACION,USU_CREACION);
        contentValues.put(SQLConstantes.MODULO8_FECCREACION,FEC_CREACION);
        contentValues.put(SQLConstantes.MODULO8_USUREGISTRO,USU_REGISTRO);
        contentValues.put(SQLConstantes.MODULO8_FECREGISTRO,FEC_REGISTRO);

        return contentValues;
    }




















}
