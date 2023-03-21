public class Main {
    public static void main(String[] args) {
        Funcionario func1    = new Funcionario();
        func1.setId(1);
        func1.setSalario(2500);
        func1.setTipoFuncionario(TipoFuncionario.secretaria);
        func1.setNome("Mari");

        Funcionario func2 = new Funcionario();
        func2.setId(1000);
        func2.setSalario(10000);
        func2.setTipoFuncionario(TipoFuncionario.diretor);
        func2.setNome("Jhonny");

        System.out.println(func1.getSalario(func1.getTipoFuncionario()));
        System.out.println(func2.getSalario(func1.getTipoFuncionario()));
    }
}