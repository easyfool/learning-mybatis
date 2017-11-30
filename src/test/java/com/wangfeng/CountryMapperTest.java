package com.wangfeng;

import com.wangfeng.mapper.CountryMapper;
import com.wangfeng.model.Country;
import java.util.List;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class CountryMapperTest extends BaseMapperTest {

  @Test
  public void testSelectAll() {
    SqlSession session = getSqlSession();
    try {
      List<Object> list = session.selectList("com.wangfeng.mapper.CountryMapper.selectAll");
      list.forEach(System.out::println);
    } finally {
      session.close();
    }


  }

  @Test
  public void testSelectById() {
    SqlSession session = getSqlSession();
    try {
      Country country = session.selectOne("com.wangfeng.mapper.CountryMapper.selectById", 1);
      System.out.println(country);
    } finally {
      session.close();
    }
  }

  @Test
  public void testWithMapper() {
    SqlSession session = getSqlSession();
    try {
      CountryMapper countryMapper = session.getMapper(CountryMapper.class);
      List<Country> countries = countryMapper.selectAll();
      countries.forEach(System.out::println);
    } finally {
      session.close();
    }

  }

}
