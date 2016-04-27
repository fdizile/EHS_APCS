public int longestUphill(int[] elevation)
{
    // local variables
    int maxChange = 0;
    int changed, j, i;
    
    /**
     * @description Main for-loop and conditional.
     */
    for (i = 0; i < elevation.length; i++)
    {
        /**
         * @description Secondary for-loop and conditional.
         * @note Used to act as second buffer
         */
        for (j = i + 1; j < elevation.length; j++)
        {
            /**
             * @description the actual algorithim
             * TODO: Take another look later. Could've simplified
             */
            changed = (elevation[j] - elevation[i]);
            
            // Updates the maxChange value
            if (changed > maxChange)
            {
                maxChange = changed;
            }
            
        }
        
    }
    
    // return statement
    return maxChange;
}
