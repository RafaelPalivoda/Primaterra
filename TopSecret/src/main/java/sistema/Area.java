/*
* Software desenvolvido e licenciado por Ab Solucoes em Ti
* Todos os direitos reservados
* Qualquer cópia não autorizada estará sujeita a sanções cíveis e criminais
*/
package sistema;

/*
* Autores: Rafael Palivoda & Matheus Balão
* Coordenação de: Alexsandro Barboza
*/
public class Area {
    //Atributos da Area.
    private Float metragemInicial, metragemFinal, valorInicial, valorFinal, valorMetroFinal , valorMetroInicial, porcentagemAproveitamento, porcentagemConvertida;
    private Integer qtdadeLotes;
    private String observacao, nomeArea;
    //Metodos Get e Set Metragem Inicial do terreno.
    public Float getMetragemInicial() {
        return metragemInicial;
    }

    public void setMetragemInicial(Float metragemInicial) {
        this.metragemInicial = metragemInicial;
    }
    //Metodos Get e Set da Metragem que será aproveitada.
    public Float getMetragemFinal() {
        return metragemFinal;
    }

    public void setMetragemFinal(Float metragemFinal) {
        this.metragemFinal = metragemFinal;
    }
    // Métodos Get e Set do valor investido inicialmente no terreno
    public void setValorInicial(Float valorInicial){
        this.valorInicial = valorInicial;
    }
    public Float getValorInicial(){
        return valorInicial;
    }
    // Método que traz o valor do metro quadrado inicial
    public Float getValorMetroInicial() {
        return valorMetroInicial;
    }
    /*Métodos Calcula valor inicial do metro quadrado
    *É calculado dividindo o valor gasto inicialmente pela metragem total do terreno
    */
    public void calculaValorMetro() {
        this.valorMetroInicial = valorInicial / metragemInicial;
    }
    
    public Float getValorMetroFinal() {
        return valorMetroFinal;
    }
    //Transformar a porcentagem em float
    public void porcetagemParaFloat(){
        porcentagemConvertida = (this.porcentagemAproveitamento / 100);
        metragemFinal = porcentagemConvertida * metragemInicial;
    }
    /*Métodos Calcula valor final do metro quadrado
    *É calculado dividindo o valor gasto inicialmente pela metragem aproveitada do terreno
    */
    public void calculaValorMetroFinal() {
        this.valorMetroFinal = valorInicial / metragemFinal;
    }
    // Métodos Get e Set da quantidade prevista de lotes do terreno.
    public Integer getQtdadeLotes() {
        return qtdadeLotes;
    }

    public void setQtdadeLotes(Integer qtdadeLotes) {
        this.qtdadeLotes = qtdadeLotes;
    }
    //Métodos Get e Set do campo Observação.
    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }
    // Métodos que definem a porcentagem do aproveitamento digitada pelo usuário
    public Float getPorcentagemAproveitamento() {
        return porcentagemAproveitamento;
    }

    public void setPorcentagemAproveitamento(Float porcentagemAproveitamento) {
        this.porcentagemAproveitamento = porcentagemAproveitamento;
    }
    //Metodos Getter e Setter que definem o nomeda Area
    public String getNomeArea(){
        return nomeArea;
    }
    
    public void setNomeArea(String nomeArea){
        this.nomeArea = nomeArea;
    }
    public Area(String nomeArea, Float metragemInicial, Float valorInicial, Float porcentagemAproveitamento,
                Integer qtdadeLotes, String observacao) {
        setNomeArea(nomeArea);
        setMetragemInicial(metragemInicial);
        setValorInicial(valorInicial);
        setPorcentagemAproveitamento(porcentagemAproveitamento);
        setQtdadeLotes(qtdadeLotes);
        setObservacao(observacao);
    }
    // Classe para cadastro e calculo de permuta
    public class Permuta {
        //Atributos Permuta
        private Float porcentagemPermuta, valorPermuta;
        //Getter e Setter...
        public Float getPorcentagemPermuta() {
            return porcentagemPermuta;
        }

        public void setPorcentagemPermuta(Float porcentagemPermuta) {
            this.porcentagemPermuta = porcentagemPermuta;
        }

        public Float getValorPermuta() {
            return valorPermuta;
        }

        public void setValorPermuta(Float valorPermuta) {
            this.valorPermuta = valorPermuta;
        }
        //----------------------------------------//
    }

    public class Empreendimento {
        //Atributos Empreendimento
        private String nomeEmpreendimento;
        private Float custoPrevisto, custoEfetivo, custoTotal;
        //Getter e Setter..
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
        //-----------------------------------------------//
        /*Método que calcula o Custo Total do Empreendimento
        * Custo Previsto - Custo Efetivo do empreendimento
        */
        public void setCustoTotal() {
            this.custoTotal = this.custoPrevisto - this.custoEfetivo;
        }
        //Método Contrutor Empreendimento
        public Empreendimento(String nomeEmpreendimento, Float custoPrevisto, Float custoEfetivo) {
            setNomeEmpreendimento(nomeEmpreendimento);
            setCustoPrevisto(custoPrevisto);
            setCustoEfetivo(custoEfetivo);
        }
    }
    public class TipoProjetos {
        //Atributos Tipo Projetos
        private String tipoProjeto;

        public String getTipoProjeto() {
            //SELECT FROM TipoProjeto WHERE tipoProjeto = this.nome;
            return tipoProjeto;
        }

        public void setTipoProjeto(String tipoProjeto) {
            //INSERT INTO TipoProjeto (tipoProjeto);
            this.tipoProjeto = tipoProjeto;
        }
    }
    public class Etapas{
        //Atributos Etapas
        private String etapa;
        //Métodos Getter e Setter
        public String getEtapa() {
            //SELECT FROM Etapa WHERE nomeEtapa = this.etapa
            return etapa;
        }
        public void setEtapa(String etapa) {
            //INSERT INTO Etapa (nomeEtapa);
            this.etapa = etapa;
        }
    }
}