package pe.gob.inei.encuestahabilidades.modelo;

/**
 * Created by user on 9/08/2017.
 */

public class SQLConstantes {
    //DB
    public static final String DB = "bdenhatrape.db";

    //TABLAS
    public static final String tableUsuarios = "usuarios";
    public static final String tableMarco = "marco";
    public static final String tableUbigeo = "ubigeo";
    public static final String tableCaratulas = "caratulas";
    public static final String tableDatosEntrevista = "datosEntrevista";
    public static final String tableVisitas = "visitas";
    public static final String tableIdentificaciones = "identificaciones";
    public static final String tableFragments = "fragments";
    public static final String tableModulo1 = "modulos1";
    public static final String tableModulo2 = "modulos2";
    public static final String tableModulo3 = "modulos3";
    public static final String tableModulo4 = "modulos4";
    public static final String tableModulo5 = "modulos5";
    public static final String tableModulo5Dinamica = "modulos5Dinamica";
    public static final String tableModulo6 = "modulos6";
    public static final String tableModulo7 = "modulos7";
    public static final String tableModulo8 = "modulos8";
    public static final String tableModulo9 = "modulos9";
    public static final String tableModulo10 = "modulos10";


    //COLUMNAS USUARIOS
    public static final String USUARIO_ID = "ID";
    public static final String USUARIO_PASSWORD = "PASSWORD";
    public static final String USUARIO_PERMISO = "PERMISO";

    //COLUMNAS UBIGEOS
    public static final String UBIGEO_ID = "ID";
    public static final String UBIGEO_ID_UBI = "ID_UBI";
    public static final String UBIGEO_DISTRITO = "DISTRITO";

    //COLUMNAS_MARCO
    public static final String MARCO_ID = "ID";
    public static final String MARCO_RUC = "RUC";
    public static final String MARCO_RAZON_SOCIAL = "RAZON_SOCIAL";
    public static final String MARCO_NOMBRE_COMERCIAL = "NOMBRE_COMERCIAL";
    public static final String MARCO_OPERADOR = "OPERADOR";
    public static final String MARCO_JEFE = "JEFE";
    public static final String MARCO_OBSERVADOR = "OBSERVADOR";
    public static final String MARCO_ANIO = "ANIO";
    public static final String MARCO_MES = "MES";
    public static final String MARCO_PERIODO = "PERIODO";
    public static final String MARCO_CCDD = "CCDD";
    public static final String MARCO_DEPARTAMENTO = "DEPARTAMENTO";
    public static final String MARCO_CCPP = "CCPP";
    public static final String MARCO_PROVINCIA = "PROVINCIA";
    public static final String MARCO_CCDI = "CCDI";
    public static final String MARCO_DISTRITO = "DISTRITO";
    public static final String MARCO_T_EMPRESA = "T_EMPRESA";
    public static final String MARCO_FRENTE = "FRENTE";
    public static final String MARCO_ZONA = "ZONA";
    public static final String MARCO_MANZANA = "MANZANA";
    public static final String MARCO_CAT_VIA = "CAT_VIA";
    public static final String MARCO_NOM_VIA = "NOM_VIA";
    public static final String MARCO_PUERTA = "PUERTA";
    public static final String MARCO_INTERIOR = "INTERIOR";
    public static final String MARCO_PISO = "PISO";
    public static final String MARCO_MZ = "MZ";
    public static final String MARCO_LOTE = "LOTE";

    //COLUMNAS_CARATULA
    public static final String CARATULA_ID = "ID";
    public static final String CARATULA_CAMBIO = "CAMBIO";
    public static final String CARATULA_DEPARTAMENTO = "NOMBREDD";
    public static final String CARATULA_DEPARTAMENTO_COD = "CCDD";
    public static final String CARATULA_PROVINCIA = "NOMBREPV";
    public static final String CARATULA_PROVINCIA_COD = "CCPP";
    public static final String CARATULA_DISTRITO = "NOMBREDI";
    public static final String CARATULA_DISTRITO_COD = "CCDI";
    public static final String CARATULA_GPSLATITUD = "GPSLATITUD";
    public static final String CARATULA_GPSALTITUD = "GPSALTITUD";
    public static final String CARATULA_GPSLONGITUD = "GPSLONGITUD";
    public static final String CARATULA_SECTOR = "CCST";
    public static final String CARATULA_AREA = "CCAT";
    public static final String CARATULA_ZONA = "ZON_NUM";
    public static final String CARATULA_MANZANA_MUESTRA = "MZ_ID";
    public static final String CARATULA_FRENTE = "FRENTE";
    public static final String CARATULA_TIPVIA = "TIPVIA";
    public static final String CARATULA_NOMVIA = "NOMVIA";
    public static final String CARATULA_NPUERTA = "NROPTA";
    public static final String CARATULA_BLOCK = "BLOCK";
    public static final String CARATULA_INTERIOR = "INT";
    public static final String CARATULA_PISO = "PISO";
    public static final String CARATULA_MANZANA_VIA = "MZA";
    public static final String CARATULA_LOTE = "LOTE";
    public static final String CARATULA_KM = "KM";
    public static final String CARATULA_REFERENCIA = "REF_DIREC";
    public static final String CARATULA_USUCREACION = "USU_CREACION";
    public static final String CARATULA_FECCREACION = "FEC_CREACION";
    public static final String CARATULA_USUREGISTRO = "USU_REGISTRO";
    public static final String CARATULA_FECREGISTRO = "FEC_REGISTRO";



    //COLUMNAS_VISITA
    public static final String VISITA_ID = "ID";
    public static final String VISITA_ID_EMPRESA = "ID_EMPRESA";
    public static final String VISITA_DNI_OPERADOR = "DNI_OPERADOR_E";
    public static final String VISITA_NOMBRE_OPERADOR = "V_OPERADOR_E";
    public static final String VISITA_DNI_JEFE = "DNI_JEFE_EQUIPO";
    public static final String VISITA_NOMBRE_JEFE = "V_JEFE_EQUIPO";
    public static final String VISITA_DNI_SUPERVISOR = "DNI_SUPERVISOR";
    public static final String VISITA_NOMBRE_SUPERVISOR = "V_SUPERVISOR";
    public static final String VISITA_N = "N_VISITA";
    public static final String VISITA_DIA = "V_DIA";
    public static final String VISITA_MES = "V_MES";
    public static final String VISITA_ANIO = "V_ANIO";
    public static final String VISITA_HORAI = "V_HORA_I";
    public static final String VISITA_MINUTOI = "V_MINUTO_I";
    public static final String VISITA_HORAF = "V_HORA_F";
    public static final String VISITA_MINUTOF = "V_MINUTO_F";
    public static final String VISITA_RESULTADO = "R_VISITA";
    public static final String VISITA_RESULTADO_ESP = "R_VISITA_ESP";
    public static final String VISITA_PROX_DIA = "V_PROX_FECHA_DIA";
    public static final String VISITA_PROX_MES = "V_PROX_FECHA_MES";
    public static final String VISITA_PROX_ANIO = "V_PROX_FECHA_ANIO";
    public static final String VISITA_PROX_HORA = "V_PROX_HORA";
    public static final String VISITA_PROX_MINUTO = "V_PROX_MIN";
    public static final String VISITA_USUCREACION = "USU_CREACION";
    public static final String VISITA_FECCREACION = "FEC_CREACION";
    public static final String VISITA_USUREGISTRO = "USU_REGISTRO";
    public static final String VISITA_FECREGISTRO = "FEC_REGISTRO";

    //COLUMNAS DATOS ENTREVISTA
    public static final String DATOS_ID = "ID";
    public static final String DATOS_DNI_OPERADOR = "DNI_OPERADOR";
    public static final String DATOS_DNI_JEFE = "DNI_JEFE";
    public static final String DATOS_DNI_SUPERVISOR = "DNI_SUPERVISOR";
    public static final String DATOS_NOMBRE_OPERADOR = "NOM_OPERADOR";
    public static final String DATOS_NOMBRE_JEFE = "NOM_JEFE";
    public static final String DATOS_NOMBRE_SUPERVISOR = "NOM_SUPERVISOR";
    public static final String DATOS_RESULTADO_FINAL = "R_ENCUESTA";
    public static final String DATOS_RESULTADO_FINAL_ESP = "R_ENCUESTA_ESP";
    public static final String DATOS_FECHA_FINAL_DIA = "R_FECHA_DIA";
    public static final String DATOS_FECHA_FINAL_MES = "R_FECHA_MES";
    public static final String DATOS_FECHA_FINAL_ANIO = "R_FECHA_ANIO";
    public static final String DATOS_ESTADO_ENVIO = "R_ESTADO_ENVIO";
    public static final String DATOS_USUCREACION = "USU_CREACION";
    public static final String DATOS_FECCREACION = "FEC_CREACION";
    public static final String DATOS_USUREGISTRO = "USU_REGISTRO";
    public static final String DATOS_FECREGISTRO = "FEC_REGISTRO";


    //COLUMNAS_IDENTIFICACION
    public static final String IDENTIFICACION_ID = "ID";
    public static final String IDENTIFICACION_RUC = "NUM_RUC";
    public static final String IDENTIFICACION_RAZON = "RAZON_SOCIAL";
    public static final String IDENTIFICACION_NOMBRE = "NOM_COMER_COOP";
    public static final String IDENTIFICACION_ANIO_FUNDACION = "ANIO_FUNDACION";
    public static final String IDENTIFICACION_WEB = "PAG_WEB";
    public static final String IDENTIFICACION_WEBNO = "PAG_WEB_NO";
    public static final String IDENTIFICACION_CORREO = "CORREO";
    public static final String IDENTIFICACION_CORREONO = "CORREO_NO";
    public static final String IDENTIFICACION_CODFIJO = "COD_FIJO";
    public static final String IDENTIFICACION_FIJO = "TEL_FIJO";
    public static final String IDENTIFICACION_FIJONO = "TEL_FIJO_NO";
    public static final String IDENTIFICACION_MOVIL = "TEL_MOVIL";
    public static final String IDENTIFICACION_MOVILNO = "TEL_MOVIL_NO";
    public static final String IDENTIFICACION_ANIO_FUNCIONAMIENTO = "ANIO_OPERACION";
    public static final String IDENTIFICACION_CONDUCTOR_NOMBRE = "NOM_INFORMANTE";
    public static final String IDENTIFICACION_CONDUCTOR_SEXO = "SEXO_INFORMANTE";
    public static final String IDENTIFICACION_CONDUCTOR_EDAD = "EDAD_INFORMANTE";
    public static final String IDENTIFICACION_CONDUCTOR_ESTUDIOS = "ACAD_INFORMANTE";
    public static final String IDENTIFICACION_CONDUCTOR_CARGO = "CARGO_INFORMANTE";
    public static final String IDENTIFICACION_CONDUCTOR_CARGO_ESP = "CARGO_INFORMANTE_ESP";
    public static final String IDENTIFICACION_USUCREACION = "USU_CREACION";
    public static final String IDENTIFICACION_FECCREACION = "FEC_CREACION";
    public static final String IDENTIFICACION_USUREGISTRO = "USU_REGISTRO";
    public static final String IDENTIFICACION_FECREGISTRO = "FEC_REGISTRO";

    //COLUMNAS FRAGMENTS

    public static final String FRAGMENT_ID = "ID";
    public static final String FRAGMENT_HABILITADO = "F_HAB";
    public static final String FRAGMENT_AVANCE = "F_AVA";

    //MODULO I
    public static final String MODULO1_ID = "ID";
    public static final String MODULO1_P0_0 = "C1_P0_0";
    public static final String MODULO1_P0_1 = "C1_P0_1";
    public static final String MODULO1_P0_2 = "C1_P0_2";
    public static final String MODULO1_P0_3 = "C1_P0_3";
    public static final String MODULO1_P1_1 = "C1_P1_1";
    public static final String MODULO1_P1_2 = "C1_P1_2";
    public static final String MODULO1_P1_2_DETALLE = "C1_P1_2_D";
    public static final String MODULO1_P2_1_1 = "C1_P2_1_1";
    public static final String MODULO1_P2_1_2 = "C1_P2_1_2";
    public static final String MODULO1_P2_1_2_DETALLE = "C1_P2_1_2_D";
    public static final String MODULO1_P2_1_NO = "C1_P2_1_NO";
    public static final String MODULO1_P2_2_1 = "C1_P2_2_1";
    public static final String MODULO1_P2_2_2 = "C1_P2_2_2";
    public static final String MODULO1_P2_2_2_DETALLE = "C1_P2_2_2_D";
    public static final String MODULO1_P2_2_NO = "C1_P2_2_NO";
    public static final String MODULO1_P3 = "C1_P3";
    public static final String MODULO1_P3_0 = "C1_P3_0";
    public static final String MODULO1_P4_1_1 = "C1_P4_1_1";
    public static final String MODULO1_P4_2_1 = "C1_P4_2_1";
    public static final String MODULO1_P5 = "C1_P5";
    public static final String MODULO1_P6_0 = "C1_P6_0";
    public static final String MODULO1_P6_1 = "C1_P6_1";
    public static final String MODULO1_P7_1_1 = "C1_P7_1_1";
    public static final String MODULO1_P7_2_1 = "C1_P7_2_1";
    public static final String MODULO1_P7_1_2 = "C1_P7_1_2";
    public static final String MODULO1_P7_2_2 = "C1_P7_2_2";
    public static final String MODULO1_P8 = "C1_P8";
    public static final String MODULO1_P9 = "C1_P9";
    public static final String MODULO1_P10 = "C1_P10";
    public static final String MODULO1_P11 = "C1_P11";
    public static final String MODULO1_P11_1 = "C1_P11_1";
    public static final String MODULO1_P11_2 = "C1_P11_2";
    public static final String MODULO1_P12_NO = "C1_P12_NO";
    public static final String MODULO1_P12_TIPVIA = "C1_P12_TIPVIA";
    public static final String MODULO1_P12_NOMVIA  = "C1_P12_NOMVIA";
    public static final String MODULO1_P12_NROPTA = "C1_P12_NROPTA";
    public static final String MODULO1_P12_BLOCK = "C1_P12_BLOCK";
    public static final String MODULO1_P12_INT = "C1_P12_INT";
    public static final String MODULO1_P12_PISO = "C1_P12_PISO";
    public static final String MODULO1_P12_MZA = "C1_P12_MZA";
    public static final String MODULO1_P12_LOTE = "C1_P12_LOTE";
    public static final String MODULO1_P12_KM = "C1_P12_KM";
    public static final String MODULO1_P12_DIST = "C1_P12_DIST";
    public static final String MODULO1_P12_CCDI = "C1_P12_CCDI";
    public static final String MODULO1_P12_PROV = "C1_P12_PROV";
    public static final String MODULO1_P12_CCPP = "C1_P12_CCPP";
    public static final String MODULO1_P12_DEP = "C1_P12_DEP";
    public static final String MODULO1_P12_CCDD = "C1_P12_CCDD";
    public static final String MODULO1_OBS_MOD_I = "OBS_MOD_I";
    public static final String MODULO1_USUCREACION = "USU_CREACION";
    public static final String MODULO1_FECCREACION = "FEC_CREACION";
    public static final String MODULO1_USUREGISTRO = "USU_REGISTRO";
    public static final String MODULO1_FECREGISTRO = "FEC_REGISTRO";

    //MODULO II
    public static final String MODULO2_ID = "ID";
    public static final String MODULO2_P0_0 = "C2_P0_0";
    public static final String MODULO2_P0_1 = "C2_P0_1";
    public static final String MODULO2_P0_2 = "C2_P0_2";
    public static final String MODULO2_P0_3 = "C2_P0_3";
    public static final String MODULO2_P1 = "C2_P1";
    public static final String MODULO2_P2 = "C2_P2";
    public static final String MODULO2_P3 = "C2_P3";
    public static final String MODULO2_P4 = "C2_P4";
    public static final String MODULO2_P5_0_1 = "C2_P5_0_1";
    public static final String MODULO2_P5_0_2 = "C2_P5_0_2";
    public static final String MODULO2_P5_0_3 = "C2_P5_0_3";
    public static final String MODULO2_P5_0_4 = "C2_P5_0_4";
    public static final String MODULO2_P5_0_5 = "C2_P5_0_5";
    public static final String MODULO2_P5_1_1 = "C2_P5_1_1";
    public static final String MODULO2_P5_1_2 = "C2_P5_1_2";
    public static final String MODULO2_P5_1_3 = "C2_P5_1_3";
    public static final String MODULO2_P5_1_4 = "C2_P5_1_4";
    public static final String MODULO2_P5_1_5 = "C2_P5_1_5";
    public static final String MODULO2_P5_1_6 = "C2_P5_1_6";
    public static final String MODULO2_P6 = "C2_P6";
    public static final String MODULO2_P7 = "C2_P7";
    public static final String MODULO2_P8_0_1 = "C2_P8_0_1";
    public static final String MODULO2_P8_0_2 = "C2_P8_0_2";
    public static final String MODULO2_P8_1_1 = "C2_P8_1_1";
    public static final String MODULO2_P8_1_2 = "C2_P8_1_2";
    public static final String MODULO2_P8_2_3 = "C2_P8_2_3";
    public static final String MODULO2_P9_0_1 = "C2_P9_0_1";
    public static final String MODULO2_P9_0_2 = "C2_P9_0_2";
    public static final String MODULO2_P9_0_3 = "C2_P9_0_3";
    public static final String MODULO2_P9_0_4 = "C2_P9_0_4";
    public static final String MODULO2_P9_0_5 = "C2_P9_0_5";
    public static final String MODULO2_P9_1_1 = "C2_P9_1_1";
    public static final String MODULO2_P9_1_2 = "C2_P9_1_2";
    public static final String MODULO2_P9_1_3 = "C2_P9_1_3";
    public static final String MODULO2_P9_1_4 = "C2_P9_1_4";
    public static final String MODULO2_P9_1_4_0 = "C2_P9_1_4_0";
    public static final String MODULO2_P9_1_5 = "C2_P9_1_5";
    public static final String MODULO2_P9_1_6 = "C2_P9_1_6";
    public static final String MODULO2_P10_1_1 = "C2_P10_1_1";
    public static final String MODULO2_P10_1_2 = "C2_P10_1_2";
    public static final String MODULO2_P10_1_3 = "C2_P10_1_3";
    public static final String MODULO2_P10_1_4 = "C2_P10_1_4";
    public static final String MODULO2_P10_1_5 = "C2_P10_1_5";
    public static final String MODULO2_P10_1_6 = "C2_P10_1_6";
    public static final String MODULO2_P10_1_6_0 = "C2_P10_1_6_0";
    public static final String MODULO2_P10_2_2 = "C2_P10_2_2";
    public static final String MODULO2_P10_2_3 = "C2_P10_2_3";
    public static final String MODULO2_P10_2_4 = "C2_P10_2_4";
    public static final String MODULO2_P10_2_5 = "C2_P10_2_5";
    public static final String MODULO2_P10_2_6 = "C2_P10_2_6";
    public static final String MODULO2_P11_1_1 = "C2_P11_1_1";
    public static final String MODULO2_P11_1_2 = "C2_P11_1_2";
    public static final String MODULO2_P11_1_3 = "C2_P11_1_3";
    public static final String MODULO2_P11_1_4 = "C2_P11_1_4";
    public static final String MODULO2_P11_1_5 = "C2_P11_1_5";
    public static final String MODULO2_P11_1_6 = "C2_P11_1_6";
    public static final String MODULO2_P11_1_7 = "C2_P11_1_7";
    public static final String MODULO2_P11_1_7_0 = "C2_P11_1_7_0";
    public static final String MODULO2_P11_2_2 = "C2_P11_2_2";
    public static final String MODULO2_P11_2_3 = "C2_P11_2_3";
    public static final String MODULO2_P11_2_4 = "C2_P11_2_4";
    public static final String MODULO2_P11_2_5 = "C2_P11_2_5";
    public static final String MODULO2_P11_2_6 = "C2_P11_2_6";
    public static final String MODULO2_P11_2_7 = "C2_P11_2_7";
    public static final String MODULO2_P12_1 = "C2_P12_1";
    public static final String MODULO2_P12_2 = "C2_P12_2";
    public static final String MODULO2_P12_3 = "C2_P12_3";
    public static final String MODULO2_P12_3_0 = "C2_P12_3_0";
    public static final String MODULO2_P13_1_1 = "C2_P13_1_1";
    public static final String MODULO2_P13_1_2 = "C2_P13_1_2";
    public static final String MODULO2_P13_1_3 = "C2_P13_1_3";
    public static final String MODULO2_P13_1_4 = "C2_P13_1_4";
    public static final String MODULO2_P13_1_5 = "C2_P13_1_5";
    public static final String MODULO2_P13_1_6 = "C2_P13_1_6";
    public static final String MODULO2_P13_1_7 = "C2_P13_1_7";
    public static final String MODULO2_P13_1_7_0 = "C2_P13_1_7_0";
    public static final String MODULO2_P13_2_2 = "C2_P13_2_2";
    public static final String MODULO2_P13_2_3 = "C2_P13_2_3";
    public static final String MODULO2_P13_2_4 = "C2_P13_2_4";
    public static final String MODULO2_P13_2_5 = "C2_P13_2_5";
    public static final String MODULO2_P13_2_6 = "C2_P13_2_6";
    public static final String MODULO2_P13_2_7 = "C2_P13_2_7";
    public static final String MODULO2_P14 = "C2_P14";
    public static final String MODULO2_P15_1 = "C2_P15_1";
    public static final String MODULO2_P15_2 = "C2_P15_2";
    public static final String MODULO2_P15_3 = "C2_P15_3";
    public static final String MODULO2_P15_4 = "C2_P15_4";
    public static final String MODULO2_P15_5 = "C2_P15_5";
    public static final String MODULO2_P15_6 = "C2_P15_6";
    public static final String MODULO2_P15_6_0 = "C2_P15_6_0";
    public static final String MODULO2_P16_1_1 = "C2_P16_1_1";
    public static final String MODULO2_P16_1_2 = "C2_P16_1_2";
    public static final String MODULO2_P16_1_3 = "C2_P16_1_3";
    public static final String MODULO2_P16_1_4 = "C2_P16_1_4";
    public static final String MODULO2_P16_1_5 = "C2_P16_1_5";
    public static final String MODULO2_P16_1_6 = "C2_P16_1_6";
    public static final String MODULO2_P16_1_6_0 = "C2_P16_1_6_0";
    public static final String MODULO2_P17 = "C2_P17";
    public static final String MODULO2_P18_1_1 = "C2_P18_1_1";
    public static final String MODULO2_P18_1_2 = "C2_P18_1_2";
    public static final String MODULO2_P18_1_3 = "C2_P18_1_3";
    public static final String MODULO2_P18_1_4 = "C2_P18_1_4";
    public static final String MODULO2_P18_1_5 = "C2_P18_1_5";
    public static final String MODULO2_P18_1_6 = "C2_P18_1_6";
    public static final String MODULO2_P18_1_7 = "C2_P18_1_7";
    public static final String MODULO2_P18_1_7_0 = "C2_P18_1_7_0";
    public static final String MODULO2_P18_2_1 = "C2_P18_2_1";
    public static final String MODULO2_P18_2_2 = "C2_P18_2_2";
    public static final String MODULO2_P18_2_3 = "C2_P18_2_3";
    public static final String MODULO2_P18_2_4 = "C2_P18_2_4";
    public static final String MODULO2_P18_2_5 = "C2_P18_2_5";
    public static final String MODULO2_P18_2_6 = "C2_P18_2_6";
    public static final String MODULO2_P18_2_7 = "C2_P18_2_7";
    public static final String MODULO2_P19_1_1 = "C2_P19_1_1";
    public static final String MODULO2_P19_1_2 = "C2_P19_1_2";
    public static final String MODULO2_P19_1_3 = "C2_P19_1_3";
    public static final String MODULO2_P19_1_4 = "C2_P19_1_4";
    public static final String MODULO2_P19_1_5 = "C2_P19_1_5";
    public static final String MODULO2_P19_1_5_0 = "C2_P19_1_5_0";
    public static final String MODULO2_P19_2_1 = "C2_P19_2_1";
    public static final String MODULO2_P19_2_2 = "C2_P19_2_2";
    public static final String MODULO2_P19_2_3 = "C2_P19_2_3";
    public static final String MODULO2_P19_2_4 = "C2_P19_2_4";
    public static final String MODULO2_P19_2_5 = "C2_P19_2_5";
    public static final String MODULO2_P20_1_1 = "C2_P20_1_1";
    public static final String MODULO2_P20_1_2 = "C2_P20_1_2";
    public static final String MODULO2_P20_1_3 = "C2_P20_1_3";
    public static final String MODULO2_P20_1_4 = "C2_P20_1_4";
    public static final String MODULO2_P20_1_5 = "C2_P20_1_5";
    public static final String MODULO2_P20_1_6 = "C2_P20_1_6";
    public static final String MODULO2_P20_1_7 = "C2_P20_1_7";
    public static final String MODULO2_P20_1_8 = "C2_P20_1_8";
    public static final String MODULO2_P20_1_8_0 = "C2_P20_1_8_0";
    public static final String MODULO2_P20_2_1 = "C2_P20_2_1";
    public static final String MODULO2_P20_2_2 = "C2_P20_2_2";
    public static final String MODULO2_P20_2_3 = "C2_P20_2_3";
    public static final String MODULO2_P20_2_4 = "C2_P20_2_4";
    public static final String MODULO2_P20_2_5 = "C2_P20_2_5";
    public static final String MODULO2_P20_2_6 = "C2_P20_2_6";
    public static final String MODULO2_P20_2_7 = "C2_P20_2_7";
    public static final String MODULO2_P20_2_8 = "C2_P20_2_8";
    public static final String MODULO2_P21 = "C2_P21";
    public static final String MODULO2_P22_1_1 = "C2_P22_1_1";
    public static final String MODULO2_P22_1_2 = "C2_P22_1_2";
    public static final String MODULO2_P22_1_3 = "C2_P22_1_3";
    public static final String MODULO2_P22_1_4 = "C2_P22_1_4";
    public static final String MODULO2_P22_1_5 = "C2_P22_1_5";
    public static final String MODULO2_P22_1_6 = "C2_P22_1_6";
    public static final String MODULO2_P22_1_6_0 = "C2_P22_1_6_0";
    public static final String MODULO2_P22_2_1 = "C2_P22_2_1";
    public static final String MODULO2_P22_2_2 = "C2_P22_2_2";
    public static final String MODULO2_P22_2_3 = "C2_P22_2_3";
    public static final String MODULO2_P22_2_4 = "C2_P22_2_4";
    public static final String MODULO2_P22_2_5 = "C2_P22_2_5";
    public static final String MODULO2_P22_2_6 = "C2_P22_2_6";
    public static final String MODULO2_P23 = "C2_P23";
    public static final String MODULO2_P24 = "C2_P24";
    public static final String MODULO2_P25 = "C2_P25";
    public static final String MODULO2_P25_T = "C2_P25_T";
    public static final String MODULO2_P25_H = "C2_P25_H";
    public static final String MODULO2_P25_M = "C2_P25_M";
    public static final String MODULO2_OBS_MOD_II = "OBS_MOD_II";
    public static final String MODULO2_USUCREACION = "USU_CREACION";
    public static final String MODULO2_FECCREACION = "FEC_CREACION";
    public static final String MODULO2_USUREGISTRO = "USU_REGISTRO";
    public static final String MODULO2_FECREGISTRO = "FEC_REGISTRO";

    //MODULO 3
    public static final String MODULO3_ID = "ID";
    public static final String MODULO3_P0_0 = "C3_P0_0";
    public static final String MODULO3_P0_1 = "C3_P0_1";
    public static final String MODULO3_P0_2 = "C3_P0_2";
    public static final String MODULO3_P0_3 = "C3_P0_3";
    public static final String MODULO3_P1 = "C3_P1";
    public static final String MODULO3_P2 = "C3_P2";
    public static final String MODULO3_P3 = "C3_P3";
    public static final String MODULO3_P4 = "C3_P4";
    public static final String MODULO3_P5 = "C3_P5";
    public static final String MODULO3_P5_1 = "C3_P5_1";
    public static final String MODULO3_P6 = "C3_P6";
    public static final String MODULO3_P7 = "C3_P7";
    public static final String MODULO3_P8 = "C3_P8";
    public static final String MODULO3_P9 = "C3_P9";
    public static final String MODULO3_P10 = "C3_P10";
    public static final String MODULO3_P11 = "C3_P11";
    public static final String MODULO3_P12 = "C3_P12";
    public static final String MODULO3_OBS_MOD_III = "OBS_MOD_III";
    public static final String MODULO3_USUCREACION = "USU_CREACION";
    public static final String MODULO3_FECCREACION = "FEC_CREACION";
    public static final String MODULO3_USUREGISTRO = "USU_REGISTRO";
    public static final String MODULO3_FECREGISTRO = "FEC_REGISTRO";

    //MODULO 4
    public static final String MODULO4_ID = "ID";
    public static final String MODULO4_P0_0 = "C4_P0_0";
    public static final String MODULO4_P0_1 = "C4_P0_1";
    public static final String MODULO4_P0_2 = "C4_P0_2";
    public static final String MODULO4_P0_3 = "C4_P0_3";
    public static final String MODULO4_P1 = "C4_P1";
    public static final String MODULO4_P2 = "C4_P2";
    public static final String MODULO4_P3 = "C4_P3";
    public static final String MODULO4_P4 = "C4_P4";
    public static final String MODULO4_P5 = "C4_P5";
    public static final String MODULO4_P6 = "C4_P6";
    public static final String MODULO4_P7 = "C4_P7";
    public static final String MODULO4_P8_1_1 = "C4_P8_1_1";
    public static final String MODULO4_P8_1_2 = "C4_P8_1_2";
    public static final String MODULO4_P8_1_3 = "C4_P8_1_3";
    public static final String MODULO4_P8_1_4 = "C4_P8_1_4";
    public static final String MODULO4_P8_1_5 = "C4_P8_1_5";
    public static final String MODULO4_P8_1_6 = "C4_P8_1_6";
    public static final String MODULO4_P8_1_7 = "C4_P8_1_7";
    public static final String MODULO4_P8_1_8 = "C4_P8_1_8";
    public static final String MODULO4_P8_1_9 = "C4_P8_1_9";
    public static final String MODULO4_P8_1_10 = "C4_P8_1_10";
    public static final String MODULO4_P8_1_11 = "C4_P8_1_11";
    public static final String MODULO4_P8_1_12 = "C4_P8_1_12";
    public static final String MODULO4_P8_1_13 = "C4_P8_1_13";
    public static final String MODULO4_P8_1_14 = "C4_P8_1_14";
    public static final String MODULO4_P8_1_15 = "C4_P8_1_15";
    public static final String MODULO4_P8_1_16 = "C4_P8_1_16";
    public static final String MODULO4_P8_1_17 = "C4_P8_1_17";
    public static final String MODULO4_P8_1_18 = "C4_P8_1_18";
    public static final String MODULO4_P8_1_17_0 = "C4_P8_1_17_0";
    public static final String MODULO4_P8_2_1 = "C4_P8_2_1";
    public static final String MODULO4_P8_2_2 = "C4_P8_2_2";
    public static final String MODULO4_P8_2_3 = "C4_P8_2_3";
    public static final String MODULO4_P8_2_4 = "C4_P8_2_4";
    public static final String MODULO4_P8_2_5 = "C4_P8_2_5";
    public static final String MODULO4_P8_2_6 = "C4_P8_2_6";
    public static final String MODULO4_P8_2_7 = "C4_P8_2_7";
    public static final String MODULO4_P8_2_8 = "C4_P8_2_8";
    public static final String MODULO4_P8_2_9 = "C4_P8_2_9";
    public static final String MODULO4_P8_2_10 = "C4_P8_2_10";
    public static final String MODULO4_P8_2_11 = "C4_P8_2_11";
    public static final String MODULO4_P8_2_12 = "C4_P8_2_12";
    public static final String MODULO4_P8_2_13 = "C4_P8_2_13";
    public static final String MODULO4_P8_2_14 = "C4_P8_2_14";
    public static final String MODULO4_P8_2_15 = "C4_P8_2_15";
    public static final String MODULO4_P8_2_16 = "C4_P8_2_16";
    public static final String MODULO4_P8_2_17 = "C4_P8_2_17";
    public static final String MODULO4_P9_1 = "C4_P9_1";
    public static final String MODULO4_P9_2 = "C4_P9_2";
    public static final String MODULO4_P9_3 = "C4_P9_3";
    public static final String MODULO4_P9_4 = "C4_P9_4";
    public static final String MODULO4_P10 = "C4_P10";
    public static final String MODULO4_OBS_MOD_IV = "OBS_MOD_IV";
    public static final String MODULO4_USUCREACION = "USU_CREACION";
    public static final String MODULO4_FECCREACION = "FEC_CREACION";
    public static final String MODULO4_USUREGISTRO = "USU_REGISTRO";
    public static final String MODULO4_FECREGISTRO = "FEC_REGISTRO";

