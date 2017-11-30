public class Main {
    public static void main(String[] args)
    {
        recursivePrinter(3);
        reversePrint("Alphabet");
        System.out.println();
        System.out.println(factorial(8));
    }

    public static void recursivePrinter (int levels){

        if (levels == 0){
            return;
        }
        {
            System.out.println("Going down! " + levels);
            recursivePrinter(levels -1);
            System.out.println("Coming back up! " + levels);
        }


    }
    public static void reversePrint(String str){

        if (str.length() != 0 ){
            System.out.print(str.charAt(str.length() - 1));
            reversePrint(str.substring(0, str.length() -1));
        }

    }
    public static int factorial(int num){
        if (num <= 1)
            return 1;
        else
            return num * factorial(num-1);
    }
}
