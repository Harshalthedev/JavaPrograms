import java.util.*Map;
class Map01 {
    public static void main(String[] args) {
        HashMap<String , Integer > map = new HashMap<>();

        //  insert
        map.put("India", 130); 
        map.put("China", 120);
        map.put("Lanka", 100);
        map.put("Nepal", 90);

        // System.out.println(map);

        //  insert the same key
        map.put("China",140);

        // System.out.println(map);

        // // search 
        // // 1.  search for key
        // System.out.println(map.containsKey("India")); //true
        
        // // 2.  search for key
        // System.out.println(map.containsValue(100)); //true

        // //  get() it get the value of the key 
        // //  1. get(key) we get the key
        // System.out.println(map.get("India")); //prints the value if exists
        // //  2. get(key) we get the value
        // System.out.println(map.get("USA")); //not exixts prints null
         
        // iteration
        // for ( int val : arr)
        // for ( Map.Entry< String, Integer > e : map.entrySet()) {
        //     System.out.println(e.getKey());
        //     System.out.println(e.getValue());
        // }

        // Set of keys

        Set<String> keys = map.keySet();

        for (String key : keys) {
            System.out.println(key + " " + map.get(key));
        } 

        //remove key/value
        // map.remove("China");
        System.out.println(map);

    }
}