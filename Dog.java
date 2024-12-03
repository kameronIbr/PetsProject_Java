// Dog.java
// Kameron Ibraheem
// Lab 06: Dog
//
//

import java.util.Random;

public class Dog {
    // instance variables
    private String petID;
    private String type;
    private int age;
    private double height;
    private double weight;
    private double barkVolume;
    private double growlVolume;
    private boolean catChaser;

    // default constructor
    public Dog() {
        Random rand = new Random();
        type = "DOG";
        age = rand.nextInt(30);  // age between 0 and 29
        height = 4 + (36 * rand.nextDouble()); // height between 4 and 40 inches
        weight = 1 + (342 * rand.nextDouble()); // weight between 1 and 343 pounds
        barkVolume = rand.nextDouble() * 113.1; // bark between 0.0 and 113.1 decibels
        growlVolume = barkVolume / 2; // growl volume is half of bark volume
        catChaser = rand.nextBoolean(); // Randomly decide if the dog is a cat chaser
        petID = type + String.format("%04d", rand.nextInt(10000)); // PetID in format
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

    public double getBarkVolume() {
        return barkVolume;
    }

    public void setBarkVolume(double newBarkVolume) {
        barkVolume = newBarkVolume;
    }

    public double getGrowlVolume() {
        return growlVolume;
    }

    public boolean isCatChaser() {
        return catChaser;
    }

    // instance method to display the dog's information
    public void displayInfo() {
        System.out.println("Type:" + type + ";" + petID);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height + " inches");
        System.out.println("Weight: " + weight + " pounds");
        System.out.println("Bark Volume: " + barkVolume + " decibels");
        System.out.println("Growl Volume: " + growlVolume + " decibels");
        System.out.println("Cat Chaser: " + catChaser);
    }
}
