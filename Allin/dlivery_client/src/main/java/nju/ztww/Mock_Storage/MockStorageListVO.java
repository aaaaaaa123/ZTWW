package nju.ztww.Mock_Storage;

import java.util.ArrayList;

import nju.ztww.vo.OrderVO;
import nju.ztww.vo.StorageListVO;

public class MockStorageListVO extends StorageListVO {
	String idOfCenter;
	ArrayList<OrderVO>arraylist;
  public MockStorageListVO() {
	// TODO Auto-generated constructor stub
	  super(idOfCenter, arraylist);
}
}
