public class TvSe {
    private String nombreTV;
    private int numerodeTempoTotal;
    private Temporada[]temporada;
    public TvSe(int numerodeTempoTotal,String nombreTV){
        this.nombreTV=nombreTV;
        this.temporada=new Temporada[numerodeTempoTotal];
        this.numerodeTempoTotal=0;
    }
    public  void  addTemporada(Temporada e){
        if(this.temporada.length<numerodeTempoTotal){
            this.temporada[numerodeTempoTotal++]=e;
        }

    }
    public double mediaespisodiso(int nuemrotemporasa){
        double result=0.0;
        if(nuemrotemporasa<=this.numerodeTempoTotal){
            boolean busquedsa=false;
            int i=0;
            while (!busquedsa){
                busquedsa=this.temporada[i++].igual(nuemrotemporasa);

            }
            if(busquedsa){
                result =this.temporada[i].MediaCapitulos();
            }
            return result;
        }
        return result;
    }
    public String toString() {
        StringBuilder c=new StringBuilder();
        for (int i=0;i<this.temporada.length;i++){
            c.append(this.temporada[i]+"\n");

        }
        return  c.toString();

    }
    public void  MasLarga(){
        Temporada aux = this.temporada[0];
        for (int i = 1; i < this.numerodeTempoTotal; i++) {
            if (this.temporada[i].larga(aux)){
                aux=this.temporada[i];
            }
        }
        System.out.println(aux);
    }

    public static void main(String[] args) {
        TvSe tv=new TvSe(2,"HOLA");
        Temporada uno=new Temporada(1,2,2020);
        uno.Añadir(new Capitulo(50,"hola"));
        uno.Añadir(new Capitulo(70,"la"));
            tv.addTemporada(uno);
            Temporada dos=new Temporada(2,3,200);
        dos.Añadir(new Capitulo(50,"HOLA"));
        dos.Añadir(new Capitulo(80,"HAASSAOLA"));
        dos.Añadir(new Capitulo(50,"HOSDSDSDSLA"));
        tv.addTemporada(dos);
        tv.MasLarga();




    }
}
