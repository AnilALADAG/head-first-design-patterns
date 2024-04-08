package strategy_pattern.characters;

import strategy_pattern.behaviors.WeaponBehavior;

public abstract class Character {
    WeaponBehavior weapon;
    public abstract void fight();

    public void setWeapon(WeaponBehavior weapon) {
        this.weapon = weapon;
    }
}
