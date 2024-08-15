/* <h1>Estudo da Utilização de Argumentos</h1>
* O Argumento é utilizada para entrada de dados via prompt de comandos
* <p>
* <b>Note:</b> Leia atentamente a documentação desta classes
* para desfrutar dos recursos oferecidos pelo autor
*
* @author  Vagton A F
* @version 1.0
* @since   15/08/2024
*/
public class AboutMe {

    public static void main(String[] args) throws Exception {
        // Verificar se o número necessário de argumentos foi passado
        if (args.length < 4) {
            System.out.println("Por favor, forneça todos os 4 argumentos: nome, sobrenome, idade, altura.");
            return;  // Encerrar o programa se os argumentos não forem suficientes
        }
        //os argumentos começam com indice 0
        try {
            String nome = args[0];
            String sobrenome = args[1];
            int idade = Integer.valueOf(args[2]); //vamos falar sobre Wrappers
            double altura = Double.valueOf(args[3]);
            System.out.println("Ola, me chamo " + nome + " " + sobrenome);
            System.out.println("Tenho " + idade + " anos ");
            System.out.println("Minha altura é " + altura + "cm ");
        } catch (NumberFormatException e) {
            // Captura exceções de formatação incorreta dos números
            System.out.println("Erro: Idade ou altura fornecidos não estão em um formato válido.");
        } catch (Exception e) {
            // Captura qualquer outra exceção inesperada
            System.out.println("Ocorreu um erro: " + e.getMessage());
        }

    }
}
