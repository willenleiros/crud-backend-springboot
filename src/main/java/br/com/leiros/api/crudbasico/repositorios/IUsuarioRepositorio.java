package br.com.leiros.api.crudbasico.repositorios;

import br.com.leiros.api.crudbasico.entidades.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUsuarioRepositorio extends JpaRepository<Usuario, Long> {
}
