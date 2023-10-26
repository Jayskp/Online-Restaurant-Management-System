import javax.swing.plaf.synth.SynthTextAreaUI;
import java.awt.*;
import java.net.StandardSocketOptions;
import java.util.*;
class Main
{
    public static void main(String args[])
    {
        Scanner sin = new Scanner(System.in);
        System.out.println("To login in your account please enter Your email id");
        System.out.println("Your default password created by system is 1@#45");
        Password p = new Password();
        Login l = new Login();
        System.out.println("-----Welcome to Bhukhad Portal-----");
        int i = 1;
        while(i<4)
        {
            System.out.println("Enter your default password");
            String n = sin.next();
            if(n.compareTo("1@#45")==0)
            {
                System.out.println("--Correct Password--");
                System.out.println();
                System.out.println("  Choose an option :");
                //System.out.println("1 - Password change :");
                System.out.println("1 - Login");
                System.out.println("2 - Exit");
                System.out.println();
                System.out.println("Choose an option");
                int x = sin.nextInt();
                switch (x)
                {
                    // case 1 : p.checkPass();
                        // break;
                    case 1 : l.log();
                        l.food();
                        break;
                    case 2 : break;
                    default: System.out.println("You have exited the portal");
                }
                break;
            }
        }
    }
}

// class Password
// {
    // String pass = "1@#45";
    // void checkPass()
    // {
        // int count = 1;
        // while(true) {
            // Scanner sin = new Scanner(System.in);
            // System.out.println("Enter your new Password");
            // String str = sin.nextLine();
            // char s[] = str.toCharArray();
            // if (str.length() != 8) {
                // System.out.println("Password should not contain more than 8 characters");
                // continue;
            // }
            // int i;
            // for ( i = 0; i < str.length(); i++) ;
            // {
                // if(!(s[i]>47 && s[i]<58))
                // {
                    // System.out.println("Space and punctuations not allowed");
                    // continue;
                // }
            // }
            // System.out.println("New Password has been changed");
            // pass = str;
            // break;
        // }
    // }
// }

class Login extends Restaurant {
    void log() {
        Scanner sin = new Scanner(System.in);
        System.out.println("Enter your address");
        String address = sin.nextLine();
		sin.nextLine();
        System.out.println("-----You have your completed your Login-----");
    }

    void food() {
        Scanner sin = new Scanner(System.in);
        System.out.println("To choose food type enter a to c");
        System.out.println("---- 1) a - Indian -----");
        System.out.println("---- 2) b - Continental -----");
        System.out.println("---- 2) c - Chinese -----");
        String k = sin.next();
        switch (k) {
            case "a":
                System.out.println("Indian");
                res();
                break;
            case "b" :
                System.out.println("Continental");
                res1();
                break;
            case "c" :
                System.out.println("Chinese");
                res2();
                break;
        }
    }
}
class Restaurant
{
   
	MenuItem Gormohitems[] = new MenuItem[] {new MenuItem("Plain Roti", 45), new MenuItem("Butter Roti", 60),
            new MenuItem("Naan/Paratha/Kulcha", 95), new MenuItem("Lachchha Paratha", 99),new MenuItem("Missi Roti", 89),
            new MenuItem("Cheese Naan", 169), new MenuItem("CTC Naan", 195), new MenuItem("Pudina Paratha", 99),new MenuItem("Bali Paneer (400gm)", 419),new MenuItem("Baked Paneer Hawa Mahal (400gm)" ,436 ),
            new MenuItem("Sufiyani Paneer Lababdar (400gm)",436), new MenuItem("Sufiyani Paneer Lababdar",419)};
    Restaurant2 Gormoh = new Restaurant2("Gormoh", Gormohitems);




    MenuItem1 MangoItems[] = new MenuItem1[] {new MenuItem1("Halwa Tasting platter", 550),
            new MenuItem1("Mango Rasmalai cheese cake Rabdi", 450),
            new MenuItem1("Gulab jammun sundae", 550),
            new MenuItem1("Kaju Akhrot Halwa", 250),
            new MenuItem1("laccha Rabdi", 230),
            new MenuItem1("Deconstructed Laddu", 250),new MenuItem1("pink Panther", 260),
            new MenuItem1("Popcorn Cooler", 260),
            new MenuItem1("Mickey Mouse Pizza", 450),
            new MenuItem1("French Fries", 300),
            new MenuItem1("Cheese Balls", 350)};
    Restaurant2 Mango = new Restaurant2("Mango", MangoItems);

 

