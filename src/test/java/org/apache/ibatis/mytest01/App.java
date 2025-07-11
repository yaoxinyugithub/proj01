package org.apache.ibatis.mytest01;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.*;

import java.io.Reader;

public class App {
    public static void main(String[] args) throws Exception {
        Reader reader = Resources.getResourceAsReader("org/apache/ibatis/mytest01/mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
        SqlSession session = sqlSessionFactory.openSession();

        UserMapper mapper = session.getMapper(UserMapper.class);
        User one = mapper.getOne(1);

        System.out.println(one);

        session.close();
    }

}
