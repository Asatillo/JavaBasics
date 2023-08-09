import stringutils.IterWord;

public class MainUtils {
    public static void main(String args[]){
        IterWord words = new IterWord("It's Asatillo's computer!");
        while (words.hasNext()){
            words.printNext();
        } 
        words.restart();
        while (words.hasNext()){
            words.printNext();
        } 
    }
}
