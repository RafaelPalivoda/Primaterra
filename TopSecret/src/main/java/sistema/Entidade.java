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
    private String nome, email, bairro, logradouro, cidade, estado, pais;
    private int  cep, numero, telefone;
    private Date  dtCadastro;
    
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
    public int getTelefone() {
        return telefone;
    }
    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }
    public int getCep() {
        return cep;
    }

    public void setCep(int cep) {
        this.cep = cep;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    public Date getDtCadastro() {
        return dtCadastro;
    }

    public void setDtCadastro(Date dtCadastro) {
        this.dtCadastro = dtCadastro;
    }

    public Entidade(String nome, String email, String bairro, String logradouro, String cidade, String estado, String pais, int cep, int numero, int telefone) {
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
    private String razaosocial;
    private int cnpj, enquadFiscal, tipoContribuinte;
    private Date dtFundacao;

    public String getRazaosocial() {
        return razaosocial;
    }

    public void setRazaosocial(String razaosocial) {
        this.razaosocial = razaosocial;
    }

    public int getCnpj() {
        return cnpj;
    }

    public void setCnpj(int cnpj) {
        this.cnpj = cnpj;
    }
    
    public Date getDtFundacao() {
        return dtFundacao;
    }

    public void setDtFundacao(Date dtFundacao) {
        this.dtFundacao = dtFundacao;
    }
    
    public int getEnquadFiscal() {
        return enquadFiscal;
    }

    public void setEnquadFiscal(int enquadFiscal) {
        this.enquadFiscal = enquadFiscal;
    }
    public int getTipoContribuinte() {
        return tipoContribuinte;
    }

    public void setTipoContribuinte(int tipoContribuinte) {
        this.tipoContribuinte = tipoContribuinte;
    }

        public PessoaJuridica(String nome, String razaosocial, int cnpj, String email,  int telefone, int cep, String bairro, String logradouro, int numero, String cidade,
String estado, String pais, Date dtFundacao, int enquadFiscal, int tipoContribuinte) {
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
    private int cpf, rg;
    private String cargo;

    
    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public int getRg() {
        return rg;
    }

    public void setRg(int rg) {
        this.rg = rg;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public PessoaFisica(String nome, int cpf, int rg, String email, int cep, String bairro, String logradouro,
                        String cidade, String estado, String pais, int numero, int telefone, String cargo) {
        
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
        setCargo(cargo);
    }
    
    public void inserirCadastroFisico(){
        
    }
}
}