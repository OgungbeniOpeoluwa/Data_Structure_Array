package chapter7;

public class PixelQuantization {

    public static int [] pixelQuantizationFunction(int [] arrays) {
        for(int count = 0; count < arrays.length;count++){
            if(arrays[count] >= 0 && arrays[count] <= 20){
                arrays[count] = 10;
            }
            else if(arrays[count] >= 21 && arrays[count] <= 40){
                arrays[count] = 30;
            }
            else if(arrays[count] >= 41 && arrays[count] <= 60){
                arrays[count] = 50;
            }
            else if(arrays[count] >= 61 && arrays[count] <= 80){
                arrays[count] = 70;
            }
            else if(arrays[count] >= 81 && arrays[count] <= 100){
                arrays[count] = 90;
            }
            else if(arrays[count] >= 101 && arrays[count] <= 120){
                arrays[count] = 110;
            }
            else if(arrays[count] >= 121 && arrays[count] <= 140){
                arrays[count] = 130;
            }
            else if(arrays[count] >= 141 && arrays[count] <= 160){
                arrays[count] = 150;
            }
            else if(arrays[count] >= 161 && arrays[count] <= 180){
                arrays[count] = 170;
            }
            else{
                arrays[count] = 190;
            }
        }
        return arrays;
    }

}