    MenuItem2 MHItems[] = new MenuItem2[] {new MenuItem2("Sabji Aapki Pasand", 259),
            new MenuItem2("VEg. Makhanwala", 259),
            new MenuItem2("Veg. Hara Masala", 259),
            new MenuItem2("Veg kohlapuri", 259),
            new MenuItem2("Veg Kadai", 259),
            new MenuItem2("Veg Bhuna Masala", 259),
            new MenuItem2("Veg Methi Mutter Masala", 259),new MenuItem2("Plain Roti", 30),
            new MenuItem2("Butter Roti", 35),
            new MenuItem2("Roti (Makkai / Missi)", 55),
            new MenuItem2("Plain Paratha", 49)
    , new MenuItem2("Butter Paratha", 60)};
    Restaurant2 Mehfil = new Restaurant2("Mehfil", MHItems);



    MenuItem3 MaItems[] = new MenuItem3[] {new MenuItem3("Quesadillas", 590),
            new MenuItem3("Tamale", 590),
            new MenuItem3("Turkish Tetrazzini", 460),
            new MenuItem3("Baked Casanova", 440),
            new MenuItem3("Mac and Cheese", 440)
    ,new MenuItem3("Curried Au Gratin", 440),
            new MenuItem3("Peppered Cottage Cheese", 490),
            new MenuItem3("Anglo-Norman", 490),new MenuItem3("Lasagna", 490),
            new MenuItem3("Earthen Pot Mexican", 550),new MenuItem3("Triamisu Cookie Cream", 290),
            new MenuItem3("Double Layered English Toffee Brownie Shake", 270),
            new MenuItem3("Electric Honey Dew Melon", 290),
            new MenuItem3("lavenders Magic", 290),
            new MenuItem3("Water Bubble Slurp", 270),
            new MenuItem3("Magic Berries", 270),
            new MenuItem3("Jug of Mojito", 450)};

    Restaurant2 HouseOfMakeba = new Restaurant2("HouseOfMakeba", MaItems);
    // MenuItem3 MaItems1[] = new MenuItem3[] {new MenuItem3("Triamisu Cookie Cream", 290),
            // new MenuItem3("Double Layered English Toffee Brownie Shake", 270),
            // new MenuItem3("Electric Honey Dew Melon", 290),
            // new MenuItem3("lavenders Magic", 290),
            // new MenuItem3("Water Bubble Slurp", 270),
            // new MenuItem3("Magic Berries", 270),
            // new MenuItem3("Jug of Mojito", 450)};




    MenuItems4[] VaItems = new MenuItems4[] {new MenuItems4("Malfatti Peperoncini Marinara", 700),
            new MenuItems4("Burrata Pesto Pinenuts Rigatoni", 825),
            new MenuItems4("Pasta Burrata Al pistacho Arrabiata", 825),
            new MenuItems4("Ravioli Pink Pony", 700),
            new MenuItems4("Baba Ghannoush - Ravioli - Smoked Cheese", 725),
            new MenuItems4("Rigatoni Arrabita", 625),
            new MenuItems4("Rigatoni Carbonara", 675),
            new MenuItems4("Spaghetti Agilo E Olio" , 655),
            new MenuItems4("Spaghetti Pesto", 675),new MenuItems4("Mango's Favorite", 290),
            new MenuItems4("Honey-dew melon & Berry Daiquiri", 270),
            new MenuItems4("Masala Badam Soother", 270),
            new MenuItems4("Phirnee Rose Falooda", 290),
            new MenuItems4("Very Very Indian", 260),
            new MenuItems4("Cashmere", 290),
            new MenuItems4("Spice Of Life", 260)};

    Restaurant2 VariTea = new Restaurant2("VariTea", VaItems);
    // MenuItems4[] VaItems1 = new MenuItems4[] {new MenuItems4("Mango's Favorite", 290),
            // new MenuItems4("Honey-dew melon & Berry Daiquiri", 270),
            // new MenuItems4("Masala Badam Soother", 270),
            // new MenuItems4("Phirnee Rose Falooda", 290),
            // new MenuItems4("Very Very Indian", 260),
            // new MenuItems4("Cashmere", 290),
            // new MenuItems4("Spice Of Life", 260)};

    //Restaurant2 VariTea1 = new Restaurant2("VariTea", VaItems1, VaItems1);

    MenuItems5[] MuItems = new MenuItems5[] {new MenuItems5("Mezze Platter", 790),
            new MenuItems5("Cheese Platter", 1200),
            new MenuItems5("7-Layer Dip", 660),
            new MenuItems5("Swiss Style Fondue", 850),
            new MenuItems5("Swiss Style Fondue", 850),
            new MenuItems5("Nachos Mexicano", 675),
            new MenuItems5("Cheesy Nachos", 465),new MenuItems5("Grilled Panzanella Salad", 425),
            new MenuItems5("Fresh Green Salad", 375),
            new MenuItems5("Crispy Roomali Roti Tossed", 375)};

