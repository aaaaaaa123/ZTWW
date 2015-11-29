package nju.ztww.data.commodity;
// 数据层具体实现找List的方法（库存盘点或库存查看） 数据库表需要记录出库。
import java.text.ParseException;
import java.util.ArrayList;

import nju.ztww.DBHelper.DBForEntryForm;
import nju.ztww.dao.EntryFormDO;
import nju.ztww.po.StorageListLineofInPO;

public class StorageListInGetByTime {
    
	public DBForEntryForm dbforentryform=new DBForEntryForm();
	
	
	
	
	
	public ArrayList<StorageListLineofInPO> findInList(String time,String idofcenter) {
		
		return null;
	}
	
	
	// 现在实现的时候两个时间必须不相同（入库单查看）
	public ArrayList<StorageListLineofInPO> findInList(String timebegin,String timeend,String idofcenter) throws ParseException{
		ArrayList<EntryFormDO> entryfromdolist =new ArrayList<EntryFormDO>();
		ArrayList<StorageListLineofInPO> storagelistlineofinpo=new ArrayList<StorageListLineofInPO>();
        dbforentryform.init();
        String tableName="entryform";
        if(timebegin.equals(timeend)){
        	entryfromdolist=dbforentryform.queryByTime(timebegin, tableName);
        	for(int k=0;k<entryfromdolist.size();k++){
        		 StorageListLineofInPO storagelistlinreofin=new StorageListLineofInPO(1,
        		    		entryfromdolist.get(k).getGoodsid(),
        		    		entryfromdolist.get(k).getEntrytime(),
        		    		entryfromdolist.get(k).getAddress(),
        		    		entryfromdolist.get(k).getQu(),
        		    		entryfromdolist.get(k).getPai(),
        		    		entryfromdolist.get(k).getJia(),
        		    		entryfromdolist.get(k).getWei()
        		                         );
        		 storagelistlineofinpo.add(storagelistlinreofin);
        	}
        	return  storagelistlineofinpo;
        }
        
        //两个时间端点不同的情况
        else{
        ArrayList<String>  timelist=new ArrayList<String>();
        TimeChange time=new TimeChange();
        timelist=time.timechange(timebegin, timeend);
        entryfromdolist=dbforentryform.queryByTime(timebegin,tableName);
        for(int i=1;i<timelist.size();i++){
        ArrayList<EntryFormDO> entryfromdolist2 =new ArrayList<EntryFormDO>();
        entryfromdolist2=dbforentryform.queryByTime(timelist.get(i), tableName);
        for(int j=0;j<entryfromdolist2.size();j++){
        	entryfromdolist.add(entryfromdolist2.get(i));	
        }
        }
       for(int k=0;k<entryfromdolist.size();k++){
	    StorageListLineofInPO storagelistlinreofin=new StorageListLineofInPO(1,
	    		entryfromdolist.get(k).getGoodsid(),
	    		entryfromdolist.get(k).getEntrytime(),
	    		entryfromdolist.get(k).getAddress(),
	    		entryfromdolist.get(k).getQu(),
	    		entryfromdolist.get(k).getPai(),
	    		entryfromdolist.get(k).getJia(),
	    		entryfromdolist.get(k).getWei()
	                         );
	    
	    storagelistlineofinpo.add(storagelistlinreofin);
       }
		// TODO Auto-generated method stub
	    dbforentryform.close();
		return storagelistlineofinpo;
	}
	}

}
