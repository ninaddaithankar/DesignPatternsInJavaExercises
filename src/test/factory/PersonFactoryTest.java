package test.factory;

import main.factory.Person;
import main.factory.PersonFactory;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class PersonFactoryTest {

    @Test
    public void personFactoryTest() {
        List<String> names = Arrays.asList("Ninad","Sanket","Tanay","Jatin","Vivek");

        PersonFactory personFactory = new PersonFactory();

        int currentId = 0;
        for (String name :
                names) {
            Person person = personFactory.createPerson(name);
            System.out.println("Checking ID for "+name);
            Assertions.assertEquals(currentId++,person.id);
        }
    }
}
