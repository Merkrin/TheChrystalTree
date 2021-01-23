package ru.ibarciuc.tree.utils;

import java.util.ArrayList;
import java.util.List;

public class Description {
    private String ownerId;

    private List<String> paragraphs = new ArrayList<>();

    public Description(String ownerId){
        this.ownerId = ownerId;

        generateEmptyDescription();
    }

    public Description(String ownerId, List<String> paragraphs){
        this.ownerId = ownerId;

        this.paragraphs = paragraphs;
    }

    private void generateEmptyDescription(){
        paragraphs.add("Here could be your description, TODO RANDOMS");
    }
}
