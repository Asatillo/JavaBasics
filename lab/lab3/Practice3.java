class MainTask1{
    public static void main(String args[]) {
        System.out.println("Enter N: ");
        int N = Integer.parseInt(System.console().readLine());
        double[] array = new double[N];//{1.3, 5.2, 7.7, -2.3, 23.45};
        
        for(int i=0;i<N;i++){
            System.out.println("Input the " + i + "th element: ");
            array[i] = Double.parseDouble(System.console().readLine());
        }

        double sum = 0;
        for (int i=0;i<array.length;++i){
            sum += array[i];
        }
        double avg = sum/array.length;

        double[] diff_from_avg = {0,0,0,0,0};
        for(int i = 0; i<array.length;i++){
            diff_from_avg[i] = Math.abs(avg-array[i]);
        }
        
        int min_value_idx = 0;
        for(int i=1;i<array.length;i++){
            if(diff_from_avg[i]<diff_from_avg[min_value_idx]){
                min_value_idx = i;
            }
        }

        System.out.println("Sum of the array is: " + sum);
        System.out.println("Average of the array is: " + avg);;
    }
}