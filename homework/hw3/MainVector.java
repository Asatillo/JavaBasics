import utils.DoubleVector;

public class MainVector{
    public static void main(String[] args) {
        
        double[] vec1_arr = {1, 2, 3};
        double[] vec2_arr = {4, 7, 2};
        
        DoubleVector vec1 = new DoubleVector(vec1_arr);
        DoubleVector vec2 = new DoubleVector(vec2_arr);
        
        System.out.println("The first vector " + vec1);
        System.out.println("The second vector " + vec2);

        // Product of two vectors
        System.out.println(vec1.productTwoVectors(vec2));

        // Product scalar
        System.out.println(vec1.productScalar(2));

        // Sum of two vectors
        System.out.println(vec1.sum(vec2));

        // Difference of two vectors
        System.out.println(vec1.difference(vec2));
    }
}