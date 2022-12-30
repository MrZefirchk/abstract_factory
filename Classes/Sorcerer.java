package Classes;

import java.util.ArrayList;
import java.util.List;

public class Sorcerer extends CharacterClass{
    private List<String> spells;

    public Sorcerer(){
        this.name = "Sorcerer";
        this.dice = 6;

        this.spells = new ArrayList<>();
        spells.add("Meteor");
        spells.add("Earthquake");
    }

    @Override
    public void printMagika(){
        System.out.println("\nClass " + name + " uses spells:");

        for(String spell : spells){
            System.out.println(spell);
        }
    }
}