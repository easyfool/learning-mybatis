package com.wangfeng;

import java.io.IOException;
import java.io.Reader;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.BeforeClass;

public class BaseMapperTest {

  private static SqlSessionFactory sessionFactory;

  @BeforeClass
  public static void init() {
    Reader reader = null;
    try {
      reader = Resources.getResourceAsReader("mybaits-config.xml");
      sessionFactory = new SqlSessionFactoryBuilder().build(reader);
    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      try {
        reader.close();
      } catch (IOException e) {
        e.printStackTrace();
      }
    }

  }

  public SqlSession getSqlSession() {
    return sessionFactory.openSession();
  }

}
