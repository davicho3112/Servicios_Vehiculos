import Servicio.*;
import Vehiculo.*;
import java.util.HashSet;
import java.util.Scanner;

public class Gestor_Servicio {

    protected HashSet<Integer> serviciosSeleccionados ;
    protected HashSet<String> serviciosAlmacenados ;
    Scanner seleccionarOpcion;

    public Gestor_Servicio(){

        serviciosSeleccionados = new HashSet<>();
        serviciosAlmacenados = new HashSet<>();
        seleccionarOpcion = new Scanner(System.in);
    }

    public void mostrarMenuServicios(Vehiculo vehiculo){

        int opcion;

        do {
            System.out.println("Que tipo de servicio requiere el/la " + vehiculo.getClass().getSimpleName().toLowerCase()
                    + "\n1. Servicio de limpieza"
                    + "\n2. Servicio de chequeo"
                    + "\n3. Servicio de reparacion"
                    + "\n4. Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = seleccionarOpcion.nextInt();

            if (serviciosSeleccionados.contains(opcion)) {
                System.out.println("Este servicio ya ha sido seleccionado. Por favor, elija otro servicio.");
                continue;
            }

            serviciosSeleccionados.add(opcion);

            switch (opcion) {
                case 1:
                    Servicio servicio = new ServicioLimpieza("Servicio de limpieza", 1000);
                    servicio.registro();
                    servicio.factura();
                    serviciosAlmacenados.add(servicio.getNombreServicio());
                    break;
                case 2:
                    Servicio servicio2 = new ServicioChequeo("Servicio de chequeo", 1500);
                    servicio2.registro();
                    servicio2.factura();
                    serviciosAlmacenados.add(servicio2.getNombreServicio());

                    break;
                case 3:
                    Servicio servicio3 = new ServicioReparacion("Servicio de reparacion", 2000);
                    servicio3.registro();
                    servicio3.factura();
                    serviciosAlmacenados.add(servicio3.getNombreServicio());

                    break;
                case 4:
                    System.out.println("Gracias por usar nuestros servicios");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }

        }while(true);

    }
}
