/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package task2;

/**
 *
 * @author leha1
 */
public class Main {
    public static void main(String[] args) {
        Utility util = new Utility();

        System.out.print("Enter the size of the array: ");
        int size = util.getIntInRange("Enter a size (minimum 2): ", 2, 100);

        int[] array = new int[size];
        util.Randomizer(size, array);

        System.out.print("Generated array: ");
        util.display(array);

        int sum = util.sumTopIntegerInArray(array);
        System.out.println("Sum of top two integers: " + sum);
    }
}
