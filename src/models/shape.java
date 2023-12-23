package models;
import java.util.ArrayList;
public class shape {

    private ArrayList<point> arrayOfPoints;
    public shape() {
        arrayOfPoints = new ArrayList<point>();
    }

    public void addPoint (point point){
        arrayOfPoints.add(point);
    }


    public double calculatePerimeter() {
        double per = 0;
        for(int i = 0; i < 9; i++) {
            per += arrayOfPoints.get(i).distanceTo(arrayOfPoints.get(i + 1));
        }
        per += arrayOfPoints.get(0).distanceTo(arrayOfPoints.get(9));
        return per;
    }

    public double getAverageSide() {
        return calculatePerimeter() / 10;
    }

    public double getLongestSide() {
        double max = 0;
        double current;
        for(int i = 0; i < 9; i++) {
            current = arrayOfPoints.get(i).distanceTo(arrayOfPoints.get(i + 1));
            if(current > max) {
                max = current;
            }
        }
        current = arrayOfPoints.get(0).distanceTo(arrayOfPoints.get(9));
        if(current > max) {
            max = current;
        }
        return max;
    }
}
