public class InheritanceInstanceOf {
    InheritanceInstanceOf(){
        Branch branch = new Branch();
        System.out.println("branch object is an instance of Repository? = "+(branch instanceof Repository));
        System.out.println("branch object is an instance of Merge? = "+(branch instanceof Merge));
    }
}

class Repository{
    /*
    This is a Parent class
     */
}

class Branch extends Repository implements Merge{
    /*
    This the child class which will Inherit the Repository class
     */
}

interface Merge {
    /*
    This is the interface to be implemented by the Child class
     */
}