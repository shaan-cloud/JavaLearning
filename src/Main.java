public class Main {

    static void printWorld(int[][] world) {
        System.out.println("=== WORLD CROSS-SECTION ===");
        for (int row = 0; row < world.length; row++) {
            for (int col = 0; col < world[row].length; col++) {
                int block = world[row][col];
                if (block == 0) System.out.print("  "); // air
                else if (block == 1) System.out.print("🟫"); // dirt
                else if (block == 2) System.out.print("⬜"); // stone
                else if (block == 3) System.out.print("🟩"); // grass
                else if (block == 4) System.out.print("🟡"); // sand
                else if (block == 5) System.out.print("🔵"); // water
                else if (block == 6) System.out.print("I"); // Trees
            }
            System.out.println();
        }
        System.out.println("Air=  Dirt=🟫 Stone=⬜ Trees= I Grass=🟩 Sand=🟡 Water=🔵");
    }

    public static void main(String[] args) {

        // 0=air, 1=dirt, 2=stone, 3=grass, 4=sand, 5=water
        int[][] world = {
                {0, 0, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 6, 0, 0},
                {0, 0, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 6, 0, 0},
                {0, 6, 6, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 6, 0, 0},
                {3, 3, 3, 3, 4, 4, 5, 5, 5, 4, 3, 3, 3, 3, 3, 3},
                {1, 1, 1, 1, 4, 5, 5, 5, 5, 4, 1, 1, 1, 1, 1, 1},
                {2, 2, 2, 0, 2, 2, 2, 0, 0, 0, 0, 2, 2, 2, 2, 2},
                {2, 2, 2, 0, 0, 0, 0, 0, 0, 2, 2, 2, 2, 2, 2, 2},
                {2, 2, 2, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 2},
        };

        printWorld(world);
    }
}