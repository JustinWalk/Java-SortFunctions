/*
Animal.java
By: Justin Walk, A00928087, ACIT 2515, SET 2B, February 7 2015
Class for creating and comparing animal objects
*/
public class Animal extends Organic implements Comparable{
    
    String name;
    String type;
    double weight;
    
    //Constructor for animal, requires name, type and weight
    public Animal(String name, String type, double weight){
        this.name = name;
        this.type = type;
        this.weight = weight;
    } 
    
    //toString to return class type
    public String toString(){
        return "animal";
    }
    
    //Compare based on the attributes of the object
    public int animalCompareTo(Animal animal){
        if (this.type.compareTo(animal.type) < 0) {
            return 1;
        } else if (this.type.compareTo(animal.type) > 0){
            return 0;
        } else if (this.weight > animal.weight){
            return 1;
        } else if (this.weight < animal.weight){
            return 0;
        } else if (this.name.compareTo(animal.name) < 0){
            return 1;
        } else if (this.name.compareTo(animal.name) > 0){
            return 0;
        } else return 0; 
    }
    
    //Compare based on to string
    public int compareTo(Object object){
        if (this.toString() == object.toString()){
            return this.animalCompareTo((Animal)object);
        }
        if (this.toString().compareTo(object.toString()) < 0){
            return 1;
        } else return 0;
    }
}
