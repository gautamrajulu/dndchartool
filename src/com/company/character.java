package com.company;

public class character {
    String charName;

    //base values of abilities
    int bStrength, bDexterity, bConstitution, bIntelligence, bWisdom, bCharisma, charLevel;

    charClass className;
    charRace raceName;
    charEquip charEquip;

    //all set functions set to private to prevent unwanted usage

    void setCharName(String name) {
        charName = name;
    }

    void setbStrength(int value) {
        bStrength = value;
    }

    int getbStrength() {
        return bStrength;
    }

    void setbDexterity(int value) {
        bDexterity = value;
    }

    int getbDexterity() {
        return bDexterity;
    }

    void setbConstitution(int value) {
        bConstitution = value;
    }

    int getbConstitution() {
        return bConstitution;
    }

    void setbIntelligence(int value) {
        bIntelligence = value;
    }

    int getbIntelligence() {
        return bIntelligence;
    }

    void setbWisdom(int value) {
        bWisdom = value;
    }

    int getbWisdom() {
        return bWisdom;
    }

    void setbCharisma(int value) {
        bCharisma = value;
    }

    int getbCharisma() {
        return bCharisma;
    }

    void setLevel(int levelValue) {
        charLevel = levelValue;
    }

    int getLevel() {
        return charLevel;
    }

    void addLevel(int addLevels) {
        charLevel = charLevel + addLevels;
    }

    public character(String name, int sValue, int dValue, int coValue, int iValue,
                     int wValue, int chValue, charClass cClass, charRace race, int levelValue) {
        this.charName = name;
        this.bStrength = sValue;
        this.bCharisma = chValue;
        this.bDexterity = dValue;
        this.bConstitution = coValue;
        this.bIntelligence = iValue;
        this.bWisdom = wValue;
        this.className = cClass;
        this.raceName = race;
        this.charLevel = levelValue;
    }
}
