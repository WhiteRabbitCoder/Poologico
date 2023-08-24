package bean;

// Clase base Animal
public abstract class Animal {
    //Los atributos de la clase se trabajan como protected para que las clases hijas puedan acceder a ellos
    protected String nombre;
    protected int edad;

    //Se aplica el polimorfismo teniendo dos metodos con el mismo nombre pero con diferente cantidad de parametros
    public Animal() {
    }

    public Animal(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    abstract public void hacerSonido();

    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad + " años");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
