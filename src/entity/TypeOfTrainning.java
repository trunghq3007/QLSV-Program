/**
 * 
 */
package entity;

/**
 * @author HQTrung
 *
 */
public class TypeOfTrainning {
        private String typeTrainCode;
        private String typeTrainName;

        /**
         * 
         */
        public TypeOfTrainning() {
        }

        /**
         * @param maHeDT
         * @param tenHeDT
         */
        public TypeOfTrainning(String typeStrainCode, String typeTrainName) {
        	this.typeTrainCode = typeStrainCode;
        	this.typeTrainName = typeTrainName;
        }

        @Override
        public String toString() {
                return "HeDT [maHeDT=" + typeTrainCode + ", tenHeDT=" + typeTrainName + "]";
        }

		public String getTypeTrainCode() {
			return typeTrainCode;
		}

		public void setTypeTrainCode(String typeTrainCode) {
			this.typeTrainCode = typeTrainCode;
		}

		public String getTypeTrainName() {
			return typeTrainName;
		}

		public void setTypeTrainName(String typeTrainName) {
			this.typeTrainName = typeTrainName;
		}

}
