package strategy_pattern.characters;

public class Troll extends Character{
    @Override
    public void fight() {
        System.out.println("Troll fighting");
        weapon.useWeapon();
    }
}
