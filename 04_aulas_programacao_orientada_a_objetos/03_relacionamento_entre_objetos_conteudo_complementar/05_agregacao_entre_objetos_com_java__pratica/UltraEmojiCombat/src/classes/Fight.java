package classes;

public class Fight {
    /*
     * attributes
     */
    private Fighter challenged;
    private Fighter challenger;
    private boolean approved;

    /*
     * getters and setters
     */
    public Fighter getChallenged() {
        return this.challenged;
    }

    public void setChallenged(Fighter challenged) {
        this.challenged = challenged;
    }

    public Fighter getChallenger() {
        return this.challenger;
    }

    public void setChallenger(Fighter challenger) {
        this.challenger = challenger;
    }

    public boolean getApproved() {
        return this.approved;
    }

    private void setApproved(boolean approved) {
        this.approved = approved;
    }

    /*
     * methods
     */
    public void scheduleFight(Fighter challenged, Fighter challenger) {
        if ((challenged.getCategory().equals(challenger.getCategory())) && (challenged != challenger)) {
            this.setApproved(true);
            this.setChallenged(challenged);
            this.setChallenger(challenger);

        } else {
            this.setApproved(false);
            this.challenged = null;
            this.challenger = null;
        }
    }

    public void toFight() {

        if (this.getApproved()) {
            challenged.introduce();
            challenger.introduce();

            int winner = (int) (Math.random() * 3);

            switch (winner) {
                case 0: // empate
                    System.out.println("\n- - - - - RESULTADO DA LUTA - - - - -");
                    System.out.println("empate");
                    this.getChallenged().getDraws();
                    this.getChallenger().getDraws();
                    break;

                case 1: // challenged ganhou
                    System.out.println("\n- - - - - RESULTADO DA LUTA - - - - -");
                    System.out.printf("vencedor: %s%n", this.getChallenged().getName());
                    this.getChallenged().winFight();
                    this.getChallenger().loseFight();
                    break;

                case 2: // challenger ganhou
                    System.out.println("\n- - - - - RESULTADO DA LUTA - - - - -");
                    System.out.printf("vencedor: %s%n", this.getChallenger().getName());
                    this.getChallenger().winFight();
                    this.getChallenged().loseFight();
                    break;

                default:
                    break;
            }
        } else {
            System.out.println("-> luta não approved");
        }
    }
}
