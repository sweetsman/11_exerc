package exercises.t15;
import java.util.Scanner;
public class t15 {
    public static void main(String[] args) {

        polygon polygon = new polygon();
        int pointNum = 0;
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the number of the points: ");
        pointNum=in.nextInt();
        System.out.println("Enter the coordinates of the points: ");
        for(int i=0;i<pointNum;i++)
        {
            double x = in.nextDouble();
            double y = in.nextDouble();
            MyPoint p1 = new MyPoint(x,y);
            polygon.setPoint(p1);

        }
        System.out.println("The total area is " + polygon.Area(pointNum));
    }

}



