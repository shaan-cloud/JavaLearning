import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        String playerName = "Steve";

        System.out.println("=== BLOCK TYPES ===");

        BlockType myBlock = BlockType.GRASS;
        System.out.println("Block Selected:" +myBlock);

        switch(myBlock){
            case GRASS:
                System.out.println("Grass");
                break;
            case STONE:
                System.out.println("Stone");
                break;
            case LAVA:
                System.out.println("Lava");
                break;
            default:System.out.println("Block Name is not be specified. Sorry!!");
        }

        System.out.println("---");

        Direction direction = Direction.NORTH;
        System.out.println(playerName+" is facing "+ direction);

        System.out.println("---");

        System.out.println("=== BLOCK REGISTRATION===");

        HashMap<String, String> blockRegistration = new HashMap<>();

        blockRegistration.put("Dirt", "Soft Block");
        blockRegistration.put("Stone", "Can only be mined By pickaxe");
        blockRegistration.put("Wood", "Obtained from trees");
        blockRegistration.put("Lava", "Fluid Blocks Category");
        blockRegistration.put("Bedrock", "Unobtainable Blocks/Commands Only Block Category");

        System.out.println("Looking up 'Stone': " + blockRegistration.get("Stone"));
        System.out.println("Looking up 'Wood': " + blockRegistration.get("Wood"));

        System.out.println("Registry has 'gold'? " + blockRegistration.containsKey("gold"));

        System.out.println("---");
        System.out.print("Blocks Registration is done..");
        System.out.println("All Registered Blocks---");
        for(String blockName : blockRegistration.keySet()){
            System.out.println("• " + blockName + " -- " + blockRegistration.get(blockName));

        }

        System.out.println("---");
        System.out.println("Total Block Registered-- " + blockRegistration.size());





    }
}