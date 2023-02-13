import java.util.Arrays;

public class Empleado {
    private  String nombre;
    private String apellido;
    private Nif dni;
    private int edad;
    private int sueldo;
    private int horasExtrrras;
    private Intervalos[]edadesT;



    private  int contadorIntervalo;


    public  Empleado(String nombre,String apellido,int edad,int sueldo ,int numeroIntervalos){
    this.nombre=nombre;
    this.apellido=apellido;
    this.dni=new Nif();
    this.dni.recoger();
    this.edad=edad;
    this.sueldo=sueldo;
    this.horasExtrrras=0;
    this.edadesT=new Intervalos[numeroIntervalos];
    this.contadorIntervalo=0;
    }
    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", dni=" + dni +
                ", edad=" + edad +
                ", sueldo=" + sueldo +
                ", horasExtrrras=" + horasExtrrras +
                ", edadesT=" + Arrays.toString(edadesT) +
                ", contadorIntervalo=" + contadorIntervalo +
                '}';
    }
    public  void meterHorasExtras(int horas){
        this.horasExtrrras=horas;

    }
    public void imprimirIgual( Nif dni) {
        if (this.dni.igual(dni)) {
            System.out.println("nombre:"+this.nombre+" "+"apellido:"+this.apellido+" "+"edad:"+this.edad);
            System.out.println("sueldo:"+this.sueldo+" "+this.horasExtrrras);

        }

    }
    public int verRngo(){
        int contador=1;
        for (int i=0;i<this.edadesT.length;i++) {
            if ((edadesT[i].deovlverItI() <=this.edad)&&(edad <=this.edadesT[i].deovlverItS())){
                this.contadorIntervalo=contador;

            }
            contador++;
        }
        return  contador;
    }
    public  int devolverEdad(){return this.edad;
    }

    public  int devolverSueldo(){
        return this.sueldo;
    }
    public  int devolverHoras(){
        return this.horasExtrrras;
    }
    public  Nif devolDNI(){
        return this.dni;
    }


}
