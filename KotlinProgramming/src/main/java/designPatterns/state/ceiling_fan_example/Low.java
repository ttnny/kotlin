package designPatterns.state.ceiling_fan_example;

public class Low implements IFanState {
    @Override
    public void pull(PullChain wrapper) {
        wrapper.setState(new Medium());
        System.out.println("Medium speed...");
    }
}