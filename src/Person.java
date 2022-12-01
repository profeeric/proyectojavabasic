public class Person {
    private String nombre;
    private String apellidos;
    private int edad;
    private String dni;

    public Person(String nombre, String apellidos, int edad, String dni) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.dni = dni;
    }

    @Override
    public String toString() {
        return "Nombre: " + this.nombre + ". Apellidos: "+this.apellidos;
//        return super.toString();
    }

}
