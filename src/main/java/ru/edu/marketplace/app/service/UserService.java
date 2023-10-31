package ru.edu.marketplace.app.service;

import ru.edu.marketplace.app.entity.User;

public interface UserService {
    User getById(int id);
    void create(User u);
}
