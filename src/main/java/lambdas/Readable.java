package lambdas;


//here we are using the annotation FunctionalInterface
//this has no strict functionality but serves as documentation
@FunctionalInterface
public interface Readable {

        //below we have what's known as a single abstract method
        //when an interface is used to create lambdas we can
        //simply define one method, and only one method,
        //to be later employed and simplified in code
    void doRead();
}
