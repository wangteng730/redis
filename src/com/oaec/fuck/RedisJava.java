package com.oaec.fuck;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import redis.clients.jedis.Jedis;

public class RedisJava {
	public static void main(String[] args) {
		 //锟斤拷锟接憋拷锟截碉拷 Redis 锟斤拷锟斤拷
	      Jedis jedis = new Jedis("localhost");
	      System.out.println("Connection to server sucessfully");
	      //锟介看锟斤拷锟斤拷锟角凤拷锟斤拷锟斤拷
	      System.out.println("Server is running: "+jedis.ping());
	      
	      
	      //Redis Java String(锟街凤拷) 实锟斤拷
	      //锟斤拷锟斤拷redi锟街凤拷锟斤拷锟?
	      jedis.set("zhangkangchuang","ssssssssssssssssssssssssssssssssssssssssssssssssss");
	      //锟斤拷取锟芥储锟斤拷锟斤拷莶锟斤拷锟斤拷
	      System.out.println(jedis.get("yahui"));
	      
	     /* 
	      //Redis Java List(锟叫憋拷) 实锟斤拷
	      //锟芥储锟斤拷莸锟絩edis锟叫憋拷锟斤拷
	      jedis.lpush("yaru", "锟斤拷锟酵癸拷");
	      jedis.lpush("yaru","泰锟斤拷");
	      jedis.lpush("yaru", "锟斤拷锟斤拷");
	      
	      List<String> yahui = jedis.lrange("yaru", 0, 10);
	      for(String dog:yahui){
	    	  System.out.println("redis   list锟斤拷锟斤拷锟?+dog);
	      }
	      
	     //Redis Java Keys 实锟斤拷
	      System.out.println("------锟斤拷取redis锟斤拷锟斤拷锟斤拷锟叫的硷拷-----");
	      //锟斤拷锟斤拷写锟斤拷锟角达拷锟斤拷锟絏XXXXXXXXXXXXXXXXXXXXXXXX
	      //List<String> keys = jedis.keys("*");
	      
	      Set<String> keys = jedis.keys("*");
	      System.err.println(keys.toString());
	      System.out.println("------锟斤拷锟斤拷锟斤拷锟叫得碉拷锟侥硷拷------");
	      
	      System.out.println("------------------------------------------------");
	      
	      //String锟斤拷锟街凤拷
	      jedis.set("aa", "aa");
	      System.out.println("String(锟街凤拷)锟斤拷"+jedis.get("aa"));
	      
	      //Hash锟斤拷锟斤拷希)  锟斤拷hash锟截憋拷锟绞猴拷锟斤拷锟节存储锟斤拷锟斤拷 锟斤拷锟斤拷锟街碉拷锟絤ap 锟斤拷锟饺达拷锟斤拷一锟斤拷map
	      Map<String, String> mapSet = new HashMap<String, String>();
	      mapSet.put("aa", "aa");
	      mapSet.put("bb", "bb");
	      mapSet.put("cc", "cc");
	      mapSet.put("dd", "dd");
	      jedis.hmset("hash", mapSet);
	      
	      Map<String, String> mapGet = new HashMap<String, String>();
	      mapGet = jedis.hgetAll("hash");
	      
	      System.out.println("Hash锟斤拷锟斤拷希):"+mapGet);
	      
	      //List锟斤拷锟叫?   锟斤拷锟秸达拷诺锟斤拷群锟剿筹拷锟?锟斤拷循锟饺达拷锟饺★拷锟皆拷锟?
	      jedis.lpush("ee", "1111");
	      jedis.lpush("ee", "2222");
	      jedis.lpush("ee", "3333");
	      jedis.lpush("ee", "4444");
	      List<String> list = jedis.lrange("ee", 0, 10);
	      System.out.println("redis   List锟斤拷锟较ｏ拷"+list);
	      for(String num:list){
	    	  System.out.println("redis list  ee:"+num);
	      }
	      
	      //zset(sorted set锟斤拷锟斤拷锟津集猴拷)
	      jedis.zadd("ff", 1, "123");
	      jedis.zadd("ff", 2,"234");
	      jedis.zadd("ff",3,"345");
	      jedis.zadd("ff",4,"456");
	      
	      
	      jedis.zadd("gg", 0, "123");
	      jedis.zadd("gg", 0,"234");
	      jedis.zadd("gg",0,"345");
	      jedis.zadd("gg",0,"456");
	     
	      Set<String> set = jedis.zrange("ff", 0, 1000);
	      Set<String> setGG = jedis.zrange("gg", 0, 1000);
	      System.out.println("set锟斤拷锟斤拷set:"+set.toString());
	      System.out.println("set锟斤拷锟斤拷set:"+setGG.toString());
	      
	      //Set锟斤拷锟斤拷锟较ｏ拷  锟斤拷锟斤拷募锟斤拷锟?
	      jedis.sadd("kk", "123");
	      jedis.sadd("kk","234");
	      jedis.sadd("kk","345");
	      jedis.sadd("kk","456");
	      
	      Set<String> setKK = jedis.smembers("kk");
	      
	      System.out.println("set锟斤拷锟斤拷setKK:"+setKK.toString());*/
	      
	      
	      
	      
	}
}
