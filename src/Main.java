public class Main {

    public static void main(String[] args) {
        Foo foo = new Foo();


        System.out.println(foo.isAbstract());
        System.out.println(foo.isDefault());
        System.out.println(foo.isName());
        System.out.println(foo.isNum());
        System.out.println(Interface1.isDecimel());
        System.out.println(Interface2.isBoolean());

        System.out.printf("%s",foo.isAbstract());
        System.out.printf("%d", foo.isDefault());
        System.out.printf("%s %d %f",foo.isName(),foo.isNum(),Interface1.isDecimel());

        Foo2 foo2 = new Foo2();

        System.out.println(foo2.boo());

        System.out.println(foo.boo2());

        System.out.println(foo.hmmm());
        }
    }
