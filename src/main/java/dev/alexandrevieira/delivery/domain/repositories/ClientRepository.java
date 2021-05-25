package dev.alexandrevieira.delivery.domain.repositories;

import dev.alexandrevieira.delivery.domain.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {
    boolean existsByEmail(String email);

    Optional<Client> findByEmail(String email);
}
