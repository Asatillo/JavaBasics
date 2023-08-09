package game;

import game.utils.Vehicle;

public class Player{
    private String name;
    private String ip;
    private int health;
    public Vehicle machine;

    public Player(String name, String ip, int health, Vehicle machine){
        this.name = name;
        this.ip = ip;
        this.health = health;
        this.machine = machine;
    }

    @Override
    public String toString(){
        String regNum = (machine == null) ? "" : machine.regNum;
        return String.format("%s, %s, %d, -- %s --", name, ip, health, regNum);
    }
}