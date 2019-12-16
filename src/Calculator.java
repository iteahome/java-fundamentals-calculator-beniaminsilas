public class Calculator {
    public static void main(String args[]) {
int x=10;
int y=5;
int op=0;
char c='%';


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