class Solution {
    public double[] convertTemperature(double celsius) {
        double[] result={-1,-1};
        double kelvin=celsius+273.15;
        double fahren=celsius*1.80+32.00;
        result[0]=kelvin;
        result[1]=fahren;
        return result;
    }
}