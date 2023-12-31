import java.util.HashMap;
import java.util.Map;
/*A Generic class simply means that the items or functions in that class can be generalized with the parameter
(example T) to specify that we can add any type as a parameter in place of T like Integer, Character, String, 
Double or any other user-defined type.*/
public class Bag<T> {

    private final Map<T, Integer> map = new HashMap<>();

    public void add(T element) {
        int count = 1;

        Integer currentCount = map.get(element);
        if (currentCount != null) {
            count = currentCount + 1;
        }

        map.put(element, count);
    }

    public int countOf(T element) {
        Integer currentCount = map.get(element);
        if (currentCount != null) {
            return currentCount;
        } else {
            return 0;
        }
    }

    public void remove(T element) throws NotInBagException {
        Integer currentCount = map.get(element);
        if (currentCount == null) {
            throw new NotInBagException("Element: " + element + " isn't present in Bag.");
        }
        if (currentCount == 1) {
            map.remove(element);
        } else {
            map.put(element, currentCount - 1);
        }
    }

    @Override
    public String toString() {
        return map.toString();
    }
}