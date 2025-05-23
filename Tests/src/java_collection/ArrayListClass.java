package java_collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListClass {

//	Iterator<E>
//	Collection<E>
//	List<E>
//	ArrayList<E> is the class

	public static void main(String[] args) {

		streamOnArrayList();
	}

	public static void basicOperations() {

//	1. Basic Operations
//		add(E e)
//		add(int index, E element)
//		get(int index)
//		set(int index, E element)
//		remove(int index)
//		remove(Object o)
//		clear()
//		size()
//		isEmpty()

		List<Long> arrayList = new ArrayList<Long>();
// 1.		add(E e)
		arrayList.add(100l);
		arrayList.add(200l);
		System.out.println(arrayList);
// 2.		add(int index, E element)
		arrayList.add(0, 0l);
		System.out.println(arrayList);
// 3.		get(int index)
		Long data = arrayList.get(0);
		System.out.println("Array List Index 0 Contain :: " + data);
// 4.		set(int index, E element)
		arrayList.set(1, 10l); // -- Set will erase the existing data and add new one for specific index
		System.out.println(arrayList);
// 5.		remove(Object o)
		arrayList.remove(0);// we can remove using index or value as well
		System.out.println(arrayList);
// 6.		clear()
		arrayList.clear(); // removes all data
		System.out.println(arrayList);
// 7.		size()
		System.out.println("Array List current size is :: " + arrayList.size());
// 8.		isEmpty()
//		arrayList = null; and then we try to do like arrayList.isEmpty() we get Null Pointer Exception.
		System.out.println("Is Array List Empty :: " + arrayList.isEmpty());
	}

	public static void seachAndCheckInArrayList() {

//	2. Search & Check
//		contains(Object o)
//		indexOf(Object o)
//		lastIndexOf(Object o)

		List<String> arrayList = new ArrayList<>();
		arrayList.add("Nilesh");
		arrayList.add("Dhawale");
//		arrayList.add("Nilesh");
// 1.		contains(Object o)
		String name = "Nilesh";
		System.out.println(arrayList.contains(name));
// 2.		indexOf(Object o) // if not found returns -1
		System.out.println(arrayList.indexOf(name));
// 3.		lastIndexOf(Object o) // if not found returns -1
		System.out.println(arrayList.lastIndexOf(name));
	}

	public static void iterationOnArrayList() {

//	3. Iteration
//		iterator()
//		listIterator()
//		listIterator(int index)
//		forEach(Consumer<? super E> action)

		List<String> arrayList = new ArrayList<>();
		arrayList.add("Nilesh");
		arrayList.add("Shivaji");
		arrayList.add("Dhawale");
		String name = "Nilesh";
// 1.		iterator()
		Iterator<String> iterator = arrayList.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
// 2.		listIterator() // Difference between iterator and listIterator :: iterator traverse one way and listIterator two way
		ListIterator<String> listIterator = arrayList.listIterator();
		while (listIterator.hasNext()) {
			System.out.println(listIterator.next());
		}
// 3.		listIterator(int index)
		ListIterator<String> listIterator2 = arrayList.listIterator(1);
		while (listIterator2.hasNext()) {
			System.out.println("Index in list Iterator :: " + listIterator2.next());
		}
// 4.		forEach(Consumer<? super E> action)
		arrayList.forEach(ss -> {
			System.out.println("Test :: " + ss);
		});
	}

	public static void bulkOperationArrayList() {

//	4. Bulk Operations
//		addAll(Collection<? extends E> c)
//		addAll(int index, Collection<? extends E> c)
//		removeAll(Collection<?> c)
//		retainAll(Collection<?> c)
//		containsAll(Collection<?> c)
	}

	public static void utilityOnArrayList() {

//	5. Utility
//		toArray()
//		toArray(T[] a)
//		subList(int fromIndex, int toIndex)
//		equals(Object o)
//		hashCode()

		List<String> arrayList = new ArrayList<>();
		arrayList.add("Nilesh");
		arrayList.add("Dhawale");

// 1.		toArray()
		Object[] array = arrayList.toArray();
		System.out.println(Arrays.toString(array));

// 2.		toArray(T[] a) // to get specific index and create array of it
		String[] array2 = arrayList.toArray(new String[0]);
		System.out.println(Arrays.toString(array2));

// 3.		subList(int fromIndex, int toIndex)
		List<String> subList = arrayList.subList(0, 2);
		System.out.println("Sub Array :: " + subList);

// 4.		equals(Object o)
		System.out.println("Equals :: " + arrayList.equals(subList));

// 5.		hashCode()
		System.out.println("Hash Code :: " + arrayList.hashCode());
	}

	public static void streamOnArrayList() {

//	6. Java 8+ Stream & Lambda Support
//		stream()
//		parallelStream()
//		removeIf(Predicate<? super E> filter)
//		replaceAll(UnaryOperator<E> operator)
//		sort(Comparator<? super E> c)

		List<String> arrayList = new ArrayList<>();
		arrayList.add("Nilesh");
		arrayList.add("Dhawale");

// 1.		stream() -- single threaded
		arrayList.stream().forEach(ss -> {
			System.out.println("Threads :: " + Thread.currentThread().getName() + " Value :: " + ss);
		});
// 2.		parallelStream() -- multi threaded
		arrayList.parallelStream().forEach(ss -> {
			System.out.println("Threads :: " + Thread.currentThread().getName() + " Value" + " :: " + ss);
		});
// 3.		removeIf(Predicate<? super E> filter)
		arrayList.add("Remove It");
		arrayList.removeIf(ss -> ss.equals("Remove It"));
		System.out.println("Data :: " + arrayList);
// 4.		replaceAll(UnaryOperator<E> operator)
		arrayList.replaceAll(ss -> "Replaced");
		System.out.println("Replaced Data :: " + arrayList);
// 5.		sort(Comparator<? super E> c)
		List<String> list = new ArrayList<>();
		list.add("Nilesh");
		list.add("Dhawale");
		list.sort(Comparator.reverseOrder());
		System.out.println("List R :: " + list);
		list.sort(Comparator.naturalOrder());
		System.out.println("List N :: " + list);
	}
}
