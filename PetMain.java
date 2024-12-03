// PetMain.java
// Kameron Ibraheem
// Lab 06: PetMain
//
//

import java.util.Random;
import java.util.ArrayList;

public class PetMain {
    public static void main(String[] args) {
        Dog[] dogShelter = new Dog[10];
        
        // initialize each dog object in the array
        for (int i = 0; i < dogShelter.length; i++) {
            dogShelter[i] = new Dog();
        }

        // display all dogs' information
        displayAllDogs(dogShelter);

        // display the petIDs of all the cat chasers
        displayCatChasers(dogShelter);

        // display the oldest Dog
        Dog oldestDog = getOldestDog(dogShelter);
        System.out.println("Oldest Dog:");
        oldestDog.displayInfo();

        // cat ArrayList
        ArrayList<Cat> catShelter = new ArrayList<>();
        
        // ddd 20 Cat objects to the catShelter ArrayList
        for (int i = 0; i < 20; i++) {
            catShelter.add(new Cat());
        }

        // display all cats information
        displayAllCats(catShelter);

        // display the petIDs of all declawed cats
        displayDeclawedCats(catShelter);

        // display the youngest Cat
        Cat youngestCat = getYoungestCat(catShelter);
        System.out.println("Youngest Cat:");
        youngestCat.displayInfo();

        // display the tallest Cat
        Cat tallestCat = getTallestCat(catShelter);
        System.out.println("Tallest Cat:");
        tallestCat.displayInfo();
    }

    // methods for Dogs
    public static void displayAllDogs(Dog[] dogShelter) {
        for (int i = 0; i < dogShelter.length; i++) {
            dogShelter[i].displayInfo();
            System.out.println();
        }
    }

    public static void displayCatChasers(Dog[] dogShelter) {
        System.out.println("Cat Chasers:");
        for (int i = 0; i < dogShelter.length; i++) {
            if (dogShelter[i].isCatChaser()) {
                System.out.println(dogShelter[i].getPetID());
            }
        }
        System.out.println();
    }

    public static Dog getOldestDog(Dog[] dogShelter) {
        Dog oldest = dogShelter[0];
        for (int i = 0; i < dogShelter.length; i++) {
            if (dogShelter[i].getAge() > oldest.getAge()) {
                oldest = dogShelter[i];
            }
        }
        return oldest;
    }

    // methods for Cats
    public static void displayAllCats(ArrayList<Cat> catShelter) {
        for (Cat cat : catShelter) {
            cat.displayInfo();
            System.out.println();
        }
    }

    public static void displayDeclawedCats(ArrayList<Cat> catShelter) {
        System.out.println("Declawed Cats:");
        for (Cat cat : catShelter) {
            if (cat.isDeclawed()) {
                System.out.println(cat.getPetID());
            }
        }
        System.out.println();
    }

    public static Cat getYoungestCat(ArrayList<Cat> catShelter) {
        Cat youngest = catShelter.get(0);
        for (Cat cat : catShelter) {
            if (cat.getAge() < youngest.getAge()) {
                youngest = cat;
            }
        }
        return youngest;
    }

    public static Cat getTallestCat(ArrayList<Cat> catShelter) {
        Cat tallest = catShelter.get(0);
        for (Cat cat : catShelter) {
            if (cat.getHeight() > tallest.getHeight()) {
                tallest = cat;
            }
        }
        return tallest;
    }
}
