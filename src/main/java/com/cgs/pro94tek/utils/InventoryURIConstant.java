package com.cgs.pro94tek.utils;

public class InventoryURIConstant {
	
	public static final String DUMMY_URI = "/protek/emp/dummy";
	public static final String AUTHENTICATE_USER = "/protek/authenticate/{username}/{password}";
	public static final String GET_INVENTORY_DETAILS = "/protek/inventory/details/{id}";
	public static final String GET_PATIENT_VOUCHER_DETAILS = "/protek/patientvoucher/details/{userid}";
	public static final String GET_CATEGORY_DETAILS = "/protek/category/details/{id}";
	public static final String POST_CATEGORY_DETAILS = "/protek/category";
	
	public static final String GET_SCHOOL_DETAILS = "/protek/school/details/{schoolId}";
	public static final String CREATE_SCHOOL_DETAILS = "/protek/school";
	public static final String PUT_SCHOOL_DETAILS = "/protek/school/details/update/{schoolId}";
	public static final String DELETE_SCHOOL_DETAILS = "/protek/school/details/delete/{schoolId}";
	
	public static final String GET_INVENTORY_BANK_DETAILS = "/protek/inventory/bank/details/{id}";
	public static final String CREATE_INVENTORY = "/protek/inventory/create";
	public static final String DELETE_INVENTORY_BANK = "/protek/inventory/bank/delete/{id}";
	public static final String CREATE_INVENTORY_BANK = "/protek/inventory/bank/create";
	
	public static final String GET_TAX_DETAILS = "/protek/tax/details/{taxId}";
	//public static final String GET_ALL_TAX_DETAILS = "/protek/tax/details/";
	public static final String CREATE_TAX_DETAILS = "/protek/tax";
	public static final String PUT_TAX_DETAILS = "/protek/tax/details/update/{taxId}";
	public static final String DELETE_TAX_DETAILS = "/protek/tax/details/delete/{taxId}";
	
	public static final String GET_CHARGE_DETAILS = "/protek/charge/details/{chargeId}";
	public static final String CREATE_CHARGE_DETAILS = "/protek/charge";
	public static final String PUT_CHARGE_DETAILS = "/protek/charge/details/update/{chargeId}";
	public static final String DELETE_CHARGE_DETAILS = "/protek/charge/details/delete/{chargeId}";
	
	public static final String GET_SERVICE_DETAILS = "/protek/service/details/{serviceId}";
	public static final String CREATE_SERVICE_DETAILS = "/protek/service";
	public static final String PUT_SERVICE_DETAILS = "/protek/service/details/update/{serviceId}";
	public static final String DELETE_SERVICE_DETAILS = "/protek/service/details/delete/{serviceId}";
	
	public static final String GET_WARD_DETAILS = "/protek/ward/details/{wardId}";
	public static final String CREATE_WARD_DETAILS = "/protek/ward";
	public static final String PUT_WARD_DETAILS = "/protek/ward/details/update/{wardId}";
	public static final String DELETE_WARD_DETAILS = "/protek/ward/details/delete/{wardId}";
	
	public static final String GET_COMPANY_DETAILS = "/protek/company/details/{companyId}";
	public static final String CREATE_COMPANY_DETAILS = "/protek/company";
	public static final String PUT_COMPANY_DETAILS = "/protek/company/details/update/{companyId}";
	public static final String DELETE_COMPANY_DETAILS = "/protek/company/details/delete/{companyId}";
	
	public static final String GET_ROOM_DETAILS = "/protek/room/details/{roomId}";
	public static final String CREATE_ROOM_DETAILS = "/protek/room";
	public static final String PUT_ROOM_DETAILS = "/protek/room/details/update/{roomId}";
	public static final String DELETE_ROOM_DETAILS = "/protek/room/details/delete/{roomId}";

}
