package diana.algoriths.dynamicarray;

import java.util.ArrayList; 
import java.util.Collections; 
/** 
 * 
 * Java program to demonstrate How to sort ArrayList in Java in both ascending 
 * and descending order by using core Java libraries.
 * 
 * @author Javin
 */ 
public class CollectionTest { 

    
    public static void main(String args[]) { 
    
        //Creating and populating ArrayList in Java for Sorting 
        ArrayList<String> unsortedList = new ArrayList<String>(); 
        
        unsortedList.add("Java"); 
        unsortedList.add("C++"); 
        unsortedList.add("J2EE"); 
        
        System.err.println("unsorted ArrayList in Java : " + unsortedList); 
        
        //Sorting ArrayList in ascending Order in Java 
        Collections.sort(unsortedList); 
        System.out.println("Sorted ArrayList in Java - Ascending order : " + unsortedList); 
        
        //Sorting ArrayList in descending order in Java 
        Collections.sort(unsortedList, Collections.reverseOrder()); 
        System.err.println("Sorted ArrayList in Java - Descending order : " + unsortedList); 
    } 
} 