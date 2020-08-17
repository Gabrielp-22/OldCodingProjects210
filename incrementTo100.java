public class incrementTo100 {
    public static void main(String[] args){
        int value = 0;

        for (int i = 0; i < 10 ; i++){
            for (int j = 0; j < 10; j++){
                value++;
                if ( 0 == value % 2 ) {
                    System.out.print(value + " ");
                }
            }
            System.out.println("");
        }
    }
}
