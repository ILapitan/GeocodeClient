package by.aboutme.geocode.cache;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Cache class implementation based on LinkedHashMap.
 * Implements LRU caching algorithm.
 *
 * @param <K> - key type.
 * @param <V> - value type.
 */
public class GeoCache<K,V> extends LinkedHashMap<K,V> {
    private final int size;

    /**
     * Constructor with parameters.
     * @param initialCapacity - cache size value.
     */
    public GeoCache(final int initialCapacity) {
        super(initialCapacity + 1, 1.0f, true);
        size = initialCapacity;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        return super.size() > size;
    }
}
