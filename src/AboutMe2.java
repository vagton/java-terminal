import java.util.Locale;
import java.util.Scanner;

/* <h1>Estudo da Utilização da Classe Scanner</h1>
* A Classe Scanner é utilizada para entrada de dados
* <p>
* <b>Note:</b> Leia atentamente a documentação desta classes
* para desfrutar dos recursos oferecidos pelo autor
*
* @author  Vagton A F
* @version 1.0
* @since   15/08/2024
*/
public class AboutMe2 {
    public static void main(String[] args) {
        // Criando uma instância do Scanner para capturar as entradas do usuário
        Scanner scanner = new Scanner(System.in).useLocale(Locale.forLanguageTag("pt-BR"));

        // Capturando o nome
        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        // Capturando o sobrenome
        System.out.print("Digite seu sobrenome: ");
        String sobrenome = scanner.nextLine();

        // Capturando a idade (int)
        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();

         // Capturando a altura (double)
        System.out.print("Digite sua altura em metros (ex: 175cm): ");
        double altura = scanner.nextDouble();

        // Fechando o Scanner
        scanner.close();

        // Exibindo as informações
        System.out.println("Olá, me chamo " + nome + " " + sobrenome);
        System.out.println("Tenho " + idade + " anos ");
        System.out.println("Minha altura é " + altura + " cm");
    }
    
}
