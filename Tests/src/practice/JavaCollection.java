package practice;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class JavaCollection {

	public static void main(String[] args) {

		checks();
	}

	public static void checks() {

//		Collection<E>
//		listTests();
//		setTests();
//		queueTests();
//		deQueueTests();
		mapTests();
	}

	public static void mapTests() {

		// 1. HashMap --> Null Key Acceptable (Sorted)
		HashMap<String, Object> hashMap = new HashMap<String, Object>();
		hashMap.put(null, null);
		hashMap.put("One", "ONE");
		hashMap.put("TWO", "TWO");
		hashMap.put("AAA", "AAA");

		System.out.println("Hash Map :: " + hashMap);

		// 2. TreeMap --> Null Key not Acceptable (Sorted)
		TreeMap<String, Object> treeMap = new TreeMap<String, Object>();
//		treeMap.put(null, null); // # java.lang.NullPointerException
		treeMap.put("One", "ONE");
		treeMap.put("TWO", "TWO");
		treeMap.put("AAA", "AAA");

		System.out.println("Tree Map :: " + treeMap);

		// 3. Linked HashMap --> Null Acceptable no Order
		LinkedHashMap<String, Object> lHMap = new LinkedHashMap<String, Object>();
		lHMap.put(null, null);
		lHMap.put("BBB", "BBB");
		lHMap.put("ZZZ", "ZZZ");
		lHMap.put("CCC", null);
		lHMap.put("AAA", "AAA");

		System.out.println("Linked Hash Map :: " + lHMap);

	}

	public static void deQueueTests() {

		// 1. Linked List

		// 2. ArrayDeque --> Fast Operation
		ArrayDeque<Integer> arrDeque = new ArrayDeque<Integer>();
//		arrDeque.add(null); // # Null Not Acceptable -- java.lang.NullPointerException
		arrDeque.add(1);
		arrDeque.add(3);
		arrDeque.add(2);

		arrDeque.stream().forEach(ss -> System.out.println("ArrDeque :: " + ss));

	}

	public static void queueTests() {

		// 1. Linked List

		// 2. Priority Queue --> Sorted By Natural Order --> Null Not Acceptable
		PriorityQueue<Integer> pQueue = new PriorityQueue<Integer>();
//		pQueue.add(null); // # java.lang.NullPointerException
		pQueue.add(2);
		pQueue.add(1);
		pQueue.add(0);

		pQueue.stream().forEach(ss -> System.out.println("P Queue :: " + ss));
	}

	public static void setTests() {

		// 1. HashSet --> no order no duplicate (Null Acceptable)
		HashSet<Integer> hashSet = new HashSet<Integer>();
		hashSet.add(null);
		hashSet.add(1);
		hashSet.add(2);
		hashSet.add(0);
		hashSet.add(null);

		hashSet.stream().forEach(ss -> System.out.println("Set Properties :: " + ss));

		// 2. TreeSet --> Sorted, No Duplicate (Null Not Acceptable)
		TreeSet<Integer> treeSet = new TreeSet<Integer>();
//		treeSet.add(null); // # java.lang.NullPointerException
		treeSet.add(1);
		treeSet.add(2);
		treeSet.add(2);
		treeSet.add(0);

		treeSet.stream().forEach(ss -> System.out.println("TreeSet Properties :: " + ss));

	}

	public static void listTests() {

		// 1. ArrayList
		ArrayList<String> arrList = new ArrayList<String>();
		arrList.add("One");
		arrList.add("Two");

		System.out.println("ArrayList :: " + arrList.get(0));

		arrList.stream().filter(ss -> !ss.equalsIgnoreCase("One")).map(s -> s + " UpDates").collect(Collectors.toList())
				.forEach(ss -> System.out.println("Updates :: " + ss));

		Object clone = arrList.clone();
		System.out.println("clone :: " + clone);
		arrList.clear();

		// 2. LinkedList
		LinkedList<Integer> linkList = new LinkedList<Integer>();
		linkList.add(1);
		linkList.add(2);
		linkList.add(3);
		linkList.add(4);

		System.out.println("Get From LL :: " + linkList.get(2));
		// add perticular value to Perticular Position and push forward another fields
		linkList.add(2, 44);
		linkList.stream().forEach(ss -> System.out.println("Order :: " + ss));
		System.out.println("Get From LL Updates :: " + linkList.get(2));

		System.out.println("B List Size and Perticular Value :: " + linkList.size() + " Value :: " + linkList.get(2));
		Integer r = linkList.remove(2);
		System.out.println("List Size and Perticular Value :: " + linkList.size() + " Value :: " + linkList.get(2));

	}
}
