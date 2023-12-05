class Action {
    static class Defend{
        Character defender;
        int damage;
        public Defend(Character defender,int damage){
            this.defender = defender;
            this.damage = damage;
        }

        public void takeDamage(int damage){
            int currHp = defender.getHp();
            int newHp = currHp - damage;

            if(newHp <= 0) { newHp = 0;}
            defender.setHp(newHp);
        }

    }
    static class Attack {
        Character attacker;
        Character defender;
        int damage;

        public Attack(Character attacker, Character defender) {
            this.attacker = attacker;
            this.defender = defender;
            this.damage = attacker.getDamage();
        }

        public void executeAttack() {
            Defend defend = new Defend(defender, damage);
            defend.takeDamage(damage);
        }
    }
}