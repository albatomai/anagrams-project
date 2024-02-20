package com.project.anagrams;

import org.springframework.lang.NonNull;

import java.util.*;

public class MultiValueHashMap<K, V> extends HashMap<K,HashSet<V>>{
    private final HashMap<K, HashSet<V>> map = new HashMap<>();

    // Methods

    public void putValueList(K key, V value) {
        map.computeIfAbsent(key, k -> new HashSet<>()).add(value);

    }
    public HashSet<V> getValueList(K key) {
        return map.getOrDefault(key, new HashSet<>());
    }
    @Override
    public int size() {
        return map.size();
    }
    @Override
    public boolean isEmpty() {
        return map.isEmpty();
    }
    @Override
    @NonNull
    public Set<K> keySet() {
        return map.keySet();
    }
    @Override
    public String toString() {
        return "MultiValueHashMap{" +
                "map=" + map +
                '}';
    }
}
