import br.com.etechas.enums.TipoCapaEnum;
import br.com.etechas.models.Editora;
import br.com.etechas.models.Livro;


import java.util.Scanner;

public class TesteLivro {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Scanner leitorNum = new Scanner(System.in);

        Editora editora = new Editora();
    /*    System.out.println("Nome da editora: ");
        editora.nome = leitor.nextLine();
        System.out.println("Site: ");
        editora.site = leitor.nextLine();
        System.out.println("Telefone: ");
        editora.telefone = leitor.nextLine();
        editora.exibirEditora();*/

        Editora editoraRocco = new Editora();
        editoraRocco.nome = "Rocco";
        editoraRocco.site = "rocco.com.br";
        editoraRocco.telefone = "98565869";

        //Construir um objeto -> Instanciar
        //Criar um objeto na memória
        //Tipo nomeObjeto = new br.com.etechas.models.Livro();
        System.out.println("Digite o nome do livro");
        String nome = leitor.nextLine();
        Livro meuLivro = new Livro(nome);
         //meuLivro.titulo = "Romeu e Julieta";

        System.out.println("Digite o autor: ");
        meuLivro.setAutor(leitor.nextLine());
        System.out.println("br.com.etechas.models.Editora: ");
        meuLivro.setEditora("editoraRocco");
        System.out.println("Preço: ");
        meuLivro.setPreco(leitorNum.nextDouble());
        System.out.println("Resumo:");
        meuLivro.resumo = leitor.nextLine();
        System.out.println("Páginas: ");
        meuLivro.paginas = leitorNum.nextInt();
        System.out.println("Tipo de capa: " +
                "\n1 - Capa comum\n2 - Capa Dura\n3 - Capa Personalizada");
        int capa = leitor.nextInt();
        switch (capa){
            case 1 -> meuLivro.tipoCapa = TipoCapaEnum.COMUM;
            case 2 -> meuLivro.tipoCapa = TipoCapaEnum.DURA;
            case 3 -> meuLivro.tipoCapa = TipoCapaEnum.PERSONALIZADA;
        }
        System.out.println(meuLivro.getTitulo()
                + " escrito por "+ meuLivro.getAutor()
                + " custa " + meuLivro.getPreco() +
                " publicado pela editora " + meuLivro.getEditora());


        Livro livroDaFatima = new Livro("Harry Potter");
        livroDaFatima.setTitulo("Harry Potter");
        livroDaFatima.setAutor("J.K.");
        livroDaFatima.setEditora("editoraRocco");
        livroDaFatima.paginas = 208;
        livroDaFatima.resumo= "É um bruxo...";
        livroDaFatima.tipoCapa = TipoCapaEnum.COMUM;
        livroDaFatima.setPreco(35.99);
        System.out.println(livroDaFatima.getTitulo()
                + " escrito por "+ livroDaFatima.getAutor()
                + " custa " + livroDaFatima.getPreco() +
                " publicado pela editora " + livroDaFatima.getEditora());

        //Tipo   nomeObjeto Cria



        //titulo = "Romeu e Julieta";
    }
}
