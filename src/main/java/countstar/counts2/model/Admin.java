package countstar.counts2.model;

public class Admin extends User{
    public Admin(String phNum,String psw){
        setPhNum(phNum);
        setPsw(psw);
        setNickName("Admin-"+phNum);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{");
        sb.append("\"nickName\":\"").append(getNickName()).append('\"');
        sb.append(",\"phNum\":\"").append(getPhNum()).append('\"');
        sb.append(",\"psw\":\"").append(getPsw()).append('\"');
        sb.append('}');
        return sb.toString();
    }
}
