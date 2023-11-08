package movies;

import util.Input;

public class MoviesApplication {
    // put the command loop in here
    public static void main(String[] args) {
        Input input = new Input();
        Movie [] movies = MoviesArray.findAll();

        // 0. loop until user chooses to exit
        while (true) {

            // 1. display menu
            printMenu();

            // 2. wait for user to choose menu option
            int choice = input.getInt(0, 51, "Enter your choice: ");

            System.out.println(choice);
            // 3. validate the choice, if no good then go back to 1
            // validation already done in my getInt()

            // if exit, get outta loop
            if (choice == 0) {
                break;
            }

            // 4. do the choice
            doMenuChoice(choice, movies);
        }
        System.out.println("Peace");
    }

    private static void doMenuChoice(int choice, Movie [] movies){
        switch (choice){
            case 1 -> viewAllMovies(movies);
            case 2 -> viewMoviesByCategory(movies, "animated");
            case 3 -> viewMoviesByCategory(movies, "drama");
            case 4 -> viewMoviesByCategory(movies, "horror");
            case 5 -> viewMoviesByCategory(movies, "sci-fi");


        }
    }

    private static void viewMoviesByCategory(Movie [] movies, String category) {
        for(Movie movie : movies) {
            if (category.equalsIgnoreCase("all") || movie.getCategory().equalsIgnoreCase(category)) {
                System.out.println(movie.toPrettyString());
            }
        }
        System.out.println();
    }

//    private static void viewAllAnimatedMovies(Movie [] movies) {
//       viewMoviesByCategory(movies, "all");
//    }
    private static void viewAllMovies(Movie [] movies) {
        viewMoviesByCategory(movies, "all");
    }

    private static void printMenu() {
        System.out.println("What would you like to do?\n" +
                "\n" +
                " 0 - exit\n" +
                " 1 - view all movies\n" +
                " 2 - view movies in the animated category\n" +
                " 3 - view movies in the drama category\n" +
                " 4 - view movies in the horror category\n" +
                " 5 - view movies in the scifi category\n\n");
    }
}
