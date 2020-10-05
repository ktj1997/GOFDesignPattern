package Flyweight;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {
    private static Map<String, Subject> flyweightChecker = new HashMap<>();

    public Subject getSubject(String key) {
        if (!flyweightChecker.containsKey(key))
            flyweightChecker.put(key, new Subject(key));

        return flyweightChecker.get(key);
    }

}
