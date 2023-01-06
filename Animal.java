package ZOO;

public abstract class Animal implements Speakable {
    // public abstract void speak();
    private FileHandler fileHandler;

    public void save(){
        if(fileHandler != null){
            fileHandler.save();
        }
    }

    public void setFileHandler(FileHandler fileHandler) {
        this.fileHandler = fileHandler;
    }

}
