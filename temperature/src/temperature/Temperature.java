/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package temperature;
    import java.util.Scanner;
/**
 *
 * @author Gianna
 */
public class Temperature {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Scanner keyboard = new Scanner(System.in);

       System.out.println("Enter the temperature in Celsius: ");
       double celsiusTemp = keyboard.nextInt();


       double fahrenheitTemp = (double) (((9.0/5.0)* celsiusTemp) + 32.0);
       
       System.out.println("The temperature in Fahrenheit is: " + fahrenheitTemp); 
    }
    
}
