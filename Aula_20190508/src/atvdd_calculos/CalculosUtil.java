package atvdd_calculos;

public class CalculosUtil{
    public static boolean isPar(int n){
        if (n % 2 == 0){
            return true;
        }
        return false;
    }
    
    public static long fat(int n){
        /*if (n <= 1){
            return 1;
        }*/
        return (n <= 1) ? 1 : n * fat(n-1);
    }
    
    public static boolean isPrimo(int n){
        if( n <= 1){
            return false;
        }
        for (int cont=2; cont <= Math.sqrt(n); cont++){
            if ( n % cont == 0){
                return false;
            }
        }
        return true;
    }
    
    public static int log2(int n){
        int qtdDiv = 0;
        while( n >= 2){
            n /= 2;
            qtdDiv++;
        }
        return qtdDiv;
    }
    
}