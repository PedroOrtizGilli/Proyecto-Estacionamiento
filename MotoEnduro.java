package Estacionamiento;

public class MotoEnduro extends Moto{
    
    private double alturaSuspension;

    public MotoEnduro(String patente, String marca, int modelo, double alturaSuspension) {
        super(patente, marca, modelo);
        this.alturaSuspension = alturaSuspension;
    }
    
    
}
