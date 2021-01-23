package ru.ibarciuc.tree.elements;

import ru.ibarciuc.exceptions.NameException;
import ru.ibarciuc.exceptions.ParentsException;
import ru.ibarciuc.tree.utils.Description;

import java.util.HashSet;
import java.util.UUID;

/**
 * Class, that represents a person node in the family tree.
 */
public class Person {
    // Parents of the node. If there is no information about a parent of
    // the person, the parent is null.
    private Person[] parents = new Person[]{null, null};

    // An unordered collection of unique children of the person.
    private HashSet<Person> children = null;

    // Name of the person.
    private String firstName;
    private String lastName;

    // Life stage of the person (for original Sims-idea).
    private String lifeStage;

    // Description added to the person.
    private Description description;

    // Unique identifier used to store the person's information.
    private final static String uuid = UUID.randomUUID()
            .toString()
            .replace("-", "");

    // TODO: add picture

    /**
     * Constructor of the class, that creates basic person having name
     * and life stage.
     *
     * @param name      name of the person given in format
     *                  {&gt;first_name&lt;,&gt;last_name&lt;}
     * @param lifeStage life stage of the person taken
     *                  from @see {@link ru.ibarciuc.tree.utils.LifeStages}
     */
    public Person(String[] name, String lifeStage) {
        if (name.length != 2 || name[0] == null || name[1] == null)
            throw new NameException("Incorrect name!");

        firstName = name[0];
        lastName = name[1];

        description = new Description(uuid);

        this.lifeStage = lifeStage;
    }

    /**
     * Constructor of the class, that creates basic person having name,
     * life stage and parents.
     *
     * @param name      name of the person given in format
     *                  {&gt;first_name&lt;,&gt;last_name&lt;}
     * @param lifeStage life stage of the person taken
     *                  from @see {@link ru.ibarciuc.tree.utils.LifeStages}
     * @param parents   parents of the person given in format
     *                  {&gt;first_parent&lt;,&gt;second_parent&lt;}
     */
    public Person(String[] name, String lifeStage, Person[] parents) {
        this(name, lifeStage);

        if (parents.length != 2)
            throw new ParentsException("Incorrect parents amount!");

        this.parents = parents;
    }

    /**
     * Constructor of the class, that creates basic person having name,
     * life stage, parents and description.
     *
     * @param name        name of the person given in format
     *                    {&gt;first_name&lt;,&gt;last_name&lt;}
     * @param lifeStage   life stage of the person taken
     *                    from @see {@link ru.ibarciuc.tree.utils.LifeStages}
     * @param parents     parents of the person given in format
     *                    {&gt;first_parent&lt;,&gt;second_parent&lt;}
     * @param description description of the person
     */
    public Person(String[] name, String lifeStage, Person[] parents,
                  Description description) {
        this(name, lifeStage, parents);

        this.description = description;
    }

}
