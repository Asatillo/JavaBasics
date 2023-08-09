public class Beverage{
    private String name;
    private int legalAge;

    public Beverage(String name, int legalAge){
        if(name.length() == 0 || legalAge < 0){
            throw new IllegalArgumentException();
        }
        this.name = name;
        this.legalAge = legalAge;
    }

    public String getName(){
        return name;
    }

    public int getLegalAge(){
        return legalAge;
    }

    @Override
    public String toString(){
        return "BEVERAGE:::Name: " + name + " Age: " + legalAge;
    }
}