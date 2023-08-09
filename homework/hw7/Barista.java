public class Barista {
    public boolean order(Beverage beverage, Guest guest){
        boolean decision =  beverage.getLegalAge() <= guest.getAge();
        if(decision){
            System.out.println(guest.getName() + " can drink " + beverage.getName());
        }else{
            System.out.println(guest.getName() + " can't drink " + beverage.getName());            
        }
        return decision;
    }
}
