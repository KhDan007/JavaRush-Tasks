package com.javarush.task.task13.task1327;

public class Person implements RepkaItem {
    private String name;
    private String namePadezh;

    public Person(String name, String namePadezh) {
        this.name = name;
        this.namePadezh = namePadezh;
    }

    // Functions
    public void pull(Person person) {
        System.out.println(this.getName() + " за " + person.getNamePadezh());
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getNamePadezh() {
        return namePadezh;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setNamePadezh(String namePadezh) {
        this.namePadezh = namePadezh;
    }
}
