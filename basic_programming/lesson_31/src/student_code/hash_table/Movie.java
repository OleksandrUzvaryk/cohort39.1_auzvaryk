package student_code.hash_table;

public class Movie {

    private String movieName;
    private int durationMinutes;


    public Movie(String movieName, int durationMinutes) {
        this.movieName = movieName;
        this.durationMinutes = durationMinutes;
    }

    @Override
    public int hashCode() {
        int hashCode = 31*movieName.hashCode() + durationMinutes*31;


        return hashCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o){return true;}

        if (o == null && !(o instanceof Movie)) {
            return false;
        }

        Movie movie  = (Movie) o;



        return  this.movieName.equals(movie.movieName)&& this.durationMinutes == movie.durationMinutes;
    }


    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public int getDurationMinutes() {
        return durationMinutes;
    }

    public void setDurationMinutes(int durationMinutes) {
        this.durationMinutes = durationMinutes;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "movieName='" + movieName + '\'' +
                ", durationMinutes=" + durationMinutes +
                '}';
    }
}
