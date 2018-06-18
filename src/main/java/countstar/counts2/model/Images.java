package countstar.counts2.model;

public class Images {
    private String pid;//图片的编号，自动生成，9位定点整数,图片同时保存到服务器的图片文件夹，名称为编号+后缀
    private String aid;//任务的编号，7位定点整数
    private String phNumW;//接受任务工人的手机号，初始值为null;
    private int isModified;//是否修改过
    private int isSubmitted;//是否提交，提交后将无法修改，
    private int isQualified;//是否合格



   public Images(String aid){
       this.aid=aid;
       this.phNumW=null;
       this.isModified=0;
       this.isSubmitted=0;
       this.isQualified=0;
   }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public String getPhNumW() {
        return phNumW;
    }

    public void setPhNumW(String phNumW) {
        this.phNumW = phNumW;
    }

    public int getIsModify() {
        return isModified;
    }

    public void setIsModify(int isModify) {
        this.isModified = isModify;
    }

    public int getIsSubmit() {
        return isSubmitted;
    }

    public void setIsSubmit(int isSubmit) {
        this.isSubmitted = isSubmit;
    }

    public int getIsQualified() {
        return isQualified;
    }

    public void setIsQualified(int isQualified) {
        this.isQualified = isQualified;
    }

    public String getAid() {
        return aid;

    }

    public void setAid(String aid) {
        this.aid = aid;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{");
        sb.append("\"Pid\":\"").append(pid).append('\"');
        sb.append(",\"Aid\":\"").append(aid).append('\"');
        sb.append(",\"phNumW\":\"").append(phNumW).append('\"');
        sb.append(",\"isModify\":").append(isModified);
        sb.append(",\"isSubmit\":").append(isSubmitted);
        sb.append(",\"isQualified\":").append(isQualified);
        sb.append('}');
        return sb.toString();
    }
}
