package pe.gob.inei.encuestahabilidades.pojos;

/**
 * Created by RICARDO on 6/08/2017.
 */

public class ItemMod5P21 {
    private int id;
    private String ocupacion;
    private int ck1Opcion;
    private int ck2Opcion;
    private int ck3Opcion;
    private int ck4Opcion;
    private int ck5Opcion;
    private int ck6Opcion;
    private int ck7Opcion;
    private String especifique;
    private int habilitar;
    private int check;

    public ItemMod5P21(int id, String ocupacion, int ck1Opcion, int ck2Opcion, int ck3Opcion,
                       int ck4Opcion, int ck5Opcion, int ck6Opcion, int ck7Opcion,
                       String especifique, int habilitar, int check) {
        this.id = id;
        this.ocupacion = ocupacion;
        this.ck1Opcion = ck1Opcion;
        this.ck2Opcion = ck2Opcion;
        this.ck3Opcion = ck3Opcion;
        this.ck4Opcion = ck4Opcion;
        this.ck5Opcion = ck5Opcion;
        this.ck6Opcion = ck6Opcion;
        this.ck7Opcion = ck7Opcion;
        this.especifique = especifique;
        this.habilitar = habilitar;
        this.check = check;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    public int getCk1Opcion() {
        return ck1Opcion;
    }

    public void setCk1Opcion(int ck1Opcion) {
        this.ck1Opcion = ck1Opcion;
    }

    public int getCk2Opcion() {
        return ck2Opcion;
    }

    public void setCk2Opcion(int ck2Opcion) {
        this.ck2Opcion = ck2Opcion;
    }

    public int getCk3Opcion() {
        return ck3Opcion;
    }

    public void setCk3Opcion(int ck3Opcion) {
        this.ck3Opcion = ck3Opcion;
    }

    public int getCk4Opcion() {
        return ck4Opcion;
    }

    public void setCk4Opcion(int ck4Opcion) {
        this.ck4Opcion = ck4Opcion;
    }

    public int getCk5Opcion() {
        return ck5Opcion;
    }

    public void setCk5Opcion(int ck5Opcion) {
        this.ck5Opcion = ck5Opcion;
    }

    public int getCk6Opcion() {
        return ck6Opcion;
    }

    public void setCk6Opcion(int ck6Opcion) {
        this.ck6Opcion = ck6Opcion;
    }

    public int getCk7Opcion() {
        return ck7Opcion;
    }

    public void setCk7Opcion(int ck7Opcion) {
        this.ck7Opcion = ck7Opcion;
    }

    public String getEspecifique() {
        return especifique;
    }

    public void setEspecifique(String especifique) {
        this.especifique = especifique;
    }

    public int getHabilitar() {
        return habilitar;
    }

    public void setHabilitar(int habilitar) {
        this.habilitar = habilitar;
    }

    public int getCheck() {
        return check;
    }

    public void setCheck(int check) {
        this.check = check;
    }
}
