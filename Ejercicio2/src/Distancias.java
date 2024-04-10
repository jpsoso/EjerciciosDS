public class Distancias {
    AlgoritmoDistancia algoritmo;
    Punto a, b;

    public Distancias(double aX, double aY, double bX, double bY) {
        this.a = new Punto(aX, aY);
        this.b = new Punto(bX, bY);
        this.algoritmo = new DistanciaEuclidea();
    }

    public void cambiaCoseno(){
        this.algoritmo = new DistanciaCoseno();
    }

    public void cambiaEuclidea(){
        this.algoritmo = new DistanciaEuclidea();
    }

    public void cambiaManhattan(){
        this.algoritmo = new DistanciaManhattan();
    }

    public double calculaDistancia(){
        return this.algoritmo.algorithm(this.a, this.b);
    }
}
