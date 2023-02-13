
public class Season {

    private int number;
    private Episode[] episodes;
    private int episodesNumber;
    private int year;

    public Season(int number, int maxEpisodes, int year) {
        this.number = number;
        this.episodes = new Episode[maxEpisodes];
        this.episodesNumber = 0;
        this.year = year;
    }

    public void add(Episode e) {
        if (this.episodesNumber < this.episodes.length) {
            this.episodes[this.episodesNumber++] = e;
        }
    }

    public boolean sameSeason(int seasonNumber) {
        return this.number == seasonNumber;
    }

    public int episodesNumber() {
        return this.episodesNumber;
    }

    public boolean longest(Season s) {
        return this.episodesNumber > s.episodesNumber;
    }

    public double averageEpisodeDuration() {
        int totalDuration = 0;

        for (int i=0;i<this.episodesNumber;i++) {
            totalDuration = totalDuration + this.episodes[i].getDuration();
        }

        return ((double)totalDuration/this.episodesNumber);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Temporada "+this.number + ", "+this.episodesNumber + " episodios, año "+this.year+"\n");
        for (int i=0;i<this.episodesNumber;i++) {
            sb.append(this.episodes[i]+"\n");
        }

        return sb.toString();
    }

}
