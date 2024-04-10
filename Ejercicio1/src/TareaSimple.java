 class TareaSimple implements Component{
    private String nombre = "";
    private String descripcion = "";

    public TareaSimple(String nombre, String descripcion)
    {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public void print()
    {
        System.out.println(nombre + "-----");
        System.out.println("Descripción de la tarea: " + descripcion);
        System.out.println("-----");
    }

     @Override
     public void add(Component componente) {
         System.out.println("Error, operación no válida");
     }

     @Override
     public void remove(Component componente) {
         System.out.println("Error, operación no válida");
     }

     @Override
     public Component get(int i) {
         System.out.println("Error, operación no válida");
        return null;
     }
 }