    Restaurant2 Muse = new Restaurant2("Muse", MuItems);
    // MenuItems5[] MuItems1 = new MenuItems5[] {new MenuItems5("Grilled Panzanella Salad", 425),
            // new MenuItems5("Fresh Green Salad", 375),
            // new MenuItems5("Crispy Roomali Roti Tossed", 375)};


    MenuItem6[] GrItems = new MenuItem6[] {new MenuItem6("Chiang Mai Curried Noodeles", 685),
            new MenuItem6("Teriyaki Stir Fried Noodles", 650),
            new MenuItem6("Thai RIver Noodles", 590),
            new MenuItem6("Chilli Garlic Noodles", 600),
            new MenuItem6("Chinese Hot Pot", 750),
            new MenuItem6("Penang Curry - Green Dumpling", 730),
            new MenuItem6("Silken Tofu - Vienamese Curry", 730),
            new MenuItem6("Oriental Grill", 750),
            new MenuItem6("Clay Pot Vegetables in chilli Base Sauce", 730),
            new MenuItem6("Exotic Vegetables in Black Peper Sauce", 730),
            new MenuItem6("Balinese Curry", 740),
            new MenuItem6("Thai Green Curry", 730)};

    Restaurant2 THeGreatWall = new Restaurant2("TheGreatWall", GrItems);

    MenuItem7[] YaItems = new MenuItem7[] {new MenuItem7("Veg Satellite", 666),
            new MenuItem7("Paneer Shahshlik", 781),
            new MenuItem7("Spicy Paneer Babycorn", 791),
            new MenuItem7("Spicy Tossed Vegetable Sizzler", 619),
            new MenuItem7("Healthy Exotic Vegetable (Diet - Special)", 774),
            new MenuItem7("Hunan Style Paneer Sizzler", 774)
           ,new MenuItem7("Veg with Spaghetti and Cheese Sizzler",738),
            new MenuItem7("Veg Sizzler Mashed Potato and Cheese", 660)};

   Restaurant2 Yanki = new Restaurant2("Yanki", YaItems);

    void res() {
        Scanner sin = new Scanner(System.in);
        boolean flag1 = true;
		
			System.out.println("To choose Restraunt for Indian food enter a to c");
			System.out.println("1) a - Gormoh Restaurant");
			System.out.println("2) b - Mango's Sweetness");
			System.out.println("3) c - Mehfil Restaurant");
	
			String restaurant = "";
			String k = sin.next();
			restaurant = k;
			switch (k) {
				case "a": Gormoh.printMenu();
				break;
					case "b": Mango.printMenu1();
					break;
					case "c": Mehfil.printMenu2();
					break;
			}
			chooseItem(restaurant);
		
    }
    void res1()
    {
        Scanner sin = new Scanner(System.in);
        System.out.println("To choose Cafe or Restaurant  for Continental food enter a to c");
        System.out.println("1) a -  House of Makeba");
        System.out.println("2) b - VariTea");
        System.out.println("3) c - Muse");
        String restaurant = "";

        String k = sin.next();
        restaurant = k;
        switch (k) {
            case "a" : HouseOfMakeba.printMenu3();
            break;
            case "b" : VariTea.printMenu4();
            break;
            case "c" : Muse.printMenu5();
			break; 
        }
        Chooseitem1(restaurant);
        }
    void res2()
    {
        Scanner sin = new Scanner(System.in);
        System.out.println("To choose Cafe or Restaurant  for Chinese  food enter e to g");
        System.out.println("1) a - The Great Wall");
        System.out.println("2) b - Yanki sizzler");
        
        String restaurant = "";

        String k = sin.next();
        restaurant = k;
        switch (k) {
            case "a" : THeGreatWall.printMenu6();
                break;
            case "b" : Yanki.printMenu7();
                break;
            case "c" :
        }
        Chooseitem2(restaurant);
    }

