package com.example.demo.model.EmployeeManagement;

import java.io.Serializable;
import java.sql.Date;
import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Employee implements Serializable {

	private static final long serialVersionUID = 1L;
	
	
	@Id
	private int employeeId;
	private String firstName;
	private String lastName;
	private Date birthDate;
	private Date leavingDate;
	private String employeeCode;
	private String reason;
	private String resignation;
	private String specialNotes;
	private String gender;
	private String NIC;
	private String maritalStatus;
	private long bankAccountNo;
	private String currentAddress;
	private String homeAddress;
	private String city;
	private int postalCode;
	private long contactNo1;
	private long contactNo2;
	private String email;
	private String designation;
	private int experiencedLevel;
	private double basicSalary;
	private String certificates;
	private String cv;
	private int departmentId;
	private Date joinedDate;
	private String bank;
	private String leaveType;
	private String leaveReason;
	private Date leaveRequestedDate;
	private String leaveStartDate;
	private String leaveEndDate;
	private double bonus;
	private double allowances;
	private double deductions;
	private double total;
	private double etf;
	private double epfEmployee;
	private double epfEmployer;
	private Date payDate;
	private String remarks;
	private double additions;
	private int overTime;
	private double hourlyRate;
	private double grossSalary;
	private double tax;
	private double extraLeaves;
	private double decrements;
	private double increments;
	private String departmentName;
	private String profilePhoto;
	private String drivingLicense;
	private String bikeNo;
	private String userName;
	private String password;
	private String VehicleNo;
	private String availability;
	
	
	public String getEmployeeCode() {
		return employeeCode;
	}
	public void setEmployeeCode(String employeeCode) {
		this.employeeCode = employeeCode;
	}
	public Date getLeavingDate() {
		return leavingDate;
	}
	public void setLeavingDate(Date leavingDate) {
		this.leavingDate = leavingDate;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	public String getResignation() {
		return resignation;
	}
	public void setResignation(String resignation) {
		this.resignation = resignation;
	}
	public String getSpecialNotes() {
		return specialNotes;
	}
	public void setSpecialNotes(String specialNotes) {
		this.specialNotes = specialNotes;
	}
	public int getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public String getProfilePhoto() {
		return profilePhoto;
	}
	public void setProfilePhoto(String profilePhoto) {
		this.profilePhoto = profilePhoto;
	}
	public String getBank() {
		return bank;
	}
	public void setBank(String bank) {
		this.bank = bank;
	}
	public int getOverTime() {
		return overTime;
	}
	public void setOverTime(int overTime) {
		this.overTime = overTime;
	}
	public double getHourlyRate() {
		return hourlyRate;
	}
	public void setHourlyRate(double hourlyRate) {
		this.hourlyRate = hourlyRate;
	}
	public double getGrossSalary() {
		return grossSalary;
	}
	public void setGrossSalary(double grossSalary) {
		this.grossSalary = grossSalary;
	}
	public double getTax() {
		return tax;
	}
	public void setTax(double tax) {
		this.tax = tax;
	}
	public double getExtraLeaves() {
		return extraLeaves;
	}
	public void setExtraLeaves(double extraLeaves) {
		this.extraLeaves = extraLeaves;
	}
	public double getDecrements() {
		return decrements;
	}
	public void setDecrements(double decrements) {
		this.decrements = decrements;
	}
	public double getIncrements() {
		return increments;
	}
	public void setIncrements(double increments) {
		this.increments = increments;
	}
	public double getBonus() {
		return bonus;
	}
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	public double getAllowances() {
		return allowances;
	}
	public void setAllowances(double allowances) {
		this.allowances = allowances;
	}
	public double getDeductions() {
		return deductions;
	}
	public void setDeductions(double deductions) {
		this.deductions = deductions;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public double getEtf() {
		return etf;
	}
	public void setEtf(double etf) {
		this.etf = etf;
	}
	public double getEpfEmployee() {
		return epfEmployee;
	}
	public void setEpfEmployee(double epfEmployee) {
		this.epfEmployee = epfEmployee;
	}
	public double getEpfEmployer() {
		return epfEmployer;
	}
	public void setEpfEmployer(double epfEmployer) {
		this.epfEmployer = epfEmployer;
	}
	
	public Date getPayDate() {
		return payDate;
	}
	public void setPayDate(Date payDate) {
		this.payDate = payDate;
	}
	
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	public double getAdditions() {
		return additions;
	}
	public void setAdditions(double additions) {
		this.additions = additions;
	}
	public String getLeaveType() {
		return leaveType;
	}
	public void setLeaveType(String leaveType) {
		this.leaveType = leaveType;
	}
	public String getLeaveReason() {
		return leaveReason;
	}
	public void setLeaveReason(String leaveReason) {
		this.leaveReason = leaveReason;
	}
	public Date getLeaveRequestedDate() {
		return leaveRequestedDate;
	}
	public void setLeaveRequestedDate(Date leaveRequestedDate) {
		this.leaveRequestedDate = leaveRequestedDate;
	}
	public String getLeaveStartDate() {
		return leaveStartDate;
	}
	public void setLeaveStartDate(String leaveStartDate) {
		this.leaveStartDate = leaveStartDate;
	}
	public String getLeaveEndDate() {
		return leaveEndDate;
	}
	public void setLeaveEndDate(String leaveEndDate) {
		this.leaveEndDate = leaveEndDate;
	}
	public String getAvailability() {
		return availability;
	}
	public void setAvailability(String availability) {
		this.availability = availability;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Date getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getNIC() {
		return NIC;
	}
	public void setNIC(String nIC) {
		NIC = nIC;
	}
	public String getMaritalStatus() {
		return maritalStatus;
	}
	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}
	public String getCurrentAddress() {
		return currentAddress;
	}
	public void setCurrentAddress(String currentAddress) {
		this.currentAddress = currentAddress;
	}
	public String getHomeAddress() {
		return homeAddress;
	}
	public void setHomeAddress(String homeAddress) {
		this.homeAddress = homeAddress;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(int postalCode) {
		this.postalCode = postalCode;
	}
	public long getBankAccountNo() {
		return bankAccountNo;
	}
	public void setBankAccountNo(long bankAccountNo) {
		this.bankAccountNo = bankAccountNo;
	}
	public long getContactNo1() {
		return contactNo1;
	}
	public void setContactNo1(long contactNo1) {
		this.contactNo1 = contactNo1;
	}
	public long getContactNo2() {
		return contactNo2;
	}
	public void setContactNo2(long contactNo2) {
		this.contactNo2 = contactNo2;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public int getExperiencedLevel() {
		return experiencedLevel;
	}
	public void setExperiencedLevel(int experiencedLevel) {
		this.experiencedLevel = experiencedLevel;
	}
	public double getBasicSalary() {
		return basicSalary;
	}
	public void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}
	public String getCertificates() {
		return certificates;
	}
	public void setCertificates(String certificates) {
		this.certificates = certificates;
	}
	public String getCv() {
		return cv;
	}
	public void setCv(String cv) {
		this.cv = cv;
	}
	
	public Date getJoinedDate() {
		return joinedDate;
	}
	public void setJoinedDate(Date joinedDate) {
		this.joinedDate = joinedDate;
	}
	public String getDrivingLicense() {
		return drivingLicense;
	}
	public void setDrivingLicense(String drivingLicense) {
		this.drivingLicense = drivingLicense;
	}
	public String getBikeNo() {
		return bikeNo;
	}
	public void setBikeNo(String bikeNo) {
		this.bikeNo = bikeNo;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getVehicleNo() {
		return VehicleNo;
	}
	public void setVehicleNo(String vehicleNo) {
		VehicleNo = vehicleNo;
	}
	
}
