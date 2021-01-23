package ru.ibarciuc.tree.utils;

public enum LifeStages {
    BABY("Baby"),
    TODDLER("Toddler"),
    CHILD("Child"),
    TEEN("Teen"),
    YOUNG_ADULT("Young adult"),
    ADULT("Adult"),
    ELDER("Elder");

    private String lifeStage;

    LifeStages(String ageGroup) {
        this.lifeStage = ageGroup;
    }

    public String getLifeStage(){
        return lifeStage;
    }
}
