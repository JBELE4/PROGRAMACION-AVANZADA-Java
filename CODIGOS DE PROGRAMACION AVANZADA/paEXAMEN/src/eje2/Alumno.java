package eje2;

public class Alumno  extends  Persona {
    private Carrera cr;

    public Alumno(int edad, String dni, String nombre, String apellidos, Fecha inicio, Carrera cr) {
        super(edad, dni, nombre, apellidos);
        this.cr = cr;
    }

    @Override
    public String toString() {
        return super.toString()+"Alumno{" +
                "cr=" + this.cr +
                '}';
    }
}

