package desafiosCodigo;

import java.util.Scanner;
import java.util.Locale;
public class CalculadoraVelocidadeDownload {
        public static void main(String[] args) {



            Locale.setDefault(Locale.US);

            Scanner scanner = new Scanner(System.in);



            // Solicitar a entrada do usuário para a distância física e a velocidade do plano de internet

            double distanciaServidores = scanner.nextDouble();

            double velocidadePlano = scanner.nextDouble();

            //TODO: Calcule a velocidade de download estimada

            double velocidadeDownloadEstimada = calcularVelocidadeDownload(distanciaServidores, velocidadePlano);



            // Apresentar o resultado

            System.out.println("\nVelocidade de Download Estimada: " + String.format("%.2f", velocidadeDownloadEstimada) + " Mbps");

            scanner.close();

        }

        public static double calcularVelocidadeDownload(double distanciaServidores, double velocidadePlano) {

            // TODO: Crie a fórmula de cálculo para a velocidade de download estimada

            return velocidadePlano / (1 + (distanciaServidores / 100));



        }

    }

