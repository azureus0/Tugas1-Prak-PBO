/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gun;

/**
 *
 * @author adidw
 */
public class Shotgun extends Gun{
    public Shotgun(String name, int damage, int magazineSize) {
        super(name, damage, magazineSize);
    }

    @Override
    public void shoot() {
        System.out.println("Shooting with " + name + ", jedar");
    }
    
    @Override
    public void reload() {
        System.out.println("Reloading your " + name + " shotgun");
    }
    
    @Override
    public void aim() {
        System.out.println("Aiming with the " + name + " shotgun");
    }
}
