package pe.gob.inei.encuestahabilidades.pojos;

import java.util.ArrayList;

/**
 * Created by otin016 on 25/07/2017.
 */

public class BaseDatos {

    //VISITA
    public static String V_FECHA1;
    public static String V_FECHA2;
    public static String V_FECHA3;
    public static String V_HORA_I1;
    public static String V_HORA_I2;
    public static String V_HORA_I3;
    public static String V_HORA_F1;
    public static String V_HORA_F2;
    public static String V_HORA_F3;
    public static String V_RESULTADO1;
    public static String V_RESULTADO2;
    public static String V_RESULTADO3;
    public static String V_FECHA_PROX1;
    public static String V_FECHA_PROX2;
    public static String V_FECHA_PROX3;
    public static String V_HORA_PROX1;
    public static String V_HORA_PROX2;
    public static String V_HORA_PROX3;
    public static String R_ENCUESTA;
    public static String R_FECHA;

    public static int C1_P1_1 = 0;
    public static int C1_P2_1 = 0;
    public static int C1_P3_1 = 0;
    public static int C1_P4_1 = 0;



    public static int C6_P3_1_1 = 0;
    public static int C6_P3_1_2 = 0;
    public static int C6_P3_1_3 = 0;
    public static int C6_P3_1_4 = 0;
    public static int C6_P3_1_5 = 0;
    public static int C6_P3_1_6 = 0;
    public static int C6_P3_1_7 = 0;
    public static int C6_P3_1_8 = 0;
    public static int C6_P3_1_9 = 0;
    public static int C6_P3_1_10 = 0;

    public static String informante;
    public static ArrayList<OcupacionMod5P9> ocupaciones_mod5_p9 = new ArrayList<OcupacionMod5P9>();
    public static ArrayList<ItemMod5P10P11> itemMod5P10s = new ArrayList<ItemMod5P10P11>();
    public static ArrayList<ItemMod5P10P11> itemMod5P11s = new ArrayList<ItemMod5P10P11>();
    public static ArrayList<ItemMod5P12P16P18> itemMod5P12s = new ArrayList<ItemMod5P12P16P18>();
    public static ArrayList<ItemMod5P13P20> itemMod5P13s = new ArrayList<ItemMod5P13P20>();
    public static ArrayList<ItemMod5P14P15> itemMod5P14s = new ArrayList<ItemMod5P14P15>();
    public static ArrayList<ItemMod5P14P15> itemMod5P15s = new ArrayList<ItemMod5P14P15>();
    public static ArrayList<ItemMod5P12P16P18> itemMod5P16s = new ArrayList<ItemMod5P12P16P18>();
    public static ArrayList<ItemMod5P17> itemMod5P17s = new ArrayList<ItemMod5P17>();
    public static ArrayList<ItemMod5P12P16P18> itemMod5P18s = new ArrayList<ItemMod5P12P16P18>();
    public static ArrayList<ItemMod5P19> itemMod5P19s = new ArrayList<ItemMod5P19>();
    public static ArrayList<ItemMod5P13P20> itemMod5P20s = new ArrayList<ItemMod5P13P20>();
    public static ArrayList<ItemMod5P21> itemMod5P21s = new ArrayList<ItemMod5P21>();
    public static ArrayList<ItemMod5P22> itemMod5P22s = new ArrayList<ItemMod5P22>();
    public static ArrayList<ItemMod5P23> itemMod5P23s = new ArrayList<ItemMod5P23>();
    public static ArrayList<ItemMod5P24> itemMod5P24s = new ArrayList<ItemMod5P24>();
    public static ArrayList<ItemMod5P25P26> itemMod5P25s = new ArrayList<ItemMod5P25P26>();
    public static ArrayList<ItemMod5P25P26> itemMod5P26s = new ArrayList<ItemMod5P25P26>();

