
import java.util.Scanner;

//abstract class
abstract class Convert{
    double val1, val2;
    Scanner sc = new Scanner(System.in);

    void read(){
        try{
            System.out.println("Enter value: ");
            val1 = sc.nextDouble();

        }catch(Exception e){
            System.out.println("Invalid input!");
            sc.next(); ///clear input
            read();  //try again

        }
    }

    void write(){
        System.out.println("Converted values: " + val2);
    }
    abstract void compute();

}