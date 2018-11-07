public class Pepaya extends Fruit{
	
	public int biji;

	public Pepaya(String asal, int biji){
		super(asal);		
		this.biji = biji;
	}

	public Pepaya(String asal){
		super(asal);
	}


	public void showBiji(){
		System.out.println(biji);
	}

}