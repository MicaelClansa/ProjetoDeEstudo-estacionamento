package out.repository;

import org.springframework.stereotype.Repository;
import out.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {
}