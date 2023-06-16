package in.verma.ocean_simulator.model;

public class Shark {

    private int hp = 100;
    private int energy = 100;

    private int tooth = 3;

    public void setHp(int hp){
        this.hp = hp;

    }
    public int getHp() {
        return this.hp;

    }

    public void setEnergy(int energy){
        this.energy = energy;

    }

    public int getEnergy(){
        return this.energy;
    }

    public int getTooth(){
        return this.tooth;
    }
}
