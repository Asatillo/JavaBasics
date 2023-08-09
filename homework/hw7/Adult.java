public class Adult extends Guest{
    public Adult(String name, int age){
        // if(age > 18){
        //     throw new IllegalArgumentException();
        // }
        super(name, age);
    }

    @Override
    public String toString(){
        return "ADULT:::" + super.toString();
    }
}