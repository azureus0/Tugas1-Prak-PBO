/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package task1_prakpbo;

import gun.*; //import semua isi package gun
/**
 *
 * @author adidw
 */
public class Main {

    public static void main(String[] args) {

        Pistol usp = new Pistol("USP-S", 15, 12);
        System.out.println("GUN INFORMATIONS:");
        System.out.println("Name = " + usp.getName());
        System.out.println("Damage per shot = " + usp.getDamage());
        System.out.println("Magazine size = " + usp.getMagazineSize());
        System.out.println("GUN ACTIONS:");
        usp.shoot();
        usp.reload();
        usp.aim();
        
        System.out.println("");
        
        Sniper mosinNagant = new Sniper("Mosin Nagant", 101, 5);
        System.out.println("GUN INFORMATIONS:");
        System.out.println("Name = " + mosinNagant.getName());
        System.out.println("Damage per shot = " + mosinNagant.getDamage());
        System.out.println("Magazine size = " + mosinNagant.getMagazineSize());
        System.out.println("GUN ACTIONS:");
        mosinNagant.shoot();
        mosinNagant.reload();
        mosinNagant.aim();
        
        System.out.println("");
        
        Rifle ak47 = new Rifle("AK-47", 50, 30);
        System.out.println("GUN INFORMATIONS:");
        System.out.println("Name = " + ak47.getName());
        System.out.println("Damage per shot = " + ak47.getDamage());
        System.out.println("Magazine size = " + ak47.getMagazineSize());
        System.out.println("GUN ACTIONS:");
        ak47.shoot();
        ak47.reload();
        ak47.aim();
        
        System.out.println("");
        
        Shotgun nova = new Shotgun("Nova", 80, 5);
        System.out.println("GUN INFORMATIONS:");
        System.out.println("Name = " + nova.getName());
        System.out.println("Damage per shot = " + nova.getDamage());
        System.out.println("Magazine size = " + nova.getMagazineSize());
        System.out.println("GUN ACTIONS:");
        nova.shoot();
        nova.reload();
        nova.aim();
        
        System.out.println("");
        
        MachineGun negev = new MachineGun("Negev", 25, 120);
        System.out.println("GUN INFORMATIONS:");
        System.out.println("Name = " + negev.getName());
        System.out.println("Damage per shot = " + negev.getDamage());
        System.out.println("Magazine size = " + negev.getMagazineSize());
        System.out.println("GUN ACTIONS:");
        negev.shoot();
        negev.reload();
        negev.aim();
    }
}
