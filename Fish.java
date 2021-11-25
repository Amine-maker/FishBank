package projects;

import java.lang.Runtime.Version;

public class Fish {

    private int id;
    private int height;
    private int width;
    private int speed;
    private int position[] = new int[2];

    public Fish() {
    }

    public Fish(int id, int height, int width, int speed, int[] position) {
        this.id = id;
        this.height = height;
        this.width = width;
        this.speed = speed;
        this.position = position;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int[] getPosition() {
        return position;
    }

    public void setPosition(int[] position) {
        this.position = position;
    }

}
