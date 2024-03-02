package Negocio;
public class cls_ventas{
    private String codigoStr;
    private int cantidadInt;
    private float subtotalFlt;
    private float ivaFlt;
    private float totalFlt;

    public cls_ventas(String codigoStr, int cantidadInt, float precioFlt) {
        this.codigoStr = codigoStr;
        this.cantidadInt = cantidadInt;
        this.subtotalFlt = precioFlt * cantidadInt;
        this.ivaFlt = (float)(this.subtotalFlt * 0.19);
        this.totalFlt = this.subtotalFlt + this.ivaFlt;
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

    public float getSubtotalFlt() {
        return subtotalFlt;
    }

    public void setSubtotalFlt(float subtotalFlt) {
        this.subtotalFlt = subtotalFlt;
    }

    public float getIvaFlt() {
        return ivaFlt;
    }

    public void setIvaFlt(float ivaFlt) {
        this.ivaFlt = ivaFlt;
    }

    public float getTotalFlt() {
        return totalFlt;
    }

    public void setTotalFlt(float totalFlt) {
        this.totalFlt = totalFlt;
    }
}