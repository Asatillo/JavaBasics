import java.util.ArrayList;

public class IntList2 {
    protected int currentSize;
    protected int maxSize;
    protected ArrayList<Integer> array = new ArrayList<>();

    public IntList2(int maxSize){
        this.maxSize = maxSize;
    }

    public void add(int number){
        if(array.size()<maxSize){
            array.add(number);
            currentSize++;
        }else{
            throw new IndexOutOfBoundsException();
        }
    }

    public void concat(IntList2 toConcat){
        if(maxSize-array.size()>=toConcat.array.size())
        for(Integer number: toConcat.array){
            array.add(number);
            currentSize++;
        } 
    }

    public void removeItemsGreaterThan(int number){
        for(int i=0;i<array.size();i++){
            if(array.get(i)>number){
                array.remove(i);
                currentSize--;
            }
        }
    }

    @Override
    public String toString(){
        String result = "[";
        for(int i=0;i<currentSize;i++){
            result += array.get(i);
            if(i!=currentSize-1){
                result += ", ";
            }
        }
        return result + "]";
    }

}

class NamedIntList extends IntList2{
    String name;

    public NamedIntList(int maxSize, String name){
        super(maxSize);
        this.name = name;
    }

    @Override
    public String toString(){
        return (name + " " + super.toString());
    } 
}
