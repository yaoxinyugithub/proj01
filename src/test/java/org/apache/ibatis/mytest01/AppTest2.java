package org.apache.ibatis.mytest01;

import org.apache.ibatis.reflection.property.PropertyTokenizer;

/**
 * @author xy.yao
 * @description TODO
 * @date 2025-03-25 14:37
 */
public class AppTest2 {
    public static void main(String[] args) {
        PropertyTokenizer propertyTokenizer = new PropertyTokenizer("user.address[0].street");
        while (propertyTokenizer.hasNext()) {
            System.out.println("name:" + propertyTokenizer.getName());
            System.out.println("indexedName:" + propertyTokenizer.getIndexedName());
            System.out.println("index:" + propertyTokenizer.getIndex());
            System.out.println("children:" + propertyTokenizer.getChildren());
            propertyTokenizer = propertyTokenizer.next();
            System.out.println("==================");
        }

    }
}
