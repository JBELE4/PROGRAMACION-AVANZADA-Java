public class TVSerie {

    private String name;
    private Season[] seasons;
    private int seasonNumber;

    public TVSerie(String name, int maxSeasonsNumber) {
        this.name = name;
        this.seasons = new Season[maxSeasonsNumber];
        this.seasonNumber = 0;
    }

    public void add(Season s) {
        if (this.seasonNumber < this.seasons.length) {
            this.seasons[this.seasonNumber++] = s;
        }
    }

    public double averageEpisodeDuration(int seasonNumber) {
        if (seasonNumber <= this.seasonNumber) {
            double result = 0.0;
            boolean found = false;
            int i = 0;
            while (!found) {
                found = this.seasons[i++].sameSeason(seasonNumber);
            }

            if (found) {
                result = this.seasons[i - 1].averageEpisodeDuration();
            }
            return result;
        }

        return 0.0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < this.seasons.length; i++) {
            sb.append(this.seasons[i] + "\n");
        }

        return sb.toString();
    }

    public void printLongestSeason() {
        Season sAux = this.seasons[0];

        for (int i = 1; i < this.seasonNumber; i++) {
            if (this.seasons[i].longest(sAux)) {
                sAux = this.seasons[i];
            }
        }

        System.out.println(sAux);
    }

    public static void main(String[] args) {
        TVSerie serie = new TVSerie("Breaking bad", 10);
        Season one = new Season(1, 7, 2008);
        one.add(new Episode("Pilot", 75));
        one.add(new Episode("Cat's in the Bag...", 64));
        one.add(new Episode("..And the Bag's in the River", 64));
        one.add(new Episode("Cancer Man", 89));
        one.add(new Episode("Gray Matter", 60));
        one.add(new Episode("Crazy Handful of Nothin", 55));
        one.add(new Episode("A No-Rough-Stuff-Type Deal", 45));

        serie.add(one);

        Season two = new Season(2, 5, 2009);
        two.add(new Episode("Seven Thirty-Seven", 45));
        two.add(new Episode("Grilled", 75));
        two.add(new Episode("Bit by a Dead Bee", 85));
        two.add(new Episode("Down", 92));
        two.add(new Episode("Breakage", 82));

        serie.add(two);

        System.out.println("La temporada más larga de la serie es:");
        serie.printLongestSeason();
        System.out.println("--------------------");
        System.out.println("Media duración episodios de la temporada 2: "+serie.averageEpisodeDuration(2));

    }
}
