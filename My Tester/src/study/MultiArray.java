/**
 * 
 */
package study;

/**
 * @author User
 *
 */
public class MultiArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String course_subjects [][]= new String [2][2];
		course_subjects [0][0]= "CS-Maths";
		course_subjects [0][1]= "CS-English";
		course_subjects [1][0]= "AC-Account";
		course_subjects [1][1]= "AC-Bahasa";
		
		String course_subject2 [][] = {{"CS-math","CS-English"},{"AC-account","AC-Bahasa"}};
		
		for(int i=0 ; i <course_subjects.length; i++) {
		for(int j=0 ; j <course_subjects[i].length; j++) {
		System.out.println(" Course of "+ i + " Subject of " + j+ " is " + course_subjects [i][j]);
	}
    }
	

	}

}
