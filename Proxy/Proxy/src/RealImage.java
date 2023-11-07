public class RealImage implements Image {
    private String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
        loadFromDisk();
    }

    private void loadFromDisk() {
        System.out.println("Lataa kuva: " + fileName);
    }

    public void display() {
        System.out.println("Näytä kuva: " + fileName);
    }

    public String getFileName() {
        return fileName;
    }

    public void showData() {
        System.out.println("Kuvan nimi: " + fileName);
    }
}