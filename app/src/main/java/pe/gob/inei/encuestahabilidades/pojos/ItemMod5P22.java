package pe.gob.inei.encuestahabilidades.pojos;

/**
 * Created by user on 4/08/2017.
 */

public class ItemMod5P22 {
    private int id;
    private String ocupacion;
    private String remuneracion;
    private String tiempoPagado;
    private int habilitar;

    public ItemMod5P22(int id, String ocupacion, String remuneracion, String tiempoPagado, int habilitar) {
        this.id = id;
        this.ocupacion = ocupacion;
        this.remuneracion = remuneracion;
        this.tiempoPagado = tiempoPagado;
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

    public String getRemuneracion() {
        return remuneracion;
    }

    public void setRemuneracion(String remuneracion) {
        this.remuneracion = remuneracion;
    }

    public String getTiempoPagado() {
        return tiempoPagado;
    }

    public void setTiempoPagado(String tiempoPagado) {
        this.tiempoPagado = tiempoPagado;
    }

    public int getHabilitar() {
        return habilitar;
    }

    public void setHabilitar(int habilitar) {
        this.habilitar = habilitar;
    }
}
