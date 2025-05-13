package Estacionamiento;

public class Camion extends Vehiculo{
    
    private double carga;
    
    public Camion(String patente, String marca, int modelo, double carga) {
        super("Camion", patente, marca, modelo);
        this.carga = carga;
    }
    
    public void cargar(double carga){
        this.carga = carga;
    }
    
    public void acelerar(){
        System.out.println("El camion acelera");
    }
    
    public void frenar(){
        System.out.println("El camion frena");
    }
}
