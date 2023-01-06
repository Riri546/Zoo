package ZOO;

public abstract class Animal implements Speakable {
    // public abstract void speak();
    private Weitable weitable;

    public void save(){
        if (weitable instanceof FileHandler){
            FileHandler fileHandler1 = (FileHandler) weitable;
            fileHandler1.test();
        }

        if(weitable != null){
            weitable.save();
        }
    }

    public void setWriteble(Weitable weitable) {
        this.weitable = weitable;
    }

}
