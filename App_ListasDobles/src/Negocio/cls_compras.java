package Negocio;

public class cls_compras {

    private String codigoStr;
    private int cantidadInt;
    private float precioFlt;
    
    public cls_compras(String codigoStr, int cantidadInt, float precioFlt) {
        this.codigoStr = codigoStr;
        this.cantidadInt = cantidadInt;
        this.precioFlt = precioFlt;
    }

    public String getCodigoStr() {
        return codigoStr;
    }

    public void setCodigoStr(String codigoStr) {
        this.codigoStr = codigoStr;
    }

    public int getCantidadInt() {
        return cantidadInt;
    }

    public void setCantidadInt(int cantidadInt) {
        this.cantidadInt = cantidadInt;
    }

    public float getPrecioFlt() {
        return precioFlt;
    }

    public void setPrecioFlt(float precioFlt) {
        this.precioFlt = precioFlt;
    }

}
