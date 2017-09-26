package pe.gob.inei.encuestahabilidades.pojos;

import android.content.ContentValues;

import pe.gob.inei.encuestahabilidades.modelo.SQLConstantes;

/**
 * Created by otin016 on 16/08/2017.
 */

public class BDFragment {
    private String FRAGMENT_ID;
    private String FRAGMENT_HABILITADO;
    private String FRAGMENT_AVANCE;


    public BDFragment() {
        this.FRAGMENT_ID = "";
        this.FRAGMENT_HABILITADO = "";
        this.FRAGMENT_AVANCE = "";
    }

    public BDFragment(String FRAGMENT_ID, String FRAGMENT_HABILITADO, String FRAGMENT_AVANCE) {
        this.FRAGMENT_ID = FRAGMENT_ID;
        this.FRAGMENT_HABILITADO = FRAGMENT_HABILITADO;
        this.FRAGMENT_AVANCE = FRAGMENT_AVANCE;
    }

    public String getFRAGMENT_ID() {
        return FRAGMENT_ID;
    }

    public void setFRAGMENT_ID(String FRAGMENT_ID) {
        this.FRAGMENT_ID = FRAGMENT_ID;
    }

    public String getFRAGMENT_HABILITADO() {
        return FRAGMENT_HABILITADO;
    }

    public void setFRAGMENT_HABILITADO(String FRAGMENT_HABILITADO) {
        this.FRAGMENT_HABILITADO = FRAGMENT_HABILITADO;
    }

    public String getFRAGMENT_AVANCE() {
        return FRAGMENT_AVANCE;
    }

    public void setFRAGMENT_AVANCE(String FRAGMENT_AVANCE) {
        this.FRAGMENT_AVANCE = FRAGMENT_AVANCE;
    }

    public ContentValues toValues(){
        ContentValues contentValues = new ContentValues(3);
        contentValues.put(SQLConstantes.FRAGMENT_ID,FRAGMENT_ID);
        contentValues.put(SQLConstantes.FRAGMENT_HABILITADO,FRAGMENT_HABILITADO);
        contentValues.put(SQLConstantes.FRAGMENT_AVANCE,FRAGMENT_AVANCE);
        return contentValues;
    }
}