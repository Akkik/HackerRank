
public class ProblemSovingGrading {

	public static void main(String[] args) {
		
		int[] score = {73,67,38,33};
		//gradingStudents(score);
		System.out.println(kangaroo(4523,8092,9419,8076));
		
	}
	
	static int[] gradingStudents(int[] grades) {
		for(int i=0;i<grades.length;i++) {
			
				if( grades[i] < 38 || grades[i]%5 > 3 ) 
					continue;
				else
					grades[i] = grades[i] + 5 - grades[i]%5;
		}
		return grades;    
    }
	
	
	static String kangaroo(int x1, int v1, int x2, int v2) {
       int i,j;
		for (i=x1,j =x2;v1<10000 && v2<10000;) {
			if(i==j)
				return "YES";
			i = i + v1;
			j = j +  v2;	
		}
		return "NO";
    }
}
