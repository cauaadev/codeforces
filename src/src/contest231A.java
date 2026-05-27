import java.util.*;

public class contest231A {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int colunas = sc.nextInt();
        var linhas = 3;
git
        int[][] matriz = new int[colunas][linhas];
        if(colunas >= 1 && colunas <= 1000){
            for (int i = 0; i < colunas; i++){
                for (int j = 0; j < linhas; j++){
                    matriz[i][j] = sc.nextInt();
                }
            }
        }
        int problemSolved = 0;
        for (int i = 0; i < colunas; i++){
            Set<Integer> vistos = new HashSet<>();
            for (int j = 0; j < linhas; j++){
                if(!vistos.add(matriz[i][j]) && matriz[i][j] == 1){
                    problemSolved++;
                    break;
                }
            }
        }
        System.out.println(problemSolved);

    }
        }

