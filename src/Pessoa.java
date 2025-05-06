public class Pessoa {
    private String nome;
    private int idade;

    Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    public static String maioridade(int idade){
        if (idade >= 18) {
            return "maior de idade!";
        } else {
             return "menor de idade!";
        }

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

    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa( "Ana", 10);

        Pessoa pessoa2 = new Pessoa("Luiz", 19);

        String maioridade = pessoa.maioridade(pessoa.getIdade());
        System.out.println(pessoa.getNome() + " é " + maioridade );
        maioridade = pessoa2.maioridade(pessoa2.getIdade());
        System.out.println(pessoa2.getNome() + " é " + maioridade );

        pessoa.setNome("Janaina");
        System.out.println(pessoa.getNome());

        if(pessoa.getIdade() > pessoa2.getIdade()) {
            System.out.println(pessoa.getNome() + " tem mais idade!");
        } else if (pessoa.getIdade() == pessoa2.getIdade()) {
            System.out.println( pessoa.getNome() + " e " + pessoa2.getNome() + " Tem a mesma idade!");
        } else {
            System.out.println(pessoa2.getNome() + " tem mais idade!");
        }


    }
}
