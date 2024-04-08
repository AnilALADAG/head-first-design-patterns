package strategy_pattern.behaviors;

public class KnifeBehavior implements WeaponBehavior{
    @Override
    public void useWeapon() {
        System.out.println("Knife attack!");
    }
}
