import Vehiculo.Vehiculo;

import java.util.HashMap;
import java.util.HashSet;

public class Gestor_Vehiculo {

    protected   HashMap<Vehiculo, HashSet<String>> servicios;
    Gestor_Servicio gestionarServicio;
    public Gestor_Vehiculo(){

        servicios = new HashMap<>();
        gestionarServicio = new Gestor_Servicio();

    }

    public void gestionarMoto(Vehiculo vehiculo){

        gestionarServicio.mostrarMenuServicios(vehiculo);
        servicios.put(vehiculo,gestionarServicio.serviciosAlmacenados);
        gestionarServicio.serviciosSeleccionados.clear();
        gestionarServicio.serviciosAlmacenados.clear();
    }

    public void gestionarCarro(Vehiculo vehiculo){

        gestionarServicio.mostrarMenuServicios(vehiculo);
        servicios.put(vehiculo,gestionarServicio.serviciosAlmacenados);
        gestionarServicio.serviciosSeleccionados.clear();
        gestionarServicio.serviciosAlmacenados.clear();
    }

    public void gestionarCamion(Vehiculo vehiculo){

        gestionarServicio.mostrarMenuServicios(vehiculo);
        servicios.put(vehiculo,gestionarServicio.serviciosAlmacenados);
        gestionarServicio.serviciosSeleccionados.clear();
        gestionarServicio.serviciosAlmacenados.clear();
    }
}
