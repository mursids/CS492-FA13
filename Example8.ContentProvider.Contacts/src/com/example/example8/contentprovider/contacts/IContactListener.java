package com.example.example8.contentprovider.contacts;


public interface IContactListener
{
	public void onContactSelected(long id);
	public String getContactName();
	public String getPhoneNumber();
	public String getPhoneNumberType();
}
