package Estructuras.pdf.practtica.eje5;

public class Peticion {
    private  String resquest;
    public  Peticion(String s){
        this.resquest=s;
    }

    public String getResquest() {
        return resquest;
    }

    @Override
    public String toString() {
        return "Peticion{" +
                "resquest='" + resquest + '\'' +
                '}';
    }
}
