package Bai1;

import java.security.PublicKey;

public class CongNhan {
	private int maCN;
	private double mSoSP;
	private String mHo,mTen;
//Dong goi	
	public int getMaCN() {
		return maCN;
	}
	public void setMaCN(int m) {
		if (m>0) {
			this.maCN = m;
		} else {
			System.out.println("Loi");
		}
	}
	public double getmSoSP() {
		return mSoSP;
	}
	public void setmSoSP(double s) {
		if (s>0) {
			this.mSoSP = s;
		} else {
			System.out.println("Loi");
		}
		
	}
	public String getmHo() {
		return mHo;
	}
	public void setmHo(String h) throws Exception {
		if (h !=null) {
			this.mHo = h;
		}else {
			throw new Exception("Loi");
		}
	}
	public String getmTen() {
		return mTen;
	}
	public void setmTen(String mTen) throws Exception {
		if (mTen !=null) {
			this.mTen = mTen;
		}else {
			throw new Exception("Loi");
		}
		
	}
//Ham tao
public CongNhan() {}
public CongNhan(int maCN, double mSoSP, String mHo, String mTen) {
	super();
	this.maCN = maCN;
	this.mSoSP = mSoSP;
	this.mHo = mHo;
	this.mTen = mTen;
}
public double getTinhLuong() {
	double l=0;
	if(getmSoSP >1 && getmSoSP<200) {
		 l= getmSoSP()*0.5;
		 return l;
		}else {
			if(getmSoSP >199 && getmSoSP<400) {
				 l= getmSoSP()*0.55;
				 return l;
		}else {
			if(getmSoSP >399 && getmSoSP <600) {
				 l= getmSoSP()*0.6;
				 return l;
		}else {
			if(getmSoSP >599 ) {
				 l= getmSoSP()*0.65;
				 return l;
		}
	}

public String toString() {
	String s = "";
	s+=s.format("%5d, %5s ,%5s,%5f,%5f",getMaCN(),getmHo(),getmTen(),getmSoSP(),getTinhLuong());
	return s;
	System.out.println(s);
}
}

