import lombok.experimental.UtilityClass;

import java.util.Queue;

@UtilityClass
public class BeansExperiment {

    public Bean findTheLastBean(Queue<Bean> beans) {
        while (beans.size() > 1) {
            Bean firstBean = beans.poll();
            Bean secondBean = beans.poll();
            if (firstBean.getColor() == secondBean.getColor()) {
                Bean black = Bean.builder()
                        .color("black")
                        .build();
                beans.add(black);
            } else {
                Bean white = Bean.builder()
                        .color("white")
                        .build();
                beans.add(white);
            }
        }
        return beans.poll();
    }
}
