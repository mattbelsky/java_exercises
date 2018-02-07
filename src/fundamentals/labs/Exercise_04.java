package fundamentals.labs;

/**
 * Fundamentals Exercise 4: Area and Perimeter
 *
 *      Write the necessary code to calculate the area and perimeter of a cylinder
 *      with a radius of 3.14 and a height of 5. Print out the result.
 *
 */

public class Exercise_04 {

    public static void main(String[] args) {

        // write code here
        // area = 2 * pi * r * h + 2 * pi * r^2
        double area = 2 * Math.PI * 3.14 * 5 + 2 * Math.PI * 3.14 * 3.14;
        // perimeter = 2 * pi * r
        double perimeter = 2 * Math.PI * 3.14;
        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);
    }
}
