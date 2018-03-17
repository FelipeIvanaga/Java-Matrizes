package br.edu.unicesumar;
import br.edu.unicesumar.MatrizInteiros;
public class MatrizInteirosApp {
    
    public static void main(String[] args){
        
        //Instanciar MatrizInteiros
        MatrizInteiros matriz = new MatrizInteiros(3,3);
        
        
        //Chamar metodo carregarMatriz
        MatrizInteiros.carregarMatriz();
        
        //Chamar o metodo calcularSoma
        System.out.println("Soma: " + MatrizInteiros.calcularSoma());
        
        //Chamar....
        System.out.println("Media: " + MatrizInteiros.calcularMedia());
        
        System.out.println("Maior: " + MatrizInteiros.maior());
        
        System.out.println("Menor: " + MatrizInteiros.menor());
        
        System.out.println("Pares: " + MatrizInteiros.qtdPares());
        
        System.out.println("Impares: " + MatrizInteiros.qtdImpares());
        //Chamar metodo exibirMatriz
        System.out.println("----------Matriz----------");
        MatrizInteiros.exibirMatriz();
    }

}
