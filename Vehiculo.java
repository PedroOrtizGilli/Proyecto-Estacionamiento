package Estacionamiento;

public class Vehiculo {
    
    private String patente;
    private String marca;
    private int modelo;

    public Vehiculo(String patente, String marca, int modelo) {
        this.patente = patente;
        this.marca = marca;
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "patente=" + patente + ", marca=" + marca + ", modelo=" + modelo + '}';
    }

    public String getMarca() {
        return marca;
    }

    public int getModelo() {
        return modelo;
    }
    
    public String getPatente(){
        return this.patente;
    }
    
    public void acelerar(){
        System.out.println("acelerando");
    }
    
    public void frenar(){
        System.out.println("Frenando");
    }
}
