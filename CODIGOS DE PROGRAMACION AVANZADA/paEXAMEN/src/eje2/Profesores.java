package eje2;

public class Profesores  extends Personal{
    private String departamento;
    public Profesores(int edad, String dni, String nombre, String apellidos, Fecha inicio,String departamento){
        super(edad, dni, nombre, apellidos, inicio);
        this.departamento=departamento;
    }

    @Override
    public String toString() {
        return  super.toString()+"Profesores{" +
                "departamento='" + this.departamento + '\'' +
                '}';
    }
}
