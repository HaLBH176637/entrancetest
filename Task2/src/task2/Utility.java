/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package task2;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author leha1
 */
public class Utility {

    public int getIntInRange(String msg, int min, int max) {
        Scanner sc = new Scanner(System.in);
        int result = 0;
        do {
            try {
                String input = sc.nextLine();
                if (checkInt(input) != -1) {
                    return checkInt(input);
                }
                result = Integer.parseInt(input);
                if (result > max || result < min) {
                    System.err.println("Invalid number. Number must between " + min + " and " + max);
                    continue;
                }
                return result;
            } catch (Exception e) {
                System.err.println("Invalid format number. Please try again!!");
            }
        } while (true);
    }

    public int checkInt(String input) {
        if (input.matches("\\d+[\\.][0]+")) {
            return Integer.parseInt(input.substring(0, input.indexOf(".")));
        }
        return -1;
    }

    public void Randomizer(int size, int[] a) {
        Random r = new Random();
        for (int i = 0; i < size; i++) {
            a[i] = r.nextInt(size);
        }
    }

    public int sumTopIntegerInArray(int[] array) {
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int sum;
        for(int num : array){
            if(num > max1){
                max1 = max2;
                max2 = num;
            }
            else if(num > max2){
                max2 = num;
            }
        }
        return sum = max1 + max2;
    }

    public void display(int[] a) {
        int size = a.length;
        System.out.print("[");
        for (int i = 0; i < size; i++) {
            if (i != size - 1) {
                System.out.print(a[i] + ", ");
            } else {
                System.out.print(a[i]);
            }
        }
        System.out.println("]");
    }
}
