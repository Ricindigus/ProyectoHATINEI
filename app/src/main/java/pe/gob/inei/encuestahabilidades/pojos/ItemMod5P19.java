package pe.gob.inei.encuestahabilidades.pojos;

/**
 * Created by RICARDO on 6/08/2017.
 */

public class ItemMod5P19 {
    private int id;
    private String ocupacion;
    private int spOpcion;
    private int habilitar;

    public ItemMod5P19(int id, String ocupacion, int spOpcion, int habilitar) {
        this.id = id;
        this.ocupacion = ocupacion;
        this.spOpcion = spOpcion;
        this.habilitar = habilitar;
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

    public int getSpOpcion() {
        return spOpcion;
    }

    public void setSpOpcion(int spOpcion) {
        this.spOpcion = spOpcion;
    }

    public int getHabilitar() {
        return habilitar;
    }

    public void setHabilitar(int habilitar) {
        this.habilitar = habilitar;
    }
}
