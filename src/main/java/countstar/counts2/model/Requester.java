package countstar.counts2.model;

public class Requester extends User{
    private int credits;
    public Requester(String phNum, String psw){
        setPhNum(phNum);
        setPsw(psw);
        setNickName("Requester-"+phNum);
        setCredits(100);
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
