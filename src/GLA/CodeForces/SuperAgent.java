package GLA.CodeForces;



import java.util.Scanner;
public class SuperAgent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[][] mat = new char[3][3];
        for(int i=0;i<3;i++){
            String input = sc.nextLine();
            for(int j=0;j<3;j++){
                mat[i][j] = input.charAt(j);
            }
        }
        if(mat[0][0] ==mat[2][2] && mat[0][2] == mat[2][0] && mat[0][1]==mat[2][1] && mat[1][0] == mat[1][2])
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
