public class Main {

    @FunctionalInterface
    interface  Converter <T>{
        SecondClass convert (T a);
    }

    public static void main(String[] args) {

        FirstClass firstClass = new FirstClass(2,4,6);
        Converter <FirstClass> convert = x ->  new SecondClass(x.a,x.b,x.c);
        SecondClass secondClass = convert.convert(firstClass);
        System.out.println(secondClass.function());
    }
}
