class Action {
    private static boolean isDefend = false;
    static class Defend{
        Character defender;
        public Defend(Character defender){
            this.defender = defender;
        }

        public boolean defendAttack(){
            return isDefend = true;
        }
    }
    static class Attack {
        Character attacker;
        Character defender;
        int damage;
        int shield;
        int hp;
        
        public Attack(Character attacker, Character defender) {
            this.attacker = attacker;
            this.defender = defender;
            this.damage = attacker.getDamage();
            this.hp = defender.getHp();
            this.shield = defender.getShield();
        }
        
        public void takeDamage(int damage){
            if(isDefend){
                if(defender.getShield() - damage <= 0){
                    hp = hp + shield - damage;
                    defender.setHp(hp);
                    defender.setShield(0);
                }else{
                    shield = shield - damage;
                    defender.setShield(shield);
                }
            }
        }

        public void executeAttack() {
            takeDamage(damage);
        }
    }
}