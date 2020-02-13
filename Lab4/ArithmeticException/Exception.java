class Exception{
    static int a=6;
    public static void main(String[] args) {
        try {
            a=a/0;
        } catch (ArithmeticException e) {
            //TODO: handle exception
            System.out.println("Cannot divide by zero");
        }
        finally{
            System.out.println("this finally block gets executed anyways");
        }
    }
}