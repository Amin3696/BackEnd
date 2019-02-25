package at.nacs.ex2amazinghelloworld;


import org.springframework.stereotype.Component;

@Component
public class AmazingHelloWorld {

    private Hello hello;
    private World world;

    public AmazingHelloWorld(Hello hello, World world) {
        this.hello = hello;
        this.world = world;
    }

    public String sayHello() {
        String salute = hello.sayHello() + world.getWorld();

        return salute;
    }


}
