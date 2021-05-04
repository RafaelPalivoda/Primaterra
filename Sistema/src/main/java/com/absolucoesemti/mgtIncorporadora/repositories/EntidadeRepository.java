/*
* Software desenvolvido e licenciado por Ab Solucoes em Ti
* Todos os direitos reservados
* Qualquer cópia não autorizada estará sujeita a sanções cíveis e criminais
*/
package com.absolucoesemti.mgtIncorporadora.repositories;

import com.absolucoesemti.mgtIncorporadora.domain.Entidade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
/*
* Autores: Rafael Palivoda & Matheus Balão
* Coordenação de: Alexsandro Barboza
*/
@Repository
public interface EntidadeRepository extends JpaRepository<Entidade, Integer>{
    
}
