package designPatterns.state.ceiling_fan_example;

public class Medium implements IFanState {
    @Override
    public void pull(PullChain wrapper) {
        wrapper.setState(new High());
        System.out.println("High speed...");
    }
}