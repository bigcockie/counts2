package countstar.counts2.dao;

import countstar.counts2.model.Assignment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.ArrayList;

@Mapper
public interface assignmentDAO {
    /**
     *加入新的任务
     */
    void insertA(@Param("assignment") Assignment assignment);
    /**
     *更新任务信息
     */
    void updateA(@Param("assignment") Assignment assignment);

    /**
     * 得到所有进行中任务
     * @return
     */
    ArrayList<Assignment> getAllOngoingAssignments();
    /**
     * 根据任务发布者得到所有任务列表
     * @param phNum
     * @return
     */
    ArrayList<Assignment> getAllAssignmentsByRequester(@Param("PhNum") String phNum);
    /**
     * 根据任务发布者得到正在进行的任务列表
     * @param phNum
     * @return
     */
    ArrayList<Assignment> getOngoingAssignmentsByRequester(@Param("PhNum") String phNum);
    /**
     * 根据任务发布者得到已经完成但是未结算的任务列表
     * @param phNum
     * @return
     */
    ArrayList<Assignment> getCompletedAssignmentsByRequester(@Param("phNum") String phNum);
    /**
     * 根据任务发布者得到已经结算的任务列表
     * @param phNum
     * @return
     */
    ArrayList<Assignment> getClearedAssignmentsByRequester(@Param("phNum") String phNum);
    /**
     * 根据编号得到具体的任务
     * @param aid
     * @return
     */
    Assignment getAssignmentById(@Param("aid") String aid);



}
