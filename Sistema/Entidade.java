package sistema;
import java.util.Scanner;

public class Entidade{

public class PessoaJuridica {
    private String nome, razaosocial, email, bairro, logradouro, cidade, estado, pais;
    private int  cep, numero;
    private int cnpj, telefone;
    private String dtFundacao, dtCadastro;
    private int enquadFiscal, tipoContribuinte;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRazaosocial() {
        return razaosocial;
    }

    public void setRazaosocial(String razaosocial) {
        this.razaosocial = razaosocial;
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

    public int getCnpj() {
        return cnpj;
    }

    public void setCnpj(int cnpj) {
        this.cnpj = cnpj;
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

    public String getDtFundacao() {
        return dtFundacao;
    }

    public void setDtFundacao(String dtFundacao) {
        this.dtFundacao = dtFundacao;
    }

    public String getDtCadastro() {
        return dtCadastro;
    }

    public void setDtCadastro(String dtCadastro) {
        this.dtCadastro = dtCadastro;
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
String estado, String pais, String dtFundacao, int enquadFiscal, int tipoContribuinte) {
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
    public class PessoaFisica {
    private int cpf, rg;
    private String nome, cargo;

    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }
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

    public PessoaFisica(int cpf, int rg) {
        setCpf(cpf);
        setRg(rg);
    }
    public void mostraCadastroFisico(){
        System.out.println("Segue dados");
        System.out.print("O nome do comprador é " + getNome() + "Com cpf " +  getCpf() + ".");
    }
    public void geraCadastroFisico(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o nome: ");
        setNome(teclado.nextLine());
        System.out.println("Digite o Cpf: ");
        setCpf(teclado.nextInt());
    }
}
}