package co.ucentral.universidad.repositorios;

import co.ucentral.universidad.entidades.Universidad;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepoUniversidad extends JpaRepository<Universidad,Long> {
}