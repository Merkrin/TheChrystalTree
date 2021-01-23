package ru.ibarciuc.tree.elements;

import ru.ibarciuc.exceptions.NameException;
import ru.ibarciuc.exceptions.ParentsException;
import ru.ibarciuc.tree.utils.Description;

import java.util.List;
import java.util.UUID;

public class Person {
    private Person[] parents = new Person[]{null, null};

    private List<Person> children = null;

    private String firstName;
    private String lastName;

    private String lifeStage;

    private Description description;

    private final static String uuid = UUID.randomUUID()
            .toString()
            .replace("-", "");

    // TODO: add picture

    public Person(String[] name, String lifeStage) {
        if (name.length != 2 || name[0] == null || name[1] == null)
            throw new NameException("Incorrect name!");

        firstName = name[0];
        lastName = name[1];

        description = new Description(uuid);

        this.lifeStage = lifeStage;
    }

    public Person(String[] name, String lifeStage, Person[] parents) {
        this(name, lifeStage);

        if (parents.length != 2)
            throw new ParentsException("Incorrect parents amount!");

        this.parents = parents;
    }

    public Person(String[] name, String lifeStage, Person[] parents,
                  Description description) {
        this(name, lifeStage, parents);

        this.description = description;
    }

}
