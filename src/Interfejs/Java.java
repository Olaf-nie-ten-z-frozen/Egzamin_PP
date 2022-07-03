package Interfejs;

public class Java implements Intern{
    String name;
    Integer age;

    public Java(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public void salary() {
        System.out.println(name + " Title: " + "Java salary: " + 1000);
    }
}
