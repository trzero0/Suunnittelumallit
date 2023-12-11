class CPU {
    void freeze() {
        System.out.println("CPU: Freezing...");
        // toteuta Freeze-metodi
    }

    void jump(long position) {
        System.out.println("CPU: Jumping to address " + position);
        // toteuta Jump-metodi
    }

    void execute() {
        System.out.println("CPU: Executing...");
        // toteuta Execute-metodi
    }
}

class HardDrive {
    char[] read(long lba, int size) {
        System.out.println("Hard Drive: Reading data from LBA " + lba + " of size " + size);
        // toteuta Read-metodi ja palauta merkkijono char-taulukkona
        return new char[size]; // Palauta tyhjä taulukko esimerkkinä
    }
}

class Memory {
    private char[] data;

    void load(long position, char[] data) {
        System.out.println("Memory: Loading data to address " + position);
        this.data = data;
        // toteuta Load-metodi
    }

    void printMemoryContents() {
        System.out.println("Memory Contents:");
        for (int i = 0; i < data.length; i++) {
            System.out.println("Address " + i + ": " + data[i]);
        }
    }
}

class ComputerFacade {
    private static final long kBootAddress = 0; // Korvaa tarvittaessa oikealla osoitteella
    private static final long kBootSector = 0; // Korvaa tarvittaessa oikealla sektorilla
    private static final int kSectorSize = 512; // Korvaa tarvittaessa oikealla sektorikoolle

    private CPU cpu;
    private Memory memory;
    private HardDrive hardDrive;

    public ComputerFacade() {
        this.cpu = new CPU();
        this.memory = new Memory();
        this.hardDrive = new HardDrive();
    }

    public void start() {
        cpu.freeze();
        char[] bootData = hardDrive.read(kBootSector, kSectorSize);
        memory.load(kBootAddress, bootData);
        memory.printMemoryContents();
        cpu.jump(kBootAddress);
        cpu.execute();
    }
}

public class Main {
    public static void main(String[] args) {
        ComputerFacade computer = new ComputerFacade();
        computer.start();
    }
}
