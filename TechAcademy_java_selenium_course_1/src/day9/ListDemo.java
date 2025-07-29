package day9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) 
	{
		List<Integer> asList = Arrays.asList(1,2,3,4,5);
		List<Integer> list=new ArrayList<>(asList);
		list.add(6);
		System.out.println(list);
		list.set(0, 0);
		System.out.println(list);

		System.out.println(list.get(3));
		
		list.remove(3);  // remove index wise 
		System.out.println(list);
		Collections.sort(list,Collections.reverseOrder());
		System.out.println("After the sorting in reverse order :"+list);
		
		
	}

}
