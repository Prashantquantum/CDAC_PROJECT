package com.project.payroll_management_system.model;

import javax.persistence.CascadeType;
//import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

import org.springframework.web.multipart.MultipartFile;

@Table(name = "salary")
@Entity(name = "salary")

public class Salary {

//	private long salary_id;
//	private String salary_employee_id;
//	private String salary_month;
//	private String salary_working_days;
//	private String salary_basic;
//	private String salary_hra;
//	private String salary_mediclaim;
//	private String salary_ta;
//	private String salary_da;
//	private String salary_reimbursement;
//	private String salary_ca;
//	private String salary_others;
//	private String salary_dpf;
//	private String salary_dtax;
//	private String salary_desc;
//	private String salary_total;
//	private String salary_dedc;
//	private MultipartFile salary_slip;
//	private String salary_slip_filename;
	
	
	private long salary_id;
	private String salary_employee_id;
	private String salary_month;
	 @Min(value = 1, message = "Value must be at least 1")
	    @Max(value = 30, message = "Value cannot exceed 30")
	private int salary_working_days;
	private int salary_basic;
	private int salary_hra;
	private int salary_mediclaim;
	private int salary_ta;
	private int salary_da;
	private int salary_reimbursement;
	private int salary_ca;
	private int salary_others;
	private int salary_dpf;
	private int salary_dtax;
	private String salary_desc;
	private double salary_total;
	private int salary_dedc;
	private MultipartFile salary_slip;
	private String salary_slip_filename;
	
	
	public Salary() {
		
	}
	
	







public Salary(long salary_id, String salary_employee_id, String salary_month, int salary_working_days,
			int salary_basic, int salary_hra, int salary_mediclaim, int salary_ta, int salary_da,
			int salary_reimbursement, int salary_ca, int salary_others, int salary_dpf, int salary_dtax,
			String salary_desc, double salary_total, int salary_dedc, MultipartFile salary_slip,
			String salary_slip_filename) {
		super();
		this.salary_id = salary_id;
		this.salary_employee_id = salary_employee_id;
		this.salary_month = salary_month;
		this.salary_working_days = salary_working_days;
		this.salary_basic = salary_basic;
		this.salary_hra = salary_hra;
		this.salary_mediclaim = salary_mediclaim;
		this.salary_ta = salary_ta;
		this.salary_da = salary_da;
		this.salary_reimbursement = salary_reimbursement;
		this.salary_ca = salary_ca;
		this.salary_others = salary_others;
		this.salary_dpf = salary_dpf;
		this.salary_dtax = salary_dtax;
		this.salary_desc = salary_desc;
		this.salary_total = salary_total;
		this.salary_dedc = salary_dedc;
		this.salary_slip = salary_slip;
		this.salary_slip_filename = salary_slip_filename;
	}









//	public Salary(long salary_id, String salary_employee_id, String salary_month, String salary_working_days,
//			String salary_basic, String salary_hra, String salary_mediclaim, String salary_ta, String salary_da,
//			String salary_reimbursement, String salary_ca, String salary_others, String salary_dpf, String salary_dtax,
//			String salary_desc, String salary_total, String salary_dedc, MultipartFile salary_slip,
//			String salary_slip_filename) {
//		super();
//		this.salary_id = salary_id;
//		this.salary_employee_id = salary_employee_id;
//		this.salary_month = salary_month;
//		this.salary_working_days = salary_working_days;
//		this.salary_basic = salary_basic;
//		this.salary_hra = salary_hra;
//		this.salary_mediclaim = salary_mediclaim;
//		this.salary_ta = salary_ta;
//		this.salary_da = salary_da;
//		this.salary_reimbursement = salary_reimbursement;
//		this.salary_ca = salary_ca;
//		this.salary_others = salary_others;
//		this.salary_dpf = salary_dpf;
//		this.salary_dtax = salary_dtax;
//		this.salary_desc = salary_desc;
//		this.salary_total = salary_total;
//		this.salary_dedc = salary_dedc;
//		this.salary_slip = salary_slip;
//		this.salary_slip_filename = salary_slip_filename;
//	}	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public long getSalary_id() {
		return salary_id;
	}

	public String getSalary_slip_filename() {
		return salary_slip_filename;
	}

	

	public int getSalary_working_days() {
		return salary_working_days;
	}


	public void setSalary_working_days(int salary_working_days) {
		this.salary_working_days = salary_working_days;
	}


	public int getSalary_basic() {
		return salary_basic;
	}


	public void setSalary_basic(int salary_basic) {
		this.salary_basic = salary_basic;
	}


	public int getSalary_hra() {
		return salary_hra;
	}



	public void setSalary_hra(int salary_hra) {
		this.salary_hra = salary_hra;
	}



	public int getSalary_mediclaim() {
		return salary_mediclaim;
	}


	public void setSalary_mediclaim(int salary_mediclaim) {
		this.salary_mediclaim = salary_mediclaim;
	}


	public int getSalary_ta() {
		return salary_ta;
	}


	public void setSalary_ta(int salary_ta) {
		this.salary_ta = salary_ta;
	}



	public int getSalary_da() {
		return salary_da;
	}



	public void setSalary_da(int salary_da) {
		this.salary_da = salary_da;
	}


	public int getSalary_reimbursement() {
		return salary_reimbursement;
	}


	public void setSalary_reimbursement(int salary_reimbursement) {
		this.salary_reimbursement = salary_reimbursement;
	}


	public int getSalary_ca() {
		return salary_ca;
	}


	public void setSalary_ca(int salary_ca) {
		this.salary_ca = salary_ca;
	}


	public int getSalary_others() {
		return salary_others;
	}


	public void setSalary_others(int salary_others) {
		this.salary_others = salary_others;
	}



	public int getSalary_dpf() {
		return salary_dpf;
	}


	public void setSalary_dpf(int salary_dpf) {
		this.salary_dpf = salary_dpf;
	}


	public int getSalary_dtax() {
		return salary_dtax;
	}


	public void setSalary_dtax(int salary_dtax) {
		this.salary_dtax = salary_dtax;
	}


	public double getSalary_total() {
		return salary_total;
	}

	public void setSalary_total(double d) {
		this.salary_total = d;
	}

	public int getSalary_dedc() {
		return salary_dedc;
	}


	public void setSalary_dedc(int salary_dedc) {
		this.salary_dedc = salary_dedc;
	}


	public void setSalary_slip_filename(String salary_slip_filename) {
		this.salary_slip_filename = salary_slip_filename;
	}

	public void setSalary_id(long salary_id) {
		this.salary_id = salary_id;
	}



	public String getSalary_employee_id() {
		return salary_employee_id;
	}



	public void setSalary_employee_id(String salary_employee_id) {
		this.salary_employee_id = salary_employee_id;
	}



	public String getSalary_month() {
		return salary_month;
	}



	public void setSalary_month(String salary_month) {
		this.salary_month = salary_month;
	}

	public String getSalary_desc() {
		return salary_desc;
	}



	public void setSalary_desc(String salary_desc) {
		this.salary_desc = salary_desc;
	}

	
	public void setSalary_slip(MultipartFile salary_slip) {
		this.salary_slip = salary_slip;
	}


	@Override
	public String toString() {
		return "Salary [salary_id=" + salary_id + ", salary_employee_id=" + salary_employee_id + ", salary_month="
				+ salary_month + ", salary_working_days=" + salary_working_days + ", salary_basic=" + salary_basic
				+ ", salary_hra=" + salary_hra + ", salary_mediclaim=" + salary_mediclaim + ", salary_ta=" + salary_ta
				+ ", salary_da=" + salary_da + ", salary_reimbursement=" + salary_reimbursement + ", salary_ca="
				+ salary_ca + ", salary_others=" + salary_others + ", salary_dpf=" + salary_dpf + ", salary_dtax="
				+ salary_dtax + ", salary_desc=" + salary_desc + ", salary_total=" + salary_total + ", salary_dedc="
				+ salary_dedc + ", salary_slip=" + salary_slip + ", salary_slip_filename=" + salary_slip_filename + "]";
	}

