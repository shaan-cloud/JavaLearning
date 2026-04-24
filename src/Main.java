public class Main {
    public static void main(String[] args) {
        String playerName = "Steve";
        int playerHealth = 9;
        int hungerLevel = 6;
        boolean isOnFire = true;

        System.out.println("===" + playerName + "'s STATUS ===");

        if (playerHealth <= 0) {
            System.out.println(playerName + " has died!... Respawn??");
        } else if (playerHealth <= 5) {
            System.out.println("Hey Careful! you are at Critical Health!");
        } else if (playerHealth <= 10) {
            System.out.println("Health is getting Low! gather some food immediately!");
        } else {
            System.out.println("Your Good!!");
        }

        if (hungerLevel <= 0) {
            System.out.println("Hey you are starving! Quick! Eat!");
        } else if (hungerLevel <= 3) {
            System.out.println("Very hungry! Eat something!");
        } else {
            System.out.println("Hunger is fine! Good to go!");
        }

        if (isOnFire == true) {
            System.out.println("Hey you're on Fire!! Quick! go to a water source!");

        }

        if(playerHealth>6 && hungerLevel > 3){
            System.out.println("You can sprint!!!");

        }
        else {
            System.out.println("You are too weak to sprint. Please Increase your hungerLevel");
        }


    }

}
