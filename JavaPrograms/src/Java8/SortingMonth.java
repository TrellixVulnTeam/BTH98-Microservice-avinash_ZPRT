package Java8;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;



  public class SortingMonth 
  {
  
	  public static void main(String[] args)
  {

		
	Set<String> set = new TreeSet<String>(new Comparator<String>()
	{
	
		public int compare(String o1, String o2) 
	{
	try 
	{
	
		SimpleDateFormat sdf = new SimpleDateFormat("MMM");
	 
		return sdf.parse(o1).compareTo(sdf.parse(o2)); //Compare Date with date
	} 
	catch (ParseException ex) {
	return o1.compareTo(o2);
	}
	}
	});
	
	set.add("Feb");
	set.add("Jan");
	
	
	
	set.add("Dec");
	set.add("Mar");
	
	
	
	set.add("June");
	set.add("May");
	
	
	
	set.add("Aug");
	set.add("July");
	
	
	
	set.add("Sep");
	set.add("Oct");
	
	set.add("April");
	set.add("Nov");
	
	System.out.println(set);
	
	
	
	}
	}