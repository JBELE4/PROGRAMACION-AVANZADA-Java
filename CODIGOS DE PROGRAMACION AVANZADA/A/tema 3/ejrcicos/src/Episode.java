public class Episode {
    private String title;
    private int duration;

    public Episode(String title, int duration) {
        this.title = title;
        this.duration = duration;
    }

    public int getDuration() {
        return this.duration;
    }

    public String toString() {
        return this.title + ", " + this.duration + " minutos";
    }
}
