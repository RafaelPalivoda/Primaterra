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
        private Integer cep, numeroImovel, fixo, celular;
        private Date dtCadastro;
       //Métodos Getter e Setter...
        public String getNome() {
            //getNome -> SELECT FROM Entidade WHERE nome = this.nome;
            return nome;
        }

        public void setNome(String nome) {
            //INSERT INTO Entidade (nome);
            this.nome = nome;
        }

        public String getEmail() {
            //getEmail -> SELECT FROM email WHERE emailPrincipal = this.email;
            return email;
        }

        public void setEmail(String email) {
            //INSERT INTO email (email);
            this.email = email;
        }

        public String getBairro() {
            //getBairro -> SELECT FROM Endereco WHERE bairro = this.bairro;
            return bairro;
        }

        public void setBairro(String bairro) {
            //INSERT INTO Endereco (bairro);
            this.bairro = bairro;
        }

        public String getLogradouro() {
            //getLogradouro -> SELECT FROM Endereco WHERE logradouro = this.logradouro;
            return logradouro;
        }

        public void setLogradouro(String logradouro) {
            //INSERT INTO Endereco (logradouro);
            this.logradouro = logradouro;
        }

        public String getCidade() {
            //getCidade -> SELECT FROM Endereco WHERE cidade = this.cidade;
            return cidade;
        }

        public void setCidade(String cidade) {
            //INSERT INTO Endereco (cidade);
            this.cidade = cidade;
        }

        public String getEstado() {
            //getEstado -> SELECT FROM Endereco WHERE estado = this.estado;
            return estado;
        }

        public void setEstado(String estado) {
            //INSERT INTO Endereco (estado);
            this.estado = estado;
        }

        public String getPais() {
            //getPais -> SELECT FROM Endereco WHERE pais = this.pais;
            return pais;
        }

        public void setPais(String pais) {
            //INSERT INTO Endereco (pais);
            this.pais = pais;
        }

        public Integer getCep() {
            //getCep -> SELECT FROM Endereco WHERE cep = this.cep;
            return cep;
        }

        public void setCep(Integer cep) {
            //INSERT INTO Endereco (cep);
            this.cep = cep;
        }

        public Integer getNumeroImovel() {
            //getNumeroImovel -> SELECT FROM Endereco WHERE numero = this.numeroImovel;
            return numeroImovel;
        }

        public void setNumeroImovel(Integer numeroImovel) {
            //INSERT INTO Endereco (numero);
            this.numeroImovel = numeroImovel;
        }

        public Integer getFixo() {
            //getFixo -> SELECT FROM Telefone WHERE fixo = this.fixo;
            return fixo;
        }

        public void setFixo(Integer fixo) {
            //INSERT INTO Telefone (fixo);
            this.fixo = fixo;
        }

        public Integer getCelular() {
            //getCelular -> SELECT FROM Telefone WHERE celular = this.celular;
            return celular;
        }

        public void setCelular(Integer celular) {
            //INSERT INTO Telefone (celular);
            this.celular = celular;
        }

        public Date getDtCadastro() {
            //getDtCadastro -> SELECT FROM Entidade WHERE dtCadastro = this.dtCadastro;
            return dtCadastro;
        }

        public void setDtCadastro(Date dtCadastro) {
            //INSERT INTO Entidade (dtCadastro);
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
               //getRazasocial -> SELECT FROM Entidade WHERE razaoSocial = this.razaosocial;
               return razaosocial;
           }

           public void setRazaosocial(String razaosocial) {
               //INSERT INTO Entidade (razaoSocial);
               this.razaosocial = razaosocial;
           }

           public Integer getCnpj() {
               //getCnpj -> SELECT FROM Entidade WHERE cnpjCpf = this.cnpj;
               return cnpj;
           }

           public void setCnpj(Integer cnpj) {
               //INSERT INTO Entidade (cpfCnpj);
               this.cnpj = cnpj;
           }

           public Integer getEnquadFiscal() {
               //getEnquadFiscal -> SELECT FROM Entidade WHERE enquadFiscal = this.enquadFiscal;
               return enquadFiscal;
           }

           public void setEnquadFiscal(Integer enquadFiscal) {
               //INSERT INTO Entidade (enquadFiscal);
               this.enquadFiscal = enquadFiscal;
           }

           public Integer getTipoContribuinte() {
               //getTipoContribuinte -> SELECT FROM Entidade WHERE tipoContribuinte = this.tipoContribuinte;
               return tipoContribuinte;
           }

           public void setTipoContribuinte(Integer tipoContribuinte) {
               //INSERT INTO Entidade (tipoContribuinte);
               this.tipoContribuinte = tipoContribuinte;
           }

           public Date getDtFundacao() {
               //getDtFundacao -> SELECT FROM Entidade WHERE dtFundacao = this.dtFundacao;
               return dtFundacao;
           }

           public void setDtFundacao(Date dtFundacao) {
               //INSERT INTO Entidade (dtFundacao);
               this.dtFundacao = dtFundacao;
           }
           //----------------------------------//
           //Método Construtor Pessoa Juridica
           public PessoaJuridica(String nome, String razaosocial, Integer cnpj, String email,
                              Integer cep, String bairro, String logradouro,
                              Integer numeroImovel, String cidade, String estado, String pais,
                              Date dtFundacao, Integer enquadFiscal, Integer tipoContribuinte) {
            setNome(nome);
            setRazaosocial(razaosocial);
            setCnpj(cnpj);
            setEmail(email);
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
               //getCpf -> SELECT FROM Entidade WHERE cpfCnpj = this.cpf;
               return cpf;
           }

           public void setCpf(Integer cpf) {
               //INSERT INTO Entidade (cpfCnpj);
               this.cpf = cpf;
           }

           public Integer getRg() {
               //getRg -> SELECT FROM Entidade WHERE rg = this.rg;
               return rg;
           }

           public void setRg(Integer rg) {
               //INSERT INTO Entidade (rg);
               this.rg = rg;
           }

           public Boolean getIsUsuario() {
               //getIsUsuario -> SELECT FROM Entidade WHERE isUsuario = this.isUsuario;
               return isUsuario;
           }

           public void setIsUsuario(Boolean isUsuario) {
               //INSERT INTO Entidade (isUsuario);
               this.isUsuario = isUsuario;
           }
            //---------------------------------//
           // Método Construtor da Pessoa Fisica
        public PessoaFisica(String nome, Integer cpf, Integer rg, String email, Integer cep,
                            String bairro, String logradouro, String cidade, String estado, 
                            String pais, Integer numeroImovel) {
        
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
        }
      }
   }
}