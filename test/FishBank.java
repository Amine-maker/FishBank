import java.util.ArrayList;

public class FishBank {

    private ArrayList<Fish> fish = new ArrayList<Fish>();
    private int height;
    private int width;
    private int angle;

    public FishBank(int number) {

    }

    public ArrayList<Fish> getFish() {
        return fish;
    }

    public void setFish(ArrayList<Fish> fish) {
        this.fish = fish;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getAngle() {
        return angle;
    }

    public void setAngle(int angle) {
        this.angle = angle;
    }

}
