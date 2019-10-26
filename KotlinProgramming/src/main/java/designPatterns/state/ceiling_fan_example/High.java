package designPatterns.state.ceiling_fan_example;

public class High implements IFanState {
    @Override
    public void pull(PullChain wrapper) {
        wrapper.setState(new Off());
        System.out.println("Off...");
    }
}