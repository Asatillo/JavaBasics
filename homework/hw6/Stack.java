import java.util.ArrayList;
import java.util.NoSuchElementException;

class Stack{
    ArrayList <Integer> stack = new ArrayList<>();

    public void push(int number){
        stack.add(number);
    }

    public boolean empty(){
        return stack.isEmpty();
    }

    public int size(){
        return stack.size();
    }

    public int pop(){
        int ret_val = -9999;
        try{
            if (this.empty()){
                throw new NoSuchElementException();
            }
            else{
                int index = stack.size() - 1;
                ret_val = stack.get(index);
                stack.remove(index);
            }
        }catch(NoSuchElementException e){
            System.out.println("Stack is empty!");
            e.printStackTrace();
        }
        return ret_val;
    }

    @Override
    public String toString(){
        String ret_val = "<";
        for(int i=0;i<stack.size();i++){
            ret_val += stack.get(i);
            if(i != stack.size()-1){
                ret_val += ", ";
            }
        }
        return ret_val + ">";
    }
}