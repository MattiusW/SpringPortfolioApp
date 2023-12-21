package com.mateuszwalczyk.production.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.math.RoundingMode;

@Entity
public class Worker {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String ability;

    private BigDecimal payment;
    private int level;

    private Worker(Long id, String name, String ability, BigDecimal payment, int level){
        this.id = id;
        this.name = name;
        this.ability = ability;
        this.payment = payment;
        this.level = level;
    }

    public static class WorkerBuilder {
        private Long id;
        private String name;
        private String ability;

        private BigDecimal payment;
        private int level;

        public WorkerBuilder setId(Long id) {
            this.id = id;
            return this;
        }

        public WorkerBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public WorkerBuilder setAbility(String ability) {
            this.ability = ability;
            return this;
        }

        public WorkerBuilder setPayment(BigDecimal payment){
            this.payment = payment;
            return this;
        }

        public WorkerBuilder setLevel(int level) {
            this.level = level;
            return this;
        }

        public Worker buildWorker() {
            return new Worker(id, name, ability, payment, level);
        }
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAbility() {
        return ability;
    }

    public BigDecimal getPayment() {
        return payment;
    }

    public int getLevel() {
        return level;
    }

    private void standardWorker(){

        Worker workerOne = new Worker.WorkerBuilder()
                .setId(1L)
                .setName("Marcin")
                .setAbility("Operator")
                .setLevel(1)
                .setPayment(new BigDecimal(2000.00).setScale(2, RoundingMode.HALF_UP))
                .buildWorker();

        Worker workerTwo = new Worker.WorkerBuilder()
                .setId(2L)
                .setName("Krzysiu")
                .setAbility("Mechanik")
                .setLevel(1)
                .setPayment(new BigDecimal(3500.00).setScale(2, RoundingMode.HALF_UP))
                .buildWorker();

        Worker workerThree = new Worker.WorkerBuilder()
                .setId(3L)
                .setName("Darek")
                .setAbility("Operator")
                .setLevel(1)
                .setPayment(new BigDecimal(2000.00).setScale(2, RoundingMode.HALF_UP))
                .buildWorker();
    }

    @Override
    public String toString(){
        return "Numer: " + getId() + ", Nazwa: " + getName() + ", Umiejetnosc: " + getAbility() + ", Wyplata: " + getPayment()
                + ", Poziom: " + getLevel();
    }
}
