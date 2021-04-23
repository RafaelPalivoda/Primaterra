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

    private float metragem, valorMetro, aproveitamento, valorTotal;
    private int qtdadeLotes;
    private String observacao;

    public float getMetragem() {
        return metragem;
    }

    public void setMetragem(float metragem) {
        this.metragem = metragem;
    }

    public float getValorMetro() {
        return valorMetro;
    }

    public void setValorMetro(float valorMetro) {
        this.valorMetro = valorMetro;
    }

    public int getQtdadeLotes() {
        return qtdadeLotes;
    }

    public void setQtdadeLotes(int qtdadeLotes) {
        this.qtdadeLotes = qtdadeLotes;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public float getAproveitamento() {
        return aproveitamento;
    }

    public void setAproveitamento(float aproveitamento) {
        this.aproveitamento = aproveitamento;
    }

    public float valorTotal() {
        this.valorTotal = valorMetro * qtdadeLotes;
        return valorTotal;
    }

    public float gerarArea() {
        return metragem * aproveitamento;
    }

    public class Permuta {

        private float porcentagem;
        private float valor;
        private int quantidade;

        public float getPorcentagem() {
            return porcentagem;
        }

        public void setPorcentagem(float porcentagem) {
            this.porcentagem = porcentagem;
        }

        public float getValor() {
            return valor;
        }

        public void setValor(float valor) {
            this.valor = valor;
        }

        public int getQuantidade() {
            return quantidade;
        }

        public void setQuantidade(int quantidade) {
            this.quantidade = quantidade;
        }

    }

    public class Empreendimento {

        private int codigo;
        private String nomeEmpreendimento;
        private int codigoIncorporadores;
        private float custoPrevisto;
        private float custoEfetivo;
        private float custoTotal;

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
    }
    
    public class Incorporadores{
        private String nome;
        private int codigoIncorporadores;
        private float porcentagemRateio;
        private float porcentagemPermuta;
        private int qtdadeLotes;

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
        
        public void gerarRateio(){
            
        }
        
        public void gerarIncorporador(){
            
        }
    }

}