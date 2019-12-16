import java.util.Scanner;
public class Calculator {

    public static void main(String args[]) {

        float x=0;
        float y=0;
        float op=0;
        char c='+';
        Scanner userInput= new Scanner(System.in);
        System.out.print("x = ");
        x=userInput.nextFloat();

        System.out.print("y = ");
        y=userInput.nextFloat();
        System.out.print("Selecteaza un operator = ");
        c=userInput.next().charAt(0);




if(c=='+')op=x+y;
else
if(c=='-')op=x-y;
else
if(c=='*')op=x*y;
else
if(c=='/')op=x/y;
else
if(c=='%')op=x%y;
    System.out.println ("Rezultatul tau este = "  + op);


    }
}