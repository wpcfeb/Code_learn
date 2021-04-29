package charactor;
 
public class Hero implements LOL {
    public String name;
    public float hp;
 
    public int damage;
 
    public Hero() {
 
    }
 
    public Hero(String name) {
 
        this.name = name;
    }
 
    public String toString() {
        return name;
    }
 
}