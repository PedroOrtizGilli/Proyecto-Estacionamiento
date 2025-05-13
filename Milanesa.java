package Estacionamiento;

import java.util.Objects;

public class Milanesa {
    
    private String tipo;

    public Milanesa(String tipo) {
        this.tipo = tipo;
    }
    
    public String getTipo(){
        return this.tipo;
    }
    
    @Override
    public boolean equals(Object o){
        if(o == null || !(o instanceof Milanesa m)){
            return false;
        }
        return tipo.equals(m.tipo);
    }
    
    @Override
    public int hashCode(){
        return Objects.hash(tipo);
    }
}
