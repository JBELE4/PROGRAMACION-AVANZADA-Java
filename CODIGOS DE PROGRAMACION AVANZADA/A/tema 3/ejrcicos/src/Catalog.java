public class Catalog {
    private Electrodo[] electrodos;
    private int numero_Producto;
    public  Catalog(int  stockMax){
        this.electrodos=new Electrodo[stockMax];
        this.numero_Producto=0;

    }
    public  boolean Llena(){
        return this.electrodos.length==this.numero_Producto;
    }
    public  boolean Vacía(){
        return this.numero_Producto<=0;
    }
    public void Añadir(Electrodo e) {
        if (!this.Llena()) {
            this.electrodos[this.numero_Producto] = e;
            this.numero_Producto++;
        }
    }
      public void imprimir(){
            System.out.println("LA TABAL CONTIENE");
            for (int i=0;i<this.numero_Producto;i++){
                System.out.println(this.electrodos[i]);
            }
        }
        public void imprimirPorCarga(char carga){
            System.out.println("LA TABAL CONTIENE"+carga);
            for (int i=0;i<this.numero_Producto;i++){
                if (this.electrodos[i].SameConsumo(carga)){
                    System.out.println(this.electrodos[i]);
                }

            }
        }
        public void imprimirPorProductoycargag(Electrodo e){
            System.out.println("LA TABAL CONTIENE");
            for (int i=0;i<this.numero_Producto;i++) {
                if (this.electrodos[i].MenoroIgual(e) && this.electrodos[i].Sameproducto(e)) {
                    System.out.println(this.electrodos[i]);
                }
            }

            }

    public static void main(String[] args) {
        Catalog a=new Catalog(2);
        a.Añadir(new Electrodo("lavadora",50,20,'F',"BOOS"));
        a.Añadir(new Electrodo("lavadora",70,20,'A',"BOOS"));
        a.imprimir();
        a.imprimirPorCarga('F');
    }



    }

