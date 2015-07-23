

public class Money extends Journal{

	public int nm; //今持っているお金
	public int rm; //入ったお金
	public int sm; //使ったお金


	public int getMoney(){ //残額の計算
		return(int)(nm + rm - sm);
	}
}
