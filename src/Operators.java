import java.util.Scanner;

public class Operators {
    Scanner scanner = new Scanner(System.in);
    int a, b, c = 7;
    Operators (){
        System.out.println("Test of Operator examples");
        System.out.println("Please enter a value for a and hit enter key");
        this.a = scanner.nextInt();
        System.out.println("Please enter a value for b and hit enter key");
        this.b = scanner.nextInt();
        System.out.println("Please enter a value for c and hit enter key");
        this.c = scanner.nextInt()*-1;
    }
    /*
    Arithmetic Operators using methods
     */
    public void arithmeticOperators(){
        System.out.println("Arithmetic Operators\n\n");
        System.out.println(" + operator --> a + b = : "+ Add(a,b));
        System.out.println(" - operator --> a - b = : "+ Subtraction(a,b));
        System.out.println(" * operator --> a * b = : "+ Multiplication(a,b));
        System.out.println(" / operator --> a / b = : "+ Division(a,b));
        System.out.println(" % operator --> a % b = : "+ Modulus(a,b));
    }
    /*
    Addition
     */
    public int Add(int a, int b){
        return  a+b;
    }

    /*
    Subtraction
     */
    public int Subtraction(int a, int b){
        return  a - b;
    }

    /*
    Multiplication
     */
    public int Multiplication(int a, int b){
        return  a * b;
    }

    /*
    Division
     */
    public int Division(int a, int b){
        return  a / b;
    }

    /*
    Remainder
     */
    public int Modulus(int a, int b){
        return  a % b;
    }

    /*
    Method for Unary Operators
     */
    public void unaryOperators(){
        System.out.println("Unary Operators");
        //Minus is used for negating the values
        System.out.println("Negated value of a = " + -a);

        //Plus is for concatenating string, making positive and numeric promotion
        System.out.println(+b);
        System.out.println("Concatenating this string with value of c --> " +c);

        //post increment will keep a as 5 and increment for next line
        System.out.println("Value of a right before incrementing = "+a++);
        //pre-increment will increment a to 7 as it had become 6 after previous increment
        System.out.print("Value of after previous increment and incrementing again with pre-increment = ");
        System.out.println(++a);

        //post decrement will keep as 7 and decrement for next line
        System.out.println("Value of a right before decrementing = "+a--);

        //pre decrement will decrease the value to 5 which had become 6 in previous statement
        System.out.print("Value of after previous decrement and decrementing again with pre-decrement = ");
        System.out.println(--a);

        //Nor operator inverts the boolean values/result of an expression
        System.out.println("Inverting the value of false with ! operator = "+!false);  // will print true

        System.out.println("Inverting the value of true with ! operator = "+!true); // will print false
    }

    /*
    Method for Assignment Operators
     */
    public void assignmentOperators(){
        System.out.println("Assignment operators");
        //    += operator a+=b --> a= a+b
        System.out.println(a+=b);
        //    -= operator
        System.out.println(a-=b);
        //    *= operator
        System.out.println(a*=b);
        //    /= operator
        System.out.println(a/=b);
        //    %= operator
        System.out.println(a%=b);
    }


    /*
    Method for Relational Operators
     */
    public void relationalOperators(){
        System.out.println("Relational Operators");
        //Equals operator will return false
        System.out.println(a==b);
        //Not equal operator will return true
        System.out.println(a!=b);
        //Less than operator will return false
        System.out.println(a<b);
        //Less than equal to operator will return false
        System.out.println(a<=b);
        //Greater than operator will return true
        System.out.println(a>b);
        //Greater than equal to operator will return true
        System.out.println(a>=b);

    }

    /*
    Logical Operators
     */
    public void logicalOperators(){
        System.out.println("Logical Operators");
        if(a==6 && b!=6){
            System.out.println("And Operator");
        }
        if(a==5 || b==5){
            System.out.println("OR Operator");
        }
        if(a==5 & b!=5){
            System.out.println("AND Short circuit");
        } else System.out.println("No output due to the first condition becoming false");
    }

    /*
    Ternary Operators
     */
    public void ternaryOperators(){
        System.out.println("Ternary Operator");
        System.out.println((a>b)?"Ternary operator says that Yes a is greater than b":"Ternary says a is not greater than b");

    }

    /*
    Bit-wise operators
     */
    public void bitwiseOperators(){
        System.out.println("Bitwise Operators");
        System.out.println("& operator between a, b = "+ (a&b));
        System.out.println("| operator between a, b = "+ (a|b));
        System.out.println("XOR operator between a, b = "+ (a^b));
        System.out.println("Compliment operator for a = "+ (~a));

    }

    /*
    Shift Operators
     */
    public void shiftOperators(){
        System.out.println("Shift Operators");
        //a = 5 = 101 So left shift would shift to 10100
        System.out.println("Left shift a: "+ (a << 2));
        //a = 5 = 101 So right shift would shift to 001
        System.out.println("Right shift a: "+ (a >> 2));
        //a = 5 = 101 So Unsigned right shift would shift to
        System.out.println("Unsigned right shift a: "+ (a >>> 2));
    }
}
