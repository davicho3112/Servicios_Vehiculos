package Vehiculo;

public class Carro extends Vehiculo{

    int velocidad ;
    public Carro(String marca, String modelo, String color, int año) {
        super(marca, modelo, color, año);
        velocidad = 0;

    }

    @Override
    public int getAño() {
        return año;
    }


    @Override
    public String getColor() {
        return color;
    }

    @Override
    public String getMarca() {
        return marca;
    }

    @Override
    public String getModelo() {
        return modelo;
    }

    @Override
    public void acelerar(int velocidad) {

        int acelerar = velocidad + 5;
        System.out.println("Acelerando "+ acelerar +  "KM/h");
    }

    @Override
    public void frenar(int velocidad) {
        int frenar = velocidad - 5;
        System.out.println("Frenando "+ frenar +  "KM/h");

    }

    @Override
    public void datosVehiculo() {
        System.out.println("Marca: "+marca
                +"\nModelo: "+modelo
                +" \nColor: "+color
                +"\nAño: "+año);


    }
}
