public class Person {
    private String nombre;
    private String apellidos;
    private int edad;
    private String dni;
    public float dineros;

    public Person(String nombre, String apellidos, int edad, String dni, float dineros) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.dni = dni;
        this.dineros=dineros;
    }

    @Override
    public String toString() {
        return "(Nombre: " + this.nombre + ". Apellidos: "+this.apellidos+". Dineros:"+this.dineros+")";
//        return super.toString();
    }

}
