//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Distancias CalculaDistancia = new Distancias(2, 3, 5, 7);

        System.out.println("Distancia Euclidea: " + CalculaDistancia.calculaDistancia());

        CalculaDistancia.cambiaManhattan();
        System.out.println("Distancia Manhattan: " + CalculaDistancia.calculaDistancia());

        CalculaDistancia.cambiaCoseno();
        System.out.println("Distancia Coseno: " + CalculaDistancia.calculaDistancia());

    }
}