/*
Human.java
By: Justin Walk, A00928087, ACIT 2515, SET 2B, February 7 2015
Class for creating and comparing human objects
*/
public class Human extends Organic implements Comparable{
    
    String fname;
    String lname;
    String location;
    
    //Constructor for human, requires first name, last name and location
    public Human(String fname, String lname, String location){
        this.fname = fname;
        this.lname = lname;
        this.location = location;
    }
    
    //toString to return class type
    public String toString(){
        return "human";
    }
    
    //Compare based on attributes
    public int humanCompareTo(Human human){
        if(this.lname.compareTo(human.lname) < 0){
            return 1;
        } else if(this.lname.compareTo(human.lname) > 0){
            return 0;
        } else if(this.fname.compareTo(human.fname) < 0){
            return 1;
        } else if(this.fname.compareTo(human.fname) > 0){
            return 0;
        } else if(this.location.compareTo(human.location) < 0){
            return 1;
        } else if(this.location.compareTo(human.location) > 0){
            return 0;
        }
        return 0;
    }
    
    //Compare based on to string
    public int compareTo(Object object){
        if (this.toString() == object.toString()){
            return this.humanCompareTo((Human)object);
        }
        if (this.toString().compareTo(object.toString()) < 0){
            return 1;
        } else return 0;
    }
}
