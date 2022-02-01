public class SodaMachine {

        private String[] sodas= {"coke", "pepsi", "sprite", "dr. pepper"};
        private int cokeInventory;
        private int pepsiInventory;
        private int spriteInventory;
        private int drPepperInventory;
        private int money;

        public SodaMachine(){
            cokeInventory = 20;
            pepsiInventory = 20;
            spriteInventory = 20;
            drPepperInventory = 20;
            money = 10;
        }

        public String[] getSodas(){
            return sodas;
        }

        public void setSodas(String[] sodas){
            this.sodas = sodas;
        }

        public int getCokeInventory(){
            return cokeInventory;
        }

        public void setCokeInventory(int cokeInventory){
            this.cokeInventory = cokeInventory;
        }

        public int getPepsiInventory(){
            return pepsiInventory;
        }

        public void setPepsiInventory(int pepsiInventory){
            this.pepsiInventory = pepsiInventory;
        }

        public int getSpriteInventory(){
            return spriteInventory;
        }

        public void setSpriteInventory(int spriteInventory){
            this.spriteInventory = spriteInventory;
        }

        public int getDrPepperInventory(){
            return drPepperInventory;
        }

        public void setDrPepperInventory(int drPepperInventory){
            this.drPepperInventory = drPepperInventory;
        }

        public int getMoney(){
            return money;
        }

        public void setMoney(int money){
            this.money = money;
        }

        private boolean checkSoda(String soda){
            boolean available = false;
            for(String s : sodas){
                if(s.equals(soda)){
                    available = true;
                    break;
                }
            }
            if(!available) System.out.println("That soda is not sold in this machine.");

            return available;
        }


        public void buySoda(String soda, int amount){
            if(checkSoda(soda)){
                if(soda.equals("coke")){

                    if (cokeInventory < 1){
                        System.out.println("There are no cans of Coke.");
                    }
                    else {
                        if(amount >= 2){
                            cokeInventory -= 1;
                            //System.out.println("adding money coke ");
                            money += 2;
                        }
                        else {
                            System.out.println("You did not insert enough money.");
                        }
                    }
                }

                if(soda.equals("pepsi")){
                    if (pepsiInventory < 1){
                        System.out.println("There are no cans of Pepsi.");
                    }
                    else {
                        if(amount >= 2){
                            pepsiInventory -= 1;
                            //System.out.println("adding money pepsi");
                            money += 2;
                        }
                        else {
                            System.out.println("You did not insert enough money.");
                        }
                    }
                }

                if(soda.equals("sprite")){
                    if(spriteInventory < 1){
                        System.out.println("There are no cans of Sprite.");
                    }
                    else {
                        if(amount >= 2){
                            spriteInventory -= 1;
                            // System.out.println("adding money sprite ");
                            money += 2;
                        }
                        else {
                            System.out.println("You did not insert enough money.");
                        }
                    }
                }

                if(soda.equals("dr. pepper")){
                    if(drPepperInventory < 1){
                        System.out.println("There are no cans of Dr. Pepper.");
                    }
                    else {
                        if(amount >= 2){
                            drPepperInventory -= 1;
                            //System.out.println("adding money dr pepper ");
                            money += 2;
                        }
                        else {
                            System.out.println("You did not insert enough money.");
                        }
                    }
                }
            }
        }



//add class definitions above this line


        public static void main(String[] args) {

            //add code below this line
            //add code below this line

            // SodaMachine myMachine = new SodaMachine();
            // myMachine.buySoda("coke", 4);
            // System.out.println(myMachine.getMoney());
            // System.out.println(myMachine.getCokeInventory());

            //add code above this line
            //add code below this line

            // SodaMachine myMachine = new SodaMachine();
            // myMachine.buySoda("diet coke", 4);
            // System.out.println(myMachine.getMoney());
            // System.out.println(myMachine.getCokeInventory());
            // System.out.println(myMachine.getSpriteInventory());
            // System.out.println(myMachine.getPepsiInventory());
            // System.out.println(myMachine.getDrPepperInventory());

            //add code above this line
            //add code below this line



            // SodaMachine myMachine = new SodaMachine();
            // myMachine.buySoda("sprite", 1);
            // System.out.println(myMachine.getMoney());
            // System.out.println(myMachine.getSpriteInventory());

            //add code below this line

//            SodaMachine myMachine = new SodaMachine();
//            myMachine.setDrPepperInventory(0);
//            myMachine.buySoda("dr. pepper", 2);
//            System.out.println(myMachine.getMoney());
//            System.out.println(myMachine.getDrPepperInventory());

            //add code above this line
            //add code above this line
            //add code above this line
            String[] sodas= {"coke", "pepsi", "sprite", "dr. pepper"};
            System.out.println(sodas.length);

        }
    }

