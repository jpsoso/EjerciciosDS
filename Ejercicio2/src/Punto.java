public class Punto {

    private double x, y;

    public Punto(double x, double y){
        this.x = x;
        this.y = y;
    }

    public Punto(){
        this(0, 0);
    }

    public double obtenerX(){
        return x;
    }

    public double obtenerY(){
        return y;
    }

    public double distancia(Punto p){
        double diferenciaX = x - p.obtenerX();
        double diferenciaY = y - p.obtenerY();

        return Math.sqrt(Math.pow(diferenciaX, 2) + Math.pow(diferenciaY, 2));
    }
}