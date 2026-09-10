class Solution {
    public String intToRoman(int num) {
        StringBuilder roman = new StringBuilder();

        while(num != 0){
            if(num >= 900){
                if(num%1000 >= 900 && num < 1000){
                    roman.append("CM");
                    num -= 900;
                    continue;
                }
                roman.append("M");
                num -= 1000;
            } else if(num >= 400 ){
                if(num%500 >= 400 && num < 500){
                    roman.append("CD");
                    num -= 400;
                    continue;
                }
                roman.append("D");
                num -= 500;
            } else if(num >= 90){
                if(num%100 >= 90 && num < 100){
                    num -= 90;
                    roman.append("XC");
                    continue;
                }
                roman.append("C");
                num -= 100;
            } else if(num >= 40){
                if(num%50 >= 40 && num < 50){
                    roman.append("XL");
                    num -= 40;
                    continue;
                }
                roman.append("L");
                num -= 50;
            } else if(num >= 9){
                if(num%10>= 9 && num < 10){
                    roman.append("IX");
                    num -= 9;
                    continue;
                }
                roman.append("X");
                num -= 10;
            } else if(num >= 4){
                if(num%5 >= 4 && num < 5){
                    roman.append("IV");
                    num -= 4;
                    continue;
                }
                roman.append("V");
                num -= 5;
            } else{
                roman.append("I");
                num--;
            }
        }
        return roman.toString();
    }
}
