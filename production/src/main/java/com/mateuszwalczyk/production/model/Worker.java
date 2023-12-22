package com.mateuszwalczyk.production.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Entity
public class Worker {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String ability;

    private BigDecimal payment;
    private int level = 1;

    private Worker(){

    }

    public Worker(Long id, String name, String ability, BigDecimal payment, int level){
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
        private int level = 1;

        public WorkerBuilder(){

        }

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


    @Override
    public String toString(){
        return "Numer: " + getId() + ", Nazwa: " + getName() + ", Umiejetnosc: " + getAbility() + ", Wyplata: " + getPayment()
                + ", Poziom: " + getLevel();
    }
}
