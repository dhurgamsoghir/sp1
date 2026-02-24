public class iteration2 {

    public static void main(String[] args) {

        int health = 20;
        boolean isAlive = true;

        if (health <= 0) {
            isAlive = false;
            System.out.println("Hero is dead");
        } else if (health < 30) {
            System.out.println("Warning: Low health!");
        } else {
            System.out.println("Hero is healthy");
        }

        System.out.println("Alive status: " + isAlive);
    }

}