public class segitigaOOP{
	private int alas; 
	private int tinggi;
	private double miring; 
	
	public void setAlas (int alas){
		this.alas = alas; 
	}
	public void setTinggi (int tinggi){
		this.tinggi = tinggi; 
	}
	public int getAlas(){
		return alas; 
	}
	public int getTinggi(){
		return tinggi;
	}
	public double hitungLuas(){
		double luas; 
		luas = (0.5)*alas*tinggi; 
		return luas; 
	}
	public double hitungSisiMiring(){
		double miring; 
		miring = Math.sqrt((alas*alas )+(tinggi*tinggi)); 
		this.miring = miring; 
		return miring;
	}
	public double hitungKeliling(){
		double keliling; 
		keliling = alas + tinggi + hitungSisiMiring(); 
		return keliling; 
	}
}