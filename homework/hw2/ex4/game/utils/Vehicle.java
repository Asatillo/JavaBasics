package game.utils;

// Create the main program in the class game.Main, which instantiates three vehicles and two players. One of the players should own a vehicle. The program should print the players' data on the screen.
public class Vehicle{
    private int id = -1, col1 = -1, col2 = -1;
    public String regNum = "";

    public Vehicle(int id, String regNum ,int col1, int col2){
        this.id = id;
        this.regNum = regNum;
        this.col1 = col1;
        this.col2 = col2;
    }

    public String getRegNum(){
        return regNum;
    }

    public void setRegNum(String num){
        regNum = num;
    }
}