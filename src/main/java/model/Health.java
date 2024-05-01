package model;

import java.io.Serializable;

public class Health implements Serializable {
  private double height, weight, bmi;
  private String bodyType;
  private String test = "1";

  public String getTest() {
	return test;
}

public void setTest(String test) {
	this.test = test;
}

@Override
public String toString() {
	return "Health [height=" + height + ", weight=" + weight + ", bmi=" + bmi + ", bodyType=" + bodyType + "]";
}

public double getHeight() {
    return height;
  }

  public void setHeight(Double height) {
    this.height = height;
  }

  public double getWeight() {
    return weight;
  }

  public void setWeight(Double weight) {
    this.weight = weight;
  }

  public void setBmi(Double bmi) {
    this.bmi = bmi;
  }

  public double getBmi() {
    return this.bmi;
  }

  public void setBodyType(String bodyType) {
    this.bodyType = bodyType;
  }

  public String getBodyType() {
    return this.bodyType;
  }
}