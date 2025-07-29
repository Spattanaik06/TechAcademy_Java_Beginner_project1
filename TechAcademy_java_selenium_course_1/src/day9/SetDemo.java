package day9;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetDemo {

	public static void main(String[] args) 
	{
		Set<Integer> set=new HashSet<Integer>();
		set.add(1);
		set.add(4);
		set.add(5);
		set.add(4); //2nd time
		set.add(2);
		
		System.out.println(set);
		
		set.add(3);
		System.out.println(set);
		
		set.remove(4);
		System.out.println(set);
		System.out.println("Natural Sorting Order");
		set.stream().sorted(Comparator.naturalOrder()).forEach(s->System.out.print(s+"\n"));
		
		System.out.println("Reverse  Sorting Order");
		set.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
		
		Iterator<Integer> iterator = set.iterator();
		
		System.out.println("By help of Iterartor");
		while(iterator.hasNext())
		{
			System.out.println(+iterator.next());
		}
		
		
		
		

	}

}
