package Negocio;

public class cls_productos {
    private String codigoStr;
    private String nombreStr;
    private float precioFlt;
    private int cantidadInt;
    
    public cls_productos(String codigoStr, String nombreStr, float precioFlt) {
        this.codigoStr = codigoStr;
        this.nombreStr = nombreStr;
        this.precioFlt = precioFlt;
        this.cantidadInt = 0; 
    }

    public String getCodigoStr() {
        return codigoStr;
    }

    public void setCodigoStr(String codigoStr) {
        this.codigoStr = codigoStr;
    }

    public String getNombreStr() {
        return nombreStr;
    }

    public void setNombreStr(String nombreStr) {
        this.nombreStr = nombreStr;
    }

    public float getPrecioFlt() {
        return precioFlt;
    }

    public void setPrecioFlt(float precioFlt) {
        this.precioFlt = precioFlt;
    }

    public int getCantidadInt() {
        return cantidadInt;
    }

    public void setCantidadInt(int cantidadInt) {
        this.cantidadInt = cantidadInt;
    }


}