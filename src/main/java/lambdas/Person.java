package lambdas;

public class Person {

private String name;
private int age;

    public void getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
    this.age = age;
    }

    public void printDetails() {
        System.out.println(this.name + " is " + this.age);
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}