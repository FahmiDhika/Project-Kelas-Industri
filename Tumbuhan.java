package game;

public class Tumbuhan {
    
    String name, skill;
    int damage, healthPoint, armor, skillDamage;
    
    void damage(){
        System.out.println(name + " Is Attacking ");
        System.out.println("Damage : " + damage);
        System.out.println("-------------------");
    }

    void skill(){
        System.out.println(name + " Is Using Skill : " + skill);
        System.out.println("Pentol Damage : " + damage);
        System.out.println("-------------------");
    }
    
    void healthPoint(){
        System.out.println("Health " + name + " : " + healthPoint);
        System.out.println("-------------------");
    }
    
    void aremore(){
        System.out.println(name + " Is Using Defense Skill : Armor");
        System.out.println("Armor Bar : " + armor);
        System.out.println("-------------------");
    }
    
    void healthRemaining(int damage, int health){
        int sisanyawa = health - damage;
        System.out.println(name + " Health Remaining : " + sisanyawa);
        System.out.println("-------------------");
    }
    
    boolean isDead(){
        if(healthPoint <=0) return true;
        return false;
    }
}
