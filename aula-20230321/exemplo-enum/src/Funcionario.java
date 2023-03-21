public class Funcionario {
    private int id;
    private String nome;
    private TipoFuncionario tipoFuncionario;

    public void setSalario(double salario) {
        this.salario = salario;
    }

    private double salario;

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

    public TipoFuncionario getTipoFuncionario() {
        return tipoFuncionario;
    }

    public void setTipoFuncionario(TipoFuncionario tipoFuncionario) {
        this.tipoFuncionario = tipoFuncionario;
    }

    public double getSalario(TipoFuncionario tipoFuncionario)  {
        if (tipoFuncionario == TipoFuncionario.diretor) {
            return salario;
        } else {
            throw new IllegalArgumentException("Voce nao possui acesso");
        }
    }
}
