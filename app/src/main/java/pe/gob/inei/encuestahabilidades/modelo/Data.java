package pe.gob.inei.encuestahabilidades.modelo;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;

import java.lang.reflect.Array;
import java.util.ArrayList;

import pe.gob.inei.encuestahabilidades.pojos.BDFragment;
import pe.gob.inei.encuestahabilidades.pojos.Caratula;
import pe.gob.inei.encuestahabilidades.pojos.DatosEntrevista;
import pe.gob.inei.encuestahabilidades.pojos.Identificacion;
import pe.gob.inei.encuestahabilidades.pojos.Marco;
import pe.gob.inei.encuestahabilidades.pojos.Modulo1;
import pe.gob.inei.encuestahabilidades.pojos.Modulo10;
import pe.gob.inei.encuestahabilidades.pojos.Modulo2;
import pe.gob.inei.encuestahabilidades.pojos.Modulo3;
import pe.gob.inei.encuestahabilidades.pojos.Modulo4;
import pe.gob.inei.encuestahabilidades.pojos.Modulo5;
import pe.gob.inei.encuestahabilidades.pojos.Modulo5Dinamico;
import pe.gob.inei.encuestahabilidades.pojos.Modulo6;
import pe.gob.inei.encuestahabilidades.pojos.Modulo7;
import pe.gob.inei.encuestahabilidades.pojos.Modulo8;
import pe.gob.inei.encuestahabilidades.pojos.Modulo9;
import pe.gob.inei.encuestahabilidades.pojos.Ubigeo;
import pe.gob.inei.encuestahabilidades.pojos.Usuario;
import pe.gob.inei.encuestahabilidades.pojos.Visita;

/**
 * Created by user on 9/08/2017.
 */

public class Data {
    Context contexto;
    SQLiteOpenHelper sqLiteOpenHelper;
    SQLiteDatabase sqLiteDatabase;

    public Data(Context contexto) {
        this.contexto = contexto;
        sqLiteOpenHelper = new DBHelper(contexto);
        sqLiteDatabase = sqLiteOpenHelper.getWritableDatabase();
    }

    public void open(){
        sqLiteDatabase = sqLiteOpenHelper.getWritableDatabase();
    }

    public void close(){
        sqLiteOpenHelper.close();
    }

    public long getNumeroItemsMarco(){
        return DatabaseUtils.queryNumEntries(sqLiteDatabase,SQLConstantes.tableMarco);
    }
    public long getNumeroItemsUsuario(){
        return DatabaseUtils.queryNumEntries(sqLiteDatabase,SQLConstantes.tableUsuarios);
    }
    public long getNumeroItemsUbigeo(){
        return DatabaseUtils.queryNumEntries(sqLiteDatabase,SQLConstantes.tableUbigeo);
    }
    public long getNumeroItemsVisita(){
        return DatabaseUtils.queryNumEntries(sqLiteDatabase,SQLConstantes.tableVisitas);
    }
    public long getNumeroItemsCaratula(){
        return DatabaseUtils.queryNumEntries(sqLiteDatabase,SQLConstantes.tableCaratulas);
    }
    public long getNumeroItemsIdentificacion(){
        return DatabaseUtils.queryNumEntries(sqLiteDatabase,SQLConstantes.tableIdentificaciones);
    }
    public long getNumeroItemsFragment(){
        return DatabaseUtils.queryNumEntries(sqLiteDatabase,SQLConstantes.tableFragments);
    }
    public long getNumeroItemsModulo1(){
        return DatabaseUtils.queryNumEntries(sqLiteDatabase,SQLConstantes.tableModulo1);
    }
    public long getNumeroItemsModulo2(){
        return DatabaseUtils.queryNumEntries(sqLiteDatabase,SQLConstantes.tableModulo2);
    }
    public long getNumeroItemsModulo3(){
        return DatabaseUtils.queryNumEntries(sqLiteDatabase,SQLConstantes.tableModulo3);
    }
    public long getNumeroItemsModulo4(){
        return DatabaseUtils.queryNumEntries(sqLiteDatabase,SQLConstantes.tableModulo4);
    }
    public long getNumeroItemsModulo5(){
        return DatabaseUtils.queryNumEntries(sqLiteDatabase,SQLConstantes.tableModulo5);
    }
    public long getNumeroItemsModulo5Dinamico(){
        return DatabaseUtils.queryNumEntries(sqLiteDatabase,SQLConstantes.tableModulo5Dinamica);
    }
    public long getNumeroItemsModulo6(){
        return DatabaseUtils.queryNumEntries(sqLiteDatabase,SQLConstantes.tableModulo6);
    }
    public long getNumeroItemsModulo7(){
        return DatabaseUtils.queryNumEntries(sqLiteDatabase,SQLConstantes.tableModulo7);
    }
    public long getNumeroItemsModulo8(){
        return DatabaseUtils.queryNumEntries(sqLiteDatabase,SQLConstantes.tableModulo8);
    }
    public long getNumeroItemsModulo9(){
        return DatabaseUtils.queryNumEntries(sqLiteDatabase,SQLConstantes.tableModulo9);
    }
    public long getNumeroItemsModulo10(){
        return DatabaseUtils.queryNumEntries(sqLiteDatabase,SQLConstantes.tableModulo10);
    }

    public Marco getMarco(String idEmpresa){
        Marco marco = new Marco();
        String[] whereArgs = new String[]{idEmpresa};
        Cursor cursor = null;
        try{
            cursor = sqLiteDatabase.query(SQLConstantes.tableMarco,
                    SQLConstantes.ALL_COLUMNS_MARCO,SQLConstantes.WHERE_CLAUSE_ID_EMPRESA,whereArgs,null,null,null);
            if(cursor.getCount() == 1){
                cursor.moveToFirst();
                marco.setID(cursor.getString(cursor.getColumnIndex(SQLConstantes.MARCO_ID)));
                marco.setRUC(cursor.getString(cursor.getColumnIndex(SQLConstantes.MARCO_RUC)));
                marco.setRAZON_SOCIAL(cursor.getString(cursor.getColumnIndex(SQLConstantes.MARCO_RAZON_SOCIAL)));
                marco.setNOMBRE_COMERCIAL(cursor.getString(cursor.getColumnIndex(SQLConstantes.MARCO_NOMBRE_COMERCIAL)));
                marco.setOPERADOR(cursor.getString(cursor.getColumnIndex(SQLConstantes.MARCO_OPERADOR)));
                marco.setJEFE(cursor.getString(cursor.getColumnIndex(SQLConstantes.MARCO_JEFE)));
                marco.setOBSERVADOR(cursor.getString(cursor.getColumnIndex(SQLConstantes.MARCO_OBSERVADOR)));
                marco.setANIO(cursor.getString(cursor.getColumnIndex(SQLConstantes.MARCO_ANIO)));
                marco.setMES(cursor.getString(cursor.getColumnIndex(SQLConstantes.MARCO_MES)));
                marco.setPERIODO(cursor.getString(cursor.getColumnIndex(SQLConstantes.MARCO_PERIODO)));
                marco.setCCDD(cursor.getString(cursor.getColumnIndex(SQLConstantes.MARCO_CCDD)));
                marco.setDEPARTAMENTO(cursor.getString(cursor.getColumnIndex(SQLConstantes.MARCO_DEPARTAMENTO)));
                marco.setCCPP(cursor.getString(cursor.getColumnIndex(SQLConstantes.MARCO_CCPP)));
                marco.setPROVINCIA(cursor.getString(cursor.getColumnIndex(SQLConstantes.MARCO_PROVINCIA)));
                marco.setCCDI(cursor.getString(cursor.getColumnIndex(SQLConstantes.MARCO_CCDI)));
                marco.setDISTRITO(cursor.getString(cursor.getColumnIndex(SQLConstantes.MARCO_DISTRITO)));
                marco.setT_EMPRESA(cursor.getString(cursor.getColumnIndex(SQLConstantes.MARCO_T_EMPRESA)));
                marco.setFRENTE(cursor.getString(cursor.getColumnIndex(SQLConstantes.MARCO_FRENTE)));
                marco.setZONA(cursor.getString(cursor.getColumnIndex(SQLConstantes.MARCO_ZONA)));
                marco.setMANZANA(cursor.getString(cursor.getColumnIndex(SQLConstantes.MARCO_MANZANA)));
                marco.setCAT_VIA(cursor.getString(cursor.getColumnIndex(SQLConstantes.MARCO_CAT_VIA)));
                marco.setNOM_VIA(cursor.getString(cursor.getColumnIndex(SQLConstantes.MARCO_NOM_VIA)));
                marco.setPUERTA(cursor.getString(cursor.getColumnIndex(SQLConstantes.MARCO_PUERTA)));
                marco.setINTERIOR(cursor.getString(cursor.getColumnIndex(SQLConstantes.MARCO_INTERIOR)));
                marco.setPISO(cursor.getString(cursor.getColumnIndex(SQLConstantes.MARCO_PISO)));
                marco.setMZ(cursor.getString(cursor.getColumnIndex(SQLConstantes.MARCO_MZ)));
                marco.setLOTE(cursor.getString(cursor.getColumnIndex(SQLConstantes.MARCO_LOTE)));
            }
        }finally{
            if(cursor != null) cursor.close();
        }
        return marco;
    }
    public ArrayList<Marco> getAllMarcos(String idUsuario, int permisoUsuario){
        ArrayList<Marco> marcos = new ArrayList<Marco>();
        String[] whereArgs = new String[]{String.valueOf(idUsuario)};
        Cursor cursor = null;
        try{
            switch (permisoUsuario){
                case 1: cursor = sqLiteDatabase.query(SQLConstantes.tableMarco, SQLConstantes.ALL_COLUMNS_MARCO,
                        SQLConstantes.WHERE_CLAUSE_ID_OPERADOR,whereArgs,null,null,null);break;
                case 2: cursor = sqLiteDatabase.query(SQLConstantes.tableMarco, SQLConstantes.ALL_COLUMNS_MARCO,
                        SQLConstantes.WHERE_CLAUSE_ID_JEFE,whereArgs,null,null,null);break;
                case 3: cursor = sqLiteDatabase.query(SQLConstantes.tableMarco, SQLConstantes.ALL_COLUMNS_MARCO,
                        SQLConstantes.WHERE_CLAUSE_ID_OBSERVADOR,whereArgs,null,null,null);break;
            }

            while(cursor.moveToNext()){
                Marco marco = new Marco();
                marco.setID(cursor.getString(cursor.getColumnIndex(SQLConstantes.MARCO_ID)));
                marco.setRUC(cursor.getString(cursor.getColumnIndex(SQLConstantes.MARCO_RUC)));
                marco.setRAZON_SOCIAL(cursor.getString(cursor.getColumnIndex(SQLConstantes.MARCO_RAZON_SOCIAL)));
                marco.setNOMBRE_COMERCIAL(cursor.getString(cursor.getColumnIndex(SQLConstantes.MARCO_NOMBRE_COMERCIAL)));
                marco.setOPERADOR(cursor.getString(cursor.getColumnIndex(SQLConstantes.MARCO_OPERADOR)));
                marco.setJEFE(cursor.getString(cursor.getColumnIndex(SQLConstantes.MARCO_JEFE)));
                marco.setOBSERVADOR(cursor.getString(cursor.getColumnIndex(SQLConstantes.MARCO_OBSERVADOR)));
                marco.setANIO(cursor.getString(cursor.getColumnIndex(SQLConstantes.MARCO_ANIO)));
                marco.setMES(cursor.getString(cursor.getColumnIndex(SQLConstantes.MARCO_MES)));
                marco.setPERIODO(cursor.getString(cursor.getColumnIndex(SQLConstantes.MARCO_PERIODO)));
                marco.setCCDD(cursor.getString(cursor.getColumnIndex(SQLConstantes.MARCO_CCDD)));
                marco.setDEPARTAMENTO(cursor.getString(cursor.getColumnIndex(SQLConstantes.MARCO_DEPARTAMENTO)));
                marco.setCCPP(cursor.getString(cursor.getColumnIndex(SQLConstantes.MARCO_CCPP)));
                marco.setPROVINCIA(cursor.getString(cursor.getColumnIndex(SQLConstantes.MARCO_PROVINCIA)));
                marco.setCCDI(cursor.getString(cursor.getColumnIndex(SQLConstantes.MARCO_CCDI)));
                marco.setDISTRITO(cursor.getString(cursor.getColumnIndex(SQLConstantes.MARCO_DISTRITO)));
                marco.setT_EMPRESA(cursor.getString(cursor.getColumnIndex(SQLConstantes.MARCO_T_EMPRESA)));
                marco.setFRENTE(cursor.getString(cursor.getColumnIndex(SQLConstantes.MARCO_FRENTE)));
                marco.setZONA(cursor.getString(cursor.getColumnIndex(SQLConstantes.MARCO_ZONA)));
                marco.setMANZANA(cursor.getString(cursor.getColumnIndex(SQLConstantes.MARCO_MANZANA)));
                marco.setCAT_VIA(cursor.getString(cursor.getColumnIndex(SQLConstantes.MARCO_CAT_VIA)));
                marco.setNOM_VIA(cursor.getString(cursor.getColumnIndex(SQLConstantes.MARCO_NOM_VIA)));
                marco.setPUERTA(cursor.getString(cursor.getColumnIndex(SQLConstantes.MARCO_PUERTA)));
                marco.setINTERIOR(cursor.getString(cursor.getColumnIndex(SQLConstantes.MARCO_INTERIOR)));
                marco.setPISO(cursor.getString(cursor.getColumnIndex(SQLConstantes.MARCO_PISO)));
                marco.setMZ(cursor.getString(cursor.getColumnIndex(SQLConstantes.MARCO_MZ)));
                marco.setLOTE(cursor.getString(cursor.getColumnIndex(SQLConstantes.MARCO_LOTE)));
                marcos.add(marco);
            }
        }finally {
            if(cursor != null) cursor.close();
        }
        return marcos;
    }

    public void insertarMarco(Marco marco){
        ContentValues contentValues = marco.toValues();
        sqLiteDatabase.insert(SQLConstantes.tableMarco,null,contentValues);
    }
    public void InsertarMarcos(ArrayList<Marco> empresas){
        long items = getNumeroItemsMarco();
        if(items == 0){
            for (Marco empresa : empresas) {
                try {
                    insertarMarco(empresa);
                }catch (SQLiteException e){
                    e.printStackTrace();
                }
            }
        }
    }

    //----------------------USUARIOS-----------------------------------------------------------------------------------------
    public void insertarUsuario(Usuario usuario){
        ContentValues contentValues = usuario.toValues();
        sqLiteDatabase.insert(SQLConstantes.tableUsuarios,null,contentValues);
    }
    public void insertarUsuarios(ArrayList<Usuario> usuarios){
        long items = getNumeroItemsUsuario();
        if(items == 0){
            for (Usuario usuario : usuarios) {
                try {
                    insertarUsuario(usuario);
                }catch (SQLiteException e){
                    e.printStackTrace();
                }
            }
        }
    }
    public Usuario getUsuario(String idUsuario){
        Usuario usuario = new Usuario();
        String[] whereArgs = new String[]{idUsuario};
        Cursor cursor = null;
        try{
            cursor = sqLiteDatabase.query(SQLConstantes.tableUsuarios,
                    SQLConstantes.ALL_COLUMNS_USUARIOS,SQLConstantes.WHERE_CLAUSE_ID_USUARIO,whereArgs,null,null,null);
            if(cursor.getCount() == 1){
                cursor.moveToFirst();
                usuario.setUSUARIO_ID(cursor.getString(cursor.getColumnIndex(SQLConstantes.USUARIO_ID)));
                usuario.setUSUARIO_PASSWORD(cursor.getString(cursor.getColumnIndex(SQLConstantes.USUARIO_PASSWORD)));
                usuario.setUSUARIO_PERMISO(cursor.getString(cursor.getColumnIndex(SQLConstantes.USUARIO_PERMISO)));
            }
        }finally{
            if(cursor != null) cursor.close();
        }
        return usuario;
    }
    //------------------FIN USUARIO-----------------------------------------------------------------------------------------------------

    //----------------------UBIGEOS-------------------------------------------------------------------------------------------------------
    public void insertarUbigeo(Ubigeo ubigeo){
        ContentValues contentValues = ubigeo.toValues();
        sqLiteDatabase.insert(SQLConstantes.tableUbigeo,null,contentValues);
    }
    public void insertarUbigeos(ArrayList<Ubigeo> ubigeos){
        long items = getNumeroItemsUbigeo();
        if(items == 0){
            for (Ubigeo ubigeo : ubigeos) {
                try {
                    insertarUbigeo(ubigeo);
                }catch (SQLiteException e){
                    e.printStackTrace();
                }
            }
        }
    }
    public ArrayList<String> getUbigeos(String idUbi){
        ArrayList<String> ubigeos = new ArrayList<String>();
        ubigeos.add("Seleccione");
        String[] whereArgs = new String[]{idUbi};
        long items = getNumeroItemsUbigeo();
        Cursor cursor = null;
        try{
            cursor = sqLiteDatabase.query(SQLConstantes.tableUbigeo,
                    SQLConstantes.ALL_COLUMNS_UBIGEOS,SQLConstantes.WHERE_CLAUSE_ID_UBIGEO,whereArgs,null,null,null);
            while(cursor.moveToNext()){
                ubigeos.add(cursor.getString(cursor.getColumnIndex(SQLConstantes.UBIGEO_DISTRITO)));
            }
        }finally{
            if(cursor != null) cursor.close();
        }
        return ubigeos;
    }
    //------------------FIN UBIGEO-----------------------------------------------------------------------------------------------------

    //------------------CARATULA-------------------------------------------------------------------------------------------------------

    public void insertarCaratula(Caratula caratula){
        ContentValues contentValues = caratula.toValues();
        sqLiteDatabase.insert(SQLConstantes.tableCaratulas,null,contentValues);
    }
    public void InsertarCaratulas(ArrayList<Caratula> caratulas){
        long items = getNumeroItemsCaratula();
        if(items == 0){
            for (Caratula caratula : caratulas) {
                try {
                    insertarCaratula(caratula);
                }catch (SQLiteException e){
                    e.printStackTrace();
                }
            }
        }
    }
    public void actualizarCaratula(String idEmpresa, ContentValues contentValues){
        String[] whereArgs = new String[]{idEmpresa};
        sqLiteDatabase.update(SQLConstantes.tableCaratulas,contentValues,SQLConstantes.WHERE_CLAUSE_ID_EMPRESA,whereArgs);
    }
    public boolean existeCaratula(String idEmpresa){
        boolean encontrado = false;
        String[] whereArgs = new String[]{idEmpresa};
        Cursor cursor = null;
        try{
            cursor = sqLiteDatabase.query(SQLConstantes.tableCaratulas,
                    SQLConstantes.ALL_COLUMNS_CARATULA,SQLConstantes.WHERE_CLAUSE_ID_EMPRESA,whereArgs,null,null,null);
            if(cursor.getCount() == 1) encontrado = true;
        }finally {
            if(cursor != null)cursor.close();
        }
        return encontrado;
    }
    public Caratula getCaratula(String idEmpresa){
        Caratula caratula = new Caratula();
        String[] whereArgs = new String[]{idEmpresa};
        Cursor cursor = null;
        try{
            cursor = sqLiteDatabase.query(SQLConstantes.tableCaratulas,
                    SQLConstantes.ALL_COLUMNS_CARATULA,SQLConstantes.WHERE_CLAUSE_ID_EMPRESA,whereArgs,null,null,null);
            if(cursor.getCount() == 1){
                cursor.moveToFirst();
                caratula.setID(cursor.getString(cursor.getColumnIndex(SQLConstantes.CARATULA_ID)));
                caratula.setCAMBIO(cursor.getString(cursor.getColumnIndex(SQLConstantes.CARATULA_CAMBIO)));
                caratula.setNOMBREDD(cursor.getString(cursor.getColumnIndex(SQLConstantes.CARATULA_DEPARTAMENTO)));
                caratula.setCCDD(cursor.getString(cursor.getColumnIndex(SQLConstantes.CARATULA_DEPARTAMENTO_COD)));
                caratula.setNOMBREPV(cursor.getString(cursor.getColumnIndex(SQLConstantes.CARATULA_PROVINCIA)));
                caratula.setCCPP(cursor.getString(cursor.getColumnIndex(SQLConstantes.CARATULA_PROVINCIA_COD)));
                caratula.setNOMBREDI(cursor.getString(cursor.getColumnIndex(SQLConstantes.CARATULA_DISTRITO)));
                caratula.setCCDI(cursor.getString(cursor.getColumnIndex(SQLConstantes.CARATULA_DISTRITO_COD)));
                caratula.setGPSLATITUD(cursor.getString(cursor.getColumnIndex(SQLConstantes.CARATULA_GPSLATITUD)));
                caratula.setGPSALTITUD(cursor.getString(cursor.getColumnIndex(SQLConstantes.CARATULA_GPSALTITUD)));
                caratula.setGPSLONGITUD(cursor.getString(cursor.getColumnIndex(SQLConstantes.CARATULA_GPSLONGITUD)));
                caratula.setCCST(cursor.getString(cursor.getColumnIndex(SQLConstantes.CARATULA_SECTOR)));
                caratula.setCCAT(cursor.getString(cursor.getColumnIndex(SQLConstantes.CARATULA_AREA)));
                caratula.setZON_NUM(cursor.getString(cursor.getColumnIndex(SQLConstantes.CARATULA_ZONA)));
                caratula.setMZ_ID(cursor.getString(cursor.getColumnIndex(SQLConstantes.CARATULA_MANZANA_MUESTRA)));
                caratula.setFRENTE(cursor.getString(cursor.getColumnIndex(SQLConstantes.CARATULA_FRENTE)));
                caratula.setTIPVIA(cursor.getString(cursor.getColumnIndex(SQLConstantes.CARATULA_TIPVIA)));
                caratula.setNOMVIA(cursor.getString(cursor.getColumnIndex(SQLConstantes.CARATULA_NOMVIA)));
                caratula.setNROPTA(cursor.getString(cursor.getColumnIndex(SQLConstantes.CARATULA_NPUERTA)));
                caratula.setBLOCK(cursor.getString(cursor.getColumnIndex(SQLConstantes.CARATULA_BLOCK)));
                caratula.setINT(cursor.getString(cursor.getColumnIndex(SQLConstantes.CARATULA_INTERIOR)));
                caratula.setPISO(cursor.getString(cursor.getColumnIndex(SQLConstantes.CARATULA_PISO)));
                caratula.setMZA(cursor.getString(cursor.getColumnIndex(SQLConstantes.CARATULA_MANZANA_VIA)));
                caratula.setLOTE(cursor.getString(cursor.getColumnIndex(SQLConstantes.CARATULA_LOTE)));
                caratula.setKM(cursor.getString(cursor.getColumnIndex(SQLConstantes.CARATULA_KM)));
                caratula.setREF_DIREC(cursor.getString(cursor.getColumnIndex(SQLConstantes.CARATULA_REFERENCIA)));
                caratula.setUSU_CREACION(cursor.getString(cursor.getColumnIndex(SQLConstantes.CARATULA_USUCREACION)));
                caratula.setFEC_CREACION(cursor.getString(cursor.getColumnIndex(SQLConstantes.CARATULA_FECCREACION)));
                caratula.setUSU_REGISTRO(cursor.getString(cursor.getColumnIndex(SQLConstantes.CARATULA_USUREGISTRO)));
                caratula.setFEC_REGISTRO(cursor.getString(cursor.getColumnIndex(SQLConstantes.CARATULA_FECREGISTRO)));
            }
        }finally{
            if(cursor != null) cursor.close();
        }
        return caratula;
    }
    public ArrayList<Caratula> getAllCaratulas(){
        ArrayList<Caratula> caratulas = new ArrayList<Caratula>();
        Cursor cursor = null;
        try{
            cursor = sqLiteDatabase.query(SQLConstantes.tableCaratulas,
                    SQLConstantes.ALL_COLUMNS_CARATULA,null,null,null,null,null);
            while(cursor.moveToNext()) {
                Caratula caratula = new Caratula();
                caratula.setID(cursor.getString(cursor.getColumnIndex(SQLConstantes.CARATULA_ID)));
                caratula.setCAMBIO(cursor.getString(cursor.getColumnIndex(SQLConstantes.CARATULA_CAMBIO)));
                caratula.setNOMBREDD(cursor.getString(cursor.getColumnIndex(SQLConstantes.CARATULA_DEPARTAMENTO)));
                caratula.setCCDD(cursor.getString(cursor.getColumnIndex(SQLConstantes.CARATULA_DEPARTAMENTO_COD)));
                caratula.setNOMBREPV(cursor.getString(cursor.getColumnIndex(SQLConstantes.CARATULA_PROVINCIA)));
                caratula.setCCPP(cursor.getString(cursor.getColumnIndex(SQLConstantes.CARATULA_PROVINCIA_COD)));
                caratula.setNOMBREDI(cursor.getString(cursor.getColumnIndex(SQLConstantes.CARATULA_DISTRITO)));
                caratula.setCCDI(cursor.getString(cursor.getColumnIndex(SQLConstantes.CARATULA_DISTRITO_COD)));
                caratula.setGPSLATITUD(cursor.getString(cursor.getColumnIndex(SQLConstantes.CARATULA_GPSLATITUD)));
                caratula.setGPSALTITUD(cursor.getString(cursor.getColumnIndex(SQLConstantes.CARATULA_GPSALTITUD)));
                caratula.setGPSLONGITUD(cursor.getString(cursor.getColumnIndex(SQLConstantes.CARATULA_GPSLONGITUD)));
                caratula.setCCST(cursor.getString(cursor.getColumnIndex(SQLConstantes.CARATULA_SECTOR)));
                caratula.setCCAT(cursor.getString(cursor.getColumnIndex(SQLConstantes.CARATULA_AREA)));
                caratula.setZON_NUM(cursor.getString(cursor.getColumnIndex(SQLConstantes.CARATULA_ZONA)));
                caratula.setMZ_ID(cursor.getString(cursor.getColumnIndex(SQLConstantes.CARATULA_MANZANA_MUESTRA)));
                caratula.setFRENTE(cursor.getString(cursor.getColumnIndex(SQLConstantes.CARATULA_FRENTE)));
                caratula.setTIPVIA(cursor.getString(cursor.getColumnIndex(SQLConstantes.CARATULA_TIPVIA)));
                caratula.setNOMVIA(cursor.getString(cursor.getColumnIndex(SQLConstantes.CARATULA_NOMVIA)));
                caratula.setNROPTA(cursor.getString(cursor.getColumnIndex(SQLConstantes.CARATULA_NPUERTA)));
                caratula.setBLOCK(cursor.getString(cursor.getColumnIndex(SQLConstantes.CARATULA_BLOCK)));
                caratula.setINT(cursor.getString(cursor.getColumnIndex(SQLConstantes.CARATULA_INTERIOR)));
                caratula.setPISO(cursor.getString(cursor.getColumnIndex(SQLConstantes.CARATULA_PISO)));
                caratula.setMZA(cursor.getString(cursor.getColumnIndex(SQLConstantes.CARATULA_MANZANA_VIA)));
                caratula.setLOTE(cursor.getString(cursor.getColumnIndex(SQLConstantes.CARATULA_LOTE)));
                caratula.setKM(cursor.getString(cursor.getColumnIndex(SQLConstantes.CARATULA_KM)));
                caratula.setREF_DIREC(cursor.getString(cursor.getColumnIndex(SQLConstantes.CARATULA_REFERENCIA)));
                caratula.setUSU_CREACION(cursor.getString(cursor.getColumnIndex(SQLConstantes.CARATULA_USUCREACION)));
                caratula.setFEC_CREACION(cursor.getString(cursor.getColumnIndex(SQLConstantes.CARATULA_FECCREACION)));
                caratula.setUSU_REGISTRO(cursor.getString(cursor.getColumnIndex(SQLConstantes.CARATULA_USUREGISTRO)));
                caratula.setFEC_REGISTRO(cursor.getString(cursor.getColumnIndex(SQLConstantes.CARATULA_FECREGISTRO)));
                caratulas.add(caratula);
            }
        }finally {
            if(cursor!=null) cursor.close();
        }
        return caratulas;
    }
    public void deleteCaratula(String idEmpresa){
        String[] whereArgs = new String[]{idEmpresa};
        sqLiteDatabase.delete(SQLConstantes.tableCaratulas,SQLConstantes.WHERE_CLAUSE_ID_EMPRESA,whereArgs);
    }

//-----------------------------------------FIN CARATULA-------------------------------------------------------------------------------

    //----------------------------------------IDENTIFICACION---------------------------------------------------------------------------
    public void insertarIdentificacion(Identificacion identificacion){
        ContentValues contentValues = identificacion.toValues();
        sqLiteDatabase.insert(SQLConstantes.tableIdentificaciones,null,contentValues);
    }

    public void InsertarIdentificaciones(ArrayList<Identificacion> identificaciones){
        long items = getNumeroItemsIdentificacion();
        if(items == 0){
            for (Identificacion identificacion : identificaciones) {
                try {
                    insertarIdentificacion(identificacion);
                }catch (SQLiteException e){
                    e.printStackTrace();
                }
            }
        }
    }

    public boolean existeIdentificacion(String idEmpresa){
        boolean encontrado = false;
        String[] whereArgs = new String[]{idEmpresa};
        Cursor cursor = null;
        try{
            cursor = sqLiteDatabase.query(SQLConstantes.tableIdentificaciones,
                    SQLConstantes.ALL_COLUMNS_IDENTIFICACIONES,SQLConstantes.WHERE_CLAUSE_ID_EMPRESA,whereArgs,null,null,null);
            if(cursor.getCount() == 1) encontrado = true;
        }finally {
            if(cursor != null)cursor.close();
        }
        return encontrado;
    }

    public void actualizarIdentificacion(String idEmpresa, ContentValues contentValues){
        String[] whereArgs = new String[]{idEmpresa};
        sqLiteDatabase.update(SQLConstantes.tableIdentificaciones,contentValues,SQLConstantes.WHERE_CLAUSE_ID_EMPRESA,whereArgs);
    }

