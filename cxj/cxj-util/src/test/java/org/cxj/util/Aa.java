package org.cxj.util;

public class Aa {
  private Aa(){
	  
  }
  private static class Ba{
	  static Aa instance = new Aa();
  }
  public static Aa getInstance(){
	  return Ba.instance;
  }
}

