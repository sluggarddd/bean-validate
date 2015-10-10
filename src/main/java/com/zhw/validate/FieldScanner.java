package com.zhw.validate;


import com.zhw.validate.annotation.Require;

import java.lang.reflect.Field;

/**
 * @author zhw
 * @version 0.1  15/10/10
 */
public class FieldScanner {

    public static Boolean validate(Object o) throws Exception {

        Field[] fields = o.getClass().getDeclaredFields();
        for (Field field : fields) {
            if (field.isAnnotationPresent(Require.class)) {
//                System.out.println(o.getClass().getDeclaredMethod("getTitle").invoke(o));
                field.setAccessible(true);
                if (field.get(o) == null) {
                    return false;
                }
            }
        }
        return true;
    }


}
