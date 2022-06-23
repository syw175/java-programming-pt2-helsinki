public class Program {

    public static void main(String[] args) {

        // Testing my function
        int rows = 2;
        int columns = 3;
        int[][] matrix = new int[rows][columns];
        matrix[0][1] = 5;
        matrix[1][0] = 3;
        matrix[1][2] = 7;
        System.out.println(arrayAsString(matrix));

        // Testing my function2
        int[][] matrix2 = {
                {3, 2, 7, 6},
                {2, 4, 1, 0},
                {3, 2, 1, 0}
        };

        System.out.println(arrayAsString(matrix2));


    }

    public static String arrayAsString(int[][] array) {

        StringBuilder stringConvertor = new StringBuilder();
        for (int y = 0; y < array.length; y++) {
            for (int x = 0; x < array[y].length; x++) {
                stringConvertor.append(array[y][x]);
            }
            stringConvertor.append("\n");
        }
        return stringConvertor.toString();
    }

}
