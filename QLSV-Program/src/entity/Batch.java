package entity;

public class Batch {
    private String BatchId;
    private String BatchName;

    public String getBatchId() {
        return BatchId;
    }

    public void setBatchId(String batchId) {
        BatchId = batchId;
    }

    public String getBatchName() {
        return BatchName;
    }

    public void setBatchName(String batchName) {
        BatchName = batchName;
    }

    public Batch(String batchId, String batchName) {
        super();
        BatchId = batchId;
        BatchName = batchName;
    }

    @Override
    public String toString() {
        return "Batch [BatchId=" + BatchId + ", BatchName=" + BatchName + "]";
    }

}
