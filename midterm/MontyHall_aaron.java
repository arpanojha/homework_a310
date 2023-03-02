public class MontyHall {
    public static void main(String[] args) {
        int money, // index of the winning box in an experiment
            user, // index of the box chosen by the user randomly
            win, // number of times I win without switching  
            games, // this holds the number of the current game (0 < games < 999999) 
            swapWins, // number of times I win after I switch 
            swap; // variable holding the user's guess if the change it (after the change) 
        double ratio, swapRatio; // answers in one case and the other 
        win = 0; // see above 
        swapWins = 0; // see above 
        int total = 1000000;
        for (games = 0; games < total; games += 1) {
            money = 1 + (int) (Math.random() * 3); // random int in {0, 1, 2} 
            user = 1 + (int) (Math.random() * 3); // my pick int in {0, 1, 2) 
            if (user == money) { 
                if (user == 1)      { swap = 2; } // loss (0 would have worked as well) 
                else if (user == 2) { swap = 1; } // loss (0 also works here) 
                else                { swap = 1; } // loss (I could also choose 2) 
            } else { swap = money; } // I win (I swap to the right box) 
        // user, money and swap will now determine win(user, money) and swapWins(swap, money) 
            if (money == user) { win += 1; } // this is one case 
            if (money == swap) { swapWins += 1; } // this the other 
            // System.out.println(money + " " + user + " " + win + "/" + games + " (" + swapWins + ") " + swap);
        }
        ratio = ((double) win / games);
        swapRatio = ((double) swapWins / games);
        System.out.println("You won " + ratio + "% of the time without swapping. \n" + "You won " + swapRatio + "% of the time with swapping.");
        System.out.println("This value should be 1.0: " + (swapRatio + ratio) + " (" + total + ")");
    }
}
