/*
* Software desenvolvido e licenciado por Ab Solucoes em Ti
* Todos os direitos reservados
* Qualquer cópia não autorizada estará sujeita a sanções cíveis e criminais
*/
package sistema;

import java.util.Date;

/*
* Autores: Rafael Palivoda & Matheus Balão
* Coordenação de: Alexsandro Barboza
*/
public class Cadastro {
   public class Entidade{
       //Atributos Entidade
        private String nome, email, bairro, logradouro, cidade, estado, pais;
        private Integer cep, numeroImovel, fixo, celular, telefone;
        private Date dtCadastro;
       //Métodos Getter e Setter...
        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getBairro() {
            return bairro;
        }

        public void setBairro(String bairro) {
            this.bairro = bairro;
        }

        public String getLogradouro() {
            return logradouro;
        }

        public void setLogradouro(String logradouro) {
            this.logradouro = logradouro;
        }

        public String getCidade() {
            return cidade;
        }

        public void setCidade(String cidade) {
            this.cidade = cidade;
        }

        public String getEstado() {
            return estado;
        }

        public void setEstado(String estado) {
            this.estado = estado;
        }

        public String getPais() {
            return pais;
        }

        public void setPais(String pais) {
            this.pais = pais;
        }

        public Integer getCep() {
            return cep;
        }

        public void setCep(Integer cep) {
            this.cep = cep;
        }

        public Integer getNumeroImovel() {
            return numeroImovel;
        }

        public void setNumeroImovel(Integer numeroImovel) {
            this.numeroImovel = numeroImovel;
        }

        public Integer getFixo() {
            return fixo;
        }

        public void setFixo(Integer fixo) {
            this.fixo = fixo;
        }

        public Integer getCelular() {
            return celular;
        }

        public void setCelular(Integer celular) {
            this.celular = celular;
        }

        public Integer getTelefone() {
            return telefone;
        }

        public void setTelefone(Integer telefone) {
            this.telefone = telefone;
        }

        public Date getDtCadastro() {
            return dtCadastro;
        }

        public void setDtCadastro(Date dtCadastro) {
            this.dtCadastro = dtCadastro;
        }
        //----------------------------------//
        public class PessoaJuridica extends Entidade{
            //Atributos Pessoa Juridica
            private String razaosocial;
            private Integer cnpj, enquadFiscal, tipoContribuinte;
            private Date dtFundacao;
            //Métodos Getter e Setter..

           public String getRazaosocial() {
               return razaosocial;
           }

           public void setRazaosocial(String razaosocial) {
               this.razaosocial = razaosocial;
           }

           public Integer getCnpj() {
               return cnpj;
           }

           public void setCnpj(Integer cnpj) {
               this.cnpj = cnpj;
           }

           public Integer getEnquadFiscal() {
               return enquadFiscal;
           }

           public void setEnquadFiscal(Integer enquadFiscal) {
               this.enquadFiscal = enquadFiscal;
           }

           public Integer getTipoContribuinte() {
               return tipoContribuinte;
           }

           public void setTipoContribuinte(Integer tipoContribuinte) {
               this.tipoContribuinte = tipoContribuinte;
           }

           public Date getDtFundacao() {
               return dtFundacao;
           }

           public void setDtFundacao(Date dtFundacao) {
               this.dtFundacao = dtFundacao;
           }
           //----------------------------------//
           //Método Construtor Pessoa Juridica
           public PessoaJuridica(String nome, String razaosocial, Integer cnpj, String email,
                              Integer telefone, Integer cep, String bairro, String logradouro,
                              Integer numeroImovel, String cidade, String estado, String pais,
                              Date dtFundacao, Integer enquadFiscal, Integer tipoContribuinte) {
            setNome(nome);
            setRazaosocial(razaosocial);
            setCnpj(cnpj);
            setEmail(email);
            setTelefone(telefone);
            setCep(cep);
            setBairro(bairro);
            setLogradouro(logradouro);
            setNumeroImovel(numeroImovel);
            setCidade(cidade);
            setEstado(estado);
            setPais(pais);
            setDtFundacao(dtFundacao);
            setEnquadFiscal(enquadFiscal);
            setTipoContribuinte(tipoContribuinte);
        }
        }
        public class PessoaFisica extends Entidade{
            //Atributos Pessoa Fisica extende  os atributos da Entidade
            private Integer cpf, rg;
            private Boolean isUsuario;
            //Métodos Getter e Setter...
           public Integer getCpf() {
               return cpf;
           }

           public void setCpf(Integer cpf) {
               this.cpf = cpf;
           }

           public Integer getRg() {
               return rg;
           }

           public void setRg(Integer rg) {
               this.rg = rg;
           }

           public Boolean getIsUsuario() {
               return isUsuario;
           }

           public void setIsUsuario(Boolean isUsuario) {
               this.isUsuario = isUsuario;
           }
            //---------------------------------//
           // Método Construtor da Pessoa Fisica
        public PessoaFisica(String nome, Integer cpf, Integer rg, String email, Integer cep,
                            String bairro, String logradouro, String cidade, String estado, 
                            String pais, Integer numeroImovel, Integer telefone) {
        
            setNome(nome);
            setCpf(cpf);
            setRg(rg);
            setEmail(email);
            setCep(cep);
            setBairro(bairro);
            setLogradouro(logradouro);
            setCidade(cidade);
            setEstado(estado);
            setPais(pais);
            setNumeroImovel(numeroImovel);
            setTelefone(telefone);
        }
      }
   }
}