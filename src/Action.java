class Action {
    static class Defend{
        Character defender;
        int damage;
        int shield;
        public Defend(Character defender,int damage){
            this.defender = defender;
            this.damage = damage;
            this.shield = defender.getShield();
        }

        public void defendAttack(){
            int currShield = defender.getShield();
            int newShield = currShield - damage;

             if(newShield <= 0) { newShield = 0;}
            defender.setShield(newShield);

        }
    }
    static class Attack {
        Character attacker;
        Character defender;
        int damage;
        int shield;
        
        public Attack(Character attacker, Character defender) {
            this.attacker = attacker;
            this.defender = defender;
            this.damage = attacker.getDamage();
        }
        
        public void takeDamage(int damage){
            int currHp = defender.getHp();
            int newHp = currHp - damage;
    
            if(newHp <= 0) { newHp = 0;}
            defender.setHp(newHp);
        }

        public void executeAttack() {
            if(defender.getShield() == 0){
                takeDamage(damage);
            }
        }
    }
}