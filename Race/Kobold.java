package Race;

import Main.Stats;

public class Kobold extends CharacterRace{

    Kobold(String name, Stats stats){
        this.name = name;
        this.bonuses = stats;
    }

    public Kobold(Stats stats) {
        super();
    }

    @Override
    public int getRaceBonuses(String type){
            return 2;
    }

    @Override
    public void battleCry(){
        System.out.println("Dark night");
    }
}