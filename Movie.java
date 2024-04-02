import javax.swing.Action;

abstract public class Movie {
    private String title;
    private String director;
    private String releaseDate;
    private double durationInMinutes;
    private String protaganist;
    
    public Movie(String title, String director, String releaseDate,
                 double durationInMinutes, String protaganist)
    {
        this.title = title;
        this.director = director;
        this.releaseDate = releaseDate;
        this.durationInMinutes = durationInMinutes;
        this.protaganist = protaganist;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public double getDurationInMinutes() {
        return durationInMinutes;
    }

    public void setDurationInMinutes(double durationInMinutes) {
        this.durationInMinutes = durationInMinutes;
    }

    public String getProtaganist() {
        return protaganist;
    }

    public void setProtaganist(String protaganist) {
        this.protaganist = protaganist;
    }

    public abstract void getMovieDetails();
}

class RomComMovie extends Movie {
    private String leadHero;
    private String leadHeroine;

    public RomComMovie(String title, String director, String releaseDate,
                       double duration, String protaganist, String leadHero,
                       String leadHeroine)
    {
        super(title, director, releaseDate, duration, protaganist);
        this.leadHero = leadHero;
        this.leadHeroine = leadHeroine;
    }

    @Override
    public void getMovieDetails() {
        System.out.println("Title: " + getTitle());
        System.out.println("Directed By: " + getDirector());
        System.out.println("Released on: " + getReleaseDate());
        System.out.println("Runtime in minutes: " + getDurationInMinutes());
        System.out.println("Protaganist name: " + getProtaganist());
        System.out.println("Lead Hero: " + leadHero);
        System.out.println("Lead Heroine: " + leadHeroine);
        System.out.println();
    }
}

class ActionMovie extends Movie {
    private String leadHero;
    private String leadHeroine;

    public ActionMovie(String title, String director, String releaseDate,
                       double duration, String protaganist, String leadHero,
                       String leadHeroine)
    {
        super(title, director, releaseDate, duration, protaganist);
        this.leadHero = leadHero;
        this.leadHeroine = leadHeroine;
    }

    @Override
    public void getMovieDetails() {
        System.out.println("Title: " + getTitle());
        System.out.println("Directed By: " + getDirector());
        System.out.println("Released on: " + getReleaseDate());
        System.out.println("Runtime in minutes: " + getDurationInMinutes());
        System.out.println("Protaganist name: " + getProtaganist());
        System.out.println("Lead Hero: " + leadHero);
        System.out.println("Lead Heroine: " + leadHeroine);
        System.out.println();
    }
}

class MovieMain {
    public static void main(String[] args) {
        Movie m1 = new RomComMovie("LaLa Land", "Damian Chazelle", "1/5/2016", 136.0,
                                   "Sebastian Wilder", "Ryan Gosling", "Emma Stone");
        Movie m2 = new ActionMovie("Interstellar", "Christopher Nolan","7/6/2014", 124.7,
                                   "Cooper", "Mathew McConaghye", "Anne Hathaway");

        m1.getMovieDetails();
        m2.getMovieDetails();

    }
}
