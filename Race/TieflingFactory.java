package Race;

import Main.Stats;

public class TieflingFactory implements RaceAbstractFactory{

    @Override
    public Kobold create(){
        return new Kobold(new Stats(0, 0, 0, 0, 0, 0));
    }
}