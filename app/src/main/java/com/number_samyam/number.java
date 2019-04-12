package com.number_samyam;

public class number {
    private int num;
    private String word;
    private String[] names ={"","One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Eleven",
            "Twelve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen","Eighteen","Nineteen"};
    private String[] tenname={"","Ten","Twenty","Thirty","Forty","Fifty","Sixty","Seventy","Eighty","Ninety"};

    public number(int num) {
        this.num = num;
    }

    public String Words(){
        if (num<20){
            word=(names[num]);
        }
        else if ((num/10)<10){
            int first,second;
            first= num/10;
            second= num%10;

            word=(tenname[first]+ names[second]);

        }
        else if ((num/10)>10){
            int first,second,third;
            String hundreds,tens,ones;
            first=num/100;
            num = num%100;
            second=num/10;
            third=num%10;

            hundreds= names[first]+" Hundred and ";
            tens= tenname[second];
            ones= names[third];
            word=(hundreds+tens+ones);
        }
        return word;
    }
}