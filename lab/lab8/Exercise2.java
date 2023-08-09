import java.util.HashMap;

public class Exercise2 {
    public static HashMap<String, Integer> getStats(String word){
        HashMap<String, Integer> result = new HashMap<>();
        for(int i=0; i<word.length();i++){
            String item = Character.toString(word.charAt(i));
            if (result.containsKey(item)) {
                int mult = result.get(item) + 1;
                result.replace(item, mult);
            } else {
                result.put(item,1);
            }
        }
        return result;
    }
    
    public static void main(String[] args) {
        System.out.println(getStats("asatillo"));
        System.out.println(getStats("aabbccddeee"));
    }
}
