/*
Fruit.java
By: Justin Walk, A00928087, ACIT 2515, SET 2B, February 7 2015
Class for creating and comparing fruit objects
*/
public class Fruit extends Organic implements Comparable {
    
    String colour;
    String kind;
    String tart;
    
    //Constructor for fruit, requires colour, kind and tartness
    public Fruit(String colour, String kind, String tart){
        this.colour = colour;
        this.kind = kind;
        this.tart = tart;
    }
    
    //toString to return class type
    public String toString(){
        return "fruit";
    }
    
    //Compare based on attributes
    public int fruitCompareTo(Fruit fruit){
        if (this.kind.compareTo(fruit.kind) < 0){
            return 1;
        } else if (this.kind.compareTo(fruit.kind) > 0){
            return 0;
        } else if (this.colour.compareTo(fruit.colour) < 0){
            return 1;
        } else if (this.colour.compareTo(fruit.colour) > 0) {
            return 0;
        } else if (this.tart.compareTo(fruit.tart) < 0){
            return 1;
        } else if (this.tart.compareTo(fruit.tart) > 0){
            return 0;
        }
        return 0;
    }
    
    //Compare based on to string
    public int compareTo(Object object){
        if (this.toString() == object.toString()){
            return this.fruitCompareTo((Fruit)object);
        }
        if (this.toString().compareTo(object.toString()) < 0){
           // System.out.println("fruit:" + this.toString() + " " + object.toString() + " return 1");
            return 1;
        } else 
           // System.out.println("fruit:" + this.toString() + " " + object.toString() + " return 0");
            return 0;
    }
}
