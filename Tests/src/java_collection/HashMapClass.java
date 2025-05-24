package java_collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapClass {

//	Map<K, V>
//	HashMap<K, V> is the class

	public static void main(String[] args) {

		streamOnHashMap();
	}

	public static void basicOperationOnHashMap() {

//	1. Basic Operations
//		put(K key, V value)
//		putAll(Map<? extends K, ? extends V> map)
//		remove(Object key)
//		clear()

// 1.		put(K key, V value)
//		No Duplicates key, null key allowed,multiple null value allowed
//		No Order maintain
		HashMap<Long, String> hashMap = new HashMap<>();
		hashMap.put(null, null);
		hashMap.put(1l, "Data");
		hashMap.put(0l, null);
		System.out.println("HashMap :: " + hashMap);
		hashMap.clear();

		hashMap.put(1l, "Nilesh");
		hashMap.put(2l, "Dhawale");

// 2.		putAll(Map<? extends K, ? extends V> map)
//		if we try to putAll and key get duplicated then that respective value get override by new value
		HashMap<Long, String> testMap = new HashMap<>();
		testMap.put(3l, "Test Data 1");
		testMap.put(4l, "Test Data 2");

		hashMap.putAll(testMap);
		System.out.println("Put all :: " + hashMap);

// 3.		remove(Object key)
		String remove = hashMap.remove(4l);
		System.out.println("Remove :: " + remove + " Remaining :: " + hashMap);

// 4.		clear()
		hashMap.clear();
		System.out.println("Clear :: " + hashMap);

	}

	public static void searchAndIterationInHashMap() {

//	2. Search & Check
//		get(Object key)
//		containsKey(Object key)
//		containsValue(Object value)
//		isEmpty()
//		size()

		HashMap<Long, String> hashMap = new HashMap<>();
		hashMap.put(1l, "Nilesh");
		hashMap.put(2l, "Dhawale");

// 1.		get(Object key)
		String string = hashMap.get(1l);
		System.out.println("Get :: " + string);

// 2.		containsKey(Object key)
		boolean containsKey = hashMap.containsKey(1l);
		System.out.println("Contain Key :: " + containsKey);

// 3.		containsValue(Object value)
		boolean containsValue = hashMap.containsValue("Nilesh");
		System.out.println("ContainsValue :: " + containsValue);

// 4.		isEmpty()
		hashMap.clear();
		System.out.println("Clear :: " + hashMap);

// 5.		size()
		int size = hashMap.size();
		System.out.println("Size :: " + size);
	}

	public static void iterationOnHashMapClass() {

//	3. Iteration
//		keySet()
//		values()
//		entrySet()
//		forEach(BiConsumer<? super K,? super V> action)

		HashMap<Long, String> hashMap = new HashMap<>();
		hashMap.put(1l, "Nilesh");
		hashMap.put(2l, "Dhawale");

// 1.		keySet()
		Set<Long> keySet = hashMap.keySet();

		System.out.println("Key Set :: " + keySet);

// 2.		values()
		Collection<String> values = hashMap.values();
		System.out.println("Values :: " + values);

// 3.		entrySet()
//		we can perform modification on object while iterating
//		give ability to perform stream operation on map
		Set<Entry<Long, String>> entrySet = hashMap.entrySet();
		entrySet.stream().forEach(ss -> {
			System.out.println("key :: " + ss.getKey() + " value :: " + ss.setValue("Updates"));
		});
		System.out.println(hashMap);

// 4.		forEach(BiConsumer<? super K,? super V> action)
		hashMap.forEach((key, value) -> System.out.println("For Each Key :: " + key + " value :: " + value));

	}

	public static void bulkOperationOnHashMap() {

//	4. Bulk Operations
//		putAll(Map<? extends K, ? extends V> map)
//		clear()

	}

	public static void utilityOnHashMap() {

//	5. Utility
//		isEmpty()
//		size()
//		keySet()
//		values()
//		entrySet()
//		hashCode()
//		equals(Object o)
//		toString()
//		clear()

		HashMap<Long, String> hashMap = new HashMap<>();
		hashMap.put(1l, "Nilesh");
		hashMap.put(2l, "Dhawale");

// 1.		isEmpty()
		boolean empty = hashMap.isEmpty();
		System.out.println("IsEmpty :: " + empty);

// 2.		size()
		int size = hashMap.size();
		System.out.println("Size :: " + size);

// 3.		keySet()
		Set<Long> keySet = hashMap.keySet();
		System.out.println("Key Set :: " + keySet);

// 4.		values()
		Collection<String> values = hashMap.values();
		System.out.println("Values :: " + values);

// 5.		entrySet()
		Set<Entry<Long, String>> entrySet = hashMap.entrySet();
		entrySet.stream().forEach(ss -> {
			System.out.println("Key :: " + ss.getKey() + " Value :: " + ss.getValue());
		});
	}

	public static void streamOnHashMap() {

//	6.Java 8+ Stream & Lambda Support
//		forEach(BiConsumer<? super K,? super V> action)
//		replaceAll(BiFunction<? super K, ? super V, ? extends V> function)
//		compute(K key, BiFunction<? super K, ? super V, ? extends V> remappingFunction)
//		computeIfAbsent(K key, Function<? super K, ? extends V> mappingFunction)
//		computeIfPresent(K key, BiFunction<? super K, ? super V, ? extends V> remappingFunction)
//		merge(K key, V value, BiFunction<? super V, ? super V, ? extends V> remappingFunction)

		HashMap<Long, String> hashMap = new HashMap<>();
		hashMap.put(1l, "Nilesh");
		hashMap.put(2l, "Dhawale");

// 1.		forEach(BiConsumer<? super K,? super V> action)
		hashMap.forEach((key, value) -> System.out.println("Key :: " + key + " Value :: " + value));

// 2.		replaceAll(BiFunction<? super K, ? super V, ? extends V> function)
//		price update bases on foreign currency
		HashMap<String, Double> assetInAmerica = new HashMap<>();
		assetInAmerica.put("Planes", 1000d);
		assetInAmerica.put("Helicopter", 500d);

//		this asset we want to sell to India
//		and India has to change price accordingly
//		1USD = 85 rs
		Double exchange = 85d;
		assetInAmerica.replaceAll((key, value) -> value + exchange);
		System.out.println("Indian Asset :: " + assetInAmerica);

// 3.		compute(K key, BiFunction<? super K, ? super V, ? extends V> remappingFunction)

//		take one key and perform operation on it
		hashMap.compute(-1l, (key, val) -> (val != null && val.equals("Dhawale")) ? "Hii" : "Hello");
		System.out.println("Compute :: " + hashMap);

// 4.		computeIfAbsent(K key, Function<? super K, ? extends V> mappingFunction)
//		perform operation only if given key is not present
		hashMap.computeIfAbsent(1l, key -> "Test Data");
		System.out.println("Compute If Absent :: " + hashMap);

// 5.		computeIfPresent(K key, BiFunction<? super K, ? super V, ? extends V> remappingFunction)
		hashMap.computeIfPresent(-1l, (key, val) -> val = "updated Data");
		System.out.println("Compute If Present :: " + hashMap);

// 6.		merge(K key, V value, BiFunction<? super V, ? super V, ? extends V> remappingFunction)
//		if present update
//		if not present add
		hashMap.merge(1l, "Updated Val", (oldVal, newVal) -> oldVal + " " + newVal);
		System.out.println("merge :: " + hashMap);
	}
}
