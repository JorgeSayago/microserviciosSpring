package ec.edu.ups.microserviciosSpring.repository;

import ec.edu.ups.microserviciosSpring.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {

}
