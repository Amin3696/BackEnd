package view;

import Controller.BeansExperiment;
import Controller.BeansGenerator;
import lombok.experimental.UtilityClass;
import lombok.extern.java.Log;
import model.Bean;

import java.util.Queue;

@Log
@UtilityClass
public class CanRunner {

    public void showTheResult() {

        Queue<Bean> beans = BeansGenerator.produceTheBansCan();
        log.info(beans.toString());
        long amountOfWhitBeans = beans.stream()
                .filter(e -> e.getColor() == "white")
                .count();
        long amountOfBlackBeans = beans.stream()
                .filter(e -> e.getColor() == "black")
                .count();

        log.info("The number of white beans are: " + amountOfWhitBeans + " and the amount of black beans are: " + amountOfBlackBeans);

        Bean theLastBean = BeansExperiment.findTheLastBean(beans);
        log.info("The last bean is " + theLastBean.getColor());

    }
}