    public Identificacion getIdentificacion(String idEmpresa){
        Identificacion identificacion = new Identificacion();
        String[] whereArgs = new String[]{idEmpresa};
        Cursor cursor = null;
        try{
            cursor = sqLiteDatabase.query(SQLConstantes.tableIdentificaciones,
                    SQLConstantes.ALL_COLUMNS_IDENTIFICACIONES,SQLConstantes.WHERE_CLAUSE_ID_EMPRESA,whereArgs,null,null,null);
            if(cursor.getCount() == 1){
                cursor.moveToFirst();
                identificacion.setID(cursor.getString(cursor.getColumnIndex(SQLConstantes.IDENTIFICACION_ID)));
                identificacion.setNUM_RUC(cursor.getString(cursor.getColumnIndex(SQLConstantes.IDENTIFICACION_RUC)));
                identificacion.setRAZON_SOCIAL(cursor.getString(cursor.getColumnIndex(SQLConstantes.IDENTIFICACION_RAZON)));
                identificacion.setNOM_COMER_COOP(cursor.getString(cursor.getColumnIndex(SQLConstantes.IDENTIFICACION_NOMBRE)));
                identificacion.setANIO_FUNDACION(cursor.getString(cursor.getColumnIndex(SQLConstantes.IDENTIFICACION_ANIO_FUNDACION)));
                identificacion.setPAG_WEB(cursor.getString(cursor.getColumnIndex(SQLConstantes.IDENTIFICACION_WEB)));
                identificacion.setPAG_WEB_NO(cursor.getString(cursor.getColumnIndex(SQLConstantes.IDENTIFICACION_WEBNO)));
                identificacion.setCORREO(cursor.getString(cursor.getColumnIndex(SQLConstantes.IDENTIFICACION_CORREO)));
                identificacion.setCORREO_NO(cursor.getString(cursor.getColumnIndex(SQLConstantes.IDENTIFICACION_CORREONO)));
                identificacion.setCOD_FIJO(cursor.getString(cursor.getColumnIndex(SQLConstantes.IDENTIFICACION_CODFIJO)));
                identificacion.setTEL_FIJO(cursor.getString(cursor.getColumnIndex(SQLConstantes.IDENTIFICACION_FIJO)));
                identificacion.setTEL_FIJO_NO(cursor.getString(cursor.getColumnIndex(SQLConstantes.IDENTIFICACION_FIJONO)));
                identificacion.setTEL_MOVIL(cursor.getString(cursor.getColumnIndex(SQLConstantes.IDENTIFICACION_MOVIL)));
                identificacion.setTEL_MOVIL_NO(cursor.getString(cursor.getColumnIndex(SQLConstantes.IDENTIFICACION_MOVILNO)));
                identificacion.setANIO_OPERACION(cursor.getString(cursor.getColumnIndex(SQLConstantes.IDENTIFICACION_ANIO_FUNCIONAMIENTO)));
                identificacion.setNOM_INFORMANTE(cursor.getString(cursor.getColumnIndex(SQLConstantes.IDENTIFICACION_CONDUCTOR_NOMBRE)));
                identificacion.setSEXO_INFORMANTE(cursor.getString(cursor.getColumnIndex(SQLConstantes.IDENTIFICACION_CONDUCTOR_SEXO)));
                identificacion.setEDAD_INFORMANTE(cursor.getString(cursor.getColumnIndex(SQLConstantes.IDENTIFICACION_CONDUCTOR_EDAD)));
                identificacion.setACAD_INFORMANTE(cursor.getString(cursor.getColumnIndex(SQLConstantes.IDENTIFICACION_CONDUCTOR_ESTUDIOS)));
                identificacion.setCARGO_INFORMANTE(cursor.getString(cursor.getColumnIndex(SQLConstantes.IDENTIFICACION_CONDUCTOR_CARGO)));
                identificacion.setCARGO_INFORMANTE_ESP(cursor.getString(cursor.getColumnIndex(SQLConstantes.IDENTIFICACION_CONDUCTOR_CARGO_ESP)));
                identificacion.setUSU_CREACION(cursor.getString(cursor.getColumnIndex(SQLConstantes.IDENTIFICACION_USUCREACION)));
                identificacion.setFEC_CREACION(cursor.getString(cursor.getColumnIndex(SQLConstantes.IDENTIFICACION_FECCREACION)));
                identificacion.setUSU_REGISTRO(cursor.getString(cursor.getColumnIndex(SQLConstantes.IDENTIFICACION_USUREGISTRO)));
                identificacion.setFEC_REGISTRO(cursor.getString(cursor.getColumnIndex(SQLConstantes.IDENTIFICACION_FECREGISTRO)));
            }
        }finally {
            if(cursor != null) cursor.close();
        }
        return identificacion;
    }
    public ArrayList<Identificacion> getAllIdentificaciones(){
        ArrayList<Identificacion> identificaciones = new ArrayList<Identificacion>();
        Cursor cursor = null;
        try{
            cursor = sqLiteDatabase.query(SQLConstantes.tableIdentificaciones,
                    SQLConstantes.ALL_COLUMNS_IDENTIFICACIONES,null,null,null,null,null);
            while(cursor.moveToNext()){
                Identificacion identificacion = new Identificacion();
                identificacion.setID(cursor.getString(cursor.getColumnIndex(SQLConstantes.IDENTIFICACION_ID)));
                identificacion.setNUM_RUC(cursor.getString(cursor.getColumnIndex(SQLConstantes.IDENTIFICACION_RUC)));
                identificacion.setRAZON_SOCIAL(cursor.getString(cursor.getColumnIndex(SQLConstantes.IDENTIFICACION_RAZON)));
                identificacion.setNOM_COMER_COOP(cursor.getString(cursor.getColumnIndex(SQLConstantes.IDENTIFICACION_NOMBRE)));
                identificacion.setANIO_FUNDACION(cursor.getString(cursor.getColumnIndex(SQLConstantes.IDENTIFICACION_ANIO_FUNDACION)));
                identificacion.setPAG_WEB(cursor.getString(cursor.getColumnIndex(SQLConstantes.IDENTIFICACION_WEB)));
                identificacion.setPAG_WEB_NO(cursor.getString(cursor.getColumnIndex(SQLConstantes.IDENTIFICACION_WEBNO)));
                identificacion.setCORREO(cursor.getString(cursor.getColumnIndex(SQLConstantes.IDENTIFICACION_CORREO)));
                identificacion.setCORREO_NO(cursor.getString(cursor.getColumnIndex(SQLConstantes.IDENTIFICACION_CORREONO)));
                identificacion.setCOD_FIJO(cursor.getString(cursor.getColumnIndex(SQLConstantes.IDENTIFICACION_CODFIJO)));
                identificacion.setTEL_FIJO(cursor.getString(cursor.getColumnIndex(SQLConstantes.IDENTIFICACION_FIJO)));
                identificacion.setTEL_FIJO_NO(cursor.getString(cursor.getColumnIndex(SQLConstantes.IDENTIFICACION_FIJONO)));
                identificacion.setTEL_MOVIL(cursor.getString(cursor.getColumnIndex(SQLConstantes.IDENTIFICACION_MOVIL)));
                identificacion.setTEL_MOVIL_NO(cursor.getString(cursor.getColumnIndex(SQLConstantes.IDENTIFICACION_MOVILNO)));
                identificacion.setANIO_OPERACION(cursor.getString(cursor.getColumnIndex(SQLConstantes.IDENTIFICACION_ANIO_FUNCIONAMIENTO)));
                identificacion.setNOM_INFORMANTE(cursor.getString(cursor.getColumnIndex(SQLConstantes.IDENTIFICACION_CONDUCTOR_NOMBRE)));
                identificacion.setSEXO_INFORMANTE(cursor.getString(cursor.getColumnIndex(SQLConstantes.IDENTIFICACION_CONDUCTOR_SEXO)));
                identificacion.setEDAD_INFORMANTE(cursor.getString(cursor.getColumnIndex(SQLConstantes.IDENTIFICACION_CONDUCTOR_EDAD)));
                identificacion.setACAD_INFORMANTE(cursor.getString(cursor.getColumnIndex(SQLConstantes.IDENTIFICACION_CONDUCTOR_ESTUDIOS)));
                identificacion.setCARGO_INFORMANTE(cursor.getString(cursor.getColumnIndex(SQLConstantes.IDENTIFICACION_CONDUCTOR_CARGO)));
                String especifique = cursor.getString(cursor.getColumnIndex(SQLConstantes.IDENTIFICACION_CONDUCTOR_CARGO_ESP));
                identificacion.setCARGO_INFORMANTE_ESP(especifique);
                identificacion.setUSU_CREACION(cursor.getString(cursor.getColumnIndex(SQLConstantes.IDENTIFICACION_USUCREACION)));
                identificacion.setFEC_CREACION(cursor.getString(cursor.getColumnIndex(SQLConstantes.IDENTIFICACION_FECCREACION)));
                identificacion.setUSU_REGISTRO(cursor.getString(cursor.getColumnIndex(SQLConstantes.IDENTIFICACION_USUREGISTRO)));
                identificacion.setFEC_REGISTRO(cursor.getString(cursor.getColumnIndex(SQLConstantes.IDENTIFICACION_FECREGISTRO)));
                identificaciones.add(identificacion);
            }
        }finally {
            if(cursor != null) cursor.close();
        }
        return identificaciones;
    }
    public void deleteIdentificacion(String idEmpresa){
        String[] whereArgs = new String[]{idEmpresa};
        sqLiteDatabase.delete(SQLConstantes.tableIdentificaciones,SQLConstantes.WHERE_CLAUSE_ID_EMPRESA,whereArgs);
    }
    //-----------------FIN IDENTIFICACION----------------------------------------------------------------------------------------------
    //----------------FRAGMENTS-----------------------------------------------------------------------------------------------
    public BDFragment getFragment(String idFragment){
        BDFragment bdFragment = new BDFragment();
        String[] whereArgs = new String[]{idFragment};
        Cursor cursor = null;
        try {
            cursor = sqLiteDatabase.query(SQLConstantes.tableFragments,
                    SQLConstantes.ALL_COLUMNS_FRAGMENTS, SQLConstantes.WHERE_CLAUSE_ID_EMPRESA, whereArgs, null, null, null);
            if (cursor.getCount() == 1) {
                cursor.moveToFirst();
                bdFragment.setFRAGMENT_ID(cursor.getString(cursor.getColumnIndex(SQLConstantes.FRAGMENT_ID)));
                bdFragment.setFRAGMENT_HABILITADO(cursor.getString(cursor.getColumnIndex(SQLConstantes.FRAGMENT_HABILITADO)));
                bdFragment.setFRAGMENT_AVANCE(cursor.getString(cursor.getColumnIndex(SQLConstantes.FRAGMENT_AVANCE)));
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            if(cursor != null) cursor.close();
        }
        return bdFragment;
    }

    public boolean existeFragment(String idFragment){
        boolean encontrado = false;
        String[] whereArgs = new String[]{idFragment};
        Cursor cursor = null;
        try{
            cursor = sqLiteDatabase.query(SQLConstantes.tableFragments,
                    SQLConstantes.ALL_COLUMNS_FRAGMENTS,SQLConstantes.WHERE_CLAUSE_ID_EMPRESA,whereArgs,null,null,null);
            if(cursor.getCount() == 1) encontrado = true;
        }finally {
            if(cursor != null){
                cursor.close();
            }
        }
        return encontrado;
    }

    public void insertarFragment(BDFragment bdFragment){
        ContentValues contentValues = bdFragment.toValues();
        sqLiteDatabase.insert(SQLConstantes.tableFragments,null,contentValues);
    }

    public void insertarFragments(ArrayList<BDFragment> bdFragments){
        long items = getNumeroItemsFragment();
        for (BDFragment bdFragment : bdFragments) {
            try {
                insertarFragment(bdFragment);
            }catch (SQLiteException e){
                e.printStackTrace();
            }

        }

    }
    public void actualizarFragment(String idFragment, ContentValues contentValues){
        String[] whereArgs = new String[]{idFragment};
        sqLiteDatabase.update(SQLConstantes.tableFragments,contentValues,SQLConstantes.WHERE_CLAUSE_ID_EMPRESA,whereArgs);
    }
//------------------------------------------FIN FRAGMENTS--------------------------------------------------------------------------

    //----------------------------------DATOS ENTREVISTA -----------------------------------------------------------------------------

    public boolean existeDatosEntrevista(String idEmpresa){
        boolean encontrado = false;
        String[] whereArgs = new String[]{idEmpresa};
        Cursor cursor = null;
        try{
            cursor = sqLiteDatabase.query(SQLConstantes.tableDatosEntrevista,
                    SQLConstantes.ALL_COLUMNS_DATOS_ENTREVISTA,SQLConstantes.WHERE_CLAUSE_ID_EMPRESA,whereArgs,null,null,null);
            if(cursor.getCount() == 1) encontrado = true;
        }finally {
            if(cursor != null)cursor.close();
        }
        return encontrado;
    }


    public void insertarDatosEntrevista(DatosEntrevista datosEntrevista){
        ContentValues contentValues = datosEntrevista.toValues();
        sqLiteDatabase.insert(SQLConstantes.tableDatosEntrevista,null,contentValues);
    }
    public void actualizarDatosEntrevista(String idempresa, ContentValues contentValues){
        String[] whereArgs = new String[]{idempresa};
        sqLiteDatabase.update(SQLConstantes.tableDatosEntrevista,contentValues,SQLConstantes.WHERE_CLAUSE_ID_EMPRESA,whereArgs);
    }

    public DatosEntrevista getDatosEntrevista(String idEmpresa){
        DatosEntrevista datosEntrevista = new DatosEntrevista();
        String[] whereArgs = new String[]{idEmpresa};
        Cursor cursor = null;
        try{
            cursor = sqLiteDatabase.query(SQLConstantes.tableDatosEntrevista,
                    SQLConstantes.ALL_COLUMNS_DATOS_ENTREVISTA,SQLConstantes.WHERE_CLAUSE_ID_EMPRESA,whereArgs,null,null,null);
            if(cursor.getCount() == 1){
                cursor.moveToFirst();
                datosEntrevista.setID(cursor.getString(cursor.getColumnIndex(SQLConstantes.DATOS_ID)));
                datosEntrevista.setDNI_OPERADOR(cursor.getString(cursor.getColumnIndex(SQLConstantes.DATOS_DNI_OPERADOR)));
                datosEntrevista.setDNI_JEFE(cursor.getString(cursor.getColumnIndex(SQLConstantes.DATOS_DNI_JEFE)));
                datosEntrevista.setDNI_SUPERVISOR(cursor.getString(cursor.getColumnIndex(SQLConstantes.DATOS_DNI_SUPERVISOR)));
                datosEntrevista.setNOM_OPERADOR(cursor.getString(cursor.getColumnIndex(SQLConstantes.DATOS_NOMBRE_OPERADOR)));
                datosEntrevista.setNOM_JEFE(cursor.getString(cursor.getColumnIndex(SQLConstantes.DATOS_NOMBRE_JEFE)));
                datosEntrevista.setNOM_SUPERVISOR(cursor.getString(cursor.getColumnIndex(SQLConstantes.DATOS_NOMBRE_SUPERVISOR)));
                datosEntrevista.setR_ENCUESTA(cursor.getString(cursor.getColumnIndex(SQLConstantes.DATOS_RESULTADO_FINAL)));
                datosEntrevista.setR_ENCUESTA_ESP(cursor.getString(cursor.getColumnIndex(SQLConstantes.DATOS_RESULTADO_FINAL_ESP)));
                datosEntrevista.setR_FECHA_DIA(cursor.getString(cursor.getColumnIndex(SQLConstantes.DATOS_FECHA_FINAL_DIA)));
                datosEntrevista.setR_FECHA_MES(cursor.getString(cursor.getColumnIndex(SQLConstantes.DATOS_FECHA_FINAL_MES)));
                datosEntrevista.setR_FECHA_ANIO(cursor.getString(cursor.getColumnIndex(SQLConstantes.DATOS_FECHA_FINAL_ANIO)));
                datosEntrevista.setR_ESTADO_ENVIO(cursor.getString(cursor.getColumnIndex(SQLConstantes.DATOS_ESTADO_ENVIO)));
                datosEntrevista.setUSU_CREACION(cursor.getString(cursor.getColumnIndex(SQLConstantes.DATOS_USUCREACION)));
                datosEntrevista.setFEC_CREACION(cursor.getString(cursor.getColumnIndex(SQLConstantes.DATOS_FECCREACION)));
                datosEntrevista.setUSU_REGISTRO(cursor.getString(cursor.getColumnIndex(SQLConstantes.DATOS_USUREGISTRO)));
                datosEntrevista.setFEC_REGISTRO(cursor.getString(cursor.getColumnIndex(SQLConstantes.DATOS_FECREGISTRO)));
            }
        }finally {
            if(cursor != null)cursor.close();
        }
        return datosEntrevista;
    }
    public void deleteDatosEntrevista(String idEmpresa){
        String[] whereArgs = new String[]{idEmpresa};
        sqLiteDatabase.delete(SQLConstantes.tableDatosEntrevista,SQLConstantes.WHERE_CLAUSE_ID_EMPRESA,whereArgs);
    }
    //--------------------------------------FIN DATOS ENTREVISTAS----------------------------------------------------------------------

    //--------------------------------------MODULO1------------------------------------------------------------------------------------
    public Modulo1 getModulo1(String idEmpresa){
        Modulo1 modulo1 = new Modulo1();
        String[] whereArgs = new String[]{idEmpresa};
        Cursor cursor = null;
        try{
            cursor = sqLiteDatabase.query(SQLConstantes.tableModulo1,
                    SQLConstantes.ALL_COLUMNS_MODULO1,SQLConstantes.WHERE_CLAUSE_ID_EMPRESA,whereArgs,null,null,null);
            if(cursor.getCount() == 1){
                cursor.moveToFirst();
                modulo1.setMODULO1_ID(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO1_ID)));
                modulo1.setC1_P0_0(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO1_P0_0)));
                modulo1.setC1_P0_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO1_P0_1)));
                modulo1.setC1_P0_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO1_P0_2)));
                modulo1.setC1_P0_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO1_P0_3)));
                modulo1.setC1_P1_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO1_P1_1)));
                modulo1.setC1_P1_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO1_P1_2)));
                modulo1.setC1_P1_2_DETALLE(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO1_P1_2_DETALLE)));
                modulo1.setC1_P2_1_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO1_P2_1_1)));
                modulo1.setC1_P2_1_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO1_P2_1_2)));
                modulo1.setC1_P2_1_2_DETALLE(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO1_P2_1_2_DETALLE)));
                modulo1.setC1_P2_1_NO(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO1_P2_1_NO)));
                modulo1.setC1_P2_2_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO1_P2_2_1)));
                modulo1.setC1_P2_2_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO1_P2_2_2)));
                modulo1.setC1_P2_2_2_DETALLE(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO1_P2_2_2_DETALLE)));
                modulo1.setC1_P2_2_NO(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO1_P2_2_NO)));
                modulo1.setC1_P3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO1_P3)));
                modulo1.setC1_P3_0(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO1_P3_0)));
                modulo1.setC1_P4_1_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO1_P4_1_1)));
                modulo1.setC1_P4_2_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO1_P4_2_1)));
                modulo1.setC1_P5(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO1_P5)));
                modulo1.setC1_P6_0(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO1_P6_0)));
                modulo1.setC1_P6_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO1_P6_1)));
                modulo1.setC1_P7_1_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO1_P7_1_1)));
                modulo1.setC1_P7_2_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO1_P7_2_1)));
                modulo1.setC1_P7_1_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO1_P7_1_2)));
                modulo1.setC1_P7_2_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO1_P7_2_2)));
                modulo1.setC1_P8(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO1_P8)));
                modulo1.setC1_P9(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO1_P9)));
                modulo1.setC1_P10(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO1_P10)));
                modulo1.setC1_P11(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO1_P11)));
                modulo1.setC1_P11_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO1_P11_1)));
                modulo1.setC1_P11_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO1_P11_2)));
                modulo1.setC1_P12_NO(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO1_P12_NO)));
                modulo1.setC1_P12_TIPVIA(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO1_P12_TIPVIA)));
                modulo1.setC1_P12_NOMVIA(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO1_P12_NOMVIA )));
                modulo1.setC1_P12_NROPTA(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO1_P12_NROPTA)));
                modulo1.setC1_P12_BLOCK(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO1_P12_BLOCK)));
                modulo1.setC1_P12_INT(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO1_P12_INT)));
                modulo1.setC1_P12_PISO(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO1_P12_PISO)));
                modulo1.setC1_P12_MZA(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO1_P12_MZA)));
                modulo1.setC1_P12_LOTE(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO1_P12_LOTE)));
                modulo1.setC1_P12_KM(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO1_P12_KM)));
                modulo1.setC1_P12_DIST(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO1_P12_DIST)));
                modulo1.setC1_P12_CCDI(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO1_P12_CCDI)));
                modulo1.setC1_P12_PROV(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO1_P12_PROV)));
                modulo1.setC1_P12_CCPP(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO1_P12_CCPP)));
                modulo1.setC1_P12_DEP(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO1_P12_DEP)));
                modulo1.setC1_P12_CCDD(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO1_P12_CCDD)));
                modulo1.setOBS_MOD_I(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO1_OBS_MOD_I)));
                modulo1.setUSU_CREACION(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO1_USUCREACION)));
                modulo1.setFEC_CREACION(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO1_FECCREACION)));
                modulo1.setUSU_REGISTRO(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO1_USUREGISTRO)));
                modulo1.setFEC_REGISTRO(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO1_FECREGISTRO)));
            }
        }finally {
            if(cursor != null)cursor.close();
        }
        return modulo1;
    }

    public boolean existeModulo1(String idEmpresa){
        boolean encontrado = false;
        String[] whereArgs = new String[]{idEmpresa};
        Cursor cursor = null;
        try{
            cursor = sqLiteDatabase.query(SQLConstantes.tableModulo1,
                    SQLConstantes.ALL_COLUMNS_MODULO1,SQLConstantes.WHERE_CLAUSE_ID_EMPRESA,whereArgs,null,null,null);
            if(cursor.getCount() == 1) encontrado = true;
        }finally {
            if(cursor != null)cursor.close();
        }
        return encontrado;
    }

    public void insertarModulo1(Modulo1 modulo1){
        ContentValues contentValues = modulo1.toValues();
        sqLiteDatabase.insert(SQLConstantes.tableModulo1,null,contentValues);
    }

    public void insertarModulos1(ArrayList<Modulo1> modulos1){
        long items = getNumeroItemsModulo1();
        if(items == 0){
            for (Modulo1 modulo1 : modulos1) {
                try {
                    insertarModulo1(modulo1);
                }catch (SQLiteException e){
                    e.printStackTrace();
                }
            }
        }
    }
    public void actualizarModulo1(String idempresa, ContentValues contentValues){
        String[] whereArgs = new String[]{idempresa};
        sqLiteDatabase.update(SQLConstantes.tableModulo1,contentValues,SQLConstantes.WHERE_CLAUSE_ID_EMPRESA,whereArgs);
    }

    public ArrayList<Modulo1> getAllModulo1(){
        ArrayList<Modulo1> modulos1 = new ArrayList<Modulo1>();
        Cursor cursor = null;
        try{
            cursor = sqLiteDatabase.query(SQLConstantes.tableModulo1,
                    SQLConstantes.ALL_COLUMNS_MODULO1,null,null,null,null,null);
            while(cursor.moveToNext()){
                Modulo1 modulo1 = new Modulo1();
                modulo1.setMODULO1_ID(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO1_ID)));
                modulo1.setC1_P0_0(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO1_P0_0)));
                modulo1.setC1_P0_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO1_P0_1)));
                modulo1.setC1_P0_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO1_P0_2)));
                modulo1.setC1_P0_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO1_P0_3)));
                modulo1.setC1_P1_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO1_P1_1)));
                modulo1.setC1_P1_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO1_P1_2)));
                modulo1.setC1_P1_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO1_P1_2_DETALLE)));
                modulo1.setC1_P2_1_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO1_P2_1_1)));
                modulo1.setC1_P2_1_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO1_P2_1_2)));
                modulo1.setC1_P2_1_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO1_P2_1_2_DETALLE)));
                modulo1.setC1_P2_1_NO(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO1_P2_1_NO)));
                modulo1.setC1_P2_2_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO1_P2_2_1)));
                modulo1.setC1_P2_2_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO1_P2_2_2)));
                modulo1.setC1_P2_2_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO1_P2_2_2_DETALLE)));
                modulo1.setC1_P2_2_NO(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO1_P2_2_NO)));
                modulo1.setC1_P3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO1_P3)));
                modulo1.setC1_P3_0(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO1_P3_0)));
                modulo1.setC1_P4_1_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO1_P4_1_1)));
                modulo1.setC1_P4_2_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO1_P4_2_1)));
                modulo1.setC1_P5(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO1_P5)));
                modulo1.setC1_P6_0(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO1_P6_0)));
                modulo1.setC1_P6_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO1_P6_1)));
                modulo1.setC1_P7_1_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO1_P7_1_1)));
                modulo1.setC1_P7_2_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO1_P7_2_1)));
                modulo1.setC1_P7_1_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO1_P7_1_2)));
                modulo1.setC1_P7_2_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO1_P7_2_2)));
                modulo1.setC1_P8(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO1_P8)));
                modulo1.setC1_P9(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO1_P9)));
                modulo1.setC1_P10(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO1_P10)));
                modulo1.setC1_P11(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO1_P11)));
                modulo1.setC1_P11_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO1_P11_1)));
                modulo1.setC1_P11_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO1_P11_2)));
                modulo1.setC1_P12_NO(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO1_P12_NO)));
                modulo1.setC1_P12_TIPVIA(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO1_P12_TIPVIA)));
                modulo1.setC1_P12_NOMVIA(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO1_P12_NOMVIA )));
                modulo1.setC1_P12_NROPTA(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO1_P12_NROPTA)));
                modulo1.setC1_P12_BLOCK(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO1_P12_BLOCK)));
                modulo1.setC1_P12_INT(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO1_P12_INT)));
                modulo1.setC1_P12_PISO(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO1_P12_PISO)));
                modulo1.setC1_P12_MZA(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO1_P12_MZA)));
                modulo1.setC1_P12_LOTE(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO1_P12_LOTE)));
                modulo1.setC1_P12_KM(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO1_P12_KM)));
                modulo1.setC1_P12_DIST(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO1_P12_DIST)));
                modulo1.setC1_P12_CCDI(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO1_P12_CCDI)));
                modulo1.setC1_P12_PROV(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO1_P12_PROV)));
                modulo1.setC1_P12_CCPP(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO1_P12_CCPP)));
                modulo1.setC1_P12_DEP(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO1_P12_DEP)));
                modulo1.setC1_P12_CCDD(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO1_P12_CCDD)));
                modulo1.setOBS_MOD_I(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO1_OBS_MOD_I)));
                modulo1.setUSU_CREACION(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO1_USUCREACION)));
                modulo1.setFEC_CREACION(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO1_FECCREACION)));
                modulo1.setUSU_REGISTRO(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO1_USUREGISTRO)));
                modulo1.setFEC_REGISTRO(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO1_FECREGISTRO)));
                modulos1.add(modulo1);
            }
        }finally {
            if(cursor != null)cursor.close();
        }
        return modulos1;
    }
    public void deleteModulo1(String idEmpresa){
        String[] whereArgs = new String[]{idEmpresa};
        sqLiteDatabase.delete(SQLConstantes.tableModulo1,SQLConstantes.WHERE_CLAUSE_ID_EMPRESA,whereArgs);
    }
//----------------------------------------------FIN MODULO 1-----------------------------------------------------------------------



    //---------------------------------MODULO2-------------------------------------------------------------
    public Modulo2 getModulo2(String idEmpresa){
        Modulo2 modulo2 = new Modulo2();
        String[] whereArgs = new String[]{idEmpresa};
        Cursor cursor = sqLiteDatabase.query(SQLConstantes.tableModulo2,
                SQLConstantes.ALL_COLUMNS_MODULO2,SQLConstantes.WHERE_CLAUSE_ID_EMPRESA,whereArgs,null,null,null);
        if(cursor.getCount() == 1){
            cursor.moveToFirst();
            modulo2.setMODULO2_ID(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_ID)));
            modulo2.setC2_P0_0(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P0_0)));
            modulo2.setC2_P0_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P0_1)));
            modulo2.setC2_P0_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P0_2)));
            modulo2.setC2_P0_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P0_3)));
            modulo2.setC2_P1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P1)));
            modulo2.setC2_P2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P2)));
            modulo2.setC2_P3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P3)));
            modulo2.setC2_P4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P4)));
            modulo2.setC2_P5_0_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P5_0_1)));
            modulo2.setC2_P5_0_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P5_0_2)));
            modulo2.setC2_P5_0_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P5_0_3)));
            modulo2.setC2_P5_0_4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P5_0_4)));
            modulo2.setC2_P5_0_5(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P5_0_5)));
            modulo2.setC2_P5_1_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P5_1_1)));
            modulo2.setC2_P5_1_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P5_1_2)));
            modulo2.setC2_P5_1_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P5_1_3)));
            modulo2.setC2_P5_1_4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P5_1_4)));
            modulo2.setC2_P5_1_5(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P5_1_5)));
            modulo2.setC2_P5_1_6(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P5_1_6)));
            modulo2.setC2_P6(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P6)));
            modulo2.setC2_P7(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P7)));
            modulo2.setC2_P8_0_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P8_0_1)));
            modulo2.setC2_P8_0_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P8_0_2)));
            modulo2.setC2_P8_1_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P8_1_1)));
            modulo2.setC2_P8_1_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P8_1_2)));
            modulo2.setC2_P8_2_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P8_2_3)));
            modulo2.setC2_P9_0_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P9_0_1)));
            modulo2.setC2_P9_0_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P9_0_2)));
            modulo2.setC2_P9_0_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P9_0_3)));
            modulo2.setC2_P9_0_4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P9_0_4)));
            modulo2.setC2_P9_0_5(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P9_0_5)));
            modulo2.setC2_P9_1_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P9_1_1)));
            modulo2.setC2_P9_1_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P9_1_2)));
            modulo2.setC2_P9_1_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P9_1_3)));
            modulo2.setC2_P9_1_4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P9_1_4)));
            modulo2.setC2_P9_1_4_0(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P9_1_4_0)));
            modulo2.setC2_P9_1_5(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P9_1_5)));
            modulo2.setC2_P9_1_6(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P9_1_6)));
            modulo2.setC2_P10_1_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P10_1_1)));
            modulo2.setC2_P10_1_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P10_1_2)));
            modulo2.setC2_P10_1_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P10_1_3)));
            modulo2.setC2_P10_1_4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P10_1_4)));
            modulo2.setC2_P10_1_5(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P10_1_5)));
            modulo2.setC2_P10_1_6(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P10_1_6)));
            modulo2.setC2_P10_1_6_0(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P10_1_6_0)));
            modulo2.setC2_P10_2_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P10_2_2)));
            modulo2.setC2_P10_2_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P10_2_3)));
            modulo2.setC2_P10_2_4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P10_2_4)));
            modulo2.setC2_P10_2_5(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P10_2_5)));
            modulo2.setC2_P10_2_6(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P10_2_6)));
            modulo2.setC2_P11_1_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P11_1_1)));
            modulo2.setC2_P11_1_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P11_1_2)));
            modulo2.setC2_P11_1_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P11_1_3)));
            modulo2.setC2_P11_1_4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P11_1_4)));
            modulo2.setC2_P11_1_5(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P11_1_5)));
            modulo2.setC2_P11_1_6(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P11_1_6)));
            modulo2.setC2_P11_1_7(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P11_1_7)));
            modulo2.setC2_P11_1_7_0(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P11_1_7_0)));
            modulo2.setC2_P11_2_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P11_2_2)));
            modulo2.setC2_P11_2_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P11_2_3)));
            modulo2.setC2_P11_2_4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P11_2_4)));
            modulo2.setC2_P11_2_5(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P11_2_5)));
            modulo2.setC2_P11_2_6(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P11_2_6)));
            modulo2.setC2_P11_2_7(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P11_2_7)));
            modulo2.setC2_P12_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P12_1)));
            modulo2.setC2_P12_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P12_2)));
            modulo2.setC2_P12_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P12_3)));
            modulo2.setC2_P12_3_0(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P12_3_0)));
            modulo2.setC2_P13_1_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P13_1_1)));
            modulo2.setC2_P13_1_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P13_1_2)));
            modulo2.setC2_P13_1_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P13_1_3)));
            modulo2.setC2_P13_1_4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P13_1_4)));
            modulo2.setC2_P13_1_5(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P13_1_5)));
            modulo2.setC2_P13_1_6(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P13_1_6)));
            modulo2.setC2_P13_1_7(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P13_1_7)));
            modulo2.setC2_P13_1_7_0(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P13_1_7_0)));
            modulo2.setC2_P13_2_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P13_2_2)));
            modulo2.setC2_P13_2_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P13_2_3)));
            modulo2.setC2_P13_2_4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P13_2_4)));
            modulo2.setC2_P13_2_5(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P13_2_5)));
            modulo2.setC2_P13_2_6(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P13_2_6)));
            modulo2.setC2_P13_2_7(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P13_2_7)));
            modulo2.setC2_P14(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P14)));
            modulo2.setC2_P15_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P15_1)));
            modulo2.setC2_P15_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P15_2)));
            modulo2.setC2_P15_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P15_3)));
            modulo2.setC2_P15_4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P15_4)));
            modulo2.setC2_P15_5(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P15_5)));
            modulo2.setC2_P15_6(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P15_6)));
            modulo2.setC2_P15_6_0(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P15_6_0)));
            modulo2.setC2_P16_1_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P16_1_1)));
            modulo2.setC2_P16_1_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P16_1_2)));
            modulo2.setC2_P16_1_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P16_1_3)));
            modulo2.setC2_P16_1_4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P16_1_4)));
            modulo2.setC2_P16_1_5(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P16_1_5)));
            modulo2.setC2_P16_1_6(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P16_1_6)));
            modulo2.setC2_P16_1_6_0(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P16_1_6_0)));
            modulo2.setC2_P17(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P17)));
            modulo2.setC2_P18_1_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P18_1_1)));
            modulo2.setC2_P18_1_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P18_1_2)));
            modulo2.setC2_P18_1_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P18_1_3)));
            modulo2.setC2_P18_1_4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P18_1_4)));
            modulo2.setC2_P18_1_5(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P18_1_5)));
            modulo2.setC2_P18_1_6(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P18_1_6)));
            modulo2.setC2_P18_1_7(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P18_1_7)));
            modulo2.setC2_P18_1_7_0(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P18_1_7_0)));
            modulo2.setC2_P18_2_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P18_2_1)));
            modulo2.setC2_P18_2_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P18_2_2)));
            modulo2.setC2_P18_2_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P18_2_3)));
            modulo2.setC2_P18_2_4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P18_2_4)));
            modulo2.setC2_P18_2_5(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P18_2_5)));
            modulo2.setC2_P18_2_6(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P18_2_6)));
            modulo2.setC2_P18_2_7(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P18_2_7)));
            modulo2.setC2_P19_1_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P19_1_1)));
            modulo2.setC2_P19_1_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P19_1_2)));
            modulo2.setC2_P19_1_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P19_1_3)));
            modulo2.setC2_P19_1_4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P19_1_4)));
            modulo2.setC2_P19_1_5(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P19_1_5)));
            modulo2.setC2_P19_1_5_0(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P19_1_5_0)));
            modulo2.setC2_P19_2_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P19_2_1)));
            modulo2.setC2_P19_2_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P19_2_2)));
            modulo2.setC2_P19_2_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P19_2_3)));
            modulo2.setC2_P19_2_4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P19_2_4)));
            modulo2.setC2_P19_2_5(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P19_2_5)));
            modulo2.setC2_P20_1_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P20_1_1)));
            modulo2.setC2_P20_1_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P20_1_2)));
            modulo2.setC2_P20_1_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P20_1_3)));
            modulo2.setC2_P20_1_4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P20_1_4)));
            modulo2.setC2_P20_1_5(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P20_1_5)));
            modulo2.setC2_P20_1_6(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P20_1_6)));
            modulo2.setC2_P20_1_7(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P20_1_7)));
            modulo2.setC2_P20_1_8(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P20_1_8)));
            modulo2.setC2_P20_1_8_0(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P20_1_8_0)));
            modulo2.setC2_P20_2_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P20_2_1)));
            modulo2.setC2_P20_2_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P20_2_2)));
            modulo2.setC2_P20_2_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P20_2_3)));
            modulo2.setC2_P20_2_4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P20_2_4)));
            modulo2.setC2_P20_2_5(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P20_2_5)));
            modulo2.setC2_P20_2_6(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P20_2_6)));
            modulo2.setC2_P20_2_7(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P20_2_7)));
            modulo2.setC2_P20_2_8(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P20_2_8)));
            modulo2.setC2_P21(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P21)));
            modulo2.setC2_P22_1_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P22_1_1)));
            modulo2.setC2_P22_1_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P22_1_2)));
            modulo2.setC2_P22_1_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P22_1_3)));
            modulo2.setC2_P22_1_4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P22_1_4)));
            modulo2.setC2_P22_1_5(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P22_1_5)));
            modulo2.setC2_P22_1_6(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P22_1_6)));
            modulo2.setC2_P22_1_6_0(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P22_1_6_0)));
            modulo2.setC2_P22_2_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P22_2_1)));
            modulo2.setC2_P22_2_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P22_2_2)));
            modulo2.setC2_P22_2_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P22_2_3)));
            modulo2.setC2_P22_2_4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P22_2_4)));
            modulo2.setC2_P22_2_5(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P22_2_5)));
            modulo2.setC2_P22_2_6(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P22_2_6)));
            modulo2.setC2_P23(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P23)));
            modulo2.setC2_P24(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P24)));
            modulo2.setC2_P25(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P25)));
            modulo2.setC2_P25_T(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P25_T)));
            modulo2.setC2_P25_H(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P25_H)));
            modulo2.setC2_P25_M(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P25_M)));
            modulo2.setOBS_MOD_II(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_OBS_MOD_II)));
            modulo2.setUSU_CREACION(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_USUCREACION)));
            modulo2.setFEC_CREACION(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_FECCREACION)));
            modulo2.setUSU_REGISTRO(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_USUREGISTRO)));
            modulo2.setFEC_REGISTRO(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_FECREGISTRO)));
        }
        cursor.close();
        return modulo2;
    }
    public ArrayList<Modulo2> getAllModulo2(){
        ArrayList<Modulo2> modulos2 = new ArrayList<Modulo2>();
        Cursor cursor = sqLiteDatabase.query(SQLConstantes.tableModulo2,
                SQLConstantes.ALL_COLUMNS_MODULO2,null,null,null,null,null);
        while(cursor.moveToNext()){
            Modulo2 modulo2 = new Modulo2();
            modulo2.setMODULO2_ID(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_ID)));
            modulo2.setC2_P0_0(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P0_0)));
            modulo2.setC2_P0_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P0_1)));
            modulo2.setC2_P0_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P0_2)));
            modulo2.setC2_P0_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P0_3)));
            modulo2.setC2_P1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P1)));
            modulo2.setC2_P2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P2)));
            modulo2.setC2_P3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P3)));
            modulo2.setC2_P4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P4)));
            modulo2.setC2_P5_0_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P5_0_1)));
            modulo2.setC2_P5_0_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P5_0_2)));
            modulo2.setC2_P5_0_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P5_0_3)));
            modulo2.setC2_P5_0_4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P5_0_4)));
            modulo2.setC2_P5_0_5(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P5_0_5)));
            modulo2.setC2_P5_1_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P5_1_1)));
            modulo2.setC2_P5_1_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P5_1_2)));
            modulo2.setC2_P5_1_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P5_1_3)));
            modulo2.setC2_P5_1_4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P5_1_4)));
            modulo2.setC2_P5_1_5(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P5_1_5)));
            modulo2.setC2_P5_1_6(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P5_1_6)));
            modulo2.setC2_P6(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P6)));
            modulo2.setC2_P7(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P7)));
            modulo2.setC2_P8_0_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P8_0_1)));
            modulo2.setC2_P8_0_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P8_0_2)));
            modulo2.setC2_P8_1_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P8_1_1)));
            modulo2.setC2_P8_1_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P8_1_2)));
            modulo2.setC2_P8_2_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P8_2_3)));
            modulo2.setC2_P9_0_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P9_0_1)));
            modulo2.setC2_P9_0_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P9_0_2)));
            modulo2.setC2_P9_0_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P9_0_3)));
            modulo2.setC2_P9_0_4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P9_0_4)));
            modulo2.setC2_P9_0_5(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P9_0_5)));
            modulo2.setC2_P9_1_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P9_1_1)));
            modulo2.setC2_P9_1_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P9_1_2)));
            modulo2.setC2_P9_1_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P9_1_3)));
            modulo2.setC2_P9_1_4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P9_1_4)));
            modulo2.setC2_P9_1_4_0(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P9_1_4_0)));
            modulo2.setC2_P9_1_5(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P9_1_5)));
            modulo2.setC2_P9_1_6(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P9_1_6)));
            modulo2.setC2_P10_1_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P10_1_1)));
            modulo2.setC2_P10_1_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P10_1_2)));
            modulo2.setC2_P10_1_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P10_1_3)));
            modulo2.setC2_P10_1_4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P10_1_4)));
            modulo2.setC2_P10_1_5(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P10_1_5)));
            modulo2.setC2_P10_1_6(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P10_1_6)));
            modulo2.setC2_P10_1_6_0(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P10_1_6_0)));
            modulo2.setC2_P10_2_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P10_2_2)));
            modulo2.setC2_P10_2_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P10_2_3)));
            modulo2.setC2_P10_2_4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P10_2_4)));
            modulo2.setC2_P10_2_5(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P10_2_5)));
            modulo2.setC2_P10_2_6(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P10_2_6)));
            modulo2.setC2_P11_1_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P11_1_1)));
            modulo2.setC2_P11_1_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P11_1_2)));
            modulo2.setC2_P11_1_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P11_1_3)));
            modulo2.setC2_P11_1_4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P11_1_4)));
            modulo2.setC2_P11_1_5(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P11_1_5)));
            modulo2.setC2_P11_1_6(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P11_1_6)));
            modulo2.setC2_P11_1_7(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P11_1_7)));
            modulo2.setC2_P11_1_7_0(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P11_1_7_0)));
            modulo2.setC2_P11_2_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P11_2_2)));
            modulo2.setC2_P11_2_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P11_2_3)));
            modulo2.setC2_P11_2_4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P11_2_4)));
            modulo2.setC2_P11_2_5(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P11_2_5)));
            modulo2.setC2_P11_2_6(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P11_2_6)));
            modulo2.setC2_P11_2_7(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P11_2_7)));
            modulo2.setC2_P12_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P12_1)));
            modulo2.setC2_P12_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P12_2)));
            modulo2.setC2_P12_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P12_3)));
            modulo2.setC2_P12_3_0(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P12_3_0)));
            modulo2.setC2_P13_1_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P13_1_1)));
            modulo2.setC2_P13_1_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P13_1_2)));
            modulo2.setC2_P13_1_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P13_1_3)));
            modulo2.setC2_P13_1_4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P13_1_4)));
            modulo2.setC2_P13_1_5(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P13_1_5)));
            modulo2.setC2_P13_1_6(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P13_1_6)));
            modulo2.setC2_P13_1_7(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P13_1_7)));
            modulo2.setC2_P13_1_7_0(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P13_1_7_0)));
            modulo2.setC2_P13_2_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P13_2_2)));
            modulo2.setC2_P13_2_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P13_2_3)));
            modulo2.setC2_P13_2_4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P13_2_4)));
            modulo2.setC2_P13_2_5(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P13_2_5)));
            modulo2.setC2_P13_2_6(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P13_2_6)));
            modulo2.setC2_P13_2_7(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P13_2_7)));
            modulo2.setC2_P14(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P14)));
            modulo2.setC2_P15_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P15_1)));
            modulo2.setC2_P15_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P15_2)));
            modulo2.setC2_P15_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P15_3)));
            modulo2.setC2_P15_4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P15_4)));
            modulo2.setC2_P15_5(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P15_5)));
            modulo2.setC2_P15_6(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P15_6)));
            modulo2.setC2_P15_6_0(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P15_6_0)));
            modulo2.setC2_P16_1_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P16_1_1)));
            modulo2.setC2_P16_1_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P16_1_2)));
            modulo2.setC2_P16_1_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P16_1_3)));
            modulo2.setC2_P16_1_4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P16_1_4)));
            modulo2.setC2_P16_1_5(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P16_1_5)));
            modulo2.setC2_P16_1_6(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P16_1_6)));
            modulo2.setC2_P16_1_6_0(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P16_1_6_0)));
            modulo2.setC2_P17(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P17)));
            modulo2.setC2_P18_1_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P18_1_1)));
            modulo2.setC2_P18_1_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P18_1_2)));
            modulo2.setC2_P18_1_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P18_1_3)));
            modulo2.setC2_P18_1_4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P18_1_4)));
            modulo2.setC2_P18_1_5(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P18_1_5)));
            modulo2.setC2_P18_1_6(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P18_1_6)));
            modulo2.setC2_P18_1_7(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P18_1_7)));
            modulo2.setC2_P18_1_7_0(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P18_1_7_0)));
            modulo2.setC2_P18_2_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P18_2_1)));
            modulo2.setC2_P18_2_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P18_2_2)));
            modulo2.setC2_P18_2_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P18_2_3)));
            modulo2.setC2_P18_2_4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P18_2_4)));
            modulo2.setC2_P18_2_5(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P18_2_5)));
            modulo2.setC2_P18_2_6(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P18_2_6)));
            modulo2.setC2_P18_2_7(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P18_2_7)));
            modulo2.setC2_P19_1_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P19_1_1)));
            modulo2.setC2_P19_1_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P19_1_2)));
            modulo2.setC2_P19_1_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P19_1_3)));
            modulo2.setC2_P19_1_4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P19_1_4)));
            modulo2.setC2_P19_1_5(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P19_1_5)));
            modulo2.setC2_P19_1_5_0(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P19_1_5_0)));
            modulo2.setC2_P19_2_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P19_2_1)));
            modulo2.setC2_P19_2_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P19_2_2)));
            modulo2.setC2_P19_2_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P19_2_3)));
            modulo2.setC2_P19_2_4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P19_2_4)));
            modulo2.setC2_P19_2_5(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P19_2_5)));
            modulo2.setC2_P20_1_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P20_1_1)));
            modulo2.setC2_P20_1_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P20_1_2)));
            modulo2.setC2_P20_1_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P20_1_3)));
            modulo2.setC2_P20_1_4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P20_1_4)));
            modulo2.setC2_P20_1_5(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P20_1_5)));
            modulo2.setC2_P20_1_6(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P20_1_6)));
            modulo2.setC2_P20_1_7(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P20_1_7)));
            modulo2.setC2_P20_1_8(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P20_1_8)));
            modulo2.setC2_P20_1_8_0(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P20_1_8_0)));
            modulo2.setC2_P20_2_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P20_2_1)));
            modulo2.setC2_P20_2_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P20_2_2)));
            modulo2.setC2_P20_2_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P20_2_3)));
            modulo2.setC2_P20_2_4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P20_2_4)));
            modulo2.setC2_P20_2_5(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P20_2_5)));
            modulo2.setC2_P20_2_6(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P20_2_6)));
            modulo2.setC2_P20_2_7(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P20_2_7)));
            modulo2.setC2_P20_2_8(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P20_2_8)));
            modulo2.setC2_P21(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P21)));
            modulo2.setC2_P22_1_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P22_1_1)));
            modulo2.setC2_P22_1_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P22_1_2)));
            modulo2.setC2_P22_1_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P22_1_3)));
            modulo2.setC2_P22_1_4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P22_1_4)));
            modulo2.setC2_P22_1_5(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P22_1_5)));
            modulo2.setC2_P22_1_6(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P22_1_6)));
            modulo2.setC2_P22_1_6_0(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P22_1_6_0)));
            modulo2.setC2_P22_2_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P22_2_1)));
            modulo2.setC2_P22_2_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P22_2_2)));
            modulo2.setC2_P22_2_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P22_2_3)));
            modulo2.setC2_P22_2_4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P22_2_4)));
            modulo2.setC2_P22_2_5(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P22_2_5)));
            modulo2.setC2_P22_2_6(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P22_2_6)));
            modulo2.setC2_P23(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P23)));
            modulo2.setC2_P24(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P24)));
            modulo2.setC2_P25(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P25)));
            modulo2.setC2_P25_T(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P25_T)));
            modulo2.setC2_P25_H(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P25_H)));
            modulo2.setC2_P25_M(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_P25_M)));
            modulo2.setOBS_MOD_II(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_OBS_MOD_II)));
            modulo2.setUSU_CREACION(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_USUCREACION)));
            modulo2.setFEC_CREACION(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_FECCREACION)));
            modulo2.setUSU_REGISTRO(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_USUREGISTRO)));
            modulo2.setFEC_REGISTRO(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO2_FECREGISTRO)));
            modulos2.add(modulo2);
        }
        cursor.close();
        return modulos2;
    }
    public boolean existeModulo2(String idEmpresa){
        boolean encontrado = false;
        String[] whereArgs = new String[]{idEmpresa};
        Cursor cursor = sqLiteDatabase.query(SQLConstantes.tableModulo2,
                SQLConstantes.ALL_COLUMNS_MODULO2,SQLConstantes.WHERE_CLAUSE_ID_EMPRESA,whereArgs,null,null,null);
        if(cursor.getCount() == 1) encontrado = true;
        cursor.close();
        return encontrado;
    }
    public void insertarModulo2(Modulo2 modulo2){
        ContentValues contentValues = modulo2.toValues();
        sqLiteDatabase.insert(SQLConstantes.tableModulo2,null,contentValues);
    }
    public void insertarModulos2(ArrayList<Modulo2> modulos2){
        long items = getNumeroItemsModulo2();
        if(items == 0){
            for (Modulo2 modulo2 : modulos2) {
                try {
                    insertarModulo2(modulo2);
                }catch (SQLiteException e){
                    e.printStackTrace();
                }
            }
        }
    }
    public void actualizarModulo2(String idempresa, ContentValues contentValues){
        String[] whereArgs = new String[]{idempresa};
        sqLiteDatabase.update(SQLConstantes.tableModulo2,contentValues,SQLConstantes.WHERE_CLAUSE_ID_EMPRESA,whereArgs);
    }
    public void deleteModulo2(String idEmpresa){
        String[] whereArgs = new String[]{idEmpresa};
        sqLiteDatabase.delete(SQLConstantes.tableModulo2,SQLConstantes.WHERE_CLAUSE_ID_EMPRESA,whereArgs);
    }
    //-------------------------------------FIN MODULO2-----------------------------------------------------------------


    //-----------------------------------------MODULO 3---------------------------------------------------------------

    public Modulo3 getModulo3(String idEmpresa){
        Modulo3 modulo3 = new Modulo3();
        String[] whereArgs = new String[]{idEmpresa};
        Cursor cursor = sqLiteDatabase.query(SQLConstantes.tableModulo3,
                SQLConstantes.ALL_COLUMNS_MODULO3,SQLConstantes.WHERE_CLAUSE_ID_EMPRESA,whereArgs,null,null,null);
        if(cursor.getCount() == 1){
            cursor.moveToFirst();
            modulo3.setMODULO3_ID(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO3_ID)));
            modulo3.setC3_P0_0(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO3_P0_0)));
            modulo3.setC3_P0_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO3_P0_1)));
            modulo3.setC3_P0_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO3_P0_2)));
            modulo3.setC3_P0_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO3_P0_3)));
            modulo3.setC3_P1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO3_P1)));
            modulo3.setC3_P2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO3_P2)));
            modulo3.setC3_P3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO3_P3)));
            modulo3.setC3_P4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO3_P4)));
            modulo3.setC3_P5(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO3_P5)));
            modulo3.setC3_P5_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO3_P5_1)));
            modulo3.setC3_P6(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO3_P6)));
            modulo3.setC3_P7(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO3_P7)));
            modulo3.setC3_P8(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO3_P8)));
            modulo3.setC3_P9(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO3_P9)));
            modulo3.setC3_P10(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO3_P10)));
            modulo3.setC3_P11(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO3_P11)));
            modulo3.setC3_P12(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO3_P12)));
            modulo3.setOBS_MOD_III(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO3_OBS_MOD_III)));
            modulo3.setUSU_CREACION(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO3_USUCREACION)));
            modulo3.setFEC_CREACION(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO3_FECCREACION)));
            modulo3.setUSU_REGISTRO(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO3_USUREGISTRO)));
            modulo3.setFEC_REGISTRO(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO3_FECREGISTRO)));
        }
        cursor.close();
        return modulo3;
    }

    public boolean existeModulo3(String idEmpresa){
        boolean encontrado = false;
        String[] whereArgs = new String[]{idEmpresa};
        Cursor cursor = sqLiteDatabase.query(SQLConstantes.tableModulo3,
                SQLConstantes.ALL_COLUMNS_MODULO3,SQLConstantes.WHERE_CLAUSE_ID_EMPRESA,whereArgs,null,null,null);
        if(cursor.getCount() == 1) encontrado = true;
        cursor.close();
        return encontrado;
    }

    public ArrayList<Modulo3> getAllModulo3(){
        ArrayList<Modulo3> modulos3 = new ArrayList<Modulo3>();
        Cursor cursor = sqLiteDatabase.query(SQLConstantes.tableModulo3,
                SQLConstantes.ALL_COLUMNS_MODULO3,null,null,null,null,null);
        while(cursor.moveToNext()){
            Modulo3 modulo3 = new Modulo3();
            modulo3.setMODULO3_ID(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO3_ID)));
            modulo3.setC3_P0_0(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO3_P0_0)));
            modulo3.setC3_P0_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO3_P0_1)));
            modulo3.setC3_P0_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO3_P0_2)));
            modulo3.setC3_P0_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO3_P0_3)));
            modulo3.setC3_P1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO3_P1)));
            modulo3.setC3_P2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO3_P2)));
            modulo3.setC3_P3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO3_P3)));
            modulo3.setC3_P4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO3_P4)));
            modulo3.setC3_P5(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO3_P5)));
            modulo3.setC3_P5_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO3_P5_1)));
            modulo3.setC3_P6(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO3_P6)));
            modulo3.setC3_P7(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO3_P7)));
            modulo3.setC3_P8(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO3_P8)));
            modulo3.setC3_P9(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO3_P9)));
            modulo3.setC3_P10(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO3_P10)));
            modulo3.setC3_P11(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO3_P11)));
            modulo3.setC3_P12(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO3_P12)));
            modulo3.setOBS_MOD_III(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO3_OBS_MOD_III)));
            modulo3.setUSU_CREACION(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO3_USUCREACION)));
            modulo3.setFEC_CREACION(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO3_FECCREACION)));
            modulo3.setUSU_REGISTRO(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO3_USUREGISTRO)));
            modulo3.setFEC_REGISTRO(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO3_FECREGISTRO)));
            modulos3.add(modulo3);
        }
        cursor.close();
        return modulos3;
    }


    public void insertarModulo3(Modulo3 modulo3){
        ContentValues contentValues = modulo3.toValues();
        sqLiteDatabase.insert(SQLConstantes.tableModulo3,null,contentValues);
    }

    public void insertarModulos3(ArrayList<Modulo3> modulos3){
        long items = getNumeroItemsModulo3();
        if(items == 0){
            for (Modulo3 modulo3 : modulos3) {
                try {
                    insertarModulo3(modulo3);
                }catch (SQLiteException e){
                    e.printStackTrace();
                }
            }
        }
    }

    public void actualizarModulo3(String idempresa, ContentValues contentValues){
        String[] whereArgs = new String[]{idempresa};
        sqLiteDatabase.update(SQLConstantes.tableModulo3,contentValues,SQLConstantes.WHERE_CLAUSE_ID_EMPRESA,whereArgs);
    }
    public void deleteModulo3(String idEmpresa){
        String[] whereArgs = new String[]{idEmpresa};
        sqLiteDatabase.delete(SQLConstantes.tableModulo3,SQLConstantes.WHERE_CLAUSE_ID_EMPRESA,whereArgs);
    }
