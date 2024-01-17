package game;

public class Zombie {
    
    int walk, run, attack, healthPoint, sisanyawa, healthpointsisa;
    
    void walk(){
        System.out.println("Zombie Is Walking... ");
        System.out.println("Walking Speed : " + walk);
        System.out.println("-------------------");
    }
    
    void run(){
        System.out.println("Zombie Suddenly Running... ");
        System.out.println("Running Speed : " + run);
        System.out.println("-------------------");
    }
    
    void attack(){
        System.out.println("Zombie Is Attacking ");
        System.out.println("Damage Menyerang :" + attack);
        System.out.println("-------------------");
    }
    
    void healthPoint(){
        System.out.println("Health Point : " + healthPoint);
        System.out.println("-------------------");
    }
    
    void healthRemaining(int health, int damage){
        int sisanyawa = health - damage;
        System.out.println("Zombie Health Remaining : " + sisanyawa);
        System.out.println("-------------------");
        
    }
    
    boolean isDead(){
        if(healthPoint >=0) return true;
        return false;
    }
}