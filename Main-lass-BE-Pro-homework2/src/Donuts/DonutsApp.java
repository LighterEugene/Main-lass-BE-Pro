package Donuts;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class DonutsApp {

    public static void main(String[] args) {
        DonutsMachine donutsMachine = new DonutsMachine();
        System.out.println("Hello! ");
        System.out.println("1-List all donuts, 0 - Exit");
        Scanner scanner = new Scanner(System.in);
        int option = scanner.nextInt();
        if(option == 1) {
            donutsMachine.printAllDonutsType();
            System.out.println("Input donuts type : ");
            option = scanner.nextInt();
            Donut donut = donutsMachine.makeDonut(option);
            System.out.println(donut);
        }
        else
        {
            System.out.println("Bye!!!");
        }
    }

}