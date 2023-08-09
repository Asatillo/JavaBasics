package utils;

public class DoubleVector{
    double[] vector;

    public DoubleVector(double[] vector){
        if (vector != null){
            this.vector = new double[vector.length];
            for (int i=0;i<vector.length;i++){
                this.vector[i] = vector[i];
            }
        }
    }

    public double productTwoVectors(DoubleVector vector2){
        double product = 0;
        if(vector.length == vector2.vector.length){
            for(int i=0;i<vector.length;i++){
                product += vector[i]*vector2.vector[i];
            }
        }
        return product;
    }

    public DoubleVector productScalar(double num){
        double[] return_arr = new double[vector.length];
        for(int i=0;i<vector.length;i++){
            return_arr[i] = vector[i]*num;
        }
        return (new DoubleVector(return_arr));
    }

    public DoubleVector sum(DoubleVector vector2){
        double[] return_arr = new double[vector.length]; 
        if (vector.length == vector2.vector.length){
            for (int i=0;i<vector.length;i++){
                return_arr[i] = vector[i] + vector2.vector[i];
            }
        }
        return (new DoubleVector(return_arr));
    }

    public DoubleVector difference(DoubleVector vector2){
        double[] return_arr = new double[vector.length]; 
        if (vector.length == vector2.vector.length){
            for (int i=0;i<vector.length;i++){
                return_arr[i] = vector[i] - vector2.vector[i];
            }
        }
        return (new DoubleVector(return_arr));
    }

    @Override
    public String toString(){
        String out_val = "[";
        for(int i=0;i<vector.length;i++){
            out_val += vector[i];
            if (i!=vector.length-1){
                out_val += ", ";
            }    
        }
        out_val += "]";
        return out_val;
    }
}