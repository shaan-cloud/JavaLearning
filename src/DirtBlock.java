public class DirtBlock extends Block implements Breakable, Placeable{
    DirtBlock(){
        super("Dirt", 1, 0.5f, false);
    }

    @Override
    int getTextureID(){
        return 101;
    }
    @Override
    public void onBreak(){
        System.out.println("Dirt block has been mined! Dropped: Dirt x1");
    }

    @Override
    public int getBreakTime(String toolType){
        if (toolType.equals("Shovel")) return 1;
        else return 3;
    }

    @Override
    public boolean canPlaceOn(String surfaceType){
        return true;

    }



}
