import java.util.ArrayList;

class Exercise3{
    public static ArrayList<String> onlyEven(ArrayList<String> list){
        ArrayList<String> result = new ArrayList<>();
        for(String word: list){
            if(word.length()%2 == 1){
                result.add(word);
            } 
        }
        return result;
    }
    
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("hello");
        list.add("bottle");
        list.add("people");
        list.add("sky");
        list.add("desk");
        list.add("skreens");
        list.add("motto");
        list.add("help");
        
        System.out.println(list);
        System.out.println(onlyEven(list));
    }
}