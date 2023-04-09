package businesscalculation;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
@ComponentScan
public class LaucherApplication {
    public static void main(String[] args) {

        try (var context = new AnnotationConfigApplicationContext(LaucherApplication.class)){
                        Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
            System.out.println(context.getBean(BusinessCalculationService.class).findMax());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
