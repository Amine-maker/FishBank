package projects;

import java.util.ArrayList;
import java.util.List;

public class FishBank {

    private ArrayList<projects.Fish> fish = new ArrayList<Fish>();
    private int height;
    private int width;
    private int angle;
    private Direction direction;

    public FishBank() {
    }

    public FishBank(ArrayList<Fish> fish, int height, int width, int angle, Direction direction) {
        this.fish = fish;
        this.height = height;
        this.width = width;
        this.angle = angle;
        this.direction = direction;
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

    public Direction getDirection() {
        return direction;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }

}
