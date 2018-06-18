package countstar.counts2.model;

public class Worker extends User{
private int credits;
    public Worker(String phNum,String psw){
        setPhNum(phNum);
        setPsw(psw);
        setNickName("Worker-"+phNum);
        setCredits(0);
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{");
        sb.append("\"credits\":").append(credits);
        sb.append(",\"nickName\":\"").append(getNickName()).append('\"');
        sb.append(",\"phNum\":\"").append(getPhNum()).append('\"');
        sb.append(",\"psw\":\"").append(getPsw()).append('\"');
        sb.append('}');
        return sb.toString();
    }
}
