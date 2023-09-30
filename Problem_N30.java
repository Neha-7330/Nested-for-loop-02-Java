/*
    F    5    D    3    B    1
    F    5    D    3    B    1
    F    5    D    3    B    1
    F    5    D    3    B    1
    F    5    D    3    B    1
    F    5    D    3    B    1
*/
public class Problem_N30 {
    public static void main(String[] args){

        for(int i = 1; i <= 6; i++){
            char ch = 'F';
            for(int j = 6; j >= 1; j--){
                if(j % 2 == 0){
                    System.out.print(ch + "    ");
                }
                else{
                    System.out.print(j + "    ");
                }
                ch--;
            }
            System.out.println("");
        }
    }
    
}