    //MODULO 5
    public static final String MODULO5_ID = "ID";
    public static final String MODULO5_P0_0 = "C5_P0_0";
    public static final String MODULO5_P0_1 = "C5_P0_1";
    public static final String MODULO5_P0_2 = "C5_P0_2";
    public static final String MODULO5_P0_3 = "C5_P0_3";
    public static final String MODULO5_P1 = "C5_P1";
    public static final String MODULO5_P1_0_1 = "C5_P1_0_1";
    public static final String MODULO5_P1_0_2 = "C5_P1_0_2";
    public static final String MODULO5_P1_0_3 = "C5_P1_0_3";
    public static final String MODULO5_P1_0_4 = "C5_P1_0_4";
    public static final String MODULO5_P1_0_5 = "C5_P1_0_5";
    public static final String MODULO5_P1_0_6 = "C5_P1_0_6";
    public static final String MODULO5_P1_0_7 = "C5_P1_0_7";
    public static final String MODULO5_P1_0_8 = "C5_P1_0_8";
    public static final String MODULO5_P1_0_9 = "C5_P1_0_9";
    public static final String MODULO5_P1_1_1 = "C5_P1_1_1";
    public static final String MODULO5_P1_1_2 = "C5_P1_1_2";
    public static final String MODULO5_P1_1_3 = "C5_P1_1_3";
    public static final String MODULO5_P1_1_4 = "C5_P1_1_4";
    public static final String MODULO5_P1_1_5 = "C5_P1_1_5";
    public static final String MODULO5_P1_1_6 = "C5_P1_1_6";
    public static final String MODULO5_P1_1_7 = "C5_P1_1_7";
    public static final String MODULO5_P1_1_8 = "C5_P1_1_8";
    public static final String MODULO5_P1_1_9 = "C5_P1_1_9";
    public static final String MODULO5_P1_1_10 = "C5_P1_1_10";
    public static final String MODULO5_P1_2_1 = "C5_P1_2_1";
    public static final String MODULO5_P1_2_2 = "C5_P1_2_2";
    public static final String MODULO5_P1_2_3 = "C5_P1_2_3";
    public static final String MODULO5_P1_2_4 = "C5_P1_2_4";
    public static final String MODULO5_P1_2_5 = "C5_P1_2_5";
    public static final String MODULO5_P1_2_6 = "C5_P1_2_6";
    public static final String MODULO5_P1_2_7 = "C5_P1_2_7";
    public static final String MODULO5_P1_2_8 = "C5_P1_2_8";
    public static final String MODULO5_P1_2_9 = "C5_P1_2_9";
    public static final String MODULO5_P1_2_10 = "C5_P1_2_10";
    public static final String MODULO5_P2 = "C5_P2";
    public static final String MODULO5_P2_0_1 = "C5_P2_0_1";
    public static final String MODULO5_P2_0_2 = "C5_P2_0_2";
    public static final String MODULO5_P2_0_3 = "C5_P2_0_3";
    public static final String MODULO5_P2_0_4 = "C5_P2_0_4";
    public static final String MODULO5_P2_0_5 = "C5_P2_0_5";
    public static final String MODULO5_P2_0_6 = "C5_P2_0_6";
    public static final String MODULO5_P2_0_7 = "C5_P2_0_7";
    public static final String MODULO5_P2_0_8 = "C5_P2_0_8";
    public static final String MODULO5_P2_0_9 = "C5_P2_0_9";
    public static final String MODULO5_P2_1_1 = "C5_P2_1_1";
    public static final String MODULO5_P2_1_2 = "C5_P2_1_2";
    public static final String MODULO5_P2_1_3 = "C5_P2_1_3";
    public static final String MODULO5_P2_1_4 = "C5_P2_1_4";
    public static final String MODULO5_P2_1_5 = "C5_P2_1_5";
    public static final String MODULO5_P2_1_6 = "C5_P2_1_6";
    public static final String MODULO5_P2_1_7 = "C5_P2_1_7";
    public static final String MODULO5_P2_1_8 = "C5_P2_1_8";
    public static final String MODULO5_P2_1_9 = "C5_P2_1_9";
    public static final String MODULO5_P2_2_1 = "C5_P2_2_1";
    public static final String MODULO5_P2_2_2 = "C5_P2_2_2";
    public static final String MODULO5_P2_2_3 = "C5_P2_2_3";
    public static final String MODULO5_P2_2_4 = "C5_P2_2_4";
    public static final String MODULO5_P2_2_5 = "C5_P2_2_5";
    public static final String MODULO5_P2_2_6 = "C5_P2_2_6";
    public static final String MODULO5_P2_2_7 = "C5_P2_2_7";
    public static final String MODULO5_P2_2_8 = "C5_P2_2_8";
    public static final String MODULO5_P2_2_9 = "C5_P2_2_9";
    public static final String MODULO5_P2_2_10 = "C5_P2_2_10";
    public static final String MODULO5_P2_3_1 = "C5_P2_3_1";
    public static final String MODULO5_P2_3_2 = "C5_P2_3_2";
    public static final String MODULO5_P2_3_3 = "C5_P2_3_3";
    public static final String MODULO5_P2_3_4 = "C5_P2_3_4";
    public static final String MODULO5_P2_3_5 = "C5_P2_3_5";
    public static final String MODULO5_P2_3_6 = "C5_P2_3_6";
    public static final String MODULO5_P2_3_7 = "C5_P2_3_7";
    public static final String MODULO5_P2_3_8 = "C5_P2_3_8";
    public static final String MODULO5_P2_3_9 = "C5_P2_3_9";
    public static final String MODULO5_P2_3_10 = "C5_P2_3_10";
    public static final String MODULO5_P3_1_1 = "C5_P3_1_1";
    public static final String MODULO5_P3_1_2 = "C5_P3_1_2";
    public static final String MODULO5_P3_1_3 = "C5_P3_1_3";
    public static final String MODULO5_P3_1_4 = "C5_P3_1_4";
    public static final String MODULO5_P3_1_5 = "C5_P3_1_5";
    public static final String MODULO5_P3_1_6 = "C5_P3_1_6";
    public static final String MODULO5_P3_1_7 = "C5_P3_1_7";
    public static final String MODULO5_P3_1_8 = "C5_P3_1_8";
    public static final String MODULO5_P3_1_9 = "C5_P3_1_9";
    public static final String MODULO5_P3_1_10 = "C5_P3_1_10";
    public static final String MODULO5_P3_1_11 = "C5_P3_1_11";
    public static final String MODULO5_P3_1_12 = "C5_P3_1_12";
    public static final String MODULO5_P3_1_12_0 = "C5_P3_1_12_0";
    public static final String MODULO5_P3_2_1 = "C5_P3_2_1";
    public static final String MODULO5_P3_2_2 = "C5_P3_2_2";
    public static final String MODULO5_P3_2_3 = "C5_P3_2_3";
    public static final String MODULO5_P3_2_4 = "C5_P3_2_4";
    public static final String MODULO5_P3_2_5 = "C5_P3_2_5";
    public static final String MODULO5_P3_2_6 = "C5_P3_2_6";
    public static final String MODULO5_P3_2_7 = "C5_P3_2_7";
    public static final String MODULO5_P3_2_8 = "C5_P3_2_8";
    public static final String MODULO5_P3_2_9 = "C5_P3_2_9";
    public static final String MODULO5_P3_2_10 = "C5_P3_2_10";
    public static final String MODULO5_P3_2_11 = "C5_P3_2_11";
    public static final String MODULO5_P3_2_12 = "C5_P3_2_12";
    public static final String MODULO5_P4_1_1 = "C5_P4_1_1";
    public static final String MODULO5_P4_1_2 = "C5_P4_1_2";
    public static final String MODULO5_P4_1_3 = "C5_P4_1_3";
    public static final String MODULO5_P4_1_4 = "C5_P4_1_4";
    public static final String MODULO5_P4_1_5 = "C5_P4_1_5";
    public static final String MODULO5_P4_1_6 = "C5_P4_1_6";
    public static final String MODULO5_P4_1_7 = "C5_P4_1_7";
    public static final String MODULO5_P4_1_8 = "C5_P4_1_8";
    public static final String MODULO5_P4_2_1 = "C5_P4_2_1";
    public static final String MODULO5_P4_2_2 = "C5_P4_2_2";
    public static final String MODULO5_P4_2_3 = "C5_P4_2_3";
    public static final String MODULO5_P4_2_4 = "C5_P4_2_4";
    public static final String MODULO5_P4_2_5 = "C5_P4_2_5";
    public static final String MODULO5_P4_2_6 = "C5_P4_2_6";
    public static final String MODULO5_P4_2_7 = "C5_P4_2_7";
    public static final String MODULO5_P4_2_8 = "C5_P4_2_8";
    public static final String MODULO5_P5_1 = "C5_P5_1";
    public static final String MODULO5_P5_2 = "C5_P5_2";
    public static final String MODULO5_P5_3 = "C5_P5_3";
    public static final String MODULO5_P5_4 = "C5_P5_4";
    public static final String MODULO5_P5_5 = "C5_P5_5";
    public static final String MODULO5_P5_6 = "C5_P5_6";
    public static final String MODULO5_P6 = "C5_P6";
    public static final String MODULO5_P7_1 = "C5_P7_1";
    public static final String MODULO5_P7_2 = "C5_P7_2";
    public static final String MODULO5_P7_3 = "C5_P7_3";
    public static final String MODULO5_P7_4 = "C5_P7_4";
    public static final String MODULO5_P7_5 = "C5_P7_5";
    public static final String MODULO5_P7_5_0 = "C5_P7_5_0";
    public static final String MODULO5_P7_1_1 = "C5_P7_1_1";
    public static final String MODULO5_P7_2_1 = "C5_P7_2_1";
    public static final String MODULO5_P7_3_1 = "C5_P7_3_1";
    public static final String MODULO5_P7_4_1 = "C5_P7_4_1";
    public static final String MODULO5_P7_5_1 = "C5_P7_5_1";
    public static final String MODULO5_P7_6_1 = "C5_P7_6_1";
    public static final String MODULO5_P7_6_1_0 = "C5_P7_6_1_0";
    public static final String MODULO5_P7_7_1 = "C5_P7_7_1";
    public static final String MODULO5_P7_1_2 = "C5_P7_1_2";
    public static final String MODULO5_P7_2_2 = "C5_P7_2_2";
    public static final String MODULO5_P7_3_2 = "C5_P7_3_2";
    public static final String MODULO5_P7_4_2 = "C5_P7_4_2";
    public static final String MODULO5_P7_5_2 = "C5_P7_5_2";
    public static final String MODULO5_P7_6_2 = "C5_P7_6_2";
    public static final String MODULO5_P7_6_2_0 = "C5_P7_6_2_0";
    public static final String MODULO5_P7_7_2 = "C5_P7_7_2";
    public static final String MODULO5_P7_1_3 = "C5_P7_1_3";
    public static final String MODULO5_P7_2_3 = "C5_P7_2_3";
    public static final String MODULO5_P7_3_3 = "C5_P7_3_3";
    public static final String MODULO5_P7_4_3 = "C5_P7_4_3";
    public static final String MODULO5_P7_5_3 = "C5_P7_5_3";
    public static final String MODULO5_P7_6_3 = "C5_P7_6_3";
    public static final String MODULO5_P7_6_3_0 = "C5_P7_6_3_0";
    public static final String MODULO5_P7_7_3 = "C5_P7_7_3";
    public static final String MODULO5_P7_1_4 = "C5_P7_1_4";
    public static final String MODULO5_P7_2_4 = "C5_P7_2_4";
    public static final String MODULO5_P7_3_4 = "C5_P7_3_4";
    public static final String MODULO5_P7_4_4 = "C5_P7_4_4";
    public static final String MODULO5_P7_5_4 = "C5_P7_5_4";
    public static final String MODULO5_P7_6_4 = "C5_P7_6_4";
    public static final String MODULO5_P7_6_4_0 = "C5_P7_6_4_0";
    public static final String MODULO5_P7_7_4 = "C5_P7_7_4";
    public static final String MODULO5_P7_1_5 = "C5_P7_1_5";
    public static final String MODULO5_P7_2_5 = "C5_P7_2_5";
    public static final String MODULO5_P7_3_5 = "C5_P7_3_5";
    public static final String MODULO5_P7_4_5 = "C5_P7_4_5";
    public static final String MODULO5_P7_5_5 = "C5_P7_5_5";
    public static final String MODULO5_P7_6_5 = "C5_P7_6_5";
    public static final String MODULO5_P7_6_5_0 = "C5_P7_6_5_0";
    public static final String MODULO5_P7_7_5 = "C5_P7_7_5";
    public static final String MODULO5_P8 = "C5_P8";
    public static final String MODULO5_P27_1_1 = "C5_P27_1_1";
    public static final String MODULO5_P27_1_2 = "C5_P27_1_2";
    public static final String MODULO5_P27_1_3 = "C5_P27_1_3";
    public static final String MODULO5_P27_1_4 = "C5_P27_1_4";
    public static final String MODULO5_P27_1_5 = "C5_P27_1_5";
    public static final String MODULO5_P27_1_6 = "C5_P27_1_6";
    public static final String MODULO5_P27_1_7 = "C5_P27_1_7";
    public static final String MODULO5_P27_1_8 = "C5_P27_1_8";
    public static final String MODULO5_P27_1_9 = "C5_P27_1_9";
    public static final String MODULO5_P27_2_1 = "C5_P27_2_1";
    public static final String MODULO5_P27_2_2 = "C5_P27_2_2";
    public static final String MODULO5_P27_2_3 = "C5_P27_2_3";
    public static final String MODULO5_P27_2_4 = "C5_P27_2_4";
    public static final String MODULO5_P27_2_5 = "C5_P27_2_5";
    public static final String MODULO5_P27_2_6 = "C5_P27_2_6";
    public static final String MODULO5_P27_2_7 = "C5_P27_2_7";
    public static final String MODULO5_P27_2_8 = "C5_P27_2_8";
    public static final String MODULO5_P27_2_9 = "C5_P27_2_9";
    public static final String MODULO5_OBS_MOD_V = "OBS_MOD_V";
    public static final String MODULO5_USUCREACION = "USU_CREACION";
    public static final String MODULO5_FECCREACION = "FEC_CREACION";
    public static final String MODULO5_USUREGISTRO = "USU_REGISTRO";
    public static final String MODULO5_FECREGISTRO = "FEC_REGISTRO";

    //MODULO 5 (2DAPARTE)

    public static final String MODULO5_IDOCUPACION = "ID";
    public static final String MODULO5_IDEMPRESA = "IDEMPRESA";
    public static final String MODULO5_P9_1_0 = "C5_P9_1_0";
    public static final String MODULO5_P9_1_1 = "C5_P9_1_1";
    public static final String MODULO5_P9_2_1 = "C5_P9_2_1";
    public static final String MODULO5_P9_3_1 = "C5_P9_3_1";
    public static final String MODULO5_P10_1_1 = "C5_P10_1_1";
    public static final String MODULO5_P10_2_1 = "C5_P10_2_1";
    public static final String MODULO5_P11_1_1 = "C5_P11_1_1";
    public static final String MODULO5_P11_2_1 = "C5_P11_2_1";
    public static final String MODULO5_P12 = "C5_P12";
    public static final String MODULO5_P13 = "C5_P13";
    public static final String MODULO5_P14 = "C5_P14";
    public static final String MODULO5_P15 = "C5_P15";
    public static final String MODULO5_P16 = "C5_P16";
    public static final String MODULO5_P17_0 = "C5_P17_0";
    public static final String MODULO5_P17_1 = "C5_P17_1";
    public static final String MODULO5_P17_2 = "C5_P17_2";
    public static final String MODULO5_P17_3 = "C5_P17_3";
    public static final String MODULO5_P17_4 = "C5_P17_4";
    public static final String MODULO5_P17_5 = "C5_P17_5";
    public static final String MODULO5_P17_6 = "C5_P17_6";
    public static final String MODULO5_P17_7 = "C5_P17_7";
    public static final String MODULO5_P17_8 = "C5_P17_8";
    public static final String MODULO5_P17_9 = "C5_P17_9";
    public static final String MODULO5_P17_10 = "C5_P17_10";
    public static final String MODULO5_P17_11 = "C5_P17_11";
    public static final String MODULO5_P17_12 = "C5_P17_12";
    public static final String MODULO5_P17_13 = "C5_P17_13";
    public static final String MODULO5_P17_14 = "C5_P17_14";
    public static final String MODULO5_P17_15 = "C5_P17_15";
    public static final String MODULO5_P17_16 = "C5_P17_16";
    public static final String MODULO5_P17_17 = "C5_P17_17";
    public static final String MODULO5_P17_18 = "C5_P17_18";
    public static final String MODULO5_P17_19 = "C5_P17_19";
    public static final String MODULO5_P17_20 = "C5_P17_20";
    public static final String MODULO5_P17_19_0 = "C5_P17_19_0";
    public static final String MODULO5_P18 = "C5_P18";
    public static final String MODULO5_P19 = "C5_P19";
    public static final String MODULO5_P20 = "C5_P20";
    public static final String MODULO5_P21_1 = "C5_P21_1";
    public static final String MODULO5_P21_0 = "C5_P21_0";
    public static final String MODULO5_P21_2 = "C5_P21_2";
    public static final String MODULO5_P21_3 = "C5_P21_3";
    public static final String MODULO5_P21_4 = "C5_P21_4";
    public static final String MODULO5_P21_5 = "C5_P21_5";
    public static final String MODULO5_P21_6 = "C5_P21_6";
    public static final String MODULO5_P21_7 = "C5_P21_7";
    public static final String MODULO5_P21_7_0 = "C5_P21_7_0";
    public static final String MODULO5_P22_1_1 = "C5_P22_1_1";
    public static final String MODULO5_P22_2_1 = "C5_P22_2_1";
    public static final String MODULO5_P23_0 = "C5_P23_0";
    public static final String MODULO5_P23_1 = "C5_P23_1";
    public static final String MODULO5_P23_2 = "C5_P23_2";
    public static final String MODULO5_P23_3 = "C5_P23_3";
    public static final String MODULO5_P23_4 = "C5_P23_4";
    public static final String MODULO5_P23_5 = "C5_P23_5";
    public static final String MODULO5_P23_6 = "C5_P23_6";
    public static final String MODULO5_P23_7 = "C5_P23_7";
    public static final String MODULO5_P23_8 = "C5_P23_8";
    public static final String MODULO5_P23_9 = "C5_P23_9";
    public static final String MODULO5_P23_9_0 = "C5_P23_9_0";
    public static final String MODULO5_P24_0 = "C5_P24_0";
    public static final String MODULO5_P24_1 = "C5_P24_1";
    public static final String MODULO5_P24_2 = "C5_P24_2";
    public static final String MODULO5_P24_3 = "C5_P24_3";
    public static final String MODULO5_P24_4 = "C5_P24_4";
    public static final String MODULO5_P24_5 = "C5_P24_5";
    public static final String MODULO5_P24_6 = "C5_P24_6";
    public static final String MODULO5_P24_7 = "C5_P24_7";
    public static final String MODULO5_P24_8 = "C5_P24_8";
    public static final String MODULO5_P24_9 = "C5_P24_9";
    public static final String MODULO5_P24_10 = "C5_P24_10";
    public static final String MODULO5_P25 = "C5_P25";
    public static final String MODULO5_P26 = "C5_P26";
    public static final String MODULO5_2_USUCREACION = "USU_CREACION";
    public static final String MODULO5_2_FECCREACION = "FEC_CREACION";
    public static final String MODULO5_2_USUREGISTRO = "USU_REGISTRO";
    public static final String MODULO5_2_FECREGISTRO = "FEC_REGISTRO";

    //MODULO 6
    public static final String MODULO6_ID = "ID";
    public static final String MODULO6_P0_0 = "C6_P0_0";
    public static final String MODULO6_P0_1 = "C6_P0_1";
    public static final String MODULO6_P0_2 = "C6_P0_2";
    public static final String MODULO6_P0_3 = "C6_P0_3";
    public static final String MODULO6_P1 = "C6_P1";
    public static final String MODULO6_P2 = "C6_P2";
    public static final String MODULO6_P2_1 = "C6_P2_1";
    public static final String MODULO6_P2_2 = "C6_P2_2";
    public static final String MODULO6_P3 = "C6_P3";
    public static final String MODULO6_P3_1_1 = "C6_P3_1_1";
    public static final String MODULO6_P3_1_2 = "C6_P3_1_2";
    public static final String MODULO6_P3_1_3 = "C6_P3_1_3";
    public static final String MODULO6_P3_1_4 = "C6_P3_1_4";
    public static final String MODULO6_P3_1_5 = "C6_P3_1_5";
    public static final String MODULO6_P3_1_6 = "C6_P3_1_6";
    public static final String MODULO6_P3_1_7 = "C6_P3_1_7";
    public static final String MODULO6_P3_1_8 = "C6_P3_1_8";
    public static final String MODULO6_P3_1_9 = "C6_P3_1_9";
    public static final String MODULO6_P3_1_10 = "C6_P3_1_10";
    public static final String MODULO6_P3_2_1 = "C6_P3_2_1";
    public static final String MODULO6_P3_2_2 = "C6_P3_2_2";
    public static final String MODULO6_P3_2_3 = "C6_P3_2_3";
    public static final String MODULO6_P3_2_4 = "C6_P3_2_4";
    public static final String MODULO6_P3_2_5 = "C6_P3_2_5";
    public static final String MODULO6_P3_2_6 = "C6_P3_2_6";
    public static final String MODULO6_P3_2_7 = "C6_P3_2_7";
    public static final String MODULO6_P3_2_8 = "C6_P3_2_8";
    public static final String MODULO6_P3_2_9 = "C6_P3_2_9";
    public static final String MODULO6_P3_2_10 = "C6_P3_2_10";
    public static final String MODULO6_P4_1_1 = "C6_P4_1_1";
    public static final String MODULO6_P4_1_2 = "C6_P4_1_2";
    public static final String MODULO6_P4_1_3 = "C6_P4_1_3";
    public static final String MODULO6_P4_1_4 = "C6_P4_1_4";
    public static final String MODULO6_P4_1_5 = "C6_P4_1_5";
    public static final String MODULO6_P4_1_6 = "C6_P4_1_6";
    public static final String MODULO6_P4_1_6_0 = "C6_P4_1_6_0";
    public static final String MODULO6_P4_2_1 = "C6_P4_2_1";
    public static final String MODULO6_P4_2_2 = "C6_P4_2_2";
    public static final String MODULO6_P4_2_3 = "C6_P4_2_3";
    public static final String MODULO6_P4_2_4 = "C6_P4_2_4";
    public static final String MODULO6_P4_2_5 = "C6_P4_2_5";
    public static final String MODULO6_P4_2_6 = "C6_P4_2_6";
    public static final String MODULO6_P4_2_6_0 = "C6_P4_2_6_0";
    public static final String MODULO6_P4_3_1 = "C6_P4_3_1";
    public static final String MODULO6_P4_3_2 = "C6_P4_3_2";
    public static final String MODULO6_P4_3_3 = "C6_P4_3_3";
    public static final String MODULO6_P4_3_4 = "C6_P4_3_4";
    public static final String MODULO6_P4_3_5 = "C6_P4_3_5";
    public static final String MODULO6_P4_3_6 = "C6_P4_3_6";
    public static final String MODULO6_P4_3_6_0 = "C6_P4_3_6_0";
    public static final String MODULO6_P4_4_1 = "C6_P4_4_1";
    public static final String MODULO6_P4_4_2 = "C6_P4_4_2";
    public static final String MODULO6_P4_4_3 = "C6_P4_4_3";
    public static final String MODULO6_P4_4_4 = "C6_P4_4_4";
    public static final String MODULO6_P4_4_5 = "C6_P4_4_5";
    public static final String MODULO6_P4_4_6 = "C6_P4_4_6";
    public static final String MODULO6_P4_4_6_0 = "C6_P4_4_6_0";
    public static final String MODULO6_P4_5_1 = "C6_P4_5_1";
    public static final String MODULO6_P4_5_2 = "C6_P4_5_2";
    public static final String MODULO6_P4_5_3 = "C6_P4_5_3";
    public static final String MODULO6_P4_5_4 = "C6_P4_5_4";
    public static final String MODULO6_P4_5_5 = "C6_P4_5_5";
    public static final String MODULO6_P4_5_6 = "C6_P4_5_6";
    public static final String MODULO6_P4_5_6_0 = "C6_P4_5_6_0";
    public static final String MODULO6_P4_6_1 = "C6_P4_6_1";
    public static final String MODULO6_P4_6_2 = "C6_P4_6_2";
    public static final String MODULO6_P4_6_3 = "C6_P4_6_3";
    public static final String MODULO6_P4_6_4 = "C6_P4_6_4";
    public static final String MODULO6_P4_6_5 = "C6_P4_6_5";
    public static final String MODULO6_P4_6_6 = "C6_P4_6_6";
    public static final String MODULO6_P4_6_6_0 = "C6_P4_6_6_0";
    public static final String MODULO6_P4_7_1 = "C6_P4_7_1";
    public static final String MODULO6_P4_7_2 = "C6_P4_7_2";
    public static final String MODULO6_P4_7_3 = "C6_P4_7_3";
    public static final String MODULO6_P4_7_4 = "C6_P4_7_4";
    public static final String MODULO6_P4_7_5 = "C6_P4_7_5";
    public static final String MODULO6_P4_7_6 = "C6_P4_7_6";
    public static final String MODULO6_P4_7_6_0 = "C6_P4_7_6_0";
    public static final String MODULO6_P4_8_1 = "C6_P4_8_1";
    public static final String MODULO6_P4_8_2 = "C6_P4_8_2";
    public static final String MODULO6_P4_8_3 = "C6_P4_8_3";
    public static final String MODULO6_P4_8_4 = "C6_P4_8_4";
    public static final String MODULO6_P4_8_5 = "C6_P4_8_5";
    public static final String MODULO6_P4_8_6 = "C6_P4_8_6";
    public static final String MODULO6_P4_8_6_0 = "C6_P4_8_6_0";
    public static final String MODULO6_P4_9_1 = "C6_P4_9_1";
    public static final String MODULO6_P4_9_2 = "C6_P4_9_2";
    public static final String MODULO6_P4_9_3 = "C6_P4_9_3";
    public static final String MODULO6_P4_9_4 = "C6_P4_9_4";
    public static final String MODULO6_P4_9_5 = "C6_P4_9_5";
    public static final String MODULO6_P4_9_6 = "C6_P4_9_6";
    public static final String MODULO6_P4_9_6_0 = "C6_P4_9_6_0";
    public static final String MODULO6_P5_1_1 = "C6_P5_1_1";
    public static final String MODULO6_P5_1_2 = "C6_P5_1_2";
    public static final String MODULO6_P5_1_3 = "C6_P5_1_3";
    public static final String MODULO6_P5_1_4 = "C6_P5_1_4";
    public static final String MODULO6_P5_1_5 = "C6_P5_1_5";
    public static final String MODULO6_P5_1_6 = "C6_P5_1_6";
    public static final String MODULO6_P5_1_7 = "C6_P5_1_7";
    public static final String MODULO6_P5_1_8 = "C6_P5_1_8";
    public static final String MODULO6_P5_1_9 = "C6_P5_1_9";
    public static final String MODULO6_P5_1_10 = "C6_P5_1_10";
    public static final String MODULO6_P5_1_11 = "C6_P5_1_11";
    public static final String MODULO6_P5_1_12 = "C6_P5_1_12";
    public static final String MODULO6_P5_1_13 = "C6_P5_1_13";
    public static final String MODULO6_P5_1_14 = "C6_P5_1_14";
    public static final String MODULO6_P5_1_15 = "C6_P5_1_15";
    public static final String MODULO6_P5_1_16 = "C6_P5_1_16";
    public static final String MODULO6_P5_1_17 = "C6_P5_1_17";
    public static final String MODULO6_P5_1_18 = "C6_P5_1_18";
    public static final String MODULO6_P5_1_19 = "C6_P5_1_19";
    public static final String MODULO6_P5_1_19_0 = "C6_P5_1_19_0";
    public static final String MODULO6_P5_1_20 = "C6_P5_1_20";
    public static final String MODULO6_P5_2_1 = "C6_P5_2_1";
    public static final String MODULO6_P5_2_2 = "C6_P5_2_2";
    public static final String MODULO6_P5_2_3 = "C6_P5_2_3";
    public static final String MODULO6_P5_2_4 = "C6_P5_2_4";
    public static final String MODULO6_P5_2_5 = "C6_P5_2_5";
    public static final String MODULO6_P5_2_6 = "C6_P5_2_6";
    public static final String MODULO6_P5_2_7 = "C6_P5_2_7";
    public static final String MODULO6_P5_2_8 = "C6_P5_2_8";
    public static final String MODULO6_P5_2_9 = "C6_P5_2_9";
    public static final String MODULO6_P5_2_10 = "C6_P5_2_10";
    public static final String MODULO6_P5_2_11 = "C6_P5_2_11";
    public static final String MODULO6_P5_2_12 = "C6_P5_2_12";
    public static final String MODULO6_P5_2_13 = "C6_P5_2_13";
    public static final String MODULO6_P5_2_14 = "C6_P5_2_14";
    public static final String MODULO6_P5_2_15 = "C6_P5_2_15";
    public static final String MODULO6_P5_2_16 = "C6_P5_2_16";
    public static final String MODULO6_P5_2_17 = "C6_P5_2_17";
    public static final String MODULO6_P5_2_18 = "C6_P5_2_18";
    public static final String MODULO6_P5_2_19 = "C6_P5_2_19";
    public static final String MODULO6_P5_2_19_0 = "C6_P5_2_19_0";
    public static final String MODULO6_P5_2_20 = "C6_P5_2_20";
    public static final String MODULO6_P5_3_1 = "C6_P5_3_1";
    public static final String MODULO6_P5_3_2 = "C6_P5_3_2";
    public static final String MODULO6_P5_3_3 = "C6_P5_3_3";
    public static final String MODULO6_P5_3_4 = "C6_P5_3_4";
    public static final String MODULO6_P5_3_5 = "C6_P5_3_5";
    public static final String MODULO6_P5_3_6 = "C6_P5_3_6";
    public static final String MODULO6_P5_3_7 = "C6_P5_3_7";
    public static final String MODULO6_P5_3_8 = "C6_P5_3_8";
    public static final String MODULO6_P5_3_9 = "C6_P5_3_9";
    public static final String MODULO6_P5_3_10 = "C6_P5_3_10";
    public static final String MODULO6_P5_3_11 = "C6_P5_3_11";
    public static final String MODULO6_P5_3_12 = "C6_P5_3_12";
    public static final String MODULO6_P5_3_13 = "C6_P5_3_13";
    public static final String MODULO6_P5_3_14 = "C6_P5_3_14";
    public static final String MODULO6_P5_3_15 = "C6_P5_3_15";
    public static final String MODULO6_P5_3_16 = "C6_P5_3_16";
    public static final String MODULO6_P5_3_17 = "C6_P5_3_17";
    public static final String MODULO6_P5_3_18 = "C6_P5_3_18";
    public static final String MODULO6_P5_3_19 = "C6_P5_3_19";
    public static final String MODULO6_P5_3_19_0 = "C6_P5_3_19_0";
    public static final String MODULO6_P5_3_20 = "C6_P5_3_20";
    public static final String MODULO6_P5_4_1 = "C6_P5_4_1";
    public static final String MODULO6_P5_4_2 = "C6_P5_4_2";
    public static final String MODULO6_P5_4_3 = "C6_P5_4_3";
    public static final String MODULO6_P5_4_4 = "C6_P5_4_4";
    public static final String MODULO6_P5_4_5 = "C6_P5_4_5";
    public static final String MODULO6_P5_4_6 = "C6_P5_4_6";
    public static final String MODULO6_P5_4_7 = "C6_P5_4_7";
    public static final String MODULO6_P5_4_8 = "C6_P5_4_8";
    public static final String MODULO6_P5_4_9 = "C6_P5_4_9";
    public static final String MODULO6_P5_4_10 = "C6_P5_4_10";
    public static final String MODULO6_P5_4_11 = "C6_P5_4_11";
    public static final String MODULO6_P5_4_12 = "C6_P5_4_12";
    public static final String MODULO6_P5_4_13 = "C6_P5_4_13";
    public static final String MODULO6_P5_4_14 = "C6_P5_4_14";
    public static final String MODULO6_P5_4_15 = "C6_P5_4_15";
    public static final String MODULO6_P5_4_16 = "C6_P5_4_16";
    public static final String MODULO6_P5_4_17 = "C6_P5_4_17";
    public static final String MODULO6_P5_4_18 = "C6_P5_4_18";
    public static final String MODULO6_P5_4_19 = "C6_P5_4_19";
    public static final String MODULO6_P5_4_19_0 = "C6_P5_4_19_0";
    public static final String MODULO6_P5_4_20 = "C6_P5_4_20";
    public static final String MODULO6_P5_5_1 = "C6_P5_5_1";
    public static final String MODULO6_P5_5_2 = "C6_P5_5_2";
    public static final String MODULO6_P5_5_3 = "C6_P5_5_3";
    public static final String MODULO6_P5_5_4 = "C6_P5_5_4";
    public static final String MODULO6_P5_5_5 = "C6_P5_5_5";
    public static final String MODULO6_P5_5_6 = "C6_P5_5_6";
    public static final String MODULO6_P5_5_7 = "C6_P5_5_7";
    public static final String MODULO6_P5_5_8 = "C6_P5_5_8";
    public static final String MODULO6_P5_5_9 = "C6_P5_5_9";
    public static final String MODULO6_P5_5_10 = "C6_P5_5_10";
    public static final String MODULO6_P5_5_11 = "C6_P5_5_11";
    public static final String MODULO6_P5_5_12 = "C6_P5_5_12";
    public static final String MODULO6_P5_5_13 = "C6_P5_5_13";
    public static final String MODULO6_P5_5_14 = "C6_P5_5_14";
    public static final String MODULO6_P5_5_15 = "C6_P5_5_15";
    public static final String MODULO6_P5_5_16 = "C6_P5_5_16";
    public static final String MODULO6_P5_5_17 = "C6_P5_5_17";
    public static final String MODULO6_P5_5_18 = "C6_P5_5_18";
    public static final String MODULO6_P5_5_19 = "C6_P5_5_19";
    public static final String MODULO6_P5_5_19_0 = "C6_P5_5_19_0";
    public static final String MODULO6_P5_6_1 = "C6_P5_6_1";
    public static final String MODULO6_P5_6_2 = "C6_P5_6_2";
    public static final String MODULO6_P5_6_20 = "C6_P5_6_20";
    public static final String MODULO6_P5_6_3 = "C6_P5_6_3";
    public static final String MODULO6_P5_6_4 = "C6_P5_6_4";
    public static final String MODULO6_P5_6_5 = "C6_P5_6_5";
    public static final String MODULO6_P5_6_6 = "C6_P5_6_6";
    public static final String MODULO6_P5_6_7 = "C6_P5_6_7";
    public static final String MODULO6_P5_6_8 = "C6_P5_6_8";
    public static final String MODULO6_P5_6_9 = "C6_P5_6_9";
    public static final String MODULO6_P5_6_10 = "C6_P5_6_10";
    public static final String MODULO6_P5_6_11 = "C6_P5_6_11";
    public static final String MODULO6_P5_6_12 = "C6_P5_6_12";
    public static final String MODULO6_P5_6_13 = "C6_P5_6_13";
    public static final String MODULO6_P5_6_14 = "C6_P5_6_14";
    public static final String MODULO6_P5_6_15 = "C6_P5_6_15";
    public static final String MODULO6_P5_6_16 = "C6_P5_6_16";
    public static final String MODULO6_P5_6_17 = "C6_P5_6_17";
    public static final String MODULO6_P5_6_18 = "C6_P5_6_18";
    public static final String MODULO6_P5_6_19 = "C6_P5_6_19";
    public static final String MODULO6_P5_6_19_0 = "C6_P5_6_19_0";
    public static final String MODULO6_P5_5_20 = "C6_P5_5_20";
    public static final String MODULO6_P5_7_1 = "C6_P5_7_1";
    public static final String MODULO6_P5_7_2 = "C6_P5_7_2";
    public static final String MODULO6_P5_7_3 = "C6_P5_7_3";
    public static final String MODULO6_P5_7_4 = "C6_P5_7_4";
    public static final String MODULO6_P5_7_5 = "C6_P5_7_5";
    public static final String MODULO6_P5_7_6 = "C6_P5_7_6";
    public static final String MODULO6_P5_7_7 = "C6_P5_7_7";
    public static final String MODULO6_P5_7_8 = "C6_P5_7_8";
    public static final String MODULO6_P5_7_9 = "C6_P5_7_9";
    public static final String MODULO6_P5_7_10 = "C6_P5_7_10";
    public static final String MODULO6_P5_7_11 = "C6_P5_7_11";
    public static final String MODULO6_P5_7_12 = "C6_P5_7_12";
    public static final String MODULO6_P5_7_13 = "C6_P5_7_13";
    public static final String MODULO6_P5_7_14 = "C6_P5_7_14";
    public static final String MODULO6_P5_7_15 = "C6_P5_7_15";
    public static final String MODULO6_P5_7_16 = "C6_P5_7_16";
    public static final String MODULO6_P5_7_17 = "C6_P5_7_17";
    public static final String MODULO6_P5_7_18 = "C6_P5_7_18";
    public static final String MODULO6_P5_7_19 = "C6_P5_7_19";
    public static final String MODULO6_P5_7_19_0 = "C6_P5_7_19_0";
    public static final String MODULO6_P5_7_20 = "C6_P5_7_20";
    public static final String MODULO6_P5_8_1 = "C6_P5_8_1";
    public static final String MODULO6_P5_8_2 = "C6_P5_8_2";
    public static final String MODULO6_P5_8_3 = "C6_P5_8_3";
    public static final String MODULO6_P5_8_4 = "C6_P5_8_4";
    public static final String MODULO6_P5_8_5 = "C6_P5_8_5";
    public static final String MODULO6_P5_8_6 = "C6_P5_8_6";
    public static final String MODULO6_P5_8_7 = "C6_P5_8_7";
    public static final String MODULO6_P5_8_8 = "C6_P5_8_8";
    public static final String MODULO6_P5_8_9 = "C6_P5_8_9";
    public static final String MODULO6_P5_8_10 = "C6_P5_8_10";
    public static final String MODULO6_P5_8_11 = "C6_P5_8_11";
    public static final String MODULO6_P5_8_12 = "C6_P5_8_12";
    public static final String MODULO6_P5_8_13 = "C6_P5_8_13";
    public static final String MODULO6_P5_8_14 = "C6_P5_8_14";
    public static final String MODULO6_P5_8_15 = "C6_P5_8_15";
    public static final String MODULO6_P5_8_16 = "C6_P5_8_16";
    public static final String MODULO6_P5_8_17 = "C6_P5_8_17";
    public static final String MODULO6_P5_8_18 = "C6_P5_8_18";
    public static final String MODULO6_P5_8_19 = "C6_P5_8_19";
    public static final String MODULO6_P5_8_19_0 = "C6_P5_8_19_0";
    public static final String MODULO6_P5_8_20 = "C6_P5_8_20";
    public static final String MODULO6_P5_9_1 = "C6_P5_9_1";
    public static final String MODULO6_P5_9_2 = "C6_P5_9_2";
    public static final String MODULO6_P5_9_3 = "C6_P5_9_3";
    public static final String MODULO6_P5_9_4 = "C6_P5_9_4";
    public static final String MODULO6_P5_9_5 = "C6_P5_9_5";
    public static final String MODULO6_P5_9_6 = "C6_P5_9_6";
    public static final String MODULO6_P5_9_7 = "C6_P5_9_7";
    public static final String MODULO6_P5_9_8 = "C6_P5_9_8";
    public static final String MODULO6_P5_9_9 = "C6_P5_9_9";
    public static final String MODULO6_P5_9_10 = "C6_P5_9_10";
    public static final String MODULO6_P5_9_11 = "C6_P5_9_11";
    public static final String MODULO6_P5_9_12 = "C6_P5_9_12";
    public static final String MODULO6_P5_9_13 = "C6_P5_9_13";
    public static final String MODULO6_P5_9_14 = "C6_P5_9_14";
    public static final String MODULO6_P5_9_15 = "C6_P5_9_15";
    public static final String MODULO6_P5_9_16 = "C6_P5_9_16";
    public static final String MODULO6_P5_9_17 = "C6_P5_9_17";
    public static final String MODULO6_P5_9_18 = "C6_P5_9_18";
    public static final String MODULO6_P5_9_19 = "C6_P5_9_19";
    public static final String MODULO6_P5_9_19_0 = "C6_P5_9_19_0";
    public static final String MODULO6_P5_9_20 = "C6_P5_9_20";
    public static final String MODULO6_P6_1_1 = "C6_P6_1_1";
    public static final String MODULO6_P6_1_2 = "C6_P6_1_2";
    public static final String MODULO6_P6_1_3 = "C6_P6_1_3";
    public static final String MODULO6_P6_1_4 = "C6_P6_1_4";
    public static final String MODULO6_P6_1_5 = "C6_P6_1_5";
    public static final String MODULO6_P6_1_6 = "C6_P6_1_6";
    public static final String MODULO6_P6_1_7 = "C6_P6_1_7";
    public static final String MODULO6_P6_1_8 = "C6_P6_1_8";
    public static final String MODULO6_P6_1_9 = "C6_P6_1_9";
    public static final String MODULO6_P6_2_1 = "C6_P6_2_1";
    public static final String MODULO6_P6_2_2 = "C6_P6_2_2";
    public static final String MODULO6_P6_2_3 = "C6_P6_2_3";
    public static final String MODULO6_P6_2_4 = "C6_P6_2_4";
    public static final String MODULO6_P6_2_5 = "C6_P6_2_5";
    public static final String MODULO6_P6_2_6 = "C6_P6_2_6";
    public static final String MODULO6_P6_2_7 = "C6_P6_2_7";
    public static final String MODULO6_P6_2_8 = "C6_P6_2_8";
    public static final String MODULO6_P6_2_9 = "C6_P6_2_9";
    public static final String MODULO6_P6_3_1 = "C6_P6_3_1";
    public static final String MODULO6_P6_3_2 = "C6_P6_3_2";
    public static final String MODULO6_P6_3_3 = "C6_P6_3_3";
    public static final String MODULO6_P6_3_4 = "C6_P6_3_4";
    public static final String MODULO6_P6_3_5 = "C6_P6_3_5";
    public static final String MODULO6_P6_3_6 = "C6_P6_3_6";
    public static final String MODULO6_P6_3_7 = "C6_P6_3_7";
    public static final String MODULO6_P6_3_8 = "C6_P6_3_8";
    public static final String MODULO6_P6_3_9 = "C6_P6_3_9";
    public static final String MODULO6_P6_4_1 = "C6_P6_4_1";
    public static final String MODULO6_P6_4_2 = "C6_P6_4_2";
    public static final String MODULO6_P6_4_3 = "C6_P6_4_3";
    public static final String MODULO6_P6_4_4 = "C6_P6_4_4";
    public static final String MODULO6_P6_4_5 = "C6_P6_4_5";
    public static final String MODULO6_P6_4_6 = "C6_P6_4_6";
    public static final String MODULO6_P6_4_7 = "C6_P6_4_7";
    public static final String MODULO6_P6_4_8 = "C6_P6_4_8";
    public static final String MODULO6_P6_4_9 = "C6_P6_4_9";
    public static final String MODULO6_P6_5_1 = "C6_P6_5_1";
    public static final String MODULO6_P6_5_2 = "C6_P6_5_2";
    public static final String MODULO6_P6_5_3 = "C6_P6_5_3";
    public static final String MODULO6_P6_5_4 = "C6_P6_5_4";
    public static final String MODULO6_P6_5_5 = "C6_P6_5_5";
    public static final String MODULO6_P6_5_6 = "C6_P6_5_6";
    public static final String MODULO6_P6_5_7 = "C6_P6_5_7";
    public static final String MODULO6_P6_5_8 = "C6_P6_5_8";
    public static final String MODULO6_P6_5_9 = "C6_P6_5_9";
    public static final String MODULO6_P6_6_1 = "C6_P6_6_1";
    public static final String MODULO6_P6_6_2 = "C6_P6_6_2";
    public static final String MODULO6_P6_6_3 = "C6_P6_6_3";
    public static final String MODULO6_P6_6_4 = "C6_P6_6_4";
    public static final String MODULO6_P6_6_5 = "C6_P6_6_5";
    public static final String MODULO6_P6_6_6 = "C6_P6_6_6";
    public static final String MODULO6_P6_6_7 = "C6_P6_6_7";
    public static final String MODULO6_P6_6_8 = "C6_P6_6_8";
    public static final String MODULO6_P6_6_9 = "C6_P6_6_9";
    public static final String MODULO6_P6_7_1 = "C6_P6_7_1";
    public static final String MODULO6_P6_7_2 = "C6_P6_7_2";
    public static final String MODULO6_P6_7_3 = "C6_P6_7_3";
    public static final String MODULO6_P6_7_4 = "C6_P6_7_4";
    public static final String MODULO6_P6_7_5 = "C6_P6_7_5";
    public static final String MODULO6_P6_7_6 = "C6_P6_7_6";
    public static final String MODULO6_P6_7_7 = "C6_P6_7_7";
    public static final String MODULO6_P6_7_8 = "C6_P6_7_8";
    public static final String MODULO6_P6_7_9 = "C6_P6_7_9";
    public static final String MODULO6_P6_8_1 = "C6_P6_8_1";
    public static final String MODULO6_P6_8_2 = "C6_P6_8_2";
    public static final String MODULO6_P6_8_3 = "C6_P6_8_3";
    public static final String MODULO6_P6_8_4 = "C6_P6_8_4";
    public static final String MODULO6_P6_8_5 = "C6_P6_8_5";
    public static final String MODULO6_P6_8_6 = "C6_P6_8_6";
    public static final String MODULO6_P6_8_7 = "C6_P6_8_7";
    public static final String MODULO6_P6_8_8 = "C6_P6_8_8";
    public static final String MODULO6_P6_8_9 = "C6_P6_8_9";
    public static final String MODULO6_P6_9_1 = "C6_P6_9_1";
    public static final String MODULO6_P6_9_2 = "C6_P6_9_2";
    public static final String MODULO6_P6_9_3 = "C6_P6_9_3";
    public static final String MODULO6_P6_9_4 = "C6_P6_9_4";
    public static final String MODULO6_P6_9_5 = "C6_P6_9_5";
    public static final String MODULO6_P6_9_6 = "C6_P6_9_6";
    public static final String MODULO6_P6_9_7 = "C6_P6_9_7";
    public static final String MODULO6_P6_9_8 = "C6_P6_9_8";
    public static final String MODULO6_P6_9_9 = "C6_P6_9_9";
    public static final String MODULO6_P7_1_1 = "C6_P7_1_1";
    public static final String MODULO6_P7_1_2 = "C6_P7_1_2";
    public static final String MODULO6_P7_1_3 = "C6_P7_1_3";
    public static final String MODULO6_P7_1_4 = "C6_P7_1_4";
    public static final String MODULO6_P7_1_5 = "C6_P7_1_5";
    public static final String MODULO6_P7_1_6 = "C6_P7_1_6";
    public static final String MODULO6_P7_1_7 = "C6_P7_1_7";
    public static final String MODULO6_P7_1_8 = "C6_P7_1_8";
    public static final String MODULO6_P7_1_9 = "C6_P7_1_9";
    public static final String MODULO6_P7_1_10 = "C6_P7_1_10";
    public static final String MODULO6_P7_2_1 = "C6_P7_2_1";
    public static final String MODULO6_P7_2_2 = "C6_P7_2_2";
    public static final String MODULO6_P7_2_3 = "C6_P7_2_3";
    public static final String MODULO6_P7_2_4 = "C6_P7_2_4";
    public static final String MODULO6_P7_2_5 = "C6_P7_2_5";
    public static final String MODULO6_P7_2_6 = "C6_P7_2_6";
    public static final String MODULO6_P7_2_7 = "C6_P7_2_7";
    public static final String MODULO6_P7_2_8 = "C6_P7_2_8";
    public static final String MODULO6_P7_2_9 = "C6_P7_2_9";
    public static final String MODULO6_P7_2_10 = "C6_P7_2_10";
    public static final String MODULO6_P7_3_1 = "C6_P7_3_1";
    public static final String MODULO6_P7_3_2 = "C6_P7_3_2";
    public static final String MODULO6_P7_3_3 = "C6_P7_3_3";
    public static final String MODULO6_P7_3_4 = "C6_P7_3_4";
    public static final String MODULO6_P7_3_5 = "C6_P7_3_5";
    public static final String MODULO6_P7_3_6 = "C6_P7_3_6";
    public static final String MODULO6_P7_3_7 = "C6_P7_3_7";
    public static final String MODULO6_P7_3_8 = "C6_P7_3_8";
    public static final String MODULO6_P7_3_9 = "C6_P7_3_9";
    public static final String MODULO6_P7_3_10 = "C6_P7_3_10";
    public static final String MODULO6_P7_4_1 = "C6_P7_4_1";
    public static final String MODULO6_P7_4_2 = "C6_P7_4_2";
    public static final String MODULO6_P7_4_3 = "C6_P7_4_3";
    public static final String MODULO6_P7_4_4 = "C6_P7_4_4";
    public static final String MODULO6_P7_4_5 = "C6_P7_4_5";
    public static final String MODULO6_P7_4_6 = "C6_P7_4_6";
    public static final String MODULO6_P7_4_7 = "C6_P7_4_7";
    public static final String MODULO6_P7_4_8 = "C6_P7_4_8";
    public static final String MODULO6_P7_4_9 = "C6_P7_4_9";
    public static final String MODULO6_P7_4_10 = "C6_P7_4_10";
    public static final String MODULO6_P7_5_1 = "C6_P7_5_1";
    public static final String MODULO6_P7_5_2 = "C6_P7_5_2";
    public static final String MODULO6_P7_5_3 = "C6_P7_5_3";
    public static final String MODULO6_P7_5_4 = "C6_P7_5_4";
    public static final String MODULO6_P7_5_5 = "C6_P7_5_5";
    public static final String MODULO6_P7_5_6 = "C6_P7_5_6";
    public static final String MODULO6_P7_5_7 = "C6_P7_5_7";
    public static final String MODULO6_P7_5_8 = "C6_P7_5_8";
    public static final String MODULO6_P7_5_9 = "C6_P7_5_9";
    public static final String MODULO6_P7_5_10 = "C6_P7_5_10";
    public static final String MODULO6_P7_6_1 = "C6_P7_6_1";
    public static final String MODULO6_P7_6_2 = "C6_P7_6_2";
    public static final String MODULO6_P7_6_3 = "C6_P7_6_3";
    public static final String MODULO6_P7_6_4 = "C6_P7_6_4";
    public static final String MODULO6_P7_6_5 = "C6_P7_6_5";
    public static final String MODULO6_P7_6_6 = "C6_P7_6_6";
    public static final String MODULO6_P7_6_7 = "C6_P7_6_7";
    public static final String MODULO6_P7_6_8 = "C6_P7_6_8";
    public static final String MODULO6_P7_6_9 = "C6_P7_6_9";
    public static final String MODULO6_P7_6_10 = "C6_P7_6_10";
    public static final String MODULO6_P7_7_1 = "C6_P7_7_1";
    public static final String MODULO6_P7_7_2 = "C6_P7_7_2";
    public static final String MODULO6_P7_7_3 = "C6_P7_7_3";
    public static final String MODULO6_P7_7_4 = "C6_P7_7_4";
    public static final String MODULO6_P7_7_5 = "C6_P7_7_5";
    public static final String MODULO6_P7_7_6 = "C6_P7_7_6";
    public static final String MODULO6_P7_7_7 = "C6_P7_7_7";
    public static final String MODULO6_P7_7_8 = "C6_P7_7_8";
    public static final String MODULO6_P7_7_9 = "C6_P7_7_9";
    public static final String MODULO6_P7_7_10 = "C6_P7_7_10";
    public static final String MODULO6_P7_8_1 = "C6_P7_8_1";
    public static final String MODULO6_P7_8_2 = "C6_P7_8_2";
    public static final String MODULO6_P7_8_3 = "C6_P7_8_3";
    public static final String MODULO6_P7_8_4 = "C6_P7_8_4";
    public static final String MODULO6_P7_8_5 = "C6_P7_8_5";
    public static final String MODULO6_P7_8_6 = "C6_P7_8_6";
    public static final String MODULO6_P7_8_7 = "C6_P7_8_7";
    public static final String MODULO6_P7_8_8 = "C6_P7_8_8";
    public static final String MODULO6_P7_8_9 = "C6_P7_8_9";
    public static final String MODULO6_P7_8_10 = "C6_P7_8_10";
    public static final String MODULO6_P7_9_1 = "C6_P7_9_1";
    public static final String MODULO6_P7_9_2 = "C6_P7_9_2";
    public static final String MODULO6_P7_9_3 = "C6_P7_9_3";
    public static final String MODULO6_P7_9_4 = "C6_P7_9_4";
    public static final String MODULO6_P7_9_5 = "C6_P7_9_5";
    public static final String MODULO6_P7_9_6 = "C6_P7_9_6";
    public static final String MODULO6_P7_9_7 = "C6_P7_9_7";
    public static final String MODULO6_P7_9_8 = "C6_P7_9_8";
    public static final String MODULO6_P7_9_9 = "C6_P7_9_9";
    public static final String MODULO6_P7_9_10 = "C6_P7_9_10";
    public static final String MODULO6_P8_1 = "C6_P8_1";
    public static final String MODULO6_P8_2 = "C6_P8_2";
    public static final String MODULO6_P8_3 = "C6_P8_3";
    public static final String MODULO6_P8_4 = "C6_P8_4";
    public static final String MODULO6_P8_5 = "C6_P8_5";
    public static final String MODULO6_P8_6 = "C6_P8_6";
    public static final String MODULO6_P8_7 = "C6_P8_7";
    public static final String MODULO6_P8_8 = "C6_P8_8";
    public static final String MODULO6_P8_9 = "C6_P8_9";
    public static final String MODULO6_P9 = "C6_P9";
    public static final String MODULO6_P10_1 = "C6_P10_1";
    public static final String MODULO6_P10_2 = "C6_P10_2";
    public static final String MODULO6_P10_3 = "C6_P10_3";
    public static final String MODULO6_P10_4 = "C6_P10_4";
    public static final String MODULO6_P10_4_0 = "C6_P10_4_0";
    public static final String MODULO6_P11_1 = "C6_P11_1";
    public static final String MODULO6_P11_2 = "C6_P11_2";
    public static final String MODULO6_P11_3 = "C6_P11_3";
    public static final String MODULO6_P11_4 = "C6_P11_4";
    public static final String MODULO6_P11_5 = "C6_P11_5";
    public static final String MODULO6_P11_6 = "C6_P11_6";
    public static final String MODULO6_P11_7 = "C6_P11_7";
    public static final String MODULO6_P11_8 = "C6_P11_8";
    public static final String MODULO6_P11_9 = "C6_P11_9";
    public static final String MODULO6_OBS_MOD_VI = "OBS_MOD_VI";
    public static final String MODULO6_USUCREACION = "USU_CREACION";
    public static final String MODULO6_FECCREACION = "FEC_CREACION";
    public static final String MODULO6_USUREGISTRO = "USU_REGISTRO";
    public static final String MODULO6_FECREGISTRO = "FEC_REGISTRO";