    void chooseItem(String res)
    {
        int total = 0;
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        do
        {

            switch (res)
            {
                case "a" :
                

                    System.out.println();
                    System.out.println(Gormohitems[i-1].name + " " + Gormohitems[i-1].price + "Rs");
					total += Gormohitems [i-1].price;
                    System.out.println();

				break;
                
                case "b" : 
                    System.out.println();
                    System.out.println(MangoItems[i - 1].name + " " + MangoItems[i - 1].price + "Rs");
                    System.out.println();

                    System.out.println();
                    //System.out.println(MangoItems1[i - 1].name + " " + MangoItems1[i - 1].price + "Rs");
                    total += MangoItems[i - 1].price;
				break;
                
                case "c" :
				
                    System.out.println();
                    System.out.println(MHItems[i-1].name + " " + MHItems[i-1].price + "Rs");
                    System.out.println();

                    // System.out.println();
                    // System.out.println(MHItems1[i-1].name + " " + MHItems1[i-1].price + "Rs");
                    total += MHItems[i-1].price;
				break;
				
            }
            i = sc.nextInt();
            

        }while(i!=0);
        System.out.println(total + "Rs");
    }

    void Chooseitem1(String res) {
        int total = 0;
        Scanner sin = new Scanner(System.in);
        int i = sin.nextInt();
        do
        {
            switch(res)
            {
                case "a" :
                
                    System.out.println();
                    System.out.println(MaItems[i-1].name + " " + MaItems[i-1].price + "Rs");
                    System.out.println();

                    //System.out.println();
                   // System.out.println(MaItems1[i-1].name + " " + MaItems1[i-1].price + "Rs");
                    total += MaItems[i-1].price;
				break;
                
                case "b":
                
                    System.out.println();
                    System.out.println(VaItems[i-1].name + " " + VaItems[i-1].price + "Rs");
                    System.out.println();

                    //System.out.println();
                   // System.out.println(VaItems1[i-1].name + " " + VaItems1[i-1].price + "Rs");
                    total += VaItems[i-1].price;
				break;
                
                case "c":
                
                   System.out.println();
                    System.out.println(MuItems[i-1].name + " " + MuItems[i-1].price + "Rs");
                    System.out.println();

                    // System.out.println();
                    // System.out.println(MuItems1[i-1].name + " " + MuItems1[i-1].price + "Rs");
                    total += MuItems[i-1].price;
                break;
				
            }
                i = sin.nextInt();
        }while(i!=0);
        System.out.println(total + "Rs");
        }


    void Chooseitem2(String res) {
        int total = 0;
        Scanner sin = new Scanner(System.in);
        int i = sin.nextInt();
        do
        {
            switch(res)
            {
                case "a" :
                
                    System.out.println();
                    System.out.println(GrItems[i-1].name + " " + GrItems[i-1].price + "Rs");
                    System.out.println();
					total += GrItems[i-1].price;
				break;
                
                case "b":
                
                    System.out.println();
                    System.out.println(YaItems[i-1].name + " " + YaItems[i-1].price);
					total += YaItems[i-1].price;
					break;
                
                
            }
                i = sin.nextInt();
        }while(i!=0);
        System.out.println(total + "Rs");
    }
}
class Restaurant2
{
    String name;
    MenuItem[] items ;
    //MenuItem[] items1;
    MenuItem1[] MItems;
    //MenuItem1[] MItems1;

    MenuItem2[] MHItems;
    //MenuItem2[] MHItems1;

    MenuItem3[] MaItems;
    //MenuItem3[] MaItems1;

    MenuItems4[] VaItems;

   // MenuItems4[] VaItems1;

    MenuItems5[] MuItems;

    //MenuItems5[] MuItems1;

    MenuItem6[] GrItems;

    MenuItem7[] YaItems;


    Restaurant2(String name, MenuItem[] items)
    {
        this.name = name;
        this.items = items;
    }
    Restaurant2(String name, MenuItem1[] MItems)
    {
        this.name = name;
        this.MItems = MItems;
        //this.MItems1 = MItems1;
    }
    Restaurant2(String name, MenuItem2[] MHItems)
    {
        this.name = name;
        this.MHItems = MHItems;
        //this.MHItems1 = MHItems1;
    }
    Restaurant2(String name, MenuItem3[] MaItems)
    {
        this.name = name;
        this.MaItems = MaItems;
        //this.MaItems1 = MaItems1;
    }
    Restaurant2(String name, MenuItems4[] VaItems)
    {
        this.name = name;
        this.VaItems = VaItems;
       // this.VaItems1 = VaItems1;
    }

    Restaurant2(String name, MenuItems5[] MuItems)
    {
        this.name = name;
        this.MuItems = MuItems;
       // this.MuItems1 = MuItems1;
    }
    Restaurant2(String name, MenuItem6[] GrItems)
    {
        this.name = name;
        this.GrItems = GrItems;

    }
    Restaurant2(String name, MenuItem7[] YaItems)
    {
        this.name = name;
        this.YaItems = YaItems;

    }

