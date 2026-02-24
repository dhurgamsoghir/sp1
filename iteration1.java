public class iteration1 {

    public static void main(String[] args) {

        String name = "Ragnar";
        int health = 85;
        int maxHealth = 100;
        int level = 5;
        int experience = 2300;
        double gold = 156.50;
        boolean isAlive = true;
        char heroClass = 'W';

        String[] inventory = {"Sword", "Shield", "Potion"};

        System.out.println("=== CHARACTER SHEET ===");
        System.out.println("Name: " + name);
        System.out.println("Class: " + heroClass);
        System.out.println("Level: " + level);
        System.out.println("Health: " + health + "/" + maxHealth);
        System.out.println("XP: " + experience);
        System.out.println("Gold: " + gold);
        System.out.println("Alive: " + isAlive);

        System.out.println("\nInventory (" + inventory.length + " items):");
        for (int i = 0; i < inventory.length; i++) {
            System.out.println("- " + inventory[i]);
        }
    }
}