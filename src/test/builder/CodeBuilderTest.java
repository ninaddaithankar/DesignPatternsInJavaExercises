package test.builder;

import main.builder.CodeBuilder;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CodeBuilderTest {

    @Test
    public void testGeneratedCodeFromBuilder(){
        CodeBuilder codeBuilder = new CodeBuilder("Person")
                .addField("name", "String")
                .addField("age", "int");

        String expected = "public class Person\n{\n  public String name;\n  public int age;\n}";
        Assertions.assertEquals(expected, codeBuilder.toString());
    }

}
