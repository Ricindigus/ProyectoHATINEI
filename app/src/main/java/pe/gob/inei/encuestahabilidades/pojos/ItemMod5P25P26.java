package pe.gob.inei.encuestahabilidades.pojos;

/**
 * Created by user on 4/08/2017.
 */

public class ItemMod5P25P26 {
    private int id;
    private String ocupacion;
    private String motivo;
    private int habilitar;

    public ItemMod5P25P26(int id, String ocupacion, String motivo, int habilitar) {
        this.id = id;
        this.ocupacion = ocupacion;
        this.motivo = motivo;
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

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public int getHabilitar() {
        return habilitar;
    }

    public void setHabilitar(int habilitar) {
        this.habilitar = habilitar;
    }
}
