/* 
    14 15 16 17
    15 16 17 18
    16 17 18 19
    17 18 19 20
*/
public class Problem_N23 {
    
    public static void main(String[] args){

        int num = 13;
        for(int i = 1; i <= 4; i++){
            for(int j = 1; j <= 4; j++){
                System.out.print((num + j) + "  " );
            }
            num++;
            System.out.println(" ");
        }
    }
}
