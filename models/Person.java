package models;

public class Person {
    private String name;
    private String indetification;
    private int age;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getIndetification() {
        return indetification;
    }
    public Person(String name, String indetification, int age) {
        this.name = name;
        this.indetification = indetification;
        this.age = age;
    }
    public void setIndetification(String indetification) {
        this.indetification = indetification;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
}
