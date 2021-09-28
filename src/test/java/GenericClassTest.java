import generics.GenericClass;
import org.junit.jupiter.api.Test;

public class GenericClassTest {

    @Test
    void myTypeTest() {
        //below we are initializing instances of generics.GenericClass
        //notes that we don't have to declare the generic one
        //the righthand side of our declaration

        GenericClass<Boolean> booleanGenericClass = new GenericClass<>();
        GenericClass<String> stringGenericClass = new GenericClass<>();

        booleanGenericClass.add(true);
        stringGenericClass.add("this is my string!");

        System.out.println(booleanGenericClass.myType);
        System.out.println(stringGenericClass.myType);



    }

}
