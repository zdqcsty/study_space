package com.study.study_space.soft.redis;

import org.redisson.Redisson;
import org.redisson.api.RList;
import org.redisson.api.RMap;
import org.redisson.api.RSortedSet;
import org.redisson.api.RedissonClient;
import org.redisson.config.Config;

public class RedisUtils {

    private static final String MAP_NAME = "map_ceshi";
    private static final String LIST_NAME = "list_ceshi";
    private static final String SORTSET_NAME = "sortset";

    public static void main(String[] args) {
        RedissonClient client = getClient();
//        RMap<String, String> map = client.getMap(MAP_NAME);
//        String aaa = map.get("aaa");
//        System.out.println(aaa);

//        setMap(client,"aaa","bbb");
//        setGetList(client, "aaa");
        setGetSortSet(client);
        client.shutdown();
    }

    public static RedissonClient getClient() {
        Config conf = new Config();
        conf.useSingleServer().setAddress("redis://10.130.7.208:6379").setPassword("QSC132esz");
        return Redisson.create(conf);
    }

    public static void setMap(RedissonClient client, String key, String value) {
        RMap<String, String> map = client.getMap(MAP_NAME);
        map.put(key, value);
    }

    public static void setGetList(RedissonClient client, String str) {
        RList<String> list = client.getList(LIST_NAME);
        list.add(str);

        RList<String> list1 = client.getList(LIST_NAME);
        System.out.println(list1.get(0));
    }

    //可以排序的set
    public static void setGetSortSet(RedissonClient client) {
        RSortedSet<Integer> sortedSet = client.getSortedSet(SORTSET_NAME);
        sortedSet.add(1);
        sortedSet.add(12);
        sortedSet.add(3);

        RSortedSet<Integer> sortedSet1 = client.getSortedSet(SORTSET_NAME);
        System.out.println(sortedSet1.last());
    }

}
