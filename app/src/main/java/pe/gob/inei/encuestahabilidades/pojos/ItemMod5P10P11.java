package pe.gob.inei.encuestahabilidades.pojos;

/**
 * Created by user on 4/08/2017.
 */

public class ItemMod5P10P11 {
    private int id;
    private String ocupacion;
    private int cantidadRequerida;
    private String campoNumero1;
    private String campoNumero2;

    public ItemMod5P10P11(int id, String ocupacion, int cantidadRequerida, String campoNumero1, String campoNumero2) {
        this.id = id;
        this.ocupacion = ocupacion;
        this.cantidadRequerida = cantidadRequerida;
        this.campoNumero1 = campoNumero1;
        this.campoNumero2 = campoNumero2;
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

    public String getCampoNumero1() {
        return campoNumero1;
    }

    public void setCampoNumero1(String campoNumero1) {
        this.campoNumero1 = campoNumero1;
    }

    public String getCampoNumero2() {
        return campoNumero2;
    }

    public void setCampoNumero2(String campoNumero2) {
        this.campoNumero2 = campoNumero2;
    }
}
