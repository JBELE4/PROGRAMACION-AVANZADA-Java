package eje2;

public class Personal extends Persona {
    private Fecha inicio;
    public Personal(int edad,String dni,String nombre,String apellidos,Fecha inicio){
        super(edad,dni,nombre,apellidos);
        this.inicio=inicio;

    }

    @Override
    public String toString() {
        return super.toString()+"Personal{" +
                "inicio=" + this.inicio +
                '}';
    }
}
