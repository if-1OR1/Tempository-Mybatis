package org.teamOne.tempository.dao;

import org.teamOne.tempository.aggregate.User;

public interface UserMapper {
    User getUserInfoById(int id);
}
