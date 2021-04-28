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

public class Entidade{
    //Atributos Entidade, esses atributos se extendem para pessoa Fisica e Juridica
    private String nome, email, bairro, logradouro, cidade, estado, pais;
    private Integer  cep, numeroImovel, fixo, celular, telefone;
    private Date  dtCadastro;
    // Getter e Setters do nome (Podendo ser nome fantasia ou nome de pessoa fisica)
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    // Métodos getter e setter do e-mail principal
        public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    //Métodos Getter e Setter do Bairro (informação trazida da API do correio)
    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
        //Métodos Getter e Setter do Logradouro (informação trazida da API do correio)
    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }
    //Métodos Getter e Setter da Cidade (informação trazida da API do correio)
    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    //Métodos Getter e Setter do Estado (informação trazida da API do correio)
    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    //Métodos Getter e Setter do País (informação trazida da API do correio)
    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
    //Métodos Getter e Setter do Telefone (opcional)
    public Integer getTelefone() {
        return telefone;
    }
    public void setTelefone(Integer telefone) {
        this.telefone = telefone;
    }
    //Métodos Getter e Setter do telefone Fixo
    public Integer getFixo(){
        return fixo;
    }
    public void setFixo(Integer fixo){
        this.fixo = fixo;
    }
    //Métodos Getter e Setter do telefone celular
    public Integer getCelular(){
        return celular;
    }
    public void setCelular(Integer celular){
        this.celular = celular;
    }
    //Métodos Getter e Setter do Cep, essa informação será enviada para a API dos correios para consultas
    public Integer getCep() {
        return cep;
    }

    public void setCep(Integer cep) {
        this.cep = cep;
    }
        //Métodos Getter e Setter do número do imóvel
    public Integer getNumeroImovel() {
        return numeroImovel;
    }

    public void setNumero(Integer numeroImovel) {
        this.numeroImovel = numeroImovel;
    }
        //Métodos Getter e Setter da Data do cadastro da entidade no sistema
    public Date getDtCadastro() {
        return dtCadastro;
    }

    public void setDtCadastro(Date dtCadastro) {
        this.dtCadastro = dtCadastro;
    }
 //Metodo construtor da Entidade
    public Entidade(String nome, String email, String bairro, String logradouro, 
                    String cidade, String estado, String pais, Integer cep,
                    Integer numero, Integer telefone) {
        setNome(nome);
        setEmail(email);
        setBairro(bairro);
        setLogradouro(logradouro);
        setCidade(cidade);
        setEstado(estado);
        setPais(pais);
        setCep(cep);
        setNumero(numero);
        setTelefone(telefone);
    }

public class PessoaJuridica extends Entidade {
    //Atributos Pessoa Juridica
    private String razaosocial;
    private Integer cnpj, enquadFiscal, tipoContribuinte;
    private Date dtFundacao;
    // Métodos Getter e Setter da Razao Social do cliente (valor será trazido da Receita federal)
    public String getRazaosocial() {
        return razaosocial;
    }

    public void setRazaosocial(String razaosocial) {
        this.razaosocial = razaosocial;
    }
    // Métodos Getter e Setter do CNPJ da empresa (Valor será utilizado na API da receita federal)
    public Integer getCnpj() {
        return cnpj;
    }
    public void setCnpj(Integer cnpj) {
        this.cnpj = cnpj;
    }
    // Métodos Getter e Setter da Data de Fundação da empresa (valor será trazido da Receita federal)
    public Date getDtFundacao() {
        return dtFundacao;
    }

    public void setDtFundacao(Date dtFundacao) {
        this.dtFundacao = dtFundacao;
    }
    // Métodos Getter e Setter do Enquadramento Fiscal da empresa (valor será trazido da Receita federal)
    public Integer getEnquadFiscal() {
        return enquadFiscal;
    }

    public void setEnquadFiscal(Integer enquadFiscal) {
        this.enquadFiscal = enquadFiscal;
    }
    // Métodos Getter e Setter do tipo de contribuinte.
    //valores predefinidos serão cadastrados e selecionados pelo usuário
    public Integer getTipoContribuinte() {
        return tipoContribuinte;
    }

    public void setTipoContribuinte(Integer tipoContribuinte) {
        this.tipoContribuinte = tipoContribuinte;
    }
    // Método construtor da Pessoa Juridica
        public PessoaJuridica(String nome, String razaosocial, Integer cnpj, String email,
                              Integer telefone, Integer cep, String bairro, String logradouro,
                              Integer numero, String cidade, String estado, String pais,
                              Date dtFundacao, Integer enquadFiscal, Integer tipoContribuinte) {
            setNome(nome);
            setRazaosocial(razaosocial);
            setCnpj(cnpj);
            setEmail(email);
            setTelefone(telefone);
            setCep(cep);
            setBairro(bairro);
            setLogradouro(logradouro);
            setNumero(numero);
            setCidade(cidade);
            setEstado(estado);
            setPais(pais);
            setDtFundacao(dtFundacao);
            setEnquadFiscal(enquadFiscal);
            setTipoContribuinte(tipoContribuinte);
        }
        
        
}
    public class PessoaFisica extends Entidade {
        //Atributos Pessoa Fisica extende  os atributos da Entidade
        private Integer cpf, rg;
        private Boolean isUsuario;
        //Métodos Getter e Setter do Cpf
        public Integer getCpf() {
            return cpf;
        }

        public void setCpf(Integer cpf) {
            this.cpf = cpf;
        }
        //Métodos Getter e Setter do RG
        public Integer getRg() {
            return rg;
        }

        public void setRg(Integer rg) {
            this.rg = rg;
        }
        //Métodos Getter e Setter definindo se a pessoa fisica é usuário
        public Boolean getIsUsuario(){
            return isUsuario;
        }
        public void setIsUsuario(Boolean isUsuario){
            this.isUsuario = isUsuario;
        }
        // Método Construtor da Pessoa Fisica
        public PessoaFisica(String nome, Integer cpf, Integer rg, String email, Integer cep,
                            String bairro, String logradouro, String cidade, String estado, 
                            String pais, Integer numero, Integer telefone) {
        
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
            setNumero(numero);
            setTelefone(telefone);
            
            
        }
        public class Usuario extends PessoaFisica{
            //Atributos Usuario
            String cargo;
            // Caso a Entidade seja também um usuário precisará ter um cargo cadastrado
            public String getCargo() {
                return cargo;
            }

            public void setCargo(String cargo) {
                this.cargo = cargo;
            }
            //Método para construção do usuário
            public Usuario(String nome, Integer cpf, String email, String cargo){
                setNome(nome);
                setCpf(cpf);
                setEmail(email);
                setCargo(cargo);
            }
        }
    }
}