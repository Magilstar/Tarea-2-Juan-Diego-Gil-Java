public class Camioneta {
    private int ruedas;
    private int motor;
    private int ancho;
    private int largo;
    private int pesoTotal;
    private String  colorCarrozzeria;
    private String colorInterior;
    private boolean cueroMuebles, climatizador, nuevoSistemaSonido, cuatroXCuatro;

    public Camioneta(){
        ruedas = 4;
        motor = 2000;
        ancho = 2500;
        largo = 6000;
        pesoTotal = 3250;
        colorCarrozzeria = "gris";
        colorInterior = "blanco";
        cueroMuebles = false;
        climatizador = false;
        nuevoSistemaSonido = false;
        cuatroXCuatro = false;
    }

    public String dimeDatosGeneralesCamioneta(){ //getter
        return "La camioneta promedio contiene" + ruedas +" ruedas, y un motor de: " +motor + " caballos de fuerza, "+
                "ademas tiene un peso total de: " + pesoTotal +"Kg y tiene un ancho x largo de : " + ancho +"x" +largo;
    }

    public void establecerColorCamioneta (String color){
        colorCarrozzeria = color;
    }
    public void establecerColorInterior (String color){
        colorInterior = color;
    }
    public String dimeColoresCamioneta(){
        return "El color de la carrozzeria es: "+ colorCarrozzeria+ " y su color interior es: " +colorInterior;
    }

    public void configurarAsientosCamioneta(String asientoCuero){
        if(asientoCuero.equalsIgnoreCase("Si")){
            this.cueroMuebles = true;
        }
    }
    public String dimeAsientosCamioneta(){
        if(cueroMuebles == true){
            return "El coche tiene asientos de cuero";
        }
        else {
            return "El coche tiene asientos serie";
        }
    }
    public void acondicionadorCamioneta(String sistemaAcondicionador){
        if(sistemaAcondicionador.equalsIgnoreCase("Si")){
            this.climatizador = true;
        }
    }
    public String dimeAcondicionadorCamioneta(){
        if(climatizador == true){
            return "El coche tiene un Climatizador";
        }
        else {
            return "El coche tiene solamente Aire Acondicionado";
        }
    }

    public void sistemaSonidoCamioneta(String sistemaSonido){
        if(sistemaSonido.equalsIgnoreCase("Si")){
            this.nuevoSistemaSonido = true;
        }
    }
    public String dimeSistemaSonidoCamioneta(){
        if(nuevoSistemaSonido == true){
            return "La camioneta tiene Sistema de Sonido Nuevo";
        }
        else {
            return "El coche tiene Sistema de Sonido de serie";
        }
    }

    public void configurar4xCuatro(String fourByFour ){
        if(fourByFour.equalsIgnoreCase("Si")){
            this.cuatroXCuatro = true;
        }
    }
    public String dime4xCuatroCamioneta(){
        if(cuatroXCuatro == true){
            return "El coche tiene 4x4";
        }
        else {
            return "El coche es 2x4";
        }
    }


}
