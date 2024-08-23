
import java.util.Scanner;
import Vehiculo.* ;
import  Servicio.*;

public class Main {


    public static void main(String[] args) {

    Scanner selecionarOpcion = new Scanner(System.in);

    int opcion = 0;

    do{

        System.out.println("\t"+"\t"+"\t"+ " SELECCIONA TU VEHICULO  "+"\t"+"\t"+"\t");
        System.out.println("1. Moto"
                        + "\n2. Carro"
                        + "\n3. Camioneta"
                        + "\n4. Salir");
        System.out.print("Seleccione una opcion: ");
        opcion = selecionarOpcion.nextInt();

        switch(opcion){
            case 1:

                Vehiculo moto = new Moto("YAMAHA","XY","ROJO",2021);
                Gestor_Vehiculo vehiculoMoto = new Gestor_Vehiculo();
                vehiculoMoto.gestionarMoto(moto);

                break;
            case 2:
                Vehiculo carro = new Carro("TOYOTA", "COROLLA", "AZUL", 2020);
                Gestor_Vehiculo vehiculoCarro = new Gestor_Vehiculo();
                vehiculoCarro.gestionarCarro(carro);

                break;
            case 3:
                Vehiculo camion = new Camion("RENAULT", "RANGER", "NEGRO", 2019 );
                Gestor_Vehiculo vehiculoCamion = new Gestor_Vehiculo();
                vehiculoCamion.gestionarCamion(camion);
                break;
            case 4:
                System.out.println("Gracias por usar nuestros servicios");
                System.exit(0);
                break;
            default:
                System.out.println("Opcion no valida");
                break;
        }

    } while (true);

    }

}