import java.util.Arrays;
import java.util.Scanner;

public class Pila {
    private  Fraccion[]fracciones;
    private  int posicionCima;
    public Pila (int size){
       this.fracciones=new Fraccion[size];
       this.posicionCima=-1;
    }
    public boolean vacia(){
        return  this.posicionCima<=-1;
    }

    public boolean llena(){
        return  this.fracciones.length-1<=this.posicionCima;
    }
    public void apilar(Fraccion i){
        if(!this.llena()){
            this.fracciones[this.posicionCima++]=i;

        }
    }
    public void desapilar(){
        if (this.llena()){
            this.posicionCima--;
        }
    }
    public String toString() {
        String resulatado="{"
                for(int i =0;)

        return }
    /*public Pila(int  size){
        this.fracciones=new Fraccion[size];
        this.posicionCima=-1;
    }
    public Fraccion cima(){
        if(!this.vacia()){
            return this.fracciones[this.posicionCima];
        }
        return  null;
    }
    public boolean  vacia(){
        return  this.posicionCima<0;
        }
    public boolean  llena (){
        return  this.posicionCima>=this.fracciones.length-1;
    }
    public void apilar(Fraccion f){
        if(!this.llena()){
            this.fracciones[this.posicionCima]=f;
            this.posicionCima ++;
        }
    }


    public String toString() {
            String resultado="{";
        for (int i=0;i<=this.posicionCima;i++){
          resultado=resultado+ this.fracciones[i]+";";

        }
        resultado= resultado+"}";
    }


    public static void main(String[] args) {

    }*/
}
