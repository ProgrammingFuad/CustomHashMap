/**
 * Created by fuadmohamoud on 9/22/17.
 */
public interface Map<K, V>
{

    public V set(K key, V value);

    public V get(K key);

    public V delete(K key);

    public float load();

}
