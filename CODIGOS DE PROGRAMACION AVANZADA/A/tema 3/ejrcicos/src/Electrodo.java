public class Electrodo {
    private String producto;
    private int precio;
    private int peso;
    private char consumo;
    private String marca;

     public Electrodo(){
         this("lavadora",50,20,'F',"BOOS");
         this.Modificr();

    }
    public  Electrodo (String producto,int precio,int peso,char consumo,String marca){
    this.producto=producto;
    this.precio=precio;
    this.peso=peso;
    this.consumo=consumo;
    this.marca=marca;
    this.Modificr();

    }
    private  void Modificr(){
         switch(this.consumo){
             case 'A': this.precio=this.precio+100;break;
             case 'B': this.precio=this.precio+80;break;
             case 'C': this.precio=this.precio+60;break;
             case 'D': this.precio=this.precio+50;break;
             case 'E': this.precio=this.precio+30;break;
             case 'F': this.precio=this.precio+10;break;
             default:break;

         }
    }
    public boolean MenoroIgual(Electrodo e){
         return this.peso<=e.peso;
    }
    public boolean Sameproducto(Electrodo e){
         return this.producto.equals(e.producto);

    }
    public boolean SameConsumo(char consumo){
         return this.consumo==consumo;
    }
    public String toString() {
        return this.producto + " de la marca "+ this.marca+",\n"+
                " de peso "+ this.peso + " kilos, con eficiencia energetica " + this.consumo
                + " y un coste de " + this.precio + " euros";
    }
}








