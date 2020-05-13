package io.home.surf.dao;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

import io.home.surf.model.UserAccount;

/**
 * @author Dimitris Anastasopoulos
 *
 */
public interface UserAccountDao extends PagingAndSortingRepository<UserAccount, UUID> {

  Optional<UserAccount> findById(UUID id);

  boolean existsByUsername(String username);

  boolean existsByEmail(String email);

  @Query("SELECT u FROM UserAccount u WHERE (u.email = ?1 OR u.username = ?1) AND u.password = ?2")
  Optional<UserAccount> findByEmailOrUsernameAndPassword(String emailOrUsername, String password);

}