//----------------------------------------------- FIN MODULO 3 ------------------------------------------------------------------


//-------------------------------------------------------MODULO 4------------------------------------------------------------------



    public Modulo4 getModulo4(String idEmpresa){
        Modulo4 modulo4 = new Modulo4();
        String[] whereArgs = new String[]{idEmpresa};
        Cursor cursor = sqLiteDatabase.query(SQLConstantes.tableModulo4,
                SQLConstantes.ALL_COLUMNS_MODULO4,SQLConstantes.WHERE_CLAUSE_ID_EMPRESA,whereArgs,null,null,null);
        if(cursor.getCount() == 1){
            cursor.moveToFirst();
            modulo4.setMODULO4_ID(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO4_ID)));
            modulo4.setC4_P0_0(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO4_P0_0)));
            modulo4.setC4_P0_0(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO4_P0_0)));
            modulo4.setC4_P0_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO4_P0_1)));
            modulo4.setC4_P0_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO4_P0_2)));
            modulo4.setC4_P0_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO4_P0_3)));
            modulo4.setC4_P1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO4_P1)));
            modulo4.setC4_P2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO4_P2)));
            modulo4.setC4_P3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO4_P3)));
            modulo4.setC4_P4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO4_P4)));
            modulo4.setC4_P5(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO4_P5)));
            modulo4.setC4_P6(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO4_P6)));
            modulo4.setC4_P7(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO4_P7)));
            modulo4.setC4_P8_1_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO4_P8_1_1)));
            modulo4.setC4_P8_1_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO4_P8_1_2)));
            modulo4.setC4_P8_1_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO4_P8_1_3)));
            modulo4.setC4_P8_1_4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO4_P8_1_4)));
            modulo4.setC4_P8_1_5(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO4_P8_1_5)));
            modulo4.setC4_P8_1_6(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO4_P8_1_6)));
            modulo4.setC4_P8_1_7(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO4_P8_1_7)));
            modulo4.setC4_P8_1_8(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO4_P8_1_8)));
            modulo4.setC4_P8_1_9(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO4_P8_1_9)));
            modulo4.setC4_P8_1_10(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO4_P8_1_10)));
            modulo4.setC4_P8_1_11(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO4_P8_1_11)));
            modulo4.setC4_P8_1_12(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO4_P8_1_12)));
            modulo4.setC4_P8_1_13(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO4_P8_1_13)));
            modulo4.setC4_P8_1_14(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO4_P8_1_14)));
            modulo4.setC4_P8_1_15(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO4_P8_1_15)));
            modulo4.setC4_P8_1_16(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO4_P8_1_16)));
            modulo4.setC4_P8_1_17(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO4_P8_1_17)));
            modulo4.setC4_P8_1_18(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO4_P8_1_18)));
            modulo4.setC4_P8_1_17_0(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO4_P8_1_17_0)));
            modulo4.setC4_P8_2_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO4_P8_2_1)));
            modulo4.setC4_P8_2_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO4_P8_2_2)));
            modulo4.setC4_P8_2_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO4_P8_2_3)));
            modulo4.setC4_P8_2_4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO4_P8_2_4)));
            modulo4.setC4_P8_2_5(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO4_P8_2_5)));
            modulo4.setC4_P8_2_6(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO4_P8_2_6)));
            modulo4.setC4_P8_2_7(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO4_P8_2_7)));
            modulo4.setC4_P8_2_8(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO4_P8_2_8)));
            modulo4.setC4_P8_2_9(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO4_P8_2_9)));
            modulo4.setC4_P8_2_10(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO4_P8_2_10)));
            modulo4.setC4_P8_2_11(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO4_P8_2_11)));
            modulo4.setC4_P8_2_12(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO4_P8_2_12)));
            modulo4.setC4_P8_2_13(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO4_P8_2_13)));
            modulo4.setC4_P8_2_14(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO4_P8_2_14)));
            modulo4.setC4_P8_2_15(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO4_P8_2_15)));
            modulo4.setC4_P8_2_16(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO4_P8_2_16)));
            modulo4.setC4_P8_2_17(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO4_P8_2_17)));
            modulo4.setC4_P9_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO4_P9_1)));
            modulo4.setC4_P9_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO4_P9_2)));
            modulo4.setC4_P9_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO4_P9_3)));
            modulo4.setC4_P9_4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO4_P9_4)));
            modulo4.setC4_P10(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO4_P10)));
            modulo4.setOBS_MOD_IV(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO4_OBS_MOD_IV)));
            modulo4.setUSU_CREACION(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO3_USUCREACION)));
            modulo4.setFEC_CREACION(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO3_FECCREACION)));
            modulo4.setUSU_REGISTRO(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO3_USUREGISTRO)));
            modulo4.setFEC_REGISTRO(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO3_FECREGISTRO)));
        }
        cursor.close();
        return modulo4;
    }

    public boolean existeModulo4(String idEmpresa){
        boolean encontrado = false;
        String[] whereArgs = new String[]{idEmpresa};
        Cursor cursor = sqLiteDatabase.query(SQLConstantes.tableModulo4,
                SQLConstantes.ALL_COLUMNS_MODULO4,SQLConstantes.WHERE_CLAUSE_ID_EMPRESA,whereArgs,null,null,null);
        if(cursor.getCount() == 1) encontrado = true;
        cursor.close();
        return encontrado;
    }

    public ArrayList<Modulo4> getAllModulo4(){
        ArrayList<Modulo4> modulos4 = new ArrayList<Modulo4>();
        Cursor cursor = sqLiteDatabase.query(SQLConstantes.tableModulo4,
                SQLConstantes.ALL_COLUMNS_MODULO4,null,null,null,null,null);
        while(cursor.moveToNext()){
            Modulo4 modulo4 = new Modulo4();
            modulo4.setMODULO4_ID(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO4_ID)));
            modulo4.setC4_P0_0(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO4_P0_0)));
            modulo4.setC4_P0_0(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO4_P0_0)));
            modulo4.setC4_P0_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO4_P0_1)));
            modulo4.setC4_P0_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO4_P0_2)));
            modulo4.setC4_P0_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO4_P0_3)));
            modulo4.setC4_P1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO4_P1)));
            modulo4.setC4_P2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO4_P2)));
            modulo4.setC4_P3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO4_P3)));
            modulo4.setC4_P4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO4_P4)));
            modulo4.setC4_P5(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO4_P5)));
            modulo4.setC4_P6(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO4_P6)));
            modulo4.setC4_P7(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO4_P7)));
            modulo4.setC4_P8_1_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO4_P8_1_1)));
            modulo4.setC4_P8_1_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO4_P8_1_2)));
            modulo4.setC4_P8_1_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO4_P8_1_3)));
            modulo4.setC4_P8_1_4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO4_P8_1_4)));
            modulo4.setC4_P8_1_5(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO4_P8_1_5)));
            modulo4.setC4_P8_1_6(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO4_P8_1_6)));
            modulo4.setC4_P8_1_7(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO4_P8_1_7)));
            modulo4.setC4_P8_1_8(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO4_P8_1_8)));
            modulo4.setC4_P8_1_9(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO4_P8_1_9)));
            modulo4.setC4_P8_1_10(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO4_P8_1_10)));
            modulo4.setC4_P8_1_11(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO4_P8_1_11)));
            modulo4.setC4_P8_1_12(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO4_P8_1_12)));
            modulo4.setC4_P8_1_13(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO4_P8_1_13)));
            modulo4.setC4_P8_1_14(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO4_P8_1_14)));
            modulo4.setC4_P8_1_15(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO4_P8_1_15)));
            modulo4.setC4_P8_1_16(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO4_P8_1_16)));
            modulo4.setC4_P8_1_17(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO4_P8_1_17)));
            modulo4.setC4_P8_1_18(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO4_P8_1_18)));
            modulo4.setC4_P8_1_17_0(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO4_P8_1_17_0)));
            modulo4.setC4_P8_2_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO4_P8_2_1)));
            modulo4.setC4_P8_2_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO4_P8_2_2)));
            modulo4.setC4_P8_2_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO4_P8_2_3)));
            modulo4.setC4_P8_2_4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO4_P8_2_4)));
            modulo4.setC4_P8_2_5(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO4_P8_2_5)));
            modulo4.setC4_P8_2_6(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO4_P8_2_6)));
            modulo4.setC4_P8_2_7(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO4_P8_2_7)));
            modulo4.setC4_P8_2_8(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO4_P8_2_8)));
            modulo4.setC4_P8_2_9(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO4_P8_2_9)));
            modulo4.setC4_P8_2_10(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO4_P8_2_10)));
            modulo4.setC4_P8_2_11(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO4_P8_2_11)));
            modulo4.setC4_P8_2_12(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO4_P8_2_12)));
            modulo4.setC4_P8_2_13(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO4_P8_2_13)));
            modulo4.setC4_P8_2_14(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO4_P8_2_14)));
            modulo4.setC4_P8_2_15(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO4_P8_2_15)));
            modulo4.setC4_P8_2_16(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO4_P8_2_16)));
            modulo4.setC4_P8_2_17(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO4_P8_2_17)));
            modulo4.setC4_P9_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO4_P9_1)));
            modulo4.setC4_P9_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO4_P9_2)));
            modulo4.setC4_P9_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO4_P9_3)));
            modulo4.setC4_P9_4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO4_P9_4)));
            modulo4.setC4_P10(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO4_P10)));
            modulo4.setOBS_MOD_IV(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO4_OBS_MOD_IV)));
            modulo4.setUSU_CREACION(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO3_USUCREACION)));
            modulo4.setFEC_CREACION(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO3_FECCREACION)));
            modulo4.setUSU_REGISTRO(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO3_USUREGISTRO)));
            modulo4.setFEC_REGISTRO(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO3_FECREGISTRO)));
            modulos4.add(modulo4);
        }
        cursor.close();
        return modulos4;
    }


    public void insertarModulo4(Modulo4 modulo4){
        ContentValues contentValues = modulo4.toValues();
        sqLiteDatabase.insert(SQLConstantes.tableModulo4,null,contentValues);
    }

    public void insertarModulos4(ArrayList<Modulo4> modulos4){
        long items = getNumeroItemsModulo4();
        if(items == 0){
            for (Modulo4 modulo4 : modulos4) {
                try {
                    insertarModulo4(modulo4);
                }catch (SQLiteException e){
                    e.printStackTrace();
                }
            }
        }
    }

    public void actualizarModulo4(String idempresa, ContentValues contentValues){
        String[] whereArgs = new String[]{idempresa};
        sqLiteDatabase.update(SQLConstantes.tableModulo4,contentValues,SQLConstantes.WHERE_CLAUSE_ID_EMPRESA,whereArgs);
    }
    public void deleteModulo4(String idEmpresa){
        String[] whereArgs = new String[]{idEmpresa};
        sqLiteDatabase.delete(SQLConstantes.tableModulo4,SQLConstantes.WHERE_CLAUSE_ID_EMPRESA,whereArgs);
    }
