package Estructuras.pdf.practica2.eje3;

import java.util.Objects;

public class Alumno {
    private  int exp;
    private  String n;
    public Alumno(int exp,String n){
        this.exp=exp;
        this.n=n;

    }

    public int getExp() {
        return exp;
    }

    public String getN() {
        return n;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Alumno alumno = (Alumno) o;
        return exp == alumno.exp &&
                Objects.equals(n, alumno.n);
    }

    @Override
    public int hashCode() {
        return Objects.hash(exp, n);
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "exp=" + exp +
                ", n='" + n + '\'' +
                '}';
    }
}
