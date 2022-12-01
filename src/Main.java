public class Main {
    public static void main(String[] args) {
//        System.out.println("3+\"3\"");
//        System.out.println();
//        System.out.println(3+3);
//
//        String variable="3";
//        int number=4;
//
//        System.out.println( variable + number );
//        System.out.println( 10.0 / 10);
//        //int -> float -> int -> String
//        System.out.println((float) 7 / 2);
//        // 7f -> float
//
//
//        int num=3;
//        num=num+1; // num++
//        System.out.println(++num);
        Person persona1=new Person("Eric","Casanova xxxx",99, "DNI",50.36f);
        System.out.println(persona1);
        Person persona2=new Person("Juan","Apellido1 apellido2",10, "numberDNI", 15);
        System.out.println(persona2);

        Coche coche1=new Coche("1234ABC","Color");
        coche1.annadirPersonas(persona1);
        coche1.annadirPersonas(persona2);
//        System.out.println(coche1);
//        coche1.quitarPersonas(persona1);
//        coche1.quitarPersonas(persona2);
//        System.out.println(coche1);
////
//        coche1.annadirPersonas(persona2);
//        System.out.println(coche1);
        coche1.quitarPersonas(persona2);
        Coche coche2=new Coche("2345BCD", "verde");
        coche2.annadirPersonas(persona2);
        System.out.println("-----------------------------------");
        for (Coche coche : Coche.lista_de_coches) {
            System.out.println(coche);
            System.out.println();

        }
        Peaje peaje1=new Peaje(7);
        peaje1.cobrar(coche1);

        System.out.println("-----------------------------------");
        for (Coche coche : Coche.lista_de_coches) {
            System.out.println(coche);
            System.out.println();

        }

    }
}