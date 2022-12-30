package Classes;

public class Rogue extends CharacterClass{
    private String perk;

    public Rogue(){
        this.name = "Rogue";
        this.dice = 8;
        this.perk = "Sneak Attack";
    }

    @Override
    public void printMagika(){
        System.out.println("Class " + name + "can do " + perk);
    }
}