//-------------------------------------------- FIN MODULO 4-----------------------------------------------------------------------

    //------------------------------------------- MODULO 5 --------------------------------------------------------------------
    public Modulo5 getModulo5(String idEmpresa) {
        Modulo5 modulo5 = new Modulo5();
        String[] whereArgs = new String[]{idEmpresa};
        Cursor cursor = sqLiteDatabase.query(SQLConstantes.tableModulo5,
                SQLConstantes.ALL_COLUMNS_MODULO5, SQLConstantes.WHERE_CLAUSE_ID_EMPRESA, whereArgs, null, null, null);
        if (cursor.getCount() == 1) {
            cursor.moveToFirst();
            modulo5.setMODULO5_ID(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_ID)));
            modulo5.setC5_P0_0(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P0_0)));
            modulo5.setC5_P0_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P0_1)));
            modulo5.setC5_P0_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P0_2)));
            modulo5.setC5_P0_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P0_3)));
            modulo5.setC5_P1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P1)));
            modulo5.setC5_P1_0_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P1_0_1)));
            modulo5.setC5_P1_0_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P1_0_2)));
            modulo5.setC5_P1_0_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P1_0_3)));
            modulo5.setC5_P1_0_4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P1_0_4)));
            modulo5.setC5_P1_0_5(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P1_0_5)));
            modulo5.setC5_P1_0_6(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P1_0_6)));
            modulo5.setC5_P1_0_7(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P1_0_7)));
            modulo5.setC5_P1_0_8(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P1_0_8)));
            modulo5.setC5_P1_0_9(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P1_0_9)));
            modulo5.setC5_P1_1_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P1_1_1)));
            modulo5.setC5_P1_1_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P1_1_2)));
            modulo5.setC5_P1_1_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P1_1_3)));
            modulo5.setC5_P1_1_4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P1_1_4)));
            modulo5.setC5_P1_1_5(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P1_1_5)));
            modulo5.setC5_P1_1_6(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P1_1_6)));
            modulo5.setC5_P1_1_7(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P1_1_7)));
            modulo5.setC5_P1_1_8(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P1_1_8)));
            modulo5.setC5_P1_1_9(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P1_1_9)));
            modulo5.setC5_P1_1_10(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P1_1_10)));
            modulo5.setC5_P1_2_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P1_2_1)));
            modulo5.setC5_P1_2_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P1_2_2)));
            modulo5.setC5_P1_2_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P1_2_3)));
            modulo5.setC5_P1_2_4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P1_2_4)));
            modulo5.setC5_P1_2_5(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P1_2_5)));
            modulo5.setC5_P1_2_6(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P1_2_6)));
            modulo5.setC5_P1_2_7(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P1_2_7)));
            modulo5.setC5_P1_2_8(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P1_2_8)));
            modulo5.setC5_P1_2_9(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P1_2_9)));
            modulo5.setC5_P1_2_10(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P1_2_10)));
            modulo5.setC5_P2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P2)));
            modulo5.setC5_P2_0_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P2_0_1)));
            modulo5.setC5_P2_0_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P2_0_2)));
            modulo5.setC5_P2_0_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P2_0_3)));
            modulo5.setC5_P2_0_4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P2_0_4)));
            modulo5.setC5_P2_0_5(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P2_0_5)));
            modulo5.setC5_P2_0_6(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P2_0_6)));
            modulo5.setC5_P2_0_7(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P2_0_7)));
            modulo5.setC5_P2_0_8(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P2_0_8)));
            modulo5.setC5_P2_0_9(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P2_0_9)));
            modulo5.setC5_P2_1_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P2_1_1)));
            modulo5.setC5_P2_1_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P2_1_2)));
            modulo5.setC5_P2_1_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P2_1_3)));
            modulo5.setC5_P2_1_4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P2_1_4)));
            modulo5.setC5_P2_1_5(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P2_1_5)));
            modulo5.setC5_P2_1_6(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P2_1_6)));
            modulo5.setC5_P2_1_7(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P2_1_7)));
            modulo5.setC5_P2_1_8(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P2_1_8)));
            modulo5.setC5_P2_1_9(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P2_1_9)));
            modulo5.setC5_P2_2_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P2_2_1)));
            modulo5.setC5_P2_2_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P2_2_2)));
            modulo5.setC5_P2_2_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P2_2_3)));
            modulo5.setC5_P2_2_4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P2_2_4)));
            modulo5.setC5_P2_2_5(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P2_2_5)));
            modulo5.setC5_P2_2_6(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P2_2_6)));
            modulo5.setC5_P2_2_7(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P2_2_7)));
            modulo5.setC5_P2_2_8(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P2_2_8)));
            modulo5.setC5_P2_2_9(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P2_2_9)));
            modulo5.setC5_P2_2_10(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P2_2_10)));
            modulo5.setC5_P2_3_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P2_3_1)));
            modulo5.setC5_P2_3_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P2_3_2)));
            modulo5.setC5_P2_3_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P2_3_3)));
            modulo5.setC5_P2_3_4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P2_3_4)));
            modulo5.setC5_P2_3_5(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P2_3_5)));
            modulo5.setC5_P2_3_6(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P2_3_6)));
            modulo5.setC5_P2_3_7(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P2_3_7)));
            modulo5.setC5_P2_3_8(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P2_3_8)));
            modulo5.setC5_P2_3_9(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P2_3_9)));
            modulo5.setC5_P2_3_10(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P2_3_10)));
            modulo5.setC5_P3_1_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P3_1_1)));
            modulo5.setC5_P3_1_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P3_1_2)));
            modulo5.setC5_P3_1_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P3_1_3)));
            modulo5.setC5_P3_1_4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P3_1_4)));
            modulo5.setC5_P3_1_5(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P3_1_5)));
            modulo5.setC5_P3_1_6(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P3_1_6)));
            modulo5.setC5_P3_1_7(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P3_1_7)));
            modulo5.setC5_P3_1_8(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P3_1_8)));
            modulo5.setC5_P3_1_9(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P3_1_9)));
            modulo5.setC5_P3_1_10(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P3_1_10)));
            modulo5.setC5_P3_1_11(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P3_1_11)));
            modulo5.setC5_P3_1_12(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P3_1_12)));
            modulo5.setC5_P3_1_12_0(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P3_1_12_0)));
            modulo5.setC5_P3_2_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P3_2_1)));
            modulo5.setC5_P3_2_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P3_2_2)));
            modulo5.setC5_P3_2_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P3_2_3)));
            modulo5.setC5_P3_2_4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P3_2_4)));
            modulo5.setC5_P3_2_5(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P3_2_5)));
            modulo5.setC5_P3_2_6(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P3_2_6)));
            modulo5.setC5_P3_2_7(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P3_2_7)));
            modulo5.setC5_P3_2_8(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P3_2_8)));
            modulo5.setC5_P3_2_9(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P3_2_9)));
            modulo5.setC5_P3_2_10(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P3_2_10)));
            modulo5.setC5_P3_2_11(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P3_2_11)));
            modulo5.setC5_P3_2_12(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P3_2_12)));
            modulo5.setC5_P4_1_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P4_1_1)));
            modulo5.setC5_P4_1_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P4_1_2)));
            modulo5.setC5_P4_1_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P4_1_3)));
            modulo5.setC5_P4_1_4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P4_1_4)));
            modulo5.setC5_P4_1_5(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P4_1_5)));
            modulo5.setC5_P4_1_6(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P4_1_6)));
            modulo5.setC5_P4_1_7(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P4_1_7)));
            modulo5.setC5_P4_1_8(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P4_1_8)));
            modulo5.setC5_P4_2_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P4_2_1)));
            modulo5.setC5_P4_2_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P4_2_2)));
            modulo5.setC5_P4_2_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P4_2_3)));
            modulo5.setC5_P4_2_4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P4_2_4)));
            modulo5.setC5_P4_2_5(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P4_2_5)));
            modulo5.setC5_P4_2_6(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P4_2_6)));
            modulo5.setC5_P4_2_7(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P4_2_7)));
            modulo5.setC5_P4_2_8(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P4_2_8)));
            modulo5.setC5_P5_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P5_1)));
            modulo5.setC5_P5_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P5_2)));
            modulo5.setC5_P5_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P5_3)));
            modulo5.setC5_P5_4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P5_4)));
            modulo5.setC5_P5_5(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P5_5)));
            modulo5.setC5_P5_6(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P5_6)));
            modulo5.setC5_P6(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P6)));
            modulo5.setC5_P7_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P7_1)));
            modulo5.setC5_P7_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P7_2)));
            modulo5.setC5_P7_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P7_3)));
            modulo5.setC5_P7_4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P7_4)));
            modulo5.setC5_P7_5(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P7_5)));
            modulo5.setC5_P7_5_0(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P7_5_0)));
            modulo5.setC5_P7_1_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P7_1_1)));
            modulo5.setC5_P7_2_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P7_2_1)));
            modulo5.setC5_P7_3_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P7_3_1)));
            modulo5.setC5_P7_4_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P7_4_1)));
            modulo5.setC5_P7_5_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P7_5_1)));
            modulo5.setC5_P7_6_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P7_6_1)));
            modulo5.setC5_P7_6_1_0(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P7_6_1_0)));
            modulo5.setC5_P7_7_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P7_7_1)));
            modulo5.setC5_P7_1_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P7_1_2)));
            modulo5.setC5_P7_2_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P7_2_2)));
            modulo5.setC5_P7_3_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P7_3_2)));
            modulo5.setC5_P7_4_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P7_4_2)));
            modulo5.setC5_P7_5_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P7_5_2)));
            modulo5.setC5_P7_6_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P7_6_2)));
            modulo5.setC5_P7_6_2_0(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P7_6_2_0)));
            modulo5.setC5_P7_7_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P7_7_2)));
            modulo5.setC5_P7_1_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P7_1_3)));
            modulo5.setC5_P7_2_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P7_2_3)));
            modulo5.setC5_P7_3_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P7_3_3)));
            modulo5.setC5_P7_4_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P7_4_3)));
            modulo5.setC5_P7_5_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P7_5_3)));
            modulo5.setC5_P7_6_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P7_6_3)));
            modulo5.setC5_P7_6_3_0(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P7_6_3_0)));
            modulo5.setC5_P7_7_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P7_7_3)));
            modulo5.setC5_P7_1_4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P7_1_4)));
            modulo5.setC5_P7_2_4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P7_2_4)));
            modulo5.setC5_P7_3_4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P7_3_4)));
            modulo5.setC5_P7_4_4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P7_4_4)));
            modulo5.setC5_P7_5_4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P7_5_4)));
            modulo5.setC5_P7_6_4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P7_6_4)));
            modulo5.setC5_P7_6_4_0(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P7_6_4_0)));
            modulo5.setC5_P7_7_4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P7_7_4)));
            modulo5.setC5_P7_1_5(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P7_1_5)));
            modulo5.setC5_P7_2_5(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P7_2_5)));
            modulo5.setC5_P7_3_5(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P7_3_5)));
            modulo5.setC5_P7_4_5(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P7_4_5)));
            modulo5.setC5_P7_5_5(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P7_5_5)));
            modulo5.setC5_P7_6_5(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P7_6_5)));
            modulo5.setC5_P7_6_5_0(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P7_6_5_0)));
            modulo5.setC5_P7_7_5(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P7_7_5)));
            modulo5.setC5_P8(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P8)));
            modulo5.setC5_P27_1_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P27_1_1)));
            modulo5.setC5_P27_1_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P27_1_2)));
            modulo5.setC5_P27_1_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P27_1_3)));
            modulo5.setC5_P27_1_4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P27_1_4)));
            modulo5.setC5_P27_1_5(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P27_1_5)));
            modulo5.setC5_P27_1_6(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P27_1_6)));
            modulo5.setC5_P27_1_7(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P27_1_7)));
            modulo5.setC5_P27_1_8(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P27_1_8)));
            modulo5.setC5_P27_1_9(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P27_1_9)));
            modulo5.setC5_P27_2_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P27_2_1)));
            modulo5.setC5_P27_2_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P27_2_2)));
            modulo5.setC5_P27_2_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P27_2_3)));
            modulo5.setC5_P27_2_4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P27_2_4)));
            modulo5.setC5_P27_2_5(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P27_2_5)));
            modulo5.setC5_P27_2_6(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P27_2_6)));
            modulo5.setC5_P27_2_7(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P27_2_7)));
            modulo5.setC5_P27_2_8(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P27_2_8)));
            modulo5.setC5_P27_2_9(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P27_2_9)));
            modulo5.setOBS_MOD_V(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_OBS_MOD_V)));
            modulo5.setUSU_CREACION(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_2_USUCREACION)));
            modulo5.setFEC_CREACION(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_2_FECCREACION)));
            modulo5.setUSU_REGISTRO(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_2_USUREGISTRO)));
            modulo5.setFEC_REGISTRO(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_2_FECREGISTRO)));
        }
        cursor.close();
        return modulo5;
    }
    public boolean existeModulo5(String idEmpresa){
        boolean encontrado = false;
        String[] whereArgs = new String[]{idEmpresa};
        Cursor cursor = sqLiteDatabase.query(SQLConstantes.tableModulo5,
                SQLConstantes.ALL_COLUMNS_MODULO5,SQLConstantes.WHERE_CLAUSE_ID_EMPRESA,whereArgs,null,null,null);
        if(cursor.getCount() == 1) encontrado = true;
        cursor.close();
        return encontrado;
    }

    public void insertarModulo5(Modulo5 modulo5){
        ContentValues contentValues = modulo5.toValues();
        sqLiteDatabase.insert(SQLConstantes.tableModulo5,null,contentValues);
    }

    public void insertarModulos5(ArrayList<Modulo5> modulos5){
        long items = getNumeroItemsModulo5();
        if(items == 0){
            for (Modulo5 modulo5 : modulos5) {
                try {
                    insertarModulo5(modulo5);
                }catch (SQLiteException e){
                    e.printStackTrace();
                }
            }
        }
    }
    public void actualizarModulo5(String idempresa, ContentValues contentValues){
        String[] whereArgs = new String[]{idempresa};
        sqLiteDatabase.update(SQLConstantes.tableModulo5,contentValues,SQLConstantes.WHERE_CLAUSE_ID_EMPRESA,whereArgs);
    }

    public ArrayList<Modulo5> getAllModulo5(){
        ArrayList<Modulo5> modulos5 = new ArrayList<Modulo5>();
        Cursor cursor = sqLiteDatabase.query(SQLConstantes.tableModulo5,
                SQLConstantes.ALL_COLUMNS_MODULO5,null,null,null,null,null);
        while(cursor.moveToNext()){
            Modulo5 modulo5 = new Modulo5();
            modulo5.setMODULO5_ID(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_ID)));
            modulo5.setC5_P0_0(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P0_0)));
            modulo5.setC5_P0_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P0_1)));
            modulo5.setC5_P0_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P0_2)));
            modulo5.setC5_P0_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P0_3)));
            modulo5.setC5_P1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P1)));
            modulo5.setC5_P1_0_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P1_0_1)));
            modulo5.setC5_P1_0_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P1_0_2)));
            modulo5.setC5_P1_0_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P1_0_3)));
            modulo5.setC5_P1_0_4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P1_0_4)));
            modulo5.setC5_P1_0_5(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P1_0_5)));
            modulo5.setC5_P1_0_6(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P1_0_6)));
            modulo5.setC5_P1_0_7(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P1_0_7)));
            modulo5.setC5_P1_0_8(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P1_0_8)));
            modulo5.setC5_P1_0_9(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P1_0_9)));
            modulo5.setC5_P1_1_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P1_1_1)));
            modulo5.setC5_P1_1_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P1_1_2)));
            modulo5.setC5_P1_1_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P1_1_3)));
            modulo5.setC5_P1_1_4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P1_1_4)));
            modulo5.setC5_P1_1_5(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P1_1_5)));
            modulo5.setC5_P1_1_6(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P1_1_6)));
            modulo5.setC5_P1_1_7(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P1_1_7)));
            modulo5.setC5_P1_1_8(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P1_1_8)));
            modulo5.setC5_P1_1_9(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P1_1_9)));
            modulo5.setC5_P1_1_10(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P1_1_10)));
            modulo5.setC5_P1_2_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P1_2_1)));
            modulo5.setC5_P1_2_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P1_2_2)));
            modulo5.setC5_P1_2_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P1_2_3)));
            modulo5.setC5_P1_2_4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P1_2_4)));
            modulo5.setC5_P1_2_5(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P1_2_5)));
            modulo5.setC5_P1_2_6(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P1_2_6)));
            modulo5.setC5_P1_2_7(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P1_2_7)));
            modulo5.setC5_P1_2_8(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P1_2_8)));
            modulo5.setC5_P1_2_9(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P1_2_9)));
            modulo5.setC5_P1_2_10(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P1_2_10)));
            modulo5.setC5_P2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P2)));
            modulo5.setC5_P2_0_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P2_0_1)));
            modulo5.setC5_P2_0_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P2_0_2)));
            modulo5.setC5_P2_0_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P2_0_3)));
            modulo5.setC5_P2_0_4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P2_0_4)));
            modulo5.setC5_P2_0_5(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P2_0_5)));
            modulo5.setC5_P2_0_6(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P2_0_6)));
            modulo5.setC5_P2_0_7(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P2_0_7)));
            modulo5.setC5_P2_0_8(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P2_0_8)));
            modulo5.setC5_P2_0_9(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P2_0_9)));
            modulo5.setC5_P2_1_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P2_1_1)));
            modulo5.setC5_P2_1_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P2_1_2)));
            modulo5.setC5_P2_1_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P2_1_3)));
            modulo5.setC5_P2_1_4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P2_1_4)));
            modulo5.setC5_P2_1_5(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P2_1_5)));
            modulo5.setC5_P2_1_6(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P2_1_6)));
            modulo5.setC5_P2_1_7(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P2_1_7)));
            modulo5.setC5_P2_1_8(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P2_1_8)));
            modulo5.setC5_P2_1_9(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P2_1_9)));
            modulo5.setC5_P2_2_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P2_2_1)));
            modulo5.setC5_P2_2_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P2_2_2)));
            modulo5.setC5_P2_2_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P2_2_3)));
            modulo5.setC5_P2_2_4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P2_2_4)));
            modulo5.setC5_P2_2_5(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P2_2_5)));
            modulo5.setC5_P2_2_6(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P2_2_6)));
            modulo5.setC5_P2_2_7(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P2_2_7)));
            modulo5.setC5_P2_2_8(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P2_2_8)));
            modulo5.setC5_P2_2_9(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P2_2_9)));
            modulo5.setC5_P2_2_10(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P2_2_10)));
            modulo5.setC5_P2_3_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P2_3_1)));
            modulo5.setC5_P2_3_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P2_3_2)));
            modulo5.setC5_P2_3_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P2_3_3)));
            modulo5.setC5_P2_3_4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P2_3_4)));
            modulo5.setC5_P2_3_5(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P2_3_5)));
            modulo5.setC5_P2_3_6(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P2_3_6)));
            modulo5.setC5_P2_3_7(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P2_3_7)));
            modulo5.setC5_P2_3_8(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P2_3_8)));
            modulo5.setC5_P2_3_9(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P2_3_9)));
            modulo5.setC5_P2_3_10(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P2_3_10)));
            modulo5.setC5_P3_1_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P3_1_1)));
            modulo5.setC5_P3_1_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P3_1_2)));
            modulo5.setC5_P3_1_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P3_1_3)));
            modulo5.setC5_P3_1_4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P3_1_4)));
            modulo5.setC5_P3_1_5(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P3_1_5)));
            modulo5.setC5_P3_1_6(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P3_1_6)));
            modulo5.setC5_P3_1_7(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P3_1_7)));
            modulo5.setC5_P3_1_8(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P3_1_8)));
            modulo5.setC5_P3_1_9(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P3_1_9)));
            modulo5.setC5_P3_1_10(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P3_1_10)));
            modulo5.setC5_P3_1_11(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P3_1_11)));
            modulo5.setC5_P3_1_12(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P3_1_12)));
            modulo5.setC5_P3_1_12_0(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P3_1_12_0)));
            modulo5.setC5_P3_2_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P3_2_1)));
            modulo5.setC5_P3_2_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P3_2_2)));
            modulo5.setC5_P3_2_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P3_2_3)));
            modulo5.setC5_P3_2_4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P3_2_4)));
            modulo5.setC5_P3_2_5(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P3_2_5)));
            modulo5.setC5_P3_2_6(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P3_2_6)));
            modulo5.setC5_P3_2_7(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P3_2_7)));
            modulo5.setC5_P3_2_8(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P3_2_8)));
            modulo5.setC5_P3_2_9(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P3_2_9)));
            modulo5.setC5_P3_2_10(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P3_2_10)));
            modulo5.setC5_P3_2_11(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P3_2_11)));
            modulo5.setC5_P3_2_12(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P3_2_12)));
            modulo5.setC5_P4_1_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P4_1_1)));
            modulo5.setC5_P4_1_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P4_1_2)));
            modulo5.setC5_P4_1_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P4_1_3)));
            modulo5.setC5_P4_1_4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P4_1_4)));
            modulo5.setC5_P4_1_5(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P4_1_5)));
            modulo5.setC5_P4_1_6(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P4_1_6)));
            modulo5.setC5_P4_1_7(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P4_1_7)));
            modulo5.setC5_P4_1_8(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P4_1_8)));
            modulo5.setC5_P4_2_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P4_2_1)));
            modulo5.setC5_P4_2_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P4_2_2)));
            modulo5.setC5_P4_2_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P4_2_3)));
            modulo5.setC5_P4_2_4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P4_2_4)));
            modulo5.setC5_P4_2_5(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P4_2_5)));
            modulo5.setC5_P4_2_6(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P4_2_6)));
            modulo5.setC5_P4_2_7(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P4_2_7)));
            modulo5.setC5_P4_2_8(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P4_2_8)));
            modulo5.setC5_P5_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P5_1)));
            modulo5.setC5_P5_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P5_2)));
            modulo5.setC5_P5_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P5_3)));
            modulo5.setC5_P5_4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P5_4)));
            modulo5.setC5_P5_5(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P5_5)));
            modulo5.setC5_P5_6(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P5_6)));
            modulo5.setC5_P6(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P6)));
            modulo5.setC5_P7_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P7_1)));
            modulo5.setC5_P7_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P7_2)));
            modulo5.setC5_P7_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P7_3)));
            modulo5.setC5_P7_4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P7_4)));
            modulo5.setC5_P7_5(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P7_5)));
            modulo5.setC5_P7_5_0(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P7_5_0)));
            modulo5.setC5_P7_1_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P7_1_1)));
            modulo5.setC5_P7_2_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P7_2_1)));
            modulo5.setC5_P7_3_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P7_3_1)));
            modulo5.setC5_P7_4_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P7_4_1)));
            modulo5.setC5_P7_5_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P7_5_1)));
            modulo5.setC5_P7_6_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P7_6_1)));
            modulo5.setC5_P7_6_1_0(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P7_6_1_0)));
            modulo5.setC5_P7_7_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P7_7_1)));
            modulo5.setC5_P7_1_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P7_1_2)));
            modulo5.setC5_P7_2_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P7_2_2)));
            modulo5.setC5_P7_3_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P7_3_2)));
            modulo5.setC5_P7_4_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P7_4_2)));
            modulo5.setC5_P7_5_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P7_5_2)));
            modulo5.setC5_P7_6_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P7_6_2)));
            modulo5.setC5_P7_6_2_0(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P7_6_2_0)));
            modulo5.setC5_P7_7_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P7_7_2)));
            modulo5.setC5_P7_1_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P7_1_3)));
            modulo5.setC5_P7_2_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P7_2_3)));
            modulo5.setC5_P7_3_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P7_3_3)));
            modulo5.setC5_P7_4_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P7_4_3)));
            modulo5.setC5_P7_5_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P7_5_3)));
            modulo5.setC5_P7_6_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P7_6_3)));
            modulo5.setC5_P7_6_3_0(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P7_6_3_0)));
            modulo5.setC5_P7_7_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P7_7_3)));
            modulo5.setC5_P7_1_4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P7_1_4)));
            modulo5.setC5_P7_2_4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P7_2_4)));
            modulo5.setC5_P7_3_4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P7_3_4)));
            modulo5.setC5_P7_4_4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P7_4_4)));
            modulo5.setC5_P7_5_4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P7_5_4)));
            modulo5.setC5_P7_6_4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P7_6_4)));
            modulo5.setC5_P7_6_4_0(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P7_6_4_0)));
            modulo5.setC5_P7_7_4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P7_7_4)));
            modulo5.setC5_P7_1_5(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P7_1_5)));
            modulo5.setC5_P7_2_5(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P7_2_5)));
            modulo5.setC5_P7_3_5(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P7_3_5)));
            modulo5.setC5_P7_4_5(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P7_4_5)));
            modulo5.setC5_P7_5_5(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P7_5_5)));
            modulo5.setC5_P7_6_5(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P7_6_5)));
            modulo5.setC5_P7_6_5_0(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P7_6_5_0)));
            modulo5.setC5_P7_7_5(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P7_7_5)));
            modulo5.setC5_P8(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P8)));
            modulo5.setC5_P27_1_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P27_1_1)));
            modulo5.setC5_P27_1_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P27_1_2)));
            modulo5.setC5_P27_1_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P27_1_3)));
            modulo5.setC5_P27_1_4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P27_1_4)));
            modulo5.setC5_P27_1_5(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P27_1_5)));
            modulo5.setC5_P27_1_6(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P27_1_6)));
            modulo5.setC5_P27_1_7(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P27_1_7)));
            modulo5.setC5_P27_1_8(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P27_1_8)));
            modulo5.setC5_P27_1_9(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P27_1_9)));
            modulo5.setC5_P27_2_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P27_2_1)));
            modulo5.setC5_P27_2_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P27_2_2)));
            modulo5.setC5_P27_2_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P27_2_3)));
            modulo5.setC5_P27_2_4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P27_2_4)));
            modulo5.setC5_P27_2_5(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P27_2_5)));
            modulo5.setC5_P27_2_6(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P27_2_6)));
            modulo5.setC5_P27_2_7(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P27_2_7)));
            modulo5.setC5_P27_2_8(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P27_2_8)));
            modulo5.setC5_P27_2_9(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P27_2_9)));
            modulo5.setOBS_MOD_V(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_OBS_MOD_V)));
            modulo5.setUSU_CREACION(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_USUCREACION)));
            modulo5.setFEC_CREACION(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_FECCREACION)));
            modulo5.setUSU_REGISTRO(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_USUREGISTRO)));
            modulo5.setFEC_REGISTRO(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_FECREGISTRO)));
            modulos5.add(modulo5);
        }
        cursor.close();
        return modulos5;
    }
    public void deleteModulo5(String idEmpresa){
        String[] whereArgs = new String[]{idEmpresa};
        sqLiteDatabase.delete(SQLConstantes.tableModulo5,SQLConstantes.WHERE_CLAUSE_ID_EMPRESA,whereArgs);
    }
    //-------------------------------FIN MODULO 5------------------------------------------------------------------------------


    //------------------------------ MODULO5 DINAMICO-----------------------------------------------------------------------------
    public ArrayList<Modulo5Dinamico> getModulo5Dinamico(String idEmpresa) {
        ArrayList<Modulo5Dinamico> modulos5Dinamicos = new ArrayList<Modulo5Dinamico>();
        String[] whereArgs = new String[]{idEmpresa};
        Cursor cursor = sqLiteDatabase.query(SQLConstantes.tableModulo5Dinamica,
                SQLConstantes.ALL_COLUMNS_MODULO5_DINAMICA, SQLConstantes.WHERE_CLAUSE_ID_EMPRESA_MOD5_DIN, whereArgs, null, null, null);
        while(cursor.moveToNext()){
            Modulo5Dinamico modulo5Dinamico = new Modulo5Dinamico();
            modulo5Dinamico.setIDOCUPACION(cursor.getInt(cursor.getColumnIndex(SQLConstantes.MODULO5_IDOCUPACION)));
            modulo5Dinamico.setIDEMPRESA(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_IDEMPRESA)));
            modulo5Dinamico.setC5_P9_1_0(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P9_1_0)));
            modulo5Dinamico.setC5_P9_1_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P9_1_1)));
            modulo5Dinamico.setC5_P9_2_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P9_2_1)));
            modulo5Dinamico.setC5_P9_3_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P9_3_1)));
            modulo5Dinamico.setC5_P10_1_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P10_1_1)));
            modulo5Dinamico.setC5_P10_2_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P10_2_1)));
            modulo5Dinamico.setC5_P11_1_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P11_1_1)));
            modulo5Dinamico.setC5_P11_2_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P11_2_1)));
            modulo5Dinamico.setC5_P12(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P12)));
            modulo5Dinamico.setC5_P13(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P13)));
            modulo5Dinamico.setC5_P14(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P14)));
            modulo5Dinamico.setC5_P15(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P15)));
            modulo5Dinamico.setC5_P16(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P16)));
            modulo5Dinamico.setC5_P17_0(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P17_0)));
            modulo5Dinamico.setC5_P17_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P17_1)));
            modulo5Dinamico.setC5_P17_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P17_2)));
            modulo5Dinamico.setC5_P17_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P17_3)));
            modulo5Dinamico.setC5_P17_4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P17_4)));
            modulo5Dinamico.setC5_P17_5(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P17_5)));
            modulo5Dinamico.setC5_P17_6(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P17_6)));
            modulo5Dinamico.setC5_P17_7(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P17_7)));
            modulo5Dinamico.setC5_P17_8(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P17_8)));
            modulo5Dinamico.setC5_P17_9(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P17_9)));
            modulo5Dinamico.setC5_P17_10(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P17_10)));
            modulo5Dinamico.setC5_P17_11(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P17_11)));
            modulo5Dinamico.setC5_P17_12(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P17_12)));
            modulo5Dinamico.setC5_P17_13(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P17_13)));
            modulo5Dinamico.setC5_P17_14(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P17_14)));
            modulo5Dinamico.setC5_P17_15(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P17_15)));
            modulo5Dinamico.setC5_P17_16(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P17_16)));
            modulo5Dinamico.setC5_P17_17(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P17_17)));
            modulo5Dinamico.setC5_P17_18(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P17_18)));
            modulo5Dinamico.setC5_P17_19(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P17_19)));
            modulo5Dinamico.setC5_P17_20(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P17_20)));
            modulo5Dinamico.setC5_P17_19_0(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P17_19_0)));
            modulo5Dinamico.setC5_P18(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P18)));
            modulo5Dinamico.setC5_P19(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P19)));
            modulo5Dinamico.setC5_P20(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P20)));
            modulo5Dinamico.setC5_P21_0(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P21_0)));
            modulo5Dinamico.setC5_P21_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P21_1)));
            modulo5Dinamico.setC5_P21_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P21_2)));
            modulo5Dinamico.setC5_P21_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P21_3)));
            modulo5Dinamico.setC5_P21_4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P21_4)));
            modulo5Dinamico.setC5_P21_5(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P21_5)));
            modulo5Dinamico.setC5_P21_6(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P21_6)));
            modulo5Dinamico.setC5_P21_7(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P21_7)));
            modulo5Dinamico.setC5_P21_7_0(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P21_7_0)));
            modulo5Dinamico.setC5_P22_1_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P22_1_1)));
            modulo5Dinamico.setC5_P22_2_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P22_2_1)));
            modulo5Dinamico.setC5_P23_0(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P23_0)));
            modulo5Dinamico.setC5_P23_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P23_1)));
            modulo5Dinamico.setC5_P23_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P23_2)));
            modulo5Dinamico.setC5_P23_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P23_3)));
            modulo5Dinamico.setC5_P23_4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P23_4)));
            modulo5Dinamico.setC5_P23_5(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P23_5)));
            modulo5Dinamico.setC5_P23_6(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P23_6)));
            modulo5Dinamico.setC5_P23_7(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P23_7)));
            modulo5Dinamico.setC5_P23_8(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P23_8)));
            modulo5Dinamico.setC5_P23_9(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P23_9)));
            modulo5Dinamico.setC5_P23_9_0(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P23_9_0)));
            modulo5Dinamico.setC5_P24_0(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P24_0)));
            modulo5Dinamico.setC5_P24_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P24_1)));
            modulo5Dinamico.setC5_P24_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P24_2)));
            modulo5Dinamico.setC5_P24_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P24_3)));
            modulo5Dinamico.setC5_P24_4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P24_4)));
            modulo5Dinamico.setC5_P24_5(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P24_5)));
            modulo5Dinamico.setC5_P24_6(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P24_6)));
            modulo5Dinamico.setC5_P24_7(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P24_7)));
            modulo5Dinamico.setC5_P24_8(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P24_8)));
            modulo5Dinamico.setC5_P24_9(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P24_9)));
            modulo5Dinamico.setC5_P24_10(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P24_10)));
            modulo5Dinamico.setC5_P25(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P25)));
            modulo5Dinamico.setC5_P26(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P26)));
            modulo5Dinamico.setUSU_CREACION(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_2_USUCREACION)));
            modulo5Dinamico.setFEC_CREACION(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_2_FECCREACION)));
            modulo5Dinamico.setUSU_REGISTRO(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_2_USUREGISTRO)));
            modulo5Dinamico.setFEC_REGISTRO(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_2_FECREGISTRO)));
            modulos5Dinamicos.add(modulo5Dinamico);
        }
        cursor.close();
        return modulos5Dinamicos;
    }
    public boolean existeModulo5Dinamico(String idEmpresa){
        boolean encontrado = false;
        String[] whereArgs = new String[]{idEmpresa};
        Cursor cursor = sqLiteDatabase.query(SQLConstantes.tableModulo5Dinamica,
                SQLConstantes.ALL_COLUMNS_MODULO5_DINAMICA,SQLConstantes.WHERE_CLAUSE_ID_EMPRESA_MOD5_DIN,whereArgs,null,null,null);
        if(cursor.getCount() > 0) encontrado = true;
        cursor.close();
        return encontrado;
    }

    public void insertarModulo5Dinamico(Modulo5Dinamico modulo5Dinamico){
        ContentValues contentValues = modulo5Dinamico.toValues();
        sqLiteDatabase.insert(SQLConstantes.tableModulo5Dinamica,null,contentValues);
    }

    public void insertarModulos5Dinamico(ArrayList<Modulo5Dinamico> modulos5Dinamicos){
//        long items = getNumeroItemsModulo5Dinamico(); //POR ESO LO HACE UNA SOLA VEZ
//        if(items == 0){
//            for (Modulo5Dinamico modulo5Dinamico : modulos5Dinamicos) {
//                try {
//                    insertarModulo5Dinamico(modulo5Dinamico);
//                }catch (SQLiteException e){
//                    e.printStackTrace();
//                }
//            }
//        }
        for (Modulo5Dinamico modulo5Dinamico : modulos5Dinamicos) {
            try {
                insertarModulo5Dinamico(modulo5Dinamico);
            }catch (SQLiteException e){
                e.printStackTrace();
            }
        }
    }

    public void actualizarModulo5Dinamico(int idOcupacion, ContentValues contentValues){
        String[] whereArgs = new String[]{String.valueOf(idOcupacion)};
        sqLiteDatabase.update(SQLConstantes.tableModulo5Dinamica,contentValues,SQLConstantes.WHERE_CLAUSE_ID_OCUPACION,whereArgs);
    }

    public void deleteModulo5Dinamico(int idOcupacion){
        String[] whereArgs = new String[]{String.valueOf(idOcupacion)};
        sqLiteDatabase.delete(SQLConstantes.tableModulo5Dinamica,SQLConstantes.WHERE_CLAUSE_ID_OCUPACION,whereArgs);
    }

    public void deleteAllModulo5Dinamico(String idEmpresa){
        String[] whereArgs = new String[]{idEmpresa};
        sqLiteDatabase.delete(SQLConstantes.tableModulo5Dinamica,SQLConstantes.WHERE_CLAUSE_ID_EMPRESA_MOD5_DIN,whereArgs);
    }

    public ArrayList<Modulo5Dinamico> getAllModulo5Dinamico(){
        ArrayList<Modulo5Dinamico> modulos5Dinamicos = new ArrayList<Modulo5Dinamico>();
        Cursor cursor = null;
        try{
            cursor = sqLiteDatabase.query(SQLConstantes.tableModulo5Dinamica,
                    SQLConstantes.ALL_COLUMNS_MODULO5_DINAMICA,null,null,null,null,null);
            while(cursor.moveToNext()){
                Modulo5Dinamico modulo5Dinamico = new Modulo5Dinamico();
                modulo5Dinamico.setIDOCUPACION(cursor.getInt(cursor.getColumnIndex(SQLConstantes.MODULO5_IDOCUPACION)));
                modulo5Dinamico.setIDEMPRESA(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_IDEMPRESA)));
                modulo5Dinamico.setC5_P9_1_0(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P9_1_0)));
                modulo5Dinamico.setC5_P9_1_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P9_1_1)));
                modulo5Dinamico.setC5_P9_2_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P9_2_1)));
                modulo5Dinamico.setC5_P9_3_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P9_3_1)));
                modulo5Dinamico.setC5_P10_1_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P10_1_1)));
                modulo5Dinamico.setC5_P10_2_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P10_2_1)));
                modulo5Dinamico.setC5_P11_1_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P11_1_1)));
                modulo5Dinamico.setC5_P11_2_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P11_2_1)));
                modulo5Dinamico.setC5_P12(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P12)));
                modulo5Dinamico.setC5_P13(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P13)));
                modulo5Dinamico.setC5_P14(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P14)));
                modulo5Dinamico.setC5_P15(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P15)));
                modulo5Dinamico.setC5_P16(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P16)));
                modulo5Dinamico.setC5_P17_0(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P17_0)));
                modulo5Dinamico.setC5_P17_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P17_1)));
                modulo5Dinamico.setC5_P17_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P17_2)));
                modulo5Dinamico.setC5_P17_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P17_3)));
                modulo5Dinamico.setC5_P17_4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P17_4)));
                modulo5Dinamico.setC5_P17_5(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P17_5)));
                modulo5Dinamico.setC5_P17_6(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P17_6)));
                modulo5Dinamico.setC5_P17_7(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P17_7)));
                modulo5Dinamico.setC5_P17_8(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P17_8)));
                modulo5Dinamico.setC5_P17_9(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P17_9)));
                modulo5Dinamico.setC5_P17_10(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P17_10)));
                modulo5Dinamico.setC5_P17_11(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P17_11)));
                modulo5Dinamico.setC5_P17_12(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P17_12)));
                modulo5Dinamico.setC5_P17_13(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P17_13)));
                modulo5Dinamico.setC5_P17_14(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P17_14)));
                modulo5Dinamico.setC5_P17_15(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P17_15)));
                modulo5Dinamico.setC5_P17_16(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P17_16)));
                modulo5Dinamico.setC5_P17_17(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P17_17)));
                modulo5Dinamico.setC5_P17_18(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P17_18)));
                modulo5Dinamico.setC5_P17_19(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P17_19)));
                modulo5Dinamico.setC5_P17_20(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P17_20)));
                modulo5Dinamico.setC5_P17_19_0(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P17_19_0)));
                modulo5Dinamico.setC5_P18(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P18)));
                modulo5Dinamico.setC5_P19(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P19)));
                modulo5Dinamico.setC5_P20(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P20)));
                modulo5Dinamico.setC5_P21_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P21_1)));
                modulo5Dinamico.setC5_P21_0(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P21_0)));
                modulo5Dinamico.setC5_P21_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P21_2)));
                modulo5Dinamico.setC5_P21_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P21_3)));
                modulo5Dinamico.setC5_P21_4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P21_4)));
                modulo5Dinamico.setC5_P21_5(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P21_5)));
                modulo5Dinamico.setC5_P21_6(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P21_6)));
                modulo5Dinamico.setC5_P21_7(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P21_7)));
                modulo5Dinamico.setC5_P21_7_0(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P21_7_0)));
                modulo5Dinamico.setC5_P22_1_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P22_1_1)));
                modulo5Dinamico.setC5_P22_2_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P22_2_1)));
                modulo5Dinamico.setC5_P23_0(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P23_0)));
                modulo5Dinamico.setC5_P23_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P23_1)));
                modulo5Dinamico.setC5_P23_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P23_2)));
                modulo5Dinamico.setC5_P23_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P23_3)));
                modulo5Dinamico.setC5_P23_4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P23_4)));
                modulo5Dinamico.setC5_P23_5(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P23_5)));
                modulo5Dinamico.setC5_P23_6(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P23_6)));
                modulo5Dinamico.setC5_P23_7(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P23_7)));
                modulo5Dinamico.setC5_P23_8(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P23_8)));
                modulo5Dinamico.setC5_P23_9(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P23_9)));
                modulo5Dinamico.setC5_P23_9_0(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P23_9_0)));
                modulo5Dinamico.setC5_P24_0(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P24_0)));
                modulo5Dinamico.setC5_P24_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P24_1)));
                modulo5Dinamico.setC5_P24_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P24_2)));
                modulo5Dinamico.setC5_P24_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P24_3)));
                modulo5Dinamico.setC5_P24_4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P24_4)));
                modulo5Dinamico.setC5_P24_5(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P24_5)));
                modulo5Dinamico.setC5_P24_6(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P24_6)));
                modulo5Dinamico.setC5_P24_7(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P24_7)));
                modulo5Dinamico.setC5_P24_8(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P24_8)));
                modulo5Dinamico.setC5_P24_9(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P24_9)));
                modulo5Dinamico.setC5_P24_10(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P24_10)));
                modulo5Dinamico.setC5_P25(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P25)));
                modulo5Dinamico.setC5_P26(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_P26)));
                modulo5Dinamico.setUSU_CREACION(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_2_USUCREACION)));
                modulo5Dinamico.setFEC_CREACION(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_2_FECCREACION)));
                modulo5Dinamico.setUSU_REGISTRO(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_2_USUREGISTRO)));
                modulo5Dinamico.setFEC_REGISTRO(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO5_2_FECREGISTRO)));
                modulos5Dinamicos.add(modulo5Dinamico);
            }
        }finally {
            if(cursor != null) cursor.close();
        }
        return modulos5Dinamicos;
    }
    //------------------------------ FIN MODULO5 DINAMICO ----------------------------------------------------------------------------


    //-------------------------------------------MODULO 6---------------------------------------------------------------------
    public Modulo6 getModulo6(String idEmpresa){
        Modulo6 modulo6 = new Modulo6();
        String[] whereArgs = new String[]{idEmpresa};
        Cursor cursor = null;
        try {
            cursor = sqLiteDatabase.query(SQLConstantes.tableModulo6,
                    SQLConstantes.ALL_COLUMNS_MODULO6, SQLConstantes.WHERE_CLAUSE_ID_EMPRESA, whereArgs, null, null, null);
            if (cursor.getCount() == 1) {
                cursor.moveToFirst();
                modulo6.setMODULO6_ID(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_ID)));
                modulo6.setC6_P0_0(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P0_0)));
                modulo6.setC6_P0_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P0_1)));
                modulo6.setC6_P0_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P0_2)));
                modulo6.setC6_P0_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P0_3)));
                modulo6.setC6_P1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P1)));
                modulo6.setC6_P2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P2)));
                modulo6.setC6_P2_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P2_1)));
                modulo6.setC6_P2_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P2_2)));
                modulo6.setC6_P3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P3)));
                modulo6.setC6_P3_1_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P3_1_1)));
                modulo6.setC6_P3_1_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P3_1_2)));
                modulo6.setC6_P3_1_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P3_1_3)));
                modulo6.setC6_P3_1_4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P3_1_4)));
                modulo6.setC6_P3_1_5(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P3_1_5)));
                modulo6.setC6_P3_1_6(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P3_1_6)));
                modulo6.setC6_P3_1_7(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P3_1_7)));
                modulo6.setC6_P3_1_8(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P3_1_8)));
                modulo6.setC6_P3_1_9(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P3_1_9)));
                modulo6.setC6_P3_1_10(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P3_1_10)));
                modulo6.setC6_P3_2_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P3_2_1)));
                modulo6.setC6_P3_2_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P3_2_2)));
                modulo6.setC6_P3_2_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P3_2_3)));
                modulo6.setC6_P3_2_4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P3_2_4)));
                modulo6.setC6_P3_2_5(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P3_2_5)));
                modulo6.setC6_P3_2_6(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P3_2_6)));
                modulo6.setC6_P3_2_7(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P3_2_7)));
                modulo6.setC6_P3_2_8(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P3_2_8)));
                modulo6.setC6_P3_2_9(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P3_2_9)));
                modulo6.setC6_P3_2_10(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P3_2_10)));
                modulo6.setC6_P4_1_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P4_1_1)));
                modulo6.setC6_P4_1_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P4_1_2)));
                modulo6.setC6_P4_1_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P4_1_3)));
                modulo6.setC6_P4_1_4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P4_1_4)));
                modulo6.setC6_P4_1_5(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P4_1_5)));
                modulo6.setC6_P4_1_6(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P4_1_6)));
                modulo6.setC6_P4_1_6_0(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P4_1_6_0)));
                modulo6.setC6_P4_2_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P4_2_1)));
                modulo6.setC6_P4_2_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P4_2_2)));
                modulo6.setC6_P4_2_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P4_2_3)));
                modulo6.setC6_P4_2_4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P4_2_4)));
                modulo6.setC6_P4_2_5(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P4_2_5)));
                modulo6.setC6_P4_2_6(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P4_2_6)));
                modulo6.setC6_P4_2_6_0(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P4_2_6_0)));
                modulo6.setC6_P4_3_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P4_3_1)));
                modulo6.setC6_P4_3_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P4_3_2)));
                modulo6.setC6_P4_3_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P4_3_3)));
                modulo6.setC6_P4_3_4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P4_3_4)));
                modulo6.setC6_P4_3_5(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P4_3_5)));
                modulo6.setC6_P4_3_6(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P4_3_6)));
                modulo6.setC6_P4_3_6_0(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P4_3_6_0)));
                modulo6.setC6_P4_4_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P4_4_1)));
                modulo6.setC6_P4_4_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P4_4_2)));
                modulo6.setC6_P4_4_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P4_4_3)));
                modulo6.setC6_P4_4_4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P4_4_4)));
                modulo6.setC6_P4_4_5(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P4_4_5)));
                modulo6.setC6_P4_4_6(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P4_4_6)));
                modulo6.setC6_P4_4_6_0(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P4_4_6_0)));
                modulo6.setC6_P4_5_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P4_5_1)));
                modulo6.setC6_P4_5_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P4_5_2)));
                modulo6.setC6_P4_5_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P4_5_3)));
                modulo6.setC6_P4_5_4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P4_5_4)));
                modulo6.setC6_P4_5_5(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P4_5_5)));
                modulo6.setC6_P4_5_6(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P4_5_6)));
                modulo6.setC6_P4_5_6_0(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P4_5_6_0)));
                modulo6.setC6_P4_6_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P4_6_1)));
                modulo6.setC6_P4_6_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P4_6_2)));
                modulo6.setC6_P4_6_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P4_6_3)));
                modulo6.setC6_P4_6_4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P4_6_4)));
                modulo6.setC6_P4_6_5(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P4_6_5)));
                modulo6.setC6_P4_6_6(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P4_6_6)));
                modulo6.setC6_P4_6_6_0(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P4_6_6_0)));
                modulo6.setC6_P4_7_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P4_7_1)));
                modulo6.setC6_P4_7_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P4_7_2)));
                modulo6.setC6_P4_7_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P4_7_3)));
                modulo6.setC6_P4_7_4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P4_7_4)));
                modulo6.setC6_P4_7_5(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P4_7_5)));
                modulo6.setC6_P4_7_6(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P4_7_6)));
                modulo6.setC6_P4_7_6_0(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P4_7_6_0)));
                modulo6.setC6_P4_8_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P4_8_1)));
                modulo6.setC6_P4_8_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P4_8_2)));
                modulo6.setC6_P4_8_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P4_8_3)));
                modulo6.setC6_P4_8_4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P4_8_4)));
                modulo6.setC6_P4_8_5(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P4_8_5)));
                modulo6.setC6_P4_8_6(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P4_8_6)));
                modulo6.setC6_P4_8_6_0(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P4_8_6_0)));
                modulo6.setC6_P4_9_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P4_9_1)));
                modulo6.setC6_P4_9_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P4_9_2)));
                modulo6.setC6_P4_9_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P4_9_3)));
                modulo6.setC6_P4_9_4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P4_9_4)));
                modulo6.setC6_P4_9_5(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P4_9_5)));
                modulo6.setC6_P4_9_6(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P4_9_6)));
                modulo6.setC6_P4_9_6_0(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P4_9_6_0)));
                modulo6.setC6_P5_1_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_1_1)));
                modulo6.setC6_P5_1_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_1_2)));
                modulo6.setC6_P5_1_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_1_3)));
                modulo6.setC6_P5_1_4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_1_4)));
                modulo6.setC6_P5_1_5(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_1_5)));
                modulo6.setC6_P5_1_6(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_1_6)));
                modulo6.setC6_P5_1_7(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_1_7)));
                modulo6.setC6_P5_1_8(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_1_8)));
                modulo6.setC6_P5_1_9(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_1_9)));
                modulo6.setC6_P5_1_10(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_1_10)));
                modulo6.setC6_P5_1_11(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_1_11)));
                modulo6.setC6_P5_1_12(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_1_12)));
                modulo6.setC6_P5_1_13(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_1_13)));
                modulo6.setC6_P5_1_14(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_1_14)));
                modulo6.setC6_P5_1_15(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_1_15)));
                modulo6.setC6_P5_1_16(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_1_16)));
                modulo6.setC6_P5_1_17(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_1_17)));
                modulo6.setC6_P5_1_18(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_1_18)));
                modulo6.setC6_P5_1_19(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_1_19)));
                modulo6.setC6_P5_1_19_0(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_1_19_0)));
                modulo6.setC6_P5_1_20(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_1_20)));
                modulo6.setC6_P5_2_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_2_1)));
                modulo6.setC6_P5_2_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_2_2)));
                modulo6.setC6_P5_2_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_2_3)));
                modulo6.setC6_P5_2_4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_2_4)));
                modulo6.setC6_P5_2_5(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_2_5)));
                modulo6.setC6_P5_2_6(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_2_6)));
                modulo6.setC6_P5_2_7(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_2_7)));
                modulo6.setC6_P5_2_8(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_2_8)));
                modulo6.setC6_P5_2_9(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_2_9)));
                modulo6.setC6_P5_2_10(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_2_10)));
                modulo6.setC6_P5_2_11(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_2_11)));
                modulo6.setC6_P5_2_12(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_2_12)));
                modulo6.setC6_P5_2_13(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_2_13)));
                modulo6.setC6_P5_2_14(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_2_14)));
                modulo6.setC6_P5_2_15(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_2_15)));
                modulo6.setC6_P5_2_16(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_2_16)));
                modulo6.setC6_P5_2_17(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_2_17)));
                modulo6.setC6_P5_2_18(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_2_18)));
                modulo6.setC6_P5_2_19(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_2_19)));
                modulo6.setC6_P5_2_19_0(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_2_19_0)));
                modulo6.setC6_P5_2_20(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_2_20)));
                modulo6.setC6_P5_3_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_3_1)));
                modulo6.setC6_P5_3_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_3_2)));
                modulo6.setC6_P5_3_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_3_3)));
                modulo6.setC6_P5_3_4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_3_4)));
                modulo6.setC6_P5_3_5(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_3_5)));
                modulo6.setC6_P5_3_6(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_3_6)));
                modulo6.setC6_P5_3_7(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_3_7)));
                modulo6.setC6_P5_3_8(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_3_8)));
                modulo6.setC6_P5_3_9(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_3_9)));
                modulo6.setC6_P5_3_10(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_3_10)));
                modulo6.setC6_P5_3_11(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_3_11)));
                modulo6.setC6_P5_3_12(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_3_12)));
                modulo6.setC6_P5_3_13(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_3_13)));
                modulo6.setC6_P5_3_14(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_3_14)));
                modulo6.setC6_P5_3_15(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_3_15)));
                modulo6.setC6_P5_3_16(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_3_16)));
                modulo6.setC6_P5_3_17(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_3_17)));
                modulo6.setC6_P5_3_18(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_3_18)));
                modulo6.setC6_P5_3_19(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_3_19)));
                modulo6.setC6_P5_3_19_0(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_3_19_0)));
                modulo6.setC6_P5_3_20(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_3_20)));
                modulo6.setC6_P5_4_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_4_1)));
                modulo6.setC6_P5_4_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_4_2)));
                modulo6.setC6_P5_4_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_4_3)));
                modulo6.setC6_P5_4_4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_4_4)));
                modulo6.setC6_P5_4_5(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_4_5)));
                modulo6.setC6_P5_4_6(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_4_6)));
                modulo6.setC6_P5_4_7(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_4_7)));
                modulo6.setC6_P5_4_8(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_4_8)));
                modulo6.setC6_P5_4_9(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_4_9)));
                modulo6.setC6_P5_4_10(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_4_10)));
                modulo6.setC6_P5_4_11(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_4_11)));
                modulo6.setC6_P5_4_12(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_4_12)));
                modulo6.setC6_P5_4_13(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_4_13)));
                modulo6.setC6_P5_4_14(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_4_14)));
                modulo6.setC6_P5_4_15(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_4_15)));
                modulo6.setC6_P5_4_16(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_4_16)));
                modulo6.setC6_P5_4_17(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_4_17)));
                modulo6.setC6_P5_4_18(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_4_18)));
                modulo6.setC6_P5_4_19(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_4_19)));
                modulo6.setC6_P5_4_19_0(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_4_19_0)));
                modulo6.setC6_P5_4_20(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_4_20)));
                modulo6.setC6_P5_5_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_5_1)));
                modulo6.setC6_P5_5_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_5_2)));
                modulo6.setC6_P5_5_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_5_3)));
                modulo6.setC6_P5_5_4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_5_4)));
                modulo6.setC6_P5_5_5(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_5_5)));
                modulo6.setC6_P5_5_6(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_5_6)));
                modulo6.setC6_P5_5_7(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_5_7)));
                modulo6.setC6_P5_5_8(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_5_8)));
                modulo6.setC6_P5_5_9(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_5_9)));
                modulo6.setC6_P5_5_10(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_5_10)));
                modulo6.setC6_P5_5_11(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_5_11)));
                modulo6.setC6_P5_5_12(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_5_12)));
                modulo6.setC6_P5_5_13(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_5_13)));
                modulo6.setC6_P5_5_14(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_5_14)));
                modulo6.setC6_P5_5_15(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_5_15)));
                modulo6.setC6_P5_5_16(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_5_16)));
                modulo6.setC6_P5_5_17(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_5_17)));
                modulo6.setC6_P5_5_18(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_5_18)));
                modulo6.setC6_P5_5_19(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_5_19)));
                modulo6.setC6_P5_5_19_0(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_5_19_0)));
                modulo6.setC6_P5_5_20(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_5_20)));
                modulo6.setC6_P5_6_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_6_1)));
                modulo6.setC6_P5_6_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_6_2)));
                modulo6.setC6_P5_6_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_6_3)));
                modulo6.setC6_P5_6_4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_6_4)));
                modulo6.setC6_P5_6_5(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_6_5)));
                modulo6.setC6_P5_6_6(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_6_6)));
                modulo6.setC6_P5_6_7(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_6_7)));
                modulo6.setC6_P5_6_8(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_6_8)));
                modulo6.setC6_P5_6_9(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_6_9)));
                modulo6.setC6_P5_6_10(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_6_10)));
                modulo6.setC6_P5_6_11(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_6_11)));
                modulo6.setC6_P5_6_12(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_6_12)));
                modulo6.setC6_P5_6_13(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_6_13)));
                modulo6.setC6_P5_6_14(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_6_14)));
                modulo6.setC6_P5_6_15(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_6_15)));
                modulo6.setC6_P5_6_16(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_6_16)));
                modulo6.setC6_P5_6_17(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_6_17)));
                modulo6.setC6_P5_6_18(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_6_18)));
                modulo6.setC6_P5_6_19(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_6_19)));
                modulo6.setC6_P5_6_19_0(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_6_19_0)));
                modulo6.setC6_P5_6_20(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_6_20)));
                modulo6.setC6_P5_7_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_7_1)));
                modulo6.setC6_P5_7_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_7_2)));
                modulo6.setC6_P5_7_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_7_3)));
                modulo6.setC6_P5_7_4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_7_4)));
                modulo6.setC6_P5_7_5(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_7_5)));
                modulo6.setC6_P5_7_6(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_7_6)));
                modulo6.setC6_P5_7_7(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_7_7)));
                modulo6.setC6_P5_7_8(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_7_8)));
                modulo6.setC6_P5_7_9(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_7_9)));
                modulo6.setC6_P5_7_10(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_7_10)));
                modulo6.setC6_P5_7_11(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_7_11)));
                modulo6.setC6_P5_7_12(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_7_12)));
                modulo6.setC6_P5_7_13(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_7_13)));
                modulo6.setC6_P5_7_14(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_7_14)));
                modulo6.setC6_P5_7_15(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_7_15)));
                modulo6.setC6_P5_7_16(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_7_16)));
                modulo6.setC6_P5_7_17(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_7_17)));
                modulo6.setC6_P5_7_18(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_7_18)));
                modulo6.setC6_P5_7_19(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_7_19)));
                modulo6.setC6_P5_7_19_0(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_7_19_0)));
                modulo6.setC6_P5_7_20(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_7_20)));
                modulo6.setC6_P5_8_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_8_1)));
                modulo6.setC6_P5_8_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_8_2)));
                modulo6.setC6_P5_8_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_8_3)));
                modulo6.setC6_P5_8_4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_8_4)));
                modulo6.setC6_P5_8_5(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_8_5)));
                modulo6.setC6_P5_8_6(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_8_6)));
                modulo6.setC6_P5_8_7(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_8_7)));
                modulo6.setC6_P5_8_8(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_8_8)));
                modulo6.setC6_P5_8_9(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_8_9)));
                modulo6.setC6_P5_8_10(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_8_10)));
                modulo6.setC6_P5_8_11(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_8_11)));
                modulo6.setC6_P5_8_12(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_8_12)));
                modulo6.setC6_P5_8_13(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_8_13)));
                modulo6.setC6_P5_8_14(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_8_14)));
                modulo6.setC6_P5_8_15(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_8_15)));
                modulo6.setC6_P5_8_16(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_8_16)));
                modulo6.setC6_P5_8_17(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_8_17)));
                modulo6.setC6_P5_8_18(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_8_18)));
                modulo6.setC6_P5_8_19(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_8_19)));
                modulo6.setC6_P5_8_19_0(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_8_19_0)));
                modulo6.setC6_P5_8_20(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_8_20)));
                modulo6.setC6_P5_9_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_9_1)));
                modulo6.setC6_P5_9_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_9_2)));
                modulo6.setC6_P5_9_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_9_3)));
                modulo6.setC6_P5_9_4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_9_4)));
                modulo6.setC6_P5_9_5(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_9_5)));
                modulo6.setC6_P5_9_6(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_9_6)));
                modulo6.setC6_P5_9_7(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_9_7)));
                modulo6.setC6_P5_9_8(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_9_8)));
                modulo6.setC6_P5_9_9(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_9_9)));
                modulo6.setC6_P5_9_10(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_9_10)));
                modulo6.setC6_P5_9_11(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_9_11)));
                modulo6.setC6_P5_9_12(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_9_12)));
                modulo6.setC6_P5_9_13(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_9_13)));
                modulo6.setC6_P5_9_14(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_9_14)));
                modulo6.setC6_P5_9_15(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_9_15)));
                modulo6.setC6_P5_9_16(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_9_16)));
                modulo6.setC6_P5_9_17(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_9_17)));
                modulo6.setC6_P5_9_18(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_9_18)));
                modulo6.setC6_P5_9_19(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_9_19)));
                modulo6.setC6_P5_9_19_0(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_9_19_0)));
                modulo6.setC6_P5_9_20(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_9_20)));
                modulo6.setC6_P6_1_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P6_1_1)));
                modulo6.setC6_P6_1_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P6_1_2)));
                modulo6.setC6_P6_1_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P6_1_3)));
                modulo6.setC6_P6_1_4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P6_1_4)));
                modulo6.setC6_P6_1_5(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P6_1_5)));
                modulo6.setC6_P6_1_6(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P6_1_6)));
                modulo6.setC6_P6_1_7(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P6_1_7)));
                modulo6.setC6_P6_1_8(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P6_1_8)));
                modulo6.setC6_P6_1_9(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P6_1_9)));
                modulo6.setC6_P6_2_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P6_2_1)));
                modulo6.setC6_P6_2_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P6_2_2)));
                modulo6.setC6_P6_2_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P6_2_3)));
                modulo6.setC6_P6_2_4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P6_2_4)));
                modulo6.setC6_P6_2_5(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P6_2_5)));
                modulo6.setC6_P6_2_6(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P6_2_6)));
                modulo6.setC6_P6_2_7(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P6_2_7)));
                modulo6.setC6_P6_2_8(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P6_2_8)));
                modulo6.setC6_P6_2_9(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P6_2_9)));
                modulo6.setC6_P6_3_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P6_3_1)));
                modulo6.setC6_P6_3_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P6_3_2)));
                modulo6.setC6_P6_3_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P6_3_3)));
                modulo6.setC6_P6_3_4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P6_3_4)));
                modulo6.setC6_P6_3_5(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P6_3_5)));
                modulo6.setC6_P6_3_6(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P6_3_6)));
                modulo6.setC6_P6_3_7(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P6_3_7)));
                modulo6.setC6_P6_3_8(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P6_3_8)));
                modulo6.setC6_P6_3_9(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P6_3_9)));
                modulo6.setC6_P6_4_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P6_4_1)));
                modulo6.setC6_P6_4_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P6_4_2)));
                modulo6.setC6_P6_4_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P6_4_3)));
                modulo6.setC6_P6_4_4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P6_4_4)));
                modulo6.setC6_P6_4_5(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P6_4_5)));
                modulo6.setC6_P6_4_6(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P6_4_6)));
                modulo6.setC6_P6_4_7(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P6_4_7)));
                modulo6.setC6_P6_4_8(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P6_4_8)));
                modulo6.setC6_P6_4_9(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P6_4_9)));
                modulo6.setC6_P6_5_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P6_5_1)));
                modulo6.setC6_P6_5_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P6_5_2)));
                modulo6.setC6_P6_5_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P6_5_3)));
                modulo6.setC6_P6_5_4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P6_5_4)));
                modulo6.setC6_P6_5_5(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P6_5_5)));
                modulo6.setC6_P6_5_6(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P6_5_6)));
                modulo6.setC6_P6_5_7(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P6_5_7)));
                modulo6.setC6_P6_5_8(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P6_5_8)));
                modulo6.setC6_P6_5_9(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P6_5_9)));
                modulo6.setC6_P6_6_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P6_6_1)));
                modulo6.setC6_P6_6_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P6_6_2)));
                modulo6.setC6_P6_6_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P6_6_3)));
                modulo6.setC6_P6_6_4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P6_6_4)));
                modulo6.setC6_P6_6_5(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P6_6_5)));
                modulo6.setC6_P6_6_6(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P6_6_6)));
                modulo6.setC6_P6_6_7(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P6_6_7)));
                modulo6.setC6_P6_6_8(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P6_6_8)));
                modulo6.setC6_P6_6_9(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P6_6_9)));
                modulo6.setC6_P6_7_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P6_7_1)));
                modulo6.setC6_P6_7_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P6_7_2)));
                modulo6.setC6_P6_7_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P6_7_3)));
                modulo6.setC6_P6_7_4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P6_7_4)));
                modulo6.setC6_P6_7_5(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P6_7_5)));
                modulo6.setC6_P6_7_6(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P6_7_6)));
                modulo6.setC6_P6_7_7(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P6_7_7)));
                modulo6.setC6_P6_7_8(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P6_7_8)));
                modulo6.setC6_P6_7_9(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P6_7_9)));
                modulo6.setC6_P6_8_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P6_8_1)));
                modulo6.setC6_P6_8_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P6_8_2)));
                modulo6.setC6_P6_8_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P6_8_3)));
                modulo6.setC6_P6_8_4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P6_8_4)));
                modulo6.setC6_P6_8_5(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P6_8_5)));
                modulo6.setC6_P6_8_6(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P6_8_6)));
                modulo6.setC6_P6_8_7(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P6_8_7)));
                modulo6.setC6_P6_8_8(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P6_8_8)));
                modulo6.setC6_P6_8_9(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P6_8_9)));
                modulo6.setC6_P6_9_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P6_9_1)));
                modulo6.setC6_P6_9_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P6_9_2)));
                modulo6.setC6_P6_9_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P6_9_3)));
                modulo6.setC6_P6_9_4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P6_9_4)));
                modulo6.setC6_P6_9_5(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P6_9_5)));
                modulo6.setC6_P6_9_6(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P6_9_6)));
                modulo6.setC6_P6_9_7(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P6_9_7)));
                modulo6.setC6_P6_9_8(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P6_9_8)));
                modulo6.setC6_P6_9_9(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P6_9_9)));
                modulo6.setC6_P7_1_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P7_1_1)));
                modulo6.setC6_P7_1_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P7_1_2)));
                modulo6.setC6_P7_1_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P7_1_3)));
                modulo6.setC6_P7_1_4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P7_1_4)));
                modulo6.setC6_P7_1_5(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P7_1_5)));
                modulo6.setC6_P7_1_6(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P7_1_6)));
                modulo6.setC6_P7_1_7(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P7_1_7)));
                modulo6.setC6_P7_1_8(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P7_1_8)));
                modulo6.setC6_P7_1_9(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P7_1_9)));
                modulo6.setC6_P7_1_10(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P7_1_10)));
                modulo6.setC6_P7_2_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P7_2_1)));
                modulo6.setC6_P7_2_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P7_2_2)));
                modulo6.setC6_P7_2_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P7_2_3)));
                modulo6.setC6_P7_2_4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P7_2_4)));
                modulo6.setC6_P7_2_5(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P7_2_5)));
                modulo6.setC6_P7_2_6(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P7_2_6)));
                modulo6.setC6_P7_2_7(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P7_2_7)));
                modulo6.setC6_P7_2_8(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P7_2_8)));
                modulo6.setC6_P7_2_9(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P7_2_9)));
                modulo6.setC6_P7_2_10(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P7_2_10)));
                modulo6.setC6_P7_3_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P7_3_1)));
                modulo6.setC6_P7_3_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P7_3_2)));
                modulo6.setC6_P7_3_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P7_3_3)));
                modulo6.setC6_P7_3_4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P7_3_4)));
                modulo6.setC6_P7_3_5(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P7_3_5)));
                modulo6.setC6_P7_3_6(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P7_3_6)));
                modulo6.setC6_P7_3_7(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P7_3_7)));
                modulo6.setC6_P7_3_8(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P7_3_8)));
                modulo6.setC6_P7_3_9(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P7_3_9)));
                modulo6.setC6_P7_3_10(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P7_3_10)));
                modulo6.setC6_P7_4_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P7_4_1)));
                modulo6.setC6_P7_4_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P7_4_2)));
                modulo6.setC6_P7_4_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P7_4_3)));
                modulo6.setC6_P7_4_4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P7_4_4)));
                modulo6.setC6_P7_4_5(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P7_4_5)));
                modulo6.setC6_P7_4_6(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P7_4_6)));
                modulo6.setC6_P7_4_7(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P7_4_7)));
                modulo6.setC6_P7_4_8(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P7_4_8)));
                modulo6.setC6_P7_4_9(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P7_4_9)));
                modulo6.setC6_P7_4_10(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P7_4_10)));
                modulo6.setC6_P7_5_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P7_5_1)));
                modulo6.setC6_P7_5_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P7_5_2)));
                modulo6.setC6_P7_5_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P7_5_3)));
                modulo6.setC6_P7_5_4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P7_5_4)));
                modulo6.setC6_P7_5_5(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P7_5_5)));
                modulo6.setC6_P7_5_6(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P7_5_6)));
                modulo6.setC6_P7_5_7(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P7_5_7)));
                modulo6.setC6_P7_5_8(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P7_5_8)));
                modulo6.setC6_P7_5_9(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P7_5_9)));
                modulo6.setC6_P7_5_10(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P7_5_10)));
                modulo6.setC6_P7_6_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P7_6_1)));
                modulo6.setC6_P7_6_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P7_6_2)));
                modulo6.setC6_P7_6_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P7_6_3)));
                modulo6.setC6_P7_6_4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P7_6_4)));
                modulo6.setC6_P7_6_5(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P7_6_5)));
                modulo6.setC6_P7_6_6(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P7_6_6)));
                modulo6.setC6_P7_6_7(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P7_6_7)));
                modulo6.setC6_P7_6_8(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P7_6_8)));
                modulo6.setC6_P7_6_9(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P7_6_9)));
                modulo6.setC6_P7_6_10(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P7_6_10)));
                modulo6.setC6_P7_7_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P7_7_1)));
                modulo6.setC6_P7_7_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P7_7_2)));
                modulo6.setC6_P7_7_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P7_7_3)));
                modulo6.setC6_P7_7_4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P7_7_4)));
                modulo6.setC6_P7_7_5(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P7_7_5)));
                modulo6.setC6_P7_7_6(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P7_7_6)));
                modulo6.setC6_P7_7_7(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P7_7_7)));
                modulo6.setC6_P7_7_8(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P7_7_8)));
                modulo6.setC6_P7_7_9(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P7_7_9)));
                modulo6.setC6_P7_7_10(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P7_7_10)));
                modulo6.setC6_P7_8_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P7_8_1)));
                modulo6.setC6_P7_8_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P7_8_2)));
                modulo6.setC6_P7_8_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P7_8_3)));
                modulo6.setC6_P7_8_4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P7_8_4)));
                modulo6.setC6_P7_8_5(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P7_8_5)));
                modulo6.setC6_P7_8_6(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P7_8_6)));
                modulo6.setC6_P7_8_7(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P7_8_7)));
                modulo6.setC6_P7_8_8(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P7_8_8)));
                modulo6.setC6_P7_8_9(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P7_8_9)));
                modulo6.setC6_P7_8_10(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P7_8_10)));
                modulo6.setC6_P7_9_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P7_9_1)));
                modulo6.setC6_P7_9_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P7_9_2)));
                modulo6.setC6_P7_9_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P7_9_3)));
                modulo6.setC6_P7_9_4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P7_9_4)));
                modulo6.setC6_P7_9_5(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P7_9_5)));
                modulo6.setC6_P7_9_6(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P7_9_6)));
                modulo6.setC6_P7_9_7(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P7_9_7)));
                modulo6.setC6_P7_9_8(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P7_9_8)));
                modulo6.setC6_P7_9_9(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P7_9_9)));
                modulo6.setC6_P7_9_10(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P7_9_10)));
                modulo6.setC6_P8_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P8_1)));
                modulo6.setC6_P8_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P8_2)));
                modulo6.setC6_P8_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P8_3)));
                modulo6.setC6_P8_4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P8_4)));
                modulo6.setC6_P8_5(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P8_5)));
                modulo6.setC6_P8_6(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P8_6)));
                modulo6.setC6_P8_7(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P8_7)));
                modulo6.setC6_P8_8(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P8_8)));
                modulo6.setC6_P8_9(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P8_9)));
                modulo6.setC6_P9(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P9)));
                modulo6.setC6_P10_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P10_1)));
                modulo6.setC6_P10_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P10_2)));
                modulo6.setC6_P10_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P10_3)));
                modulo6.setC6_P10_4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P10_4)));
                modulo6.setC6_P10_4_0(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P10_4_0)));
                modulo6.setC6_P11_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P11_1)));
                modulo6.setC6_P11_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P11_2)));
                modulo6.setC6_P11_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P11_3)));
                modulo6.setC6_P11_4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P11_4)));
                modulo6.setC6_P11_5(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P11_5)));
                modulo6.setC6_P11_6(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P11_6)));
                modulo6.setC6_P11_7(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P11_7)));
                modulo6.setC6_P11_8(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P11_8)));
                modulo6.setC6_P11_9(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P11_9)));
                modulo6.setOBS_MOD_VI(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_OBS_MOD_VI)));
                modulo6.setUSU_CREACION(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_USUCREACION)));
                modulo6.setFEC_CREACION(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_FECCREACION)));
                modulo6.setUSU_REGISTRO(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_USUREGISTRO)));
                modulo6.setFEC_REGISTRO(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_FECREGISTRO)));
            }
        }finally {
            if(cursor != null) cursor.close();
        }
        return modulo6;
    }

    public boolean existeModulo6(String idEmpresa){
        boolean encontrado = false;
        String[] whereArgs = new String[]{idEmpresa};
        Cursor cursor = sqLiteDatabase.query(SQLConstantes.tableModulo6,
                SQLConstantes.ALL_COLUMNS_MODULO6,SQLConstantes.WHERE_CLAUSE_ID_EMPRESA,whereArgs,null,null,null);
        if(cursor.getCount() == 1) encontrado = true;
        cursor.close();
        return encontrado;
    }

    public ArrayList<Modulo6> getAllModulo6(){
        ArrayList<Modulo6> modulos6 = new ArrayList<Modulo6>();
        Cursor cursor = sqLiteDatabase.query(SQLConstantes.tableModulo6,
                SQLConstantes.ALL_COLUMNS_MODULO6,null,null,null,null,null);
        while(cursor.moveToNext()){
            Modulo6 modulo6 = new Modulo6();
            modulo6.setMODULO6_ID(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_ID)));
            modulo6.setC6_P0_0(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P0_0)));
            modulo6.setC6_P0_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P0_1)));
            modulo6.setC6_P0_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P0_2)));
            modulo6.setC6_P0_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P0_3)));
            modulo6.setC6_P1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P1)));
            modulo6.setC6_P2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P2)));
            modulo6.setC6_P2_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P2_1)));
            modulo6.setC6_P2_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P2_2)));
            modulo6.setC6_P3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P3)));
            modulo6.setC6_P3_1_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P3_1_1)));
            modulo6.setC6_P3_1_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P3_1_2)));
            modulo6.setC6_P3_1_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P3_1_3)));
            modulo6.setC6_P3_1_4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P3_1_4)));
            modulo6.setC6_P3_1_5(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P3_1_5)));
            modulo6.setC6_P3_1_6(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P3_1_6)));
            modulo6.setC6_P3_1_7(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P3_1_7)));
            modulo6.setC6_P3_1_8(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P3_1_8)));
            modulo6.setC6_P3_1_9(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P3_1_9)));
            modulo6.setC6_P3_1_10(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P3_1_10)));
            modulo6.setC6_P3_2_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P3_2_1)));
            modulo6.setC6_P3_2_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P3_2_2)));
            modulo6.setC6_P3_2_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P3_2_3)));
            modulo6.setC6_P3_2_4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P3_2_4)));
            modulo6.setC6_P3_2_5(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P3_2_5)));
            modulo6.setC6_P3_2_6(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P3_2_6)));
            modulo6.setC6_P3_2_7(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P3_2_7)));
            modulo6.setC6_P3_2_8(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P3_2_8)));
            modulo6.setC6_P3_2_9(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P3_2_9)));
            modulo6.setC6_P3_2_10(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P3_2_10)));
            modulo6.setC6_P4_1_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P4_1_1)));
            modulo6.setC6_P4_1_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P4_1_2)));
            modulo6.setC6_P4_1_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P4_1_3)));
            modulo6.setC6_P4_1_4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P4_1_4)));
            modulo6.setC6_P4_1_5(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P4_1_5)));
            modulo6.setC6_P4_1_6(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P4_1_6)));
            modulo6.setC6_P4_1_6_0(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P4_1_6_0)));
            modulo6.setC6_P4_2_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P4_2_1)));
            modulo6.setC6_P4_2_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P4_2_2)));
            modulo6.setC6_P4_2_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P4_2_3)));
            modulo6.setC6_P4_2_4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P4_2_4)));
            modulo6.setC6_P4_2_5(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P4_2_5)));
            modulo6.setC6_P4_2_6(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P4_2_6)));
            modulo6.setC6_P4_2_6_0(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P4_2_6_0)));
            modulo6.setC6_P4_3_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P4_3_1)));
            modulo6.setC6_P4_3_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P4_3_2)));
            modulo6.setC6_P4_3_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P4_3_3)));
            modulo6.setC6_P4_3_4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P4_3_4)));
            modulo6.setC6_P4_3_5(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P4_3_5)));
            modulo6.setC6_P4_3_6(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P4_3_6)));
            modulo6.setC6_P4_3_6_0(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P4_3_6_0)));
            modulo6.setC6_P4_4_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P4_4_1)));
            modulo6.setC6_P4_4_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P4_4_2)));
            modulo6.setC6_P4_4_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P4_4_3)));
            modulo6.setC6_P4_4_4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P4_4_4)));
            modulo6.setC6_P4_4_5(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P4_4_5)));
            modulo6.setC6_P4_4_6(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P4_4_6)));
            modulo6.setC6_P4_4_6_0(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P4_4_6_0)));
            modulo6.setC6_P4_5_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P4_5_1)));
            modulo6.setC6_P4_5_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P4_5_2)));
            modulo6.setC6_P4_5_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P4_5_3)));
            modulo6.setC6_P4_5_4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P4_5_4)));
            modulo6.setC6_P4_5_5(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P4_5_5)));
            modulo6.setC6_P4_5_6(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P4_5_6)));
            modulo6.setC6_P4_5_6_0(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P4_5_6_0)));
            modulo6.setC6_P4_6_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P4_6_1)));
            modulo6.setC6_P4_6_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P4_6_2)));
            modulo6.setC6_P4_6_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P4_6_3)));
            modulo6.setC6_P4_6_4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P4_6_4)));
            modulo6.setC6_P4_6_5(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P4_6_5)));
            modulo6.setC6_P4_6_6(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P4_6_6)));
            modulo6.setC6_P4_6_6_0(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P4_6_6_0)));
            modulo6.setC6_P4_7_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P4_7_1)));
            modulo6.setC6_P4_7_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P4_7_2)));
            modulo6.setC6_P4_7_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P4_7_3)));
            modulo6.setC6_P4_7_4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P4_7_4)));
            modulo6.setC6_P4_7_5(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P4_7_5)));
            modulo6.setC6_P4_7_6(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P4_7_6)));
            modulo6.setC6_P4_7_6_0(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P4_7_6_0)));
            modulo6.setC6_P4_8_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P4_8_1)));
            modulo6.setC6_P4_8_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P4_8_2)));
            modulo6.setC6_P4_8_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P4_8_3)));
            modulo6.setC6_P4_8_4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P4_8_4)));
            modulo6.setC6_P4_8_5(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P4_8_5)));
            modulo6.setC6_P4_8_6(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P4_8_6)));
            modulo6.setC6_P4_8_6_0(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P4_8_6_0)));
            modulo6.setC6_P4_9_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P4_9_1)));
            modulo6.setC6_P4_9_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P4_9_2)));
            modulo6.setC6_P4_9_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P4_9_3)));
            modulo6.setC6_P4_9_4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P4_9_4)));
            modulo6.setC6_P4_9_5(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P4_9_5)));
            modulo6.setC6_P4_9_6(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P4_9_6)));
            modulo6.setC6_P4_9_6_0(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P4_9_6_0)));
            modulo6.setC6_P5_1_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_1_1)));
            modulo6.setC6_P5_1_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_1_2)));
            modulo6.setC6_P5_1_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_1_3)));
            modulo6.setC6_P5_1_4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_1_4)));
            modulo6.setC6_P5_1_5(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_1_5)));
            modulo6.setC6_P5_1_6(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_1_6)));
            modulo6.setC6_P5_1_7(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_1_7)));
            modulo6.setC6_P5_1_8(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_1_8)));
            modulo6.setC6_P5_1_9(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_1_9)));
            modulo6.setC6_P5_1_10(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_1_10)));
            modulo6.setC6_P5_1_11(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_1_11)));
            modulo6.setC6_P5_1_12(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_1_12)));
            modulo6.setC6_P5_1_13(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_1_13)));
            modulo6.setC6_P5_1_14(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_1_14)));
            modulo6.setC6_P5_1_15(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_1_15)));
            modulo6.setC6_P5_1_16(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_1_16)));
            modulo6.setC6_P5_1_17(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_1_17)));
            modulo6.setC6_P5_1_18(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_1_18)));
            modulo6.setC6_P5_1_19(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_1_19)));
            modulo6.setC6_P5_1_19_0(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_1_19_0)));
            modulo6.setC6_P5_1_20(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_1_20)));
            modulo6.setC6_P5_2_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_2_1)));
            modulo6.setC6_P5_2_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_2_2)));
            modulo6.setC6_P5_2_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_2_3)));
            modulo6.setC6_P5_2_4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_2_4)));
            modulo6.setC6_P5_2_5(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_2_5)));
            modulo6.setC6_P5_2_6(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_2_6)));
            modulo6.setC6_P5_2_7(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_2_7)));
            modulo6.setC6_P5_2_8(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_2_8)));
            modulo6.setC6_P5_2_9(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_2_9)));
            modulo6.setC6_P5_2_10(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_2_10)));
            modulo6.setC6_P5_2_11(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_2_11)));
            modulo6.setC6_P5_2_12(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_2_12)));
            modulo6.setC6_P5_2_13(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_2_13)));
            modulo6.setC6_P5_2_14(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_2_14)));
            modulo6.setC6_P5_2_15(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_2_15)));
            modulo6.setC6_P5_2_16(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_2_16)));
            modulo6.setC6_P5_2_17(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_2_17)));
            modulo6.setC6_P5_2_18(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_2_18)));
            modulo6.setC6_P5_2_19(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_2_19)));
            modulo6.setC6_P5_2_19_0(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_2_19_0)));
            modulo6.setC6_P5_2_20(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_2_20)));
            modulo6.setC6_P5_3_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_3_1)));
            modulo6.setC6_P5_3_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_3_2)));
            modulo6.setC6_P5_3_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_3_3)));
            modulo6.setC6_P5_3_4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_3_4)));
            modulo6.setC6_P5_3_5(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_3_5)));
            modulo6.setC6_P5_3_6(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_3_6)));
            modulo6.setC6_P5_3_7(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_3_7)));
            modulo6.setC6_P5_3_8(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_3_8)));
            modulo6.setC6_P5_3_9(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_3_9)));
            modulo6.setC6_P5_3_10(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_3_10)));
            modulo6.setC6_P5_3_11(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_3_11)));
            modulo6.setC6_P5_3_12(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_3_12)));
            modulo6.setC6_P5_3_13(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_3_13)));
            modulo6.setC6_P5_3_14(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_3_14)));
            modulo6.setC6_P5_3_15(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_3_15)));
            modulo6.setC6_P5_3_16(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_3_16)));
            modulo6.setC6_P5_3_17(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_3_17)));
            modulo6.setC6_P5_3_18(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_3_18)));
            modulo6.setC6_P5_3_19(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_3_19)));
            modulo6.setC6_P5_3_19_0(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_3_19_0)));
            modulo6.setC6_P5_3_20(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_3_20)));
            modulo6.setC6_P5_4_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_4_1)));
            modulo6.setC6_P5_4_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_4_2)));
            modulo6.setC6_P5_4_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_4_3)));
            modulo6.setC6_P5_4_4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_4_4)));
            modulo6.setC6_P5_4_5(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_4_5)));
            modulo6.setC6_P5_4_6(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_4_6)));
            modulo6.setC6_P5_4_7(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_4_7)));
            modulo6.setC6_P5_4_8(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_4_8)));
            modulo6.setC6_P5_4_9(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_4_9)));
            modulo6.setC6_P5_4_10(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_4_10)));
            modulo6.setC6_P5_4_11(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_4_11)));
            modulo6.setC6_P5_4_12(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_4_12)));
            modulo6.setC6_P5_4_13(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_4_13)));
            modulo6.setC6_P5_4_14(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_4_14)));
            modulo6.setC6_P5_4_15(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_4_15)));
            modulo6.setC6_P5_4_16(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_4_16)));
            modulo6.setC6_P5_4_17(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_4_17)));
            modulo6.setC6_P5_4_18(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_4_18)));
            modulo6.setC6_P5_4_19(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_4_19)));
            modulo6.setC6_P5_4_19_0(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_4_19_0)));
            modulo6.setC6_P5_4_20(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_4_20)));
            modulo6.setC6_P5_5_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_5_1)));
            modulo6.setC6_P5_5_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_5_2)));
            modulo6.setC6_P5_5_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_5_3)));
            modulo6.setC6_P5_5_4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_5_4)));
            modulo6.setC6_P5_5_5(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_5_5)));
            modulo6.setC6_P5_5_6(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_5_6)));
            modulo6.setC6_P5_5_7(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_5_7)));
            modulo6.setC6_P5_5_8(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_5_8)));
            modulo6.setC6_P5_5_9(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_5_9)));
            modulo6.setC6_P5_5_10(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_5_10)));
            modulo6.setC6_P5_5_11(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_5_11)));
            modulo6.setC6_P5_5_12(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_5_12)));
            modulo6.setC6_P5_5_13(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_5_13)));
            modulo6.setC6_P5_5_14(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_5_14)));
            modulo6.setC6_P5_5_15(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_5_15)));
            modulo6.setC6_P5_5_16(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_5_16)));
            modulo6.setC6_P5_5_17(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_5_17)));
            modulo6.setC6_P5_5_18(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_5_18)));
            modulo6.setC6_P5_5_19(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_5_19)));
            modulo6.setC6_P5_5_19_0(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_5_19_0)));
            modulo6.setC6_P5_5_20(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_5_20)));
            modulo6.setC6_P5_6_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_6_1)));
            modulo6.setC6_P5_6_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_6_2)));
            modulo6.setC6_P5_6_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_6_3)));
            modulo6.setC6_P5_6_4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_6_4)));
            modulo6.setC6_P5_6_5(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_6_5)));
            modulo6.setC6_P5_6_6(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_6_6)));
            modulo6.setC6_P5_6_7(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_6_7)));
            modulo6.setC6_P5_6_8(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_6_8)));
            modulo6.setC6_P5_6_9(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_6_9)));
            modulo6.setC6_P5_6_10(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_6_10)));
            modulo6.setC6_P5_6_11(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_6_11)));
            modulo6.setC6_P5_6_12(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_6_12)));
            modulo6.setC6_P5_6_13(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_6_13)));
            modulo6.setC6_P5_6_14(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_6_14)));
            modulo6.setC6_P5_6_15(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_6_15)));
            modulo6.setC6_P5_6_16(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_6_16)));
            modulo6.setC6_P5_6_17(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_6_17)));
            modulo6.setC6_P5_6_18(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_6_18)));
            modulo6.setC6_P5_6_19(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_6_19)));
            modulo6.setC6_P5_6_19_0(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_6_19_0)));
            modulo6.setC6_P5_6_20(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_6_20)));
            modulo6.setC6_P5_7_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_7_1)));
            modulo6.setC6_P5_7_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_7_2)));
            modulo6.setC6_P5_7_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_7_3)));
            modulo6.setC6_P5_7_4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_7_4)));
            modulo6.setC6_P5_7_5(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_7_5)));
            modulo6.setC6_P5_7_6(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_7_6)));
            modulo6.setC6_P5_7_7(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_7_7)));
            modulo6.setC6_P5_7_8(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_7_8)));
            modulo6.setC6_P5_7_9(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_7_9)));
            modulo6.setC6_P5_7_10(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_7_10)));
            modulo6.setC6_P5_7_11(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_7_11)));
            modulo6.setC6_P5_7_12(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_7_12)));
            modulo6.setC6_P5_7_13(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_7_13)));
            modulo6.setC6_P5_7_14(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_7_14)));
            modulo6.setC6_P5_7_15(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_7_15)));
            modulo6.setC6_P5_7_16(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_7_16)));
            modulo6.setC6_P5_7_17(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_7_17)));
            modulo6.setC6_P5_7_18(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_7_18)));
            modulo6.setC6_P5_7_19(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_7_19)));
            modulo6.setC6_P5_7_19_0(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_7_19_0)));
            modulo6.setC6_P5_7_20(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_7_20)));
            modulo6.setC6_P5_8_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_8_1)));
            modulo6.setC6_P5_8_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_8_2)));
            modulo6.setC6_P5_8_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_8_3)));
            modulo6.setC6_P5_8_4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_8_4)));
            modulo6.setC6_P5_8_5(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_8_5)));
            modulo6.setC6_P5_8_6(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_8_6)));
            modulo6.setC6_P5_8_7(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_8_7)));
            modulo6.setC6_P5_8_8(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_8_8)));
            modulo6.setC6_P5_8_9(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_8_9)));
            modulo6.setC6_P5_8_10(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_8_10)));
            modulo6.setC6_P5_8_11(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_8_11)));
            modulo6.setC6_P5_8_12(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_8_12)));
            modulo6.setC6_P5_8_13(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_8_13)));
            modulo6.setC6_P5_8_14(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_8_14)));
            modulo6.setC6_P5_8_15(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_8_15)));
            modulo6.setC6_P5_8_16(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_8_16)));
            modulo6.setC6_P5_8_17(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_8_17)));
            modulo6.setC6_P5_8_18(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_8_18)));
            modulo6.setC6_P5_8_19(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_8_19)));
            modulo6.setC6_P5_8_19_0(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_8_19_0)));
            modulo6.setC6_P5_8_20(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_8_20)));
            modulo6.setC6_P5_9_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_9_1)));
            modulo6.setC6_P5_9_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_9_2)));
            modulo6.setC6_P5_9_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_9_3)));
            modulo6.setC6_P5_9_4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_9_4)));
            modulo6.setC6_P5_9_5(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_9_5)));
            modulo6.setC6_P5_9_6(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_9_6)));
            modulo6.setC6_P5_9_7(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_9_7)));
            modulo6.setC6_P5_9_8(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_9_8)));
            modulo6.setC6_P5_9_9(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_9_9)));
            modulo6.setC6_P5_9_10(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_9_10)));
            modulo6.setC6_P5_9_11(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_9_11)));
            modulo6.setC6_P5_9_12(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_9_12)));
            modulo6.setC6_P5_9_13(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_9_13)));
            modulo6.setC6_P5_9_14(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_9_14)));
            modulo6.setC6_P5_9_15(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_9_15)));
            modulo6.setC6_P5_9_16(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_9_16)));
            modulo6.setC6_P5_9_17(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_9_17)));
            modulo6.setC6_P5_9_18(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_9_18)));
            modulo6.setC6_P5_9_19(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_9_19)));
            modulo6.setC6_P5_9_19_0(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_9_19_0)));
            modulo6.setC6_P5_9_20(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P5_9_20)));
            modulo6.setC6_P6_1_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P6_1_1)));
            modulo6.setC6_P6_1_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P6_1_2)));
            modulo6.setC6_P6_1_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P6_1_3)));
            modulo6.setC6_P6_1_4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P6_1_4)));
            modulo6.setC6_P6_1_5(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P6_1_5)));
            modulo6.setC6_P6_1_6(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P6_1_6)));
            modulo6.setC6_P6_1_7(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P6_1_7)));
            modulo6.setC6_P6_1_8(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P6_1_8)));
            modulo6.setC6_P6_1_9(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P6_1_9)));
            modulo6.setC6_P6_2_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P6_2_1)));
            modulo6.setC6_P6_2_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P6_2_2)));
            modulo6.setC6_P6_2_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P6_2_3)));
            modulo6.setC6_P6_2_4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P6_2_4)));
            modulo6.setC6_P6_2_5(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P6_2_5)));
            modulo6.setC6_P6_2_6(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P6_2_6)));
            modulo6.setC6_P6_2_7(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P6_2_7)));
            modulo6.setC6_P6_2_8(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P6_2_8)));
            modulo6.setC6_P6_2_9(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P6_2_9)));
            modulo6.setC6_P6_3_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P6_3_1)));
            modulo6.setC6_P6_3_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P6_3_2)));
            modulo6.setC6_P6_3_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P6_3_3)));
            modulo6.setC6_P6_3_4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P6_3_4)));
            modulo6.setC6_P6_3_5(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P6_3_5)));
            modulo6.setC6_P6_3_6(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P6_3_6)));
            modulo6.setC6_P6_3_7(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P6_3_7)));
            modulo6.setC6_P6_3_8(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P6_3_8)));
            modulo6.setC6_P6_3_9(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P6_3_9)));
            modulo6.setC6_P6_4_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P6_4_1)));
            modulo6.setC6_P6_4_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P6_4_2)));
            modulo6.setC6_P6_4_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P6_4_3)));
            modulo6.setC6_P6_4_4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P6_4_4)));
            modulo6.setC6_P6_4_5(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P6_4_5)));
            modulo6.setC6_P6_4_6(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P6_4_6)));
            modulo6.setC6_P6_4_7(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P6_4_7)));
            modulo6.setC6_P6_4_8(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P6_4_8)));
            modulo6.setC6_P6_4_9(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P6_4_9)));
            modulo6.setC6_P6_5_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P6_5_1)));
            modulo6.setC6_P6_5_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P6_5_2)));
            modulo6.setC6_P6_5_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P6_5_3)));
            modulo6.setC6_P6_5_4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P6_5_4)));
            modulo6.setC6_P6_5_5(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P6_5_5)));
            modulo6.setC6_P6_5_6(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P6_5_6)));
            modulo6.setC6_P6_5_7(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P6_5_7)));
            modulo6.setC6_P6_5_8(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P6_5_8)));
            modulo6.setC6_P6_5_9(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P6_5_9)));
            modulo6.setC6_P6_6_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P6_6_1)));
            modulo6.setC6_P6_6_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P6_6_2)));
            modulo6.setC6_P6_6_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P6_6_3)));
            modulo6.setC6_P6_6_4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P6_6_4)));
            modulo6.setC6_P6_6_5(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P6_6_5)));
            modulo6.setC6_P6_6_6(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P6_6_6)));
            modulo6.setC6_P6_6_7(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P6_6_7)));
            modulo6.setC6_P6_6_8(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P6_6_8)));
            modulo6.setC6_P6_6_9(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P6_6_9)));
            modulo6.setC6_P6_7_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P6_7_1)));
            modulo6.setC6_P6_7_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P6_7_2)));
            modulo6.setC6_P6_7_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P6_7_3)));
            modulo6.setC6_P6_7_4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P6_7_4)));
            modulo6.setC6_P6_7_5(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P6_7_5)));
            modulo6.setC6_P6_7_6(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P6_7_6)));
            modulo6.setC6_P6_7_7(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P6_7_7)));
            modulo6.setC6_P6_7_8(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P6_7_8)));
            modulo6.setC6_P6_7_9(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P6_7_9)));
            modulo6.setC6_P6_8_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P6_8_1)));
            modulo6.setC6_P6_8_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P6_8_2)));
            modulo6.setC6_P6_8_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P6_8_3)));
            modulo6.setC6_P6_8_4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P6_8_4)));
            modulo6.setC6_P6_8_5(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P6_8_5)));
            modulo6.setC6_P6_8_6(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P6_8_6)));
            modulo6.setC6_P6_8_7(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P6_8_7)));
            modulo6.setC6_P6_8_8(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P6_8_8)));
            modulo6.setC6_P6_8_9(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P6_8_9)));
            modulo6.setC6_P6_9_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P6_9_1)));
            modulo6.setC6_P6_9_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P6_9_2)));
            modulo6.setC6_P6_9_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P6_9_3)));
            modulo6.setC6_P6_9_4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P6_9_4)));
            modulo6.setC6_P6_9_5(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P6_9_5)));
            modulo6.setC6_P6_9_6(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P6_9_6)));
            modulo6.setC6_P6_9_7(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P6_9_7)));
            modulo6.setC6_P6_9_8(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P6_9_8)));
            modulo6.setC6_P6_9_9(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P6_9_9)));
            modulo6.setC6_P7_1_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P7_1_1)));
            modulo6.setC6_P7_1_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P7_1_2)));
            modulo6.setC6_P7_1_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P7_1_3)));
            modulo6.setC6_P7_1_4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P7_1_4)));
            modulo6.setC6_P7_1_5(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P7_1_5)));
            modulo6.setC6_P7_1_6(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P7_1_6)));
            modulo6.setC6_P7_1_7(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P7_1_7)));
            modulo6.setC6_P7_1_8(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P7_1_8)));
            modulo6.setC6_P7_1_9(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P7_1_9)));
            modulo6.setC6_P7_1_10(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P7_1_10)));
            modulo6.setC6_P7_2_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P7_2_1)));
            modulo6.setC6_P7_2_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P7_2_2)));
            modulo6.setC6_P7_2_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P7_2_3)));
            modulo6.setC6_P7_2_4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P7_2_4)));
            modulo6.setC6_P7_2_5(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P7_2_5)));
            modulo6.setC6_P7_2_6(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P7_2_6)));
            modulo6.setC6_P7_2_7(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P7_2_7)));
            modulo6.setC6_P7_2_8(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P7_2_8)));
            modulo6.setC6_P7_2_9(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P7_2_9)));
            modulo6.setC6_P7_2_10(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P7_2_10)));
            modulo6.setC6_P7_3_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P7_3_1)));
            modulo6.setC6_P7_3_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P7_3_2)));
            modulo6.setC6_P7_3_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P7_3_3)));
            modulo6.setC6_P7_3_4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P7_3_4)));
            modulo6.setC6_P7_3_5(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P7_3_5)));
            modulo6.setC6_P7_3_6(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P7_3_6)));
            modulo6.setC6_P7_3_7(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P7_3_7)));
            modulo6.setC6_P7_3_8(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P7_3_8)));
            modulo6.setC6_P7_3_9(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P7_3_9)));
            modulo6.setC6_P7_3_10(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P7_3_10)));
            modulo6.setC6_P7_4_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P7_4_1)));
            modulo6.setC6_P7_4_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P7_4_2)));
            modulo6.setC6_P7_4_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P7_4_3)));
            modulo6.setC6_P7_4_4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P7_4_4)));
            modulo6.setC6_P7_4_5(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P7_4_5)));
            modulo6.setC6_P7_4_6(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P7_4_6)));
            modulo6.setC6_P7_4_7(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P7_4_7)));
            modulo6.setC6_P7_4_8(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P7_4_8)));
            modulo6.setC6_P7_4_9(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P7_4_9)));
            modulo6.setC6_P7_4_10(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P7_4_10)));
            modulo6.setC6_P7_5_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P7_5_1)));
            modulo6.setC6_P7_5_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P7_5_2)));
            modulo6.setC6_P7_5_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P7_5_3)));
            modulo6.setC6_P7_5_4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P7_5_4)));
            modulo6.setC6_P7_5_5(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P7_5_5)));
            modulo6.setC6_P7_5_6(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P7_5_6)));
            modulo6.setC6_P7_5_7(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P7_5_7)));
            modulo6.setC6_P7_5_8(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P7_5_8)));
            modulo6.setC6_P7_5_9(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P7_5_9)));
            modulo6.setC6_P7_5_10(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P7_5_10)));
            modulo6.setC6_P7_6_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P7_6_1)));
            modulo6.setC6_P7_6_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P7_6_2)));
            modulo6.setC6_P7_6_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P7_6_3)));
            modulo6.setC6_P7_6_4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P7_6_4)));
            modulo6.setC6_P7_6_5(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P7_6_5)));
            modulo6.setC6_P7_6_6(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P7_6_6)));
            modulo6.setC6_P7_6_7(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P7_6_7)));
            modulo6.setC6_P7_6_8(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P7_6_8)));
            modulo6.setC6_P7_6_9(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P7_6_9)));
            modulo6.setC6_P7_6_10(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P7_6_10)));
            modulo6.setC6_P7_7_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P7_7_1)));
            modulo6.setC6_P7_7_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P7_7_2)));
            modulo6.setC6_P7_7_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P7_7_3)));
            modulo6.setC6_P7_7_4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P7_7_4)));
            modulo6.setC6_P7_7_5(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P7_7_5)));
            modulo6.setC6_P7_7_6(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P7_7_6)));
            modulo6.setC6_P7_7_7(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P7_7_7)));
            modulo6.setC6_P7_7_8(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P7_7_8)));
            modulo6.setC6_P7_7_9(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P7_7_9)));
            modulo6.setC6_P7_7_10(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P7_7_10)));
            modulo6.setC6_P7_8_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P7_8_1)));
            modulo6.setC6_P7_8_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P7_8_2)));
            modulo6.setC6_P7_8_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P7_8_3)));
            modulo6.setC6_P7_8_4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P7_8_4)));
            modulo6.setC6_P7_8_5(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P7_8_5)));
            modulo6.setC6_P7_8_6(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P7_8_6)));
            modulo6.setC6_P7_8_7(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P7_8_7)));
            modulo6.setC6_P7_8_8(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P7_8_8)));
            modulo6.setC6_P7_8_9(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P7_8_9)));
            modulo6.setC6_P7_8_10(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P7_8_10)));
            modulo6.setC6_P7_9_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P7_9_1)));
            modulo6.setC6_P7_9_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P7_9_2)));
            modulo6.setC6_P7_9_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P7_9_3)));
            modulo6.setC6_P7_9_4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P7_9_4)));
            modulo6.setC6_P7_9_5(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P7_9_5)));
            modulo6.setC6_P7_9_6(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P7_9_6)));
            modulo6.setC6_P7_9_7(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P7_9_7)));
            modulo6.setC6_P7_9_8(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P7_9_8)));
            modulo6.setC6_P7_9_9(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P7_9_9)));
            modulo6.setC6_P7_9_10(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P7_9_10)));
            modulo6.setC6_P8_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P8_1)));
            modulo6.setC6_P8_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P8_2)));
            modulo6.setC6_P8_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P8_3)));
            modulo6.setC6_P8_4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P8_4)));
            modulo6.setC6_P8_5(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P8_5)));
            modulo6.setC6_P8_6(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P8_6)));
            modulo6.setC6_P8_7(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P8_7)));
            modulo6.setC6_P8_8(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P8_8)));
            modulo6.setC6_P8_9(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P8_9)));
            modulo6.setC6_P9(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P9)));
            modulo6.setC6_P10_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P10_1)));
            modulo6.setC6_P10_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P10_2)));
            modulo6.setC6_P10_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P10_3)));
            modulo6.setC6_P10_4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P10_4)));
            modulo6.setC6_P10_4_0(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P10_4_0)));
            modulo6.setC6_P11_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P11_1)));
            modulo6.setC6_P11_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P11_2)));
            modulo6.setC6_P11_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P11_3)));
            modulo6.setC6_P11_4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P11_4)));
            modulo6.setC6_P11_5(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P11_5)));
            modulo6.setC6_P11_6(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P11_6)));
            modulo6.setC6_P11_7(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P11_7)));
            modulo6.setC6_P11_8(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P11_8)));
            modulo6.setC6_P11_9(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_P11_9)));
            modulo6.setOBS_MOD_VI(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_OBS_MOD_VI)));
            modulo6.setUSU_CREACION(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_USUCREACION)));
            modulo6.setFEC_CREACION(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_FECCREACION)));
            modulo6.setUSU_REGISTRO(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_USUREGISTRO)));
            modulo6.setFEC_REGISTRO(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO6_FECREGISTRO)));
            modulos6.add(modulo6);
        }
        cursor.close();
        return modulos6;
    }


    public void insertarModulo6(Modulo6 modulo6){
        ContentValues contentValues = modulo6.toValues();
        sqLiteDatabase.insert(SQLConstantes.tableModulo6,null,contentValues);
    }

    public void insertarModulos6(ArrayList<Modulo6> modulos6){
        long items = getNumeroItemsModulo6();
        if(items == 0){
            for (Modulo6 modulo6 : modulos6) {
                try {
                    insertarModulo6(modulo6);
                }catch (SQLiteException e){
                    e.printStackTrace();
                }
            }
        }
    }

    public void actualizarModulo6(String idempresa, ContentValues contentValues){
        String[] whereArgs = new String[]{idempresa};
        sqLiteDatabase.update(SQLConstantes.tableModulo6,contentValues,SQLConstantes.WHERE_CLAUSE_ID_EMPRESA,whereArgs);
    }
    public void deleteModulo6(String idEmpresa){
        String[] whereArgs = new String[]{idEmpresa};
        sqLiteDatabase.delete(SQLConstantes.tableModulo6,SQLConstantes.WHERE_CLAUSE_ID_EMPRESA,whereArgs);
    }
