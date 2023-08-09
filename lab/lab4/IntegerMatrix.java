class IntegerMatrix {
    private int rowNum;
    private int colNum;
    private int[][] data;

 
    public IntegerMatrix(int rowNum,int colNum, int[] linearData) {
        if (rowNum*colNum != linearData.length) {
            throw new IllegalArgumentException("Inavlaid ...");
        }
        this.rowNum = rowNum;
        this.colNum = colNum;
        data = new int [rowNum] [colNum];

        for (int i=0; i < linearData.length;i++) {
            int row = (int)Math.floor(i/colNum);
            int col = i % colNum;
            System.out.println(i +" "+ row +" "+col);
            data[row][col] = linearData[i];
        }
    }

    //1,2,3;4,5,6
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        String rowdDlim = "";
        String colDelim = "";

        for (int[] row : data) { 
            sb.append(rowdDlim);
            rowdDlim = ";";
            for (int elem : row) {
                sb.append(colDelim);
                colDelim = ",";
                sb.append(elem);
            }
            colDelim = "";
        }
        return sb.toString();
    }
}