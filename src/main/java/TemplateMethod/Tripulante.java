package TemplateMethod;

public abstract class Tripulante {

    public int id;
    public String nome;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public abstract String verificaFuncao();
    

    public String getInfo() {
        return "{" + "id = " + this.id
                + ", nome = " + this.nome 
                + ", funcao = " + this.verificaFuncao()
                + '}';
    }
}
