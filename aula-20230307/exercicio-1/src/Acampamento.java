public class Acampamento {
    private String nome;
    private char equipe;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public char getEquipe() {
        return equipe;
    }

    public void setEquipe(char equipe) {
        this.equipe = equipe;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    private int idade;

    public void imprimir() {
        System.out.println("nome = " + nome);
        System.out.println("equipe = " + equipe);
        System.out.println("idade = " + idade);
    }

    public void separarGrupo() {
        if (idade >= 6 && idade <= 10) {
            equipe = 'A';
        } else if (idade >= 11 && idade <= 20) {
            equipe = 'B';
        } else {
            equipe = 'C';
        }
    }
}
