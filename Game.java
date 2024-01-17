package game;
import java.util.Scanner;
public class Game {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        //membuat objek player
        Player manusia = new Player();
        Zombie monster = new Zombie();
        Tumbuhan plant = new Tumbuhan();
        
        
        System.out.println("PLESE INPUT DATA FOR THE STORY!!!");
        
        //Objek Manusia
        System.out.print("Human Name : ");
        String man = input.nextLine();
        System.out.print("Human Health Point : ");
        int htl1 = input.nextInt();
        System.out.print("Human Running Speed : ");
        int lari = input.nextInt();
        System.out.print("Human Attack Damage : ");
        int atk = input.nextInt();
        System.out.print("Human Armor Durability : ");
        int amr = input.nextInt();
        System.out.println("==================================");
        
        manusia.name = man;
        manusia.speed = lari;
        manusia.healthpoint = htl1;
        manusia.damage = atk;
        manusia.armor = amr;
        manusia.skill = "Spawn Tumbuhan";
        
        //Objek Zombie
        System.out.print("Zombie Walking Speed : ");
        int jalan = input.nextInt();
        System.out.print("Zombie Running Speed : ");
        int lari2 = input.nextInt();
        System.out.print("Zombie Damage : ");
        int atk2 = input.nextInt();
        System.out.print("Zombie Health Point : ");
        int htl2 = input.nextInt();
        System.out.println("==================================");
        
        monster.attack = atk2;
        monster.healthPoint = htl2;
        monster.run = lari2;
        monster.walk = jalan;
        monster.healthpointsisa = htl2 - plant.damage;
        
        //Objek Tumbuhan
        System.out.print("Plant Health Point : ");
        int htl3 = input.nextInt();
        System.out.print("Plant Armor : ");
        int amr3 = input.nextInt();
        
        
        plant.name = "Bola Kaktus";
        plant.skill = " Tembak Pentol";
        plant.skillDamage = 200;
        plant.damage = 50;
        plant.healthPoint = htl3;
        plant.armor = amr3;
        
        for (int i = 1; i <= 3; i++) {
            System.out.println("");
        }
        
        System.out.println("=========================");
        System.out.println("=====Godong VS Mayat=====");
        System.out.println("=========================");
        
        //menjalankan method
        manusia.run();
        monster.walk();
        monster.run();
        monster.attack();
        manusia.armor();
        manusia.armorRemaining("Zombie", amr, atk2);
        manusia.skill();
        plant.damage();
        monster.healthRemaining(htl2,plant.damage);
        monster.attack();
        plant.healthRemaining(monster.attack, htl3);
        plant.skill();
        monster.healthRemaining(htl2, plant.skillDamage);
        
        if (monster.isDead()) {
            System.out.println("!!!HUMAN WIN!!!");
        }
        
        else {
            System.out.println("!!!ZOMBIE WIN!!!");
        }
    }
}