package org.apache.ibatis.mytest02;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.Reader;

public class App {

    @Test
    public void test1() throws IOException {
        Reader reader = Resources.getResourceAsReader("org/apache/ibatis/mytest02/mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
        SqlSession session = sqlSessionFactory.openSession();
        UserMapper mapper = session.getMapper(UserMapper.class);
        User one = mapper.getOne(1);
        System.out.println(one);
        session.close();
    }

}
