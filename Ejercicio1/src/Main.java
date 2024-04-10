import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        TareaSimple Tarea1 = new TareaSimple("Tarea 1", "Tarea simple");
        TareaCompuesta Tarea2 = new TareaCompuesta("Tarea 2", "Tarea compuesta");

        for (int i = 1; i < 4; i++){
            TareaSimple tarea = new TareaSimple("Subtarea " + String.valueOf(i), "Tarea Simple");
            Tarea2.add(tarea);
        }

        TareaCompuesta subTarea4 = new TareaCompuesta("Subtarea 4", "subTarea Compuesta");
        Tarea2.add(subTarea4);

        GestorTareas gestor = new GestorTareas();
        gestor.addTarea(Tarea1);
        gestor.addTarea(Tarea2);

        gestor.print();

        Tarea1.get(2);
    }
}