    //MODULO 7
    public static final String MODULO7_ID = "ID";
    public static final String MODULO7_P0_0 = "C7_P0_0";
    public static final String MODULO7_P0_1 = "C7_P0_1";
    public static final String MODULO7_P0_2 = "C7_P0_2";
    public static final String MODULO7_P0_3 = "C7_P0_3";
    public static final String MODULO7_P1 = "C7_P1";
    public static final String MODULO7_P2 = "C7_P2";
    public static final String MODULO7_P3 = "C7_P3";
    public static final String MODULO7_P4 = "C7_P4";
    public static final String MODULO7_P5 = "C7_P5";
    public static final String MODULO7_P6_1 = "C7_P6_1";
    public static final String MODULO7_P6_2 = "C7_P6_2";
    public static final String MODULO7_P7 = "C7_P7";
    public static final String MODULO7_P7_0 = "C7_P7_0";
    public static final String MODULO7_P8_1 = "C7_P8_1";
    public static final String MODULO7_P8_2 = "C7_P8_2";
    public static final String MODULO7_P8_3 = "C7_P8_3";
    public static final String MODULO7_P8_4 = "C7_P8_4";
    public static final String MODULO7_P8_5 = "C7_P8_5";
    public static final String MODULO7_P8_6 = "C7_P8_6";
    public static final String MODULO7_P8_7 = "C7_P8_7";
    public static final String MODULO7_P8_8 = "C7_P8_8";
    public static final String MODULO7_P8_9 = "C7_P8_9";
    public static final String MODULO7_P8_10 = "C7_P8_10";
    public static final String MODULO7_P8_11 = "C7_P8_11";
    public static final String MODULO7_P8_12 = "C7_P8_12";
    public static final String MODULO7_P8_13 = "C7_P8_13";
    public static final String MODULO7_P8_14 = "C7_P8_14";
    public static final String MODULO7_P8_15 = "C7_P8_15";
    public static final String MODULO7_P8_16 = "C7_P8_16";
    public static final String MODULO7_P8_17 = "C7_P8_17";
    public static final String MODULO7_P8_18 = "C7_P8_18";
    public static final String MODULO7_P8_19 = "C7_P8_19";
    public static final String MODULO7_P8_19_0 = "C7_P8_19_0";
    public static final String MODULO7_P8_20 = "C7_P8_20";
    public static final String MODULO7_P9_1_1 = "C7_P9_1_1";
    public static final String MODULO7_P9_1_2 = "C7_P9_1_2";
    public static final String MODULO7_P9_1_3 = "C7_P9_1_3";
    public static final String MODULO7_P9_1_4 = "C7_P9_1_4";
    public static final String MODULO7_P9_1_5 = "C7_P9_1_5";
    public static final String MODULO7_P9_1_6 = "C7_P9_1_6";
    public static final String MODULO7_P9_1_7 = "C7_P9_1_7";
    public static final String MODULO7_P9_1_8 = "C7_P9_1_8";
    public static final String MODULO7_P9_1_9 = "C7_P9_1_9";
    public static final String MODULO7_P9_1_10 = "C7_P9_1_10";
    public static final String MODULO7_P9_1_11 = "C7_P9_1_11";
    public static final String MODULO7_P9_1_12 = "C7_P9_1_12";
    public static final String MODULO7_P9_1_13 = "C7_P9_1_13";
    public static final String MODULO7_P9_1_14 = "C7_P9_1_14";
    public static final String MODULO7_P9_1_15 = "C7_P9_1_15";
    public static final String MODULO7_P9_1_16 = "C7_P9_1_16";
    public static final String MODULO7_P9_1_17 = "C7_P9_1_17";
    public static final String MODULO7_P9_1_18 = "C7_P9_1_18";
    public static final String MODULO7_P9_1_19 = "C7_P9_1_19";
    public static final String MODULO7_P8_1_19_0 = "C7_P8_1_19_0";
    public static final String MODULO7_P9_1_20 = "C7_P9_1_20";
    public static final String MODULO7_P9_2_1 = "C7_P9_2_1";
    public static final String MODULO7_P9_2_2 = "C7_P9_2_2";
    public static final String MODULO7_P9_2_3 = "C7_P9_2_3";
    public static final String MODULO7_P9_2_4 = "C7_P9_2_4";
    public static final String MODULO7_P9_2_5 = "C7_P9_2_5";
    public static final String MODULO7_P9_2_6 = "C7_P9_2_6";
    public static final String MODULO7_P9_2_7 = "C7_P9_2_7";
    public static final String MODULO7_P9_2_8 = "C7_P9_2_8";
    public static final String MODULO7_P9_2_9 = "C7_P9_2_9";
    public static final String MODULO7_P9_2_10 = "C7_P9_2_10";
    public static final String MODULO7_P9_2_11 = "C7_P9_2_11";
    public static final String MODULO7_P9_2_12 = "C7_P9_2_12";
    public static final String MODULO7_P9_2_13 = "C7_P9_2_13";
    public static final String MODULO7_P9_2_14 = "C7_P9_2_14";
    public static final String MODULO7_P9_2_15 = "C7_P9_2_15";
    public static final String MODULO7_P9_2_16 = "C7_P9_2_16";
    public static final String MODULO7_P9_2_17 = "C7_P9_2_17";
    public static final String MODULO7_P9_2_18 = "C7_P9_2_18";
    public static final String MODULO7_P9_2_19 = "C7_P9_2_19";
    public static final String MODULO7_P10 = "C7_P10";
    public static final String MODULO7_P11 = "C7_P11";
    public static final String MODULO7_P12_1 = "C7_P12_1";
    public static final String MODULO7_P12_2 = "C7_P12_2";
    public static final String MODULO7_P12_3 = "C7_P12_3";
    public static final String MODULO7_P12_4 = "C7_P12_4";
    public static final String MODULO7_P13_1 = "C7_P13_1";
    public static final String MODULO7_P13_2 = "C7_P13_2";
    public static final String MODULO7_P13_3 = "C7_P13_3";
    public static final String MODULO7_P13_4 = "C7_P13_4";
    public static final String MODULO7_P14 = "C7_P14";
    public static final String MODULO7_P15 = "C7_P15";
    public static final String MODULO7_P16 = "C7_P16";
    public static final String MODULO7_P17_1 = "C7_P17_1";
    public static final String MODULO7_P17_2 = "C7_P17_2";
    public static final String MODULO7_P17_3 = "C7_P17_3";
    public static final String MODULO7_P17_4 = "C7_P17_4";
    public static final String MODULO7_P17_5 = "C7_P17_5";
    public static final String MODULO7_P17_6 = "C7_P17_6";
    public static final String MODULO7_P17_7 = "C7_P17_7";
    public static final String MODULO7_P17_8 = "C7_P17_8";
    public static final String MODULO7_P17_9 = "C7_P17_9";
    public static final String MODULO7_P17_10 = "C7_P17_10";
    public static final String MODULO7_P17_10_0 = "C7_P17_10_0";
    public static final String MODULO7_P18_1 = "C7_P18_1";
    public static final String MODULO7_P18_2 = "C7_P18_2";
    public static final String MODULO7_P18_3 = "C7_P18_3";
    public static final String MODULO7_P18_4 = "C7_P18_4";
    public static final String MODULO7_P18_5 = "C7_P18_5";
    public static final String MODULO7_P18_6 = "C7_P18_6";
    public static final String MODULO7_P18_7 = "C7_P18_7";
    public static final String MODULO7_P18_8 = "C7_P18_8";
    public static final String MODULO7_P18_9 = "C7_P18_9";
    public static final String MODULO7_P18_10 = "C7_P18_10";
    public static final String MODULO7_P18_10_0 = "C7_P18_10_0";
    public static final String MODULO7_P19_1 = "C7_P19_1";
    public static final String MODULO7_P19_2 = "C7_P19_2";
    public static final String MODULO7_P19_3 = "C7_P19_3";
    public static final String MODULO7_P19_4 = "C7_P19_4";
    public static final String MODULO7_P19_5 = "C7_P19_5";
    public static final String MODULO7_P19_6 = "C7_P19_6";
    public static final String MODULO7_P19_7 = "C7_P19_7";
    public static final String MODULO7_P19_8 = "C7_P19_8";
    public static final String MODULO7_P19_9 = "C7_P19_9";
    public static final String MODULO7_P19_10 = "C7_P19_10";
    public static final String MODULO7_P19_10_0 = "C7_P19_10_0";
    public static final String MODULO7_P20 = "C7_P20";
    public static final String MODULO7_P21 = "C7_P21";
    public static final String MODULO7_P22_1 = "C7_P22_1";
    public static final String MODULO7_P22_2 = "C7_P22_2";
    public static final String MODULO7_P22_3 = "C7_P22_3";
    public static final String MODULO7_P22_4 = "C7_P22_4";
    public static final String MODULO7_P22_5 = "C7_P22_5";
    public static final String MODULO7_P22_6 = "C7_P22_6";
    public static final String MODULO7_P22_7 = "C7_P22_7";
    public static final String MODULO7_P22_8 = "C7_P22_8";
    public static final String MODULO7_P22_9 = "C7_P22_9";
    public static final String MODULO7_P22_10 = "C7_P22_10";
    public static final String MODULO7_P22_11 = "C7_P22_11";
    public static final String MODULO7_P22_12 = "C7_P22_12";
    public static final String MODULO7_P22_13 = "C7_P22_13";
    public static final String MODULO7_P22_14 = "C7_P22_14";
    public static final String MODULO7_P22_15 = "C7_P22_15";
    public static final String MODULO7_P22_16 = "C7_P22_16";
    public static final String MODULO7_P22_16_0 = "C7_P22_16_0";
    public static final String MODULO7_P22_17 = "C7_P22_17";
    public static final String MODULO7_P23_1 = "C7_P23_1";
    public static final String MODULO7_P23_2 = "C7_P23_2";
    public static final String MODULO7_P23_3 = "C7_P23_3";
    public static final String MODULO7_P23_4 = "C7_P23_4";
    public static final String MODULO7_P23_5 = "C7_P23_5";
    public static final String MODULO7_P23_6 = "C7_P23_6";
    public static final String MODULO7_P23_7 = "C7_P23_7";
    public static final String MODULO7_P23_8 = "C7_P23_8";
    public static final String MODULO7_P23_9 = "C7_P23_9";
    public static final String MODULO7_P23_10 = "C7_P23_10";
    public static final String MODULO7_P23_10_0 = "C7_P23_10_0";
    public static final String MODULO7_P24 = "C7_P24";
    public static final String MODULO7_P24_1_1 = "C7_P24_1_1";
    public static final String MODULO7_P24_1_2 = "C7_P24_1_2";
    public static final String MODULO7_P24_1_3 = "C7_P24_1_3";
    public static final String MODULO7_P24_2_1 = "C7_P24_2_1";
    public static final String MODULO7_P24_2_2 = "C7_P24_2_2";
    public static final String MODULO7_P24_2_3 = "C7_P24_2_3";
    public static final String MODULO7_P25_1 = "C7_P25_1";
    public static final String MODULO7_P25_2 = "C7_P25_2";
    public static final String MODULO7_P25_3 = "C7_P25_3";
    public static final String MODULO7_P25_4 = "C7_P25_4";
    public static final String MODULO7_P25_5 = "C7_P25_5";
    public static final String MODULO7_P25_6 = "C7_P25_6";
    public static final String MODULO7_P26_1 = "C7_P26_1";
    public static final String MODULO7_P26_2 = "C7_P26_2";
    public static final String MODULO7_P26_3 = "C7_P26_3";
    public static final String MODULO7_P26_4 = "C7_P26_4";
    public static final String MODULO7_P26_5 = "C7_P26_5";
    public static final String MODULO7_P26_6 = "C7_P26_6";
    public static final String MODULO7_P26_7 = "C7_P26_7";
    public static final String MODULO7_P26_8 = "C7_P26_8";
    public static final String MODULO7_P26_9 = "C7_P26_9";
    public static final String MODULO7_P26_10 = "C7_P26_10";
    public static final String MODULO7_P26_11 = "C7_P26_11";
    public static final String MODULO7_P26_12 = "C7_P26_12";
    public static final String MODULO7_P26_13 = "C7_P26_13";
    public static final String MODULO7_P26_14 = "C7_P26_14";
    public static final String MODULO7_P26_15 = "C7_P26_15";
    public static final String MODULO7_P26_16 = "C7_P26_16";
    public static final String MODULO7_P26_17 = "C7_P26_17";
    public static final String MODULO7_P26_18 = "C7_P26_18";
    public static final String MODULO7_P26_19 = "C7_P26_19";
    public static final String MODULO7_P26_20 = "C7_P26_20";
    public static final String MODULO7_P26_21 = "C7_P26_21";
    public static final String MODULO7_P26_21_0 = "C7_P26_21_0";
    public static final String MODULO7_P26_22 = "C7_P26_22";
    public static final String MODULO7_P27 = "C7_P27";
    public static final String MODULO7_P28_1 = "C7_P28_1";
    public static final String MODULO7_P28_2 = "C7_P28_2";
    public static final String MODULO7_P28_3 = "C7_P28_3";
    public static final String MODULO7_P28_4 = "C7_P28_4";
    public static final String MODULO7_P28_4_0 = "C7_P28_4_0";
    public static final String MODULO7_P28_5 = "C7_P28_5";
    public static final String MODULO7_P29 = "C7_P29";
    public static final String MODULO7_P30_1 = "C7_P30_1";
    public static final String MODULO7_P30_2 = "C7_P30_2";
    public static final String MODULO7_P31_1_1 = "C7_P31_1_1";
    public static final String MODULO7_P31_1_2 = "C7_P31_1_2";
    public static final String MODULO7_P31_1_3 = "C7_P31_1_3";
    public static final String MODULO7_P31_1_4 = "C7_P31_1_4";
    public static final String MODULO7_P31_1_5 = "C7_P31_1_5";
    public static final String MODULO7_P31_1_6 = "C7_P31_1_6";
    public static final String MODULO7_P31_1_7 = "C7_P31_1_7";
    public static final String MODULO7_P31_1_8 = "C7_P31_1_8";
    public static final String MODULO7_P31_1_9 = "C7_P31_1_9";
    public static final String MODULO7_P31_2_1 = "C7_P31_2_1";
    public static final String MODULO7_P31_2_2 = "C7_P31_2_2";
    public static final String MODULO7_P31_2_3 = "C7_P31_2_3";
    public static final String MODULO7_P31_2_4 = "C7_P31_2_4";
    public static final String MODULO7_P31_2_5 = "C7_P31_2_5";
    public static final String MODULO7_P31_2_6 = "C7_P31_2_6";
    public static final String MODULO7_P31_2_7 = "C7_P31_2_7";
    public static final String MODULO7_P31_2_8 = "C7_P31_2_8";
    public static final String MODULO7_P31_2_9 = "C7_P31_2_9";
    public static final String MODULO7_P32_1 = "C7_P32_1";
    public static final String MODULO7_P32_2 = "C7_P32_2";
    public static final String MODULO7_P32_3 = "C7_P32_3";
    public static final String MODULO7_P32_4 = "C7_P32_4";
    public static final String MODULO7_P33 = "C7_P33";
    public static final String MODULO7_P34 = "C7_P34";
    public static final String MODULO7_P35 = "C7_P35";
    public static final String MODULO7_P36_1 = "C7_P36_1";
    public static final String MODULO7_P36_2 = "C7_P36_2";
    public static final String MODULO7_P36_3 = "C7_P36_3";
    public static final String MODULO7_P36_4 = "C7_P36_4";
    public static final String MODULO7_P36_5 = "C7_P36_5";
    public static final String MODULO7_P36_5_0 = "C7_P36_5_0";
    public static final String MODULO7_P37 = "C7_P37";
    public static final String MODULO7_P38_1_1 = "C7_P38_1_1";
    public static final String MODULO7_P38_1_2 = "C7_P38_1_2";
    public static final String MODULO7_P38_1_3 = "C7_P38_1_3";
    public static final String MODULO7_P38_1_4 = "C7_P38_1_4";
    public static final String MODULO7_P38_1_5 = "C7_P38_1_5";
    public static final String MODULO7_P38_1_5_0 = "C7_P38_1_5_0";
    public static final String MODULO7_P38_2_1 = "C7_P38_2_1";
    public static final String MODULO7_P38_2_2 = "C7_P38_2_2";
    public static final String MODULO7_P38_2_3 = "C7_P38_2_3";
    public static final String MODULO7_P38_2_4 = "C7_P38_2_4";
    public static final String MODULO7_P38_2_5 = "C7_P38_2_5";
    public static final String MODULO7_P39 = "C7_P39";
    public static final String MODULO7_P39_0 = "C7_P39_0";
    public static final String MODULO7_P40_1 = "C7_P40_1";
    public static final String MODULO7_P40_2 = "C7_P40_2";
    public static final String MODULO7_P40_3 = "C7_P40_3";
    public static final String MODULO7_P40_4 = "C7_P40_4";
    public static final String MODULO7_P40_5 = "C7_P40_5";
    public static final String MODULO7_P41 = "C7_P41";
    public static final String MODULO7_P42 = "C7_P42";
    public static final String MODULO7_P43_1 = "C7_P43_1";
    public static final String MODULO7_P43_2 = "C7_P43_2";
    public static final String MODULO7_P44 = "C7_P44";
    public static final String MODULO7_P45 = "C7_P45";
    public static final String MODULO7_P46 = "C7_P46";
    public static final String MODULO7_OBS_MOD_VII = "OBS_MOD_VII";
    public static final String MODULO7_USUCREACION = "USU_CREACION";
    public static final String MODULO7_FECCREACION = "FEC_CREACION";
    public static final String MODULO7_USUREGISTRO = "USU_REGISTRO";
    public static final String MODULO7_FECREGISTRO = "FEC_REGISTRO";

