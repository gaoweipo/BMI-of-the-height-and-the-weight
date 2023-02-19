import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double height, weight, BMI;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your height in m here:");
        height = sc.nextDouble();
        System.out.println("Enter your weight in Kg here:");
        weight = sc.nextDouble();
        BMI = weight / (height * height);
        if (BMI < 18.5) {
            System.out.println("Underweight.");
        }
        if (BMI >= 18.5 && BMI < 24.9) {
            System.out.println("Normal.");
        }
        if (BMI >= 24.9 && BMI < 29.9) {
            System.out.println("Overweight.");
        }
        if (BMI >= 29.9) {
            System.out.println("Obesity.");
        }

    }
}