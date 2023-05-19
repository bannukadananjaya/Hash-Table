package HashMap;
import java.util.HashMap;
import java.util.Map;

public class HashMapExample{
    public static void main(String[] args) {
        //create new hashmap
        Map<String, Integer> hashmap = new HashMap<>();

        //Add key value pairs
        hashmap.put("apple", 10);
        hashmap.put("banana",5);
        hashmap.put("orange",8);

        //get the value associate with a key
        int appleCount = hashmap.get("apple");
        System.out.println("Number of apples:"+appleCount);

        //check if a key is exist
        boolean containKey  = hashmap.containsKey("banana");
        System.out.println("Is contain key banana:"+containKey);

        //update the value associate with a key
        hashmap.put("banana",12);
        System.out.println("Updated count of bananas:"+hashmap.get("banana"));

        //remove a key-value pair 
        hashmap.remove("orange");
        System.out.println("Size of the map after removing orange:"+hashmap.size());

        //Iterate over hashmap
        for(Map.Entry<String,Integer> entry : hashmap.entrySet()){
            String key = entry.getKey();
            int value = entry.getValue();
            System.out.println(key+": "+value);
        }

    }
}