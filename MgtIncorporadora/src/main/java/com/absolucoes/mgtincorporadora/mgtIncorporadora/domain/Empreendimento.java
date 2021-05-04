/*
* Software desenvolvido e licenciado por Ab Solucoes em Ti
* Todos os direitos reservados
* Qualquer cópia não autorizada estará sujeita a sanções cíveis e criminais
*/
package com.absolucoes.mgtincorporadora.mgtIncorporadora.domain;
/*
* Autores: Rafael Palivoda & Matheus Balão
* Coordenação de: Alexsandro Barboza
*/
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
/*
* Autores: Rafael Palivoda & Matheus Balão
* Coordenação de: Alexsandro Barboza
*/
@Entity
public class Empreendimento {
        //Atributos Empreendimento
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Integer Id;
        @ManyToMany(mappedBy="nomeEntidade")
        @JoinColumn(name="entidade_Id")
        private Entidade entidade;
        @ManyToOne
        @JoinColumn(name="area_Id")
        private Area nomeArea;
        private String nomeEmpreendimento;
        private Float custoPrevisto, custoEfetivo, custoTotal;

    public Integer getId() {
        return Id;
    }

    public void setId(Integer Id) {
        this.Id = Id;
    }

    public Entidade getEntidade() {
        return entidade;
    }

    public void setEntidade(Entidade entidade) {
        this.entidade = entidade;
    }

    public Area getNomeArea() {
        return nomeArea;
    }

    public void setNomeArea(Area nomeArea) {
        this.nomeArea = nomeArea;
    }

    public String getNomeEmpreendimento() {
        return nomeEmpreendimento;
    }

    public void setNomeEmpreendimento(String nomeEmpreendimento) {
        this.nomeEmpreendimento = nomeEmpreendimento;
    }

    public Float getCustoPrevisto() {
        return custoPrevisto;
    }

    public void setCustoPrevisto(Float custoPrevisto) {
        this.custoPrevisto = custoPrevisto;
    }

    public Float getCustoEfetivo() {
        return custoEfetivo;
    }

    public void setCustoEfetivo(Float custoEfetivo) {
        this.custoEfetivo = custoEfetivo;
    }

    public Float getCustoTotal() {
        return custoTotal;
    }

    public void setCustoTotal(Float custoTotal) {
        this.custoTotal = custoTotal;
    }

    public Empreendimento(Integer Id, Entidade entidade, Area nomeArea, String nomeEmpreendimento, Float custoPrevisto, Float custoEfetivo) {
        this.Id = Id;
        this.entidade = entidade;
        this.nomeArea = nomeArea;
        this.nomeEmpreendimento = nomeEmpreendimento;
        this.custoPrevisto = custoPrevisto;
        this.custoEfetivo = custoEfetivo;
    }

    public void addAll(List<Empreendimento> asList) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
        
}
