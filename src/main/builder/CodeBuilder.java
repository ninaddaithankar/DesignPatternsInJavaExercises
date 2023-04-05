package main.builder;

import java.util.ArrayList;
import java.util.List;

public class CodeBuilder {

    String className;
    List<Field> fields;

    public CodeBuilder(String className) {
        this.className = className;
        fields =  new ArrayList<>();
    }

    public CodeBuilder addField(String name, String type) {
        this.fields.add(new Field(name,type));
        return this;
    }

    @Override
    public String toString() {
        StringBuilder finalCode = new StringBuilder();

        finalCode.append("public class ").append(className);
        finalCode.append("\n");

        finalCode.append("{");
        finalCode.append("\n");

        fields.forEach(field -> finalCode.append(field).append("\n"));

        finalCode.append("}");

        return finalCode.toString();
    }
}

class Field {
    String name, type;

    public Field(String name, String type){
        this.name = name;
        this.type = type;
    }

    public String toString(){
        return String.format("  public %s %s;", type, name);
    }
}
