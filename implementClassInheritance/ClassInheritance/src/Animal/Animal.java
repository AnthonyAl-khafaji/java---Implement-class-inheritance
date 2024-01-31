package Animal;

//Animal class
public class Animal {
 public int age;
 public String gender;

 public boolean isMammal() {
     System.out.println("This is the isMammal() method from Animal class");
     return true;
 }

 public void mate() {
     System.out.println("This is the mate() method from Animal class");
 }

 // Main method
 public static void main(String[] args) {
     // Creating objects
     Animal myAnimal = new Animal();
     Fish myFish = new Fish();
     Zebra myZebra = new Zebra();

     // Calling public methods from Animal class
     myAnimal.isMammal();
     myAnimal.mate();

     // Calling public methods from Zebra class
     myZebra.run();
 }
}

//Fish class as a subclass of Animal
class Fish extends Animal {
 private int sizeInFeet;

 private void canEat() {
     System.out.println("This is a private method canEat() from Fish class");
 }
}

//Zebra class as a subclass of Animal
class Zebra extends Animal {
 public boolean isWild;

 public void run() {
     System.out.println("This is the run() method from Zebra class");
 }
}