//--------------------------------------FIN MODULO6-------------------------------------------------------------------------------



//----------------------------------------------- MODULO 7 --------------------------------------------------------------------------



    public Modulo7 getModulo7(String idEmpresa){
        Modulo7 modulo7 = new Modulo7();
        String[] whereArgs = new String[]{idEmpresa};
        Cursor cursor = sqLiteDatabase.query(SQLConstantes.tableModulo7,
                SQLConstantes.ALL_COLUMNS_MODULO7,SQLConstantes.WHERE_CLAUSE_ID_EMPRESA,whereArgs,null,null,null);
        if(cursor.getCount() == 1){
            cursor.moveToFirst();
            modulo7.setMODULO7_ID(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_ID)));
            modulo7.setC7_P0_0(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P0_0)));
            modulo7.setC7_P0_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P0_1)));
            modulo7.setC7_P0_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P0_2)));
            modulo7.setC7_P0_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P0_3)));
            modulo7.setC7_P1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P1)));
            modulo7.setC7_P2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P2)));
            modulo7.setC7_P3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P3)));
            modulo7.setC7_P4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P4)));
            modulo7.setC7_P5(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P5)));
            modulo7.setC7_P6_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P6_1)));
            modulo7.setC7_P6_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P6_2)));
            modulo7.setC7_P7(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P7)));
            modulo7.setC7_P7_0(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P7_0)));
            modulo7.setC7_P8_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P8_1)));
            modulo7.setC7_P8_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P8_2)));
            modulo7.setC7_P8_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P8_3)));
            modulo7.setC7_P8_4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P8_4)));
            modulo7.setC7_P8_5(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P8_5)));
            modulo7.setC7_P8_6(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P8_6)));
            modulo7.setC7_P8_7(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P8_7)));
            modulo7.setC7_P8_8(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P8_8)));
            modulo7.setC7_P8_9(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P8_9)));
            modulo7.setC7_P8_10(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P8_10)));
            modulo7.setC7_P8_11(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P8_11)));
            modulo7.setC7_P8_12(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P8_12)));
            modulo7.setC7_P8_13(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P8_13)));
            modulo7.setC7_P8_14(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P8_14)));
            modulo7.setC7_P8_15(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P8_15)));
            modulo7.setC7_P8_16(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P8_16)));
            modulo7.setC7_P8_17(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P8_17)));
            modulo7.setC7_P8_18(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P8_18)));
            modulo7.setC7_P8_19(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P8_19)));
            modulo7.setC7_P8_19_0(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P8_19_0)));
            modulo7.setC7_P8_20(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P8_20)));
            modulo7.setC7_P9_1_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P9_1_1)));
            modulo7.setC7_P9_1_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P9_1_2)));
            modulo7.setC7_P9_1_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P9_1_3)));
            modulo7.setC7_P9_1_4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P9_1_4)));
            modulo7.setC7_P9_1_5(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P9_1_5)));
            modulo7.setC7_P9_1_6(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P9_1_6)));
            modulo7.setC7_P9_1_7(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P9_1_7)));
            modulo7.setC7_P9_1_8(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P9_1_8)));
            modulo7.setC7_P9_1_9(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P9_1_9)));
            modulo7.setC7_P9_1_10(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P9_1_10)));
            modulo7.setC7_P9_1_11(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P9_1_11)));
            modulo7.setC7_P9_1_12(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P9_1_12)));
            modulo7.setC7_P9_1_13(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P9_1_13)));
            modulo7.setC7_P9_1_14(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P9_1_14)));
            modulo7.setC7_P9_1_15(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P9_1_15)));
            modulo7.setC7_P9_1_16(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P9_1_16)));
            modulo7.setC7_P9_1_17(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P9_1_17)));
            modulo7.setC7_P9_1_18(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P9_1_18)));
            modulo7.setC7_P9_1_19(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P9_1_19)));
            modulo7.setC7_P8_1_19_0(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P8_1_19_0)));
            modulo7.setC7_P9_1_20(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P9_1_20)));
            modulo7.setC7_P9_2_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P9_2_1)));
            modulo7.setC7_P9_2_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P9_2_2)));
            modulo7.setC7_P9_2_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P9_2_3)));
            modulo7.setC7_P9_2_4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P9_2_4)));
            modulo7.setC7_P9_2_5(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P9_2_5)));
            modulo7.setC7_P9_2_6(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P9_2_6)));
            modulo7.setC7_P9_2_7(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P9_2_7)));
            modulo7.setC7_P9_2_8(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P9_2_8)));
            modulo7.setC7_P9_2_9(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P9_2_9)));
            modulo7.setC7_P9_2_10(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P9_2_10)));
            modulo7.setC7_P9_2_11(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P9_2_11)));
            modulo7.setC7_P9_2_12(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P9_2_12)));
            modulo7.setC7_P9_2_13(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P9_2_13)));
            modulo7.setC7_P9_2_14(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P9_2_14)));
            modulo7.setC7_P9_2_15(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P9_2_15)));
            modulo7.setC7_P9_2_16(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P9_2_16)));
            modulo7.setC7_P9_2_17(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P9_2_17)));
            modulo7.setC7_P9_2_18(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P9_2_18)));
            modulo7.setC7_P9_2_19(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P9_2_19)));
            modulo7.setC7_P10(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P10)));
            modulo7.setC7_P11(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P11)));
            modulo7.setC7_P12_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P12_1)));
            modulo7.setC7_P12_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P12_2)));
            modulo7.setC7_P12_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P12_3)));
            modulo7.setC7_P12_4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P12_4)));
            modulo7.setC7_P13_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P13_1)));
            modulo7.setC7_P13_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P13_2)));
            modulo7.setC7_P13_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P13_3)));
            modulo7.setC7_P13_4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P13_4)));
            modulo7.setC7_P14(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P14)));
            modulo7.setC7_P15(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P15)));
            modulo7.setC7_P16(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P16)));
            modulo7.setC7_P17_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P17_1)));
            modulo7.setC7_P17_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P17_2)));
            modulo7.setC7_P17_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P17_3)));
            modulo7.setC7_P17_4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P17_4)));
            modulo7.setC7_P17_5(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P17_5)));
            modulo7.setC7_P17_6(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P17_6)));
            modulo7.setC7_P17_7(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P17_7)));
            modulo7.setC7_P17_8(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P17_8)));
            modulo7.setC7_P17_9(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P17_9)));
            modulo7.setC7_P17_10(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P17_10)));
            modulo7.setC7_P17_10_0(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P17_10_0)));
            modulo7.setC7_P18_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P18_1)));
            modulo7.setC7_P18_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P18_2)));
            modulo7.setC7_P18_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P18_3)));
            modulo7.setC7_P18_4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P18_4)));
            modulo7.setC7_P18_5(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P18_5)));
            modulo7.setC7_P18_6(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P18_6)));
            modulo7.setC7_P18_7(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P18_7)));
            modulo7.setC7_P18_8(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P18_8)));
            modulo7.setC7_P18_9(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P18_9)));
            modulo7.setC7_P18_10(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P18_10)));
            modulo7.setC7_P18_10_0(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P18_10_0)));
            modulo7.setC7_P19_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P19_1)));
            modulo7.setC7_P19_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P19_2)));
            modulo7.setC7_P19_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P19_3)));
            modulo7.setC7_P19_4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P19_4)));
            modulo7.setC7_P19_5(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P19_5)));
            modulo7.setC7_P19_6(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P19_6)));
            modulo7.setC7_P19_7(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P19_7)));
            modulo7.setC7_P19_8(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P19_8)));
            modulo7.setC7_P19_9(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P19_9)));
            modulo7.setC7_P19_10(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P19_10)));
            modulo7.setC7_P19_10_0(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P19_10_0)));
            modulo7.setC7_P20(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P20)));
            modulo7.setC7_P21(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P21)));
            modulo7.setC7_P22_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P22_1)));
            modulo7.setC7_P22_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P22_2)));
            modulo7.setC7_P22_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P22_3)));
            modulo7.setC7_P22_4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P22_4)));
            modulo7.setC7_P22_5(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P22_5)));
            modulo7.setC7_P22_6(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P22_6)));
            modulo7.setC7_P22_7(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P22_7)));
            modulo7.setC7_P22_8(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P22_8)));
            modulo7.setC7_P22_9(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P22_9)));
            modulo7.setC7_P22_10(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P22_10)));
            modulo7.setC7_P22_11(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P22_11)));
            modulo7.setC7_P22_12(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P22_12)));
            modulo7.setC7_P22_13(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P22_13)));
            modulo7.setC7_P22_14(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P22_14)));
            modulo7.setC7_P22_15(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P22_15)));
            modulo7.setC7_P22_16(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P22_16)));
            modulo7.setC7_P22_16_0(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P22_16_0)));
            modulo7.setC7_P22_17(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P22_17)));
            modulo7.setC7_P23_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P23_1)));
            modulo7.setC7_P23_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P23_2)));
            modulo7.setC7_P23_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P23_3)));
            modulo7.setC7_P23_4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P23_4)));
            modulo7.setC7_P23_5(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P23_5)));
            modulo7.setC7_P23_6(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P23_6)));
            modulo7.setC7_P23_7(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P23_7)));
            modulo7.setC7_P23_8(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P23_8)));
            modulo7.setC7_P23_9(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P23_9)));
            modulo7.setC7_P23_10(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P23_10)));
            modulo7.setC7_P23_10_0(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P23_10_0)));
            modulo7.setC7_P24(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P24)));
            modulo7.setC7_P24_1_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P24_1_1)));
            modulo7.setC7_P24_1_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P24_1_2)));
            modulo7.setC7_P24_1_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P24_1_3)));
            modulo7.setC7_P24_2_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P24_2_1)));
            modulo7.setC7_P24_2_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P24_2_2)));
            modulo7.setC7_P24_2_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P24_2_3)));
            modulo7.setC7_P25_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P25_1)));
            modulo7.setC7_P25_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P25_2)));
            modulo7.setC7_P25_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P25_3)));
            modulo7.setC7_P25_4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P25_4)));
            modulo7.setC7_P25_5(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P25_5)));
            modulo7.setC7_P25_6(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P25_6)));
            modulo7.setC7_P26_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P26_1)));
            modulo7.setC7_P26_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P26_2)));
            modulo7.setC7_P26_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P26_3)));
            modulo7.setC7_P26_4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P26_4)));
            modulo7.setC7_P26_5(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P26_5)));
            modulo7.setC7_P26_6(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P26_6)));
            modulo7.setC7_P26_7(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P26_7)));
            modulo7.setC7_P26_8(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P26_8)));
            modulo7.setC7_P26_9(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P26_9)));
            modulo7.setC7_P26_10(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P26_10)));
            modulo7.setC7_P26_11(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P26_11)));
            modulo7.setC7_P26_12(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P26_12)));
            modulo7.setC7_P26_13(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P26_13)));
            modulo7.setC7_P26_14(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P26_14)));
            modulo7.setC7_P26_15(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P26_15)));
            modulo7.setC7_P26_16(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P26_16)));
            modulo7.setC7_P26_17(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P26_17)));
            modulo7.setC7_P26_18(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P26_18)));
            modulo7.setC7_P26_19(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P26_19)));
            modulo7.setC7_P26_20(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P26_20)));
            modulo7.setC7_P26_21(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P26_21)));
            modulo7.setC7_P26_21_0(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P26_21_0)));
            modulo7.setC7_P26_22(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P26_22)));
            modulo7.setC7_P27(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P27)));
            modulo7.setC7_P28_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P28_1)));
            modulo7.setC7_P28_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P28_2)));
            modulo7.setC7_P28_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P28_3)));
            modulo7.setC7_P28_4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P28_4)));
            modulo7.setC7_P28_4_0(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P28_4_0)));
            modulo7.setC7_P28_5(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P28_5)));
            modulo7.setC7_P29(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P29)));
            modulo7.setC7_P30_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P30_1)));
            modulo7.setC7_P30_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P30_2)));
            modulo7.setC7_P31_1_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P31_1_1)));
            modulo7.setC7_P31_1_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P31_1_2)));
            modulo7.setC7_P31_1_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P31_1_3)));
            modulo7.setC7_P31_1_4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P31_1_4)));
            modulo7.setC7_P31_1_5(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P31_1_5)));
            modulo7.setC7_P31_1_6(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P31_1_6)));
            modulo7.setC7_P31_1_7(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P31_1_7)));
            modulo7.setC7_P31_1_8(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P31_1_8)));
            modulo7.setC7_P31_1_9(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P31_1_9)));
            modulo7.setC7_P31_2_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P31_2_1)));
            modulo7.setC7_P31_2_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P31_2_2)));
            modulo7.setC7_P31_2_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P31_2_3)));
            modulo7.setC7_P31_2_4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P31_2_4)));
            modulo7.setC7_P31_2_5(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P31_2_5)));
            modulo7.setC7_P31_2_6(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P31_2_6)));
            modulo7.setC7_P31_2_7(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P31_2_7)));
            modulo7.setC7_P31_2_8(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P31_2_8)));
            modulo7.setC7_P31_2_9(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P31_2_9)));
            modulo7.setC7_P32_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P32_1)));
            modulo7.setC7_P32_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P32_2)));
            modulo7.setC7_P32_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P32_3)));
            modulo7.setC7_P32_4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P32_4)));
            modulo7.setC7_P33(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P33)));
            modulo7.setC7_P34(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P34)));
            modulo7.setC7_P35(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P35)));
            modulo7.setC7_P36_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P36_1)));
            modulo7.setC7_P36_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P36_2)));
            modulo7.setC7_P36_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P36_3)));
            modulo7.setC7_P36_4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P36_4)));
            modulo7.setC7_P36_5(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P36_5)));
            modulo7.setC7_P36_5_0(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P36_5_0)));
            modulo7.setC7_P37(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P37)));
            modulo7.setC7_P38_1_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P38_1_1)));
            modulo7.setC7_P38_1_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P38_1_2)));
            modulo7.setC7_P38_1_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P38_1_3)));
            modulo7.setC7_P38_1_4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P38_1_4)));
            modulo7.setC7_P38_1_5(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P38_1_5)));
            modulo7.setC7_P38_1_5_0(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P38_1_5_0)));
            modulo7.setC7_P38_2_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P38_2_1)));
            modulo7.setC7_P38_2_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P38_2_2)));
            modulo7.setC7_P38_2_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P38_2_3)));
            modulo7.setC7_P38_2_4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P38_2_4)));
            modulo7.setC7_P38_2_5(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P38_2_5)));
            modulo7.setC7_P39(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P39)));
            modulo7.setC7_P39_0(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P39_0)));
            modulo7.setC7_P40_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P40_1)));
            modulo7.setC7_P40_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P40_2)));
            modulo7.setC7_P40_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P40_3)));
            modulo7.setC7_P40_4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P40_4)));
            modulo7.setC7_P40_5(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P40_5)));
            modulo7.setC7_P41(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P41)));
            modulo7.setC7_P42(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P42)));
            modulo7.setC7_P43_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P43_1)));
            modulo7.setC7_P43_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P43_2)));
            modulo7.setC7_P44(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P44)));
            modulo7.setC7_P45(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P45)));
            modulo7.setC7_P46(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P46)));
            modulo7.setOBS_MOD_VII(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_OBS_MOD_VII)));
            modulo7.setUSU_CREACION(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_USUCREACION)));
            modulo7.setFEC_CREACION(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_FECCREACION)));
            modulo7.setUSU_REGISTRO(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_USUREGISTRO)));
            modulo7.setFEC_REGISTRO(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_FECREGISTRO)));
        }
        cursor.close();
        return modulo7;
    }

    public boolean existeModulo7(String idEmpresa){
        boolean encontrado = false;
        String[] whereArgs = new String[]{idEmpresa};
        Cursor cursor = sqLiteDatabase.query(SQLConstantes.tableModulo7,
                SQLConstantes.ALL_COLUMNS_MODULO7,SQLConstantes.WHERE_CLAUSE_ID_EMPRESA,whereArgs,null,null,null);
        if(cursor.getCount() == 1) encontrado = true;
        cursor.close();
        return encontrado;
    }

    public ArrayList<Modulo7> getAllModulo7(){
        ArrayList<Modulo7> modulos7 = new ArrayList<Modulo7>();
        Cursor cursor = sqLiteDatabase.query(SQLConstantes.tableModulo7,
                SQLConstantes.ALL_COLUMNS_MODULO7,null,null,null,null,null);
        while(cursor.moveToNext()){
            Modulo7 modulo7 = new Modulo7();
            modulo7.setMODULO7_ID(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_ID)));
            modulo7.setC7_P0_0(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P0_0)));
            modulo7.setC7_P0_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P0_1)));
            modulo7.setC7_P0_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P0_2)));
            modulo7.setC7_P0_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P0_3)));
            modulo7.setC7_P1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P1)));
            modulo7.setC7_P2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P2)));
            modulo7.setC7_P3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P3)));
            modulo7.setC7_P4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P4)));
            modulo7.setC7_P5(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P5)));
            modulo7.setC7_P6_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P6_1)));
            modulo7.setC7_P6_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P6_2)));
            modulo7.setC7_P7(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P7)));
            modulo7.setC7_P7_0(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P7_0)));
            modulo7.setC7_P8_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P8_1)));
            modulo7.setC7_P8_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P8_2)));
            modulo7.setC7_P8_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P8_3)));
            modulo7.setC7_P8_4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P8_4)));
            modulo7.setC7_P8_5(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P8_5)));
            modulo7.setC7_P8_6(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P8_6)));
            modulo7.setC7_P8_7(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P8_7)));
            modulo7.setC7_P8_8(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P8_8)));
            modulo7.setC7_P8_9(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P8_9)));
            modulo7.setC7_P8_10(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P8_10)));
            modulo7.setC7_P8_11(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P8_11)));
            modulo7.setC7_P8_12(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P8_12)));
            modulo7.setC7_P8_13(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P8_13)));
            modulo7.setC7_P8_14(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P8_14)));
            modulo7.setC7_P8_15(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P8_15)));
            modulo7.setC7_P8_16(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P8_16)));
            modulo7.setC7_P8_17(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P8_17)));
            modulo7.setC7_P8_18(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P8_18)));
            modulo7.setC7_P8_19(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P8_19)));
            modulo7.setC7_P8_19_0(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P8_19_0)));
            modulo7.setC7_P8_20(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P8_20)));
            modulo7.setC7_P9_1_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P9_1_1)));
            modulo7.setC7_P9_1_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P9_1_2)));
            modulo7.setC7_P9_1_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P9_1_3)));
            modulo7.setC7_P9_1_4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P9_1_4)));
            modulo7.setC7_P9_1_5(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P9_1_5)));
            modulo7.setC7_P9_1_6(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P9_1_6)));
            modulo7.setC7_P9_1_7(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P9_1_7)));
            modulo7.setC7_P9_1_8(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P9_1_8)));
            modulo7.setC7_P9_1_9(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P9_1_9)));
            modulo7.setC7_P9_1_10(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P9_1_10)));
            modulo7.setC7_P9_1_11(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P9_1_11)));
            modulo7.setC7_P9_1_12(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P9_1_12)));
            modulo7.setC7_P9_1_13(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P9_1_13)));
            modulo7.setC7_P9_1_14(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P9_1_14)));
            modulo7.setC7_P9_1_15(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P9_1_15)));
            modulo7.setC7_P9_1_16(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P9_1_16)));
            modulo7.setC7_P9_1_17(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P9_1_17)));
            modulo7.setC7_P9_1_18(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P9_1_18)));
            modulo7.setC7_P9_1_19(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P9_1_19)));
            modulo7.setC7_P8_1_19_0(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P8_1_19_0)));
            modulo7.setC7_P9_1_20(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P9_1_20)));
            modulo7.setC7_P9_2_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P9_2_1)));
            modulo7.setC7_P9_2_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P9_2_2)));
            modulo7.setC7_P9_2_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P9_2_3)));
            modulo7.setC7_P9_2_4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P9_2_4)));
            modulo7.setC7_P9_2_5(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P9_2_5)));
            modulo7.setC7_P9_2_6(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P9_2_6)));
            modulo7.setC7_P9_2_7(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P9_2_7)));
            modulo7.setC7_P9_2_8(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P9_2_8)));
            modulo7.setC7_P9_2_9(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P9_2_9)));
            modulo7.setC7_P9_2_10(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P9_2_10)));
            modulo7.setC7_P9_2_11(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P9_2_11)));
            modulo7.setC7_P9_2_12(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P9_2_12)));
            modulo7.setC7_P9_2_13(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P9_2_13)));
            modulo7.setC7_P9_2_14(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P9_2_14)));
            modulo7.setC7_P9_2_15(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P9_2_15)));
            modulo7.setC7_P9_2_16(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P9_2_16)));
            modulo7.setC7_P9_2_17(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P9_2_17)));
            modulo7.setC7_P9_2_18(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P9_2_18)));
            modulo7.setC7_P9_2_19(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P9_2_19)));
            modulo7.setC7_P10(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P10)));
            modulo7.setC7_P11(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P11)));
            modulo7.setC7_P12_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P12_1)));
            modulo7.setC7_P12_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P12_2)));
            modulo7.setC7_P12_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P12_3)));
            modulo7.setC7_P12_4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P12_4)));
            modulo7.setC7_P13_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P13_1)));
            modulo7.setC7_P13_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P13_2)));
            modulo7.setC7_P13_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P13_3)));
            modulo7.setC7_P13_4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P13_4)));
            modulo7.setC7_P14(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P14)));
            modulo7.setC7_P15(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P15)));
            modulo7.setC7_P16(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P16)));
            modulo7.setC7_P17_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P17_1)));
            modulo7.setC7_P17_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P17_2)));
            modulo7.setC7_P17_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P17_3)));
            modulo7.setC7_P17_4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P17_4)));
            modulo7.setC7_P17_5(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P17_5)));
            modulo7.setC7_P17_6(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P17_6)));
            modulo7.setC7_P17_7(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P17_7)));
            modulo7.setC7_P17_8(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P17_8)));
            modulo7.setC7_P17_9(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P17_9)));
            modulo7.setC7_P17_10(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P17_10)));
            modulo7.setC7_P17_10_0(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P17_10_0)));
            modulo7.setC7_P18_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P18_1)));
            modulo7.setC7_P18_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P18_2)));
            modulo7.setC7_P18_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P18_3)));
            modulo7.setC7_P18_4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P18_4)));
            modulo7.setC7_P18_5(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P18_5)));
            modulo7.setC7_P18_6(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P18_6)));
            modulo7.setC7_P18_7(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P18_7)));
            modulo7.setC7_P18_8(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P18_8)));
            modulo7.setC7_P18_9(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P18_9)));
            modulo7.setC7_P18_10(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P18_10)));
            modulo7.setC7_P18_10_0(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P18_10_0)));
            modulo7.setC7_P19_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P19_1)));
            modulo7.setC7_P19_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P19_2)));
            modulo7.setC7_P19_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P19_3)));
            modulo7.setC7_P19_4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P19_4)));
            modulo7.setC7_P19_5(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P19_5)));
            modulo7.setC7_P19_6(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P19_6)));
            modulo7.setC7_P19_7(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P19_7)));
            modulo7.setC7_P19_8(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P19_8)));
            modulo7.setC7_P19_9(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P19_9)));
            modulo7.setC7_P19_10(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P19_10)));
            modulo7.setC7_P19_10_0(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P19_10_0)));
            modulo7.setC7_P20(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P20)));
            modulo7.setC7_P21(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P21)));
            modulo7.setC7_P22_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P22_1)));
            modulo7.setC7_P22_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P22_2)));
            modulo7.setC7_P22_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P22_3)));
            modulo7.setC7_P22_4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P22_4)));
            modulo7.setC7_P22_5(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P22_5)));
            modulo7.setC7_P22_6(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P22_6)));
            modulo7.setC7_P22_7(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P22_7)));
            modulo7.setC7_P22_8(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P22_8)));
            modulo7.setC7_P22_9(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P22_9)));
            modulo7.setC7_P22_10(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P22_10)));
            modulo7.setC7_P22_11(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P22_11)));
            modulo7.setC7_P22_12(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P22_12)));
            modulo7.setC7_P22_13(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P22_13)));
            modulo7.setC7_P22_14(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P22_14)));
            modulo7.setC7_P22_15(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P22_15)));
            modulo7.setC7_P22_16(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P22_16)));
            modulo7.setC7_P22_16_0(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P22_16_0)));
            modulo7.setC7_P22_17(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P22_17)));
            modulo7.setC7_P23_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P23_1)));
            modulo7.setC7_P23_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P23_2)));
            modulo7.setC7_P23_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P23_3)));
            modulo7.setC7_P23_4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P23_4)));
            modulo7.setC7_P23_5(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P23_5)));
            modulo7.setC7_P23_6(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P23_6)));
            modulo7.setC7_P23_7(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P23_7)));
            modulo7.setC7_P23_8(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P23_8)));
            modulo7.setC7_P23_9(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P23_9)));
            modulo7.setC7_P23_10(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P23_10)));
            modulo7.setC7_P23_10_0(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P23_10_0)));
            modulo7.setC7_P24(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P24)));
            modulo7.setC7_P24_1_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P24_1_1)));
            modulo7.setC7_P24_1_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P24_1_2)));
            modulo7.setC7_P24_1_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P24_1_3)));
            modulo7.setC7_P24_2_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P24_2_1)));
            modulo7.setC7_P24_2_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P24_2_2)));
            modulo7.setC7_P24_2_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P24_2_3)));
            modulo7.setC7_P25_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P25_1)));
            modulo7.setC7_P25_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P25_2)));
            modulo7.setC7_P25_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P25_3)));
            modulo7.setC7_P25_4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P25_4)));
            modulo7.setC7_P25_5(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P25_5)));
            modulo7.setC7_P25_6(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P25_6)));
            modulo7.setC7_P26_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P26_1)));
            modulo7.setC7_P26_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P26_2)));
            modulo7.setC7_P26_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P26_3)));
            modulo7.setC7_P26_4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P26_4)));
            modulo7.setC7_P26_5(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P26_5)));
            modulo7.setC7_P26_6(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P26_6)));
            modulo7.setC7_P26_7(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P26_7)));
            modulo7.setC7_P26_8(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P26_8)));
            modulo7.setC7_P26_9(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P26_9)));
            modulo7.setC7_P26_10(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P26_10)));
            modulo7.setC7_P26_11(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P26_11)));
            modulo7.setC7_P26_12(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P26_12)));
            modulo7.setC7_P26_13(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P26_13)));
            modulo7.setC7_P26_14(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P26_14)));
            modulo7.setC7_P26_15(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P26_15)));
            modulo7.setC7_P26_16(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P26_16)));
            modulo7.setC7_P26_17(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P26_17)));
            modulo7.setC7_P26_18(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P26_18)));
            modulo7.setC7_P26_19(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P26_19)));
            modulo7.setC7_P26_20(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P26_20)));
            modulo7.setC7_P26_21(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P26_21)));
            modulo7.setC7_P26_21_0(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P26_21_0)));
            modulo7.setC7_P26_22(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P26_22)));
            modulo7.setC7_P27(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P27)));
            modulo7.setC7_P28_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P28_1)));
            modulo7.setC7_P28_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P28_2)));
            modulo7.setC7_P28_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P28_3)));
            modulo7.setC7_P28_4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P28_4)));
            modulo7.setC7_P28_4_0(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P28_4_0)));
            modulo7.setC7_P28_5(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P28_5)));
            modulo7.setC7_P29(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P29)));
            modulo7.setC7_P30_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P30_1)));
            modulo7.setC7_P30_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P30_2)));
            modulo7.setC7_P31_1_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P31_1_1)));
            modulo7.setC7_P31_1_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P31_1_2)));
            modulo7.setC7_P31_1_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P31_1_3)));
            modulo7.setC7_P31_1_4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P31_1_4)));
            modulo7.setC7_P31_1_5(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P31_1_5)));
            modulo7.setC7_P31_1_6(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P31_1_6)));
            modulo7.setC7_P31_1_7(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P31_1_7)));
            modulo7.setC7_P31_1_8(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P31_1_8)));
            modulo7.setC7_P31_1_9(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P31_1_9)));
            modulo7.setC7_P31_2_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P31_2_1)));
            modulo7.setC7_P31_2_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P31_2_2)));
            modulo7.setC7_P31_2_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P31_2_3)));
            modulo7.setC7_P31_2_4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P31_2_4)));
            modulo7.setC7_P31_2_5(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P31_2_5)));
            modulo7.setC7_P31_2_6(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P31_2_6)));
            modulo7.setC7_P31_2_7(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P31_2_7)));
            modulo7.setC7_P31_2_8(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P31_2_8)));
            modulo7.setC7_P31_2_9(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P31_2_9)));
            modulo7.setC7_P32_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P32_1)));
            modulo7.setC7_P32_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P32_2)));
            modulo7.setC7_P32_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P32_3)));
            modulo7.setC7_P32_4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P32_4)));
            modulo7.setC7_P33(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P33)));
            modulo7.setC7_P34(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P34)));
            modulo7.setC7_P35(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P35)));
            modulo7.setC7_P36_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P36_1)));
            modulo7.setC7_P36_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P36_2)));
            modulo7.setC7_P36_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P36_3)));
            modulo7.setC7_P36_4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P36_4)));
            modulo7.setC7_P36_5(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P36_5)));
            modulo7.setC7_P36_5_0(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P36_5_0)));
            modulo7.setC7_P37(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P37)));
            modulo7.setC7_P38_1_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P38_1_1)));
            modulo7.setC7_P38_1_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P38_1_2)));
            modulo7.setC7_P38_1_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P38_1_3)));
            modulo7.setC7_P38_1_4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P38_1_4)));
            modulo7.setC7_P38_1_5(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P38_1_5)));
            modulo7.setC7_P38_1_5_0(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P38_1_5_0)));
            modulo7.setC7_P38_2_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P38_2_1)));
            modulo7.setC7_P38_2_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P38_2_2)));
            modulo7.setC7_P38_2_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P38_2_3)));
            modulo7.setC7_P38_2_4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P38_2_4)));
            modulo7.setC7_P38_2_5(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P38_2_5)));
            modulo7.setC7_P39(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P39)));
            modulo7.setC7_P39_0(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P39_0)));
            modulo7.setC7_P40_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P40_1)));
            modulo7.setC7_P40_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P40_2)));
            modulo7.setC7_P40_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P40_3)));
            modulo7.setC7_P40_4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P40_4)));
            modulo7.setC7_P40_5(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P40_5)));
            modulo7.setC7_P41(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P41)));
            modulo7.setC7_P42(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P42)));
            modulo7.setC7_P43_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P43_1)));
            modulo7.setC7_P43_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P43_2)));
            modulo7.setC7_P44(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P44)));
            modulo7.setC7_P45(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P45)));
            modulo7.setC7_P46(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_P46)));
            modulo7.setOBS_MOD_VII(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_OBS_MOD_VII)));
            modulo7.setUSU_CREACION(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_USUCREACION)));
            modulo7.setFEC_CREACION(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_FECCREACION)));
            modulo7.setUSU_REGISTRO(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_USUREGISTRO)));
            modulo7.setFEC_REGISTRO(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO7_FECREGISTRO)));
            modulos7.add(modulo7);
        }
        cursor.close();
        return modulos7;
    }


    public void insertarModulo7(Modulo7 modulo7){
        ContentValues contentValues = modulo7.toValues();
        sqLiteDatabase.insert(SQLConstantes.tableModulo7,null,contentValues);
    }

    public void insertarModulos7(ArrayList<Modulo7> modulos7){
        long items = getNumeroItemsModulo7();
        if(items == 0){
            for (Modulo7 modulo7 : modulos7) {
                try {
                    insertarModulo7(modulo7);
                }catch (SQLiteException e){
                    e.printStackTrace();
                }
            }
        }
    }

    public void actualizarModulo7(String idempresa, ContentValues contentValues){
        String[] whereArgs = new String[]{idempresa};
        sqLiteDatabase.update(SQLConstantes.tableModulo7,contentValues,SQLConstantes.WHERE_CLAUSE_ID_EMPRESA,whereArgs);
    }
    public void deleteModulo7(String idEmpresa){
        String[] whereArgs = new String[]{idEmpresa};
        sqLiteDatabase.delete(SQLConstantes.tableModulo7,SQLConstantes.WHERE_CLAUSE_ID_EMPRESA,whereArgs);
    }
