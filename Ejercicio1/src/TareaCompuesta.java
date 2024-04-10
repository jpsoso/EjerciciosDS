import java.util.ArrayList;

public class TareaCompuesta implements Component{
    private String nombre = "";
    private String descripcion = "";
    private ArrayList<Component> subtareas;

    public TareaCompuesta(String nombre, String descripcion)
    {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.subtareas = new ArrayList<Component>();
    }

    public void print()
    {
        System.out.println(nombre + "-----");
        System.out.println("Descripción de la tarea: " + descripcion);
        if (!this.subtareas.isEmpty()){
            System.out.println("Subtareas: ");
            for (Component componente : this.subtareas){
                System.out.print("      ");
                componente.print();
            }
        }

        System.out.println("-----");
    }

    @Override
    public void add(Component componente) {
        this.subtareas.add(componente);
    }

    @Override
    public void remove(Component componente) {
        if (this.subtareas.indexOf(componente) != -1) {
            this.subtareas.remove(componente);
        }
    }

    @Override
    public Component get(int i) {
        if (i < this.subtareas.size() && i > -1){
            return this.subtareas.get(i);
        } else {
            return null;
        }
    }
}
