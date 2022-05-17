public class InheritanceInstanceOF {
    InheritanceInstanceOF(){
        Branch branch = new Branch();
        System.out.println("branch object is an instance of Repository? = "+(branch instanceof Repository));
        System.out.println("branch object is an instance of Merge? = "+(branch instanceof Merge));
    }
}

class Repository{

}

class Branch extends Repository implements Merge{

}

interface Merge {

}