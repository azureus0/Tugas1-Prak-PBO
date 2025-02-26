/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gun;

/**
 *
 * @author adidw
 */
public abstract class Gun implements Firearm {

    protected String name;
    protected int damage;
    protected int magazineSize;

    public Gun(String name, int damage, int magazineSize) {
        this.name = name;
        this.damage = damage;
        this.magazineSize = magazineSize;
    }

    public String getName() {
        return this.name;
    }

    public int getDamage() {
        return this.damage;
    }

    public int getMagazineSize() {
        return this.magazineSize;
    }

    @Override
    public abstract void shoot();

    @Override
    public abstract void reload();

    @Override
    public abstract void aim();

}
