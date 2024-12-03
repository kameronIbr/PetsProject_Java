// Cat.java
// Kameron Ibraheem
// Lab 06: Cat
//
//

import java.util.Random;

public class Cat {
    // instance variables
    private String petID;
    private String type;
    private int age;
    private double height;
    private double weight;
    private double purrVolume;
    private double meowVolume;
    private boolean declawed;

    // default constructor
    public Cat() {
        Random rand = new Random();
        type = "CAT";
        age = rand.nextInt(39);  // age between 0 and 38
        height = 8 + (2 * rand.nextDouble()); // height between 8 and 10
        weight = 6 + (6 * rand.nextDouble()); // weight between 6 and 12
        purrVolume = rand.nextDouble() * 67.8; // purr volume between 0.0 and 67.8
        meowVolume = purrVolume * 1.35; // meow is 1.35 times louder
        declawed = rand.nextBoolean(); // random cat is declawed
        petID = type + String.format("%04d", rand.nextInt(10000)); // PetID
    }

    // getters and setters
    public String getPetID() {
        return petID;
    }

    public String getType() {
        return type;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int newAge) {
        age = newAge;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double newHeight) {
        height = newHeight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double newWeight) {
        weight = newWeight;
    }

    public double getPurrVolume() {
        return purrVolume;
    }

    public void setPurrVolume(double newPurrVolume) {
        purrVolume = newPurrVolume;
    }

    public double getMeowVolume() {
        return meowVolume;
    }

    public boolean isDeclawed() {
        return declawed;
    }

    // instance method to display the cat's information
    public void displayInfo() {
        System.out.println(petID + ": " + type);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height + " inches");
        System.out.println("Weight: " + weight + " pounds");
        System.out.println("Purr Volume: " + purrVolume + " decibels");
        System.out.println("Meow Volume: " + meowVolume + " decibels");
        System.out.println("Declawed: " + declawed);
    }
}
