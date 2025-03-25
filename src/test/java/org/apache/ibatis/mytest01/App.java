package org.apache.ibatis.mytest01;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.*;

import java.io.Reader;

public class App {
    public static void main(String[] args) throws Exception {
        Reader reader = Resources.getResourceAsReader("org/apache/ibatis/mytest01/mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
        SqlSession session = sqlSessionFactory.openSession();

        DfVerifyResultMapper mapper = session.getMapper(DfVerifyResultMapper.class);
        DfVerifyResultPo one = mapper.getOne("05ecf658323ce928a45cbcfb4300effa");

        System.out.println(one);

        session.close();
    }

}
