/**
 * 
 */
package entity;

/**
 * @author User
 *
 */
public class TrainingSystem {
    private String trainingSystemCode;
    private String trainingSystemName;
    /**
     * Create by: User - CMC
     * Create date: Dec 28, 2018
     * Modifier: User
     * Modified date: Dec 28, 2018
     * Description: ....
     * Version 1.0
     */
    public TrainingSystem() {
        super();
        // TODO Auto-generated constructor stub
    }
    /**
     * Create by: User - CMC
     * Create date: Dec 28, 2018
     * Modifier: User
     * Modified date: Dec 28, 2018
     * Description: ....
     * Version 1.0
     * @param trainingSystemCode
     * @param trainingSystemName
     */
    public TrainingSystem(String trainingSystemCode, String trainingSystemName) {
        super();
        this.trainingSystemCode = trainingSystemCode;
        this.trainingSystemName = trainingSystemName;
    }
    public String getTrainingSystemCode() {
        return trainingSystemCode;
    }
    public void setTrainingSystemCode(String trainingSystemCode) {
        this.trainingSystemCode = trainingSystemCode;
    }
    public String getTrainingSystemName() {
        return trainingSystemName;
    }
    public void setTrainingSystemName(String trainingSystemName) {
        this.trainingSystemName = trainingSystemName;
    }
    @Override
    public String toString() {
        return "TrainingSystem [trainingSystemCode=" + trainingSystemCode + ", trainingSystemName=" + trainingSystemName
                + "]";
    }
    
    
}
