public class Main {

    public static int x;
    public static int y;
    public static int z;
    public static void main(String[] args) {
        perfectSquares();
        perfectCubes();
        fibonacciSquence();
        primeNumbers();
        triangleNumbers();
    }
    public static void perfectSquares(){
      x=1;
      System.out.print("First 10 Square Numbers: ");
      while(x<=10){
          System.out.print(x*x+" ");
          x++;
      }
      System.out.println();
    }
    public static void perfectCubes(){
        x=1;
        System.out.print("First 10 Cube Numbers: ");
        while(x<=10){
            System.out.print(x*x*x+" ");
            x++;
        }
        System.out.println();
    }
    public static void fibonacciSquence(){
        z = 1;
        x =0;
        y=1;
        System.out.print("First 10 Fibonacci Numbers from 1: ");
        while(z<=10){
            x=x+y;
            y=x-y;
            System.out.print(x+y+" ");
            z++;
        }
        System.out.println();
    }
    public static void primeNumbers(){
        System.out.print("First 10 Prime Numbers: ");
        int n=0;
        int b=0;
        while (n <=29){
            n++;
            b = n%2;
            if (b!= 0){
            }else {
                if (n-1==1){
                    System.out.print(2+ " ");
                }else {
                    System.out.print(n - 1 + " ");
                }
            }
        }
        System.out.println(" ");
    }

    public static void triangleNumbers(){
        z=1;
        x=0;
        y=1;
        System.out.print("First 10 Triangle Numbers: ");
        while(z<=10){System.out.print(x+y+" ");
        x =x+y;
        y++;
        z++;}



    }

}
