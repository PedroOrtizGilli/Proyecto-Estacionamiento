package Estacionamiento;

import java.util.ArrayList;

//Estacionar motos
// Moto: patente, marca, modelo

public class Estacionamiento122 {
    
    private String nombre;
    private ArrayList<Vehiculo> vehiculo;

    
    public Estacionamiento122(String nombre){
        this.nombre = nombre;
        this.vehiculo = new ArrayList<>();

    }
    
    //Agrega vahiculos a la lista 
    public void agregarVehiculo(Vehiculo o){
        checkNullVehiculo(o);
        vehiculo.add(o);
    }
    
    //Check que el vehiculo no sea nulo
    private void checkNullVehiculo(Vehiculo o){
        if(o == null){
            throw new NullPointerException("Objeto nulo");
        }
    }

    //Lista todos los vehiculos de la lista
    public void listarVehiculos(){
        if(vehiculo.isEmpty()){
            System.out.println("No hay vahiculos en el estacionamiento");
        } else {
            System.out.println("Lista de vehiculos");
            for(Vehiculo vehiculo : this.vehiculo){
                System.out.println(vehiculo);
            }
        }
    }
    
    //Busca en la lista si hay un vahiculo que conincida con la patente solicitada
    private int buscarVahiculoPatente(String patente){
        int indice = -1;
        int i = 0;
        while(i < vehiculo.size() && indice == -1){
            if(vehiculo.get(i).getPatente().equals(patente)){
                indice = i;
            }
            i++;
        }
        return indice;
    }
    
    public boolean estaVahiculo(String patente){
        return buscarVahiculoPatente(patente) != -1;
    }
    
    //Quita le vehiculo de la lista 
    public Vehiculo sacarVahiculo(String patente){
        int indice = buscarVahiculoPatente(patente);
        if(indice == -1){
            return null;
        }
        return vehiculo.remove(indice);
        
    }
    
    //
    public ArrayList<Vehiculo> getObjetos(){
        return new ArrayList<>(vehiculo);
    }
    
    //Devuelve la cantidad de vehiculos en la lista
    public int cantidadvahiculos(){
        return vehiculo.size();
    }
    
}
