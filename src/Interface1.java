/**
 * Created by LunaFlores on 12/1/16.
 */
public interface Interface1 {
    default int isDefault(){
        return 8;
    }

    static double isDecimel(){
        return 1.2;
    }

    String isAbstract();

    int hmmm();
}
