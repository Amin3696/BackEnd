import java.util.Queue;

public class CanRunner {

    public static void main(String[] args) {

        Queue<Bean> beans = BeansGenerator.produceTheBansCan();
        System.out.println(beans);
        long amountOfWhitBeans = beans.stream()
                .filter(e -> e.getColor() == "white")
                .count();
        long amountOfBlackBeans = beans.stream()
                .filter(e -> e.getColor() == "black")
                .count();

        System.out.println("The number of white beans are: " + amountOfWhitBeans + " and the amount of black beans are: " + amountOfBlackBeans);

        Bean theLastBean = BeansExperiment.findTheLastBean(beans);
        System.out.println("The last bean is "+theLastBean.getColor());

    }
}
