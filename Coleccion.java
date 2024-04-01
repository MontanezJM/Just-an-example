package ejercicio1_tema2;

import java.util.ArrayList;

public class Coleccion {
    private ArrayList<Punto>Coleccion;

    //Constructor de clase

    public Coleccion(){

    }

    //Metodos de clase

    public int numElem(){
        return this.Coleccion.size();
    }

    public boolean vacia(){
        return this.Coleccion.isEmpty();
    }

    public void vaciar(){
        this.Coleccion.clear();
    }
    public void añadir(Punto p){
        if(!contienePunto(p)){
            this.Coleccion.add(p);
        }
    }
    public void eliminar(Punto p){
        if(contienePunto(p)){
            this.Coleccion.remove(p);
        }
    }
    public boolean contienePunto(Punto p){
        return this.Coleccion.contains(p);
    }

    //Metodo toString

    public String toString(){
        String toString = "Coleccion(";
        for(int i=0; i<this.numElem(); i++){
            toString += this.Coleccion.get(i).toString()+" ";
        }
        return toString+")";
    }
}
