package collections;

public class Contact {
    
    private String nome = null;
    private int idade = 0;
    private Boolean aprendiz = null;
    
    public Contact(String nome, int idade, Boolean aprendiz) {
        this.nome = nome;
        this.idade = idade;
        this.aprendiz = aprendiz;
    }
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }
    
    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    public Boolean isExApprentice() {
        return aprendiz;
    }
    
    public void setAprendiz(Boolean aprendiz) {
        this.aprendiz = aprendiz;
    }
}
