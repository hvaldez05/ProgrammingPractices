package edu.ceu.programming.practices;
import java.util.Random;

public class Practice2 {

    private static Random random = new Random();

     /**
     * Generates an approximation to number PI using the Monte Carlo method.
     * This version is recursive.
     * @param steps The number of iterations for the Monte Carlo simulation.
     * @param pointsInsideCircle The count of points that fall inside the circle.
     * @return Approximated value of PI.
     */
    public static double generatePiRecursive(long steps, long pointsInsideCircle) {
        // Base case: if no steps left, return the approximation
        if (steps == 0) {
            return 4.0 * pointsInsideCircle / (double) (pointsInsideCircle + steps);
        }

        double x = random.nextDouble();
        double y = random.nextDouble();

        if (x * x + y * y <= 1) {
            pointsInsideCircle++;
        }

        return generatePiRecursive (steps -1, pointsInsideCircle);
    }

    public static void main(String[] args) {
        long steps = 1000000; // You can change this value
        double piApprox = generatePiRecursive(steps, 0);
        System.out.println("Approximated PI: " + piApprox);
}
}
