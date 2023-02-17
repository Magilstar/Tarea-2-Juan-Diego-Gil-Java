import java.lang.constant.Constable;

public class Coche {
    private int ruedas;
    private int largo;
    private int ancho;
    private int motor;
    private int peso;
    private String color;
    private int pesoTotal;
    private int pesoPlataforma;
    private boolean asientoCuero, climatizador;

    public Coche(){
        ruedas = 4;
        largo = 2000;
        ancho = 300;
        motor = 1600;
        peso = 500;
        pesoPlataforma = 500;
    }
    public String dimeDatosGeneralesCoche(){ //El getter
        return "La plataforma del vehiculo tiene "+ ruedas+ " ruedas. Tambien mide unos " + largo/1000 + " metros de largo y de" +
                "ancho unos " + ancho +" cm, con un peso de la plataforma de " + pesoPlataforma + " kg";
    }

    public void establecerColor (String colorCoche) { //Setter
        color = colorCoche;
    }

     public String dimeColor(){ //getter
        return "El color del coche es: " +color;
     }

     public void configurarAsientos(String asientoCuero){//Setter
        if(asientoCuero.equalsIgnoreCase("Si")){
            this.asientoCuero = true;
        }
        else {
            this.asientoCuero = false;
        }
     }

     public String dimeAsientos(){
        if(asientoCuero == true){
            return "El coche tiene asientos de cuero";
        }
        else {
            return "El coche tiene asientos serie";
        }
     }

     public void configurarClimatizador(String climatizador){//Setter
        if(climatizador.equalsIgnoreCase("si")){
            this.climatizador = true;
        }else{
            this.climatizador = false;
        }
    }
    public String dimeClimatizador(){ //getter
        if(climatizador == true){
            return "El coche Si tiene climatizador";
        }else{
            return "El coche lleva Aire Acondicionado";
        }
    }

    public String dimePesoCoche(){//Setter y getter
        int pesoCarroceria = 500;
        pesoTotal =  pesoPlataforma + pesoCarroceria;

        if(asientoCuero == true){
            pesoTotal = pesoTotal + 15;
        }

        if(climatizador == true){
            pesoTotal = pesoTotal + 120;
        }
        return "El peso del Coche es: " + pesoTotal;
    }

    public int precioCoche(){
        int precioFinal = 10000;
        if(asientoCuero == true){
            precioFinal+=2000;
        }
        if(climatizador == true){
            precioFinal+=1500;
        }
        return precioFinal;
    }


};

