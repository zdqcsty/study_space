package com.study.study_space.soft.redis;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

public class ConnRedis {

    private static final String ip = "10.130.7.208";
    private static final int port = 6379;

    public static void main(String[] args) {
        try (Jedis jedis = initJedisPoll()) {
            jedis.set("bbb", "ccc");
            System.out.println(jedis.get("bbb"));
            jedis.flushDB();   //清空缓存的数据库
        }
    }


    public static Jedis initJedisPoll() {
        JedisPoolConfig jedisPoolConfig = new JedisPoolConfig();
        jedisPoolConfig.setMaxIdle(30);  // 最大闲置个数: 当闲置的连接超过30时，开始关闭连接
        jedisPoolConfig.setMinIdle(10);  // 最小闲置个数: 保证连接池中至少有10个连接是闲置的，当闲置的连接小于10个时，创建新的连接
        jedisPoolConfig.setMaxTotal(50); // 连接池中最大连接数  50
        JedisPool jedisPool = new JedisPool(jedisPoolConfig, ip, port, 1000, "QSC132esz");  // 1000为允许超时时间，123456qq为
        final Jedis jedis = jedisPool.getResource();
        jedis.select(10);  //选择数据库   0-15  默认连接到db0
        return jedis;
    }

    public static void diectConn() {
        try (Jedis jedis = new Jedis(ip, port)) {
            jedis.auth("QSC132esz");
            jedis.set("aaa", "bbb");
            final String aaa = jedis.get("aaa");
            System.out.println(aaa);
        }
    }
}
