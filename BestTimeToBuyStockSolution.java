class BestTimeToBuySolution {
    public int maxProfit(int[] prices) {
        
        int l = prices.length;
        int buy=Integer.MAX_VALUE;
        int maxProfit=0;
        int currProfit=0;
      
        for(int i=0; i<l;i++)
        {
            if(prices[i]<buy)
            {
                buy=prices[i];
            }
            
            currProfit = prices[i]-buy;
            
            if(currProfit>maxProfit)
            {
                maxProfit=currProfit;
            }
                
                
        }
    return maxProfit;
    }

    }