package com.Test.homework;

import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import homework_project.HomePage;
import homework_project.LoginPage;
import homework_project.SearchPage;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestCases extends BaseTest{
	@Test
	
	public void test_1_homePageControl()
	{
		HomePage homePage=new HomePage(driver);
		driver.get(homePage.getUrl());
		//homePage.waitForPageLoad();
		System.out.println("title="+driver.getTitle());
		Assert.assertTrue(driver.getTitle().equals("n11.com-Alışverişin Uğurlu Adresi"));
		System.out.println("n11 alışveriş sitesibaşarılı bir şekilde açıldı");
		
		
	}
	@Test
	public void test_1_signIn()
	{
		LoginPage loginPage=new LoginPage(driver);
		loginPage.enterLoginForm("akkoksevgi@mail.com", "S12345");
		loginPage.submit();
		//loginPage.waitForPageLoad();
		Assert.assertTrue(loginPage.getUserName().equals("Sevgi Akkök"));
		System.out.println("Kullanıcı girişi başarılı");
		
	}
	
	@Test
	public void test_1_dataSearch() throws InterruptedException
	{
		SearchPage searchPage=new SearchPage(driver);
		searchPage.enterDataForSearch("bilgisayar");
		searchPage.submitForSearch();
		Thread.sleep(100);
		Assert.assertTrue(!searchPage.getCountResult().equals(""));
		System.out.println("Bilgisayar için sonuç bulundu");
		
	}
	
	@Test
	public void test_1_searchSecondPage() throws InterruptedException
	{
		Thread.sleep(200);
		SearchPage searchPage=new SearchPage(driver);
		searchPage.clickSecondButton();
		//searchPage.waitForPageLoad();
		Thread.sleep(100);
		Assert.assertTrue(driver.getTitle().contains("Bilgisayar - n11.com -2/"));
		System.out.println("İkinci sayfa başarılı bir şekilde açıldı");
		
	}
	
	

}
