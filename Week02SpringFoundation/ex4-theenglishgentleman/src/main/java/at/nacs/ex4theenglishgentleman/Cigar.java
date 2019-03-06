package at.nacs.ex4theenglishgentleman;

import org.springframework.stereotype.Component;

@Component


public class Cigar {

    private Lighter lighter;

    public Boolean isLit(){
        if (lighter.getClass().getSimpleName())
        return true;
    }

}
