import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean = (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld ok = (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());
        System.out.println(bean.equals(ok));

        Cat cat = (Cat) applicationContext.getBean("cat");
        Cat cat1 = (Cat) applicationContext.getBean("cat");
//        System.out.println(cat.equals(cat1));
//        System.out.println(cat.getMessage());
//        System.out.println(cat.getMessage());
        System.out.println(cat.equals(cat1));
//        if (bean.equals(cat)){
//            System.out.println(bean.equals(cat));
//        }
    }
}