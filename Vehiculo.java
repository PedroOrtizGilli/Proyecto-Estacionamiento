package Estacionamiento;

public abstract class Vehiculo {
    
    private String tipo;
    private String patente;
    private String marca;
    private int modelo;

    public Vehiculo(String tipo, String patente, String marca, int modelo) {
        this.tipo = tipo;
        this.patente = patente;
        this.marca = marca;
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "patente=" + patente + ", marca=" + marca + ", modelo=" + modelo + '}';
    }
    
    public String getTipo(){
        return this.tipo;
    }
    
    public String getMarca() {
        return this.marca;
    }

    public int getModelo() {
        return this.modelo;
    }
    
    public String getPatente(){
        return this.patente;
    }
    
    public abstract void acelerar();
    
    public abstract void frenar();
}
