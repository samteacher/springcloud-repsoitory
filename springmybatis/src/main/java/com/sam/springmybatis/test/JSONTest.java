package com.sam.springmybatis.test;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.sam.springmybatis.entity.User;

import java.util.*;

public class JSONTest {

    public static void main(String[] args) {
//        List<User> list = new ArrayList<User>();
//        list.add(new User("zhangSan","13"));
//        list.add(new User("dfasd","14"));
//        javaBeanToJSONArray(list);
//        for (User user:list) {
//            System.out.println(user.getUsername()+"---"+user.getAge());
//        }

        String objectStr="{\"name\":\"JSON\",\"age\":\"24\",\"address\":\"北京市西城区\"}";
        String arrayStr="[{\"name\":\"JSON\",\"age\":\"24\",\"address\":\"北京市西城区\"}]";
        HashMap<String,String> map = (HashMap<String, String>) parseJsonParamToString(objectStr);
        System.out.println(map.get("address"));
        System.out.println(map.get("name"));
        System.out.println(map.get("age"));

    }

    /**
     * 解析Java集合为Json集合
     * @return
     */
    public static JSONArray javaBeanToJSONArray(List<?> t){
        JSONArray jsonArray = (JSONArray) JSONArray.toJSON(t);
        System.out.println("----->"+jsonArray);
        return jsonArray;
    }

    /**
     * 解析JSON为map
     * @param jsonParam
     * @return
     */
    public static Map<String,Object> parseJsonParam(String jsonParam) {
        Map<String,Object> requestParamMap = JSON.parseObject(jsonParam, HashMap.class);
        return requestParamMap;
    }

    /**
     * 解析JSON为map
     * @param jsonParam
     * @return
     */
    public static Map<String,String> parseJsonParamToString(String jsonParam) {
        Map<String,String> requestParamMap = JSON.parseObject(jsonParam,HashMap.class);
        return requestParamMap;
    }

}
