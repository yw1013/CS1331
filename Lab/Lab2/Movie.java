public class Movie {

    private String name;
    private Genre genre;

    public Movie(String name) {
        this(name, Genre.COMEDY);
    }

    public Movie(String name, Genre genre) {
        this.name = name;
        this.genre = genre;
    }

    public Genre getGenre() {
        return genre;
    }

    public int getPrice(){
        return 0;
    }
}

// public abstract class Movie {
//
//     private String name;
//     private int ComedyMovie;
//     private int DramaMovie;
//     private int ScifiMovie;
//     private int ActionMovie;
//     private int Genre;
//
//     public int getPrice() {
//         if (Genre == ComedyMovie) {
//             return 3;
//         }
//         if (Genre == DramaMovie) {
//             return 4;
//         }
//         if (Genre == ScifiMovie) {
//             return 5;
//         }
//         if (Genre == ActionMovie) {
//             return 2;
//         }
//     }
//
//     public Movies (String name, int Genre) {
//         this(name, Genre);
//     }
//
//
//
// }
//
// public abstract class Movie {
//
//     private String name;
//     private Genre genre;
//
//     public Movie(String name) {
//         this(name, Genre.COMEDY);
//     }
//
//     public Movie(String name, Genre genre) {
//         this.name = name;
//         this.genre = genre;
//     }
//
//     public Genre getGenre() {
//         return genre;
//     }
//
//     public int ComedyMovie() {
//         return 3;
//     }
//
//     public int DramaMovie() {
//         return 4;
//     }
//
//     public int ScifiMovie() {
//         return 5;
//     }
//
//     public int ActionMovie() {
//         return 2;
//     }
//
//     public int getPrice() {
//
//     }
// }