    //MODULO 8
    public static final String MODULO8_ID = "ID";
    public static final String MODULO8_P0_0 = "C8_P0_0";
    public static final String MODULO8_P0_1 = "C8_P0_1";
    public static final String MODULO8_P0_2 = "C8_P0_2";
    public static final String MODULO8_P0_3 = "C8_P0_3";
    public static final String MODULO8_P1_1_1 = "C8_P1_1_1";
    public static final String MODULO8_P1_2_1 = "C8_P1_2_1";
    public static final String MODULO8_P2_1 = "C8_P2_1";
    public static final String MODULO8_P3_1_1 = "C8_P3_1_1";
    public static final String MODULO8_P3_2_1 = "C8_P3_2_1";
    public static final String MODULO8_P3_3_1 = "C8_P3_3_1";
    public static final String MODULO8_P3_4_1 = "C8_P3_4_1";
    public static final String MODULO8_P3_5_1 = "C8_P3_5_1";
    public static final String MODULO8_P3_6_1 = "C8_P3_6_1";
    public static final String MODULO8_P3_6_1_0 = "C8_P3_6_1_0";
    public static final String MODULO8_P4_1_1 = "C8_P4_1_1";
    public static final String MODULO8_P4_2_1 = "C8_P4_2_1";
    public static final String MODULO8_P4_3_1 = "C8_P4_3_1";
    public static final String MODULO8_P4_4_1 = "C8_P4_4_1";
    public static final String MODULO8_P4_5_1 = "C8_P4_5_1";
    public static final String MODULO8_P4_6_1 = "C8_P4_6_1";
    public static final String MODULO8_P4_6_1_0 = "C8_P4_6_1_0";
    public static final String MODULO8_P5_1 = "C8_P5_1";
    public static final String MODULO8_P6_1_1 = "C8_P6_1_1";
    public static final String MODULO8_P6_2_1 = "C8_P6_2_1";
    public static final String MODULO8_P6_3_1 = "C8_P6_3_1";
    public static final String MODULO8_P6_4_1 = "C8_P6_4_1";
    public static final String MODULO8_P6_5_1 = "C8_P6_5_1";
    public static final String MODULO8_P6_6_1 = "C8_P6_6_1";
    public static final String MODULO8_P7_1 = "C8_P7_1";
    public static final String MODULO8_P8_1_1 = "C8_P8_1_1";
    public static final String MODULO8_P8_2_1 = "C8_P8_2_1";
    public static final String MODULO8_P8_3_1 = "C8_P8_3_1";
    public static final String MODULO8_P8_4_1 = "C8_P8_4_1";
    public static final String MODULO8_P9_1_1 = "C8_P9_1_1";
    public static final String MODULO8_P9_2_1 = "C8_P9_2_1";
    public static final String MODULO8_P9_3_1 = "C8_P9_3_1";
    public static final String MODULO8_P9_4_1 = "C8_P9_4_1";
    public static final String MODULO8_P10_1_1 = "C8_P10_1_1";
    public static final String MODULO8_P10_2_1 = "C8_P10_2_1";
    public static final String MODULO8_P10_3_1 = "C8_P10_3_1";
    public static final String MODULO8_P10_4_1 = "C8_P10_4_1";
    public static final String MODULO8_P10_5_1 = "C8_P10_5_1";
    public static final String MODULO8_P10_6_1 = "C8_P10_6_1";
    public static final String MODULO8_P1_1_2 = "C8_P1_1_2";
    public static final String MODULO8_P1_2_2 = "C8_P1_2_2";
    public static final String MODULO8_P2_2 = "C8_P2_2";
    public static final String MODULO8_P3_1_2 = "C8_P3_1_2";
    public static final String MODULO8_P3_2_2 = "C8_P3_2_2";
    public static final String MODULO8_P3_3_2 = "C8_P3_3_2";
    public static final String MODULO8_P3_4_2 = "C8_P3_4_2";
    public static final String MODULO8_P3_5_2 = "C8_P3_5_2";
    public static final String MODULO8_P3_6_2 = "C8_P3_6_2";
    public static final String MODULO8_P3_6_2_0 = "C8_P3_6_2_0";
    public static final String MODULO8_P4_1_2 = "C8_P4_1_2";
    public static final String MODULO8_P4_2_2 = "C8_P4_2_2";
    public static final String MODULO8_P4_3_2 = "C8_P4_3_2";
    public static final String MODULO8_P4_4_2 = "C8_P4_4_2";
    public static final String MODULO8_P4_5_2 = "C8_P4_5_2";
    public static final String MODULO8_P4_6_2 = "C8_P4_6_2";
    public static final String MODULO8_P4_6_2_0 = "C8_P4_6_2_0";
    public static final String MODULO8_P5_2 = "C8_P5_2";
    public static final String MODULO8_P6_1_2 = "C8_P6_1_2";
    public static final String MODULO8_P6_2_2 = "C8_P6_2_2";
    public static final String MODULO8_P6_3_2 = "C8_P6_3_2";
    public static final String MODULO8_P6_4_2 = "C8_P6_4_2";
    public static final String MODULO8_P6_5_2 = "C8_P6_5_2";
    public static final String MODULO8_P6_6_2 = "C8_P6_6_2";
    public static final String MODULO8_P7_2 = "C8_P7_2";
    public static final String MODULO8_P8_1_2 = "C8_P8_1_2";
    public static final String MODULO8_P8_2_2 = "C8_P8_2_2";
    public static final String MODULO8_P8_3_2 = "C8_P8_3_2";
    public static final String MODULO8_P8_4_2 = "C8_P8_4_2";
    public static final String MODULO8_P9_1_2 = "C8_P9_1_2";
    public static final String MODULO8_P9_2_2 = "C8_P9_2_2";
    public static final String MODULO8_P9_3_2 = "C8_P9_3_2";
    public static final String MODULO8_P9_4_2 = "C8_P9_4_2";
    public static final String MODULO8_P10_1_2 = "C8_P10_1_2";
    public static final String MODULO8_P10_2_2 = "C8_P10_2_2";
    public static final String MODULO8_P10_3_2 = "C8_P10_3_2";
    public static final String MODULO8_P10_4_2 = "C8_P10_4_2";
    public static final String MODULO8_P10_5_2 = "C8_P10_5_2";
    public static final String MODULO8_P10_6_2 = "C8_P10_6_2";
    public static final String MODULO8_P1_1_3 = "C8_P1_1_3";
    public static final String MODULO8_P1_2_3 = "C8_P1_2_3";
    public static final String MODULO8_P2_3 = "C8_P2_3";
    public static final String MODULO8_P3_1_3 = "C8_P3_1_3";
    public static final String MODULO8_P3_2_3 = "C8_P3_2_3";
    public static final String MODULO8_P3_3_3 = "C8_P3_3_3";
    public static final String MODULO8_P3_4_3 = "C8_P3_4_3";
    public static final String MODULO8_P3_5_3 = "C8_P3_5_3";
    public static final String MODULO8_P3_6_3 = "C8_P3_6_3";
    public static final String MODULO8_P3_6_3_0 = "C8_P3_6_3_0";
    public static final String MODULO8_P4_1_3 = "C8_P4_1_3";
    public static final String MODULO8_P4_2_3 = "C8_P4_2_3";
    public static final String MODULO8_P4_3_3 = "C8_P4_3_3";
    public static final String MODULO8_P4_4_3 = "C8_P4_4_3";
    public static final String MODULO8_P4_5_3 = "C8_P4_5_3";
    public static final String MODULO8_P4_6_3 = "C8_P4_6_3";
    public static final String MODULO8_P4_6_3_0 = "C8_P4_6_3_0";
    public static final String MODULO8_P5_3 = "C8_P5_3";
    public static final String MODULO8_P6_1_3 = "C8_P6_1_3";
    public static final String MODULO8_P6_2_3 = "C8_P6_2_3";
    public static final String MODULO8_P6_3_3 = "C8_P6_3_3";
    public static final String MODULO8_P6_4_3 = "C8_P6_4_3";
    public static final String MODULO8_P6_5_3 = "C8_P6_5_3";
    public static final String MODULO8_P6_6_3 = "C8_P6_6_3";
    public static final String MODULO8_P7_3 = "C8_P7_3";
    public static final String MODULO8_P8_1_3 = "C8_P8_1_3";
    public static final String MODULO8_P8_2_3 = "C8_P8_2_3";
    public static final String MODULO8_P8_3_3 = "C8_P8_3_3";
    public static final String MODULO8_P8_4_3 = "C8_P8_4_3";
    public static final String MODULO8_P9_1_3 = "C8_P9_1_3";
    public static final String MODULO8_P9_2_3 = "C8_P9_2_3";
    public static final String MODULO8_P9_3_3 = "C8_P9_3_3";
    public static final String MODULO8_P9_4_3 = "C8_P9_4_3";
    public static final String MODULO8_P10_1_3 = "C8_P10_1_3";
    public static final String MODULO8_P10_2_3 = "C8_P10_2_3";
    public static final String MODULO8_P10_3_3 = "C8_P10_3_3";
    public static final String MODULO8_P10_4_3 = "C8_P10_4_3";
    public static final String MODULO8_P10_5_3 = "C8_P10_5_3";
    public static final String MODULO8_P10_6_3 = "C8_P10_6_3";
    public static final String MODULO8_P1_1_4 = "C8_P1_1_4";
    public static final String MODULO8_P1_2_4 = "C8_P1_2_4";
    public static final String MODULO8_P2_4 = "C8_P2_4";
    public static final String MODULO8_P3_1_4 = "C8_P3_1_4";
    public static final String MODULO8_P3_2_4 = "C8_P3_2_4";
    public static final String MODULO8_P3_3_4 = "C8_P3_3_4";
    public static final String MODULO8_P3_4_4 = "C8_P3_4_4";
    public static final String MODULO8_P3_5_4 = "C8_P3_5_4";
    public static final String MODULO8_P3_6_4 = "C8_P3_6_4";
    public static final String MODULO8_P3_6_4_0 = "C8_P3_6_4_0";
    public static final String MODULO8_P4_1_4 = "C8_P4_1_4";
    public static final String MODULO8_P4_2_4 = "C8_P4_2_4";
    public static final String MODULO8_P4_3_4 = "C8_P4_3_4";
    public static final String MODULO8_P4_4_4 = "C8_P4_4_4";
    public static final String MODULO8_P4_5_4 = "C8_P4_5_4";
    public static final String MODULO8_P4_6_4 = "C8_P4_6_4";
    public static final String MODULO8_P4_6_4_0 = "C8_P4_6_4_0";
    public static final String MODULO8_P5_4 = "C8_P5_4";
    public static final String MODULO8_P6_1_4 = "C8_P6_1_4";
    public static final String MODULO8_P6_2_4 = "C8_P6_2_4";
    public static final String MODULO8_P6_3_4 = "C8_P6_3_4";
    public static final String MODULO8_P6_4_4 = "C8_P6_4_4";
    public static final String MODULO8_P6_5_4 = "C8_P6_5_4";
    public static final String MODULO8_P6_6_4 = "C8_P6_6_4";
    public static final String MODULO8_P7_4 = "C8_P7_4";
    public static final String MODULO8_P8_1_4 = "C8_P8_1_4";
    public static final String MODULO8_P8_2_4 = "C8_P8_2_4";
    public static final String MODULO8_P8_3_4 = "C8_P8_3_4";
    public static final String MODULO8_P8_4_4 = "C8_P8_4_4";
    public static final String MODULO8_P9_1_4 = "C8_P9_1_4";
    public static final String MODULO8_P9_2_4 = "C8_P9_2_4";
    public static final String MODULO8_P9_3_4 = "C8_P9_3_4";
    public static final String MODULO8_P9_4_4 = "C8_P9_4_4";
    public static final String MODULO8_P10_1_4 = "C8_P10_1_4";
    public static final String MODULO8_P10_2_4 = "C8_P10_2_4";
    public static final String MODULO8_P10_3_4 = "C8_P10_3_4";
    public static final String MODULO8_P10_4_4 = "C8_P10_4_4";
    public static final String MODULO8_P10_5_4 = "C8_P10_5_4";
    public static final String MODULO8_P10_6_4 = "C8_P10_6_4";
    public static final String MODULO8_P1_1_5 = "C8_P1_1_5";
    public static final String MODULO8_P1_2_5 = "C8_P1_2_5";
    public static final String MODULO8_P2_5 = "C8_P2_5";
    public static final String MODULO8_P3_1_5 = "C8_P3_1_5";
    public static final String MODULO8_P3_2_5 = "C8_P3_2_5";
    public static final String MODULO8_P3_3_5 = "C8_P3_3_5";
    public static final String MODULO8_P3_4_5 = "C8_P3_4_5";
    public static final String MODULO8_P3_5_5 = "C8_P3_5_5";
    public static final String MODULO8_P3_6_5 = "C8_P3_6_5";
    public static final String MODULO8_P3_6_5_0 = "C8_P3_6_5_0";
    public static final String MODULO8_P4_1_5 = "C8_P4_1_5";
    public static final String MODULO8_P4_2_5 = "C8_P4_2_5";
    public static final String MODULO8_P4_3_5 = "C8_P4_3_5";
    public static final String MODULO8_P4_4_5 = "C8_P4_4_5";
    public static final String MODULO8_P4_5_5 = "C8_P4_5_5";
    public static final String MODULO8_P4_6_5 = "C8_P4_6_5";
    public static final String MODULO8_P4_6_5_0 = "C8_P4_6_5_0";
    public static final String MODULO8_P5_5 = "C8_P5_5";
    public static final String MODULO8_P6_1_5 = "C8_P6_1_5";
    public static final String MODULO8_P6_2_5 = "C8_P6_2_5";
    public static final String MODULO8_P6_3_5 = "C8_P6_3_5";
    public static final String MODULO8_P6_4_5 = "C8_P6_4_5";
    public static final String MODULO8_P6_5_5 = "C8_P6_5_5";
    public static final String MODULO8_P6_6_5 = "C8_P6_6_5";
    public static final String MODULO8_P7_5 = "C8_P7_5";
    public static final String MODULO8_P8_1_5 = "C8_P8_1_5";
    public static final String MODULO8_P8_2_5 = "C8_P8_2_5";
    public static final String MODULO8_P8_3_5 = "C8_P8_3_5";
    public static final String MODULO8_P8_4_5 = "C8_P8_4_5";
    public static final String MODULO8_P9_1_5 = "C8_P9_1_5";
    public static final String MODULO8_P9_2_5 = "C8_P9_2_5";
    public static final String MODULO8_P9_3_5 = "C8_P9_3_5";
    public static final String MODULO8_P9_4_5 = "C8_P9_4_5";
    public static final String MODULO8_P10_1_5 = "C8_P10_1_5";
    public static final String MODULO8_P10_2_5 = "C8_P10_2_5";
    public static final String MODULO8_P10_3_5 = "C8_P10_3_5";
    public static final String MODULO8_P10_4_5 = "C8_P10_4_5";
    public static final String MODULO8_P10_5_5 = "C8_P10_5_5";
    public static final String MODULO8_P10_6_5 = "C8_P10_6_5";
    public static final String MODULO8_P1_1_6 = "C8_P1_1_6";
    public static final String MODULO8_P1_2_6 = "C8_P1_2_6";
    public static final String MODULO8_P2_6 = "C8_P2_6";
    public static final String MODULO8_P3_1_6 = "C8_P3_1_6";
    public static final String MODULO8_P3_2_6 = "C8_P3_2_6";
    public static final String MODULO8_P3_3_6 = "C8_P3_3_6";
    public static final String MODULO8_P3_4_6 = "C8_P3_4_6";
    public static final String MODULO8_P3_5_6 = "C8_P3_5_6";
    public static final String MODULO8_P3_6_6 = "C8_P3_6_6";
    public static final String MODULO8_P3_6_6_0 = "C8_P3_6_6_0";
    public static final String MODULO8_P4_1_6 = "C8_P4_1_6";
    public static final String MODULO8_P4_2_6 = "C8_P4_2_6";
    public static final String MODULO8_P4_3_6 = "C8_P4_3_6";
    public static final String MODULO8_P4_4_6 = "C8_P4_4_6";
    public static final String MODULO8_P4_5_6 = "C8_P4_5_6";
    public static final String MODULO8_P4_6_6 = "C8_P4_6_6";
    public static final String MODULO8_P4_6_6_0 = "C8_P4_6_6_0";
    public static final String MODULO8_P5_6 = "C8_P5_6";
    public static final String MODULO8_P6_1_6 = "C8_P6_1_6";
    public static final String MODULO8_P6_2_6 = "C8_P6_2_6";
    public static final String MODULO8_P6_3_6 = "C8_P6_3_6";
    public static final String MODULO8_P6_4_6 = "C8_P6_4_6";
    public static final String MODULO8_P6_5_6 = "C8_P6_5_6";
    public static final String MODULO8_P6_6_6 = "C8_P6_6_6";
    public static final String MODULO8_P7_6 = "C8_P7_6";
    public static final String MODULO8_P8_1_6 = "C8_P8_1_6";
    public static final String MODULO8_P8_2_6 = "C8_P8_2_6";
    public static final String MODULO8_P8_3_6 = "C8_P8_3_6";
    public static final String MODULO8_P8_4_6 = "C8_P8_4_6";
    public static final String MODULO8_P9_1_6 = "C8_P9_1_6";
    public static final String MODULO8_P9_2_6 = "C8_P9_2_6";
    public static final String MODULO8_P9_3_6 = "C8_P9_3_6";
    public static final String MODULO8_P9_4_6 = "C8_P9_4_6";
    public static final String MODULO8_P10_1_6 = "C8_P10_1_6";
    public static final String MODULO8_P10_2_6 = "C8_P10_2_6";
    public static final String MODULO8_P10_3_6 = "C8_P10_3_6";
    public static final String MODULO8_P10_4_6 = "C8_P10_4_6";
    public static final String MODULO8_P10_5_6 = "C8_P10_5_6";
    public static final String MODULO8_P10_6_6 = "C8_P10_6_6";
    public static final String MODULO8_OBS_MOD_VIII = "OBS_MOD_VIII";
    public static final String MODULO8_USUCREACION = "USU_CREACION";
    public static final String MODULO8_FECCREACION = "FEC_CREACION";
    public static final String MODULO8_USUREGISTRO = "USU_REGISTRO";
    public static final String MODULO8_FECREGISTRO = "FEC_REGISTRO";

    //MODULO 9
    public static final String MODULO9_ID = "ID";
    public static final String MODULO9_P0_0 = "C9_P0_0";
    public static final String MODULO9_P0_1 = "C9_P0_1";
    public static final String MODULO9_P0_2 = "C9_P0_2";
    public static final String MODULO9_P0_3 = "C9_P0_3";
    public static final String MODULO9_P1 = "C9_P1";
    public static final String MODULO9_P2 = "C9_P2";
    public static final String MODULO9_OBS_MOD_IX = "OBS_MOD_IX";
    public static final String MODULO9_USUCREACION = "USU_CREACION";
    public static final String MODULO9_FECCREACION = "FEC_CREACION";
    public static final String MODULO9_USUREGISTRO = "USU_REGISTRO";
    public static final String MODULO9_FECREGISTRO = "FEC_REGISTRO";

    //MODULO 10
    public static final String MODULO10_ID = "ID";
    public static final String MODULO10_P0_0 = "C10_P0_0";
    public static final String MODULO10_P0_1 = "C10_P0_1";
    public static final String MODULO10_P0_2 = "C10_P0_2";
    public static final String MODULO10_P0_3 = "C10_P0_3";
    public static final String MODULO10_P1 = "C10_P1";
    public static final String MODULO10_P2 = "C10_P2";
    public static final String MODULO10_P3 = "C10_P3";
    public static final String MODULO10_P4 = "C10_P4";
    public static final String MODULO10_OBS_MOD_X = "OBS_MOD_X";
    public static final String MODULO10_USUCREACION = "USU_CREACION";
    public static final String MODULO10_FECCREACION = "FEC_CREACION";
    public static final String MODULO10_USUREGISTRO = "USU_REGISTRO";
    public static final String MODULO10_FECREGISTRO = "FEC_REGISTRO";


    //QUERY
    //CREATE
    public static final String SQL_CREATE_TABLA_USUARIOS =
            "CREATE TABLE " + tableUsuarios + "(" +
                    USUARIO_ID + " TEXT PRIMARY KEY," +
                    USUARIO_PASSWORD + " TEXT," +
                    USUARIO_PERMISO + " TEXT" + ");"
            ;

    public static final String SQL_CREATE_TABLA_DATOS_ENTREVISTA =
            "CREATE TABLE " + tableDatosEntrevista + "(" +
                    DATOS_ID + " TEXT PRIMARY KEY," +
                    DATOS_DNI_OPERADOR + " TEXT," +
                    DATOS_DNI_JEFE + " TEXT," +
                    DATOS_DNI_SUPERVISOR + " TEXT," +
                    DATOS_NOMBRE_OPERADOR + " TEXT," +
                    DATOS_NOMBRE_JEFE + " TEXT," +
                    DATOS_NOMBRE_SUPERVISOR + " TEXT," +
                    DATOS_RESULTADO_FINAL + " TEXT," +
                    DATOS_RESULTADO_FINAL_ESP + " TEXT," +
                    DATOS_FECHA_FINAL_DIA + " TEXT," +
                    DATOS_FECHA_FINAL_MES + " TEXT," +
                    DATOS_FECHA_FINAL_ANIO + " TEXT," +
                    DATOS_ESTADO_ENVIO + " TEXT," +
                    DATOS_USUCREACION + " TEXT," +
                    DATOS_FECCREACION + " TEXT," +
                    DATOS_USUREGISTRO + " TEXT," +
                    DATOS_FECREGISTRO + " TEXT" + ");"
            ;

    public static final String SQL_CREATE_TABLA_MARCO =
            "CREATE TABLE " + tableMarco + "(" +
                    MARCO_ID + " TEXT PRIMARY KEY," +
                    MARCO_RUC + " TEXT," +
                    MARCO_RAZON_SOCIAL + " TEXT," +
                    MARCO_NOMBRE_COMERCIAL + " TEXT," +
                    MARCO_OPERADOR + " TEXT," +
                    MARCO_JEFE + " TEXT," +
                    MARCO_OBSERVADOR + " TEXT," +
                    MARCO_ANIO + " TEXT," +
                    MARCO_MES + " TEXT," +
                    MARCO_PERIODO + " TEXT," +
                    MARCO_CCDD + " TEXT," +
                    MARCO_DEPARTAMENTO + " TEXT," +
                    MARCO_CCPP + " TEXT," +
                    MARCO_PROVINCIA + " TEXT," +
                    MARCO_CCDI + " TEXT," +
                    MARCO_DISTRITO + " TEXT," +
                    MARCO_T_EMPRESA + " TEXT," +
                    MARCO_FRENTE + " TEXT," +
                    MARCO_ZONA + " TEXT," +
                    MARCO_MANZANA + " TEXT," +
                    MARCO_CAT_VIA + " TEXT," +
                    MARCO_NOM_VIA + " TEXT," +
                    MARCO_PUERTA + " TEXT," +
                    MARCO_INTERIOR + " TEXT," +
                    MARCO_PISO + " TEXT," +
                    MARCO_MZ + " TEXT," +
                    MARCO_LOTE + " TEXT" + ");"
            ;

    public static final String SQL_CREATE_TABLA_CARATULAS =
            "CREATE TABLE " + tableCaratulas + "(" +
                    CARATULA_ID + " TEXT PRIMARY KEY," +
                    CARATULA_CAMBIO + " TEXT," +
                    CARATULA_DEPARTAMENTO + " TEXT," +
                    CARATULA_DEPARTAMENTO_COD + " TEXT," +
                    CARATULA_PROVINCIA + " TEXT," +
                    CARATULA_PROVINCIA_COD + " TEXT," +
                    CARATULA_DISTRITO + " TEXT," +
                    CARATULA_DISTRITO_COD + " TEXT," +
                    CARATULA_GPSLATITUD + " TEXT," +
                    CARATULA_GPSALTITUD + " TEXT," +
                    CARATULA_GPSLONGITUD + " TEXT," +
                    CARATULA_SECTOR + " TEXT," +
                    CARATULA_AREA + " TEXT," +
                    CARATULA_ZONA + " TEXT," +
                    CARATULA_MANZANA_MUESTRA + " TEXT," +
                    CARATULA_FRENTE + " TEXT," +
                    CARATULA_TIPVIA + " TEXT," +
                    CARATULA_NOMVIA + " TEXT," +
                    CARATULA_NPUERTA + " TEXT," +
                    CARATULA_BLOCK + " TEXT," +
                    CARATULA_INTERIOR + " TEXT," +
                    CARATULA_PISO + " TEXT," +
                    CARATULA_MANZANA_VIA + " TEXT," +
                    CARATULA_LOTE + " TEXT," +
                    CARATULA_KM + " TEXT," +
                    CARATULA_REFERENCIA + " TEXT," +
                    CARATULA_USUCREACION + " TEXT," +
                    CARATULA_FECCREACION + " TEXT," +
                    CARATULA_USUREGISTRO + " TEXT," +
                    CARATULA_FECREGISTRO + " TEXT" + ");"
            ;

    public static final String SQL_CREATE_TABLA_VISITAS =
            "CREATE TABLE " + tableVisitas + "(" +
                    VISITA_ID + " INTEGER PRIMARY KEY AUTOINCREMENT," +
                    VISITA_ID_EMPRESA + " TEXT," +
                    VISITA_DNI_OPERADOR + " TEXT," +
                    VISITA_NOMBRE_OPERADOR + " TEXT," +
                    VISITA_DNI_JEFE + " TEXT," +
                    VISITA_NOMBRE_JEFE + " TEXT," +
                    VISITA_DNI_SUPERVISOR + " TEXT," +
                    VISITA_NOMBRE_SUPERVISOR + " TEXT," +
                    VISITA_N + " TEXT," +
                    VISITA_DIA + " TEXT," +
                    VISITA_MES + " TEXT," +
                    VISITA_ANIO + " TEXT," +
                    VISITA_HORAI + " TEXT," +
                    VISITA_MINUTOI + " TEXT," +
                    VISITA_HORAF + " TEXT," +
                    VISITA_MINUTOF + " TEXT," +
                    VISITA_RESULTADO + " TEXT," +
                    VISITA_RESULTADO_ESP + " TEXT," +
                    VISITA_PROX_DIA + " TEXT," +
                    VISITA_PROX_MES + " TEXT," +
                    VISITA_PROX_ANIO + " TEXT," +
                    VISITA_PROX_HORA + " TEXT," +
                    VISITA_PROX_MINUTO + " TEXT," +
                    VISITA_USUCREACION + " TEXT," +
                    VISITA_FECCREACION + " TEXT," +
                    VISITA_USUREGISTRO + " TEXT," +
                    VISITA_FECREGISTRO + " TEXT" + ");"
            ;

    public static final String SQL_CREATE_TABLA_IDENTIFICACIONES =
            "CREATE TABLE " + tableIdentificaciones + "(" +
                    IDENTIFICACION_ID + " TEXT PRIMARY KEY," +
                    IDENTIFICACION_RUC + " TEXT," +
                    IDENTIFICACION_RAZON + " TEXT," +
                    IDENTIFICACION_NOMBRE + " TEXT," +
                    IDENTIFICACION_ANIO_FUNDACION + " TEXT," +
                    IDENTIFICACION_WEB + " TEXT," +
                    IDENTIFICACION_WEBNO + " TEXT," +
                    IDENTIFICACION_CORREO + " TEXT," +
                    IDENTIFICACION_CORREONO + " TEXT," +
                    IDENTIFICACION_CODFIJO + " TEXT," +
                    IDENTIFICACION_FIJO + " TEXT," +
                    IDENTIFICACION_FIJONO + " TEXT," +
                    IDENTIFICACION_MOVIL + " TEXT," +
                    IDENTIFICACION_MOVILNO + " TEXT," +
                    IDENTIFICACION_ANIO_FUNCIONAMIENTO + " TEXT," +
                    IDENTIFICACION_CONDUCTOR_NOMBRE + " TEXT," +
                    IDENTIFICACION_CONDUCTOR_SEXO + " TEXT," +
                    IDENTIFICACION_CONDUCTOR_EDAD + " TEXT," +
                    IDENTIFICACION_CONDUCTOR_ESTUDIOS + " TEXT," +
                    IDENTIFICACION_CONDUCTOR_CARGO + " TEXT," +
                    IDENTIFICACION_CONDUCTOR_CARGO_ESP + " TEXT," +
                    IDENTIFICACION_USUCREACION + " TEXT," +
                    IDENTIFICACION_FECCREACION + " TEXT," +
                    IDENTIFICACION_USUREGISTRO + " TEXT," +
                    IDENTIFICACION_FECREGISTRO + " TEXT" + ");"
            ;

    public static final String SQL_CREATE_TABLA_FRAGMENTS =
            "CREATE TABLE " + tableFragments + "(" +
                    FRAGMENT_ID + " TEXT PRIMARY KEY," +
                    FRAGMENT_HABILITADO + " TEXT," +
                    FRAGMENT_AVANCE + " TEXT" +");"
            ;

    public static final String SQL_CREATE_TABLA_UBIGEOS =
            "CREATE TABLE " + tableUbigeo + "(" +
                    UBIGEO_ID + " TEXT PRIMARY KEY," +
                    UBIGEO_ID_UBI + " TEXT, " +
                    UBIGEO_DISTRITO + " TEXT" +");"
            ;


    //TABLA MODULO1
    public static final String SQL_CREATE_TABLA_MODULO1 =
            "CREATE TABLE " + tableModulo1 + "(" +
                    MODULO1_ID  + " TEXT PRIMARY KEY," +
                    MODULO1_P0_0  + " TEXT," +
                    MODULO1_P0_1  + " TEXT," +
                    MODULO1_P0_2  + " TEXT," +
                    MODULO1_P0_3  + " TEXT," +
                    MODULO1_P1_1  + " TEXT," +
                    MODULO1_P1_2  + " TEXT," +
                    MODULO1_P1_2_DETALLE + " TEXT," +
                    MODULO1_P2_1_1  + " TEXT," +
                    MODULO1_P2_1_2  + " TEXT," +
                    MODULO1_P2_1_2_DETALLE + " TEXT," +
                    MODULO1_P2_1_NO  + " TEXT," +
                    MODULO1_P2_2_1  + " TEXT," +
                    MODULO1_P2_2_2  + " TEXT," +
                    MODULO1_P2_2_2_DETALLE + " TEXT," +
                    MODULO1_P2_2_NO  + " TEXT," +
                    MODULO1_P3  + " TEXT," +
                    MODULO1_P3_0  + " TEXT," +
                    MODULO1_P4_1_1  + " TEXT," +
                    MODULO1_P4_2_1  + " TEXT," +
                    MODULO1_P5  + " TEXT," +
                    MODULO1_P6_0  + " TEXT," +
                    MODULO1_P6_1  + " TEXT," +
                    MODULO1_P7_1_1  + " TEXT," +
                    MODULO1_P7_2_1  + " TEXT," +
                    MODULO1_P7_1_2  + " TEXT," +
                    MODULO1_P7_2_2  + " TEXT," +
                    MODULO1_P8  + " TEXT," +
                    MODULO1_P9  + " TEXT," +
                    MODULO1_P10  + " TEXT," +
                    MODULO1_P11  + " TEXT," +
                    MODULO1_P11_1  + " TEXT," +
                    MODULO1_P11_2  + " TEXT," +
                    MODULO1_P12_NO  + " TEXT," +
                    MODULO1_P12_TIPVIA  + " TEXT," +
                    MODULO1_P12_NOMVIA   + " TEXT," +
                    MODULO1_P12_NROPTA  + " TEXT," +
                    MODULO1_P12_BLOCK  + " TEXT," +
                    MODULO1_P12_INT  + " TEXT," +
                    MODULO1_P12_PISO  + " TEXT," +
                    MODULO1_P12_MZA  + " TEXT," +
                    MODULO1_P12_LOTE  + " TEXT," +
                    MODULO1_P12_KM  + " TEXT," +
                    MODULO1_P12_DIST  + " TEXT," +
                    MODULO1_P12_CCDI  + " TEXT," +
                    MODULO1_P12_PROV  + " TEXT," +
                    MODULO1_P12_CCPP  + " TEXT," +
                    MODULO1_P12_DEP  + " TEXT," +
                    MODULO1_P12_CCDD  + " TEXT," +
                    MODULO1_OBS_MOD_I  + " TEXT," +
                    MODULO1_USUCREACION + " TEXT," +
                    MODULO1_FECCREACION + " TEXT," +
                    MODULO1_USUREGISTRO + " TEXT," +
                    MODULO1_FECREGISTRO + " TEXT" + ");"
                    ;
    //TABLA MODULO2
    public static final String SQL_CREATE_TABLA_MODULO2=
            "CREATE TABLE " + tableModulo2 + "(" +
                    MODULO2_ID  + " TEXT PRIMARY KEY," +
                    MODULO2_P0_0 + " TEXT," +
                    MODULO2_P0_1 + " TEXT," +
                    MODULO2_P0_2 + " TEXT," +
                    MODULO2_P0_3 + " TEXT," +
                    MODULO2_P1 + " TEXT," +
                    MODULO2_P2 + " TEXT," +
                    MODULO2_P3 + " TEXT," +
                    MODULO2_P4 + " TEXT," +
                    MODULO2_P5_0_1 + " TEXT," +
                    MODULO2_P5_0_2 + " TEXT," +
                    MODULO2_P5_0_3 + " TEXT," +
                    MODULO2_P5_0_4 + " TEXT," +
                    MODULO2_P5_0_5 + " TEXT," +
                    MODULO2_P5_1_1 + " TEXT," +
                    MODULO2_P5_1_2 + " TEXT," +
                    MODULO2_P5_1_3 + " TEXT," +
                    MODULO2_P5_1_4 + " TEXT," +
                    MODULO2_P5_1_5 + " TEXT," +
                    MODULO2_P5_1_6 + " TEXT," +
                    MODULO2_P6 + " TEXT," +
                    MODULO2_P7 + " TEXT," +
                    MODULO2_P8_0_1 + " TEXT," +
                    MODULO2_P8_0_2 + " TEXT," +
                    MODULO2_P8_1_1 + " TEXT," +
                    MODULO2_P8_1_2 + " TEXT," +
                    MODULO2_P8_2_3 + " TEXT," +
                    MODULO2_P9_0_1 + " TEXT," +
                    MODULO2_P9_0_2 + " TEXT," +
                    MODULO2_P9_0_3 + " TEXT," +
                    MODULO2_P9_0_4 + " TEXT," +
                    MODULO2_P9_0_5 + " TEXT," +
                    MODULO2_P9_1_1 + " TEXT," +
                    MODULO2_P9_1_2 + " TEXT," +
                    MODULO2_P9_1_3 + " TEXT," +
                    MODULO2_P9_1_4 + " TEXT," +
                    MODULO2_P9_1_4_0 + " TEXT," +
                    MODULO2_P9_1_5 + " TEXT," +
                    MODULO2_P9_1_6 + " TEXT," +
                    MODULO2_P10_1_1 + " TEXT," +
                    MODULO2_P10_1_2 + " TEXT," +
                    MODULO2_P10_1_3 + " TEXT," +
                    MODULO2_P10_1_4 + " TEXT," +
                    MODULO2_P10_1_5 + " TEXT," +
                    MODULO2_P10_1_6 + " TEXT," +
                    MODULO2_P10_1_6_0 + " TEXT," +
                    MODULO2_P10_2_2 + " TEXT," +
                    MODULO2_P10_2_3 + " TEXT," +
                    MODULO2_P10_2_4 + " TEXT," +
                    MODULO2_P10_2_5 + " TEXT," +
                    MODULO2_P10_2_6 + " TEXT," +
                    MODULO2_P11_1_1 + " TEXT," +
                    MODULO2_P11_1_2 + " TEXT," +
                    MODULO2_P11_1_3 + " TEXT," +
                    MODULO2_P11_1_4 + " TEXT," +
                    MODULO2_P11_1_5 + " TEXT," +
                    MODULO2_P11_1_6 + " TEXT," +
                    MODULO2_P11_1_7 + " TEXT," +
                    MODULO2_P11_1_7_0 + " TEXT," +
                    MODULO2_P11_2_2 + " TEXT," +
                    MODULO2_P11_2_3 + " TEXT," +
                    MODULO2_P11_2_4 + " TEXT," +
                    MODULO2_P11_2_5 + " TEXT," +
                    MODULO2_P11_2_6 + " TEXT," +
                    MODULO2_P11_2_7 + " TEXT," +
                    MODULO2_P12_1 + " TEXT," +
                    MODULO2_P12_2 + " TEXT," +
                    MODULO2_P12_3 + " TEXT," +
                    MODULO2_P12_3_0 + " TEXT," +
                    MODULO2_P13_1_1 + " TEXT," +
                    MODULO2_P13_1_2 + " TEXT," +
                    MODULO2_P13_1_3 + " TEXT," +
                    MODULO2_P13_1_4 + " TEXT," +
                    MODULO2_P13_1_5 + " TEXT," +
                    MODULO2_P13_1_6 + " TEXT," +
                    MODULO2_P13_1_7 + " TEXT," +
                    MODULO2_P13_1_7_0 + " TEXT," +
                    MODULO2_P13_2_2 + " TEXT," +
                    MODULO2_P13_2_3 + " TEXT," +
                    MODULO2_P13_2_4 + " TEXT," +
                    MODULO2_P13_2_5 + " TEXT," +
                    MODULO2_P13_2_6 + " TEXT," +
                    MODULO2_P13_2_7 + " TEXT," +
                    MODULO2_P14 + " TEXT," +
                    MODULO2_P15_1 + " TEXT," +
                    MODULO2_P15_2 + " TEXT," +
                    MODULO2_P15_3 + " TEXT," +
                    MODULO2_P15_4 + " TEXT," +
                    MODULO2_P15_5 + " TEXT," +
                    MODULO2_P15_6 + " TEXT," +
                    MODULO2_P15_6_0 + " TEXT," +
                    MODULO2_P16_1_1 + " TEXT," +
                    MODULO2_P16_1_2 + " TEXT," +
                    MODULO2_P16_1_3 + " TEXT," +
                    MODULO2_P16_1_4 + " TEXT," +
                    MODULO2_P16_1_5 + " TEXT," +
                    MODULO2_P16_1_6 + " TEXT," +
                    MODULO2_P16_1_6_0 + " TEXT," +
                    MODULO2_P17 + " TEXT," +
                    MODULO2_P18_1_1 + " TEXT," +
                    MODULO2_P18_1_2 + " TEXT," +
                    MODULO2_P18_1_3 + " TEXT," +
                    MODULO2_P18_1_4 + " TEXT," +
                    MODULO2_P18_1_5 + " TEXT," +
                    MODULO2_P18_1_6 + " TEXT," +
                    MODULO2_P18_1_7 + " TEXT," +
                    MODULO2_P18_1_7_0 + " TEXT," +
                    MODULO2_P18_2_1 + " TEXT," +
                    MODULO2_P18_2_2 + " TEXT," +
                    MODULO2_P18_2_3 + " TEXT," +
                    MODULO2_P18_2_4 + " TEXT," +
                    MODULO2_P18_2_5 + " TEXT," +
                    MODULO2_P18_2_6 + " TEXT," +
                    MODULO2_P18_2_7 + " TEXT," +
                    MODULO2_P19_1_1 + " TEXT," +
                    MODULO2_P19_1_2 + " TEXT," +
                    MODULO2_P19_1_3 + " TEXT," +
                    MODULO2_P19_1_4 + " TEXT," +
                    MODULO2_P19_1_5 + " TEXT," +
                    MODULO2_P19_1_5_0 + " TEXT," +
                    MODULO2_P19_2_1 + " TEXT," +
                    MODULO2_P19_2_2 + " TEXT," +
                    MODULO2_P19_2_3 + " TEXT," +
                    MODULO2_P19_2_4 + " TEXT," +
                    MODULO2_P19_2_5 + " TEXT," +
                    MODULO2_P20_1_1 + " TEXT," +
                    MODULO2_P20_1_2 + " TEXT," +
                    MODULO2_P20_1_3 + " TEXT," +
                    MODULO2_P20_1_4 + " TEXT," +
                    MODULO2_P20_1_5 + " TEXT," +
                    MODULO2_P20_1_6 + " TEXT," +
                    MODULO2_P20_1_7 + " TEXT," +
                    MODULO2_P20_1_8 + " TEXT," +
                    MODULO2_P20_1_8_0 + " TEXT," +
                    MODULO2_P20_2_1 + " TEXT," +
                    MODULO2_P20_2_2 + " TEXT," +
                    MODULO2_P20_2_3 + " TEXT," +
                    MODULO2_P20_2_4 + " TEXT," +
                    MODULO2_P20_2_5 + " TEXT," +
                    MODULO2_P20_2_6 + " TEXT," +
                    MODULO2_P20_2_7 + " TEXT," +
                    MODULO2_P20_2_8 + " TEXT," +
                    MODULO2_P21 + " TEXT," +
                    MODULO2_P22_1_1 + " TEXT," +
                    MODULO2_P22_1_2 + " TEXT," +
                    MODULO2_P22_1_3 + " TEXT," +
                    MODULO2_P22_1_4 + " TEXT," +
                    MODULO2_P22_1_5 + " TEXT," +
                    MODULO2_P22_1_6 + " TEXT," +
                    MODULO2_P22_1_6_0 + " TEXT," +
                    MODULO2_P22_2_1 + " TEXT," +
                    MODULO2_P22_2_2 + " TEXT," +
                    MODULO2_P22_2_3 + " TEXT," +
                    MODULO2_P22_2_4 + " TEXT," +
                    MODULO2_P22_2_5 + " TEXT," +
                    MODULO2_P22_2_6 + " TEXT," +
                    MODULO2_P23 + " TEXT," +
                    MODULO2_P24 + " TEXT," +
                    MODULO2_P25 + " TEXT," +
                    MODULO2_P25_T + " TEXT," +
                    MODULO2_P25_H + " TEXT," +
                    MODULO2_P25_M + " TEXT," +
                    MODULO2_OBS_MOD_II  + " TEXT," +
                    MODULO2_USUCREACION + " TEXT," +
                    MODULO2_FECCREACION + " TEXT," +
                    MODULO2_USUREGISTRO + " TEXT," +
                    MODULO2_FECREGISTRO + " TEXT" + ");"
                   ;

