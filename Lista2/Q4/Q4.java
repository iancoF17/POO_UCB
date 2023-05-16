import java.util.Date;

class Ator {
    private int idade;
    private String genero;

    public Ator(int idade, String genero) {
        this.idade = idade;
        this.genero = genero;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}

class Diretor {
    private int idade;
    private String genero;

    public Diretor(int idade, String genero) {
        this.idade = idade;
        this.genero = genero;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}

class Filme {
    private String titulo;
    private String genero;
    private Date dataLancamento;

    public Filme(String titulo, String genero, Date dataLancamento) {
        this.titulo = titulo;
        this.genero = genero;
        this.dataLancamento = dataLancamento;
    }
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Date getData_Lancamento() {
        return dataLancamento;
    }

    public void setData_Lancamento(Date dataLancamento) {
        this.dataLancamento = dataLancamento;
    }
}
