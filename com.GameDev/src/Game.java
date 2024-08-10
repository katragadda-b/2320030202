import java.util.*;

class Game
{
    private static Scanner read=new Scanner(System.in);
    private static Game player;
    private GameElementFactory factory;

    public static Game getPlayer()
    {
        if(player==null)
        {
            player=new Game();
        }
        return player;
    }

    public void setLevelFactory(GameElementFactory factory)
    {
        this.factory=factory;
    }

    public void getStats(int health)
    {
        System.out.println("health is "+health+"\n");
    }

    public void play()
    {
        int health=1000;
        System.out.println("choose difficulty\n1.Easy\n2.Hard\n");
        String difficulty=read.nextLine();


        Health addhealth=new Health();
        Shrek shrek=new Shrek();
        GoblinEnemy goblin=new GoblinEnemy();
        Dagger dagger=new Dagger();
        Sword sword=new Sword();


        difficulty=difficulty.toLowerCase();
        if(difficulty.equals("1")||difficulty.equals("easy"))
        {
            factory=new EasyLevelFactory();
            while(health>0)
        {
            Random r=new Random();
            int pwrup=10;
            int enemy=500;
            int move=r.nextInt(100)+1;

            if(0<=move&&move<=15&&pwrup>0)
            {
                health+=50;
                addhealth.activate();
                
            }
            else if (move>=16&&move<30)
            {
                health+=30;
                addhealth.activate();
            }
            else
            {
                if(move%2==0 && move<=80)
                {
                    System.out.println("\n\natacked by a goblin.");
                    goblin.attack();
                    health-=40;
                }

                else if(move%2==1&&move<=80)
                {
                    System.out.println("\n\natacked by a bunch of goblins.");
                    goblin.attack();
                    health-=60;
                }
                else
                {
                    System.out.println("you attacked a goblin");
                    dagger.use();
                    enemy-=100;
                }
            }

            if(enemy<=0&health>0)
            {
                System.out.println("You win");
            }


            System.out.println("Continye(y/n)");
            String c=read.nextLine();
            if(c=="n")
            {
                
               System.out.println("Game over"); 
               break;
            }
            
        }
        System.out.println("Game Over");

        }
        else if(difficulty.equals("2")||difficulty.equals("hard"))
        {
            factory=new HardLevelFactory();
            while(health>0)
        {
            Random r=new Random();
            int pwrup=10;
            int enemy=500;
            int move=r.nextInt(100)+1;

            if(0<=move&&move<=15&&pwrup>0)
            {
                health+=50;
                addhealth.activate();
                
            }
            else if (move>=16&&move<30)
            {
                health+=30;
                addhealth.activate();
            }
            else
            {
                if(move%2==0 && move<=80)
                {
                    System.out.println("\n\natacked by a goblin.");
                    goblin.attack();
                    health-=40;
                }

                else if(move%2==1&&move<=80)
                {
                    System.out.println("\n\natacked by shrek .");
                    shrek.attack();
                    health-=80;
                }
                else
                {
                    System.out.println("you attacked an enemy");
                    sword.use();
                    enemy-=100;
                }
            }
            if(enemy<=0&health>0)
            {
                System.out.println("You win");
            }

            
            System.out.println("Continye(y/n)");
            String c=read.nextLine();
            if(c=="n")
            {
                
               System.out.println("Game over"); 
               break;
            }
            
        }
        System.out.println("Game Over");

        }
        


    }

    public static void main(String[] args) {
        Game game =new Game();
        game.play();
    }
}