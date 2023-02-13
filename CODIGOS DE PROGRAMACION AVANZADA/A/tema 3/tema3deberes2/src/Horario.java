public class Horario {
    private String horaInico;
    private String horafinalico;
    public  Horario(String horaInico,String horafinalico){
        this.horaInico=horaInico;
        this.horafinalico=horafinalico;
    }

    @Override
    public String toString() {
        return "Horario{" +
                "horaInico='" + horaInico + '\'' +
                ", horafinalico='" + horafinalico + '\'' +
                '}';
    }
}
