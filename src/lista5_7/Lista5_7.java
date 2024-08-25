package lista5_7;

import java.util.Arrays;
import javax.swing.JOptionPane;

public class Lista5_7 {
    public static void main(String[] args) {
        final int TAM = 10;
        final int LIMITECIMA = 50;
        int vet[] = new int [TAM];
        int vetPar[] = new int [TAM];
        int vetImpar[] = new int [TAM];
        int contPar=-1, contImpar;
        for(int x=0; x < TAM; x++){
            vet[x] = (int) (Math.random() * (LIMITECIMA+1));
            if(vet[x] % 2 == 0){
                contPar++;
                vetPar[contPar] = vet[x];
            }
        }
        contImpar = contPar;
        int tam2 = contPar+1, tam3 = TAM - contPar-1;
        int vet2[] = new int [tam2];
        int vet3[] = new int [tam3];
        for(int x=0; x < TAM; x++){
            if(vet[x] % 2 != 0){
                vetImpar[contImpar] = vet[x];
                contImpar++;
            }
        }
        for(int x=0; x <= contPar; x++){
            vet2[x] = vetPar[x];
        }
        contImpar=0;
        for(int x=contPar; x < TAM-1; x++){
            vet3[contImpar] = vetImpar[x];
            contImpar++;
        }
        JOptionPane.showMessageDialog(null, "Vetor: " +Arrays.toString(vet)+ "\nVetor Ímpar: " +Arrays.toString(vet3)+ 
                "\nVetor par: " +Arrays.toString(vet2));
    }    
}
