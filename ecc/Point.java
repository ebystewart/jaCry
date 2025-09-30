//package ecc;

// A point on the elliptic curve
public class Point {

    private double x;
    private double y;

    // constructor
    public Point(){

    }

    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }

    public double getX(){
        return x;
    }

    public double getY(){
        return y;
    }

    public void setX(double x){
        this.x = x;
    }

    public void setY(double y){
        this.y = y;
    }

    public String toString(){
        return "Point [x=" + x + ", y=" + y + "]";
    }
}