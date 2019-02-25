package at.nacs.ex4theenglishgentleman;

import org.springframework.stereotype.Component;

@Component
public class EnglishGentleman {

    private Monocle monocle;
    private Lighter lighter;

    public EnglishGentleman(Monocle monocle, Lighter lighter) {
        this.monocle = monocle;
        this.lighter = lighter;
    }

    public String smokeCigaret(){
        return null;
    }



}
