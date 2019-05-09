import java.util.Scanner;

public class Road {

    double distance;
    double duration;

    public Road(double distance, double duration) {
        this.distance = distance;
        this.duration = duration;

    }

    public static void main(String[] args) {
        Road[][] roadMatrix = new Road[5][5];

        roadMatrix[3][0] = new Road(2.5, 1.2);
        roadMatrix[1][3] = new Road(4.5, 1.7);
        roadMatrix[3][4] = new Road(2.7, 7.2);
        roadMatrix[1][2] = new Road(9.3, 5.2);
        roadMatrix[4][2] = new Road(12.1, 8.2);

        roadMatrix[3][1] = new Road(2, 1.6);
        roadMatrix[2][3] = new Road(1.6, 5.6);
        roadMatrix[4][4] = new Road(6.6, 1.1);
        roadMatrix[1][4] = new Road(3.4, 5.4);
        roadMatrix[4][0] = new Road(5.1, 2.2);
        showRoads(roadMatrix);

        boolean equal = false;
        while (!equal) {
            int[] indexArray = newIndex();
            int line = indexArray[0];
            int col = indexArray[1];

            if (line == col) {
                System.out.println("index invalid");
            } else {
                boolean findIndexValue = false;
                for (int i = 0; i < roadMatrix.length; i++) {
                    for (int j = 0; j < roadMatrix[i].length; j++) {
                        if (roadMatrix[line][col] == null) {
                            findIndexValue = true;
                        } else if (roadMatrix[i][j] == roadMatrix[line][col]) {
                            System.out.println(roadMatrix[i][j].distance + "-" + roadMatrix[i][j].duration);
                            showRoads(roadMatrix);
                            equal = true;

                        }
                    }
                }
                if (findIndexValue == true) {
                    System.out.println("the road doesn`t exist");
                    Scanner scanner = new Scanner(System.in);
                    String search = scanner.nextLine();
                    String[] myString = search.split("-");
                    double distance = Double.valueOf(myString[0]);
                    double duration = Double.valueOf(myString[1]);

                    addRoad(roadMatrix, line, col, distance, duration);
                    showRoads(roadMatrix);
                    equal = true;
                }
            }
        }
        System.out.println();
        showCityRoads(roadMatrix);
       /* for (int i = 0; i < roadMatrix.length; i++) {
            for (int j = 0; j < roadMatrix[i].length; j++) {
                if (roadMatrix[i][j] != null) {
                    System.out.println(roadMatrix[i][j].distance + " - " + roadMatrix[i][j].duration);
                }
            }
        }*/


    }

    public static int[] newIndex() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter new index: ");
        System.out.println();
        String search = scanner.nextLine();
        String[] myString = search.split("-");
        int line = Integer.valueOf(myString[0]);
        int col = Integer.valueOf(myString[1]);
        int[] indexArray = {line, col};
        return indexArray;

    }

    public static void showRoads(Road[][] roadMatrix) {
        for (int i = 0; i < roadMatrix.length; i++) {
            for (int j = 0; j < roadMatrix[i].length; j++) {
                if (roadMatrix[i][j] != null) {
                    System.out.println(roadMatrix[i][j].distance + " - " + roadMatrix[i][j].duration);
                }
            }
        }
    }

    public static void addRoad(Road[][] roadMatrix, int line, int col, double distance, double duration) {
        roadMatrix[line][col] = new Road(distance, duration);
    }

    public static void showCityRoads(Road[][] roadMatrix) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter city number: ");
        int searchCity = scanner.nextInt();
        System.out.println("the cities that have roads with " + searchCity + " are: ");
        for (int i = 0; i < roadMatrix.length; i++) {
            for (int j = 0; j < roadMatrix[i].length; j++) {
                if (i == searchCity && roadMatrix[i][j] != null) {
                    System.out.println(roadMatrix[i][j].distance + "-" + roadMatrix[i][j].duration);
                }
            }
        }
    }

}