    void printMenu()
    {
        System.out.println(name + " " + "menu");
        System.out.println("--*--Garma Garam Tandoor Se--*--&&-----Panner Preparation");
        for(int i = 0; i< items.length; i++)
        {

            System.out.println((i + 1) + " " + items[i].name + " " + items[i].price + " " + "Rs");
        }

    }
    void printMenu1()
    {
        System.out.println("--Sweets--&&--Kid's Wear--");
        for(int i = 0; i< MItems.length; i++)
        {
            System.out.println((i+1) + " " + MItems[i].name + " " + MItems[i].price + " " + "Rs");
        }
        // System.out.println("--*--Kids Wear--*--");
        // for(int i = 0; i< MItems1.length; i++)
        // {
            // System.out.println((i+1) + " " + MItems1[i].name + " " + MItems1[i].price + " " + "Rs");
        // }
    }

    void printMenu2()
    {
        System.out.println("---Indian Veg---With--Tandoori Swaad---");
        for(int i = 0; i<MHItems.length; i++)
        {
            System.out.println((i+1) + " " + MHItems[i].name + " " + MHItems[i].price + "Rs");
        }
        // System.out.println("---Tandoori---");
        // for(int i = 0; i< MHItems1.length; i++)
        // {
            // System.out.println((i+1) + " " + MHItems1[i].name + " " + MHItems1[i].price + "Rs");
        // }
    }
    void printMenu3()
    {
        System.out.println("----Try The World----&&----World Inspired----");
        for (int i = 0; i< MaItems.length; i++)
        {
            System.out.println((i+1) + " " + MaItems[i].name + " " + MaItems[i].price + "Rs");
        }
        // System.out.println("---World Inspired---");
        // for(int i = 0; i< MaItems1.length; i++)
        // {
            // System.out.println((i+1) + " " + MaItems1[i].name + " " + MaItems1[i].price + "Rs");
        // }
    }
    void printMenu4()
    {
        System.out.println("----Pasta Fatta In Casa----&&----Mocktails----");
        for(int i =0; i< VaItems.length; i++)
        {
            System.out.println((i+1) + " " + VaItems[i].name + " " + VaItems[i].price + "Rs");
        }
        // System.out.println("----Mocktails----");
        // for(int i = 0; i< VaItems1.length; i++)
        // {
            // System.out.println((i+1) + " " + VaItems1[i].name + " " + VaItems1[i].price + "Rs");
        // }
    }
    void printMenu5()
    {
        System.out.println("---Sharing Platter----&&----UnHealthy Salads----");
        for(int i =0; i< MuItems.length; i++)
        {
            System.out.println((i+1) + " " + MuItems[i].name + " " + MuItems[i].price + "Rs");
        }
        // System.out.println("----UnHealthy Salads----");
        // for(int i = 0; i< MuItems1.length; i++)
        // {
            // System.out.println((i+1) + " " + MuItems1[i].name + " " + MuItems1[i].price + "Rs");
        // }
    }
    void printMenu6() {
        System.out.println("---Across The Great Wall----");
        for (int i = 0; i < GrItems.length; i++) {
            System.out.println((i + 1) + " " + GrItems[i].name + " " + GrItems[i].price + "Rs");
        }

    }
    void printMenu7()
    {
        System.out.println("----Yankiness----");
        for(int i = 0; i< YaItems.length; i++)
        {
            System.out.println((i+1) + " " + YaItems[i].name + " " + YaItems[i].price);
        }
    }
}
class MenuItem
{
    String name;
    int price;
    MenuItem(String name,int price)
    {
        this.name = name;
        this.price = price;
    }
}
class MenuItem1
{
    String name;
    int price;
    MenuItem1(String name,int price)
    {
        this.name = name;
        this.price = price;
    }
}

class MenuItem2
{
    String name;
    int price;
    MenuItem2(String name, int price)
    {
        this.name = name;
        this.price = price;
    }
}

class MenuItem3
{
    String name;
    int price;
    MenuItem3(String name, int price)
    {
        this.name = name;
        this.price = price;
    }
}

class MenuItems4
{
    String name;
    int price;
    MenuItems4(String name, int price)
    {
        this.name = name;
        this.price = price;
    }
}

class MenuItems5
{
    String name;
    int price;
    MenuItems5(String name, int price)
    {
        this.name = name;
        this.price = price;
    }
}

class MenuItem6
{
    String name;
    int price;

    MenuItem6(String name, int price)
    {
        this.name = name;
        this.price = price;
    }
}
class MenuItem7
{
    String name;
    int price;
    MenuItem7(String name, int price)
    {
        this.name = name;
        this.price = price;
    }
}
