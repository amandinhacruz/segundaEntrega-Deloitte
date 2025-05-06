//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa( "Ana", 10);

        Pessoa pessoa2 = new Pessoa("Luiz", 19);

        String maioridade = pessoa.maioridade(pessoa.getIdade());
        System.out.println(pessoa.getNome() + " é " + maioridade );
        maioridade = pessoa2.maioridade(pessoa2.getIdade());
        System.out.println(pessoa2.getNome() + " é " + maioridade );


        if(pessoa.getIdade() > pessoa2.getIdade()) {
            System.out.println(pessoa.getNome() + " tem mais idade!");
        } else if (pessoa.getIdade() == pessoa2.getIdade()) {
            System.out.println( pessoa.getNome() + " e " + pessoa2.getNome() + " Tem a mesma idade!");
        } else {
            System.out.println(pessoa2.getNome() + " tem mais idade!");
        }

    }
}