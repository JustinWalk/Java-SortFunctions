/*
Driver.java
By: Justin Walk, A00928087, ACIT 2515, SET 2B, February 7 2015
This is the driver class for a searching/sorting program
*/
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Driver {

    public static ArrayList list = new ArrayList();
    
    public static void main(String[] args) throws FileNotFoundException{
        
        //select sort
        Driver.makeList();
        Sorter.selectSort();
        Sorter.writeStuff(list, "select.txt");
        list.clear();
        
        //insertion sort
        Driver.makeList();
        Sorter.insertionSort();
        Sorter.writeStuff(list, "insert.txt");
        
        //linear search
        String search = "fruit";
        Sorter.linearSearch(search);
        
        //binary search
        Sorter.binarySearch("animal");
        
    }
    public static void makeList() throws FileNotFoundException{
        //create array list for object to be sorted, and read file for data to input
        File file = new File("entities.txt");
        Scanner scan = new Scanner(file);
        
        //add data to the array line by line
        while (scan.hasNextLine()){
            String line = scan.nextLine();
            Scanner readLine = new Scanner(line).useDelimiter(",");
            String type = readLine.next();
            if (type.equals("animal")) {
                Animal animal = new Animal(readLine.next(), readLine.next(), readLine.nextDouble());
                list.add(animal);
            } else if (type.equals("human")) {
                Human human = new Human(readLine.next(), readLine.next(), readLine.next());
                list.add(human);
            } else if (type.equals("fruit")) {
                Fruit fruit = new Fruit(readLine.next(), readLine.next(), readLine.next());
                list.add(fruit);
            }
        }
    }
}
