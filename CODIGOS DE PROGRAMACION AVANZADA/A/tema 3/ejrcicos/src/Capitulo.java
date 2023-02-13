public class Capitulo {
  private int tiempo;
  private String titulo;
  public  Capitulo(){
      this.tiempo=0;
      this.titulo="";
  }
  public  Capitulo(int  tiempo,String titulo){
      this.tiempo=tiempo;
      this.titulo=titulo;
  }
  public  int Duracion(){
      return  this.tiempo;
  }
    public String toString() {
        return this.titulo+","+this.tiempo;
    }
}
