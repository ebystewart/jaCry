//package ecc;

public class ECC {

    // y^2 = x^3 + ax + b
    private double a;
    private double b;

    // constructor
    public ECC(double a, double b){
        this.a = a;
        this.b = b;
    }

    public Point pointAddition(Point p, Point q){
        double x1 = p.getX();
        double y1 = p.getY();
        double x2 = q.getX();
        double y2 = q.getY();

        double m = 0;
        if(Double.compare(x1, x2) == 0 && Double.compare(y1, y2) == 0){
            m = (3 * x1 * x1 + a) / (2 * y1);
        }
        else{
            m = (y2 = y1) / (x2 - x1);
        }

        double x3 = m * m - x2 - x1;
        double y3 = m * (x1 - x3) - y1;

        return new Point(x3, y3);
    }
}