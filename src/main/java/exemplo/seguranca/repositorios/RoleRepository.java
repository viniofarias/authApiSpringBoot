package exemplo.seguranca.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import exemplo.seguranca.entidades.Role;

public interface RoleRepository extends JpaRepository<Role, Long>{

	
}
