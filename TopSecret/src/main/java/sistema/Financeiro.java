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
    public class PlanoDeContas {

        private int codigoReceita, codigoDespesa;


        public void calcularLucro() {
            
        }

        public void totalReceita() {

        }

        public void totalDespesas() {

        }

    } // fim da classe plano de contas

    public class Receitas {

        private int codigo;
        private String nome;
        private float valor, receita;
        private Date dataRecebimento;

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public float getValor() {
            return valor;
        }

        public void setValor(float valor) {
            this.valor = valor;
        }

        public Date getDataRecebimento() {
            return dataRecebimento;
        }

        public void setDataRecebimento(Date dataRecebimento) {
            this.dataRecebimento = dataRecebimento;
        }

        public class Antecipacao {

            private int codigo, lote;
            private Date dataVenda, dataAporte;
            private float valorMetragem, metragem, valorTotal;

            public int getLote() {
                return lote;
            }

            public void setLote(int lote) {
                this.lote = lote;
            }

            public Date getDataVenda() {
                return dataVenda;
            }

            public void setDataVenda(Date dataVenda) {
                this.dataVenda = dataVenda;
            }

            public float getValorMetragem() {
                return valorMetragem;
            }

            public void setValorMetragem(float valorMetragem) {
                this.valorMetragem = valorMetragem;
            }

            public float getMetragem() {
                return metragem;
            }

            public void setMetragem(float metragem) {
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

            public Antecipacao(int lote, Date dataVenda, float valorMetragem, float metragem, Date dataAporte) {
                setLote(lote);
                setDataVenda(dataVenda);
                setValorMetragem(valorMetragem);
                setMetragem(metragem);
                setDataAporte(dataAporte);
            }
        } // fim classe antecipacao

        public class Aportes {

            private String nome;
            private int numeroNf;
            private float valor;
            private Date dataLancamento, dataVencimento, dataAporte;

            public String getNome() {
                return nome;
            }

            public void setNome(String nome) {
                this.nome = nome;
            }

            public int getNumeroNf() {
                return numeroNf;
            }

            public void setNumeroNf(int numeroNf) {
                this.numeroNf = numeroNf;
            }

            public float getValor() {
                return valor;
            }

            public void setValor(float valor) {
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

            public Aportes(String nome, int numeroNf, float valor, Date dataLancamento, Date dataVencimento, Date dataAporte) {
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

        private int codigo;
        private String nome;
        private float valor;
        private Date dataVencimento;

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public float getValor() {
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

        private int codigo;
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
