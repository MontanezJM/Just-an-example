package ejercicio1_tema2;

public class Punto {
    private double x;
    private double y;

    //Constructores de clase
    public Punto(){

    }
    public Punto(double a, double b){
        this.x = a;
        this.y = b;
    }

    //Establecer y obtener coordenadas
    public double abscisa(){
        return this.x;
    }

    public double ordenada(){
        return this.y;
    }

    public void setX(double a){
        this.x = a;
    }

    public void setY(double b){
        this.y = b;
    }

    //Metodos especiales

    public void trasladar(double oX, double oY){
        this.x += oX;
        this.y += oY;
    }
    public double distancia(Punto extremo){
        return Math.sqrt(Math.pow(Math.abs(this.x-extremo.x),2)+Math.pow(Math.abs(this.y-extremo.y),2));
    }

    //Metodo toString

    public String toString(){
        return "Punto("+this.x+";"+this.y+")";
    }
}
