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
    public class PlanoDeContas extends Financeiro {
        
        private Integer codigoReceita, codigoDespesa;


        public void calcularLucro() {
            
        }

        public void totalReceita() {

        }

        public void totalDespesas() {

        }

    } // fim da classe plano de contas

    public class Receitas {

        private Integer codigo;
        private String nome;
        private Double valor, receita;
        private Date dataRecebimento;

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public Double getValor() {
            return valor;
        }

        public void setValor(Double valor) {
            this.valor = valor;
        }

        public Date getDataRecebimento() {
            return dataRecebimento;
        }

        public void setDataRecebimento(Date dataRecebimento) {
            this.dataRecebimento = dataRecebimento;
        }

        public class Antecipacao {

            private Integer codigo, lote;
            private Date dataVenda, dataAporte;
            private Float valorMetragem, metragem, valorTotal;

            public int getLote() {
                return lote;
            }

            public void setLote(Integer lote) {
                this.lote = lote;
            }

            public Date getDataVenda() {
                return dataVenda;
            }

            public void setDataVenda(Date dataVenda) {
                this.dataVenda = dataVenda;
            }

            public Float getValorMetragem() {
                return valorMetragem;
            }

            public void setValorMetragem(Float valorMetragem) {
                this.valorMetragem = valorMetragem;
            }

            public Float getMetragem() {
                return metragem;
            }

            public void setMetragem(Float metragem) {
                this.metragem = metragem;
            }

            public Date getDataAporte() {
                return dataAporte;
            }

            public void setDataAporte(Date dataAporte) {
                this.dataAporte = dataAporte;
            }

            public void calcularValorTotal() {
                valorTotal = metragem * valorMetragem;
            }

            public Antecipacao(Integer lote, Date dataVenda, 
                               Float valorMetragem, Float metragem, Date dataAporte) {
                setLote(lote);
                setDataVenda(dataVenda);
                setValorMetragem(valorMetragem);
                setMetragem(metragem);
                setDataAporte(dataAporte);
            }
        } // fim classe antecipacao

        public class Aportes {

            private String nome;
            private Integer numeroNf;
            private Float valor;
            private Date dataLancamento, dataVencimento, dataAporte;

            public String getNome() {
                return nome;
            }

            public void setNome(String nome) {
                this.nome = nome;
            }

            public Integer getNumeroNf() {
                return numeroNf;
            }

            public void setNumeroNf(Integer numeroNf) {
                this.numeroNf = numeroNf;
            }

            public Float getValor() {
                return valor;
            }

            public void setValor(Float valor) {
                this.valor = valor;
            }

            public Date getDataLancamento() {
                return dataLancamento;
            }

            public void setDataLancamento(Date dataLancamento) {
                this.dataLancamento = dataLancamento;
            }

            public Date getDataVencimento() {
                return dataVencimento;
            }

            public void setDataVencimento(Date dataVencimento) {
                this.dataVencimento = dataVencimento;
            }

            public Date getDataAporte() {
                return dataAporte;
            }

            public void setDataAporte(Date dataAporte) {
                this.dataAporte = dataAporte;
            }

            public Aportes(String nome, Integer numeroNf, Float valor, 
                           Date dataLancamento, Date dataVencimento, Date dataAporte) {
                setNome(nome);
                setNumeroNf(numeroNf);
                setValor(valor);
                setDataLancamento(dataLancamento);
                setDataVencimento(dataVencimento);
                setDataAporte(dataAporte);
            }

        } // fim da classe aportes

    } // fim da classe receitas

    public class Despesas {

        private Integer codigo;
        private String nome;
        private Float valor;
        private Date dataVencimento;

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public Float getValor() {
            return valor;
        }

        public void setValor(float valor) {
            this.valor = valor;
        }

        public Date getDataVencimento() {
            return dataVencimento;
        }

        public void setDataVencimento(Date dataVencimento) {
            this.dataVencimento = dataVencimento;
        }

        public Despesas(String nome, float valor, Date dataVencimento) {
            setNome(nome);
            setValor(valor);
            setDataVencimento(dataVencimento);
        }
    } // fim da classe despesas

    public class CentroDeCusto {

        private Integer codigo;
        private String centroDeCusto, tipoCusto;

        public String getCentroDeCusto() {
            return centroDeCusto;
        }

        public void setCentroDeCusto(String centroDeCusto) {
            this.centroDeCusto = centroDeCusto;
        }

        public String getTipoCusto() {
            return tipoCusto;
        }

        public void setTipoCusto(String tipoCusto) {
            this.tipoCusto = tipoCusto;
        }

        public CentroDeCusto() {
        }

        public CentroDeCusto(String centroDeCusto, String tipoCusto) {
            setCentroDeCusto(centroDeCusto);
            setTipoCusto(tipoCusto);
        }
    } // fim da classe centro de custo
}