    //TABLA MODULO3
    public static final String SQL_CREATE_TABLA_MODULO3 =
            "CREATE TABLE " + tableModulo3 + "(" +
                    MODULO3_ID  + " TEXT PRIMARY KEY," +
                    MODULO3_P0_0  + " TEXT," +
                    MODULO3_P0_1  + " TEXT," +
                    MODULO3_P0_2  + " TEXT," +
                    MODULO3_P0_3  + " TEXT," +
                    MODULO3_P1  + " TEXT," +
                    MODULO3_P2  + " TEXT," +
                    MODULO3_P3  + " TEXT," +
                    MODULO3_P4  + " TEXT," +
                    MODULO3_P5  + " TEXT," +
                    MODULO3_P5_1  + " TEXT," +
                    MODULO3_P6  + " TEXT," +
                    MODULO3_P7  + " TEXT," +
                    MODULO3_P8  + " TEXT," +
                    MODULO3_P9  + " TEXT," +
                    MODULO3_P10  + " TEXT," +
                    MODULO3_P11  + " TEXT," +
                    MODULO3_P12  + " TEXT," +
                    MODULO3_OBS_MOD_III  + " TEXT," +
                    MODULO3_USUCREACION + " TEXT," +
                    MODULO3_FECCREACION + " TEXT," +
                    MODULO3_USUREGISTRO + " TEXT," +
                    MODULO3_FECREGISTRO + " TEXT" + ");"
            ;
    //TABLA MODULO4
    public static final String SQL_CREATE_TABLA_MODULO4 =
            "CREATE TABLE " + tableModulo4 + "(" +
                    MODULO4_ID  + " TEXT PRIMARY KEY," +
                    MODULO4_P0_0  + " TEXT," +
                    MODULO4_P0_1  + " TEXT," +
                    MODULO4_P0_2  + " TEXT," +
                    MODULO4_P0_3  + " TEXT," +
                    MODULO4_P1  + " TEXT," +
                    MODULO4_P2  + " TEXT," +
                    MODULO4_P3  + " TEXT," +
                    MODULO4_P4  + " TEXT," +
                    MODULO4_P5  + " TEXT," +
                    MODULO4_P6  + " TEXT," +
                    MODULO4_P7  + " TEXT," +
                    MODULO4_P8_1_1  + " TEXT," +
                    MODULO4_P8_1_2  + " TEXT," +
                    MODULO4_P8_1_3  + " TEXT," +
                    MODULO4_P8_1_4  + " TEXT," +
                    MODULO4_P8_1_5  + " TEXT," +
                    MODULO4_P8_1_6  + " TEXT," +
                    MODULO4_P8_1_7  + " TEXT," +
                    MODULO4_P8_1_8  + " TEXT," +
                    MODULO4_P8_1_9  + " TEXT," +
                    MODULO4_P8_1_10  + " TEXT," +
                    MODULO4_P8_1_11  + " TEXT," +
                    MODULO4_P8_1_12  + " TEXT," +
                    MODULO4_P8_1_13  + " TEXT," +
                    MODULO4_P8_1_14  + " TEXT," +
                    MODULO4_P8_1_15  + " TEXT," +
                    MODULO4_P8_1_16  + " TEXT," +
                    MODULO4_P8_1_17  + " TEXT," +
                    MODULO4_P8_1_18  + " TEXT," +
                    MODULO4_P8_1_17_0  + " TEXT," +
                    MODULO4_P8_2_1  + " TEXT," +
                    MODULO4_P8_2_2  + " TEXT," +
                    MODULO4_P8_2_3  + " TEXT," +
                    MODULO4_P8_2_4  + " TEXT," +
                    MODULO4_P8_2_5  + " TEXT," +
                    MODULO4_P8_2_6  + " TEXT," +
                    MODULO4_P8_2_7  + " TEXT," +
                    MODULO4_P8_2_8  + " TEXT," +
                    MODULO4_P8_2_9  + " TEXT," +
                    MODULO4_P8_2_10  + " TEXT," +
                    MODULO4_P8_2_11  + " TEXT," +
                    MODULO4_P8_2_12  + " TEXT," +
                    MODULO4_P8_2_13  + " TEXT," +
                    MODULO4_P8_2_14  + " TEXT," +
                    MODULO4_P8_2_15  + " TEXT," +
                    MODULO4_P8_2_16  + " TEXT," +
                    MODULO4_P8_2_17  + " TEXT," +
                    MODULO4_P9_1  + " TEXT," +
                    MODULO4_P9_2  + " TEXT," +
                    MODULO4_P9_3  + " TEXT," +
                    MODULO4_P9_4  + " TEXT," +
                    MODULO4_P10  + " TEXT," +
                    MODULO4_OBS_MOD_IV  + " TEXT," +
                    MODULO4_USUCREACION + " TEXT," +
                    MODULO4_FECCREACION + " TEXT," +
                    MODULO4_USUREGISTRO + " TEXT," +
                    MODULO4_FECREGISTRO + " TEXT" + ");"
            ;
    //TABLA MODULO5
    public static final String SQL_CREATE_TABLA_MODULO5 =
            "CREATE TABLE " + tableModulo5 + "(" +
                    MODULO5_ID  + " TEXT PRIMARY KEY," +
                    MODULO5_P0_0  + " TEXT," +
                    MODULO5_P0_1  + " TEXT," +
                    MODULO5_P0_2  + " TEXT," +
                    MODULO5_P0_3  + " TEXT," +
                    MODULO5_P1  + " TEXT," +
                    MODULO5_P1_0_1  + " TEXT," +
                    MODULO5_P1_0_2  + " TEXT," +
                    MODULO5_P1_0_3  + " TEXT," +
                    MODULO5_P1_0_4  + " TEXT," +
                    MODULO5_P1_0_5  + " TEXT," +
                    MODULO5_P1_0_6  + " TEXT," +
                    MODULO5_P1_0_7  + " TEXT," +
                    MODULO5_P1_0_8  + " TEXT," +
                    MODULO5_P1_0_9  + " TEXT," +
                    MODULO5_P1_1_1  + " TEXT," +
                    MODULO5_P1_1_2  + " TEXT," +
                    MODULO5_P1_1_3  + " TEXT," +
                    MODULO5_P1_1_4  + " TEXT," +
                    MODULO5_P1_1_5  + " TEXT," +
                    MODULO5_P1_1_6  + " TEXT," +
                    MODULO5_P1_1_7  + " TEXT," +
                    MODULO5_P1_1_8  + " TEXT," +
                    MODULO5_P1_1_9  + " TEXT," +
                    MODULO5_P1_1_10  + " TEXT," +
                    MODULO5_P1_2_1  + " TEXT," +
                    MODULO5_P1_2_2  + " TEXT," +
                    MODULO5_P1_2_3  + " TEXT," +
                    MODULO5_P1_2_4  + " TEXT," +
                    MODULO5_P1_2_5  + " TEXT," +
                    MODULO5_P1_2_6  + " TEXT," +
                    MODULO5_P1_2_7  + " TEXT," +
                    MODULO5_P1_2_8  + " TEXT," +
                    MODULO5_P1_2_9  + " TEXT," +
                    MODULO5_P1_2_10  + " TEXT," +
                    MODULO5_P2  + " TEXT," +
                    MODULO5_P2_0_1  + " TEXT," +
                    MODULO5_P2_0_2  + " TEXT," +
                    MODULO5_P2_0_3  + " TEXT," +
                    MODULO5_P2_0_4  + " TEXT," +
                    MODULO5_P2_0_5  + " TEXT," +
                    MODULO5_P2_0_6  + " TEXT," +
                    MODULO5_P2_0_7  + " TEXT," +
                    MODULO5_P2_0_8  + " TEXT," +
                    MODULO5_P2_0_9  + " TEXT," +
                    MODULO5_P2_1_1  + " TEXT," +
                    MODULO5_P2_1_2  + " TEXT," +
                    MODULO5_P2_1_3  + " TEXT," +
                    MODULO5_P2_1_4  + " TEXT," +
                    MODULO5_P2_1_5  + " TEXT," +
                    MODULO5_P2_1_6  + " TEXT," +
                    MODULO5_P2_1_7  + " TEXT," +
                    MODULO5_P2_1_8  + " TEXT," +
                    MODULO5_P2_1_9  + " TEXT," +
                    MODULO5_P2_2_1  + " TEXT," +
                    MODULO5_P2_2_2  + " TEXT," +
                    MODULO5_P2_2_3  + " TEXT," +
                    MODULO5_P2_2_4  + " TEXT," +
                    MODULO5_P2_2_5  + " TEXT," +
                    MODULO5_P2_2_6  + " TEXT," +
                    MODULO5_P2_2_7  + " TEXT," +
                    MODULO5_P2_2_8  + " TEXT," +
                    MODULO5_P2_2_9  + " TEXT," +
                    MODULO5_P2_2_10  + " TEXT," +
                    MODULO5_P2_3_1  + " TEXT," +
                    MODULO5_P2_3_2  + " TEXT," +
                    MODULO5_P2_3_3  + " TEXT," +
                    MODULO5_P2_3_4  + " TEXT," +
                    MODULO5_P2_3_5  + " TEXT," +
                    MODULO5_P2_3_6  + " TEXT," +
                    MODULO5_P2_3_7  + " TEXT," +
                    MODULO5_P2_3_8  + " TEXT," +
                    MODULO5_P2_3_9  + " TEXT," +
                    MODULO5_P2_3_10  + " TEXT," +
                    MODULO5_P3_1_1  + " TEXT," +
                    MODULO5_P3_1_2  + " TEXT," +
                    MODULO5_P3_1_3  + " TEXT," +
                    MODULO5_P3_1_4  + " TEXT," +
                    MODULO5_P3_1_5  + " TEXT," +
                    MODULO5_P3_1_6  + " TEXT," +
                    MODULO5_P3_1_7  + " TEXT," +
                    MODULO5_P3_1_8  + " TEXT," +
                    MODULO5_P3_1_9  + " TEXT," +
                    MODULO5_P3_1_10  + " TEXT," +
                    MODULO5_P3_1_11  + " TEXT," +
                    MODULO5_P3_1_12  + " TEXT," +
                    MODULO5_P3_1_12_0  + " TEXT," +
                    MODULO5_P3_2_1  + " TEXT," +
                    MODULO5_P3_2_2  + " TEXT," +
                    MODULO5_P3_2_3  + " TEXT," +
                    MODULO5_P3_2_4  + " TEXT," +
                    MODULO5_P3_2_5  + " TEXT," +
                    MODULO5_P3_2_6  + " TEXT," +
                    MODULO5_P3_2_7  + " TEXT," +
                    MODULO5_P3_2_8  + " TEXT," +
                    MODULO5_P3_2_9  + " TEXT," +
                    MODULO5_P3_2_10  + " TEXT," +
                    MODULO5_P3_2_11  + " TEXT," +
                    MODULO5_P3_2_12  + " TEXT," +
                    MODULO5_P4_1_1  + " TEXT," +
                    MODULO5_P4_1_2  + " TEXT," +
                    MODULO5_P4_1_3  + " TEXT," +
                    MODULO5_P4_1_4  + " TEXT," +
                    MODULO5_P4_1_5  + " TEXT," +
                    MODULO5_P4_1_6  + " TEXT," +
                    MODULO5_P4_1_7  + " TEXT," +
                    MODULO5_P4_1_8  + " TEXT," +
                    MODULO5_P4_2_1  + " TEXT," +
                    MODULO5_P4_2_2  + " TEXT," +
                    MODULO5_P4_2_3  + " TEXT," +
                    MODULO5_P4_2_4  + " TEXT," +
                    MODULO5_P4_2_5  + " TEXT," +
                    MODULO5_P4_2_6  + " TEXT," +
                    MODULO5_P4_2_7  + " TEXT," +
                    MODULO5_P4_2_8  + " TEXT," +
                    MODULO5_P5_1  + " TEXT," +
                    MODULO5_P5_2  + " TEXT," +
                    MODULO5_P5_3  + " TEXT," +
                    MODULO5_P5_4  + " TEXT," +
                    MODULO5_P5_5  + " TEXT," +
                    MODULO5_P5_6  + " TEXT," +
                    MODULO5_P6  + " TEXT," +
                    MODULO5_P7_1  + " TEXT," +
                    MODULO5_P7_2  + " TEXT," +
                    MODULO5_P7_3  + " TEXT," +
                    MODULO5_P7_4  + " TEXT," +
                    MODULO5_P7_5  + " TEXT," +
                    MODULO5_P7_5_0  + " TEXT," +
                    MODULO5_P7_1_1  + " TEXT," +
                    MODULO5_P7_2_1  + " TEXT," +
                    MODULO5_P7_3_1  + " TEXT," +
                    MODULO5_P7_4_1  + " TEXT," +
                    MODULO5_P7_5_1  + " TEXT," +
                    MODULO5_P7_6_1  + " TEXT," +
                    MODULO5_P7_6_1_0  + " TEXT," +
                    MODULO5_P7_7_1  + " TEXT," +
                    MODULO5_P7_1_2  + " TEXT," +
                    MODULO5_P7_2_2  + " TEXT," +
                    MODULO5_P7_3_2  + " TEXT," +
                    MODULO5_P7_4_2  + " TEXT," +
                    MODULO5_P7_5_2  + " TEXT," +
                    MODULO5_P7_6_2  + " TEXT," +
                    MODULO5_P7_6_2_0  + " TEXT," +
                    MODULO5_P7_7_2  + " TEXT," +
                    MODULO5_P7_1_3  + " TEXT," +
                    MODULO5_P7_2_3  + " TEXT," +
                    MODULO5_P7_3_3  + " TEXT," +
                    MODULO5_P7_4_3  + " TEXT," +
                    MODULO5_P7_5_3  + " TEXT," +
                    MODULO5_P7_6_3  + " TEXT," +
                    MODULO5_P7_6_3_0  + " TEXT," +
                    MODULO5_P7_7_3  + " TEXT," +
                    MODULO5_P7_1_4  + " TEXT," +
                    MODULO5_P7_2_4  + " TEXT," +
                    MODULO5_P7_3_4  + " TEXT," +
                    MODULO5_P7_4_4  + " TEXT," +
                    MODULO5_P7_5_4  + " TEXT," +
                    MODULO5_P7_6_4  + " TEXT," +
                    MODULO5_P7_6_4_0  + " TEXT," +
                    MODULO5_P7_7_4  + " TEXT," +
                    MODULO5_P7_1_5  + " TEXT," +
                    MODULO5_P7_2_5  + " TEXT," +
                    MODULO5_P7_3_5  + " TEXT," +
                    MODULO5_P7_4_5  + " TEXT," +
                    MODULO5_P7_5_5  + " TEXT," +
                    MODULO5_P7_6_5  + " TEXT," +
                    MODULO5_P7_6_5_0  + " TEXT," +
                    MODULO5_P7_7_5  + " TEXT," +
                    MODULO5_P8  + " TEXT," +
                    MODULO5_P27_1_1  + " TEXT," +
                    MODULO5_P27_1_2  + " TEXT," +
                    MODULO5_P27_1_3  + " TEXT," +
                    MODULO5_P27_1_4  + " TEXT," +
                    MODULO5_P27_1_5  + " TEXT," +
                    MODULO5_P27_1_6  + " TEXT," +
                    MODULO5_P27_1_7  + " TEXT," +
                    MODULO5_P27_1_8  + " TEXT," +
                    MODULO5_P27_1_9  + " TEXT," +
                    MODULO5_P27_2_1  + " TEXT," +
                    MODULO5_P27_2_2  + " TEXT," +
                    MODULO5_P27_2_3  + " TEXT," +
                    MODULO5_P27_2_4  + " TEXT," +
                    MODULO5_P27_2_5  + " TEXT," +
                    MODULO5_P27_2_6  + " TEXT," +
                    MODULO5_P27_2_7  + " TEXT," +
                    MODULO5_P27_2_8  + " TEXT," +
                    MODULO5_P27_2_9  + " TEXT," +
                    MODULO5_OBS_MOD_V  + " TEXT," +
                    MODULO5_USUCREACION + " TEXT," +
                    MODULO5_FECCREACION + " TEXT," +
                    MODULO5_USUREGISTRO + " TEXT," +
                    MODULO5_FECREGISTRO + " TEXT" + ");"
            ;


    //TABLA MODULO5 DINAMICA
    public static final String SQL_CREATE_TABLA_MODULO5_DINAMICA =
            "CREATE TABLE " + tableModulo5Dinamica + "(" +
                    MODULO5_IDOCUPACION  + " INTEGER PRIMARY KEY AUTOINCREMENT," +
                    MODULO5_IDEMPRESA  + " TEXT," +
                    MODULO5_P9_1_0 + " TEXT," +
                    MODULO5_P9_1_1  + " TEXT," +
                    MODULO5_P9_2_1  + " TEXT," +
                    MODULO5_P9_3_1  + " TEXT," +
                    MODULO5_P10_1_1  + " TEXT," +
                    MODULO5_P10_2_1  + " TEXT," +
                    MODULO5_P11_1_1  + " TEXT," +
                    MODULO5_P11_2_1  + " TEXT," +
                    MODULO5_P12  + " TEXT," +
                    MODULO5_P13  + " TEXT," +
                    MODULO5_P14  + " TEXT," +
                    MODULO5_P15  + " TEXT," +
                    MODULO5_P16  + " TEXT," +
                    MODULO5_P17_0  + " TEXT," +
                    MODULO5_P17_1  + " TEXT," +
                    MODULO5_P17_2  + " TEXT," +
                    MODULO5_P17_3  + " TEXT," +
                    MODULO5_P17_4  + " TEXT," +
                    MODULO5_P17_5  + " TEXT," +
                    MODULO5_P17_6  + " TEXT," +
                    MODULO5_P17_7  + " TEXT," +
                    MODULO5_P17_8  + " TEXT," +
                    MODULO5_P17_9  + " TEXT," +
                    MODULO5_P17_10  + " TEXT," +
                    MODULO5_P17_11  + " TEXT," +
                    MODULO5_P17_12  + " TEXT," +
                    MODULO5_P17_13  + " TEXT," +
                    MODULO5_P17_14  + " TEXT," +
                    MODULO5_P17_15  + " TEXT," +
                    MODULO5_P17_16  + " TEXT," +
                    MODULO5_P17_17  + " TEXT," +
                    MODULO5_P17_18  + " TEXT," +
                    MODULO5_P17_19  + " TEXT," +
                    MODULO5_P17_20  + " TEXT," +
                    MODULO5_P17_19_0  + " TEXT," +
                    MODULO5_P18  + " TEXT," +
                    MODULO5_P19  + " TEXT," +
                    MODULO5_P20  + " TEXT," +
                    MODULO5_P21_0  + " TEXT," +
                    MODULO5_P21_1  + " TEXT," +
                    MODULO5_P21_2  + " TEXT," +
                    MODULO5_P21_3  + " TEXT," +
                    MODULO5_P21_4  + " TEXT," +
                    MODULO5_P21_5  + " TEXT," +
                    MODULO5_P21_6  + " TEXT," +
                    MODULO5_P21_7  + " TEXT," +
                    MODULO5_P21_7_0  + " TEXT," +
                    MODULO5_P22_1_1  + " TEXT," +
                    MODULO5_P22_2_1  + " TEXT," +
                    MODULO5_P23_0  + " TEXT," +
                    MODULO5_P23_1  + " TEXT," +
                    MODULO5_P23_2  + " TEXT," +
                    MODULO5_P23_3  + " TEXT," +
                    MODULO5_P23_4  + " TEXT," +
                    MODULO5_P23_5  + " TEXT," +
                    MODULO5_P23_6  + " TEXT," +
                    MODULO5_P23_7  + " TEXT," +
                    MODULO5_P23_8  + " TEXT," +
                    MODULO5_P23_9  + " TEXT," +
                    MODULO5_P23_9_0  + " TEXT," +
                    MODULO5_P24_0  + " TEXT," +
                    MODULO5_P24_1  + " TEXT," +
                    MODULO5_P24_2  + " TEXT," +
                    MODULO5_P24_3  + " TEXT," +
                    MODULO5_P24_4  + " TEXT," +
                    MODULO5_P24_5  + " TEXT," +
                    MODULO5_P24_6  + " TEXT," +
                    MODULO5_P24_7  + " TEXT," +
                    MODULO5_P24_8  + " TEXT," +
                    MODULO5_P24_9  + " TEXT," +
                    MODULO5_P24_10  + " TEXT," +
                    MODULO5_P25  + " TEXT," +
                    MODULO5_P26  + " TEXT," +
                    MODULO5_2_USUCREACION + " TEXT," +
                    MODULO5_2_FECCREACION + " TEXT," +
                    MODULO5_2_USUREGISTRO + " TEXT," +
                    MODULO5_2_FECREGISTRO + " TEXT" + ");"
            ;

