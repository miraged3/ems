package cn.maoookai.ems.service;

import cn.maoookai.ems.entity.User;
import cn.maoookai.ems.to.UserAddVO;
import cn.maoookai.ems.to.UserVO;

import java.util.List;

public interface UserService {
    List<User> list();

    UserVO info(long id);

    User getUserById(long id);

    void add(UserAddVO vo);

}
