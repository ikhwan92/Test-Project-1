/**
 * 
 */
package study;

import java.util.ArrayList;

/**
 * @author User
 *
 */
public class TestArrayList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al= new ArrayList();
		
		for (String str:args) {
			al.add(str);
		System.out.println("Array list is empty:" + al.isEmpty());
		
		
		//al.add(new Integer(10));
		//al.add (Boolean.TRUE);
		
		Object ar []= al.toArray();
		System.out.println(al);
		
		}

	}

}
