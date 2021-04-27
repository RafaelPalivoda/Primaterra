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
public class Cadastro {
    private Entidade.PessoaJuridica pessoa01;
    private Entidade.PessoaFisica pessoa02;
    
    
    public void gerarCadastro(){
        
    }
    public static void statusCadastro(){
        
    }
    public static void main(String[] args) {
        ConexaoBanco c = new ConexaoBanco("PostgreSql", "localhost", "5432", "sistema", "postgres", "@ABso1904");
    }
    
}