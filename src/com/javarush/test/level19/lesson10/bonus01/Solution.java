package com.javarush.test.level19.lesson10.bonus01;

import java.util.HashMap;
import java.util.Map;

public abstract class Solution
{
    private final Map<byte[], byte[]> cache = new HashMap<byte[], byte[]>();

    public byte[] digest(byte[] input) {
        byte[] result = cache.get(input);
        if (result == null) {
            synchronized (cache) {
                result = cache.get(input);
                if (result == null) {
                    result = doDigest(input);
                    cache.put(input, result);
                }
            }
        }
        return result;
    }

    protected abstract byte[] doDigest(byte[] input);
}