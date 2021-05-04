/*
* Software desenvolvido e licenciado por Ab Solucoes em Ti
* Todos os direitos reservados
* Qualquer cópia não autorizada estará sujeita a sanções cíveis e criminais
*/
package com.absolucoes.mgtincorporadora.mgtIncorporadora.domain;

import java.util.Objects;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/*
* Autores: Rafael Palivoda & Matheus Balão
* Coordenação de: Alexsandro Barboza
*/
public class Area {
    //Atributos da Area.
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;
    @OneToMany(mappedBy="nomeEmpreendimento")
    private String nomeArea;
    private Empreendimento empreendimento;
    private Float metragemInicial, metragemFinal, valorInicial, valorFinal, valorMetroFinal , valorMetroInicial, porcentagemAproveitamento, porcentagemConvertida;
    private Integer qtdadeLotes;
    private String observacao;

    public Integer getId() {
        return Id;
    }

    public void setId(Integer Id) {
        this.Id = Id;
    }

    public String getNomeArea() {
        return nomeArea;
    }

    public void setNomeArea(String nomeArea) {
        this.nomeArea = nomeArea;
    }

    public Empreendimento getEmpreendimento() {
        return empreendimento;
    }

    public void setEmpreendimento(Empreendimento empreendimento) {
        this.empreendimento = empreendimento;
    }

    public Float getMetragemInicial() {
        return metragemInicial;
    }

    public void setMetragemInicial(Float metragemInicial) {
        this.metragemInicial = metragemInicial;
    }

    public Float getMetragemFinal() {
        return metragemFinal;
    }

    public void setMetragemFinal(Float metragemFinal) {
        this.metragemFinal = metragemFinal;
    }

    public Float getValorInicial() {
        return valorInicial;
    }

    public void setValorInicial(Float valorInicial) {
        this.valorInicial = valorInicial;
    }

    public Float getValorFinal() {
        return valorFinal;
    }

    public void setValorFinal(Float valorFinal) {
        this.valorFinal = valorFinal;
    }

    public Float getValorMetroFinal() {
        return valorMetroFinal;
    }

    public void setValorMetroFinal(Float valorMetroFinal) {
        this.valorMetroFinal = valorMetroFinal;
    }

    public Float getValorMetroInicial() {
        return valorMetroInicial;
    }

    public void setValorMetroInicial(Float valorMetroInicial) {
        this.valorMetroInicial = valorMetroInicial;
    }

    public Float getPorcentagemAproveitamento() {
        return porcentagemAproveitamento;
    }

    public void setPorcentagemAproveitamento(Float porcentagemAproveitamento) {
        this.porcentagemAproveitamento = porcentagemAproveitamento;
    }

    public Float getPorcentagemConvertida() {
        return porcentagemConvertida;
    }

    public void setPorcentagemConvertida(Float porcentagemConvertida) {
        this.porcentagemConvertida = porcentagemConvertida;
    }

    public Integer getQtdadeLotes() {
        return qtdadeLotes;
    }

    public void setQtdadeLotes(Integer qtdadeLotes) {
        this.qtdadeLotes = qtdadeLotes;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.Id);
        hash = 37 * hash + Objects.hashCode(this.empreendimento);
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
        final Area other = (Area) obj;
        if (!Objects.equals(this.Id, other.Id)) {
            return false;
        }
        if (!Objects.equals(this.empreendimento, other.empreendimento)) {
            return false;
        }
        return true;
    }

    public Area(Integer Id, String nomeArea, Float metragemInicial, Float valorInicial, Float porcentagemAproveitamento, Integer qtdadeLotes, String observacao) {
        this.Id = Id;
        this.nomeArea = nomeArea;
        this.metragemInicial = metragemInicial;
        this.valorInicial = valorInicial;
        this.porcentagemAproveitamento = porcentagemAproveitamento;
        this.qtdadeLotes = qtdadeLotes;
        this.observacao = observacao;
    }
    
}
