public class iteration3 {

    public static void main(String[] args) {

        int health = 85;
        int damage = 30;

        health = takeDamage(health, damage);

        printStatus(health);
    }

    // Metode 1 – tager damage
    public static int takeDamage(int currentHealth, int damageAmount) {

        currentHealth = currentHealth - damageAmount;

        System.out.println("Hero took " + damageAmount + " damage!");

        return currentHealth;
    }

    // Metode 2 – tjekker status
    public static void printStatus(int health) {

        if (health <= 0) {
            System.out.println("Hero is dead ☠");
        } else if (health < 30) {
            System.out.println("Warning: Low health!");
        } else {
            System.out.println("Hero is still strong 💪");
        }

        System.out.println("Current health: " + health);
    }
}