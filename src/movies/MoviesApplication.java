package movies;
import util.Input;
import java.util.Arrays;

public class MoviesApplication {


    public static void main(String[] args) {

        Movie[] mainarray = MoviesArray.findAll();
        boolean searchmore = true;
        while (searchmore){
        System.out.printf("What would you like to do?%n0 - exit%n1 - view all movies%n2 - view movies in the animated category%n3 - view movies in the drama category%n4 - view movies in the horror category%n5 - view movies in the scifi category%n6 - add a movie of your own in one of the above categories%n");
        int userinput = Input.getInt("Enter your choice:");
        switch (userinput) {
            case 0:
                System.out.printf("Gotcha, adios muchacho!%n");
                System.exit(0);
            case 1:
                System.out.printf("Understood, here's all the movies:%n");
                for (int i = 0; i < mainarray.length; i++) {
                    System.out.printf("%s, %s%n", Movie.getName(mainarray[i]), Movie.getCategory(mainarray[i]));
                }
                break;
            case 2:
                System.out.printf("Understood, here's animated movies:%n");
                for (int i = 0; i < mainarray.length; i++) {
                    if (Movie.getCategory(mainarray[i]).equalsIgnoreCase("animated")) {
                        System.out.printf("%s, %s%n", Movie.getName(mainarray[i]), Movie.getCategory(mainarray[i]));
                    }
                }
                break;
            case 3:
                System.out.printf("Understood, here's drama movies:%n");
                for (int i = 0; i < mainarray.length; i++) {
                    if (Movie.getCategory(mainarray[i]).equalsIgnoreCase("drama")) {
                        System.out.printf("%s, %s%n", Movie.getName(mainarray[i]), Movie.getCategory(mainarray[i]));
                    }
                }
                break;
            case 4:
                System.out.printf("Understood, here's horror movies:%n");
                for (int i = 0; i < mainarray.length; i++) {
                    if (Movie.getCategory(mainarray[i]).equalsIgnoreCase("horror")) {
                        System.out.printf("%s, %s%n", Movie.getName(mainarray[i]), Movie.getCategory(mainarray[i]));
                    }
                }
                break;
            case 5:
                System.out.printf("Understood, here's scifi movies:%n");
                for (int i = 0; i < mainarray.length; i++) {
                    if (Movie.getCategory(mainarray[i]).equalsIgnoreCase("scifi")) {
                        System.out.printf("%s, %s%n", Movie.getName(mainarray[i]), Movie.getCategory(mainarray[i]));
                    }
                }
                break;
            case 6:
               String nameStorage = Input.getString("Add a movie? Sure! Give me the name of your movie first:");
               String categoryStorage = Input.getString("How about what category(genre) you feel fits it best?");
               Movie usermovie = new Movie(nameStorage, categoryStorage);
               mainarray = Arrays.copyOf(mainarray, mainarray.length + 1);
               mainarray[mainarray.length-1] = usermovie;
               System.out.printf("Alright, we've added %s as a %s movie!%n", Movie.getName(usermovie), Movie.getCategory(usermovie));
               break;
        }
            searchmore = Input.yesNo("Would you like to continue with our Movies application?");

        }
            System.out.printf("Hasta la vista!%n");
    }
}
