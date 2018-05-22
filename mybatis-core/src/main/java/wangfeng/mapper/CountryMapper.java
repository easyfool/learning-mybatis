package wangfeng.mapper;

import java.util.List;
import wangfeng.model.Country;

public interface CountryMapper {

  public Country selectById(Integer id);

  public List<Country> selectAll();
}
