package java_collection;

import java.util.Collection;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapClass {

//	Map<K, V>
//	SortedMap<K, V>
//	TreeMap<K, V> is a class

	public static void main(String[] args) {

		java8OnTreeMap();
	}

	public static void basicOperationOnTreeMap() {

//	1. Basic Operations
//		put(K key, V value)
//		putIfAbsent(K key, V value)
//		remove(Object key)
//		replace(K key, V value)
//		replace(K key, V oldValue, V newValue)
//		compute(K key, BiFunction)
//		computeIfAbsent(K key, Function)
//		computeIfPresent(K key, BiFunction)
//		merge(K key, V value, BiFunction)
//		clear()

// 1.		put(K key, V value)
		TreeMap<Integer, String> treeMap = new TreeMap<>();
		treeMap.put(1, "Nilesh");
		treeMap.put(2, "Dhawale");
//		treeMap.put(null, null); // null key not allowed // NullPointerException
		System.out.println(treeMap);

// 2.		putIfAbsent(K key, V value)
		treeMap.putIfAbsent(1, "Nilesh Updated");
		treeMap.putIfAbsent(3, "Data");
		System.out.println("Put if Absent :: " + treeMap);

// 3.		remove(Object key)
		treeMap.remove(3); // non present key pass is OK no error
		System.out.println("Remove :: " + treeMap);

// 4.		replace(K key, V value)
		treeMap.putIfAbsent(3, "Data 2");
		treeMap.replace(3, "Data 2 Updated");// if not present key pass it will not affect any change
		System.out.println("Replace :: " + treeMap);

// 5.		replace(K key, V oldValue, V newValue)
		treeMap.replace(3, "Data 2 Updated", "DATA 2 UPDATE");
		System.out.println("Replace 2 ::  " + treeMap);

// 6.		compute(K key, BiFunction)
		treeMap.compute(3, (key, val) -> val + " Compute");
		System.out.println("Compute :: " + treeMap);

// 7.		computeIfAbsent(K key, Function)
		treeMap.computeIfAbsent(10, key -> "Data");
		System.out.println("Compute If Absent :: " + treeMap);

// 8.		computeIfPresent(K key, BiFunction)
		treeMap.computeIfPresent(10, (key, val) -> val = "If Present Updates");
		System.out.println("Compute If Present :: " + treeMap);

// 9.		merge(K key, V value, BiFunction)
//		if key present run function third parameter
//		if key not present assign value to key // second parameter
		treeMap.merge(100, "If Present Updates", (key, val) -> val = "Merge Update");
		System.out.println("Merge :: " + treeMap);

// 10.		clear()
		treeMap.clear();
		System.out.println("Clear :: " + treeMap);

	}

	public static void searchOnTreeMap() {

//	2. Search & Check
//		get(Object key)
//		containsKey(Object key)
//		containsValue(Object value)
//		isEmpty()
//		size()
//		getOrDefault(Object key, V defaultValue)

		TreeMap<Integer, String> treeMap = new TreeMap<>();
		treeMap.put(1, "Nilesh");
		treeMap.put(2, "Dhawale");

// 1.		get(Object key) // if key not present returns null
		String string = treeMap.get(1);
		System.out.println("Get :: " + string);

// 2.		containsKey(Object key)
		boolean containsKey = treeMap.containsKey(1);
		System.out.println("Contains Key :: " + containsKey);

// 3.		containsValue(Object value)
		boolean containsValue = treeMap.containsValue("Nilesh");
		System.out.println("Contain Value :: " + containsValue);

// 4.		isEmpty()
		boolean empty = treeMap.isEmpty();
		System.out.println("Is Empty :: " + empty);

// 5.		size()
		int size = treeMap.size();
		System.out.println("Size :: " + size);

// 6.		getOrDefault(Object key, V defaultValue)
		String getOrDefault = treeMap.getOrDefault(10, "Default Value");
		System.out.println("Get or Default :: " + getOrDefault);
	}

	public static void iterationOnTreeMap() {

//	3. Iteration
//		entrySet()
//		keySet()
//		values()
//		forEach(BiConsumer)

		TreeMap<Integer, String> treeMap = new TreeMap<>();
		treeMap.put(1, "Nilesh");
		treeMap.put(2, "Dhawale");

// 1.		entrySet()
		Set<Entry<Integer, String>> entrySet = treeMap.entrySet();
		entrySet.stream()
				.forEach(ss -> System.out.println("Tree Map Key :: " + ss.getKey() + " Value :: " + ss.getValue()));

// 2.		keySet()
		Set<Integer> keySet = treeMap.keySet();
		keySet.stream().forEach(ss -> {
			System.out.println("Key Set :: " + ss);
		});

// 3.		values()
		Collection<String> values = treeMap.values();
		values.stream().forEach(ss -> System.out.println("Values :: " + ss));

// 4.		forEach(BiConsumer)
		treeMap.forEach((key, value) -> System.out.println("For Each Key :: " + key + " Value :: " + value));
	}

	public static void bulkOperationOnTreeMap() {

//	4. Bulk Operations
//		putAll(Map<? extends K, ? extends V> map)
//		replaceAll(BiFunction<K, V, V>)

	}

	public static void utilityOnTreeMap() {

//	5. Utility / Navigation
//		firstKey(), lastKey()
//		firstEntry(), lastEntry()
//		ceilingKey(K key), ceilingEntry(K key)
//		floorKey(K key), floorEntry(K key)
//		higherKey(K key), higherEntry(K key)
//		lowerKey(K key), lowerEntry(K key)
//		pollFirstEntry(), pollLastEntry()
//		descendingKeySet()
//		descendingMap()
//		headMap(K toKey)
//		headMap(K toKey, boolean inclusive)
//		tailMap(K fromKey)
//		tailMap(K fromKey, boolean inclusive)
//		subMap(K fromKey, K toKey)
//		subMap(K fromKey, boolean fromInclusive, K toKey, boolean toInclusive)
//		comparator()

		TreeMap<Integer, String> treeMap = new TreeMap<>();
		treeMap.put(1, "Nilesh");
		treeMap.put(2, "Dhawale");

// 1.		firstKey(), lastKey()
		Integer firstKey = treeMap.firstKey();
		Integer lastKey = treeMap.lastKey();
		System.out.println("TreeMap First Key :: " + firstKey + " Last Key :: " + lastKey);

// 2.		firstEntry(), lastEntry()
		Entry<Integer, String> firstEntry = treeMap.firstEntry();
		Entry<Integer, String> lastEntry = treeMap.lastEntry();

		System.out.println("First Entry Key :: " + firstEntry.getKey() + " Value :: " + firstEntry.getValue());
		System.out.println("Last Entry Key :: " + lastEntry.getKey() + " Value :: " + lastEntry.getValue());

// 3.		ceilingKey(K key), ceilingEntry(K key)
//		if key present return it
//		if not return next greater key
//		if next greater not present return null
		Integer ceilingKey = treeMap.ceilingKey(1);
		System.out.println("Ceiling Key :: " + ceilingKey);

		Entry<Integer, String> ceilingEntry = treeMap.ceilingEntry(1);
		System.out.println("Ceiling Entry :: " + ceilingEntry.getKey() + " Value :: " + ceilingEntry.getValue());

// 4.		floorKey(K key), floorEntry(K key)
//		if key present return it
//		if not return privies small
//		if privies small not present return	null
		Entry<Integer, String> floorEntry = treeMap.floorEntry(1);
		System.out.println(floorEntry.getKey() + " Value :: " + floorEntry.getValue());

		Integer floorKey = treeMap.floorKey(2);
		System.out.println("Floor Key :: " + floorKey);
	}

	public static void java8OnTreeMap() {

//	6. Java 8+ Stream & Lambda Support
//		forEach((k, v) -> {...})
//		entrySet().stream()
//		keySet().stream()
//		values().stream()
//		entrySet().parallelStream()
//		Map.Entry.comparingByKey()
//		Map.Entry.comparingByValue()
//		entrySet().stream().filter(...).collect(...)

		TreeMap<Integer, String> treeMap = new TreeMap<>();
		treeMap.put(1, "Nilesh");
		treeMap.put(2, "Dhawale");

// 1.		forEach((k, v) -> {...})
		treeMap.forEach((key, val) -> {
			System.out.println("Tree Map Key :: " + key + " value :: " + val);
		});

// 2.		entrySet().stream()
		Set<Entry<Integer, String>> entrySet = treeMap.entrySet();
		entrySet.stream()
				.forEach(ss -> System.out.println("Entry Set Key :: " + ss.getKey() + " value :: " + ss.getValue()));

// 3.		keySet().stream()
		Set<Integer> keySet = treeMap.keySet();
		keySet.stream().forEach(ss -> System.out.println("Key Set Key Is :: " + ss));

// 4.		values().stream()
		Collection<String> values = treeMap.values();
		values.stream().forEach(ss -> System.out.println("Values :: " + ss));

// 5.		entrySet().parallelStream()
		treeMap.entrySet().parallelStream().forEach(ss -> System.out
				.println(Thread.currentThread().getName() + " Key :: " + ss.getKey() + " value :: " + ss.getValue()));
	}
}