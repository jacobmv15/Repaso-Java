import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        // HashMap = A data structure that stores key-value pairs
        //           Keys are unique, but Values can be duplicated
        //           Does not maintain any order, but is memory efficient
        //           HashMap<Key, Value>

        HashMap<String, Double> hashMap = new HashMap<>();
        
        hashMap.put("manzana", 0.5);
        hashMap.put("naranja", 0.25);
        hashMap.put("plátano", 0.35);
        hashMap.put("coco", 1.05);

        //hashMap.put("naranja", 0.35); Solo puede haber una key igual
        
        hashMap.remove("manzana");

        System.out.println(hashMap.get("plátano"));

        System.out.println(hashMap.containsKey("naranja"));

        if (hashMap.containsKey("coco")) {
            System.out.println(hashMap.get("coco"));
        } else {
            System.out.println("Clave no encontrada");
        }

        System.out.println(hashMap.containsValue(0.25));

        System.out.println(hashMap.size());

        for (String key : hashMap.keySet()) {
            System.out.println(key + ": $" + hashMap.get(key));
        }
    }
}
