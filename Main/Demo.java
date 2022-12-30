package Main;

import Classes.ClassFactory;
import Race.KoboldFactory;
import Race.RaceFactory;

public class Demo {

    public static void main(String[] args){
       Character character = new Character("Akarian", ClassFactory.getClass("Rogue"), RaceFactory.getRace(new KoboldFactory()));

        character.setAttributes(Stats.generate());
        character.addRaceBonuses();
        character.printSheet();

    }
}