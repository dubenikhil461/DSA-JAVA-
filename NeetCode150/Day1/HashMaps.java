import java.util.*;

public class HashMaps {
    public static void main(String args[]) {

        HashMap<String, Integer> map = new HashMap<>();
        // add
        map.put("china", 180);
        map.put("india", 200);
        map.put("ban", 130);
        // get
        System.out.println(map.get("china"));
        // remove
        map.remove("china");
        System.out.println(map);

        // iteration
        // for (int val : arr)
        for (Map.Entry<String, Integer> e : map.entrySet()) { // set of key : val
            System.out.println(e.getKey() + " " + e.getValue());
        }

        System.out.println(map.containsKey("china")); // boolean

        Set<String> keys = map.keySet();// set of keys

        for (String key : keys) {
            System.out.println(key + " " + map.get(key));
        }

        // // Example usage of computeIfAbsent:
        // // Use computeIfAbsent when you want to add a key to the map only if it is
        // not already present,
        // // and supply a value by generating it. For example, if "nepal" is not
        // present, it will be added with value 120.
        map.computeIfAbsent("nepal", k -> 120);
        System.out.println(map); // {"india"=200, "ban"=130, "nepal"=120}

        // // Example usage of computeIfPresent:
        // // Use computeIfPresent when you want to update the value for a key only if
        // it is already present in the map.
        // // For example, if "india" is present, we can increment its value by 50:
        map.computeIfPresent("india", (k, v) -> v + 50);

        // // Now, "india" will have its value updated from 200 to 250 (since 200 + 50 =
        // 250).
        System.out.println(map); // Output will be: {"india"=250, "ban"=130, "nepal"=120}

        System.out.println(map.getOrDefault("chinsa", null));
        String s = "a";
        String t = "ab";
        HashMap<Character, Integer> maps = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            maps.put(s.charAt(i), maps.getOrDefault(s.charAt(i), 0) + 1);
        }
        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);
            if (!maps.containsKey(ch)) {
                System.out.println("false");
                return;
            }
            if (maps.containsKey(ch)) {
                int count = maps.get(ch);
                if (count > 1)
                    maps.put(ch, count - 1);
                else
                    maps.remove(ch);
            }
        }
        if (maps.size() == 0)
            System.out.println("true");
    }
}