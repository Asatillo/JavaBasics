package basics;

public class Matrix{
    int M;
    int N;
    double[][] array;

    public Matrix(int M, int N, double[] array){
        if(M*N != array.length){
            throw new IllegalArgumentException("Wrong data...!");
        }
        this.M = M;
        this.N = N;
        this.array = new double[M][N];
        for (int i=0; i < array.length;i++) {
            int row = (int)Math.floor(i/N);
            int col = i % N;
            this.array[row][col] = array[i];
        }    
    }

    public Matrix(int M, int N){
        this.array = new double[M][N];
        for (int i=0; i < M;i++) {
            for (int j=0;j<N;j++){
                this.array[i][j] = 0;
            }
        }
    }

    public static Matrix identity(int num){
        Matrix ret_mat = new Matrix(num, num);
        for (int i=0; i < num;i++) {
            for (int j=0;j<num;j++){
                if (i==j){
                    ret_mat.array[i][j] = 1;
                }
            }
        }
        return ret_mat;
    }

    public Matrix sum(Matrix mat2){
        if (M != mat2.M || N != mat2.N){
            throw new IllegalArgumentException("Matrices are wrong sized...!");
        }
        Matrix ret_mat = new Matrix(M, N);
        for(int i=0;i<M;i++){
            for (int j=0;j<N;j++){
                ret_mat.array[i][j] = array[i][j] + mat2.array[i][j];
            }
        }
        return ret_mat;
    }

    public Matrix difference(Matrix mat2){
        if (M != mat2.M || N != mat2.N){
            throw new IllegalArgumentException("Matrices are wrong sized...!");
        }
        Matrix ret_mat = new Matrix(M, N);
        for(int i=0;i<M;i++){
            for (int j=0;j<N;j++){
                ret_mat.array[i][j] = array[i][j] - mat2.array[i][j];
            }
        }
        return ret_mat;
    }

    public Matrix transpose(){
        Matrix ret_mat = new Matrix(N, M);
        for(int i=0;i<M;i++){
            for(int j=0;j<N;j++){
                ret_mat.array[j][i] = array[i][j];
            }
        }
        return ret_mat;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        String rowdDlim = "";
        String colDelim = "";
        sb.append("[");
        for (double[] row : array) { 
            sb.append(rowdDlim);
            rowdDlim = "; ";
            for (double elem : row) {
                sb.append(colDelim);
                colDelim = ", ";
                sb.append(elem);
            }
            colDelim = "";
        }
        sb.append("]");
        return sb.toString();
    }
}