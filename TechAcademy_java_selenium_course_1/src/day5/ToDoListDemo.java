package day5;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class ToDoListDemo {

	public static void main(String[] args) {
		
		
		String [] list=new String []{"Attend Sprint meeting","discuss about today story points","Coding","Lunch","Debug the code","KT session","Scrum Meeting"};
		LocalTime[] time=new LocalTime[] {LocalTime.of(10,0),LocalTime.of(11,0),LocalTime.of(12,0),LocalTime.of(1,0),LocalTime.of(2,0),LocalTime.of(3,0),LocalTime.of(4,0)};
		
		int n=list.length;
		int k=time.length;
		
	for(int i=0;i<n && i<k;i++)
	{
		System.out.println(time[i]+" - "+list[i] );
	}

	}

}
