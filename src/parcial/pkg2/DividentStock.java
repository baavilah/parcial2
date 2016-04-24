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
public class DividentStock extends Stock{
    
    protected double dividends;

    public DividentStock(double dividends, int totalShares, String Symbol, double totalCost, double CurrentPrice) {
        super(totalShares, Symbol, totalCost, CurrentPrice);
        this.dividends = dividends;
    }
    
    
    
    @Override
    public double getMarketValue(){
        return getMarketValue()+dividends;
    }
    
    
}
