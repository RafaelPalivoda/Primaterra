package com.absolucoes.primaterra.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.absolucoes.primaterra.domain.Contato;

@Repository
public interface ContatoRepository extends JpaRepository<Contato, Integer>{

	@Query("SELECT obj FROM Contato obj WHERE obj.contato_id = :id_forn")
	List<Contato> findAllByFornecedor(@Param(value="id_forn") Integer id_forne);

}
