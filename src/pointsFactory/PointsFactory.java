package pointsFactory;

import pointsFactory.setEnum.SetEnum;

import java.awt.geom.Point2D;

public class PointsFactory
{
    PointsHolder pointsHolder;

    public PointsFactory()
    {
        pointsHolder = new PointsHolder();
    }

    public Point2D[] createSet(SetEnum setEnum)
    {
        switch (setEnum)
        {
            case SET_1: return pointsHolder.createSet1();
            case SET_2: return pointsHolder.createSet2();
            case SET_3: return pointsHolder.createSet3();
            case SET_4: return pointsHolder.createSet4();
            default: throw new UnsupportedOperationException("Enum not supported");
        }
    }
}
