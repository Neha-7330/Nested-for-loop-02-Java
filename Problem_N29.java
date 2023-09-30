/* 
    1C3    4B2    9A1
    16C3   25B2   36A1
    49C3   64B2   81A1
*/
public class Problem_N29 {
    public static void main(String[] args){

        int num = 1;
        for(int i = 1; i <= 3; i++){
            char ch = 'C';
            for(int j = 3; j >= 1; j--){
                if(num <= 3){
                    System.out.print((num * num) + "" + ch + "" + j + "    ");
                }
                else{
                    System.out.print((num * num) + "" + ch + "" + j + "   "); 
                }
                num++;
                ch--;
            }
            System.out.println("");
        }

    }
    
}
