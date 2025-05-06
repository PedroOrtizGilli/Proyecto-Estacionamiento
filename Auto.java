package Estacionamiento;

public class Auto extends Vehiculo{
    
    private boolean tieneGPS;

    public Auto(String patente, String marca, int modelo) {
        super(patente, marca, modelo);
    }
    
    //Agrega GPS al auto
    public void agregarGPS(){
        this.tieneGPS = true;
    }
    
    //Si tiene GPS calcula la ruta
    public void calcularRuta(){
        if(this.tieneGPS){
            System.out.println("Calculando ruta");
        } else {
            System.out.println("Comprate un GPS");
        }
    }

    @Override
    public String toString() {
        String cadena = super.toString();
        return "Auto{" + "tieneGPS=" + tieneGPS + cadena;
    }
    
    
}
