public class Runner {
    public static void main(String args[]){
        System.out.println("Hello World!\n\n");
        VariableSize variable = new VariableSize();
        VariableSizeLimit variableSizeLimit = new VariableSizeLimit();
        Operators operators = new Operators();


        operators.unaryOperators();
        operators.assignmentOperators();
        operators.relationalOperators();
        operators.logicalOperators();
        operators.ternaryOperators();
        operators.bitwiseOperators();
        operators.shiftOperators();
        operators.assignmentOperators();
        InheritanceInstanceOF inheritanceInstanceOF = new InheritanceInstanceOF();

    }
}
