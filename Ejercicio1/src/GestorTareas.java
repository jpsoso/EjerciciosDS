import java.util.ArrayList;

public class GestorTareas {
    private ArrayList<Component> tareas;

    public GestorTareas()
    {
        this.tareas = new ArrayList<Component>();
    }

    public void addTarea(Component componente){
        this.tareas.add(componente);
    }

    public void remove(Component componente) {
        if (this.tareas.contains(componente)) {
            this.tareas.remove(componente);
        }
    }

    public void print(){
        for (Component componente : this.tareas){
            componente.print();
        }
    }
}
