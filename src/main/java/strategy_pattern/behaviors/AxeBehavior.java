package strategy_pattern.behaviors;

public class AxeBehavior implements WeaponBehavior
{
    @Override
    public void useWeapon() {
        System.out.println("Axe attack!!!");
    }
}
