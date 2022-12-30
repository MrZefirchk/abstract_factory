package Race;

import Main.Stats;

public class Tiefling extends CharacterRace{

    Tiefling(String name, Stats stats){
        this.name = name;
        this.bonuses = stats;
    }

    public Tiefling(Stats stats) {
        super();
    }

    @Override
    public int getRaceBonuses(String type){
        if(type == "Charisma")
            return 2;
        else if(type == "Intelligence")
            return 1;

        return 0;
    }

    @Override
    public void battleCry(){
        System.out.println("Be faster!");
    }
}