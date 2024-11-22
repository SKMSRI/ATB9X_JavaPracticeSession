package NOV_24.ex_22_Nov_Map_Collection_Framework;

import java.util.HashMap;
import java.util.Map;

public class HashMapP1 {
    public static void main(String[] args) {
        // Map is key - value
        // name : pramod, rollno : 1
        // phone : 9876543210
        Map m1 = (Map) new HashMap(); // Generics

        // Map<String,Object> m1 = new HashMap();
        // Data Type - Fixed

        m1.put("name", "Pramod");
        m1.put("rollNo", 123);
        m1.put("phone", 98765432);
        System.out.println(m1);

        // When to use Map and when to use List?
        // List -> Shopping , single items,
        // name -> pramod, rol : 1
    }
}
