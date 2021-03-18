package com.example.demo.entities;
import java.util.HashMap;

public class Cache {

    private static HashMap<Integer, User> _cache = new HashMap<Integer, User>();

    public HashMap getCacheMap()
    {
        return _cache;
    }

    public void set(Integer key, User value){
        _cache.put(key, value);
    }

    public User get(int key){
        return _cache.get(key);
    }

    // not using hashmaps containskey
    public boolean hasKey(int key)
    {
        for (Integer i : _cache.keySet())
        {
            if (key == i)
                return true;
        }

        return false;
    }

    public void delete(int key)
    {
        _cache.remove(key);
    }

}
