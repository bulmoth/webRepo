package webPrj16ajax;

public class MemberVo {
	
	private String memberId;
	private String memberPwd;
	private String memberNick;
	private ScoreVo score;
	
	public MemberVo() {
		
	}

	public MemberVo(String memberId, String memberPwd, String memberNick) {
		super();
		this.memberId = memberId;
		this.memberPwd = memberPwd;
		this.memberNick = memberNick;
	}
	

	public ScoreVo getScore() {
		return score;
	}

	public void setScore(ScoreVo score) {
		this.score = score;
	}

	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public String getMemberPwd() {
		return memberPwd;
	}

	public void setMemberPwd(String memberPwd) {
		this.memberPwd = memberPwd;
	}

	public String getMemberNick() {
		return memberNick;
	}

	public void setMemberNick(String memberNick) {
		this.memberNick = memberNick;
	}

	@Override
	public String toString() {
		return "MemberVo [memberId=" + memberId + ", memberPwd=" + memberPwd + ", memberNick=" + memberNick + "]";
	}
	
}
