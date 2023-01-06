package ZOO;

public abstract class Animal implements Speakable {
    // public abstract void speak();
    private Weitable fileHandler;

    public void save(){
        if(fileHandler != null){
            fileHandler.save();
        }
    }

    public void setFileHandler(Weitable fileHandler) {
        this.fileHandler = fileHandler;
    }

}
