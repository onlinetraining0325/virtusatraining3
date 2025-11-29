package com.java.spr;

public class HelloWorld {

  private String greeting;
  private String connectMsg;
  private String helpMsg;

  public String getGreeting() {
    return greeting;
  }

  public void setGreeting(String greeting) {
    this.greeting = greeting;
  }

  public String getConnectMsg() {
    return connectMsg;
  }

  public void setConnectMsg(String connectMsg) {
    this.connectMsg = connectMsg;
  }

  public String getHelpMsg() {
    return helpMsg;
  }

  public void setHelpMsg(String helpMsg) {
    this.helpMsg = helpMsg;
  }

  public void showInfo(String student) {
    System.out.println(greeting + student + "\n" +connectMsg + "\n" +helpMsg);
  }

}
