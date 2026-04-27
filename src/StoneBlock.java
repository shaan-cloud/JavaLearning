public class StoneBlock extends Block implements Breakable {

    StoneBlock() {
        super("Stone", 2, 5.0f, false);
    }

    @Override
    int getTextureID() {
        return 102;
    }

    @Override
    public void onBreak() {
        System.out.println("Stone block broken! Dropped: 1x Cobblestone");
    }

    @Override
    public int getBreakTime(String toolType) {
        if (toolType.equals("Pickaxe")) return 2;
        else return 15; // very slow without pickaxe!
    }
}