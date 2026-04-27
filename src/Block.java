public abstract class Block {
    String name;
    int id;
    float hardness;
    boolean isTransparent;

    Block(String name, int id, float hardness, boolean isTransparent){
        this.name = name;
        this.id = id;
        this.hardness = hardness;
        this.isTransparent = isTransparent;

    }

    void describe(){
        System.out.println("Block: " + name + " |ID: " + id + " | Hardness: " + hardness);


    }

    abstract int getTextureID();
}
