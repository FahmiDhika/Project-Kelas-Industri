package game;

public class Player {
    
    //definisi atribut
    String name, skill;
    int speed, healthpoint, damage, armor;
    
    //definisi method run
    void run(){
        System.out.println(name + " Is Running...");
        System.out.println("Speed : " + speed);
        System.out.println("-------------------");
    }
    void attack(){
        System.out.println(name + " Is Attacking ");
        System.out.println("Damage : " + damage);
        System.out.println("-------------------");
    }
    
    void armor(){
        System.out.println(name + " Is Defending ");
        System.out.println("Defend Bar : " + armor);
        System.out.println("-------------------");
    }
    
    void armorRemaining(String namePenjahat, int armor, int damage){
        int sisaArmor = armor - damage;
        System.out.println(name + " Armor Remain :  " + sisaArmor);
        System.out.println("-------------------");
    }
    
    void skill(){
        System.out.println(name + " While Having Difficulty, Finally Decided to Release the Skill");
        System.out.println(name + " Skill Launch : " + skill);
        System.out.println("-------------------");
    }
    
    
    
    //definisi method isDead untuk mengecek nilai kesehatan (healthpoint)
    boolean isDead(){
        if(healthpoint <=0) return true;
        return false;
    }
}