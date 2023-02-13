public class Temporada {
    private int  numero;
    private  int año;
    private Capitulo[]capitulos ;
    private int numeroDepisosidos;


    public  Temporada( int numero,int numeroMAx,int año){
        this.numero=numero;
        this.año=año;
        this.capitulos=new Capitulo[numeroMAx];
        this.numeroDepisosidos=0;

    }
    public  float MediaCapitulos(){
        float suma=0;
        int  contador =0;
        for (int i=0;i<this.capitulos.length;i++){
            suma=suma + capitulos[i].Duracion();
            contador++;
        }
       suma=suma/contador;

        return suma ;
    }
    public  void Añadir(Capitulo e){
        if(this.numeroDepisosidos<this.capitulos.length){
            this.capitulos[this.numeroDepisosidos++]=e;
        }
    }

    public boolean igual(int numeroTemporada){
        return  this.numero==numeroTemporada;

    }
    public int deolverNEpisodio(){
        return  this.numeroDepisosidos;

    }
    public int deolverAño(){
        return  this.año;

    }

    public boolean larga(Temporada t){
        return this.numeroDepisosidos>t.numeroDepisosidos;
    }

    @Override
    public String toString() {
        StringBuilder sb=new StringBuilder();
        sb.append("Temporada"+this.numero+","+this.numeroDepisosidos+"episodios,año"+this.año+"\n");
        for (int i=0;i<this.numeroDepisosidos;i++){
            sb.append(this.capitulos[i]+"\n");
        }
        return  sb.toString();

    }
}

