package com.gaching.gachingwebservice.domain.user;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<com.gaching.gachingwebservice.domain.user.User, Long> {
  Optional<com.gaching.gachingwebservice.domain.user.User> findByEmail(String email);
}
