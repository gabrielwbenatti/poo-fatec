public class Produto {
    private int codigo;
    private String descricao;

    //Método construtor
    public Produto() {
        System.out.println("Construtor padrao");
    }
    
    //overload
    public Produto(int codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void imprimir() {
        System.out.println("codigo = " + codigo);
        System.out.println("descricao = " + descricao);
    }
}
