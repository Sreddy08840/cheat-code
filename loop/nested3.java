public class nested3 {
    public static void main(String[] args){
        for(int x=0;x<5;x++){
           
        int i=0;
        do{ 
            int j=0;
            while(j<5){
                System.out.println("i"+i+"+j"+j+" ");
                j++;
            }
            System.out.println();
            i++;
        }while(i<3);
    }
    }
}
