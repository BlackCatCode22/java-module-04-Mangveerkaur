package com.kaur.zoo;

import java.util.Date;

public class Animal {
    // Create a static int that keep track of the number of animals created.
    static int numOfAnimals = 0;

    // Create a constructor for our new Animal objects
    public Animal() {

        numOfAnimals++;
    }

    // Create a constructor that will accept all fields as arguments.
    public Animal(String sex, int age, int weight, String aniName,
                  String aniID, String aniBirthDate, String aniColor,
                  String aniOrigin, String aniArrivalDate) {
        // Add an animal to keep track of the number of animals in our zoo.
        numOfAnimals++;
        this.anisex = sex;
        this.aniage = age;
        this.aniweight = weight;
        this.aniName = aniName;
        this.aniID = aniID;
        this.aniBirthDate = aniBirthDate;
        this.aniColor = aniColor;
        this.aniOrigin = aniOrigin;
        this.aniArrivalDate = aniArrivalDate;
    }

    // Create all attributes (fields) needed for the ZooKeeperChallenge program.




    // sex will be 'male' or 'female'
    private String sex;
    // age will be in years
    private int age;
    // weight will be in pounds
    private int weight;
    // name will be a String;
    private String aniName;
    // animalID will be first two latin letters of the species name and an integer number. Number part of the ID must be
    // at least two characters. For example: Hy01, Hy02, Be01, Be02, etc.
    private String aniID;
    // animalBirthDate is going to be a string here (in this class)
    private String aniBirthDate;
    // animalColor is a String
    private String aniColor;
    // origin will be a string like: "from Friguia Park, Tunisia"
    private String aniOrigin;
    // arrival date will be the system date when the animal object was created
    private String aniArrivalDate;

    // Create getters and setters

    public String getAniOrigin() {
        return animalOrigin;
    }
    public void setAniOrigin(String aniOrigin) {
        this.aniOrigin = aniOrigin;
    }

    public String getAniColor() {
        return aniColor;
    }
    public void setAniColor(String aniColor) {
        this.aniColor = aniColor;
    }

    public String getAniBirthDate() {
        return aniBirthDate;
    }
    public void setAniBirthDate(String aniBirthDate) {
        this.aniBirthDate = aniBirthDate;
    }

    public String getAniID() {
        return aniID;
    }
    public void setAniID(String aniID) {
        this.aniID = aniID;
    }

    public String getAniName() {
        return aniName;
    }
    public void setAniName(String aniName) {
        this.aniName = aniName;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }
    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getWeight() {
        return weight;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getAniArrivalDate() { return aniArrivalDate; }
    public void setAniArrivalDate(String aniArrivalDate) { this.aniArrivalDate = aniArrivalDate; }
}
