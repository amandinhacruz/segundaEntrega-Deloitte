public class CPF {


    public static void main (String[] arg){
        String cpf = "12345678910";
        cpf.length();

        if (cpf.length() == 11){
            System.out.println("CPF valido!");
        } else {
            System.out.println("CPF invalido!");
        }
    }
}