    public static ArrayList<OcupacionMod5P9> getDataMod5P9(){
        return ocupaciones_mod5_p9;
    }
    public static ArrayList<ItemMod5P10P11> getDataMod5P10(){
        return itemMod5P10s;
    }
    public static ArrayList<ItemMod5P10P11> getDataMod5P11(){
        return itemMod5P11s;
    }
    public static ArrayList<ItemMod5P12P16P18> getDataMod5P12(){
        return itemMod5P12s;
    }
    public static ArrayList<ItemMod5P13P20> getDataMod5P13(){
        ArrayList<ItemMod5P13P20> array = new ArrayList<ItemMod5P13P20>();
        for(ItemMod5P13P20 itemMod5P13 : itemMod5P13s){
            if(itemMod5P13.getHabilitar() == 1) array.add(itemMod5P13);
        }
        return array;
    }
    public static ArrayList<ItemMod5P14P15> getDataMod5P14(){
        ArrayList<ItemMod5P14P15> array = new ArrayList<ItemMod5P14P15>();
        for(ItemMod5P14P15 itemMod5P14 : itemMod5P14s){
            if(itemMod5P14.getHabilitar() == 1) array.add(itemMod5P14);
        }
        return array;
    }
    public static ArrayList<ItemMod5P14P15> getDataMod5P15(){
        ArrayList<ItemMod5P14P15> array = new ArrayList<ItemMod5P14P15>();
        for(ItemMod5P14P15 itemMod5P15 : itemMod5P15s){
            if(itemMod5P15.getHabilitar() == 1) array.add(itemMod5P15);
        }
        return array;
    }
    public static ArrayList<ItemMod5P12P16P18> getDataMod5P16(){
        ArrayList<ItemMod5P12P16P18> array = new ArrayList<ItemMod5P12P16P18>();
        for(ItemMod5P12P16P18 itemMod5P16 : itemMod5P16s){
            if(itemMod5P16.getHabilitar() == 1) array.add(itemMod5P16);
        }
        return array;
    }
    public static ArrayList<ItemMod5P17> getDataMod5P17(){
        ArrayList<ItemMod5P17> array = new ArrayList<ItemMod5P17>();
        for(ItemMod5P17 itemMod5P17 : itemMod5P17s){
            if(itemMod5P17.getHabilitar() == 1) array.add(itemMod5P17);
        }
        return array;
    }
    public static ArrayList<ItemMod5P12P16P18> getDataMod5P18(){
        ArrayList<ItemMod5P12P16P18> array = new ArrayList<ItemMod5P12P16P18>();
        for(ItemMod5P12P16P18 itemMod5P18 : itemMod5P18s){
            if(itemMod5P18.getHabilitar() == 1) array.add(itemMod5P18);
        }
        return array;
    }
    public static ArrayList<ItemMod5P19> getDataMod5P19(){
        ArrayList<ItemMod5P19> array = new ArrayList<ItemMod5P19>();
        for(ItemMod5P19 itemMod5P19 : itemMod5P19s){
            if(itemMod5P19.getHabilitar() == 1) array.add(itemMod5P19);
        }
        return array;
    }
    public static ArrayList<ItemMod5P13P20> getDataMod5P20(){
        ArrayList<ItemMod5P13P20> array = new ArrayList<ItemMod5P13P20>();
        for(ItemMod5P13P20 itemMod5P20 : itemMod5P20s){
            if(itemMod5P20.getHabilitar() == 1) array.add(itemMod5P20);
        }
        return array;
    }

    public static ArrayList<ItemMod5P21> getDataMod5P21(){
        ArrayList<ItemMod5P21> array = new ArrayList<ItemMod5P21>();
        for(ItemMod5P21 itemMod5P21 : itemMod5P21s){
            if(itemMod5P21.getHabilitar() == 1) array.add(itemMod5P21);
        }
        return array;
    }
    public static ArrayList<ItemMod5P22> getDataMod5P22(){
        ArrayList<ItemMod5P22> array = new ArrayList<ItemMod5P22>();
        for(ItemMod5P22 itemMod5P22 : itemMod5P22s){
            if(itemMod5P22.getHabilitar() == 1) array.add(itemMod5P22);
        }
        return array;
    }
    public static ArrayList<ItemMod5P23> getDataMod5P23(){
        ArrayList<ItemMod5P23> array = new ArrayList<ItemMod5P23>();
        for(ItemMod5P23 itemMod5P23 : itemMod5P23s){
            if(itemMod5P23.getHabilitar() == 1) array.add(itemMod5P23);
        }
        return array;
    }
    public static ArrayList<ItemMod5P24> getDataMod5P24(){
        ArrayList<ItemMod5P24> array = new ArrayList<ItemMod5P24>();
        for(ItemMod5P24 itemMod5P24 : itemMod5P24s){
            if(itemMod5P24.getHabilitar() == 1) array.add(itemMod5P24);
        }
        return array;
    }
    public static ArrayList<ItemMod5P25P26> getDataMod5P25(){
        ArrayList<ItemMod5P25P26> array = new ArrayList<ItemMod5P25P26>();
        for(ItemMod5P25P26 itemMod5P25 : itemMod5P25s){
            if(itemMod5P25.getHabilitar() == 1) array.add(itemMod5P25);
        }
        return array;
    }
    public static ArrayList<ItemMod5P25P26> getDataMod5P26(){
        ArrayList<ItemMod5P25P26> array = new ArrayList<ItemMod5P25P26>();
        for(ItemMod5P25P26 itemMod5P26 : itemMod5P26s){
            if(itemMod5P26.getHabilitar() == 1) array.add(itemMod5P26);
        }
        return array;
    }

}
