/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.controladores;

/**
 *
 * @author LeoNa
 */
public class Car {

    String randomId;
    String randomBrand;
    int randomYear;
    String randomColor;
    int randomPrice;
    boolean randomSoldState;

    public Car(String randomId, String randomBrand, int randomYear, String randomColor, int randomPrice, boolean randomSoldState) {
        this.randomId = randomId;
        this.randomBrand = randomBrand;
        this.randomYear = randomYear;
        this.randomColor = randomColor;
        this.randomPrice = randomPrice;
        this.randomSoldState = randomSoldState;
    }
    

}
