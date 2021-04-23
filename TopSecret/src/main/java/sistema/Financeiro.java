/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema;

import java.util.Date;

/**
 *
 * @author Ab Soluções 01
 */
public class Financeiro {

    public class PlanoDeContas {

        private int codigoReceita;
        private int codigoDespesa;

        public float calcularLucro() {
            
        }

        public float totalReceita() {

        }

        public float totalDespesas() {

        }
    } // fim da classe Plano de Contas

    public class Receitas {

        private int codigo;
        private String nome;
        private float valor;
        private Date dataRecebimento;
        private float receita;

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

            private int codigo;
            private int lote;
            private Date dataVenda;
            private float valorMetragem;
            private float metragem;
            private Date dataAporte;

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

            public float calcularValorTotal() {
                return metragem * valorMetragem;
            }

        } // fim classe antecipacao

        public class Aportes {
            
            private String nome;
            private int numeroNf;
            private float valor;
            private Date dataLancamento;
            private Date dataVencimento;
            private Date dataAporte;

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
           
        } // fim da classe aportes

    } // fim da classe receitas

    public class Despesas {

        private int codigo;
        private String nome;
        private int valor;
        private Date dataVencimento;

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public int getValor() {
            return valor;
        }

        public void setValor(int valor) {
            this.valor = valor;
        }

        public Date getDataVencimento() {
            return dataVencimento;
        }

        public void setDataVencimento(Date dataVencimento) {
            this.dataVencimento = dataVencimento;
        }

    } // fim da classe despesas
    public class CentroDeCusto {
        private int codigo;
        private String centroDeCusto;
        private String tipoCusto;

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

    }
}
