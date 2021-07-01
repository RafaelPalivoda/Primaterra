package com.absolucoes.primaterra.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.absolucoes.primaterra.domain.Terreneiro;

@Repository
public interface TerreneiroRepository extends JpaRepository<Terreneiro, Integer>{

}
