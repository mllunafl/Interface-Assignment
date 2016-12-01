/**
 * Created by LunaFlores on 12/1/16.
 */
public interface Interface2 {

    default String isName(){
        return "Im default";
    }

    static boolean isBoolean(){
        return true;
    }

    int isNum();

    default boolean boo2(){
        return false;
    }

    boolean hmmm();
}
