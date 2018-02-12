/**
 * 
 */
package study;

/**
 * @author User
 *
 */
public class Study {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder("I am studying java"); 
		//sb.append ("I am studying java");
	    
		
		System.out.println("First 3 character is : "+ sb.substring (0,4));
		System.out.println("Last 3 character is : "+  sb.substring (5,14)); 
		System.out.println("Extract studying and print : "+ sb.substring (14));
	}
	}


