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

    public String say() {
        String salute = hello.getHello() + world.getWorld();

        return salute;
    }


}
