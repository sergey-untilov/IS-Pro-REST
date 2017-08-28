package ua.in.d6.repository.root;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.in.d6.domen.root.CustomUser;

public interface UserRepository extends JpaRepository<CustomUser, Long> {
    CustomUser findByLogin(String login);
}
