import java.util.Random;

public class ServerNameGenerator {
    static Random randomNum = new Random();


    static String [] adjectives = {"flappy", "striking", "resplendent", "ambling", "effervescent", "cantankerous", "flatulent", "robust", "marbled", "languid"};
    static String [] nouns = {"grapefruit", "truck", "capybara", "tower", "bear", "corgi", "feline", "mandible", "pensioner", "citizen"};

    public static String getElement(String [] arr){
        int indexRand = randomNum.nextInt(arr.length);

        return arr[indexRand];
    }

    public static void main(String[] args) {
        System.out.printf("Here is your server name:%n%s-%s", getElement(adjectives), getElement(nouns));
    }

    ;
}
