public class Operators {
    int a = 5, b= 6, c = -7;
    Operators (){
    }
    /*
    Arithmetic Operators using methods
     */
    public void arithmeticOperators(){
        System.out.println("Arithmetic Operators");
        System.out.println("\n\n + operator: "+ Add(a,b));
        System.out.println("- operator: "+ Substraction(a,b));
        System.out.println(" * operator: "+ Multiplication(a,b));
        System.out.println(" \\ operator: "+ Division(a,b));
        System.out.println(" % operator: "+ Modulus(a,b));
    }
    public int Add(int a, int b){
        return  a+b;
    }

    public int Substraction(int a, int b){
        return  a - b;
    }

    public int Multiplication(int a, int b){
        return  a * b;
    }

    public int Division(int a, int b){
        return  a / b;
    }

    public int Modulus(int a, int b){
        return  a % b;
    }

    /*
    Method for Unary Operators
     */
    public void unaryOperators(){
        System.out.println("Unary Operators");
        //Minus is used for negating the values
        System.out.println(-a);

        //Plus is for concatinating string, making positive and numeric promotion
        System.out.println(+b);
        System.out.println("Concat " +c);

        //post increment will keep a as 5 and increment for next line
        System.out.println(a++);
        //pre-increment will increment a to 7 as it had become 6 after previous increment
        System.out.println(++a);

        //post decrement will keep as 7 and decrement for next line
        System.out.println(a--);

        //pre decrement will decrease the value to 5 which had become 6 in previous statement
        System.out.println(--a);

        //Nor operator inverts the boolean values/result of an expression
        System.out.println(!false);  // will print true

        System.out.println(!true); // will print false
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
        //Equals operator will return fasle
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
