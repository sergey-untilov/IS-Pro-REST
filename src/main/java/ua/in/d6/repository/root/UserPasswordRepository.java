package ua.in.d6.repository.root;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.in.d6.domen.root.UserPassword;

public interface UserPasswordRepository extends JpaRepository<UserPassword, Long> {
}
