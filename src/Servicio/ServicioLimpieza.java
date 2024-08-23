package Servicio;

public class ServicioLimpieza extends Servicio{

    public ServicioLimpieza(String nombreServicio, int costoServicio) {
        super(nombreServicio, costoServicio);
    }


    @Override
    public String getNombreServicio() {
        return nombreServicio;
    }

    @Override
    public int getCostoServicio() {
        return costoServicio;
    }

    @Override
    public void factura() {
        System.out.println("Factura de servicio de limpieza"
                            +"\nNombre del servicio: " + nombreServicio
                            +"\nCosto del servicio: " + costoServicio);
    }

    @Override
    public void registro() {
        System.out.println("Registro de servicio de limpieza");
    }




}
