//given the coordinate (x,y) of a center of a circle and its radius WAP which will determine whether a point lies inside the circle on the circle or outside the circle
 
import java.util.Scanner;

public class CirclePointCheck{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter circle center (x y): ");
        int x = sc.nextInt();
        int y = sc.nextInt();

        System.out.print("Enter circle radius: ");
        int r = sc.nextInt();

        System.out.print("Enter point coordinates (a b): ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        int dx = a - x;
        int dy = b - y;
        int distanceSquared = dx * dx + dy * dy;
        int radiusSquared = r * r;

        if (distanceSquared < radiusSquared){
            System.out.println("Point lies inside the circle.");
        } else if (distanceSquared == radiusSquared) {
            System.out.println("Point lies on the circle.");
        } else {
            System.out.println("Point lies outside the circle.");
        }
    }
}

