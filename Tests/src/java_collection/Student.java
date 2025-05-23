package java_collection;

// Comparable make our class useful for that collection those are sorted or has maintain order like TreeSet, TreeMap
// Basically those are who implements SortedSet or SortedMap
public class Student implements Comparable<Student> {

	private Integer id;
	private String name;

	public Integer getId() {
		return this.id;
	}

	public String getName() {
		return this.name;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Student() {

	}

	public Student(Integer id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public int compareTo(Student o) {
		return Integer.compare(this.id, o.getId());
	}

}