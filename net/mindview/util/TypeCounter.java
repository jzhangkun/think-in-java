package net.mindview.util;
import java.util.*;

/**
 * Created by jzhangkun on 27/05/2017.
 */
public class TypeCounter extends HashMap<Class<?>, Integer> {
    private Class<?> baseType;
    public TypeCounter(Class<?> baseType) {
        this.baseType = baseType;
    }
    public void count(Object obj) {
        Class<?> type = obj.getClass();
        if (!baseType.isAssignableFrom(type))
            throw new RuntimeException(obj + " incorrect type: "
              + type + ", should be type or subtype of "
              + baseType);
        countClass(type);
    }
    public void countClass(Class<?> type) {
        Integer cnt = get(type);
        put(type, cnt == null ? 1 : cnt + 1);
        Class<?> superClass = type.getSuperclass();
        if (superClass != null && baseType.isAssignableFrom(superClass))
            countClass(superClass);
    }
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("{");
        for (Map.Entry<Class<?>, Integer> pair: entrySet()) {
            result.append(pair.getKey().getSimpleName());
            result.append("=");
            result.append(pair.getValue());
            result.append(", ");
        }
        result.delete(result.length() - 2, result.length());
        result.append("}");
        return result.toString();
    }
}
