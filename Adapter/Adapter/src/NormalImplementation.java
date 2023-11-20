public class NormalImplementation implements NewService {
    private OldService oldService;

    public NormalImplementation(OldService oldService) {
        this.oldService = oldService;
    }

    @Override
    public void doSomething() {
        oldService.doSomethingOld();
    }
}