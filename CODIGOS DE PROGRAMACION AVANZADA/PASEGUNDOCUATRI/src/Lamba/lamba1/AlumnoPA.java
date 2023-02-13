package Lamba.lamba1;

public class AlumnoPA {
    private double nota;
    private int num_matricula;
    private String expediente;
    public AlumnoPA(double nota, int num_matricula, String expediente) {
        this.nota= nota;
        this.num_matricula = num_matricula;
        this.expediente = expediente;
    }
    public boolean notaEnRango(double min, double max) {
        return this.nota >= min && this.nota <=max;
    }
    public boolean mayorNumMatriculas(int matriculas) {
        return this.num_matricula > matriculas;
    }
    public String toString() {
        return "Alumno con expediente " +this.expediente+ ", nota " +
                this.nota+ " y "+ this.num_matricula + " números de matrícula";
    }

}
