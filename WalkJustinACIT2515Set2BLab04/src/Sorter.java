/*
Sorter.java
By: Justin Walk, A00928087, ACIT 2515, SET 2B, February 7 2015
This class contains all the methods used for searching and sorting
*/
import java.util.ArrayList;
import java.io.PrintWriter;
import java.io.FileNotFoundException;

public class Sorter {

    //Do a selection sort
    public static void selectSort() {
        double start = System.currentTimeMillis();
        for (int i = 0; i < Driver.list.size(); i++) {
            int index = i;
            for (int j = i + 1; j < Driver.list.size(); j++) {
                if (((Organic) Driver.list.get(index)).compareTo(Driver.list.get(j)) == 0) {
                    index = j;
                }
            }
            Object temp = Driver.list.get(index);
            Driver.list.set(index, Driver.list.get(i));
            Driver.list.set(i, temp);
        }
        double end = System.currentTimeMillis();
        System.out.println("Time to complete select sort: " + (end - start) + "ms");
    }

    
    //Do an insertion sort
    public static void insertionSort() {
        double start = System.currentTimeMillis();
        for (int j = 1; j < Driver.list.size(); j++) {
            Object index = Driver.list.get(j);
            int i = j;
            for (i = j - 1; i >= 0 && (((Organic) Driver.list.get(i)).compareTo(index) == 0); i--) {
                Driver.list.set(i + 1, Driver.list.get(i));
            }
            Driver.list.set(i + 1, index);
        }
        double end = System.currentTimeMillis();
        System.out.println("Time to complete insertion sort: " + (end - start) + "ms");
    }
    
    //Do a linear search
    public static void linearSearch(String search){
        double start = System.currentTimeMillis();
        int count = 0;
        for (int index = 0; index < Driver.list.size(); index++){
            if(Driver.list.get(index).toString().equalsIgnoreCase(search)){
                count++;
            }
        }
        System.out.println("There are " + count + " matches");
        double end = System.currentTimeMillis();
        System.out.println("Time to complete linear search: " + (end - start) + "ms");
    }
    
    //Do a binary search
    public static void binarySearch(String search){
        int low = 0;
        int high = Driver.list.size() - 1;
        int mid;
        double start = System.currentTimeMillis();
        while (low <= high) {
            mid = (low + high) / 2;
            if (((Organic)Driver.list.get(mid)).toString().compareTo(search) > 0){
                high = mid - 1;
            } else if (((Organic)Driver.list.get(mid)).toString().compareTo(search) < 0){
                low = mid + 1;
            } else {
                System.out.println("Found match at index of " + mid);
                break;
            }
        }
        double end = System.currentTimeMillis();
        System.out.println("Time to complete binary search: " + (end - start) + "ms");
    }
    
    //write a file
    public static void writeStuff(ArrayList list, String name) throws FileNotFoundException{
        PrintWriter writer = new PrintWriter(name);
        for (int index = 0; index < list.size(); index++){
            switch (list.get(index).toString()){
                case "animal":
                    Animal animal = (Animal)list.get(index);
                    writer.println("animal," + animal.name + "," + animal.type + "," + animal.weight + " ,,,,,");
                    break;
                case "fruit":
                    Fruit fruit = (Fruit)list.get(index);
                    writer.println("fruit," + fruit.colour + "," + fruit.kind + "," + fruit.tart + ",,,,,");
                    break;
                case "human":
                    Human human = (Human)list.get(index);
                    writer.println("human," + human.lname + "," + human.fname + "," + human.location + " ,,,,,");
                    break;
            }
        }
        writer.close();
    }
}
