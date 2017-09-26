package pe.gob.inei.encuestahabilidades.pojos;

/**
 * Created by user on 4/08/2017.
 */

public class ItemMod5P13P20 {
    private int id;
    private String ocupacion;
    private int cantidadRequerida;
    private String cantidad;
    private int habilitar;

    public ItemMod5P13P20(int id, String ocupacion, int cantidadRequerida, String cantidad, int habilitar) {
        this.id = id;
        this.ocupacion = ocupacion;
        this.cantidadRequerida = cantidadRequerida;
        this.cantidad = cantidad;
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

    public int getCantidadRequerida() {
        return cantidadRequerida;
    }

    public void setCantidadRequerida(int cantidadRequerida) {
        this.cantidadRequerida = cantidadRequerida;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    public int getHabilitar() {
        return habilitar;
    }

    public void setHabilitar(int habilitar) {
        this.habilitar = habilitar;
    }
}
