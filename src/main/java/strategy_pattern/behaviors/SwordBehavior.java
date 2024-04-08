package strategy_pattern.behaviors;

public class SwordBehavior implements WeaponBehavior{
    @Override
    public void useWeapon() {
        System.out.println("Sword attack!!!");
    }
}
