package br.senai.sp.jandira.Model;
import java.util.Scanner;
public class Mamiferos extends Animais{

    Scanner scanner= new Scanner(System.in);
    public void cadastrarJogador(){
        System.out.println("------------- Cadastrar Jogador ----------------");
        System.out.println("-> Informe o nome do animal: ");
        super.nome = scanner.nextLine();
        System.out.println("-> Informe a espécie: ");
        super.especie = scanner.nextString();
        System.out.println("-> Informe a dieta: ");
        super.dieta = scanner.nextString();
        System.out.println("-> Informe o sexo: ");
        super.idade = scanner.nextInt();
        System.out.println("-> Informe o peso: ");
        numeroCamisa = scanner.nextInt();
        scanner.nextLine();
        System.out.println("-> Informe a posição: ");
        posicao= scanner.nextLine();
}
