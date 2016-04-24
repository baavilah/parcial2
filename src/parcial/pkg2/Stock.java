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
public class Stock extends ShareAsset{
    
    protected int totalShares;

    public Stock(int totalShares, String Symbol, double totalCost, double CurrentPrice) {
        super(Symbol, totalCost, CurrentPrice);
        this.totalShares = totalShares;
    }
    
    @Override
    public double getProfit(){
    return (totalShares*CurrentPrice)-totalCost; 
}
    @Override
    public double getMarketValue(){
        return totalShares*CurrentPrice;
    }

    public void setTotalShares(int totalShares) {
        this.totalShares = totalShares;
    }
    
}
