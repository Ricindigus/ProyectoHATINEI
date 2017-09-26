package pe.gob.inei.encuestahabilidades.pojos;

/**
 * Created by user on 4/08/2017.
 */

public class ItemMod5P12P16P18 {
    private int id;
    private String ocupacion;
    private int opcionRg;
    private int habilitar;

    public ItemMod5P12P16P18(int id, String ocupacion, int opcionRg, int habilitar) {
        this.id = id;
        this.ocupacion = ocupacion;
        this.opcionRg = opcionRg;
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

    public int getOpcionRg() {
        return opcionRg;
    }

    public void setOpcionRg(int opcionRg) {
        this.opcionRg = opcionRg;
    }

    public int getHabilitar() {
        return habilitar;
    }

    public void setHabilitar(int habilitar) {
        this.habilitar = habilitar;
    }
}
