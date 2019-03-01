public class MobilePhone {

    // required parameters
    private String memory;
    private String ram;
    private String processor;
    private String screenSize;

    // optional parameters
    private boolean hasCamera;
    private boolean hasBluetooth;
    private boolean hasDualSim;

    public MobilePhone(String memory, String ram, String processor, String screenSize) {
        this.memory = memory;
        this.ram = ram;
        this.processor = processor;
        this.screenSize = screenSize;
    }

    public MobilePhone(String memory, String ram, String processor, String screenSize, boolean hasCamera) {
        this.memory = memory;
        this.ram = ram;
        this.processor = processor;
        this.screenSize = screenSize;
        this.hasCamera = hasCamera;
    }

    public MobilePhone(String memory, String ram, String processor, String screenSize, boolean hasCamera, boolean hasBluetooth) {
        this.memory = memory;
        this.ram = ram;
        this.processor = processor;
        this.screenSize = screenSize;
        this.hasCamera = hasCamera;
        this.hasBluetooth = hasBluetooth;
    }

    public MobilePhone(String memory, String ram, String processor, String screenSize, boolean hasCamera, boolean hasBluetooth, boolean hasDualSim) {
        this.memory = memory;
        this.ram = ram;
        this.processor = processor;
        this.screenSize = screenSize;
        this.hasCamera = hasCamera;
        this.hasBluetooth = hasBluetooth;
        this.hasDualSim = hasDualSim;
    }

    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public String getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(String screenSize) {
        this.screenSize = screenSize;
    }

    public boolean isHasCamera() {
        return hasCamera;
    }

    public void setHasCamera(boolean hasCamera) {
        this.hasCamera = hasCamera;
    }

    public boolean isHasBluetooth() {
        return hasBluetooth;
    }

    public void setHasBluetooth(boolean hasBluetooth) {
        this.hasBluetooth = hasBluetooth;
    }

    public boolean isHasDualSim() {
        return hasDualSim;
    }

    public void setHasDualSim(boolean hasDualSim) {
        this.hasDualSim = hasDualSim;
    }

    @Override
    public String toString() {
        return "MobilePhone{" +
                "memory='" + memory + '\'' +
                ", ram='" + ram + '\'' +
                ", processor='" + processor + '\'' +
                ", screenSize='" + screenSize + '\'' +
                ", hasCamera=" + hasCamera +
                ", hasBluetooth=" + hasBluetooth +
                ", hasDualSim=" + hasDualSim +
                '}';
    }
}