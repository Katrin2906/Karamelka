package homework_10.task_1;

public class FlowersGeneric<T> {

    private T petals;

    public FlowersGeneric(T petals) {
        this.petals = petals;
    }

    public T getPetals(T petals) {
        return petals;
    }

    public T getName() {
        return (T) getClass();
    }

    @Override
    public String toString() {
        return "FlowersGeneric{" +
                "petals=" + petals +
                '}';
    }
}