    //TABLA MODULO6
    public static final String SQL_CREATE_TABLA_MODULO6 =
            "CREATE TABLE " + tableModulo6 + "(" +
                    MODULO6_ID  + " TEXT PRIMARY KEY," +
                    MODULO6_P0_0  + " TEXT," +
                    MODULO6_P0_1  + " TEXT," +
                    MODULO6_P0_2  + " TEXT," +
                    MODULO6_P0_3  + " TEXT," +
                    MODULO6_P1  + " TEXT," +
                    MODULO6_P2  + " TEXT," +
                    MODULO6_P2_1  + " TEXT," +
                    MODULO6_P2_2  + " TEXT," +
                    MODULO6_P3  + " TEXT," +
                    MODULO6_P3_1_1  + " TEXT," +
                    MODULO6_P3_1_2  + " TEXT," +
                    MODULO6_P3_1_3  + " TEXT," +
                    MODULO6_P3_1_4  + " TEXT," +
                    MODULO6_P3_1_5  + " TEXT," +
                    MODULO6_P3_1_6  + " TEXT," +
                    MODULO6_P3_1_7  + " TEXT," +
                    MODULO6_P3_1_8  + " TEXT," +
                    MODULO6_P3_1_9  + " TEXT," +
                    MODULO6_P3_1_10  + " TEXT," +
                    MODULO6_P3_2_1  + " TEXT," +
                    MODULO6_P3_2_2  + " TEXT," +
                    MODULO6_P3_2_3  + " TEXT," +
                    MODULO6_P3_2_4  + " TEXT," +
                    MODULO6_P3_2_5  + " TEXT," +
                    MODULO6_P3_2_6  + " TEXT," +
                    MODULO6_P3_2_7  + " TEXT," +
                    MODULO6_P3_2_8  + " TEXT," +
                    MODULO6_P3_2_9  + " TEXT," +
                    MODULO6_P3_2_10  + " TEXT," +
                    MODULO6_P4_1_1  + " TEXT," +
                    MODULO6_P4_1_2  + " TEXT," +
                    MODULO6_P4_1_3  + " TEXT," +
                    MODULO6_P4_1_4  + " TEXT," +
                    MODULO6_P4_1_5  + " TEXT," +
                    MODULO6_P4_1_6  + " TEXT," +
                    MODULO6_P4_1_6_0  + " TEXT," +
                    MODULO6_P4_2_1  + " TEXT," +
                    MODULO6_P4_2_2  + " TEXT," +
                    MODULO6_P4_2_3  + " TEXT," +
                    MODULO6_P4_2_4  + " TEXT," +
                    MODULO6_P4_2_5  + " TEXT," +
                    MODULO6_P4_2_6  + " TEXT," +
                    MODULO6_P4_2_6_0  + " TEXT," +
                    MODULO6_P4_3_1  + " TEXT," +
                    MODULO6_P4_3_2  + " TEXT," +
                    MODULO6_P4_3_3  + " TEXT," +
                    MODULO6_P4_3_4  + " TEXT," +
                    MODULO6_P4_3_5  + " TEXT," +
                    MODULO6_P4_3_6  + " TEXT," +
                    MODULO6_P4_3_6_0  + " TEXT," +
                    MODULO6_P4_4_1  + " TEXT," +
                    MODULO6_P4_4_2  + " TEXT," +
                    MODULO6_P4_4_3  + " TEXT," +
                    MODULO6_P4_4_4  + " TEXT," +
                    MODULO6_P4_4_5  + " TEXT," +
                    MODULO6_P4_4_6  + " TEXT," +
                    MODULO6_P4_4_6_0  + " TEXT," +
                    MODULO6_P4_5_1  + " TEXT," +
                    MODULO6_P4_5_2  + " TEXT," +
                    MODULO6_P4_5_3  + " TEXT," +
                    MODULO6_P4_5_4  + " TEXT," +
                    MODULO6_P4_5_5  + " TEXT," +
                    MODULO6_P4_5_6  + " TEXT," +
                    MODULO6_P4_5_6_0  + " TEXT," +
                    MODULO6_P4_6_1  + " TEXT," +
                    MODULO6_P4_6_2  + " TEXT," +
                    MODULO6_P4_6_3  + " TEXT," +
                    MODULO6_P4_6_4  + " TEXT," +
                    MODULO6_P4_6_5  + " TEXT," +
                    MODULO6_P4_6_6  + " TEXT," +
                    MODULO6_P4_6_6_0  + " TEXT," +
                    MODULO6_P4_7_1  + " TEXT," +
                    MODULO6_P4_7_2  + " TEXT," +
                    MODULO6_P4_7_3  + " TEXT," +
                    MODULO6_P4_7_4  + " TEXT," +
                    MODULO6_P4_7_5  + " TEXT," +
                    MODULO6_P4_7_6  + " TEXT," +
                    MODULO6_P4_7_6_0  + " TEXT," +
                    MODULO6_P4_8_1  + " TEXT," +
                    MODULO6_P4_8_2  + " TEXT," +
                    MODULO6_P4_8_3  + " TEXT," +
                    MODULO6_P4_8_4  + " TEXT," +
                    MODULO6_P4_8_5  + " TEXT," +
                    MODULO6_P4_8_6  + " TEXT," +
                    MODULO6_P4_8_6_0  + " TEXT," +
                    MODULO6_P4_9_1  + " TEXT," +
                    MODULO6_P4_9_2  + " TEXT," +
                    MODULO6_P4_9_3  + " TEXT," +
                    MODULO6_P4_9_4  + " TEXT," +
                    MODULO6_P4_9_5  + " TEXT," +
                    MODULO6_P4_9_6  + " TEXT," +
                    MODULO6_P4_9_6_0  + " TEXT," +
                    MODULO6_P5_1_1  + " TEXT," +
                    MODULO6_P5_1_2  + " TEXT," +
                    MODULO6_P5_1_3  + " TEXT," +
                    MODULO6_P5_1_4  + " TEXT," +
                    MODULO6_P5_1_5  + " TEXT," +
                    MODULO6_P5_1_6  + " TEXT," +
                    MODULO6_P5_1_7  + " TEXT," +
                    MODULO6_P5_1_8  + " TEXT," +
                    MODULO6_P5_1_9  + " TEXT," +
                    MODULO6_P5_1_10  + " TEXT," +
                    MODULO6_P5_1_11  + " TEXT," +
                    MODULO6_P5_1_12  + " TEXT," +
                    MODULO6_P5_1_13  + " TEXT," +
                    MODULO6_P5_1_14  + " TEXT," +
                    MODULO6_P5_1_15  + " TEXT," +
                    MODULO6_P5_1_16  + " TEXT," +
                    MODULO6_P5_1_17  + " TEXT," +
                    MODULO6_P5_1_18  + " TEXT," +
                    MODULO6_P5_1_19  + " TEXT," +
                    MODULO6_P5_1_19_0  + " TEXT," +
                    MODULO6_P5_1_20  + " TEXT," +
                    MODULO6_P5_2_1  + " TEXT," +
                    MODULO6_P5_2_2  + " TEXT," +
                    MODULO6_P5_2_3  + " TEXT," +
                    MODULO6_P5_2_4  + " TEXT," +
                    MODULO6_P5_2_5  + " TEXT," +
                    MODULO6_P5_2_6  + " TEXT," +
                    MODULO6_P5_2_7  + " TEXT," +
                    MODULO6_P5_2_8  + " TEXT," +
                    MODULO6_P5_2_9  + " TEXT," +
                    MODULO6_P5_2_10  + " TEXT," +
                    MODULO6_P5_2_11  + " TEXT," +
                    MODULO6_P5_2_12  + " TEXT," +
                    MODULO6_P5_2_13  + " TEXT," +
                    MODULO6_P5_2_14  + " TEXT," +
                    MODULO6_P5_2_15  + " TEXT," +
                    MODULO6_P5_2_16  + " TEXT," +
                    MODULO6_P5_2_17  + " TEXT," +
                    MODULO6_P5_2_18  + " TEXT," +
                    MODULO6_P5_2_19  + " TEXT," +
                    MODULO6_P5_2_19_0  + " TEXT," +
                    MODULO6_P5_2_20  + " TEXT," +
                    MODULO6_P5_3_1  + " TEXT," +
                    MODULO6_P5_3_2  + " TEXT," +
                    MODULO6_P5_3_3  + " TEXT," +
                    MODULO6_P5_3_4  + " TEXT," +
                    MODULO6_P5_3_5  + " TEXT," +
                    MODULO6_P5_3_6  + " TEXT," +
                    MODULO6_P5_3_7  + " TEXT," +
                    MODULO6_P5_3_8  + " TEXT," +
                    MODULO6_P5_3_9  + " TEXT," +
                    MODULO6_P5_3_10  + " TEXT," +
                    MODULO6_P5_3_11  + " TEXT," +
                    MODULO6_P5_3_12  + " TEXT," +
                    MODULO6_P5_3_13  + " TEXT," +
                    MODULO6_P5_3_14  + " TEXT," +
                    MODULO6_P5_3_15  + " TEXT," +
                    MODULO6_P5_3_16  + " TEXT," +
                    MODULO6_P5_3_17  + " TEXT," +
                    MODULO6_P5_3_18  + " TEXT," +
                    MODULO6_P5_3_19  + " TEXT," +
                    MODULO6_P5_3_19_0  + " TEXT," +
                    MODULO6_P5_3_20  + " TEXT," +
                    MODULO6_P5_4_1  + " TEXT," +
                    MODULO6_P5_4_2  + " TEXT," +
                    MODULO6_P5_4_3  + " TEXT," +
                    MODULO6_P5_4_4  + " TEXT," +
                    MODULO6_P5_4_5  + " TEXT," +
                    MODULO6_P5_4_6  + " TEXT," +
                    MODULO6_P5_4_7  + " TEXT," +
                    MODULO6_P5_4_8  + " TEXT," +
                    MODULO6_P5_4_9  + " TEXT," +
                    MODULO6_P5_4_10  + " TEXT," +
                    MODULO6_P5_4_11  + " TEXT," +
                    MODULO6_P5_4_12  + " TEXT," +
                    MODULO6_P5_4_13  + " TEXT," +
                    MODULO6_P5_4_14  + " TEXT," +
                    MODULO6_P5_4_15  + " TEXT," +
                    MODULO6_P5_4_16  + " TEXT," +
                    MODULO6_P5_4_17  + " TEXT," +
                    MODULO6_P5_4_18  + " TEXT," +
                    MODULO6_P5_4_19  + " TEXT," +
                    MODULO6_P5_4_19_0  + " TEXT," +
                    MODULO6_P5_4_20  + " TEXT," +
                    MODULO6_P5_5_1  + " TEXT," +
                    MODULO6_P5_5_2  + " TEXT," +
                    MODULO6_P5_5_3  + " TEXT," +
                    MODULO6_P5_5_4  + " TEXT," +
                    MODULO6_P5_5_5  + " TEXT," +
                    MODULO6_P5_5_6  + " TEXT," +
                    MODULO6_P5_5_7  + " TEXT," +
                    MODULO6_P5_5_8  + " TEXT," +
                    MODULO6_P5_5_9  + " TEXT," +
                    MODULO6_P5_5_10  + " TEXT," +
                    MODULO6_P5_5_11  + " TEXT," +
                    MODULO6_P5_5_12  + " TEXT," +
                    MODULO6_P5_5_13  + " TEXT," +
                    MODULO6_P5_5_14  + " TEXT," +
                    MODULO6_P5_5_15  + " TEXT," +
                    MODULO6_P5_5_16  + " TEXT," +
                    MODULO6_P5_5_17  + " TEXT," +
                    MODULO6_P5_5_18  + " TEXT," +
                    MODULO6_P5_5_19  + " TEXT," +
                    MODULO6_P5_5_19_0  + " TEXT," +
                    MODULO6_P5_6_1  + " TEXT," +
                    MODULO6_P5_6_2  + " TEXT," +
                    MODULO6_P5_5_20  + " TEXT," +
                    MODULO6_P5_6_3  + " TEXT," +
                    MODULO6_P5_6_4  + " TEXT," +
                    MODULO6_P5_6_5  + " TEXT," +
                    MODULO6_P5_6_6  + " TEXT," +
                    MODULO6_P5_6_7  + " TEXT," +
                    MODULO6_P5_6_8  + " TEXT," +
                    MODULO6_P5_6_9  + " TEXT," +
                    MODULO6_P5_6_10  + " TEXT," +
                    MODULO6_P5_6_11  + " TEXT," +
                    MODULO6_P5_6_12  + " TEXT," +
                    MODULO6_P5_6_13  + " TEXT," +
                    MODULO6_P5_6_14  + " TEXT," +
                    MODULO6_P5_6_15  + " TEXT," +
                    MODULO6_P5_6_16  + " TEXT," +
                    MODULO6_P5_6_17  + " TEXT," +
                    MODULO6_P5_6_18  + " TEXT," +
                    MODULO6_P5_6_19  + " TEXT," +
                    MODULO6_P5_6_19_0  + " TEXT," +
                    MODULO6_P5_6_20  + " TEXT," +
                    MODULO6_P5_7_1  + " TEXT," +
                    MODULO6_P5_7_2  + " TEXT," +
                    MODULO6_P5_7_3  + " TEXT," +
                    MODULO6_P5_7_4  + " TEXT," +
                    MODULO6_P5_7_5  + " TEXT," +
                    MODULO6_P5_7_6  + " TEXT," +
                    MODULO6_P5_7_7  + " TEXT," +
                    MODULO6_P5_7_8  + " TEXT," +
                    MODULO6_P5_7_9  + " TEXT," +
                    MODULO6_P5_7_10  + " TEXT," +
                    MODULO6_P5_7_11  + " TEXT," +
                    MODULO6_P5_7_12  + " TEXT," +
                    MODULO6_P5_7_13  + " TEXT," +
                    MODULO6_P5_7_14  + " TEXT," +
                    MODULO6_P5_7_15  + " TEXT," +
                    MODULO6_P5_7_16  + " TEXT," +
                    MODULO6_P5_7_17  + " TEXT," +
                    MODULO6_P5_7_18  + " TEXT," +
                    MODULO6_P5_7_19  + " TEXT," +
                    MODULO6_P5_7_19_0  + " TEXT," +
                    MODULO6_P5_7_20  + " TEXT," +
                    MODULO6_P5_8_1  + " TEXT," +
                    MODULO6_P5_8_2  + " TEXT," +
                    MODULO6_P5_8_3  + " TEXT," +
                    MODULO6_P5_8_4  + " TEXT," +
                    MODULO6_P5_8_5  + " TEXT," +
                    MODULO6_P5_8_6  + " TEXT," +
                    MODULO6_P5_8_7  + " TEXT," +
                    MODULO6_P5_8_8  + " TEXT," +
                    MODULO6_P5_8_9  + " TEXT," +
                    MODULO6_P5_8_10  + " TEXT," +
                    MODULO6_P5_8_11  + " TEXT," +
                    MODULO6_P5_8_12  + " TEXT," +
                    MODULO6_P5_8_13  + " TEXT," +
                    MODULO6_P5_8_14  + " TEXT," +
                    MODULO6_P5_8_15  + " TEXT," +
                    MODULO6_P5_8_16  + " TEXT," +
                    MODULO6_P5_8_17  + " TEXT," +
                    MODULO6_P5_8_18  + " TEXT," +
                    MODULO6_P5_8_19  + " TEXT," +
                    MODULO6_P5_8_19_0  + " TEXT," +
                    MODULO6_P5_8_20  + " TEXT," +
                    MODULO6_P5_9_1  + " TEXT," +
                    MODULO6_P5_9_2  + " TEXT," +
                    MODULO6_P5_9_3  + " TEXT," +
                    MODULO6_P5_9_4  + " TEXT," +
                    MODULO6_P5_9_5  + " TEXT," +
                    MODULO6_P5_9_6  + " TEXT," +
                    MODULO6_P5_9_7  + " TEXT," +
                    MODULO6_P5_9_8  + " TEXT," +
                    MODULO6_P5_9_9  + " TEXT," +
                    MODULO6_P5_9_10  + " TEXT," +
                    MODULO6_P5_9_11  + " TEXT," +
                    MODULO6_P5_9_12  + " TEXT," +
                    MODULO6_P5_9_13  + " TEXT," +
                    MODULO6_P5_9_14  + " TEXT," +
                    MODULO6_P5_9_15  + " TEXT," +
                    MODULO6_P5_9_16  + " TEXT," +
                    MODULO6_P5_9_17  + " TEXT," +
                    MODULO6_P5_9_18  + " TEXT," +
                    MODULO6_P5_9_19  + " TEXT," +
                    MODULO6_P5_9_19_0  + " TEXT," +
                    MODULO6_P5_9_20  + " TEXT," +
                    MODULO6_P6_1_1  + " TEXT," +
                    MODULO6_P6_1_2  + " TEXT," +
                    MODULO6_P6_1_3  + " TEXT," +
                    MODULO6_P6_1_4  + " TEXT," +
                    MODULO6_P6_1_5  + " TEXT," +
                    MODULO6_P6_1_6  + " TEXT," +
                    MODULO6_P6_1_7  + " TEXT," +
                    MODULO6_P6_1_8  + " TEXT," +
                    MODULO6_P6_1_9  + " TEXT," +
                    MODULO6_P6_2_1  + " TEXT," +
                    MODULO6_P6_2_2  + " TEXT," +
                    MODULO6_P6_2_3  + " TEXT," +
                    MODULO6_P6_2_4  + " TEXT," +
                    MODULO6_P6_2_5  + " TEXT," +
                    MODULO6_P6_2_6  + " TEXT," +
                    MODULO6_P6_2_7  + " TEXT," +
                    MODULO6_P6_2_8  + " TEXT," +
                    MODULO6_P6_2_9  + " TEXT," +
                    MODULO6_P6_3_1  + " TEXT," +
                    MODULO6_P6_3_2  + " TEXT," +
                    MODULO6_P6_3_3  + " TEXT," +
                    MODULO6_P6_3_4  + " TEXT," +
                    MODULO6_P6_3_5  + " TEXT," +
                    MODULO6_P6_3_6  + " TEXT," +
                    MODULO6_P6_3_7  + " TEXT," +
                    MODULO6_P6_3_8  + " TEXT," +
                    MODULO6_P6_3_9  + " TEXT," +
                    MODULO6_P6_4_1  + " TEXT," +
                    MODULO6_P6_4_2  + " TEXT," +
                    MODULO6_P6_4_3  + " TEXT," +
                    MODULO6_P6_4_4  + " TEXT," +
                    MODULO6_P6_4_5  + " TEXT," +
                    MODULO6_P6_4_6  + " TEXT," +
                    MODULO6_P6_4_7  + " TEXT," +
                    MODULO6_P6_4_8  + " TEXT," +
                    MODULO6_P6_4_9  + " TEXT," +
                    MODULO6_P6_5_1  + " TEXT," +
                    MODULO6_P6_5_2  + " TEXT," +
                    MODULO6_P6_5_3  + " TEXT," +
                    MODULO6_P6_5_4  + " TEXT," +
                    MODULO6_P6_5_5  + " TEXT," +
                    MODULO6_P6_5_6  + " TEXT," +
                    MODULO6_P6_5_7  + " TEXT," +
                    MODULO6_P6_5_8  + " TEXT," +
                    MODULO6_P6_5_9  + " TEXT," +
                    MODULO6_P6_6_1  + " TEXT," +
                    MODULO6_P6_6_2  + " TEXT," +
                    MODULO6_P6_6_3  + " TEXT," +
                    MODULO6_P6_6_4  + " TEXT," +
                    MODULO6_P6_6_5  + " TEXT," +
                    MODULO6_P6_6_6  + " TEXT," +
                    MODULO6_P6_6_7  + " TEXT," +
                    MODULO6_P6_6_8  + " TEXT," +
                    MODULO6_P6_6_9  + " TEXT," +
                    MODULO6_P6_7_1  + " TEXT," +
                    MODULO6_P6_7_2  + " TEXT," +
                    MODULO6_P6_7_3  + " TEXT," +
                    MODULO6_P6_7_4  + " TEXT," +
                    MODULO6_P6_7_5  + " TEXT," +
                    MODULO6_P6_7_6  + " TEXT," +
                    MODULO6_P6_7_7  + " TEXT," +
                    MODULO6_P6_7_8  + " TEXT," +
                    MODULO6_P6_7_9  + " TEXT," +
                    MODULO6_P6_8_1  + " TEXT," +
                    MODULO6_P6_8_2  + " TEXT," +
                    MODULO6_P6_8_3  + " TEXT," +
                    MODULO6_P6_8_4  + " TEXT," +
                    MODULO6_P6_8_5  + " TEXT," +
                    MODULO6_P6_8_6  + " TEXT," +
                    MODULO6_P6_8_7  + " TEXT," +
                    MODULO6_P6_8_8  + " TEXT," +
                    MODULO6_P6_8_9  + " TEXT," +
                    MODULO6_P6_9_1  + " TEXT," +
                    MODULO6_P6_9_2  + " TEXT," +
                    MODULO6_P6_9_3  + " TEXT," +
                    MODULO6_P6_9_4  + " TEXT," +
                    MODULO6_P6_9_5  + " TEXT," +
                    MODULO6_P6_9_6  + " TEXT," +
                    MODULO6_P6_9_7  + " TEXT," +
                    MODULO6_P6_9_8  + " TEXT," +
                    MODULO6_P6_9_9  + " TEXT," +
                    MODULO6_P7_1_1  + " TEXT," +
                    MODULO6_P7_1_2  + " TEXT," +
                    MODULO6_P7_1_3  + " TEXT," +
                    MODULO6_P7_1_4  + " TEXT," +
                    MODULO6_P7_1_5  + " TEXT," +
                    MODULO6_P7_1_6  + " TEXT," +
                    MODULO6_P7_1_7  + " TEXT," +
                    MODULO6_P7_1_8  + " TEXT," +
                    MODULO6_P7_1_9  + " TEXT," +
                    MODULO6_P7_1_10  + " TEXT," +
                    MODULO6_P7_2_1  + " TEXT," +
                    MODULO6_P7_2_2  + " TEXT," +
                    MODULO6_P7_2_3  + " TEXT," +
                    MODULO6_P7_2_4  + " TEXT," +
                    MODULO6_P7_2_5  + " TEXT," +
                    MODULO6_P7_2_6  + " TEXT," +
                    MODULO6_P7_2_7  + " TEXT," +
                    MODULO6_P7_2_8  + " TEXT," +
                    MODULO6_P7_2_9  + " TEXT," +
                    MODULO6_P7_2_10  + " TEXT," +
                    MODULO6_P7_3_1  + " TEXT," +
                    MODULO6_P7_3_2  + " TEXT," +
                    MODULO6_P7_3_3  + " TEXT," +
                    MODULO6_P7_3_4  + " TEXT," +
                    MODULO6_P7_3_5  + " TEXT," +
                    MODULO6_P7_3_6  + " TEXT," +
                    MODULO6_P7_3_7  + " TEXT," +
                    MODULO6_P7_3_8  + " TEXT," +
                    MODULO6_P7_3_9  + " TEXT," +
                    MODULO6_P7_3_10  + " TEXT," +
                    MODULO6_P7_4_1  + " TEXT," +
                    MODULO6_P7_4_2  + " TEXT," +
                    MODULO6_P7_4_3  + " TEXT," +
                    MODULO6_P7_4_4  + " TEXT," +
                    MODULO6_P7_4_5  + " TEXT," +
                    MODULO6_P7_4_6  + " TEXT," +
                    MODULO6_P7_4_7  + " TEXT," +
                    MODULO6_P7_4_8  + " TEXT," +
                    MODULO6_P7_4_9  + " TEXT," +
                    MODULO6_P7_4_10  + " TEXT," +
                    MODULO6_P7_5_1  + " TEXT," +
                    MODULO6_P7_5_2  + " TEXT," +
                    MODULO6_P7_5_3  + " TEXT," +
                    MODULO6_P7_5_4  + " TEXT," +
                    MODULO6_P7_5_5  + " TEXT," +
                    MODULO6_P7_5_6  + " TEXT," +
                    MODULO6_P7_5_7  + " TEXT," +
                    MODULO6_P7_5_8  + " TEXT," +
                    MODULO6_P7_5_9  + " TEXT," +
                    MODULO6_P7_5_10  + " TEXT," +
                    MODULO6_P7_6_1  + " TEXT," +
                    MODULO6_P7_6_2  + " TEXT," +
                    MODULO6_P7_6_3  + " TEXT," +
                    MODULO6_P7_6_4  + " TEXT," +
                    MODULO6_P7_6_5  + " TEXT," +
                    MODULO6_P7_6_6  + " TEXT," +
                    MODULO6_P7_6_7  + " TEXT," +
                    MODULO6_P7_6_8  + " TEXT," +
                    MODULO6_P7_6_9  + " TEXT," +
                    MODULO6_P7_6_10  + " TEXT," +
                    MODULO6_P7_7_1  + " TEXT," +
                    MODULO6_P7_7_2  + " TEXT," +
                    MODULO6_P7_7_3  + " TEXT," +
                    MODULO6_P7_7_4  + " TEXT," +
                    MODULO6_P7_7_5  + " TEXT," +
                    MODULO6_P7_7_6  + " TEXT," +
                    MODULO6_P7_7_7  + " TEXT," +
                    MODULO6_P7_7_8  + " TEXT," +
                    MODULO6_P7_7_9  + " TEXT," +
                    MODULO6_P7_7_10  + " TEXT," +
                    MODULO6_P7_8_1  + " TEXT," +
                    MODULO6_P7_8_2  + " TEXT," +
                    MODULO6_P7_8_3  + " TEXT," +
                    MODULO6_P7_8_4  + " TEXT," +
                    MODULO6_P7_8_5  + " TEXT," +
                    MODULO6_P7_8_6  + " TEXT," +
                    MODULO6_P7_8_7  + " TEXT," +
                    MODULO6_P7_8_8  + " TEXT," +
                    MODULO6_P7_8_9  + " TEXT," +
                    MODULO6_P7_8_10  + " TEXT," +
                    MODULO6_P7_9_1  + " TEXT," +
                    MODULO6_P7_9_2  + " TEXT," +
                    MODULO6_P7_9_3  + " TEXT," +
                    MODULO6_P7_9_4  + " TEXT," +
                    MODULO6_P7_9_5  + " TEXT," +
                    MODULO6_P7_9_6  + " TEXT," +
                    MODULO6_P7_9_7  + " TEXT," +
                    MODULO6_P7_9_8  + " TEXT," +
                    MODULO6_P7_9_9  + " TEXT," +
                    MODULO6_P7_9_10  + " TEXT," +
                    MODULO6_P8_1  + " TEXT," +
                    MODULO6_P8_2  + " TEXT," +
                    MODULO6_P8_3  + " TEXT," +
                    MODULO6_P8_4  + " TEXT," +
                    MODULO6_P8_5  + " TEXT," +
                    MODULO6_P8_6  + " TEXT," +
                    MODULO6_P8_7  + " TEXT," +
                    MODULO6_P8_8  + " TEXT," +
                    MODULO6_P8_9  + " TEXT," +
                    MODULO6_P9  + " TEXT," +
                    MODULO6_P10_1  + " TEXT," +
                    MODULO6_P10_2  + " TEXT," +
                    MODULO6_P10_3  + " TEXT," +
                    MODULO6_P10_4  + " TEXT," +
                    MODULO6_P10_4_0  + " TEXT," +
                    MODULO6_P11_1  + " TEXT," +
                    MODULO6_P11_2  + " TEXT," +
                    MODULO6_P11_3  + " TEXT," +
                    MODULO6_P11_4  + " TEXT," +
                    MODULO6_P11_5  + " TEXT," +
                    MODULO6_P11_6  + " TEXT," +
                    MODULO6_P11_7  + " TEXT," +
                    MODULO6_P11_8  + " TEXT," +
                    MODULO6_P11_9  + " TEXT," +
                    MODULO6_OBS_MOD_VI  + " TEXT," +
                    MODULO6_USUCREACION + " TEXT," +
                    MODULO6_FECCREACION + " TEXT," +
                    MODULO6_USUREGISTRO + " TEXT," +
                    MODULO6_FECREGISTRO + " TEXT" + ");"

            ;
    //TABLA MODULO7
    public static final String SQL_CREATE_TABLA_MODULO7 =
            "CREATE TABLE " + tableModulo7 + "(" +
                    MODULO7_ID  + " TEXT PRIMARY KEY," +
                    MODULO7_P0_0  + " TEXT," +
                    MODULO7_P0_1  + " TEXT," +
                    MODULO7_P0_2  + " TEXT," +
                    MODULO7_P0_3  + " TEXT," +
                    MODULO7_P1  + " TEXT," +
                    MODULO7_P2  + " TEXT," +
                    MODULO7_P3  + " TEXT," +
                    MODULO7_P4  + " TEXT," +
                    MODULO7_P5  + " TEXT," +
                    MODULO7_P6_1  + " TEXT," +
                    MODULO7_P6_2  + " TEXT," +
                    MODULO7_P7  + " TEXT," +
                    MODULO7_P7_0  + " TEXT," +
                    MODULO7_P8_1  + " TEXT," +
                    MODULO7_P8_2  + " TEXT," +
                    MODULO7_P8_3  + " TEXT," +
                    MODULO7_P8_4  + " TEXT," +
                    MODULO7_P8_5  + " TEXT," +
                    MODULO7_P8_6  + " TEXT," +
                    MODULO7_P8_7  + " TEXT," +
                    MODULO7_P8_8  + " TEXT," +
                    MODULO7_P8_9  + " TEXT," +
                    MODULO7_P8_10  + " TEXT," +
                    MODULO7_P8_11  + " TEXT," +
                    MODULO7_P8_12  + " TEXT," +
                    MODULO7_P8_13  + " TEXT," +
                    MODULO7_P8_14  + " TEXT," +
                    MODULO7_P8_15  + " TEXT," +
                    MODULO7_P8_16  + " TEXT," +
                    MODULO7_P8_17  + " TEXT," +
                    MODULO7_P8_18  + " TEXT," +
                    MODULO7_P8_19  + " TEXT," +
                    MODULO7_P8_19_0  + " TEXT," +
                    MODULO7_P8_20  + " TEXT," +
                    MODULO7_P9_1_1  + " TEXT," +
                    MODULO7_P9_1_2  + " TEXT," +
                    MODULO7_P9_1_3  + " TEXT," +
                    MODULO7_P9_1_4  + " TEXT," +
                    MODULO7_P9_1_5  + " TEXT," +
                    MODULO7_P9_1_6  + " TEXT," +
                    MODULO7_P9_1_7  + " TEXT," +
                    MODULO7_P9_1_8  + " TEXT," +
                    MODULO7_P9_1_9  + " TEXT," +
                    MODULO7_P9_1_10  + " TEXT," +
                    MODULO7_P9_1_11  + " TEXT," +
                    MODULO7_P9_1_12  + " TEXT," +
                    MODULO7_P9_1_13  + " TEXT," +
                    MODULO7_P9_1_14  + " TEXT," +
                    MODULO7_P9_1_15  + " TEXT," +
                    MODULO7_P9_1_16  + " TEXT," +
                    MODULO7_P9_1_17  + " TEXT," +
                    MODULO7_P9_1_18  + " TEXT," +
                    MODULO7_P9_1_19  + " TEXT," +
                    MODULO7_P8_1_19_0  + " TEXT," +
                    MODULO7_P9_1_20  + " TEXT," +
                    MODULO7_P9_2_1  + " TEXT," +
                    MODULO7_P9_2_2  + " TEXT," +
                    MODULO7_P9_2_3  + " TEXT," +
                    MODULO7_P9_2_4  + " TEXT," +
                    MODULO7_P9_2_5  + " TEXT," +
                    MODULO7_P9_2_6  + " TEXT," +
                    MODULO7_P9_2_7  + " TEXT," +
                    MODULO7_P9_2_8  + " TEXT," +
                    MODULO7_P9_2_9  + " TEXT," +
                    MODULO7_P9_2_10  + " TEXT," +
                    MODULO7_P9_2_11  + " TEXT," +
                    MODULO7_P9_2_12  + " TEXT," +
                    MODULO7_P9_2_13  + " TEXT," +
                    MODULO7_P9_2_14  + " TEXT," +
                    MODULO7_P9_2_15  + " TEXT," +
                    MODULO7_P9_2_16  + " TEXT," +
                    MODULO7_P9_2_17  + " TEXT," +
                    MODULO7_P9_2_18  + " TEXT," +
                    MODULO7_P9_2_19  + " TEXT," +
                    MODULO7_P10  + " TEXT," +
                    MODULO7_P11  + " TEXT," +
                    MODULO7_P12_1  + " TEXT," +
                    MODULO7_P12_2  + " TEXT," +
                    MODULO7_P12_3  + " TEXT," +
                    MODULO7_P12_4  + " TEXT," +
                    MODULO7_P13_1  + " TEXT," +
                    MODULO7_P13_2  + " TEXT," +
                    MODULO7_P13_3  + " TEXT," +
                    MODULO7_P13_4  + " TEXT," +
                    MODULO7_P14  + " TEXT," +
                    MODULO7_P15  + " TEXT," +
                    MODULO7_P16  + " TEXT," +
                    MODULO7_P17_1  + " TEXT," +
                    MODULO7_P17_2  + " TEXT," +
                    MODULO7_P17_3  + " TEXT," +
                    MODULO7_P17_4  + " TEXT," +
                    MODULO7_P17_5  + " TEXT," +
                    MODULO7_P17_6  + " TEXT," +
                    MODULO7_P17_7  + " TEXT," +
                    MODULO7_P17_8  + " TEXT," +
                    MODULO7_P17_9  + " TEXT," +
                    MODULO7_P17_10  + " TEXT," +
                    MODULO7_P17_10_0  + " TEXT," +
                    MODULO7_P18_1  + " TEXT," +
                    MODULO7_P18_2  + " TEXT," +
                    MODULO7_P18_3  + " TEXT," +
                    MODULO7_P18_4  + " TEXT," +
                    MODULO7_P18_5  + " TEXT," +
                    MODULO7_P18_6  + " TEXT," +
                    MODULO7_P18_7  + " TEXT," +
                    MODULO7_P18_8  + " TEXT," +
                    MODULO7_P18_9  + " TEXT," +
                    MODULO7_P18_10  + " TEXT," +
                    MODULO7_P18_10_0  + " TEXT," +
                    MODULO7_P19_1  + " TEXT," +
                    MODULO7_P19_2  + " TEXT," +
                    MODULO7_P19_3  + " TEXT," +
                    MODULO7_P19_4  + " TEXT," +
                    MODULO7_P19_5  + " TEXT," +
                    MODULO7_P19_6  + " TEXT," +
                    MODULO7_P19_7  + " TEXT," +
                    MODULO7_P19_8  + " TEXT," +
                    MODULO7_P19_9  + " TEXT," +
                    MODULO7_P19_10  + " TEXT," +
                    MODULO7_P19_10_0  + " TEXT," +
                    MODULO7_P20  + " TEXT," +
                    MODULO7_P21  + " TEXT," +
                    MODULO7_P22_1  + " TEXT," +
                    MODULO7_P22_2  + " TEXT," +
                    MODULO7_P22_3  + " TEXT," +
                    MODULO7_P22_4  + " TEXT," +
                    MODULO7_P22_5  + " TEXT," +
                    MODULO7_P22_6  + " TEXT," +
                    MODULO7_P22_7  + " TEXT," +
                    MODULO7_P22_8  + " TEXT," +
                    MODULO7_P22_9  + " TEXT," +
                    MODULO7_P22_10  + " TEXT," +
                    MODULO7_P22_11  + " TEXT," +
                    MODULO7_P22_12  + " TEXT," +
                    MODULO7_P22_13  + " TEXT," +
                    MODULO7_P22_14  + " TEXT," +
                    MODULO7_P22_15  + " TEXT," +
                    MODULO7_P22_16  + " TEXT," +
                    MODULO7_P22_16_0  + " TEXT," +
                    MODULO7_P22_17  + " TEXT," +
                    MODULO7_P23_1  + " TEXT," +
                    MODULO7_P23_2  + " TEXT," +
                    MODULO7_P23_3  + " TEXT," +
                    MODULO7_P23_4  + " TEXT," +
                    MODULO7_P23_5  + " TEXT," +
                    MODULO7_P23_6  + " TEXT," +
                    MODULO7_P23_7  + " TEXT," +
                    MODULO7_P23_8  + " TEXT," +
                    MODULO7_P23_9  + " TEXT," +
                    MODULO7_P23_10  + " TEXT," +
                    MODULO7_P23_10_0  + " TEXT," +
                    MODULO7_P24  + " TEXT," +
                    MODULO7_P24_1_1  + " TEXT," +
                    MODULO7_P24_1_2  + " TEXT," +
                    MODULO7_P24_1_3  + " TEXT," +
                    MODULO7_P24_2_1  + " TEXT," +
                    MODULO7_P24_2_2  + " TEXT," +
                    MODULO7_P24_2_3  + " TEXT," +
                    MODULO7_P25_1  + " TEXT," +
                    MODULO7_P25_2  + " TEXT," +
                    MODULO7_P25_3  + " TEXT," +
                    MODULO7_P25_4  + " TEXT," +
                    MODULO7_P25_5  + " TEXT," +
                    MODULO7_P25_6  + " TEXT," +
                    MODULO7_P26_1  + " TEXT," +
                    MODULO7_P26_2  + " TEXT," +
                    MODULO7_P26_3  + " TEXT," +
                    MODULO7_P26_4  + " TEXT," +
                    MODULO7_P26_5  + " TEXT," +
                    MODULO7_P26_6  + " TEXT," +
                    MODULO7_P26_7  + " TEXT," +
                    MODULO7_P26_8  + " TEXT," +
                    MODULO7_P26_9  + " TEXT," +
                    MODULO7_P26_10  + " TEXT," +
                    MODULO7_P26_11  + " TEXT," +
                    MODULO7_P26_12  + " TEXT," +
                    MODULO7_P26_13  + " TEXT," +
                    MODULO7_P26_14  + " TEXT," +
                    MODULO7_P26_15  + " TEXT," +
                    MODULO7_P26_16  + " TEXT," +
                    MODULO7_P26_17  + " TEXT," +
                    MODULO7_P26_18  + " TEXT," +
                    MODULO7_P26_19  + " TEXT," +
                    MODULO7_P26_20  + " TEXT," +
                    MODULO7_P26_21  + " TEXT," +
                    MODULO7_P26_21_0  + " TEXT," +
                    MODULO7_P26_22  + " TEXT," +
                    MODULO7_P27  + " TEXT," +
                    MODULO7_P28_1  + " TEXT," +
                    MODULO7_P28_2  + " TEXT," +
                    MODULO7_P28_3  + " TEXT," +
                    MODULO7_P28_4  + " TEXT," +
                    MODULO7_P28_4_0  + " TEXT," +
                    MODULO7_P28_5  + " TEXT," +
                    MODULO7_P29  + " TEXT," +
                    MODULO7_P30_1  + " TEXT," +
                    MODULO7_P30_2  + " TEXT," +
                    MODULO7_P31_1_1  + " TEXT," +
                    MODULO7_P31_1_2  + " TEXT," +
                    MODULO7_P31_1_3  + " TEXT," +
                    MODULO7_P31_1_4  + " TEXT," +
                    MODULO7_P31_1_5  + " TEXT," +
                    MODULO7_P31_1_6  + " TEXT," +
                    MODULO7_P31_1_7  + " TEXT," +
                    MODULO7_P31_1_8  + " TEXT," +
                    MODULO7_P31_1_9  + " TEXT," +
                    MODULO7_P31_2_1  + " TEXT," +
                    MODULO7_P31_2_2  + " TEXT," +
                    MODULO7_P31_2_3  + " TEXT," +
                    MODULO7_P31_2_4  + " TEXT," +
                    MODULO7_P31_2_5  + " TEXT," +
                    MODULO7_P31_2_6  + " TEXT," +
                    MODULO7_P31_2_7  + " TEXT," +
                    MODULO7_P31_2_8  + " TEXT," +
                    MODULO7_P31_2_9  + " TEXT," +
                    MODULO7_P32_1  + " TEXT," +
                    MODULO7_P32_2  + " TEXT," +
                    MODULO7_P32_3  + " TEXT," +
                    MODULO7_P32_4  + " TEXT," +
                    MODULO7_P33  + " TEXT," +
                    MODULO7_P34  + " TEXT," +
                    MODULO7_P35  + " TEXT," +
                    MODULO7_P36_1  + " TEXT," +
                    MODULO7_P36_2  + " TEXT," +
                    MODULO7_P36_3  + " TEXT," +
                    MODULO7_P36_4  + " TEXT," +
                    MODULO7_P36_5  + " TEXT," +
                    MODULO7_P36_5_0  + " TEXT," +
                    MODULO7_P37  + " TEXT," +
                    MODULO7_P38_1_1  + " TEXT," +
                    MODULO7_P38_1_2  + " TEXT," +
                    MODULO7_P38_1_3  + " TEXT," +
                    MODULO7_P38_1_4  + " TEXT," +
                    MODULO7_P38_1_5  + " TEXT," +
                    MODULO7_P38_1_5_0  + " TEXT," +
                    MODULO7_P38_2_1  + " TEXT," +
                    MODULO7_P38_2_2  + " TEXT," +
                    MODULO7_P38_2_3  + " TEXT," +
                    MODULO7_P38_2_4  + " TEXT," +
                    MODULO7_P38_2_5  + " TEXT," +
                    MODULO7_P39  + " TEXT," +
                    MODULO7_P39_0  + " TEXT," +
                    MODULO7_P40_1  + " TEXT," +
                    MODULO7_P40_2  + " TEXT," +
                    MODULO7_P40_3  + " TEXT," +
                    MODULO7_P40_4  + " TEXT," +
                    MODULO7_P40_5  + " TEXT," +
                    MODULO7_P41  + " TEXT," +
                    MODULO7_P42  + " TEXT," +
                    MODULO7_P43_1  + " TEXT," +
                    MODULO7_P43_2  + " TEXT," +
                    MODULO7_P44  + " TEXT," +
                    MODULO7_P45  + " TEXT," +
                    MODULO7_P46  + " TEXT," +
                    MODULO7_OBS_MOD_VII  + " TEXT," +
                    MODULO7_USUCREACION + " TEXT," +
                    MODULO7_FECCREACION + " TEXT," +
                    MODULO7_USUREGISTRO + " TEXT," +
                    MODULO7_FECREGISTRO + " TEXT" + ");"
            ;
    //TABLA MODULO8
    public static final String SQL_CREATE_TABLA_MODULO8 =
            "CREATE TABLE " + tableModulo8 + "(" +
                    MODULO8_ID  + " TEXT PRIMARY KEY," +
                    MODULO8_P0_0  + " TEXT," +
                    MODULO8_P0_1  + " TEXT," +
                    MODULO8_P0_2  + " TEXT," +
                    MODULO8_P0_3  + " TEXT," +
                    MODULO8_P1_1_1  + " TEXT," +
                    MODULO8_P1_2_1  + " TEXT," +
                    MODULO8_P2_1  + " TEXT," +
                    MODULO8_P3_1_1  + " TEXT," +
                    MODULO8_P3_2_1  + " TEXT," +
                    MODULO8_P3_3_1  + " TEXT," +
                    MODULO8_P3_4_1  + " TEXT," +
                    MODULO8_P3_5_1  + " TEXT," +
                    MODULO8_P3_6_1  + " TEXT," +
                    MODULO8_P3_6_1_0  + " TEXT," +
                    MODULO8_P4_1_1  + " TEXT," +
                    MODULO8_P4_2_1  + " TEXT," +
                    MODULO8_P4_3_1  + " TEXT," +
                    MODULO8_P4_4_1  + " TEXT," +
                    MODULO8_P4_5_1  + " TEXT," +
                    MODULO8_P4_6_1  + " TEXT," +
                    MODULO8_P4_6_1_0  + " TEXT," +
                    MODULO8_P5_1  + " TEXT," +
                    MODULO8_P6_1_1  + " TEXT," +
                    MODULO8_P6_2_1  + " TEXT," +
                    MODULO8_P6_3_1  + " TEXT," +
                    MODULO8_P6_4_1  + " TEXT," +
                    MODULO8_P6_5_1  + " TEXT," +
                    MODULO8_P6_6_1  + " TEXT," +
                    MODULO8_P7_1  + " TEXT," +
                    MODULO8_P8_1_1  + " TEXT," +
                    MODULO8_P8_2_1  + " TEXT," +
                    MODULO8_P8_3_1  + " TEXT," +
                    MODULO8_P8_4_1  + " TEXT," +
                    MODULO8_P9_1_1  + " TEXT," +
                    MODULO8_P9_2_1  + " TEXT," +
                    MODULO8_P9_3_1  + " TEXT," +
                    MODULO8_P9_4_1  + " TEXT," +
                    MODULO8_P10_1_1  + " TEXT," +
                    MODULO8_P10_2_1  + " TEXT," +
                    MODULO8_P10_3_1  + " TEXT," +
                    MODULO8_P10_4_1  + " TEXT," +
                    MODULO8_P10_5_1  + " TEXT," +
                    MODULO8_P10_6_1  + " TEXT," +
                    MODULO8_P1_1_2  + " TEXT," +
                    MODULO8_P1_2_2  + " TEXT," +
                    MODULO8_P2_2  + " TEXT," +
                    MODULO8_P3_1_2  + " TEXT," +
                    MODULO8_P3_2_2  + " TEXT," +
                    MODULO8_P3_3_2  + " TEXT," +
                    MODULO8_P3_4_2  + " TEXT," +
                    MODULO8_P3_5_2  + " TEXT," +
                    MODULO8_P3_6_2  + " TEXT," +
                    MODULO8_P3_6_2_0  + " TEXT," +
                    MODULO8_P4_1_2  + " TEXT," +
                    MODULO8_P4_2_2  + " TEXT," +
                    MODULO8_P4_3_2  + " TEXT," +
                    MODULO8_P4_4_2  + " TEXT," +
                    MODULO8_P4_5_2  + " TEXT," +
                    MODULO8_P4_6_2  + " TEXT," +
                    MODULO8_P4_6_2_0  + " TEXT," +
                    MODULO8_P5_2  + " TEXT," +
                    MODULO8_P6_1_2  + " TEXT," +
                    MODULO8_P6_2_2  + " TEXT," +
                    MODULO8_P6_3_2  + " TEXT," +
                    MODULO8_P6_4_2  + " TEXT," +
                    MODULO8_P6_5_2  + " TEXT," +
                    MODULO8_P6_6_2  + " TEXT," +
                    MODULO8_P7_2  + " TEXT," +
                    MODULO8_P8_1_2  + " TEXT," +
                    MODULO8_P8_2_2  + " TEXT," +
                    MODULO8_P8_3_2  + " TEXT," +
                    MODULO8_P8_4_2  + " TEXT," +
                    MODULO8_P9_1_2  + " TEXT," +
                    MODULO8_P9_2_2  + " TEXT," +
                    MODULO8_P9_3_2  + " TEXT," +
                    MODULO8_P9_4_2  + " TEXT," +
                    MODULO8_P10_1_2  + " TEXT," +
                    MODULO8_P10_2_2  + " TEXT," +
                    MODULO8_P10_3_2  + " TEXT," +
                    MODULO8_P10_4_2  + " TEXT," +
                    MODULO8_P10_5_2  + " TEXT," +
                    MODULO8_P10_6_2  + " TEXT," +
                    MODULO8_P1_1_3  + " TEXT," +
                    MODULO8_P1_2_3  + " TEXT," +
                    MODULO8_P2_3  + " TEXT," +
                    MODULO8_P3_1_3  + " TEXT," +
                    MODULO8_P3_2_3  + " TEXT," +
                    MODULO8_P3_3_3  + " TEXT," +
                    MODULO8_P3_4_3  + " TEXT," +
                    MODULO8_P3_5_3  + " TEXT," +
                    MODULO8_P3_6_3  + " TEXT," +
                    MODULO8_P3_6_3_0  + " TEXT," +
                    MODULO8_P4_1_3  + " TEXT," +
                    MODULO8_P4_2_3  + " TEXT," +
                    MODULO8_P4_3_3  + " TEXT," +
                    MODULO8_P4_4_3  + " TEXT," +
                    MODULO8_P4_5_3  + " TEXT," +
                    MODULO8_P4_6_3  + " TEXT," +
                    MODULO8_P4_6_3_0  + " TEXT," +
                    MODULO8_P5_3  + " TEXT," +
                    MODULO8_P6_1_3  + " TEXT," +
                    MODULO8_P6_2_3  + " TEXT," +
                    MODULO8_P6_3_3  + " TEXT," +
                    MODULO8_P6_4_3  + " TEXT," +
                    MODULO8_P6_5_3  + " TEXT," +
                    MODULO8_P6_6_3  + " TEXT," +
                    MODULO8_P7_3  + " TEXT," +
                    MODULO8_P8_1_3  + " TEXT," +
                    MODULO8_P8_2_3  + " TEXT," +
                    MODULO8_P8_3_3  + " TEXT," +
                    MODULO8_P8_4_3  + " TEXT," +
                    MODULO8_P9_1_3  + " TEXT," +
                    MODULO8_P9_2_3  + " TEXT," +
                    MODULO8_P9_3_3  + " TEXT," +
                    MODULO8_P9_4_3  + " TEXT," +
                    MODULO8_P10_1_3  + " TEXT," +
                    MODULO8_P10_2_3  + " TEXT," +
                    MODULO8_P10_3_3  + " TEXT," +
                    MODULO8_P10_4_3  + " TEXT," +
                    MODULO8_P10_5_3  + " TEXT," +
                    MODULO8_P10_6_3  + " TEXT," +
                    MODULO8_P1_1_4  + " TEXT," +
                    MODULO8_P1_2_4  + " TEXT," +
                    MODULO8_P2_4  + " TEXT," +
                    MODULO8_P3_1_4  + " TEXT," +
                    MODULO8_P3_2_4  + " TEXT," +
                    MODULO8_P3_3_4  + " TEXT," +
                    MODULO8_P3_4_4  + " TEXT," +
                    MODULO8_P3_5_4  + " TEXT," +
                    MODULO8_P3_6_4  + " TEXT," +
                    MODULO8_P3_6_4_0  + " TEXT," +
                    MODULO8_P4_1_4  + " TEXT," +
                    MODULO8_P4_2_4  + " TEXT," +
                    MODULO8_P4_3_4  + " TEXT," +
                    MODULO8_P4_4_4  + " TEXT," +
                    MODULO8_P4_5_4  + " TEXT," +
                    MODULO8_P4_6_4  + " TEXT," +
                    MODULO8_P4_6_4_0  + " TEXT," +
                    MODULO8_P5_4  + " TEXT," +
                    MODULO8_P6_1_4  + " TEXT," +
                    MODULO8_P6_2_4  + " TEXT," +
                    MODULO8_P6_3_4  + " TEXT," +
                    MODULO8_P6_4_4  + " TEXT," +
                    MODULO8_P6_5_4  + " TEXT," +
                    MODULO8_P6_6_4  + " TEXT," +
                    MODULO8_P7_4  + " TEXT," +
                    MODULO8_P8_1_4  + " TEXT," +
                    MODULO8_P8_2_4  + " TEXT," +
                    MODULO8_P8_3_4  + " TEXT," +
                    MODULO8_P8_4_4  + " TEXT," +
                    MODULO8_P9_1_4  + " TEXT," +
                    MODULO8_P9_2_4  + " TEXT," +
                    MODULO8_P9_3_4  + " TEXT," +
                    MODULO8_P9_4_4  + " TEXT," +
                    MODULO8_P10_1_4  + " TEXT," +
                    MODULO8_P10_2_4  + " TEXT," +
                    MODULO8_P10_3_4  + " TEXT," +
                    MODULO8_P10_4_4  + " TEXT," +
                    MODULO8_P10_5_4  + " TEXT," +
                    MODULO8_P10_6_4  + " TEXT," +
                    MODULO8_P1_1_5  + " TEXT," +
                    MODULO8_P1_2_5  + " TEXT," +
                    MODULO8_P2_5  + " TEXT," +
                    MODULO8_P3_1_5  + " TEXT," +
                    MODULO8_P3_2_5  + " TEXT," +
                    MODULO8_P3_3_5  + " TEXT," +
                    MODULO8_P3_4_5  + " TEXT," +
                    MODULO8_P3_5_5  + " TEXT," +
                    MODULO8_P3_6_5  + " TEXT," +
                    MODULO8_P3_6_5_0  + " TEXT," +
                    MODULO8_P4_1_5  + " TEXT," +
                    MODULO8_P4_2_5  + " TEXT," +
                    MODULO8_P4_3_5  + " TEXT," +
                    MODULO8_P4_4_5  + " TEXT," +
                    MODULO8_P4_5_5  + " TEXT," +
                    MODULO8_P4_6_5  + " TEXT," +
                    MODULO8_P4_6_5_0  + " TEXT," +
                    MODULO8_P5_5  + " TEXT," +
                    MODULO8_P6_1_5  + " TEXT," +
                    MODULO8_P6_2_5  + " TEXT," +
                    MODULO8_P6_3_5  + " TEXT," +
                    MODULO8_P6_4_5  + " TEXT," +
                    MODULO8_P6_5_5  + " TEXT," +
                    MODULO8_P6_6_5  + " TEXT," +
                    MODULO8_P7_5  + " TEXT," +
                    MODULO8_P8_1_5  + " TEXT," +
                    MODULO8_P8_2_5  + " TEXT," +
                    MODULO8_P8_3_5  + " TEXT," +
                    MODULO8_P8_4_5  + " TEXT," +
                    MODULO8_P9_1_5  + " TEXT," +
                    MODULO8_P9_2_5  + " TEXT," +
                    MODULO8_P9_3_5  + " TEXT," +
                    MODULO8_P9_4_5  + " TEXT," +
                    MODULO8_P10_1_5  + " TEXT," +
                    MODULO8_P10_2_5  + " TEXT," +
                    MODULO8_P10_3_5  + " TEXT," +
                    MODULO8_P10_4_5  + " TEXT," +
                    MODULO8_P10_5_5  + " TEXT," +
                    MODULO8_P10_6_5  + " TEXT," +
                    MODULO8_P1_1_6  + " TEXT," +
                    MODULO8_P1_2_6  + " TEXT," +
                    MODULO8_P2_6  + " TEXT," +
                    MODULO8_P3_1_6  + " TEXT," +
                    MODULO8_P3_2_6  + " TEXT," +
                    MODULO8_P3_3_6  + " TEXT," +
                    MODULO8_P3_4_6  + " TEXT," +
                    MODULO8_P3_5_6  + " TEXT," +
                    MODULO8_P3_6_6  + " TEXT," +
                    MODULO8_P3_6_6_0  + " TEXT," +
                    MODULO8_P4_1_6  + " TEXT," +
                    MODULO8_P4_2_6  + " TEXT," +
                    MODULO8_P4_3_6  + " TEXT," +
                    MODULO8_P4_4_6  + " TEXT," +
                    MODULO8_P4_5_6  + " TEXT," +
                    MODULO8_P4_6_6  + " TEXT," +
                    MODULO8_P4_6_6_0  + " TEXT," +
                    MODULO8_P5_6  + " TEXT," +
                    MODULO8_P6_1_6  + " TEXT," +
                    MODULO8_P6_2_6  + " TEXT," +
                    MODULO8_P6_3_6  + " TEXT," +
                    MODULO8_P6_4_6  + " TEXT," +
                    MODULO8_P6_5_6  + " TEXT," +
                    MODULO8_P6_6_6  + " TEXT," +
                    MODULO8_P7_6  + " TEXT," +
                    MODULO8_P8_1_6  + " TEXT," +
                    MODULO8_P8_2_6  + " TEXT," +
                    MODULO8_P8_3_6  + " TEXT," +
                    MODULO8_P8_4_6  + " TEXT," +
                    MODULO8_P9_1_6  + " TEXT," +
                    MODULO8_P9_2_6  + " TEXT," +
                    MODULO8_P9_3_6  + " TEXT," +
                    MODULO8_P9_4_6  + " TEXT," +
                    MODULO8_P10_1_6  + " TEXT," +
                    MODULO8_P10_2_6  + " TEXT," +
                    MODULO8_P10_3_6  + " TEXT," +
                    MODULO8_P10_4_6  + " TEXT," +
                    MODULO8_P10_5_6  + " TEXT," +
                    MODULO8_P10_6_6  + " TEXT," +
                    MODULO8_OBS_MOD_VIII  + " TEXT," +
                    MODULO8_USUCREACION + " TEXT," +
                    MODULO8_FECCREACION + " TEXT," +
                    MODULO8_USUREGISTRO + " TEXT," +
                    MODULO8_FECREGISTRO + " TEXT" + ");"
            ;
    //TABLA MODULO9
    public static final String SQL_CREATE_TABLA_MODULO9 =
            "CREATE TABLE " + tableModulo9 + "(" +
                    MODULO9_ID  + " TEXT PRIMARY KEY," +
                    MODULO9_P0_0  + " TEXT," +
                    MODULO9_P0_1  + " TEXT," +
                    MODULO9_P0_2  + " TEXT," +
                    MODULO9_P0_3  + " TEXT," +
                    MODULO9_P1  + " TEXT," +
                    MODULO9_P2  + " TEXT," +
                    MODULO9_OBS_MOD_IX  + " TEXT," +
                    MODULO9_USUCREACION + " TEXT," +
                    MODULO9_FECCREACION + " TEXT," +
                    MODULO9_USUREGISTRO + " TEXT," +
                    MODULO9_FECREGISTRO + " TEXT" + ");"
            ;

