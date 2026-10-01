class MovieQ10 {
    String name;
    String genre;
    double rating;
    static String industry = "Bollywood";

    void display() {
        String movieName = name;
        String movieGenre = genre;
        double movieRating = rating;

        System.out.println("Name: " + movieName);
        System.out.println("Genre: " + movieGenre);
        System.out.println("Rating: " + movieRating);
        System.out.println("Industry: " + industry);
    }

    public static void main(String[] args) {
        MovieQ10 m = new MovieQ10();
        m.name = "3 Idiots";
        m.genre = "Comedy";
        m.rating = 8.4;
        m.display();
    }
}