public class iteration4 {

    // Attributes (felter)
    String name;
    int health;
    int level;

    // Constructor
    public iteration4(String name, int health, int level) {
        this.name = name;
        this.health = health;
        this.level = level;
    }

    // Metode
    public void takeDamage(int damage) {
        health -= damage;
        System.out.println(name + " took " + damage + " damage!");
    }

    public void showStatus() {
        System.out.println("Name: " + name);
        System.out.println("Health: " + health);
        System.out.println("Level: " + level);
    }
}