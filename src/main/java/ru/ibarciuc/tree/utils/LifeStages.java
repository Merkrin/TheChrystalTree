package ru.ibarciuc.tree.utils;

/**
 * Life stages enumerator taken from the "Sims 4"-universe.
 */
public enum LifeStages {
    BABY("Baby"),
    TODDLER("Toddler"),
    CHILD("Child"),
    TEEN("Teen"),
    YOUNG_ADULT("Young adult"),
    ADULT("Adult"),
    ELDER("Elder");

    private String lifeStage;

    /**
     * Constructor of the enumerator, that sets custom value.
     *
     * @param lifeStage value to set
     */
    LifeStages(String lifeStage) {
        this.lifeStage = lifeStage;
    }

    /**
     * Getter of the life stage value.
     *
     * @return string, that contains value of the life stage
     */
    public String getLifeStage() {
        return lifeStage;
    }
}
