public class Dogs extends Animal {

    public Dogs(int runLimit, int swimLimit, double jumpLimit) {
        this.runLimit = runLimit;
        this.swimLimit = swimLimit;
        this.jumpLimit = jumpLimit;
    }

    public void Dog(){
        this.runLimit = 500;
        this.swimLimit = 10;
        this.jumpLimit = 0.5;
    }

}