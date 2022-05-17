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
        //-32,768 to 32,767
        System.out.println("Short: " + this.testShort  + ", 2 byte");
        //-2,147,483,648 to 2,147,483, 647
        System.out.println("Int: " + this.testInt +  ", 4 byte");
        //-9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
        System.out.println("Long: " + this.testLong +  ", 8 byte");
        //approximately ±3.40282347E+38F (6-7 significant decimal digits) and default 0.0f
        System.out.println("Float: " + this.testFloat +  ", 4 byte");
        // approximately ±1.79769313486231570E+308 and 	default 0.0d
        System.out.println("Double: " + this.testDouble +  ", 8 byte");
        // 0 to 65,536 (unsigned) and default value '\u0000'
        System.out.println("Char: " + this.testChar+ ", 2 byte");
        // true or false
        System.out.println("Boolean: " + this.testBoolean + " with size not precisely defined");
    }

}
