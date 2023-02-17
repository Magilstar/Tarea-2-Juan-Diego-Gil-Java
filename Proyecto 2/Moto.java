public class Moto {
    private int motor;
    private int largo;
    private int ancho;
    private int peso;
    private String colorMoto;
    boolean nuevoSistemaSonido;

    public Moto(){
        motor = 1200;
        largo = 1500;
        ancho = 550;
        peso = 250;
        colorMoto = "Gris";
        nuevoSistemaSonido = false;
    }
    public String dimeDatosGeneralesMoto(){
        return "La motos promedios tiene una potencia de: "+ motor+" caballos de fuersas, cun un LargoxAncho de: " +largo + " x "+
                ancho +" metros, y tiene un color: " + colorMoto + " y puede tener un sistema de sonido";
    }

    public void establecerColorMoto(String color){
        colorMoto = color;
    }

    public String dimeColorMoto(){
        return "El color de la Moto es: " +colorMoto;
    }
    public void configurarSistemaSonidoMoto(String sistemaSonido){
        if (sistemaSonido.equalsIgnoreCase("Si")){
            this.nuevoSistemaSonido = true;
        }
    }

    public String dimeSistemaSonidoMoto(){
        if(nuevoSistemaSonido == true){
            return "La moto tiene un Sistema de sonido moderno";
        } else{
            return "La moto tiene un sistema de sonido Stock";
        }
    }

}
