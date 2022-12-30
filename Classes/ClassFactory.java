package Classes;

public class ClassFactory {
    public static CharacterClass getClass(String type){
        if("Rogue".equalsIgnoreCase(type))
            return new Rogue();
        else if ("Sorcerer".equalsIgnoreCase(type))
            return new Sorcerer();

        return null;
    }
}