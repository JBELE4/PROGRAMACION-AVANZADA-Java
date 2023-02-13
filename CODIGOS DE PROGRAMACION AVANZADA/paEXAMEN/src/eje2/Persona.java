package eje2;

public class Persona {
    private  String dni;
    private  int edad;
    private  String nombre;
    private  String apellidos;
    public Persona(int edad,String dni,String nombre,String apellidos){

        this.apellidos=apellidos;
        this.dni=dni;
        this.edad=edad;
        this.nombre=nombre;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "dni='" + this.dni + '\'' +
                ", edad=" + this.edad +
                ", nombre='" + this.nombre + '\'' +
                ", apellidos='" + this.apellidos + '\'' +
                '}';
    }
}
