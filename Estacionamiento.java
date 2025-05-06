
package Estacionamiento;

public class Estacionamiento {

    public static void main(String[] args) {
        
        Estacionamiento122 e = new Estacionamiento122("Parking VIP");
        
        
        Auto a1 = new Auto("ABS123", "Fiat", 2025);
        Auto a2 = new Auto("ABS124", "Ford", 2025);
        Auto a3 = new Auto("ABS125", "BMW", 2025);
        Auto a4 = new Auto("ABS126", "Ferrari", 2025);
        Auto a5 = new Auto("ABS127", "Mistsubishi", 2025);
        
        e.listarVehiculos();
        
        e.agregarVehiculo(a1);
        e.agregarVehiculo(a1);
        e.agregarVehiculo(a1);
        e.agregarVehiculo(a1);
        e.agregarVehiculo(a1);
        
        e.listarVehiculos();
    }
    
}
