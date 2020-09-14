import java.util.ArrayList;

public class twodeeArrays {
//    int rowSize= 2;
//    int colSize = 4;
//    int [][]myArray = new int[rowSize][colSize];
//    int count = 0;

    static void arrayPrint(int rowSize,int colSize,int[][]myArray){
       ArrayList<Integer> bucketSum = new ArrayList<Integer>();
       int tempSum = 0;
       int returnSum = 0;


        for(int i = 0; i < rowSize; i++) {

            for(int j = 0; j < colSize; j++) {
                int count = (int) (Math.random() * 18) - 9;
//                System.out.println("count = " + count);
                myArray[i][j] = count;
            }
        }

        for(int i = 0; i < rowSize; i++) {

            for(int j = 0; j < colSize; j++) {
                System.out.print(myArray[i][j] + " ");
            }

            System.out.println();
        }

        for (int i = 0; i < 3; i++){

                for(int j = 0; j < 3; j++){
//                    System.out.println("j = " + j);
                    if (i == 1){
                        bucketSum.add(myArray[i][j+1]);
                        i++;

                    }
//                        System.out.println("myArray[i][j] = " + myArray[i][j]);
                        bucketSum.add(myArray[i][j]);

                    }
                }

        if (bucketSum.size() == 7){System.out.println("hourglass to sum: " + bucketSum);
        for (int amount : bucketSum){

                tempSum += amount;
            }
            System.out.println("sum = " + tempSum);

            if (tempSum > returnSum){
                returnSum = tempSum;
            }

        }
        System.out.println(returnSum);


    }


    public static void main(String[] args) {
        int rowSize= 6;
        int colSize = 6;
        int [][]myArray = new int[rowSize][colSize];



        arrayPrint(rowSize, colSize, myArray);
    }

}
