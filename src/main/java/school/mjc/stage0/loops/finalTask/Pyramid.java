package school.mjc.stage0.loops.finalTask;

public class Pyramid {
    public void printPyramid(int cathetusLength) {
        int x2=0;
        for(int i=0; i< cathetusLength; i++){
            for(int j=1; j<=cathetusLength*2-1 ; j++){
                if(j==cathetusLength){
                    x2=j;
                    if(j<x2){
                        System.out.print("_");
                    }
                    System.out.print(1);

                }else {
                    for(int k=1; k<=i; k++){
                        if(j==cathetusLength+k || j==cathetusLength-k){
                            System.out.print((int)Math.abs(cathetusLength-j)+1);
                            x2=cathetusLength-k;
                        }
                    }

                }
                if(j<x2){
                    System.out.print(" ");
                }else{
                    if(i==0 && j<cathetusLength) {
                        System.out.print(" ");
                    }
                }



            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }
}
