package examples.a1;

import com.practicing.springpracticing.dependencytheoric.GameRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Arrays;
@Component
class TestingDependencyInjectionsTypes{
    //It can be by field @Autowired in each field
    //It can be by set methods @Autowired in each set
    //It can be by Construtor. We don't need to use @Autowired
    //@Autowired
    Injection1 injection1;
    //@Autowired
    Injection2 injection2;

//    public TestingDependencyInjectionsTypes(Injection1 injection1, Injection2 injection2) {
//        System.out.println("Injection by constructor");
//        this.injection1 = injection1;
//        this.injection2 = injection2;
//    }
    @Autowired
    public void setInjection1(Injection1 injection1) {
        System.out.println("Setting injection1");
        this.injection1 = injection1;
    }
    @Autowired
    public void setInjection2(Injection2 injection2) {
        System.out.println("Setting injection2");
        this.injection2 = injection2;
    }
}

@Component
class Injection1{}
@Component
class Injection2{}


@Configuration
@ComponentScan
public class DepInjectionLaucherApplication {
    public static void main(String[] args) {

        try (var context = new AnnotationConfigApplicationContext(DepInjectionLaucherApplication.class)){
            //context.getBean(GameRunner.class).run();
            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
            System.out.println(context.getBean(TestingDependencyInjectionsTypes.class));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
