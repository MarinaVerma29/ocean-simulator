package in.verma.ocean_simulator.util;

import in.verma.ocean_simulator.model.Shark;
public class EventSimulator {
    public void startSimulation(Shark shark) {

        //акула отдохнула: +15 энергии
        //акула неудачно поохотилась: -20 энергии
        //акула съела тунца: -5 энергии, +5 здоровья * на коэффициент
        //акула попала в капкан: -20 энергии, - 40 здоровья
        //акула съела дельфина: -10 энергии, +10 здоровья * на коэффициент
        //акула съела рыбу, начиненную веществами с затонувшего пиратского судна: + 20 энергии, - 20 здоровья;
        //акула сразилась с браконьерами: - 30 энергии, - 50 здоровья
        //акула наелась пластиковых отходов: - 10 энергии, - 15 здоровья
        //акула съела аквалангиста -15 энергии +10 здоровья * на коэффициент
        //акула проглотила медузу: - 10 энергии, - 35 здоровья

            while (statusChecker(shark)) {
                restEvent(shark);
                huntEvent(shark);
                sharkEatTuna(shark);
                trapEvent(shark);
                sharkEatDolphin(shark);
                sharkEatDrugfish(shark);
                sharkFightPoachers(shark);
                sharkEatPlastic(shark);
                sharkEatDiver(shark);
                sharkJellyfish(shark);

            System.out.println("Акуле хана! Как и этому программисту! Пока-пока!");
        }

    }


        private void restEvent(Shark shark){
        int energy = shark.getEnergy();
        energy = energy + 15;
            if (energy > 100) {
                energy = 100;
            }
        shark.setEnergy(energy);
        System.out.println("Акула отдохнула! + 15 энергии. Текущая энергия: " + shark.getEnergy());

        }

        private void huntEvent(Shark shark){
        int energy = shark.getEnergy();
        energy = energy - 20;
            if (energy < 0) {
                energy = 0;
            }
        shark.setEnergy(energy);
        statusChecker(shark);
        System.out.println("Упс, акула неудачно поохотилась! - 20 энергии. Текущая энергия: " + shark.getEnergy());
        }

        private void sharkEatTuna(Shark shark){
        int energy = shark.getEnergy();
        int hp = shark.getHp();
        energy = energy - 5;
        hp = hp + shark.getTooth() * 5;
            if (energy < 0) {
                energy = 0;
            }
            if (hp > 100) {
                hp = 100;
            }
        shark.setEnergy(energy);
        shark.setHp(hp);
        statusChecker(shark);
        System.out.println("Ура! Акула съела тунца! Текущая энергия: " + shark.getEnergy() + " ,текущее здоровье: " + shark.getHp());
        }

        private void trapEvent(Shark shark){
        int energy = shark.getEnergy();
        int hp = shark.getHp();
        energy = energy - 20;
        hp = hp - 40;
            if (energy < 0) {
                energy = 0;
            }
            if (hp < 0) {
                hp = 0;
            }
        shark.setEnergy(energy);
        shark.setHp(hp);
        statusChecker(shark);
        System.out.println("О, нет! Акула застряла в капкане. Однако ей удалось выбраться! Текущая энергия: " + shark.getEnergy() + " ,текущее здоровье: " + shark.getHp());

        }

        private void sharkEatDolphin(Shark shark){
        int energy = shark.getEnergy();
        int hp = shark.getHp();
        energy = energy - 10;
        hp = hp + shark.getTooth() * 10;
            if (energy < 0) {
                energy = 0;
            }
            if (hp > 100) {
                hp = 100;
            }
        shark.setEnergy(energy);
        shark.setHp(hp);
        statusChecker(shark);
        System.out.println("Ура! Акула съела дельфина! Текущая энергия: " + shark.getEnergy() + " ,текущее здоровье: " + shark.getHp());

        }

         private void sharkEatDrugfish(Shark shark){
         int energy = shark.getEnergy();
         int hp = shark.getHp();
         energy = energy + 20;
         hp = hp - 20;
             if (energy > 100) {
                 energy = 100;
             }
             if (hp < 0) {
                 hp = 0;
             }
         shark.setEnergy(energy);
         shark.setHp(hp);
         statusChecker(shark);
         System.out.println("Выплюньте это, немедленно! Акула съела отравленную рыбу, но зарядилась энергией! Текущая энергия: " + shark.getEnergy() + " ,текущее здоровье: " + shark.getHp());

         }

    private void sharkFightPoachers(Shark shark){
        int energy = shark.getEnergy();
        int hp = shark.getHp();
        energy = energy - 30;
        hp = hp - 50;
        if (energy < 0) {
            energy = 0;
        }
        if (hp < 0) {
            hp = 0;
        }
        shark.setEnergy(energy);
        shark.setHp(hp);
        statusChecker(shark);
        System.out.println("ААА, Акула отразила атаку браконьеров! Текущая энергия: " + shark.getEnergy() + " ,текущее здоровье: " + shark.getHp());
    }


    private void sharkEatPlastic(Shark shark){
        int energy = shark.getEnergy();
        int hp = shark.getHp();
        energy = energy - 10;
        hp = hp - 15;
        if (energy < 0) {
            energy = 0;
        }
        if (hp < 0) {
            hp = 0;
        }
        shark.setEnergy(energy);
        shark.setHp(hp);
        statusChecker(shark);
        System.out.println("Какая мерзость этот ваш заливной пластик! Акула наелась отходов! Текущая энергия: " + shark.getEnergy() + " ,текущее здоровье: " + shark.getHp());
    }


    private void sharkEatDiver(Shark shark){
        int energy = shark.getEnergy();
        int hp = shark.getHp();
        energy = energy - 15;
        hp = hp + shark.getTooth() * 10;
        if (energy < 0) {
            energy = 0;
        }
        if (hp > 100) {
            hp = 100;
        }
        shark.setEnergy(energy);
        shark.setHp(hp);
        statusChecker(shark);
        System.out.println("Ура! Акула съела аквалангиста! Текущая энергия: " + shark.getEnergy() + " ,текущее здоровье: " + shark.getHp());

    }

    private void sharkJellyfish(Shark shark){
        int energy = shark.getEnergy();
        int hp = shark.getHp();
        energy = energy - 10;
        hp = hp - 35;
        if (energy < 0) {
            energy = 0;
        }
        if (hp < 0) {
            hp = 0;
        }
        shark.setEnergy(energy);
        shark.setHp(hp);
        statusChecker(shark);
        System.out.println("Роковая ошибка! Акула сожрала медузу! Текущая энергия: " + shark.getEnergy() + " ,текущее здоровье: " + shark.getHp());
    }

    private boolean statusChecker(Shark shark){
        if(shark.getEnergy() <= 0 || shark.getHp() <= 0 ){
            return false;
        } else {
            return true;
        }
    }

    }





