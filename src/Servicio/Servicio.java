package Servicio;

public abstract class Servicio {

    protected String nombreServicio;
    protected int costoServicio;

    public Servicio(String nombreServicio, int costoServicio){
        this.nombreServicio = nombreServicio;
        this.costoServicio = costoServicio;
    }

    public  abstract String getNombreServicio();

    public abstract int getCostoServicio();

    public abstract void factura();

    public abstract void registro();


}
