package pointsFactory;

import java.awt.geom.Point2D;

public class PointsHolder
{
    public Point2D[] createSet1() // f(x) = x^2
    {
        return new Point2D[]
                {
                        new Point2D.Double(1.0, 1.0),
                        new Point2D.Double(2.0, 4.0),
                        new Point2D.Double(5.0, 25.0)
                };
    }

    public Point2D[] createSet2() // f(x) = x^3
    {
        return new Point2D[]
                {
                        new Point2D.Double(1.0, 1.0),
                        new Point2D.Double(2.0, 8.0),
                        new Point2D.Double(5.0, 125.0),
                        new Point2D.Double(6.0, 216)
                };
    }

    public Point2D[] createSet3()
    {
        return new Point2D[]
                {
                        new Point2D.Double(-2.0, -2.0),
                        new Point2D.Double(-1.0, 4.0),
                        new Point2D.Double(0.0, 1.0),
                        new Point2D.Double(4.0, 8.0)
                };
    }

    public Point2D[] createSet4() // f(x) = 2x + 3
    {
        return new Point2D[]
                {
                        new Point2D.Double(-5.0, -7.0),
                        new Point2D.Double(-1.0, 1.0),
                        new Point2D.Double(4.0, 11.0),
                        new Point2D.Double(6.0, 15.0)
                };
    }
}