//-------------------------------------------------- FIN MODULO 7 -----------------------------------------------------------------


    //------------------------------------------------MODULO 8------------------------------------------------------------------------
    public Modulo8 getModulo8(String idEmpresa){
        Modulo8 modulo8 = new Modulo8();
        String[] whereArgs = new String[]{idEmpresa};
        Cursor cursor = null;
        try{
            cursor = sqLiteDatabase.query(SQLConstantes.tableModulo8,
                    SQLConstantes.ALL_COLUMNS_MODULO8,SQLConstantes.WHERE_CLAUSE_ID_EMPRESA,whereArgs,null,null,null);
            if(cursor.getCount() == 1){
                cursor.moveToFirst();
                modulo8.setMODULO8_ID(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_ID)));
                modulo8.setC8_P0_0(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P0_0)));
                modulo8.setC8_P0_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P0_1)));
                modulo8.setC8_P0_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P0_2)));
                modulo8.setC8_P0_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P0_3)));
                modulo8.setC8_P1_1_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P1_1_1)));
                modulo8.setC8_P1_2_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P1_2_1)));
                modulo8.setC8_P2_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P2_1)));
                modulo8.setC8_P3_1_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P3_1_1)));
                modulo8.setC8_P3_2_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P3_2_1)));
                modulo8.setC8_P3_3_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P3_3_1)));
                modulo8.setC8_P3_4_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P3_4_1)));
                modulo8.setC8_P3_5_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P3_5_1)));
                modulo8.setC8_P3_6_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P3_6_1)));
                modulo8.setC8_P3_6_1_0(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P3_6_1_0)));
                modulo8.setC8_P4_1_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P4_1_1)));
                modulo8.setC8_P4_2_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P4_2_1)));
                modulo8.setC8_P4_3_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P4_3_1)));
                modulo8.setC8_P4_4_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P4_4_1)));
                modulo8.setC8_P4_5_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P4_5_1)));
                modulo8.setC8_P4_6_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P4_6_1)));
                modulo8.setC8_P4_6_1_0(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P4_6_1_0)));
                modulo8.setC8_P5_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P5_1)));
                modulo8.setC8_P6_1_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P6_1_1)));
                modulo8.setC8_P6_2_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P6_2_1)));
                modulo8.setC8_P6_3_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P6_3_1)));
                modulo8.setC8_P6_4_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P6_4_1)));
                modulo8.setC8_P6_5_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P6_5_1)));
                modulo8.setC8_P6_6_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P6_6_1)));
                modulo8.setC8_P7_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P7_1)));
                modulo8.setC8_P8_1_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P8_1_1)));
                modulo8.setC8_P8_2_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P8_2_1)));
                modulo8.setC8_P8_3_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P8_3_1)));
                modulo8.setC8_P8_4_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P8_4_1)));
                modulo8.setC8_P9_1_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P9_1_1)));
                modulo8.setC8_P9_2_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P9_2_1)));
                modulo8.setC8_P9_3_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P9_3_1)));
                modulo8.setC8_P9_4_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P9_4_1)));
                modulo8.setC8_P10_1_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P10_1_1)));
                modulo8.setC8_P10_2_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P10_2_1)));
                modulo8.setC8_P10_3_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P10_3_1)));
                modulo8.setC8_P10_4_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P10_4_1)));
                modulo8.setC8_P10_5_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P10_5_1)));
                modulo8.setC8_P10_6_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P10_6_1)));
                modulo8.setC8_P1_1_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P1_1_2)));
                modulo8.setC8_P1_2_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P1_2_2)));
                modulo8.setC8_P2_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P2_2)));
                modulo8.setC8_P3_1_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P3_1_2)));
                modulo8.setC8_P3_2_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P3_2_2)));
                modulo8.setC8_P3_3_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P3_3_2)));
                modulo8.setC8_P3_4_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P3_4_2)));
                modulo8.setC8_P3_5_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P3_5_2)));
                modulo8.setC8_P3_6_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P3_6_2)));
                modulo8.setC8_P3_6_2_0(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P3_6_2_0)));
                modulo8.setC8_P4_1_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P4_1_2)));
                modulo8.setC8_P4_2_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P4_2_2)));
                modulo8.setC8_P4_3_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P4_3_2)));
                modulo8.setC8_P4_4_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P4_4_2)));
                modulo8.setC8_P4_5_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P4_5_2)));
                modulo8.setC8_P4_6_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P4_6_2)));
                modulo8.setC8_P4_6_2_0(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P4_6_2_0)));
                modulo8.setC8_P5_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P5_2)));
                modulo8.setC8_P6_1_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P6_1_2)));
                modulo8.setC8_P6_2_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P6_2_2)));
                modulo8.setC8_P6_3_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P6_3_2)));
                modulo8.setC8_P6_4_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P6_4_2)));
                modulo8.setC8_P6_5_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P6_5_2)));
                modulo8.setC8_P6_6_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P6_6_2)));
                modulo8.setC8_P7_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P7_2)));
                modulo8.setC8_P8_1_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P8_1_2)));
                modulo8.setC8_P8_2_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P8_2_2)));
                modulo8.setC8_P8_3_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P8_3_2)));
                modulo8.setC8_P8_4_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P8_4_2)));
                modulo8.setC8_P9_1_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P9_1_2)));
                modulo8.setC8_P9_2_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P9_2_2)));
                modulo8.setC8_P9_3_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P9_3_2)));
                modulo8.setC8_P9_4_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P9_4_2)));
                modulo8.setC8_P10_1_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P10_1_2)));
                modulo8.setC8_P10_2_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P10_2_2)));
                modulo8.setC8_P10_3_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P10_3_2)));
                modulo8.setC8_P10_4_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P10_4_2)));
                modulo8.setC8_P10_5_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P10_5_2)));
                modulo8.setC8_P10_6_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P10_6_2)));
                modulo8.setC8_P1_1_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P1_1_3)));
                modulo8.setC8_P1_2_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P1_2_3)));
                modulo8.setC8_P2_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P2_3)));
                modulo8.setC8_P3_1_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P3_1_3)));
                modulo8.setC8_P3_2_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P3_2_3)));
                modulo8.setC8_P3_3_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P3_3_3)));
                modulo8.setC8_P3_4_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P3_4_3)));
                modulo8.setC8_P3_5_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P3_5_3)));
                modulo8.setC8_P3_6_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P3_6_3)));
                modulo8.setC8_P3_6_3_0(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P3_6_3_0)));
                modulo8.setC8_P4_1_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P4_1_3)));
                modulo8.setC8_P4_2_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P4_2_3)));
                modulo8.setC8_P4_3_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P4_3_3)));
                modulo8.setC8_P4_4_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P4_4_3)));
                modulo8.setC8_P4_5_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P4_5_3)));
                modulo8.setC8_P4_6_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P4_6_3)));
                modulo8.setC8_P4_6_3_0(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P4_6_3_0)));
                modulo8.setC8_P5_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P5_3)));
                modulo8.setC8_P6_1_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P6_1_3)));
                modulo8.setC8_P6_2_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P6_2_3)));
                modulo8.setC8_P6_3_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P6_3_3)));
                modulo8.setC8_P6_4_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P6_4_3)));
                modulo8.setC8_P6_5_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P6_5_3)));
                modulo8.setC8_P6_6_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P6_6_3)));
                modulo8.setC8_P7_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P7_3)));
                modulo8.setC8_P8_1_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P8_1_3)));
                modulo8.setC8_P8_2_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P8_2_3)));
                modulo8.setC8_P8_3_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P8_3_3)));
                modulo8.setC8_P8_4_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P8_4_3)));
                modulo8.setC8_P9_1_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P9_1_3)));
                modulo8.setC8_P9_2_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P9_2_3)));
                modulo8.setC8_P9_3_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P9_3_3)));
                modulo8.setC8_P9_4_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P9_4_3)));
                modulo8.setC8_P10_1_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P10_1_3)));
                modulo8.setC8_P10_2_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P10_2_3)));
                modulo8.setC8_P10_3_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P10_3_3)));
                modulo8.setC8_P10_4_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P10_4_3)));
                modulo8.setC8_P10_5_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P10_5_3)));
                modulo8.setC8_P10_6_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P10_6_3)));
                modulo8.setC8_P1_1_4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P1_1_4)));
                modulo8.setC8_P1_2_4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P1_2_4)));
                modulo8.setC8_P2_4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P2_4)));
                modulo8.setC8_P3_1_4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P3_1_4)));
                modulo8.setC8_P3_2_4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P3_2_4)));
                modulo8.setC8_P3_3_4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P3_3_4)));
                modulo8.setC8_P3_4_4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P3_4_4)));
                modulo8.setC8_P3_5_4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P3_5_4)));
                modulo8.setC8_P3_6_4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P3_6_4)));
                modulo8.setC8_P3_6_4_0(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P3_6_4_0)));
                modulo8.setC8_P4_1_4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P4_1_4)));
                modulo8.setC8_P4_2_4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P4_2_4)));
                modulo8.setC8_P4_3_4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P4_3_4)));
                modulo8.setC8_P4_4_4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P4_4_4)));
                modulo8.setC8_P4_5_4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P4_5_4)));
                modulo8.setC8_P4_6_4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P4_6_4)));
                modulo8.setC8_P4_6_4_0(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P4_6_4_0)));
                modulo8.setC8_P5_4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P5_4)));
                modulo8.setC8_P6_1_4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P6_1_4)));
                modulo8.setC8_P6_2_4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P6_2_4)));
                modulo8.setC8_P6_3_4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P6_3_4)));
                modulo8.setC8_P6_4_4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P6_4_4)));
                modulo8.setC8_P6_5_4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P6_5_4)));
                modulo8.setC8_P6_6_4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P6_6_4)));
                modulo8.setC8_P7_4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P7_4)));
                modulo8.setC8_P8_1_4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P8_1_4)));
                modulo8.setC8_P8_2_4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P8_2_4)));
                modulo8.setC8_P8_3_4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P8_3_4)));
                modulo8.setC8_P8_4_4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P8_4_4)));
                modulo8.setC8_P9_1_4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P9_1_4)));
                modulo8.setC8_P9_2_4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P9_2_4)));
                modulo8.setC8_P9_3_4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P9_3_4)));
                modulo8.setC8_P9_4_4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P9_4_4)));
                modulo8.setC8_P10_1_4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P10_1_4)));
                modulo8.setC8_P10_2_4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P10_2_4)));
                modulo8.setC8_P10_3_4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P10_3_4)));
                modulo8.setC8_P10_4_4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P10_4_4)));
                modulo8.setC8_P10_5_4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P10_5_4)));
                modulo8.setC8_P10_6_4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P10_6_4)));
                modulo8.setC8_P1_1_5(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P1_1_5)));
                modulo8.setC8_P1_2_5(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P1_2_5)));
                modulo8.setC8_P2_5(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P2_5)));
                modulo8.setC8_P3_1_5(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P3_1_5)));
                modulo8.setC8_P3_2_5(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P3_2_5)));
                modulo8.setC8_P3_3_5(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P3_3_5)));
                modulo8.setC8_P3_4_5(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P3_4_5)));
                modulo8.setC8_P3_5_5(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P3_5_5)));
                modulo8.setC8_P3_6_5(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P3_6_5)));
                modulo8.setC8_P3_6_5_0(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P3_6_5_0)));
                modulo8.setC8_P4_1_5(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P4_1_5)));
                modulo8.setC8_P4_2_5(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P4_2_5)));
                modulo8.setC8_P4_3_5(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P4_3_5)));
                modulo8.setC8_P4_4_5(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P4_4_5)));
                modulo8.setC8_P4_5_5(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P4_5_5)));
                modulo8.setC8_P4_6_5(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P4_6_5)));
                modulo8.setC8_P4_6_5_0(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P4_6_5_0)));
                modulo8.setC8_P5_5(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P5_5)));
                modulo8.setC8_P6_1_5(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P6_1_5)));
                modulo8.setC8_P6_2_5(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P6_2_5)));
                modulo8.setC8_P6_3_5(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P6_3_5)));
                modulo8.setC8_P6_4_5(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P6_4_5)));
                modulo8.setC8_P6_5_5(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P6_5_5)));
                modulo8.setC8_P6_6_5(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P6_6_5)));
                modulo8.setC8_P7_5(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P7_5)));
                modulo8.setC8_P8_1_5(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P8_1_5)));
                modulo8.setC8_P8_2_5(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P8_2_5)));
                modulo8.setC8_P8_3_5(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P8_3_5)));
                modulo8.setC8_P8_4_5(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P8_4_5)));
                modulo8.setC8_P9_1_5(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P9_1_5)));
                modulo8.setC8_P9_2_5(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P9_2_5)));
                modulo8.setC8_P9_3_5(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P9_3_5)));
                modulo8.setC8_P9_4_5(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P9_4_5)));
                modulo8.setC8_P10_1_5(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P10_1_5)));
                modulo8.setC8_P10_2_5(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P10_2_5)));
                modulo8.setC8_P10_3_5(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P10_3_5)));
                modulo8.setC8_P10_4_5(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P10_4_5)));
                modulo8.setC8_P10_5_5(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P10_5_5)));
                modulo8.setC8_P10_6_5(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P10_6_5)));
                modulo8.setC8_P1_1_6(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P1_1_6)));
                modulo8.setC8_P1_2_6(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P1_2_6)));
                modulo8.setC8_P2_6(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P2_6)));
                modulo8.setC8_P3_1_6(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P3_1_6)));
                modulo8.setC8_P3_2_6(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P3_2_6)));
                modulo8.setC8_P3_3_6(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P3_3_6)));
                modulo8.setC8_P3_4_6(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P3_4_6)));
                modulo8.setC8_P3_5_6(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P3_5_6)));
                modulo8.setC8_P3_6_6(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P3_6_6)));
                modulo8.setC8_P3_6_6_0(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P3_6_6_0)));
                modulo8.setC8_P4_1_6(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P4_1_6)));
                modulo8.setC8_P4_2_6(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P4_2_6)));
                modulo8.setC8_P4_3_6(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P4_3_6)));
                modulo8.setC8_P4_4_6(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P4_4_6)));
                modulo8.setC8_P4_5_6(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P4_5_6)));
                modulo8.setC8_P4_6_6(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P4_6_6)));
                modulo8.setC8_P4_6_6_0(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P4_6_6_0)));
                modulo8.setC8_P5_6(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P5_6)));
                modulo8.setC8_P6_1_6(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P6_1_6)));
                modulo8.setC8_P6_2_6(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P6_2_6)));
                modulo8.setC8_P6_3_6(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P6_3_6)));
                modulo8.setC8_P6_4_6(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P6_4_6)));
                modulo8.setC8_P6_5_6(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P6_5_6)));
                modulo8.setC8_P6_6_6(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P6_6_6)));
                modulo8.setC8_P7_6(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P7_6)));
                modulo8.setC8_P8_1_6(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P8_1_6)));
                modulo8.setC8_P8_2_6(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P8_2_6)));
                modulo8.setC8_P8_3_6(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P8_3_6)));
                modulo8.setC8_P8_4_6(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P8_4_6)));
                modulo8.setC8_P9_1_6(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P9_1_6)));
                modulo8.setC8_P9_2_6(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P9_2_6)));
                modulo8.setC8_P9_3_6(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P9_3_6)));
                modulo8.setC8_P9_4_6(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P9_4_6)));
                modulo8.setC8_P10_1_6(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P10_1_6)));
                modulo8.setC8_P10_2_6(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P10_2_6)));
                modulo8.setC8_P10_3_6(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P10_3_6)));
                modulo8.setC8_P10_4_6(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P10_4_6)));
                modulo8.setC8_P10_5_6(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P10_5_6)));
                modulo8.setC8_P10_6_6(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P10_6_6)));
                modulo8.setOBS_MOD_VIII(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_OBS_MOD_VIII)));
                modulo8.setUSU_CREACION(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_USUCREACION)));
                modulo8.setFEC_CREACION(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_FECCREACION)));
                modulo8.setUSU_REGISTRO(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_USUREGISTRO)));
                modulo8.setFEC_REGISTRO(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_FECREGISTRO)));
            }
        }finally {
            if(cursor!=null)cursor.close();
        }
        return modulo8;
    }
    public boolean existeModulo8(String idEmpresa){
        boolean encontrado = false;
        String[] whereArgs = new String[]{idEmpresa};
        Cursor cursor  = null;
        try{
            cursor = sqLiteDatabase.query(SQLConstantes.tableModulo8,
                    SQLConstantes.ALL_COLUMNS_MODULO8,SQLConstantes.WHERE_CLAUSE_ID_EMPRESA,whereArgs,null,null,null);
            if(cursor.getCount() == 1) encontrado = true;
        }finally {
            if(cursor != null) cursor.close();
        }
        return encontrado;
    }
    public ArrayList<Modulo8> getAllModulo8(){
        ArrayList<Modulo8> modulos8 = new ArrayList<Modulo8>();
        Cursor cursor = sqLiteDatabase.query(SQLConstantes.tableModulo8,
                SQLConstantes.ALL_COLUMNS_MODULO8,null,null,null,null,null);
        while(cursor.moveToNext()){
            Modulo8 modulo8 = new Modulo8();
            modulo8.setMODULO8_ID(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_ID)));
            modulo8.setC8_P0_0(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P0_0)));
            modulo8.setC8_P0_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P0_1)));
            modulo8.setC8_P0_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P0_2)));
            modulo8.setC8_P0_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P0_3)));
            modulo8.setC8_P1_1_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P1_1_1)));
            modulo8.setC8_P1_2_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P1_2_1)));
            modulo8.setC8_P2_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P2_1)));
            modulo8.setC8_P3_1_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P3_1_1)));
            modulo8.setC8_P3_2_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P3_2_1)));
            modulo8.setC8_P3_3_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P3_3_1)));
            modulo8.setC8_P3_4_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P3_4_1)));
            modulo8.setC8_P3_5_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P3_5_1)));
            modulo8.setC8_P3_6_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P3_6_1)));
            modulo8.setC8_P3_6_1_0(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P3_6_1_0)));
            modulo8.setC8_P4_1_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P4_1_1)));
            modulo8.setC8_P4_2_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P4_2_1)));
            modulo8.setC8_P4_3_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P4_3_1)));
            modulo8.setC8_P4_4_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P4_4_1)));
            modulo8.setC8_P4_5_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P4_5_1)));
            modulo8.setC8_P4_6_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P4_6_1)));
            modulo8.setC8_P4_6_1_0(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P4_6_1_0)));
            modulo8.setC8_P5_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P5_1)));
            modulo8.setC8_P6_1_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P6_1_1)));
            modulo8.setC8_P6_2_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P6_2_1)));
            modulo8.setC8_P6_3_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P6_3_1)));
            modulo8.setC8_P6_4_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P6_4_1)));
            modulo8.setC8_P6_5_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P6_5_1)));
            modulo8.setC8_P6_6_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P6_6_1)));
            modulo8.setC8_P7_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P7_1)));
            modulo8.setC8_P8_1_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P8_1_1)));
            modulo8.setC8_P8_2_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P8_2_1)));
            modulo8.setC8_P8_3_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P8_3_1)));
            modulo8.setC8_P8_4_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P8_4_1)));
            modulo8.setC8_P9_1_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P9_1_1)));
            modulo8.setC8_P9_2_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P9_2_1)));
            modulo8.setC8_P9_3_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P9_3_1)));
            modulo8.setC8_P9_4_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P9_4_1)));
            modulo8.setC8_P10_1_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P10_1_1)));
            modulo8.setC8_P10_2_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P10_2_1)));
            modulo8.setC8_P10_3_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P10_3_1)));
            modulo8.setC8_P10_4_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P10_4_1)));
            modulo8.setC8_P10_5_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P10_5_1)));
            modulo8.setC8_P10_6_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P10_6_1)));
            modulo8.setC8_P1_1_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P1_1_2)));
            modulo8.setC8_P1_2_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P1_2_2)));
            modulo8.setC8_P2_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P2_2)));
            modulo8.setC8_P3_1_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P3_1_2)));
            modulo8.setC8_P3_2_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P3_2_2)));
            modulo8.setC8_P3_3_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P3_3_2)));
            modulo8.setC8_P3_4_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P3_4_2)));
            modulo8.setC8_P3_5_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P3_5_2)));
            modulo8.setC8_P3_6_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P3_6_2)));
            modulo8.setC8_P3_6_2_0(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P3_6_2_0)));
            modulo8.setC8_P4_1_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P4_1_2)));
            modulo8.setC8_P4_2_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P4_2_2)));
            modulo8.setC8_P4_3_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P4_3_2)));
            modulo8.setC8_P4_4_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P4_4_2)));
            modulo8.setC8_P4_5_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P4_5_2)));
            modulo8.setC8_P4_6_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P4_6_2)));
            modulo8.setC8_P4_6_2_0(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P4_6_2_0)));
            modulo8.setC8_P5_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P5_2)));
            modulo8.setC8_P6_1_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P6_1_2)));
            modulo8.setC8_P6_2_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P6_2_2)));
            modulo8.setC8_P6_3_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P6_3_2)));
            modulo8.setC8_P6_4_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P6_4_2)));
            modulo8.setC8_P6_5_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P6_5_2)));
            modulo8.setC8_P6_6_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P6_6_2)));
            modulo8.setC8_P7_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P7_2)));
            modulo8.setC8_P8_1_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P8_1_2)));
            modulo8.setC8_P8_2_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P8_2_2)));
            modulo8.setC8_P8_3_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P8_3_2)));
            modulo8.setC8_P8_4_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P8_4_2)));
            modulo8.setC8_P9_1_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P9_1_2)));
            modulo8.setC8_P9_2_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P9_2_2)));
            modulo8.setC8_P9_3_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P9_3_2)));
            modulo8.setC8_P9_4_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P9_4_2)));
            modulo8.setC8_P10_1_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P10_1_2)));
            modulo8.setC8_P10_2_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P10_2_2)));
            modulo8.setC8_P10_3_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P10_3_2)));
            modulo8.setC8_P10_4_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P10_4_2)));
            modulo8.setC8_P10_5_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P10_5_2)));
            modulo8.setC8_P10_6_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P10_6_2)));
            modulo8.setC8_P1_1_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P1_1_3)));
            modulo8.setC8_P1_2_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P1_2_3)));
            modulo8.setC8_P2_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P2_3)));
            modulo8.setC8_P3_1_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P3_1_3)));
            modulo8.setC8_P3_2_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P3_2_3)));
            modulo8.setC8_P3_3_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P3_3_3)));
            modulo8.setC8_P3_4_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P3_4_3)));
            modulo8.setC8_P3_5_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P3_5_3)));
            modulo8.setC8_P3_6_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P3_6_3)));
            modulo8.setC8_P3_6_3_0(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P3_6_3_0)));
            modulo8.setC8_P4_1_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P4_1_3)));
            modulo8.setC8_P4_2_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P4_2_3)));
            modulo8.setC8_P4_3_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P4_3_3)));
            modulo8.setC8_P4_4_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P4_4_3)));
            modulo8.setC8_P4_5_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P4_5_3)));
            modulo8.setC8_P4_6_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P4_6_3)));
            modulo8.setC8_P4_6_3_0(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P4_6_3_0)));
            modulo8.setC8_P5_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P5_3)));
            modulo8.setC8_P6_1_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P6_1_3)));
            modulo8.setC8_P6_2_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P6_2_3)));
            modulo8.setC8_P6_3_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P6_3_3)));
            modulo8.setC8_P6_4_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P6_4_3)));
            modulo8.setC8_P6_5_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P6_5_3)));
            modulo8.setC8_P6_6_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P6_6_3)));
            modulo8.setC8_P7_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P7_3)));
            modulo8.setC8_P8_1_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P8_1_3)));
            modulo8.setC8_P8_2_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P8_2_3)));
            modulo8.setC8_P8_3_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P8_3_3)));
            modulo8.setC8_P8_4_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P8_4_3)));
            modulo8.setC8_P9_1_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P9_1_3)));
            modulo8.setC8_P9_2_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P9_2_3)));
            modulo8.setC8_P9_3_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P9_3_3)));
            modulo8.setC8_P9_4_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P9_4_3)));
            modulo8.setC8_P10_1_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P10_1_3)));
            modulo8.setC8_P10_2_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P10_2_3)));
            modulo8.setC8_P10_3_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P10_3_3)));
            modulo8.setC8_P10_4_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P10_4_3)));
            modulo8.setC8_P10_5_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P10_5_3)));
            modulo8.setC8_P10_6_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P10_6_3)));
            modulo8.setC8_P1_1_4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P1_1_4)));
            modulo8.setC8_P1_2_4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P1_2_4)));
            modulo8.setC8_P2_4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P2_4)));
            modulo8.setC8_P3_1_4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P3_1_4)));
            modulo8.setC8_P3_2_4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P3_2_4)));
            modulo8.setC8_P3_3_4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P3_3_4)));
            modulo8.setC8_P3_4_4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P3_4_4)));
            modulo8.setC8_P3_5_4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P3_5_4)));
            modulo8.setC8_P3_6_4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P3_6_4)));
            modulo8.setC8_P3_6_4_0(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P3_6_4_0)));
            modulo8.setC8_P4_1_4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P4_1_4)));
            modulo8.setC8_P4_2_4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P4_2_4)));
            modulo8.setC8_P4_3_4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P4_3_4)));
            modulo8.setC8_P4_4_4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P4_4_4)));
            modulo8.setC8_P4_5_4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P4_5_4)));
            modulo8.setC8_P4_6_4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P4_6_4)));
            modulo8.setC8_P4_6_4_0(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P4_6_4_0)));
            modulo8.setC8_P5_4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P5_4)));
            modulo8.setC8_P6_1_4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P6_1_4)));
            modulo8.setC8_P6_2_4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P6_2_4)));
            modulo8.setC8_P6_3_4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P6_3_4)));
            modulo8.setC8_P6_4_4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P6_4_4)));
            modulo8.setC8_P6_5_4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P6_5_4)));
            modulo8.setC8_P6_6_4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P6_6_4)));
            modulo8.setC8_P7_4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P7_4)));
            modulo8.setC8_P8_1_4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P8_1_4)));
            modulo8.setC8_P8_2_4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P8_2_4)));
            modulo8.setC8_P8_3_4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P8_3_4)));
            modulo8.setC8_P8_4_4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P8_4_4)));
            modulo8.setC8_P9_1_4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P9_1_4)));
            modulo8.setC8_P9_2_4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P9_2_4)));
            modulo8.setC8_P9_3_4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P9_3_4)));
            modulo8.setC8_P9_4_4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P9_4_4)));
            modulo8.setC8_P10_1_4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P10_1_4)));
            modulo8.setC8_P10_2_4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P10_2_4)));
            modulo8.setC8_P10_3_4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P10_3_4)));
            modulo8.setC8_P10_4_4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P10_4_4)));
            modulo8.setC8_P10_5_4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P10_5_4)));
            modulo8.setC8_P10_6_4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P10_6_4)));
            modulo8.setC8_P1_1_5(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P1_1_5)));
            modulo8.setC8_P1_2_5(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P1_2_5)));
            modulo8.setC8_P2_5(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P2_5)));
            modulo8.setC8_P3_1_5(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P3_1_5)));
            modulo8.setC8_P3_2_5(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P3_2_5)));
            modulo8.setC8_P3_3_5(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P3_3_5)));
            modulo8.setC8_P3_4_5(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P3_4_5)));
            modulo8.setC8_P3_5_5(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P3_5_5)));
            modulo8.setC8_P3_6_5(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P3_6_5)));
            modulo8.setC8_P3_6_5_0(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P3_6_5_0)));
            modulo8.setC8_P4_1_5(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P4_1_5)));
            modulo8.setC8_P4_2_5(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P4_2_5)));
            modulo8.setC8_P4_3_5(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P4_3_5)));
            modulo8.setC8_P4_4_5(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P4_4_5)));
            modulo8.setC8_P4_5_5(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P4_5_5)));
            modulo8.setC8_P4_6_5(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P4_6_5)));
            modulo8.setC8_P4_6_5_0(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P4_6_5_0)));
            modulo8.setC8_P5_5(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P5_5)));
            modulo8.setC8_P6_1_5(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P6_1_5)));
            modulo8.setC8_P6_2_5(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P6_2_5)));
            modulo8.setC8_P6_3_5(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P6_3_5)));
            modulo8.setC8_P6_4_5(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P6_4_5)));
            modulo8.setC8_P6_5_5(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P6_5_5)));
            modulo8.setC8_P6_6_5(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P6_6_5)));
            modulo8.setC8_P7_5(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P7_5)));
            modulo8.setC8_P8_1_5(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P8_1_5)));
            modulo8.setC8_P8_2_5(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P8_2_5)));
            modulo8.setC8_P8_3_5(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P8_3_5)));
            modulo8.setC8_P8_4_5(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P8_4_5)));
            modulo8.setC8_P9_1_5(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P9_1_5)));
            modulo8.setC8_P9_2_5(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P9_2_5)));
            modulo8.setC8_P9_3_5(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P9_3_5)));
            modulo8.setC8_P9_4_5(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P9_4_5)));
            modulo8.setC8_P10_1_5(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P10_1_5)));
            modulo8.setC8_P10_2_5(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P10_2_5)));
            modulo8.setC8_P10_3_5(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P10_3_5)));
            modulo8.setC8_P10_4_5(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P10_4_5)));
            modulo8.setC8_P10_5_5(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P10_5_5)));
            modulo8.setC8_P10_6_5(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P10_6_5)));
            modulo8.setC8_P1_1_6(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P1_1_6)));
            modulo8.setC8_P1_2_6(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P1_2_6)));
            modulo8.setC8_P2_6(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P2_6)));
            modulo8.setC8_P3_1_6(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P3_1_6)));
            modulo8.setC8_P3_2_6(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P3_2_6)));
            modulo8.setC8_P3_3_6(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P3_3_6)));
            modulo8.setC8_P3_4_6(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P3_4_6)));
            modulo8.setC8_P3_5_6(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P3_5_6)));
            modulo8.setC8_P3_6_6(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P3_6_6)));
            modulo8.setC8_P3_6_6_0(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P3_6_6_0)));
            modulo8.setC8_P4_1_6(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P4_1_6)));
            modulo8.setC8_P4_2_6(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P4_2_6)));
            modulo8.setC8_P4_3_6(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P4_3_6)));
            modulo8.setC8_P4_4_6(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P4_4_6)));
            modulo8.setC8_P4_5_6(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P4_5_6)));
            modulo8.setC8_P4_6_6(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P4_6_6)));
            modulo8.setC8_P4_6_6_0(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P4_6_6_0)));
            modulo8.setC8_P5_6(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P5_6)));
            modulo8.setC8_P6_1_6(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P6_1_6)));
            modulo8.setC8_P6_2_6(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P6_2_6)));
            modulo8.setC8_P6_3_6(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P6_3_6)));
            modulo8.setC8_P6_4_6(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P6_4_6)));
            modulo8.setC8_P6_5_6(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P6_5_6)));
            modulo8.setC8_P6_6_6(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P6_6_6)));
            modulo8.setC8_P7_6(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P7_6)));
            modulo8.setC8_P8_1_6(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P8_1_6)));
            modulo8.setC8_P8_2_6(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P8_2_6)));
            modulo8.setC8_P8_3_6(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P8_3_6)));
            modulo8.setC8_P8_4_6(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P8_4_6)));
            modulo8.setC8_P9_1_6(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P9_1_6)));
            modulo8.setC8_P9_2_6(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P9_2_6)));
            modulo8.setC8_P9_3_6(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P9_3_6)));
            modulo8.setC8_P9_4_6(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P9_4_6)));
            modulo8.setC8_P10_1_6(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P10_1_6)));
            modulo8.setC8_P10_2_6(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P10_2_6)));
            modulo8.setC8_P10_3_6(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P10_3_6)));
            modulo8.setC8_P10_4_6(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P10_4_6)));
            modulo8.setC8_P10_5_6(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P10_5_6)));
            modulo8.setC8_P10_6_6(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_P10_6_6)));
            modulo8.setOBS_MOD_VIII(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_OBS_MOD_VIII)));
            modulo8.setUSU_CREACION(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_USUCREACION)));
            modulo8.setFEC_CREACION(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_FECCREACION)));
            modulo8.setUSU_REGISTRO(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_USUREGISTRO)));
            modulo8.setFEC_REGISTRO(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO8_FECREGISTRO)));
            modulos8.add(modulo8);
        }
        cursor.close();
        return modulos8;
    }



    public void insertarModulo8(Modulo8 modulo8){
        ContentValues contentValues = modulo8.toValues();
        sqLiteDatabase.insert(SQLConstantes.tableModulo8,null,contentValues);
    }
    public void insertarModulos8(ArrayList<Modulo8> modulos8){
        long items = getNumeroItemsModulo8();
        if(items == 0){
            for (Modulo8 modulo8 : modulos8) {
                try {
                    insertarModulo8(modulo8);
                }catch (SQLiteException e){
                    e.printStackTrace();
                }
            }
        }
    }



    public void actualizarModulo8(String idempresa, ContentValues contentValues){
        String[] whereArgs = new String[]{idempresa};
        sqLiteDatabase.update(SQLConstantes.tableModulo8,contentValues,SQLConstantes.WHERE_CLAUSE_ID_EMPRESA,whereArgs);
    }
    public void deleteModulo8(String idEmpresa){
        String[] whereArgs = new String[]{idEmpresa};
        sqLiteDatabase.delete(SQLConstantes.tableModulo8,SQLConstantes.WHERE_CLAUSE_ID_EMPRESA,whereArgs);
    }
    //----------------------------------------FIN MODULO 8------------------------------------------------------------------------


    //--------------------------------------------------MODULO9---------------------------------------------------------------------
    public Modulo9 getModulo9(String idEmpresa){
        Modulo9 modulo9 = new Modulo9();
        String[] whereArgs = new String[]{idEmpresa};
        Cursor cursor = sqLiteDatabase.query(SQLConstantes.tableModulo9,
                SQLConstantes.ALL_COLUMNS_MODULO9,SQLConstantes.WHERE_CLAUSE_ID_EMPRESA,whereArgs,null,null,null);
        if(cursor.getCount() == 1){
            cursor.moveToFirst();
            modulo9.setMODULO9_ID(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO9_ID)));
            modulo9.setC9_P0_0(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO9_P0_0)));
            modulo9.setC9_P0_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO9_P0_1)));
            modulo9.setC9_P0_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO9_P0_2)));
            modulo9.setC9_P0_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO9_P0_3)));
            modulo9.setC9_P1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO9_P1)));
            modulo9.setC9_P2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO9_P2)));
            modulo9.setOBS_MOD_IX(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO9_OBS_MOD_IX)));
            modulo9.setUSU_CREACION(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO9_USUCREACION)));
            modulo9.setFEC_CREACION(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO9_FECCREACION)));
            modulo9.setUSU_REGISTRO(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO9_USUREGISTRO)));
            modulo9.setFEC_REGISTRO(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO9_FECREGISTRO)));
        }
        cursor.close();
        return modulo9;
    }

    public boolean existeModulo9(String idEmpresa){
        boolean encontrado = false;
        String[] whereArgs = new String[]{idEmpresa};
        Cursor cursor = sqLiteDatabase.query(SQLConstantes.tableModulo9,
                SQLConstantes.ALL_COLUMNS_MODULO9,SQLConstantes.WHERE_CLAUSE_ID_EMPRESA,whereArgs,null,null,null);
        if(cursor.getCount() == 1) encontrado = true;
        cursor.close();
        return encontrado;
    }

    public ArrayList<Modulo9> getAllModulo9(){
        ArrayList<Modulo9> modulos9 = new ArrayList<Modulo9>();
        Cursor cursor = sqLiteDatabase.query(SQLConstantes.tableModulo9,
                SQLConstantes.ALL_COLUMNS_MODULO9,null,null,null,null,null);
        while(cursor.moveToNext()){
            Modulo9 modulo9 = new Modulo9();
            modulo9.setMODULO9_ID(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO9_ID)));
            modulo9.setC9_P0_0(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO9_P0_0)));
            modulo9.setC9_P0_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO9_P0_1)));
            modulo9.setC9_P0_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO9_P0_2)));
            modulo9.setC9_P0_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO9_P0_3)));
            modulo9.setC9_P1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO9_P1)));
            modulo9.setC9_P2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO9_P2)));
            modulo9.setOBS_MOD_IX(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO9_OBS_MOD_IX)));
            modulo9.setUSU_CREACION(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO9_USUCREACION)));
            modulo9.setFEC_CREACION(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO9_FECCREACION)));
            modulo9.setUSU_REGISTRO(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO9_USUREGISTRO)));
            modulo9.setFEC_REGISTRO(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO9_FECREGISTRO)));
            modulos9.add(modulo9);
        }
        cursor.close();
        return modulos9;
    }


    public void insertarModulo9(Modulo9 modulo9){
        ContentValues contentValues = modulo9.toValues();
        sqLiteDatabase.insert(SQLConstantes.tableModulo9,null,contentValues);
    }

    public void insertarModulos9(ArrayList<Modulo9> modulos9){
        long items = getNumeroItemsModulo9();
        if(items == 0){
            for (Modulo9 modulo9 : modulos9) {
                try {
                    insertarModulo9(modulo9);
                }catch (SQLiteException e){
                    e.printStackTrace();
                }
            }
        }
    }

    public void actualizarModulo9(String idempresa, ContentValues contentValues){
        String[] whereArgs = new String[]{idempresa};
        sqLiteDatabase.update(SQLConstantes.tableModulo9,contentValues,SQLConstantes.WHERE_CLAUSE_ID_EMPRESA,whereArgs);
    }
    public void deleteModulo9(String idEmpresa){
        String[] whereArgs = new String[]{idEmpresa};
        sqLiteDatabase.delete(SQLConstantes.tableModulo9,SQLConstantes.WHERE_CLAUSE_ID_EMPRESA,whereArgs);
    }
    //---------------------------------------- FIN MODULO 9 -----------------------------------------------------------------------


    //-----------------------------------------------MODULO10--------------------------------------------------------------------
    public Modulo10 getModulo10(String idEmpresa){
        Modulo10 modulo10 = new Modulo10();
        String[] whereArgs = new String[]{idEmpresa};
        Cursor cursor = sqLiteDatabase.query(SQLConstantes.tableModulo10,
                SQLConstantes.ALL_COLUMNS_MODULO10,SQLConstantes.WHERE_CLAUSE_ID_EMPRESA,whereArgs,null,null,null);
        if(cursor.getCount() == 1){
            cursor.moveToFirst();
            modulo10.setMODULO10_ID(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO10_ID)));
            modulo10.setC10_P0_0(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO10_P0_0)));
            modulo10.setC10_P0_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO10_P0_1)));
            modulo10.setC10_P0_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO10_P0_2)));
            modulo10.setC10_P0_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO10_P0_3)));
            modulo10.setC10_P1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO10_P1)));
            modulo10.setC10_P2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO10_P2)));
            modulo10.setC10_P3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO10_P3)));
            modulo10.setC10_P4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO10_P4)));
            modulo10.setOBS_MOD_X(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO10_OBS_MOD_X)));
            modulo10.setUSU_CREACION(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO10_USUCREACION)));
            modulo10.setFEC_CREACION(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO10_FECCREACION)));
            modulo10.setUSU_REGISTRO(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO10_USUREGISTRO)));
            modulo10.setFEC_REGISTRO(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO10_FECREGISTRO)));
        }
        cursor.close();
        return modulo10;
    }

    public boolean existeModulo10(String idEmpresa){
        boolean encontrado = false;
        String[] whereArgs = new String[]{idEmpresa};
        Cursor cursor = sqLiteDatabase.query(SQLConstantes.tableModulo10,
                SQLConstantes.ALL_COLUMNS_MODULO10,SQLConstantes.WHERE_CLAUSE_ID_EMPRESA,whereArgs,null,null,null);
        if(cursor.getCount() == 1) encontrado = true;
        cursor.close();
        return encontrado;
    }

    public ArrayList<Modulo10> getAllModulo10(){
        ArrayList<Modulo10> modulos10 = new ArrayList<Modulo10>();
        Cursor cursor = sqLiteDatabase.query(SQLConstantes.tableModulo10,
                SQLConstantes.ALL_COLUMNS_MODULO10,null,null,null,null,null);
        while(cursor.moveToNext()){
            Modulo10 modulo10 = new Modulo10();
            modulo10.setMODULO10_ID(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO10_ID)));
            modulo10.setC10_P0_0(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO10_P0_0)));
            modulo10.setC10_P0_1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO10_P0_1)));
            modulo10.setC10_P0_2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO10_P0_2)));
            modulo10.setC10_P0_3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO10_P0_3)));
            modulo10.setC10_P1(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO10_P1)));
            modulo10.setC10_P2(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO10_P2)));
            modulo10.setC10_P3(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO10_P3)));
            modulo10.setC10_P4(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO10_P4)));
            modulo10.setOBS_MOD_X(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO10_OBS_MOD_X)));
            modulo10.setUSU_CREACION(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO10_USUCREACION)));
            modulo10.setFEC_CREACION(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO10_FECCREACION)));
            modulo10.setUSU_REGISTRO(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO10_USUREGISTRO)));
            modulo10.setFEC_REGISTRO(cursor.getString(cursor.getColumnIndex(SQLConstantes.MODULO10_FECREGISTRO)));
            modulos10.add(modulo10);
        }
        cursor.close();
        return modulos10;
    }


    public void insertarModulo10(Modulo10 modulo10){
        ContentValues contentValues = modulo10.toValues();
        sqLiteDatabase.insert(SQLConstantes.tableModulo10,null,contentValues);
    }

    public void insertarModulos10(ArrayList<Modulo10> modulos10){
        long items = getNumeroItemsModulo10();
        if(items == 0){
            for (Modulo10 modulo10 : modulos10) {
                try {
                    insertarModulo10(modulo10);
                }catch (SQLiteException e){
                    e.printStackTrace();
                }
            }
        }
    }

    public void actualizarModulo10(String idempresa, ContentValues contentValues){
        String[] whereArgs = new String[]{idempresa};
        sqLiteDatabase.update(SQLConstantes.tableModulo10,contentValues,SQLConstantes.WHERE_CLAUSE_ID_EMPRESA,whereArgs);
    }
    public void deleteModulo10(String idEmpresa){
        String[] whereArgs = new String[]{idEmpresa};
        sqLiteDatabase.delete(SQLConstantes.tableModulo10,SQLConstantes.WHERE_CLAUSE_ID_EMPRESA,whereArgs);
    }
    //-------------------------------------------- FIN MODULO 10 ----------------------------------------------------------------------


    //------------------------------------------------- VISITAS -----------------------------------------------------------------------

    public void insertarVisita(Visita visita){
        ContentValues contentValues = visita.toValues();
        sqLiteDatabase.insert(SQLConstantes.tableVisitas,null,contentValues);
    }

    public void insertarVisitas(ArrayList<Visita> visitas){
//        long items = getNumeroItemsVisita();
//        if(items == 0){
//            for (Visita visita : visitas) {
//                try {
//                    insertarVisita(visita);
//                }catch (SQLiteException e){
//                    e.printStackTrace();
//                }
//            }
//        }
        for (Visita visita : visitas) {
            try {
                insertarVisita(visita);
            }catch (SQLiteException e){
                e.printStackTrace();
            }
        }
    }
    public boolean existeVisita(int idVisita){
        boolean encontrado = false;
        String[] whereArgs = new String[]{String.valueOf(idVisita)};
        Cursor cursor = null;
        try{
            cursor = sqLiteDatabase.query(SQLConstantes.tableVisitas,
                    SQLConstantes.ALL_COLUMNS_VISITAS,SQLConstantes.WHERE_CLAUSE_ID_VISITA,whereArgs,null,null,null);
            if(cursor.getCount() == 1) encontrado = true;
        }finally {
            if(cursor != null)cursor.close();
        }
        return encontrado;
    }

    public boolean existenVisitas(String idEmpresa){
        boolean encontrado = false;
        String[] whereArgs = new String[]{idEmpresa};
        Cursor cursor = null;
        try{
            cursor = sqLiteDatabase.query(SQLConstantes.tableVisitas, SQLConstantes.ALL_COLUMNS_VISITAS,
                    SQLConstantes.WHERE_CLAUSE_ID_EMPRESA_VISITA,whereArgs,null,null,null);
            if(cursor.getCount() > 0) encontrado = true;
        }finally {
            if(cursor != null){
                cursor.close();
            }
        }
        return encontrado;
    }

    public void actualizarVisita(int idVisita, ContentValues contentValues){
        String[] whereArgs = new String[]{String.valueOf(idVisita)};
        sqLiteDatabase.update(SQLConstantes.tableVisitas,contentValues,SQLConstantes.WHERE_CLAUSE_ID_VISITA,whereArgs);
    }
    public void deleteAllVisitas(String idEmpresa){
        String[] whereArgs = new String[]{idEmpresa};
        sqLiteDatabase.delete(SQLConstantes.tableVisitas,SQLConstantes.WHERE_CLAUSE_ID_EMPRESA_VISITA,whereArgs);
    }

    public ArrayList<Visita> getVisitas(String idEmpresa){
        ArrayList<Visita> visitas = new ArrayList<Visita>();
        String[] whereArgs = new String[]{idEmpresa};
        Cursor cursor = null;
        try{
            cursor = sqLiteDatabase.query(SQLConstantes.tableVisitas,
                    SQLConstantes.ALL_COLUMNS_VISITAS,SQLConstantes.WHERE_CLAUSE_ID_EMPRESA_VISITA,whereArgs,null,null,null);
            while(cursor.moveToNext()){
                Visita visita = new Visita();
                visita.setID(cursor.getInt(cursor.getColumnIndex(SQLConstantes.VISITA_ID)));
                visita.setID_EMPRESA(cursor.getString(cursor.getColumnIndex(SQLConstantes.VISITA_ID_EMPRESA)));
                visita.setDNI_OPERADOR_E(cursor.getString(cursor.getColumnIndex(SQLConstantes.VISITA_DNI_OPERADOR)));
                visita.setV_OPERADOR_E(cursor.getString(cursor.getColumnIndex(SQLConstantes.VISITA_NOMBRE_OPERADOR)));
                visita.setDNI_JEFE_EQUIPO(cursor.getString(cursor.getColumnIndex(SQLConstantes.VISITA_DNI_JEFE)));
                visita.setV_JEFE_EQUIPO(cursor.getString(cursor.getColumnIndex(SQLConstantes.VISITA_NOMBRE_JEFE)));
                visita.setDNI_SUPERVISOR(cursor.getString(cursor.getColumnIndex(SQLConstantes.VISITA_DNI_SUPERVISOR)));
                visita.setV_SUPERVISOR(cursor.getString(cursor.getColumnIndex(SQLConstantes.VISITA_NOMBRE_SUPERVISOR)));
                visita.setV_DIA(cursor.getString(cursor.getColumnIndex(SQLConstantes.VISITA_DIA)));
                visita.setV_MES(cursor.getString(cursor.getColumnIndex(SQLConstantes.VISITA_MES)));
                visita.setV_ANIO(cursor.getString(cursor.getColumnIndex(SQLConstantes.VISITA_ANIO)));
                visita.setV_HORA_I(cursor.getString(cursor.getColumnIndex(SQLConstantes.VISITA_HORAI)));
                visita.setV_MINUTO_I(cursor.getString(cursor.getColumnIndex(SQLConstantes.VISITA_MINUTOI)));
                visita.setV_HORA_F(cursor.getString(cursor.getColumnIndex(SQLConstantes.VISITA_HORAF)));
                visita.setV_MINUTO_F(cursor.getString(cursor.getColumnIndex(SQLConstantes.VISITA_MINUTOF)));
                visita.setR_VISITA(cursor.getString(cursor.getColumnIndex(SQLConstantes.VISITA_RESULTADO)));
                visita.setR_VISITA_ESP(cursor.getString(cursor.getColumnIndex(SQLConstantes.VISITA_RESULTADO_ESP)));
                visita.setV_PROX_FECHA_DIA(cursor.getString(cursor.getColumnIndex(SQLConstantes.VISITA_PROX_DIA)));
                visita.setV_PROX_FECHA_MES(cursor.getString(cursor.getColumnIndex(SQLConstantes.VISITA_PROX_MES)));
                visita.setV_PROX_FECHA_ANIO(cursor.getString(cursor.getColumnIndex(SQLConstantes.VISITA_PROX_ANIO)));
                visita.setV_PROX_HORA(cursor.getString(cursor.getColumnIndex(SQLConstantes.VISITA_PROX_HORA)));
                visita.setV_PROX_MIN(cursor.getString(cursor.getColumnIndex(SQLConstantes.VISITA_PROX_MINUTO)));
                visita.setN_VISITA(cursor.getString(cursor.getColumnIndex(SQLConstantes.VISITA_N)));
                visita.setUSU_CREACION(cursor.getString(cursor.getColumnIndex(SQLConstantes.VISITA_USUCREACION)));
                visita.setFEC_CREACION(cursor.getString(cursor.getColumnIndex(SQLConstantes.VISITA_FECCREACION)));
                visita.setUSU_REGISTRO(cursor.getString(cursor.getColumnIndex(SQLConstantes.VISITA_USUREGISTRO)));
                visita.setFEC_REGISTRO(cursor.getString(cursor.getColumnIndex(SQLConstantes.VISITA_FECREGISTRO)));
                visitas.add(visita);
            }
        }finally {
            if(cursor != null) cursor.close();
        }
        return visitas;
    }
    public ArrayList<Visita> getAllVisitas(){
        ArrayList<Visita> Visitas = new ArrayList<Visita>();
        Cursor cursor = sqLiteDatabase.query(SQLConstantes.tableVisitas,
                SQLConstantes.ALL_COLUMNS_VISITAS,null,null,null,null,null);
        while(cursor.moveToNext()){
            Visita visita = new Visita();
            visita.setID(cursor.getInt(cursor.getColumnIndex(SQLConstantes.VISITA_ID)));
            visita.setID_EMPRESA(cursor.getString(cursor.getColumnIndex(SQLConstantes.VISITA_ID_EMPRESA)));
            visita.setDNI_OPERADOR_E(cursor.getString(cursor.getColumnIndex(SQLConstantes.VISITA_DNI_OPERADOR)));
            visita.setV_OPERADOR_E(cursor.getString(cursor.getColumnIndex(SQLConstantes.VISITA_NOMBRE_OPERADOR)));
            visita.setDNI_JEFE_EQUIPO(cursor.getString(cursor.getColumnIndex(SQLConstantes.VISITA_DNI_JEFE)));
            visita.setV_JEFE_EQUIPO(cursor.getString(cursor.getColumnIndex(SQLConstantes.VISITA_NOMBRE_JEFE)));
            visita.setDNI_SUPERVISOR(cursor.getString(cursor.getColumnIndex(SQLConstantes.VISITA_DNI_SUPERVISOR)));
            visita.setV_SUPERVISOR(cursor.getString(cursor.getColumnIndex(SQLConstantes.VISITA_NOMBRE_SUPERVISOR)));
            visita.setV_DIA(cursor.getString(cursor.getColumnIndex(SQLConstantes.VISITA_DIA)));
            visita.setV_MES(cursor.getString(cursor.getColumnIndex(SQLConstantes.VISITA_MES)));
            visita.setV_ANIO(cursor.getString(cursor.getColumnIndex(SQLConstantes.VISITA_ANIO)));
            visita.setV_HORA_I(cursor.getString(cursor.getColumnIndex(SQLConstantes.VISITA_HORAI)));
            visita.setV_MINUTO_I(cursor.getString(cursor.getColumnIndex(SQLConstantes.VISITA_MINUTOI)));
            visita.setV_HORA_F(cursor.getString(cursor.getColumnIndex(SQLConstantes.VISITA_HORAF)));
            visita.setV_MINUTO_F(cursor.getString(cursor.getColumnIndex(SQLConstantes.VISITA_MINUTOF)));
            visita.setR_VISITA(cursor.getString(cursor.getColumnIndex(SQLConstantes.VISITA_RESULTADO)));
            visita.setR_VISITA_ESP(cursor.getString(cursor.getColumnIndex(SQLConstantes.VISITA_RESULTADO_ESP)));
            visita.setV_PROX_FECHA_DIA(cursor.getString(cursor.getColumnIndex(SQLConstantes.VISITA_PROX_DIA)));
            visita.setV_PROX_FECHA_MES(cursor.getString(cursor.getColumnIndex(SQLConstantes.VISITA_PROX_MES)));
            visita.setV_PROX_FECHA_ANIO(cursor.getString(cursor.getColumnIndex(SQLConstantes.VISITA_PROX_ANIO)));
            visita.setV_PROX_HORA(cursor.getString(cursor.getColumnIndex(SQLConstantes.VISITA_PROX_HORA)));
            visita.setV_PROX_MIN(cursor.getString(cursor.getColumnIndex(SQLConstantes.VISITA_PROX_MINUTO)));
            visita.setN_VISITA(cursor.getString(cursor.getColumnIndex(SQLConstantes.VISITA_N)));
            visita.setUSU_CREACION(cursor.getString(cursor.getColumnIndex(SQLConstantes.VISITA_USUCREACION)));
            visita.setFEC_CREACION(cursor.getString(cursor.getColumnIndex(SQLConstantes.VISITA_FECCREACION)));
            visita.setUSU_REGISTRO(cursor.getString(cursor.getColumnIndex(SQLConstantes.VISITA_USUREGISTRO)));
            visita.setFEC_REGISTRO(cursor.getString(cursor.getColumnIndex(SQLConstantes.VISITA_FECREGISTRO)));
            Visitas.add(visita);
        }
        return Visitas;
    }

