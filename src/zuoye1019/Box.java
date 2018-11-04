package zuoye1019;

public class Box {
    private int chang;
    private int kuan;
    private int gao;

    public Box(int chang,int kuan,int gao){
        this.chang = chang;
        this.kuan = kuan;
        this.gao = gao;
    }

    public void setChang(int chang,int kuan,int gao){
        this.chang = chang;
        this.kuan = kuan;
        this.gao = gao;
    }

    public int getChang(){
        return chang;
    }

    public int getKuan(){
        return kuan;
    }

    public int getGao(){
        return gao;
    }

    public int getVolume(){
        return chang*kuan*gao;
    }
}
