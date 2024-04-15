import java.util.ArrayList;
import java.util.List;

public class _29SubListFromArraylist {
    public static void main(String[] args) {

        ArrayList<String> col_list = new ArrayList<String>();
 
		col_list.add("Blue");
		col_list.add("Green");
		col_list.add("Pink");
		col_list.add("Black");
		col_list.add("Red");
		col_list.add("orange"); 
		col_list.add("White"); 
 
		List<String> cl = col_list.subList(1,5);
 
		//display elements of sublist.
		System.out.println("Display Elements of Sublist Contains... ");
		for(int i=0; i< cl.size() ; i++)
		{			
			System.out.println(cl.get(i));
		}
 
		//remove one element from sub list
		Object obj = cl.remove(2);
		System.out.println("Removed from sub list is : "+obj);
 
		//print original ArrayList
		System.out.println("After removing from SubList ArrayList contains.. ");
		for(int i=0; i< col_list.size() ; i++)
		{
			System.out.println(col_list.get(i));
		}



    }
}