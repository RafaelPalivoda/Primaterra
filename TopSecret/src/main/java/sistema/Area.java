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
    private float metragemInicial, metragemFinal, valorInicial, valorFinal, valorMetroFinal , valorMetroInicial, porcentagemAproveitamento, porcentagemConvertida;
    private int qtdadeLotes;
    private String observacao;

    
    //Metodos Get e Set Metragem Inicial do terreno.
    public float getMetragemInicial() {
        return metragemInicial;
    }

    public void setMetragemInicial(float metragemInicial) {
        this.metragemInicial = metragemInicial;
    }
    //Metodos Get e Set da Metragem que será aproveitada.
    public float getMetragemFinal() {
        return metragemFinal;
    }

    public void setMetragemFinal(float metragemFinal) {
        this.metragemFinal = metragemFinal;
    }
    // Métodos Get e Set do valor investido inicialmente no terreno
    public void setValorInicial(float valorInicial){
        this.valorInicial = valorInicial;
    }
    public float getValorInicial(){
        return valorInicial;
    }
    // Método que traz o valor do metro quadrado inicial
    public float getValorMetroInicial() {
        return valorMetroInicial;
    }
    /*Métodos Calcula valor inicial do metro quadrado
    *É calculado dividindo o valor gasto inicialmente pela metragem total do terreno
    */
    public void calculaValorMetro() {
        this.valorMetroInicial = valorInicial / metragemInicial;
    }
    
    public float getValorMetroFinal() {
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
    public int getQtdadeLotes() {
        return qtdadeLotes;
    }

    public void setQtdadeLotes(int qtdadeLotes) {
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
    public float getPorcentagemAproveitamento() {
        return porcentagemAproveitamento;
    }

    public void setPorcentagemAproveitamento(float porcentagemAproveitamento) {
        this.porcentagemAproveitamento = porcentagemAproveitamento;
    }

    public Area(float metragemInicial, float valorInicial, float porcentagemAproveitamento, int qtdadeLotes, String observacao) {
        this.metragemInicial = metragemInicial;
        this.valorInicial = valorInicial;
        this.porcentagemAproveitamento = porcentagemAproveitamento;
        this.qtdadeLotes = qtdadeLotes;
        this.observacao = observacao;
    }
    // Classe para cadastro e calculo de permuta
    public class Permuta {
        private float porcentagemPermuta, valorPermuta;
        private int quantidade;

        public float getPorcentagemPermuta() {
            return porcentagemPermuta;
        }

        public void setPorcentagemPermuta(float porcentagemPermuta) {
            this.porcentagemPermuta = porcentagemPermuta;
        }

        public float getValorPermuta() {
            return valorPermuta;
        }

        public void setValorPermuta(float valorPermuta) {
            this.valorPermuta = valorPermuta;
        }

        public int getQuantidade() {
            return quantidade;
        }

        public void setQuantidade(int quantidade) {
            this.quantidade = quantidade;
        }

        public Permuta(float porcentagemPermuta, float valorPermuta, int quantidade) {
            setPorcentagemPermuta(porcentagemPermuta);
            setValorPermuta(valorPermuta);
            setQuantidade(quantidade);
        }

    }

    public class Empreendimento {

        private int codigo, codigoIncorporadores;
        private String nomeEmpreendimento;
        private float custoPrevisto, custoEfetivo, custoTotal;

        public String getNomeEmpreendimento() {
            return nomeEmpreendimento;
        }

        public void setNomeEmpreendimento(String nomeEmpreendimento) {
            this.nomeEmpreendimento = nomeEmpreendimento;
        }

        public float getCustoPrevisto() {
            return custoPrevisto;
        }

        public void setCustoPrevisto(float custoPrevisto) {
            this.custoPrevisto = custoPrevisto;
        }

        public float getCustoEfetivo() {
            return custoEfetivo;
        }

        public void setCustoEfetivo(float custoEfetivo) {
            this.custoEfetivo = custoEfetivo;
        }

        public float custoTotal() {
            return custoPrevisto - custoEfetivo;
        }

        public Empreendimento(String nomeEmpreendimento, float custoPrevisto, float custoEfetivo) {
            setNomeEmpreendimento(nomeEmpreendimento);
            setCustoPrevisto(custoPrevisto);
            setCustoEfetivo(custoEfetivo);
        }

    }

    public class Etapas {

        private int codigo;
        public String nome;

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        
        public void gerarEtapa(){
            
        }
        
        public void statusEtapa(){
        
    }

    public class Incorporadores {

        private String nome;
        private int codigoIncorporadores, qtdadeLotes;
        private float porcentagemRateio, porcentagemPermuta;

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public float getPorcentagemRateio() {
            return porcentagemRateio;
        }

        public void setPorcentagemRateio(float porcentagemRateio) {
            this.porcentagemRateio = porcentagemRateio;
        }

        public float getPorcentagemPermuta() {
            return porcentagemPermuta;
        }

        public void setPorcentagemPermuta(float porcentagemPermuta) {
            this.porcentagemPermuta = porcentagemPermuta;
        }

        public int getQtdadeLotes() {
            return qtdadeLotes;
        }

        public void setQtdadeLotes(int qtdadeLotes) {
            this.qtdadeLotes = qtdadeLotes;
        }

        public void gerarRateio() {

        }

        public void gerarIncorporador() {

        }

        public Incorporadores(String nome, int qtdadeLotes, float porcentagemRateio, float porcentagemPermuta) {
            setNome(nome);
            setQtdadeLotes(qtdadeLotes);
            setPorcentagemRateio(porcentagemRateio);
            setPorcentagemPermuta(porcentagemPermuta);
        }
        
        
    }

}
}