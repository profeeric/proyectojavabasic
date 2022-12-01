import java.util.ArrayList;

public class Coche {

    public static ArrayList<Coche> lista_de_coches=new ArrayList<>();
    public String matricula;
    public String color;
    public ArrayList<Person> listaDePersonas = new ArrayList<>();

    public Coche(String matricula, String color) {
        this.matricula = matricula;
        this.color = color;
        lista_de_coches.add(this);
    }

    public void annadirPersonas(Person persona) {
        this.listaDePersonas.add(persona);
    }

    public void quitarPersonas(Person persona) {
        this.listaDePersonas.remove(persona);
    }

    @Override
    public String toString() {
        return "Matricula: " + this.matricula+". ListaPersonas: "+this.listaDePersonas;
        //        return super.toString();
    }


}