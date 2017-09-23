/**
 * Created by fuadmohamoud on 9/23/17.
 */
public class HashMap<K,V> implements Map<K,V>
{

    private int size;
    private int currLoad;
    private int[] array;


    public HashMap(int size){
        this.size=size;
    }


    public float load(){
        return currLoad/size;
    }


    public V set(K key, V value){
        incrementCurrentLoad();
    }

    public V get(K key){

    }

    public V delete(K key){
        decrementCurrentLoad();
    }

    private void incrementCurrentLoad(){
        currLoad+=1;
    }

    private void decrementCurrentLoad(){
        if(currLoad>0)currLoad-=1;
    }


    public int findNextPrime(int minNumberToCheck){
        for (int i = minNumberToCheck; true; i++) {
            if (isPrime(i)){
                return i;
            }
        }
    }


    public boolean isPrime(int number) {
        if (number % 2 == 0){
            return false;
        }
        for (int i = 3; i * i <= number; i += 2) {
            if (number % i == 0){
                return false;
            }
        }
        return true;
    }


}