//    public ArrayList<Empresa> getDepartamentos(){
//        ArrayList<Empresa> empresas = new ArrayList<Empresa>();
//        String[] whereArgs = new String[]{String.valueOf(1)};
//        Cursor cursor = sqLiteDatabase.query(SQLConstantes.tableEmpresas,
//                SQLConstantes.ALL_COLUMNS,SQLConstantes.WHERE_CLAUSE_DEPARTAMENTO,whereArgs,null,null,null);
//        while(cursor.moveToNext()){
//            Empresa empresa = new Empresa();
//            empresa.setId(cursor.getString(cursor.getColumnIndex(SQLConstantes.COLUMNA_ID)));
//            empresa.setNombre(cursor.getString(cursor.getColumnIndex(SQLConstantes.COLUMNA_NOMBRE)));
//            empresa.setPersonas(cursor.getInt(cursor.getColumnIndex(SQLConstantes.COLUMNA_PERSONAS)));
//            empresa.setDescripcion(cursor.getString(cursor.getColumnIndex(SQLConstantes.COLUMNA_DESCRIPCION)));
//            empresa.setPreparacion(cursor.getString(cursor.getColumnIndex(SQLConstantes.COLUMNA_PREPARACION)));
//            empresa.setImage(cursor.getString(cursor.getColumnIndex(SQLConstantes.COLUMNA_IMAGEN)));
//            empresa.setFav(cursor.getInt(cursor.getColumnIndex(SQLConstantes.COLUMNA_FAV)));
//            empresas.add(empresa);
//        }
//        return empresas;
//    }

