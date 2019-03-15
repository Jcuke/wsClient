package com.tl.util.requestUtils.json;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.google.gson.*;
import lombok.extern.slf4j.Slf4j;

import java.io.IOException;
import java.text.DateFormat;

@Slf4j
public class JSONUtil {

    private final static ObjectMapper mapper = new ObjectMapper();
    private final static JsonParser parser = new JsonParser();

    static {
        mapper.enable(SerializationFeature.WRITE_NULL_MAP_VALUES);
        mapper.enable(SerializationFeature.ORDER_MAP_ENTRIES_BY_KEYS);
        mapper.setVisibility(PropertyAccessor.FIELD, JsonAutoDetect.Visibility.ANY);
    }

    public static void setDateFormat(DateFormat dateFormat) {
        mapper.setDateFormat(dateFormat);
    }

    /**
     * 把Java对象转为JSON字符串
     *
     * @param obj the object need to transfer into json string.
     * @return json string.
     */
    public static String toJson(Object obj) {
        try {
            return mapper.writeValueAsString(obj);
        } catch (IOException e) {
            log.error("对象转json异常:",e);
            throw new JSONException("把对象转换为JSON时出错了", e);
        }
    }

    /**
     * 把JSON转换为Java对象
     *
     * @param json  the json string
     * @param clazz will convert into class
     * @param <T>   return type
     * @return java object.
     */
    public static <T> T fromJson(String json, Class<T> clazz) {
        try {
            return mapper.readValue(json, clazz);
        } catch (IOException e) {
            log.error("json字符串转对象异常:",e);
            throw new JSONException(e.getLocalizedMessage());
        }
    }

    /**
     * 获取泛型的Collection Type
     *
     * @param jsonStr         json字符串
     * @param collectionClass 泛型的Collection
     * @param elementClasses  元素类型
     */
    public static <T> T fromJson(String jsonStr, Class<?> collectionClass, Class<?>... elementClasses) {
        JavaType javaType = mapper.getTypeFactory().constructParametrizedType(collectionClass, collectionClass, elementClasses);
        try {
            return mapper.readValue(jsonStr, javaType);
        } catch (IOException e) {
            throw new RuntimeException("convert json error:" + e.getLocalizedMessage());
        }
    }

    /**
     * 把Object对象转换为Class类型的对象
     *
     * @param o
     * @param tClass
     * @param <T>
     * @return
     */
    public static <T> T convert(Object o, Class<T> tClass) {
        return mapper.convertValue(o, tClass);
    }


    /**
     * 根据key查值，值为简单类型
     *
     * @param strJson
     * @param key
     * @return
     */
    public static String getValueByKeyToString(String strJson, String key) {
        try {
            JsonElement root = parser.parse(strJson);
            JsonObject element = root.getAsJsonObject();
            JsonPrimitive primitive = element.getAsJsonPrimitive(key);
            return primitive.getAsString();
        } catch (Exception e) {
            //log.error("从json字符串获取指定key异常:",e);
        }
        return "";
    }

    public static String getObjectByKeyToString(String strJson, String key) {
        try {
            JsonElement root = parser.parse(strJson);
            JsonObject element = root.getAsJsonObject();
            JsonObject jsonObject = element.getAsJsonObject(key);
            return jsonObject.toString();
        } catch (Exception e) {
            log.error("从json字符串获取指定key异常:",e);
        }
        return "";
    }

    public static String getJsonArrayByKeyToString(String strJson, String key) {
        try {
            JsonElement root = parser.parse(strJson);
            JsonObject element = root.getAsJsonObject();
            JsonArray jsonArray = element.getAsJsonArray(key);
            return jsonArray.toString();
        } catch (Exception e) {
            log.error("从json字符串获取指定key异常:",e);
        }
        return "";
    }

    public static String getBusinessData(String message) {
        return getObjectByKeyToString(message, "businessData");
    }

    public static String getMessageType(String message) {
        return getValueByKeyToString(message, "messageType");
    }

    public static String getBusinessValueByKey(String message, String key) {
        String bussinessData = getBusinessData(message);
        return getValueByKeyToString(bussinessData, key);
    }

    public static Object getBusinessData4BeanFromMessage(String message, Class clazz) {
        return fromJson(getBusinessData(message), clazz);
    }
}
