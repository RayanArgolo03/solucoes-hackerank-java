package cavityMap;

import java.util.ArrayList;
import java.util.List;

public class CavityMap {


    public static void main(String[] args) {
        System.out.println(cavityMap(List.of("179443854", "961621369", "164139922", "968633951", "812882578", "257829163", "812438597", "176656233", "485773814")));
    }


    public static List<String> cavityMap(List<String> grid) {

        List<String> res = new ArrayList<>(grid);
        for (int i = 1; i < grid.size() - 1; i++) {

            String depth = grid.get(i);

            //Pode ter cavidade
            if (depth.length() >= 3) {

                for (int j = 1; j < depth.length() - 1; j++) {

                    if (depth.charAt(j) != 'X') {

                        int num = Integer.parseInt(String.valueOf(depth.charAt(j)));

                        int up = Integer.parseInt(String.valueOf(grid.get(i - 1).charAt(j)));
                        int down = Integer.parseInt(String.valueOf(grid.get(i + 1).charAt(j)));
                        int right = Integer.parseInt(String.valueOf(grid.get(i).charAt(j + 1)));
                        int left = Integer.parseInt(String.valueOf(grid.get(i).charAt(j - 1)));

                        boolean isCavity = (num > up && num > down && num > right && num > left);

                        if (isCavity) {
                            depth = depth.substring(0, j).concat("X").concat(depth.substring(j + 1));
                            res.set(i, depth);
                        }
                    }


                }

            }

        }

        return res;
    }
}
