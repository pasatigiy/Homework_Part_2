public class Population3 {
    public static void main(String[] args) {
        int population0 = 10000000;
        for ( int f = 14, m = 8, i = 1; f>=7 && m>=6 && i<=10; f--, m--, i++){
            int populationI = population0 + population0*f/1000 - population0*m/1000;
            population0 = populationI;
            System.out.println("Population "+population0 + " fertility " +f+ " mortality "+m + " after " + i + " years");
//
            if ( m == 6){
                for (i=i+1 ; f>=7 && i<=10; f--, i++ ){
                    populationI = population0 + population0*f/1000 - population0*m/1000;
                    population0 = populationI;
                    System.out.println("Population "+population0 + " fertility " +f+ " mortality "+m + " after " + i + " years");
                }if ( f==7 ){ //не могу понять, почему этот цикл не работает. Что я не так сделал?
                    for (i=i+1 ; i<=10; i++){
                        populationI = population0 + population0*f/1000 - population0*m/1000;
                        population0 = populationI;
                        System.out.println(population0 + " " +f+ " "+m + " " + i);
                    }
                }
            }
                }
        int population10 = population0+population0*7/1000-population0*6/1000;

        System.out.println(" Population after 10 years " +population10);
            }

        }



