// The printNext() method prints the next word of this string to the standard output (in a new line). The class whould have a restart() and a hasNext() method as well. Create a main program to illustrate the use of the class!
package stringutils;

public class IterWord {
    private String sentence;
    private int itter;

    public IterWord(String sent){
        this.sentence = sent;
        this.itter = 0;
    }

    public boolean hasNext(){
        while (itter != sentence.length() && (sentence.charAt(itter) == ' ' || sentence.charAt(itter) == '\n' 
        || sentence.charAt(itter) == '\t')) itter ++;
        return itter != sentence.length();
    }
    
    public void printNext(){
        // to remove whitespaces tabs and newlines
        while (itter != sentence.length() && (sentence.charAt(itter) == ' ' || sentence.charAt(itter) == '\n' 
        || sentence.charAt(itter) == '\t')) itter ++;

        while (itter != sentence.length() && (sentence.charAt(itter) != ' ' || sentence.charAt(itter) != '\n' 
        || sentence.charAt(itter) != '\t')){
            System.out.println(sentence.charAt(itter));
            itter++;
        }
    }

    public void restart(){
        itter = 0;
    }    
}