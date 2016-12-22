public class Shopper {

    public static void main(String[] args) {
        Cart cart = new Cart();
        cart.add(new Movie("Super Troopers", Genre.COMEDY));
        cart.add(new Movie("Office Space", Genre.COMEDY));
        cart.add(new Movie("Fight Club", Genre.DRAMA));
        System.out.printf("%-40s  %6s%n", "Movie", "Price");
        for (Movie movie: cart.getMovies()) {
            // : this movie price calculation will go away after you
            // create your new polymorphic movie classes
            int price = (movie.getGenre() == Genre.COMEDY) ? 3 : 4;
            System.out.printf("%-40s $%6d%n", movie, price);
        }
        System.out.printf("%-40s $%6d%n", "Total:", cart.totalPrice());
    }
}
