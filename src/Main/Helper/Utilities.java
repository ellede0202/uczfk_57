/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main.Helper;
import java.util.Scanner;


public class Utilities {
    private Scanner scan;
    
    public Utilities(Scanner scan){
        this.scan = scan;
    }
        public int getInt() {
        while (true) {
            String input = scan.nextLine();
            if (input.equalsIgnoreCase("exit")) {
                return -1;
            }
            try {

            } catch (NumberFormatException e) {
                System.out.print("Invalid input, Try again or\nType 'exit' to cancel: ");
            }
        }
    }

    public double getDoulbe() {
        while (true) {
            String input = scan.nextLine();
            if (input.equalsIgnoreCase("exit")) {
                return -2;
            }
            try {
                return Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.print("Invalid Input, Try again or\nType 'exit' to cancel: ");
            }
        }
    }
    
    public String getString(){
        String input = scan.nextLine();
        return input;
    }
}
