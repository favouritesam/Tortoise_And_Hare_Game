package chapterSeven;
public class TortoiseAndHareMain {
        public static void main(String[] args) {
            TortoiseAndHare game = new TortoiseAndHare();
            S  ystem.out.println("""
                BANG !!!!!!
                AND THEY'RE OFF!!!!
                """);
            try {
                do{
                    game.race();
                }while (game.getHareMove() < 70 && game.getTortoiseMove() < 70);
            }catch (IllegalArgumentException ignored){}
            if (game.getHareMove() >=70) System.out.println("Hare won the race");
            else System.out.println("Tortoise won the race");
        }
    }
