public class Door {
    private int heightMM;
    private int widthMM;
    private int depthMM;
    private final Material material;
    private boolean isOpen;

    public Door (int heightMM, int widthMM, int depthMM, Material material) {
        this.heightMM = heightMM;
        this.widthMM = widthMM;
        this.depthMM = depthMM;
        this.material = material;
        this.isOpen = false;
    }

    public int getWeightMG (){
        return calculateVolume() * this.material.getDensityMG();
    }

    public int getHeightMM() {
        return this.heightMM;
    }

    public int getWidthMM () {
        return this.widthMM;
    }
    public int getDepthMM () {
        return this.depthMM;
    }

    public void changeDoorStatus () {
        this.isOpen = !this.isOpen;
    }

    public int calculateVolume () {
        return this.heightMM * this.widthMM * this.depthMM;
    }
}