//    public ArrayList<Empresa> getPersonas(int p){
//        ArrayList<Empresa> empresas = new ArrayList<Empresa>();
//        String[] whereArgs = new String[]{String.valueOf(p)};
//        Cursor cursor = sqLiteDatabase.query(SQLConstantes.tableEmpresas,
//                SQLConstantes.ALL_COLUMNS,SQLConstantes.WHERE_CLAUSE_PERSONAS,whereArgs,null,null,null);
//        while(cursor.moveToNext()){
//            Empresa empresa = new Empresa();
//            empresa.setId(cursor.getString(cursor.getColumnIndex(SQLConstantes.COLUMNA_ID)));
//            empresa.setNombre(cursor.getString(cursor.getColumnIndex(SQLConstantes.COLUMNA_NOMBRE)));
//            empresa.setPersonas(cursor.getInt(cursor.getColumnIndex(SQLConstantes.COLUMNA_PERSONAS)));
//            empresa.setDescripcion(cursor.getString(cursor.getColumnIndex(SQLConstantes.COLUMNA_DESCRIPCION)));
//            empresa.setPreparacion(cursor.getString(cursor.getColumnIndex(SQLConstantes.COLUMNA_PREPARACION)));
//            empresa.setImage(cursor.getString(cursor.getColumnIndex(SQLConstantes.COLUMNA_IMAGEN)));
//            empresa.setFav(cursor.getInt(cursor.getColumnIndex(SQLConstantes.COLUMNA_FAV)));
//            empresas.add(empresa);
//        }
//        return empresas;
//    }

//    public void deleteItem(String nombre){
//        String[] whereArgs = new String[]{String.valueOf(nombre)};
//        sqLiteDatabase.delete(SQLConstantes.tableEmpresas,SQLConstantes.WHERE_CLAUSE_NOMBRE,whereArgs);
//    }
}
