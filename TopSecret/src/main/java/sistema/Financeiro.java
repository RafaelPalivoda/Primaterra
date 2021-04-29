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
import java.util.Date;
public class Financeiro {
// Atributos classe Financeiro...
    private String tipoNegociacao;
    //--------------------------------//
    //Métodos Getter e Setter...
    public String getTipoNegociacao() {
        //getTipoNegociacao -> SELECT FROM TipoNegociacao WHERE TipoNegociacao = this.tipoNegociacao;
        return tipoNegociacao;
        //Trazer do Banco de dados
    }

    public void setTipoNegociacao(String tipoNegociacao) {
        //setTipoNegociacao -> INSERT INTO TipoNegociacao (TipoNegociacao);
        this.tipoNegociacao = tipoNegociacao;
        //Enviar para o banco de dados
    }
    //-------------------------------//
    public class CentroCusto{
        //Atributos classe Centro de Custo
        private String nome;
        private Float previsto, efetivo, total;
        //---------------------------//
        //Métodos Getter e Setter
        public String getNome() {
            //getNome -> SELECT FROM CentroCusto WHERE nomeCentro = this.nome;
            return nome;
        }

        public void setNome(String nome) {
            //setNome -> INSERT INTO CentroCusto (nomeCentro);
            this.nome = nome;
        }

        public Float getPrevisto() {
            //getPrevisto -> SELECT FROM * WHERE * = *;
            return previsto;
        }

        public void setPrevisto(Float previsto) {
            //setPrevisto -> INSERT INTO * (*);
            this.previsto = previsto;
        }

        public Float getEfetivo() {
            //getEfetivo -> SELECT FROM * WHERE * = *;
            return efetivo;
        }

        public void setEfetivo(Float efetivo) {
            //setEfetivo -> INSERT INTO * (*);
            this.efetivo = efetivo;
        }

        public Float getTotal() {
            //getTotal -> SELECT FROM * WHERE * = *;
            return total;
        }

        public void setTotal(Float total) {
            //setTotal -> INSERT INTO * (*);
            this.total = total;
        }
        //-------------------------------//
    }
    public class ContasPagar{
        //Atributos classe Contas a pagar...
        private String nome, empreendimento, planoContas, centroCusto, incorporadora;
        private Integer numeroNf;
        private Date dtVencimento;
        private Float valorNota, valorRateio;
        private Byte rateio;
        //-----------------------------//
//Métodos Getter e Stter...
        public String getNome() {
            //getNome -> SELECT FROM ContasPagar WHERE nomeContaPagar = this.nome;
            return nome;
        }

        public void setNome(String nome) {
            //INSERT INTO ContasPagar (nomeContasPagar);
            this.nome = nome;
        }

        public Integer getNumeroNf() {
            //getNumeroNf -> SELECT FROM Contaspagar WHERE numeroNf = this.numeroNf;
            return numeroNf;
        }

        public void setNumeroNf(Integer numeroNf) {
            //INSERT INTO ContasPagar (numeroNf);
            this.numeroNf = numeroNf;
        }

        public Date getDtVencimento() {
            //getDtVencimento -> SELECT FROM Contaspagar WHERE dtVencimento = this.dtVencimento;
            return dtVencimento;
        }

        public void setDtVencimento(Date dtVencimento) {
            //INSERT INTO ContasPagar (dtVencimento);
            this.dtVencimento = dtVencimento;
        }

        public Float getValorNota() {
            //getValorNota -> SELECT FROM Contaspagar WHERE valorNota = this.valorNota;
            return valorNota;
        }

        public void setValorNota(Float valorNota) {
            //INSERT INTO ContasPagar (valorNota);
            this.valorNota = valorNota;
        }

        public String getEmpreendimento() {
            //getEmpreendimento -> SELECT FROM Empreendimento WHERE nomeEmpreendimento = this.empreendimento;
            return empreendimento;
        }

        public void setEmpreendimento(String empreendimento) {
            //INSERT INTO Empreendimento (nomeEmpreendimento);
            this.empreendimento = empreendimento;
        }

        public String getPlanoContas() {
            //getPlanoContas -> SELECT FROM PlanoContas WHERE nomePlano = this.planoContas;
            return planoContas;
        }

