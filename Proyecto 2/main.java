public class main {
    public static void main(String[] args) {
        Coche miCoche1 = new Coche();
        Moto miMoto1 = new Moto();

        miCoche1.establecerColor("Rojo");
        miCoche1.configurarAsientos("si");
        miCoche1.configurarClimatizador("No");
        System.out.println(miCoche1.dimeDatosGeneralesCoche() + ' ' + miCoche1.dimeColor());
        System.out.println(miCoche1.precioCoche());
        System.out.println(miMoto1.dimeDatosGeneralesMoto());
    }
}

//Tarea: Hacer 2 clases, una camioneta y una moto
