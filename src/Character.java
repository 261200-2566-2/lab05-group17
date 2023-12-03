class Character {
    private String name;
    private String gender;
    private String job;
    private int level;
    private int hp;
    private int mana;
    private int str;
    private int agi;
    private int shield; 
    private Equipment[] weapon = new Equipment[2];
    
    public Character(String name, String gender) {
        this.name = name;
        if(gender == "Male" || gender == "male"){
            this.gender = "Male";
        }else if(gender == "Female" || gender == "female"){
            this.gender = "Female";
        }else{
            System.out.println("Incorrect gender");
        }
        this.job = "Novice";
        this.level = 1;
        this.hp = 40;
        this.mana = 20;
        this.str = 0;
        this.agi = 34;
        this.shield = 0;
    }

    // max on lv.99
    void levelUp() {
        if(level <= 99){
            level++;
            hp = 40 + 5*level;
            mana = 20 + 5*level;
            str = 1 + 5*level;
            agi = 34 + 2*level;
            if(agi >= 100){
                agi = 100;
            }
        }
    }

    String getName() {return name;}
    String getGender() {return gender;}
    String getJob() {return job;}
    int getLevel() {return level;}
    int getHp() {return hp;}
    int getMana() {return mana;}
    int getStr() {return str;}
    double getAgi() {return agi;}

    Equipment[] getWeapons() {return weapon;}

    public void setDamage(){
        if(weapon[1] != null){
            str += weapon[1].getDamage();
        }
    }
    public void setShield(){
        if(weapon[0] != null){
            shield += weapon[0].getReduceDamage();
        }
    }

    public void setRunSpeed() {
        int totalWeight = 0;
    
        if (weapon[0] != null) {
            totalWeight += weapon[0].getWeight();
        }
    
        if (weapon[1] != null) {
            totalWeight += weapon[1].getWeight();
        }
    
        if (totalWeight > 150 && totalWeight <= 200) {
            agi *= 0.75; // วิ่งช้าลง 25%
        } else if (totalWeight > 200 && totalWeight <= 250) {
            agi *= 0.7; // วิ่งช้าลง 30%
        } else if (totalWeight > 250) {
            agi *= 0.5; // วิ่งช้าลง 50%
        }
    }
    public void setJob(String newJob) {
        if(level == 10){
            job = newJob;
        }
    }
    
    public void equipWeapon(Equipment weapon1) {
        if (weapon1.getType().equals("shield")) {
            weapon[0] = weapon1;
            setRunSpeed();
            setShield();
        } else if (weapon1.getType().equals("sword")) {
            weapon[1] = weapon1;
            setRunSpeed();
            setDamage();
        }
    }

    public void equipWeapon(Equipment weapon1, Equipment weapon2) {
        weapon[0] = weapon1;
        weapon[1] = weapon2;
        setRunSpeed();
        setDamage();
        setShield();
    }
    

    void displayInfo() {
        System.out.println("=== Character Info ===");
        System.out.println("Name: " + name);
        System.out.println("Gender: " + gender);
        System.out.println("Job: " + job);
        System.out.println("Level: " + level);
        System.out.println("HP: " + hp);
        System.out.println("Mana: " + mana);
        System.out.println("Run Speed: " + agi);
        System.out.println("Damage: " + str);
        System.out.println("Shield: " + shield);
    
        for (Equipment w : weapon) {
            if (w != null) {
                w.getWeaponInfo();  
            } else {
                System.out.println("No equipped.");
            }
        }
        System.out.println("======================");
    }
    
    
}