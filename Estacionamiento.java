
package Estacionamiento;

public class Estacionamiento {

    public static void main(String[] args) {
        
        Estacionamiento122 e = new Estacionamiento122("Parking VIP");
        
        Auto a1 = new Auto("ABS123", "Fiat", 2025);
        Auto a2 = new Auto("ABS124", "Ford", 2025);
        Auto a3 = new Auto("ABS125", "BMW", 2025);
        Auto a4 = new Auto("ABS126", "Ferrari", 2025);
        Auto a5 = new Auto("ABS127", "Mistsubishi", 2025);
        
        Moto m0 = new Moto("GHT786", "BMW", 2023);
        Moto m1 = new Moto("KLO999", "Kawasaki", 2020);
        Moto m2 = new Moto("AAA111", "BMW", 2025);
        Moto m3 = new Moto("UIU090", "Ford", 2021);
        Moto m4 = new Moto("SSS222", "Mistsubishi", 2019);
        
        Camion c = new Camion("FGH432", "IVECO", 2018, 32000);
        Camion c1 = new Camion("UYT555", "IVECO", 2013, 42000);
        Camion c2 = new Camion("OPS845", "IVECO", 2020, 62000);
        Camion c3 = new Camion("PPP888", "IVECO", 2018, 32000);
        Camion c4 = new Camion("FGT963", "IVECO", 2025, 32000);
        
        Milanesa m = new Milanesa("Pollo");
        Milanesa mn = new Milanesa ("Carne");
        Milanesa nm = new Milanesa ("Pollo");

        e.listarVehiculos();
        
        e.agregarVehiculo(a1);
        e.agregarVehiculo(a2);
        e.agregarVehiculo(a3);
        e.agregarVehiculo(a4);
        e.agregarVehiculo(a5);
        e.agregarVehiculo(m0);
        e.agregarVehiculo(m1);
        e.agregarVehiculo(m2);
        e.agregarVehiculo(m3);
        e.agregarVehiculo(m4);
        e.agregarVehiculo(c);
        e.agregarVehiculo(c1);
        e.agregarVehiculo(c2);
        e.agregarVehiculo(c3);
        e.agregarVehiculo(c4);
        
        e.listarVehiculos();
        
        System.out.println("----------------------------------------------");
        
        for (Vehiculo v : e.getLista()){
            switch (v.getTipo()) {
                case "Auto":
                    ((Auto) v).calcularRuta();
                case "Moto":
                    ((Moto) v).bloquear();
                case "Camion":
                    ((Camion) v).cargar(30000);
            } 
        }
          
    }
    
}
