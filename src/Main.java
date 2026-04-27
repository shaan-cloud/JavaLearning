public class Main {
    public static void main(String[] args) {

        DirtBlock dirt = new DirtBlock();
        StoneBlock stone = new StoneBlock();

        // describe() works on both - inherited!
        dirt.describe();
        stone.describe();

        System.out.println("---");

        // Breaking blocks with different tools
        System.out.println("Breaking dirt with Shovel: " +
                dirt.getBreakTime("Shovel") + "s");
        System.out.println("Breaking dirt with Hand: " +
                dirt.getBreakTime("Hand") + "s");
        System.out.println("Breaking stone with Pickaxe: " +
                stone.getBreakTime("Pickaxe") + "s");
        System.out.println("Breaking stone with Hand: " +
                stone.getBreakTime("Hand") + "s");

        System.out.println("---");

        // Placing blocks
        System.out.println("Can place dirt on grass? " +
                dirt.canPlaceOn("Grass"));

        System.out.println("---");

        // Breaking!
        dirt.onBreak();
        stone.onBreak();

        System.out.println("---");

        // Texture IDs
        System.out.println("Dirt texture ID: " + dirt.getTextureID());
        System.out.println("Stone texture ID: " + stone.getTextureID());
    }
}