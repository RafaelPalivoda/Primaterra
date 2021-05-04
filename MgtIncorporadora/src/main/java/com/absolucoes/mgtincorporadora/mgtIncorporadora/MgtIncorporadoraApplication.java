package com.absolucoes.mgtincorporadora.mgtIncorporadora;
import com.absolucoes.mgtincorporadora.mgtIncorporadora.domain.Entidade;
import com.absolucoes.mgtincorporadora.mgtIncorporadora.domain.Empreendimento;
import com.absolucoes.mgtincorporadora.mgtIncorporadora.domain.Area;
import com.absolucoes.mgtincorporadora.mgtIncorporadora.repositorio.RepositorioArea;
import com.absolucoes.mgtincorporadora.mgtIncorporadora.repositorio.RepositorioEmpreendimento;
import com.absolucoes.mgtincorporadora.mgtIncorporadora.repositorio.RepositorioEntidade;
import java.util.Arrays;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
@Controller
@SpringBootApplication
public class MgtIncorporadoraApplication implements CommandLineRunner{
    @Autowired
    private RepositorioEntidade repositorioEntidade;
    @Autowired
    private RepositorioArea repositorioArea;
    @Autowired
    private RepositorioEmpreendimento repositorioEmpreendimento;
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
