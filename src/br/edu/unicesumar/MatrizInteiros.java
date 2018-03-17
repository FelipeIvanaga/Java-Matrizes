package br.edu.unicesumar;

import java.util.Scanner;

public class MatrizInteiros {
    private static int matriz[][];
    private static int linhas;
    private static int colunas;

    //Construtor que inicializa a matriz com determinado tamanho
    public MatrizInteiros(int linhas, int colunas){
        this.linhas = linhas;
        this.colunas = colunas;

        matriz = new int[linhas][colunas];
    }

    //Exibir conteudo da Matriz
    public static void exibirMatriz(){
        for(int i = 0; i < linhas; i++){
            for(int j = 0; j < colunas; j++){
                System.out.print(matriz[i][j] + "  ");
            }
            System.out.println("");
        }

    }

    public static void carregarMatriz(){
        Scanner scan = new Scanner(System.in);

        for(int i = 0; i < linhas; i++){
            for(int j = 0; j < colunas; j++){
                System.out.print("Digite = ");
                matriz[i][j] = scan.nextInt();
            }
        }
    }

    public static int calcularSoma(){
        int soma = 0;

        for(int i = 0; i < linhas; i++){
            for(int j = 0; j < colunas; j++){
                soma+= matriz[i][j];
            }
        }
        return soma;		
    }

    public static float calcularMedia(){
        int soma = 0;

        for(int i = 0; i < linhas; i++){
            for(int j = 0; j < colunas; j++){
                soma+= matriz[i][j];
            }
        }
        return soma/(linhas*colunas);
    }

    public static int maior(){
        int maior = matriz[0][0];
        
        for(int i = 0; i < linhas; i++){
            for(int j = 0; j <colunas; j++){
                if(maior < matriz[i][j]){
                    maior=matriz[i][j];
                }
            }
        }
        return maior;
    }

    public static int menor(){
        int menor = matriz[0][0];
        
        for(int i = 0; i < linhas; i++){
            for(int j = 0; j <colunas; j++){
                if(menor > matriz[i][j]){
                    menor=matriz[i][j];
                }
            }
        }
        return menor;
    }

    public static int qtdPares(){
        int pares=0;
        
        for(int i = 0; i < linhas; i++){
            for(int j = 0; j <colunas; j++){
                if(matriz[i][j] % 2 == 0){
                    pares++;
                }
            }
        }
        return pares;
    }

    public static int qtdImpares(){
        int impares=0;
        
        for(int i = 0; i < linhas; i++){
            for(int j = 0; j <colunas; j++){
                if(matriz[i][j] % 2 != 0){
                    impares++;
                }
            }
        }
        return impares;
    }
}
