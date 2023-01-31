import java.util.ArrayList;
public class CatRunner {
    public static void main(String[] args){
        ArrayList<Cat> cats = new ArrayList<Cat>();
        Cat cat1 = new Cat("Sam");
        Cat cat2 = new Cat("Will");
        Cat cat3 = new Cat("Bill");
        cats.add(cat1);
        cats.add(cat2);
        cats.add(cat3);
        System.out.println(cats);

        Cat cat4 = new Cat("John ");
        

    }
}
