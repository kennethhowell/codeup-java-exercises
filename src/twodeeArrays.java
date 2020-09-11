public class twodeeArrays {
//    int rowSize= 2;
//    int colSize = 4;
//    int [][]myArray = new int[rowSize][colSize];
//    int count = 0;

    static void arrayPrint(int rowSize,int colSize,int[][]myArray){
//        int min = 9;
//        int max = 9;
//        int range = max + min;
//
//        int count = (int) (Math.random() * 9) - 9;

        for(int i = 0; i < rowSize; i++) {

            for(int j = 0; j < colSize; j++) {
                int count = (int) (Math.random() * 18) - 9;
                System.out.println("count = " + count);
                myArray[i][j] = count;
            }
        }


        for (int i = 0; i < rowSize; i++){

            for(int j = 0; j < colSize; j++){
                System.out.print(myArray[i][j] +" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int rowSize= 6;
        int colSize = 6;
        int [][]myArray = new int[rowSize][colSize];



        arrayPrint(rowSize, colSize, myArray);
    }

}
