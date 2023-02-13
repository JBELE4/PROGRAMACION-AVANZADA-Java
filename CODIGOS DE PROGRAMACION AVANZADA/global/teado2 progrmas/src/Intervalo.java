public class Intervalo {
private double extrmoBajo;
private double extrmoAlto;



    //cosntructores
    public Intervalo (){
        //this.extrmoBajo=0.0;
        //this.extrmoAlto=0.0;
        this(0.0,0.0);

    }
    public Intervalo (Intervalo a){

        //this.extrmoAlto=a.extrmoAlto;
        //this.extrmoBajo=a.extrmoBajo;
        this(a.extrmoBajo,a.extrmoAlto);

    }
    public Intervalo(double extremoInferior ,double extremoSuperior){
        extrmoBajo=extremoInferior;
        extrmoAlto=extremoSuperior;
    }
    public Intervalo(double extremoSuperior){

        //extrmoAlto= extremoSuperior;
        this(0.0,extremoSuperior);
    }
    //visualizar intervalos
    public void printf() {
        System.out.print("ele  intervalo es "+this);
    }

  public String toString() {
        return (+extrmoBajo+" "+extrmoAlto);
    }

    //calcular longitud
    public double longitud() {
        double contador;
        /*for (int i=0;i<this.length();i++){
            contador++;
        }*/
        contador=extrmoAlto-extrmoBajo;
        return contador;
    }

    //indicar   intervalo dsitinto
    public boolean esIgual(Intervalo i) {
        boolean comprobante=false;
    if((extrmoAlto==i.extrmoAlto)&&(extrmoBajo==i.extrmoBajo)){
        comprobante=true;
    }
     return  comprobante;
    }

    //desplazar cierto valor
    public  void desplazar(int valor){
     extrmoBajo=extrmoBajo+valor;
     extrmoAlto=extrmoAlto+valor;
    }
    //unir
    public Intervalo unir(Intervalo i){
        if(extrmoAlto<=i.extrmoAlto){
            extrmoAlto=i.extrmoAlto;
        }
        if(extrmoBajo<=i.extrmoBajo){
            extrmoBajo=i.extrmoBajo;
        }
        return this;

    }
   /*public  void unir2 (Intervalo i ,Intervalo resultado){

    }*/
    //indicar si es cierto valro esta en el   intervalo
   public boolean incluye(int valor){
       boolean incluir=false;
       if((extrmoAlto>=valor)&&(extrmoBajo<=valor)){
           incluir=true;
       }
       return incluir;

   }
    //indicar si intervalo esta  includio  en el intervalo
    public boolean contienIntervalo(Intervalo i){
        boolean comprobante=false;
        if((extrmoAlto>=i.extrmoAlto)&&(extrmoBajo<=i.extrmoBajo)){
            comprobante=true;
        }
        return  comprobante;
    }

    public static void main(String[] args) {
        Intervalo i = new Intervalo(80.0,400.0);
        Intervalo i2=new Intervalo(82.0,402.0);
        i.printf();
        System.out.println();
      System.out.println(i);
     double a= i.longitud();
        System.out.println("la longitud: "+a);
        System.out.println(!i.esIgual(i2));
     i.desplazar(2);
        System.out.println(i);
        System.out.println(i.unir(i2));
        System.out.println(i.incluye(21));
        System.out.println(i.contienIntervalo(i2));

       // Intervalo resultado=i.unir(i2);
       /* Intervalo resultado=null;
        i.unir2(i2,resultado);*/

    }
}