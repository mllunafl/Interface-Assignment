/**
 * Created by LunaFlores on 12/1/16.
 */
public class Foo implements Interface1, Interface2 {


    @Override
    public String isAbstract() {
        return "Im abstract";
    }

    @Override
    public int isNum() {
        return 10;
    }


//Does not compile, hmmm clashes
    @Override
    public int hmmm() {
        return 43;
    }
}
