package strategy_pattern;

import strategy_pattern.behaviors.AxeBehavior;
import strategy_pattern.behaviors.SwordBehavior;
import strategy_pattern.characters.King;

public class StrategySimulator {
    public static void main(String[]args){
        King king = new King();

        king.setWeapon(new SwordBehavior());
        king.fight();
        king.setWeapon(new AxeBehavior());
        king.fight();
    }
}
