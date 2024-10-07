import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);

    // ---------- Problem 1 ----------
    System.out.println("Enter the radius of the circle: ");
    double rad = sc.nextDouble();
    Circle circ1 = new Circle(rad);
    System.out.println(circ1.toString() + " has a circumference of " + circ1.getCircumference() + " and an area of " + circ1.getArea());
  
  
    // ---------- Problem 2 ----------
    System.out.println("Enter number of sides: ");
    int sides = sc.nextInt();
    System.out.println("Enter the side length: ");
    double len = sc.nextDouble();
    RegularPolygon poly = new RegularPolygon(sides, len);
    System.out.println("Area with " + poly.getNumSides() + " sides: " + poly.getArea());
    System.out.println("Incrementing the number of sides by two");
    poly.addSides(2);
    System.out.println("Area with " + poly.getNumSides() + " sides: " + poly.getArea());
  }
}
