import basics.Matrix;

public class MainMatrix {
    public static void main(String[] args) {
        double[] arr1 = new double[] {1,2,3,4,5,6};
        double[] arr2 = new double[] {6,5,4,3,2,1}; 
        Matrix matrix1 = new Matrix(2, 3, arr1);
        Matrix matrix2 = new Matrix(2, 3, arr2);

        System.out.println(matrix1);
        System.out.println(matrix2);
        System.out.println(matrix1.sum(matrix2));
        System.out.println(matrix1.difference(matrix2));
        System.out.println(matrix2.transpose());
        System.out.println(Matrix.identity(4));
    }
}
