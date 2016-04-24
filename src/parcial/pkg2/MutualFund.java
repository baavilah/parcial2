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
public class MutualFund extends ShareAsset{
    
    protected double totalShares;
    
    
        @Override
    public double getProfit(){
    return (totalShares*CurrentPrice)-totalCost; 
}
    
        @Override
    public double getMarketValue(){
        return totalShares*CurrentPrice;
    }
    
    
    
}
