package mvc;

public class quiz {
        private String q1;
        private String q2;
        private String q3;
		public String getQ1() {
			return q1;
		}
		public void setQ1(String q1) {
			this.q1 = q1;
		}
		public String getQ2() {
			return q2;
		}
		@Override
		public String toString() {
			return "quiz [q1=" + q1 + ", q2=" + q2 + ", q3=" + q3 + "]";
		}
		public void setQ2(String q2) {
			this.q2 = q2;
		}
		public String getQ3() {
			return q3;
		}
		public void setQ3(String q3) {
			this.q3 = q3;
		}
}
