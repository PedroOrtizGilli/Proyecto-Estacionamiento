package Estacionamiento;

public class Moto extends Vehiculo{
    
    private boolean eslingaPuesta;
    
    public Moto(String patente, String marca, int modelo) {
        super("Moto", patente, marca, modelo);
    }
    
    public void bloquear(){
        if(!this.eslingaPuesta){
            this.eslingaPuesta = true;
        }
    }

    @Override
    public String toString() {
        return "Moto{" + "eslingaPuesta=" + eslingaPuesta + "\npatente=" + getPatente() + "\nmarca=" + getMarca() + "\nmodelo=" + getModelo() + '}';
    }
    
    public void acelerar(){
        System.out.println("La moto acelera");
    }
    
    public void frenar(){
        System.out.println("La moto frena");
    }
}