        public void setPlanoContas(String planoContas) {
            //INSERT INTO PlanoContas (nomePlano);
            this.planoContas = planoContas;
        }

        public String getCentroCusto() {
            //getCentroCusto -> SELECT FROM CentroCusto WHERE nomeCentro = this.centroCusto;
            return centroCusto;
        }

        public void setCentroCusto(String centroCusto) {
            //INSERT INTO CentroCusto (nomeCentro);
            this.centroCusto = centroCusto;
        }

        public String getIncorporadora() {
            //getIncorporadora -> SELECT FROM Entidade WHERE nome = this.incorporadora;
            return incorporadora;
        }

        public void setIncorporadora(String incorporadora) {
            //setIncorporadora -> INSERT INTO Contasapagar(IdEntidade); 
            this.incorporadora = incorporadora;
        }

        public Float getValorRateio() {
            //getValorrateio -> SELECT FROM Contaspagar WHERE valorRateio = this.valorRateio;
            return valorRateio;
        }

        public void setValorRateio(Float valorRateio) {
            //INSERT INTO ContasPagar (valorRateio);
            this.valorRateio = valorRateio;
        }

        public Byte getRateio() {
            //getRateio -> SELECT FROM Contaspagar WHERE rateio = this.rateio;
            return rateio;
        }

        public void setRateio(Byte rateio) {
            //INSERT INTO ContasPagar (rateio);
            this.rateio = rateio;
        }
        //--------------------------//
    }
    public class PlanoContas{
        //Atributos Plano de Contas...
        private String nome, descricaoEntrada, descricaoSaida;
        private Integer entrada, saida;
        //---------------------------//
        //Métodos Getter e Setter...
        public String getNome() {
            //getNome -> SELECT FROM PlanoContas WHERE nomePlano = this.nome;
            return nome;
        }

        public void setNome(String nome) {
            // INSERT INTO PlanoContas (nomePlano);
            this.nome = nome;
        }

        public Integer getEntrada() {
            //getEntrada -> SELECT FROM Receitas WHERE valorEntrada = this.entrada;
            return entrada;
        }

        public void setEntrada(Integer entrada) {
            // INSERT INTO Receitas (valorEntrada);
            this.entrada = entrada;
        }

        public Integer getSaida() {
            //getSaida -> SELECT FROM Despesas WHERE valorSaida = this.saida;
            return saida;
        }

        public void setSaida(Integer saida) {
            // INSERT INTO Despesas (valorSaida);
            this.saida = saida;
        }
        
        public String getDescricaoEntrada() {
            //getDescricaoEntrada -> SELECT FROM Receitas WHERE descricaoReceitas = this.descricaoEntrada;
            return descricaoEntrada;
        }

        public void setDescricaoEntrada(String descricaoEntrada) {
            // INSERT INTO Receitas (valorEntrada);
            this.descricaoEntrada = descricaoEntrada;
        }

        public String getDescricaoSaida() {
            //getDescricaoSaida -> SELECT FROM Despesas WHERE descricaoDespesa = this.descricaoSaida;
            return descricaoSaida;
        }

        public void setDescricaoSaida(String descricaoSaida) {
            // INSERT INTO Despesas (descricaoDespesas)
            this.descricaoSaida = descricaoSaida;
        }
        
        //--------------------------------------//
        //Métodos especiais Plano de Contas
        // Entrada de receitas...
        public void receitas(){
            //Entrada -> INSERT INTO Receitas(valorEntrada)
            setEntrada(entrada);
            //descricaoEntrada -> INSERT INTO Receitas(descricaoReceita)
            setDescricaoEntrada(descricaoEntrada);
            //Códgio INSERT aqui, será incluído após conexao com o bd
        }
        //---------------------//
        //Entrada de despesas...
        public void despesas(){
            //Saida -> INSERT INTO Despesa(valorDespesa)
            setSaida(saida);
            //descricaoEntrada -> INSERT INTO Receitas(descricaoReceita)
            setDescricaoSaida(descricaoSaida);
            //Códgio INSERT aqui, será incluído após conexao com o bd
        }
        //-------------------//
    }
}