import java.util.HashMap;


public class Playground
{
    public static String wurstIsBetter(String input){

        return "wurst";
    }
    public static void setHashMap(HashMap category, String name, int quantity){
        category.put(name, quantity);
    };

    public static void main(String[] args) {
        String cate = "dairy";

//        ;
//        if (cate.equalsIgnoreCase("dairy")){
//            dairy.put(variable, variable2);
//        };


//        public static void setHashMap(String category, String name, int quantity){
//            category.put(name, quantity);
//        };


        HashMap<String, Integer> dairy = new HashMap<>();
        HashMap<String, Integer> produce = new HashMap<>();
        HashMap<String, Integer> meats = new HashMap<>();

//        dairy.put("two percent milk", 3);
//        dairy.put("sourcream", 2);
//        dairy.put("yogurt", 6);
        setHashMap(dairy, "two percent milk", 6);
        setHashMap(dairy, "laser yogurt", 4);
        setHashMap(dairy, "super butter", 2);

        setHashMap(produce, "zucchini", 3);
        setHashMap(produce, "tomatoes", 4);
//
//        produce.put("zucchini", 4);
//        produce.put("oranges", 4);
//        produce.put("onions", 4);
//
//        meats.put("redeye steak", 2);
//        meats.put("steak", 2);
//        meats.put("chicken thighs", 2);


        System.out.println(dairy.entrySet());
//        System.out.println(dairy.keySet());
//        System.out.println(dairy.values());

        System.out.println(produce.entrySet());
//        for (String item : dairy.keySet()){
//            System.out.printf("%s%n",item);
//        }
//        for (String item : produce.keySet()){
//            System.out.printf("%s%n",item);
//        }
//        for (String item : meats.keySet()){
//            System.out.printf("%s%n",item);
//        }
    }




//    public item(String category String item, int quanttity)
//
//    public static void main(String[] args) {
//        int x = 5 * 4 % 3;
//        System.out.println(x);
//
//        System.out.println("This is what x is" + x);
    }





