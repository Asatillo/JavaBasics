import java.util.HashSet;

public class CheckedSet<T> {
    private final HashSet<T> set;

    public CheckedSet(){
        set = new HashSet<>();
    }

    public int sizeOfSet(){
        return set.size();
    }

    public boolean contains(T element){
        return this.set.contains(element);
    }

    public void add(T element) throws AlreadyContainedException{
        if (this.contains(element)){
            throw new AlreadyContainedException("The element " + element + "is alreay in the set");
        } else{
            set.add(element);
        }
    }

}