    //TABLA MODULO10
    public static final String SQL_CREATE_TABLA_MODULO10 =
            "CREATE TABLE " + tableModulo10 + "(" +
                    MODULO10_ID  + " TEXT PRIMARY KEY," +
                    MODULO10_P0_0  + " TEXT," +
                    MODULO10_P0_1  + " TEXT," +
                    MODULO10_P0_2  + " TEXT," +
                    MODULO10_P0_3  + " TEXT," +
                    MODULO10_P1  + " TEXT," +
                    MODULO10_P2  + " TEXT," +
                    MODULO10_P3  + " TEXT," +
                    MODULO10_P4  + " TEXT," +
                    MODULO10_OBS_MOD_X  + " TEXT," +
                    MODULO10_USUCREACION + " TEXT," +
                    MODULO10_FECCREACION + " TEXT," +
                    MODULO10_USUREGISTRO + " TEXT," +
                    MODULO10_FECREGISTRO + " TEXT" + ");"
            ;

    //WHERE
    public static final String WHERE_CLAUSE_ID_EMPRESA = "ID=?";
    public static final String WHERE_CLAUSE_ID_USUARIO = "ID=?";
    public static final String WHERE_CLAUSE_ID_UBIGEO = "ID_UBI=?";
    public static final String WHERE_CLAUSE_ID_VISITA = "ID=?";
    public static final String WHERE_CLAUSE_ID_OPERADOR = "OPERADOR=?";
    public static final String WHERE_CLAUSE_ID_JEFE = "JEFE=?";
    public static final String WHERE_CLAUSE_ID_OBSERVADOR = "OBSERVADOR=?";
    public static final String WHERE_CLAUSE_ID_OCUPACION = "ID=?";
    public static final String WHERE_CLAUSE_ID_EMPRESA_MOD5_DIN = "IDEMPRESA=?";
    public static final String WHERE_CLAUSE_ID_EMPRESA_VISITA = "ID_EMPRESA=?";

    //DELETE
    public static final String SQL_DELETE_USUARIOS = "DROP TABLE " + tableUsuarios;
    public static final String SQL_DELETE_MARCO = "DROP TABLE " + tableMarco;
    public static final String SQL_DELETE_UBIGEO = "DROP TABLE " + tableUbigeo;
    public static final String SQL_DELETE_DATOS_ENTREVISTA = "DROP TABLE " + tableDatosEntrevista;
    public static final String SQL_DELETE_CARATULAS = "DROP TABLE " + tableCaratulas;
    public static final String SQL_DELETE_VISITAS = "DROP TABLE " + tableVisitas;
    public static final String SQL_DELETE_IDENTIFICACIONES = "DROP TABLE " + tableIdentificaciones;
    public static final String SQL_DELETE_MODULO1 = "DROP TABLE " + tableModulo1;
    public static final String SQL_DELETE_MODULO2 = "DROP TABLE " + tableModulo2;
    public static final String SQL_DELETE_MODULO3 = "DROP TABLE " + tableModulo3;
    public static final String SQL_DELETE_MODULO4 = "DROP TABLE " + tableModulo4;
    public static final String SQL_DELETE_MODULO5 = "DROP TABLE " + tableModulo5;
    public static final String SQL_DELETE_MODULO5_DINAMICA = "DROP TABLE " + tableModulo5Dinamica;
    public static final String SQL_DELETE_MODULO6 = "DROP TABLE " + tableModulo6;
    public static final String SQL_DELETE_MODULO7 = "DROP TABLE " + tableModulo7;
    public static final String SQL_DELETE_MODULO8 = "DROP TABLE " + tableModulo8;
    public static final String SQL_DELETE_MODULO9 = "DROP TABLE " + tableModulo9;
    public static final String SQL_DELETE_MODULO10 = "DROP TABLE " + tableModulo10;


    //TRAER COLUMNAS EMPRESAS

    public static final String[] ALL_COLUMNS_USUARIOS = {
            USUARIO_ID, USUARIO_PASSWORD, USUARIO_PERMISO
    };

    public static final String[] ALL_COLUMNS_UBIGEOS = {
            UBIGEO_ID, UBIGEO_ID_UBI,UBIGEO_DISTRITO
    };

    public static final String[] ALL_COLUMNS_DATOS_ENTREVISTA= {
            DATOS_ID, DATOS_DNI_OPERADOR, DATOS_DNI_JEFE, DATOS_DNI_SUPERVISOR,
            DATOS_NOMBRE_OPERADOR, DATOS_NOMBRE_JEFE, DATOS_NOMBRE_SUPERVISOR,
            DATOS_RESULTADO_FINAL,DATOS_RESULTADO_FINAL_ESP,
            DATOS_FECHA_FINAL_DIA,DATOS_FECHA_FINAL_MES,DATOS_FECHA_FINAL_ANIO,DATOS_ESTADO_ENVIO,
            DATOS_USUCREACION,DATOS_FECCREACION,DATOS_USUREGISTRO,DATOS_FECREGISTRO
    };

    public static final String[] ALL_COLUMNS_MARCO = {
            MARCO_ID, MARCO_RUC, MARCO_RAZON_SOCIAL, MARCO_NOMBRE_COMERCIAL,
            MARCO_OPERADOR, MARCO_JEFE, MARCO_OBSERVADOR, MARCO_ANIO,
            MARCO_MES, MARCO_PERIODO, MARCO_CCDD, MARCO_DEPARTAMENTO,
            MARCO_CCPP, MARCO_PROVINCIA, MARCO_CCDI, MARCO_DISTRITO,
            MARCO_T_EMPRESA, MARCO_FRENTE, MARCO_ZONA, MARCO_MANZANA,
            MARCO_CAT_VIA, MARCO_NOM_VIA, MARCO_PUERTA, MARCO_INTERIOR,
            MARCO_PISO, MARCO_MZ, MARCO_LOTE
    };

    //TRAER COLUMNAS CARATULAS
    public static final String[] ALL_COLUMNS_CARATULA = {
            CARATULA_ID,
            CARATULA_CAMBIO,
            CARATULA_DEPARTAMENTO,
            CARATULA_DEPARTAMENTO_COD ,
            CARATULA_PROVINCIA,
            CARATULA_PROVINCIA_COD,
            CARATULA_DISTRITO,
            CARATULA_DISTRITO_COD,
            CARATULA_GPSLATITUD,
            CARATULA_GPSALTITUD,
            CARATULA_GPSLONGITUD,
            CARATULA_SECTOR,
            CARATULA_AREA,
            CARATULA_ZONA,
            CARATULA_MANZANA_MUESTRA,
            CARATULA_FRENTE,
            CARATULA_TIPVIA,
            CARATULA_NOMVIA,
            CARATULA_NPUERTA,
            CARATULA_BLOCK,
            CARATULA_INTERIOR,
            CARATULA_PISO,
            CARATULA_MANZANA_VIA,
            CARATULA_LOTE,
            CARATULA_KM,
            CARATULA_REFERENCIA,
            CARATULA_USUCREACION,
            CARATULA_FECCREACION,
            CARATULA_USUREGISTRO,
            CARATULA_FECREGISTRO
    };

    //TRAER COLUMNAS VISITAS
    public static final String[] ALL_COLUMNS_VISITAS = {
            VISITA_ID, VISITA_ID_EMPRESA, VISITA_DNI_OPERADOR, VISITA_NOMBRE_OPERADOR, VISITA_DNI_JEFE, VISITA_NOMBRE_JEFE, VISITA_DNI_SUPERVISOR,  VISITA_NOMBRE_SUPERVISOR,  VISITA_DIA, VISITA_MES,VISITA_ANIO,
            VISITA_HORAI, VISITA_MINUTOI, VISITA_HORAF,VISITA_MINUTOF, VISITA_RESULTADO, VISITA_RESULTADO_ESP, VISITA_PROX_DIA, VISITA_PROX_MES, VISITA_PROX_ANIO, VISITA_PROX_HORA,
            VISITA_PROX_MINUTO,VISITA_N ,VISITA_USUCREACION,VISITA_FECCREACION, VISITA_USUREGISTRO,VISITA_FECREGISTRO
    };

    //TRAER COLUMNAS IDENTIFICACIONES
    public static final String[] ALL_COLUMNS_IDENTIFICACIONES = {
            IDENTIFICACION_ID, IDENTIFICACION_RUC, IDENTIFICACION_RAZON,
            IDENTIFICACION_NOMBRE, IDENTIFICACION_ANIO_FUNDACION, IDENTIFICACION_WEB,
            IDENTIFICACION_WEBNO, IDENTIFICACION_CORREO, IDENTIFICACION_CORREONO,IDENTIFICACION_CODFIJO,
            IDENTIFICACION_FIJO, IDENTIFICACION_FIJONO, IDENTIFICACION_MOVIL,
            IDENTIFICACION_MOVILNO, IDENTIFICACION_ANIO_FUNCIONAMIENTO, IDENTIFICACION_CONDUCTOR_NOMBRE,
            IDENTIFICACION_CONDUCTOR_SEXO, IDENTIFICACION_CONDUCTOR_EDAD, IDENTIFICACION_CONDUCTOR_ESTUDIOS,
            IDENTIFICACION_CONDUCTOR_CARGO,IDENTIFICACION_CONDUCTOR_CARGO_ESP,
            IDENTIFICACION_USUCREACION,IDENTIFICACION_FECCREACION, IDENTIFICACION_USUREGISTRO,IDENTIFICACION_FECREGISTRO
    };

    //TRAER COLUMNAS FRAGMENTS
    public static final String[] ALL_COLUMNS_FRAGMENTS = {
            FRAGMENT_ID, FRAGMENT_HABILITADO, FRAGMENT_AVANCE
    };

    //MODULO 1
    public static final String[] ALL_COLUMNS_MODULO1 = {
            MODULO1_ID, MODULO1_P0_0, MODULO1_P0_1, MODULO1_P0_2, MODULO1_P0_3, MODULO1_P1_1, MODULO1_P1_2,MODULO1_P1_2_DETALLE,
            MODULO1_P2_1_1, MODULO1_P2_1_2, MODULO1_P2_1_2_DETALLE, MODULO1_P2_1_NO, MODULO1_P2_2_1, MODULO1_P2_2_2,MODULO1_P2_2_2_DETALLE,
            MODULO1_P2_2_NO, MODULO1_P3, MODULO1_P3_0, MODULO1_P4_1_1, MODULO1_P4_2_1, MODULO1_P5, MODULO1_P6_0, MODULO1_P6_1, MODULO1_P7_1_1,
            MODULO1_P7_2_1, MODULO1_P7_1_2, MODULO1_P7_2_2, MODULO1_P8, MODULO1_P9, MODULO1_P10, MODULO1_P11,
            MODULO1_P11_1, MODULO1_P11_2, MODULO1_P12_NO, MODULO1_P12_TIPVIA, MODULO1_P12_NOMVIA , MODULO1_P12_NROPTA,
            MODULO1_P12_BLOCK, MODULO1_P12_INT, MODULO1_P12_PISO, MODULO1_P12_MZA, MODULO1_P12_LOTE,
            MODULO1_P12_KM, MODULO1_P12_DIST, MODULO1_P12_CCDI, MODULO1_P12_PROV, MODULO1_P12_CCPP, MODULO1_P12_DEP, MODULO1_P12_CCDD,
            MODULO1_OBS_MOD_I, MODULO1_USUCREACION,MODULO1_FECCREACION, MODULO1_USUREGISTRO,MODULO1_FECREGISTRO
    };

    //MODULO 2
    public static final String[] ALL_COLUMNS_MODULO2 = {
            MODULO2_ID, MODULO2_P0_0, MODULO2_P0_1, MODULO2_P0_2, MODULO2_P0_3, MODULO2_P1, MODULO2_P2,
            MODULO2_P3, MODULO2_P4, MODULO2_P5_0_1, MODULO2_P5_0_2, MODULO2_P5_0_3, MODULO2_P5_0_4,
            MODULO2_P5_0_5, MODULO2_P5_1_1, MODULO2_P5_1_2, MODULO2_P5_1_3, MODULO2_P5_1_4,
            MODULO2_P5_1_5, MODULO2_P5_1_6, MODULO2_P6, MODULO2_P7, MODULO2_P8_0_1, MODULO2_P8_0_2, MODULO2_P8_1_1,
            MODULO2_P8_1_2, MODULO2_P8_2_3, MODULO2_P9_0_1, MODULO2_P9_0_2, MODULO2_P9_0_3,
            MODULO2_P9_0_4, MODULO2_P9_0_5, MODULO2_P9_1_1, MODULO2_P9_1_2, MODULO2_P9_1_3,
            MODULO2_P9_1_4, MODULO2_P9_1_4_0, MODULO2_P9_1_5, MODULO2_P9_1_6, MODULO2_P10_1_1,
            MODULO2_P10_1_2, MODULO2_P10_1_3, MODULO2_P10_1_4, MODULO2_P10_1_5, MODULO2_P10_1_6, MODULO2_P10_1_6_0,
            MODULO2_P10_2_2, MODULO2_P10_2_3, MODULO2_P10_2_4, MODULO2_P10_2_5, MODULO2_P10_2_6, MODULO2_P11_1_1,
            MODULO2_P11_1_2, MODULO2_P11_1_3, MODULO2_P11_1_4, MODULO2_P11_1_5, MODULO2_P11_1_6, MODULO2_P11_1_7,
            MODULO2_P11_1_7_0, MODULO2_P11_2_2, MODULO2_P11_2_3, MODULO2_P11_2_4, MODULO2_P11_2_5, MODULO2_P11_2_6,
            MODULO2_P11_2_7, MODULO2_P12_1, MODULO2_P12_2, MODULO2_P12_3, MODULO2_P12_3_0, MODULO2_P13_1_1, MODULO2_P13_1_2,
            MODULO2_P13_1_3, MODULO2_P13_1_4, MODULO2_P13_1_5, MODULO2_P13_1_6, MODULO2_P13_1_7, MODULO2_P13_1_7_0, MODULO2_P13_2_2,
            MODULO2_P13_2_3, MODULO2_P13_2_4, MODULO2_P13_2_5, MODULO2_P13_2_6, MODULO2_P13_2_7, MODULO2_P14,
            MODULO2_P15_1, MODULO2_P15_2, MODULO2_P15_3, MODULO2_P15_4, MODULO2_P15_5, MODULO2_P15_6, MODULO2_P15_6_0,
            MODULO2_P16_1_1,
            MODULO2_P16_1_2,
            MODULO2_P16_1_3,
            MODULO2_P16_1_4,
            MODULO2_P16_1_5,
            MODULO2_P16_1_6,
            MODULO2_P16_1_6_0,
            MODULO2_P17,
            MODULO2_P18_1_1,
            MODULO2_P18_1_2,
            MODULO2_P18_1_3,
            MODULO2_P18_1_4,
            MODULO2_P18_1_5,
            MODULO2_P18_1_6,
            MODULO2_P18_1_7,
            MODULO2_P18_1_7_0,
            MODULO2_P18_2_1,
            MODULO2_P18_2_2,
            MODULO2_P18_2_3,
            MODULO2_P18_2_4,
            MODULO2_P18_2_5,
            MODULO2_P18_2_6,
            MODULO2_P18_2_7,
            MODULO2_P19_1_1,
            MODULO2_P19_1_2,
            MODULO2_P19_1_3,
            MODULO2_P19_1_4,
            MODULO2_P19_1_5,
            MODULO2_P19_1_5_0,
            MODULO2_P19_2_1,
            MODULO2_P19_2_2,
            MODULO2_P19_2_3,
            MODULO2_P19_2_4,
            MODULO2_P19_2_5,
            MODULO2_P20_1_1,
            MODULO2_P20_1_2,
            MODULO2_P20_1_3,
            MODULO2_P20_1_4,
            MODULO2_P20_1_5,
            MODULO2_P20_1_6,
            MODULO2_P20_1_7,
            MODULO2_P20_1_8,
            MODULO2_P20_1_8_0,
            MODULO2_P20_2_1,
            MODULO2_P20_2_2,
            MODULO2_P20_2_3,
            MODULO2_P20_2_4,
            MODULO2_P20_2_5,
            MODULO2_P20_2_6,
            MODULO2_P20_2_7,
            MODULO2_P20_2_8,
            MODULO2_P21,
            MODULO2_P22_1_1,
            MODULO2_P22_1_2,
            MODULO2_P22_1_3,
            MODULO2_P22_1_4,
            MODULO2_P22_1_5,
            MODULO2_P22_1_6,
            MODULO2_P22_1_6_0,
            MODULO2_P22_2_1,
            MODULO2_P22_2_2,
            MODULO2_P22_2_3,
            MODULO2_P22_2_4,
            MODULO2_P22_2_5,
            MODULO2_P22_2_6,
            MODULO2_P23,
            MODULO2_P24,
            MODULO2_P25,
            MODULO2_P25_T,
            MODULO2_P25_H,
            MODULO2_P25_M,
            MODULO2_OBS_MOD_II,
            MODULO2_USUCREACION,MODULO2_FECCREACION, MODULO2_USUREGISTRO,MODULO2_FECREGISTRO
    };
    //MODULO 3
    public static final String[] ALL_COLUMNS_MODULO3 = {
            MODULO3_ID,
            MODULO3_P0_0,
            MODULO3_P0_1,
            MODULO3_P0_2,
            MODULO3_P0_3,
            MODULO3_P1,
            MODULO3_P2,
            MODULO3_P3,
            MODULO3_P4,
            MODULO3_P5,
            MODULO3_P5_1,
            MODULO3_P6,
            MODULO3_P7,
            MODULO3_P8,
            MODULO3_P9,
            MODULO3_P10,
            MODULO3_P11,
            MODULO3_P12,
            MODULO3_OBS_MOD_III,
            MODULO3_USUCREACION,MODULO3_FECCREACION, MODULO3_USUREGISTRO,MODULO3_FECREGISTRO

    };
    //MODULO 4
    public static final String[] ALL_COLUMNS_MODULO4 = {
            MODULO4_ID,
            MODULO4_P0_0,
            MODULO4_P0_1,
            MODULO4_P0_2,
            MODULO4_P0_3,
            MODULO4_P1,
            MODULO4_P2,
            MODULO4_P3,
            MODULO4_P4,
            MODULO4_P5,
            MODULO4_P6,
            MODULO4_P7,
            MODULO4_P8_1_1,
            MODULO4_P8_1_2,
            MODULO4_P8_1_3,
            MODULO4_P8_1_4,
            MODULO4_P8_1_5,
            MODULO4_P8_1_6,
            MODULO4_P8_1_7,
            MODULO4_P8_1_8,
            MODULO4_P8_1_9,
            MODULO4_P8_1_10,
            MODULO4_P8_1_11,
            MODULO4_P8_1_12,
            MODULO4_P8_1_13,
            MODULO4_P8_1_14,
            MODULO4_P8_1_15,
            MODULO4_P8_1_16,
            MODULO4_P8_1_17,
            MODULO4_P8_1_18,
            MODULO4_P8_1_17_0,
            MODULO4_P8_2_1,
            MODULO4_P8_2_2,
            MODULO4_P8_2_3,
            MODULO4_P8_2_4,
            MODULO4_P8_2_5,
            MODULO4_P8_2_6,
            MODULO4_P8_2_7,
            MODULO4_P8_2_8,
            MODULO4_P8_2_9,
            MODULO4_P8_2_10,
            MODULO4_P8_2_11,
            MODULO4_P8_2_12,
            MODULO4_P8_2_13,
            MODULO4_P8_2_14,
            MODULO4_P8_2_15,
            MODULO4_P8_2_16,
            MODULO4_P8_2_17,
            MODULO4_P9_1,
            MODULO4_P9_2,
            MODULO4_P9_3,
            MODULO4_P9_4,
            MODULO4_P10,
            MODULO4_OBS_MOD_IV,
            MODULO4_USUCREACION,MODULO4_FECCREACION, MODULO4_USUREGISTRO,MODULO4_FECREGISTRO
    };
    //MODULO 5
    public static final String[] ALL_COLUMNS_MODULO5 = {
            MODULO5_ID,
            MODULO5_P0_0,
            MODULO5_P0_1,
            MODULO5_P0_2,
            MODULO5_P0_3,
            MODULO5_P1,
            MODULO5_P1_0_1,
            MODULO5_P1_0_2,
            MODULO5_P1_0_3,
            MODULO5_P1_0_4,
            MODULO5_P1_0_5,
            MODULO5_P1_0_6,
            MODULO5_P1_0_7,
            MODULO5_P1_0_8,
            MODULO5_P1_0_9,
            MODULO5_P1_1_1,
            MODULO5_P1_1_2,
            MODULO5_P1_1_3,
            MODULO5_P1_1_4,
            MODULO5_P1_1_5,
            MODULO5_P1_1_6,
            MODULO5_P1_1_7,
            MODULO5_P1_1_8,
            MODULO5_P1_1_9,
            MODULO5_P1_1_10,
            MODULO5_P1_2_1,
            MODULO5_P1_2_2,
            MODULO5_P1_2_3,
            MODULO5_P1_2_4,
            MODULO5_P1_2_5,
            MODULO5_P1_2_6,
            MODULO5_P1_2_7,
            MODULO5_P1_2_8,
            MODULO5_P1_2_9,
            MODULO5_P1_2_10,
            MODULO5_P2,
            MODULO5_P2_0_1,
            MODULO5_P2_0_2,
            MODULO5_P2_0_3,
            MODULO5_P2_0_4,
            MODULO5_P2_0_5,
            MODULO5_P2_0_6,
            MODULO5_P2_0_7,
            MODULO5_P2_0_8,
            MODULO5_P2_0_9,
            MODULO5_P2_1_1,
            MODULO5_P2_1_2,
            MODULO5_P2_1_3,
            MODULO5_P2_1_4,
            MODULO5_P2_1_5,
            MODULO5_P2_1_6,
            MODULO5_P2_1_7,
            MODULO5_P2_1_8,
            MODULO5_P2_1_9,
            MODULO5_P2_2_1,
            MODULO5_P2_2_2,
            MODULO5_P2_2_3,
            MODULO5_P2_2_4,
            MODULO5_P2_2_5,
            MODULO5_P2_2_6,
            MODULO5_P2_2_7,
            MODULO5_P2_2_8,
            MODULO5_P2_2_9,
            MODULO5_P2_2_10,
            MODULO5_P2_3_1,
            MODULO5_P2_3_2,
            MODULO5_P2_3_3,
            MODULO5_P2_3_4,
            MODULO5_P2_3_5,
            MODULO5_P2_3_6,
            MODULO5_P2_3_7,
            MODULO5_P2_3_8,
            MODULO5_P2_3_9,
            MODULO5_P2_3_10,
            MODULO5_P3_1_1,
            MODULO5_P3_1_2,
            MODULO5_P3_1_3,
            MODULO5_P3_1_4,
            MODULO5_P3_1_5,
            MODULO5_P3_1_6,
            MODULO5_P3_1_7,
            MODULO5_P3_1_8,
            MODULO5_P3_1_9,
            MODULO5_P3_1_10,
            MODULO5_P3_1_11,
            MODULO5_P3_1_12,
            MODULO5_P3_1_12_0,
            MODULO5_P3_2_1,
            MODULO5_P3_2_2,
            MODULO5_P3_2_3,
            MODULO5_P3_2_4,
            MODULO5_P3_2_5,
            MODULO5_P3_2_6,
            MODULO5_P3_2_7,
            MODULO5_P3_2_8,
            MODULO5_P3_2_9,
            MODULO5_P3_2_10,
            MODULO5_P3_2_11,
            MODULO5_P3_2_12,
            MODULO5_P4_1_1,
            MODULO5_P4_1_2,
            MODULO5_P4_1_3,
            MODULO5_P4_1_4,
            MODULO5_P4_1_5,
            MODULO5_P4_1_6,
            MODULO5_P4_1_7,
            MODULO5_P4_1_8,
            MODULO5_P4_2_1,
            MODULO5_P4_2_2,
            MODULO5_P4_2_3,
            MODULO5_P4_2_4,
            MODULO5_P4_2_5,
            MODULO5_P4_2_6,
            MODULO5_P4_2_7,
            MODULO5_P4_2_8,
            MODULO5_P5_1,
            MODULO5_P5_2,
            MODULO5_P5_3,
            MODULO5_P5_4,
            MODULO5_P5_5,
            MODULO5_P5_6,
            MODULO5_P6,
            MODULO5_P7_1,
            MODULO5_P7_2,
            MODULO5_P7_3,
            MODULO5_P7_4,
            MODULO5_P7_5,
            MODULO5_P7_5_0,
            MODULO5_P7_1_1,
            MODULO5_P7_2_1,
            MODULO5_P7_3_1,
            MODULO5_P7_4_1,
            MODULO5_P7_5_1,
            MODULO5_P7_6_1,
            MODULO5_P7_6_1_0,
            MODULO5_P7_7_1,
            MODULO5_P7_1_2,
            MODULO5_P7_2_2,
            MODULO5_P7_3_2,
            MODULO5_P7_4_2,
            MODULO5_P7_5_2,
            MODULO5_P7_6_2,
            MODULO5_P7_6_2_0,
            MODULO5_P7_7_2,
            MODULO5_P7_1_3,
            MODULO5_P7_2_3,
            MODULO5_P7_3_3,
            MODULO5_P7_4_3,
            MODULO5_P7_5_3,
            MODULO5_P7_6_3,
            MODULO5_P7_6_3_0,
            MODULO5_P7_7_3,
            MODULO5_P7_1_4,
            MODULO5_P7_2_4,
            MODULO5_P7_3_4,
            MODULO5_P7_4_4,
            MODULO5_P7_5_4,
            MODULO5_P7_6_4,
            MODULO5_P7_6_4_0,
            MODULO5_P7_7_4,
            MODULO5_P7_1_5,
            MODULO5_P7_2_5,
            MODULO5_P7_3_5,
            MODULO5_P7_4_5,
            MODULO5_P7_5_5,
            MODULO5_P7_6_5,
            MODULO5_P7_6_5_0,
            MODULO5_P7_7_5,
            MODULO5_P8,
            MODULO5_P27_1_1,
            MODULO5_P27_1_2,
            MODULO5_P27_1_3,
            MODULO5_P27_1_4,
            MODULO5_P27_1_5,
            MODULO5_P27_1_6,
            MODULO5_P27_1_7,
            MODULO5_P27_1_8,
            MODULO5_P27_1_9,
            MODULO5_P27_2_1,
            MODULO5_P27_2_2,
            MODULO5_P27_2_3,
            MODULO5_P27_2_4,
            MODULO5_P27_2_5,
            MODULO5_P27_2_6,
            MODULO5_P27_2_7,
            MODULO5_P27_2_8,
            MODULO5_P27_2_9,
            MODULO5_OBS_MOD_V,
            MODULO5_USUCREACION,MODULO5_FECCREACION, MODULO5_USUREGISTRO,MODULO5_FECREGISTRO
    };

    //MODULO 5
    public static final String[] ALL_COLUMNS_MODULO5_DINAMICA = {
            MODULO5_IDOCUPACION,
            MODULO5_IDEMPRESA,
            MODULO5_P9_1_0,
            MODULO5_P9_1_1,
            MODULO5_P9_2_1,
            MODULO5_P9_3_1,
            MODULO5_P10_1_1,
            MODULO5_P10_2_1,
            MODULO5_P11_1_1,
            MODULO5_P11_2_1,
            MODULO5_P12,
            MODULO5_P13,
            MODULO5_P14,
            MODULO5_P15,
            MODULO5_P16,
            MODULO5_P17_0,
            MODULO5_P17_1,
            MODULO5_P17_2,
            MODULO5_P17_3,
            MODULO5_P17_4,
            MODULO5_P17_5,
            MODULO5_P17_6,
            MODULO5_P17_7,
            MODULO5_P17_8,
            MODULO5_P17_9,
            MODULO5_P17_10,
            MODULO5_P17_11,
            MODULO5_P17_12,
            MODULO5_P17_13,
            MODULO5_P17_14,
            MODULO5_P17_15,
            MODULO5_P17_16,
            MODULO5_P17_17,
            MODULO5_P17_18,
            MODULO5_P17_19,
            MODULO5_P17_20,
            MODULO5_P17_19_0,
            MODULO5_P18,
            MODULO5_P19,
            MODULO5_P20,
            MODULO5_P21_0,
            MODULO5_P21_1,
            MODULO5_P21_2,
            MODULO5_P21_3,
            MODULO5_P21_4,
            MODULO5_P21_5,
            MODULO5_P21_6,
            MODULO5_P21_7,
            MODULO5_P21_7_0,
            MODULO5_P22_1_1,
            MODULO5_P22_2_1,
            MODULO5_P23_1,
            MODULO5_P23_0,
            MODULO5_P23_2,
            MODULO5_P23_3,
            MODULO5_P23_4,
            MODULO5_P23_5,
            MODULO5_P23_6,
            MODULO5_P23_7,
            MODULO5_P23_8,
            MODULO5_P23_9,
            MODULO5_P23_9_0,
            MODULO5_P24_0,
            MODULO5_P24_1,
            MODULO5_P24_2,
            MODULO5_P24_3,
            MODULO5_P24_4,
            MODULO5_P24_5,
            MODULO5_P24_6,
            MODULO5_P24_7,
            MODULO5_P24_8,
            MODULO5_P24_9,
            MODULO5_P24_10,
            MODULO5_P25,
            MODULO5_P26,
            MODULO5_2_USUCREACION,MODULO5_2_FECCREACION, MODULO5_2_USUREGISTRO,MODULO5_2_FECREGISTRO
    };



