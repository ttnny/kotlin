package designPatterns.state.ceiling_fan_example;

public class Off implements IFanState {
    @Override
    public void pull(PullChain wrapper) {
        wrapper.setState(new Low());
        System.out.println("Low speed...");
    }
}