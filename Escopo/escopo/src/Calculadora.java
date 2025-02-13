public class Calculadora {

        public int somar(int numeroUm, int numeroDois){
            return numeroUm + numeroDois;
        }

        public int somaMultiplica (int n, int x, String m){
            int r = 0;
            if(m == "M"){
                r = n * x;
            }else{
                r = n + x;
            }return r ;
        }
    }
    

