import java.util.Arrays;

public class ApplesAndOranges {

    static int[] countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[]oranges){
        int appleCount = 0;
        int orangeCount = 0;
        int[] applesAndOranges = new int[2];

        for(int i = 0; i < apples.length; i++){
            int temp = apples[i] + a;
            if(temp >= s && temp <= t){
                appleCount += 1;
            }
            applesAndOranges[0]= appleCount;
        }
        for(int j = 0; j < oranges.length; j++){
            int temp = oranges[j]+b;
            if(temp >= s && temp <= t){
                orangeCount+=1;
            }
            applesAndOranges[1] = orangeCount;
        }
//        System.out.println(appleCount);
//        System.out.println(orangeCount);
        return applesAndOranges;
    }

    public static void main(String[] args) {
    int[] apples = new int[]{-2, 2, 1};
    int[] oranges = new int[]{5,-6};


        System.out.println(Arrays.toString(countApplesAndOranges(7, 11, 5, 15, apples, oranges)));
    }


}
