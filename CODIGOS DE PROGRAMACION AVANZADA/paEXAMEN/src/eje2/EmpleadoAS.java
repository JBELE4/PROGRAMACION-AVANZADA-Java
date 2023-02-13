package eje2;

public class EmpleadoAS  extends Personal{
    private Fecha fin;
    public EmpleadoAS(int edad,String dni,String nombre,String apellidos,Fecha inicio,Fecha fin){
        super(edad,dni,nombre,apellidos, inicio);
        this.fin=fin;

    }

    @Override
    public String toString() {
        return  super.toString()+"EmpleadoAS{" +
                "fin=" + this.fin +
                '}';
    }
}
