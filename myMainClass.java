package compareMe;

import java.util.ArrayList;
import java.util.HashMap;

public class myMainClass implements Comparator{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  HashMap hmme = new HashMap();
  hmme.put("Name", "useonlyjava");
  hmme.put("geolocation", "ondesk");
  String[] j= {"java", "etc"};
  hmme.put("interest", j);
       // so far this describes me
  HashMap hmmekid = new HashMap();
  hmme.put("Name", "useonlyjava-script");
  hmme.put("geolocation", "onplaytable");
  String[] k= {"munching", "etc"};
  hmme.put("interest", k);
  HashMap hmmeworld = new HashMap();
  hmmeworld.put("Me", hmme);
  hmmeworld.put("Mine", hmmekid);
  HashMap hmnull = new HashMap();
  hmnull = null;
  
  Object[] a = compare(hmme, hmnull);
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
