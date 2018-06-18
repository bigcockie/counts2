package countstar.counts2.model;

public abstract class User {
    private String phNum;
    private String psw;
    private String nickName;
    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getPhNum() {
        return phNum;
    }

    public String getPsw() {
        return psw;
    }


    public void setPsw(String psw) {
        this.psw = psw;
    }

    public void setPhNum(String phNum) {
        this.phNum = phNum;
    }

    public abstract String toString();
}
