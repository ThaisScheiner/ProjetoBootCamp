package santander.bootcamp.projectapirest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import santander.bootcamp.projectapirest.entity.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {
}
