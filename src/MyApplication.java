import models.Person;

public class MyApplication {
    public static void main(String[] args) {
        Person person = new Person("Alua", "Sagyndyk", 17, true);
        System.out.println(person);
        Person person2 = new Person("Jane", "Smith", 25, false);
        System.out.println(person2);

    }
}
