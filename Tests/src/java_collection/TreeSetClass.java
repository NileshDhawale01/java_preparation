package java_collection;

import java.util.Comparator;
import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetClass {

//	Iterator<E>
//	Collection<E>
//	Set<E>
//	SortedSet<E>
//	TreeSet<E> is the class

//	6. ⚡ Java 8+ Stream & Lambda Support
//	stream()
//
//	parallelStream()
//
//	filter(...)
//
//	map(...)
//
//	collect(...)
//
//	anyMatch(...)
//
//	allMatch(...)
//
//	noneMatch(...)
//
//	reduce(...)
//
//	forEach(...)

	public static void main(String[] args) {

		utilityOnTreeSet();
	}

	public static void basicOperationOnTreeSet() {

//	1.  Basic Operations
//		add(E e)
//		remove(Object o)
//		clear()
//		size()
//		isEmpty()
//		first()
//		last()

		TreeSet<Student> student = new TreeSet<>();
// 1.		add(E e)
		student.add(new Student(1, "Nilesh"));
		student.add(new Student(2, "Dhawale"));
//		student.add(null); // java.lang.NullPointerException // null value not allowed

		System.out.println("tree set :: " + student);

// 2.		remove(Object o)
		Student student3 = new Student(3, "Nilesh");
		student.add(student3);
		boolean remove = student.remove(student3);
		System.out.println("Remove :: " + remove);

// 3.		clear()
		student.clear(); // it will remove all values form set
		System.out.println("Clear :: " + student + " Is Empty :: " + student.isEmpty());

// 4.		size()
		Integer size = student.size();
		System.out.println("Size :: " + size);

// 5.		isEmpty()
		Boolean isEmpty = student.isEmpty();
		System.out.println("Is Empty :: " + isEmpty);

// 6.		first() // get exception if Tree Set is Empty
		student.add(student3);
		Student first = student.first();
		System.out.println("First :: Record id :: " + first.getId() + " Name :: " + first.getName());

// 7.		last()

		student.add(new Student(4, "Test Data"));
		Student last = student.last();
		System.out.println("Last :: Record id :: " + last.getId() + " Name :: " + last.getName());

	}

	public static void searchInTreeSet() {

//2. Search & Check
//		contains(Object o)
//		ceiling(E e)
//		floor(E e)
//		higher(E e)
//		lower(E e)

		TreeSet<Student> treeSet = new TreeSet<>();
		treeSet.add(new Student(1, "Nilesh"));
		treeSet.add(new Student(2, "Dhawale"));

// 1.		contains(Object o) // matches by what Identification give in compareTo
		boolean isContain = treeSet.contains(new Student(1, "Any Data"));
		System.out.println("contain :: " + isContain);

// 2.		ceiling(E e) // next closest record
		Student ceiling = treeSet.ceiling(new Student(-1, "tenth Record"));
		System.out.println("ceiling :: " + ceiling.getName());

// 3.		floor(E e) // privies closest record
		Student floor = treeSet.floor(new Student(3, "privies close record"));
		System.out.println("floor :: " + floor.getName());

// 4.		higher(E e) // strictly greater than given number and closest next 
		Student higher = treeSet.higher(new Student(-1, "Test Data"));
		System.out.println("higher :: " + higher.getId() + " " + higher.getName());

// 5.		lower(E e) // strictly lower than given number and closest privies
		Student lower = treeSet.lower(new Student(10, "Test Data 2"));
		System.out.println("lower " + lower.getId() + " " + lower.getName());

	}

	public static void iterationInTreeMap() {

//	3.Iteration
//		iterator()
//		descendingIterator()
//		forEach(...)
//		Enhanced for-loop

		TreeSet<String> treeSet = new TreeSet<>();
		treeSet.add("Nilesh");
		treeSet.add("Dhawale");

// 1.		iterator()
		Iterator<String> iterator = treeSet.iterator();

		while (iterator.hasNext()) {
			System.out.println("Iterator :: " + iterator.next());
		}

// 2.		descendingIterator()
		Iterator<String> descendingIterator = treeSet.descendingIterator();
		while (descendingIterator.hasNext()) {
			System.out.println("Descending Iterator :: " + descendingIterator.next());
		}

// 3.		forEach(...)
		treeSet.forEach(ss -> System.out.println("For Each :: " + ss));
	}

	public static void bulkOperationOnTreeSet() {

//	4.Bulk Operations
//		addAll(Collection c)
//		removeAll(Collection c)
//		retainAll(Collection c)
//		containsAll(Collection c)
//		toArray()

	}

	public static void utilityOnTreeSet() {

//	5.Utility & Views
//		comparator()
//		clone()
//		subSet(from, to)
//		headSet(toElement)
//		tailSet(fromElement)
//		descendingSet()

		Comparator<Student> comparator = (a, b) -> Integer.compare(a.getId(), b.getId());
		TreeSet<Student> treeSet = new TreeSet<>(comparator);
		treeSet.add(new Student(1, "Nilesh"));
		treeSet.add(new Student(2, "Dhawale"));

// 1.		comparator() // used to add custom comparator
		// comparator is one type of utility with can add or compare data using our own
		// way or own condition.
		Comparator<? super Student> data = treeSet.comparator().reversed();
		System.out.println("Comparator :: " + data);

// 2.		clone()
		TreeSet<Student> clone = (TreeSet<Student>) treeSet.clone();
		System.out.println("Clone :: " + clone);

// 3.		subSet(from, to)
		SortedSet<Student> subSet = treeSet.subSet(new Student(0, ""), new Student(2, ""));
		System.out.println("SubSet :: " + subSet);
	}

}
