class Movie {
    private String movieName;
    private String movieHero;
    private String movieHeroin;
    private int movieBuget;
    private int tiketPrice;

    public String getMovie_Name() {
        return movieName;
    }

    public void setMovie_Name(String movieName) {
        this.movieName = movieName;
    }

    public String getMovie_Hero() {
        return movieHero;
    }

    public void setMovie_Hero(String movieHero) {
        this.movieHero = movieHero;
    }

    public String getMovie_Heroin() {
        return movieHeroin;
    }

    public void setMovie_Heroin(String movieHeroin) {
        this.movieHeroin = movieHeroin;
    }

    public int getMovie_Buget() {
        return movieBuget;
    }

    public void setMovie_Buget(int movieBuget) {
        this.movieBuget = movieBuget;
    }

    public int getTiket_Price() {
        return tiketPrice;
    }

    public void setTiket_Price(int tiketPrice) {
        this.tiketPrice = tiketPrice;
    }

}

public class Getter_Setter1 {
    public static void main(String[] args) {
        Movie m = new Movie();

        m.setMovie_Name("Sallar");
        m.setMovie_Hero("Prabhash");
        m.setMovie_Heroin("Sruti Hasan");
        m.setMovie_Buget(4000000);
        m.setTiket_Price(200);

        System.out.println(m.getMovie_Name() + " : " + m.getMovie_Hero() + " : " + m.getMovie_Heroin() + " : "
                + m.getMovie_Buget() + " : " + "Tiket Price: "+ m.getTiket_Price());

    }
}