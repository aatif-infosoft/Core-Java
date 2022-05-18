import java.util.Scanner;

public class VariableSize {

    byte testByte;
    short testShort;
    int testInt;
    long testLong;
    float testFloat;
    double testDouble;
    char testChar;
    boolean testBoolean;
    VariableSize(){
        System.out.println("Following are the default values and size of: ");
        //-128 to 127
        System.out.println("Byte: " + this.testByte + ", 1 byte" );
        validateSize((byte)(6));
        //-32,768 to 32,767
        System.out.println("Short: " + this.testShort  + ", 2 byte");
        validateSize((short)(6));
        //-2,147,483,648 to 2,147,483, 647
        System.out.println("Int: " + this.testInt +  ", 4 byte");
        validateSize(6);
        //-9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
        System.out.println("Long: " + this.testLong +  ", 8 byte");
        validateSize((long)(6));
        //approximately ±3.40282347E+38F (6-7 significant decimal digits) and default 0.0f
        System.out.println("Float: " + this.testFloat +  ", 4 byte");
        validateSize((float)(6));
        // approximately ±1.79769313486231570E+308 and 	default 0.0d
        System.out.println("Double: " + this.testDouble +  ", 8 byte");
        validateSize((double)(6));
        // 0 to 65,536 (unsigned) and default value '\u0000'
        System.out.println("Char: " + this.testChar+ ", 2 byte");
        // true or false
        System.out.println("Boolean: " + this.testBoolean + " with size not precisely defined");
    }
    /*
    Validate byte
     */
    void validateSize(byte x){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter value for byte ");
        try{
            x = scanner.nextByte();
            System.out.println("You've entered the value = "+x);
        }
        catch (Exception e) {
            System.out.println("Entered value is out of range for the variable type byte");
        }
    }

    /*
  Validate Short
   */
    void validateSize(short x){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter value for short ");
        try{
            x = scanner.nextShort();
            System.out.println("You've entered the value = "+x);
        }
        catch (Exception e) {
            System.out.println("Entered value is out of range for the variable type short");
        }
    }

    /*
Validate Short
*/
    void validateSize(int x){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter value for int ");
        try{
            x = scanner.nextInt();
            System.out.println("You've entered the value = "+x);
        }
        catch (Exception e) {
            System.out.println("Entered value is out of range for the variable type int");
        }
    }

    /*
Validate Short
*/
    void validateSize(long x){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter value for long ");
        try{
            x = scanner.nextLong();
            System.out.println("You've entered the value = "+x);
        }
        catch (Exception e) {
            System.out.println("Entered value is out of range for the variable type long");
        }
    }

    /*
Validate Short
*/
    void validateSize(float x){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter value for float ");
        try{
            x = scanner.nextFloat();
            System.out.println("You've entered the value = "+x);
        }
        catch (Exception e) {
            System.out.println("Entered value is out of range for the variable type float");
        }
    }


    /*
Validate Short
*/
    void validateSize(double x){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter value for double ");
        try{
            x = scanner.nextDouble();
            System.out.println("You've entered the value = "+x);
        }
        catch (Exception e) {
            System.out.println("Entered value is out of range for the variable type double");
        }
    }

}
