package desafiosCodigo;

import java.util.Scanner;
import java.util.regex.Pattern;

public class ValidandoForcaSenhaIAM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String senha = sc.nextLine();
        String resultado = verificaSenha(senha);
        System.out.println(resultado);

        sc.close();
    }

    public static String verificaSenha(String senha) {
        boolean temLetraMaiuscula = Pattern.compile("[A-Z]").matcher(senha).find();
        boolean temLetraMinuscula = Pattern.compile("[a-z]").matcher(senha).find();
        boolean temNumero = Pattern.compile("\\d").matcher(senha).find();
        boolean temCaractereEspecial = Pattern.compile("\\W").matcher(senha).find();
        //boolean temSequenciaComum = senha.matches(".*(?i)123456.*|.*(?i)abcdef.*");
        //boolean temPalavraComum = senha.equalsIgnoreCase("password") || senha.equalsIgnoreCase("123456") ||
        senha.equalsIgnoreCase("qwerty");

        if (senha.length() < 8) {
            return "Sua senha e muito curta. Recomenda-se no minimo 8 caracteres.";
        }

        else if ((temLetraMaiuscula || temLetraMinuscula) && temNumero && temCaractereEspecial) {
            return "Sua senha atende aos requisitos de seguranca. Parabens!";
        }
        else {
            return "Sua senha nao atende aos requisitos de seguranca.";
        }
    }
}
