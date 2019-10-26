package designPatterns.state.ceiling_fan_example;

public class PullChain {
    private IFanState currentStates;

    public PullChain() {
        currentStates = new Off();
    }

    public void setState(IFanState state) {
        currentStates = state;
    }

    public void pull() {
        currentStates.pull(this);
    }
}
