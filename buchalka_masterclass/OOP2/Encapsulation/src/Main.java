public class Main {
    public static void main(String[] args) {
        // EXAMPLE OF A BAD WAY
//        Player player = new Player();
//        player.name = "Tim";
//        player.health = 20;
//        player.weapon = "sword";
//
//        int damage = 10;
//        player.loseHealth(damage);
//        System.out.println("Remaining health: " + player.healthRemaining());
//        player.loseHealth(230);

        EnhancedPlayer player1 = new EnhancedPlayer("Dimi", 90, "gun");
        System.out.println("Initial health is: " + player1.getHealth());
        player1.loseHealth(56);
        System.out.println("Current health: " + player1.getHealth());
    }
}
