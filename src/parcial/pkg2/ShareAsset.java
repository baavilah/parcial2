/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial.pkg2;

/**
 *
 * @author Estudiante
 */
public abstract class ShareAsset implements Asset{
    
    protected String Symbol;
    protected double totalCost;
    protected double CurrentPrice;

    public ShareAsset(String Symbol, double totalCost, double CurrentPrice) {
        this.Symbol = Symbol;
        this.totalCost = totalCost;
        this.CurrentPrice = CurrentPrice;
    }
    
    

    public void setCurrentPrice(double CurrentPrice) {
        this.CurrentPrice = CurrentPrice;
    }

    


}
