package ru.edu.marketplace.app.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.edu.marketplace.app.entity.User;
import ru.edu.marketplace.app.repository.read.UserReadRepository;
import ru.edu.marketplace.app.repository.write.UserWriteRepository;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService{
    private final UserReadRepository userReadRepository;
    private final UserWriteRepository userWriteRepository;
    public void create(User u) {
        userWriteRepository.create(u);
    }

    public User getById(int id) {
        return userReadRepository.getById(id);
    }
}
