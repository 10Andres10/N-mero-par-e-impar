package numerosParEImpar;
import javax.swing.JOptionPane;

public class numerosParEImpar {
    public static void main(String[] args) {
        int cp, ci, n, N;

        cp = 0;
        ci = 0;

        N = Integer.parseInt(JOptionPane.showInputDialog("Digite N"));

        for(int i = 1; i < N; i++){

            n = (int)(Math.random()*21);
            

            if(n % 2 == 0){
                cp ++;
            }
            else{
                ci ++;
            }
                   
        }

        System.out.println("Hay " + ci + " números impares, y hay " + cp + " números pares");
    }


}
