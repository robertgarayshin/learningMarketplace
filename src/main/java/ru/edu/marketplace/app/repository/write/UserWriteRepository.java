package ru.edu.marketplace.app.repository.write;

import org.springframework.stereotype.Repository;
import ru.edu.marketplace.app.entity.User;

@Repository
public interface UserWriteRepository {
    void create(User u);
}
