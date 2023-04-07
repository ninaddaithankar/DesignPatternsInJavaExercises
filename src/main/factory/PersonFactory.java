package main.factory;

public class PersonFactory {
    public int currentId = 0;
    public Person createPerson(String name) {
        return new Person(currentId++, name);
    }
}
