public class Peaje {
    private float precio;

    public Peaje(float precio) {
        this.precio=precio;
    }

    public void cobrar(Coche coche) {
//        coche.listaDePersonas.get(0).dineros -= this.precio;

        Person personadelCoche = coche.listaDePersonas.get(0);
        personadelCoche.dineros = personadelCoche.dineros - this.precio;

//        coche.listaDePersonas.get(0).dineros=coche.listaDePersonas.get(0).dineros - this.precio;
    }
}
