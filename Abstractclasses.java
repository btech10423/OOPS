public class Abstractclasses
{
	public static void main(String[] args) {
	   // Horse h = new Horse();
	   // h.eat();
	    //h.walk();
	   // System.out.println(h.color);
	   //Chicken c = new Chicken();
	   // c.eat();
	   // c.walk();
	    Mustang myHorse = new Mustang();
	
	}
}
abstract class Animal{
    String color;
    Animal(){
        //color = "brown";
        System.out.println("animal constructor called");
    }
    void eat(){
        System.out.println("animal eats");
    }
    abstract void walk();
}
class Horse extends Animal{
    Horse(){
      System.out.println("Horse constructor called"); 
    }
    void changecolor(){
        color = "darkbrown";
    }
    void walk(){
    System.out.println("walks on 4 legs");
}
}
class Mustang extends Horse{
    Mustang(){
      System.out.println("Mustang constructor called");
    }
}
class Chicken extends Animal{
    void changecolor(){
       color = "yellow"; 
    }
    void walk(){
    System.out.println("walks on 2 legs");
}
}