package com.wangfeng.mapper;

import com.wangfeng.model.Country;
import java.util.List;

public interface CountryMapper {

  public Country selectById(Integer id);

  public List<Country> selectAll();
}
