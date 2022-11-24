package model;

public class RelatorioEmprestimo {

    private int id;
    private String livro;
    private String data_emprestimo;
    private boolean devolvido;

    public RelatorioEmprestimo(int id, String livro, String data_emprestimo, boolean devolvido) {
        this.id = id;
        this.livro = livro;
        this.data_emprestimo = data_emprestimo;
        this.devolvido = devolvido;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLivro() {
        return livro;
    }

    public void setLivro(String livro) {
        this.livro = livro;
    }

    public String getData_emprestimo() {
        return data_emprestimo;
    }

    public void setData_emprestimo(String data_emprestimo) {
        this.data_emprestimo = data_emprestimo;
    }

    public boolean isDevolvido() {
        return devolvido;
    }

    public void setDevolvido(boolean devolvido) {
        this.devolvido = devolvido;
    }

}
