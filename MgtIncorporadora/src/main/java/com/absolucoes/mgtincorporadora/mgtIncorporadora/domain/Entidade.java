/*
* Software desenvolvido e licenciado por Ab Solucoes em Ti
* Todos os direitos reservados
* Qualquer cópia não autorizada estará sujeita a sanções cíveis e criminais
 */
package com.absolucoes.mgtincorporadora.mgtIncorporadora.domain;

import java.util.Date;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.OneToMany;

/*
* Autores: Rafael Palivoda & Matheus Balão
* Coordenação de: Alexsandro Barboza
 */
@Entity
public class Entidade {
    //Atributos Entidade

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;
    private String nomeEntidade, email;
    private Integer fixo, celular;
    private Date dtCadastro;
    @OneToMany(mappedBy = "nomeEmpreendimento")
    private Empreendimento empreendimento;

    public String getNomeEntidade() {
        return nomeEntidade;
    }

    public void setNomeEntidade(String nomeEntidade) {
        this.nomeEntidade = nomeEntidade;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getFixo() {
        return fixo;
    }

    public void setFixo(Integer fixo) {
        this.fixo = fixo;
    }

    public Integer getCelular() {
        return celular;
    }

    public void setCelular(Integer celular) {
        this.celular = celular;
    }

    public Empreendimento getEmpreendimento() {
        return empreendimento;
    }

    public void setEmpreendimento(Empreendimento empreendimento) {
        this.empreendimento = empreendimento;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer Id) {
        this.Id = Id;
    }

    public Date getDtCadastro() {
        return dtCadastro;
    }

    public void setDtCadastro(Date dtCadastro) {
        this.dtCadastro = dtCadastro;
    }

    public Entidade(String nomeEntidade, String email, Integer fixo, Integer celular) {
        this.nomeEntidade = nomeEntidade;
        this.email = email;
        this.fixo = fixo;
        this.celular = celular;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Entidade other = (Entidade) obj;
        if (!Objects.equals(this.Id, other.Id)) {
            return false;
        }
        return true;
    }

    public class PessoaJuridica extends Entidade {
        //Atributos Pessoa Juridica

        private String razaosocial;
        private Integer cnpj, enquadFiscal, tipoContribuinte;
        private Date dtFundacao;

        public String getRazaosocial() {
            return razaosocial;
        }

        public void setRazaosocial(String razaosocial) {
            this.razaosocial = razaosocial;
        }

        public Integer getCnpj() {
            return cnpj;
        }

        public void setCnpj(Integer cnpj) {
            this.cnpj = cnpj;
        }

        public Integer getEnquadFiscal() {
            return enquadFiscal;
        }

        public void setEnquadFiscal(Integer enquadFiscal) {
            this.enquadFiscal = enquadFiscal;
        }

        public Integer getTipoContribuinte() {
            return tipoContribuinte;
        }

        public void setTipoContribuinte(Integer tipoContribuinte) {
            this.tipoContribuinte = tipoContribuinte;
        }

        public Date getDtFundacao() {
            return dtFundacao;
        }

        public void setDtFundacao(Date dtFundacao) {
            this.dtFundacao = dtFundacao;
        }

        public PessoaJuridica(String razaosocial, Integer cnpj, Integer enquadFiscal, Integer tipoContribuinte, Date dtFundacao, String nomeEntidade, String email, Integer fixo, Integer celular) {
            super(nomeEntidade, email, fixo, celular);
            this.razaosocial = razaosocial;
            this.cnpj = cnpj;
            this.enquadFiscal = enquadFiscal;
            this.tipoContribuinte = tipoContribuinte;
            this.dtFundacao = dtFundacao;
        }

    }

    public class PessoaFisica extends Entidade {
        //Atributos Pessoa Fisica extende  os atributos da Entidade

        private Integer cpf, rg;

        public Integer getCpf() {
            return cpf;
        }

        public void setCpf(Integer cpf) {
            this.cpf = cpf;
        }

        public Integer getRg() {
            return rg;
        }

        public void setRg(Integer rg) {
            this.rg = rg;
        }

        public PessoaFisica(Integer cpf, Integer rg, String nomeEntidade, String email, Integer fixo, Integer celular) {
            super(nomeEntidade, email, fixo, celular);
            this.cpf = cpf;
            this.rg = rg;
        }

    }

    @Entity
    public class TipoEntidade {
        //Atributos Tipo Entidade

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Integer Id;
        private String tipoEntidade;

        public Integer getId() {
            return Id;
        }

        public void setId(Integer Id) {
            this.Id = Id;
        }

        public String getTipoEntidade() {
            return tipoEntidade;
        }

        public void setTipoEntidade(String tipoEntidade) {
            this.tipoEntidade = tipoEntidade;
        }

        public TipoEntidade(String tipoEntidade) {
            this.tipoEntidade = tipoEntidade;
        }

        public TipoEntidade(Integer Id, String tipoEntidade) {
            this.Id = Id;
            this.tipoEntidade = tipoEntidade;
        }

    }
}
