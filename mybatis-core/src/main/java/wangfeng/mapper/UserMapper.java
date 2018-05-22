package wangfeng.mapper;


import java.util.List;
import org.springframework.stereotype.Service;
import wangfeng.model.User;

public interface UserMapper {

  public List<User> selectAll();
}
