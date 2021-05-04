/*
* Software desenvolvido e licenciado por Ab Solucoes em Ti
* Todos os direitos reservados
* Qualquer cópia não autorizada estará sujeita a sanções cíveis e criminais
*/
package com.absolucoes.mgtincorporadora.mgtIncorporadora.repositorio;

import com.absolucoes.mgtincorporadora.mgtIncorporadora.domain.Area;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/*
* Autores: Rafael Palivoda & Matheus Balão
* Coordenação de: Alexsandro Barboza
*/
@Repository
public interface RepositorioArea extends JpaRepository<Area, Integer>{
    
}
