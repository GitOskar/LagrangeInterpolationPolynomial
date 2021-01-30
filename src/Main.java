import pointsFactory.PointsFactory;
import pointsFactory.setEnum.SetEnum;

public class Main
{
    public static void main(String[] args)
    {
        final SetEnum setEnum = SetEnum.SET_4;
        final double wantedX = 11;

        PointsFactory pointsFactory = new PointsFactory();
        LagrangeInterpolationPolynomial lagrange = new LagrangeInterpolationPolynomial(pointsFactory.createSet(setEnum));

        System.out.println("Dla punktów");
        for (var point : lagrange.getPoints())
            System.out.println("x = " + point.getX() + " ; y = " + point.getY());
        System.out.println("Wartość funkcji dla x = " + wantedX + " wynosi " + lagrange.getValueOf(wantedX));
    }
}
