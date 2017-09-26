package pe.gob.inei.encuestahabilidades.modelo;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by user on 9/08/2017.
 */

public class DBHelper extends SQLiteOpenHelper {

    public static final int DB_VERSION = 1;
    public DBHelper(Context context) {
        super(context, SQLConstantes.DB, null, DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(SQLConstantes.SQL_CREATE_TABLA_MARCO);
        sqLiteDatabase.execSQL(SQLConstantes.SQL_CREATE_TABLA_USUARIOS);
        sqLiteDatabase.execSQL(SQLConstantes.SQL_CREATE_TABLA_UBIGEOS);
        sqLiteDatabase.execSQL(SQLConstantes.SQL_CREATE_TABLA_CARATULAS);
        sqLiteDatabase.execSQL(SQLConstantes.SQL_CREATE_TABLA_VISITAS);
        sqLiteDatabase.execSQL(SQLConstantes.SQL_CREATE_TABLA_DATOS_ENTREVISTA);
        sqLiteDatabase.execSQL(SQLConstantes.SQL_CREATE_TABLA_IDENTIFICACIONES);
        sqLiteDatabase.execSQL(SQLConstantes.SQL_CREATE_TABLA_FRAGMENTS);
        sqLiteDatabase.execSQL(SQLConstantes.SQL_CREATE_TABLA_MODULO1);
        sqLiteDatabase.execSQL(SQLConstantes.SQL_CREATE_TABLA_MODULO2);
        sqLiteDatabase.execSQL(SQLConstantes.SQL_CREATE_TABLA_MODULO3);
        sqLiteDatabase.execSQL(SQLConstantes.SQL_CREATE_TABLA_MODULO4);
        sqLiteDatabase.execSQL(SQLConstantes.SQL_CREATE_TABLA_MODULO5);
        sqLiteDatabase.execSQL(SQLConstantes.SQL_CREATE_TABLA_MODULO5_DINAMICA);
        sqLiteDatabase.execSQL(SQLConstantes.SQL_CREATE_TABLA_MODULO6);
        sqLiteDatabase.execSQL(SQLConstantes.SQL_CREATE_TABLA_MODULO7);
        sqLiteDatabase.execSQL(SQLConstantes.SQL_CREATE_TABLA_MODULO8);
        sqLiteDatabase.execSQL(SQLConstantes.SQL_CREATE_TABLA_MODULO9);
        sqLiteDatabase.execSQL(SQLConstantes.SQL_CREATE_TABLA_MODULO10);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL(SQLConstantes.SQL_DELETE_MARCO);
        sqLiteDatabase.execSQL(SQLConstantes.SQL_DELETE_USUARIOS);
        sqLiteDatabase.execSQL(SQLConstantes.SQL_DELETE_UBIGEO);
        sqLiteDatabase.execSQL(SQLConstantes.SQL_DELETE_CARATULAS);
        sqLiteDatabase.execSQL(SQLConstantes.SQL_DELETE_DATOS_ENTREVISTA);
        sqLiteDatabase.execSQL(SQLConstantes.SQL_DELETE_VISITAS);
        sqLiteDatabase.execSQL(SQLConstantes.SQL_DELETE_IDENTIFICACIONES);
        sqLiteDatabase.execSQL(SQLConstantes.SQL_CREATE_TABLA_FRAGMENTS);
        sqLiteDatabase.execSQL(SQLConstantes.SQL_DELETE_MODULO1);
        sqLiteDatabase.execSQL(SQLConstantes.SQL_DELETE_MODULO2);
        sqLiteDatabase.execSQL(SQLConstantes.SQL_DELETE_MODULO3);
        sqLiteDatabase.execSQL(SQLConstantes.SQL_DELETE_MODULO4);
        sqLiteDatabase.execSQL(SQLConstantes.SQL_DELETE_MODULO5);
        sqLiteDatabase.execSQL(SQLConstantes.SQL_DELETE_MODULO5_DINAMICA);
        sqLiteDatabase.execSQL(SQLConstantes.SQL_DELETE_MODULO6);
        sqLiteDatabase.execSQL(SQLConstantes.SQL_DELETE_MODULO7);
        sqLiteDatabase.execSQL(SQLConstantes.SQL_DELETE_MODULO8);
        sqLiteDatabase.execSQL(SQLConstantes.SQL_DELETE_MODULO9);
        sqLiteDatabase.execSQL(SQLConstantes.SQL_DELETE_MODULO10);
        onCreate(sqLiteDatabase);
    }
}
