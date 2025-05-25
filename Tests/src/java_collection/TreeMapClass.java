package java_collection;

import java.util.TreeMap;

public class TreeMapClass {

//	Map<K, V>
//	SortedMap<K, V>
//	TreeMap<K, V> is a class

//	2. Search & Check
//	get(Object key)
//
//	containsKey(Object key)
//
//	containsValue(Object value)
//
//	isEmpty()
//
//	size()
//
//	getOrDefault(Object key, V defaultValue)
//
//	3. Iteration
//	entrySet()
//
//	keySet()
//
//	values()
//
//	forEach(BiConsumer)
//
//	4. Bulk Operations
//	putAll(Map<? extends K, ? extends V> map)
//
//	replaceAll(BiFunction<K, V, V>)
//
//	5. Utility / Navigation
//	firstKey(), lastKey()
//
//	firstEntry(), lastEntry()
//
//	ceilingKey(K key), ceilingEntry(K key)
//
//	floorKey(K key), floorEntry(K key)
//
//	higherKey(K key), higherEntry(K key)
//
//	lowerKey(K key), lowerEntry(K key)
//
//	pollFirstEntry(), pollLastEntry()
//
//	descendingKeySet()
//
//	descendingMap()
//
//	headMap(K toKey)
//
//	headMap(K toKey, boolean inclusive)
//
//	tailMap(K fromKey)
//
//	tailMap(K fromKey, boolean inclusive)
//
//	subMap(K fromKey, K toKey)
//
//	subMap(K fromKey, boolean fromInclusive, K toKey, boolean toInclusive)
//
//	comparator()
//
//	6. Java 8+ Stream & Lambda Support
//	forEach((k, v) -> {...})
//
//	entrySet().stream()
//
//	keySet().stream()
//
//	values().stream()
//
//	entrySet().parallelStream()
//
//	Map.Entry.comparingByKey()
//
//	Map.Entry.comparingByValue()
//
//	entrySet().stream().filter(...).collect(...)

	public static void main(String[] args) {

		basicOperationOnTreeMap();
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
}
