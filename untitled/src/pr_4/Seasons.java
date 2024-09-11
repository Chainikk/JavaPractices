package pr_4;

import pr_4.List_of_Seasons;

public class Seasons {
    public static void main(String[] args){
        List_of_Seasons fav_s = List_of_Seasons.SUMMER;
        System.out.println(fav_s.toString()+": " + fav_s.getT()+"°C. " + fav_s.getDescription());
        love_season(fav_s);
        System.out.println();
        List_of_Seasons[] seasons = List_of_Seasons.values();
        for (List_of_Seasons s : seasons) {
            System.out.println(s.toString()+": "+s.getT()+"°C. "+s.getDescription());
        }
    }
    static void love_season(List_of_Seasons s) {
        String season = s.toString();
        switch(season) {
            case "AUTUMN":
                System.out.println("Я люблю осень!");
                break;
            case "SUMMER":
                System.out.println("Я люблю лето!");
                break;
            case "WINTER":
                System.out.println("Я люблю зиму!");
                break;
            case "SPRING":
                System.out.println("Я люблю весну!");
                break;
        }
    }
}
