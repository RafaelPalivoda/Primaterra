package com.absolucoes.primaterra.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.absolucoes.primaterra.domain.Investidor;

@Repository
public interface InvestidorRepository extends JpaRepository<Investidor, Integer>{

}
