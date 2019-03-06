package at.nacs.ex4theenglishgentleman;

import org.springframework.stereotype.Component;

@Component
public class EnglishGentleman {

    private Monocle monocle;
    private Newspaper newspaper;
    private Lighter lighter;
    private Cigar cigar;


    public EnglishGentleman(Monocle monocle, Lighter lighter) {
        this.monocle = monocle;
        this.lighter = lighter;
    }

    public String smoke(Cigar cigar){
        Boolean litCigaret = cigar.isLit();
        if (litCigaret){

        return null;
    }



}
