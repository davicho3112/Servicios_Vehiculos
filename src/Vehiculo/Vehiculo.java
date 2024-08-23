package Vehiculo;

public abstract class  Vehiculo {

    protected String marca ;
    protected String modelo;
    protected String color;
    protected int año;

    public Vehiculo(String marca, String modelo, String color, int año){
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.año = año;
    }

    public abstract String getMarca();
    public abstract  String getModelo();
    public abstract String getColor();
    public abstract int getAño();
    public abstract void acelerar(int velocidad);
    public abstract void frenar(int velocidad);
    public abstract void datosVehiculo();

}
