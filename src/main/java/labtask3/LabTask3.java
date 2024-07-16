package labtask3;

import java.util.ArrayList;
import java.util.Scanner;

public class LabTask3 {

    public static void main(String[] args) {
        String make, model, color;
        double price;
        int i, n;
        Car cl;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of cars: ");
        n = sc.nextInt();
        sc.nextLine(); 
        ArrayList<Car> c = new ArrayList<>();
        for (i = 0; i < n; i++) {
            System.out.println("Enter Company name =");
            make = sc.nextLine();
            System.out.println("Enter Model =");
            model = sc.nextLine();
            System.out.println("Enter Color=");
            color = sc.nextLine();
            if (color.isEmpty()) {
                color = "Unknown";
            }
            System.out.println("Enter Price =");
            price = sc.nextDouble();
            sc.nextLine();
            cl = new Car(make, model, color, price);
            c.add(cl);
        }

        System.out.println();
        for (i = 0; i < c.size(); i++) {
            c.get(i).displayInfo();
        }
    }
}

