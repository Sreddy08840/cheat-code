public class nested3 {
    public static void main(String[] args){
        int i=0;
        while(i<3){ 
            int j=0;
            while(j<5){
                System.out.println("i"+i+"+j"+j+" ");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
