public class DistanciaManhattan implements AlgoritmoDistancia{
    @Override
    public double algorithm(Punto a, Punto b) {
        return Math.abs(b.obtenerX() - a.obtenerX()) + Math.abs(b.obtenerY() - a.obtenerY());
    }
}
