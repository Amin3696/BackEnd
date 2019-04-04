package Controller;

import lombok.experimental.UtilityClass;
import model.Bean;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@UtilityClass
public class BeansGenerator {
    private Random random = new Random();

    public Queue<Bean> produceTheBansCan() {

        List<Boolean> randomBooleans = generateListOfRandomBooleans();
        List<Bean> whiteBeans = generateWhiteBeans(randomBooleans);
        List<Bean> blackBeans = generateBlackBeans(randomBooleans);
        List<Bean> beans = addAllBeansTogether(whiteBeans, blackBeans);
        Collections.shuffle(beans);
        List<Bean> randomBeans = new LinkedList<>(beans);
        return (Queue<Bean>) randomBeans;
    }

    private List<Boolean> generateListOfRandomBooleans() {
        return IntStream.iterate(0, n -> n + 1)
                .mapToObj(e -> random.nextBoolean())
                .limit(100)
                .collect(Collectors.toList());
    }

    private List<Bean> generateWhiteBeans(List<Boolean> randomBooleans) {
        return randomBooleans.stream()
                .filter(e -> e.equals(true))
                .map(e -> Bean.builder().color("white").build())
                .collect(Collectors.toList());
    }

    private List<Bean> generateBlackBeans(List<Boolean> randomBooleans) {
        return randomBooleans.stream()
                .filter(e -> e.equals(false))
                .map(e -> Bean.builder().color("black").build())
                .collect(Collectors.toList());
    }

    private List<Bean> addAllBeansTogether(List<Bean> whiteBeans, List<Bean> blackBeans) {
        List<Bean> beans = new ArrayList<>();
        for (Bean whiteBean : whiteBeans) {
            beans.add(whiteBean);
        }
        for (Bean blackBean : blackBeans) {
            beans.add(blackBean);
        }
        return beans;
    }
}

