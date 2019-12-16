import java.util.Scanner;
public class Calculator {

    public static void main(String args[]) {

        int x=0;
        int y=0;
        int op=0;
        char c='+';
        Scanner userInput= new Scanner(System.in);
        x=userInput.nextInt();

        y=userInput.nextInt();
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
    System.out.println (op);


    }
}