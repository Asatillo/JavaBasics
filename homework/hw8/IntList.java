public class IntList{
    private int currentSize;
    private int maxSize;
    private int[] array;

    public IntList(int maxSize){
        this.maxSize = maxSize;
        this.array = new int[maxSize];
    }

    public void add(int number){
        if(currentSize<maxSize){
            array[currentSize++] = number;
        }else{
            throw new IndexOutOfBoundsException();
        }
    }

    public void concat(IntList forConcat){
        if(maxSize-currentSize>=forConcat.currentSize){
            for(int i=0;i<forConcat.currentSize;i++){
                this.add(forConcat.array[i]);
            }
        }else{
            throw new IllegalStateException();
        }
    }

    public void removeItemsGreaterThan(int limit){
        int[] tempArr = new int[maxSize];
        int newSize = 0;
        for(int i=0;i<currentSize;i++){
            if(array[i]<limit){
                tempArr[newSize++] = array[i];
            }
        }
        array = tempArr;
        currentSize = newSize;
    }

    @Override
    public String toString(){
        String result = "[";
        for(int i=0;i<currentSize;i++){
            result += array[i];
            if(i!=currentSize-1){
                result += ", ";
            }
        }
        return result + "]";
    }
}