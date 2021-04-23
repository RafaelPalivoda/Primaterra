/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.financeiro;

/**
 *
 * @author Ab Soluções 01
 */
public class Projetos {

    public class TipoProjetos {

        private int codigo;
        private String nome;

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public void gerarTipo() {

        }
    }

    public class tipoNegociacao {

        private int codigo;
        private String nome;

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public void gerarNegociacao() {

        }

    }
}
