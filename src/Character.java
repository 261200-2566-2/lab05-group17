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
    private int runSpeed = 34;
    private int damage ;
    private int totalWeight = 0; ;
    private Equipment[] weapon = new Equipment[2];
    private Equipment[] accessory = new Equipment[2];
    
    public Character(String name, String gender , String job) {
        this.name = name;
        this.gender = gender;
        this.job = job;
        if ("Novice".equals(job)) {
            this.level = 1;
            this.hp = 40;
            this.mana = 20;
            this.str = 1;
            this.agi = 1;
            this.shield = 1;
        } else if ("Swordman".equals(job)) {
            this.level = 1;
            this.hp = 80;
            this.mana = 40;
            this.str = 5;
            this.agi = 2;
            this.shield = 1;
            
        } else if ("Mage".equals(job)) {
            this.level = 1;
            this.hp = 50;
            this.mana = 100;
            this.str = 0;
            this.agi = 0;
            this.shield = 1; 
        }

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
    Equipment[] getEquipments(Equipment[] equipment) {return equipment;}

    public void setDamage(){
        if(weapon[0] != null){
            damage += weapon[0].getDamage();
        }
    }
    public void setShield(){
        if(weapon[1] != null){
            shield += weapon[1].getReduceDamage();
        }
    }

    public void setHp(int newHp){
        hp = newHp;
    }

    public void setRunSpeed() {
        
        runSpeed = 34;
    
        if (weapon[0] != null) {
            totalWeight += weapon[0].getWeight();
        }
    
        if (weapon[1] != null) {
            totalWeight += weapon[1].getWeight();
        }
    
        if (totalWeight > 150 && totalWeight <= 200) {
            runSpeed *= 0.75; // วิ่งช้าลง 25%
        } else if (totalWeight > 200 && totalWeight <= 250) {
            runSpeed *= 0.7; // วิ่งช้าลง 30%
        } else if (totalWeight > 250) {
            runSpeed *= 0.5; // วิ่งช้าลง 50%
        }
    }

    // ระบบอัพเลเวล ยังไม่ได้ใช้
    // public void setJob(String newJob) {
    //     if(level == 10){
    //         job = newJob;
    //     }
    // }
    
    //equip onoe weapon
    public void equipWeapon(Equipment weapon1) {
        if (weapon1.getType().equals("sword")||weapon1.getType().equals("dagger")||weapon1.getType().equals("wand")) { 
            weapon[0] = weapon1;
            setRunSpeed();
            setDamage();
        } else if (weapon1.getType().equals("shield")) {
            weapon[1] = weapon1;
            setRunSpeed();
            setShield();
        }
    }

    //equip two weapon
    public void equipWeapon(Equipment weapon1, Equipment weapon2) {
        weapon[0] = weapon1;
        weapon[1] = weapon2;
        setRunSpeed();
        setDamage();
        setShield();
    }

    //equip two accessory
    public void equipAccessory(Equipment accessory1, Equipment accessory2) {
        accessory[0] = accessory1;
        accessory[1] = accessory2;
        applyAccessoryEffects();
    }

    private void applyAccessoryEffects() {
        for (Equipment acc : accessory) {
            if (acc != null) {
                hp += acc.getBonusHp();
                agi += acc.getBonusSpeed();
                mana += acc.getBonusMana();
            }
        }
    }

    public void displayEquipmentInfo() {
        Equipment[] acc = getEquipments(accessory);
        Equipment[] wpn = getEquipments(weapon);
        System.out.println("=== Accessory Info ===");
        for (Equipment item : acc) {
            if (acc != null) {
                item.getWeaponInfo();
            } else {
                System.out.println("No equipped.");
            }
        }
        System.out.println("======================\n");

        System.out.println("=== Weapon Info ===");
        for (Equipment item : wpn ) {
            if (item != null) {
                item.getWeaponInfo();
            } else {
                System.out.println("No equipped.");
            }
        }
        System.out.println("======================");
    }

    public void displayCharacterInfo() {
        System.out.println("=== Character Info ===");
        System.out.println("Name: " + name);
        System.out.println("Gender: " + gender);
        System.out.println("Job: " + job);
        System.out.println("Level: " + level);
        System.out.println("HP: " + hp);
        System.out.println("Mana: " + mana);
        System.out.println("ASPD: " + agi*2);
        System.out.println("Run Speed: " + runSpeed);
        System.out.println("Damage: " + damage);
        System.out.println("Shield: " + shield);
        System.out.println("Weight: " + totalWeight);
    }
    

    void displayInfo() {
        displayCharacterInfo();
        displayEquipmentInfo();
    }

    
}