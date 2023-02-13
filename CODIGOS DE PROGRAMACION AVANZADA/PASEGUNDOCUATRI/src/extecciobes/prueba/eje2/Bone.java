package extecciobes.prueba.eje2;

import extecciobes.eje1.Bono;

public class Bone {
    private  int pasta;
    private  int  cont;
    public Bone(int past, int a){
        this.pasta=past;
        this.cont=a;

    }
    public  void haceViaje()throws Exceptio{
        if(cont<=0){
            throw  new Exceptio();
        }
        else {
        cont--;}
    }
}
