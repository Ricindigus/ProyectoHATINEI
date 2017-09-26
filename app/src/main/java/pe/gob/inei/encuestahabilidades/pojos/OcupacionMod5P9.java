package pe.gob.inei.encuestahabilidades.pojos;

/**
 * Created by user on 31/07/2017.
 */

public class OcupacionMod5P9 {
    private int id;
    private String codOcupacion;
    private String ocupacion;
    private String ocupacionEspecifica;
    private int cantidadRequerida;

    public OcupacionMod5P9(){
        this.id = -1;
    }

    public OcupacionMod5P9(int id){
        this.id = id;
    }

    public OcupacionMod5P9(String codOcupacion, String ocupacion, String ocupacionEspecifica, int cantidadRequerida) {
        this.id = -1;
        this.codOcupacion = codOcupacion;
        this.ocupacion = ocupacion;
        this.ocupacionEspecifica = ocupacionEspecifica;
        this.cantidadRequerida = cantidadRequerida;
    }

    public OcupacionMod5P9(int id, String codOcupacion, String ocupacion, String ocupacionEspecifica, int cantidadRequerida) {
        this.id = id;
        this.codOcupacion = codOcupacion;
        this.ocupacion = ocupacion;
        this.ocupacionEspecifica = ocupacionEspecifica;
        this.cantidadRequerida = cantidadRequerida;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCodOcupacion() {
        return codOcupacion;
    }

    public void setCodOcupacion(String codOcupacion) {
        this.codOcupacion = codOcupacion;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    public String getOcupacionEspecifica() {
        return ocupacionEspecifica;
    }

    public void setOcupacionEspecifica(String ocupacionEspecifica) {
        this.ocupacionEspecifica = ocupacionEspecifica;
    }

    public int getCantidadRequerida() {
        return cantidadRequerida;
    }

    public void setCantidadRequerida(int cantidadRequerida) {
        this.cantidadRequerida = cantidadRequerida;
    }
}
