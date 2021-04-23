/*
* Software desenvolvido e licenciado por Ab Solucoes em Ti
* Todos os direitos reservados
* Qualquer cópia não autorizada estará sujeita a sanções cíveis e criminais
*/
package sistema;
import sistema.Entidade.PessoaJuridica;
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
        Entidade e = new Entidade();
        PessoaJuridica pessoa01 = e.new PessoaJuridica("Teste", "Teste", 36805734, "teste", 58965874, 569486, "Pilarzinho","Rua Tal", 26574, "Curitiba", "PR", "Brasil", "30 de Março de 2020", 0,0);
        System.out.print(pessoa01.getNome());
    }
}