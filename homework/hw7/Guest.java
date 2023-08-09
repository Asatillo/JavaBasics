public class Guest {
    protected String name;
    protected int age;

    public Guest(String name, int age){
        if(name.length() < 1 || age < 0){
            throw new IllegalArgumentException();
        }
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    @Override
    public String toString(){
        return "Name: " + name + " Age: " + age;
    }
}