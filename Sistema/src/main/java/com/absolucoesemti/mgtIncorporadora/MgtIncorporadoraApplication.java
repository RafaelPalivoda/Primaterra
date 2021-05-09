package com.absolucoesemti.mgtIncorporadora;

import com.absolucoesemti.mgtIncorporadora.domain.Area;
import com.absolucoesemti.mgtIncorporadora.domain.Empreendimento;
import com.absolucoesemti.mgtIncorporadora.domain.Entidade;
import com.absolucoesemti.mgtIncorporadora.repositories.AreaRepository;
import com.absolucoesemti.mgtIncorporadora.repositories.EmpreendimentoRepository;
import com.absolucoesemti.mgtIncorporadora.repositories.EntidadeRepository;
import java.util.Arrays;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
@Service
@Controller
@SpringBootApplication
public class MgtIncorporadoraApplication implements CommandLineRunner{
        
        @Autowired
        private EntidadeRepository repositorioEntidade;
        @Autowired
        private AreaRepository repositorioArea;
        @Autowired
        private EmpreendimentoRepository repositorioEmpreendimento;
	
        public static void main(String[] args) {
		SpringApplication.run(MgtIncorporadoraApplication.class, args);
	}

    @Override
    public void run(String... args) throws Exception {
        Entidade entidade1 = new Entidade("Rafael", "rafael.plv@hotmail.com", 3, 4);
        Area area1 = new Area(null, "Area 51", 100.05f, 10000.07f, 60.50f, 5, "Ok");
        Empreendimento empreendimento1 = new Empreendimento(null, entidade1, area1, "Empreendimento Teste", 45.00f, 30.00f);
        
        area1.getEmpreendimento().addAll(Arrays.asList(empreendimento1));
        this.repositorioArea.saveAll(Arrays.asList(area1));
        this.repositorioEmpreendimento.saveAll(Arrays.asList(empreendimento1));
        this.repositorioEntidade.saveAll(Arrays.asList(entidade1));
    }

}
