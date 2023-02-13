import java.util.Arrays;

public class Empresa {
    private Empleado[]empleados;
    private int numEMpleados;

    public Empresa(int numerodeempelados){
        this.empleados=new Empleado[numerodeempelados];
        this.numEMpleados=0;
    }

    public void añañdierEmpelado(Empleado empleado){
        if(this.numEMpleados<this.empleados.length){
        this.empleados[this.numEMpleados++]=empleado;
    }
    }
    public void añañdiExtras(int horas,Nif dni){
        for (int i=0;i<this.numEMpleados;i++){
            if(this.empleados[i].devolDNI()==dni){
                this.empleados[i].meterHorasExtras(horas);
            }
        }

    }
    public void porcentajeExtras(){
        int contador=0;
        for (int i=0;i<this.numEMpleados;i++){
            if(this.empleados[i].devolverHoras()>=0 ){
                contador++;
            }

        }
        float porcentaje=(contador *100)/this.numEMpleados;

        System.out.println("El porcentaje es:"+porcentaje+"%");

    }
    public void mediaEdad(){
        float media=0;
        for (int i=0;i<this.numEMpleados;i++){
           media=this.empleados[i].devolverEdad()+media;

        }
        media=media/this.numEMpleados;

        System.out.println("El porcentaje es:"+media+"%");

    }
    public void imprimirDNI(Nif dni){
        for (int i=0;i<this.numEMpleados;i++){
            this.empleados[i].imprimirIgual(dni);
        }
    }
    //aprender burbuja
    public void organizsSueldo(){
         Empleado aux;
        for (int i=0;i<this.numEMpleados-1;i++) {
            for(int j=i+1;j<this.numEMpleados;i++){
                if(this.empleados[j].devolverSueldo()<this.empleados[i].devolverSueldo()){
                    aux=this.empleados[j];
                    this.empleados[j]=this.empleados[i];
                    this.empleados[i]=this.empleados[j];
                }
            }

        }

    }
    public int verRicos(int sueldo){
        int  contador=0;
        for (int i=0;i<this.numEMpleados;i++) {
            if( this.empleados[i].devolverSueldo()>=sueldo){
                contador++;
            }
        }
     return  contador;
    }
    private void verRagos(){
        int rango1=0,rango2=0,rango3=0,rango4=0;
        for (int i=0;i<this.numEMpleados;i++){
            switch (this.empleados[i].verRngo() )   {
                case 1:
                    rango1++;break;
                case 2:
                    rango2++;break;
                case 3:
                    rango3++;break;
                case 4:
                    rango4++;break;
                default:break;
            }
        }

        System.out.println("Del primer rango hay:"+rango1+" Del segundo rango:"
                +rango2+" Del tercer rango:"+rango3+" Del cuarto rango:"+rango4);
    }

    @Override
    public String toString() {
        StringBuilder s=new StringBuilder();
        s.append("tiene estos empelados\n");
        for (int i=0;i<this.numEMpleados;i++){
            s.append(this.empleados[i].toString());
        }
        return s.toString();

    }

    public static void main(String[] args) {
        Empresa e=new Empresa(2);
        Empleado emp=new Empleado("javier","burgos",50,50,5000 );
        e.añañdierEmpelado(emp);
        System.out.println(e.toString());

    }
}
