//UIUC CS125 FALL 2013 MP. File: KeyValueMap.java, CS125 Project: Challenge5-DataStructures, Version: 2013-10-14T15:57:58-0500.653928462
//@author schmnsk2
import java.awt.Color;

public class KeyValueMap { // aka Dictionary or Map
	private String key;
	private Color value;
	private KeyValueMap[] array = new KeyValueMap[0];

	/**
	 * Adds a key and value. If the key already exists, it replaces the original
	 * entry.
	 */
	public void add(String key, Color value) {
		boolean original = false;
		KeyValueMap entry = new KeyValueMap();
		entry.key = key;
		entry.value = value;
		KeyValueMap[] temp = new KeyValueMap[array.length + 1];
		for (int i = 0; i < array.length; i++) {
			if (array[i].key.equals(key)) {
				array[i].value = value;
				original = true;
			}
		}
		if (!original) {
			for (int i = 0; i < array.length; i++) {
				temp[i] = array[i];
			}
			temp[temp.length - 1] = entry;
			array = temp;
		}

		// throw new RuntimeException("Hi");
	}

	/**
	 * Returns particular Color object previously added to this map.
	 */
	public Color find(String key) {
		// if (exists(key)) {
		for (int i = 0; i < array.length; i++) {
			if (array[i].key.equals(key)) {
				return array[i].value;
			}
		}
		return null;
		// throw new RuntimeException("Ho");
	}

	// }

	/**
	 * Returns true if the key exists in this map.
	 */
	public boolean exists(String key) {
		for (int i = 0; i < array.length; i++) {
			if (array[i].key.equals(key))
				return true;
		}
		return false;
		// throw new RuntimeException("Hi");
	}

	/**
	 * Removes the key (and the color) from this map.
	 */
	public void remove(String key) {
		int index = 0;
		KeyValueMap[] temp = new KeyValueMap[array.length - 1];
		for (int i = 0; i < array.length; i++) {
			if (array[i].key.equals(key))
				index = i;
		}
		for (int i = 0; i < index; i++) {
			temp[i] = array[i];
		}
		for (int i = index; i < temp.length; i++) {
			temp[i] = array[i+1];
		}
		array = temp;
	}

}
