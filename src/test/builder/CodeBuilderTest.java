package test.builder;

import main.builder.CodeBuilder;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CodeBuilderTest {

    @Test
    public void testGeneratedCodeFromBuilder(){
        CodeBuilder codeBuilder = new CodeBuilder("Person")
                .addField("name", "String")
                .addField("age", "int");

        String expected = "public class Person\n{\n  public String name;\n  public int age;\n}";
        assertEquals(expected, codeBuilder.toString());
    }

}
