package com.example.starwars;

import java.util.ArrayList;
import java.util.List;

public class Character {
    private String id;
    private String name;
    private String height;
    private String mass;
    private String gender;
    private String homeworld;
    private String wiki;
    private String image;
    private String born;
    private String bornLocation;
    private String died;
    private String diedLocation;
    private String species;
    private String hairColor;
    private String eyeColor;
    private String skinColor;
    private String cybernetics;
    private List<String>affiliations = new ArrayList<>();
    private List<String>masters = new ArrayList<>();
    private List<String>apprentices = new ArrayList<>();
    private List<String>formerAffiliations = new ArrayList<>();



    public Character(String id, String name, String height, String mass, String gender, String homeworld, String wiki, String image, String born, String bornLocation, String died, String diedLocation, String species, String hairColor, String eyeColor, String skinColor, String cybernetics, List<String> affiliations, List<String> masters, List<String> apprentices, List<String> formerAffiliations) {
        this.id = id;
        this.name = name;
        this.height = height;
        this.mass = mass;
        this.gender = gender;
        this.homeworld = homeworld;
        this.wiki = wiki;
        this.image = image;
        this.born = born;
        this.bornLocation = bornLocation;
        this.died = died;
        this.diedLocation = diedLocation;
        this.species = species;
        this.hairColor = hairColor;
        this.eyeColor = eyeColor;
        this.skinColor = skinColor;
        this.cybernetics = cybernetics;
        this.affiliations = affiliations;
        this.masters = masters;
        this.apprentices = apprentices;
        this.formerAffiliations = formerAffiliations;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getHeight() {
        return height;
    }

    public String getMass() {
        return mass;
    }

    public String getGender() {
        return gender;
    }

    public String getHomeworld() {
        return homeworld;
    }

    public String getWiki() {
        return wiki;
    }

    public String getImage() {
        return image;
    }

    public String getBorn() {
        return born;
    }

    public String getBornLocation() {
        return bornLocation;
    }

    public String getDied() {
        return died;
    }

    public String getDiedLocation() {
        return diedLocation;
    }

    public String getSpecies() {
        return species;
    }

    public String getHairColor() {
        return hairColor;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public String getSkinColor() {
        return skinColor;
    }

    public String getCybernetics() {
        return cybernetics;
    }

    public List<String> getAffiliations() {
        return affiliations;
    }

    public List<String> getMasters() {
        return masters;
    }

    public List<String> getApprentices() {
        return apprentices;
    }

    public List<String> getFormerAffiliations() {
        return formerAffiliations;
    }
}
