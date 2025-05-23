package java_collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class HashSetClass {

//	Iterator<E>
//	Collection<E>
//	Set<E>
//	HashSet<E> is the class

	public static void main(String[] args) {

		java8OnHashSet();
	}

	public static void basicHashSetOperations() {

//	1. Basic Operations
//		add(E e)
//		remove(Object o)
//		clear()
//		size()
//		isEmpty()

// 1.		add(E e) -- accept null,no duplicates, no order
		HashSet<String> hashSet = new HashSet<>();
		hashSet.add(null);
		hashSet.add(null);
		hashSet.add("Nilesh");
		hashSet.add("Nilesh");
		hashSet.add("Dhawale");
		System.out.println("Hash Set Data :: " + hashSet + " Size :: " + hashSet.size());

// 2.		remove(Object o)
		hashSet.add("Remove Data");
		hashSet.remove("Remove Data");
		System.out.println("Remove Data :: " + hashSet);

// 3.		clear()
		hashSet.clear();
		System.out.println("Clear :: " + hashSet + " Size :: " + hashSet.size());

// 4.		size()
		hashSet.add("Nilesh");
		hashSet.add("Dhawale");
		System.out.println("Size :: " + hashSet.size());

// 5.		isEmpty()
		System.out.println("Is Empty :: " + hashSet.isEmpty());
	}

	public static void searchInHashSet() {

//	2. Search & Check
//		contains(Object o)
//		equals(Object o)
//		hashCode()

		HashSet<String> hashSet = new HashSet<>();
		hashSet.add("Nilesh");
		hashSet.add("Dhawale");

// 1.		contains(Object o)
		Boolean isContain = hashSet.contains("Nilesh");
		System.out.println("isContain is HashSet :: " + isContain);

// 2.		equals(Object o) -- same length with save object
		HashSet<String> hashSet2 = new HashSet<>();
		hashSet2.add("Nilesh");
		hashSet2.add("Dhawale");
		Boolean equals = hashSet.equals(hashSet2);
		System.out.println("Equals :: " + equals);

// 3.		hashCode() -- numerical value
		System.out.println("hashCode :: " + hashSet.hashCode());

	}

	public static void iterationInHashSet() {

//	3. Iteration
//		for (E e : set)
//		iterator()
//		forEach(Consumer<? super E>)

		HashSet<String> hashSet = new HashSet<>();
		hashSet.add("Nilesh");
		hashSet.add("Dhawale");

// 1.		for (E e : set)
		for (String ss : hashSet) {
			System.out.println("Data Is :: " + ss);
		}

// 2.		iterator()
		Iterator<String> iterator = hashSet.iterator();
		while (iterator.hasNext()) {
			System.out.println("Iterator :: " + iterator.next());
		}

// 3.		forEach(Consumer<? super E>)
//		hashSet.stream().forEach(null); // we can use
		hashSet.forEach(ss -> System.out.println("For Each :: " + ss));

	}

	public static void bulkOperationOnHashSet() {

//	4. Bulk Operations
//		addAll(Collection<? extends E> c)
//		removeAll(Collection<?> c)
//		retainAll(Collection<?> c)
//		containsAll(Collection<?> c)
	}

	public static void utilityOnHashSet() {

//	5. Utility
//		toArray()
//		toArray(T[] a)
//		clone()
//		getClass()
//		Collections.synchronizedSet(set)

		HashSet<String> hashSet = new HashSet<String>();
		hashSet.add("Nilesh");
		hashSet.add("Dhawale");

// 1.		toArray()
		Object[] array = hashSet.toArray();
		System.out.println("To Array :: " + Arrays.toString(array));
// 2.		toArray(T[] a) -- take specific index and convert it into array
		String[] array2 = hashSet.toArray(new String[0]);
		System.out.println("To Array 2 ::" + Arrays.toString(array2));
// 3.		clone()
		Object clone = hashSet.clone();
		System.out.println("Clone :: " + clone + " Equals :: " + hashSet.equals(clone));
// 4.		getClass()
		Class<? extends HashSet> class1 = hashSet.getClass();
		System.out.println("Get Class :: " + class1);
// 5.		Collections.synchronizedSet(set) -- to make thread safe
//		if we are working with multiple thread and one thread try to iterate and another
//		thread try to update same resource we get exception concurent modification exception
		Collections.synchronizedSet(hashSet).forEach(ss -> {
			System.out.println(Thread.currentThread().getName() + " :: " + ss);
		});

	}

	public static void java8OnHashSet() {

//	6. Java 8+ Stream & Lambda Support
//		stream()
//		parallelStream()
//		stream().filter(...).collect(...)
//		stream().map(...).collect(...)
//		stream().anyMatch(...)
//		stream().allMatch(...)
//		stream().noneMatch(...)
//		stream().reduce(...)
//		stream().collect(Collectors.toList())
//		forEach(e -> ...)

		HashSet<String> hashSet = new HashSet<String>();
		hashSet.add("Nilesh");
		hashSet.add("Dhawale");
		hashSet.add(null);
// 1.		stream()
		hashSet.stream().forEach(ss -> {
			System.out.println(Thread.currentThread().getName() + " :: " + ss);
		});

// 2		parallelStream()
		hashSet.parallelStream().forEach(ss -> {
			System.out.println(Thread.currentThread().getName() + " Parellal Thread :: " + ss);
		});

// 3.		stream().filter(...).collect(...)
		List<String> data = hashSet.stream().filter(ss -> ss != null).collect(Collectors.toList());
		System.out.println("Filter :: " + data);

// 4.		stream().map(...).collect(...) -- operation on object
		List<String> updates = hashSet.stream().map(ss -> ss + " Updated").collect(Collectors.toList());
		System.out.println("Map :: " + updates);
// 5.		stream().anyMatch(...)
		boolean anyMatch = hashSet.stream().anyMatch(ss -> ss == null);
		System.out.println("Any Match :: " + anyMatch);
// 6.		stream().allMatch(...) // check is all collection satisfying given condition or not
		boolean allMatch = hashSet.stream().allMatch(ss -> hashSet.contains(ss));
		System.out.println("All Match :: " + allMatch);
// 7.		stream().noneMatch(...)
		boolean noneMatch = hashSet.stream().noneMatch(ss -> "Data".equals(ss));
// 8.		stream().reduce(...) // collect the result and combine or add
		String reduce = hashSet.stream().reduce("", (a, b) -> a + b);
		System.out.println("reduce :: " + reduce);

	}
}
