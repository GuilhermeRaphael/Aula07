package br.com.etechas.models;

public class Editora {
    //+ nomeAtributo: tipo
    public String nome;
    public String telefone;
    public String site;

    //+ exibirEditora(): void
    public void exibirEditora(){
        System.out.println("br.com.etechas.models.Editora");
        System.out.println("----------------");
        System.out.println("Nome: " + nome);
        System.out.println("Telefone: " + telefone);
        System.out.println("Site: " + site);
    }
    public String exibirEditoraComRetorno(){
        String mensagem = "br.com.etechas.models.Editora" +
                "\n---------------------" +
                "\nNome: " + nome +
                "\nSite: " + site +
                "\nTelefone: " + telefone;
        return mensagem;
    }
}
