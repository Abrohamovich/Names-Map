package app;

import java.util.HashMap;
import java.util.Map;

public class DataRepository {

    public Map<Integer, String> getData() {
        Map<Integer, String> map = new HashMap<>();
        map.put(239, "Anna");
        map.put(456, "Igor");
        map.put(789, "Barack");
        map.put(451, "Nilokai");
        map.put(328, "John");
        map.put(671, "Boris");
        map.put(777, "Donald");
        return map;
    }
}

