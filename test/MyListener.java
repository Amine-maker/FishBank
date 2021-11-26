package test;


import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

class MyListener implements MouseListener {

    static int x;
    static int y;
    Main m;

    public MyListener(Main m){
        this.m = m;
    }

    @Override
    public void mouseClicked(MouseEvent mouseEvent) {
        x = mouseEvent.getX();
        y = mouseEvent.getY();
    }

    @Override
    public void mousePressed(MouseEvent mouseEvent) {

    }

    @Override
    public void mouseReleased(MouseEvent mouseEvent) {

    }

    @Override
    public void mouseEntered(MouseEvent mouseEvent) {

    }

    @Override
    public void mouseExited(MouseEvent mouseEvent) {

    }
}