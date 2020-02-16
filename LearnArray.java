package learn.javacollection.edu;

public class LearnArray {
	Integer[] student= new Integer[12];
	
	public void addStudent(Integer[] stdIds) {
		for(int i=0; i< stdIds.length; i++) {
			this.student[i] = stdIds[i];
		}
	}
	
	public void printStudent() {
		int counter=0;
		for(Integer i:  student) {
			System.out.println("Printing Array Element of index ["+counter+"] => "+i);
			counter++;
		}
	}
	
	public static void main(String[] args) {
		Integer[] testStd = {1,2,3,4,5,6,7,8,9,10,11,12};
		
		LearnArray arrObj = new LearnArray();
		arrObj.addStudent(testStd);
		arrObj.printStudent();

	}
}
