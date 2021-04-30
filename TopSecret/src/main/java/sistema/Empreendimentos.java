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
public class Empreendimentos {

    public class TipoProjetos {
        //Atributos Tipo Projetos
        private String tipoProjeto;

        public String getTipoProjeto() {
            //SELECT FROM TipoProjeto WHERE tipoProjeto = this.nome;
            return tipoProjeto;
        }

        public void setTipoProjeto(String tipoProjeto) {
            //INSERT INTO TipoProjeto (tipoProjeto);
            this.tipoProjeto = tipoProjeto;
        }
    }
    public class Etapas{
        //Atributos Etapas
        private String etapa;
        //Métodos Getter e Setter
        public String getEtapa() {
            //SELECT FROM Etapa WHERE nomeEtapa = this.etapa
            return etapa;
        }
        public void setEtapa(String etapa) {
            //INSERT INTO Etapa (nomeEtapa);
            this.etapa = etapa;
        }
    }
    
}