    //MODULO 6
    public static final String[] ALL_COLUMNS_MODULO6 = {
            MODULO6_ID,
            MODULO6_P0_0,
            MODULO6_P0_1,
            MODULO6_P0_2,
            MODULO6_P0_3,
            MODULO6_P1,
            MODULO6_P2,
            MODULO6_P2_1,
            MODULO6_P2_2,
            MODULO6_P3,
            MODULO6_P3_1_1,
            MODULO6_P3_1_2,
            MODULO6_P3_1_3,
            MODULO6_P3_1_4,
            MODULO6_P3_1_5,
            MODULO6_P3_1_6,
            MODULO6_P3_1_7,
            MODULO6_P3_1_8,
            MODULO6_P3_1_9,
            MODULO6_P3_1_10,
            MODULO6_P3_2_1,
            MODULO6_P3_2_2,
            MODULO6_P3_2_3,
            MODULO6_P3_2_4,
            MODULO6_P3_2_5,
            MODULO6_P3_2_6,
            MODULO6_P3_2_7,
            MODULO6_P3_2_8,
            MODULO6_P3_2_9,
            MODULO6_P3_2_10,
            MODULO6_P4_1_1,
            MODULO6_P4_1_2,
            MODULO6_P4_1_3,
            MODULO6_P4_1_4,
            MODULO6_P4_1_5,
            MODULO6_P4_1_6,
            MODULO6_P4_1_6_0,
            MODULO6_P4_2_1,
            MODULO6_P4_2_2,
            MODULO6_P4_2_3,
            MODULO6_P4_2_4,
            MODULO6_P4_2_5,
            MODULO6_P4_2_6,
            MODULO6_P4_2_6_0,
            MODULO6_P4_3_1,
            MODULO6_P4_3_2,
            MODULO6_P4_3_3,
            MODULO6_P4_3_4,
            MODULO6_P4_3_5,
            MODULO6_P4_3_6,
            MODULO6_P4_3_6_0,
            MODULO6_P4_4_1,
            MODULO6_P4_4_2,
            MODULO6_P4_4_3,
            MODULO6_P4_4_4,
            MODULO6_P4_4_5,
            MODULO6_P4_4_6,
            MODULO6_P4_4_6_0,
            MODULO6_P4_5_1,
            MODULO6_P4_5_2,
            MODULO6_P4_5_3,
            MODULO6_P4_5_4,
            MODULO6_P4_5_5,
            MODULO6_P4_5_6,
            MODULO6_P4_5_6_0,
            MODULO6_P4_6_1,
            MODULO6_P4_6_2,
            MODULO6_P4_6_3,
            MODULO6_P4_6_4,
            MODULO6_P4_6_5,
            MODULO6_P4_6_6,
            MODULO6_P4_6_6_0,
            MODULO6_P4_7_1,
            MODULO6_P4_7_2,
            MODULO6_P4_7_3,
            MODULO6_P4_7_4,
            MODULO6_P4_7_5,
            MODULO6_P4_7_6,
            MODULO6_P4_7_6_0,
            MODULO6_P4_8_1,
            MODULO6_P4_8_2,
            MODULO6_P4_8_3,
            MODULO6_P4_8_4,
            MODULO6_P4_8_5,
            MODULO6_P4_8_6,
            MODULO6_P4_8_6_0,
            MODULO6_P4_9_1,
            MODULO6_P4_9_2,
            MODULO6_P4_9_3,
            MODULO6_P4_9_4,
            MODULO6_P4_9_5,
            MODULO6_P4_9_6,
            MODULO6_P4_9_6_0,
            MODULO6_P5_1_1,
            MODULO6_P5_1_2,
            MODULO6_P5_1_3,
            MODULO6_P5_1_4,
            MODULO6_P5_1_5,
            MODULO6_P5_1_6,
            MODULO6_P5_1_7,
            MODULO6_P5_1_8,
            MODULO6_P5_1_9,
            MODULO6_P5_1_10,
            MODULO6_P5_1_11,
            MODULO6_P5_1_12,
            MODULO6_P5_1_13,
            MODULO6_P5_1_14,
            MODULO6_P5_1_15,
            MODULO6_P5_1_16,
            MODULO6_P5_1_17,
            MODULO6_P5_1_18,
            MODULO6_P5_1_19,
            MODULO6_P5_1_19_0,
            MODULO6_P5_1_20,
            MODULO6_P5_2_1,
            MODULO6_P5_2_2,
            MODULO6_P5_2_3,
            MODULO6_P5_2_4,
            MODULO6_P5_2_5,
            MODULO6_P5_2_6,
            MODULO6_P5_2_7,
            MODULO6_P5_2_8,
            MODULO6_P5_2_9,
            MODULO6_P5_2_10,
            MODULO6_P5_2_11,
            MODULO6_P5_2_12,
            MODULO6_P5_2_13,
            MODULO6_P5_2_14,
            MODULO6_P5_2_15,
            MODULO6_P5_2_16,
            MODULO6_P5_2_17,
            MODULO6_P5_2_18,
            MODULO6_P5_2_19,
            MODULO6_P5_2_19_0,
            MODULO6_P5_2_20,
            MODULO6_P5_3_1,
            MODULO6_P5_3_2,
            MODULO6_P5_3_3,
            MODULO6_P5_3_4,
            MODULO6_P5_3_5,
            MODULO6_P5_3_6,
            MODULO6_P5_3_7,
            MODULO6_P5_3_8,
            MODULO6_P5_3_9,
            MODULO6_P5_3_10,
            MODULO6_P5_3_11,
            MODULO6_P5_3_12,
            MODULO6_P5_3_13,
            MODULO6_P5_3_14,
            MODULO6_P5_3_15,
            MODULO6_P5_3_16,
            MODULO6_P5_3_17,
            MODULO6_P5_3_18,
            MODULO6_P5_3_19,
            MODULO6_P5_3_19_0,
            MODULO6_P5_3_20,
            MODULO6_P5_4_1,
            MODULO6_P5_4_2,
            MODULO6_P5_4_3,
            MODULO6_P5_4_4,
            MODULO6_P5_4_5,
            MODULO6_P5_4_6,
            MODULO6_P5_4_7,
            MODULO6_P5_4_8,
            MODULO6_P5_4_9,
            MODULO6_P5_4_10,
            MODULO6_P5_4_11,
            MODULO6_P5_4_12,
            MODULO6_P5_4_13,
            MODULO6_P5_4_14,
            MODULO6_P5_4_15,
            MODULO6_P5_4_16,
            MODULO6_P5_4_17,
            MODULO6_P5_4_18,
            MODULO6_P5_4_19,
            MODULO6_P5_4_19_0,
            MODULO6_P5_4_20,
            MODULO6_P5_5_1,
            MODULO6_P5_5_2,
            MODULO6_P5_5_3,
            MODULO6_P5_5_4,
            MODULO6_P5_5_5,
            MODULO6_P5_5_6,
            MODULO6_P5_5_7,
            MODULO6_P5_5_8,
            MODULO6_P5_5_9,
            MODULO6_P5_5_10,
            MODULO6_P5_5_11,
            MODULO6_P5_5_12,
            MODULO6_P5_5_13,
            MODULO6_P5_5_14,
            MODULO6_P5_5_15,
            MODULO6_P5_5_16,
            MODULO6_P5_5_17,
            MODULO6_P5_5_18,
            MODULO6_P5_5_19,
            MODULO6_P5_5_19_0,
            MODULO6_P5_5_20,
            MODULO6_P5_6_1,
            MODULO6_P5_6_2,
            MODULO6_P5_6_3,
            MODULO6_P5_6_4,
            MODULO6_P5_6_5,
            MODULO6_P5_6_6,
            MODULO6_P5_6_7,
            MODULO6_P5_6_8,
            MODULO6_P5_6_9,
            MODULO6_P5_6_10,
            MODULO6_P5_6_11,
            MODULO6_P5_6_12,
            MODULO6_P5_6_13,
            MODULO6_P5_6_14,
            MODULO6_P5_6_15,
            MODULO6_P5_6_16,
            MODULO6_P5_6_17,
            MODULO6_P5_6_18,
            MODULO6_P5_6_19,
            MODULO6_P5_6_19_0,
            MODULO6_P5_6_20,
            MODULO6_P5_7_1,
            MODULO6_P5_7_2,
            MODULO6_P5_7_3,
            MODULO6_P5_7_4,
            MODULO6_P5_7_5,
            MODULO6_P5_7_6,
            MODULO6_P5_7_7,
            MODULO6_P5_7_8,
            MODULO6_P5_7_9,
            MODULO6_P5_7_10,
            MODULO6_P5_7_11,
            MODULO6_P5_7_12,
            MODULO6_P5_7_13,
            MODULO6_P5_7_14,
            MODULO6_P5_7_15,
            MODULO6_P5_7_16,
            MODULO6_P5_7_17,
            MODULO6_P5_7_18,
            MODULO6_P5_7_19,
            MODULO6_P5_7_19_0,
            MODULO6_P5_7_20,
            MODULO6_P5_8_1,
            MODULO6_P5_8_2,
            MODULO6_P5_8_3,
            MODULO6_P5_8_4,
            MODULO6_P5_8_5,
            MODULO6_P5_8_6,
            MODULO6_P5_8_7,
            MODULO6_P5_8_8,
            MODULO6_P5_8_9,
            MODULO6_P5_8_10,
            MODULO6_P5_8_11,
            MODULO6_P5_8_12,
            MODULO6_P5_8_13,
            MODULO6_P5_8_14,
            MODULO6_P5_8_15,
            MODULO6_P5_8_16,
            MODULO6_P5_8_17,
            MODULO6_P5_8_18,
            MODULO6_P5_8_19,
            MODULO6_P5_8_19_0,
            MODULO6_P5_8_20,
            MODULO6_P5_9_1,
            MODULO6_P5_9_2,
            MODULO6_P5_9_3,
            MODULO6_P5_9_4,
            MODULO6_P5_9_5,
            MODULO6_P5_9_6,
            MODULO6_P5_9_7,
            MODULO6_P5_9_8,
            MODULO6_P5_9_9,
            MODULO6_P5_9_10,
            MODULO6_P5_9_11,
            MODULO6_P5_9_12,
            MODULO6_P5_9_13,
            MODULO6_P5_9_14,
            MODULO6_P5_9_15,
            MODULO6_P5_9_16,
            MODULO6_P5_9_17,
            MODULO6_P5_9_18,
            MODULO6_P5_9_19,
            MODULO6_P5_9_19_0,
            MODULO6_P5_9_20,
            MODULO6_P6_1_1,
            MODULO6_P6_1_2,
            MODULO6_P6_1_3,
            MODULO6_P6_1_4,
            MODULO6_P6_1_5,
            MODULO6_P6_1_6,
            MODULO6_P6_1_7,
            MODULO6_P6_1_8,
            MODULO6_P6_1_9,
            MODULO6_P6_2_1,
            MODULO6_P6_2_2,
            MODULO6_P6_2_3,
            MODULO6_P6_2_4,
            MODULO6_P6_2_5,
            MODULO6_P6_2_6,
            MODULO6_P6_2_7,
            MODULO6_P6_2_8,
            MODULO6_P6_2_9,
            MODULO6_P6_3_1,
            MODULO6_P6_3_2,
            MODULO6_P6_3_3,
            MODULO6_P6_3_4,
            MODULO6_P6_3_5,
            MODULO6_P6_3_6,
            MODULO6_P6_3_7,
            MODULO6_P6_3_8,
            MODULO6_P6_3_9,
            MODULO6_P6_4_1,
            MODULO6_P6_4_2,
            MODULO6_P6_4_3,
            MODULO6_P6_4_4,
            MODULO6_P6_4_5,
            MODULO6_P6_4_6,
            MODULO6_P6_4_7,
            MODULO6_P6_4_8,
            MODULO6_P6_4_9,
            MODULO6_P6_5_1,
            MODULO6_P6_5_2,
            MODULO6_P6_5_3,
            MODULO6_P6_5_4,
            MODULO6_P6_5_5,
            MODULO6_P6_5_6,
            MODULO6_P6_5_7,
            MODULO6_P6_5_8,
            MODULO6_P6_5_9,
            MODULO6_P6_6_1,
            MODULO6_P6_6_2,
            MODULO6_P6_6_3,
            MODULO6_P6_6_4,
            MODULO6_P6_6_5,
            MODULO6_P6_6_6,
            MODULO6_P6_6_7,
            MODULO6_P6_6_8,
            MODULO6_P6_6_9,
            MODULO6_P6_7_1,
            MODULO6_P6_7_2,
            MODULO6_P6_7_3,
            MODULO6_P6_7_4,
            MODULO6_P6_7_5,
            MODULO6_P6_7_6,
            MODULO6_P6_7_7,
            MODULO6_P6_7_8,
            MODULO6_P6_7_9,
            MODULO6_P6_8_1,
            MODULO6_P6_8_2,
            MODULO6_P6_8_3,
            MODULO6_P6_8_4,
            MODULO6_P6_8_5,
            MODULO6_P6_8_6,
            MODULO6_P6_8_7,
            MODULO6_P6_8_8,
            MODULO6_P6_8_9,
            MODULO6_P6_9_1,
            MODULO6_P6_9_2,
            MODULO6_P6_9_3,
            MODULO6_P6_9_4,
            MODULO6_P6_9_5,
            MODULO6_P6_9_6,
            MODULO6_P6_9_7,
            MODULO6_P6_9_8,
            MODULO6_P6_9_9,
            MODULO6_P7_1_1,
            MODULO6_P7_1_2,
            MODULO6_P7_1_3,
            MODULO6_P7_1_4,
            MODULO6_P7_1_5,
            MODULO6_P7_1_6,
            MODULO6_P7_1_7,
            MODULO6_P7_1_8,
            MODULO6_P7_1_9,
            MODULO6_P7_1_10,
            MODULO6_P7_2_1,
            MODULO6_P7_2_2,
            MODULO6_P7_2_3,
            MODULO6_P7_2_4,
            MODULO6_P7_2_5,
            MODULO6_P7_2_6,
            MODULO6_P7_2_7,
            MODULO6_P7_2_8,
            MODULO6_P7_2_9,
            MODULO6_P7_2_10,
            MODULO6_P7_3_1,
            MODULO6_P7_3_2,
            MODULO6_P7_3_3,
            MODULO6_P7_3_4,
            MODULO6_P7_3_5,
            MODULO6_P7_3_6,
            MODULO6_P7_3_7,
            MODULO6_P7_3_8,
            MODULO6_P7_3_9,
            MODULO6_P7_3_10,
            MODULO6_P7_4_1,
            MODULO6_P7_4_2,
            MODULO6_P7_4_3,
            MODULO6_P7_4_4,
            MODULO6_P7_4_5,
            MODULO6_P7_4_6,
            MODULO6_P7_4_7,
            MODULO6_P7_4_8,
            MODULO6_P7_4_9,
            MODULO6_P7_4_10,
            MODULO6_P7_5_1,
            MODULO6_P7_5_2,
            MODULO6_P7_5_3,
            MODULO6_P7_5_4,
            MODULO6_P7_5_5,
            MODULO6_P7_5_6,
            MODULO6_P7_5_7,
            MODULO6_P7_5_8,
            MODULO6_P7_5_9,
            MODULO6_P7_5_10,
            MODULO6_P7_6_1,
            MODULO6_P7_6_2,
            MODULO6_P7_6_3,
            MODULO6_P7_6_4,
            MODULO6_P7_6_5,
            MODULO6_P7_6_6,
            MODULO6_P7_6_7,
            MODULO6_P7_6_8,
            MODULO6_P7_6_9,
            MODULO6_P7_6_10,
            MODULO6_P7_7_1,
            MODULO6_P7_7_2,
            MODULO6_P7_7_3,
            MODULO6_P7_7_4,
            MODULO6_P7_7_5,
            MODULO6_P7_7_6,
            MODULO6_P7_7_7,
            MODULO6_P7_7_8,
            MODULO6_P7_7_9,
            MODULO6_P7_7_10,
            MODULO6_P7_8_1,
            MODULO6_P7_8_2,
            MODULO6_P7_8_3,
            MODULO6_P7_8_4,
            MODULO6_P7_8_5,
            MODULO6_P7_8_6,
            MODULO6_P7_8_7,
            MODULO6_P7_8_8,
            MODULO6_P7_8_9,
            MODULO6_P7_8_10,
            MODULO6_P7_9_1,
            MODULO6_P7_9_2,
            MODULO6_P7_9_3,
            MODULO6_P7_9_4,
            MODULO6_P7_9_5,
            MODULO6_P7_9_6,
            MODULO6_P7_9_7,
            MODULO6_P7_9_8,
            MODULO6_P7_9_9,
            MODULO6_P7_9_10,
            MODULO6_P8_1,
            MODULO6_P8_2,
            MODULO6_P8_3,
            MODULO6_P8_4,
            MODULO6_P8_5,
            MODULO6_P8_6,
            MODULO6_P8_7,
            MODULO6_P8_8,
            MODULO6_P8_9,
            MODULO6_P9,
            MODULO6_P10_1,
            MODULO6_P10_2,
            MODULO6_P10_3,
            MODULO6_P10_4,
            MODULO6_P10_4_0,
            MODULO6_P11_1,
            MODULO6_P11_2,
            MODULO6_P11_3,
            MODULO6_P11_4,
            MODULO6_P11_5,
            MODULO6_P11_6,
            MODULO6_P11_7,
            MODULO6_P11_8,
            MODULO6_P11_9,
            MODULO6_OBS_MOD_VI,
            MODULO6_USUCREACION,MODULO6_FECCREACION, MODULO6_USUREGISTRO,MODULO6_FECREGISTRO
    };
    //MODULO 7
    public static final String[] ALL_COLUMNS_MODULO7 = {
            MODULO7_ID,
            MODULO7_P0_0,
            MODULO7_P0_1,
            MODULO7_P0_2,
            MODULO7_P0_3,
            MODULO7_P1,
            MODULO7_P2,
            MODULO7_P3,
            MODULO7_P4,
            MODULO7_P5,
            MODULO7_P6_1,
            MODULO7_P6_2,
            MODULO7_P7,
            MODULO7_P7_0,
            MODULO7_P8_1,
            MODULO7_P8_2,
            MODULO7_P8_3,
            MODULO7_P8_4,
            MODULO7_P8_5,
            MODULO7_P8_6,
            MODULO7_P8_7,
            MODULO7_P8_8,
            MODULO7_P8_9,
            MODULO7_P8_10,
            MODULO7_P8_11,
            MODULO7_P8_12,
            MODULO7_P8_13,
            MODULO7_P8_14,
            MODULO7_P8_15,
            MODULO7_P8_16,
            MODULO7_P8_17,
            MODULO7_P8_18,
            MODULO7_P8_19,
            MODULO7_P8_19_0,
            MODULO7_P8_20,
            MODULO7_P9_1_1,
            MODULO7_P9_1_2,
            MODULO7_P9_1_3,
            MODULO7_P9_1_4,
            MODULO7_P9_1_5,
            MODULO7_P9_1_6,
            MODULO7_P9_1_7,
            MODULO7_P9_1_8,
            MODULO7_P9_1_9,
            MODULO7_P9_1_10,
            MODULO7_P9_1_11,
            MODULO7_P9_1_12,
            MODULO7_P9_1_13,
            MODULO7_P9_1_14,
            MODULO7_P9_1_15,
            MODULO7_P9_1_16,
            MODULO7_P9_1_17,
            MODULO7_P9_1_18,
            MODULO7_P9_1_19,
            MODULO7_P8_1_19_0,
            MODULO7_P9_1_20,
            MODULO7_P9_2_1,
            MODULO7_P9_2_2,
            MODULO7_P9_2_3,
            MODULO7_P9_2_4,
            MODULO7_P9_2_5,
            MODULO7_P9_2_6,
            MODULO7_P9_2_7,
            MODULO7_P9_2_8,
            MODULO7_P9_2_9,
            MODULO7_P9_2_10,
            MODULO7_P9_2_11,
            MODULO7_P9_2_12,
            MODULO7_P9_2_13,
            MODULO7_P9_2_14,
            MODULO7_P9_2_15,
            MODULO7_P9_2_16,
            MODULO7_P9_2_17,
            MODULO7_P9_2_18,
            MODULO7_P9_2_19,
            MODULO7_P10,
            MODULO7_P11,
            MODULO7_P12_1,
            MODULO7_P12_2,
            MODULO7_P12_3,
            MODULO7_P12_4,
            MODULO7_P13_1,
            MODULO7_P13_2,
            MODULO7_P13_3,
            MODULO7_P13_4,
            MODULO7_P14,
            MODULO7_P15,
            MODULO7_P16,
            MODULO7_P17_1,
            MODULO7_P17_2,
            MODULO7_P17_3,
            MODULO7_P17_4,
            MODULO7_P17_5,
            MODULO7_P17_6,
            MODULO7_P17_7,
            MODULO7_P17_8,
            MODULO7_P17_9,
            MODULO7_P17_10,
            MODULO7_P17_10_0,
            MODULO7_P18_1,
            MODULO7_P18_2,
            MODULO7_P18_3,
            MODULO7_P18_4,
            MODULO7_P18_5,
            MODULO7_P18_6,
            MODULO7_P18_7,
            MODULO7_P18_8,
            MODULO7_P18_9,
            MODULO7_P18_10,
            MODULO7_P18_10_0,
            MODULO7_P19_1,
            MODULO7_P19_2,
            MODULO7_P19_3,
            MODULO7_P19_4,
            MODULO7_P19_5,
            MODULO7_P19_6,
            MODULO7_P19_7,
            MODULO7_P19_8,
            MODULO7_P19_9,
            MODULO7_P19_10,
            MODULO7_P19_10_0,
            MODULO7_P20,
            MODULO7_P21,
            MODULO7_P22_1,
            MODULO7_P22_2,
            MODULO7_P22_3,
            MODULO7_P22_4,
            MODULO7_P22_5,
            MODULO7_P22_6,
            MODULO7_P22_7,
            MODULO7_P22_8,
            MODULO7_P22_9,
            MODULO7_P22_10,
            MODULO7_P22_11,
            MODULO7_P22_12,
            MODULO7_P22_13,
            MODULO7_P22_14,
            MODULO7_P22_15,
            MODULO7_P22_16,
            MODULO7_P22_16_0,
            MODULO7_P22_17,
            MODULO7_P23_1,
            MODULO7_P23_2,
            MODULO7_P23_3,
            MODULO7_P23_4,
            MODULO7_P23_5,
            MODULO7_P23_6,
            MODULO7_P23_7,
            MODULO7_P23_8,
            MODULO7_P23_9,
            MODULO7_P23_10,
            MODULO7_P23_10_0,
            MODULO7_P24,
            MODULO7_P24_1_1,
            MODULO7_P24_1_2,
            MODULO7_P24_1_3,
            MODULO7_P24_2_1,
            MODULO7_P24_2_2,
            MODULO7_P24_2_3,
            MODULO7_P25_1,
            MODULO7_P25_2,
            MODULO7_P25_3,
            MODULO7_P25_4,
            MODULO7_P25_5,
            MODULO7_P25_6,
            MODULO7_P26_1,
            MODULO7_P26_2,
            MODULO7_P26_3,
            MODULO7_P26_4,
            MODULO7_P26_5,
            MODULO7_P26_6,
            MODULO7_P26_7,
            MODULO7_P26_8,
            MODULO7_P26_9,
            MODULO7_P26_10,
            MODULO7_P26_11,
            MODULO7_P26_12,
            MODULO7_P26_13,
            MODULO7_P26_14,
            MODULO7_P26_15,
            MODULO7_P26_16,
            MODULO7_P26_17,
            MODULO7_P26_18,
            MODULO7_P26_19,
            MODULO7_P26_20,
            MODULO7_P26_21,
            MODULO7_P26_21_0,
            MODULO7_P26_22,
            MODULO7_P27,
            MODULO7_P28_1,
            MODULO7_P28_2,
            MODULO7_P28_3,
            MODULO7_P28_4,
            MODULO7_P28_4_0,
            MODULO7_P28_5,
            MODULO7_P29,
            MODULO7_P30_1,
            MODULO7_P30_2,
            MODULO7_P31_1_1,
            MODULO7_P31_1_2,
            MODULO7_P31_1_3,
            MODULO7_P31_1_4,
            MODULO7_P31_1_5,
            MODULO7_P31_1_6,
            MODULO7_P31_1_7,
            MODULO7_P31_1_8,
            MODULO7_P31_1_9,
            MODULO7_P31_2_1,
            MODULO7_P31_2_2,
            MODULO7_P31_2_3,
            MODULO7_P31_2_4,
            MODULO7_P31_2_5,
            MODULO7_P31_2_6,
            MODULO7_P31_2_7,
            MODULO7_P31_2_8,
            MODULO7_P31_2_9,
            MODULO7_P32_1,
            MODULO7_P32_2,
            MODULO7_P32_3,
            MODULO7_P32_4,
            MODULO7_P33,
            MODULO7_P34,
            MODULO7_P35,
            MODULO7_P36_1,
            MODULO7_P36_2,
            MODULO7_P36_3,
            MODULO7_P36_4,
            MODULO7_P36_5,
            MODULO7_P36_5_0,
            MODULO7_P37,
            MODULO7_P38_1_1,
            MODULO7_P38_1_2,
            MODULO7_P38_1_3,
            MODULO7_P38_1_4,
            MODULO7_P38_1_5,
            MODULO7_P38_1_5_0,
            MODULO7_P38_2_1,
            MODULO7_P38_2_2,
            MODULO7_P38_2_3,
            MODULO7_P38_2_4,
            MODULO7_P38_2_5,
            MODULO7_P39,
            MODULO7_P39_0,
            MODULO7_P40_1,
            MODULO7_P40_2,
            MODULO7_P40_3,
            MODULO7_P40_4,
            MODULO7_P40_5,
            MODULO7_P41,
            MODULO7_P42,
            MODULO7_P43_1,
            MODULO7_P43_2,
            MODULO7_P44,
            MODULO7_P45,
            MODULO7_P46,
            MODULO7_OBS_MOD_VII,
            MODULO7_USUCREACION,MODULO7_FECCREACION, MODULO7_USUREGISTRO,MODULO7_FECREGISTRO
    };
    //MODULO 8
    public static final String[] ALL_COLUMNS_MODULO8 = {
            MODULO8_ID,
            MODULO8_P0_0,
            MODULO8_P0_1,
            MODULO8_P0_2,
            MODULO8_P0_3,
            MODULO8_P1_1_1,
            MODULO8_P1_2_1,
            MODULO8_P2_1,
            MODULO8_P3_1_1,
            MODULO8_P3_2_1,
            MODULO8_P3_3_1,
            MODULO8_P3_4_1,
            MODULO8_P3_5_1,
            MODULO8_P3_6_1,
            MODULO8_P3_6_1_0,
            MODULO8_P4_1_1,
            MODULO8_P4_2_1,
            MODULO8_P4_3_1,
            MODULO8_P4_4_1,
            MODULO8_P4_5_1,
            MODULO8_P4_6_1,
            MODULO8_P4_6_1_0,
            MODULO8_P5_1,
            MODULO8_P6_1_1,
            MODULO8_P6_2_1,
            MODULO8_P6_3_1,
            MODULO8_P6_4_1,
            MODULO8_P6_5_1,
            MODULO8_P6_6_1,
            MODULO8_P7_1,
            MODULO8_P8_1_1,
            MODULO8_P8_2_1,
            MODULO8_P8_3_1,
            MODULO8_P8_4_1,
            MODULO8_P9_1_1,
            MODULO8_P9_2_1,
            MODULO8_P9_3_1,
            MODULO8_P9_4_1,
            MODULO8_P10_1_1,
            MODULO8_P10_2_1,
            MODULO8_P10_3_1,
            MODULO8_P10_4_1,
            MODULO8_P10_5_1,
            MODULO8_P10_6_1,
            MODULO8_P1_1_2,
            MODULO8_P1_2_2,
            MODULO8_P2_2,
            MODULO8_P3_1_2,
            MODULO8_P3_2_2,
            MODULO8_P3_3_2,
            MODULO8_P3_4_2,
            MODULO8_P3_5_2,
            MODULO8_P3_6_2,
            MODULO8_P3_6_2_0,
            MODULO8_P4_1_2,
            MODULO8_P4_2_2,
            MODULO8_P4_3_2,
            MODULO8_P4_4_2,
            MODULO8_P4_5_2,
            MODULO8_P4_6_2,
            MODULO8_P4_6_2_0,
            MODULO8_P5_2,
            MODULO8_P6_1_2,
            MODULO8_P6_2_2,
            MODULO8_P6_3_2,
            MODULO8_P6_4_2,
            MODULO8_P6_5_2,
            MODULO8_P6_6_2,
            MODULO8_P7_2,
            MODULO8_P8_1_2,
            MODULO8_P8_2_2,
            MODULO8_P8_3_2,
            MODULO8_P8_4_2,
            MODULO8_P9_1_2,
            MODULO8_P9_2_2,
            MODULO8_P9_3_2,
            MODULO8_P9_4_2,
            MODULO8_P10_1_2,
            MODULO8_P10_2_2,
            MODULO8_P10_3_2,
            MODULO8_P10_4_2,
            MODULO8_P10_5_2,
            MODULO8_P10_6_2,
            MODULO8_P1_1_3,
            MODULO8_P1_2_3,
            MODULO8_P2_3,
            MODULO8_P3_1_3,
            MODULO8_P3_2_3,
            MODULO8_P3_3_3,
            MODULO8_P3_4_3,
            MODULO8_P3_5_3,
            MODULO8_P3_6_3,
            MODULO8_P3_6_3_0,
            MODULO8_P4_1_3,
            MODULO8_P4_2_3,
            MODULO8_P4_3_3,
            MODULO8_P4_4_3,
            MODULO8_P4_5_3,
            MODULO8_P4_6_3,
            MODULO8_P4_6_3_0,
            MODULO8_P5_3,
            MODULO8_P6_1_3,
            MODULO8_P6_2_3,
            MODULO8_P6_3_3,
            MODULO8_P6_4_3,
            MODULO8_P6_5_3,
            MODULO8_P6_6_3,
            MODULO8_P7_3,
            MODULO8_P8_1_3,
            MODULO8_P8_2_3,
            MODULO8_P8_3_3,
            MODULO8_P8_4_3,
            MODULO8_P9_1_3,
            MODULO8_P9_2_3,
            MODULO8_P9_3_3,
            MODULO8_P9_4_3,
            MODULO8_P10_1_3,
            MODULO8_P10_2_3,
            MODULO8_P10_3_3,
            MODULO8_P10_4_3,
            MODULO8_P10_5_3,
            MODULO8_P10_6_3,
            MODULO8_P1_1_4,
            MODULO8_P1_2_4,
            MODULO8_P2_4,
            MODULO8_P3_1_4,
            MODULO8_P3_2_4,
            MODULO8_P3_3_4,
            MODULO8_P3_4_4,
            MODULO8_P3_5_4,
            MODULO8_P3_6_4,
            MODULO8_P3_6_4_0,
            MODULO8_P4_1_4,
            MODULO8_P4_2_4,
            MODULO8_P4_3_4,
            MODULO8_P4_4_4,
            MODULO8_P4_5_4,
            MODULO8_P4_6_4,
            MODULO8_P4_6_4_0,
            MODULO8_P5_4,
            MODULO8_P6_1_4,
            MODULO8_P6_2_4,
            MODULO8_P6_3_4,
            MODULO8_P6_4_4,
            MODULO8_P6_5_4,
            MODULO8_P6_6_4,
            MODULO8_P7_4,
            MODULO8_P8_1_4,
            MODULO8_P8_2_4,
            MODULO8_P8_3_4,
            MODULO8_P8_4_4,
            MODULO8_P9_1_4,
            MODULO8_P9_2_4,
            MODULO8_P9_3_4,
            MODULO8_P9_4_4,
            MODULO8_P10_1_4,
            MODULO8_P10_2_4,
            MODULO8_P10_3_4,
            MODULO8_P10_4_4,
            MODULO8_P10_5_4,
            MODULO8_P10_6_4,
            MODULO8_P1_1_5,
            MODULO8_P1_2_5,
            MODULO8_P2_5,
            MODULO8_P3_1_5,
            MODULO8_P3_2_5,
            MODULO8_P3_3_5,
            MODULO8_P3_4_5,
            MODULO8_P3_5_5,
            MODULO8_P3_6_5,
            MODULO8_P3_6_5_0,
            MODULO8_P4_1_5,
            MODULO8_P4_2_5,
            MODULO8_P4_3_5,
            MODULO8_P4_4_5,
            MODULO8_P4_5_5,
            MODULO8_P4_6_5,
            MODULO8_P4_6_5_0,
            MODULO8_P5_5,
            MODULO8_P6_1_5,
            MODULO8_P6_2_5,
            MODULO8_P6_3_5,
            MODULO8_P6_4_5,
            MODULO8_P6_5_5,
            MODULO8_P6_6_5,
            MODULO8_P7_5,
            MODULO8_P8_1_5,
            MODULO8_P8_2_5,
            MODULO8_P8_3_5,
            MODULO8_P8_4_5,
            MODULO8_P9_1_5,
            MODULO8_P9_2_5,
            MODULO8_P9_3_5,
            MODULO8_P9_4_5,
            MODULO8_P10_1_5,
            MODULO8_P10_2_5,
            MODULO8_P10_3_5,
            MODULO8_P10_4_5,
            MODULO8_P10_5_5,
            MODULO8_P10_6_5,
            MODULO8_P1_1_6,
            MODULO8_P1_2_6,
            MODULO8_P2_6,
            MODULO8_P3_1_6,
            MODULO8_P3_2_6,
            MODULO8_P3_3_6,
            MODULO8_P3_4_6,
            MODULO8_P3_5_6,
            MODULO8_P3_6_6,
            MODULO8_P3_6_6_0,
            MODULO8_P4_1_6,
            MODULO8_P4_2_6,
            MODULO8_P4_3_6,
            MODULO8_P4_4_6,
            MODULO8_P4_5_6,
            MODULO8_P4_6_6,
            MODULO8_P4_6_6_0,
            MODULO8_P5_6,
            MODULO8_P6_1_6,
            MODULO8_P6_2_6,
            MODULO8_P6_3_6,
            MODULO8_P6_4_6,
            MODULO8_P6_5_6,
            MODULO8_P6_6_6,
            MODULO8_P7_6,
            MODULO8_P8_1_6,
            MODULO8_P8_2_6,
            MODULO8_P8_3_6,
            MODULO8_P8_4_6,
            MODULO8_P9_1_6,
            MODULO8_P9_2_6,
            MODULO8_P9_3_6,
            MODULO8_P9_4_6,
            MODULO8_P10_1_6,
            MODULO8_P10_2_6,
            MODULO8_P10_3_6,
            MODULO8_P10_4_6,
            MODULO8_P10_5_6,
            MODULO8_P10_6_6,
            MODULO8_OBS_MOD_VIII,
            MODULO8_USUCREACION,MODULO8_FECCREACION, MODULO8_USUREGISTRO,MODULO8_FECREGISTRO
    };
    //MODULO 9
    public static final String[] ALL_COLUMNS_MODULO9 = {
            MODULO9_ID,
            MODULO9_P0_0,
            MODULO9_P0_1,
            MODULO9_P0_2,
            MODULO9_P0_3,
            MODULO9_P1,
            MODULO9_P2,
            MODULO9_OBS_MOD_IX,
            MODULO9_USUCREACION,MODULO9_FECCREACION, MODULO9_USUREGISTRO,MODULO9_FECREGISTRO
    };

    //MODULO 10
    public static final String[] ALL_COLUMNS_MODULO10 = {
            MODULO10_ID,
            MODULO10_P0_0,
            MODULO10_P0_1,
            MODULO10_P0_2,
            MODULO10_P0_3,
            MODULO10_P1,
            MODULO10_P2,
            MODULO10_P3,
            MODULO10_P4,
            MODULO10_OBS_MOD_X,
            MODULO10_USUCREACION,MODULO10_FECCREACION, MODULO10_USUREGISTRO,MODULO10_FECREGISTRO
    };



}


