package eje2;

public class Admin extends  Personal {
    private Admintr trabajo;

    public Admin(int edad, String dni, String nombre, String apellidos, Fecha inicio, Admintr trabajo) {
        super(edad, dni, nombre, apellidos, inicio);
        this.trabajo = trabajo;


    }

    @Override
    public String toString() {
        return super.toString()+"Admin{" +
                "trabajo=" + this.trabajo +
                '}';
    }
}
