package eje2;

public enum Admintr {
    Biblioteca, Rectorado, Secretaría, Registro;

    public String devolver() {
        String result=null;
        switch (this){
            case Rectorado:
               result="Rectorado";
            break;
            case Registro:
                result="Registro";
            break;
            case Biblioteca:
                result= "Biblioteca";
            break;
            case Secretaría:
                result= "Secretaría";
            break;
        }
        return result;


    }
}
