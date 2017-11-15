package com.company.gdansk.aclass;
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Point {

    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int[] getXAndY() {
        return new int[]{x, y};
    }

    public double calculateDistance(int x, int y){
        return sqrt(pow(this.x - x, 2) + pow(this.y - y, 2));
    }

    public double caltulateDistance(Point p){
        return calculateDistance(p.getX(), p.getY());
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
}
