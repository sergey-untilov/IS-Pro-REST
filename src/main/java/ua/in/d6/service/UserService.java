package ua.in.d6.service;

import ua.in.d6.domain.root.CustomUser;

public interface UserService {
    CustomUser findByLogin(String login);
    boolean existsByLogin(String login);
    //void addUser(CustomUser customUser);
    //void updateUser(CustomUser customUser);
}
