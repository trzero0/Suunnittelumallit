public class ConcreteDatabase implements Database {
    private String data;
    
    @Override
    public void writeData(String data) {
        this.data = data;
    }
    
    @Override
    public String readData() {
        return data;
    }
}
