import java.awt.geom.Point2D;

public class LagrangeInterpolationPolynomial
{
    private Point2D[] points;

    public LagrangeInterpolationPolynomial(Point2D[] points) {
        this.points = points;
    }

    public double getValueOf(double x)
    {
        double result = 0.0;

        for (int i=0 ; i<points.length ; i++)
        {
            double tmp = points[i].getY();

            for (int j=0 ; j<i ; j++)
                tmp *= (x - points[j].getX()) / (points[i].getX() -  points[j].getX());

            for (int j=i+1 ; j<points.length ; j++)
                tmp *= (x - points[j].getX()) / (points[i].getX() -  points[j].getX());

            result += tmp;
        }

        return result;
    }

    public Point2D[] getPoints() {
        return points;
    }
}