//	public String getSalary_working_days() {
//		return salary_working_days;
//	}
//
//
//
//	public void setSalary_working_days(String salary_working_days) {
//		this.salary_working_days = salary_working_days;
//	}
//
//
//
//	public String getSalary_basic() {
//		return salary_basic;
//	}
//
//
//
//	public void setSalary_basic(String salary_basic) {
//		this.salary_basic = salary_basic;
//	}
//
//
//
//	public String getSalary_hra() {
//		return salary_hra;
//	}
//
//
//
//	public void setSalary_hra(String salary_hra) {
//		this.salary_hra = salary_hra;
//	}
//
//
//
//	public String getSalary_mediclaim() {
//		return salary_mediclaim;
//	}
//
//
//
//	public void setSalary_mediclaim(String salary_mediclaim) {
//		this.salary_mediclaim = salary_mediclaim;
//	}
//
//
//
//	public String getSalary_ta() {
//		return salary_ta;
//	}
//
//
//
//	public void setSalary_ta(String salary_ta) {
//		this.salary_ta = salary_ta;
//	}
//
//
//
//	public String getSalary_da() {
//		return salary_da;
//	}
//
//
//
//	public void setSalary_da(String salary_da) {
//		this.salary_da = salary_da;
//	}
//
//
//
//	public String getSalary_reimbursement() {
//		return salary_reimbursement;
//	}
//
//
//
//	public void setSalary_reimbursement(String salary_reimbursement) {
//		this.salary_reimbursement = salary_reimbursement;
//	}
//
//
//
//	public String getSalary_ca() {
//		return salary_ca;
//	}
//
//
//
//	public void setSalary_ca(String salary_ca) {
//		this.salary_ca = salary_ca;
//	}
//
//
//
//	public String getSalary_others() {
//		return salary_others;
//	}
//
//
//
//	public void setSalary_others(String salary_others) {
//		this.salary_others = salary_others;
//	}
//
//
//
//	public String getSalary_dpf() {
//		return salary_dpf;
//	}
//
//
//
//	public void setSalary_dpf(String salary_dpf) {
//		this.salary_dpf = salary_dpf;
//	}
//
//
//
//	public String getSalary_dtax() {
//		return salary_dtax;
//	}
//
//
//
//	public void setSalary_dtax(String salary_dtax) {
//		this.salary_dtax = salary_dtax;
//	}



