package se1c2;

public class FourOutOfSixCoins {
    public static void main(String[] args) throws Exception {
        int count = 0;

        for(int i=1; i <= 6; i++){
            for(int j=1; j <= 6; j++){
                for(int k=1; k <= 6; k++){
                    for(int l=1; l <= 6; l++){
                    	if((i != j) && (i!= k) && (i != l) && (j != k) && (j != l) && (k != l)){
                            System.out.println(i + ", " + j + ", " + k + ", " + l);
                            count++;    
                        }
                    }
                }
            }
        }
        System.out.println(count);
    }
}

