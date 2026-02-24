public class secondmaxelement {
    public static void main(String[] args) {
        int[] ar = {1,5,10,9,6,10,9};
        int max = Integer.MIN_VALUE;
        int smax = Integer.MIN_VALUE;
        for(int i=0 ;i<ar.length; i++){
            if(ar[i]>max){
                max = ar[i];
            }
        }
        for(int i=0; i<ar.length; i++){
            if(ar[i]>smax && ar[i]!=max ){
                smax = ar[i];
            }
        }
        System.out.println("Maxmium value : "+max);
        System.out.println("Minium value : "+smax);
    }
}
