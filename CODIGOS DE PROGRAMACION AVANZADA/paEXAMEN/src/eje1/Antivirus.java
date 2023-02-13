package eje1;

public   class Antivirus {
    private  int precio;

    public  Antivirus(int precio){
        this.precio=precio;

    }

    @Override
    public String toString() {
        return  this.actualizar(0);
    }
    public  int actualizar(int a){
        return  this.precio+a;
    }

}


