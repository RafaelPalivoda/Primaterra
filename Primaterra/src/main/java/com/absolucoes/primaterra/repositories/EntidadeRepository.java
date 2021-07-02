package com.absolucoes.primaterra.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.absolucoes.primaterra.domains.Entidade;

@Repository
public interface EntidadeRepository extends JpaRepository<Entidade, Integer>{

}