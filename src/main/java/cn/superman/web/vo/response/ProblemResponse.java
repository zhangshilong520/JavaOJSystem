package cn.superman.web.vo.response;

public class ProblemResponse {
    private Integer problemId;
    private Integer problemTypeId;
    private String problemName;
    private String problemLabel;
    private Long timeLimit;
    private Long memoryLimit;
    private String problemContent;
    private Integer problemDifficulty;
    private Integer problemValue;
    private Integer problemVersion;
    // 所有答对的用户ID编号集
    private String allRightPeopleIds;
    private Integer totalSubmitCount;
    private Integer totalRightCount;

    public Integer getProblemId() {
        return problemId;
    }

    public void setProblemId(Integer problemId) {
        this.problemId = problemId;
    }

    public Integer getProblemTypeId() {
        return problemTypeId;
    }

    public void setProblemTypeId(Integer problemTypeId) {
        this.problemTypeId = problemTypeId;
    }

    public String getProblemName() {
        return problemName;
    }

    public void setProblemName(String problemName) {
        this.problemName = problemName;
    }

    public String getProblemLabel() {
        return problemLabel;
    }

    public void setProblemLabel(String problemLabel) {
        this.problemLabel = problemLabel;
    }

    public Long getTimeLimit() {
        return timeLimit;
    }

    public void setTimeLimit(Long timeLimit) {
        this.timeLimit = timeLimit;
    }

    public Long getMemoryLimit() {
        return memoryLimit;
    }

    public void setMemoryLimit(Long memoryLimit) {
        this.memoryLimit = memoryLimit;
    }

    public String getProblemContent() {
        return problemContent;
    }

    public void setProblemContent(String problemContent) {
        this.problemContent = problemContent;
    }

    public Integer getProblemDifficulty() {
        return problemDifficulty;
    }

    public void setProblemDifficulty(Integer problemDifficulty) {
        this.problemDifficulty = problemDifficulty;
    }

    public Integer getProblemValue() {
        return problemValue;
    }

    public void setProblemValue(Integer problemValue) {
        this.problemValue = problemValue;
    }

    public Integer getProblemVersion() {
        return problemVersion;
    }

    public void setProblemVersion(Integer problemVersion) {
        this.problemVersion = problemVersion;
    }

    public String getAllRightPeopleIds() {
        return allRightPeopleIds;
    }

    public void setAllRightPeopleIds(String allRightPeopleIds) {
        this.allRightPeopleIds = allRightPeopleIds;
    }

    public Integer getTotalSubmitCount() {
        return totalSubmitCount;
    }

    public void setTotalSubmitCount(Integer totalSubmitCount) {
        this.totalSubmitCount = totalSubmitCount;
    }

    public Integer getTotalRightCount() {
        return totalRightCount;
    }

    public void setTotalRightCount(Integer totalRightCount) {
        this.totalRightCount = totalRightCount;
    }

}