//	public String getSalary_desc() {
//		return salary_desc;
//	}
//
//
//
//	public void setSalary_desc(String salary_desc) {
//		this.salary_desc = salary_desc;
//	}



//	public String getSalary_total() {
//		return salary_total;
//	}
//
//
//
//	public void setSalary_total(String salary_total) {
//		this.salary_total = salary_total;
//	}
//
//
//
//	public String getSalary_dedc() {
//		return salary_dedc;
//	}
//
//
//
//	public void setSalary_dedc(String salary_dedc) {
//		this.salary_dedc = salary_dedc;
//	}



	






	
	
	
}
























//package com.project.payroll_management_system.model;
//
//import javax.persistence.CascadeType;
////import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.OneToOne;
//import javax.persistence.Table;
//
//import org.springframework.web.multipart.MultipartFile;
//
//@Table(name = "salary")
//@Entity(name = "salary")
//
//public class Salary {
//
////	private long salary_id;
////	private String salary_employee_id;
////	private String salary_month;
////	private String salary_working_days;
////	private String salary_basic;
////	private String salary_hra;
////	private String salary_mediclaim;
////	private String salary_ta;
////	private String salary_da;
////	private String salary_reimbursement;
////	private String salary_ca;
////	private String salary_others;
////	private String salary_dpf;
////	private String salary_dtax;
////	private String salary_desc;
////	private String salary_total;
////	private String salary_dedc;
////	private MultipartFile salary_slip;
////	private String salary_slip_filename;
//	
//	
//	private long salary_id;
//	private String salary_employee_id;
//	private String salary_month;
//	private int salary_working_days;
//	private int salary_basic;
//	private int salary_hra;
//	private int salary_mediclaim;
//	private int salary_ta;
//	private int salary_da;
//	private int salary_reimbursement;
//	private int salary_ca;
//	private int salary_others;
//	private int salary_dpf;
//	private int salary_dtax;
//	private String salary_desc;
//	private int salary_total;
//	private int salary_dedc;
//	private MultipartFile salary_slip;
//	private String salary_slip_filename;
//	
//	
//	public Salary() {
//		
//	}
//	
//	
//
//
//
//
//
//
//
//public Salary(long salary_id, String salary_employee_id, String salary_month, int salary_working_days,
//			int salary_basic, int salary_hra, int salary_mediclaim, int salary_ta, int salary_da,
//			int salary_reimbursement, int salary_ca, int salary_others, int salary_dpf, int salary_dtax,
//			String salary_desc, int salary_total, int salary_dedc, MultipartFile salary_slip,
//			String salary_slip_filename) {
//		super();
//		this.salary_id = salary_id;
//		this.salary_employee_id = salary_employee_id;
//		this.salary_month = salary_month;
//		this.salary_working_days = salary_working_days;
//		this.salary_basic = salary_basic;
//		this.salary_hra = salary_hra;
//		this.salary_mediclaim = salary_mediclaim;
//		this.salary_ta = salary_ta;
//		this.salary_da = salary_da;
//		this.salary_reimbursement = salary_reimbursement;
//		this.salary_ca = salary_ca;
//		this.salary_others = salary_others;
//		this.salary_dpf = salary_dpf;
//		this.salary_dtax = salary_dtax;
//		this.salary_desc = salary_desc;
//		this.salary_total = salary_total;
//		this.salary_dedc = salary_dedc;
//		this.salary_slip = salary_slip;
//		this.salary_slip_filename = salary_slip_filename;
//	}
//
//
//
//
//
//
//
//
//
////	public Salary(long salary_id, String salary_employee_id, String salary_month, String salary_working_days,
////			String salary_basic, String salary_hra, String salary_mediclaim, String salary_ta, String salary_da,
////			String salary_reimbursement, String salary_ca, String salary_others, String salary_dpf, String salary_dtax,
////			String salary_desc, String salary_total, String salary_dedc, MultipartFile salary_slip,
////			String salary_slip_filename) {
////		super();
////		this.salary_id = salary_id;
////		this.salary_employee_id = salary_employee_id;
////		this.salary_month = salary_month;
////		this.salary_working_days = salary_working_days;
////		this.salary_basic = salary_basic;
////		this.salary_hra = salary_hra;
////		this.salary_mediclaim = salary_mediclaim;
////		this.salary_ta = salary_ta;
////		this.salary_da = salary_da;
////		this.salary_reimbursement = salary_reimbursement;
////		this.salary_ca = salary_ca;
////		this.salary_others = salary_others;
////		this.salary_dpf = salary_dpf;
////		this.salary_dtax = salary_dtax;
////		this.salary_desc = salary_desc;
////		this.salary_total = salary_total;
////		this.salary_dedc = salary_dedc;
////		this.salary_slip = salary_slip;
////		this.salary_slip_filename = salary_slip_filename;
////	}	
//	
//	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
//	public long getSalary_id() {
//		return salary_id;
//	}
//
//	public String getSalary_slip_filename() {
//		return salary_slip_filename;
//	}
//
//	
//
//	public int getSalary_working_days() {
//		return salary_working_days;
//	}
//
//
//	public void setSalary_working_days(int salary_working_days) {
//		this.salary_working_days = salary_working_days;
//	}
//
//
//	public int getSalary_basic() {
//		return salary_basic;
//	}
//
//
//	public void setSalary_basic(int salary_basic) {
//		this.salary_basic = salary_basic;
//	}
//
//
//	public int getSalary_hra() {
//		return salary_hra;
//	}
//
//
//
//	public void setSalary_hra(int salary_hra) {
//		this.salary_hra = salary_hra;
//	}
//
//
//
//	public int getSalary_mediclaim() {
//		return salary_mediclaim;
//	}
//
//
//	public void setSalary_mediclaim(int salary_mediclaim) {
//		this.salary_mediclaim = salary_mediclaim;
//	}
//
//
//	public int getSalary_ta() {
//		return salary_ta;
//	}
//
//
//	public void setSalary_ta(int salary_ta) {
//		this.salary_ta = salary_ta;
//	}
//
//
//
//	public int getSalary_da() {
//		return salary_da;
//	}
//
//
//
//	public void setSalary_da(int salary_da) {
//		this.salary_da = salary_da;
//	}
//
//
//	public int getSalary_reimbursement() {
//		return salary_reimbursement;
//	}
//
//
//	public void setSalary_reimbursement(int salary_reimbursement) {
//		this.salary_reimbursement = salary_reimbursement;
//	}
//
//
//	public int getSalary_ca() {
//		return salary_ca;
//	}
//
//
//	public void setSalary_ca(int salary_ca) {
//		this.salary_ca = salary_ca;
//	}
//
//
//	public int getSalary_others() {
//		return salary_others;
//	}
//
//
//	public void setSalary_others(int salary_others) {
//		this.salary_others = salary_others;
//	}
//
//
//
//	public int getSalary_dpf() {
//		return salary_dpf;
//	}
//
//
//	public void setSalary_dpf(int salary_dpf) {
//		this.salary_dpf = salary_dpf;
//	}
//
//
//	public int getSalary_dtax() {
//		return salary_dtax;
//	}
//
//
//	public void setSalary_dtax(int salary_dtax) {
//		this.salary_dtax = salary_dtax;
//	}
//
//
//	public int getSalary_total() {
//		return salary_total;
//	}
//
//	public void setSalary_total(int salary_total) {
//		this.salary_total = salary_total;
//	}
//
//	public int getSalary_dedc() {
//		return salary_dedc;
//	}
//
//
//	public void setSalary_dedc(int salary_dedc) {
//		this.salary_dedc = salary_dedc;
//	}
//
//
//	public void setSalary_slip_filename(String salary_slip_filename) {
//		this.salary_slip_filename = salary_slip_filename;
//	}
//
//	public void setSalary_id(long salary_id) {
//		this.salary_id = salary_id;
//	}
//
//
//
//	public String getSalary_employee_id() {
//		return salary_employee_id;
//	}
//
//
//
//	public void setSalary_employee_id(String salary_employee_id) {
//		this.salary_employee_id = salary_employee_id;
//	}
//
//
//
//	public String getSalary_month() {
//		return salary_month;
//	}
//
//
//
//	public void setSalary_month(String salary_month) {
//		this.salary_month = salary_month;
//	}
//
//	public String getSalary_desc() {
//		return salary_desc;
//	}
//
//
//
//	public void setSalary_desc(String salary_desc) {
//		this.salary_desc = salary_desc;
//	}
//
//	
//	public void setSalary_slip(MultipartFile salary_slip) {
//		this.salary_slip = salary_slip;
//	}
//
//
//	@Override
//	public String toString() {
//		return "Salary [salary_id=" + salary_id + ", salary_employee_id=" + salary_employee_id + ", salary_month="
//				+ salary_month + ", salary_working_days=" + salary_working_days + ", salary_basic=" + salary_basic
//				+ ", salary_hra=" + salary_hra + ", salary_mediclaim=" + salary_mediclaim + ", salary_ta=" + salary_ta
//				+ ", salary_da=" + salary_da + ", salary_reimbursement=" + salary_reimbursement + ", salary_ca="
//				+ salary_ca + ", salary_others=" + salary_others + ", salary_dpf=" + salary_dpf + ", salary_dtax="
//				+ salary_dtax + ", salary_desc=" + salary_desc + ", salary_total=" + salary_total + ", salary_dedc="
//				+ salary_dedc + ", salary_slip=" + salary_slip + ", salary_slip_filename=" + salary_slip_filename + "]";
//	}
//
////	public String getSalary_working_days() {
////		return salary_working_days;
////	}
////
////
////
////	public void setSalary_working_days(String salary_working_days) {
////		this.salary_working_days = salary_working_days;
////	}
////
////
////
////	public String getSalary_basic() {
////		return salary_basic;
////	}
////
////
////
////	public void setSalary_basic(String salary_basic) {
////		this.salary_basic = salary_basic;
////	}
////
////
////
////	public String getSalary_hra() {
////		return salary_hra;
////	}
////
////
////
////	public void setSalary_hra(String salary_hra) {
////		this.salary_hra = salary_hra;
////	}
////
////
////
////	public String getSalary_mediclaim() {
////		return salary_mediclaim;
////	}
////
////
////
////	public void setSalary_mediclaim(String salary_mediclaim) {
////		this.salary_mediclaim = salary_mediclaim;
////	}
////
////
////
////	public String getSalary_ta() {
////		return salary_ta;
////	}
////
////
////
////	public void setSalary_ta(String salary_ta) {
////		this.salary_ta = salary_ta;
////	}
////
////
////
////	public String getSalary_da() {
////		return salary_da;
////	}
////
////
////
////	public void setSalary_da(String salary_da) {
////		this.salary_da = salary_da;
////	}
////
////
////
////	public String getSalary_reimbursement() {
////		return salary_reimbursement;
////	}
////
////
////
////	public void setSalary_reimbursement(String salary_reimbursement) {
////		this.salary_reimbursement = salary_reimbursement;
////	}
////
////
////
////	public String getSalary_ca() {
////		return salary_ca;
////	}
////
////
////
////	public void setSalary_ca(String salary_ca) {
////		this.salary_ca = salary_ca;
////	}
////
////
////
////	public String getSalary_others() {
////		return salary_others;
////	}
////
////
////
////	public void setSalary_others(String salary_others) {
////		this.salary_others = salary_others;
////	}
////
////
////
////	public String getSalary_dpf() {
////		return salary_dpf;
////	}
////
////
////
////	public void setSalary_dpf(String salary_dpf) {
////		this.salary_dpf = salary_dpf;
////	}
////
////
////
////	public String getSalary_dtax() {
////		return salary_dtax;
////	}
////
////
////
////	public void setSalary_dtax(String salary_dtax) {
////		this.salary_dtax = salary_dtax;
////	}
//
//
//
////	public String getSalary_desc() {
////		return salary_desc;
////	}
////
////
////
////	public void setSalary_desc(String salary_desc) {
////		this.salary_desc = salary_desc;
////	}
//
//
//
////	public String getSalary_total() {
////		return salary_total;
////	}
////
////
////
////	public void setSalary_total(String salary_total) {
////		this.salary_total = salary_total;
////	}
////
////
////
////	public String getSalary_dedc() {
////		return salary_dedc;
////	}
////
////
////
////	public void setSalary_dedc(String salary_dedc) {
////		this.salary_dedc = salary_dedc;
////	}
//
//
//
//	
//
//
//
//
//
//
//	
//	
//	
//}
