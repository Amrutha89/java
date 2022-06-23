package collectiondemo.org.collectiondemo;

import java.util.ArrayList;

public class CollectionDemo {
	public void demo() {
		ArrayList list=new ArrayList ();
		list.add("Maha");
		list.add("Kanasu");
		list.add("Monika");
		list.add(12);
		list.add(12.78);
		
		for(Object s:list)
		{
		System.out.println(s);
		}
		
		
	}
	public static void main(String[] args) {
		CollectionDemo cd=new CollectionDemo();
		cd.demo();
	}

}

