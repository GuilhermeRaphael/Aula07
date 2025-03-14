import br.com.etechas.models.Editora;

import java.util.Scanner;

public class TesteEditora {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        //Tipo   nomeObjeto Cria
        Editora editora = new Editora();
        System.out.println("Nome da editora: ");
        editora.nome = leitor.nextLine();
        System.out.println("Site: ");
        editora.site = leitor.nextLine();
        System.out.println("Telefone: ");
        editora.telefone = leitor.nextLine();
        editora.exibirEditora();
        System.out.println("--------------------------");
        System.out.println("Método com retorno");
        System.out.println("--------------------------");
        System.out.println(editora.exibirEditoraComRetorno());



       /* br.com.etechas.models.Editora ed2 = new br.com.etechas.models.Editora();
        ed2.nome = "Erika";
        editora.nome = "Rocco";
        br.com.etechas.models.Editora ed3 = ed2;
        System.out.println("br.com.etechas.models.Editora: "  + editora.nome
                + "br.com.etechas.models.Editora 2: " + ed2.nome +
                "br.com.etechas.models.Editora 3: " + ed3.nome);*/
    }
}
