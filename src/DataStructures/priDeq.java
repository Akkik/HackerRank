package DataStructures;

import java.util.*;

public class priDeq {

	public static void main(String[] args) {
		
		Deque deque = new ArrayDeque<>();
		List<String> ll=  new ArrayList();
		Scanner sc =new Scanner(System.in);
		 int count = sc.nextInt();
		 for(int i=0;i< count+1;i++) {
			 ll.add(sc.nextLine());
		 }
		Priorities priorities = new Priorities();
		List<Student> s = priorities.getStudents(ll);
		sc.close();
	}
	
	
	
}

class Checker implements Comparator<Student> {
    public int compare(Student p1, Student p2) {
        int nameSort = p1.getName().compareTo(p2.getName());
        int cgpaSort =p2.getCGPA().compareTo(p1.getCGPA());
        int idSort = p1.getID().compareTo(p2.getID());
        if (cgpaSort == 0) {
            return ((nameSort == 0) ? idSort : nameSort);
        } else {
            return cgpaSort;
        }
    }
}
class Student{
	private String name;
	private Integer ID ;
	private Double CGPA;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getID() {
		return ID;
	}
	public void setID(Integer iD) {
		ID = iD;
	}
	public Double getCGPA() {
		return CGPA;
	}
	public void setCGPA(Double cGPA) {
		CGPA = cGPA;
	}
	public Student(int id, String name, double cgpa) {
		super();
		this.name = name;
		ID = id;
		CGPA = cgpa;
	}
}

class Priorities{
	public List<Student> getStudents(List<String> events) {
		
		
		PriorityQueue <Student> pq = new PriorityQueue<Student>(Comparator.comparing(Student::getCGPA).reversed().thenComparing(Student::getName).thenComparing(Student::getID));
		
		
		/*PriorityQueue<Student> pq = new PriorityQueue<>(s
				Comparator.comparing(Student::getCGPA).reversed().thenComparing(Student::getName).thenComparing(Student::getID));*/
		for(int i=0;i<events.size();i++) {
			if(i==0)
				continue;	
			String[] details =  events.get(i).split(" ");
			if(details[0].equalsIgnoreCase("ENTER")) {
				String name = details[1];
				double cgpa = Double.parseDouble(details[2]);
				int id = Integer.parseInt(details[3]);
				Student s = new Student(id,name,cgpa);
				pq.add(s);
			}else {
				pq.poll();
			}
		}
		List<Student> l = new ArrayList<Student>();
		int size =  pq.size();
		while(size > 0) {
			l.add((pq.poll()));
			size--;
		}
		return l;
	}

}