package swe;
import java.sql.*;
public class BedsCount{
	private DConnection db=new DConnection();
	public void fetchBeds(int id){
//		String qry= "select totalBeds from hospitalDatabase where hospitalId="+id+";";
//		int beds=db.executeSelect(qry);
//		return beds;
	}
	//public void updateBeds(int patient_no,int hospId ){

//	public void updateBeds(int hospId ){
//		int patient_no = 5;
//		int n=fetchBeds(hospId);
//		int updatedBeds=n-patient_no;
//		String qry="update hospitalDatabase set totalBeds="+updatedBeds+" where hospitalId="+hospId+";";
//		int cnt=db.executeOther(qry);
//		if(cnt==1)
//		{
//			System.out.println("success");
//		}
//		else
//		{
//			System.out.println("error");
//		}
//	}
}