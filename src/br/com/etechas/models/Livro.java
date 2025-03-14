package br.com.etechas.models;

import br.com.etechas.enums.TipoCapaEnum;

public class Livro {
    //Atributos: Características do objeto do mundo real
    // + titulo: String
    // + -> Modificador de acesso (PUBLIC)
    //titulo -> nome do atributo (padrão camelCase)
    //String -> tipo do atributo
    //---------------------------------------------
    private String titulo;
    private String autor;
    private double preco;
    private Editora editora;
    public int paginas;
    public String resumo;
    public TipoCapaEnum tipoCapa;
    private String teste;

    public String getTitulo(){ //retorna um atributo privado
        return titulo;
    }
    public void setTitulo(String titulo){ //vai colocar na memoria o titulo
        this.titulo = titulo;
    }

    public TipoCapaEnum getTipoCapa() {
        return tipoCapa;
    }

    public void setTipoCapa(TipoCapaEnum tipoCapa) {
        this.tipoCapa = tipoCapa;
    }

    public String getResumo() {
        return resumo;
    }

    public void setResumo(String resumo) {
        this.resumo = resumo;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public Editora getEditora() {
        return editora;
    }

    public void setEditora(Editora editora) {
        this.editora = editora;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void exibirLivro(){

    }

    //Construtor
    public Livro(String titulo){
        this.titulo = titulo;
    }

    public Livro(String titulo, String autor, double preco,
                 Editora editora, int paginas, String resumo,
                 TipoCapaEnum tipoCapa) {
        this.titulo = titulo;
        this.autor = autor;
        this.preco = preco;
        this.editora = editora;
        this.paginas = paginas;
        this.resumo = resumo;
        this.tipoCapa = tipoCapa;
    }


    public Livro(String titulo, Editora editora) {
        this.titulo = titulo;
        this.editora = editora;
    }

    public Livro() {
    }
}
