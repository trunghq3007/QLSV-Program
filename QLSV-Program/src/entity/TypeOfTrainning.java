package entity;

public class TypeOfTrainning {
  private String totCode;
  private String totName;

  public TypeOfTrainning() {
    super();
  }

  /**
   * Constructor using fields.
   */
  public TypeOfTrainning(String totCode, String totName) {
    super();
    this.totCode = totCode;
    this.totName = totName;
  }

  public String getTotCode() {
    return totCode;
  }

  public void setTotCode(String totCode) {
    this.totCode = totCode;
  }

  public String getTotName() {
    return totName;
  }

  public void setTotName(String totName) {
    this.totName = totName;
  }

  @Override
  public String toString() {
    return "TypeOfTrainning [totCode=" + totCode + ", totName=" + totName + "]";
  }

}
