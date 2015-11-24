package nju.ztww.vo;

/**
 * 车辆管理VO
 * 
 * @author TQ
 *
 */
public class CarManageVO extends OrderVO {

	private int idOfOrde;
	private String carNumber;
	private String plateNUmber;
	private String serviceTime;
	private String carState;
	
	public CarManageVO(int idOfOrder) {
		super(idOfOrder);
		this.idOfOrde=idOfOrder;
	}

	public String getCarState() {
		return carState;
	}

	public void setCarState(String carState) {
		this.carState = carState;
	}

	public int getIdOfOrde() {
		return idOfOrde;
	}

	public void setIdOfOrde(int idOfOrde) {
		this.idOfOrde = idOfOrde;
	}

	public String getCarNumber() {
		return carNumber;
	}

	public void setCarNumber(String carNumber) {
		this.carNumber = carNumber;
	}

	public String getPlateNUmber() {
		return plateNUmber;
	}

	public void setPlateNUmber(String plateNUmber) {
		this.plateNUmber = plateNUmber;
	}

	public String getServiceTime() {
		return serviceTime;
	}

	public void setServiceTime(String serviceTime) {
		this.serviceTime = serviceTime;
	}

}
