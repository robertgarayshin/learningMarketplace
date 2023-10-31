package ru.edu.marketplace.app.repository.read;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import ru.edu.marketplace.app.entity.User;

@Repository
public interface UserReadRepository {
    User getById(@Param("id")int id);
}
