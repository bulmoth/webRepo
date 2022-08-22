package webPrj16ajax;

public class ScoreVo {
	
	private int kor;
	private int math;
	
	public ScoreVo() {
		
	}

	public ScoreVo(int kor, int math) {
		super();
		this.kor = kor;
		this.math = math;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	@Override
	public String toString() {
		return "ScoreVo [kor=" + kor + ", math=" + math + "]";
	}
	

}
