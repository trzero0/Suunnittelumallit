
// Adapter.java
public class Adapter implements NewService {
    private OldService oldService;

    public Adapter(OldService oldService) {
        this.oldService = oldService;
    }

    @Override
    public void doSomething() {
        oldService.doSomethingOld();
    }
}