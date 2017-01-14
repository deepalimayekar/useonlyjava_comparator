/**
 * 
 */
package compareMe;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

/**
 * @author Deepali Mayekar
 *
 */
public interface Comparator {
   HashMap hme = new HashMap();
   HashMap hmwo = new HashMap();
   public default void CompareWho(){
	   System.out.println("An unnecessary method or deviation where comparator is making an argument and asking who? should be compared);");
       
   }
   public static Object[] compare(HashMap hmme, HashMap hmhim){
	   ArrayList ArrayList = null;
	   hmhim.putIfAbsent("none", "none");
	   Object [] s = hmme.keySet().toArray();
	    
	return s;
	   // Method should return only similar objects in both HashMap or dissimilar objects from both HashMaps. 
	   // Conditions in returning ArrayList
	   // more than 75% of me is different from him ---> similar objects
	   // more than 75% of me is similar to him ---> dissimilar objects
	   // 
	// Since nothing is known from hmhim HashMap, we are assuming parameters that are vague 
   }

}