public class Test {
    public static void main(String args[]){
        byte leftByteLimit = -128;
        byte rightByteLimit = 127;
        short leftShortLimit = -32_768;
        short rightShortLimit = 32_767;
        int leftIntLimit = -2_147_483_648;
        int rightIntLimit = 2_147_483_647;
        long leftLongLimit = Long.MIN_VALUE;
        long rightLongLimit = Long.MAX_VALUE;
        float leftFloatLimit = Float.MIN_VALUE;
        float rightFloatLimit = Float.MAX_VALUE;
        double leftDoubleLimit = Double.MIN_VALUE;
        double rightDoubleLimit = Double.MAX_VALUE;
        char leftCharLimit = 0;
        char rightCharLimit = 65535;


        System.out.println(leftByteLimit);
        System.out.println(rightByteLimit);

        System.out.println(leftShortLimit);
        System.out.println(rightShortLimit);

        System.out.println(leftIntLimit);
        System.out.println(rightIntLimit);

        System.out.println(leftLongLimit);
        System.out.println(rightLongLimit);

        System.out.println(leftFloatLimit);
        System.out.println(rightFloatLimit);

        System.out.println(leftDoubleLimit);
        System.out.println(rightDoubleLimit);

        System.out.println(leftCharLimit);
        System.out.println(rightCharLimit);

    }
}
