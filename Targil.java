//1 A method is a block of code which only runs when it is called. You can pass data, known as parameters, into a method. Methods are used to perform certain actions, and they are also known as functions.
//  Why use methods? To reuse code: define the code once, and use it many times.
//2  public static void main(String[] args)
//3
    private static void greet() {
        System.out.println(" Good morning!");
    }
 //4
    private static void printNum(int num) {
        System.out.println(num);
    }
    
//5    
        for( int i= 1; i<=10; i++)
          printNum(i);
//6
        int k = 5;
         changeNumber(k);
          
    private static void changeNumber(int x) {
        x = x + 1;
        System.out.println(x);
    }
  //7
    private static void multiply(int num1, int num2) {
        System.out.println(String.format("num1 * num2 = %d", num1 * num2));
    }

 //8
    private static void calc(int x, int y, char a) {
        if (a == '-')
            System.out.println(String.format(" x- y = %d", x - y));
        else if (a == '+')
            System.out.println(String.format(" x+y = %d", x + y));
    }

  //9
    private static int overageTree(int num1, int num2, int num3) {
        int ovr = (num1 + num2 + num3) / 3;
        System.out.println(ovr);
        return ovr;
    }

  //10
    private static boolean compareNum(int[] arr, int a) {
        for (int i = 0; i <= arr.length; i++) {
            if (arr[i] == a) {
                return true;
            } else
                return false;
        }
        return false;
    }

 //11
    private static void divisors(int d) {
        int a = 2;
        while (a < d) {
            if (d % a == 0) {
                if (a != d)
                    System.out.print(a + " ");
                else
                    System.out.print(a);
            }
            a++;
            if (a == d)
                System.out.println(d / a);
        }
    }

 //12
    private static void hello() {
        System.out.print("Hello ");
        word();
    }
      private static void word() {
        System.out.println("word");
    }
//13 method overloading, multiple methods can have the same name with different parameters.
//14
    private static void numberType(int x) {
        System.out.println("int");
    }

    private static void numberType(double x) {
        System.out.println("double");
    }

    private static void numberType(float x) {
        System.out.println("float");
    }

 //15
    private static Scanner getScanner() {
        Scanner s = new Scanner(System.in);
        return s;
    }

 //16
    private static int randomize(int[] arr) {
        int a = 0;
        for (int i = 0; i < arr.length; i++) {
            a = arr[i];
        }
        return a;
    }

 //17
    private static void wordAdd(String word) {
        System.out.print(word + "@@@");
        stars();
        ad3();
    }

    private static void stars() {
        System.out.print("**");
    }

    private static void ad3() {
        System.out.println("#");
    }
    
  //18  Variable x declared inside the function (i.e. local variables )and x declared inside main have no linkage,
  //because for computer there are 2 different blocks ( main and scope ) and 2 different variables.
  
 //  19.1
    static String magicWord = "hi";

  //19.2
    private static void printWord() {
        System.out.println(magicWord);
    }

  //  19.3
    private static void changeWord(String word) {
        magicWord = word;
    }

  // 19.4 - yes
  
  //20.1
    private static void multiplyZugi(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                arr[i] = arr[i] * 2;
            }
            System.out.println(arr[i]);
        }
    }
  //20.2
    private static void addOne(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == arr[arr.length - 1]) {
                arr[i] = arr[i] + 1;
            }
            System.out.println(arr[i]);
        }
    }

  //20.3
    private static void setZero(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                arr[i] = 0;
            }
            System.out.println(arr[i]);
        }
    }

 //20.4 yes
 
 //21
    private static int sumNum( int number) {
        int sum = 0;
        for (int i = number; i > 0; i /= 10) {
            sum += i%10;
        }
        return sum;
    }
// 23
 public static void main(String[] args) {
        Random r = new Random();
        int[][] matrix = new int[3][3];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = r.nextInt(100) + 1;
            }
        }
       for (int i = 0; i < matrix.length; i++, System.out.println()) {
           for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
           }
       }
        sumArr(matrix);
    }
      private static void sumArr(int a[][]) {
        int x = a.length;
        int sum = 0;
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                sum += a[i][j];
            }
        }
        System.out.println("The sum all elements of array: " + sum);
    }
}
// 24 Recursion is the technique of making a function call itself. This technique provides a way to break complicated problems down into simple problems which are easier to solve.

