package com.mateuszwalczyk.production.model;

import jakarta.persistence.Entity;

import java.util.concurrent.TimeUnit;

@Entity
public class Machine {

    public String name;
    public int durability;
    public int quantity;
    public TimeUnit workTime;

    private Machine(){

    }

    private Machine(String name, int durability, int quantity, TimeUnit workTime){
        this.name = name;
        this.durability = durability;
        this.quantity = quantity;
        this.workTime = workTime;
    }

    public class MachineBuilder {
        private String name;
        private int durability;
        private int quantity;
        private TimeUnit workTime;

        public MachineBuilder(){

        }

        public MachineBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public MachineBuilder setDurability(int durability) {
            this.durability = durability;
            return this;
        }

        public MachineBuilder setQuantity(int quantity) {
            this.quantity = quantity;
            return this;
        }

        public MachineBuilder setWorkTime(TimeUnit workTime) {
            this.workTime = workTime;
            return this;
        }

        public Machine buildMachine() {
            return new Machine(name, durability, quantity, workTime);
        }
    }

}
