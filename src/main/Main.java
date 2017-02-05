package main;/*
This code is words to output Console.
 */
import java_car.Car;
import java_car.CarException;

import java.io.*;

public class Main {
    public static void main(String[] args)
    {
        Car car1 = new Car();
        try {
            car1.setCar(1234,-10.0);
        }
        catch (CarException e)
        {
            System.out.println(e);
        }
        car1.show();
    }
}
