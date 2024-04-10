public class DistanciaEuclidea implements AlgoritmoDistancia{
    @Override
    public double algorithm(Punto a, Punto b) {
        return a.distancia(b);
    }
}
