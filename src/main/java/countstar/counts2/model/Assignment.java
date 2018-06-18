package countstar.counts2.model;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Assignment {

    private String aid;//aid自动生成，作为主键，7位标志
    private String requester;//任务发布者的手机号
    private String requesterName;//任务发布者的昵称
    private String title;//作为任务的标题
    private String detail;//任务的详细描述
    private int rewardPerPic;//每张图的价钱,0.01-999.99元
    private int maxNumOfW;//最多有多少人参加
    private int totalWorkers;//已经有多少工人接单
    private int numOfCompleted;//已经完成的人数
    private ArrayList<String> images;//所有的图片的编号
    private String startTime;//开始时间默认发布任务的时间
    private String endTime;//结束时间默客户选择日期当天24点
    private int isCompleted;//是否完成，时间截止/完成率=1
    private int isCleared;//是否已经结算，只有已完成的任务才能结算
    private double CR;//完成率：有效完成人数/领取人数

    public Assignment(String aid, String requester, String title, String detail, int rewardPerPic, int maxNumOfPe, int numOfComple, ArrayList<String> images, String endTime) {
        Date date=new Date();
        SimpleDateFormat dateFormat=new SimpleDateFormat("YYYY-MM-dd HH:mm:ss");
        this.numOfCompleted = 0;
        this.aid = aid;
        this.requester = requester;
        this.title = title;
        this.detail = detail;
        this.rewardPerPic = rewardPerPic;
        this.maxNumOfW = maxNumOfPe;
        this.isCleared = 0;
        this.isCompleted = 0;
        this.totalWorkers = 0;
        this.images = images;
        this.startTime = dateFormat.format(date.getTime());
        this.endTime = endTime;
        this.CR = 0;
    }


    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public double getCR() {
        return CR;
    }

    public void setCR(double CR) {
        this.CR = CR;
    }

    public int getRewardPerPic() {
        return rewardPerPic;
    }

    public void setRewardPerPic(int rewardPerPic) {
        this.rewardPerPic = rewardPerPic;
    }

    public int getTotalWorkers() {
        return totalWorkers;
    }

    public void setTotalWorkers(int totalWorkers) {
        this.totalWorkers = totalWorkers;
    }

    public int getMaxNumOfW() {
        return maxNumOfW;
    }

    public void setMaxNumOfW(int maxNumOfPe) {
        this.maxNumOfW = maxNumOfPe;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getRequester() {
        return requester;
    }

    public void setRequester(String requester) {
        this.requester = requester;
    }

    public String getAid() {
        return aid;
    }

    public void setAid(String aid) {
        this.aid = aid;
    }

    public ArrayList<String> getImages() {
        return images;
    }

    public void setImages(ArrayList<String> images) {
        this.images = images;
    }

    public int getIsCompleted() {
        return isCompleted;
    }

    public void setIsCompleted(int isCompleted) {
        this.isCompleted = isCompleted;
    }

    public int getIsCleared() {
        return isCleared;
    }

    public void setIsCleared(int isCleared) {
        this.isCleared = isCleared;
    }

    public int getNumOfCompleted() {
        return numOfCompleted;
    }

    public void setNumOfCompleted(int numOfCompleted) {
        this.numOfCompleted = numOfCompleted;
    }
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{");
        sb.append("\"aid\":\"").append(aid).append('\"');
        sb.append(",\"CR\":").append(CR);
        sb.append(",\"detail\":\"").append(detail).append('\"');
        sb.append(",\"endTime\":").append(endTime);
        sb.append(",\"images\":").append(images);
        sb.append(",\"isCompleted\":").append(isCompleted);
        sb.append(",\"maxNumOfW\":").append(maxNumOfW);
        sb.append(",\"requester\":\"").append(requester).append('\"');
        sb.append(",\"rewardPerPic\":").append(rewardPerPic);
        sb.append(",\"startTime\":").append(startTime);
        sb.append(",\"title\":\"").append(title).append('\"');
        sb.append(",\"totalWorkers\":").append(totalWorkers);
        sb.append('}');
        return sb.toString();
    }


    public String getRequesterName() {
        return requesterName;
    }

    public void setRequesterName(String requesterName) {
        this.requesterName = requesterName;
    }

}

