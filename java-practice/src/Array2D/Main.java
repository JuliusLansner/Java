package Array2D;
//x
public class Main {
    public static void main(String[] args){
        //2d array is an array of arrays. 2 ways of doing it.
        String[][] cars = new String[3][3];
        String[][] numbers = {{"1","2","3"},
                            {"4","5","6"},
                            {"7","8","9"}};
        cars[0][0] = "Camaro";
        cars[0][1] = "corvette";
        cars[0][2] = "Silverado";
        cars[1][0] = "Camaro1";
        cars[1][1] = "Corvette1";
        cars[1][2] = "silverado1";
        cars[2][0] = "Camaro2";
        cars[2][1] = "Corevette2";
        cars[2][2] = "silverado2";
    for(int i= 0; i<cars.length; i++){
        System.out.println();
        for(int j=0; j<cars[i].length; j++){
            System.out.print(cars[i][j]+" ");
            //xd
        }
    }
    }
}
