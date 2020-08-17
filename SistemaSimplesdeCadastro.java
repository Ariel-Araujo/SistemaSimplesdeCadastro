import java.util.Scanner;

public class SistemaSimplesdeCadastro {

    public static void main(String[] args) {

        Scanner entradas = new Scanner(System.in);
        String senha = "null";

        System.out.println("FAZENDO CADASTRO");

        // PEDINDO O NOME
        System.out.println("DIGITE SEU NOME:");
        String nome = entradas.nextLine();

        //SOBRENOME
        StringBuilder sobrenome = new StringBuilder("_");

         for (int i = nome.lastIndexOf(" ")+1; i <= nome.length(); i++){
           if (i < nome.length()) {
                 sobrenome.append(nome.charAt(i));
            }
        }

         // VERIFICANDO Á SENHA SE ESTÁ NO PADRÃO
        boolean verificarsenha= false;

        while (verificarsenha == false){

            System.out.println("DIGITE UMA SENHA:");
            senha = entradas.nextLine();

            if (senha.length() >= 8 && senha.matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[-, !, @])(?=.*[A-Z])(?=.*\\d).+")){
                System.out.println("SENHA VALIDA!!");
                verificarsenha= true;
            } else{
                System.out.println("SENHA INVÁLIDA");
            }
        }

        // PRIMEIRA LETRA E O SOBRENOME
        String login = nome.charAt(0)+sobrenome.toString();


        System.out.println("SEU LOGIN É: " + login);


        System.out.println("ACESSANDO");

        // VERIFICANDO..
        boolean Slogin = false;

        while (Slogin == false){

            System.out.println("DIGITE SEU LOGIN:");
            String log = entradas.nextLine();

            System.out.println("DIGITE SUA SENHA:");
            String Sen = entradas.nextLine();

            if (log.equals(login) && Sen.equals(senha)){
                System.out.println("LOGIN REALIZADO COM SUCESSO");
                Slogin = true;
            }else{
                System.out.println("LOGIN OU SENHA INCORRETA");
            }

        }

    }
}